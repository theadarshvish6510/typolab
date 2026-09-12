import React, { useState, useRef, useEffect } from 'react';
import { 
  Copy, Check, Trash2, ArrowRightLeft, Sparkles, 
  Repeat, ArrowDownAZ, RefreshCw, KeyRound, QrCode, 
  Palette, PenTool, Timer, Play, Pause, RotateCcw, 
  Download, ShieldCheck, Eye, EyeOff, Hash, Layers, 
  Wifi, Mail, Globe, AlignLeft, Undo, Redo, Eraser, 
  Contrast, CheckCircle2, AlertCircle, Share2
} from 'lucide-react';
import { AppSettings, AppTab } from '../types';
import { 
  toTitleCase, toSentenceCase, toCamelCase, toPascalCase, 
  toSnakeCase, toKebabCase, toAlternatingCase, cleanMarkdown,
  toUpsideDown, toReverseText, toReverseWords, toReverseLines,
  repeatText, RepeatSeparator, sortAndCleanText, SortAction, 
  getTextStats, toRomanNumeral, fromRomanNumeral, RomanStepBreakdown,
  generateCustomPassword, generateDicewarePassphrase, calculatePasswordEntropy, 
  PasswordOptions, renderQRCodeToCanvas, getColorData, evaluateContrast, 
  CURATED_PALETTES, formatTimeMS, formatSeconds
} from '../utilities/textCraft';
import { keyboardSynth } from '../audio/keyboardSynth';

interface TextToolsProps {
  activeTab: AppTab;
  settings: AppSettings;
  onTabChange?: (tab: AppTab) => void;
}

