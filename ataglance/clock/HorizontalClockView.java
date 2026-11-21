package bitpit.launcher.ataglance.clock;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import b.ASDwBkZhws;
import b.GkEpHTllUQBkRob2X6;
import b.OkhdZkC3NYLW;
import b.PjK2k0uJ2Y9y6RDAhiGLUQtibm;
import b.UkGV8Valw3R7JAWib0vwIWTxC0M;
import b.r0BXA5ZgwhHZnr4K4Hl;
import b.riWyCIOfdEkuQWvLIhpup1hab;
import b.zVkUtEURLvHNycfQPRiFy1I;
import bitpit.launcher.R;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class HorizontalClockView extends View {
    public final riWyCIOfdEkuQWvLIhpup1hab FzogU2bPCQtD6a1hMYB1kyti;
    public LocalDateTime GO8WUug7ZWFCUI1zY;
    public int J1BE9tYH1em4X1uAhc6L7f4M;
    public String LcvPFGYKhAm4SS5FZ;
    public final Paint Mej0x2K4ZGSUxtYNka4QZ;
    public boolean Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    public float WIXlfFpvH7glAGsUk3;
    public float cCmbv8Tzd2QLd161ImIZUlZ8n;
    public final PjK2k0uJ2Y9y6RDAhiGLUQtibm f2sXlW3st0rAKJwyOrCfOWc;
    public String gsHzEVTj1SCIPR;
    public riWyCIOfdEkuQWvLIhpup1hab iR1XUIc7FjhMl57O;
    public final PjK2k0uJ2Y9y6RDAhiGLUQtibm qTa7aqjjB9Bt6mc;
    public float qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
    public final Paint sCPtafveBAhdLIs2ajN3WV;
    public int tdNmBZIJHG1;
    public riWyCIOfdEkuQWvLIhpup1hab yM5HHkk1MhPLZFYTHm2JjrArud;

    /* JADX WARN: Illegal instructions before constructor call */
    public HorizontalClockView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0, 0);
        this.GO8WUug7ZWFCUI1zY = LocalDateTime.ofEpochSecond(0L, 0, ZoneOffset.UTC);
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = true;
        this.gsHzEVTj1SCIPR = "";
        this.LcvPFGYKhAm4SS5FZ = "";
        Paint paint = new Paint(1);
        this.sCPtafveBAhdLIs2ajN3WV = paint;
        Paint paint2 = new Paint(1);
        this.Mej0x2K4ZGSUxtYNka4QZ = paint2;
        PjK2k0uJ2Y9y6RDAhiGLUQtibm pjK2k0uJ2Y9y6RDAhiGLUQtibm = new PjK2k0uJ2Y9y6RDAhiGLUQtibm();
        this.qTa7aqjjB9Bt6mc = pjK2k0uJ2Y9y6RDAhiGLUQtibm;
        PjK2k0uJ2Y9y6RDAhiGLUQtibm pjK2k0uJ2Y9y6RDAhiGLUQtibm2 = new PjK2k0uJ2Y9y6RDAhiGLUQtibm();
        this.f2sXlW3st0rAKJwyOrCfOWc = pjK2k0uJ2Y9y6RDAhiGLUQtibm2;
        riWyCIOfdEkuQWvLIhpup1hab.Companion.getClass();
        riWyCIOfdEkuQWvLIhpup1hab riwyciofdekuqwvlihpup1hab = riWyCIOfdEkuQWvLIhpup1hab.Aboow6rUrcY2SrFRa46C6uy;
        this.iR1XUIc7FjhMl57O = riwyciofdekuqwvlihpup1hab;
        this.yM5HHkk1MhPLZFYTHm2JjrArud = riwyciofdekuqwvlihpup1hab;
        this.FzogU2bPCQtD6a1hMYB1kyti = riwyciofdekuqwvlihpup1hab;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zVkUtEURLvHNycfQPRiFy1I.Aboow6rUrcY2SrFRa46C6uy, 0, 0);
        try {
            int iOx9eclwMpRd = ASDwBkZhws.ox9eclwMpRd(context, R.attr.onWallpaperColor, null, 6);
            axL8FocTDLUdzg0XScbO(typedArrayObtainStyledAttributes.getColor(1, iOx9eclwMpRd), typedArrayObtainStyledAttributes.getColor(3, iOx9eclwMpRd));
            float dimension = typedArrayObtainStyledAttributes.getDimension(2, typedArrayObtainStyledAttributes.getResources().getDimension(R.dimen.horizontal_clock_default_hours_text_size));
            float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, typedArrayObtainStyledAttributes.getResources().getDimension(R.dimen.horizontal_clock_default_minutes_text_size));
            paint.setTextSize(dimension);
            paint2.setTextSize(dimension2);
            this.WIXlfFpvH7glAGsUk3 = typedArrayObtainStyledAttributes.getDimension(0, typedArrayObtainStyledAttributes.getResources().getDimension(R.dimen.horizontal_clock_default_horizontal_gap));
            this.cCmbv8Tzd2QLd161ImIZUlZ8n = typedArrayObtainStyledAttributes.getDimension(5, typedArrayObtainStyledAttributes.getResources().getDimension(R.dimen.horizontal_clock_default_vertical_offset));
            pjK2k0uJ2Y9y6RDAhiGLUQtibm.axL8FocTDLUdzg0XScbO(paint);
            pjK2k0uJ2Y9y6RDAhiGLUQtibm2.axL8FocTDLUdzg0XScbO(paint2);
            typedArrayObtainStyledAttributes.recycle();
            int color = context.getColor(R.color.shadow);
            setLightClockTextShadow(color != 0 ? new riWyCIOfdEkuQWvLIhpup1hab(color, getResources().getInteger(R.integer.shadow_radius), getResources().getInteger(R.integer.shadow_dx), getResources().getInteger(R.integer.shadow_dy)) : riwyciofdekuqwvlihpup1hab);
            S1zP5M3X7Ukq3ROlZ87G9I();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void setLightClockTextShadow(riWyCIOfdEkuQWvLIhpup1hab riwyciofdekuqwvlihpup1hab) {
        this.yM5HHkk1MhPLZFYTHm2JjrArud = riwyciofdekuqwvlihpup1hab;
        BezslBgjveK3hODH();
    }

    public final void BezslBgjveK3hODH() {
        Paint paint = this.sCPtafveBAhdLIs2ajN3WV;
        boolean zBezslBgjveK3hODH = GkEpHTllUQBkRob2X6.BezslBgjveK3hODH(paint.getColor()).BezslBgjveK3hODH();
        Paint paint2 = this.Mej0x2K4ZGSUxtYNka4QZ;
        riWyCIOfdEkuQWvLIhpup1hab riwyciofdekuqwvlihpup1hab = (zBezslBgjveK3hODH && GkEpHTllUQBkRob2X6.BezslBgjveK3hODH(paint2.getColor()).BezslBgjveK3hODH()) ? this.FzogU2bPCQtD6a1hMYB1kyti : this.yM5HHkk1MhPLZFYTHm2JjrArud;
        if (OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(riwyciofdekuqwvlihpup1hab, this.iR1XUIc7FjhMl57O)) {
            return;
        }
        this.iR1XUIc7FjhMl57O = riwyciofdekuqwvlihpup1hab;
        UkGV8Valw3R7JAWib0vwIWTxC0M.BezslBgjveK3hODH(paint, riwyciofdekuqwvlihpup1hab);
        UkGV8Valw3R7JAWib0vwIWTxC0M.BezslBgjveK3hODH(paint2, riwyciofdekuqwvlihpup1hab);
        invalidate();
    }

    public final void S1zP5M3X7Ukq3ROlZ87G9I() {
        int i = this.tdNmBZIJHG1;
        int i2 = this.J1BE9tYH1em4X1uAhc6L7f4M;
        boolean z = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
        LocalDateTime localDateTime = this.GO8WUug7ZWFCUI1zY;
        int hour = z ? localDateTime.getHour() : localDateTime.get(ChronoField.CLOCK_HOUR_OF_AMPM);
        Locale locale = Locale.US;
        this.gsHzEVTj1SCIPR = String.format(locale, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(hour)}, 1));
        this.LcvPFGYKhAm4SS5FZ = String.format(locale, "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(this.GO8WUug7ZWFCUI1zY.getMinute())}, 1));
        this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = this.sCPtafveBAhdLIs2ajN3WV.measureText(this.gsHzEVTj1SCIPR);
        float fMeasureText = this.Mej0x2K4ZGSUxtYNka4QZ.measureText(this.LcvPFGYKhAm4SS5FZ);
        PjK2k0uJ2Y9y6RDAhiGLUQtibm pjK2k0uJ2Y9y6RDAhiGLUQtibm = this.qTa7aqjjB9Bt6mc;
        this.J1BE9tYH1em4X1uAhc6L7f4M = Math.max(r0BXA5ZgwhHZnr4K4Hl.S1zP5M3X7Ukq3ROlZ87G9I((-pjK2k0uJ2Y9y6RDAhiGLUQtibm.S1zP5M3X7Ukq3ROlZ87G9I.top) + this.cCmbv8Tzd2QLd161ImIZUlZ8n + this.f2sXlW3st0rAKJwyOrCfOWc.S1zP5M3X7Ukq3ROlZ87G9I.bottom), pjK2k0uJ2Y9y6RDAhiGLUQtibm.S1zP5M3X7Ukq3ROlZ87G9I.height());
        this.tdNmBZIJHG1 = r0BXA5ZgwhHZnr4K4Hl.S1zP5M3X7Ukq3ROlZ87G9I(this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp + this.WIXlfFpvH7glAGsUk3 + fMeasureText);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null || (!(layoutParams.width == -2 || layoutParams.height == -2) || (this.tdNmBZIJHG1 == i && this.J1BE9tYH1em4X1uAhc6L7f4M == i2))) {
            invalidate();
        } else {
            requestLayout();
        }
    }

    public final void axL8FocTDLUdzg0XScbO(int i, int i2) {
        Paint paint = this.sCPtafveBAhdLIs2ajN3WV;
        int color = paint.getColor();
        Paint paint2 = this.Mej0x2K4ZGSUxtYNka4QZ;
        if (color == i && paint2.getColor() == i2) {
            return;
        }
        paint.setColor(i);
        paint2.setColor(i2);
        BezslBgjveK3hODH();
        invalidate();
    }

    public final Typeface getHoursTypeface() {
        return this.sCPtafveBAhdLIs2ajN3WV.getTypeface();
    }

    public final Typeface getMinutesTypeface() {
        return this.Mej0x2K4ZGSUxtYNka4QZ.getTypeface();
    }

    public final LocalDateTime getTime() {
        return this.GO8WUug7ZWFCUI1zY;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float paddingTop = getPaddingTop() + (-this.qTa7aqjjB9Bt6mc.S1zP5M3X7Ukq3ROlZ87G9I.top);
        canvas.drawText(this.gsHzEVTj1SCIPR, getPaddingLeft(), paddingTop, this.sCPtafveBAhdLIs2ajN3WV);
        canvas.drawText(this.LcvPFGYKhAm4SS5FZ, getPaddingLeft() + this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp + this.WIXlfFpvH7glAGsUk3, paddingTop + this.cCmbv8Tzd2QLd161ImIZUlZ8n, this.Mej0x2K4ZGSUxtYNka4QZ);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSize(getPaddingRight() + getPaddingLeft() + this.tdNmBZIJHG1, i), View.resolveSize(getPaddingBottom() + getPaddingTop() + this.J1BE9tYH1em4X1uAhc6L7f4M, i2));
    }

    public final void set24HourFormat(boolean z) {
        if (this.Rdzg08aYlt0UsoLUNug9cESzgAY9R != z) {
            this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = z;
            S1zP5M3X7Ukq3ROlZ87G9I();
        }
    }

    public final void setHoursTypeface(Typeface typeface) {
        Paint paint = this.sCPtafveBAhdLIs2ajN3WV;
        paint.setTypeface(typeface);
        this.qTa7aqjjB9Bt6mc.axL8FocTDLUdzg0XScbO(paint);
        S1zP5M3X7Ukq3ROlZ87G9I();
    }

    public final void setMinutesTypeface(Typeface typeface) {
        Paint paint = this.Mej0x2K4ZGSUxtYNka4QZ;
        paint.setTypeface(typeface);
        this.f2sXlW3st0rAKJwyOrCfOWc.axL8FocTDLUdzg0XScbO(paint);
        S1zP5M3X7Ukq3ROlZ87G9I();
    }

    public final void setTime(LocalDateTime localDateTime) {
        if (OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.GO8WUug7ZWFCUI1zY, localDateTime)) {
            return;
        }
        this.GO8WUug7ZWFCUI1zY = localDateTime;
        S1zP5M3X7Ukq3ROlZ87G9I();
    }

    public HorizontalClockView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
    }

    public HorizontalClockView(Context context) {
        this(context, null, 14);
    }
}
