package bitpit.launcher.ataglance.clock;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import b.ASDwBkZhws;
import b.GkEpHTllUQBkRob2X6;
import b.HlaGpRWB5yh0EgeuCV;
import b.LTC5BQy9XspuFiw;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.PjK2k0uJ2Y9y6RDAhiGLUQtibm;
import b.UkGV8Valw3R7JAWib0vwIWTxC0M;
import b.XYtcAIGZkWt7;
import b.cvu91h5WjQasu7vH8q4wQg9;
import b.db7W22f2OwBZO1GzsWe8IM80qE;
import b.mHW63SUma8isGb;
import b.nmXVdLD3wuhaqezxBBvorxOjwLT;
import b.qSDYaDqxbBy2QEeVAcFRy;
import b.r0BXA5ZgwhHZnr4K4Hl;
import b.riWyCIOfdEkuQWvLIhpup1hab;
import b.sKhRxlrK0uZQTcvTyLdO1CgQhofD6;
import b.zVkUtEURLvHNycfQPRiFy1I;
import bitpit.launcher.R;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;
import java.util.Arrays;
import java.util.Locale;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class VerticalClockView extends View {
    public float FzogU2bPCQtD6a1hMYB1kyti;
    public LocalDateTime GO8WUug7ZWFCUI1zY;
    public int J1BE9tYH1em4X1uAhc6L7f4M;
    public final Paint LcvPFGYKhAm4SS5FZ;
    public final riWyCIOfdEkuQWvLIhpup1hab Mej0x2K4ZGSUxtYNka4QZ;
    public boolean Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    public ColorPattern WIXlfFpvH7glAGsUk3;
    public int cCmbv8Tzd2QLd161ImIZUlZ8n;
    public final PjK2k0uJ2Y9y6RDAhiGLUQtibm f2sXlW3st0rAKJwyOrCfOWc;
    public final Paint gsHzEVTj1SCIPR;
    public float iR1XUIc7FjhMl57O;
    public String qTa7aqjjB9Bt6mc;
    public riWyCIOfdEkuQWvLIhpup1hab qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
    public riWyCIOfdEkuQWvLIhpup1hab sCPtafveBAhdLIs2ajN3WV;
    public int tdNmBZIJHG1;
    public float yM5HHkk1MhPLZFYTHm2JjrArud;

    /* JADX WARN: Illegal instructions before constructor call */
    public VerticalClockView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0, 0);
        this.GO8WUug7ZWFCUI1zY = LocalDateTime.ofEpochSecond(0L, 0, ZoneOffset.UTC);
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = true;
        ColorPattern.Companion.getClass();
        this.WIXlfFpvH7glAGsUk3 = ColorPattern.ox9eclwMpRd;
        Paint paint = new Paint(1);
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        this.gsHzEVTj1SCIPR = paint;
        Paint paint2 = new Paint(1);
        paint2.setTextAlign(align);
        this.LcvPFGYKhAm4SS5FZ = paint2;
        riWyCIOfdEkuQWvLIhpup1hab.Companion.getClass();
        riWyCIOfdEkuQWvLIhpup1hab riwyciofdekuqwvlihpup1hab = riWyCIOfdEkuQWvLIhpup1hab.Aboow6rUrcY2SrFRa46C6uy;
        this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = riwyciofdekuqwvlihpup1hab;
        this.sCPtafveBAhdLIs2ajN3WV = riwyciofdekuqwvlihpup1hab;
        this.Mej0x2K4ZGSUxtYNka4QZ = riwyciofdekuqwvlihpup1hab;
        this.qTa7aqjjB9Bt6mc = "0000";
        this.f2sXlW3st0rAKJwyOrCfOWc = new PjK2k0uJ2Y9y6RDAhiGLUQtibm();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zVkUtEURLvHNycfQPRiFy1I.H5sQ15nhYoaKKHhx, 0, 0);
        try {
            setVerticalGap(typedArrayObtainStyledAttributes.getDimensionPixelSize(5, cvu91h5WjQasu7vH8q4wQg9.JY5knQmh7EQJEZ(db7W22f2OwBZO1GzsWe8IM80qE.S1zP5M3X7Ukq3ROlZ87G9I(context, R.dimen.vertical_clock_default_vertical_gap))));
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, cvu91h5WjQasu7vH8q4wQg9.JY5knQmh7EQJEZ(db7W22f2OwBZO1GzsWe8IM80qE.S1zP5M3X7Ukq3ROlZ87G9I(context, R.dimen.vertical_clock_default_text_size)));
            paint.setTextSize(dimensionPixelSize);
            paint2.setTextSize(dimensionPixelSize);
            typedArrayObtainStyledAttributes.recycle();
            int color = context.getColor(R.color.shadow);
            setLightClockTextShadow(color != 0 ? new riWyCIOfdEkuQWvLIhpup1hab(color, getResources().getInteger(R.integer.shadow_radius), getResources().getInteger(R.integer.shadow_dx), getResources().getInteger(R.integer.shadow_dy)) : riwyciofdekuqwvlihpup1hab);
            int iOx9eclwMpRd = ASDwBkZhws.ox9eclwMpRd(context, R.attr.onWallpaperColor, null, 6);
            ziNFA7KzVfc6(iOx9eclwMpRd, iOx9eclwMpRd);
            BezslBgjveK3hODH();
            axL8FocTDLUdzg0XScbO();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void setLightClockTextShadow(riWyCIOfdEkuQWvLIhpup1hab riwyciofdekuqwvlihpup1hab) {
        this.sCPtafveBAhdLIs2ajN3WV = riwyciofdekuqwvlihpup1hab;
        Aboow6rUrcY2SrFRa46C6uy();
    }

    private final void setVerticalGap(int i) {
        if (this.cCmbv8Tzd2QLd161ImIZUlZ8n != i) {
            this.cCmbv8Tzd2QLd161ImIZUlZ8n = i;
            axL8FocTDLUdzg0XScbO();
        }
    }

    public final void Aboow6rUrcY2SrFRa46C6uy() {
        Paint paint = this.gsHzEVTj1SCIPR;
        boolean zBezslBgjveK3hODH = GkEpHTllUQBkRob2X6.BezslBgjveK3hODH(paint.getColor()).BezslBgjveK3hODH();
        Paint paint2 = this.LcvPFGYKhAm4SS5FZ;
        riWyCIOfdEkuQWvLIhpup1hab riwyciofdekuqwvlihpup1hab = (zBezslBgjveK3hODH && GkEpHTllUQBkRob2X6.BezslBgjveK3hODH(paint2.getColor()).BezslBgjveK3hODH()) ? this.Mej0x2K4ZGSUxtYNka4QZ : this.sCPtafveBAhdLIs2ajN3WV;
        if (OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(riwyciofdekuqwvlihpup1hab, this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp)) {
            return;
        }
        this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = riwyciofdekuqwvlihpup1hab;
        UkGV8Valw3R7JAWib0vwIWTxC0M.BezslBgjveK3hODH(paint, riwyciofdekuqwvlihpup1hab);
        UkGV8Valw3R7JAWib0vwIWTxC0M.BezslBgjveK3hODH(paint2, riwyciofdekuqwvlihpup1hab);
        invalidate();
    }

    public final void BezslBgjveK3hODH() {
        boolean z = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
        LocalDateTime localDateTime = this.GO8WUug7ZWFCUI1zY;
        this.qTa7aqjjB9Bt6mc = String.format(Locale.US, "%02d%02d", Arrays.copyOf(new Object[]{Integer.valueOf(z ? localDateTime.getHour() : localDateTime.get(ChronoField.CLOCK_HOUR_OF_AMPM)), Integer.valueOf(this.GO8WUug7ZWFCUI1zY.getMinute())}, 2));
        invalidate();
    }

    public final Paint S1zP5M3X7Ukq3ROlZ87G9I(ColorPattern.Color color) {
        int i = NniqwgLR9Jo6Bl9Px0S5u.S1zP5M3X7Ukq3ROlZ87G9I[color.ordinal()];
        if (i == 1) {
            return this.gsHzEVTj1SCIPR;
        }
        if (i == 2) {
            return this.LcvPFGYKhAm4SS5FZ;
        }
        LTC5BQy9XspuFiw.axL8FocTDLUdzg0XScbO();
        return null;
    }

    public final void axL8FocTDLUdzg0XScbO() {
        Paint paint = this.gsHzEVTj1SCIPR;
        PjK2k0uJ2Y9y6RDAhiGLUQtibm pjK2k0uJ2Y9y6RDAhiGLUQtibm = this.f2sXlW3st0rAKJwyOrCfOWc;
        pjK2k0uJ2Y9y6RDAhiGLUQtibm.axL8FocTDLUdzg0XScbO(paint);
        float f = pjK2k0uJ2Y9y6RDAhiGLUQtibm.axL8FocTDLUdzg0XScbO;
        this.iR1XUIc7FjhMl57O = f;
        int i = this.tdNmBZIJHG1;
        int i2 = this.J1BE9tYH1em4X1uAhc6L7f4M;
        this.tdNmBZIJHG1 = r0BXA5ZgwhHZnr4K4Hl.S1zP5M3X7Ukq3ROlZ87G9I(2.0f * f);
        Rect rect = pjK2k0uJ2Y9y6RDAhiGLUQtibm.S1zP5M3X7Ukq3ROlZ87G9I;
        this.J1BE9tYH1em4X1uAhc6L7f4M = (rect.height() * 2) + this.cCmbv8Tzd2QLd161ImIZUlZ8n;
        this.yM5HHkk1MhPLZFYTHm2JjrArud = -rect.top;
        this.FzogU2bPCQtD6a1hMYB1kyti = rect.height() + this.cCmbv8Tzd2QLd161ImIZUlZ8n + (-rect.top);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null || (!(layoutParams.width == -2 || layoutParams.height == -2) || (this.tdNmBZIJHG1 == i && this.J1BE9tYH1em4X1uAhc6L7f4M == i2))) {
            invalidate();
        } else {
            requestLayout();
        }
    }

    public final ColorPattern getColorPattern() {
        return this.WIXlfFpvH7glAGsUk3;
    }

    public final LocalDateTime getTime() {
        return this.GO8WUug7ZWFCUI1zY;
    }

    public final Typeface getTypeface() {
        return this.gsHzEVTj1SCIPR.getTypeface();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (getLayoutDirection() == 1) {
            canvas.translate((getWidth() - getPaddingRight()) - (this.iR1XUIc7FjhMl57O * 2.0f), getPaddingTop());
        } else {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        float f = this.iR1XUIc7FjhMl57O;
        float f2 = f / 2.0f;
        float f3 = f2 + f;
        canvas.drawText(this.qTa7aqjjB9Bt6mc, 0, 1, f2, this.yM5HHkk1MhPLZFYTHm2JjrArud, S1zP5M3X7Ukq3ROlZ87G9I(this.WIXlfFpvH7glAGsUk3.S1zP5M3X7Ukq3ROlZ87G9I));
        canvas.drawText(this.qTa7aqjjB9Bt6mc, 1, 2, f3, this.yM5HHkk1MhPLZFYTHm2JjrArud, S1zP5M3X7Ukq3ROlZ87G9I(this.WIXlfFpvH7glAGsUk3.axL8FocTDLUdzg0XScbO));
        canvas.drawText(this.qTa7aqjjB9Bt6mc, 2, 3, f2, this.FzogU2bPCQtD6a1hMYB1kyti, S1zP5M3X7Ukq3ROlZ87G9I(this.WIXlfFpvH7glAGsUk3.BezslBgjveK3hODH));
        canvas.drawText(this.qTa7aqjjB9Bt6mc, 3, 4, f3, this.FzogU2bPCQtD6a1hMYB1kyti, S1zP5M3X7Ukq3ROlZ87G9I(this.WIXlfFpvH7glAGsUk3.ziNFA7KzVfc6));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSize(getPaddingRight() + getPaddingLeft() + this.tdNmBZIJHG1, i), View.resolveSize(getPaddingBottom() + getPaddingTop() + this.J1BE9tYH1em4X1uAhc6L7f4M, i2));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        axL8FocTDLUdzg0XScbO();
    }

    public final void set24HourFormat(boolean z) {
        if (this.Rdzg08aYlt0UsoLUNug9cESzgAY9R != z) {
            this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = z;
            BezslBgjveK3hODH();
        }
    }

    public final void setColorPattern(ColorPattern colorPattern) {
        if (OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.WIXlfFpvH7glAGsUk3, colorPattern)) {
            return;
        }
        this.WIXlfFpvH7glAGsUk3 = colorPattern;
        invalidate();
    }

    public final void setTextSize(int i) {
        float f = i * getContext().getResources().getDisplayMetrics().density;
        Paint paint = this.gsHzEVTj1SCIPR;
        if (paint.getTextSize() == f) {
            return;
        }
        paint.setTextSize(f);
        this.LcvPFGYKhAm4SS5FZ.setTextSize(f);
        axL8FocTDLUdzg0XScbO();
    }

    public final void setTime(LocalDateTime localDateTime) {
        if (OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.GO8WUug7ZWFCUI1zY, localDateTime)) {
            return;
        }
        this.GO8WUug7ZWFCUI1zY = localDateTime;
        BezslBgjveK3hODH();
    }

    public final void setTypeface(Typeface typeface) {
        Paint paint = this.gsHzEVTj1SCIPR;
        paint.setTypeface(typeface);
        this.LcvPFGYKhAm4SS5FZ.setTypeface(typeface);
        this.f2sXlW3st0rAKJwyOrCfOWc.axL8FocTDLUdzg0XScbO(paint);
        axL8FocTDLUdzg0XScbO();
    }

    public final void setVerticalGapDp(int i) {
        setVerticalGap(cvu91h5WjQasu7vH8q4wQg9.JY5knQmh7EQJEZ(i * getContext().getResources().getDisplayMetrics().density));
    }

    public final void ziNFA7KzVfc6(int i, int i2) {
        Paint paint = this.gsHzEVTj1SCIPR;
        int color = paint.getColor();
        Paint paint2 = this.LcvPFGYKhAm4SS5FZ;
        if (color == i && paint2.getColor() == i2) {
            return;
        }
        paint.setColor(i);
        paint2.setColor(i2);
        Aboow6rUrcY2SrFRa46C6uy();
        invalidate();
    }

    public static final class ColorPattern {
        public static final ColorPattern JY5knQmh7EQJEZ;
        public static final ColorPattern PQQPeCDD0JLCT3aLz;
        public static final ColorPattern ox9eclwMpRd;
        public final Color BezslBgjveK3hODH;
        public final Color S1zP5M3X7Ukq3ROlZ87G9I;
        public final Color axL8FocTDLUdzg0XScbO;
        public final Color ziNFA7KzVfc6;
        public static final Companion Companion = new Companion();
        public static final mHW63SUma8isGb[] Aboow6rUrcY2SrFRa46C6uy = {qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new XYtcAIGZkWt7(1)), qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new XYtcAIGZkWt7(2)), qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new XYtcAIGZkWt7(3)), qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new XYtcAIGZkWt7(4))};

        public static final class Companion {
            public final KSerializer serializer() {
                return VerticalClockView$ColorPattern$$serializer.INSTANCE;
            }
        }

        static {
            Color color = Color.PRIMARY;
            Color color2 = Color.SECONDARY;
            ox9eclwMpRd = new ColorPattern(color, color2, color2, color);
            PQQPeCDD0JLCT3aLz = new ColorPattern(color, color, color, color);
            JY5knQmh7EQJEZ = new ColorPattern(color2, color2, color2, color2);
        }

        public /* synthetic */ ColorPattern(int i, Color color, Color color2, Color color3, Color color4) {
            if (15 != (i & 15)) {
                PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 15, VerticalClockView$ColorPattern$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.S1zP5M3X7Ukq3ROlZ87G9I = color;
            this.axL8FocTDLUdzg0XScbO = color2;
            this.BezslBgjveK3hODH = color3;
            this.ziNFA7KzVfc6 = color4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ColorPattern)) {
                return false;
            }
            ColorPattern colorPattern = (ColorPattern) obj;
            return this.S1zP5M3X7Ukq3ROlZ87G9I == colorPattern.S1zP5M3X7Ukq3ROlZ87G9I && this.axL8FocTDLUdzg0XScbO == colorPattern.axL8FocTDLUdzg0XScbO && this.BezslBgjveK3hODH == colorPattern.BezslBgjveK3hODH && this.ziNFA7KzVfc6 == colorPattern.ziNFA7KzVfc6;
        }

        public final int hashCode() {
            return this.ziNFA7KzVfc6.hashCode() + ((this.BezslBgjveK3hODH.hashCode() + ((this.axL8FocTDLUdzg0XScbO.hashCode() + (this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "ColorPattern(topLeft=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", topRight=" + this.axL8FocTDLUdzg0XScbO + ", bottomLeft=" + this.BezslBgjveK3hODH + ", bottomRight=" + this.ziNFA7KzVfc6 + ")";
        }

        public enum Color implements nmXVdLD3wuhaqezxBBvorxOjwLT {
            PRIMARY("primary"),
            SECONDARY("secondary");

            private static final /* synthetic */ HlaGpRWB5yh0EgeuCV $ENTRIES = new sKhRxlrK0uZQTcvTyLdO1CgQhofD6(values());
            private final String serialized;

            Color(String str) {
                this.serialized = str;
            }

            public static HlaGpRWB5yh0EgeuCV getEntries() {
                return $ENTRIES;
            }

            @Override // b.nmXVdLD3wuhaqezxBBvorxOjwLT
            public String getSerialized() {
                return this.serialized;
            }
        }

        public ColorPattern(Color color, Color color2, Color color3, Color color4) {
            this.S1zP5M3X7Ukq3ROlZ87G9I = color;
            this.axL8FocTDLUdzg0XScbO = color2;
            this.BezslBgjveK3hODH = color3;
            this.ziNFA7KzVfc6 = color4;
        }
    }

    public VerticalClockView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
    }

    public VerticalClockView(Context context) {
        this(context, null, 14);
    }
}
