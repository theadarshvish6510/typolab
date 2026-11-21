package bitpit.launcher.ataglance.clock;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import b.OkhdZkC3NYLW;
import b.PjK2k0uJ2Y9y6RDAhiGLUQtibm;
import b.r0BXA5ZgwhHZnr4K4Hl;
import b.uuyTGGFjNDiF1SxHW;
import bitpit.launcher.R;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class FlipClockView extends View {
    public final PjK2k0uJ2Y9y6RDAhiGLUQtibm FzogU2bPCQtD6a1hMYB1kyti;
    public LocalDateTime GO8WUug7ZWFCUI1zY;
    public float J1BE9tYH1em4X1uAhc6L7f4M;
    public float LcvPFGYKhAm4SS5FZ;
    public final Path Mej0x2K4ZGSUxtYNka4QZ;
    public boolean Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    public final Paint WIXlfFpvH7glAGsUk3;
    public final Paint cCmbv8Tzd2QLd161ImIZUlZ8n;
    public final Path f2sXlW3st0rAKJwyOrCfOWc;
    public float gsHzEVTj1SCIPR;
    public final Path iR1XUIc7FjhMl57O;
    public final Path qTa7aqjjB9Bt6mc;
    public final float qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
    public float sCPtafveBAhdLIs2ajN3WV;
    public final RectF tdNmBZIJHG1;
    public final RectF tzMOyOc53ffl;
    public String yM5HHkk1MhPLZFYTHm2JjrArud;

    public FlipClockView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0, 0);
        this.GO8WUug7ZWFCUI1zY = LocalDateTime.ofEpochSecond(0L, 0, ZoneOffset.UTC);
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = true;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-16777216);
        this.cCmbv8Tzd2QLd161ImIZUlZ8n = paint;
        Paint paint2 = new Paint(1);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setColor(-1);
        this.WIXlfFpvH7glAGsUk3 = paint2;
        this.gsHzEVTj1SCIPR = getResources().getDisplayMetrics().density * 16.0f;
        this.LcvPFGYKhAm4SS5FZ = getResources().getDisplayMetrics().density * 6.0f;
        this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = getResources().getDisplayMetrics().density * 10.0f;
        this.sCPtafveBAhdLIs2ajN3WV = getResources().getDisplayMetrics().density * 3.0f;
        this.Mej0x2K4ZGSUxtYNka4QZ = new Path();
        this.qTa7aqjjB9Bt6mc = new Path();
        this.f2sXlW3st0rAKJwyOrCfOWc = new Path();
        this.iR1XUIc7FjhMl57O = new Path();
        this.yM5HHkk1MhPLZFYTHm2JjrArud = "0000";
        this.FzogU2bPCQtD6a1hMYB1kyti = new PjK2k0uJ2Y9y6RDAhiGLUQtibm();
        this.tdNmBZIJHG1 = new RectF();
        this.tzMOyOc53ffl = new RectF();
        int color = context.getColor(R.color.shadow);
        float integer = getResources().getInteger(R.integer.shadow_radius);
        float integer2 = getResources().getInteger(R.integer.shadow_dx);
        float integer3 = getResources().getInteger(R.integer.shadow_dy);
        if (color == 0) {
            paint.clearShadowLayer();
        } else {
            paint.setShadowLayer(integer, integer2, integer3, color);
        }
    }

    public static final void Aboow6rUrcY2SrFRa46C6uy(FlipClockView flipClockView, char c, float f, float f2) {
        Path path = flipClockView.f2sXlW3st0rAKJwyOrCfOWc;
        path.rewind();
        flipClockView.WIXlfFpvH7glAGsUk3.getTextPath(String.valueOf(c), 0, 1, f, f2, path);
        flipClockView.qTa7aqjjB9Bt6mc.addPath(path);
    }

    public final void BezslBgjveK3hODH(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        float paddingLeft = (width / 2.0f) + getPaddingLeft();
        float fMin = Math.min((width - this.LcvPFGYKhAm4SS5FZ) / 2.0f, height);
        this.J1BE9tYH1em4X1uAhc6L7f4M = fMin;
        float f = paddingLeft - (this.LcvPFGYKhAm4SS5FZ / 2.0f);
        RectF rectF = this.tdNmBZIJHG1;
        rectF.right = f;
        rectF.left = f - fMin;
        float paddingBottom = i2 - getPaddingBottom();
        rectF.bottom = paddingBottom;
        float f2 = this.J1BE9tYH1em4X1uAhc6L7f4M;
        rectF.top = paddingBottom - f2;
        float f3 = (this.LcvPFGYKhAm4SS5FZ / 2.0f) + paddingLeft;
        RectF rectF2 = this.tzMOyOc53ffl;
        rectF2.left = f3;
        rectF2.right = f3 + f2;
        rectF2.top = rectF.top;
        rectF2.bottom = rectF.bottom;
        Paint paint = this.WIXlfFpvH7glAGsUk3;
        paint.setTextSize(f2 * 0.6f);
        float f4 = (this.J1BE9tYH1em4X1uAhc6L7f4M / 2.0f) - this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
        float f5 = getResources().getDisplayMetrics().density * 4.0f;
        while (true) {
            PjK2k0uJ2Y9y6RDAhiGLUQtibm pjK2k0uJ2Y9y6RDAhiGLUQtibm = this.FzogU2bPCQtD6a1hMYB1kyti;
            pjK2k0uJ2Y9y6RDAhiGLUQtibm.axL8FocTDLUdzg0XScbO(paint);
            float f6 = f4 - (pjK2k0uJ2Y9y6RDAhiGLUQtibm.axL8FocTDLUdzg0XScbO + f5);
            if (Math.abs(f6) <= 1.0f) {
                pjK2k0uJ2Y9y6RDAhiGLUQtibm.axL8FocTDLUdzg0XScbO(paint);
                axL8FocTDLUdzg0XScbO(i);
                S1zP5M3X7Ukq3ROlZ87G9I();
                ziNFA7KzVfc6();
                return;
            }
            paint.setTextSize(paint.getTextSize() + f6);
        }
    }

    public final void S1zP5M3X7Ukq3ROlZ87G9I() {
        Path path = this.Mej0x2K4ZGSUxtYNka4QZ;
        path.rewind();
        float f = this.gsHzEVTj1SCIPR;
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.tdNmBZIJHG1, f, f, direction);
        RectF rectF = this.tzMOyOc53ffl;
        float f2 = this.gsHzEVTj1SCIPR;
        path.addRoundRect(rectF, f2, f2, direction);
        path.op(this.iR1XUIc7FjhMl57O, Path.Op.DIFFERENCE);
    }

    public final void axL8FocTDLUdzg0XScbO(int i) {
        Path path = this.iR1XUIc7FjhMl57O;
        path.rewind();
        if (this.sCPtafveBAhdLIs2ajN3WV <= 0.0f) {
            return;
        }
        RectF rectF = this.tdNmBZIJHG1;
        path.addRect(0.0f, rectF.centerY() - (this.sCPtafveBAhdLIs2ajN3WV / 2.0f), i, (this.sCPtafveBAhdLIs2ajN3WV / 2.0f) + rectF.centerY(), Path.Direction.CW);
    }

    public final float getBackgroundCornerRadius() {
        return this.gsHzEVTj1SCIPR;
    }

    public final float getDividerHeight() {
        return this.sCPtafveBAhdLIs2ajN3WV;
    }

    public final float getSquareDistance() {
        return this.LcvPFGYKhAm4SS5FZ;
    }

    public final LocalDateTime getTime() {
        return this.GO8WUug7ZWFCUI1zY;
    }

    public final Typeface getTypeface() {
        return this.WIXlfFpvH7glAGsUk3.getTypeface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawPath(this.Mej0x2K4ZGSUxtYNka4QZ, this.cCmbv8Tzd2QLd161ImIZUlZ8n);
        canvas.drawPath(this.qTa7aqjjB9Bt6mc, this.WIXlfFpvH7glAGsUk3);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
        int defaultSize2 = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
        setMeasuredDimension(defaultSize, getPaddingBottom() + r0BXA5ZgwhHZnr4K4Hl.S1zP5M3X7Ukq3ROlZ87G9I(Math.min((((defaultSize - getPaddingLeft()) - getPaddingRight()) - this.LcvPFGYKhAm4SS5FZ) / 2.0f, (defaultSize2 - getPaddingTop()) - getPaddingBottom())) + getPaddingTop());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        BezslBgjveK3hODH(i, i2);
    }

    public final void ox9eclwMpRd() {
        boolean z = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
        LocalDateTime localDateTime = this.GO8WUug7ZWFCUI1zY;
        this.yM5HHkk1MhPLZFYTHm2JjrArud = String.format(Locale.US, "%02d%02d", Arrays.copyOf(new Object[]{Integer.valueOf(z ? localDateTime.getHour() : localDateTime.get(ChronoField.CLOCK_HOUR_OF_AMPM)), Integer.valueOf(this.GO8WUug7ZWFCUI1zY.getMinute())}, 2));
        ziNFA7KzVfc6();
        invalidate();
    }

    public final void set24HourFormat(boolean z) {
        if (this.Rdzg08aYlt0UsoLUNug9cESzgAY9R != z) {
            this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = z;
            ox9eclwMpRd();
        }
    }

    public final void setBackgroundCornerRadius(float f) {
        if (f < 0.0f) {
            uuyTGGFjNDiF1SxHW.PQQPeCDD0JLCT3aLz("value must be non-negative");
        } else {
            this.gsHzEVTj1SCIPR = f;
            S1zP5M3X7Ukq3ROlZ87G9I();
        }
    }

    public final void setDividerHeight(float f) {
        if (f < 0.0f) {
            uuyTGGFjNDiF1SxHW.PQQPeCDD0JLCT3aLz("value must be non-negative");
            return;
        }
        this.sCPtafveBAhdLIs2ajN3WV = f;
        axL8FocTDLUdzg0XScbO(getWidth());
        S1zP5M3X7Ukq3ROlZ87G9I();
        ziNFA7KzVfc6();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        BezslBgjveK3hODH(getWidth(), getHeight());
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        BezslBgjveK3hODH(getWidth(), getHeight());
    }

    public final void setSquareDistance(float f) {
        if (f < 0.0f) {
            uuyTGGFjNDiF1SxHW.PQQPeCDD0JLCT3aLz("value must be non-negative");
        } else {
            this.LcvPFGYKhAm4SS5FZ = f;
            BezslBgjveK3hODH(getWidth(), getHeight());
        }
    }

    public final void setTime(LocalDateTime localDateTime) {
        if (OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.GO8WUug7ZWFCUI1zY, localDateTime)) {
            return;
        }
        this.GO8WUug7ZWFCUI1zY = localDateTime;
        ox9eclwMpRd();
    }

    public final void setTypeface(Typeface typeface) {
        this.WIXlfFpvH7glAGsUk3.setTypeface(typeface);
        BezslBgjveK3hODH(getWidth(), getHeight());
    }

    public final void ziNFA7KzVfc6() {
        if (this.J1BE9tYH1em4X1uAhc6L7f4M <= 0.0f) {
            return;
        }
        Path path = this.qTa7aqjjB9Bt6mc;
        path.rewind();
        float f = this.J1BE9tYH1em4X1uAhc6L7f4M / 2.0f;
        float f2 = this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
        char cCharAt = this.yM5HHkk1MhPLZFYTHm2JjrArud.charAt(0);
        RectF rectF = this.tdNmBZIJHG1;
        float f3 = (f - f2) / 2.0f;
        float f4 = rectF.left + f2 + f3;
        float fCenterY = rectF.centerY();
        PjK2k0uJ2Y9y6RDAhiGLUQtibm pjK2k0uJ2Y9y6RDAhiGLUQtibm = this.FzogU2bPCQtD6a1hMYB1kyti;
        Aboow6rUrcY2SrFRa46C6uy(this, cCharAt, f4, fCenterY + pjK2k0uJ2Y9y6RDAhiGLUQtibm.S1zP5M3X7Ukq3ROlZ87G9I());
        Aboow6rUrcY2SrFRa46C6uy(this, this.yM5HHkk1MhPLZFYTHm2JjrArud.charAt(1), rectF.centerX() + f3, rectF.centerY() + pjK2k0uJ2Y9y6RDAhiGLUQtibm.S1zP5M3X7Ukq3ROlZ87G9I());
        char cCharAt2 = this.yM5HHkk1MhPLZFYTHm2JjrArud.charAt(2);
        RectF rectF2 = this.tzMOyOc53ffl;
        Aboow6rUrcY2SrFRa46C6uy(this, cCharAt2, rectF2.left + f2 + f3, rectF2.centerY() + pjK2k0uJ2Y9y6RDAhiGLUQtibm.S1zP5M3X7Ukq3ROlZ87G9I());
        Aboow6rUrcY2SrFRa46C6uy(this, this.yM5HHkk1MhPLZFYTHm2JjrArud.charAt(3), rectF2.centerX() + f3, rectF2.centerY() + pjK2k0uJ2Y9y6RDAhiGLUQtibm.S1zP5M3X7Ukq3ROlZ87G9I());
        path.op(this.iR1XUIc7FjhMl57O, Path.Op.DIFFERENCE);
    }

    public FlipClockView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
    }

    public FlipClockView(Context context) {
        this(context, null, 14);
    }
}
