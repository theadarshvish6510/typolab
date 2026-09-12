import React, { useState, useEffect, useRef, useMemo, useCallback } from 'react';
import { 
  RotateCcw, Trophy, ChevronRight, Zap, Target, 
  Clock, AlertTriangle, Play, Sparkles, CheckCircle2, Copy,
  Maximize2, Minimize2, Languages, FileText, ClipboardPaste, Trash2, 
  ArrowRight, Award, BookmarkPlus, Download, Printer, X
} from 'lucide-react';
import { AppSettings, TypingStats, WordHUDState, CertificateData } from '../types';
import { get5Stories, DEFAULT_CUSTOM_PRESETS } from '../data/allStories';
import { TypingStory } from '../data/storyDatabase';
import { keyboardSynth } from '../audio/keyboardSynth';
import { updateDynamicFavicon } from '../utilities/favicon';
import { SessionHistoryManager } from '../sessionHistory';
import { 
  renderMasteryCertificate, downloadCertificateAsPNG, 
  printCertificate, generateVerificationId 
} from '../certificateEngine';

interface TypoLabArenaProps {
  settings: AppSettings;
  initialLanguage?: TypingLanguage;
}

export type TypingLanguage = 'en' | 'hi';
export type ActiveCategory = 'alphabet' | 'bigram' | 'case' | 'hard' | 'pro-hard' | 'custom' | 'vowel' | 'consonant' | 'matra' | 'literature';

const EN_ALPHABET_LETTERS = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'.split('');
const EN_DUAL_PAIRS = ['TH', 'CH', 'SH', 'QU', 'ING', 'A+S', 'E+R', 'P+H', 'O+N', 'R+E'];
const HI_VOWEL_LETTERS = ['अ', 'आ', 'इ', 'ई', 'उ', 'ऊ', 'ऋ', 'ए', 'ऐ', 'ओ', 'औ', 'अं'];
const HI_CONSONANT_LETTERS = [
  'क', 'ख', 'ग', 'घ', 'ङ',
  'च', 'छ', 'ज', 'झ', 'ञ',
  'ट', 'ठ', 'ड', 'ढ', 'ण',
  'त', 'थ', 'द', 'ध', 'न',
  'प', 'फ', 'ब', 'भ', 'म',
  'य', 'र', 'ल', 'व',
  'श', 'ष', 'स', 'ह'
];
const HI_MATRA_SIGNS = ['ा', 'ि', 'ी', 'ु', 'ू', 'े', 'ै', 'ो', 'ौ', 'ं', '्', 'ऋ'];
const HI_CONJUNCT_CHARS = ['क्त', 'त्य', 'ध्य', 'प्र', 'धर्म', 'क्ष', 'त्र', 'ज्ञ', 'श्र', 'द्य', 'द्ध', 'द्व', '।', '॥'];

