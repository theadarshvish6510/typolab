package bitpit.launcher.theming.editor;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import b.BOj7Lk43NwFnPA7WQbM8o9fGX8;
import b.J6fVPc4iLDMOxXEbo87fhumCX;
import b.JTRgl741A5wx8stfjppSRTWZeS;
import b.JUDOL0fUbeJYs;
import b.Ne7IrXfSjRisooSM;
import b.PiLuoCym8e;
import b.Qs5il4A81sbf73pL1Mwnj;
import b.RTnh92nsql4MTkUASzqsQY6;
import b.UgxoLusfimrPDl;
import b.VakjWjkrVf1;
import b.W0srfC3hNCwnyCaRij2558T;
import b.X5t6Ja2TgpUpiIPMag2vNy;
import b.a4mKF3RHQRHGEYXlfylvHn;
import b.aBhc5Hosh3idQU7mazY;
import b.db7W22f2OwBZO1GzsWe8IM80qE;
import b.dlgqlTraJx3;
import b.gT4sTdpjS277wbG60pk72fHWG7;
import b.i5F6oxdMihR8jgyg8PF;
import b.iUmf3id0dbSvdoyB;
import b.mo4unDT7uci;
import b.pqGbOEsSxeoObqCs;
import b.uuyTGGFjNDiF1SxHW;
import b.w4HtvL0i41i4UiTpPXpyBtk84t;
import b.yAb1LdPBn45bwFwYeRc;
import bitpit.launcher.R;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class WallpaperCropView extends View {
    public final RectF FzogU2bPCQtD6a1hMYB1kyti;
    public Bitmap GO8WUug7ZWFCUI1zY;
    public final JTRgl741A5wx8stfjppSRTWZeS IPi49brQACDpXJTJMp7;
    public final float J1BE9tYH1em4X1uAhc6L7f4M;
    public final X5t6Ja2TgpUpiIPMag2vNy LcvPFGYKhAm4SS5FZ;
    public final Paint Mej0x2K4ZGSUxtYNka4QZ;
    public int Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    public float WIXlfFpvH7glAGsUk3;
    public float cCmbv8Tzd2QLd161ImIZUlZ8n;
    public i5F6oxdMihR8jgyg8PF cVfIGUKLEqID1HH;
    public final GestureDetector czGAefXQxIZzo;
    public final Matrix f2sXlW3st0rAKJwyOrCfOWc;
    public boolean gsHzEVTj1SCIPR;
    public final RectF iR1XUIc7FjhMl57O;
    public UgxoLusfimrPDl jvttfmFMQfShe6OfbNf1zF8CyEu;
    public boolean nXIf4d0RGTWG1l;
    public final Paint qTa7aqjjB9Bt6mc;
    public final Paint qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
    public int sCPtafveBAhdLIs2ajN3WV;
    public float tdNmBZIJHG1;
    public boolean tzMOyOc53ffl;
    public final PointF yM5HHkk1MhPLZFYTHm2JjrArud;
    public final ScaleGestureDetector yZj7bj6KyeuYi9woqDlC;
    public static final yAb1LdPBn45bwFwYeRc Companion = new yAb1LdPBn45bwFwYeRc();
    public static final JUDOL0fUbeJYs hsgUkarQLKL1aF8JVboCqnbaz1 = new JUDOL0fUbeJYs(1.0f, 5.0f);
    public static final J6fVPc4iLDMOxXEbo87fhumCX IQ6Ug1woLp4DNbPVXhFhC3Fz = new J6fVPc4iLDMOxXEbo87fhumCX(3);
    public static final J6fVPc4iLDMOxXEbo87fhumCX vHDGcerxdYUGlVld2h = new J6fVPc4iLDMOxXEbo87fhumCX(4);

    public WallpaperCropView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0, 0);
        this.gsHzEVTj1SCIPR = true;
        this.LcvPFGYKhAm4SS5FZ = gT4sTdpjS277wbG60pk72fHWG7.ziNFA7KzVfc6 ? new iUmf3id0dbSvdoyB(context) : new w4HtvL0i41i4UiTpPXpyBtk84t(24);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-16777216);
        this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = paint;
        this.Mej0x2K4ZGSUxtYNka4QZ = new Paint(1);
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(db7W22f2OwBZO1GzsWe8IM80qE.S1zP5M3X7Ukq3ROlZ87G9I(context, R.dimen.material4));
        paint2.setColor(context.getColor(R.color.on_background_dark));
        this.qTa7aqjjB9Bt6mc = paint2;
        this.f2sXlW3st0rAKJwyOrCfOWc = new Matrix();
        this.iR1XUIc7FjhMl57O = new RectF();
        this.yM5HHkk1MhPLZFYTHm2JjrArud = new PointF();
        this.FzogU2bPCQtD6a1hMYB1kyti = new RectF();
        this.J1BE9tYH1em4X1uAhc6L7f4M = db7W22f2OwBZO1GzsWe8IM80qE.S1zP5M3X7Ukq3ROlZ87G9I(context, R.dimen.wallpaper_crop_view_max_overscroll_raw);
        this.tdNmBZIJHG1 = 1.0f;
        this.czGAefXQxIZzo = new GestureDetector(context, new BOj7Lk43NwFnPA7WQbM8o9fGX8(this, 2));
        this.yZj7bj6KyeuYi9woqDlC = new ScaleGestureDetector(context, new pqGbOEsSxeoObqCs(this));
        this.IPi49brQACDpXJTJMp7 = new JTRgl741A5wx8stfjppSRTWZeS(this);
        this.jvttfmFMQfShe6OfbNf1zF8CyEu = UgxoLusfimrPDl.Aboow6rUrcY2SrFRa46C6uy;
        dlgqlTraJx3 dlgqltrajx3 = new dlgqlTraJx3(6, this);
        WeakHashMap weakHashMap = Ne7IrXfSjRisooSM.S1zP5M3X7Ukq3ROlZ87G9I;
        Qs5il4A81sbf73pL1Mwnj.ToEIy0qfkltfGfO3vmAQG(this, dlgqltrajx3);
    }

    public final void BezslBgjveK3hODH() {
        if (this.tzMOyOc53ffl) {
            return;
        }
        this.tzMOyOc53ffl = true;
        i5F6oxdMihR8jgyg8PF i5f6oxdmihr8jgyg8pf = this.cVfIGUKLEqID1HH;
        if (i5f6oxdmihr8jgyg8pf != null) {
            a4mKF3RHQRHGEYXlfylvHn a4mkf3rhqrhgeyxlfylvhn = (a4mKF3RHQRHGEYXlfylvHn) i5f6oxdmihr8jgyg8pf;
            Chip chip = (Chip) a4mkf3rhqrhgeyxlfylvhn.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
            ViewGroup viewGroup = (ViewGroup) a4mkf3rhqrhgeyxlfylvhn.cCmbv8Tzd2QLd161ImIZUlZ8n;
            VakjWjkrVf1.bfvGkgRqVBmXp4z3D5cuKKKZz(chip, true);
            VakjWjkrVf1.bfvGkgRqVBmXp4z3D5cuKKKZz(viewGroup, true);
        }
    }

    public final void S1zP5M3X7Ukq3ROlZ87G9I(float f, boolean z) {
        float f2 = this.tdNmBZIJHG1;
        float fFloatValue = ((Number) mo4unDT7uci.LYcdI4xpry8eXmFC9I4wyaLdcG1z(Float.valueOf(f), hsgUkarQLKL1aF8JVboCqnbaz1)).floatValue();
        this.tdNmBZIJHG1 = fFloatValue;
        float f3 = fFloatValue / f2;
        PointF pointF = this.yM5HHkk1MhPLZFYTHm2JjrArud;
        float f4 = f3 - 1.0f;
        pointF.offset(pointF.x * f4, pointF.y * f4);
        axL8FocTDLUdzg0XScbO(z);
    }

    public final void axL8FocTDLUdzg0XScbO(boolean z) {
        Shader shader;
        Bitmap bitmap = this.GO8WUug7ZWFCUI1zY;
        if (bitmap == null || (shader = this.Mej0x2K4ZGSUxtYNka4QZ.getShader()) == null) {
            return;
        }
        RectF rectF = this.iR1XUIc7FjhMl57O;
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = width - 2;
        float f2 = height - 2;
        float f3 = (f * fHeight > fWidth * f2 ? fHeight / f2 : fWidth / f) * this.tdNmBZIJHG1;
        float fAbs = Math.abs((f * f3) - fWidth) / 2.0f;
        float fAbs2 = Math.abs((f2 * f3) - fHeight) / 2.0f;
        RectF rectF2 = this.FzogU2bPCQtD6a1hMYB1kyti;
        rectF2.set(-fAbs, -fAbs2, fAbs, fAbs2);
        PointF pointF = this.yM5HHkk1MhPLZFYTHm2JjrArud;
        if (!z) {
            pointF.x = mo4unDT7uci.ziNFA7KzVfc6(pointF.x, rectF2.left, rectF2.right);
            pointF.y = mo4unDT7uci.ziNFA7KzVfc6(pointF.y, rectF2.top, rectF2.bottom);
        }
        Matrix matrix = this.f2sXlW3st0rAKJwyOrCfOWc;
        matrix.setTranslate((-width) / 2.0f, (-height) / 2.0f);
        matrix.postScale(f3, f3);
        matrix.postTranslate(rectF.centerX(), rectF.centerY());
        float f4 = pointF.x;
        float f5 = rectF2.left;
        float f6 = rectF2.right;
        float f7 = this.J1BE9tYH1em4X1uAhc6L7f4M;
        matrix.postTranslate(-PiLuoCym8e.S1zP5M3X7Ukq3ROlZ87G9I(f4, f5, f6, f7), -PiLuoCym8e.S1zP5M3X7Ukq3ROlZ87G9I(pointF.y, rectF2.top, rectF2.bottom, f7));
        this.LcvPFGYKhAm4SS5FZ.GO8WUug7ZWFCUI1zY(bitmap, matrix);
        shader.setLocalMatrix(matrix);
        invalidate();
    }

    public final float getBackdropOverlayAlpha() {
        return this.cCmbv8Tzd2QLd161ImIZUlZ8n;
    }

    public final float getCornerRadius() {
        return this.WIXlfFpvH7glAGsUk3;
    }

    public final boolean getShouldDrawBackdrop() {
        return this.gsHzEVTj1SCIPR;
    }

    public final int getWallpaperBaseColor() {
        return this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.iR1XUIc7FjhMl57O;
        if (rectF.isEmpty()) {
            return;
        }
        if (this.gsHzEVTj1SCIPR) {
            Bitmap bitmap = this.GO8WUug7ZWFCUI1zY;
            if (bitmap != null) {
                this.LcvPFGYKhAm4SS5FZ.WT8HZhEwPEkG(canvas, bitmap, this.f2sXlW3st0rAKJwyOrCfOWc);
            }
            float f = this.WIXlfFpvH7glAGsUk3;
            canvas.drawRoundRect(rectF, f, f, this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp);
        }
        canvas.drawColor(this.sCPtafveBAhdLIs2ajN3WV);
        float f2 = this.WIXlfFpvH7glAGsUk3;
        canvas.drawRoundRect(rectF, f2, f2, this.Mej0x2K4ZGSUxtYNka4QZ);
        float f3 = this.WIXlfFpvH7glAGsUk3;
        canvas.drawRoundRect(rectF, f3, f3, this.qTa7aqjjB9Bt6mc);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        RTnh92nsql4MTkUASzqsQY6 rTnh92nsql4MTkUASzqsQY6 = (RTnh92nsql4MTkUASzqsQY6) parcelable;
        super.onRestoreInstanceState(rTnh92nsql4MTkUASzqsQY6.GO8WUug7ZWFCUI1zY);
        this.yM5HHkk1MhPLZFYTHm2JjrArud.set(rTnh92nsql4MTkUASzqsQY6.Rdzg08aYlt0UsoLUNug9cESzgAY9R);
        this.tdNmBZIJHG1 = rTnh92nsql4MTkUASzqsQY6.cCmbv8Tzd2QLd161ImIZUlZ8n;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new RTnh92nsql4MTkUASzqsQY6(super.onSaveInstanceState(), this.yM5HHkk1MhPLZFYTHm2JjrArud, this.tdNmBZIJHG1);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.LcvPFGYKhAm4SS5FZ.UV6K6VDbgDgzpi12QAEKN4Emq(i, i2);
        axL8FocTDLUdzg0XScbO(true);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.GO8WUug7ZWFCUI1zY != null) {
            if (motionEvent.getAction() == 0) {
                this.nXIf4d0RGTWG1l = motionEvent.getY() > ((float) (getHeight() - this.jvttfmFMQfShe6OfbNf1zF8CyEu.ziNFA7KzVfc6)) || motionEvent.getX() < ((float) this.jvttfmFMQfShe6OfbNf1zF8CyEu.S1zP5M3X7Ukq3ROlZ87G9I) || motionEvent.getX() > ((float) (getWidth() - this.jvttfmFMQfShe6OfbNf1zF8CyEu.BezslBgjveK3hODH));
            }
            if (!this.nXIf4d0RGTWG1l) {
                int action = motionEvent.getAction();
                JTRgl741A5wx8stfjppSRTWZeS jTRgl741A5wx8stfjppSRTWZeS = this.IPi49brQACDpXJTJMp7;
                if (action == 0) {
                    jTRgl741A5wx8stfjppSRTWZeS.GO8WUug7ZWFCUI1zY = false;
                    jTRgl741A5wx8stfjppSRTWZeS.qaDSpeex0Oo1Qvt3oOrTJnbcQFp.removeCallbacks(jTRgl741A5wx8stfjppSRTWZeS);
                    W0srfC3hNCwnyCaRij2558T w0srfC3hNCwnyCaRij2558T = jTRgl741A5wx8stfjppSRTWZeS.gsHzEVTj1SCIPR;
                    w0srfC3hNCwnyCaRij2558T.BezslBgjveK3hODH.abortAnimation();
                    w0srfC3hNCwnyCaRij2558T.S1zP5M3X7Ukq3ROlZ87G9I.BezslBgjveK3hODH();
                    W0srfC3hNCwnyCaRij2558T w0srfC3hNCwnyCaRij2558T2 = jTRgl741A5wx8stfjppSRTWZeS.LcvPFGYKhAm4SS5FZ;
                    w0srfC3hNCwnyCaRij2558T2.BezslBgjveK3hODH.abortAnimation();
                    w0srfC3hNCwnyCaRij2558T2.S1zP5M3X7Ukq3ROlZ87G9I.BezslBgjveK3hODH();
                }
                boolean zOnTouchEvent = this.czGAefXQxIZzo.onTouchEvent(motionEvent);
                this.yZj7bj6KyeuYi9woqDlC.onTouchEvent(motionEvent);
                int action2 = motionEvent.getAction();
                if ((action2 == 1 || action2 == 3) && !jTRgl741A5wx8stfjppSRTWZeS.GO8WUug7ZWFCUI1zY) {
                    aBhc5Hosh3idQU7mazY abhc5hosh3idqu7mazy = jTRgl741A5wx8stfjppSRTWZeS.cCmbv8Tzd2QLd161ImIZUlZ8n;
                    WallpaperCropView wallpaperCropView = jTRgl741A5wx8stfjppSRTWZeS.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
                    PointF pointF = wallpaperCropView.yM5HHkk1MhPLZFYTHm2JjrArud;
                    RectF rectF = wallpaperCropView.FzogU2bPCQtD6a1hMYB1kyti;
                    boolean zAboow6rUrcY2SrFRa46C6uy = PiLuoCym8e.Aboow6rUrcY2SrFRa46C6uy(abhc5hosh3idqu7mazy, pointF.x, rectF.left, rectF.right);
                    boolean zAboow6rUrcY2SrFRa46C6uy2 = PiLuoCym8e.Aboow6rUrcY2SrFRa46C6uy(jTRgl741A5wx8stfjppSRTWZeS.WIXlfFpvH7glAGsUk3, pointF.y, rectF.top, rectF.bottom);
                    if (!zAboow6rUrcY2SrFRa46C6uy && !zAboow6rUrcY2SrFRa46C6uy2) {
                        ziNFA7KzVfc6();
                    }
                }
                if (!zOnTouchEvent && !super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void setBackdropOverlayAlpha(float f) {
        if (0.0f > f || f > 1.0f) {
            uuyTGGFjNDiF1SxHW.PQQPeCDD0JLCT3aLz("backdropOverlayAlpha must be between 0 and 1");
            return;
        }
        this.cCmbv8Tzd2QLd161ImIZUlZ8n = f;
        int i = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
        int i2 = (int) (f * 255.0f);
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 > 255) {
            i2 = 255;
        }
        this.sCPtafveBAhdLIs2ajN3WV = (i2 << 24) | (i & 16777215);
        invalidate();
    }

    public final void setBitmap(Bitmap bitmap) {
        if (bitmap != null && (bitmap.getWidth() < 3 || bitmap.getHeight() < 3)) {
            uuyTGGFjNDiF1SxHW.PQQPeCDD0JLCT3aLz("Bitmap must be at least 3x3 pixels, including a 1px transparent border on each side.");
            return;
        }
        this.GO8WUug7ZWFCUI1zY = bitmap;
        Paint paint = this.Mej0x2K4ZGSUxtYNka4QZ;
        if (bitmap == null) {
            paint.setShader(null);
            this.LcvPFGYKhAm4SS5FZ.clear();
            invalidate();
        } else {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            axL8FocTDLUdzg0XScbO(true);
        }
    }

    public final void setCornerRadius(float f) {
        this.WIXlfFpvH7glAGsUk3 = f;
        invalidate();
    }

    public final void setOnInteractionStateChangedListener(i5F6oxdMihR8jgyg8PF i5f6oxdmihr8jgyg8pf) {
        this.cVfIGUKLEqID1HH = i5f6oxdmihr8jgyg8pf;
    }

    public final void setShouldDrawBackdrop(boolean z) {
        this.gsHzEVTj1SCIPR = z;
        invalidate();
    }

    public final void setWallpaperBaseColor(int i) {
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = i;
        this.Mej0x2K4ZGSUxtYNka4QZ.setColor((i & 16777215) | (255 << 24));
        int i2 = (int) (this.cCmbv8Tzd2QLd161ImIZUlZ8n * 255.0f);
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 > 255) {
            i2 = 255;
        }
        this.sCPtafveBAhdLIs2ajN3WV = (i & 16777215) | (i2 << 24);
        invalidate();
    }

    public final void ziNFA7KzVfc6() {
        if (this.tzMOyOc53ffl) {
            this.tzMOyOc53ffl = false;
            i5F6oxdMihR8jgyg8PF i5f6oxdmihr8jgyg8pf = this.cVfIGUKLEqID1HH;
            if (i5f6oxdmihr8jgyg8pf != null) {
                a4mKF3RHQRHGEYXlfylvHn a4mkf3rhqrhgeyxlfylvhn = (a4mKF3RHQRHGEYXlfylvHn) i5f6oxdmihr8jgyg8pf;
                Chip chip = (Chip) a4mkf3rhqrhgeyxlfylvhn.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
                ViewGroup viewGroup = (ViewGroup) a4mkf3rhqrhgeyxlfylvhn.cCmbv8Tzd2QLd161ImIZUlZ8n;
                VakjWjkrVf1.bfvGkgRqVBmXp4z3D5cuKKKZz(chip, false);
                VakjWjkrVf1.bfvGkgRqVBmXp4z3D5cuKKKZz(viewGroup, false);
            }
        }
    }

    public WallpaperCropView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
    }

    public WallpaperCropView(Context context) {
        this(context, null, 14);
    }
}
