// ==========================================================================
// TypoLab Studio: Master Application Logic
// Complete Progressive Web App with 5 Ultra-Long Hyper-Density Stories per Key
// ==========================================================================

import { TypingStory } from './data/storyDatabase';
import { fetchOrPopulate15MarathonVariations, getAllStoryVariations, get15StoriesForKey, DEFAULT_CUSTOM_PRESETS } from './data/allStories';
import { DynamicWordEngine } from './data/dynamicWordEngine';
import { SessionHistoryManager, SessionRecord } from './sessionHistory';
import { renderMasteryCertificate, downloadCertificateAsPNG, printCertificate, generateVerificationId, CertificateData } from './certificateEngine';

// --- Audio Synthesizer Class (Cherry MX Mechanical Switches) ---
export class KeyboardSynthesizer {
  private ctx: AudioContext | null = null;
  public enabled: boolean = true;

  constructor() {
    this.initContext();
  }

  private initContext() {
    try {
      const AudioCtx = window.AudioContext || (window as unknown as { webkitAudioContext: typeof AudioContext }).webkitAudioContext;
      if (AudioCtx) {
        this.ctx = new AudioCtx();
      }
    } catch (e) {
      console.warn('Web Audio not supported:', e);
    }
  }

  private resume() {
    if (this.ctx && this.ctx.state === 'suspended') {
      this.ctx.resume();
    }
  }

  // Play mechanical key click (downstroke)
  public playKeyClick(char: string = 'a') {
    if (!this.enabled) return;
    this.resume();
    if (!this.ctx) return;

    const now = this.ctx.currentTime;

    // Pitch jitter based on character code
    const charCode = char.charCodeAt(0) || 65;
    const baseFreq = 420 + (charCode % 18) * 15;

    // Primary click pulse (Oscillator)
    const osc = this.ctx.createOscillator();
    const gain = this.ctx.createGain();

    osc.type = 'triangle';
    osc.frequency.setValueAtTime(baseFreq, now);
    osc.frequency.exponentialRampToValueAtTime(140, now + 0.04);

    gain.gain.setValueAtTime(0.28, now);
    gain.gain.exponentialRampToValueAtTime(0.001, now + 0.045);

    // Filtered tactile noise burst
    const noiseBuffer = this.ctx.createBuffer(1, Math.floor(this.ctx.sampleRate * 0.025), this.ctx.sampleRate);
    const output = noiseBuffer.getChannelData(0);
    for (let i = 0; i < output.length; i++) {
      output[i] = (Math.random() * 2 - 1) * 0.35;
    }

    const whiteNoise = this.ctx.createBufferSource();
    whiteNoise.buffer = noiseBuffer;

    const filter = this.ctx.createBiquadFilter();
    filter.type = 'bandpass';
    filter.frequency.setValueAtTime(2200, now);
    filter.Q.setValueAtTime(2.5, now);

    const noiseGain = this.ctx.createGain();
    noiseGain.gain.setValueAtTime(0.22, now);
    noiseGain.gain.exponentialRampToValueAtTime(0.001, now + 0.025);

    // Connect nodes
    osc.connect(gain);
    gain.connect(this.ctx.destination);

    whiteNoise.connect(filter);
    filter.connect(noiseGain);
    noiseGain.connect(this.ctx.destination);

    osc.start(now);
    whiteNoise.start(now);

    osc.stop(now + 0.05);
    whiteNoise.stop(now + 0.03);
  }

  // Deep spacebar thud
  public playSpacebar() {
    if (!this.enabled || !this.ctx) return;
    this.resume();
    const now = this.ctx.currentTime;

    const osc = this.ctx.createOscillator();
    const gain = this.ctx.createGain();

    osc.type = 'sine';
    osc.frequency.setValueAtTime(180, now);
    osc.frequency.exponentialRampToValueAtTime(55, now + 0.08);

    gain.gain.setValueAtTime(0.35, now);
    gain.gain.exponentialRampToValueAtTime(0.001, now + 0.08);

    osc.connect(gain);
    gain.connect(this.ctx.destination);

    osc.start(now);
    osc.stop(now + 0.09);
  }

  // Error tone (soft low buzz)
  public playError() {
    if (!this.enabled || !this.ctx) return;
    this.resume();
    const now = this.ctx.currentTime;

    const osc = this.ctx.createOscillator();
    const gain = this.ctx.createGain();

    osc.type = 'sawtooth';
    osc.frequency.setValueAtTime(120, now);
    osc.frequency.setValueAtTime(110, now + 0.05);

    gain.gain.setValueAtTime(0.18, now);
    gain.gain.exponentialRampToValueAtTime(0.001, now + 0.12);

    osc.connect(gain);
    gain.connect(this.ctx.destination);

    osc.start(now);
    osc.stop(now + 0.13);
  }
}

// --- Dynamic Canvas Favicon Generator ---
export function updateDynamicFavicon(accentColor: string = '#00F5FF', badgeText: string = 'A') {
  try {
    const canvas = document.createElement('canvas');
    canvas.width = 64;
    canvas.height = 64;
    const ctx = canvas.getContext('2d');
    if (!ctx) return;

    // Outer circle
    ctx.fillStyle = '#06090c';
    ctx.beginPath();
    ctx.arc(32, 32, 30, 0, Math.PI * 2);
    ctx.fill();

    // Glowing border ring
    ctx.strokeStyle = accentColor;
    ctx.lineWidth = 4;
    ctx.stroke();

    // Central letter/glyph
    ctx.fillStyle = accentColor;
    ctx.font = 'bold 30px sans-serif';
    ctx.textAlign = 'center';
    ctx.textBaseline = 'middle';
    ctx.fillText(badgeText.slice(0, 2), 32, 33);

    const faviconUrl = canvas.toDataURL('image/png');
    const faviconLink = document.getElementById('dynamicFavicon') as HTMLLinkElement;
    if (faviconLink) {
      faviconLink.href = faviconUrl;
    }
  } catch (e) {
    console.warn('Error rendering dynamic favicon:', e);
  }
}

// --- Global Application State ---
interface AppState {
  language: 'en' | 'hi';
  category: string;
  contentMode: 'dynamic' | 'curated';
  selectedLetter: string;
  dualLetter1: string;
  dualLetter2: string;
  storyIndex: number;
  currentStory: TypingStory;
  targetKeyHits: number;
  targetKeyExpected: number;
  userInput: string;
  startTime: number | null;
  timerInterval: number | null;
  totalKeystrokes: number;
  mistakesCount: number;
  mistakesMap: { [char: string]: number };
  lastCompletedSession: SessionRecord | null;
  currentVerificationId: string;
  recipientName: string;
  isFinished: boolean;
  isFullscreen: boolean;
  customUserText: string;
  wakeLock: WakeLockSentinel | null;
  settings: {
    mode: 'light' | 'dark';
    pureDark: boolean;
    ultraBlur: boolean;
    soundEnabled: boolean;
    wakeLockEnabled: boolean;
    accentColor: string;
    fontFamily: string;
    voiceGender: 'female' | 'male';
    voiceSpeed: number;
  };
}

const synth = new KeyboardSynthesizer();

const initialStories = getAllStoryVariations('en', 'alphabet', 'A');

const state: AppState = {
  language: 'en',
  category: 'alphabet',
  contentMode: 'dynamic',
  selectedLetter: 'A',
  dualLetter1: 'A',
  dualLetter2: 'S',
  storyIndex: 0,
  currentStory: initialStories[0],
  targetKeyHits: 0,
  targetKeyExpected: 0,
  userInput: '',
  startTime: null,
  timerInterval: null,
  totalKeystrokes: 0,
  mistakesCount: 0,
  mistakesMap: {},
  lastCompletedSession: null,
  currentVerificationId: generateVerificationId(),
  recipientName: 'Master Typist',
  isFinished: false,
  isFullscreen: false,
  customUserText: '',
  wakeLock: null,
  settings: {
    mode: 'light',
    pureDark: false,
    ultraBlur: true,
    soundEnabled: true,
    wakeLockEnabled: false,
    accentColor: '#00F5FF',
    fontFamily: "'Comic Neue', cursive, sans-serif",
    voiceGender: 'female',
    voiceSpeed: 1.0
  }
};

// --- Local Storage Management ---
function loadSettings() {
  try {
    const saved = localStorage.getItem('typolab_settings');
    if (saved) {
      const parsed = JSON.parse(saved);
      state.settings = { ...state.settings, ...parsed };
    }
    const savedCustom = localStorage.getItem('typolab_custom_text');
    if (savedCustom) {
      state.customUserText = savedCustom;
    }
  } catch (e) {
    console.warn('Could not read settings from localStorage', e);
  }
}

function saveSettings() {
  try {
    localStorage.setItem('typolab_settings', JSON.stringify(state.settings));
  } catch (e) {
    console.warn('Could not write settings to localStorage', e);
  }
}

// --- Apply Settings to DOM ---
function applySettings() {
  const html = document.documentElement;

  // Appearance Mode
  html.setAttribute('data-mode', state.settings.mode);
  html.setAttribute('data-puredark', state.settings.pureDark ? 'true' : 'false');
  html.setAttribute('data-blurmode', state.settings.ultraBlur ? 'true' : 'false');

  // Typography - Ensure Comic Neue by default
  const defaultFont = state.settings.fontFamily || "'Comic Neue', cursive, sans-serif";
  html.style.setProperty('--md-sys-font-family', defaultFont);
  html.style.setProperty('--font-english', defaultFont);

  // Accent Color
  html.style.setProperty('--md-sys-color-primary', state.settings.accentColor);
  html.style.setProperty('--md-sys-color-primary-container', `${state.settings.accentColor}22`);
  html.style.setProperty('--glass-border-glow', `${state.settings.accentColor}66`);

  synth.enabled = state.settings.soundEnabled;

  const soundIcon = document.getElementById('soundIcon');
  if (soundIcon) {
    soundIcon.textContent = state.settings.soundEnabled ? 'volume_up' : 'volume_off';
  }

  // Sync settings modal controls
  const modeRadios = document.getElementsByName('appearanceMode') as NodeListOf<HTMLInputElement>;
  modeRadios.forEach(r => {
    r.checked = r.value === state.settings.mode;
  });

  const pureDarkToggle = document.getElementById('pureDarkToggle') as HTMLInputElement;
  if (pureDarkToggle) pureDarkToggle.checked = state.settings.pureDark;

  const blurModeToggle = document.getElementById('blurModeToggle') as HTMLInputElement;
  if (blurModeToggle) blurModeToggle.checked = state.settings.ultraBlur;

  const soundFxToggle = document.getElementById('soundFxToggle') as HTMLInputElement;
  if (soundFxToggle) soundFxToggle.checked = state.settings.soundEnabled;

  const customAccentPicker = document.getElementById('customAccentPicker') as HTMLInputElement;
  if (customAccentPicker) customAccentPicker.value = state.settings.accentColor;

  const fontSelect = document.getElementById('fontSelect') as HTMLSelectElement;
  if (fontSelect) fontSelect.value = state.settings.fontFamily;

  const voiceGenderSelect = document.getElementById('voiceGenderSelect') as HTMLSelectElement;
  if (voiceGenderSelect) voiceGenderSelect.value = state.settings.voiceGender;

  const voiceSpeedSlider = document.getElementById('voiceSpeedSlider') as HTMLInputElement;
  const voiceSpeedDisplay = document.getElementById('voiceSpeedDisplay');
  if (voiceSpeedSlider) voiceSpeedSlider.value = state.settings.voiceSpeed.toString();
  if (voiceSpeedDisplay) voiceSpeedDisplay.textContent = state.settings.voiceSpeed.toFixed(1) + 'x';

  // Update dynamic favicon
  updateDynamicFavicon(state.settings.accentColor, state.currentStory.letter || (state.language === 'en' ? 'EN' : 'हि'));
}

