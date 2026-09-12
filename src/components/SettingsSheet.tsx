import React from 'react';
import { 
  X, Moon, Sun, Volume2, VolumeX, Eye, Sparkles, 
  Smartphone, RotateCcw, Download, Check, Sliders, Music
} from 'lucide-react';
import { AppSettings, SwitchProfile } from '../types';
import { keyboardSynth } from '../audio/keyboardSynth';

interface SettingsSheetProps {
  isOpen: boolean;
  onClose: () => void;
  settings: AppSettings;
  onUpdateSettings: (newSettings: Partial<AppSettings>) => void;
  onResetSettings: () => void;
  isInstallable: boolean;
  onInstall: () => void;
  onOpenHistory?: () => void;
}

const PRESET_COLORS = [
  { name: 'Electric Cyan', color: '#00F5FF' },
  { name: 'Emerald Glow', color: '#10B981' },
  { name: 'Sunset Coral', color: '#F43F5E' },
  { name: 'Violet Plasma', color: '#8B5CF6' },
  { name: 'Amber Gold', color: '#F59E0B' },
  { name: 'Sky Azure', color: '#0EA5E9' },
  { name: 'Cyber Indigo', color: '#6366F1' },
  { name: 'Pure White', color: '#FFFFFF' }
];

const GOOGLE_FONTS = [
  { id: 'Comic Neue', name: 'Comic Neue (Friendly Casual)' },
  { id: 'Kalam', name: 'Kalam (Handwritten Hindi/Latin)' },
  { id: 'Google Sans Flex', name: 'Google Sans Flex (Material 3)' },
  { id: 'Outfit', name: 'Outfit (Modern Geometric)' },
  { id: 'Inter', name: 'Inter (Neutral Clean)' },
  { id: 'Roboto Flex', name: 'Roboto Flex (Adaptive)' },
  { id: 'Plus Jakarta Sans', name: 'Plus Jakarta Sans (Crisp Modern)' },
  { id: 'Poppins', name: 'Poppins (Geometric Rounded)' },
  { id: 'Fira Code', name: 'Fira Code (Monospace Coding)' },
  { id: 'JetBrains Mono', name: 'JetBrains Mono (Developer Mono)' },
  { id: 'Lexend', name: 'Lexend (High Reading Speed)' },
  { id: 'Space Grotesk', name: 'Space Grotesk (Tech Modern)' },
  { id: 'Playfair Display', name: 'Playfair Display (Editorial Serif)' },
  { id: 'Cinzel', name: 'Cinzel (Classical Roman)' },
  { id: 'Noto Sans Devanagari', name: 'Noto Sans Devanagari (Hindi Native)' }
];

