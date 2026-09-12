/**
 * Web Audio API Mechanical Keyboard Synthesizer
 * Production-grade synthesis for Cherry MX Blue, Red, and Brown switch profiles,
 * spacebar acoustic resonance, error feedback, and Pomodoro chimes.
 */

import { SwitchProfile } from '../types';

export class KeyboardSynthesizer {
  private ctx: AudioContext | null = null;
  private isMuted: boolean = false;
  private currentProfile: SwitchProfile = 'blue';

  constructor() {
    this.setupGestureListeners();
  }

  private setupGestureListeners() {
    if (typeof window === 'undefined') return;
    const unlock = () => {
      this.resumeContext();
      window.removeEventListener('keydown', unlock);
      window.removeEventListener('pointerdown', unlock);
      window.removeEventListener('click', unlock);
    };
    window.addEventListener('keydown', unlock, { passive: true });
    window.addEventListener('pointerdown', unlock, { passive: true });
    window.addEventListener('click', unlock, { passive: true });
  }

  private getAudioContext(): AudioContext | null {
    if (typeof window === 'undefined') return null;
    if (!this.ctx) {
      const AudioCtx = window.AudioContext || (window as unknown as { webkitAudioContext: typeof AudioContext }).webkitAudioContext;
      if (AudioCtx) {
        this.ctx = new AudioCtx();
      }
    }
    if (this.ctx && this.ctx.state === 'suspended') {
      this.ctx.resume().catch(() => {});
    }
    return this.ctx;
  }

  public resumeContext(): void {
    if (this.ctx && this.ctx.state === 'suspended') {
      this.ctx.resume().catch(() => {});
    }
  }

  public setMuted(muted: boolean): void {
    this.isMuted = muted;
  }

  public isSoundMuted(): boolean {
    return this.isMuted;
  }

  public setSwitchProfile(profile: SwitchProfile): void {
    this.currentProfile = profile;
  }

  public getSwitchProfile(): SwitchProfile {
    return this.currentProfile;
  }

  /**
   * Main key stroke player with switch profile routing
   */
  public playKeySound(key: string, isError: boolean = false): void {
    if (this.isMuted) return;
    const ctx = this.getAudioContext();
    if (!ctx) return;

    const now = ctx.currentTime;

    if (isError) {
      this.playErrorCue(ctx, now);
      return;
    }

    if (key === ' ' || key === 'Space') {
      this.playSpacebarSound(ctx, now);
      return;
    }

    if (key === 'Enter') {
      this.playEnterSound(ctx, now);
      return;
    }

    if (key === 'Backspace') {
      this.playBackspaceSound(ctx, now);
      return;
    }

    // Route based on selected switch profile
    switch (this.currentProfile) {
      case 'blue':
        this.playCherryMXBlue(ctx, now, key);
        break;
      case 'red':
        this.playCherryMXRed(ctx, now, key);
        break;
      case 'brown':
        this.playCherryMXBrown(ctx, now, key);
        break;
      default:
        this.playCherryMXBlue(ctx, now, key);
    }
  }