// --- Toast Feedback Utility ---
export function showToast(msg: string) {
  const toast = document.getElementById('toast');
  if (!toast) return;
  toast.textContent = msg;
  toast.classList.add('show');
  setTimeout(() => toast.classList.remove('show'), 2400);
}

// --- Helper: Count target key occurrences in text ---
function countTargetKeyInText(text: string, key: string, category: string): number {
  if (!key) return 0;
  if (category === 'alphabet') {
    const lower = key.toLowerCase();
    const upper = key.toUpperCase();
    let c = 0;
    for (let i = 0; i < text.length; i++) {
      if (text[i] === lower || text[i] === upper) c++;
    }
    return c;
  }
  if (category === 'bigram') {
    const parts = key.split('+').map(p => p.trim().toUpperCase());
    let c = 0;
    for (let i = 0; i < text.length; i++) {
      const ch = text[i].toUpperCase();
      if (parts.includes(ch)) c++;
    }
    return c;
  }
  if (category === 'case') {
    // Count uppercase letters
    let c = 0;
    for (let i = 0; i < text.length; i++) {
      if (/[A-Z]/.test(text[i])) c++;
    }
    return c;
  }
  if (category === 'hard' || category === 'pro-hard') {
    // Count symbols/punctuation
    let c = 0;
    for (let i = 0; i < text.length; i++) {
      if (/[^a-zA-Z0-9\s]/.test(text[i])) c++;
    }
    return c;
  }

  // Exact character match for Hindi Vowels, Consonants, Matras
  let c = 0;
  for (let i = 0; i < text.length; i++) {
    if (text[i] === key) c++;
  }
  return c;
}

// Check if a typed char matches target key
function isTargetCharMatch(char: string, key: string, category: string): boolean {
  if (!char || !key) return false;
  if (category === 'alphabet') {
    return char.toLowerCase() === key.toLowerCase();
  }
  if (category === 'bigram') {
    const parts = key.split('+').map(p => p.trim().toUpperCase());
    return parts.includes(char.toUpperCase());
  }
  if (category === 'case') {
    return /[A-Z]/.test(char);
  }
  if (category === 'hard' || category === 'pro-hard') {
    return /[^a-zA-Z0-9\s]/.test(char);
  }
  return char === key;
}

// --- Typing Engine Core Logic ---

// --- Content Mode Switching (Dynamic Procedural vs 15X Curated Marathon Stories) ---
export function setContentGenerationMode(mode: 'dynamic' | 'curated') {
  state.contentMode = mode;

  const btnDynamic = document.getElementById('modeBtnDynamic');
  const btnCurated = document.getElementById('modeBtnCurated');
  const statusText = document.getElementById('modeStatusText');
  const story5Selector = document.getElementById('story5Selector');

  if (btnDynamic) btnDynamic.classList.toggle('active', mode === 'dynamic');
  if (btnCurated) btnCurated.classList.toggle('active', mode === 'curated');

  if (statusText) {
    statusText.textContent = mode === 'dynamic'
      ? 'Dynamic Generator Active • Infinite Procedural Typing'
      : '15X Marathon Stories Active • Ultra-Density Literary Drill';
  }

  if (story5Selector) {
    story5Selector.style.opacity = mode === 'curated' ? '1' : '0.4';
    story5Selector.style.pointerEvents = mode === 'curated' ? 'auto' : 'none';
  }

  loadActiveStory();
  showToast(mode === 'dynamic' ? '🔄 Switched to Dynamic Infinite Stream' : '📖 Switched to 15X Curated Marathon Stories');
}

// Get active 15 stories for current selection
function getActiveStoryList(): TypingStory[] {
  const currentKey = state.category === 'bigram' 
    ? `${state.dualLetter1}+${state.dualLetter2}` 
    : state.selectedLetter;
  return getAllStoryVariations(state.language, state.category, currentKey, state.customUserText);
}

// Select active story
function loadActiveStory() {
  const currentKey = state.category === 'bigram'
    ? `${state.dualLetter1}+${state.dualLetter2}`
    : state.selectedLetter;

  // Toggle Custom Mode Panel visibility
  const customBox = document.getElementById('customModeBox');
  if (customBox) {
    customBox.style.display = state.category === 'custom' ? 'flex' : 'none';
    if (state.category === 'custom') {
      const input = document.getElementById('customTextInput') as HTMLTextAreaElement;
      if (input && !input.value && state.customUserText) {
        input.value = state.customUserText;
      }
      onCustomTextInputChange();
    }
  }

  const list = getActiveStoryList();

  if (state.category === 'custom') {
    const idx = Math.max(0, Math.min(list.length - 1, state.storyIndex));
    state.currentStory = list[idx];
  } else if (state.contentMode === 'dynamic') {
    // Synthesize fresh dynamic stream
    const dynamicStreamText = DynamicWordEngine.generateDynamicStream(
      state.language,
      state.category,
      currentKey,
      8
    );
    state.currentStory = {
      id: `dynamic-${state.language}-${state.category}-${currentKey}`,
      category: state.category as any,
      letter: currentKey,
      language: state.language,
      title: `Dynamic Stream: Focus on '${currentKey}'`,
      subtitle: `Infinite Procedural Grammar Synthesis • Real-Time Stream`,
      text: dynamicStreamText
    };
  } else {
    // 15X Marathon Curated Stories
    const idx = Math.max(0, Math.min(list.length - 1, state.storyIndex));
    state.currentStory = list[idx];
  }

  // Update expected target count
  const targetKeyForCount = state.category === 'bigram'
    ? `${state.dualLetter1}+${state.dualLetter2}`
    : (state.currentStory.letter || state.selectedLetter);

  state.targetKeyExpected = countTargetKeyInText(
    state.currentStory.text,
    targetKeyForCount,
    state.category
  );
  state.targetKeyHits = 0;

  // Update DOM Title and Subtitles
  const catTag = document.getElementById('storyCategoryTag');
  const titleText = document.getElementById('storyTitleText');
  const subText = document.getElementById('storySubtitleText');

  if (catTag) catTag.textContent = state.currentStory.category.toUpperCase();
  if (titleText) titleText.textContent = state.currentStory.title;
  if (subText) subText.textContent = state.currentStory.subtitle;

  // Render Story Variation Selector (All 15 Marathon Chapters)
  const selectorContainer = document.getElementById('story5Selector');
  if (selectorContainer) {
    const totalVars = list.length || 15;
    let buttonsHtml = '';
    for (let i = 0; i < totalVars; i++) {
      const isActive = i === state.storyIndex;
      buttonsHtml += `<button class="pair-btn ${isActive ? 'active' : ''}" id="storyBtn${i}" onclick="selectStoryIndex(${i})" title="Marathon Chapter ${i + 1}/${totalVars}">Part ${i + 1}</button>`;
    }
    selectorContainer.innerHTML = buttonsHtml;
  }

  // Update Target Key Live Chip
  updateTargetKeyChip();

  // Update dynamic favicon
  const badge = state.currentStory.letter || (state.language === 'en' ? 'A' : 'क');
  updateDynamicFavicon(state.settings.accentColor, badge);

  // Set font class based on language
  const display = document.getElementById('typingDisplay');
  if (display) {
    if (state.language === 'hi') {
      display.classList.remove('english-font');
      display.classList.add('hindi-font');
    } else {
      display.classList.remove('hindi-font');
      display.classList.add('english-font');
    }
  }

  resetTypingState();
  renderTypingParagraph();
}

// Update Target Key Live Chip
function updateTargetKeyChip() {
  const chipVal = document.getElementById('targetHitValue');
  const targetLabel = state.category === 'bigram'
    ? `${state.dualLetter1}+${state.dualLetter2}`
    : (state.currentStory.letter || state.selectedLetter || 'Key');

  if (chipVal) {
    chipVal.textContent = `Target '${targetLabel}': ${state.targetKeyHits} / ${state.targetKeyExpected}`;
  }
}

// Word index mapping structures for Active Word HUD
interface WordInfo {
  index: number;
  word: string;
  startCharIndex: number;
  endCharIndex: number; // exclusive
}

let currentStoryWords: WordInfo[] = [];

// Rebuild word index mapping whenever story text changes
function parseStoryWords(targetText: string): WordInfo[] {
  const result: WordInfo[] = [];
  const words = targetText.split(' ');
  let charIdx = 0;
  for (let i = 0; i < words.length; i++) {
    const w = words[i];
    result.push({
      index: i,
      word: w,
      startCharIndex: charIdx,
      endCharIndex: charIdx + w.length
    });
    charIdx += w.length + 1; // + 1 for space
  }
  return result;
}

// Reset typing metrics
function resetTypingState() {
  state.userInput = '';
  state.startTime = null;
  state.totalKeystrokes = 0;
  state.mistakesCount = 0;
  state.mistakesMap = {};
  state.targetKeyHits = 0;
  state.isFinished = false;
  state.currentVerificationId = generateVerificationId();

  if (state.timerInterval) {
    clearInterval(state.timerInterval);
    state.timerInterval = null;
  }

  updateLiveScoreboard(0, 100, 0, 0, 0);
  updateTargetKeyChip();

  const hiddenInput = document.getElementById('hiddenTypingInput') as HTMLInputElement;
  if (hiddenInput) {
    hiddenInput.value = '';
  }

  const progress = document.getElementById('progressPercent');
  if (progress) progress.textContent = 'Progress: 0%';
}

// Render Story Paragraph with unified word containers for pristine English & Devanagari ligatures
function renderTypingParagraph() {
  const display = document.getElementById('typingDisplay');
  const wrap = document.getElementById('typingBoxWrap');
  if (!display) return;

  if (wrap) {
    wrap.scrollTop = 0;
  }

  const targetText = state.currentStory.text;
  currentStoryWords = parseStoryWords(targetText);

  let html = '';
  let charIndex = 0;

  for (let w = 0; w < currentStoryWords.length; w++) {
    const wordInfo = currentStoryWords[w];
    const word = wordInfo.word;
    html += `<span class="word-wrap" id="w-${w}">`;
    for (let c = 0; c < word.length; c++) {
      const char = word[c];
      html += `<span class="char-item char-pending" id="c-${charIndex}">${char}</span>`;
      charIndex++;
    }
    html += '</span>';

    // Space character
    if (w < currentStoryWords.length - 1) {
      html += `<span class="char-item char-space char-pending" id="c-${charIndex}"> </span>`;
      charIndex++;
    }
  }

  display.innerHTML = html;
  lastInputLength = 0;
  positionCaret(0);
  updateActiveWordHUD();
}

