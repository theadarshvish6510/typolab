package bitpit.launcher.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import b.CJI9fJNh1Q2PBYQKjHaT4Ef4H;
import b.O3IczkAtz8eBPop0grHaEsy49zL;
import b.RkyCADjHzmOfVHvD;
import b.zVkUtEURLvHNycfQPRiFy1I;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ElasticDragDismissFrameLayout extends FrameLayout {
    public boolean FzogU2bPCQtD6a1hMYB1kyti;
    public float GO8WUug7ZWFCUI1zY;
    public float LcvPFGYKhAm4SS5FZ;
    public int Mej0x2K4ZGSUxtYNka4QZ;
    public final float Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    public final boolean WIXlfFpvH7glAGsUk3;
    public final float cCmbv8Tzd2QLd161ImIZUlZ8n;
    public float f2sXlW3st0rAKJwyOrCfOWc;
    public final float gsHzEVTj1SCIPR;
    public final float iR1XUIc7FjhMl57O;
    public final CJI9fJNh1Q2PBYQKjHaT4Ef4H qTa7aqjjB9Bt6mc;
    public boolean qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
    public boolean sCPtafveBAhdLIs2ajN3WV;
    public boolean yM5HHkk1MhPLZFYTHm2JjrArud;

    /* JADX WARN: Illegal instructions before constructor call */
    public ElasticDragDismissFrameLayout(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0, 0);
        this.GO8WUug7ZWFCUI1zY = Float.MAX_VALUE;
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = -1.0f;
        this.cCmbv8Tzd2QLd161ImIZUlZ8n = 1.0f;
        this.gsHzEVTj1SCIPR = 0.8f;
        this.qTa7aqjjB9Bt6mc = new CJI9fJNh1Q2PBYQKjHaT4Ef4H();
        this.iR1XUIc7FjhMl57O = ViewConfiguration.get(context).getScaledTouchSlop();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zVkUtEURLvHNycfQPRiFy1I.BezslBgjveK3hODH, 0, 0);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.GO8WUug7ZWFCUI1zY = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        } else if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = typedArrayObtainStyledAttributes.getFloat(1, -1.0f);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            float f = typedArrayObtainStyledAttributes.getFloat(2, 1.0f);
            this.cCmbv8Tzd2QLd161ImIZUlZ8n = f;
            this.WIXlfFpvH7glAGsUk3 = !(f == 1.0f);
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.gsHzEVTj1SCIPR = typedArrayObtainStyledAttributes.getFloat(3, 0.8f);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void BezslBgjveK3hODH() {
        int size;
        float fAbs = Math.abs(this.LcvPFGYKhAm4SS5FZ);
        float f = this.GO8WUug7ZWFCUI1zY;
        CJI9fJNh1Q2PBYQKjHaT4Ef4H cJI9fJNh1Q2PBYQKjHaT4Ef4H = this.qTa7aqjjB9Bt6mc;
        if (fAbs >= f) {
            cJI9fJNh1Q2PBYQKjHaT4Ef4H.BezslBgjveK3hODH(RkyCADjHzmOfVHvD.sCPtafveBAhdLIs2ajN3WV);
            return;
        }
        if (this.Mej0x2K4ZGSUxtYNka4QZ == 0) {
            setTranslationY(0.0f);
            setScaleX(1.0f);
            setScaleY(1.0f);
        } else {
            animate().translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(O3IczkAtz8eBPop0grHaEsy49zL.S1zP5M3X7Ukq3ROlZ87G9I).setListener(null).start();
        }
        this.LcvPFGYKhAm4SS5FZ = 0.0f;
        this.sCPtafveBAhdLIs2ajN3WV = false;
        this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = false;
        ArrayList arrayList = cJI9fJNh1Q2PBYQKjHaT4Ef4H.GO8WUug7ZWFCUI1zY;
        if (arrayList.isEmpty() || (size = arrayList.size() - 1) < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public final void S1zP5M3X7Ukq3ROlZ87G9I(int i) {
        if (i == 0) {
            return;
        }
        this.LcvPFGYKhAm4SS5FZ += i;
        boolean z = this.WIXlfFpvH7glAGsUk3;
        if (i < 0 && !this.sCPtafveBAhdLIs2ajN3WV && !this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp) {
            this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = true;
            if (z) {
                setPivotY(getHeight());
            }
        } else if (i > 0 && !this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp && !this.sCPtafveBAhdLIs2ajN3WV) {
            this.sCPtafveBAhdLIs2ajN3WV = true;
            if (z) {
                setPivotY(0.0f);
            }
        }
        axL8FocTDLUdzg0XScbO();
    }

    public final void axL8FocTDLUdzg0XScbO() {
        int size;
        float fLog10 = (float) Math.log10(1.0d + ((double) (Math.abs(this.LcvPFGYKhAm4SS5FZ) / this.GO8WUug7ZWFCUI1zY)));
        float f = this.GO8WUug7ZWFCUI1zY * fLog10 * this.gsHzEVTj1SCIPR;
        if (this.sCPtafveBAhdLIs2ajN3WV) {
            f *= -1.0f;
        }
        setTranslationY(f);
        if (this.WIXlfFpvH7glAGsUk3) {
            float f2 = 1.0f - ((1.0f - this.cCmbv8Tzd2QLd161ImIZUlZ8n) * fLog10);
            setScaleX(f2);
            setScaleY(f2);
        }
        if ((this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp && this.LcvPFGYKhAm4SS5FZ >= 0.0f) || (this.sCPtafveBAhdLIs2ajN3WV && this.LcvPFGYKhAm4SS5FZ <= 0.0f)) {
            this.LcvPFGYKhAm4SS5FZ = 0.0f;
            this.sCPtafveBAhdLIs2ajN3WV = false;
            this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = false;
            setTranslationY(0.0f);
            setScaleX(1.0f);
            setScaleY(1.0f);
        }
        Math.abs(this.LcvPFGYKhAm4SS5FZ);
        ArrayList arrayList = this.qTa7aqjjB9Bt6mc.GO8WUug7ZWFCUI1zY;
        if (arrayList.isEmpty() || (size = arrayList.size() - 1) < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public final CJI9fJNh1Q2PBYQKjHaT4Ef4H getNotifier() {
        return this.qTa7aqjjB9Bt6mc;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        this.Mej0x2K4ZGSUxtYNka4QZ = action;
        if (action == 0) {
            this.f2sXlW3st0rAKJwyOrCfOWc = motionEvent.getY();
        } else if (action == 1) {
            if (!this.yM5HHkk1MhPLZFYTHm2JjrArud && this.FzogU2bPCQtD6a1hMYB1kyti) {
                BezslBgjveK3hODH();
                this.FzogU2bPCQtD6a1hMYB1kyti = false;
                return true;
            }
        } else if (action != 2) {
            if (action == 3) {
                if (!this.yM5HHkk1MhPLZFYTHm2JjrArud) {
                    BezslBgjveK3hODH();
                    this.FzogU2bPCQtD6a1hMYB1kyti = false;
                    return true;
                }
            }
        } else if (!this.yM5HHkk1MhPLZFYTHm2JjrArud) {
            float y = this.f2sXlW3st0rAKJwyOrCfOWc - motionEvent.getY();
            boolean z = this.FzogU2bPCQtD6a1hMYB1kyti;
            float f = this.iR1XUIc7FjhMl57O;
            if ((!z && y > f) || y < (-f)) {
                this.FzogU2bPCQtD6a1hMYB1kyti = true;
            }
            float f2 = this.LcvPFGYKhAm4SS5FZ;
            float f3 = y - f2;
            this.LcvPFGYKhAm4SS5FZ = f2 + f3;
            boolean z2 = this.WIXlfFpvH7glAGsUk3;
            if (f3 < 0.0f && !this.sCPtafveBAhdLIs2ajN3WV && !this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp) {
                this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = true;
                if (z2) {
                    setPivotY(getHeight());
                }
            } else if (f3 > 0.0f && !this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp && !this.sCPtafveBAhdLIs2ajN3WV) {
                this.sCPtafveBAhdLIs2ajN3WV = true;
                if (z2) {
                    setPivotY(0.0f);
                }
            }
            axL8FocTDLUdzg0XScbO();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if ((!this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp || i2 <= 0) && (!this.sCPtafveBAhdLIs2ajN3WV || i2 >= 0)) {
            return;
        }
        S1zP5M3X7Ukq3ROlZ87G9I(i2);
        iArr[1] = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        S1zP5M3X7Ukq3ROlZ87G9I(i4);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
        if (f > 0.0f) {
            this.GO8WUug7ZWFCUI1zY = i2 * f;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        this.yM5HHkk1MhPLZFYTHm2JjrArud = true;
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.yM5HHkk1MhPLZFYTHm2JjrArud = false;
        BezslBgjveK3hODH();
    }

    public ElasticDragDismissFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
    }

    public ElasticDragDismissFrameLayout(Context context) {
        this(context, null, 14);
    }
}
