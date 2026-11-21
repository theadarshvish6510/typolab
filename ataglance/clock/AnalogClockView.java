package bitpit.launcher.ataglance.clock;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import b.ASDwBkZhws;
import b.Cwc3EXEJz6AM6uT;
import b.Hh9QFKYRhdTXcR7Vrllb;
import b.JiWHy2CJQJIFvksd;
import b.mHW63SUma8isGb;
import b.mo4unDT7uci;
import b.qSDYaDqxbBy2QEeVAcFRy;
import b.uuyTGGFjNDiF1SxHW;
import b.zVkUtEURLvHNycfQPRiFy1I;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;

/* JADX INFO: loaded from: classes.dex */
public final class AnalogClockView extends View {
    public static final JiWHy2CJQJIFvksd Companion = new JiWHy2CJQJIFvksd();
    public final Rect Cl5XA76hhttS71Yja18WBMw7;
    public int FzogU2bPCQtD6a1hMYB1kyti;
    public LocalDateTime GO8WUug7ZWFCUI1zY;
    public float IPi49brQACDpXJTJMp7;
    public final mHW63SUma8isGb IQ6Ug1woLp4DNbPVXhFhC3Fz;
    public float J1BE9tYH1em4X1uAhc6L7f4M;
    public final float LcvPFGYKhAm4SS5FZ;
    public final float Mej0x2K4ZGSUxtYNka4QZ;
    public final mHW63SUma8isGb PoRwkUUfcmwTiLMm;
    public final ColorStateList Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    public int TRrGdQy1m1oiOyDDQetUoo3r;
    public final mHW63SUma8isGb VCFExcQdFJK;
    public final ColorStateList WIXlfFpvH7glAGsUk3;
    public final mHW63SUma8isGb WTnUxqIXsY1ZtjOlRVhyf;
    public final mHW63SUma8isGb bfvGkgRqVBmXp4z3D5cuKKKZz;
    public final ColorStateList cCmbv8Tzd2QLd161ImIZUlZ8n;
    public float cVfIGUKLEqID1HH;
    public float czGAefXQxIZzo;
    public final float f2sXlW3st0rAKJwyOrCfOWc;
    public float f5pjKkfEQcp;
    public final float gsHzEVTj1SCIPR;
    public final mHW63SUma8isGb hsgUkarQLKL1aF8JVboCqnbaz1;
    public int iR1XUIc7FjhMl57O;
    public float jvttfmFMQfShe6OfbNf1zF8CyEu;
    public boolean nXIf4d0RGTWG1l;
    public final mHW63SUma8isGb pxQZ0age7p8NRIzVdDYzzScB;
    public final float qTa7aqjjB9Bt6mc;
    public final float qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
    public final float sCPtafveBAhdLIs2ajN3WV;
    public float tdNmBZIJHG1;
    public float tzMOyOc53ffl;
    public final mHW63SUma8isGb vHDGcerxdYUGlVld2h;
    public int yM5HHkk1MhPLZFYTHm2JjrArud;
    public float yZj7bj6KyeuYi9woqDlC;