// Cached previous input length for high-performance localized DOM updates
let lastInputLength = 0;

// Update character states, Active Word HUD, and caret position on each keystroke
function updateCharacterHighlights(forceFull: boolean = false) {
  const targetText = state.currentStory.text;
  const input = state.userInput;

  if (forceFull || Math.abs(input.length - lastInputLength) > 4) {
    for (let i = 0; i < targetText.length; i++) {
      const span = document.getElementById(`c-${i}`);
      if (!span) continue;

      const isSpace = span.classList.contains('char-space');
      if (i < input.length) {
        const isCorrect = input[i] === targetText[i];
        span.className = isCorrect 
          ? (isSpace ? 'char-item char-space char-correct' : 'char-item char-correct')
          : (isSpace ? 'char-item char-space char-wrong' : 'char-item char-wrong');
      } else {
        span.className = isSpace ? 'char-item char-space char-pending' : 'char-item char-pending';
      }
    }
  } else {
    // Micro-update window around caret for 144 FPS smooth responsiveness
    const start = Math.max(0, Math.min(lastInputLength, input.length) - 2);
    const end = Math.min(targetText.length, Math.max(lastInputLength, input.length) + 2);
    for (let i = start; i < end; i++) {
      const span = document.getElementById(`c-${i}`);
      if (!span) continue;

      const isSpace = span.classList.contains('char-space');
      if (i < input.length) {
        const isCorrect = input[i] === targetText[i];
        span.className = isCorrect 
          ? (isSpace ? 'char-item char-space char-correct' : 'char-item char-correct')
          : (isSpace ? 'char-item char-space char-wrong' : 'char-item char-wrong');
      } else {
        span.className = isSpace ? 'char-item char-space char-pending' : 'char-item char-pending';
      }
    }
  }
  lastInputLength = input.length;

  positionCaret(input.length);
  updateActiveWordHUD();

  // Update progress percentage
  const progressPercent = Math.min(100, Math.round((input.length / targetText.length) * 100));
  const progressElem = document.getElementById('progressPercent');
  if (progressElem) {
    progressElem.textContent = `Progress: ${progressPercent}%`;
  }
}

// Update Active Word HUD & Guarantee Active Word Visibility
function updateActiveWordHUD() {
  const hudDisplay = document.getElementById('hudActiveWordDisplay');
  const hudUpcoming = document.getElementById('hudUpcomingWords');
  const hudCounter = document.getElementById('hudWordCounter');
  if (!hudDisplay || currentStoryWords.length === 0) return;

  const inputLen = state.userInput.length;
  
  // Find current word
  let activeWordIdx = 0;
  for (let i = 0; i < currentStoryWords.length; i++) {
    if (inputLen <= currentStoryWords[i].endCharIndex || i === currentStoryWords.length - 1) {
      activeWordIdx = i;
      break;
    }
  }

  const activeWordInfo = currentStoryWords[activeWordIdx];
  if (!activeWordInfo) return;

  const targetWord = activeWordInfo.word;
  const wordStart = activeWordInfo.startCharIndex;
  
  // Render character status for the active word in the HUD
  let wordLettersHtml = '';
  for (let c = 0; c < targetWord.length; c++) {
    const globalCharIdx = wordStart + c;
    const char = targetWord[c];
    if (globalCharIdx < inputLen) {
      const isCorrect = state.userInput[globalCharIdx] === char;
      wordLettersHtml += `<span class="${isCorrect ? 'hud-char-correct' : 'hud-char-wrong'}">${char}</span>`;
    } else if (globalCharIdx === inputLen) {
      wordLettersHtml += `<span class="hud-char-current">${char}</span>`;
    } else {
      wordLettersHtml += `<span class="hud-char-pending">${char}</span>`;
    }
  }
  hudDisplay.innerHTML = wordLettersHtml;

  // Render upcoming words in HUD
  if (hudUpcoming) {
    let upcomingHtml = '';
    const maxUpcoming = 3;
    for (let u = activeWordIdx + 1; u < Math.min(currentStoryWords.length, activeWordIdx + 1 + maxUpcoming); u++) {
      upcomingHtml += `<span class="upcoming-word-chip">${currentStoryWords[u].word}</span>`;
    }
    hudUpcoming.innerHTML = upcomingHtml || '<span class="upcoming-word-chip" style="opacity:0.4;">(Passage Complete)</span>';
  }

  // Update Word Counter
  if (hudCounter) {
    hudCounter.textContent = `Word ${activeWordIdx + 1} / ${currentStoryWords.length}`;
  }

  // Update .word-active and .word-completed classes on the paragraph word elements
  const allWordSpans = document.querySelectorAll('.word-wrap');
  allWordSpans.forEach((span, idx) => {
    if (idx === activeWordIdx) {
      span.classList.add('word-active');
      span.classList.remove('word-completed');
    } else if (idx < activeWordIdx) {
      span.classList.remove('word-active');
      span.classList.add('word-completed');
    } else {
      span.classList.remove('word-active');
      span.classList.remove('word-completed');
    }
  });

  // Auto-scroll typing box to keep the active word centered vertically in the 3-line view
  const activeWordSpan = document.getElementById(`w-${activeWordIdx}`);
  const wrap = document.getElementById('typingBoxWrap');
  if (activeWordSpan && wrap) {
    const offsetTop = activeWordSpan.offsetTop;
    // Keep first line locked at top (offsetTop < 70px)
    const idealScrollTop = offsetTop > 70 ? Math.max(0, offsetTop - 53) : 0;
    if (Math.abs(wrap.scrollTop - idealScrollTop) > 10) {
      wrap.scrollTo({
        top: idealScrollTop,
        behavior: 'smooth'
      });
    }
  }
}

// Position the glowing caret cursor
function positionCaret(index: number) {
  const caret = document.getElementById('liveCaret');
  const targetSpan = document.getElementById(`c-${index}`);
  const display = document.getElementById('typingDisplay');

  if (!caret || !display) return;

  if (targetSpan) {
    caret.style.display = 'block';
    caret.style.left = `${targetSpan.offsetLeft}px`;
    caret.style.top = `${targetSpan.offsetTop + 4}px`;
    caret.style.height = `${Math.max(22, targetSpan.offsetHeight - 8)}px`;
  } else if (index === 0) {
    const firstSpan = document.getElementById('c-0');
    if (firstSpan) {
      caret.style.display = 'block';
      caret.style.left = `${firstSpan.offsetLeft}px`;
      caret.style.top = `${firstSpan.offsetTop + 4}px`;
      caret.style.height = `${Math.max(22, firstSpan.offsetHeight - 8)}px`;
    } else {
      caret.style.display = 'block';
      caret.style.left = '4px';
      caret.style.top = '6px';
      caret.style.height = '28px';
    }
  } else if (index >= state.currentStory.text.length) {
    // Caret at end
    const lastSpan = document.getElementById(`c-${state.currentStory.text.length - 1}`);
    if (lastSpan) {
      caret.style.display = 'block';
      caret.style.left = `${lastSpan.offsetLeft + lastSpan.offsetWidth}px`;
      caret.style.top = `${lastSpan.offsetTop + 4}px`;
      caret.style.height = `${Math.max(22, lastSpan.offsetHeight - 8)}px`;
    }
  }
}

// Calculate and render live stats
function updateLiveScoreboard(wpm: number, accuracy: number, cpm: number, errors: number, seconds: number) {
  const wpmElem = document.getElementById('wpmValue');
  const accElem = document.getElementById('accValue');
  const cpmElem = document.getElementById('cpmValue');
  const errElem = document.getElementById('errValue');
  const timerElem = document.getElementById('timerValue');

  if (wpmElem) wpmElem.textContent = `${Math.round(wpm)} WPM`;
  if (accElem) accElem.textContent = `${Math.round(accuracy)}%`;
  if (cpmElem) cpmElem.textContent = `${Math.round(cpm)} CPM`;
  if (errElem) errElem.textContent = `${errors}`;
  if (timerElem) timerElem.textContent = `${seconds}s`;
}

// Core Input Handler
function handleInput(e: Event) {
  if (state.isFinished) return;

  const inputElem = e.target as HTMLInputElement;
  const newInput = inputElem.value;
  const targetText = state.currentStory.text;

  // Start timer on first keystroke
  if (!state.startTime && newInput.length > 0) {
    state.startTime = Date.now();
    state.timerInterval = window.setInterval(tickTimer, 250);
  }

  // Audio & Error feedback
  if (newInput.length > state.userInput.length) {
    state.totalKeystrokes++;
    const typedChar = newInput[newInput.length - 1];
    const expectedChar = targetText[newInput.length - 1];

    // Check target hit
    const targetKey = state.category === 'bigram' 
      ? `${state.dualLetter1}+${state.dualLetter2}` 
      : (state.currentStory.letter || state.selectedLetter);

    if (isTargetCharMatch(typedChar, targetKey, state.category)) {
      if (typedChar === expectedChar) {
        state.targetKeyHits++;
        updateTargetKeyChip();
      }
    }

    if (typedChar === ' ') {
      synth.playSpacebar();
    } else {
      synth.playKeyClick(typedChar);
    }

    if (typedChar !== expectedChar) {
      state.mistakesCount++;
      state.mistakesMap[expectedChar] = (state.mistakesMap[expectedChar] || 0) + 1;
      synth.playError();
      const wrap = document.getElementById('typingBoxWrap');
      if (wrap) {
        wrap.classList.add('shake-error');
        setTimeout(() => wrap.classList.remove('shake-error'), 250);
      }
    }
  }

  state.userInput = newInput;
  updateCharacterHighlights();

// Dynamic Infinite Stream: Seamlessly append new procedural sentences as user approaches end
  if (state.contentMode === 'dynamic' && state.category !== 'custom') {
    if (state.currentStory.text.length - state.userInput.length < 150) {
      const currentKey = state.category === 'bigram' 
        ? `${state.dualLetter1}+${state.dualLetter2}` 
        : state.selectedLetter;
      
      const prevWordCount = currentStoryWords.length;
      const additionalSentence = ' ' + DynamicWordEngine.generateDynamicStream(
        state.language,
        state.category,
        currentKey,
        3
      );

      state.currentStory.text += additionalSentence;
      currentStoryWords = parseStoryWords(state.currentStory.text);

      const addedExpected = countTargetKeyInText(additionalSentence, currentKey, state.category);
      state.targetKeyExpected += addedExpected;
      updateTargetKeyChip();

      // Append word spans to DOM without clearing existing spans
      const display = document.getElementById('typingDisplay');
      if (display) {
        let chunkHtml = '';
        for (let w = prevWordCount; w < currentStoryWords.length; w++) {
          const wordInfo = currentStoryWords[w];
          chunkHtml += `<span class="char-item char-space char-pending" id="c-${wordInfo.startCharIndex - 1}"> </span>`;
          chunkHtml += `<span class="word-wrap" id="w-${w}">`;
          for (let c = 0; c < wordInfo.word.length; c++) {
            const char = wordInfo.word[c];
            chunkHtml += `<span class="char-item char-pending" id="c-${wordInfo.startCharIndex + c}">${char}</span>`;
          }
          chunkHtml += '</span>';
        }
        display.insertAdjacentHTML('beforeend', chunkHtml);
      }
    }
  } else {
    // Curated 15X Marathon & Custom Mode: Completion Check
    if (state.userInput.length >= targetText.length) {
      finishLesson();
    }
  }
}

