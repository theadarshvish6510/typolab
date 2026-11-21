package bitpit.launcher.ataglance.clock;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import b.ASDwBkZhws;
import b.GkEpHTllUQBkRob2X6;
import b.LTC5BQy9XspuFiw;
import b.O1VE8grxm4nj1d;
import b.OkhdZkC3NYLW;
import b.PjK2k0uJ2Y9y6RDAhiGLUQtibm;
import b.UkGV8Valw3R7JAWib0vwIWTxC0M;
import b.cvu91h5WjQasu7vH8q4wQg9;
import b.riWyCIOfdEkuQWvLIhpup1hab;
import b.sf0FaK0fs6rCas2Sgx;
import b.wlCJnjPx3WL6zs5FmXpCaivO;
import b.zVkUtEURLvHNycfQPRiFy1I;
import bitpit.launcher.R;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class OverlapClockView extends View {
    public static final sf0FaK0fs6rCas2Sgx Companion = new sf0FaK0fs6rCas2Sgx();
    public final Path FzogU2bPCQtD6a1hMYB1kyti;
    public LocalDateTime GO8WUug7ZWFCUI1zY;
    public final Paint J1BE9tYH1em4X1uAhc6L7f4M;
    public float LcvPFGYKhAm4SS5FZ;
    public final PjK2k0uJ2Y9y6RDAhiGLUQtibm Mej0x2K4ZGSUxtYNka4QZ;
    public boolean Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    public float WIXlfFpvH7glAGsUk3;
    public HorizontalClockAlignment cCmbv8Tzd2QLd161ImIZUlZ8n;
    public riWyCIOfdEkuQWvLIhpup1hab cVfIGUKLEqID1HH;
    public riWyCIOfdEkuQWvLIhpup1hab czGAefXQxIZzo;
    public ColorStateList f2sXlW3st0rAKJwyOrCfOWc;
    public boolean gsHzEVTj1SCIPR;
    public ColorStateList iR1XUIc7FjhMl57O;
    public final float[] qTa7aqjjB9Bt6mc;
    public String qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
    public final float[] sCPtafveBAhdLIs2ajN3WV;
    public final Paint tdNmBZIJHG1;
    public final Paint tzMOyOc53ffl;
    public final Path yM5HHkk1MhPLZFYTHm2JjrArud;
    public final riWyCIOfdEkuQWvLIhpup1hab yZj7bj6KyeuYi9woqDlC;

    /* JADX WARN: Illegal instructions before constructor call */
    public OverlapClockView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0, 0);
        this.GO8WUug7ZWFCUI1zY = LocalDateTime.ofEpochSecond(0L, 0, ZoneOffset.UTC);
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = true;
        this.cCmbv8Tzd2QLd161ImIZUlZ8n = HorizontalClockAlignment.CENTER;
        this.WIXlfFpvH7glAGsUk3 = 0.16f;
        this.gsHzEVTj1SCIPR = true;
        this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = "";
        this.sCPtafveBAhdLIs2ajN3WV = new float[5];
        PjK2k0uJ2Y9y6RDAhiGLUQtibm pjK2k0uJ2Y9y6RDAhiGLUQtibm = new PjK2k0uJ2Y9y6RDAhiGLUQtibm();
        this.Mej0x2K4ZGSUxtYNka4QZ = pjK2k0uJ2Y9y6RDAhiGLUQtibm;
        this.qTa7aqjjB9Bt6mc = new float[5];
        this.yM5HHkk1MhPLZFYTHm2JjrArud = new Path();
        this.FzogU2bPCQtD6a1hMYB1kyti = new Path();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.J1BE9tYH1em4X1uAhc6L7f4M = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        this.tdNmBZIJHG1 = paint2;
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setStyle(Paint.Style.FILL_AND_STROKE);
        this.tzMOyOc53ffl = paint3;
        riWyCIOfdEkuQWvLIhpup1hab.Companion.getClass();
        riWyCIOfdEkuQWvLIhpup1hab riwyciofdekuqwvlihpup1hab = riWyCIOfdEkuQWvLIhpup1hab.Aboow6rUrcY2SrFRa46C6uy;
        this.cVfIGUKLEqID1HH = riwyciofdekuqwvlihpup1hab;
        this.czGAefXQxIZzo = riwyciofdekuqwvlihpup1hab;
        this.yZj7bj6KyeuYi9woqDlC = riwyciofdekuqwvlihpup1hab;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zVkUtEURLvHNycfQPRiFy1I.fXBtMGfTIjGSHgK542, 0, 0);
        try {
            this.f2sXlW3st0rAKJwyOrCfOWc = typedArrayObtainStyledAttributes.getColorStateList(1);
            this.iR1XUIc7FjhMl57O = typedArrayObtainStyledAttributes.getColorStateList(2);
            ziNFA7KzVfc6();
            float dimension = typedArrayObtainStyledAttributes.getDimension(3, typedArrayObtainStyledAttributes.getResources().getDimension(R.dimen.overlap_clock_default_text_size));
            paint.setTextSize(dimension);
            paint2.setTextSize(dimension);
            paint3.setTextSize(dimension);
            int color = context.getColor(R.color.shadow);
            if (color != 0) {
                riwyciofdekuqwvlihpup1hab = new riWyCIOfdEkuQWvLIhpup1hab(color, typedArrayObtainStyledAttributes.getResources().getInteger(R.integer.shadow_radius), typedArrayObtainStyledAttributes.getResources().getInteger(R.integer.shadow_dx), typedArrayObtainStyledAttributes.getResources().getInteger(R.integer.shadow_dy));
            }
            setLightClockTextShadow(riwyciofdekuqwvlihpup1hab);
            paint3.setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(0, typedArrayObtainStyledAttributes.getResources().getDimension(R.dimen.overlap_clock_default_cutout)));
            typedArrayObtainStyledAttributes.recycle();
            Aboow6rUrcY2SrFRa46C6uy();
            pjK2k0uJ2Y9y6RDAhiGLUQtibm.axL8FocTDLUdzg0XScbO(paint);
            S1zP5M3X7Ukq3ROlZ87G9I();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final int getInnerHeight() {
        return this.Mej0x2K4ZGSUxtYNka4QZ.S1zP5M3X7Ukq3ROlZ87G9I.height();
    }

    private final int getInnerWidth() {
        float[] fArr = this.qTa7aqjjB9Bt6mc;
        if (fArr.length != 0) {
            return cvu91h5WjQasu7vH8q4wQg9.JY5knQmh7EQJEZ(fArr[fArr.length - 1]);
        }
        O1VE8grxm4nj1d.JY5knQmh7EQJEZ("Array is empty.");
        return 0;
    }

    private final void setDividerOverlapPercentage(float f) {
        if (this.LcvPFGYKhAm4SS5FZ == f) {
            return;
        }
        this.LcvPFGYKhAm4SS5FZ = f;
        S1zP5M3X7Ukq3ROlZ87G9I();
    }

    private final void setLightClockTextShadow(riWyCIOfdEkuQWvLIhpup1hab riwyciofdekuqwvlihpup1hab) {
        this.czGAefXQxIZzo = riwyciofdekuqwvlihpup1hab;
        BezslBgjveK3hODH();
    }

    private final void setUseColonAsDivider(boolean z) {
        if (this.gsHzEVTj1SCIPR != z) {
            this.gsHzEVTj1SCIPR = z;
            S1zP5M3X7Ukq3ROlZ87G9I();
        }
    }

    public final void Aboow6rUrcY2SrFRa46C6uy() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iJY5knQmh7EQJEZ = cvu91h5WjQasu7vH8q4wQg9.JY5knQmh7EQJEZ(32.0f * getContext().getResources().getDisplayMetrics().density);
        int i = wlCJnjPx3WL6zs5FmXpCaivO.S1zP5M3X7Ukq3ROlZ87G9I[this.cCmbv8Tzd2QLd161ImIZUlZ8n.ordinal()];
        if (i == 1) {
            setPadding(getPaddingLeft(), iJY5knQmh7EQJEZ, getPaddingRight(), cvu91h5WjQasu7vH8q4wQg9.JY5knQmh7EQJEZ(4.0f * getContext().getResources().getDisplayMetrics().density));
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                int iJY5knQmh7EQJEZ2 = cvu91h5WjQasu7vH8q4wQg9.JY5knQmh7EQJEZ(getResources().getDimension(R.dimen.material8));
                int i2 = marginLayoutParams.topMargin;
                int marginEnd = marginLayoutParams.getMarginEnd();
                int i3 = marginLayoutParams.bottomMargin;
                marginLayoutParams.setMarginStart(iJY5knQmh7EQJEZ2);
                marginLayoutParams.topMargin = i2;
                marginLayoutParams.setMarginEnd(marginEnd);
                marginLayoutParams.bottomMargin = i3;
                setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        if (i != 2) {
            LTC5BQy9XspuFiw.axL8FocTDLUdzg0XScbO();
            return;
        }
        setPadding(getPaddingLeft(), iJY5knQmh7EQJEZ, getPaddingRight(), iJY5knQmh7EQJEZ);
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams != null) {
            int i4 = marginLayoutParams.topMargin;
            int marginEnd2 = marginLayoutParams.getMarginEnd();
            int i5 = marginLayoutParams.bottomMargin;
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.topMargin = i4;
            marginLayoutParams.setMarginEnd(marginEnd2);
            marginLayoutParams.bottomMargin = i5;
            setLayoutParams(marginLayoutParams);
        }
    }

    public final void BezslBgjveK3hODH() {
        Paint paint = this.J1BE9tYH1em4X1uAhc6L7f4M;
        boolean zBezslBgjveK3hODH = GkEpHTllUQBkRob2X6.BezslBgjveK3hODH(paint.getColor()).BezslBgjveK3hODH();
        Paint paint2 = this.tdNmBZIJHG1;
        riWyCIOfdEkuQWvLIhpup1hab riwyciofdekuqwvlihpup1hab = (zBezslBgjveK3hODH && GkEpHTllUQBkRob2X6.BezslBgjveK3hODH(paint2.getColor()).BezslBgjveK3hODH()) ? this.yZj7bj6KyeuYi9woqDlC : this.czGAefXQxIZzo;
        if (OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(riwyciofdekuqwvlihpup1hab, this.cVfIGUKLEqID1HH)) {
            return;
        }
        this.cVfIGUKLEqID1HH = riwyciofdekuqwvlihpup1hab;
        UkGV8Valw3R7JAWib0vwIWTxC0M.BezslBgjveK3hODH(paint, riwyciofdekuqwvlihpup1hab);
        UkGV8Valw3R7JAWib0vwIWTxC0M.BezslBgjveK3hODH(paint2, riwyciofdekuqwvlihpup1hab);
        invalidate();
    }

    public final void S1zP5M3X7Ukq3ROlZ87G9I() {
        float[] fArr;
        float letterSpacing;
        int i;
        int innerWidth = getInnerWidth();
        int innerHeight = getInnerHeight();
        boolean z = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
        LocalDateTime localDateTime = this.GO8WUug7ZWFCUI1zY;
        String str = String.format(Locale.US, this.gsHzEVTj1SCIPR ? "%02d:%02d" : "%02d\u200a%02d", Arrays.copyOf(new Object[]{Integer.valueOf(z ? localDateTime.getHour() : localDateTime.get(ChronoField.CLOCK_HOUR_OF_AMPM)), Integer.valueOf(this.GO8WUug7ZWFCUI1zY.getMinute())}, 2));
        this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = str;
        Paint paint = this.J1BE9tYH1em4X1uAhc6L7f4M;
        float[] fArr2 = this.sCPtafveBAhdLIs2ajN3WV;
        paint.getTextWidths(str, fArr2);
        int length = fArr2.length;
        int i2 = 0;
        float letterSpacing2 = 0.0f;
        while (true) {
            fArr = this.qTa7aqjjB9Bt6mc;
            if (i2 >= length) {
                break;
            }
            float f = fArr2[i2];
            float f2 = letterSpacing2 + f;
            if (i2 % 3 != 0 || (i = i2 + 1) >= fArr2.length) {
                letterSpacing = f2;
            } else {
                letterSpacing = f2 - (((fArr2[i] + f) * this.WIXlfFpvH7glAGsUk3) + paint.getLetterSpacing());
            }
            letterSpacing2 = (i2 == 1 || i2 == 2) ? (f2 - paint.getLetterSpacing()) - ((f * 2.0f) * this.LcvPFGYKhAm4SS5FZ) : letterSpacing;
            fArr[i2] = letterSpacing2;
            i2++;
        }
        Path path = this.yM5HHkk1MhPLZFYTHm2JjrArud;
        path.rewind();
        Path path2 = this.FzogU2bPCQtD6a1hMYB1kyti;
        path2.rewind();
        Path path3 = new Path();
        int length2 = this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp.length();
        int i3 = 0;
        while (i3 < length2) {
            int i4 = i3 + 1;
            paint.getTextPath(this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp, i3, i4, i3 == 0 ? 0.0f : fArr[i3 - 1], (-this.Mej0x2K4ZGSUxtYNka4QZ.S1zP5M3X7Ukq3ROlZ87G9I.bottom) + getInnerHeight(), path3);
            (i3 % 3 == 0 ? path : path2).op(path3, Path.Op.UNION);
            i3 = i4;
        }
        this.tzMOyOc53ffl.getFillPath(path2, path3);
        path.op(path3, Path.Op.DIFFERENCE);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null || (!(layoutParams.width == -2 || layoutParams.height == -2) || (getInnerWidth() == innerWidth && getInnerHeight() == innerHeight))) {
            invalidate();
        } else {
            requestLayout();
        }
    }

    public final void axL8FocTDLUdzg0XScbO(Typeface typeface, int i, float f, int i2, boolean z, float f2) {
        float f3 = i * getContext().getResources().getDisplayMetrics().density;
        float f4 = i2 * getContext().getResources().getDisplayMetrics().density * 2.0f;
        Paint paint = this.J1BE9tYH1em4X1uAhc6L7f4M;
        boolean zS1zP5M3X7Ukq3ROlZ87G9I = OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(paint.getTypeface(), typeface);
        Paint paint2 = this.tzMOyOc53ffl;
        if (zS1zP5M3X7Ukq3ROlZ87G9I && paint.getTextSize() == f3 && this.WIXlfFpvH7glAGsUk3 == f && paint2.getStrokeWidth() == f4 && this.gsHzEVTj1SCIPR == z && this.LcvPFGYKhAm4SS5FZ == f2) {
            return;
        }
        paint.setTypeface(typeface);
        paint.setTextSize(f3);
        Paint paint3 = this.tdNmBZIJHG1;
        paint3.setTypeface(typeface);
        paint3.setTextSize(f3);
        paint2.setTypeface(typeface);
        paint2.setTextSize(f3);
        this.WIXlfFpvH7glAGsUk3 = f;
        paint2.setStrokeWidth(f4);
        setUseColonAsDivider(z);
        setDividerOverlapPercentage(f2);
        this.Mej0x2K4ZGSUxtYNka4QZ.axL8FocTDLUdzg0XScbO(paint);
        S1zP5M3X7Ukq3ROlZ87G9I();
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ziNFA7KzVfc6();
        invalidate();
    }

    public final HorizontalClockAlignment getHorizontalAlignment() {
        return this.cCmbv8Tzd2QLd161ImIZUlZ8n;
    }

    public final LocalDateTime getTime() {
        return this.GO8WUug7ZWFCUI1zY;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int innerWidth = getInnerWidth();
        int innerHeight = getInnerHeight();
        int i = wlCJnjPx3WL6zs5FmXpCaivO.S1zP5M3X7Ukq3ROlZ87G9I[this.cCmbv8Tzd2QLd161ImIZUlZ8n.ordinal()];
        Paint paint = this.tdNmBZIJHG1;
        Path path = this.FzogU2bPCQtD6a1hMYB1kyti;
        Paint paint2 = this.J1BE9tYH1em4X1uAhc6L7f4M;
        Path path2 = this.yM5HHkk1MhPLZFYTHm2JjrArud;
        if (i == 1) {
            float height = (getHeight() - getPaddingBottom()) - innerHeight;
            if (getLayoutDirection() == 1) {
                canvas.translate((getWidth() - getPaddingRight()) - innerWidth, height);
            } else {
                canvas.translate(getPaddingLeft(), height);
            }
            canvas.drawPath(path2, paint2);
            canvas.drawPath(path, paint);
            return;
        }
        if (i != 2) {
            LTC5BQy9XspuFiw.axL8FocTDLUdzg0XScbO();
            return;
        }
        canvas.translate(((((getWidth() - getPaddingLeft()) - innerWidth) - getPaddingRight()) / 2.0f) + getPaddingLeft(), ((((getHeight() - getPaddingTop()) - innerHeight) - getPaddingBottom()) / 2.0f) + getPaddingTop());
        canvas.drawPath(path2, paint2);
        canvas.drawPath(path, paint);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSize(getPaddingRight() + getPaddingLeft() + getInnerWidth(), i), View.resolveSize(getPaddingBottom() + getPaddingTop() + getInnerHeight(), i2));
    }

    public final void set24HourFormat(boolean z) {
        if (this.Rdzg08aYlt0UsoLUNug9cESzgAY9R != z) {
            this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = z;
            S1zP5M3X7Ukq3ROlZ87G9I();
        }
    }

    public final void setHorizontalAlignment(HorizontalClockAlignment horizontalClockAlignment) {
        if (this.cCmbv8Tzd2QLd161ImIZUlZ8n != horizontalClockAlignment) {
            this.cCmbv8Tzd2QLd161ImIZUlZ8n = horizontalClockAlignment;
            Aboow6rUrcY2SrFRa46C6uy();
            S1zP5M3X7Ukq3ROlZ87G9I();
        }
    }

    public final void setTime(LocalDateTime localDateTime) {
        if (OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.GO8WUug7ZWFCUI1zY, localDateTime)) {
            return;
        }
        this.GO8WUug7ZWFCUI1zY = localDateTime;
        S1zP5M3X7Ukq3ROlZ87G9I();
    }

    public final void ziNFA7KzVfc6() {
        ColorStateList colorStateList = this.f2sXlW3st0rAKJwyOrCfOWc;
        this.J1BE9tYH1em4X1uAhc6L7f4M.setColor(colorStateList != null ? colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor()) : ASDwBkZhws.ox9eclwMpRd(getContext(), android.R.attr.colorAccent, null, 6));
        ColorStateList colorStateList2 = this.iR1XUIc7FjhMl57O;
        this.tdNmBZIJHG1.setColor(colorStateList2 != null ? colorStateList2.getColorForState(getDrawableState(), colorStateList2.getDefaultColor()) : ASDwBkZhws.ox9eclwMpRd(getContext(), android.R.attr.colorAccent, null, 6));
        BezslBgjveK3hODH();
    }

    public OverlapClockView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
    }

    public OverlapClockView(Context context) {
        this(context, null, 14);
    }
}
