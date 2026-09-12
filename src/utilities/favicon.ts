/**
 * Dynamic Canvas PNG Badge Favicon Generator
 * Dynamically paints high-resolution canvas icon with current accent color
 * and strictly updates <link rel="icon"> to high-res PNG format.
 * Default fallback is the master PNG: /icon.png
 */

export function updateDynamicFavicon(accentColor: string = '#00F5FF', glyph: string = 'TC'): void {
  if (typeof document === 'undefined') return;

  try {
    const canvas = document.createElement('canvas');
    canvas.width = 64;
    canvas.height = 64;
    const ctx = canvas.getContext('2d');
    if (!ctx) return;

    // Background rounded squircle
    const radius = 18;
    ctx.beginPath();
    ctx.moveTo(radius, 0);
    ctx.lineTo(64 - radius, 0);
    ctx.quadraticCurveTo(64, 0, 64, radius);
    ctx.lineTo(64, 64 - radius);
    ctx.quadraticCurveTo(64, 64, 64 - radius, 64);
    ctx.lineTo(radius, 64);
    ctx.quadraticCurveTo(0, 64, 0, 64 - radius);
    ctx.lineTo(0, radius);
    ctx.quadraticCurveTo(0, 0, radius, 0);
    ctx.closePath();

    // Dark glass background gradient
    const grad = ctx.createLinearGradient(0, 0, 64, 64);
    grad.addColorStop(0, '#090D16');
    grad.addColorStop(1, '#000000');
    ctx.fillStyle = grad;
    ctx.fill();

    // Glowing stroke with accent color
    ctx.lineWidth = 3;
    ctx.strokeStyle = accentColor;
    ctx.shadowColor = accentColor;
    ctx.shadowBlur = 8;
    ctx.stroke();
    ctx.shadowBlur = 0;

    // Center text or glyph
    ctx.fillStyle = accentColor;
    ctx.font = '900 24px "Outfit", "Google Sans Flex", sans-serif';
    ctx.textAlign = 'center';
    ctx.textBaseline = 'middle';
    ctx.fillText(glyph.slice(0, 2), 32, 33);

    // Neon accent indicator dot
    ctx.fillStyle = '#FFFFFF';
    ctx.beginPath();
    ctx.arc(48, 48, 3.5, 0, Math.PI * 2);
    ctx.fill();

    const dataUrl = canvas.toDataURL('image/png');

    // Update or create favicon link elements strictly as PNG
    let favIcon = document.getElementById('dynamicFavicon') as HTMLLinkElement | null;
    if (!favIcon) {
      favIcon = document.createElement('link');
      favIcon.id = 'dynamicFavicon';
      favIcon.rel = 'icon';
      favIcon.type = 'image/png';
      document.head.appendChild(favIcon);
    }
    favIcon.type = 'image/png';
    favIcon.href = dataUrl;

    // Update apple-touch-icon
    let appleTouch = document.querySelector('link[rel="apple-touch-icon"]') as HTMLLinkElement | null;
    if (appleTouch) {
      appleTouch.type = 'image/png';
      appleTouch.href = dataUrl;
    }
  } catch (err) {
    console.warn('Dynamic favicon generation fallback to master PNG:', err);
    let favIcon = document.getElementById('dynamicFavicon') as HTMLLinkElement | null;
    if (favIcon) {
      favIcon.type = 'image/png';
      favIcon.href = '/icon.png';
    }
  }
}