function tickTimer() {
  if (!state.startTime || state.isFinished) return;

  const elapsedSec = Math.max(1, (Date.now() - state.startTime) / 1000);
  const charsTyped = state.userInput.length;
  const minutes = elapsedSec / 60;

  // Standard calculation: 5 characters per word
  const wordsTyped = charsTyped / 5;
  const rawWpm = wordsTyped / minutes;
  const cpm = (charsTyped / elapsedSec) * 60;

  // Accuracy
  const correctCount = charsTyped - state.mistakesCount;
  const accuracy = charsTyped > 0 ? Math.max(0, Math.min(100, (correctCount / charsTyped) * 100)) : 100;
  const netWpm = Math.max(0, rawWpm * (accuracy / 100));

  updateLiveScoreboard(netWpm, accuracy, cpm, state.mistakesCount, Math.floor(elapsedSec));
}

function finishLesson() {
  state.isFinished = true;
  if (state.timerInterval) {
    clearInterval(state.timerInterval);
    state.timerInterval = null;
  }

  const elapsedSec = state.startTime ? Math.max(1, (Date.now() - state.startTime) / 1000) : 1;
  const charsTyped = state.userInput.length;
  const minutes = elapsedSec / 60;
  const wordsTyped = charsTyped / 5;
  const rawWpm = Math.round(wordsTyped / minutes);
  const correctCount = charsTyped - state.mistakesCount;
  const accuracy = charsTyped > 0 ? Math.max(0, Math.min(100, Math.round((correctCount / charsTyped) * 100))) : 100;
  const netWpm = Math.max(0, Math.round(rawWpm * (accuracy / 100)));
  const cpm = Math.round((charsTyped / elapsedSec) * 60);

  // Show scorecard modal
  const modal = document.getElementById('scorecardModal');
  const badge = document.getElementById('modalTierBadge');
  const title = document.getElementById('modalLessonTitle');
  const sub = document.getElementById('modalLessonSubtitle');
  const netWpmElem = document.getElementById('modalNetWpm');
  const accElem = document.getElementById('modalAccuracy');
  const accRing = document.getElementById('modalAccuracyRing');
  const rawWpmElem = document.getElementById('modalRawWpm');
  const cpmElem = document.getElementById('modalCpm');
  const timeElem = document.getElementById('modalTime');
  const targetHitsElem = document.getElementById('modalTargetHits');
  const targetAccElem = document.getElementById('modalTargetAcc');
  const mistakeTags = document.getElementById('modalMistakeTags');

  let tier = 'Legendary Typist ⚡';
  if (netWpm >= 100) tier = 'Grandmaster Typist 👑';
  else if (netWpm >= 70) tier = 'Master Typist 🚀';
  else if (netWpm >= 45) tier = 'Skilled Artisan 🌟';
  else if (netWpm >= 25) tier = 'Adept Typist ⚡';
  else tier = 'Novice Scribe ✍️';

  const list = getActiveStoryList();
  const totalStories = list.length || 15;

  if (badge) badge.textContent = tier;
  if (title) title.textContent = state.currentStory.title;
  if (sub) sub.textContent = `${state.language === 'en' ? 'English' : 'हिन्दी'} • ${state.currentStory.category.toUpperCase()} • Part ${state.storyIndex + 1}/${totalStories}`;
  if (netWpmElem) netWpmElem.textContent = netWpm.toString();
  if (accElem) accElem.textContent = `${accuracy}%`;
  if (accRing) {
    const offset = 289 - (289 * accuracy) / 100;
    accRing.style.strokeDashoffset = offset.toString();
  }
  if (rawWpmElem) rawWpmElem.textContent = rawWpm.toString();
  if (cpmElem) cpmElem.textContent = `${cpm} CPM`;
  if (timeElem) timeElem.textContent = `${Math.round(elapsedSec)}s`;

  // Target Key Accuracy
  const targetKeyAcc = state.targetKeyExpected > 0 ? Math.round((state.targetKeyHits / state.targetKeyExpected) * 100) : 100;
  if (targetHitsElem) targetHitsElem.textContent = `${state.targetKeyHits} / ${state.targetKeyExpected}`;
  if (targetAccElem) targetAccElem.textContent = `${targetKeyAcc}%`;

  // Detailed Mistakes Breakdown
  if (mistakeTags) {
    if (state.mistakesCount === 0) {
      mistakeTags.innerHTML = '<span class="chip-preset active" style="color:var(--md-sys-color-success); border-color:var(--md-sys-color-success); font-size:12px; font-weight:700;">🎉 Flawless Execution! Zero keystroke errors recorded.</span>';
    } else {
      const mistakeEntries = Object.entries(state.mistakesMap)
        .sort((a, b) => b[1] - a[1])
        .slice(0, 6);
      
      let html = `<div style="display:flex; align-items:center; gap:6px; flex-wrap:wrap;">`;
      html += `<span style="font-size:12px; color:var(--md-sys-color-error); font-weight:700; margin-right:4px;">Total Mistakes: ${state.mistakesCount}</span>`;
      for (const [char, count] of mistakeEntries) {
        const displayChar = char === ' ' ? 'Space' : char;
        html += `<span class="chip-preset" style="color:var(--md-sys-color-error); border-color:rgba(239,68,68,0.4); background:rgba(239,68,68,0.1); font-size:11px; font-weight:800; padding:2px 8px;">'${displayChar}' × ${count}</span>`;
      }
      html += `</div>`;
      mistakeTags.innerHTML = html;
    }
  }

  // Create session record for History & Certificate
  const targetKeyLabel = state.category === 'bigram'
    ? `${state.dualLetter1}+${state.dualLetter2}`
    : (state.currentStory.letter || state.selectedLetter || 'General');

  state.lastCompletedSession = {
    id: 'sess_' + Date.now(),
    timestamp: Date.now(),
    dateFormatted: new Date().toLocaleDateString(undefined, {
      month: 'short',
      day: 'numeric',
      year: 'numeric',
      hour: '2-digit',
      minute: '2-digit'
    }),
    language: state.language,
    category: state.category,
    targetKey: targetKeyLabel,
    storyTitle: state.currentStory.title,
    netWpm,
    rawWpm,
    accuracy,
    cpm,
    totalKeystrokes: charsTyped,
    mistakesCount: state.mistakesCount,
    durationSeconds: Math.round(elapsedSec),
    verificationId: state.currentVerificationId,
    frequentMistakes: { ...state.mistakesMap }
  };

  // Reset Save button
  const saveBtn = document.getElementById('saveSessionBtn');
  if (saveBtn) {
    saveBtn.innerHTML = '<span class="material-symbols-rounded">bookmark</span> Save Session';
    saveBtn.classList.remove('active');
  }

  if (modal) modal.classList.add('show');
}

// ==========================================================================
// Official Certificate of Typing Mastery Generator
// ==========================================================================
let activeCertificateData: CertificateData | null = null;

export function openCertificateModal(customSession?: SessionRecord) {
  const session = customSession || state.lastCompletedSession || {
    id: 'sess_live',
    timestamp: Date.now(),
    dateFormatted: new Date().toLocaleDateString(undefined, {
      month: 'long',
      day: 'numeric',
      year: 'numeric'
    }),
    language: state.language,
    category: state.category,
    targetKey: state.category === 'bigram' ? `${state.dualLetter1}+${state.dualLetter2}` : (state.currentStory.letter || state.selectedLetter || 'General'),
    storyTitle: state.currentStory.title,
    netWpm: Math.round(state.userInput.length > 0 ? (state.userInput.length / 5) / (Math.max(1, (Date.now() - (state.startTime || Date.now())) / 60000)) : 60),
    rawWpm: 65,
    accuracy: 98,
    cpm: 320,
    totalKeystrokes: Math.max(state.userInput.length, 250),
    mistakesCount: state.mistakesCount,
    durationSeconds: 60,
    verificationId: state.currentVerificationId
  };

  const nameInput = document.getElementById('certRecipientName') as HTMLInputElement;
  if (nameInput) {
    nameInput.value = state.recipientName || 'Alex Mercer';
  }

  const verifElem = document.getElementById('certVerificationId');
  if (verifElem) {
    verifElem.textContent = session.verificationId || state.currentVerificationId;
  }

  // Set active certificate data
  activeCertificateData = {
    recipientName: nameInput ? nameInput.value : state.recipientName,
    targetKey: session.targetKey,
    category: session.category,
    language: session.language,
    storyTitle: session.storyTitle || state.currentStory.title,
    netWpm: session.netWpm,
    rawWpm: session.rawWpm,
    accuracy: session.accuracy,
    cpm: session.cpm,
    totalKeystrokes: session.totalKeystrokes,
    targetKeyHits: state.targetKeyHits || Math.round(session.totalKeystrokes * 0.25),
    targetKeyExpected: state.targetKeyExpected || Math.round(session.totalKeystrokes * 0.25),
    verificationId: session.verificationId || state.currentVerificationId,
    issueDate: session.dateFormatted || new Date().toLocaleDateString(undefined, {
      month: 'long',
      day: 'numeric',
      year: 'numeric'
    })
  };

  updateCertificatePreview();

  const modal = document.getElementById('certificateModal');
  if (modal) modal.classList.add('show');
}

export function closeCertificateModal() {
  const modal = document.getElementById('certificateModal');
  if (modal) modal.classList.remove('show');
  focusTypingEngine();
}

export function updateCertificatePreview() {
  const canvas = document.getElementById('certificateCanvas') as HTMLCanvasElement;
  const nameInput = document.getElementById('certRecipientName') as HTMLInputElement;
  if (!canvas || !activeCertificateData) return;

  if (nameInput && nameInput.value.trim()) {
    activeCertificateData.recipientName = nameInput.value.trim();
    state.recipientName = nameInput.value.trim();
  }

  renderMasteryCertificate(canvas, activeCertificateData);
}

export function downloadMasteryCertificate() {
  const canvas = document.getElementById('certificateCanvas') as HTMLCanvasElement;
  if (!canvas || !activeCertificateData) return;
  const filename = `TypoLab-Mastery-Certificate-${activeCertificateData.recipientName.replace(/[^a-zA-Z0-9]/g, '_')}-${activeCertificateData.verificationId}.png`;
  downloadCertificateAsPNG(canvas, filename);
  showToast('Certificate downloaded in Ultra-HD PNG!');
}

