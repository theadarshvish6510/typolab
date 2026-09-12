import React, { useState, useEffect } from 'react';
import { 
  Keyboard, Wrench, History, Settings, Download, Volume2, 
  VolumeX, Sparkles, X, Share2, Check, Moon, Sun, 
  Trash2, FileDown, ArrowUpDown, Smartphone, HelpCircle
} from 'lucide-react';
import { AppTab, AppSettings, SessionRecord } from './types';
import { TypoLabArena } from './components/TypoLabArena';
import { TextTools } from './components/TextTools';
import { SettingsSheet } from './components/SettingsSheet';
import { usePWA } from './hooks/usePWA';
import { updateDynamicFavicon } from './utilities/favicon';
import { SessionHistoryManager } from './sessionHistory';
import { keyboardSynth } from './audio/keyboardSynth';

const DEFAULT_SETTINGS: AppSettings = {
  theme: 'dark',
  pureDark: false,
  ultraGlass: true,
  soundEnabled: true,
  switchProfile: 'blue',
  wakeLockEnabled: false,
  accentColor: '#00F5FF',
  font: 'Google Sans Flex'
};

export default function App() {
  // Load settings from localStorage
  const [settings, setSettings] = useState<AppSettings>(() => {
    if (typeof window !== 'undefined') {
      try {
        const saved = localStorage.getItem('adarsh_typolab_settings_v2');
        if (saved) return { ...DEFAULT_SETTINGS, ...JSON.parse(saved) };
      } catch (e) {
        console.warn('Failed to load settings:', e);
      }
    }
    return DEFAULT_SETTINGS;
  });

  const [activeTab, setActiveTab] = useState<AppTab>('typolab');
  const [initialLanguage, setInitialLanguage] = useState<'en' | 'hi' | undefined>(undefined);
  const [isSettingsOpen, setIsSettingsOpen] = useState<boolean>(false);
  const [isHistoryOpen, setIsHistoryOpen] = useState<boolean>(false);
  const [wakeLockSentinel, setWakeLockSentinel] = useState<any>(null);
  const [deepLinkNotification, setDeepLinkNotification] = useState<string | null>(null);

  // =========================================================================
  // INTELLIGENT GOOGLE SEARCH & KEYWORD DEEP-LINK ROUTER
  // Automatically detects user intent from Google search queries, anchor fragments,
  // query parameters, and keyword matches to instantly jump into the exact feature!
  // =========================================================================
  useEffect(() => {
    interface FeatureRoute {
      tab: AppTab;
      lang?: 'en' | 'hi';
      title: string;
      hash: string;
    }

    const FEATURE_ROUTES: Record<string, FeatureRoute> = {
      '#typing-arena-english': { tab: 'typolab', lang: 'en', title: 'Typing Arena (English)', hash: '#typing-arena-english' },
      '#typing-arena-hindi':   { tab: 'typolab', lang: 'hi', title: 'Typing Arena (Hindi Devanagari)', hash: '#typing-arena-hindi' },
      '#case-converter':       { tab: 'case-converter', title: 'Master Case Converter', hash: '#case-converter' },
      '#text-repeater':        { tab: 'repeater', title: 'Power Text Repeater', hash: '#text-repeater' },
      '#text-reverser':        { tab: 'reverser', title: 'Text Reverser & Flipper', hash: '#text-reverser' },
      '#text-sorter':          { tab: 'sorter', title: 'Alphabetical Sorter & Cleaner', hash: '#text-sorter' },
      '#roman-numeral':        { tab: 'roman-converter', title: 'Roman Numeral Master', hash: '#roman-numeral' },
      '#password-studio':      { tab: 'password-tools', title: 'Password Studio', hash: '#password-studio' },
      '#qr-studio':            { tab: 'qr-generator', title: 'Universal QR Studio', hash: '#qr-studio' },
      '#color-studio':         { tab: 'palette-generator', title: 'Palette & Color Studio', hash: '#color-studio' },
      '#devanagari-canvas':    { tab: 'canvas-pad', title: 'Devanagari Ink Canvas', hash: '#devanagari-canvas' },
      '#pomodoro-timer':       { tab: 'focus-timer', title: 'Focus Stopwatch & Pomodoro', hash: '#pomodoro-timer' },
    };

    const FEATURE_ALIASES: Array<{ keywords: string[]; route: FeatureRoute }> = [
      {
        keywords: ['canvas', 'handwriting', 'calligraphy', 'penmanship', 'shirorekha', 'hindi writing', 'devanagari ink', 'brush pad'],
        route: FEATURE_ROUTES['#devanagari-canvas']
      },
      {
        keywords: ['hindi', 'devanagari typing', 'mangal', 'krutidev', 'inscript', 'remington', 'cpct', 'ssc hindi', 'hindi test'],
        route: FEATURE_ROUTES['#typing-arena-hindi']
      },
      {
        keywords: ['case', 'uppercase', 'lowercase', 'titlecase', 'title case', 'camelcase', 'snakecase', 'capitalize', 'toggle case', 'sentence case'],
        route: FEATURE_ROUTES['#case-converter']
      },
      {
        keywords: ['repeat', 'repeater', 'multiplier', 'duplicate text', 'string repeat', 'text loop', 'cloner', 'spam generator'],
        route: FEATURE_ROUTES['#text-repeater']
      },
      {
        keywords: ['reverse', 'reverser', 'upside down', 'flip text', 'mirror text', 'backwards text', 'inverted text', 'mirror writing'],
        route: FEATURE_ROUTES['#text-reverser']
      },
      {
        keywords: ['sort', 'sorter', 'alphabetical', 'clean text', 'remove duplicate', 'dedupe', 'alphabetize', 'strip whitespace', 'extra spaces'],
        route: FEATURE_ROUTES['#text-sorter']
      },
      {
        keywords: ['roman', 'vinculum', 'arabic to roman', 'roman converter', 'numeral', 'roman numeral', 'roman clock', 'mcmxciv'],
        route: FEATURE_ROUTES['#roman-numeral']
      },
      {
        keywords: ['password', 'passphrase', 'diceware', 'entropy', 'pin code', 'password generator', 'random password', 'password strength'],
        route: FEATURE_ROUTES['#password-studio']
      },
      {
        keywords: ['qr', 'qrcode', 'qr code', 'vcard', 'wifi qr', 'qr generator', 'barcode', 'qr maker', 'dynamic qr'],
        route: FEATURE_ROUTES['#qr-studio']
      },
      {
        keywords: ['color', 'palette', 'contrast', 'wcag', 'hex to rgb', 'color picker', 'gradient', 'hsl', 'triadic', 'color harmony'],
        route: FEATURE_ROUTES['#color-studio']
      },
      {
        keywords: ['pomodoro', 'timer', 'stopwatch', 'focus timer', 'tomato timer', 'interval timer', 'lap timer', 'countdown', 'work timer'],
        route: FEATURE_ROUTES['#pomodoro-timer']
      },
      {
        keywords: ['typing', 'monkeytype', 'speed test', 'wpm', 'touch typing', 'typing practice', 'keyboard test', '10 fast fingers', 'words per minute'],
        route: FEATURE_ROUTES['#typing-arena-english']
      }
    ];

    const resolveAndNavigate = (isInitial = false) => {
      const hash = (window.location.hash || '').toLowerCase().trim();
      const searchParams = new URLSearchParams(window.location.search);

      // 1. Direct exact hash match
      let matchedRoute: FeatureRoute | null = FEATURE_ROUTES[hash] || null;

      // 2. Query parameters & stripped hash evaluation
      if (!matchedRoute) {
        const queryText = [
          searchParams.get('feature'),
          searchParams.get('tool'),
          searchParams.get('tab'),
          searchParams.get('q'),
          searchParams.get('search'),
          searchParams.get('query'),
          searchParams.get('keyword'),
          hash.replace(/^#/, '').replace(/[-_]/g, ' ')
        ].filter(Boolean).join(' ').toLowerCase().trim();

        if (queryText) {
          for (const alias of FEATURE_ALIASES) {
            if (alias.keywords.some(kw => queryText.includes(kw))) {
              matchedRoute = alias.route;
              break;
            }
          }
        }
      }

      if (matchedRoute) {
        setActiveTab(matchedRoute.tab);
        if (matchedRoute.lang) {
          setInitialLanguage(matchedRoute.lang);
        }
        window.history.replaceState(null, '', matchedRoute.hash);
        window.scrollTo({ top: 0, behavior: 'smooth' });

        if (isInitial) {
          setDeepLinkNotification(`⚡ Direct Launch: ${matchedRoute.title}`);
          const timer = setTimeout(() => setDeepLinkNotification(null), 3500);
          return () => clearTimeout(timer);
        }
      }
    };

    // Run on initial landing (from Google Search, Sitelink, or Direct Link)
    resolveAndNavigate(true);

    // Also listen for any client-side hash changes
    window.addEventListener('hashchange', () => resolveAndNavigate(false));
    return () => window.removeEventListener('hashchange', () => resolveAndNavigate(false));
  }, []);

  // History State
  const [historyRecords, setHistoryRecords] = useState<SessionRecord[]>([]);
  const [historyStats, setHistoryStats] = useState(SessionHistoryManager.getStats());

  // Refresh history whenever modal opens
  useEffect(() => {
    if (isHistoryOpen) {
      setHistoryRecords(SessionHistoryManager.getAllSessions());
      setHistoryStats(SessionHistoryManager.getStats());
    }
  }, [isHistoryOpen]);

  // PWA install hook
  const { isInstallable, triggerInstall, showIOSGuide, setShowIOSGuide } = usePWA();

  // Save settings to localStorage
  useEffect(() => {
    try {
      localStorage.setItem('adarsh_typolab_settings_v2', JSON.stringify(settings));
    } catch (e) {
      console.warn('Failed to persist settings:', e);
    }
  }, [settings]);

  // Update dynamic canvas favicon with master /icon.png pipeline
  useEffect(() => {
    updateDynamicFavicon(settings.accentColor, 'TC');
  }, [settings.accentColor]);

  // Screen Wake Lock Handler
  useEffect(() => {
    let sentinel: any = null;
    if (settings.wakeLockEnabled && 'wakeLock' in navigator) {
      (navigator as any).wakeLock.request('screen').then((s: any) => {
        sentinel = s;
        setWakeLockSentinel(s);
      }).catch((err: any) => {
        console.warn('Wake Lock error:', err);
      });
    } else if (wakeLockSentinel) {
      wakeLockSentinel.release?.().catch(() => {});
      setWakeLockSentinel(null);
    }

    return () => {
      if (sentinel) {
        sentinel.release?.().catch(() => {});
      }
    };
  }, [settings.wakeLockEnabled]);

  const updateSettings = (newSettings: Partial<AppSettings>) => {
    setSettings(prev => ({ ...prev, ...newSettings }));
  };

  // =========================================================================
  // SYNC URL HASH ON TAB CHANGE — keeps URL shareable with current feature
  // =========================================================================
  useEffect(() => {
    const TAB_TO_HASH: Record<AppTab, string> = {
      'typolab':           initialLanguage === 'hi' ? '#typing-arena-hindi' : '#typing-arena-english',
      'case-converter':    '#case-converter',
      'repeater':          '#text-repeater',
      'reverser':          '#text-reverser',
      'sorter':            '#text-sorter',
      'roman-converter':   '#roman-numeral',
      'password-tools':    '#password-studio',
      'qr-generator':      '#qr-studio',
      'palette-generator': '#color-studio',
      'canvas-pad':        '#devanagari-canvas',
      'focus-timer':       '#pomodoro-timer',
    };
    const hash = TAB_TO_HASH[activeTab] || '';
    if (hash && window.location.hash !== hash) {
      window.history.replaceState(null, '', hash);
    }
  }, [activeTab, initialLanguage]);

  const resetSettings = () => {
    setSettings(DEFAULT_SETTINGS);
  };

  // Determine background color
  const bgColor = settings.pureDark && settings.theme === 'dark'
    ? '#000000'
    : settings.theme === 'dark'
    ? '#090D16'
    : '#F0F7FA';

  const textColor = settings.theme === 'dark' ? '#F8FAFC' : '#0F172A';

  const handleDeleteSessionRecord = (id: string) => {
    SessionHistoryManager.deleteSession(id);
    setHistoryRecords(SessionHistoryManager.getAllSessions());
    setHistoryStats(SessionHistoryManager.getStats());
    keyboardSynth.playKeySound('Backspace');
  };

  const handleClearAllHistory = () => {
    if (window.confirm('Are you sure you want to clear all typing session history records?')) {
      SessionHistoryManager.clearAll();
      setHistoryRecords([]);
      setHistoryStats(SessionHistoryManager.getStats());
      keyboardSynth.playKeySound('Enter');
    }
  };

  return (
    <div 
      className="relative min-h-screen w-full selection:bg-[#00F5FF]/30 transition-colors duration-500 pb-20 md:pb-8"
      style={{
        backgroundColor: bgColor,
        color: textColor,
        fontFamily: settings.font
      }}
    >
      {/* Direct Search Launch Notification Toast */}
      {deepLinkNotification && (
        <div className="fixed top-4 left-1/2 -translate-x-1/2 z-50 flex items-center gap-2 px-5 py-2.5 rounded-full bg-[#00F5FF] text-[#003940] font-black text-xs sm:text-sm shadow-[0_0_30px_rgba(0,245,255,0.7)] border border-white/30 backdrop-blur-xl animate-bounce">
          <Sparkles className="w-4 h-4 text-[#003940] animate-spin" />
          <span>{deepLinkNotification}</span>
        </div>
      )}

      {/* ----------------------------------------------------------------------
         AMBIENT RADIAL MESH GLOW (Disabled in Pure Dark OLED)
         ---------------------------------------------------------------------- */}
      {!settings.pureDark && (
        <div className="pointer-events-none fixed inset-0 overflow-hidden z-0">
          <div 
            className="absolute -top-[20%] -left-[10%] h-[550px] w-[550px] rounded-full opacity-25 blur-[140px] transition-all duration-700 animate-pulse"
            style={{ backgroundColor: settings.accentColor }}
          />
          <div 
            className="absolute top-[40%] -right-[15%] h-[600px] w-[600px] rounded-full bg-cyan-600/15 blur-[150px] transition-all duration-700"
          />
          <div 
            className="absolute -bottom-[20%] left-[20%] h-[600px] w-[600px] rounded-full bg-indigo-600/15 blur-[160px] transition-all duration-700"
          />
        </div>
      )}

      {/* ----------------------------------------------------------------------
         MAIN CONTAINER (Responsive max-width)
         ---------------------------------------------------------------------- */}
      <div className="relative z-10 mx-auto flex min-h-screen max-w-6xl flex-col p-3 sm:p-6 lg:p-8">
        
        {/* ====================================================================
           APP HEADER (Material 3 Pill Morphing Glass Container)
           ==================================================================== */}
        <header className="mb-6 flex flex-wrap items-center justify-between gap-3 rounded-full border border-white/10 bg-white/5 p-3 px-5 sm:px-6 backdrop-blur-xl shadow-xl transition-all">
          {/* Brand Logo & Master PNG Icon */}
          <div 
            onClick={() => setActiveTab('typolab')}
            className="flex items-center gap-3 cursor-pointer group"
          >
            <div className="relative flex h-10 w-10 shrink-0 items-center justify-center rounded-full overflow-hidden shadow-[0_0_15px_rgba(0,245,255,0.4)] border border-[#00F5FF]/40 group-hover:scale-105 transition-transform">
              <img 
                src="/icon.png" 
                alt="TypoLab Master Icon" 
                className="w-full h-full object-cover" 
              />
            </div>
            <div>
              <h1 className="text-sm sm:text-base font-black tracking-tight flex items-center gap-1.5 leading-none">
                <span>Adarsh's TextCraft</span>
                <span className="text-white/40">&amp;</span>
                <span className="text-[#00F5FF]">TypoLab</span>
              </h1>
              <div className="flex items-center gap-2 text-[10px] text-white/50 mt-0.5">
                <span>M3 Muscle Edition</span>
                <span>•</span>
                <span>English &amp; Devanagari</span>
              </div>
            </div>
          </div>

          {/* Desktop Navigation Segmented Controls */}
          <div className="hidden md:flex items-center gap-1 rounded-full border border-white/10 bg-black/30 p-1 backdrop-blur-md">
            <button
              onClick={() => {
                setActiveTab('typolab');
                keyboardSynth.playKeySound(' ');
              }}
              className={`flex items-center gap-1.5 rounded-full px-4 py-1.5 text-xs font-bold transition-all duration-300 ${
                activeTab === 'typolab'
                  ? 'bg-[#00F5FF] text-[#003940] shadow-[0_0_15px_rgba(0,245,255,0.4)]'
                  : 'text-white/70 hover:text-white'
              }`}
            >
              <Keyboard className="w-3.5 h-3.5" />
              <span>TypoLab Arena</span>
            </button>
            <button
              onClick={() => {
                setActiveTab('case-converter');
                keyboardSynth.playKeySound(' ');
              }}
              className={`flex items-center gap-1.5 rounded-full px-4 py-1.5 text-xs font-bold transition-all duration-300 ${
                activeTab !== 'typolab'
                  ? 'bg-[#00F5FF] text-[#003940] shadow-[0_0_15px_rgba(0,245,255,0.4)]'
                  : 'text-white/70 hover:text-white'
              }`}
            >
              <Wrench className="w-3.5 h-3.5" />
              <span>TextCraft Suite (10-in-1)</span>
            </button>
          </div>

          {/* Quick Action Buttons */}
          <div className="flex items-center gap-2">
            {/* Audio Toggle */}
            <button
              type="button"
              onClick={() => {
                updateSettings({ soundEnabled: !settings.soundEnabled });
                keyboardSynth.setMuted(settings.soundEnabled);
              }}
              className={`rounded-full p-2.5 transition-all active:scale-95 border ${
                settings.soundEnabled 
                  ? 'border-[#00F5FF]/40 bg-[#00F5FF]/15 text-[#00F5FF] shadow-[0_0_12px_rgba(0,245,255,0.3)]' 
                  : 'border-white/10 bg-white/5 text-white/40'
              }`}
              title={settings.soundEnabled ? 'Mechanical Audio On' : 'Audio Muted'}
            >
              {settings.soundEnabled ? <Volume2 className="h-4 w-4" /> : <VolumeX className="h-4 w-4" />}
            </button>

            {/* Lifetime History Trigger */}
            <button
              type="button"
              onClick={() => setIsHistoryOpen(true)}
              className="rounded-full border border-white/10 bg-white/5 p-2.5 text-white/70 hover:text-white hover:bg-white/10 transition-all active:scale-95"
              title="Session History & Lifetime Records"
            >
              <History className="h-4 w-4" />
            </button>

            {/* Install PWA Prompt */}
            {isInstallable && (
              <button
                type="button"
                onClick={triggerInstall}
                className="hidden sm:flex items-center gap-1.5 rounded-full bg-[#00F5FF] px-3.5 py-1.5 text-xs font-black uppercase tracking-wider text-[#003940] shadow-[0_0_15px_rgba(0,245,255,0.4)] hover:brightness-110 active:scale-95 transition-all"
              >
                <Download className="h-3.5 w-3.5" />
                <span>Install</span>
              </button>
            )}

            {/* Settings Trigger */}
            <button
              type="button"
              onClick={() => setIsSettingsOpen(true)}
              className="flex items-center gap-1.5 rounded-full border border-white/10 bg-white/5 p-2.5 text-xs font-bold hover:bg-white/10 text-white/70 hover:text-white transition-all active:scale-95"
              title="Open Settings"
            >
              <Settings className="h-4 w-4" />
            </button>
          </div>
        </header>

        {/* ====================================================================
           MAIN VIEW BODY
           ==================================================================== */}
        <main className="flex-1 w-full">
          {activeTab === 'typolab' ? (
            <TypoLabArena settings={settings} initialLanguage={initialLanguage} />
          ) : (
            <TextTools activeTab={activeTab} settings={settings} onTabChange={setActiveTab} />
          )}
        </main>

        {/* ====================================================================
           DESKTOP FOOTER
           ==================================================================== */}
        <footer className="mt-12 hidden md:flex flex-wrap items-center justify-between gap-4 border-t border-white/10 pt-6 pb-4 text-xs text-white/50">
          <div className="flex items-center gap-2">
            <span className="font-bold text-white/70">Adarsh's TextCraft &amp; TypoLab Studio</span>
            <span>•</span>
            <span>Zero-Lag Web Audio &amp; M3 Shape Morphing</span>
          </div>
          <div className="flex items-center gap-4">
            <button 
              onClick={() => setIsHistoryOpen(true)} 
              className="hover:text-[#00F5FF] transition-colors"
            >
              Lifetime Progress ({historyStats.totalSessions} Sessions)
            </button>
            <span>•</span>
            <button 
              onClick={() => setIsSettingsOpen(true)} 
              className="hover:text-[#00F5FF] transition-colors"
            >
              Settings
            </button>
          </div>
        </footer>
      </div>

      {/* ======================================================================
         MOBILE FLOATING BOTTOM NAVIGATION BAR (M3 Floating Pill Dock)
         ====================================================================== */}
      <div className="md:hidden fixed bottom-3 inset-x-3 z-40 flex items-center justify-around bg-black/80 backdrop-blur-2xl border border-white/15 rounded-full py-2 px-3 shadow-[0_0_30px_rgba(0,0,0,0.8)]">
        <button
          onClick={() => {
            setActiveTab('typolab');
            keyboardSynth.playKeySound(' ');
          }}
          className={`flex flex-col items-center gap-0.5 py-1 px-3 rounded-full transition-all ${
            activeTab === 'typolab'
              ? 'text-[#00F5FF] font-black'
              : 'text-white/60 hover:text-white'
          }`}
        >
          <Keyboard className="w-4 h-4" />
          <span className="text-[10px]">TypoLab</span>
        </button>

        <button
          onClick={() => {
            setActiveTab('case-converter');
            keyboardSynth.playKeySound(' ');
          }}
          className={`flex flex-col items-center gap-0.5 py-1 px-3 rounded-full transition-all ${
            activeTab !== 'typolab'
              ? 'text-[#00F5FF] font-black'
              : 'text-white/60 hover:text-white'
          }`}
        >
          <Wrench className="w-4 h-4" />
          <span className="text-[10px]">TextCraft</span>
        </button>

        <button
          onClick={() => {
            setIsHistoryOpen(true);
            keyboardSynth.playKeySound(' ');
          }}
          className="flex flex-col items-center gap-0.5 py-1 px-3 rounded-full text-white/60 hover:text-white transition-all"
        >
          <History className="w-4 h-4" />
          <span className="text-[10px]">History</span>
        </button>

        <button
          onClick={() => {
            setIsSettingsOpen(true);
            keyboardSynth.playKeySound(' ');
          }}
          className="flex flex-col items-center gap-0.5 py-1 px-3 rounded-full text-white/60 hover:text-white transition-all"
        >
          <Settings className="w-4 h-4" />
          <span className="text-[10px]">Settings</span>
        </button>
      </div>

      {/* ======================================================================
         SETTINGS SHEET (M3 Customization Drawer)
         ====================================================================== */}
      <SettingsSheet
        isOpen={isSettingsOpen}
        onClose={() => setIsSettingsOpen(false)}
        settings={settings}
        onUpdateSettings={updateSettings}
        onResetSettings={resetSettings}
        isInstallable={isInstallable}
        onInstall={triggerInstall}
        onOpenHistory={() => {
          setIsSettingsOpen(false);
          setIsHistoryOpen(true);
        }}
      />

      {/* ======================================================================
         SESSION HISTORY & LIFETIME ANALYTICS MODAL
         ====================================================================== */}
      {isHistoryOpen && (
        <div className="fixed inset-0 z-50 flex items-center justify-center bg-black/80 backdrop-blur-md p-3 sm:p-6 animate-fadeIn">
          <div className="relative w-full max-w-3xl rounded-[32px] border border-[#00F5FF]/30 bg-[#090D16] p-6 shadow-[0_0_70px_rgba(0,245,255,0.25)] flex flex-col gap-5 max-h-[92vh] overflow-y-auto">
            {/* Header */}
            <div className="flex items-center justify-between border-b border-white/10 pb-4">
              <div className="flex items-center gap-3">
                <div className="p-2.5 rounded-2xl bg-[#00F5FF]/10 text-[#00F5FF] border border-[#00F5FF]/30">
                  <History className="w-6 h-6" />
                </div>
                <div>
                  <h3 className="text-lg font-black text-white">Session History &amp; Lifetime Analytics</h3>
                  <p className="text-xs text-white/50">Persistent local records of endurance drills and milestones</p>
                </div>
              </div>
              <button
                onClick={() => setIsHistoryOpen(false)}
                className="p-2 rounded-full hover:bg-white/10 text-white/60 hover:text-white transition-all"
              >
                <X className="w-5 h-5" />
              </button>
            </div>

            {/* Lifetime Aggregate Stat Cards */}
            <div className="grid grid-cols-2 sm:grid-cols-5 gap-3 font-mono">
              <div className="bg-white/5 border border-white/10 rounded-2xl p-3 text-center">
                <div className="text-[10px] text-white/50 uppercase font-bold">Total Tests</div>
                <div className="text-xl font-black text-[#00F5FF]">{historyStats.totalSessions}</div>
              </div>
              <div className="bg-white/5 border border-white/10 rounded-2xl p-3 text-center">
                <div className="text-[10px] text-white/50 uppercase font-bold">Highest Speed</div>
                <div className="text-xl font-black text-emerald-400">{historyStats.highestWpm} WPM</div>
              </div>
              <div className="bg-white/5 border border-white/10 rounded-2xl p-3 text-center">
                <div className="text-[10px] text-white/50 uppercase font-bold">Average Speed</div>
                <div className="text-xl font-black text-[#00F5FF]">{historyStats.avgWpm} WPM</div>
              </div>
              <div className="bg-white/5 border border-white/10 rounded-2xl p-3 text-center">
                <div className="text-[10px] text-white/50 uppercase font-bold">Avg Accuracy</div>
                <div className="text-xl font-black text-amber-400">{historyStats.avgAccuracy}%</div>
              </div>
              <div className="bg-white/5 border border-white/10 rounded-2xl p-3 text-center col-span-2 sm:col-span-1">
                <div className="text-[10px] text-white/50 uppercase font-bold">Keystrokes</div>
                <div className="text-xl font-black text-white">{historyStats.totalKeystrokes.toLocaleString()}</div>
              </div>
            </div>

            {/* Records Table */}
            <div className="rounded-2xl border border-white/10 bg-black/30 overflow-hidden max-h-64 overflow-y-auto">
              <table className="w-full text-left text-xs font-mono">
                <thead className="bg-white/5 text-white/50 uppercase text-[10px] sticky top-0 backdrop-blur-md">
                  <tr>
                    <th className="p-3">Date &amp; Time</th>
                    <th className="p-3">Mode / Key</th>
                    <th className="p-3">Net WPM</th>
                    <th className="p-3">Acc (%)</th>
                    <th className="p-3">CPM</th>
                    <th className="p-3 text-right">Action</th>
                  </tr>
                </thead>
                <tbody className="divide-y divide-white/5">
                  {historyRecords.length === 0 ? (
                    <tr>
                      <td colSpan={6} className="p-8 text-center text-white/40">
                        No saved typing sessions yet. Complete a drill and click "Save Session"!
                      </td>
                    </tr>
                  ) : (
                    historyRecords.map(rec => (
                      <tr key={rec.id} className="hover:bg-white/5 transition-colors">
                        <td className="p-3 text-white/70">{rec.dateFormatted}</td>
                        <td className="p-3">
                          <span className="px-2 py-0.5 rounded-md bg-[#00F5FF]/10 text-[#00F5FF] font-bold">
                            {rec.targetKey}
                          </span>
                        </td>
                        <td className="p-3 font-bold text-[#00F5FF]">{rec.netWpm}</td>
                        <td className="p-3 text-emerald-400">{rec.accuracy}%</td>
                        <td className="p-3 text-white/60">{rec.cpm}</td>
                        <td className="p-3 text-right">
                          <button
                            onClick={() => handleDeleteSessionRecord(rec.id)}
                            className="text-white/30 hover:text-red-400 p-1 transition-colors"
                            title="Delete record"
                          >
                            <Trash2 className="w-3.5 h-3.5" />
                          </button>
                        </td>
                      </tr>
                    ))
                  )}
                </tbody>
              </table>
            </div>

            {/* Action Buttons: Export CSV, JSON & Clear All */}
            <div className="flex flex-wrap items-center justify-between gap-3 pt-2 border-t border-white/10">
              <div className="flex items-center gap-2">
                <button
                  onClick={() => SessionHistoryManager.exportCSV()}
                  disabled={historyRecords.length === 0}
                  className="flex items-center gap-1.5 px-4 py-2 rounded-full border border-white/10 bg-white/5 text-xs font-bold text-white hover:bg-white/10 disabled:opacity-30 active:scale-95 transition-all"
                >
                  <FileDown className="w-3.5 h-3.5 text-[#00F5FF]" /> Export CSV
                </button>
                <button
                  onClick={() => SessionHistoryManager.exportJSON()}
                  disabled={historyRecords.length === 0}
                  className="flex items-center gap-1.5 px-4 py-2 rounded-full border border-white/10 bg-white/5 text-xs font-bold text-white hover:bg-white/10 disabled:opacity-30 active:scale-95 transition-all"
                >
                  <FileDown className="w-3.5 h-3.5 text-[#00F5FF]" /> Export JSON
                </button>
              </div>

              {historyRecords.length > 0 && (
                <button
                  onClick={handleClearAllHistory}
                  className="flex items-center gap-1.5 px-4 py-2 rounded-full text-xs font-bold text-red-400 hover:bg-red-500/10 active:scale-95 transition-all"
                >
                  <Trash2 className="w-3.5 h-3.5" /> Clear All Records
                </button>
              )}
            </div>
          </div>
        </div>
      )}

      {/* ======================================================================
         iOS PWA INSTALLATION GUIDE MODAL
         ====================================================================== */}
      {showIOSGuide && (
        <div className="fixed inset-0 z-50 flex items-center justify-center bg-black/80 backdrop-blur-md p-4 animate-fadeIn">
          <div className="relative w-full max-w-sm rounded-[32px] border border-[#00F5FF]/30 bg-[#090D16] p-6 shadow-2xl flex flex-col gap-4 text-center">
            <div className="mx-auto flex h-14 w-14 items-center justify-center rounded-2xl bg-[#00F5FF]/10 text-[#00F5FF] border border-[#00F5FF]/30">
              <Smartphone className="w-7 h-7" />
            </div>
            <h3 className="text-lg font-black text-white">Install TypoLab on iPhone / iPad</h3>
            <p className="text-xs text-white/70 leading-relaxed">
              1. Tap the <Share2 className="w-3.5 h-3.5 inline text-[#00F5FF]" /> <strong>Share</strong> icon in Safari.<br />
              2. Scroll down and tap <strong>"Add to Home Screen"</strong>.<br />
              3. Launch TypoLab from your home screen for full offline zero-lag experience!
            </p>
            <button
              onClick={() => setShowIOSGuide(false)}
              className="mt-2 w-full py-2.5 rounded-full bg-[#00F5FF] text-[#003940] font-black text-xs uppercase"
            >
              Got It
            </button>
          </div>
        </div>
      )}
    </div>
  );
}
