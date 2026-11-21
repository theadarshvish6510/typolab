package bitpit.launcher.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import b.K7GRNeS1CXm8M4;
import b.Ne7IrXfSjRisooSM;
import b.OkhdZkC3NYLW;
import b.clwQWnugyNAyEZrq;
import b.ijF9itHzOGR3X;
import b.m0yUnDzOdv9C8h0303IkPlRWYD;
import b.mo4unDT7uci;
import b.zVkUtEURLvHNycfQPRiFy1I;
import java.util.EnumSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class RoundedImageView extends AppCompatImageView {
    public static final m0yUnDzOdv9C8h0303IkPlRWYD Companion = new m0yUnDzOdv9C8h0303IkPlRWYD();
    public boolean FzogU2bPCQtD6a1hMYB1kyti;
    public int J1BE9tYH1em4X1uAhc6L7f4M;
    public final Path LcvPFGYKhAm4SS5FZ;
    public int Mej0x2K4ZGSUxtYNka4QZ;
    public final Paint WIXlfFpvH7glAGsUk3;
    public int cVfIGUKLEqID1HH;
    public boolean f2sXlW3st0rAKJwyOrCfOWc;
    public final Path gsHzEVTj1SCIPR;
    public boolean iR1XUIc7FjhMl57O;
    public boolean qTa7aqjjB9Bt6mc;
    public int qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
    public int sCPtafveBAhdLIs2ajN3WV;
    public int tdNmBZIJHG1;
    public int tzMOyOc53ffl;
    public boolean yM5HHkk1MhPLZFYTHm2JjrArud;

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(0);
        paint.setAntiAlias(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.WIXlfFpvH7glAGsUk3 = paint;
        Path path = new Path();
        path.setFillType(Path.FillType.INVERSE_EVEN_ODD);
        this.gsHzEVTj1SCIPR = path;
        this.LcvPFGYKhAm4SS5FZ = new Path();
        this.qTa7aqjjB9Bt6mc = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zVkUtEURLvHNycfQPRiFy1I.ToEIy0qfkltfGfO3vmAQG, 0, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        if (this.Mej0x2K4ZGSUxtYNka4QZ != dimensionPixelSize) {
            this.Mej0x2K4ZGSUxtYNka4QZ = dimensionPixelSize;
        }
        setRoundedCornersInternal(typedArrayObtainStyledAttributes.getInt(1, 15));
        typedArrayObtainStyledAttributes.recycle();
        ziNFA7KzVfc6();
        Aboow6rUrcY2SrFRa46C6uy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getAreAllCornersRounded() {
        return this.f2sXlW3st0rAKJwyOrCfOWc && this.iR1XUIc7FjhMl57O && this.yM5HHkk1MhPLZFYTHm2JjrArud && this.FzogU2bPCQtD6a1hMYB1kyti;
    }

    private final void setRoundedCornersInternal(int i) {
        this.f2sXlW3st0rAKJwyOrCfOWc = 8 == (i & 8);
        this.yM5HHkk1MhPLZFYTHm2JjrArud = 4 == (i & 4);
        this.iR1XUIc7FjhMl57O = 2 == (i & 2);
        this.FzogU2bPCQtD6a1hMYB1kyti = 1 == (i & 1);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x007e  */
    /* JADX WARN: Code duplicated, block: B:12:0x0084  */
    /* JADX WARN: Code duplicated, block: B:15:0x0092  */
    /* JADX WARN: Code duplicated, block: B:16:0x0097  */
    /* JADX WARN: Code duplicated, block: B:19:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:9:0x003c  */
    public final void Aboow6rUrcY2SrFRa46C6uy() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float fZiNFA7KzVfc6;
        float fZiNFA7KzVfc7;
        boolean areAllCornersRounded = getAreAllCornersRounded();
        Path path = this.gsHzEVTj1SCIPR;
        if (areAllCornersRounded) {
            int i = this.Mej0x2K4ZGSUxtYNka4QZ;
            int i2 = this.sCPtafveBAhdLIs2ajN3WV;
            if (i >= i2 / 2) {
                int i3 = this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
                if (i >= i3 / 2) {
                    this.qTa7aqjjB9Bt6mc = true;
                    m0yUnDzOdv9C8h0303IkPlRWYD m0yundzodv9c8h0303ikplrwyd = Companion;
                    float f = (i3 / 2.0f) + this.tdNmBZIJHG1;
                    float f2 = (i2 / 2.0f) + this.J1BE9tYH1em4X1uAhc6L7f4M;
                    m0yundzodv9c8h0303ikplrwyd.getClass();
                    path.reset();
                    path.addCircle(f, f2, Math.min(i3, i2) / 2.0f, Path.Direction.CCW);
                } else {
                    this.qTa7aqjjB9Bt6mc = false;
                    m0yUnDzOdv9C8h0303IkPlRWYD m0yundzodv9c8h0303ikplrwyd2 = Companion;
                    int i4 = this.tdNmBZIJHG1;
                    float f3 = i4;
                    int i5 = this.J1BE9tYH1em4X1uAhc6L7f4M;
                    float f4 = i5;
                    float f5 = i4 + this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
                    float f6 = i5 + this.sCPtafveBAhdLIs2ajN3WV;
                    int i6 = this.Mej0x2K4ZGSUxtYNka4QZ;
                    z = this.f2sXlW3st0rAKJwyOrCfOWc;
                    z2 = this.yM5HHkk1MhPLZFYTHm2JjrArud;
                    z3 = this.FzogU2bPCQtD6a1hMYB1kyti;
                    z4 = this.iR1XUIc7FjhMl57O;
                    m0yundzodv9c8h0303ikplrwyd2.getClass();
                    float f7 = f5 - f3;
                    float f8 = f6 - f4;
                    fZiNFA7KzVfc6 = mo4unDT7uci.ziNFA7KzVfc6(i6, 0.0f, f7 / 2.0f);
                    fZiNFA7KzVfc7 = mo4unDT7uci.ziNFA7KzVfc6(i6, 0.0f, f8 / 2.0f);
                    float f9 = f7 - (2.0f * fZiNFA7KzVfc6);
                    float f10 = f8 - (2.0f * fZiNFA7KzVfc7);
                    path.reset();
                    path.moveTo(f5, f4 + fZiNFA7KzVfc7);
                    if (z2) {
                        float f11 = -fZiNFA7KzVfc7;
                        path.rQuadTo(0.0f, f11, -fZiNFA7KzVfc6, f11);
                    } else {
                        path.rLineTo(0.0f, -fZiNFA7KzVfc7);
                        path.rLineTo(-fZiNFA7KzVfc6, 0.0f);
                    }
                    path.rLineTo(-f9, 0.0f);
                    if (z) {
                        float f12 = -fZiNFA7KzVfc6;
                        path.rQuadTo(f12, 0.0f, f12, fZiNFA7KzVfc7);
                    } else {
                        path.rLineTo(-fZiNFA7KzVfc6, 0.0f);
                        path.rLineTo(0.0f, fZiNFA7KzVfc7);
                    }
                    path.rLineTo(0.0f, f10);
                    if (z4) {
                        path.rQuadTo(0.0f, fZiNFA7KzVfc7, fZiNFA7KzVfc6, fZiNFA7KzVfc7);
                    } else {
                        path.rLineTo(0.0f, fZiNFA7KzVfc7);
                        path.rLineTo(fZiNFA7KzVfc6, 0.0f);
                    }
                    path.rLineTo(f9, 0.0f);
                    if (z3) {
                        path.rQuadTo(fZiNFA7KzVfc6, 0.0f, fZiNFA7KzVfc6, -fZiNFA7KzVfc7);
                    } else {
                        path.rLineTo(fZiNFA7KzVfc6, 0.0f);
                        path.rLineTo(0.0f, -fZiNFA7KzVfc7);
                    }
                    path.rLineTo(0.0f, -f10);
                    path.close();
                }
            } else {
                this.qTa7aqjjB9Bt6mc = false;
                m0yUnDzOdv9C8h0303IkPlRWYD m0yundzodv9c8h0303ikplrwyd3 = Companion;
                int i7 = this.tdNmBZIJHG1;
                float f13 = i7;
                int i8 = this.J1BE9tYH1em4X1uAhc6L7f4M;
                float f14 = i8;
                float f15 = i7 + this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
                float f16 = i8 + this.sCPtafveBAhdLIs2ajN3WV;
                int i9 = this.Mej0x2K4ZGSUxtYNka4QZ;
                z = this.f2sXlW3st0rAKJwyOrCfOWc;
                z2 = this.yM5HHkk1MhPLZFYTHm2JjrArud;
                z3 = this.FzogU2bPCQtD6a1hMYB1kyti;
                z4 = this.iR1XUIc7FjhMl57O;
                m0yundzodv9c8h0303ikplrwyd3.getClass();
                float f17 = f15 - f13;
                float f18 = f16 - f14;
                fZiNFA7KzVfc6 = mo4unDT7uci.ziNFA7KzVfc6(i9, 0.0f, f17 / 2.0f);
                fZiNFA7KzVfc7 = mo4unDT7uci.ziNFA7KzVfc6(i9, 0.0f, f18 / 2.0f);
                float f19 = f17 - (2.0f * fZiNFA7KzVfc6);
                float f110 = f18 - (2.0f * fZiNFA7KzVfc7);
                path.reset();
                path.moveTo(f15, f14 + fZiNFA7KzVfc7);
                if (z2) {
                    float f111 = -fZiNFA7KzVfc7;
                    path.rQuadTo(0.0f, f111, -fZiNFA7KzVfc6, f111);
                } else {
                    path.rLineTo(0.0f, -fZiNFA7KzVfc7);
                    path.rLineTo(-fZiNFA7KzVfc6, 0.0f);
                }
                path.rLineTo(-f19, 0.0f);
                if (z) {
                    float f112 = -fZiNFA7KzVfc6;
                    path.rQuadTo(f112, 0.0f, f112, fZiNFA7KzVfc7);
                } else {
                    path.rLineTo(-fZiNFA7KzVfc6, 0.0f);
                    path.rLineTo(0.0f, fZiNFA7KzVfc7);
                }
                path.rLineTo(0.0f, f110);
                if (z4) {
                    path.rQuadTo(0.0f, fZiNFA7KzVfc7, fZiNFA7KzVfc6, fZiNFA7KzVfc7);
                } else {
                    path.rLineTo(0.0f, fZiNFA7KzVfc7);
                    path.rLineTo(fZiNFA7KzVfc6, 0.0f);
                }
                path.rLineTo(f19, 0.0f);
                if (z3) {
                    path.rQuadTo(fZiNFA7KzVfc6, 0.0f, fZiNFA7KzVfc6, -fZiNFA7KzVfc7);
                } else {
                    path.rLineTo(fZiNFA7KzVfc6, 0.0f);
                    path.rLineTo(0.0f, -fZiNFA7KzVfc7);
                }
                path.rLineTo(0.0f, -f110);
                path.close();
            }
        } else {
            this.qTa7aqjjB9Bt6mc = false;
            m0yUnDzOdv9C8h0303IkPlRWYD m0yundzodv9c8h0303ikplrwyd4 = Companion;
            int i10 = this.tdNmBZIJHG1;
            float f113 = i10;
            int i11 = this.J1BE9tYH1em4X1uAhc6L7f4M;
            float f114 = i11;
            float f115 = i10 + this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
            float f116 = i11 + this.sCPtafveBAhdLIs2ajN3WV;
            int i12 = this.Mej0x2K4ZGSUxtYNka4QZ;
            z = this.f2sXlW3st0rAKJwyOrCfOWc;
            z2 = this.yM5HHkk1MhPLZFYTHm2JjrArud;
            z3 = this.FzogU2bPCQtD6a1hMYB1kyti;
            z4 = this.iR1XUIc7FjhMl57O;
            m0yundzodv9c8h0303ikplrwyd4.getClass();
            float f117 = f115 - f113;
            float f118 = f116 - f114;
            fZiNFA7KzVfc6 = mo4unDT7uci.ziNFA7KzVfc6(i12, 0.0f, f117 / 2.0f);
            fZiNFA7KzVfc7 = mo4unDT7uci.ziNFA7KzVfc6(i12, 0.0f, f118 / 2.0f);
            float f119 = f117 - (2.0f * fZiNFA7KzVfc6);
            float f1110 = f118 - (2.0f * fZiNFA7KzVfc7);
            path.reset();
            path.moveTo(f115, f114 + fZiNFA7KzVfc7);
            if (z2) {
                float f1111 = -fZiNFA7KzVfc7;
                path.rQuadTo(0.0f, f1111, -fZiNFA7KzVfc6, f1111);
            } else {
                path.rLineTo(0.0f, -fZiNFA7KzVfc7);
                path.rLineTo(-fZiNFA7KzVfc6, 0.0f);
            }
            path.rLineTo(-f119, 0.0f);
            if (z) {
                float f1112 = -fZiNFA7KzVfc6;
                path.rQuadTo(f1112, 0.0f, f1112, fZiNFA7KzVfc7);
            } else {
                path.rLineTo(-fZiNFA7KzVfc6, 0.0f);
                path.rLineTo(0.0f, fZiNFA7KzVfc7);
            }
            path.rLineTo(0.0f, f1110);
            if (z4) {
                path.rQuadTo(0.0f, fZiNFA7KzVfc7, fZiNFA7KzVfc6, fZiNFA7KzVfc7);
            } else {
                path.rLineTo(0.0f, fZiNFA7KzVfc7);
                path.rLineTo(fZiNFA7KzVfc6, 0.0f);
            }
            path.rLineTo(f119, 0.0f);
            if (z3) {
                path.rQuadTo(fZiNFA7KzVfc6, 0.0f, fZiNFA7KzVfc6, -fZiNFA7KzVfc7);
            } else {
                path.rLineTo(fZiNFA7KzVfc6, 0.0f);
                path.rLineTo(0.0f, -fZiNFA7KzVfc7);
            }
            path.rLineTo(0.0f, -f1110);
            path.close();
        }
        Path path2 = this.LcvPFGYKhAm4SS5FZ;
        path2.set(path);
        path2.setFillType(Path.FillType.EVEN_ODD);
        ViewOutlineProvider outlineProvider = getOutlineProvider();
        ViewOutlineProvider viewOutlineProvider = ViewOutlineProvider.BACKGROUND;
        if (OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(outlineProvider, viewOutlineProvider) || (getOutlineProvider() instanceof clwQWnugyNAyEZrq) || (getOutlineProvider() instanceof K7GRNeS1CXm8M4)) {
            setOutlineProvider(viewOutlineProvider);
        }
        if (isInEditMode()) {
            setClipToOutline(true);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            super.onDraw(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        super.onDraw(canvas);
        canvas.drawPath(this.gsHzEVTj1SCIPR, this.WIXlfFpvH7glAGsUk3);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = i - (this.tdNmBZIJHG1 + this.tzMOyOc53ffl);
        int i6 = i2 - (this.J1BE9tYH1em4X1uAhc6L7f4M + this.cVfIGUKLEqID1HH);
        if (this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp == i5 && this.sCPtafveBAhdLIs2ajN3WV == i6) {
            return;
        }
        this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = i5;
        this.sCPtafveBAhdLIs2ajN3WV = i6;
        Aboow6rUrcY2SrFRa46C6uy();
    }

    public final void setCornerRadius(int i) {
        if (this.Mej0x2K4ZGSUxtYNka4QZ != i) {
            this.Mej0x2K4ZGSUxtYNka4QZ = i;
            Aboow6rUrcY2SrFRa46C6uy();
        }
    }

    @Override // android.view.View
    public void setOutlineProvider(ViewOutlineProvider viewOutlineProvider) {
        if (OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(viewOutlineProvider, ViewOutlineProvider.BACKGROUND) || (viewOutlineProvider instanceof clwQWnugyNAyEZrq) || (viewOutlineProvider instanceof K7GRNeS1CXm8M4)) {
            super.setOutlineProvider(this.qTa7aqjjB9Bt6mc ? new clwQWnugyNAyEZrq(this) : new K7GRNeS1CXm8M4(this));
        } else {
            super.setOutlineProvider(viewOutlineProvider);
        }
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        ziNFA7KzVfc6();
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        ziNFA7KzVfc6();
    }

    public final void setRoundCorners(EnumSet<ijF9itHzOGR3X> enumSet) {
        boolean z = this.iR1XUIc7FjhMl57O;
        ijF9itHzOGR3X ijf9ithzogr3x = ijF9itHzOGR3X.cCmbv8Tzd2QLd161ImIZUlZ8n;
        if (z == enumSet.contains(ijf9ithzogr3x) && this.FzogU2bPCQtD6a1hMYB1kyti == enumSet.contains(ijF9itHzOGR3X.WIXlfFpvH7glAGsUk3) && this.f2sXlW3st0rAKJwyOrCfOWc == enumSet.contains(ijF9itHzOGR3X.GO8WUug7ZWFCUI1zY) && this.yM5HHkk1MhPLZFYTHm2JjrArud == enumSet.contains(ijF9itHzOGR3X.Rdzg08aYlt0UsoLUNug9cESzgAY9R)) {
            return;
        }
        this.iR1XUIc7FjhMl57O = enumSet.contains(ijf9ithzogr3x);
        this.FzogU2bPCQtD6a1hMYB1kyti = enumSet.contains(ijF9itHzOGR3X.WIXlfFpvH7glAGsUk3);
        this.f2sXlW3st0rAKJwyOrCfOWc = enumSet.contains(ijF9itHzOGR3X.GO8WUug7ZWFCUI1zY);
        this.yM5HHkk1MhPLZFYTHm2JjrArud = enumSet.contains(ijF9itHzOGR3X.Rdzg08aYlt0UsoLUNug9cESzgAY9R);
        Aboow6rUrcY2SrFRa46C6uy();
    }

    public final void setRoundedCorners(int i) {
        setRoundedCornersInternal(i);
        Aboow6rUrcY2SrFRa46C6uy();
    }

    public final void ziNFA7KzVfc6() {
        WeakHashMap weakHashMap = Ne7IrXfSjRisooSM.S1zP5M3X7Ukq3ROlZ87G9I;
        if (getPaddingStart() == this.tdNmBZIJHG1 && getPaddingEnd() == this.tzMOyOc53ffl && getPaddingTop() == this.J1BE9tYH1em4X1uAhc6L7f4M && getPaddingBottom() == this.cVfIGUKLEqID1HH) {
            return;
        }
        this.J1BE9tYH1em4X1uAhc6L7f4M = getPaddingTop();
        this.tdNmBZIJHG1 = getPaddingStart();
        this.tzMOyOc53ffl = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        this.cVfIGUKLEqID1HH = paddingBottom;
        setPaddingRelative(this.tdNmBZIJHG1, this.J1BE9tYH1em4X1uAhc6L7f4M, this.tzMOyOc53ffl, paddingBottom);
    }

    public RoundedImageView(Context context) {
        this(context, null);
    }
}