export function printMasteryCertificate() {
  const canvas = document.getElementById('certificateCanvas') as HTMLCanvasElement;
  if (!canvas) return;
  printCertificate(canvas);
}

// ==========================================================================
// Session History & Persistence Management
// ==========================================================================
export function openHistoryModal() {
  renderHistoryTable();
  const modal = document.getElementById('historyModal');
  if (modal) modal.classList.add('show');
}

export function closeHistoryModal() {
  const modal = document.getElementById('historyModal');
  if (modal) modal.classList.remove('show');
  focusTypingEngine();
}

export function saveCurrentSessionToHistory() {
  if (!state.lastCompletedSession) {
    showToast('No active completed session to save!');
    return;
  }

  SessionHistoryManager.saveSession(state.lastCompletedSession);
  const saveBtn = document.getElementById('saveSessionBtn');
  if (saveBtn) {
    saveBtn.innerHTML = '<span class="material-symbols-rounded">check_circle</span> Saved to History';
    saveBtn.classList.add('active');
  }
  showToast('Session saved to History records!');
}

export function renderHistoryTable() {
  const container = document.getElementById('historyTableContainer');
  const emptyState = document.getElementById('historyEmptyState');
  const countBadge = document.getElementById('historyTotalCount');
  const avgWpmBadge = document.getElementById('historyAvgWpm');
  const avgAccBadge = document.getElementById('historyAvgAcc');
  const bestWpmBadge = document.getElementById('historyBestWpm');

  const history = SessionHistoryManager.getAllSessions();
  const stats = SessionHistoryManager.getStats();

  if (countBadge) countBadge.textContent = `${stats.totalSessions} Sessions`;
  if (avgWpmBadge) avgWpmBadge.textContent = `${stats.avgWpm} WPM Avg`;
  if (avgAccBadge) avgAccBadge.textContent = `${stats.avgAccuracy}% Acc`;
  if (bestWpmBadge) bestWpmBadge.textContent = `${stats.highestWpm} WPM Best`;

  if (!container || !emptyState) return;

  if (history.length === 0) {
    container.style.display = 'none';
    emptyState.style.display = 'block';
  } else {
    container.style.display = 'block';
    emptyState.style.display = 'none';

    let tableHtml = `
      <table class="history-table">
        <thead>
          <tr>
            <th>Date & Time</th>
            <th>Language & Key</th>
            <th>Net WPM</th>
            <th>Accuracy</th>
            <th>CPM</th>
            <th>Duration</th>
            <th>Verification ID</th>
            <th>Actions</th>
          </tr>
        </thead>
        <tbody>
    `;

    for (const item of history) {
      tableHtml += `
        <tr>
          <td><strong style="color:var(--md-sys-color-on-surface);">${item.dateFormatted}</strong></td>
          <td>
            <span class="chip-preset" style="font-size:11px; padding:2px 8px; font-weight:800;">
              ${item.language === 'en' ? '🇬🇧 EN' : '🇮🇳 HI'} • ${item.targetKey}
            </span>
          </td>
          <td><span style="font-size:15px; font-weight:900; color:var(--md-sys-color-primary);">${item.netWpm} WPM</span></td>
          <td><span style="font-weight:800; color:var(--md-sys-color-success);">${item.accuracy}%</span></td>
          <td><span style="color:var(--md-sys-color-outline); font-weight:700;">${item.cpm}</span></td>
          <td><span style="color:var(--md-sys-color-outline);">${item.durationSeconds}s</span></td>
          <td><code style="font-size:11px; font-weight:800; color:var(--md-sys-color-primary);">${item.verificationId}</code></td>
          <td>
            <div style="display:flex; align-items:center; gap:6px;">
              <button class="m3-icon-btn" title="View & Download Certificate" onclick="viewCertificateForHistory('${item.id}')" style="width:32px; height:32px; font-size:14px; background:rgba(0,245,255,0.1); color:var(--md-sys-color-primary);">
                <span class="material-symbols-rounded" style="font-size:18px;">workspace_premium</span>
              </button>
              <button class="m3-icon-btn" title="Delete record" onclick="deleteHistoryRecord('${item.id}')" style="width:32px; height:32px; font-size:14px; background:rgba(239,68,68,0.1); color:var(--md-sys-color-error);">
                <span class="material-symbols-rounded" style="font-size:18px;">delete</span>
              </button>
            </div>
          </td>
        </tr>
      `;
    }

    tableHtml += `
        </tbody>
      </table>
    `;

    container.innerHTML = tableHtml;
  }
}

export function viewCertificateForHistory(id: string) {
  const history = SessionHistoryManager.getAllSessions();
  const session = history.find(s => s.id === id);
  if (session) {
    closeHistoryModal();
    openCertificateModal(session);
  }
}

export function deleteHistoryRecord(id: string) {
  SessionHistoryManager.deleteSession(id);
  renderHistoryTable();
  showToast('Record deleted from history.');
}

export function clearAllHistoryRecords() {
  if (confirm('Are you sure you want to clear all session history records?')) {
    SessionHistoryManager.clearAll();
    renderHistoryTable();
    showToast('All history records cleared.');
  }
}

export function exportHistoryCSV() {
  SessionHistoryManager.exportCSV();
  showToast('History exported as CSV file!');
}

export function exportHistoryJSON() {
  SessionHistoryManager.exportJSON();
  showToast('History exported as JSON file!');
}

export function regenerateDynamicStory() {
  if (state.category === 'custom') {
    restartLesson();
    return;
  }
  const currentKey = state.category === 'bigram' 
    ? `${state.dualLetter1}+${state.dualLetter2}` 
    : state.selectedLetter;

  state.currentStory = {
    id: `dyn_${state.language}_${state.category}_${currentKey}_${Date.now()}`,
    language: state.language,
    category: state.category as any,
    letter: currentKey,
    title: `Dynamic Stream: Key ${currentKey}`,
    subtitle: `AI-Synthesized Infinite Speed Drill`,
    text: DynamicWordEngine.generateDynamicStream(state.language, state.category, currentKey, 12)
  };

  state.targetKeyExpected = countTargetKeyInText(state.currentStory.text, currentKey, state.category);
  loadActiveStory();
  showToast('Fresh dynamic story generated!');
}

// Focus helper
export function focusTypingEngine() {
  const hiddenInput = document.getElementById('hiddenTypingInput') as HTMLInputElement;
  if (hiddenInput) {
    try {
      hiddenInput.focus({ preventScroll: true });
    } catch (e) {
      hiddenInput.focus();
    }
  }

  // Ensure view stays locked at the very top when typing hasn't advanced past visible lines
  if (state.userInput.length === 0) {
    const wrap = document.getElementById('typingBoxWrap');
    if (wrap && wrap.scrollTop !== 0) {
      wrap.scrollTop = 0;
    }
  }
}

// Global UI Actions for TypoLab
export function restartLesson() {
  resetTypingState();
  renderTypingParagraph();
  focusTypingEngine();
  showToast('Drill restarted!');
}

export function nextLesson() {
  const list = getActiveStoryList();
  state.storyIndex = (state.storyIndex + 1) % (list.length || 15);
  loadActiveStory();
  focusTypingEngine();
}

export function selectStoryIndex(idx: number) {
  state.storyIndex = idx;
  loadActiveStory();
  focusTypingEngine();
}

export function closeScorecard(retry: boolean = false) {
  const modal = document.getElementById('scorecardModal');
  if (modal) modal.classList.remove('show');
  if (retry) {
    restartLesson();
  } else {
    focusTypingEngine();
  }
}

export function copyScorecardSummary() {
  const netWpm = document.getElementById('modalNetWpm')?.textContent || '0';
  const acc = document.getElementById('modalAccuracy')?.textContent || '100%';
  const targetLabel = state.category === 'bigram' 
    ? `${state.dualLetter1}+${state.dualLetter2}` 
    : (state.currentStory.letter || state.selectedLetter);
  const text = `🏆 TypoLab Scorecard: ${state.currentStory.title} | ${netWpm} WPM | ${acc} Acc | Target '${targetLabel}' Struck: ${state.targetKeyHits} times! Practiced with TypoLab Studio.`;
  navigator.clipboard.writeText(text);
  showToast('Scorecard copied to clipboard!');
}

// Insert character via virtual ribbon
export function insertVirtualChar(char: string) {
  const hiddenInput = document.getElementById('hiddenTypingInput') as HTMLInputElement;
  if (!hiddenInput) return;
  hiddenInput.value += char;
  hiddenInput.dispatchEvent(new Event('input'));
  focusTypingEngine();
}

// Insert virtual spacebar via mobile bar
export function insertVirtualSpace() {
  insertVirtualChar(' ');
}

// Delete last character via virtual backspace
export function deleteLastVirtualChar() {
  const hiddenInput = document.getElementById('hiddenTypingInput') as HTMLInputElement;
  if (!hiddenInput || hiddenInput.value.length === 0) return;
  hiddenInput.value = hiddenInput.value.slice(0, -1);
  hiddenInput.dispatchEvent(new Event('input'));
  focusTypingEngine();
}

// --- Category & Letter Switchers ---
export function switchTypingLanguage(lang: 'en' | 'hi') {
  state.language = lang;
  const langBtnEn = document.getElementById('langBtnEn');
  const langBtnHi = document.getElementById('langBtnHi');
  const activeLangTag = document.getElementById('activeLangTag');
  const hindiAssist = document.getElementById('hindiAssistBar');

  if (lang === 'en') {
    if (langBtnEn) langBtnEn.classList.add('active');
    if (langBtnHi) langBtnHi.classList.remove('active');
    if (activeLangTag) activeLangTag.textContent = '🇬🇧 English';
    if (hindiAssist) hindiAssist.style.display = 'none';
    state.category = 'alphabet';
    state.selectedLetter = 'A';
  } else {
    if (langBtnEn) langBtnEn.classList.remove('active');
    if (langBtnHi) langBtnHi.classList.add('active');
    if (activeLangTag) activeLangTag.textContent = '🇮🇳 हिन्दी';
    if (hindiAssist) hindiAssist.style.display = 'flex';
    state.category = 'vowel';
    state.selectedLetter = 'अ';
  }

  state.storyIndex = 0;
  renderCategoryPills();
  renderSubChips();
  loadActiveStory();
  focusTypingEngine();
}

