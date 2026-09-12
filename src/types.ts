export type AppTab = 
  | 'typolab' 
  | 'case-converter' 
  | 'repeater' 
  | 'reverser' 
  | 'sorter' 
  | 'roman-converter' 
  | 'password-tools' 
  | 'qr-generator' 
  | 'palette-generator' 
  | 'canvas-pad' 
  | 'focus-timer';

export type StoryCategory = 
  | 'alphabet' 
  | 'bigram' 
  | 'mixed' 
  | 'case'
  | 'case-mastery' 
  | 'hard' 
  | 'pro-hard'
  | 'custom'
  | 'vowel'
  | 'consonant'
  | 'matra'
  | 'literature';

export type SwitchProfile = 'blue' | 'red' | 'brown';

export interface StoryLesson {
  id: string;
  category: StoryCategory;
  letter?: string;
  pair?: string;
  title: string;
  subtitle: string;
  text: string;
  difficulty?: 'Normal' | 'Intermediate' | 'Hard' | 'Extreme';
  language?: 'en' | 'hi';
}

export interface AppSettings {
  theme: 'dark' | 'light';
  pureDark: boolean;
  ultraGlass: boolean;
  soundEnabled: boolean;
  switchProfile: SwitchProfile;
  wakeLockEnabled: boolean;
  accentColor: string;
  font: string;
}

export interface TypingStats {
  wpm: number;
  rawWpm: number;
  accuracy: number;
  cpm: number;
  errors: number;
  elapsedSeconds: number;
  totalKeystrokes: number;
  mistakes: Record<string, number>;
}

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

export interface WordHUDState {
  currentWordIndex: number;
  activeWord: string;
  typedForActiveWord: string;
  upcomingWords: string[];
  isCurrentCharCorrect: boolean;
}

export interface CertificateData {
  recipientName: string;
  targetKey: string;
  category: string;
  language: 'en' | 'hi';
  storyTitle: string;
  netWpm: number;
  rawWpm: number;
  accuracy: number;
  cpm: number;
  totalKeystrokes: number;
  targetKeyHits: number;
  targetKeyExpected: number;
  verificationId: string;
  issueDate: string;
}