    /* JADX WARN: Illegal instructions before constructor call */
    public AnalogClockView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0, 0);
        this.GO8WUug7ZWFCUI1zY = LocalDateTime.ofEpochSecond(0L, 0, ZoneOffset.UTC);
        this.qTa7aqjjB9Bt6mc = context.getResources().getDisplayMetrics().density * 2.25f;
        this.f2sXlW3st0rAKJwyOrCfOWc = context.getResources().getDisplayMetrics().density * 2.4f;
        this.hsgUkarQLKL1aF8JVboCqnbaz1 = S1zP5M3X7Ukq3ROlZ87G9I(Paint.Style.FILL);
        Paint.Style style = Paint.Style.STROKE;
        this.IQ6Ug1woLp4DNbPVXhFhC3Fz = S1zP5M3X7Ukq3ROlZ87G9I(style);
        this.vHDGcerxdYUGlVld2h = S1zP5M3X7Ukq3ROlZ87G9I(style);
        this.bfvGkgRqVBmXp4z3D5cuKKKZz = S1zP5M3X7Ukq3ROlZ87G9I(style);
        this.VCFExcQdFJK = S1zP5M3X7Ukq3ROlZ87G9I(style);
        Paint.Style style2 = Paint.Style.FILL_AND_STROKE;
        this.WTnUxqIXsY1ZtjOlRVhyf = S1zP5M3X7Ukq3ROlZ87G9I(style2);
        this.pxQZ0age7p8NRIzVdDYzzScB = S1zP5M3X7Ukq3ROlZ87G9I(style);
        this.PoRwkUUfcmwTiLMm = S1zP5M3X7Ukq3ROlZ87G9I(style2);
        this.Cl5XA76hhttS71Yja18WBMw7 = new Rect();
        this.TRrGdQy1m1oiOyDDQetUoo3r = 4353;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zVkUtEURLvHNycfQPRiFy1I.S1zP5M3X7Ukq3ROlZ87G9I, 0, 0);
        try {
            this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = typedArrayObtainStyledAttributes.getColorStateList(1);
            this.cCmbv8Tzd2QLd161ImIZUlZ8n = typedArrayObtainStyledAttributes.getColorStateList(3);
            this.WIXlfFpvH7glAGsUk3 = typedArrayObtainStyledAttributes.getColorStateList(2);
            this.gsHzEVTj1SCIPR = typedArrayObtainStyledAttributes.getDimension(5, context.getResources().getDisplayMetrics().density * 2.5f);
            this.LcvPFGYKhAm4SS5FZ = typedArrayObtainStyledAttributes.getDimension(7, context.getResources().getDisplayMetrics().density * 1.5f);
            this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = typedArrayObtainStyledAttributes.getDimension(0, context.getResources().getDisplayMetrics().density * 1.5f);
            this.sCPtafveBAhdLIs2ajN3WV = typedArrayObtainStyledAttributes.getDimension(6, context.getResources().getDisplayMetrics().density * 11.0f);
            this.Mej0x2K4ZGSUxtYNka4QZ = typedArrayObtainStyledAttributes.getDimension(4, context.getResources().getDisplayMetrics().density * 9.0f);
            typedArrayObtainStyledAttributes.recycle();
            ziNFA7KzVfc6();
            axL8FocTDLUdzg0XScbO();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static mHW63SUma8isGb S1zP5M3X7Ukq3ROlZ87G9I(Paint.Style style) {
        return qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(3, new Cwc3EXEJz6AM6uT(1, style));
    }

    private final Paint getBorderPaint() {
        return (Paint) this.IQ6Ug1woLp4DNbPVXhFhC3Fz.getValue();
    }

    private final Paint getDateBoxPaint() {
        return (Paint) this.pxQZ0age7p8NRIzVdDYzzScB.getValue();
    }

    private final Paint getDatePaint() {
        return (Paint) this.PoRwkUUfcmwTiLMm.getValue();
    }

    private final Paint getFacePaint() {
        return (Paint) this.hsgUkarQLKL1aF8JVboCqnbaz1.getValue();
    }

    private final Paint getHandsPaint() {
        return (Paint) this.VCFExcQdFJK.getValue();
    }

    private final Paint getHoursTicksPaint() {
        return (Paint) this.vHDGcerxdYUGlVld2h.getValue();
    }

    private final Paint getMinutesTicksPaint() {
        return (Paint) this.bfvGkgRqVBmXp4z3D5cuKKKZz.getValue();
    }

    private final Paint getNumbersPaint() {
        return (Paint) this.WTnUxqIXsY1ZtjOlRVhyf.getValue();
    }

    public final void BezslBgjveK3hODH() {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        float fMin = Math.min(width, height);
        this.J1BE9tYH1em4X1uAhc6L7f4M = (width / 2.0f) + getPaddingLeft();
        this.tdNmBZIJHG1 = (height / 2.0f) + getPaddingTop();
        float f = fMin / 2.0f;
        this.tzMOyOc53ffl = f;
        float f2 = 0.06f * f;
        this.cVfIGUKLEqID1HH = f2;
        this.czGAefXQxIZzo = (0.55f * f) - f2;
        this.yZj7bj6KyeuYi9woqDlC = (0.85f * f) - f2;
        this.IPi49brQACDpXJTJMp7 = 0.75f * f;
        this.jvttfmFMQfShe6OfbNf1zF8CyEu = 0.38f * f;
        this.nXIf4d0RGTWG1l = f < 48.0f * getContext().getResources().getDisplayMetrics().density;
    }

    public final void axL8FocTDLUdzg0XScbO() {
        int i;
        int i2 = this.TRrGdQy1m1oiOyDDQetUoo3r;
        int i3 = (i2 & 127) != 0 ? this.yM5HHkk1MhPLZFYTHm2JjrArud : this.FzogU2bPCQtD6a1hMYB1kyti;
        if ((i2 & 127) != 0) {
            getFacePaint().setColor(this.iR1XUIc7FjhMl57O);
        }
        if ((this.TRrGdQy1m1oiOyDDQetUoo3r & 128) == 128) {
            Paint borderPaint = getBorderPaint();
            borderPaint.setStrokeWidth(this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp);
            borderPaint.setColor(i3);
        }
        Paint handsPaint = getHandsPaint();
        handsPaint.setStrokeWidth(this.gsHzEVTj1SCIPR);
        handsPaint.setColor(i3);
        if ((this.TRrGdQy1m1oiOyDDQetUoo3r & 4864) != 0) {
            Paint minutesTicksPaint = getMinutesTicksPaint();
            float f = this.LcvPFGYKhAm4SS5FZ;
            minutesTicksPaint.setStrokeWidth(f);
            int i4 = this.TRrGdQy1m1oiOyDDQetUoo3r & 768;
            if (i4 == 256) {
                i = (16777215 & i3) | (107 << 24);
            } else {
                if (i4 != 512) {
                    uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("Unknown minutes ticks style");
                    return;
                }
                i = i3;
            }
            minutesTicksPaint.setColor(i);
            Paint hoursTicksPaint = getHoursTicksPaint();
            hoursTicksPaint.setStrokeWidth(f);
            hoursTicksPaint.setColor(i3);
        }
        int i5 = this.TRrGdQy1m1oiOyDDQetUoo3r;
        this.f5pjKkfEQcp = ((i5 & 128) != 128 && (i5 & 127) == 0) ? 0.0f : getContext().getResources().getDisplayMetrics().density * 3.0f;
        if ((this.TRrGdQy1m1oiOyDDQetUoo3r & 65536) != 0) {
            Paint numbersPaint = getNumbersPaint();
            numbersPaint.setTextSize(this.sCPtafveBAhdLIs2ajN3WV);
            numbersPaint.setTextAlign(Paint.Align.CENTER);
            numbersPaint.setColor(i3);
        }
        if ((this.TRrGdQy1m1oiOyDDQetUoo3r & 1048576) == 1048576) {
            Paint dateBoxPaint = getDateBoxPaint();
            dateBoxPaint.setStrokeWidth(getContext().getResources().getDisplayMetrics().density);
            dateBoxPaint.setColor(i3);
            Paint datePaint = getDatePaint();
            datePaint.setTextSize(this.Mej0x2K4ZGSUxtYNka4QZ);
            datePaint.setTextAlign(Paint.Align.CENTER);
            datePaint.setColor(i3);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        super.drawableStateChanged();
        ColorStateList colorStateList3 = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
        if (((colorStateList3 == null || !colorStateList3.isStateful()) && (((colorStateList = this.cCmbv8Tzd2QLd161ImIZUlZ8n) == null || !colorStateList.isStateful()) && ((colorStateList2 = this.WIXlfFpvH7glAGsUk3) == null || !colorStateList2.isStateful()))) || !ziNFA7KzVfc6()) {
            return;
        }
        axL8FocTDLUdzg0XScbO();
    }

    /* JADX INFO: renamed from: getStyle-3vMINV4, reason: not valid java name */
    public final int m14getStyle3vMINV4() {
        return this.TRrGdQy1m1oiOyDDQetUoo3r;
    }

    public final LocalDateTime getTime() {
        return this.GO8WUug7ZWFCUI1zY;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.translate(this.J1BE9tYH1em4X1uAhc6L7f4M, this.tdNmBZIJHG1);
        if ((this.TRrGdQy1m1oiOyDDQetUoo3r & 127) != 0) {
            canvas.drawCircle(0.0f, 0.0f, this.tzMOyOc53ffl, getFacePaint());
        }
        if ((this.TRrGdQy1m1oiOyDDQetUoo3r & 128) == 128) {
            canvas.drawCircle(0.0f, 0.0f, this.tzMOyOc53ffl - (getBorderPaint().getStrokeWidth() / 2.0f), getBorderPaint());
        }
        int i = this.TRrGdQy1m1oiOyDDQetUoo3r;
        if ((i & 4864) != 0) {
            Hh9QFKYRhdTXcR7Vrllb hh9QFKYRhdTXcR7VrllbToEIy0qfkltfGfO3vmAQG = mo4unDT7uci.ToEIy0qfkltfGfO3vmAQG(mo4unDT7uci.H5sQ15nhYoaKKHhx(0, 360), (i & 768) != 0 ? 6 : 30);
            int i2 = hh9QFKYRhdTXcR7VrllbToEIy0qfkltfGfO3vmAQG.GO8WUug7ZWFCUI1zY;
            int i3 = hh9QFKYRhdTXcR7VrllbToEIy0qfkltfGfO3vmAQG.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
            int i4 = hh9QFKYRhdTXcR7VrllbToEIy0qfkltfGfO3vmAQG.cCmbv8Tzd2QLd161ImIZUlZ8n;
            if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
                int i5 = i2;
                while (true) {
                    Paint minutesTicksPaint = (i5 % 5 != 0 || (this.TRrGdQy1m1oiOyDDQetUoo3r & 4096) == 0) ? getMinutesTicksPaint() : getHoursTicksPaint();
                    float f = this.tzMOyOc53ffl;
                    float f2 = f - this.cVfIGUKLEqID1HH;
                    float f3 = this.f5pjKkfEQcp;
                    int iSave = canvas.save();
                    canvas.rotate(i5, 0.0f, 0.0f);
                    try {
                        canvas.drawLine(0.0f, -(f2 - f3), 0.0f, -(f - f3), minutesTicksPaint);
                        canvas.restoreToCount(iSave);
                        if (i5 == i3) {
                            break;
                        } else {
                            i5 += i4;
                        }
                    } catch (Throwable th) {
                        canvas.restoreToCount(iSave);
                        throw th;
                    }
                }
            }
        }
        int i6 = this.TRrGdQy1m1oiOyDDQetUoo3r & 65536;
        Rect rect = this.Cl5XA76hhttS71Yja18WBMw7;
        if (i6 != 0 && !this.nXIf4d0RGTWG1l) {
            int i7 = 0;
            while (true) {
                int i8 = 12;
                if (i7 >= 12) {
                    break;
                }
                String strValueOf = String.valueOf(i7 == 0 ? 12 : i7);
                getNumbersPaint().getTextBounds(strValueOf, 0, strValueOf.length(), rect);
                double radians = Math.toRadians(((double) i7) * 30.0d);
                if (i7 != 0) {
                    i8 = i7;
                }
                canvas.drawText(String.valueOf(i8), ((float) Math.sin(radians)) * this.IPi49brQACDpXJTJMp7, ((-((float) Math.cos(radians))) * this.IPi49brQACDpXJTJMp7) - rect.exactCenterY(), getNumbersPaint());
                i7++;
            }
        }
        if ((this.TRrGdQy1m1oiOyDDQetUoo3r & 1048576) == 1048576 && !this.nXIf4d0RGTWG1l) {
            String strValueOf2 = String.valueOf(this.GO8WUug7ZWFCUI1zY.getDayOfMonth());
            getDatePaint().getTextBounds(strValueOf2, 0, strValueOf2.length(), rect);
            canvas.drawText(strValueOf2, this.jvttfmFMQfShe6OfbNf1zF8CyEu, -rect.exactCenterY(), getDatePaint());
            float fWidth = rect.width() / 2.0f;
            float f4 = this.qTa7aqjjB9Bt6mc;
            float f5 = fWidth + f4;
            float fHeight = (rect.height() / 2.0f) + f4;
            float f6 = this.jvttfmFMQfShe6OfbNf1zF8CyEu;
            float f7 = this.f2sXlW3st0rAKJwyOrCfOWc;
            canvas.drawRoundRect(f6 - f5, -fHeight, f5 + f6, fHeight, f7, f7, getDateBoxPaint());
        }
        int i9 = this.GO8WUug7ZWFCUI1zY.get(ChronoField.HOUR_OF_AMPM);
        int minute = this.GO8WUug7ZWFCUI1zY.getMinute();
        Paint handsPaint = getHandsPaint();
        float f8 = minute;
        float f9 = ((f8 / 60.0f) + i9) * 30.0f;
        float f10 = this.czGAefXQxIZzo - this.f5pjKkfEQcp;
        int iSave2 = canvas.save();
        canvas.rotate(f9, 0.0f, 0.0f);
        try {
            canvas.drawLine(0.0f, -0.0f, 0.0f, -f10, handsPaint);
            canvas.restoreToCount(iSave2);
            Paint handsPaint2 = getHandsPaint();
            float f11 = this.yZj7bj6KyeuYi9woqDlC - this.f5pjKkfEQcp;
            int iSave3 = canvas.save();
            canvas.rotate(f8 * 6.0f, 0.0f, 0.0f);
            try {
                canvas.drawLine(0.0f, -0.0f, 0.0f, -f11, handsPaint2);
            } finally {
                canvas.restoreToCount(iSave3);
            }
        } catch (Throwable th2) {
            canvas.restoreToCount(iSave2);
            throw th2;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        BezslBgjveK3hODH();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        BezslBgjveK3hODH();
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        BezslBgjveK3hODH();
    }

    /* JADX INFO: renamed from: setStyle-f5CQEqg, reason: not valid java name */
    public final void m15setStylef5CQEqg(int i) {
        if (i == this.TRrGdQy1m1oiOyDDQetUoo3r) {
            return;
        }
        this.TRrGdQy1m1oiOyDDQetUoo3r = i;
        axL8FocTDLUdzg0XScbO();
    }

    public final void setTime(LocalDateTime localDateTime) {
        this.GO8WUug7ZWFCUI1zY = localDateTime;
        invalidate();
    }

    public final boolean ziNFA7KzVfc6() {
        ColorStateList colorStateList = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
        int colorForState = colorStateList != null ? colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor()) : ASDwBkZhws.ox9eclwMpRd(getContext(), R.attr.colorBackground, null, 6);
        ColorStateList colorStateList2 = this.cCmbv8Tzd2QLd161ImIZUlZ8n;
        int colorForState2 = colorStateList2 != null ? colorStateList2.getColorForState(getDrawableState(), colorStateList2.getDefaultColor()) : ASDwBkZhws.ox9eclwMpRd(getContext(), R.attr.textColorPrimary, null, 6);
        ColorStateList colorStateList3 = this.WIXlfFpvH7glAGsUk3;
        int colorForState3 = colorStateList3 != null ? colorStateList3.getColorForState(getDrawableState(), colorStateList3.getDefaultColor()) : ASDwBkZhws.ox9eclwMpRd(getContext(), R.attr.textColorPrimary, null, 6);
        if (colorForState == this.iR1XUIc7FjhMl57O && colorForState2 == this.yM5HHkk1MhPLZFYTHm2JjrArud && colorForState3 == this.FzogU2bPCQtD6a1hMYB1kyti) {
            return false;
        }
        this.iR1XUIc7FjhMl57O = colorForState;
        this.yM5HHkk1MhPLZFYTHm2JjrArud = colorForState2;
        this.FzogU2bPCQtD6a1hMYB1kyti = colorForState3;
        return true;
    }

    public AnalogClockView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
    }

    public AnalogClockView(Context context) {
        this(context, null, 14);
    }
}