// Render Category Filter Pills
function renderCategoryPills() {
  const row = document.getElementById('categoryPillsRow');
  if (!row) return;

  if (state.language === 'en') {
    row.innerHTML = `
      <button class="cat-pill ${state.category === 'alphabet' ? 'active' : ''}" onclick="selectCategory('alphabet')">A–Z Alphabet Stories</button>
      <button class="cat-pill ${state.category === 'bigram' ? 'active' : ''}" onclick="selectCategory('bigram')">Dual-Letter Custom Drill</button>
      <button class="cat-pill ${state.category === 'case' ? 'active' : ''}" onclick="selectCategory('case')">Case Shift Mastery</button>
      <button class="cat-pill ${state.category === 'hard' ? 'active' : ''}" onclick="selectCategory('hard')">Literary Hard Mode</button>
      <button class="cat-pill ${state.category === 'pro-hard' ? 'active' : ''}" onclick="selectCategory('pro-hard')">Syntax Pro-Hard Mode</button>
      <button class="cat-pill ${state.category === 'custom' ? 'active' : ''}" onclick="selectCategory('custom')">✍️ Custom Mode</button>
    `;
  } else {
    row.innerHTML = `
      <button class="cat-pill ${state.category === 'vowel' ? 'active' : ''}" onclick="selectCategory('vowel')">स्वर अभ्यास (अ, आ, इ, ई...)</button>
      <button class="cat-pill ${state.category === 'consonant' ? 'active' : ''}" onclick="selectCategory('consonant')">व्यंजन (क से ह - ३० अक्षर)</button>
      <button class="cat-pill ${state.category === 'matra' ? 'active' : ''}" onclick="selectCategory('matra')">मात्रा अभ्यास (ा, ि, ी...)</button>
      <button class="cat-pill ${state.category === 'literature' ? 'active' : ''}" onclick="selectCategory('literature')">📖 मिश्रित साहित्य</button>
      <button class="cat-pill ${state.category === 'hard' ? 'active' : ''}" onclick="selectCategory('hard')">💥 प्रो-कठिन (संयुक्त व अंक)</button>
      <button class="cat-pill ${state.category === 'custom' ? 'active' : ''}" onclick="selectCategory('custom')">✍️ कस्टम मोड (Custom Text)</button>
    `;
  }
}

// Render Sub-Chips (Letters A-Z, Pairs, Hindi Vowels/Consonants/Matras)
function renderSubChips() {
  const row = document.getElementById('subChipsSelectorRow');
  if (!row) return;

  if (state.category === 'custom') {
    row.style.display = 'none';
    return;
  }

  if (state.language === 'en') {
    if (state.category === 'alphabet') {
      const letters = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'.split('');
      row.style.display = 'flex';
      row.innerHTML = letters.map(l => `
        <button class="letter-chip ${state.selectedLetter === l ? 'active' : ''}" onclick="selectLetter('${l}')">${l}</button>
      `).join('');
    } else if (state.category === 'bigram') {
      row.style.display = 'flex';
      const allLetters = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'.split('');
      const l1Options = allLetters.map(l => `<option value="${l}" ${state.dualLetter1 === l ? 'selected' : ''}>Key ${l}</option>`).join('');
      const l2Options = allLetters.map(l => `<option value="${l}" ${state.dualLetter2 === l ? 'selected' : ''}>Key ${l}</option>`).join('');

      const presets = ['A+S', 'T+H', 'E+R', 'I+N', 'Q+U', 'C+K', 'F+J', 'D+K'];
      const presetButtons = presets.map(p => {
        const [p1, p2] = p.split('+');
        const isActive = state.dualLetter1 === p1 && state.dualLetter2 === p2;
        return `<button class="letter-chip ${isActive ? 'active' : ''}" onclick="setDualPairPreset('${p1}', '${p2}')">${p}</button>`;
      }).join('');

      row.innerHTML = `
        <div style="display:flex; align-items:center; gap:8px; flex-wrap:wrap; width:100%;">
          <div class="custom-pair-selector-wrap" style="display:flex; align-items:center; gap:6px; background:var(--glass-bg-high); padding:4px 12px; border-radius:9999px; border:1px solid var(--glass-border-glow);">
            <span style="font-size:12px; font-weight:800;">Primary:</span>
            <select class="m3-select" style="padding:4px 10px; font-size:13px; font-weight:800; border-radius:9999px;" onchange="updateDualLetter1(this.value)">
              ${l1Options}
            </select>
            <span style="font-size:14px; font-weight:900; color:var(--md-sys-color-primary);">+</span>
            <span style="font-size:12px; font-weight:800;">Pair:</span>
            <select class="m3-select" style="padding:4px 10px; font-size:13px; font-weight:800; border-radius:9999px;" onchange="updateDualLetter2(this.value)">
              ${l2Options}
            </select>
          </div>
          <div style="display:flex; align-items:center; gap:4px; overflow-x:auto;">
            ${presetButtons}
          </div>
        </div>
      `;
    } else {
      row.style.display = 'none';
    }
  } else {
    if (state.category === 'vowel') {
      const vowels = ['अ', 'आ', 'इ', 'ई', 'उ', 'ऊ', 'ए', 'ऐ', 'ओ', 'औ', 'अं'];
      row.style.display = 'flex';
      row.innerHTML = vowels.map(v => `
        <button class="letter-chip ${state.selectedLetter === v ? 'active' : ''}" onclick="selectLetter('${v}')">${v}</button>
      `).join('');
    } else if (state.category === 'consonant') {
      const consonants = ['क', 'ख', 'ग', 'घ', 'च', 'छ', 'ज', 'झ', 'ट', 'ठ', 'ड', 'ढ', 'त', 'थ', 'द', 'ध', 'न', 'प', 'फ', 'ब', 'भ', 'म', 'य', 'र', 'ल', 'व', 'श', 'ष', 'स', 'ह'];
      row.style.display = 'flex';
      row.innerHTML = consonants.map(c => `
        <button class="letter-chip ${state.selectedLetter === c ? 'active' : ''}" onclick="selectLetter('${c}')">${c}</button>
      `).join('');
    } else if (state.category === 'matra') {
      const matras = ['ा', 'ि', 'ी', 'ु', 'ू', 'े', 'ै', 'ो', 'ौ', 'ं', '्'];
      row.style.display = 'flex';
      row.innerHTML = matras.map(m => `
        <button class="letter-chip ${state.selectedLetter === m ? 'active' : ''}" onclick="selectLetter('${m}')">${m}</button>
      `).join('');
    } else {
      row.style.display = 'none';
    }
  }
}

export function updateDualLetter1(val: string) {
  state.dualLetter1 = (val || 'A').toUpperCase();
  state.storyIndex = 0;
  loadActiveStory();
  renderSubChips();
  focusTypingEngine();
}

export function updateDualLetter2(val: string) {
  state.dualLetter2 = (val || 'S').toUpperCase();
  state.storyIndex = 0;
  loadActiveStory();
  renderSubChips();
  focusTypingEngine();
}

export function setDualPairPreset(l1: string, l2: string) {
  state.dualLetter1 = l1.toUpperCase();
  state.dualLetter2 = l2.toUpperCase();
  state.storyIndex = 0;
  loadActiveStory();
  renderSubChips();
  focusTypingEngine();
}

export function selectCategory(cat: string) {
  state.category = cat;
  state.storyIndex = 0;

  // Set appropriate default key
  if (cat === 'custom') {
    state.selectedLetter = 'Custom';
  } else if (state.language === 'en') {
    if (cat === 'alphabet') state.selectedLetter = 'A';
    else if (cat === 'bigram') {
      state.dualLetter1 = 'A';
      state.dualLetter2 = 'S';
    }
    else if (cat === 'case') state.selectedLetter = 'Shift';
    else if (cat === 'hard') state.selectedLetter = 'Syntax';
    else if (cat === 'pro-hard') state.selectedLetter = 'Code';
  } else {
    if (cat === 'vowel') state.selectedLetter = 'अ';
    else if (cat === 'consonant') state.selectedLetter = 'क';
    else if (cat === 'matra') state.selectedLetter = 'ा';
    else if (cat === 'literature') state.selectedLetter = 'साहित्य';
    else if (cat === 'hard') state.selectedLetter = 'संयुक्त';
  }

  renderCategoryPills();
  renderSubChips();
  loadActiveStory();
  focusTypingEngine();
}

export function selectLetter(letter: string) {
  state.selectedLetter = letter;
  state.storyIndex = 0;
  renderSubChips();
  loadActiveStory();
  focusTypingEngine();
}

// Quick toggle language
export function toggleLanguageQuick() {
  const next = state.language === 'en' ? 'hi' : 'en';
  switchTypingLanguage(next);
}

// Fullscreen mode toggling for typing panel
export function toggleArenaFullscreen() {
  const arena = document.getElementById('typolabArenaView');
  if (!arena) return;

  const isFull = arena.classList.contains('arena-fullscreen-active');
  if (!isFull) {
    arena.classList.add('arena-fullscreen-active');
    document.body.classList.add('arena-fullscreen-mode');
    document.body.style.overflow = 'hidden';
    state.isFullscreen = true;

    const icon = document.getElementById('fullscreenIcon');
    const txt = document.getElementById('fullscreenBtnText');
    const exitBtn = document.getElementById('exitFullscreenBtn');
    if (icon) icon.textContent = 'close_fullscreen';
    if (txt) txt.textContent = 'Exit Fullscreen';
    if (exitBtn) exitBtn.style.display = 'inline-flex';

    try {
      if (!document.fullscreenElement && document.documentElement.requestFullscreen) {
        document.documentElement.requestFullscreen().catch(() => {});
      }
    } catch (e) {}

    showToast('📺 Fullscreen Theatre Active • Press Esc to Exit');
    setTimeout(() => {
      positionCaret(state.userInput.length);
    }, 60);
  } else {
    exitArenaFullscreen();
  }
  focusTypingEngine();
}

export function exitArenaFullscreen() {
  const arena = document.getElementById('typolabArenaView');
  if (arena) {
    arena.classList.remove('arena-fullscreen-active');
  }
  document.body.classList.remove('arena-fullscreen-mode');
  document.body.style.overflow = '';
  state.isFullscreen = false;

  const icon = document.getElementById('fullscreenIcon');
  const txt = document.getElementById('fullscreenBtnText');
  const exitBtn = document.getElementById('exitFullscreenBtn');
  if (icon) icon.textContent = 'fullscreen';
  if (txt) txt.textContent = 'Fullscreen';
  if (exitBtn) exitBtn.style.display = 'none';

  try {
    if (document.fullscreenElement && document.exitFullscreen) {
      document.exitFullscreen().catch(() => {});
    }
  } catch (e) {}

  setTimeout(() => {
    positionCaret(state.userInput.length);
  }, 60);

  focusTypingEngine();
}

// --- Custom Text Mode Helpers ---
export function loadCustomPreset(index: number) {
  const preset = DEFAULT_CUSTOM_PRESETS[index];
  if (preset) {
    const input = document.getElementById('customTextInput') as HTMLTextAreaElement;
    if (input) {
      input.value = preset.text;
      onCustomTextInputChange();
      showToast(`Loaded: ${preset.title.split(':')[0]}`);
    }
  }
}

export async function pasteFromClipboard() {
  try {
    const text = await navigator.clipboard.readText();
    if (text) {
      const input = document.getElementById('customTextInput') as HTMLTextAreaElement;
      if (input) {
        input.value = text;
        onCustomTextInputChange();
        showToast('Pasted text from clipboard!');
      }
    }
  } catch (err) {
    showToast('Clipboard permission denied. Please paste manually.');
  }
}

export function clearCustomText() {
  const input = document.getElementById('customTextInput') as HTMLTextAreaElement;
  if (input) {
    input.value = '';
    onCustomTextInputChange();
  }
}

