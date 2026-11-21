package bitpit.launcher.alphabet_wave;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import b.TivatRapv9;
import b.vYmuZ1YssoLimkM3XwMKMkzHEtza;
import bitpit.launcher.ui.RubberBandLayout;

/* JADX INFO: loaded from: classes.dex */
public final class AlphabetWaveView extends RubberBandLayout {
    public int FzogU2bPCQtD6a1hMYB1kyti;
    public int J1BE9tYH1em4X1uAhc6L7f4M;
    public final Rect cVfIGUKLEqID1HH;
    public final Rect czGAefXQxIZzo;
    public boolean f2sXlW3st0rAKJwyOrCfOWc;
    public boolean iR1XUIc7FjhMl57O;
    public vYmuZ1YssoLimkM3XwMKMkzHEtza qTa7aqjjB9Bt6mc;
    public final Paint tdNmBZIJHG1;
    public final Paint tzMOyOc53ffl;
    public boolean yM5HHkk1MhPLZFYTHm2JjrArud;
    public int yZj7bj6KyeuYi9woqDlC;
    public static final TivatRapv9 Companion = new TivatRapv9();
    public static final int[] IPi49brQACDpXJTJMp7 = {0, 1342177280, -16777216};
    public static final float[] jvttfmFMQfShe6OfbNf1zF8CyEu = {0.0f, 0.66f, 1.0f};
    public static final int[] nXIf4d0RGTWG1l = {-16777216, 1342177280, 0};
    public static final float[] hsgUkarQLKL1aF8JVboCqnbaz1 = {0.0f, 0.33f, 1.0f};