export const SettingsSheet: React.FC<SettingsSheetProps> = ({
  isOpen,
  onClose,
  settings,
  onUpdateSettings,
  onResetSettings,
  isInstallable,
  onInstall,
  onOpenHistory
}) => {
  if (!isOpen) return null;

  const handleSwitchProfile = (profile: SwitchProfile) => {
    keyboardSynth.setSwitchProfile(profile);
    onUpdateSettings({ switchProfile: profile });
    keyboardSynth.playKeySound(' ');
  };

  return (
    <div className="fixed inset-0 z-50 flex items-end justify-center bg-black/70 backdrop-blur-md transition-all duration-300 animate-fadeIn">
      <div 
        className="fixed inset-0"
        onClick={onClose}
        aria-hidden="true"
      />
      
      <div 
        className="relative w-full max-w-2xl rounded-t-[32px] border-t border-x border-[#00F5FF]/30 p-6 md:p-8 shadow-[0_-10px_60px_rgba(0,245,255,0.25)] transition-all duration-300 max-h-[88vh] overflow-y-auto"
        style={{
          backgroundColor: settings.pureDark && settings.theme === 'dark'
            ? '#000000'
            : settings.theme === 'dark'
            ? 'rgba(9, 13, 22, 0.94)'
            : 'rgba(240, 247, 250, 0.94)',
          backdropFilter: settings.ultraGlass ? 'blur(36px) saturate(190%)' : 'blur(20px)',
        }}
      >
        {/* Material 3 Pill Drag Handle */}
        <div className="mx-auto mb-5 h-1.5 w-16 rounded-full bg-white/30 cursor-grab active:cursor-grabbing hover:bg-[#00F5FF]/60 transition-colors" />

        {/* Header */}
        <div className="flex items-center justify-between pb-4 border-b border-white/10">
          <div>
            <h2 className="text-xl font-black tracking-tight flex items-center gap-2">
              <Sliders className="w-5 h-5 text-[#00F5FF]" /> Studio Settings & Acoustics
            </h2>
            <p className="text-xs text-white/60 mt-0.5">Customise Material 3 glass optics, acoustics, typography & screen engine</p>
          </div>
          <button
            onClick={onClose}
            className="rounded-full p-2 text-white/70 hover:text-white hover:bg-white/10 transition active:scale-95"
            aria-label="Close settings"
          >
            <X className="h-5 w-5" />
          </button>
        </div>

        <div className="space-y-6 pt-5">
          {/* Theme & Pure Dark OLED */}
          <div className="space-y-3">
            <label className="text-xs font-bold uppercase tracking-wider text-white/60">
              Appearance Glass Mode
            </label>
            <div className="grid grid-cols-2 gap-3">
              <button
                type="button"
                onClick={() => {
                  onUpdateSettings({ theme: 'dark' });
                  keyboardSynth.playKeySound(' ');
                }}
                className={`flex items-center justify-center gap-2.5 rounded-full py-3 text-xs font-bold transition-all ${
                  settings.theme === 'dark'
                    ? 'bg-[#00F5FF] text-[#003940] shadow-[0_0_20px_rgba(0,245,255,0.4)]'
                    : 'bg-white/5 border border-white/10 text-white/70 hover:bg-white/10'
                }`}
                style={{
                  borderRadius: settings.theme === 'dark' ? '16px' : '9999px',
                  transition: 'border-radius 0.25s cubic-bezier(0.34, 1.35, 0.64, 1), transform 0.2s ease, background 0.2s ease'
                }}
              >
                <Moon className="h-4 w-4" />
                <span>Dark Glass</span>
              </button>

              <button
                type="button"
                onClick={() => {
                  onUpdateSettings({ theme: 'light', pureDark: false });
                  keyboardSynth.playKeySound(' ');
                }}
                className={`flex items-center justify-center gap-2.5 rounded-full py-3 text-xs font-bold transition-all ${
                  settings.theme === 'light'
                    ? 'bg-[#00F5FF] text-[#003940] shadow-[0_0_20px_rgba(0,245,255,0.4)]'
                    : 'bg-white/5 border border-white/10 text-white/70 hover:bg-white/10'
                }`}
                style={{
                  borderRadius: settings.theme === 'light' ? '16px' : '9999px',
                  transition: 'border-radius 0.25s cubic-bezier(0.34, 1.35, 0.64, 1), transform 0.2s ease, background 0.2s ease'
                }}
              >
                <Sun className="h-4 w-4" />
                <span>Pastel Ice Light</span>
              </button>
            </div>

            {/* Pure Dark OLED Toggle */}
            {settings.theme === 'dark' && (
              <div className="flex items-center justify-between rounded-2xl border border-white/10 bg-white/5 p-3.5 mt-2">
                <div className="flex items-center gap-2.5">
                  <div className="h-4 w-4 rounded-full bg-black border border-white/30" />
                  <div>
                    <div className="text-xs font-bold text-white">Pure OLED Pitch Dark</div>
                    <div className="text-[11px] text-white/50">Pitch black (#000000) for OLED panels</div>
                  </div>
                </div>
                <button
                  type="button"
                  onClick={() => {
                    onUpdateSettings({ pureDark: !settings.pureDark });
                    keyboardSynth.playKeySound(' ');
                  }}
                  className={`relative inline-flex h-6 w-11 items-center rounded-full transition-colors ${
                    settings.pureDark ? 'bg-[#00F5FF]' : 'bg-white/20'
                  }`}
                >
                  <span
                    className={`inline-block h-4 w-4 transform rounded-full bg-slate-900 transition-transform ${
                      settings.pureDark ? 'translate-x-6' : 'translate-x-1'
                    }`}
                  />
                </button>
              </div>
            )}
          </div>

          {/* Web Audio Mechanical Switch Profiles */}
          <div className="space-y-3">
            <div className="flex items-center justify-between">
              <label className="text-xs font-bold uppercase tracking-wider text-white/60 flex items-center gap-1.5">
                <Music className="w-3.5 h-3.5 text-[#00F5FF]" /> Mechanical Switch Sound Synth
              </label>
              <button
                type="button"
                onClick={() => {
                  onUpdateSettings({ soundEnabled: !settings.soundEnabled });
                  keyboardSynth.setMuted(settings.soundEnabled);
                }}
                className="text-xs font-bold text-[#00F5FF] flex items-center gap-1"
              >
                {settings.soundEnabled ? <Volume2 className="w-3.5 h-3.5" /> : <VolumeX className="w-3.5 h-3.5" />}
                {settings.soundEnabled ? 'Acoustics On' : 'Muted'}
              </button>
            </div>

            <div className="grid grid-cols-3 gap-2.5">
              {[
                { id: 'blue' as SwitchProfile, name: 'Cherry MX Blue', desc: 'Crisp snap & spring ping' },
                { id: 'red' as SwitchProfile, name: 'Cherry MX Red', desc: 'Smooth, deep linear thock' },
                { id: 'brown' as SwitchProfile, name: 'Cherry MX Brown', desc: 'Tactile bump & damp clack' },
              ].map(sw => (
                <button
                  key={sw.id}
                  onClick={() => handleSwitchProfile(sw.id)}
                  className={`flex flex-col p-3 rounded-2xl border text-left transition-all ${
                    settings.switchProfile === sw.id
                      ? 'bg-[#00F5FF]/20 border-[#00F5FF] shadow-[0_0_15px_rgba(0,245,255,0.3)]'
                      : 'bg-white/5 border-white/10 hover:border-white/20'
                  }`}
                >
                  <span className={`text-xs font-bold ${settings.switchProfile === sw.id ? 'text-[#00F5FF]' : 'text-white'}`}>
                    {sw.name}
                  </span>
                  <span className="text-[10px] text-white/50 mt-1 leading-tight">{sw.desc}</span>
                </button>
              ))}
            </div>
          </div>

          {/* Accent Color Picker */}
          <div className="space-y-3">
            <label className="text-xs font-bold uppercase tracking-wider text-white/60">
              Electric Accent Glow
            </label>
            <div className="grid grid-cols-4 gap-2">
              {PRESET_COLORS.map(c => (
                <button
                  key={c.color}
                  type="button"
                  onClick={() => {
                    onUpdateSettings({ accentColor: c.color });
                    keyboardSynth.playKeySound(' ');
                  }}
                  className={`flex items-center gap-2 rounded-xl border p-2 text-xs font-semibold transition ${
                    settings.accentColor.toLowerCase() === c.color.toLowerCase()
                      ? 'border-[#00F5FF] bg-white/10 shadow-[0_0_12px_rgba(0,245,255,0.4)]'
                      : 'border-white/10 bg-white/5 opacity-70 hover:opacity-100'
                  }`}
                >
                  <span 
                    className="h-3.5 w-3.5 shrink-0 rounded-full shadow-sm"
                    style={{ backgroundColor: c.color }}
                  />
                  <span className="truncate text-white">{c.name}</span>
                </button>
              ))}
            </div>
          </div>

          {/* Typography Engine */}
          <div className="space-y-3">
            <label className="text-xs font-bold uppercase tracking-wider text-white/60">
              Font Family (15 Curated Typographic Scales)
            </label>
            <div className="max-h-48 overflow-y-auto pr-1 flex flex-col gap-1.5 scrollbar-thin">
              {GOOGLE_FONTS.map(f => (
                <button
                  key={f.id}
                  type="button"
                  onClick={() => {
                    onUpdateSettings({ font: f.id });
                    keyboardSynth.playKeySound(' ');
                  }}
                  className={`flex items-center justify-between rounded-xl border p-2.5 text-xs text-left transition ${
                    settings.font === f.id
                      ? 'border-[#00F5FF] bg-[#00F5FF]/15 text-[#00F5FF] font-black'
                      : 'border-white/10 bg-white/5 text-white/70 hover:bg-white/10'
                  }`}
                  style={{ fontFamily: f.id }}
                >
                  <span>{f.name}</span>
                  {settings.font === f.id && <Check className="h-4 w-4 shrink-0 text-[#00F5FF]" />}
                </button>
              ))}
            </div>
          </div>

          {/* Screen Wake Lock */}
          <div className="flex items-center justify-between rounded-2xl border border-white/10 bg-white/5 p-3.5">
            <div className="flex items-center gap-2.5">
              <Smartphone className="h-4 w-4 text-[#00F5FF]" />
              <div>
                <div className="text-xs font-bold text-white">Screen Wake Lock Engine</div>
                <div className="text-[11px] text-white/50">Prevents display from sleeping during endurance typing</div>
              </div>
            </div>
            <button
              type="button"
              onClick={() => {
                onUpdateSettings({ wakeLockEnabled: !settings.wakeLockEnabled });
                keyboardSynth.playKeySound(' ');
              }}
              className={`relative inline-flex h-6 w-11 items-center rounded-full transition-colors ${
                settings.wakeLockEnabled ? 'bg-[#00F5FF]' : 'bg-white/20'
              }`}
            >
              <span
                className={`inline-block h-4 w-4 transform rounded-full bg-slate-900 transition-transform ${
                  settings.wakeLockEnabled ? 'translate-x-6' : 'translate-x-1'
                }`}
              />
            </button>
          </div>

          {/* Action Footer: Reset Settings, Install PWA */}
          <div className="flex flex-wrap items-center justify-between gap-3 pt-4 border-t border-white/10">
            <button
              type="button"
              onClick={() => {
                onResetSettings();
                keyboardSynth.playKeySound('Backspace');
              }}
              className="flex items-center gap-1.5 rounded-full border border-white/10 bg-white/5 px-4 py-2 text-xs font-bold text-white/60 hover:text-white hover:bg-white/10 transition active:scale-95"
            >
              <RotateCcw className="h-3.5 w-3.5" />
              <span>Reset Defaults</span>
            </button>

            {isInstallable && (
              <button
                type="button"
                onClick={onInstall}
                className="flex items-center gap-1.5 rounded-full bg-[#00F5FF] px-5 py-2 text-xs font-black uppercase text-[#003940] shadow-[0_0_20px_rgba(0,245,255,0.4)] hover:brightness-110 transition active:scale-95"
              >
                <Download className="h-3.5 w-3.5" />
                <span>Install TypoLab PWA</span>
              </button>
            )}
          </div>
        </div>
      </div>
    </div>
  );
};
