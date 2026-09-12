/**
 * TypoLab Studio - Persistent Session History Manager
 * Manages drill records, mistake analytics, progress tracking and CSV/JSON exports.
 */

export interface SessionRecord {
  id: string;
  timestamp: number;
  dateFormatted: string;
  language: 'en' | 'hi';
  category: string;
  targetKey: string;
  storyTitle: string;
  netWpm: number;
  rawWpm: number;
  accuracy: number;
  cpm: number;
  totalKeystrokes: number;
  mistakesCount: number;
  durationSeconds: number;
  verificationId: string;
  frequentMistakes?: { [char: string]: number };
}

const STORAGE_KEY = 'typolab_session_history_v1';

export class SessionHistoryManager {
  /**
   * Retrieves all saved sessions from localStorage
   */
  static getAllSessions(): SessionRecord[] {
    try {
      const data = localStorage.getItem(STORAGE_KEY);
      if (!data) return [];
      const records: SessionRecord[] = JSON.parse(data);
      return Array.isArray(records) ? records.sort((a, b) => b.timestamp - a.timestamp) : [];
    } catch (e) {
      console.error('Failed to load session history:', e);
      return [];
    }
  }

  /**
   * Saves a new session record
   */
  static saveSession(session: Omit<SessionRecord, 'id' | 'timestamp' | 'dateFormatted'>): SessionRecord {
    const records = this.getAllSessions();
    const now = new Date();
    const fullRecord: SessionRecord = {
      ...session,
      id: 'sess_' + Date.now() + '_' + Math.random().toString(36).substring(2, 7),
      timestamp: Date.now(),
      dateFormatted: now.toLocaleDateString(undefined, {
        month: 'short',
        day: 'numeric',
        year: 'numeric',
        hour: '2-digit',
        minute: '2-digit',
      }),
    };

    records.unshift(fullRecord);
    // Keep up to 200 latest sessions
    const trimmed = records.slice(0, 200);
    try {
      localStorage.setItem(STORAGE_KEY, JSON.stringify(trimmed));
    } catch (e) {
      console.error('Failed to persist session to localStorage:', e);
    }
    return fullRecord;
  }

  /**
   * Deletes a specific session by ID
   */
  static deleteSession(id: string): void {
    const records = this.getAllSessions().filter(r => r.id !== id);
    try {
      localStorage.setItem(STORAGE_KEY, JSON.stringify(records));
    } catch (e) {
      console.error('Failed to delete session:', e);
    }
  }

  /**
   * Clears all session records
   */
  static clearAll(): void {
    try {
      localStorage.removeItem(STORAGE_KEY);
    } catch (e) {
      console.error('Failed to clear session history:', e);
    }
  }

  /**
   * Computes aggregate summary stats across all sessions
   */
  static getStats(): {
    totalSessions: number;
    highestWpm: number;
    avgWpm: number;
    avgAccuracy: number;
    totalKeystrokes: number;
  } {
    const sessions = this.getAllSessions();
    if (sessions.length === 0) {
      return {
        totalSessions: 0,
        highestWpm: 0,
        avgWpm: 0,
        avgAccuracy: 0,
        totalKeystrokes: 0,
      };
    }

    const highestWpm = Math.max(...sessions.map(s => s.netWpm));
    const avgWpm = Math.round(sessions.reduce((acc, s) => acc + s.netWpm, 0) / sessions.length);
    const avgAccuracy = Math.round(sessions.reduce((acc, s) => acc + s.accuracy, 0) / sessions.length);
    const totalKeystrokes = sessions.reduce((acc, s) => acc + s.totalKeystrokes, 0);

    return {
      totalSessions: sessions.length,
      highestWpm,
      avgWpm,
      avgAccuracy,
      totalKeystrokes,
    };
  }

  /**
   * Exports history as CSV file
   */
  static exportCSV(): void {
    const sessions = this.getAllSessions();
    if (sessions.length === 0) return;

    const headers = ['Verification ID', 'Date', 'Language', 'Category', 'Target Key', 'Net WPM', 'Raw WPM', 'Accuracy (%)', 'CPM', 'Keystrokes', 'Mistakes', 'Duration (s)'];
    const rows = sessions.map(s => [
      `"${s.verificationId}"`,
      `"${s.dateFormatted}"`,
      `"${s.language.toUpperCase()}"`,
      `"${s.category}"`,
      `"${s.targetKey}"`,
      s.netWpm,
      s.rawWpm,
      s.accuracy,
      s.cpm,
      s.totalKeystrokes,
      s.mistakesCount,
      s.durationSeconds,
    ]);

    const csvContent = 'data:text/csv;charset=utf-8,' + [headers.join(','), ...rows.map(e => e.join(','))].join('\n');
    const encodedUri = encodeURI(csvContent);
    const link = document.createElement('a');
    link.setAttribute('href', encodedUri);
    link.setAttribute('download', `TypoLab_Session_History_${new Date().toISOString().slice(0, 10)}.csv`);
    document.body.appendChild(link);
    link.click();
    document.body.removeChild(link);
  }

  /**
   * Exports history as JSON file
   */
  static exportJSON(): void {
    const sessions = this.getAllSessions();
    const dataStr = 'data:text/json;charset=utf-8,' + encodeURIComponent(JSON.stringify(sessions, null, 2));
    const link = document.createElement('a');
    link.setAttribute('href', dataStr);
    link.setAttribute('download', `TypoLab_Session_History_${new Date().toISOString().slice(0, 10)}.json`);
    document.body.appendChild(link);
    link.click();
    document.body.removeChild(link);
  }
}
