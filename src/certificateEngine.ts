/**
 * TypoLab Studio - Professional High-Definition Mastery Certificate Engine
 * Renders a 1920x1080 300-DPI-equivalent vector-quality certificate on HTML5 Canvas
 */

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

/**
 * Generate a unique verification ID
 */
export function generateVerificationId(): string {
  const chars = 'ABCDEFGHJKLMNPQRSTUVWXYZ23456789';
  let rand = '';
  for (let i = 0; i < 5; i++) {
    rand += chars.charAt(Math.floor(Math.random() * chars.length));
  }
  const year = new Date().getFullYear();
  return `TYPO-${year}-${rand}`;
}

/**
 * Renders the complete 1920x1080 certificate onto the provided canvas
 */
export function renderMasteryCertificate(canvas: HTMLCanvasElement, data: CertificateData): void {
  canvas.width = 1920;
  canvas.height = 1080;
  const ctx = canvas.getContext('2d', { alpha: false });
  if (!ctx) return;

  const width = 1920;
  const height = 1080;

  // 1. Deep Midnight Luxury Gradient Background
  const bgGrad = ctx.createLinearGradient(0, 0, width, height);
  bgGrad.addColorStop(0, '#040711');
  bgGrad.addColorStop(0.3, '#081122');
  bgGrad.addColorStop(0.7, '#060D1A');
  bgGrad.addColorStop(1, '#02050D');
  ctx.fillStyle = bgGrad;
  ctx.fillRect(0, 0, width, height);

  // 2. Ambient Radial Glow Accents (Cyan & Gold)
  const cyanGlow = ctx.createRadialGradient(width * 0.2, height * 0.25, 50, width * 0.2, height * 0.25, 600);
  cyanGlow.addColorStop(0, 'rgba(0, 245, 255, 0.08)');
  cyanGlow.addColorStop(1, 'rgba(0, 245, 255, 0)');
  ctx.fillStyle = cyanGlow;
  ctx.fillRect(0, 0, width, height);

  const goldGlow = ctx.createRadialGradient(width * 0.8, height * 0.75, 50, width * 0.8, height * 0.75, 600);
  goldGlow.addColorStop(0, 'rgba(234, 179, 8, 0.08)');
  goldGlow.addColorStop(1, 'rgba(234, 179, 8, 0)');
  ctx.fillStyle = goldGlow;
  ctx.fillRect(0, 0, width, height);

  // Subtle Guilloche / Grid Pattern in background
  ctx.save();
  ctx.strokeStyle = 'rgba(0, 245, 255, 0.025)';
  ctx.lineWidth = 1;
  const gridSize = 40;
  for (let x = 60; x < width - 60; x += gridSize) {
    ctx.beginPath();
    ctx.moveTo(x, 60);
    ctx.lineTo(x, height - 60);
    ctx.stroke();
  }
  for (let y = 60; y < height - 60; y += gridSize) {
    ctx.beginPath();
    ctx.moveTo(60, y);
    ctx.lineTo(width - 60, y);
    ctx.stroke();
  }
  ctx.restore();

  // 3. Double Luxury Ornamental Borders
  const outerMargin = 45;
  const innerMargin = 60;

  // Outer Gold Border
  ctx.save();
  ctx.strokeStyle = '#D4AF37';
  ctx.lineWidth = 2.5;
  ctx.strokeRect(outerMargin, outerMargin, width - outerMargin * 2, height - outerMargin * 2);

  // Inner Electric Cyan Border
  ctx.strokeStyle = '#00F5FF';
  ctx.lineWidth = 1.5;
  ctx.strokeRect(innerMargin, innerMargin, width - innerMargin * 2, height - innerMargin * 2);

  // Corner Guilloche / Geometric Ornaments
  const cornerSize = 40;
  const corners = [
    { x: innerMargin, y: innerMargin, dx: 1, dy: 1 },
    { x: width - innerMargin, y: innerMargin, dx: -1, dy: 1 },
    { x: innerMargin, y: height - innerMargin, dx: 1, dy: -1 },
    { x: width - innerMargin, y: height - innerMargin, dx: -1, dy: -1 },
  ];

  ctx.strokeStyle = '#D4AF37';
  ctx.lineWidth = 2;
  corners.forEach(c => {
    ctx.beginPath();
    ctx.moveTo(c.x, c.y + c.dy * cornerSize);
    ctx.lineTo(c.x, c.y);
    ctx.lineTo(c.x + c.dx * cornerSize, c.y);
    ctx.stroke();

    ctx.beginPath();
    ctx.arc(c.x + c.dx * 16, c.y + c.dy * 16, 6, 0, Math.PI * 2);
    ctx.fillStyle = '#00F5FF';
    ctx.fill();
    ctx.stroke();
  });
  ctx.restore();

  // 4. Header Badge / Shield Icon
  ctx.save();
  ctx.textAlign = 'center';

  // Trophy / Crown Icon glyph
  ctx.font = 'bold 36px sans-serif';
  ctx.fillStyle = '#D4AF37';
  ctx.fillText('👑', width / 2, 130);

  // Studio Branding
  ctx.font = '800 22px "Plus Jakarta Sans", "Poppins", sans-serif';
  ctx.letterSpacing = '8px';
  ctx.fillStyle = '#00F5FF';
  ctx.fillText('TYPOLAB STUDIO EVALUATION SYSTEM', width / 2, 170);

  // Main Certificate Title
  ctx.font = '900 44px "Cinzel", "Playfair Display", "Times New Roman", serif';
  ctx.fillStyle = '#FFFFFF';
  ctx.letterSpacing = '2px';
  ctx.fillText('CERTIFICATE OF TYPING MASTERY', width / 2, 230);

  // Subtitle
  ctx.font = '600 16px "Plus Jakarta Sans", sans-serif';
  ctx.letterSpacing = '4px';
  ctx.fillStyle = '#D4AF37';
  ctx.fillText('TACTILE PROFICIENCY & NEUROMUSCULAR VELOCITY VERIFICATION', width / 2, 265);

  // Decorative Divider Line
  const lineGrad = ctx.createLinearGradient(width / 2 - 300, 0, width / 2 + 300, 0);
  lineGrad.addColorStop(0, 'rgba(0, 245, 255, 0)');
  lineGrad.addColorStop(0.5, '#00F5FF');
  lineGrad.addColorStop(1, 'rgba(0, 245, 255, 0)');
  ctx.fillStyle = lineGrad;
  ctx.fillRect(width / 2 - 300, 285, 600, 2);

  // "This credential is authenticated and awarded to"
  ctx.font = 'italic 400 19px "Merriweather", "Playfair Display", Georgia, serif';
  ctx.fillStyle = 'rgba(255, 255, 255, 0.75)';
  ctx.fillText('This official credential is systematically authenticated and awarded to', width / 2, 335);

  // Recipient Name in Display Cursive / Serif
  ctx.font = '700 58px "Cinzel", "Playfair Display", "Caveat", serif';
  ctx.fillStyle = '#00F5FF';
  const nameToDisplay = data.recipientName.trim() || 'Master Typist';
  ctx.fillText(nameToDisplay, width / 2, 410);

  // Underline under recipient name
  const nameWidth = Math.max(350, ctx.measureText(nameToDisplay).width + 60);
  const nameLineGrad = ctx.createLinearGradient(width / 2 - nameWidth / 2, 0, width / 2 + nameWidth / 2, 0);
  nameLineGrad.addColorStop(0, 'rgba(212, 175, 55, 0)');
  nameLineGrad.addColorStop(0.5, '#D4AF37');
  nameLineGrad.addColorStop(1, 'rgba(212, 175, 55, 0)');
  ctx.fillStyle = nameLineGrad;
  ctx.fillRect(width / 2 - nameWidth / 2, 430, nameWidth, 2.5);

  // Achievement Description
  ctx.font = '400 19px "Plus Jakarta Sans", "Inter", sans-serif';
  ctx.fillStyle = 'rgba(255, 255, 255, 0.88)';
  const langLabel = data.language === 'hi' ? 'Hindi Devanagari' : 'English';
  const catLabel = data.category.toUpperCase();
  ctx.fillText(
    `For demonstrating outstanding tactile endurance and accuracy across the Hyper-Density Marathon Drill:`,
    width / 2,
    485
  );

  ctx.font = '700 23px "Plus Jakarta Sans", sans-serif';
  ctx.fillStyle = '#D4AF37';
  ctx.fillText(
    `Target Focus: [ ${data.targetKey} ]  •  Module: [ ${catLabel} - ${langLabel} ]`,
    width / 2,
    525
  );

  // 5. Four Verification Metric Badges (Glassmorphic Cards)
  const badgeWidth = 240;
  const badgeHeight = 110;
  const gap = 30;
  const totalBadgeWidth = badgeWidth * 4 + gap * 3;
  const startX = (width - totalBadgeWidth) / 2;
  const badgeY = 580;

  const metrics = [
    { label: 'NET TYPING SPEED', value: `${data.netWpm} WPM`, sub: `Raw: ${data.rawWpm} WPM`, color: '#00F5FF' },
    { label: 'TACTILE ACCURACY', value: `${data.accuracy}%`, sub: `${data.totalKeystrokes} Keystrokes`, color: '#10B981' },
    { label: 'THROUGHPUT', value: `${data.cpm} CPM`, sub: 'Chars / Min', color: '#F59E0B' },
    { label: 'TARGET KEY MASTERY', value: `${data.targetKeyHits} Hits`, sub: `Expected: ${data.targetKeyExpected}`, color: '#00F5FF' },
  ];

  metrics.forEach((m, idx) => {
    const x = startX + idx * (badgeWidth + gap);

    // Pill background
    ctx.save();
    ctx.fillStyle = 'rgba(15, 23, 42, 0.75)';
    ctx.strokeStyle = 'rgba(0, 245, 255, 0.25)';
    ctx.lineWidth = 1.5;

    // Rounded rectangle
    const r = 16;
    ctx.beginPath();
    ctx.moveTo(x + r, badgeY);
    ctx.lineTo(x + badgeWidth - r, badgeY);
    ctx.quadraticCurveTo(x + badgeWidth, badgeY, x + badgeWidth, badgeY + r);
    ctx.lineTo(x + badgeWidth, badgeY + badgeHeight - r);
    ctx.quadraticCurveTo(x + badgeWidth, badgeY + badgeHeight, x + badgeWidth - r, badgeY + badgeHeight);
    ctx.lineTo(x + r, badgeY + badgeHeight);
    ctx.quadraticCurveTo(x, badgeY + badgeHeight, x, badgeY + badgeHeight - r);
    ctx.lineTo(x, badgeY + r);
    ctx.quadraticCurveTo(x, badgeY, x + r, badgeY);
    ctx.closePath();
    ctx.fill();
    ctx.stroke();

    // Metric text
    ctx.textAlign = 'center';
    ctx.font = '700 12px "Plus Jakarta Sans", sans-serif';
    ctx.letterSpacing = '1.5px';
    ctx.fillStyle = 'rgba(255, 255, 255, 0.6)';
    ctx.fillText(m.label, x + badgeWidth / 2, badgeY + 30);

    ctx.font = '900 28px "Plus Jakarta Sans", sans-serif';
    ctx.letterSpacing = '0px';
    ctx.fillStyle = m.color;
    ctx.fillText(m.value, x + badgeWidth / 2, badgeY + 68);

    ctx.font = '500 12px "Plus Jakarta Sans", sans-serif';
    ctx.fillStyle = 'rgba(255, 255, 255, 0.5)';
    ctx.fillText(m.sub, x + badgeWidth / 2, badgeY + 92);
    ctx.restore();
  });

  // 6. Bottom Row: Holographic Seal, Verification ID, and Signature Line
  const sealCenterX = 240;
  const sealCenterY = 875;
  const sealRadius = 80;

  // Holographic Golden / Cyan Seal
  ctx.save();
  // Outer ray ring
  ctx.strokeStyle = '#D4AF37';
  ctx.lineWidth = 3;
  ctx.beginPath();
  ctx.arc(sealCenterX, sealCenterY, sealRadius, 0, Math.PI * 2);
  ctx.stroke();

  // Star rays inside seal
  ctx.strokeStyle = 'rgba(0, 245, 255, 0.4)';
  ctx.lineWidth = 1;
  for (let a = 0; a < Math.PI * 2; a += Math.PI / 12) {
    ctx.beginPath();
    ctx.moveTo(sealCenterX + Math.cos(a) * (sealRadius - 15), sealCenterY + Math.sin(a) * (sealRadius - 15));
    ctx.lineTo(sealCenterX + Math.cos(a) * (sealRadius - 4), sealCenterY + Math.sin(a) * (sealRadius - 4));
    ctx.stroke();
  }

  // Inner circle
  ctx.beginPath();
  ctx.arc(sealCenterX, sealCenterY, sealRadius - 18, 0, Math.PI * 2);
  ctx.fillStyle = 'rgba(8, 17, 34, 0.9)';
  ctx.fill();
  ctx.strokeStyle = '#00F5FF';
  ctx.stroke();

  // Seal Icon & Text
  ctx.font = 'bold 24px sans-serif';
  ctx.fillStyle = '#D4AF37';
  ctx.textAlign = 'center';
  ctx.fillText('★ 2026 ★', sealCenterX, sealCenterY - 14);

  ctx.font = '800 11px "Plus Jakarta Sans", sans-serif';
  ctx.letterSpacing = '1px';
  ctx.fillStyle = '#00F5FF';
  ctx.fillText('VERIFIED', sealCenterX, sealCenterY + 8);
  ctx.fillText('MASTERY', sealCenterX, sealCenterY + 22);

  // Ribbons hanging from seal
  ctx.fillStyle = 'rgba(212, 175, 55, 0.4)';
  ctx.beginPath();
  ctx.moveTo(sealCenterX - 25, sealCenterY + sealRadius - 5);
  ctx.lineTo(sealCenterX - 35, sealCenterY + sealRadius + 45);
  ctx.lineTo(sealCenterX - 15, sealCenterY + sealRadius + 30);
  ctx.lineTo(sealCenterX - 5, sealCenterY + sealRadius + 45);
  ctx.lineTo(sealCenterX - 5, sealCenterY + sealRadius - 5);
  ctx.fill();

  ctx.fillStyle = 'rgba(0, 245, 255, 0.4)';
  ctx.beginPath();
  ctx.moveTo(sealCenterX + 5, sealCenterY + sealRadius - 5);
  ctx.lineTo(sealCenterX + 5, sealCenterY + sealRadius + 45);
  ctx.lineTo(sealCenterX + 20, sealCenterY + sealRadius + 30);
  ctx.lineTo(sealCenterX + 35, sealCenterY + sealRadius + 45);
  ctx.lineTo(sealCenterX + 25, sealCenterY + sealRadius - 5);
  ctx.fill();
  ctx.restore();

  // Center Info: Verification ID and Date
  ctx.save();
  ctx.textAlign = 'center';
  ctx.font = '700 15px "Plus Jakarta Sans", sans-serif';
  ctx.letterSpacing = '2px';
  ctx.fillStyle = '#00F5FF';
  ctx.fillText(`VERIFICATION ID: ${data.verificationId}`, width / 2, 850);

  ctx.font = '500 14px "Plus Jakarta Sans", sans-serif';
  ctx.letterSpacing = '1px';
  ctx.fillStyle = 'rgba(255, 255, 255, 0.65)';
  ctx.fillText(`ISSUED: ${data.issueDate}  •  AUTHENTICATED VIA TYPOLAB EVALUATION ENGINE`, width / 2, 880);

  ctx.font = 'italic 12px Georgia, serif';
  ctx.fillStyle = 'rgba(255, 255, 255, 0.4)';
  ctx.fillText('Non-transferable tactile credential recorded in permanent session telemetry.', width / 2, 908);
  ctx.restore();

  // Right Side: Signature & Stamp
  const sigX = width - 280;
  const sigY = 880;

  ctx.save();
  ctx.textAlign = 'center';

  // Digital Signature Script
  ctx.font = 'italic 34px "Caveat", "Playfair Display", cursive';
  ctx.fillStyle = '#00F5FF';
  ctx.fillText('TypoLab AI System', sigX, sigY - 20);

  // Signature line
  ctx.strokeStyle = '#D4AF37';
  ctx.lineWidth = 1.5;
  ctx.beginPath();
  ctx.moveTo(sigX - 120, sigY);
  ctx.lineTo(sigX + 120, sigY);
  ctx.stroke();

  ctx.font = '700 12px "Plus Jakarta Sans", sans-serif';
  ctx.letterSpacing = '1.5px';
  ctx.fillStyle = 'rgba(255, 255, 255, 0.7)';
  ctx.fillText('TACTILE EVALUATION DIRECTOR', sigX, sigY + 22);

  ctx.font = '500 11px "Plus Jakarta Sans", sans-serif';
  ctx.fillStyle = 'rgba(255, 255, 255, 0.45)';
  ctx.fillText('TypoLab Automated Accreditation', sigX, sigY + 40);
  ctx.restore();
}

/**
 * Downloads the certificate from the canvas as a 1920x1080 PNG
 */
export function downloadCertificateAsPNG(canvas: HTMLCanvasElement, filename: string = 'TypoLab_Mastery_Certificate.png'): void {
  const link = document.createElement('a');
  link.download = filename;
  link.href = canvas.toDataURL('image/png', 1.0);
  document.body.appendChild(link);
  link.click();
  document.body.removeChild(link);
}

/**
 * Triggers printing of the certificate
 */
export function printCertificate(canvas: HTMLCanvasElement): void {
  const dataUrl = canvas.toDataURL('image/png');
  const printWindow = window.open('', '_blank');
  if (printWindow) {
    printWindow.document.write(`
      <!DOCTYPE html>
      <html>
        <head>
          <title>TypoLab Mastery Certificate</title>
          <style>
            @page { size: landscape; margin: 0; }
            body { margin: 0; background: #000; display: flex; align-items: center; justify-content: center; height: 100vh; }
            img { width: 100vw; height: auto; max-height: 100vh; object-fit: contain; }
          </style>
        </head>
        <body>
          <img src="${dataUrl}" onload="window.print();" />
        </body>
      </html>
    `);
    printWindow.document.close();
  }
}