    public AlphabetWaveView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.f2sXlW3st0rAKJwyOrCfOWc = true;
        this.iR1XUIc7FjhMl57O = true;
        this.yM5HHkk1MhPLZFYTHm2JjrArud = true;
        Paint paint = new Paint(1);
        this.tdNmBZIJHG1 = paint;
        Paint paint2 = new Paint(1);
        this.tzMOyOc53ffl = paint2;
        this.cVfIGUKLEqID1HH = new Rect();
        this.czGAefXQxIZzo = new Rect();
        setWillNotDraw(false);
        if (this.iR1XUIc7FjhMl57O && this.FzogU2bPCQtD6a1hMYB1kyti > 0) {
            this.yZj7bj6KyeuYi9woqDlC = 1 | this.yZj7bj6KyeuYi9woqDlC;
        }
        if (this.yM5HHkk1MhPLZFYTHm2JjrArud && this.J1BE9tYH1em4X1uAhc6L7f4M > 0) {
            this.yZj7bj6KyeuYi9woqDlC |= 2;
        }
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        paint.setXfermode(porterDuffXfermode);
        paint2.setXfermode(porterDuffXfermode);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        boolean z = this.iR1XUIc7FjhMl57O || this.yM5HHkk1MhPLZFYTHm2JjrArud;
        if (getVisibility() != 0 || width == 0 || height == 0 || !z) {
            super.dispatchDraw(canvas);
            return;
        }
        int i = this.yZj7bj6KyeuYi9woqDlC;
        int i2 = i & 1;
        Paint paint = this.tdNmBZIJHG1;
        Rect rect = this.cVfIGUKLEqID1HH;
        if (i2 == 1) {
            this.yZj7bj6KyeuYi9woqDlC = i & (-2);
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int i3 = this.FzogU2bPCQtD6a1hMYB1kyti;
            if (i3 <= height2) {
                height2 = i3;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int i4 = height2 + paddingTop;
            rect.set(paddingLeft, paddingTop, getWidth() - getPaddingRight(), i4);
            float f = paddingLeft;
            paint.setShader(new LinearGradient(f, paddingTop, f, i4, IPi49brQACDpXJTJMp7, jvttfmFMQfShe6OfbNf1zF8CyEu, Shader.TileMode.CLAMP));
        }
        int i5 = this.yZj7bj6KyeuYi9woqDlC;
        int i6 = i5 & 2;
        Paint paint2 = this.tzMOyOc53ffl;
        Rect rect2 = this.czGAefXQxIZzo;
        if (i6 == 2) {
            this.yZj7bj6KyeuYi9woqDlC = i5 & (-3);
            int height3 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int i7 = this.J1BE9tYH1em4X1uAhc6L7f4M;
            if (i7 > height3) {
                i7 = height3;
            }
            int paddingLeft2 = getPaddingLeft();
            int paddingTop2 = (getPaddingTop() + height3) - i7;
            int i8 = i7 + paddingTop2;
            rect2.set(paddingLeft2, paddingTop2, getWidth() - getPaddingRight(), i8);
            float f2 = paddingLeft2;
            paint2.setShader(new LinearGradient(f2, paddingTop2, f2, i8, nXIf4d0RGTWG1l, hsgUkarQLKL1aF8JVboCqnbaz1, Shader.TileMode.CLAMP));
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        super.dispatchDraw(canvas);
        if (this.iR1XUIc7FjhMl57O && this.FzogU2bPCQtD6a1hMYB1kyti > 0) {
            canvas.drawRect(rect, paint);
        }
        if (this.yM5HHkk1MhPLZFYTHm2JjrArud && this.J1BE9tYH1em4X1uAhc6L7f4M > 0) {
            canvas.drawRect(rect2, paint2);
        }
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        vYmuZ1YssoLimkM3XwMKMkzHEtza vymuz1yssolimkm3xwmkmkzhetza = this.qTa7aqjjB9Bt6mc;
        if (vymuz1yssolimkm3xwmkmkzhetza != null) {
            vymuz1yssolimkm3xwmkmkzhetza.BezslBgjveK3hODH(canvas);
        }
    }

    public final vYmuZ1YssoLimkM3XwMKMkzHEtza getAlphabetWave() {
        return this.qTa7aqjjB9Bt6mc;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        vYmuZ1YssoLimkM3XwMKMkzHEtza vymuz1yssolimkm3xwmkmkzhetza = this.qTa7aqjjB9Bt6mc;
        return vymuz1yssolimkm3xwmkmkzhetza != null && vymuz1yssolimkm3xwmkmkzhetza.ToEIy0qfkltfGfO3vmAQG(motionEvent);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        vYmuZ1YssoLimkM3XwMKMkzHEtza vymuz1yssolimkm3xwmkmkzhetza = this.qTa7aqjjB9Bt6mc;
        if (vymuz1yssolimkm3xwmkmkzhetza != null) {
            vymuz1yssolimkm3xwmkmkzhetza.HveD9n1tOYlffjJDxghBitYNgB(i);
        }
        if (i2 != i4) {
            this.yZj7bj6KyeuYi9woqDlC |= 3;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        vYmuZ1YssoLimkM3XwMKMkzHEtza vymuz1yssolimkm3xwmkmkzhetza;
        if (!this.f2sXlW3st0rAKJwyOrCfOWc || (vymuz1yssolimkm3xwmkmkzhetza = this.qTa7aqjjB9Bt6mc) == null || !vymuz1yssolimkm3xwmkmkzhetza.H5sQ15nhYoaKKHhx(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        invalidate();
        return true;
    }

    public final void setAlphabetWave(vYmuZ1YssoLimkM3XwMKMkzHEtza vymuz1yssolimkm3xwmkmkzhetza) {
        this.qTa7aqjjB9Bt6mc = vymuz1yssolimkm3xwmkmkzhetza;
    }

    public final void setAlphabetWaveEnabled(boolean z) {
        this.f2sXlW3st0rAKJwyOrCfOWc = z;
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        if (getPaddingTop() != i2) {
            this.yZj7bj6KyeuYi9woqDlC |= 1;
        }
        if (getPaddingBottom() != i4) {
            this.yZj7bj6KyeuYi9woqDlC |= 2;
        }
        super.setPadding(i, i2, i3, i4);
    }

    public AlphabetWaveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
    }

    public AlphabetWaveView(Context context) {
        this(context, null, 14);
    }
}