export function onCustomTextInputChange() {
  const input = document.getElementById('customTextInput') as HTMLTextAreaElement;
  const text = input ? input.value : '';
  const charCount = document.getElementById('customCharCount');
  const wordCount = document.getElementById('customWordCount');
  const words = text.trim() ? text.trim().split(/\s+/).length : 0;
  if (charCount) charCount.textContent = `${text.length} characters`;
  if (wordCount) wordCount.textContent = `${words} words`;
}

export function applyCustomTextAndStart() {
  const input = document.getElementById('customTextInput') as HTMLTextAreaElement;
  const text = input ? input.value.trim() : '';
  if (!text) {
    showToast('Please enter or paste some text first!');
    return;
  }

  state.customUserText = text;
  try {
    localStorage.setItem('typolab_custom_text', text);
  } catch (e) {}

  state.category = 'custom';
  state.selectedLetter = 'Custom';
  state.storyIndex = 0;
  loadActiveStory();
  focusTypingEngine();
  showToast('Custom text loaded! Ready to type.');
}

// --- Studio Tabs Navigation ---
export function switchStudioTab(tabId: string) {
  const tabs = ['typolab', 'case-converter', 'repeater', 'reverser', 'sorter'];
  const viewMap: Record<string, string> = {
    'typolab': 'typolabArenaView',
    'case-converter': 'caseConverterView',
    'repeater': 'repeaterView',
    'reverser': 'reverserView',
    'sorter': 'sorterView'
  };
  const btnMap: Record<string, string> = {
    'typolab': 'tabTypoLab',
    'case-converter': 'tabCase',
    'repeater': 'tabRepeat',
    'reverser': 'tabReverse',
    'sorter': 'tabSort'
  };

  tabs.forEach(t => {
    const view = document.getElementById(viewMap[t]);
    const btn = document.getElementById(btnMap[t]);
    if (view) view.style.display = (t === tabId) ? 'flex' : 'none';
    if (btn) btn.classList.toggle('active', t === tabId);
  });

  if (tabId === 'typolab') {
    focusTypingEngine();
  } else if (tabId === 'repeater') {
    generateRepeatedText();
  } else if (tabId === 'reverser') {
    updateReverseOutput();
  } else if (tabId === 'sorter') {
    updateSortStats();
  } else if (tabId === 'case-converter') {
    updateCaseOutput();
  }
}

// --- TextCraft Tools Implementations ---

// 1. Case Converter
export function applyCaseTransform(type: string) {
  const input = (document.getElementById('caseInput') as HTMLTextAreaElement).value;
  let res = '';

  switch (type) {
    case 'upper':
      res = input.toUpperCase();
      break;
    case 'lower':
      res = input.toLowerCase();
      break;
    case 'title':
      res = input.replace(/\b\w+/g, txt => txt.charAt(0).toUpperCase() + txt.substring(1).toLowerCase());
      break;
    case 'sentence':
      res = input.toLowerCase().replace(/(^\s*\w|[.!?]\s*\w)/g, c => c.toUpperCase());
      break;
    case 'camel':
      res = input
        .replace(/[^a-zA-Z0-9]+(.)/g, (_, chr) => chr.toUpperCase())
        .replace(/^[A-Z]/, c => c.toLowerCase());
      break;
    case 'pascal':
      res = input
        .replace(/[^a-zA-Z0-9]+(.)/g, (_, chr) => chr.toUpperCase())
        .replace(/^[a-z]/, c => c.toUpperCase());
      break;
    case 'snake':
      res = input
        .trim()
        .toLowerCase()
        .replace(/\s+/g, '_')
        .replace(/[^a-z0-9_]/g, '');
      break;
    case 'kebab':
      res = input
        .trim()
        .toLowerCase()
        .replace(/\s+/g, '-')
        .replace(/[^a-z0-9-]/g, '');
      break;
    case 'alternating':
      res = input
        .split('')
        .map((c, i) => i % 2 === 0 ? c.toLowerCase() : c.toUpperCase())
        .join('');
      break;
    default:
      res = input;
  }

  (document.getElementById('caseOutput') as HTMLTextAreaElement).value = res;
  showToast(`Converted to ${type.toUpperCase()}`);
}

export function updateCaseOutput() {
  const input = (document.getElementById('caseInput') as HTMLTextAreaElement).value;
  (document.getElementById('caseOutput') as HTMLTextAreaElement).value = input;
}

// 2. Text Repeater
let repeatSeparator = '\n';

export function updateRepeatCount(val: string) {
  const disp = document.getElementById('repeatCountDisplay');
  if (disp) disp.textContent = val;
  generateRepeatedText();
}

export function setRepeatSep(type: string) {
  if (type === 'newline') repeatSeparator = '\n';
  else if (type === 'space') repeatSeparator = ' ';
  else if (type === 'comma') repeatSeparator = ', ';
  else if (type === 'pipe') repeatSeparator = ' | ';
  else if (type === 'dash') repeatSeparator = ' - ';

  document.querySelectorAll('.sep-btn').forEach(b => b.classList.remove('active'));
  const activeBtn = document.getElementById(`sepBtn-${type}`);
  if (activeBtn) activeBtn.classList.add('active');

  generateRepeatedText();
}

export function generateRepeatedText() {
  const input = (document.getElementById('repeatInput') as HTMLTextAreaElement).value;
  const countSlider = document.getElementById('repeatSlider') as HTMLInputElement;
  const count = parseInt(countSlider ? countSlider.value : '5', 10);
  const withNumbering = (document.getElementById('repeatNumbering') as HTMLInputElement)?.checked;

  if (!input) {
    (document.getElementById('repeatOutput') as HTMLTextAreaElement).value = '';
    return;
  }

  const items: string[] = [];
  for (let i = 1; i <= count; i++) {
    items.push(withNumbering ? `${i}. ${input}` : input);
  }

  (document.getElementById('repeatOutput') as HTMLTextAreaElement).value = items.join(repeatSeparator);
}

// 3. Reverser & Upside Flipper
let reverseMode = 'text';

export function setReverseMode(mode: string) {
  reverseMode = mode;
  document.querySelectorAll('.rev-btn').forEach(b => b.classList.remove('active'));
  const activeBtn = document.getElementById(`revBtn-${mode}`);
  if (activeBtn) activeBtn.classList.add('active');
  updateReverseOutput();
}

export function updateReverseOutput() {
  const input = (document.getElementById('reverseInput') as HTMLTextAreaElement).value;
  const output = document.getElementById('reverseOutput') as HTMLTextAreaElement;
  if (!output) return;

  if (reverseMode === 'text') {
    output.value = input.split('').reverse().join('');
  } else if (reverseMode === 'words') {
    output.value = input.split(/\s+/).reverse().join(' ');
  } else if (reverseMode === 'lines') {
    output.value = input.split('\n').reverse().join('\n');
  } else if (reverseMode === 'upside') {
    const flipMap: Record<string, string> = {
      'a': 'ɐ', 'b': 'q', 'c': 'ɔ', 'd': 'p', 'e': 'ǝ', 'f': 'ɟ', 'g': 'ƃ', 'h': 'ɥ',
      'i': 'ᴉ', 'j': 'ɾ', 'k': 'ʞ', 'l': 'l', 'm': 'ɯ', 'n': 'u', 'o': 'o', 'p': 'd',
      'q': 'b', 'r': 'ɹ', 's': 's', 't': 'ʇ', 'u': 'n', 'v': 'ʌ', 'w': 'ʍ', 'x': 'x',
      'y': 'ʎ', 'z': 'z', 'A': '∀', 'B': '𐐒', 'C': 'Ɔ', 'D': 'p', 'E': 'Ǝ', 'F': 'Ⅎ',
      'G': '⅁', 'H': 'H', 'I': 'I', 'J': 'ſ', 'K': 'ʞ', 'L': '˥', 'M': 'W', 'N': 'N',
      'O': 'O', 'P': 'Ԁ', 'Q': 'Ό', 'R': 'ᴚ', 'S': 'S', 'T': '⊥', 'U': '∩', 'V': 'Λ',
      'W': 'M', 'X': 'X', 'Y': '⅄', 'Z': 'Z', '1': 'Ɩ', '2': 'ᄅ', '3': 'Ɛ', '4': 'ㄣ',
      '5': 'ϛ', '6': '9', '7': 'ㄥ', '8': '8', '9': '6', '0': '0', '.': '˙', ',': '\'',
      '?': '¿', '!': '¡', '(': ')', ')': '(', '[': ']', ']': '[', '{': '}', '}': '{'
    };
    output.value = input
      .split('')
      .reverse()
      .map(ch => flipMap[ch] || ch)
      .join('');
  }
}

// 4. Alphabet Sorter & Cleaner
export function applySortAction(action: string) {
  const inputElem = document.getElementById('sortInput') as HTMLTextAreaElement;
  const input = inputElem.value;
  let res = '';

  switch (action) {
    case 'az': {
      const lines = input.split('\n').filter(l => l.trim().length > 0);
      lines.sort((a, b) => a.localeCompare(b));
      res = lines.join('\n');
      break;
    }
    case 'za': {
      const lines = input.split('\n').filter(l => l.trim().length > 0);
      lines.sort((a, b) => b.localeCompare(a));
      res = lines.join('\n');
      break;
    }
    case 'dedup': {
      const lines = input.split('\n');
      const unique = Array.from(new Set(lines));
      res = unique.join('\n');
      break;
    }
    case 'strip-spaces': {
      res = input.replace(/[ \t]+/g, ' ').replace(/^\s+|\s+$/gm, '');
      break;
    }
    case 'remove-empty': {
      res = input.split('\n').filter(l => l.trim().length > 0).join('\n');
      break;
    }
    case 'length-asc': {
      const lines = input.split('\n');
      lines.sort((a, b) => a.length - b.length);
      res = lines.join('\n');
      break;
    }
    case 'length-desc': {
      const lines = input.split('\n');
      lines.sort((a, b) => b.length - a.length);
      res = lines.join('\n');
      break;
    }
    default:
      res = input;
  }

  (document.getElementById('sortOutput') as HTMLTextAreaElement).value = res;
  updateSortStats();
  showToast(`Applied ${action.replace('-', ' ').toUpperCase()}`);
}

export function updateSortStats() {
  const input = (document.getElementById('sortInput') as HTMLTextAreaElement).value;
  const chars = input.length;
  const words = input.trim() ? input.trim().split(/\s+/).length : 0;
  const lines = input ? input.split('\n').length : 0;
  const readingTime = Math.ceil(words / 200);

  const charElem = document.getElementById('sortCharCount');
  const wordElem = document.getElementById('sortWordCount');
  const lineElem = document.getElementById('sortLineCount');
  const timeElem = document.getElementById('sortReadingTime');

  if (charElem) charElem.textContent = `${chars} chars`;
  if (wordElem) wordElem.textContent = `${words} words`;
  if (lineElem) lineElem.textContent = `${lines} lines`;
  if (timeElem) timeElem.textContent = `~${readingTime} min read`;
}

