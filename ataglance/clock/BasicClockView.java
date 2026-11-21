package bitpit.launcher.ataglance.clock;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import b.GkEpHTllUQBkRob2X6;
import b.OkhdZkC3NYLW;
import b.PjK2k0uJ2Y9y6RDAhiGLUQtibm;
import b.UkGV8Valw3R7JAWib0vwIWTxC0M;
import b.riWyCIOfdEkuQWvLIhpup1hab;
import bitpit.launcher.R;

/* JADX INFO: loaded from: classes.dex */
public final class BasicClockView extends View {
    public final TextPaint GO8WUug7ZWFCUI1zY;
    public riWyCIOfdEkuQWvLIhpup1hab LcvPFGYKhAm4SS5FZ;
    public int Mej0x2K4ZGSUxtYNka4QZ;
    public final PjK2k0uJ2Y9y6RDAhiGLUQtibm Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    public float WIXlfFpvH7glAGsUk3;
    public float cCmbv8Tzd2QLd161ImIZUlZ8n;
    public final Rect f2sXlW3st0rAKJwyOrCfOWc;
    public riWyCIOfdEkuQWvLIhpup1hab gsHzEVTj1SCIPR;
    public float qTa7aqjjB9Bt6mc;
    public final riWyCIOfdEkuQWvLIhpup1hab qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
    public CharSequence sCPtafveBAhdLIs2ajN3WV;