export const TextTools: React.FC<TextToolsProps> = ({ activeTab, settings, onTabChange }) => {
  // Current active subtool inside TextTools
  const [currentTool, setCurrentTool] = useState<AppTab>(
    activeTab !== 'typolab' ? activeTab : 'case-converter'
  );

  useEffect(() => {
    if (activeTab !== 'typolab') {
      setCurrentTool(activeTab);
    }
  }, [activeTab]);

  // Copy helper with feedback
  const [copyFeedback, setCopyFeedback] = useState<string | null>(null);
  const copyToClipboard = (text: string, id: string) => {
    navigator.clipboard.writeText(text);
    setCopyFeedback(id);
    keyboardSynth.playKeySound('c');
    setTimeout(() => setCopyFeedback(null), 2000);
  };

  // ==========================================================================
  // 1. CASE CONVERTER STATE
  // ==========================================================================
  const [caseInput, setCaseInput] = useState<string>(
    'Adarsh\'s TextCraft & TypoLab Studio features Google Material 3 design and high-speed typing engines!'
  );
  const [caseOutput, setCaseOutput] = useState<string>('');

  const applyCase = (type: string) => {
    keyboardSynth.playKeySound(' ');
    switch (type) {
      case 'upper': setCaseOutput(caseInput.toUpperCase()); break;
      case 'lower': setCaseOutput(caseInput.toLowerCase()); break;
      case 'title': setCaseOutput(toTitleCase(caseInput)); break;
      case 'sentence': setCaseOutput(toSentenceCase(caseInput)); break;
      case 'camel': setCaseOutput(toCamelCase(caseInput)); break;
      case 'pascal': setCaseOutput(toPascalCase(caseInput)); break;
      case 'snake': setCaseOutput(toSnakeCase(caseInput)); break;
      case 'kebab': setCaseOutput(toKebabCase(caseInput)); break;
      case 'alternating': setCaseOutput(toAlternatingCase(caseInput)); break;
      case 'markdown': setCaseOutput(cleanMarkdown(caseInput)); break;
      default: setCaseOutput(caseInput);
    }
  };

  // ==========================================================================
  // 2. POWER REPEATER STATE
  // ==========================================================================
  const [repeatInput, setRepeatInput] = useState<string>('TypoLab Studio 🚀');
  const [repeatCount, setRepeatCount] = useState<number>(10);
  const [repeatSep, setRepeatSep] = useState<RepeatSeparator>('newline');
  const [customSep, setCustomSep] = useState<string>(' | ');

  const repeatedResult = repeatText(repeatInput, repeatCount, repeatSep, customSep);

  // ==========================================================================
  // 3. REVERSER & FLIPPER STATE
  // ==========================================================================
  const [reverseInput, setReverseInput] = useState<string>('TextCraft & TypoLab Studio 2026');
  const [reverseMode, setReverseMode] = useState<'chars' | 'words' | 'lines' | 'upsidedown'>('upsidedown');

  const reversedResult = (() => {
    switch (reverseMode) {
      case 'chars': return toReverseText(reverseInput);
      case 'words': return toReverseWords(reverseInput);
      case 'lines': return toReverseLines(reverseInput);
      case 'upsidedown': return toUpsideDown(reverseInput);
      default: return reverseInput;
    }
  })();

  // ==========================================================================
  // 4. SORTER & CLEANER STATE
  // ==========================================================================
  const [sortInput, setSortInput] = useState<string>(
    `केला (Banana)\nआम (Mango)\nApple\nDragonfruit\nअंगूर (Grape)\nCherry\nBanana\nElderberry\nApple\nFig\nसंतरा (Orange)`
  );
  const handleSort = (action: SortAction) => {
    keyboardSynth.playKeySound(' ');
    setSortInput(sortAndCleanText(sortInput, action));
  };
  const sortStats = getTextStats(sortInput);

  // ==========================================================================
  // 5. ROMAN NUMERAL MASTER STATE
  // ==========================================================================
  const [arabicInput, setArabicInput] = useState<string>('2026');
  const [romanOutput, setRomanOutput] = useState<{ roman: string; steps: RomanStepBreakdown[]; error?: string }>({
    roman: 'MMXXVI',
    steps: []
  });
  const [reverseRomanInput, setReverseRomanInput] = useState<string>('MMXXVI');
  const [arabicOutput, setArabicOutput] = useState<number>(2026);

  useEffect(() => {
    const num = parseInt(arabicInput, 10);
    if (!isNaN(num) && num > 0) {
      const res = toRomanNumeral(num);
      if (res.isValid) {
        setRomanOutput({ roman: res.roman, steps: res.steps });
      } else {
        setRomanOutput({ roman: '', steps: [], error: res.error });
      }
    } else {
      setRomanOutput({ roman: '', steps: [], error: 'Enter a valid positive number.' });
    }
  }, [arabicInput]);

  const handleRomanToArabic = (val: string) => {
    setReverseRomanInput(val);
    const res = fromRomanNumeral(val);
    if (res.isValid) {
      setArabicOutput(res.arabic);
    }
  };

  // ==========================================================================
  // 6. PASSWORD STUDIO STATE
  // ==========================================================================
  const [passLength, setPassLength] = useState<number>(18);
  const [useUpper, setUseUpper] = useState<boolean>(true);
  const [useLower, setUseLower] = useState<boolean>(true);
  const [useNumbers, setUseNumbers] = useState<boolean>(true);
  const [useSymbols, setUseSymbols] = useState<boolean>(true);
  const [excludeAmbiguous, setExcludeAmbiguous] = useState<boolean>(true);
  const [generatedPassword, setGeneratedPassword] = useState<string>('');
  const [passphraseWordCount, setPassphraseWordCount] = useState<number>(4);
  const [passphraseSep, setPassphraseSep] = useState<string>('-');
  const [generatedPassphrase, setGeneratedPassphrase] = useState<string>('');
  const [passwordMode, setPasswordMode] = useState<'random' | 'diceware'>('random');

  const regeneratePassword = () => {
    keyboardSynth.playKeySound(' ');
    const pwd = generateCustomPassword({
      length: passLength,
      useUpper,
      useLower,
      useNumbers,
      useSymbols,
      excludeAmbiguous
    });
    setGeneratedPassword(pwd);
  };

  const regeneratePassphrase = () => {
    keyboardSynth.playKeySound(' ');
    const phrase = generateDicewarePassphrase(passphraseWordCount, passphraseSep);
    setGeneratedPassphrase(phrase);
  };

  useEffect(() => {
    regeneratePassword();
    regeneratePassphrase();
  }, [passLength, useUpper, useLower, useNumbers, useSymbols, excludeAmbiguous, passphraseWordCount, passphraseSep]);

  const activePasswordText = passwordMode === 'random' ? generatedPassword : generatedPassphrase;
  const entropy = calculatePasswordEntropy(activePasswordText);

  // ==========================================================================
  // 7. UNIVERSAL QR CODE STUDIO STATE
  // ==========================================================================
  const [qrType, setQrType] = useState<'text' | 'url' | 'wifi' | 'email'>('url');
  const [qrRawText, setQrRawText] = useState<string>('https://github.com');
  const [qrFgColor, setQrFgColor] = useState<string>('#00F5FF');
  const [qrBgColor, setQrBgColor] = useState<string>('#090D16');
  // WiFi fields
  const [wifiSsid, setWifiSsid] = useState<string>('HomeStudio_5G');
  const [wifiPass, setWifiPass] = useState<string>('CyberShield2026');
  // Email fields
  const [emailTo, setEmailTo] = useState<string>('adarsh@typolab.studio');
  const [emailSubject, setEmailSubject] = useState<string>('TypoLab Studio Feedback');
  const [emailBody, setEmailBody] = useState<string>('Hello Adarsh, loving the M3 typing app!');

  const qrCanvasRef = useRef<HTMLCanvasElement | null>(null);

  const qrPayload = (() => {
    switch (qrType) {
      case 'url':
      case 'text':
        return qrRawText;
      case 'wifi':
        return `WIFI:S:${wifiSsid};T:WPA;P:${wifiPass};;`;
      case 'email':
        return `mailto:${emailTo}?subject=${encodeURIComponent(emailSubject)}&body=${encodeURIComponent(emailBody)}`;
      default:
        return qrRawText;
    }
  })();

  useEffect(() => {
    if (qrCanvasRef.current) {
      renderQRCodeToCanvas(qrCanvasRef.current, qrPayload, {
        size: 280,
        fgColor: qrFgColor,
        bgColor: qrBgColor,
        margin: 2
      });
    }
  }, [qrPayload, qrFgColor, qrBgColor]);

  const downloadQRCode = () => {
    if (!qrCanvasRef.current) return;
    const link = document.createElement('a');
    link.download = `TypoLab_QRCode_${Date.now()}.png`;
    link.href = qrCanvasRef.current.toDataURL('image/png');
    link.click();
    keyboardSynth.playKeySound('Enter');
  };

  // ==========================================================================
  // 8. PALETTE & COLOR STUDIO STATE
  // ==========================================================================
  const [activeColorHex, setActiveColorHex] = useState<string>('#00F5FF');
  const colorData = getColorData(activeColorHex);
  const contrastDark = evaluateContrast(activeColorHex, '#090D16');
  const contrastLight = evaluateContrast(activeColorHex, '#FFFFFF');

  // ==========================================================================
  // 9. DEVANAGARI INK CANVAS STATE
  // ==========================================================================
  const inkCanvasRef = useRef<HTMLCanvasElement | null>(null);
  const [isDrawing, setIsDrawing] = useState<boolean>(false);
  const [brushColor, setBrushColor] = useState<string>('#00F5FF');
  const [brushSize, setBrushSize] = useState<number>(4);
  const [isEraser, setIsEraser] = useState<boolean>(false);
  const [showGrid, setShowGrid] = useState<boolean>(true);
  const [undoStack, setUndoStack] = useState<ImageData[]>([]);
  const [redoStack, setRedoStack] = useState<ImageData[]>([]);

  // Init canvas
  useEffect(() => {
    const canvas = inkCanvasRef.current;
    if (!canvas) return;
    canvas.width = 720;
    canvas.height = 420;
    const ctx = canvas.getContext('2d');
    if (ctx) {
      ctx.fillStyle = settings.pureDark ? '#000000' : (settings.theme === 'dark' ? '#090D16' : '#FFFFFF');
      ctx.fillRect(0, 0, canvas.width, canvas.height);
      setUndoStack([ctx.getImageData(0, 0, canvas.width, canvas.height)]);
    }
  }, [settings.theme, settings.pureDark]);

  const pushCanvasState = () => {
    const canvas = inkCanvasRef.current;
    if (!canvas) return;
    const ctx = canvas.getContext('2d');
    if (!ctx) return;
    setUndoStack(prev => [...prev.slice(-20), ctx.getImageData(0, 0, canvas.width, canvas.height)]);
    setRedoStack([]);
  };

  const handleUndo = () => {
    if (undoStack.length <= 1) return;
    const canvas = inkCanvasRef.current;
    if (!canvas) return;
    const ctx = canvas.getContext('2d');
    if (!ctx) return;

    const current = undoStack[undoStack.length - 1];
    setRedoStack(prev => [...prev, current]);
    const previous = undoStack[undoStack.length - 2];
    ctx.putImageData(previous, 0, 0);
    setUndoStack(prev => prev.slice(0, -1));
    keyboardSynth.playKeySound('Backspace');
  };

  const handleRedo = () => {
    if (redoStack.length === 0) return;
    const canvas = inkCanvasRef.current;
    if (!canvas) return;
    const ctx = canvas.getContext('2d');
    if (!ctx) return;

    const next = redoStack[redoStack.length - 1];
    ctx.putImageData(next, 0, 0);
    setUndoStack(prev => [...prev, next]);
    setRedoStack(prev => prev.slice(0, -1));
    keyboardSynth.playKeySound(' ');
  };

  const clearInkCanvas = () => {
    const canvas = inkCanvasRef.current;
    if (!canvas) return;
    const ctx = canvas.getContext('2d');
    if (!ctx) return;
    pushCanvasState();
    ctx.fillStyle = settings.pureDark ? '#000000' : (settings.theme === 'dark' ? '#090D16' : '#FFFFFF');
    ctx.fillRect(0, 0, canvas.width, canvas.height);
    keyboardSynth.playKeySound('Enter');
  };

  const startDrawing = (e: React.MouseEvent<HTMLCanvasElement> | React.TouchEvent<HTMLCanvasElement>) => {
    const canvas = inkCanvasRef.current;
    if (!canvas) return;
    const ctx = canvas.getContext('2d');
    if (!ctx) return;

    pushCanvasState();
    setIsDrawing(true);

    const rect = canvas.getBoundingClientRect();
    const clientX = 'touches' in e ? e.touches[0].clientX : e.clientX;
    const clientY = 'touches' in e ? e.touches[0].clientY : e.clientY;
    const scaleX = canvas.width / rect.width;
    const scaleY = canvas.height / rect.height;
    const x = (clientX - rect.left) * scaleX;
    const y = (clientY - rect.top) * scaleY;

    ctx.beginPath();
    ctx.moveTo(x, y);
    ctx.strokeStyle = isEraser ? (settings.pureDark ? '#000000' : (settings.theme === 'dark' ? '#090D16' : '#FFFFFF')) : brushColor;
    ctx.lineWidth = brushSize;
    ctx.lineCap = 'round';
    ctx.lineJoin = 'round';
  };

  const draw = (e: React.MouseEvent<HTMLCanvasElement> | React.TouchEvent<HTMLCanvasElement>) => {
    if (!isDrawing) return;
    const canvas = inkCanvasRef.current;
    if (!canvas) return;
    const ctx = canvas.getContext('2d');
    if (!ctx) return;

    const rect = canvas.getBoundingClientRect();
    const clientX = 'touches' in e ? e.touches[0].clientX : e.clientX;
    const clientY = 'touches' in e ? e.touches[0].clientY : e.clientY;
    const scaleX = canvas.width / rect.width;
    const scaleY = canvas.height / rect.height;
    const x = (clientX - rect.left) * scaleX;
    const y = (clientY - rect.top) * scaleY;

    ctx.lineTo(x, y);
    ctx.stroke();
  };

  const stopDrawing = () => {
    setIsDrawing(false);
  };

  const downloadInkCanvas = () => {
    const canvas = inkCanvasRef.current;
    if (!canvas) return;
    const link = document.createElement('a');
    link.download = `Devanagari_InkPad_${Date.now()}.png`;
    link.href = canvas.toDataURL('image/png');
    link.click();
    keyboardSynth.playKeySound('Enter');
  };

  // ==========================================================================
  // 10. FOCUS STOPWATCH & POMODORO STATE
  // ==========================================================================
  const [timerMode, setTimerMode] = useState<'pomodoro' | 'stopwatch'>('pomodoro');
  // Pomodoro
  const [pomoPreset, setPomoPreset] = useState<25 | 50>(25);
  const [pomoPhase, setPomoPhase] = useState<'work' | 'rest'>('work');
  const [pomoSecondsRemaining, setPomoSecondsRemaining] = useState<number>(25 * 60);
  const [isPomoRunning, setIsPomoRunning] = useState<boolean>(false);
  // Stopwatch
  const [swTimeMs, setSwTimeMs] = useState<number>(0);
  const [isSwRunning, setIsSwRunning] = useState<boolean>(false);
  const [laps, setLaps] = useState<number[]>([]);

  // Pomodoro ticker
  useEffect(() => {
    let interval: any = null;
    if (isPomoRunning && pomoSecondsRemaining > 0) {
      interval = setInterval(() => {
        setPomoSecondsRemaining(prev => prev - 1);
      }, 1000);
    } else if (isPomoRunning && pomoSecondsRemaining === 0) {
      keyboardSynth.playPomodoroChime();
      if (pomoPhase === 'work') {
        setPomoPhase('rest');
        setPomoSecondsRemaining((pomoPreset === 25 ? 5 : 10) * 60);
      } else {
        setPomoPhase('work');
        setPomoSecondsRemaining(pomoPreset * 60);
      }
    }
    return () => clearInterval(interval);
  }, [isPomoRunning, pomoSecondsRemaining, pomoPhase, pomoPreset]);

  // Stopwatch ticker
  useEffect(() => {
    let animId: number;
    let lastTime = performance.now();

    const loop = (now: number) => {
      if (isSwRunning) {
        const delta = now - lastTime;
        setSwTimeMs(prev => prev + delta);
        lastTime = now;
        animId = requestAnimationFrame(loop);
      }
    };

    if (isSwRunning) {
      lastTime = performance.now();
      animId = requestAnimationFrame(loop);
    }
    return () => cancelAnimationFrame(animId);
  }, [isSwRunning]);

  const resetPomodoro = () => {
    setIsPomoRunning(false);
    setPomoPhase('work');
    setPomoSecondsRemaining(pomoPreset * 60);
    keyboardSynth.playKeySound('Backspace');
  };

  const togglePomodoro = () => {
    setIsPomoRunning(!isPomoRunning);
    keyboardSynth.playKeySound(' ');
  };

  const toggleStopwatch = () => {
    setIsSwRunning(!isSwRunning);
    keyboardSynth.playKeySound(' ');
  };

  const recordLap = () => {
    setLaps(prev => [swTimeMs, ...prev]);
    keyboardSynth.playKeySound('Enter');
  };

  const resetStopwatch = () => {
    setIsSwRunning(false);
    setSwTimeMs(0);
    setLaps([]);
    keyboardSynth.playKeySound('Backspace');
  };

  // All 10 subtool tabs definitions
  const SUB_TOOLS = [
    { id: 'case-converter' as AppTab, name: 'Case Converter', icon: ArrowRightLeft, desc: '10 case styles + Markdown' },
    { id: 'repeater' as AppTab, name: 'Text Repeater', icon: Repeat, desc: 'Up to 1,000x with custom delimiters' },
    { id: 'reverser' as AppTab, name: 'Reverser & Flip', icon: Sparkles, desc: 'Characters, words, 180° Unicode flip' },
    { id: 'sorter' as AppTab, name: 'Sorter & Clean', icon: ArrowDownAZ, desc: 'A-Z, length, deduplicate, Hindi collation' },
    { id: 'roman-converter' as AppTab, name: 'Roman Numerals', icon: Hash, desc: '1 to 3,999,999 with vinculum bars' },
    { id: 'password-tools' as AppTab, name: 'Password Studio', icon: KeyRound, desc: 'Entropy meter & Diceware passphrases' },
    { id: 'qr-generator' as AppTab, name: 'Universal QR', icon: QrCode, desc: 'Canvas generator for URL, WiFi, Mail' },
    { id: 'palette-generator' as AppTab, name: 'Palette Studio', icon: Palette, desc: 'HEX/RGB/HSL + WCAG 2.1 AA/AAA' },
    { id: 'canvas-pad' as AppTab, name: 'Devanagari Ink', icon: PenTool, desc: 'Stylus calligraphy pad with Hindi guidelines' },
    { id: 'focus-timer' as AppTab, name: 'Focus Stopwatch', icon: Timer, desc: 'Pomodoro & millisecond lap timer' },
  ];

  return (
    <div className="w-full flex flex-col gap-6 animate-fadeIn pb-12">
      {/* ----------------------------------------------------------------------
         SUBTOOL NAVIGATION PILLS (Material 3 Segmented Filter Chips)
         ---------------------------------------------------------------------- */}
      <div className="w-full flex items-center gap-2 overflow-x-auto no-scrollbar py-1 px-1">
        {SUB_TOOLS.map(tool => {
          const Icon = tool.icon;
          const isActive = currentTool === tool.id;
          return (
            <button
              key={tool.id}
              onClick={() => {
                setCurrentTool(tool.id);
                onTabChange?.(tool.id);
                keyboardSynth.playKeySound(' ');
              }}
              className={`flex items-center gap-2 px-4 py-2.5 rounded-full text-xs font-bold whitespace-nowrap transition-all duration-300 transform active:scale-95 ${
                isActive
                  ? 'bg-[#00F5FF] text-[#003940] shadow-[0_0_20px_rgba(0,245,255,0.4)] rounded-2xl'
                  : 'bg-white/5 hover:bg-white/10 text-white/80 border border-white/10 hover:border-[#00F5FF]/30'
              }`}
              style={{
                borderRadius: isActive ? '14px' : '9999px',
                transition: 'border-radius 0.25s cubic-bezier(0.34, 1.35, 0.64, 1), transform 0.2s ease, background 0.2s ease'
              }}
            >
              <Icon className="w-3.5 h-3.5" />
              <span>{tool.name}</span>
            </button>
          );
        })}
      </div>

      {/* ======================================================================
         1. CASE CONVERTER
         ====================================================================== */}
      {currentTool === 'case-converter' && (
        <div className="grid grid-cols-1 lg:grid-cols-2 gap-6">
          {/* Input Glass Card */}
          <div className="glass-card flex flex-col gap-4">
            <div className="flex items-center justify-between border-b border-white/10 pb-3">
              <span className="text-xs font-black uppercase tracking-wider text-[#00F5FF]">Source Text</span>
              <button 
                onClick={() => setCaseInput('')} 
                className="text-white/40 hover:text-red-400 p-1 transition-colors"
                title="Clear input"
              >
                <Trash2 className="w-4 h-4" />
              </button>
            </div>
            <textarea
              value={caseInput}
              onChange={(e) => setCaseInput(e.target.value)}
              placeholder="Paste or type text to convert case..."
              rows={8}
              className="w-full bg-black/20 border border-white/10 rounded-2xl p-4 text-sm font-mono text-white/90 placeholder-white/30 focus:outline-none focus:border-[#00F5FF] resize-none"
            />
            {/* Quick Action Chips */}
            <div className="flex flex-wrap gap-2 pt-2">
              {[
                { id: 'upper', label: 'UPPERCASE' },
                { id: 'lower', label: 'lowercase' },
                { id: 'title', label: 'Title Case' },
                { id: 'sentence', label: 'Sentence case' },
                { id: 'camel', label: 'camelCase' },
                { id: 'pascal', label: 'PascalCase' },
                { id: 'snake', label: 'snake_case' },
                { id: 'kebab', label: 'kebab-case' },
                { id: 'alternating', label: 'aLtErNaTiNg' },
                { id: 'markdown', label: 'Clean Markdown' },
              ].map(btn => (
                <button
                  key={btn.id}
                  onClick={() => applyCase(btn.id)}
                  className="px-3 py-1.5 rounded-full text-xs font-bold bg-white/5 hover:bg-[#00F5FF]/20 hover:text-[#00F5FF] border border-white/10 hover:border-[#00F5FF]/40 transition-all active:scale-95"
                  style={{
                    transition: 'border-radius 0.25s cubic-bezier(0.34, 1.35, 0.64, 1), transform 0.2s ease, background 0.2s ease'
                  }}
                  onMouseEnter={(e) => e.currentTarget.style.borderRadius = '12px'}
                  onMouseLeave={(e) => e.currentTarget.style.borderRadius = '9999px'}
                >
                  {btn.label}
                </button>
              ))}
            </div>
          </div>

          {/* Output Glass Card */}
          <div className="glass-card flex flex-col gap-4">
            <div className="flex items-center justify-between border-b border-white/10 pb-3">
              <span className="text-xs font-black uppercase tracking-wider text-[#00F5FF]">Converted Output</span>
              <button
                onClick={() => copyToClipboard(caseOutput || caseInput, 'case-out')}
                className="flex items-center gap-1.5 px-3 py-1 rounded-full text-xs font-bold bg-[#00F5FF]/10 text-[#00F5FF] border border-[#00F5FF]/30 hover:bg-[#00F5FF] hover:text-[#003940] transition-all"
              >
                {copyFeedback === 'case-out' ? <Check className="w-3.5 h-3.5" /> : <Copy className="w-3.5 h-3.5" />}
                <span>{copyFeedback === 'case-out' ? 'Copied!' : 'Copy'}</span>
              </button>
            </div>
            <textarea
              readOnly
              value={caseOutput || caseInput}
              rows={8}
              className="w-full bg-black/40 border border-white/10 rounded-2xl p-4 text-sm font-mono text-[#00F5FF] resize-none focus:outline-none"
            />
            <div className="flex items-center justify-between text-xs text-white/50 pt-2 font-mono">
              <span>Characters: {(caseOutput || caseInput).length}</span>
              <span>Words: {(caseOutput || caseInput).trim() ? (caseOutput || caseInput).trim().split(/\s+/).length : 0}</span>
            </div>
          </div>
        </div>
      )}

      {/* ======================================================================
         2. POWER TEXT REPEATER
         ====================================================================== */}
      {currentTool === 'repeater' && (
        <div className="grid grid-cols-1 lg:grid-cols-2 gap-6">
          <div className="glass-card flex flex-col gap-5">
            <h3 className="text-xs font-black uppercase tracking-wider text-[#00F5FF] border-b border-white/10 pb-3">
              Repeater Configuration
            </h3>
            <div className="flex flex-col gap-2">
              <label className="text-xs text-white/70 font-bold">Text to Repeat</label>
              <input
                type="text"
                value={repeatInput}
                onChange={(e) => setRepeatInput(e.target.value)}
                className="w-full bg-black/30 border border-white/10 rounded-2xl p-3 text-sm font-mono text-white focus:outline-none focus:border-[#00F5FF]"
              />
            </div>

            <div className="flex flex-col gap-2">
              <div className="flex justify-between text-xs font-bold">
                <span className="text-white/70">Repeat Count</span>
                <span className="text-[#00F5FF] font-mono">{repeatCount} times</span>
              </div>
              <input
                type="range"
                min="1"
                max="1000"
                value={repeatCount}
                onChange={(e) => setRepeatCount(parseInt(e.target.value, 10))}
                className="accent-[#00F5FF] cursor-pointer"
              />
            </div>

            <div className="flex flex-col gap-2">
              <label className="text-xs text-white/70 font-bold">Delimiter / Separator</label>
              <div className="grid grid-cols-3 gap-2">
                {[
                  { id: 'newline', label: 'Newline (\\n)' },
                  { id: 'space', label: 'Space' },
                  { id: 'comma', label: 'Comma (,)' },
                  { id: 'pipe', label: 'Pipe ( | )' },
                  { id: 'numbered', label: 'Numbered (1.)' },
                  { id: 'custom', label: 'Custom' },
                ].map(sep => (
                  <button
                    key={sep.id}
                    onClick={() => setRepeatSep(sep.id as RepeatSeparator)}
                    className={`px-2.5 py-1.5 rounded-full text-xs font-semibold border transition-all ${
                      repeatSep === sep.id
                        ? 'bg-[#00F5FF] text-[#003940] border-[#00F5FF]'
                        : 'bg-white/5 text-white/70 border-white/10 hover:border-[#00F5FF]/30'
                    }`}
                  >
                    {sep.label}
                  </button>
                ))}
              </div>
            </div>

            {repeatSep === 'custom' && (
              <div className="flex flex-col gap-2">
                <label className="text-xs text-white/70 font-bold">Custom Separator String</label>
                <input
                  type="text"
                  value={customSep}
                  onChange={(e) => setCustomSep(e.target.value)}
                  className="w-full bg-black/30 border border-white/10 rounded-2xl p-3 text-sm font-mono text-white focus:outline-none focus:border-[#00F5FF]"
                />
              </div>
            )}
          </div>

          <div className="glass-card flex flex-col gap-4">
            <div className="flex items-center justify-between border-b border-white/10 pb-3">
              <span className="text-xs font-black uppercase tracking-wider text-[#00F5FF]">Repeated Result</span>
              <button
                onClick={() => copyToClipboard(repeatedResult, 'repeat-out')}
                className="flex items-center gap-1.5 px-3 py-1 rounded-full text-xs font-bold bg-[#00F5FF]/10 text-[#00F5FF] border border-[#00F5FF]/30 hover:bg-[#00F5FF] hover:text-[#003940] transition-all"
              >
                {copyFeedback === 'repeat-out' ? <Check className="w-3.5 h-3.5" /> : <Copy className="w-3.5 h-3.5" />}
                <span>{copyFeedback === 'repeat-out' ? 'Copied!' : 'Copy'}</span>
              </button>
            </div>
            <textarea
              readOnly
              value={repeatedResult}
              rows={12}
              className="w-full bg-black/40 border border-white/10 rounded-2xl p-4 text-sm font-mono text-white/90 resize-none focus:outline-none"
            />
            <div className="text-xs text-white/50 font-mono">
              Total Length: {repeatedResult.length.toLocaleString()} characters
            </div>
          </div>
        </div>
      )}

      {/* ======================================================================
         3. REVERSER & FLIPPER
         ====================================================================== */}
      {currentTool === 'reverser' && (
        <div className="grid grid-cols-1 lg:grid-cols-2 gap-6">
          <div className="glass-card flex flex-col gap-4">
            <div className="flex items-center justify-between border-b border-white/10 pb-3">
              <span className="text-xs font-black uppercase tracking-wider text-[#00F5FF]">Input Text</span>
              <div className="flex gap-1.5">
                {[
                  { id: 'upsidedown', label: '180° Flip' },
                  { id: 'chars', label: 'Reverse Chars' },
                  { id: 'words', label: 'Reverse Words' },
                  { id: 'lines', label: 'Reverse Lines' },
                ].map(m => (
                  <button
                    key={m.id}
                    onClick={() => setReverseMode(m.id as any)}
                    className={`px-3 py-1 rounded-full text-xs font-bold border transition-all ${
                      reverseMode === m.id
                        ? 'bg-[#00F5FF] text-[#003940] border-[#00F5FF]'
                        : 'bg-white/5 text-white/70 border-white/10 hover:border-[#00F5FF]/30'
                    }`}
                  >
                    {m.label}
                  </button>
                ))}
              </div>
            </div>
            <textarea
              value={reverseInput}
              onChange={(e) => setReverseInput(e.target.value)}
              rows={8}
              placeholder="Enter text to reverse or flip upside-down..."
              className="w-full bg-black/20 border border-white/10 rounded-2xl p-4 text-sm font-mono text-white/90 focus:outline-none focus:border-[#00F5FF] resize-none"
            />
          </div>

          <div className="glass-card flex flex-col gap-4">
            <div className="flex items-center justify-between border-b border-white/10 pb-3">
              <span className="text-xs font-black uppercase tracking-wider text-[#00F5FF]">Flipped Output</span>
              <button
                onClick={() => copyToClipboard(reversedResult, 'rev-out')}
                className="flex items-center gap-1.5 px-3 py-1 rounded-full text-xs font-bold bg-[#00F5FF]/10 text-[#00F5FF] border border-[#00F5FF]/30 hover:bg-[#00F5FF] hover:text-[#003940] transition-all"
              >
                {copyFeedback === 'rev-out' ? <Check className="w-3.5 h-3.5" /> : <Copy className="w-3.5 h-3.5" />}
                <span>{copyFeedback === 'rev-out' ? 'Copied!' : 'Copy'}</span>
              </button>
            </div>
            <textarea
              readOnly
              value={reversedResult}
              rows={8}
              className="w-full bg-black/40 border border-white/10 rounded-2xl p-4 text-base font-mono text-[#00F5FF] resize-none focus:outline-none"
            />
          </div>
        </div>
      )}

      {/* ======================================================================
         4. ALPHABETICAL SORTER & CLEANER
         ====================================================================== */}
      {currentTool === 'sorter' && (
        <div className="glass-card flex flex-col gap-5">
          <div className="flex flex-wrap items-center justify-between gap-3 border-b border-white/10 pb-3">
            <div>
              <h3 className="text-xs font-black uppercase tracking-wider text-[#00F5FF]">Alphabetical Sorter & Cleaner</h3>
              <p className="text-xs text-white/50">Native collation for English and Devanagari text</p>
            </div>
            <div className="flex items-center gap-2">
              <button
                onClick={() => copyToClipboard(sortInput, 'sort-out')}
                className="flex items-center gap-1.5 px-3 py-1 rounded-full text-xs font-bold bg-[#00F5FF]/10 text-[#00F5FF] border border-[#00F5FF]/30 hover:bg-[#00F5FF] hover:text-[#003940] transition-all"
              >
                {copyFeedback === 'sort-out' ? <Check className="w-3.5 h-3.5" /> : <Copy className="w-3.5 h-3.5" />}
                <span>{copyFeedback === 'sort-out' ? 'Copied!' : 'Copy'}</span>
              </button>
              <button
                onClick={() => setSortInput('')}
                className="text-white/40 hover:text-red-400 p-1"
                title="Clear"
              >
                <Trash2 className="w-4 h-4" />
              </button>
            </div>
          </div>

          {/* Action Chips */}
          <div className="flex flex-wrap gap-2">
            {[
              { id: 'az', label: 'Sort A to Z' },
              { id: 'za', label: 'Sort Z to A' },
              { id: 'length-asc', label: 'Length Ascending' },
              { id: 'length-desc', label: 'Length Descending' },
              { id: 'dedup', label: 'Deduplicate Lines' },
              { id: 'strip-empty', label: 'Strip Empty Lines' },
              { id: 'trim', label: 'Trim Whitespace' },
            ].map(act => (
              <button
                key={act.id}
                onClick={() => handleSort(act.id as SortAction)}
                className="px-3.5 py-1.5 rounded-full text-xs font-bold bg-white/5 hover:bg-[#00F5FF]/20 hover:text-[#00F5FF] border border-white/10 hover:border-[#00F5FF]/30 transition-all active:scale-95"
              >
                {act.label}
              </button>
            ))}
          </div>

          <textarea
            value={sortInput}
            onChange={(e) => setSortInput(e.target.value)}
            rows={10}
            className="w-full bg-black/30 border border-white/10 rounded-2xl p-4 text-sm font-mono text-white/90 focus:outline-none focus:border-[#00F5FF] resize-none"
          />

          {/* Statistics Bar */}
          <div className="grid grid-cols-2 sm:grid-cols-5 gap-3 pt-2">
            <div className="bg-white/5 border border-white/10 rounded-xl p-2.5 text-center">
              <div className="text-[10px] text-white/50 uppercase font-bold">Characters</div>
              <div className="text-base font-black text-[#00F5FF]">{sortStats.characters}</div>
            </div>
            <div className="bg-white/5 border border-white/10 rounded-xl p-2.5 text-center">
              <div className="text-[10px] text-white/50 uppercase font-bold">No Spaces</div>
              <div className="text-base font-black text-white">{sortStats.charactersNoSpaces}</div>
            </div>
            <div className="bg-white/5 border border-white/10 rounded-xl p-2.5 text-center">
              <div className="text-[10px] text-white/50 uppercase font-bold">Words</div>
              <div className="text-base font-black text-white">{sortStats.words}</div>
            </div>
            <div className="bg-white/5 border border-white/10 rounded-xl p-2.5 text-center">
              <div className="text-[10px] text-white/50 uppercase font-bold">Lines</div>
              <div className="text-base font-black text-white">{sortStats.lines}</div>
            </div>
            <div className="bg-white/5 border border-white/10 rounded-xl p-2.5 text-center">
              <div className="text-[10px] text-white/50 uppercase font-bold">Paragraphs</div>
              <div className="text-base font-black text-white">{sortStats.paragraphs}</div>
            </div>
          </div>
        </div>
      )}

      {/* ======================================================================
         5. ROMAN NUMERAL MASTER
         ====================================================================== */}
      {currentTool === 'roman-converter' && (
        <div className="grid grid-cols-1 lg:grid-cols-2 gap-6">
          <div className="glass-card flex flex-col gap-4">
            <h3 className="text-xs font-black uppercase tracking-wider text-[#00F5FF] border-b border-white/10 pb-3">
              Arabic (1 to 3,999,999) ➔ Roman Numeral
            </h3>
            <div className="flex flex-col gap-2">
              <label className="text-xs text-white/70 font-bold">Enter Integer Number</label>
              <input
                type="number"
                min="1"
                max="3999999"
                value={arabicInput}
                onChange={(e) => setArabicInput(e.target.value)}
                className="w-full bg-black/30 border border-white/10 rounded-2xl p-3 text-lg font-mono text-white focus:outline-none focus:border-[#00F5FF]"
              />
            </div>

            <div className="bg-black/40 border border-white/10 rounded-2xl p-4 flex flex-col gap-2">
              <div className="flex justify-between items-center">
                <span className="text-xs text-white/50 font-bold uppercase">Roman Result</span>
                <button
                  onClick={() => copyToClipboard(romanOutput.roman, 'roman-out')}
                  className="text-xs text-[#00F5FF] font-bold hover:underline flex items-center gap-1"
                >
                  <Copy className="w-3 h-3" /> Copy
                </button>
              </div>
              <div className="text-2xl font-black font-mono text-[#00F5FF] break-all tracking-wide">
                {romanOutput.roman || (romanOutput.error ? <span className="text-red-400 text-sm">{romanOutput.error}</span> : '—')}
              </div>
            </div>

            {romanOutput.steps.length > 0 && (
              <div className="flex flex-col gap-2 pt-2">
                <span className="text-xs font-bold text-white/60">Step-by-Step Vinculum Breakdown</span>
                <div className="max-h-48 overflow-y-auto pr-1 flex flex-col gap-1.5 font-mono text-xs">
                  {romanOutput.steps.map((step, idx) => (
                    <div key={idx} className="bg-white/5 p-2 rounded-lg border border-white/5 flex justify-between">
                      <span className="text-[#00F5FF] font-bold">{step.numeral}</span>
                      <span className="text-white/60">{step.description}</span>
                    </div>
                  ))}
                </div>
              </div>
            )}
          </div>

          <div className="glass-card flex flex-col gap-4">
            <h3 className="text-xs font-black uppercase tracking-wider text-[#00F5FF] border-b border-white/10 pb-3">
              Roman Numeral ➔ Arabic Integer
            </h3>
            <div className="flex flex-col gap-2">
              <label className="text-xs text-white/70 font-bold">Enter Roman Numeral (e.g. M̅, CM, XLII)</label>
              <input
                type="text"
                value={reverseRomanInput}
                onChange={(e) => handleRomanToArabic(e.target.value)}
                className="w-full bg-black/30 border border-white/10 rounded-2xl p-3 text-lg font-mono text-[#00F5FF] focus:outline-none focus:border-[#00F5FF]"
              />
            </div>

            <div className="bg-black/40 border border-white/10 rounded-2xl p-4 flex flex-col gap-2">
              <span className="text-xs text-white/50 font-bold uppercase">Evaluated Value</span>
              <div className="text-3xl font-black font-mono text-white">
                {arabicOutput.toLocaleString()}
              </div>
            </div>

            <div className="bg-white/5 p-4 rounded-2xl border border-white/10 text-xs text-white/70 space-y-2">
              <div className="font-bold text-[#00F5FF]">Vinculum Bar Rule:</div>
              <p>A horizontal overline bar represents multiplication by 1,000. For example: V̅ = 5,000, X̅ = 10,000, L̅ = 50,000, C̅ = 100,000, D̅ = 500,000, M̅ = 1,000,000.</p>
            </div>
          </div>
        </div>
      )}

      {/* ======================================================================
         6. PASSWORD STUDIO
         ====================================================================== */}
      {currentTool === 'password-tools' && (
        <div className="grid grid-cols-1 lg:grid-cols-2 gap-6">
          <div className="glass-card flex flex-col gap-5">
            <div className="flex items-center justify-between border-b border-white/10 pb-3">
              <h3 className="text-xs font-black uppercase tracking-wider text-[#00F5FF]">Generator Settings</h3>
              <div className="flex gap-2">
                <button
                  onClick={() => setPasswordMode('random')}
                  className={`px-3 py-1 rounded-full text-xs font-bold border transition-all ${
                    passwordMode === 'random' ? 'bg-[#00F5FF] text-[#003940] border-[#00F5FF]' : 'bg-white/5 text-white/70 border-white/10'
                  }`}
                >
                  Custom Chars
                </button>
                <button
                  onClick={() => setPasswordMode('diceware')}
                  className={`px-3 py-1 rounded-full text-xs font-bold border transition-all ${
                    passwordMode === 'diceware' ? 'bg-[#00F5FF] text-[#003940] border-[#00F5FF]' : 'bg-white/5 text-white/70 border-white/10'
                  }`}
                >
                  Diceware Passphrase
                </button>
              </div>
            </div>

            {passwordMode === 'random' ? (
              <>
                <div className="flex flex-col gap-2">
                  <div className="flex justify-between text-xs font-bold">
                    <span className="text-white/70">Password Length</span>
                    <span className="text-[#00F5FF] font-mono">{passLength} characters</span>
                  </div>
                  <input
                    type="range"
                    min="6"
                    max="128"
                    value={passLength}
                    onChange={(e) => setPassLength(parseInt(e.target.value, 10))}
                    className="accent-[#00F5FF]"
                  />
                </div>

                <div className="grid grid-cols-2 gap-3 pt-2">
                  {[
                    { label: 'Uppercase (A-Z)', val: useUpper, set: setUseUpper },
                    { label: 'Lowercase (a-z)', val: useLower, set: setUseLower },
                    { label: 'Numbers (0-9)', val: useNumbers, set: setUseNumbers },
                    { label: 'Symbols (!@#$)', val: useSymbols, set: setUseSymbols },
                    { label: 'Exclude Ambiguous', val: excludeAmbiguous, set: setExcludeAmbiguous },
                  ].map((opt, i) => (
                    <label key={i} className="flex items-center gap-2 text-xs font-bold text-white/80 cursor-pointer">
                      <input
                        type="checkbox"
                        checked={opt.val}
                        onChange={(e) => opt.set(e.target.checked)}
                        className="accent-[#00F5FF] w-4 h-4 rounded"
                      />
                      <span>{opt.label}</span>
                    </label>
                  ))}
                </div>
              </>
            ) : (
              <div className="flex flex-col gap-4">
                <div className="flex flex-col gap-2">
                  <div className="flex justify-between text-xs font-bold">
                    <span className="text-white/70">Word Count</span>
                    <span className="text-[#00F5FF] font-mono">{passphraseWordCount} words</span>
                  </div>
                  <input
                    type="range"
                    min="3"
                    max="8"
                    value={passphraseWordCount}
                    onChange={(e) => setPassphraseWordCount(parseInt(e.target.value, 10))}
                    className="accent-[#00F5FF]"
                  />
                </div>
                <div className="flex flex-col gap-2">
                  <label className="text-xs text-white/70 font-bold">Word Delimiter</label>
                  <div className="flex gap-2">
                    {['-', '.', '_', ' '].map(sep => (
                      <button
                        key={sep}
                        onClick={() => setPassphraseSep(sep)}
                        className={`px-4 py-1.5 rounded-full text-xs font-mono font-bold border ${
                          passphraseSep === sep ? 'bg-[#00F5FF] text-[#003940] border-[#00F5FF]' : 'bg-white/5 border-white/10'
                        }`}
                      >
                        {sep === ' ' ? 'Space' : sep}
                      </button>
                    ))}
                  </div>
                </div>
              </div>
            )}

            <button
              onClick={passwordMode === 'random' ? regeneratePassword : regeneratePassphrase}
              className="mt-2 w-full py-2.5 rounded-full bg-[#00F5FF] text-[#003940] font-black text-xs uppercase tracking-wider flex items-center justify-center gap-2 hover:brightness-110 active:scale-98 transition-all"
            >
              <RefreshCw className="w-3.5 h-3.5" /> Generate Fresh Password
            </button>
          </div>

          <div className="glass-card flex flex-col gap-5">
            <div className="flex items-center justify-between border-b border-white/10 pb-3">
              <span className="text-xs font-black uppercase tracking-wider text-[#00F5FF]">Generated Password</span>
              <button
                onClick={() => copyToClipboard(activePasswordText, 'pwd-out')}
                className="flex items-center gap-1.5 px-3 py-1 rounded-full text-xs font-bold bg-[#00F5FF]/10 text-[#00F5FF] border border-[#00F5FF]/30 hover:bg-[#00F5FF] hover:text-[#003940] transition-all"
              >
                {copyFeedback === 'pwd-out' ? <Check className="w-3.5 h-3.5" /> : <Copy className="w-3.5 h-3.5" />}
                <span>{copyFeedback === 'pwd-out' ? 'Copied!' : 'Copy'}</span>
              </button>
            </div>

            <div className="p-4 rounded-2xl bg-black/40 border border-white/10 font-mono text-lg text-[#00F5FF] break-all select-all">
              {activePasswordText}
            </div>

            {/* Entropy Analysis Widget */}
            <div className="p-4 rounded-2xl bg-white/5 border border-white/10 flex flex-col gap-3">
              <div className="flex items-center justify-between text-xs font-bold">
                <span className="text-white/70">Cryptographic Bit Entropy</span>
                <span className={`font-mono px-2 py-0.5 rounded-md ${
                  entropy.strength === 'Very Strong' ? 'bg-emerald-500/20 text-emerald-400' :
                  entropy.strength === 'Strong' ? 'bg-cyan-500/20 text-cyan-400' :
                  entropy.strength === 'Moderate' ? 'bg-amber-500/20 text-amber-400' : 'bg-red-500/20 text-red-400'
                }`}>
                  {entropy.strength} ({entropy.bits} bits)
                </span>
              </div>

              {/* Progress Bar */}
              <div className="w-full h-2 bg-black/40 rounded-full overflow-hidden">
                <div 
                  className={`h-full transition-all duration-500 ${
                    entropy.bits >= 80 ? 'bg-emerald-400' :
                    entropy.bits >= 64 ? 'bg-cyan-400' :
                    entropy.bits >= 48 ? 'bg-amber-400' : 'bg-red-400'
                  }`}
                  style={{ width: `${Math.min(100, (entropy.bits / 100) * 100)}%` }}
                />
              </div>

              <div className="flex justify-between text-[11px] text-white/50 font-mono">
                <span>Pool Size: {entropy.poolSize} chars</span>
                <span>Crack Time: {entropy.crackTime}</span>
              </div>
            </div>
          </div>
        </div>
      )}

      {/* ======================================================================
         7. UNIVERSAL QR CODE STUDIO
         ====================================================================== */}
      {currentTool === 'qr-generator' && (
        <div className="grid grid-cols-1 lg:grid-cols-2 gap-6">
          <div className="glass-card flex flex-col gap-4">
            <h3 className="text-xs font-black uppercase tracking-wider text-[#00F5FF] border-b border-white/10 pb-3">
              QR Code Payload Type
            </h3>
            <div className="flex gap-2">
              {[
                { id: 'url', label: 'URL / Link', icon: Globe },
                { id: 'text', label: 'Plain Text', icon: AlignLeft },
                { id: 'wifi', label: 'WiFi Network', icon: Wifi },
                { id: 'email', label: 'Email Draft', icon: Mail },
              ].map(t => {
                const Icon = t.icon;
                return (
                  <button
                    key={t.id}
                    onClick={() => setQrType(t.id as any)}
                    className={`flex items-center gap-1.5 px-3 py-1.5 rounded-full text-xs font-bold border transition-all ${
                      qrType === t.id ? 'bg-[#00F5FF] text-[#003940] border-[#00F5FF]' : 'bg-white/5 text-white/70 border-white/10'
                    }`}
                  >
                    <Icon className="w-3.5 h-3.5" />
                    <span>{t.label}</span>
                  </button>
                );
              })}
            </div>

            {(qrType === 'url' || qrType === 'text') && (
              <div className="flex flex-col gap-2">
                <label className="text-xs text-white/70 font-bold">{qrType === 'url' ? 'Target URL' : 'Text Content'}</label>
                <textarea
                  value={qrRawText}
                  onChange={(e) => setQrRawText(e.target.value)}
                  rows={4}
                  className="w-full bg-black/30 border border-white/10 rounded-2xl p-3 text-sm font-mono text-white focus:outline-none focus:border-[#00F5FF] resize-none"
                />
              </div>
            )}

            {qrType === 'wifi' && (
              <div className="flex flex-col gap-3">
                <div className="flex flex-col gap-1">
                  <label className="text-xs text-white/70 font-bold">Network Name (SSID)</label>
                  <input
                    type="text"
                    value={wifiSsid}
                    onChange={(e) => setWifiSsid(e.target.value)}
                    className="w-full bg-black/30 border border-white/10 rounded-2xl p-3 text-sm font-mono text-white focus:outline-none focus:border-[#00F5FF]"
                  />
                </div>
                <div className="flex flex-col gap-1">
                  <label className="text-xs text-white/70 font-bold">WiFi Password</label>
                  <input
                    type="text"
                    value={wifiPass}
                    onChange={(e) => setWifiPass(e.target.value)}
                    className="w-full bg-black/30 border border-white/10 rounded-2xl p-3 text-sm font-mono text-white focus:outline-none focus:border-[#00F5FF]"
                  />
                </div>
              </div>
            )}

            {qrType === 'email' && (
              <div className="flex flex-col gap-3">
                <div className="flex flex-col gap-1">
                  <label className="text-xs text-white/70 font-bold">Recipient Email</label>
                  <input
                    type="email"
                    value={emailTo}
                    onChange={(e) => setEmailTo(e.target.value)}
                    className="w-full bg-black/30 border border-white/10 rounded-2xl p-2.5 text-sm font-mono text-white focus:outline-none focus:border-[#00F5FF]"
                  />
                </div>
                <div className="flex flex-col gap-1">
                  <label className="text-xs text-white/70 font-bold">Subject</label>
                  <input
                    type="text"
                    value={emailSubject}
                    onChange={(e) => setEmailSubject(e.target.value)}
                    className="w-full bg-black/30 border border-white/10 rounded-2xl p-2.5 text-sm font-mono text-white focus:outline-none focus:border-[#00F5FF]"
                  />
                </div>
              </div>
            )}

            {/* Colors picker */}
            <div className="grid grid-cols-2 gap-4 pt-2">
              <div className="flex flex-col gap-1">
                <label className="text-xs text-white/60 font-bold">QR Dots Color</label>
                <div className="flex items-center gap-2">
                  <input
                    type="color"
                    value={qrFgColor}
                    onChange={(e) => setQrFgColor(e.target.value)}
                    className="w-8 h-8 rounded-lg bg-transparent cursor-pointer"
                  />
                  <span className="text-xs font-mono text-[#00F5FF]">{qrFgColor}</span>
                </div>
              </div>
              <div className="flex flex-col gap-1">
                <label className="text-xs text-white/60 font-bold">Background Color</label>
                <div className="flex items-center gap-2">
                  <input
                    type="color"
                    value={qrBgColor}
                    onChange={(e) => setQrBgColor(e.target.value)}
                    className="w-8 h-8 rounded-lg bg-transparent cursor-pointer"
                  />
                  <span className="text-xs font-mono text-white/70">{qrBgColor}</span>
                </div>
              </div>
            </div>
          </div>

          {/* QR Canvas Output */}
          <div className="glass-card flex flex-col items-center justify-center gap-6 p-8">
            <div className="p-4 rounded-3xl bg-black/60 border border-white/15 shadow-[0_0_40px_rgba(0,245,255,0.2)]">
              <canvas ref={qrCanvasRef} className="rounded-2xl max-w-full" />
            </div>

            <button
              onClick={downloadQRCode}
              className="px-6 py-3 rounded-full bg-[#00F5FF] text-[#003940] font-black text-xs uppercase tracking-wider flex items-center gap-2 hover:brightness-110 shadow-[0_0_20px_rgba(0,245,255,0.4)] active:scale-95 transition-all"
            >
              <Download className="w-4 h-4" /> Download QR Code (PNG)
            </button>
          </div>
        </div>
      )}

      {/* ======================================================================
         8. PALETTE & COLOR STUDIO
         ====================================================================== */}
      {currentTool === 'palette-generator' && (
        <div className="grid grid-cols-1 lg:grid-cols-2 gap-6">
          <div className="glass-card flex flex-col gap-5">
            <h3 className="text-xs font-black uppercase tracking-wider text-[#00F5FF] border-b border-white/10 pb-3">
              Color Inspector & WCAG 2.1 Contrast
            </h3>
            <div className="flex items-center gap-4">
              <input
                type="color"
                value={activeColorHex}
                onChange={(e) => setActiveColorHex(e.target.value)}
                className="w-16 h-16 rounded-2xl cursor-pointer bg-transparent border border-white/20"
              />
              <div className="flex flex-col gap-1">
                <span className="text-xs text-white/50 font-bold uppercase">Active Color</span>
                <input
                  type="text"
                  value={activeColorHex}
                  onChange={(e) => setActiveColorHex(e.target.value)}
                  className="bg-black/30 border border-white/10 rounded-xl px-3 py-1.5 text-lg font-mono font-bold text-white focus:outline-none focus:border-[#00F5FF]"
                />
              </div>
            </div>

            {/* Color Model Values */}
            <div className="grid grid-cols-3 gap-3 font-mono text-xs">
              <div className="bg-white/5 p-3 rounded-xl border border-white/5">
                <div className="text-white/40 font-bold mb-1">RGB</div>
                <div className="text-white">{colorData.rgb.r}, {colorData.rgb.g}, {colorData.rgb.b}</div>
              </div>
              <div className="bg-white/5 p-3 rounded-xl border border-white/5">
                <div className="text-white/40 font-bold mb-1">HSL</div>
                <div className="text-white">{colorData.hsl.h}°, {colorData.hsl.s}%, {colorData.hsl.l}%</div>
              </div>
              <div className="bg-white/5 p-3 rounded-xl border border-white/5">
                <div className="text-white/40 font-bold mb-1">HSV</div>
                <div className="text-white">{colorData.hsv.h}°, {colorData.hsv.s}%, {colorData.hsv.v}%</div>
              </div>
            </div>

            {/* Contrast Checker Card */}
            <div className="bg-black/30 p-4 rounded-2xl border border-white/10 flex flex-col gap-3">
              <div className="flex items-center gap-2 text-xs font-bold text-[#00F5FF]">
                <Contrast className="w-4 h-4" /> WCAG 2.1 Accessibility Evaluation
              </div>
              <div className="grid grid-cols-2 gap-3 text-xs">
                <div className="bg-black/60 p-3 rounded-xl border border-white/10 flex flex-col gap-1">
                  <div className="text-white/50">On Dark (#090D16)</div>
                  <div className="text-lg font-bold text-[#00F5FF]">{contrastDark.ratio}:1</div>
                  <div className="flex gap-1 text-[10px] font-bold">
                    <span className={contrastDark.aaNormal ? 'text-emerald-400' : 'text-red-400'}>AA {contrastDark.aaNormal ? '✓' : '✗'}</span>
                    <span className={contrastDark.aaaNormal ? 'text-emerald-400' : 'text-red-400'}>AAA {contrastDark.aaaNormal ? '✓' : '✗'}</span>
                  </div>
                </div>
                <div className="bg-white p-3 rounded-xl border border-black/10 text-black flex flex-col gap-1">
                  <div className="text-black/50">On Light (#FFFFFF)</div>
                  <div className="text-lg font-bold text-black">{contrastLight.ratio}:1</div>
                  <div className="flex gap-1 text-[10px] font-bold">
                    <span className={contrastLight.aaNormal ? 'text-emerald-600' : 'text-red-600'}>AA {contrastLight.aaNormal ? '✓' : '✗'}</span>
                    <span className={contrastLight.aaaNormal ? 'text-emerald-600' : 'text-red-600'}>AAA {contrastLight.aaaNormal ? '✓' : '✗'}</span>
                  </div>
                </div>
              </div>
            </div>
          </div>

          {/* Curated Palettes */}
          <div className="glass-card flex flex-col gap-4">
            <h3 className="text-xs font-black uppercase tracking-wider text-[#00F5FF] border-b border-white/10 pb-3">
              Curated Material 3 Palettes
            </h3>
            <div className="flex flex-col gap-3">
              {CURATED_PALETTES.map((pal, idx) => (
                <div key={idx} className="bg-white/5 p-3.5 rounded-2xl border border-white/10 flex flex-col gap-2">
                  <div className="flex justify-between items-center text-xs">
                    <span className="font-bold text-white/90">{pal.name}</span>
                    <span className="text-white/40 text-[10px] uppercase font-bold">{pal.category}</span>
                  </div>
                  <div className="flex h-10 rounded-xl overflow-hidden border border-white/10 shadow-sm">
                    {pal.colors.map((c, cIdx) => (
                      <div
                        key={cIdx}
                        onClick={() => {
                          setActiveColorHex(c);
                          copyToClipboard(c, `color-${idx}-${cIdx}`);
                        }}
                        style={{ backgroundColor: c }}
                        className="flex-1 cursor-pointer hover:opacity-90 transition-opacity flex items-center justify-center group"
                        title={`Click to inspect & copy ${c}`}
                      >
                        <span className="text-[10px] font-mono font-bold opacity-0 group-hover:opacity-100 bg-black/70 px-1 rounded text-white">
                          {c}
                        </span>
                      </div>
                    ))}
                  </div>
                </div>
              ))}
            </div>
          </div>
        </div>
      )}

      {/* ======================================================================
         9. DEVANAGARI INK CANVAS
         ====================================================================== */}
      {currentTool === 'canvas-pad' && (
        <div className="glass-card flex flex-col gap-4">
          <div className="flex flex-wrap items-center justify-between gap-3 border-b border-white/10 pb-3">
            <div>
              <h3 className="text-xs font-black uppercase tracking-wider text-[#00F5FF]">Devanagari Ink Calligraphy Pad</h3>
              <p className="text-xs text-white/50">Practice Hindi aksharas, matras, and conjuncts with stroke overlay</p>
            </div>
            {/* Action Tools */}
            <div className="flex items-center gap-2">
              <button
                onClick={handleUndo}
                className="p-2 rounded-full bg-white/5 hover:bg-white/10 border border-white/10 text-white/70 hover:text-white"
                title="Undo"
              >
                <Undo className="w-4 h-4" />
              </button>
              <button
                onClick={handleRedo}
                className="p-2 rounded-full bg-white/5 hover:bg-white/10 border border-white/10 text-white/70 hover:text-white"
                title="Redo"
              >
                <Redo className="w-4 h-4" />
              </button>
              <button
                onClick={() => setIsEraser(!isEraser)}
                className={`flex items-center gap-1 px-3 py-1.5 rounded-full text-xs font-bold border transition-all ${
                  isEraser ? 'bg-red-500 text-white border-red-500' : 'bg-white/5 text-white/70 border-white/10'
                }`}
              >
                <Eraser className="w-3.5 h-3.5" /> Eraser
              </button>
              <button
                onClick={() => setShowGrid(!showGrid)}
                className={`flex items-center gap-1 px-3 py-1.5 rounded-full text-xs font-bold border transition-all ${
                  showGrid ? 'bg-[#00F5FF]/20 text-[#00F5FF] border-[#00F5FF]/40' : 'bg-white/5 text-white/70 border-white/10'
                }`}
              >
                Grid Lines
              </button>
              <button
                onClick={clearInkCanvas}
                className="p-2 rounded-full bg-white/5 hover:bg-red-500/20 text-white/40 hover:text-red-400 border border-white/10"
                title="Clear Canvas"
              >
                <Trash2 className="w-4 h-4" />
              </button>
              <button
                onClick={downloadInkCanvas}
                className="flex items-center gap-1.5 px-4 py-1.5 rounded-full bg-[#00F5FF] text-[#003940] text-xs font-black uppercase tracking-wider hover:brightness-110 shadow-[0_0_15px_rgba(0,245,255,0.3)] transition-all"
              >
                <Download className="w-3.5 h-3.5" /> Export PNG
              </button>
            </div>
          </div>

          {/* Color & Brush Controls */}
          <div className="flex flex-wrap items-center gap-4 py-1">
            <div className="flex items-center gap-2">
              <span className="text-xs font-bold text-white/60">Color:</span>
              {['#00F5FF', '#FF9933', '#10B981', '#F43F5E', '#FFFFFF', '#000000'].map(col => (
                <button
                  key={col}
                  onClick={() => {
                    setBrushColor(col);
                    setIsEraser(false);
                  }}
                  style={{ backgroundColor: col }}
                  className={`w-6 h-6 rounded-full border-2 transition-all ${
                    brushColor === col && !isEraser ? 'scale-110 border-white shadow-[0_0_10px_white]' : 'border-transparent opacity-80'
                  }`}
                />
              ))}
            </div>

            <div className="flex items-center gap-2">
              <span className="text-xs font-bold text-white/60">Size:</span>
              <input
                type="range"
                min="1"
                max="24"
                value={brushSize}
                onChange={(e) => setBrushSize(parseInt(e.target.value, 10))}
                className="w-24 accent-[#00F5FF]"
              />
              <span className="text-xs font-mono text-[#00F5FF]">{brushSize}px</span>
            </div>
          </div>

          {/* Canvas Wrapper with Hindi Guidelines */}
          <div className="relative w-full rounded-2xl overflow-hidden border border-white/15 bg-black/40 shadow-inner flex justify-center">
            {showGrid && (
              <div className="absolute inset-0 pointer-events-none flex flex-col justify-between py-12 px-6 z-10 opacity-30">
                <div className="w-full border-b border-dashed border-[#00F5FF]">
                  <span className="text-[10px] text-[#00F5FF] font-mono">शिरोरेखा (Top Baseline)</span>
                </div>
                <div className="w-full border-b border-dotted border-white/60">
                  <span className="text-[10px] text-white/60 font-mono">मध्य रेखा (Middle Line)</span>
                </div>
                <div className="w-full border-b border-dashed border-[#00F5FF]">
                  <span className="text-[10px] text-[#00F5FF] font-mono">पद रेखा (Base Line)</span>
                </div>
              </div>
            )}
            <canvas
              ref={inkCanvasRef}
              onMouseDown={startDrawing}
              onMouseMove={draw}
              onMouseUp={stopDrawing}
              onMouseLeave={stopDrawing}
              onTouchStart={startDrawing}
              onTouchMove={draw}
              onTouchEnd={stopDrawing}
              className="touch-none cursor-crosshair max-w-full"
            />
          </div>
        </div>
      )}

      {/* ======================================================================
         10. FOCUS STOPWATCH & POMODORO TIMER
         ====================================================================== */}
      {currentTool === 'focus-timer' && (
        <div className="grid grid-cols-1 lg:grid-cols-2 gap-6">
          {/* Pomodoro Timer */}
          <div className="glass-card flex flex-col items-center gap-6 text-center">
            <div className="w-full flex items-center justify-between border-b border-white/10 pb-3">
              <span className="text-xs font-black uppercase tracking-wider text-[#00F5FF]">Pomodoro Focus Timer</span>
              <div className="flex gap-1.5">
                <button
                  onClick={() => {
                    setPomoPreset(25);
                    setPomoSecondsRemaining(25 * 60);
                    setIsPomoRunning(false);
                  }}
                  className={`px-3 py-1 rounded-full text-xs font-bold border transition-all ${
                    pomoPreset === 25 ? 'bg-[#00F5FF] text-[#003940] border-[#00F5FF]' : 'bg-white/5 text-white/70 border-white/10'
                  }`}
                >
                  25 / 5 min
                </button>
                <button
                  onClick={() => {
                    setPomoPreset(50);
                    setPomoSecondsRemaining(50 * 60);
                    setIsPomoRunning(false);
                  }}
                  className={`px-3 py-1 rounded-full text-xs font-bold border transition-all ${
                    pomoPreset === 50 ? 'bg-[#00F5FF] text-[#003940] border-[#00F5FF]' : 'bg-white/5 text-white/70 border-white/10'
                  }`}
                >
                  50 / 10 min
                </button>
              </div>
            </div>

            {/* Circular Progress Ring */}
            <div className="relative w-56 h-56 flex items-center justify-center">
              <svg className="w-full h-full transform -rotate-90">
                <circle
                  cx="112"
                  cy="112"
                  r="96"
                  stroke="currentColor"
                  strokeWidth="8"
                  className="text-white/10"
                  fill="transparent"
                />
                <circle
                  cx="112"
                  cy="112"
                  r="96"
                  stroke="currentColor"
                  strokeWidth="8"
                  className={pomoPhase === 'work' ? 'text-[#00F5FF]' : 'text-emerald-400'}
                  fill="transparent"
                  strokeDasharray={2 * Math.PI * 96}
                  strokeDashoffset={2 * Math.PI * 96 * (1 - pomoSecondsRemaining / (pomoPreset * 60))}
                  strokeLinecap="round"
                  style={{ transition: 'stroke-dashoffset 1s linear' }}
                />
              </svg>
              <div className="absolute flex flex-col items-center">
                <span className="text-4xl font-black font-mono tracking-wider text-white">
                  {formatSeconds(pomoSecondsRemaining)}
                </span>
                <span className="text-xs uppercase font-bold text-[#00F5FF] mt-1 tracking-widest">
                  {pomoPhase === 'work' ? 'Work Interval' : 'Rest Break'}
                </span>
              </div>
            </div>

            {/* Control Buttons */}
            <div className="flex items-center gap-3">
              <button
                onClick={togglePomodoro}
                className="px-6 py-2.5 rounded-full bg-[#00F5FF] text-[#003940] font-black text-xs uppercase tracking-wider flex items-center gap-2 hover:brightness-110 shadow-[0_0_20px_rgba(0,245,255,0.4)] active:scale-95 transition-all"
              >
                {isPomoRunning ? <Pause className="w-4 h-4" /> : <Play className="w-4 h-4" />}
                <span>{isPomoRunning ? 'Pause' : 'Start Focus'}</span>
              </button>
              <button
                onClick={resetPomodoro}
                className="p-2.5 rounded-full bg-white/5 hover:bg-white/10 border border-white/10 text-white/70 hover:text-white"
                title="Reset"
              >
                <RotateCcw className="w-4 h-4" />
              </button>
            </div>
          </div>

          {/* Precision Stopwatch with Lap Recorder */}
          <div className="glass-card flex flex-col items-center gap-5 text-center">
            <div className="w-full flex items-center justify-between border-b border-white/10 pb-3">
              <span className="text-xs font-black uppercase tracking-wider text-[#00F5FF]">Millisecond Lap Stopwatch</span>
              <span className="text-xs font-mono text-white/50">{laps.length} Laps</span>
            </div>

            <div className="text-5xl font-black font-mono tracking-wider text-[#00F5FF] py-6 text-glow">
              {formatTimeMS(swTimeMs)}
            </div>

            <div className="flex items-center gap-3">
              <button
                onClick={toggleStopwatch}
                className="px-6 py-2.5 rounded-full bg-[#00F5FF] text-[#003940] font-black text-xs uppercase tracking-wider flex items-center gap-2 hover:brightness-110 shadow-[0_0_20px_rgba(0,245,255,0.4)] active:scale-95 transition-all"
              >
                {isSwRunning ? <Pause className="w-4 h-4" /> : <Play className="w-4 h-4" />}
                <span>{isSwRunning ? 'Pause' : 'Start'}</span>
              </button>
              <button
                onClick={recordLap}
                disabled={!isSwRunning}
                className="px-4 py-2.5 rounded-full bg-white/10 text-white font-bold text-xs uppercase hover:bg-white/15 disabled:opacity-30 border border-white/10 active:scale-95 transition-all"
              >
                Record Lap
              </button>
              <button
                onClick={resetStopwatch}
                className="p-2.5 rounded-full bg-white/5 hover:bg-white/10 border border-white/10 text-white/70 hover:text-white"
                title="Reset"
              >
                <RotateCcw className="w-4 h-4" />
              </button>
            </div>

            {/* Laps List */}
            {laps.length > 0 && (
              <div className="w-full max-h-40 overflow-y-auto pr-1 flex flex-col gap-1.5 pt-2 border-t border-white/10">
                {laps.map((lapMs, idx) => (
                  <div key={idx} className="flex justify-between items-center text-xs font-mono bg-white/5 p-2 rounded-lg border border-white/5">
                    <span className="text-white/50 font-bold">Lap #{laps.length - idx}</span>
                    <span className="text-[#00F5FF] font-bold">{formatTimeMS(lapMs)}</span>
                  </div>
                ))}
              </div>
            )}
          </div>
        </div>
      )}
    </div>
  );
};