  /**
   * Cherry MX Blue: Crisp high-frequency snap with subtle metallic spring resonance
   */
  private playCherryMXBlue(ctx: AudioContext, now: number, char: string) {
    const jitter = 0.95 + ((char.charCodeAt(0) || 65) % 11) * 0.01;

    // 1. High-frequency click snap
    const clickOsc = ctx.createOscillator();
    const clickGain = ctx.createGain();
    const bandpass = ctx.createBiquadFilter();

    clickOsc.type = 'triangle';
    clickOsc.frequency.setValueAtTime(3200 * jitter, now);
    clickOsc.frequency.exponentialRampToValueAtTime(1200 * jitter, now + 0.018);

    bandpass.type = 'bandpass';
    bandpass.frequency.setValueAtTime(2800 * jitter, now);
    bandpass.Q.setValueAtTime(4.0, now);

    clickGain.gain.setValueAtTime(0.18, now);
    clickGain.gain.exponentialRampToValueAtTime(0.0001, now + 0.022);

    clickOsc.connect(bandpass);
    bandpass.connect(clickGain);
    clickGain.connect(ctx.destination);

    clickOsc.start(now);
    clickOsc.stop(now + 0.025);

    // 2. Metallic spring ping (subtle resonance)
    const pingOsc = ctx.createOscillator();
    const pingGain = ctx.createGain();
    pingOsc.type = 'sine';
    pingOsc.frequency.setValueAtTime(4400 * jitter, now + 0.005);
    pingGain.gain.setValueAtTime(0.035, now + 0.005);
    pingGain.gain.exponentialRampToValueAtTime(0.0001, now + 0.045);

    pingOsc.connect(pingGain);
    pingGain.connect(ctx.destination);
    pingOsc.start(now + 0.005);
    pingOsc.stop(now + 0.05);

    // 3. Housing bottom-out thud
    const bodyOsc = ctx.createOscillator();
    const bodyGain = ctx.createGain();
    bodyOsc.type = 'triangle';
    bodyOsc.frequency.setValueAtTime(280 * jitter, now);
    bodyOsc.frequency.exponentialRampToValueAtTime(80 * jitter, now + 0.03);

    bodyGain.gain.setValueAtTime(0.12, now);
    bodyGain.gain.exponentialRampToValueAtTime(0.0001, now + 0.032);

    bodyOsc.connect(bodyGain);
    bodyGain.connect(ctx.destination);
    bodyOsc.start(now);
    bodyOsc.stop(now + 0.035);
  }

  /**
   * Cherry MX Red: Deep, smooth, linear downstroke impact with thocky warmth
   */
  private playCherryMXRed(ctx: AudioContext, now: number, char: string) {
    const jitter = 0.94 + ((char.charCodeAt(0) || 65) % 13) * 0.01;

    const osc = ctx.createOscillator();
    const gain = ctx.createGain();
    const filter = ctx.createBiquadFilter();

    osc.type = 'sine';
    osc.frequency.setValueAtTime(220 * jitter, now);
    osc.frequency.exponentialRampToValueAtTime(55 * jitter, now + 0.04);

    filter.type = 'lowpass';
    filter.frequency.setValueAtTime(650, now);

    gain.gain.setValueAtTime(0.22, now);
    gain.gain.exponentialRampToValueAtTime(0.0001, now + 0.042);

    osc.connect(filter);
    filter.connect(gain);
    gain.connect(ctx.destination);

    osc.start(now);
    osc.stop(now + 0.045);
  }

  /**
   * Cherry MX Brown: Tactile bump with medium thock and dampened housing impact
   */
  private playCherryMXBrown(ctx: AudioContext, now: number, char: string) {
    const jitter = 0.96 + ((char.charCodeAt(0) || 65) % 9) * 0.01;

    // Bump pulse
    const bumpOsc = ctx.createOscillator();
    const bumpGain = ctx.createGain();
    bumpOsc.type = 'triangle';
    bumpOsc.frequency.setValueAtTime(420 * jitter, now);
    bumpOsc.frequency.exponentialRampToValueAtTime(160 * jitter, now + 0.02);

    bumpGain.gain.setValueAtTime(0.14, now);
    bumpGain.gain.exponentialRampToValueAtTime(0.0001, now + 0.025);

    bumpOsc.connect(bumpGain);
    bumpGain.connect(ctx.destination);
    bumpOsc.start(now);
    bumpOsc.stop(now + 0.028);

    // Warm body thud
    const bodyOsc = ctx.createOscillator();
    const bodyGain = ctx.createGain();
    bodyOsc.type = 'sine';
    bodyOsc.frequency.setValueAtTime(180 * jitter, now + 0.005);
    bodyOsc.frequency.exponentialRampToValueAtTime(50 * jitter, now + 0.04);

    bodyGain.gain.setValueAtTime(0.16, now + 0.005);
    bodyGain.gain.exponentialRampToValueAtTime(0.0001, now + 0.045);

    bodyOsc.connect(bodyGain);
    bodyGain.connect(ctx.destination);
    bodyOsc.start(now + 0.005);
    bodyOsc.stop(now + 0.048);
  }

