package bitpit.launcher.ataglance.clock;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import b.A2s6G5LqD9tKn;
import b.ASDwBkZhws;
import b.BOj7Lk43NwFnPA7WQbM8o9fGX8;
import b.BrQ5PRGc3QmAhzDzT6xiMb;
import b.GkEpHTllUQBkRob2X6;
import b.NVeDmzffTpU9k6gA0DuTIDbp0ls;
import b.OkhdZkC3NYLW;
import b.UkGV8Valw3R7JAWib0vwIWTxC0M;
import b.a9kWzoj6D3Yoa0;
import b.cLSwDAbJcSHkpyU7Wy258NJ68qob;
import b.r0BXA5ZgwhHZnr4K4Hl;
import b.riWyCIOfdEkuQWvLIhpup1hab;
import b.zVkUtEURLvHNycfQPRiFy1I;
import bitpit.launcher.R;
import java.text.Normalizer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class MinimalistTextClockView extends View {
    public static final A2s6G5LqD9tKn Companion = new A2s6G5LqD9tKn();
    public static final cLSwDAbJcSHkpyU7Wy258NJ68qob vHDGcerxdYUGlVld2h = new cLSwDAbJcSHkpyU7Wy258NJ68qob("\\p{Mn}+");
    public final Path FzogU2bPCQtD6a1hMYB1kyti;
    public String GO8WUug7ZWFCUI1zY;
    public float IPi49brQACDpXJTJMp7;
    public final GestureDetector IQ6Ug1woLp4DNbPVXhFhC3Fz;
    public final Path J1BE9tYH1em4X1uAhc6L7f4M;
    public riWyCIOfdEkuQWvLIhpup1hab LcvPFGYKhAm4SS5FZ;
    public float Mej0x2K4ZGSUxtYNka4QZ;
    public List Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    public final Paint WIXlfFpvH7glAGsUk3;
    public final Paint cCmbv8Tzd2QLd161ImIZUlZ8n;
    public float cVfIGUKLEqID1HH;
    public float czGAefXQxIZzo;
    public final Rect f2sXlW3st0rAKJwyOrCfOWc;
    public riWyCIOfdEkuQWvLIhpup1hab gsHzEVTj1SCIPR;
    public View.OnClickListener hsgUkarQLKL1aF8JVboCqnbaz1;
    public final Rect iR1XUIc7FjhMl57O;
    public final RectF jvttfmFMQfShe6OfbNf1zF8CyEu;
    public View.OnClickListener nXIf4d0RGTWG1l;
    public float qTa7aqjjB9Bt6mc;
    public riWyCIOfdEkuQWvLIhpup1hab qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
    public final riWyCIOfdEkuQWvLIhpup1hab sCPtafveBAhdLIs2ajN3WV;
    public float tdNmBZIJHG1;
    public float tzMOyOc53ffl;
    public final Rect yM5HHkk1MhPLZFYTHm2JjrArud;
    public float yZj7bj6KyeuYi9woqDlC;

    /* JADX WARN: Illegal instructions before constructor call */
    public MinimalistTextClockView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0, 0);
        this.GO8WUug7ZWFCUI1zY = "";
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = a9kWzoj6D3Yoa0.GO8WUug7ZWFCUI1zY;
        Paint paint = new Paint();
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setAntiAlias(true);
        this.cCmbv8Tzd2QLd161ImIZUlZ8n = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        this.WIXlfFpvH7glAGsUk3 = paint2;
        riWyCIOfdEkuQWvLIhpup1hab.Companion.getClass();
        riWyCIOfdEkuQWvLIhpup1hab riwyciofdekuqwvlihpup1hab = riWyCIOfdEkuQWvLIhpup1hab.Aboow6rUrcY2SrFRa46C6uy;
        this.gsHzEVTj1SCIPR = riwyciofdekuqwvlihpup1hab;
        this.LcvPFGYKhAm4SS5FZ = riwyciofdekuqwvlihpup1hab;
        this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = riwyciofdekuqwvlihpup1hab;
        this.sCPtafveBAhdLIs2ajN3WV = riwyciofdekuqwvlihpup1hab;
        this.f2sXlW3st0rAKJwyOrCfOWc = new Rect();
        this.iR1XUIc7FjhMl57O = new Rect();
        this.yM5HHkk1MhPLZFYTHm2JjrArud = new Rect();
        this.FzogU2bPCQtD6a1hMYB1kyti = new Path();
        this.J1BE9tYH1em4X1uAhc6L7f4M = new Path();
        this.jvttfmFMQfShe6OfbNf1zF8CyEu = new RectF();
        this.IQ6Ug1woLp4DNbPVXhFhC3Fz = new GestureDetector(context, new BOj7Lk43NwFnPA7WQbM8o9fGX8(this, 1));
        setLayerType(2, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zVkUtEURLvHNycfQPRiFy1I.LYcdI4xpry8eXmFC9I4wyaLdcG1z, 0, 0);
        try {
            int color = typedArrayObtainStyledAttributes.getColor(3, ASDwBkZhws.ox9eclwMpRd(context, R.attr.onWallpaperColor, null, 6));
            paint.setColor(color);
            paint2.setColor(color);
            paint.setTextSize(typedArrayObtainStyledAttributes.getDimension(0, typedArrayObtainStyledAttributes.getResources().getDimension(R.dimen.minimalist_clock_default_background_text_size)));
            paint2.setTextSize(typedArrayObtainStyledAttributes.getDimension(2, typedArrayObtainStyledAttributes.getResources().getDimension(R.dimen.minimalist_clock_default_inner_text_size)));
            this.tdNmBZIJHG1 = typedArrayObtainStyledAttributes.getDimension(1, typedArrayObtainStyledAttributes.getResources().getDimension(R.dimen.minimalist_clock_default_inner_text_padding_vertical));
            typedArrayObtainStyledAttributes.recycle();
            int color2 = context.getColor(R.color.shadow);
            setLightClockTextShadow(color2 != 0 ? new riWyCIOfdEkuQWvLIhpup1hab(color2, getResources().getInteger(R.integer.shadow_radius), getResources().getInteger(R.integer.shadow_dx), getResources().getInteger(R.integer.shadow_dy)) : riwyciofdekuqwvlihpup1hab);
            S1zP5M3X7Ukq3ROlZ87G9I();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void setLightClockTextShadow(riWyCIOfdEkuQWvLIhpup1hab riwyciofdekuqwvlihpup1hab) {
        this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = riwyciofdekuqwvlihpup1hab;
        ziNFA7KzVfc6();
    }

    public final void BezslBgjveK3hODH(int i, int i2) {
        Paint paint = this.cCmbv8Tzd2QLd161ImIZUlZ8n;
        int color = paint.getColor();
        Paint paint2 = this.WIXlfFpvH7glAGsUk3;
        if (color == i && paint2.getColor() == i2) {
            return;
        }
        paint.setColor(i);
        paint2.setColor(i2);
        ziNFA7KzVfc6();
        invalidate();
    }

    public final void S1zP5M3X7Ukq3ROlZ87G9I() {
        Paint paint = this.WIXlfFpvH7glAGsUk3;
        Rect rect = this.f2sXlW3st0rAKJwyOrCfOWc;
        paint.getTextBounds("12345", 0, 5, rect);
        float fWidth = 0.0f;
        for (BrQ5PRGc3QmAhzDzT6xiMb brQ5PRGc3QmAhzDzT6xiMb : this.Rdzg08aYlt0UsoLUNug9cESzgAY9R) {
            Rect rect2 = new Rect();
            String str = brQ5PRGc3QmAhzDzT6xiMb.S1zP5M3X7Ukq3ROlZ87G9I;
            paint.getTextBounds(str, 0, str.length(), rect2);
            fWidth += rect2.width();
        }
        this.IPi49brQACDpXJTJMp7 = fWidth;
        String str2 = this.GO8WUug7ZWFCUI1zY;
        int length = str2.length();
        Paint paint2 = this.cCmbv8Tzd2QLd161ImIZUlZ8n;
        Rect rect3 = this.iR1XUIc7FjhMl57O;
        paint2.getTextBounds(str2, 0, length, rect3);
        String strReplaceAll = vHDGcerxdYUGlVld2h.GO8WUug7ZWFCUI1zY.matcher(Normalizer.normalize(this.GO8WUug7ZWFCUI1zY, Normalizer.Form.NFD)).replaceAll("");
        int length2 = strReplaceAll.length();
        Rect rect4 = this.yM5HHkk1MhPLZFYTHm2JjrArud;
        if (length2 == 0) {
            rect4.set(rect3);
        } else {
            paint2.getTextBounds(strReplaceAll, 0, strReplaceAll.length(), rect4);
        }
        float size = ((this.Rdzg08aYlt0UsoLUNug9cESzgAY9R.size() - 1) * this.tzMOyOc53ffl) + this.IPi49brQACDpXJTJMp7;
        if (size < (getContext().getResources().getDisplayMetrics().density * 40.0f * 2.0f) + rect3.width()) {
            if (this.Rdzg08aYlt0UsoLUNug9cESzgAY9R.size() < 2) {
                size = rect3.width();
            } else if (this.Rdzg08aYlt0UsoLUNug9cESzgAY9R.size() == 2) {
                size = (16.0f * getContext().getResources().getDisplayMetrics().density * 2.0f) + rect3.width();
            } else {
                size = (40.0f * getContext().getResources().getDisplayMetrics().density * 2.0f) + rect3.width();
            }
        }
        float fHeight = rect3.height();
        Path path = this.FzogU2bPCQtD6a1hMYB1kyti;
        path.rewind();
        String str3 = this.GO8WUug7ZWFCUI1zY;
        paint2.getTextPath(str3, 0, str3.length(), 0.0f, -rect4.exactCenterY(), path);
        float fWidth2 = (8.0f * getContext().getResources().getDisplayMetrics().density) + rect3.width();
        Path path2 = this.J1BE9tYH1em4X1uAhc6L7f4M;
        path2.rewind();
        path2.addRect((-fWidth2) / 2.0f, -((rect.height() / 2.0f) + this.tdNmBZIJHG1), fWidth2 / 2.0f, (rect.height() / 2.0f) + this.tdNmBZIJHG1, Path.Direction.CW);
        path.op(path2, Path.Op.DIFFERENCE);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null || (!(layoutParams.width == -2 || layoutParams.height == -2) || (size == this.Mej0x2K4ZGSUxtYNka4QZ && fHeight == this.qTa7aqjjB9Bt6mc))) {
            invalidate();
            return;
        }
        this.Mej0x2K4ZGSUxtYNka4QZ = size;
        this.qTa7aqjjB9Bt6mc = fHeight;
        requestLayout();
    }

    public final void axL8FocTDLUdzg0XScbO(int i) {
        float fMin;
        if (i <= 0) {
            return;
        }
        int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
        float size = ((this.Rdzg08aYlt0UsoLUNug9cESzgAY9R.size() - 1) * this.tzMOyOc53ffl) + this.IPi49brQACDpXJTJMp7;
        Rect rect = this.iR1XUIc7FjhMl57O;
        if (size >= (getContext().getResources().getDisplayMetrics().density * 40.0f * 2.0f) + rect.width()) {
            float f = paddingLeft;
            float fMin2 = size > f ? this.tzMOyOc53ffl : Math.min((f - this.IPi49brQACDpXJTJMp7) / (this.Rdzg08aYlt0UsoLUNug9cESzgAY9R.size() - 1), this.cVfIGUKLEqID1HH);
            this.czGAefXQxIZzo = fMin2;
            this.yZj7bj6KyeuYi9woqDlC = (fMin2 * (this.Rdzg08aYlt0UsoLUNug9cESzgAY9R.size() - 1)) + this.IPi49brQACDpXJTJMp7;
            return;
        }
        if (this.Rdzg08aYlt0UsoLUNug9cESzgAY9R.size() < 2) {
            fMin = 0.0f;
        } else if (this.Rdzg08aYlt0UsoLUNug9cESzgAY9R.size() == 2) {
            float fWidth = (16.0f * getContext().getResources().getDisplayMetrics().density * 2.0f) + rect.width();
            fMin = size <= fWidth ? (fWidth - this.IPi49brQACDpXJTJMp7) / (this.Rdzg08aYlt0UsoLUNug9cESzgAY9R.size() - 1) : this.tzMOyOc53ffl;
        } else {
            fMin = (Math.min(((40.0f * getContext().getResources().getDisplayMetrics().density) * 2.0f) + rect.width(), paddingLeft) - this.IPi49brQACDpXJTJMp7) / (this.Rdzg08aYlt0UsoLUNug9cESzgAY9R.size() - 1);
        }
        this.czGAefXQxIZzo = fMin;
        this.yZj7bj6KyeuYi9woqDlC = (fMin * (this.Rdzg08aYlt0UsoLUNug9cESzgAY9R.size() - 1)) + this.IPi49brQACDpXJTJMp7;
    }

    public final String getBackgroundText() {
        return this.GO8WUug7ZWFCUI1zY;
    }

    public final List<BrQ5PRGc3QmAhzDzT6xiMb> getInnerTextSegments() {
        return this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    }

    public final View.OnClickListener getOnClockClickListener() {
        return this.hsgUkarQLKL1aF8JVboCqnbaz1;
    }

    public final View.OnClickListener getOnOutsideClockClickListener() {
        return this.nXIf4d0RGTWG1l;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        float paddingLeft = (width / 2.0f) + getPaddingLeft();
        float fExactCenterY = (this.yM5HHkk1MhPLZFYTHm2JjrArud.exactCenterY() + ((height / 2.0f) + getPaddingTop())) - this.iR1XUIc7FjhMl57O.exactCenterY();
        int iSave = canvas.save();
        canvas.translate(paddingLeft, fExactCenterY);
        try {
            canvas.drawPath(this.FzogU2bPCQtD6a1hMYB1kyti, this.cCmbv8Tzd2QLd161ImIZUlZ8n);
            canvas.restoreToCount(iSave);
            if (this.Rdzg08aYlt0UsoLUNug9cESzgAY9R.isEmpty()) {
                return;
            }
            float f = paddingLeft - (this.yZj7bj6KyeuYi9woqDlC / 2.0f);
            float fExactCenterY2 = fExactCenterY - this.f2sXlW3st0rAKJwyOrCfOWc.exactCenterY();
            List<BrQ5PRGc3QmAhzDzT6xiMb> list = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
            float f2 = this.czGAefXQxIZzo;
            Paint paint = this.WIXlfFpvH7glAGsUk3;
            int iSave2 = canvas.save();
            canvas.translate(f, fExactCenterY2);
            try {
                float f3 = 0.0f;
                for (BrQ5PRGc3QmAhzDzT6xiMb brQ5PRGc3QmAhzDzT6xiMb : list) {
                    canvas.drawText(brQ5PRGc3QmAhzDzT6xiMb.S1zP5M3X7Ukq3ROlZ87G9I, f3, 0.0f, paint);
                    float fMeasureText = paint.measureText(brQ5PRGc3QmAhzDzT6xiMb.S1zP5M3X7Ukq3ROlZ87G9I);
                    if (brQ5PRGc3QmAhzDzT6xiMb instanceof NVeDmzffTpU9k6gA0DuTIDbp0ls) {
                        RectF rectF = this.jvttfmFMQfShe6OfbNf1zF8CyEu;
                        float f4 = f + f3;
                        float f5 = f2 / 2.0f;
                        float f6 = f4 - f5;
                        if (f6 < 0.0f) {
                            f6 = 0.0f;
                        }
                        rectF.set(f6, 0.0f, f4 + fMeasureText + f5, canvas.getHeight());
                    }
                    f3 += fMeasureText + f2;
                }
                canvas.restoreToCount(iSave2);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave2);
                throw th;
            }
        } catch (Throwable th2) {
            canvas.restoreToCount(iSave);
            throw th2;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingEnd() + getPaddingStart() + r0BXA5ZgwhHZnr4K4Hl.S1zP5M3X7Ukq3ROlZ87G9I(this.Mej0x2K4ZGSUxtYNka4QZ), getSuggestedMinimumWidth()), i, 0), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + r0BXA5ZgwhHZnr4K4Hl.S1zP5M3X7Ukq3ROlZ87G9I(this.qTa7aqjjB9Bt6mc), getSuggestedMinimumHeight()), i2, 0));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        axL8FocTDLUdzg0XScbO(i);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.IQ6Ug1woLp4DNbPVXhFhC3Fz.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent);
    }

    public final void setBackgroundText(String str) {
        this.GO8WUug7ZWFCUI1zY = str;
        S1zP5M3X7Ukq3ROlZ87G9I();
        axL8FocTDLUdzg0XScbO(getWidth());
    }

    public final void setInnerTextSegments(List<? extends BrQ5PRGc3QmAhzDzT6xiMb> list) {
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = list;
        S1zP5M3X7Ukq3ROlZ87G9I();
        axL8FocTDLUdzg0XScbO(getWidth());
    }

    public final void setOnClockClickListener(View.OnClickListener onClickListener) {
        this.hsgUkarQLKL1aF8JVboCqnbaz1 = onClickListener;
        setClickable((this.nXIf4d0RGTWG1l == null && onClickListener == null) ? false : true);
    }

    public final void setOnOutsideClockClickListener(View.OnClickListener onClickListener) {
        this.nXIf4d0RGTWG1l = onClickListener;
        setClickable((onClickListener == null && this.hsgUkarQLKL1aF8JVboCqnbaz1 == null) ? false : true);
    }

    public final void ziNFA7KzVfc6() {
        riWyCIOfdEkuQWvLIhpup1hab riwyciofdekuqwvlihpup1hab = this.gsHzEVTj1SCIPR;
        Paint paint = this.cCmbv8Tzd2QLd161ImIZUlZ8n;
        boolean zBezslBgjveK3hODH = GkEpHTllUQBkRob2X6.BezslBgjveK3hODH(paint.getColor()).BezslBgjveK3hODH();
        riWyCIOfdEkuQWvLIhpup1hab riwyciofdekuqwvlihpup1hab2 = this.sCPtafveBAhdLIs2ajN3WV;
        riWyCIOfdEkuQWvLIhpup1hab riwyciofdekuqwvlihpup1hab3 = zBezslBgjveK3hODH ? riwyciofdekuqwvlihpup1hab2 : this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
        if (!OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(riwyciofdekuqwvlihpup1hab3, riwyciofdekuqwvlihpup1hab)) {
            UkGV8Valw3R7JAWib0vwIWTxC0M.BezslBgjveK3hODH(paint, riwyciofdekuqwvlihpup1hab3);
            this.gsHzEVTj1SCIPR = riwyciofdekuqwvlihpup1hab3;
        }
        riWyCIOfdEkuQWvLIhpup1hab riwyciofdekuqwvlihpup1hab4 = this.LcvPFGYKhAm4SS5FZ;
        Paint paint2 = this.WIXlfFpvH7glAGsUk3;
        if (!GkEpHTllUQBkRob2X6.BezslBgjveK3hODH(paint2.getColor()).BezslBgjveK3hODH()) {
            riwyciofdekuqwvlihpup1hab2 = this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
        }
        if (!OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(riwyciofdekuqwvlihpup1hab2, riwyciofdekuqwvlihpup1hab4)) {
            UkGV8Valw3R7JAWib0vwIWTxC0M.BezslBgjveK3hODH(paint2, riwyciofdekuqwvlihpup1hab2);
            this.LcvPFGYKhAm4SS5FZ = riwyciofdekuqwvlihpup1hab2;
        }
        invalidate();
    }

    public MinimalistTextClockView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
    }

    public MinimalistTextClockView(Context context) {
        this(context, null, 14);
    }
}
