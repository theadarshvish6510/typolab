package bitpit.launcher.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import b.ASDwBkZhws;
import b.HjRJIKfAufaRiwCEG1LKiN0jRXa;
import b.LTC5BQy9XspuFiw;
import b.SqA6ScUbbEZbNeU6SjTM;
import b.UkBm6rfX5yP;
import b.gT4sTdpjS277wbG60pk72fHWG7;
import b.kPUlBMARVUv;
import b.zVkUtEURLvHNycfQPRiFy1I;
import bitpit.launcher.R;

/* JADX INFO: loaded from: classes.dex */
public final class FloatingTipBodyView extends FrameLayout {
    public final float GO8WUug7ZWFCUI1zY;
    public final float LcvPFGYKhAm4SS5FZ;
    public SqA6ScUbbEZbNeU6SjTM Mej0x2K4ZGSUxtYNka4QZ;
    public final float Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    public final float WIXlfFpvH7glAGsUk3;
    public final float cCmbv8Tzd2QLd161ImIZUlZ8n;
    public final RectF f2sXlW3st0rAKJwyOrCfOWc;
    public final float gsHzEVTj1SCIPR;
    public final Path iR1XUIc7FjhMl57O;
    public final int qTa7aqjjB9Bt6mc;
    public final Paint qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
    public final Paint sCPtafveBAhdLIs2ajN3WV;
    public final RectF yM5HHkk1MhPLZFYTHm2JjrArud;

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingTipBodyView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        this.GO8WUug7ZWFCUI1zY = getResources().getDimension(R.dimen.material24);
        float dimension = getResources().getDimension(R.dimen.stroke_width_card);
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = dimension;
        boolean z = gT4sTdpjS277wbG60pk72fHWG7.Aboow6rUrcY2SrFRa46C6uy;
        this.cCmbv8Tzd2QLd161ImIZUlZ8n = context.getResources().getDisplayMetrics().density * 52.0f;
        this.WIXlfFpvH7glAGsUk3 = context.getResources().getDisplayMetrics().density * 14.5f;
        this.gsHzEVTj1SCIPR = 0.4090909f;
        this.LcvPFGYKhAm4SS5FZ = 0.3181818f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(ASDwBkZhws.ox9eclwMpRd(context, R.attr.next_surface_bg, null, 6));
        this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(z ? dimension * 2.0f : dimension);
        paint2.setColor(ASDwBkZhws.ox9eclwMpRd(context, R.attr.next_surface_outline, null, 6));
        this.sCPtafveBAhdLIs2ajN3WV = paint2;
        this.Mej0x2K4ZGSUxtYNka4QZ = SqA6ScUbbEZbNeU6SjTM.GO8WUug7ZWFCUI1zY;
        this.qTa7aqjjB9Bt6mc = Integer.MAX_VALUE;
        this.f2sXlW3st0rAKJwyOrCfOWc = new RectF();
        this.iR1XUIc7FjhMl57O = new Path();
        this.yM5HHkk1MhPLZFYTHm2JjrArud = new RectF();
        setWillNotDraw(false);
        setClipToOutline(z);
        setOutlineProvider(new kPUlBMARVUv(this));
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.maxWidth}, 0, 0);
            this.qTa7aqjjB9Bt6mc = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, Integer.MAX_VALUE);
            typedArrayObtainStyledAttributes.recycle();
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, zVkUtEURLvHNycfQPRiFy1I.flPMk2Ix9h3b95v, 0, 0);
            try {
                setPointerSide((SqA6ScUbbEZbNeU6SjTM) SqA6ScUbbEZbNeU6SjTM.cCmbv8Tzd2QLd161ImIZUlZ8n.get(typedArrayObtainStyledAttributes2.getInt(0, 0)));
            } finally {
                typedArrayObtainStyledAttributes2.recycle();
            }
        }
    }

    private final UkBm6rfX5yP getResolvedPointerSide() {
        int iOrdinal = this.Mej0x2K4ZGSUxtYNka4QZ.ordinal();
        if (iOrdinal == 0) {
            return UkBm6rfX5yP.GO8WUug7ZWFCUI1zY;
        }
        if (iOrdinal == 1) {
            return UkBm6rfX5yP.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
        }
        if (iOrdinal == 2) {
            return UkBm6rfX5yP.cCmbv8Tzd2QLd161ImIZUlZ8n;
        }
        UkBm6rfX5yP ukBm6rfX5yP = UkBm6rfX5yP.gsHzEVTj1SCIPR;
        UkBm6rfX5yP ukBm6rfX5yP2 = UkBm6rfX5yP.WIXlfFpvH7glAGsUk3;
        if (iOrdinal == 3) {
            return getLayoutDirection() == 1 ? ukBm6rfX5yP : ukBm6rfX5yP2;
        }
        if (iOrdinal == 4) {
            return getLayoutDirection() == 1 ? ukBm6rfX5yP2 : ukBm6rfX5yP;
        }
        LTC5BQy9XspuFiw.axL8FocTDLUdzg0XScbO();
        return null;
    }

    public final void S1zP5M3X7Ukq3ROlZ87G9I(int i, int i2) {
        float f;
        float f2;
        float f3;
        if (i == 0 || i2 == 0) {
            return;
        }
        float f4 = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R / 2.0f;
        UkBm6rfX5yP resolvedPointerSide = getResolvedPointerSide();
        float f5 = this.WIXlfFpvH7glAGsUk3;
        UkBm6rfX5yP ukBm6rfX5yP = UkBm6rfX5yP.WIXlfFpvH7glAGsUk3;
        float f6 = (resolvedPointerSide == ukBm6rfX5yP ? f5 : 0.0f) + f4;
        UkBm6rfX5yP ukBm6rfX5yP2 = UkBm6rfX5yP.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
        float f7 = (resolvedPointerSide == ukBm6rfX5yP2 ? f5 : 0.0f) + f4;
        float f8 = i - f4;
        UkBm6rfX5yP ukBm6rfX5yP3 = UkBm6rfX5yP.gsHzEVTj1SCIPR;
        float f9 = f8 - (resolvedPointerSide == ukBm6rfX5yP3 ? f5 : 0.0f);
        float f10 = i2 - f4;
        UkBm6rfX5yP ukBm6rfX5yP4 = UkBm6rfX5yP.cCmbv8Tzd2QLd161ImIZUlZ8n;
        float f11 = f10 - (resolvedPointerSide == ukBm6rfX5yP4 ? f5 : 0.0f);
        RectF rectF = this.f2sXlW3st0rAKJwyOrCfOWc;
        rectF.set(f6, f7, f9, f11);
        Path path = this.iR1XUIc7FjhMl57O;
        path.reset();
        float f12 = this.cCmbv8Tzd2QLd161ImIZUlZ8n / 2.0f;
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        float f13 = rectF.left;
        float f14 = this.GO8WUug7ZWFCUI1zY;
        path.moveTo(f13 + f14, rectF.top);
        float f15 = this.LcvPFGYKhAm4SS5FZ;
        float f16 = this.gsHzEVTj1SCIPR;
        if (resolvedPointerSide == ukBm6rfX5yP2) {
            path.lineTo(fCenterX - f12, rectF.top);
            float f17 = f12 * f16;
            float f18 = rectF.top;
            float f19 = f12 * f15;
            float f20 = f18 - f5;
            path.cubicTo(fCenterX - f17, f18, fCenterX - f19, f20, fCenterX, f20);
            f2 = fCenterX;
            f = f12;
            float f21 = rectF.top;
            path.cubicTo(f19 + f2, f21 - f5, f17 + f2, f21, f2 + f, f21);
        } else {
            f = f12;
            f2 = fCenterX;
        }
        path.lineTo(rectF.right - f14, rectF.top);
        float f22 = rectF.right;
        float f23 = 2.0f * f14;
        float f24 = rectF.top;
        float f25 = f2;
        RectF rectF2 = this.yM5HHkk1MhPLZFYTHm2JjrArud;
        rectF2.set(f22 - f23, f24, f22, f23 + f24);
        path.arcTo(rectF2, -90.0f, 90.0f, false);
        if (resolvedPointerSide == ukBm6rfX5yP3) {
            path.lineTo(rectF.right, fCenterY - f);
            float f26 = rectF.right;
            float f27 = f * f16;
            float f28 = f26 + f5;
            float f29 = f * f15;
            path.cubicTo(f26, fCenterY - f27, f28, fCenterY - f29, f28, fCenterY);
            f3 = fCenterY;
            float f30 = rectF.right;
            path.cubicTo(f30 + f5, f29 + f3, f30, f27 + f3, f30, f3 + f);
        } else {
            f3 = fCenterY;
        }
        path.lineTo(rectF.right, rectF.bottom - f14);
        float f31 = rectF.right;
        float f32 = rectF.bottom;
        rectF2.set(f31 - f23, f32 - f23, f31, f32);
        path.arcTo(rectF2, 0.0f, 90.0f, false);
        if (resolvedPointerSide == ukBm6rfX5yP4) {
            path.lineTo(f25 + f, rectF.bottom);
            float f33 = f * f16;
            float f34 = rectF.bottom;
            float f35 = f * f15;
            float f36 = f34 + f5;
            path.cubicTo(f33 + f25, f34, f35 + f25, f36, f25, f36);
            float f37 = rectF.bottom;
            path.cubicTo(f25 - f35, f37 + f5, f25 - f33, f37, f25 - f, f37);
        }
        path.lineTo(rectF.left + f14, rectF.bottom);
        float f38 = rectF.left;
        float f39 = rectF.bottom;
        rectF2.set(f38, f39 - f23, f23 + f38, f39);
        path.arcTo(rectF2, 90.0f, 90.0f, false);
        if (resolvedPointerSide == ukBm6rfX5yP) {
            path.lineTo(rectF.left, f3 + f);
            float f40 = rectF.left;
            float f41 = f * f16;
            float f42 = f40 - f5;
            float f43 = f * f15;
            float f44 = f3;
            path.cubicTo(f40, f41 + f3, f42, f43 + f3, f42, f44);
            float f45 = rectF.left;
            path.cubicTo(f45 - f5, f44 - f43, f45, f44 - f41, f45, f44 - f);
        }
        path.lineTo(rectF.left, rectF.top + f14);
        float f46 = rectF.left;
        float f47 = rectF.top;
        rectF2.set(f46, f47, f23 + f46, f23 + f47);
        path.arcTo(rectF2, 180.0f, 90.0f, false);
        path.close();
        invalidateOutline();
    }

    public final SqA6ScUbbEZbNeU6SjTM getPointerSide() {
        return this.Mej0x2K4ZGSUxtYNka4QZ;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint = this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
        Path path = this.iR1XUIc7FjhMl57O;
        canvas.drawPath(path, paint);
        canvas.drawPath(path, this.sCPtafveBAhdLIs2ajN3WV);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        UkBm6rfX5yP resolvedPointerSide = getResolvedPointerSide();
        int i5 = (int) this.WIXlfFpvH7glAGsUk3;
        UkBm6rfX5yP ukBm6rfX5yP = UkBm6rfX5yP.WIXlfFpvH7glAGsUk3;
        int i6 = i3 - ((resolvedPointerSide == ukBm6rfX5yP || resolvedPointerSide == UkBm6rfX5yP.gsHzEVTj1SCIPR) ? i5 : 0);
        UkBm6rfX5yP ukBm6rfX5yP2 = UkBm6rfX5yP.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
        super.onLayout(z, i, i2, i6, i4 - ((resolvedPointerSide == ukBm6rfX5yP2 || resolvedPointerSide == UkBm6rfX5yP.cCmbv8Tzd2QLd161ImIZUlZ8n) ? i5 : 0));
        int i7 = 9;
        if (resolvedPointerSide == ukBm6rfX5yP) {
            HjRJIKfAufaRiwCEG1LKiN0jRXa hjRJIKfAufaRiwCEG1LKiN0jRXa = new HjRJIKfAufaRiwCEG1LKiN0jRXa(i7, this);
            while (hjRJIKfAufaRiwCEG1LKiN0jRXa.hasNext()) {
                ((View) hjRJIKfAufaRiwCEG1LKiN0jRXa.next()).offsetLeftAndRight(i5);
            }
        } else if (resolvedPointerSide == ukBm6rfX5yP2) {
            HjRJIKfAufaRiwCEG1LKiN0jRXa hjRJIKfAufaRiwCEG1LKiN0jRXa2 = new HjRJIKfAufaRiwCEG1LKiN0jRXa(i7, this);
            while (hjRJIKfAufaRiwCEG1LKiN0jRXa2.hasNext()) {
                ((View) hjRJIKfAufaRiwCEG1LKiN0jRXa2.next()).offsetTopAndBottom(i5);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        UkBm6rfX5yP resolvedPointerSide = getResolvedPointerSide();
        int i3 = (int) this.WIXlfFpvH7glAGsUk3;
        int mode = View.MeasureSpec.getMode(i);
        int i4 = this.qTa7aqjjB9Bt6mc;
        if ((mode == 0 && i4 != Integer.MAX_VALUE) || (mode == Integer.MIN_VALUE && i4 <= View.MeasureSpec.getSize(i))) {
            i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        int mode2 = View.MeasureSpec.getMode(i);
        if ((resolvedPointerSide == UkBm6rfX5yP.WIXlfFpvH7glAGsUk3 || resolvedPointerSide == UkBm6rfX5yP.gsHzEVTj1SCIPR) && mode2 != 0) {
            int size = View.MeasureSpec.getSize(i) - i3;
            if (size < 0) {
                size = 0;
            }
            i = View.MeasureSpec.makeMeasureSpec(size, mode2);
        }
        int mode3 = View.MeasureSpec.getMode(i2);
        if ((resolvedPointerSide == UkBm6rfX5yP.Rdzg08aYlt0UsoLUNug9cESzgAY9R || resolvedPointerSide == UkBm6rfX5yP.cCmbv8Tzd2QLd161ImIZUlZ8n) && mode3 != 0) {
            int size2 = View.MeasureSpec.getSize(i2) - i3;
            i2 = View.MeasureSpec.makeMeasureSpec(size2 >= 0 ? size2 : 0, mode3);
        }
        super.onMeasure(i, i2);
        int iOrdinal = resolvedPointerSide.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1 || iOrdinal == 2) {
                setMeasuredDimension(getMeasuredWidthAndState(), getMeasuredHeightAndState() + i3);
            } else if (iOrdinal == 3 || iOrdinal == 4) {
                setMeasuredDimension(getMeasuredWidthAndState() + i3, getMeasuredHeightAndState());
            } else {
                LTC5BQy9XspuFiw.axL8FocTDLUdzg0XScbO();
            }
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        S1zP5M3X7Ukq3ROlZ87G9I(getWidth(), getHeight());
        requestLayout();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        S1zP5M3X7Ukq3ROlZ87G9I(i, i2);
    }

    public final void setPointerSide(SqA6ScUbbEZbNeU6SjTM sqA6ScUbbEZbNeU6SjTM) {
        if (this.Mej0x2K4ZGSUxtYNka4QZ == sqA6ScUbbEZbNeU6SjTM) {
            return;
        }
        this.Mej0x2K4ZGSUxtYNka4QZ = sqA6ScUbbEZbNeU6SjTM;
        S1zP5M3X7Ukq3ROlZ87G9I(getWidth(), getHeight());
        requestLayout();
        invalidate();
    }

    public FloatingTipBodyView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public FloatingTipBodyView(Context context) {
        this(context, null, 6);
    }
}