  /**
   * Spacebar: Deep resonant acoustic bass thud with wide stabilizer acoustic spread
   */
  private playSpacebarSound(ctx: AudioContext, now: number) {
    const jitter = 0.97 + Math.random() * 0.06;

    // Deep sub-bass punch
    const osc = ctx.createOscillator();
    const gain = ctx.createGain();
    const filter = ctx.createBiquadFilter();

    osc.type = 'triangle';
    osc.frequency.setValueAtTime(130 * jitter, now);
    osc.frequency.exponentialRampToValueAtTime(38 * jitter, now + 0.065);

    filter.type = 'lowpass';
    filter.frequency.setValueAtTime(750, now);

    gain.gain.setValueAtTime(0.28, now);
    gain.gain.exponentialRampToValueAtTime(0.0001, now + 0.07);

    osc.connect(filter);
    filter.connect(gain);
    gain.connect(ctx.destination);

    osc.start(now);
    osc.stop(now + 0.075);
  }

  /**
   * Enter key: Solid resonant downstroke
   */
  private playEnterSound(ctx: AudioContext, now: number) {
    const osc = ctx.createOscillator();
    const gain = ctx.createGain();
    osc.type = 'square';
    osc.frequency.setValueAtTime(380, now);
    osc.frequency.exponentialRampToValueAtTime(95, now + 0.045);

    gain.gain.setValueAtTime(0.12, now);
    gain.gain.exponentialRampToValueAtTime(0.0001, now + 0.045);

    osc.connect(gain);
    gain.connect(ctx.destination);
    osc.start(now);
    osc.stop(now + 0.048);
  }

  /**
   * Backspace key: Quick tactile snap
   */
  private playBackspaceSound(ctx: AudioContext, now: number) {
    const osc = ctx.createOscillator();
    const gain = ctx.createGain();
    osc.type = 'triangle';
    osc.frequency.setValueAtTime(520, now);
    osc.frequency.exponentialRampToValueAtTime(160, now + 0.028);

    gain.gain.setValueAtTime(0.13, now);
    gain.gain.exponentialRampToValueAtTime(0.0001, now + 0.028);

    osc.connect(gain);
    gain.connect(ctx.destination);
    osc.start(now);
    osc.stop(now + 0.03);
  }

  /**
   * Error Cue: Soft, non-jarring low-frequency notification
   */
  private playErrorCue(ctx: AudioContext, now: number) {
    const osc = ctx.createOscillator();
    const gain = ctx.createGain();
    osc.type = 'sine';
    osc.frequency.setValueAtTime(180, now);
    osc.frequency.exponentialRampToValueAtTime(130, now + 0.09);

    gain.gain.setValueAtTime(0.09, now);
    gain.gain.exponentialRampToValueAtTime(0.0001, now + 0.095);

    osc.connect(gain);
    gain.connect(ctx.destination);
    osc.start(now);
    osc.stop(now + 0.1);
  }

  /**
   * Pomodoro Chime: Pleasant harmonic notification
   */
  public playPomodoroChime(): void {
    if (this.isMuted) return;
    const ctx = this.getAudioContext();
    if (!ctx) return;

    const now = ctx.currentTime;
    const notes = [523.25, 659.25, 783.99, 1046.5]; // C5, E5, G5, C6 arpeggio

    notes.forEach((freq, idx) => {
      const osc = ctx.createOscillator();
      const gain = ctx.createGain();
      const t = now + idx * 0.1;

      osc.type = 'sine';
      osc.frequency.setValueAtTime(freq, t);

      gain.gain.setValueAtTime(0.14, t);
      gain.gain.exponentialRampToValueAtTime(0.0001, t + 0.4);

      osc.connect(gain);
      gain.connect(ctx.destination);
      osc.start(t);
      osc.stop(t + 0.45);
    });
  }
}

export const keyboardSynth = new KeyboardSynthesizer();