export const TypoLabArena: React.FC<TypoLabArenaProps> = ({ settings, initialLanguage }) => {
  // Global Language State
  const [language, setLanguage] = useState<TypingLanguage>(initialLanguage || 'en');

  // Category & Key Selection
  const [category, setCategory] = useState<ActiveCategory>(
    initialLanguage === 'hi' ? 'vowel' : 'alphabet'
  );
  const [selectedLetter, setSelectedLetter] = useState<string>(
    initialLanguage === 'hi' ? 'अ' : 'A'
  );
  const [storyIndex, setStoryIndex] = useState<number>(0);

  // Sync language when deep-link prop changes (URL hash navigation)
  useEffect(() => {
    if (initialLanguage && initialLanguage !== language) {
      setLanguage(initialLanguage);
      if (initialLanguage === 'hi') {
        setCategory('vowel');
        setSelectedLetter('अ');
      } else {
        setCategory('alphabet');
        setSelectedLetter('A');
      }
      setStoryIndex(0);
    }
  }, [initialLanguage]);

  // Custom Mode State
  const [customText, setCustomText] = useState<string>(() => {
    try {
      return localStorage.getItem('typolab_custom_text') || '';
    } catch {
      return '';
    }
  });
  const [isCustomActive, setIsCustomActive] = useState<boolean>(false);

  // Fullscreen Theater Mode State
  const [isFullscreen, setIsFullscreen] = useState<boolean>(false);

  // Active Story Bank
  const storiesList: TypingStory[] = useMemo(() => {
    return get5Stories(language, category, selectedLetter, isCustomActive ? customText : undefined);
  }, [language, category, selectedLetter, isCustomActive, customText]);

  const activeStory: TypingStory = useMemo(() => {
    return storiesList[storyIndex % storiesList.length] || storiesList[0];
  }, [storiesList, storyIndex]);

  // Typing engine state
  const [userInput, setUserInput] = useState<string>('');
  const [startTime, setStartTime] = useState<number | null>(null);
  const [elapsedSeconds, setElapsedSeconds] = useState<number>(0);
  const [isFinished, setIsFinished] = useState<boolean>(false);
  const [mistakesMap, setMistakesMap] = useState<Record<string, number>>({});
  const [totalErrors, setTotalErrors] = useState<number>(0);
  const [copiedSummary, setCopiedSummary] = useState<boolean>(false);
  const [sessionSaved, setSessionSaved] = useState<boolean>(false);

  // Certificate Modal State
  const [isCertOpen, setIsCertOpen] = useState<boolean>(false);
  const [recipientName, setRecipientName] = useState<string>('Adarsh Vishwakarma');
  const certCanvasRef = useRef<HTMLCanvasElement | null>(null);

  // Target Key Strikes Count
  const targetKeyMetrics = useMemo(() => {
    if (!activeStory) return { hits: 0, expected: 0 };
    const target = activeStory.letter || selectedLetter;
    if (!target || target === 'Custom' || target === 'Shift' || target === 'Syntax' || target === 'Code') {
      return { hits: 0, expected: 0 };
    }

    let expected = 0;
    const lowerTarget = target.toLowerCase();
    for (let i = 0; i < activeStory.text.length; i++) {
      if (activeStory.text[i].toLowerCase() === lowerTarget) {
        expected++;
      }
    }

    let hits = 0;
    for (let i = 0; i < userInput.length; i++) {
      if (userInput[i] === activeStory.text[i] && userInput[i].toLowerCase() === lowerTarget) {
        hits++;
      }
    }

    return { hits, expected };
  }, [activeStory, selectedLetter, userInput]);

  // Refs
  const inputRef = useRef<HTMLInputElement>(null);
  const textContainerRef = useRef<HTMLDivElement>(null);
  const charSpanRefs = useRef<(HTMLSpanElement | null)[]>([]);
  const caretRef = useRef<HTMLDivElement>(null);

  // Reset function
  const resetTyping = useCallback(() => {
    setUserInput('');
    setStartTime(null);
    setElapsedSeconds(0);
    setIsFinished(false);
    setMistakesMap({});
    setTotalErrors(0);
    setCopiedSummary(false);
    setSessionSaved(false);
    setTimeout(() => {
      inputRef.current?.focus();
    }, 50);
  }, []);

  // When active story changes, reset
  useEffect(() => {
    resetTyping();
  }, [activeStory.id, resetTyping]);

  // Update dynamic canvas favicon
  useEffect(() => {
    const glyph = category === 'custom' ? '✍️' : (selectedLetter || 'TL');
    updateDynamicFavicon(settings.accentColor, glyph);
  }, [selectedLetter, category, settings.accentColor]);

  // Mute / unmute synthesizer
  useEffect(() => {
    keyboardSynth.setMuted(!settings.soundEnabled);
  }, [settings.soundEnabled]);

  // Timer interval
  useEffect(() => {
    if (!startTime || isFinished) return;
    const interval = setInterval(() => {
      const sec = Math.max(0.1, (Date.now() - startTime) / 1000);
      setElapsedSeconds(sec);
    }, 100);
    return () => clearInterval(interval);
  }, [startTime, isFinished]);

  // 3-Line Locked Caret positioning & Smooth Line Stabilizer
  useEffect(() => {
    const activeIdx = userInput.length;
    const activeSpan = charSpanRefs.current[activeIdx];
    const caret = caretRef.current;
    const container = textContainerRef.current;

    if (caret && activeSpan && container) {
      const charRect = activeSpan.getBoundingClientRect();
      const containerRect = container.getBoundingClientRect();

      const top = charRect.top - containerRect.top + container.scrollTop;
      const left = charRect.left - containerRect.left + container.scrollLeft;

      caret.style.transform = `translate(${left}px, ${top}px)`;
      caret.style.height = `${charRect.height || 32}px`;

      // Keep active line centered in 3-line view
      const targetScroll = top - (container.clientHeight / 2 - charRect.height / 2);
      container.scrollTo({
        top: Math.max(0, targetScroll),
        behavior: 'smooth'
      });
    }
  }, [userInput]);

  // Keyboard navigation & Fullscreen hotkeys (Esc to exit fullscreen, Tab to reset)
  useEffect(() => {
    const handleKeyDownGlobal = (e: KeyboardEvent) => {
      if (e.key === 'Escape' && isFullscreen) {
        setIsFullscreen(false);
      }
    };
    window.addEventListener('keydown', handleKeyDownGlobal);
    return () => window.removeEventListener('keydown', handleKeyDownGlobal);
  }, [isFullscreen]);

  // Handle typing input
  const handleKeyDown = (e: React.KeyboardEvent<HTMLInputElement>) => {
    if (isFinished) return;

    // Start timer on first key
    if (!startTime && e.key.length === 1 && !e.ctrlKey && !e.metaKey && !e.altKey) {
      setStartTime(Date.now());
    }

    if (e.key === 'Backspace') {
      keyboardSynth.playKeySound('Backspace');
      return;
    }

    if (e.key === 'Tab') {
      e.preventDefault();
      resetTyping();
      return;
    }

    if (e.key.length === 1 && !e.ctrlKey && !e.metaKey && !e.altKey) {
      const currentIdx = userInput.length;
      const expectedChar = activeStory.text[currentIdx];
      const typedChar = e.key;

      const isMismatch = typedChar !== expectedChar;
      if (isMismatch) {
        setTotalErrors(prev => prev + 1);
        setMistakesMap(prev => ({
          ...prev,
          [expectedChar || 'space']: (prev[expectedChar || 'space'] || 0) + 1
        }));
      }

      keyboardSynth.playKeySound(typedChar, isMismatch);
    }
  };

  const handleInputChange = (e: React.ChangeEvent<HTMLInputElement>) => {
    if (isFinished) return;
    const val = e.target.value;
    setUserInput(val);

    if (val.length >= activeStory.text.length) {
      setIsFinished(true);
      const totalSec = Math.max(1, ((Date.now() - (startTime || Date.now())) / 1000));
      setElapsedSeconds(totalSec);
    }
  };

  // Real-time calculation metrics
  const stats: TypingStats = useMemo(() => {
    const typedCount = userInput.length;
    let correctCount = 0;
    for (let i = 0; i < typedCount; i++) {
      if (userInput[i] === activeStory.text[i]) {
        correctCount++;
      }
    }

    const minutes = Math.max(elapsedSeconds / 60, 0.01);
    const wpm = Math.round((correctCount / 5) / minutes);
    const rawWpm = Math.round((typedCount / 5) / minutes);
    const accuracy = typedCount > 0 ? Math.round((correctCount / typedCount) * 100) : 100;
    const cpm = Math.round(correctCount / minutes);

    return {
      wpm,
      rawWpm,
      accuracy,
      cpm,
      errors: totalErrors,
      elapsedSeconds,
      totalKeystrokes: typedCount,
      mistakes: mistakesMap
    };
  }, [userInput, activeStory.text, elapsedSeconds, totalErrors, mistakesMap]);

  // Active Word Live Focus Spotlight HUD Computation
  const wordHUD = useMemo((): WordHUDState & { wordStartChar: number } => {
    const storyText = activeStory.text;
    const words = storyText.split(' ');
    
    let charAccum = 0;
    let currentWordIdx = 0;
    let wordStartChar = 0;
    
    for (let i = 0; i < words.length; i++) {
      const wordLen = words[i].length;
      if (userInput.length <= charAccum + wordLen) {
        currentWordIdx = i;
        wordStartChar = charAccum;
        break;
      }
      charAccum += wordLen + 1; // including space
      if (i === words.length - 1) {
        currentWordIdx = i;
        wordStartChar = charAccum - (wordLen + 1);
      }
    }

    const activeWord = words[currentWordIdx] || '';
    const typedForActiveWord = userInput.slice(wordStartChar, wordStartChar + activeWord.length);
    const upcomingWords = words.slice(currentWordIdx + 1, currentWordIdx + 4);
    
    const nextCharExpected = activeStory.text[userInput.length];
    const isCurrentCharCorrect = true;

    return {
      currentWordIndex: currentWordIdx,
      activeWord,
      typedForActiveWord,
      upcomingWords,
      isCurrentCharCorrect,
      wordStartChar
    };
  }, [activeStory.text, userInput]);

  // Switch Language
  const handleLanguageSwitch = (lang: TypingLanguage) => {
    setLanguage(lang);
    if (lang === 'en') {
      setCategory('alphabet');
      setSelectedLetter('A');
    } else {
      setCategory('vowel');
      setSelectedLetter('अ');
    }
    setStoryIndex(0);
    setIsCustomActive(false);
    resetTyping();
  };

  // Switch Category
  const handleCategorySwitch = (cat: ActiveCategory) => {
    setCategory(cat);
    setStoryIndex(0);
    if (cat === 'custom') {
      setIsCustomActive(true);
    } else {
      setIsCustomActive(false);
      if (language === 'en') {
        if (cat === 'alphabet') setSelectedLetter('A');
        else if (cat === 'bigram') setSelectedLetter('TH');
        else if (cat === 'case') setSelectedLetter('Shift');
        else if (cat === 'hard') setSelectedLetter('Hard');
        else if (cat === 'pro-hard') setSelectedLetter('Code');
        else if (cat === 'literature') setSelectedLetter('Science');
      } else {
        if (cat === 'vowel') setSelectedLetter('अ');
        else if (cat === 'consonant') setSelectedLetter('क');
        else if (cat === 'matra') setSelectedLetter('ा');
        else if (cat === 'literature') setSelectedLetter('साहित्य');
        else if (cat === 'hard') setSelectedLetter('कठिन');
      }
    }
    resetTyping();
  };

  // Virtual Matra click insertion
  const handleVirtualCharClick = (char: string) => {
    if (isFinished) return;
    const currentIdx = userInput.length;
    const expectedChar = activeStory.text[currentIdx];
    const isMismatch = char !== expectedChar;

    if (!startTime) setStartTime(Date.now());
    if (isMismatch) {
      setTotalErrors(prev => prev + 1);
      setMistakesMap(prev => ({
        ...prev,
        [expectedChar || 'space']: (prev[expectedChar || 'space'] || 0) + 1
      }));
    }
    keyboardSynth.playKeySound(char, isMismatch);

    const nextVal = userInput + char;
    setUserInput(nextVal);
    if (nextVal.length >= activeStory.text.length) {
      setIsFinished(true);
      const totalSec = Math.max(1, ((Date.now() - (startTime || Date.now())) / 1000));
      setElapsedSeconds(totalSec);
    }
    inputRef.current?.focus();
  };

  // Custom text actions
  const applyCustomText = () => {
    if (!customText.trim()) return;
    try {
      localStorage.setItem('typolab_custom_text', customText.trim());
    } catch {}
    setIsCustomActive(true);
    setCategory('custom');
    setStoryIndex(0);
    resetTyping();
  };

  const loadPreset = (index: number) => {
    const preset = DEFAULT_CUSTOM_PRESETS[index];
    if (preset) {
      setCustomText(preset.text);
      try {
        localStorage.setItem('typolab_custom_text', preset.text);
      } catch {}
    }
  };

  const pasteClipboard = async () => {
    try {
      const text = await navigator.clipboard.readText();
      if (text) {
        setCustomText(text);
      }
    } catch {
      inputRef.current?.focus();
    }
  };

  // Speed rank badge
  const speedTier = useMemo(() => {
    if (stats.wpm >= 90) return { label: 'Grandmaster Typist ⚡', color: '#F59E0B' };
    if (stats.wpm >= 70) return { label: 'Master Typist 🚀', color: '#00F5FF' };
    if (stats.wpm >= 50) return { label: 'Pro Typist ✨', color: '#10B981' };
    if (stats.wpm >= 35) return { label: 'Steady Typist 🎯', color: '#818CF8' };
    return { label: 'Apprentice Typist 🌱', color: '#A855F7' };
  }, [stats.wpm]);

  // Copy result summary
  const copyResult = () => {
    const summary = `⚡ TypoLab Scorecard:
📖 Lesson: ${activeStory.title}
🚀 Speed: ${stats.wpm} WPM (${stats.cpm} CPM)
🎯 Accuracy: ${stats.accuracy}% (Raw ${stats.rawWpm} WPM)
⏱️ Time: ${stats.elapsedSeconds.toFixed(1)}s
🎯 Target Key Strikes: ${targetKeyMetrics.hits} / ${targetKeyMetrics.expected}
❌ Errors: ${stats.errors}
Built with Adarsh's TextCraft & TypoLab Studio`;
    navigator.clipboard.writeText(summary);
    setCopiedSummary(true);
    keyboardSynth.playKeySound('c');
    setTimeout(() => setCopiedSummary(false), 2000);
  };

  // Save Session to LocalStorage History
  const handleSaveSession = () => {
    const verificationId = generateVerificationId();
    SessionHistoryManager.saveSession({
      language,
      category,
      targetKey: activeStory.letter || selectedLetter,
      storyTitle: activeStory.title,
      netWpm: stats.wpm,
      rawWpm: stats.rawWpm,
      accuracy: stats.accuracy,
      cpm: stats.cpm,
      totalKeystrokes: stats.totalKeystrokes,
      mistakesCount: stats.errors,
      durationSeconds: Math.round(stats.elapsedSeconds),
      verificationId,
      frequentMistakes: stats.mistakes
    });
    setSessionSaved(true);
    keyboardSynth.playKeySound('Enter');
  };

  // Render Certificate onto Canvas when opened
  useEffect(() => {
    if (isCertOpen && certCanvasRef.current) {
      const certData: CertificateData = {
        recipientName,
        targetKey: activeStory.letter || selectedLetter,
        category: activeStory.category,
        language,
        storyTitle: activeStory.title,
        netWpm: stats.wpm,
        rawWpm: stats.rawWpm,
        accuracy: stats.accuracy,
        cpm: stats.cpm,
        totalKeystrokes: stats.totalKeystrokes,
        targetKeyHits: targetKeyMetrics.hits,
        targetKeyExpected: targetKeyMetrics.expected,
        verificationId: generateVerificationId(),
        issueDate: new Date().toLocaleDateString(undefined, {
          month: 'long',
          day: 'numeric',
          year: 'numeric'
        })
      };
      renderMasteryCertificate(certCanvasRef.current, certData);
    }
  }, [isCertOpen, recipientName, stats, activeStory, language, selectedLetter, targetKeyMetrics]);

  return (
    <div className={`space-y-6 animate-fadeIn ${isFullscreen ? 'fixed inset-0 z-50 overflow-y-auto bg-black/95 backdrop-blur-3xl p-4 sm:p-8' : ''}`}>
      {/* ----------------------------------------------------------------------
         TOP NAVIGATION BAR: Language Switcher, Category Ribbon, and Fullscreen
         ---------------------------------------------------------------------- */}
      <div className="flex flex-wrap items-center justify-between gap-4 rounded-3xl border border-white/10 bg-white/5 p-3.5 backdrop-blur-xl shadow-xl">
        {/* Language Switcher */}
        <div className="flex items-center gap-3">
          <div className="flex items-center gap-1.5 text-xs font-bold uppercase tracking-wider text-[#00F5FF]">
            <Languages className="h-4 w-4 text-[#00F5FF]" />
            <span>Language:</span>
          </div>
          <div className="flex rounded-full border border-white/10 bg-black/30 p-1 backdrop-blur-md">
            <button
              type="button"
              onClick={() => handleLanguageSwitch('en')}
              className={`flex items-center gap-1.5 rounded-full px-4 py-1.5 text-xs font-bold transition-all ${
                language === 'en'
                  ? 'bg-[#00F5FF] text-[#003940] shadow-[0_0_15px_rgba(0,245,255,0.4)]'
                  : 'text-white/70 hover:text-white'
              }`}
            >
              <span>🇬🇧</span>
              <span>English Muscle</span>
            </button>
            <button
              type="button"
              onClick={() => handleLanguageSwitch('hi')}
              className={`flex items-center gap-1.5 rounded-full px-4 py-1.5 text-xs font-bold transition-all ${
                language === 'hi'
                  ? 'bg-[#00F5FF] text-[#003940] shadow-[0_0_15px_rgba(0,245,255,0.4)]'
                  : 'text-white/70 hover:text-white'
              }`}
            >
              <span>🇮🇳</span>
              <span>हिन्दी (Devanagari)</span>
            </button>
          </div>
        </div>

        {/* Action Controls: Fullscreen, Restart */}
        <div className="flex items-center gap-2">
          <button
            type="button"
            onClick={() => setIsFullscreen(prev => !prev)}
            className="flex items-center gap-1.5 rounded-full border border-white/10 bg-white/5 px-4 py-2 text-xs font-bold hover:bg-white/10 transition-all active:scale-95 text-white/80"
            title={isFullscreen ? 'Exit Fullscreen (Esc)' : 'Fullscreen Theater View'}
          >
            {isFullscreen ? <Minimize2 className="h-3.5 w-3.5 text-amber-400" /> : <Maximize2 className="h-3.5 w-3.5 text-[#00F5FF]" />}
            <span>{isFullscreen ? 'Exit Theater' : 'Theater Mode'}</span>
          </button>

          <button
            type="button"
            onClick={resetTyping}
            className="flex items-center gap-1.5 rounded-full border border-white/10 bg-white/5 px-4 py-2 text-xs font-bold hover:bg-white/10 transition-all active:scale-95 text-white/80"
            title="Restart Session (Tab)"
          >
            <RotateCcw className="h-3.5 w-3.5" />
            <span>Reset</span>
          </button>
        </div>
      </div>

      {/* ----------------------------------------------------------------------
         CATEGORY CHIPS RIBBON (Pill to Rounded Morphing)
         ---------------------------------------------------------------------- */}
      {!isFullscreen && (
        <div className="flex items-center gap-2 overflow-x-auto no-scrollbar py-1">
          {language === 'en' ? (
            <>
              {[
                { id: 'alphabet', label: '🔤 Alphabet A-Z (5 Stories)' },
                { id: 'bigram', label: '⚡ Dual-Letter Bigrams' },
                { id: 'case', label: '🔠 Shift Case Mastery' },
                { id: 'hard', label: '🎯 Hard Punctuation' },
                { id: 'pro-hard', label: '💻 Pro-Hard Code Syntax' },
                { id: 'literature', label: '🚀 Space Science Excerpts' },
                { id: 'custom', label: '✍️ Custom Text Mode' }
              ].map(cat => (
                <button
                  key={cat.id}
                  onClick={() => handleCategorySwitch(cat.id as ActiveCategory)}
                  className={`px-4 py-2 rounded-full text-xs font-bold whitespace-nowrap transition-all duration-300 active:scale-95 ${
                    category === cat.id
                      ? 'bg-[#00F5FF] text-[#003940] shadow-[0_0_20px_rgba(0,245,255,0.4)]'
                      : 'bg-white/5 hover:bg-white/10 text-white/70 border border-white/10'
                  }`}
                  style={{
                    borderRadius: category === cat.id ? '14px' : '9999px',
                    transition: 'border-radius 0.25s cubic-bezier(0.34, 1.35, 0.64, 1), transform 0.2s ease, background 0.2s ease'
                  }}
                >
                  {cat.label}
                </button>
              ))}
            </>
          ) : (
            <>
              {[
                { id: 'vowel', label: '✨ स्वर (Vowels)' },
                { id: 'consonant', label: '🕉️ व्यंजन (Consonants)' },
                { id: 'matra', label: '⚡ मात्राएँ (Matras)' },
                { id: 'literature', label: '📖 प्रेमचंद व कबीर साहित्य' },
                { id: 'hard', label: '💥 प्रो-कठिन (संयुक्ताक्षर)' },
                { id: 'custom', label: '✍️ कस्टम टेक्स्ट' }
              ].map(cat => (
                <button
                  key={cat.id}
                  onClick={() => handleCategorySwitch(cat.id as ActiveCategory)}
                  className={`px-4 py-2 rounded-full text-xs font-bold whitespace-nowrap transition-all duration-300 active:scale-95 ${
                    category === cat.id
                      ? 'bg-[#00F5FF] text-[#003940] shadow-[0_0_20px_rgba(0,245,255,0.4)]'
                      : 'bg-white/5 hover:bg-white/10 text-white/70 border border-white/10'
                  }`}
                  style={{
                    borderRadius: category === cat.id ? '14px' : '9999px',
                    transition: 'border-radius 0.25s cubic-bezier(0.34, 1.35, 0.64, 1), transform 0.2s ease, background 0.2s ease'
                  }}
                >
                  {cat.label}
                </button>
              ))}
            </>
          )}
        </div>
      )}

      {/* ----------------------------------------------------------------------
         SUB-LETTERS CHIPS SELECTOR (Hidden in Custom Mode)
         ---------------------------------------------------------------------- */}
      {!isFullscreen && category !== 'custom' && (
        <div className="space-y-3 rounded-3xl border border-white/10 bg-white/5 p-4 backdrop-blur-md">
          <div className="flex items-center justify-between gap-2 pb-1">
            <span className="text-xs font-bold uppercase tracking-wider text-white/70">
              {language === 'en' ? 'Select Target Letter / Digraph' : 'लक्षित वर्ण / अभ्यास चुनें'}
            </span>
            <span className="text-xs text-[#00F5FF] font-mono">
              5 Stories per Key • Marathon Muscle Drills
            </span>
          </div>

          <div className="flex gap-2 overflow-x-auto pb-1 no-scrollbar">
            {language === 'en' && category === 'alphabet' && EN_ALPHABET_LETTERS.map(letter => (
              <button
                key={letter}
                type="button"
                onClick={() => { setSelectedLetter(letter); setStoryIndex(0); resetTyping(); }}
                className={`flex h-10 w-10 shrink-0 items-center justify-center rounded-full text-sm font-black transition-all ${
                  selectedLetter === letter
                    ? 'bg-[#00F5FF] text-[#003940] shadow-[0_0_15px_rgba(0,245,255,0.5)] scale-105'
                    : 'border border-white/10 bg-white/5 text-white/70 hover:text-white hover:bg-white/10'
                }`}
                style={{
                  borderRadius: selectedLetter === letter ? '12px' : '9999px',
                  transition: 'border-radius 0.25s cubic-bezier(0.34, 1.35, 0.64, 1), transform 0.2s ease'
                }}
              >
                {letter}
              </button>
            ))}

            {language === 'en' && category === 'bigram' && EN_DUAL_PAIRS.map(pair => (
              <button
                key={pair}
                type="button"
                onClick={() => { setSelectedLetter(pair); setStoryIndex(0); resetTyping(); }}
                className={`flex h-10 px-4 shrink-0 items-center justify-center rounded-full text-xs font-black transition-all ${
                  selectedLetter === pair
                    ? 'bg-[#00F5FF] text-[#003940] shadow-[0_0_15px_rgba(0,245,255,0.5)]'
                    : 'border border-white/10 bg-white/5 text-white/70 hover:text-white'
                }`}
                style={{
                  borderRadius: selectedLetter === pair ? '12px' : '9999px',
                  transition: 'border-radius 0.25s cubic-bezier(0.34, 1.35, 0.64, 1), transform 0.2s ease'
                }}
              >
                {pair}
              </button>
            ))}

            {language === 'hi' && category === 'vowel' && HI_VOWEL_LETTERS.map(vowel => (
              <button
                key={vowel}
                type="button"
                onClick={() => { setSelectedLetter(vowel); setStoryIndex(0); resetTyping(); }}
                className={`flex h-10 w-10 shrink-0 items-center justify-center rounded-full text-sm font-black transition-all ${
                  selectedLetter === vowel
                    ? 'bg-[#00F5FF] text-[#003940] shadow-[0_0_15px_rgba(0,245,255,0.5)]'
                    : 'border border-white/10 bg-white/5 text-white/70 hover:text-white'
                }`}
                style={{
                  borderRadius: selectedLetter === vowel ? '12px' : '9999px',
                  transition: 'border-radius 0.25s cubic-bezier(0.34, 1.35, 0.64, 1), transform 0.2s ease'
                }}
              >
                {vowel}
              </button>
            ))}

            {language === 'hi' && category === 'consonant' && HI_CONSONANT_LETTERS.map(cons => (
              <button
                key={cons}
                type="button"
                onClick={() => { setSelectedLetter(cons); setStoryIndex(0); resetTyping(); }}
                className={`flex h-10 w-10 shrink-0 items-center justify-center rounded-full text-sm font-black transition-all ${
                  selectedLetter === cons
                    ? 'bg-[#00F5FF] text-[#003940] shadow-[0_0_15px_rgba(0,245,255,0.5)]'
                    : 'border border-white/10 bg-white/5 text-white/70 hover:text-white'
                }`}
                style={{
                  borderRadius: selectedLetter === cons ? '12px' : '9999px',
                  transition: 'border-radius 0.25s cubic-bezier(0.34, 1.35, 0.64, 1), transform 0.2s ease'
                }}
              >
                {cons}
              </button>
            ))}

            {language === 'hi' && category === 'matra' && HI_MATRA_SIGNS.map(matra => (
              <button
                key={matra}
                type="button"
                onClick={() => { setSelectedLetter(matra); setStoryIndex(0); resetTyping(); }}
                className={`flex h-10 w-10 shrink-0 items-center justify-center rounded-full text-sm font-black transition-all ${
                  selectedLetter === matra
                    ? 'bg-[#00F5FF] text-[#003940] shadow-[0_0_15px_rgba(0,245,255,0.5)]'
                    : 'border border-white/10 bg-white/5 text-white/70 hover:text-white'
                }`}
                style={{
                  borderRadius: selectedLetter === matra ? '12px' : '9999px',
                  transition: 'border-radius 0.25s cubic-bezier(0.34, 1.35, 0.64, 1), transform 0.2s ease'
                }}
              >
                {matra}
              </button>
            ))}
          </div>
        </div>
      )}

      {/* ----------------------------------------------------------------------
         DEVANAGARI VIRTUAL ASSIST RIBBON
         ---------------------------------------------------------------------- */}
      {language === 'hi' && (
        <div className="flex items-center gap-2 overflow-x-auto rounded-2xl border border-white/10 bg-black/30 p-2.5 backdrop-blur-md no-scrollbar">
          <span className="text-[11px] font-black uppercase tracking-wider text-[#00F5FF] shrink-0 mr-1 flex items-center gap-1">
            <Zap className="w-3.5 h-3.5" /> Virtual Assist:
          </span>
          {HI_MATRA_SIGNS.map((sign, idx) => (
            <button
              key={idx}
              type="button"
              onClick={() => handleVirtualCharClick(sign)}
              className="shrink-0 rounded-full border border-white/10 bg-white/5 px-3 py-1 text-xs font-bold hover:bg-[#00F5FF]/20 hover:text-[#00F5FF] hover:border-[#00F5FF]/40 transition-all active:scale-95"
            >
              क+{sign} ({sign})
            </button>
          ))}
          <div className="h-4 w-px bg-white/20 mx-1 shrink-0" />
          {HI_CONJUNCT_CHARS.map((conj, idx) => (
            <button
              key={`conj-${idx}`}
              type="button"
              onClick={() => handleVirtualCharClick(conj)}
              className="shrink-0 rounded-full border border-[#00F5FF]/20 bg-[#00F5FF]/10 text-[#00F5FF] px-3 py-1 text-xs font-bold hover:bg-[#00F5FF] hover:text-[#003940] transition-all active:scale-95"
            >
              {conj}
            </button>
          ))}
        </div>
      )}

      {/* ----------------------------------------------------------------------
         CUSTOM TEXT MODE PANEL
         ---------------------------------------------------------------------- */}
      {category === 'custom' && (
        <div className="glass-card space-y-4">
          <div className="flex flex-wrap items-center justify-between gap-3">
            <div className="flex items-center gap-2">
              <FileText className="h-5 w-5 text-[#00F5FF]" />
              <h3 className="text-base font-bold">Custom Practice / अपना पसंदीदा टेक्स्ट टाइप करें</h3>
            </div>
            <div className="flex items-center gap-1.5 flex-wrap">
              <span className="text-xs text-white/50 font-semibold">Presets:</span>
              {DEFAULT_CUSTOM_PRESETS.map((p, idx) => (
                <button
                  key={idx}
                  type="button"
                  onClick={() => loadPreset(idx)}
                  className="rounded-full border border-white/10 bg-white/5 px-2.5 py-1 text-[11px] font-semibold text-white/70 hover:text-white hover:bg-white/10 transition"
                >
                  {p.title.split(':')[0].slice(0, 16)}...
                </button>
              ))}
            </div>
          </div>

          <textarea
            value={customText}
            onChange={(e) => setCustomText(e.target.value)}
            rows={4}
            placeholder="यहाँ अपना कोई भी टेक्स्ट या कहानी पेस्ट करें (Paste your custom English or Devanagari text here)..."
            className="w-full rounded-2xl border border-white/10 bg-black/30 p-4 text-sm leading-relaxed text-white outline-none focus:border-[#00F5FF] transition"
          />

          <div className="flex flex-wrap items-center justify-between gap-3 pt-1">
            <div className="flex items-center gap-3 text-xs text-white/50 font-mono">
              <span>{customText.length} characters</span>
              <span>•</span>
              <span>{customText.trim() ? customText.trim().split(/\s+/).length : 0} words</span>
            </div>

            <div className="flex items-center gap-2">
              <button
                type="button"
                onClick={pasteClipboard}
                className="flex items-center gap-1.5 rounded-full border border-white/10 bg-white/5 px-3 py-1.5 text-xs font-semibold hover:bg-white/10 transition"
              >
                <ClipboardPaste className="h-3.5 w-3.5" />
                <span>Paste</span>
              </button>
              <button
                type="button"
                onClick={() => setCustomText('')}
                className="flex items-center gap-1.5 rounded-full border border-white/10 bg-white/5 px-3 py-1.5 text-xs font-semibold hover:bg-white/10 transition text-white/50"
              >
                <Trash2 className="h-3.5 w-3.5" />
                <span>Clear</span>
              </button>
              <button
                type="button"
                onClick={applyCustomText}
                className="flex items-center gap-1.5 rounded-full px-5 py-2 text-xs font-black uppercase text-[#003940] bg-[#00F5FF] shadow-[0_0_15px_rgba(0,245,255,0.4)] hover:brightness-110 active:scale-95 transition-all"
              >
                <Play className="h-3.5 w-3.5 fill-[#003940]" />
                <span>Start Typing</span>
              </button>
            </div>
          </div>
        </div>
      )}

      {/* ----------------------------------------------------------------------
         ACTIVE WORD LIVE FOCUS SPOTLIGHT HUD (LETTER-BY-LETTER LIVE VERIFICATION)
         ---------------------------------------------------------------------- */}
      <div className="w-full rounded-2xl border border-[#00F5FF]/30 bg-black/40 backdrop-blur-xl p-3 px-4 flex flex-wrap items-center justify-between gap-3 shadow-[0_0_25px_rgba(0,245,255,0.15)]">
        <div className="flex items-center gap-3">
          <span className="text-[11px] font-black uppercase tracking-wider text-[#00F5FF] flex items-center gap-1.5">
            <Sparkles className="w-3.5 h-3.5 text-[#00F5FF]" /> Active Focus:
          </span>
          {/* Letter-by-letter live feedback */}
          <div className="flex items-center text-xl md:text-2xl font-black font-mono tracking-wide px-3 py-1 rounded-xl bg-white/5 border border-white/10 shadow-inner">
            {wordHUD.activeWord.split('').map((ch, cIdx) => {
              const hasTyped = cIdx < wordHUD.typedForActiveWord.length;
              const typedChar = wordHUD.typedForActiveWord[cIdx];
              const isCorrect = hasTyped && typedChar === ch;
              const isError = hasTyped && typedChar !== ch;
              return (
                <span
                  key={cIdx}
                  className={`transition-all duration-150 inline-block ${
                    isError
                      ? 'text-red-400 bg-red-500/30 underline font-black px-0.5 rounded'
                      : isCorrect
                      ? 'text-[#00F5FF] text-glow font-black'
                      : 'text-white/35'
                  }`}
                >
                  {ch}
                </span>
              );
            })}
          </div>
        </div>

        {/* Next 3 Upcoming Words Chips */}
        {wordHUD.upcomingWords.length > 0 && (
          <div className="flex items-center gap-1.5 overflow-x-auto no-scrollbar">
            <span className="text-[10px] uppercase font-bold text-white/40 tracking-wider">Next:</span>
            {wordHUD.upcomingWords.map((uw, uIdx) => (
              <span
                key={uIdx}
                className="px-3 py-1 rounded-full text-xs font-mono font-semibold bg-white/5 border border-white/10 text-white/80"
                style={{ opacity: 1 - uIdx * 0.25 }}
              >
                {uw}
              </span>
            ))}
          </div>
        )}
      </div>

      {/* ----------------------------------------------------------------------
         MAIN TYPING ARENA (MONKEYTYPE LOCKED 3-LINE VIEWING WINDOW)
         ---------------------------------------------------------------------- */}
      <div 
        className={`glass-card relative p-6 md:p-8 transition-all ${
          isFullscreen ? 'min-h-[70vh] flex flex-col justify-between' : ''
        }`}
        style={{
          boxShadow: '0 20px 60px -10px rgba(0, 245, 255, 0.15)'
        }}
        onClick={() => inputRef.current?.focus()}
      >
        {/* Story Title & Scoreboard Chips Header */}
        <div className="flex flex-wrap items-center justify-between gap-4 pb-6 border-b border-white/10">
          <div>
            <div className="flex items-center gap-2 flex-wrap">
              <span className="rounded-full px-3 py-0.5 text-xs font-black bg-[#00F5FF] text-[#003940] uppercase tracking-wider">
                {activeStory.category}
              </span>
              <h3 className="text-base md:text-xl font-black text-white">{activeStory.title}</h3>
            </div>
            <p className="text-xs text-white/50 mt-1">{activeStory.subtitle}</p>
          </div>

          {/* 5 Stories Selector Chips */}
          {category !== 'custom' && (
            <div className="flex items-center gap-1 rounded-full border border-white/10 bg-black/30 p-1 backdrop-blur-md">
              {[0, 1, 2, 3, 4].map(idx => (
                <button
                  key={idx}
                  type="button"
                  onClick={(e) => {
                    e.stopPropagation();
                    setStoryIndex(idx);
                    resetTyping();
                  }}
                  className={`rounded-full px-3 py-1 text-xs font-bold transition-all ${
                    storyIndex === idx ? 'bg-[#00F5FF] text-[#003940] shadow-[0_0_12px_rgba(0,245,255,0.4)]' : 'text-white/60 hover:text-white'
                  }`}
                >
                  Story {idx + 1}
                </button>
              ))}
            </div>
          )}

          {/* M3 Live Scoreboard Chips */}
          <div className="flex items-center gap-3 sm:gap-5 font-mono">
            <div className="text-center bg-white/5 border border-white/10 px-3 py-1.5 rounded-xl">
              <div className="text-[10px] text-white/50 uppercase font-bold">WPM</div>
              <div className="text-lg md:text-2xl font-black text-[#00F5FF]">{stats.wpm}</div>
            </div>

            <div className="text-center bg-white/5 border border-white/10 px-3 py-1.5 rounded-xl">
              <div className="text-[10px] text-white/50 uppercase font-bold">Accuracy</div>
              <div className="text-lg md:text-2xl font-black text-emerald-400">{stats.accuracy}%</div>
            </div>

            {targetKeyMetrics.expected > 0 && (
              <div className="text-center hidden sm:block bg-white/5 border border-white/10 px-3 py-1.5 rounded-xl">
                <div className="text-[10px] text-white/50 uppercase font-bold">Key '{selectedLetter}'</div>
                <div className="text-lg md:text-2xl font-black text-amber-400">
                  {targetKeyMetrics.hits}/{targetKeyMetrics.expected}
                </div>
              </div>
            )}

            <div className="text-center bg-white/5 border border-white/10 px-3 py-1.5 rounded-xl">
              <div className="text-[10px] text-white/50 uppercase font-bold">Errors</div>
              <div className={`text-lg md:text-2xl font-black ${stats.errors > 0 ? 'text-red-400' : 'text-white/60'}`}>
                {stats.errors}
              </div>
            </div>

            <div className="text-center bg-white/5 border border-white/10 px-3 py-1.5 rounded-xl">
              <div className="text-[10px] text-white/50 uppercase font-bold">Time</div>
              <div className="text-lg md:text-2xl font-black text-white/90">
                {Math.floor(stats.elapsedSeconds)}s
              </div>
            </div>
          </div>
        </div>

        {/* Hidden Keystroke Capture Input */}
        <input
          ref={inputRef}
          type="text"
          value={userInput}
          onChange={handleInputChange}
          onKeyDown={handleKeyDown}
          className="absolute inset-0 h-full w-full opacity-0 cursor-default"
          autoFocus
          autoComplete="off"
          autoCorrect="off"
          autoCapitalize="off"
          spellCheck={false}
        />

        {/* Locked 3-Line Typing Window Container */}
        <div 
          ref={textContainerRef}
          className={`relative mt-6 overflow-y-hidden pr-2 select-none tracking-wide transition-all ${
            isFullscreen 
              ? 'flex-1 min-h-[380px] max-h-[60vh] text-2xl sm:text-3xl md:text-4xl leading-loose font-medium' 
              : 'h-[140px] text-lg sm:text-xl md:text-2xl leading-relaxed'
          }`}
          style={{ fontFamily: settings.font }}
        >
          {/* Stabilized Caret */}
          <div
            ref={caretRef}
            className="pointer-events-none absolute w-[3px] rounded-full transition-transform duration-100 ease-out animate-pulse"
            style={{
              backgroundColor: '#00F5FF',
              boxShadow: '0 0 14px 2px #00F5FF',
              zIndex: 10
            }}
          />

          {/* Character Spans */}
          {activeStory.text.split('').map((char, index) => {
            const isTyped = index < userInput.length;
            const typedChar = userInput[index];
            const isCorrect = isTyped && typedChar === char;
            const isWrong = isTyped && typedChar !== char;

            let charClass = 'opacity-35 transition-colors';
            if (isCorrect) {
              charClass = 'text-[#00F5FF] text-glow font-bold opacity-100';
            } else if (isWrong) {
              charClass = 'bg-red-500/20 text-red-400 underline decoration-red-500 decoration-2 font-bold opacity-100';
            }

            return (
              <span
                key={index}
                ref={(el) => (charSpanRefs.current[index] = el)}
                className={`inline-block whitespace-pre ${charClass}`}
              >
                {char}
              </span>
            );
          })}
        </div>

        {/* Footer Hint */}
        <div className="mt-6 flex flex-wrap items-center justify-between text-xs text-white/50 pt-4 border-t border-white/10">
          <div className="flex items-center gap-4">
            <span>💡 Click box to focus</span>
            <span>⌨️ Press Tab to restart</span>
            {isFullscreen && <span>📺 Press Esc to exit theater view</span>}
          </div>
          <div className="font-mono">
            Progress: {Math.min(100, Math.round((userInput.length / activeStory.text.length) * 100))}% ({userInput.length}/{activeStory.text.length})
          </div>
        </div>
      </div>

      {/* ----------------------------------------------------------------------
         SCORECARD MODAL & OFFICIAL MASTERY CERTIFICATE TRIGGER
         ---------------------------------------------------------------------- */}
      {isFinished && (
        <div className="fixed inset-0 z-50 flex items-center justify-center bg-black/80 backdrop-blur-md p-4 animate-fadeIn">
          <div 
            className="relative w-full max-w-lg rounded-[32px] border border-[#00F5FF]/30 p-6 md:p-8 shadow-[0_0_60px_rgba(0,245,255,0.3)] backdrop-blur-3xl bg-[#090D16]"
          >
            <div className="text-center space-y-2">
              <div 
                className="mx-auto flex h-16 w-16 items-center justify-center rounded-2xl shadow-lg bg-[#00F5FF]/20 border border-[#00F5FF]/40"
              >
                <Trophy className="h-8 w-8 text-[#00F5FF]" />
              </div>
              <div className="text-sm font-black tracking-wide" style={{ color: speedTier.color }}>
                {speedTier.label}
              </div>
              <h2 className="text-2xl font-black tracking-tight text-white">Drill Completed!</h2>
              <p className="text-xs text-white/60">{activeStory.title}</p>
            </div>

            {/* Metric Highlights Grid */}
            <div className="my-6 grid grid-cols-2 sm:grid-cols-4 gap-3 font-mono">
              <div className="rounded-2xl border border-white/10 bg-white/5 p-3 text-center">
                <div className="text-xs text-white/50 uppercase">Net Speed</div>
                <div className="text-2xl font-black text-[#00F5FF]">{stats.wpm}</div>
                <div className="text-[10px] text-white/40">WPM</div>
              </div>

              <div className="rounded-2xl border border-white/10 bg-white/5 p-3 text-center">
                <div className="text-xs text-white/50 uppercase">Accuracy</div>
                <div className="text-2xl font-black text-emerald-400">{stats.accuracy}%</div>
                <div className="text-[10px] text-white/40">Accurate</div>
              </div>

              <div className="rounded-2xl border border-white/10 bg-white/5 p-3 text-center">
                <div className="text-xs text-white/50 uppercase">Raw WPM</div>
                <div className="text-2xl font-black text-white/80">{stats.rawWpm}</div>
                <div className="text-[10px] text-white/40">Gross</div>
              </div>

              <div className="rounded-2xl border border-white/10 bg-white/5 p-3 text-center">
                <div className="text-xs text-white/50 uppercase">Duration</div>
                <div className="text-2xl font-black text-white/80">{stats.elapsedSeconds.toFixed(1)}s</div>
                <div className="text-[10px] text-white/40">Time</div>
              </div>
            </div>

            {/* Target Key Hits if applicable */}
            {targetKeyMetrics.expected > 0 && (
              <div className="rounded-2xl border border-white/10 bg-white/5 p-3.5 mb-4 flex items-center justify-between text-xs">
                <div className="font-semibold text-white/80">Target Key '{selectedLetter}' Muscle Strikes:</div>
                <div className="text-sm font-bold text-amber-400 font-mono">
                  {targetKeyMetrics.hits} / {targetKeyMetrics.expected} ({Math.round((targetKeyMetrics.hits / targetKeyMetrics.expected) * 100)}%)
                </div>
              </div>
            )}

            {/* Mistakes Breakdown */}
            <div className="rounded-2xl border border-white/10 bg-white/5 p-3.5 mb-6">
              <div className="text-xs font-semibold uppercase tracking-wider text-white/60 mb-2">
                Mistake Analysis
              </div>
              {Object.keys(stats.mistakes).length === 0 ? (
                <div className="flex items-center gap-2 text-xs text-emerald-400">
                  <CheckCircle2 className="h-4 w-4" />
                  <span>Flawless Execution! 100% precision with zero mistake keystrokes.</span>
                </div>
              ) : (
                <div className="flex flex-wrap gap-1.5 font-mono text-xs">
                  {Object.entries(stats.mistakes)
                    .sort(([, a], [, b]) => b - a)
                    .slice(0, 6)
                    .map(([char, count]) => (
                      <span
                        key={char}
                        className="rounded-lg border border-red-500/30 bg-red-500/10 px-2 py-0.5 text-red-300"
                      >
                        '{char === ' ' ? 'Space' : char}': {count}x
                      </span>
                    ))}
                </div>
              )}
            </div>

            {/* Action Buttons: Save Session & Claim Certificate */}
            <div className="grid grid-cols-2 gap-2.5 mb-4">
              <button
                type="button"
                onClick={handleSaveSession}
                disabled={sessionSaved}
                className={`flex items-center justify-center gap-1.5 rounded-full py-2.5 text-xs font-bold border transition-all ${
                  sessionSaved 
                    ? 'bg-emerald-500/20 text-emerald-300 border-emerald-500/30' 
                    : 'bg-white/5 text-white/80 border-white/15 hover:bg-white/10'
                }`}
              >
                <BookmarkPlus className="h-4 w-4" />
                <span>{sessionSaved ? 'Session Saved!' : 'Save Session'}</span>
              </button>

              <button
                type="button"
                onClick={() => setIsCertOpen(true)}
                className="flex items-center justify-center gap-1.5 rounded-full py-2.5 text-xs font-black uppercase text-[#003940] bg-[#00F5FF] hover:brightness-110 shadow-[0_0_15px_rgba(0,245,255,0.4)] transition-all"
              >
                <Award className="h-4 w-4" />
                <span>Claim Certificate</span>
              </button>
            </div>

            {/* Secondary Controls */}
            <div className="grid grid-cols-3 gap-2">
              <button
                type="button"
                onClick={resetTyping}
                className="flex items-center justify-center gap-1 rounded-full border border-white/10 bg-white/5 py-2 text-xs font-semibold text-white/70 hover:text-white"
              >
                <RotateCcw className="h-3 w-3" /> Retry
              </button>

              <button
                type="button"
                onClick={() => {
                  setStoryIndex(prev => (prev + 1) % 5);
                  resetTyping();
                }}
                className="flex items-center justify-center gap-1 rounded-full border border-white/10 bg-white/5 py-2 text-xs font-semibold text-white/70 hover:text-white"
              >
                <span>Next Story</span>
                <ChevronRight className="h-3 w-3" />
              </button>

              <button
                type="button"
                onClick={copyResult}
                className="flex items-center justify-center gap-1 rounded-full border border-white/10 bg-white/5 py-2 text-xs font-semibold text-white/70 hover:text-white"
              >
                <Copy className="h-3 w-3" />
                {copiedSummary ? 'Copied!' : 'Copy'}
              </button>
            </div>
          </div>
        </div>
      )}

      {/* ----------------------------------------------------------------------
         OFFICIAL 1920x1080 MASTERY CERTIFICATE MODAL
         ---------------------------------------------------------------------- */}
      {isCertOpen && (
        <div className="fixed inset-0 z-50 flex items-center justify-center bg-black/85 backdrop-blur-xl p-4 animate-fadeIn">
          <div className="relative w-full max-w-4xl rounded-[32px] border border-[#00F5FF]/40 bg-[#090D16] p-6 shadow-[0_0_80px_rgba(0,245,255,0.3)] flex flex-col gap-4 max-h-[95vh] overflow-y-auto">
            <div className="flex items-center justify-between border-b border-white/10 pb-3">
              <div className="flex items-center gap-2">
                <Award className="w-6 h-6 text-[#00F5FF]" />
                <h3 className="text-lg font-black text-white">Official Mastery Certificate (1920x1080)</h3>
              </div>
              <button
                onClick={() => setIsCertOpen(false)}
                className="p-1.5 rounded-full hover:bg-white/10 text-white/60 hover:text-white"
              >
                <X className="w-5 h-5" />
              </button>
            </div>

            {/* Recipient Name Input */}
            <div className="flex items-center gap-3">
              <label className="text-xs font-bold text-white/70 shrink-0">Recipient Full Name:</label>
              <input
                type="text"
                value={recipientName}
                onChange={(e) => setRecipientName(e.target.value)}
                placeholder="Enter your name"
                className="flex-1 bg-black/40 border border-white/15 rounded-xl px-3 py-1.5 text-sm font-bold text-[#00F5FF] focus:outline-none focus:border-[#00F5FF]"
              />
            </div>

            {/* Certificate Preview Canvas */}
            <div className="w-full rounded-2xl overflow-hidden border border-white/20 shadow-2xl bg-black">
              <canvas
                ref={certCanvasRef}
                className="w-full h-auto aspect-[16/9] object-contain block"
              />
            </div>

            {/* Download and Print Actions */}
            <div className="flex items-center justify-end gap-3 pt-2">
              <button
                onClick={() => certCanvasRef.current && printCertificate(certCanvasRef.current)}
                className="flex items-center gap-1.5 px-4 py-2 rounded-full border border-white/15 bg-white/5 text-xs font-bold text-white hover:bg-white/10"
              >
                <Printer className="w-4 h-4" /> Print PDF
              </button>
              <button
                onClick={() => certCanvasRef.current && downloadCertificateAsPNG(certCanvasRef.current, `TypoLab_Certificate_${selectedLetter}.png`)}
                className="flex items-center gap-1.5 px-6 py-2 rounded-full bg-[#00F5FF] text-[#003940] text-xs font-black uppercase tracking-wider hover:brightness-110 shadow-[0_0_20px_rgba(0,245,255,0.4)]"
              >
                <Download className="w-4 h-4" /> Download HD Certificate (PNG)
              </button>
            </div>
          </div>
        </div>
      )}
    </div>
  );
};