// Global Copy Helper
export function copyResultText(elementId: string) {
  const elem = document.getElementById(elementId) as HTMLTextAreaElement;
  if (elem && elem.value) {
    navigator.clipboard.writeText(elem.value);
    showToast('Copied to clipboard!');
  } else {
    showToast('Nothing to copy!');
  }
}

// --- Settings Bottom Sheet Drawer Logic ---
export function toggleSettingsSheet(open?: boolean) {
  const sheet = document.getElementById('settingsBottomSheet');
  const overlay = document.getElementById('settingsOverlay');
  if (!sheet || !overlay) return;

  const shouldOpen = open !== undefined ? open : !sheet.classList.contains('open');

  if (shouldOpen) {
    sheet.classList.add('open');
    overlay.classList.add('open');
  } else {
    sheet.classList.remove('open');
    overlay.classList.remove('open');
    focusTypingEngine();
  }
}

export function handleSettingsOverlayClick(e: MouseEvent) {
  if ((e.target as HTMLElement).id === 'settingsOverlay') {
    toggleSettingsSheet(false);
  }
}

export function toggleAudioSynth() {
  state.settings.soundEnabled = !state.settings.soundEnabled;
  synth.enabled = state.settings.soundEnabled;
  saveSettings();
  applySettings();
  showToast(state.settings.soundEnabled ? 'Mechanical Sound: ON 🔊' : 'Mechanical Sound: OFF 🔇');
}

export function setAppearanceMode(mode: 'light' | 'dark') {
  state.settings.mode = mode;
  saveSettings();
  applySettings();
  showToast(`Theme set to ${mode === 'light' ? 'Light Glass' : 'Dark Glass'}`);
}

export function togglePureDark(enabled: boolean) {
  state.settings.pureDark = enabled;
  saveSettings();
  applySettings();
  showToast(enabled ? 'OLED Pure Dark Mode: ON' : 'OLED Pure Dark: OFF');
}

export function toggleBlurMode(enabled: boolean) {
  state.settings.ultraBlur = enabled;
  saveSettings();
  applySettings();
  showToast(enabled ? 'Ultra Glass Blur: Active' : 'Ultra Glass Blur: Standard');
}

export function toggleSoundFx(enabled: boolean) {
  state.settings.soundEnabled = enabled;
  synth.enabled = enabled;
  saveSettings();
  applySettings();
}

export async function toggleWakeLock(enabled: boolean) {
  state.settings.wakeLockEnabled = enabled;
  saveSettings();

  if (enabled && 'wakeLock' in navigator) {
    try {
      state.wakeLock = await navigator.wakeLock.request('screen');
      showToast('Screen Wake Lock Active');
    } catch (err) {
      console.warn('Wake Lock error:', err);
      showToast('Wake Lock not supported on this device');
    }
  } else if (state.wakeLock) {
    try {
      await state.wakeLock.release();
      state.wakeLock = null;
      showToast('Screen Wake Lock released');
    } catch (err) {}
  }
}

export function setCustomAccent(colorHex: string) {
  state.settings.accentColor = colorHex;
  saveSettings();
  applySettings();
}

export function setFont(fontCss: string) {
  state.settings.fontFamily = fontCss;
  document.documentElement.style.setProperty('--md-sys-font-family', fontCss);
  document.documentElement.style.setProperty('--font-english', fontCss);
  saveSettings();
  showToast('Typography updated');
}

export function updateVoicePreference(gender: 'female' | 'male') {
  state.settings.voiceGender = gender;
  saveSettings();
  showToast(`Speech voice set to ${gender}`);
}

export function updateVoiceSpeed(speedStr: string) {
  const speed = parseFloat(speedStr) || 1.0;
  state.settings.voiceSpeed = speed;
  const disp = document.getElementById('voiceSpeedDisplay');
  if (disp) disp.textContent = speed.toFixed(1) + 'x';
  saveSettings();
}

export function resetDefaults() {
  state.settings = {
    mode: 'light',
    pureDark: false,
    ultraBlur: true,
    soundEnabled: true,
    wakeLockEnabled: false,
    accentColor: '#00F5FF',
    fontFamily: "'Comic Neue', cursive, sans-serif",
    voiceGender: 'female',
    voiceSpeed: 1.0
  };
  saveSettings();
  applySettings();
  showToast('Restored studio default settings');
}

export function resetToHome() {
  switchStudioTab('typolab');
  restartLesson();
}

// --- PWA Installation Logic ---
let deferredPrompt: BeforeInstallPromptEvent | null = null;

interface BeforeInstallPromptEvent extends Event {
  prompt(): Promise<void>;
  userChoice: Promise<{ outcome: 'accepted' | 'dismissed' }>;
}

window.addEventListener('beforeinstallprompt', (e) => {
  e.preventDefault();
  deferredPrompt = e as BeforeInstallPromptEvent;
  const installBtn = document.getElementById('pwaInstallBtn');
  if (installBtn) installBtn.style.display = 'inline-flex';
});

export function triggerPWAInstall() {
  if (deferredPrompt) {
    deferredPrompt.prompt();
    deferredPrompt.userChoice.then((res) => {
      if (res.outcome === 'accepted') {
        showToast('Thank you for installing TypoLab!');
      }
      deferredPrompt = null;
      const installBtn = document.getElementById('pwaInstallBtn');
      if (installBtn) installBtn.style.display = 'none';
    });
  } else {
    showToast('To install, use browser menu > "Add to Home Screen"');
  }
}

// Service worker registration
if ('serviceWorker' in navigator) {
  window.addEventListener('load', () => {
    navigator.serviceWorker.register('/sw.js').catch((err) => {
      console.log('SW registration note:', err);
    });
  });
}

// Expose functions globally for inline HTML onclick handlers
Object.assign(window, {
  resetToHome,
  toggleAudioSynth,
  toggleSettingsSheet,
  handleSettingsOverlayClick,
  triggerPWAInstall,
  switchStudioTab,
  switchTypingLanguage,
  toggleLanguageQuick,
  setContentGenerationMode,
  toggleArenaFullscreen,
  exitArenaFullscreen,
  loadCustomPreset,
  pasteFromClipboard,
  clearCustomText,
  onCustomTextInputChange,
  applyCustomTextAndStart,
  restartLesson,
  nextLesson,
  selectCategory,
  selectLetter,
  updateDualLetter1,
  updateDualLetter2,
  setDualPairPreset,
  selectStoryIndex,
  focusTypingEngine,
  closeScorecard,
  copyScorecardSummary,
  openCertificateModal,
  closeCertificateModal,
  updateCertificatePreview,
  downloadMasteryCertificate,
  printMasteryCertificate,
  openHistoryModal,
  closeHistoryModal,
  saveCurrentSessionToHistory,
  renderHistoryTable,
  viewCertificateForHistory,
  deleteHistoryRecord,
  clearAllHistoryRecords,
  exportHistoryCSV,
  exportHistoryJSON,
  regenerateDynamicStory,
  insertVirtualChar,
  insertVirtualSpace,
  deleteLastVirtualChar,
  applyCaseTransform,
  updateCaseOutput,
  updateRepeatCount,
  setRepeatSep,
  generateRepeatedText,
  setReverseMode,
  updateReverseOutput,
  applySortAction,
  updateSortStats,
  copyResultText,
  setAppearanceMode,
  togglePureDark,
  toggleBlurMode,
  toggleSoundFx,
  toggleWakeLock,
  setCustomAccent,
  setFont,
  updateVoicePreference,
  updateVoiceSpeed,
  resetDefaults
});

// Complete initialization runner (handles both early and late script execution)
function initializeTypoLabApp() {
  loadSettings();
  applySettings();
  renderCategoryPills();
  renderSubChips();
  loadActiveStory();

  // Attach input listener
  const hiddenInput = document.getElementById('hiddenTypingInput');
  if (hiddenInput) {
    hiddenInput.removeEventListener('input', handleInput);
    hiddenInput.addEventListener('input', handleInput);
  }

  // Keyboard shortcut listener
  window.addEventListener('keydown', (e) => {
    const activeElement = document.activeElement;
    const isInsideOtherTextarea = activeElement && (
      activeElement.id === 'caseInput' ||
      activeElement.id === 'reverseInput' ||
      activeElement.id === 'sortInput' ||
      activeElement.id === 'repeatInput' ||
      activeElement.id === 'customTextInput' ||
      activeElement.id === 'certRecipientName'
    );

    // Shift + Enter: Generate a fresh new dynamic story
    if (e.shiftKey && e.key === 'Enter') {
      if (!isInsideOtherTextarea) {
        e.preventDefault();
        regenerateDynamicStory();
        return;
      }
    }

    if (e.key === 'Escape') {
      // Close open modals first
      const certModal = document.getElementById('certificateModal');
      const histModal = document.getElementById('historyModal');
      const scoreModal = document.getElementById('scorecardModal');
      const settingsSheet = document.getElementById('settingsSheetOverlay');

      if (certModal && certModal.classList.contains('show')) {
        closeCertificateModal();
        return;
      }
      if (histModal && histModal.classList.contains('show')) {
        closeHistoryModal();
        return;
      }
      if (scoreModal && scoreModal.classList.contains('show')) {
        closeScorecard();
        return;
      }
      if (settingsSheet && settingsSheet.classList.contains('show')) {
        toggleSettingsSheet(false);
        return;
      }

      if (state.isFullscreen) {
        exitArenaFullscreen();
      }
      return;
    }

    if (e.key === 'Tab') {
      if (isInsideOtherTextarea) {
        return;
      }
      e.preventDefault();
      restartLesson();
    }
  });

  // Listen for browser fullscreen change event (e.g. user pressed F11 or Esc natively)
  document.addEventListener('fullscreenchange', () => {
    if (!document.fullscreenElement && state.isFullscreen) {
      exitArenaFullscreen();
    }
  });

  // Re-align caret on window resize
  window.addEventListener('resize', () => {
    if (state.currentStory) {
      positionCaret(state.userInput.length);
    }
  });

  // Handle typing box click/tap to focus without scrolling
  const wrap = document.getElementById('typingBoxWrap');
  if (wrap) {
    wrap.addEventListener('click', () => {
      focusTypingEngine();
    });
  }

  // Focus typing engine on click anywhere in arena
  const arena = document.getElementById('typolabArenaView');
  if (arena) {
    arena.addEventListener('click', (e) => {
      // Don't auto-focus hidden typing input if user is clicking on custom text area or dropdowns
      const target = e.target as HTMLElement;
      if (target && (target.tagName === 'BUTTON' || target.tagName === 'TEXTAREA' || target.tagName === 'SELECT' || target.closest('.custom-mode-card') || target.closest('.custom-pair-selector-wrap'))) {
        return;
      }
      focusTypingEngine();
    });
  }

  // Auto-focus typing engine initially
  setTimeout(() => {
    focusTypingEngine();
  }, 100);
}

// Check document state and initialize immediately or on DOMContentLoaded
if (document.readyState === 'loading') {
  document.addEventListener('DOMContentLoaded', initializeTypoLabApp);
} else {
  initializeTypoLabApp();
}
