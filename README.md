<div align="center">

# ⚡ Adarsh's TextCraft & TypoLab Studio
### Bilingual (English & Devanagari) Touch Typing Mastery Arena & 11-in-1 M3 Productivity Suite

[![React 19](https://img.shields.io/badge/React-19.0-00F5FF?style=for-the-badge&logo=react&logoColor=black)](https://react.dev/)
[![TypeScript](https://img.shields.io/badge/TypeScript-5.8-00F5FF?style=for-the-badge&logo=typescript&logoColor=black)](https://www.typescriptlang.org/)
[![Material 3](https://img.shields.io/badge/Design%20System-Google%20Material%203-00F5FF?style=for-the-badge&logo=google&logoColor=black)](https://m3.material.io/)
[![Web Audio API](https://img.shields.io/badge/Web%20Audio-Cherry%20MX%20Synth-00F5FF?style=for-the-badge)](https://developer.mozilla.org/en-US/docs/Web/API/Web_Audio_API)
[![PWA Ready](https://img.shields.io/badge/PWA-100%25%20Offline%20Cache--First-00F5FF?style=for-the-badge&logo=pwa&logoColor=black)](https://github.com/)

<p align="center">
  <b>A zero-placeholder, 60+ FPS progressive web application engineered with Google Material Design 3 spring physics, acoustic mechanical switch synthesis, locked 3-line Monkeytype viewing window, active spotlight HUD, and an authenticated 1920x1080 canvas certificate engine.</b>
</p>

</div>

---

## 🏛️ Architectural Overview & Design System

TypoLab Studio combines cutting-edge frontend web technologies with cognitive ergonomics:

```
typolab-studio/
├── vite.config.ts             # Vite + Tailwind v4 + React 19 Plugin
├── tsconfig.json              # Strict TypeScript 5.8 Compiler Options
├── public/
│   ├── icon.png               # High-Resolution Master PNG Icon Pipeline
│   ├── manifest.json          # Standalone PWA Manifest strictly referencing /icon.png
│   └── sw.js                  # Cache-First Service Worker for complete offline use
├── src/
│   ├── main.tsx               # React 19 StrictMode Entrypoint
│   ├── App.tsx                # Master M3 Layout, Responsive Navigation & Bottom Dock
│   ├── index.css              # Tailwind v4 Directives, Glass Optics, M3 Morphing
│   ├── types.ts               # Complete TypeScript interfaces & state models
│   ├── standaloneApp.ts       # Fallback offline DOM driver
│   ├── certificateEngine.ts   # 1920x1080 300-DPI Vector Canvas Certificate Engine
│   ├── sessionHistory.ts      # LocalStorage & IndexedDB Session Analytics Engine
│   ├── audio/
│   │   └── keyboardSynth.ts   # Web Audio API mechanical switch synth (Blue/Red/Brown)
│   ├── components/
│   │   ├── TypoLabArena.tsx   # 3-Line locked window + Active Word Live Focus Spotlight HUD
│   │   ├── TextTools.tsx      # Complete 11-in-1 M3 Multi-Utility Toolkit
│   │   └── SettingsSheet.tsx  # Glassmorphic M3 Customization Drawer
│   ├── hooks/
│   │   └── usePWA.ts          # PWA installation prompts, iOS guide & offline sync
│   ├── utilities/
│   │   ├── favicon.ts         # Dynamic Canvas PNG Badge Favicon Updater
│   │   └── textCraft.ts       # Algorithms, Roman vinculum, QR, Diceware, WCAG 2.1
│   └── data/
│       ├── storyDatabase.ts            # Master story index
│       ├── storyExpanded.ts           # 26 Letters (A-Z) x 5 Marathon Stories (130 Stories)
│       ├── hindiStoryDatabase.ts      # Devanagari Swar (स्वर) & Matras
│       ├── hindiConsonantsDatabase.ts # Devanagari Vyanjan (व्यंजन क से ह)
│       ├── challengeStoryDatabase.ts  # Pro-Hard, Punctuation, CamelCase, Code Syntax
│       ├── customRulePairEngine.ts    # Dual-Letter Bigrams (English & Hindi)
│       ├── dynamicWordEngine.ts       # Infinite Procedural Grammar Generator
│       ├── storyBank.ts               # Premchand, Kabir Ke Dohe & Space Science
│       └── allStory.ts                # Unified Data Aggregator & Export Router
```

---

## 🎨 Google Material Design 3 (M3) Web Specifications

1. **Authentic Pill-to-Rounded Shape Morphing:**
   - Buttons, filter chips, and segmented indicators smoothly morph from `rounded-full` (`9999px`) to expressive rounded containers (`14px - 28px`) on hover, focus-visible, and active press states via spring physics:
     ```css
     transition: border-radius 0.25s cubic-bezier(0.34, 1.35, 0.64, 1), transform 0.2s ease, box-shadow 0.2s ease;
     ```

2. **M3 Tonal Surface Elevation & Frosted Glassmorphism:**
   - Multi-layered frosted glass with `backdrop-filter: blur(28px) saturate(190%)`.
   - Luminous neon Electric Cyan (`#00F5FF`) accent border glows and focus rings.
   - Pure Dark OLED pitch-black `#000000` canvas optimization alongside Pastel Ice Light Mode.

3. **Complete Responsive Screen Layout:**
   - **Laptop & Desktop:** Locked 3-line arena, horizontal & vertical caret line stabilizer, expansive scoreboard, keyboard shortcuts (`Tab` to restart, `Esc` to exit fullscreen).
   - **Mobile Phones & Tablets:** Floating M3 bottom navigation dock, compact sticky Spotlight HUD, and horizontal virtual Devanagari matra ribbon for comfortable thumb typing.

---

## ⌨️ Typing Arena Engine

- **Monkeytype-Style Locked 3-Line Window:** Keeps the active typed line centered vertically and horizontally, eliminating distracting page jumps.
- **Active Word Live Focus Spotlight HUD:** Letter-by-letter live verification:
  * **Electric Cyan** = Verified Correct
  * **Red with micro-shake** = Typo / Mismatch
  * **Translucent** = Pending characters
  * Real-time chips showing the **next 3 upcoming words**.
- **Live M3 Scoreboard Chips:** Net WPM, Raw WPM, Accuracy (%), CPM, Target Key Hits, Errors, and Elapsed Seconds.
- **Devanagari Virtual Assist Ribbon:** Quick insertion for matras (ा, ि, ी, ु, ू, े, ै, ो, ौ, ं, ्) and conjuncts (क्त, त्य, ध्य, प्र, धर्म, द्ध).
- **Custom Text Mode:** Paste any article or code snippet with live character and word counters, or pick from literature presets.

---

## 🎛️ 11-in-1 M3 TextCraft Productivity Suite

1. **Master Case Converter:** UPPERCASE, lowercase, Title Case, Sentence case, camelCase, PascalCase, snake_case, kebab-case, aLtErNaTiNg, and Clean Markdown.
2. **Power Text Repeater:** Multiply text up to 1,000x with custom delimiters (`\n`, space, comma, pipe, numbered `1.`, custom string).
3. **Text Reverser & Upside-Down Flipper:** Character reverse, word order reverse, line order reverse, and full 180° Unicode flip mapping.
4. **Alphabetical Sorter & Cleaner:** A-Z, Z-A, length sort, deduplication, whitespace trimming, and Hindi collation (`Intl.Collator`).
5. **Roman Numeral Master:** Bidirectional Arabic (1 to 3,999,999) ↔ Roman numerals with vinculum overline bars (M̅, D̅, C̅, L̅, X̅, V̅) and step-by-step breakdown.
6. **Password Studio:** Length slider (6 to 128), character pool toggles, Diceware memorable passphrases, and cryptographic bit-entropy meter.
7. **Universal QR Code Studio:** Client-side Canvas QR generator (Text, URL, WiFi network, Email draft) with color customization and PNG download.
8. **Palette & Color Studio:** HEX ↔ RGB ↔ HSL ↔ HSV conversions, WCAG 2.1 AA/AAA contrast checker, and curated M3 palettes.
9. **Devanagari Ink Canvas:** Stylus and touch drawing pad with brush sizes, eraser, undo/redo stack, Hindi calligraphy guideline overlay (शिरोरेखा, मध्य रेखा, पद रेखा), and PNG export.
10. **Focus Stopwatch & Pomodoro:** 25/5 and 50/10 intervals with circular SVG progress ring, Web Audio harmonic chimes, and millisecond lap stopwatch.

---

## 📜 Official 1920x1080 Mastery Certificate Engine

- Renders authenticated, 300-DPI-equivalent vector certificates onto HTML5 Canvas.
- Includes recipient name, target letter, category, language, verified Net WPM, Accuracy %, unique verification hash (`TYPO-2026-XXXXX`), issue date, and golden seal.
- 1-click **Download HD PNG** and **Printable PDF** layout.

---

## 🚀 Quickstart & Development

### 1. Installation
```bash
git clone https://github.com/adarsh/typolab-studio.git
cd typolab-main
npm install
```

### 2. Run Local Development Server
```bash
npm run dev
```
Navigate to `http://localhost:3000` in your modern browser.

### 3. Build for Production
```bash
npm run build
```
Generates an optimized production bundle in the `dist/` directory with Cache-First Service Worker and master PNG icon assets.

### 4. Run TypeScript Lint
```bash
npm run lint
```

---

## 📄 License
MIT License © 2026 Adarsh Vishwakarma. Built with React 19, TypeScript, Tailwind CSS v4, and Material Design 3.
