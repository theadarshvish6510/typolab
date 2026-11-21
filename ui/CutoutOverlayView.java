package bitpit.launcher.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import b.HDzaRKEI4SxljA;
import b.SCo4Ctd3zv2DHfczdi;
import b.WLZoEbRHGAYGtOeo6ZMxoLT9;
import b.Zo1YEZ6nT2Qsm9uBmmbXR;
import b.lZJZdWdvRHup;
import b.mGx1Z0QoNwvrSy;
import b.rkqwFvjLjoZCrFLnsdi;
import b.zmfKefolgpc94cTKByox;

/* JADX INFO: loaded from: classes.dex */
public final class CutoutOverlayView extends View {
    public static final /* synthetic */ int qaDSpeex0Oo1Qvt3oOrTJnbcQFp = 0;
    public float GO8WUug7ZWFCUI1zY;
    public ValueAnimator LcvPFGYKhAm4SS5FZ;
    public final RectF Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    public final Paint WIXlfFpvH7glAGsUk3;
    public final Paint cCmbv8Tzd2QLd161ImIZUlZ8n;
    public ValueAnimator gsHzEVTj1SCIPR;

    public CutoutOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = new RectF();
        this.cCmbv8Tzd2QLd161ImIZUlZ8n = new Paint(1);
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.WIXlfFpvH7glAGsUk3 = paint;
        setLayerType(1, null);
    }

    public static void S1zP5M3X7Ukq3ROlZ87G9I(CutoutOverlayView cutoutOverlayView, int i, rkqwFvjLjoZCrFLnsdi rkqwfvjljozcrflnsdi, int i2) {
        HDzaRKEI4SxljA hDzaRKEI4SxljA = Zo1YEZ6nT2Qsm9uBmmbXR.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
        long jJY5knQmh7EQJEZ = WLZoEbRHGAYGtOeo6ZMxoLT9.JY5knQmh7EQJEZ(300, SCo4Ctd3zv2DHfczdi.MILLISECONDS);
        if ((i2 & 4) != 0) {
            rkqwfvjljozcrflnsdi = null;
        }
        ValueAnimator valueAnimator = cutoutOverlayView.LcvPFGYKhAm4SS5FZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(cutoutOverlayView.getOverlayColor(), i);
        mGx1Z0QoNwvrSy.LYcdI4xpry8eXmFC9I4wyaLdcG1z(valueAnimatorOfArgb, jJY5knQmh7EQJEZ);
        valueAnimatorOfArgb.addUpdateListener(new zmfKefolgpc94cTKByox(3, cutoutOverlayView));
        if (rkqwfvjljozcrflnsdi != null) {
            valueAnimatorOfArgb.addListener(new lZJZdWdvRHup(5, rkqwfvjljozcrflnsdi));
        }
        valueAnimatorOfArgb.start();
        cutoutOverlayView.LcvPFGYKhAm4SS5FZ = valueAnimatorOfArgb;
    }

    public final float getCutoutCornerRadiusPx() {
        return this.GO8WUug7ZWFCUI1zY;
    }

    public final int getOverlayColor() {
        return this.cCmbv8Tzd2QLd161ImIZUlZ8n.getColor();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.cCmbv8Tzd2QLd161ImIZUlZ8n);
        RectF rectF = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
        if (rectF.isEmpty()) {
            return;
        }
        canvas.drawRoundRect(rectF, getCutoutCornerRadiusPx(), getCutoutCornerRadiusPx(), this.WIXlfFpvH7glAGsUk3);
    }

    public final void setCutoutBounds(Rect rect) {
        ValueAnimator valueAnimator = this.gsHzEVTj1SCIPR;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        RectF rectF = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
        if (rect != null) {
            rectF.set(rect);
        } else {
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        invalidate();
    }

    public final void setCutoutCornerRadiusPx(float f) {
        this.GO8WUug7ZWFCUI1zY = f;
        invalidate();
    }

    public final void setOverlayColor(int i) {
        this.cCmbv8Tzd2QLd161ImIZUlZ8n.setColor(i);
        invalidate();
    }

    public CutoutOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public CutoutOverlayView(Context context) {
        this(context, null, 6);
    }
}