    public BasicClockView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setSubpixelText(true);
        textPaint.density = getResources().getDisplayMetrics().density;
        this.GO8WUug7ZWFCUI1zY = textPaint;
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = new PjK2k0uJ2Y9y6RDAhiGLUQtibm();
        riWyCIOfdEkuQWvLIhpup1hab.Companion.getClass();
        riWyCIOfdEkuQWvLIhpup1hab riwyciofdekuqwvlihpup1hab = riWyCIOfdEkuQWvLIhpup1hab.Aboow6rUrcY2SrFRa46C6uy;
        this.gsHzEVTj1SCIPR = riwyciofdekuqwvlihpup1hab;
        this.LcvPFGYKhAm4SS5FZ = riwyciofdekuqwvlihpup1hab;
        this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = riwyciofdekuqwvlihpup1hab;
        this.sCPtafveBAhdLIs2ajN3WV = "";
        this.Mej0x2K4ZGSUxtYNka4QZ = 8388627;
        textPaint.setTextSize(getResources().getDisplayMetrics().scaledDensity * 48.0f);
        textPaint.setColor(-16777216);
        int color = context.getColor(R.color.shadow);
        setLightClockTextShadow(color != 0 ? new riWyCIOfdEkuQWvLIhpup1hab(color, getResources().getInteger(R.integer.shadow_radius), getResources().getInteger(R.integer.shadow_dx), getResources().getInteger(R.integer.shadow_dy)) : riwyciofdekuqwvlihpup1hab);
        BezslBgjveK3hODH();
        this.f2sXlW3st0rAKJwyOrCfOWc = new Rect();
    }

    private final void setLightClockTextShadow(riWyCIOfdEkuQWvLIhpup1hab riwyciofdekuqwvlihpup1hab) {
        this.LcvPFGYKhAm4SS5FZ = riwyciofdekuqwvlihpup1hab;
        S1zP5M3X7Ukq3ROlZ87G9I();
    }

    public final void BezslBgjveK3hODH() {
        TextPaint textPaint = this.GO8WUug7ZWFCUI1zY;
        PjK2k0uJ2Y9y6RDAhiGLUQtibm pjK2k0uJ2Y9y6RDAhiGLUQtibm = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
        pjK2k0uJ2Y9y6RDAhiGLUQtibm.axL8FocTDLUdzg0XScbO(textPaint);
        this.cCmbv8Tzd2QLd161ImIZUlZ8n = -pjK2k0uJ2Y9y6RDAhiGLUQtibm.S1zP5M3X7Ukq3ROlZ87G9I.top;
        axL8FocTDLUdzg0XScbO();
        requestLayout();
        invalidate();
    }

    public final void S1zP5M3X7Ukq3ROlZ87G9I() {
        TextPaint textPaint = this.GO8WUug7ZWFCUI1zY;
        riWyCIOfdEkuQWvLIhpup1hab riwyciofdekuqwvlihpup1hab = GkEpHTllUQBkRob2X6.BezslBgjveK3hODH(textPaint.getColor()).BezslBgjveK3hODH() ? this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp : this.LcvPFGYKhAm4SS5FZ;
        if (OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(riwyciofdekuqwvlihpup1hab, this.gsHzEVTj1SCIPR)) {
            return;
        }
        this.gsHzEVTj1SCIPR = riwyciofdekuqwvlihpup1hab;
        UkGV8Valw3R7JAWib0vwIWTxC0M.BezslBgjveK3hODH(textPaint, riwyciofdekuqwvlihpup1hab);
        invalidate();
    }

    public final void axL8FocTDLUdzg0XScbO() {
        if (this.sCPtafveBAhdLIs2ajN3WV.length() == 0) {
            this.WIXlfFpvH7glAGsUk3 = 0.0f;
            this.qTa7aqjjB9Bt6mc = 0.0f;
            return;
        }
        String string = this.sCPtafveBAhdLIs2ajN3WV.toString();
        TextPaint textPaint = this.GO8WUug7ZWFCUI1zY;
        float fMeasureText = textPaint.measureText(string);
        int length = string.length();
        Rect rect = this.f2sXlW3st0rAKJwyOrCfOWc;
        textPaint.getTextBounds(string, 0, length, rect);
        float f = rect.left;
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = -f;
        float f3 = rect.right - fMeasureText;
        this.WIXlfFpvH7glAGsUk3 = fMeasureText + f2 + (f3 >= 0.0f ? f3 : 0.0f) + 0.5f;
        this.qTa7aqjjB9Bt6mc = f2;
    }

    @Override // android.view.View
    public int getBaseline() {
        float f = 0.0f;
        float fMax = Math.max(0.0f, ((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - this.Rdzg08aYlt0UsoLUNug9cESzgAY9R.S1zP5M3X7Ukq3ROlZ87G9I.height());
        int i = this.Mej0x2K4ZGSUxtYNka4QZ & 112;
        if (i != 48) {
            f = i != 80 ? fMax / 2.0f : fMax;
        }
        return (int) (getPaddingTop() + f + this.cCmbv8Tzd2QLd161ImIZUlZ8n);
    }

    public final int getGravity() {
        return this.Mej0x2K4ZGSUxtYNka4QZ;
    }

    public final CharSequence getText() {
        return this.sCPtafveBAhdLIs2ajN3WV;
    }

    public final int getTextColor() {
        return this.GO8WUug7ZWFCUI1zY.getColor();
    }

    public final float getTextSizePixels() {
        return this.GO8WUug7ZWFCUI1zY.getTextSize();
    }

    public final Typeface getTypeface() {
        return this.GO8WUug7ZWFCUI1zY.getTypeface();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004a  */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.sCPtafveBAhdLIs2ajN3WV.length() == 0) {
            return;
        }
        float paddingLeft = getPaddingLeft();
        float width = getWidth() - getPaddingRight();
        float paddingTop = getPaddingTop();
        float height = (getHeight() - getPaddingBottom()) - paddingTop;
        float f = 0.0f;
        float fMax = Math.max(0.0f, (width - paddingLeft) - this.WIXlfFpvH7glAGsUk3);
        int i = this.Mej0x2K4ZGSUxtYNka4QZ & 7;
        if (i != 3) {
            if (i == 5) {
                paddingLeft += fMax;
            } else if (i != 8388611) {
                if (i != 8388613) {
                    paddingLeft += fMax / 2.0f;
                } else {
                    paddingLeft += fMax;
                }
            }
        }
        float fMax2 = Math.max(0.0f, height - this.Rdzg08aYlt0UsoLUNug9cESzgAY9R.S1zP5M3X7Ukq3ROlZ87G9I.height());
        int i2 = this.Mej0x2K4ZGSUxtYNka4QZ & 112;
        if (i2 != 48) {
            f = i2 != 80 ? fMax2 / 2.0f : fMax2;
        }
        canvas.drawText(this.sCPtafveBAhdLIs2ajN3WV.toString(), paddingLeft + this.qTa7aqjjB9Bt6mc, paddingTop + f + this.cCmbv8Tzd2QLd161ImIZUlZ8n, this.GO8WUug7ZWFCUI1zY);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        TextPaint textPaint = this.GO8WUug7ZWFCUI1zY;
        PjK2k0uJ2Y9y6RDAhiGLUQtibm pjK2k0uJ2Y9y6RDAhiGLUQtibm = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
        pjK2k0uJ2Y9y6RDAhiGLUQtibm.axL8FocTDLUdzg0XScbO(textPaint);
        Rect rect = pjK2k0uJ2Y9y6RDAhiGLUQtibm.S1zP5M3X7Ukq3ROlZ87G9I;
        this.cCmbv8Tzd2QLd161ImIZUlZ8n = -rect.top;
        setMeasuredDimension(View.resolveSize((int) Math.ceil(getPaddingLeft() + this.WIXlfFpvH7glAGsUk3 + getPaddingRight()), i), View.resolveSize(getPaddingBottom() + rect.height() + getPaddingTop(), i2));
    }

    public final void setGravity(int i) {
        if (this.Mej0x2K4ZGSUxtYNka4QZ == i) {
            return;
        }
        this.Mej0x2K4ZGSUxtYNka4QZ = i;
        invalidate();
    }

    public final void setText(CharSequence charSequence) {
        if (charSequence.equals(this.sCPtafveBAhdLIs2ajN3WV)) {
            return;
        }
        this.sCPtafveBAhdLIs2ajN3WV = charSequence;
        axL8FocTDLUdzg0XScbO();
        requestLayout();
        invalidate();
    }

    public final void setTextColor(int i) {
        TextPaint textPaint = this.GO8WUug7ZWFCUI1zY;
        if (textPaint.getColor() == i) {
            return;
        }
        textPaint.setColor(i);
        S1zP5M3X7Ukq3ROlZ87G9I();
        invalidate();
    }

    public final void setTextSizePixels(float f) {
        TextPaint textPaint = this.GO8WUug7ZWFCUI1zY;
        if (textPaint.getTextSize() == f) {
            return;
        }
        textPaint.setTextSize(f);
        BezslBgjveK3hODH();
    }

    public final void setTypeface(Typeface typeface) {
        TextPaint textPaint = this.GO8WUug7ZWFCUI1zY;
        if (OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(textPaint.getTypeface(), typeface)) {
            return;
        }
        textPaint.setTypeface(typeface);
        BezslBgjveK3hODH();
    }

    public BasicClockView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public BasicClockView(Context context) {
        this(context, null, 6);
    }
}
