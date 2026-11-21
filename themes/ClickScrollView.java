package bitpit.launcher.themes;

import android.content.Context;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import b.AdgDapbjrDjBcGjLe4alRXNp;
import b.FEQRevcIuPvcE8J;
import b.cvu91h5WjQasu7vH8q4wQg9;
import b.wRGPxmq2eS8e4w0;

/* JADX INFO: loaded from: classes.dex */
public final class ClickScrollView extends FrameLayout {
    public RecyclerView GO8WUug7ZWFCUI1zY;
    public final int LcvPFGYKhAm4SS5FZ;
    public boolean Mej0x2K4ZGSUxtYNka4QZ;
    public AdgDapbjrDjBcGjLe4alRXNp Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    public int WIXlfFpvH7glAGsUk3;
    public int cCmbv8Tzd2QLd161ImIZUlZ8n;
    public int f2sXlW3st0rAKJwyOrCfOWc;
    public int gsHzEVTj1SCIPR;
    public final FEQRevcIuPvcE8J iR1XUIc7FjhMl57O;
    public boolean qTa7aqjjB9Bt6mc;
    public final Point qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
    public boolean sCPtafveBAhdLIs2ajN3WV;

    public ClickScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0, 0);
        this.LcvPFGYKhAm4SS5FZ = ViewConfiguration.get(context).getScaledPagingTouchSlop();
        this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = new Point();
        this.iR1XUIc7FjhMl57O = new FEQRevcIuPvcE8J(0, this);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        char c;
        RecyclerView recyclerView;
        int i;
        int iJY5knQmh7EQJEZ = cvu91h5WjQasu7vH8q4wQg9.JY5knQmh7EQJEZ(motionEvent.getX());
        int iJY5knQmh7EQJEZ2 = cvu91h5WjQasu7vH8q4wQg9.JY5knQmh7EQJEZ(motionEvent.getY());
        int i2 = this.cCmbv8Tzd2QLd161ImIZUlZ8n;
        if (iJY5knQmh7EQJEZ2 > this.WIXlfFpvH7glAGsUk3 || i2 > iJY5knQmh7EQJEZ2) {
            c = 1;
        } else if (iJY5knQmh7EQJEZ < this.gsHzEVTj1SCIPR) {
            c = 2;
        } else if (iJY5knQmh7EQJEZ > getWidth() - this.gsHzEVTj1SCIPR) {
            c = 3;
        } else {
            c = 1;
        }
        int actionMasked = motionEvent.getActionMasked();
        Point point = this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
        if (actionMasked == 0) {
            point.set(iJY5knQmh7EQJEZ, iJY5knQmh7EQJEZ2);
            this.sCPtafveBAhdLIs2ajN3WV = false;
            if (c == 1) {
                this.Mej0x2K4ZGSUxtYNka4QZ = false;
            }
        } else if (actionMasked == 1) {
            boolean z = (this.sCPtafveBAhdLIs2ajN3WV || this.qTa7aqjjB9Bt6mc || c == 1) ? false : true;
            if (z) {
                if (c == 2 && (i = this.f2sXlW3st0rAKJwyOrCfOWc) > 0) {
                    RecyclerView recyclerView2 = this.GO8WUug7ZWFCUI1zY;
                    recyclerView = recyclerView2 != null ? recyclerView2 : null;
                    int i3 = i - 1;
                    this.f2sXlW3st0rAKJwyOrCfOWc = i3;
                    recyclerView.NceuzZQj3FhQAg0L(i3);
                } else if (c == 3) {
                    int i4 = this.f2sXlW3st0rAKJwyOrCfOWc;
                    RecyclerView recyclerView3 = this.GO8WUug7ZWFCUI1zY;
                    if (recyclerView3 == null) {
                        recyclerView3 = null;
                    }
                    wRGPxmq2eS8e4w0 adapter = recyclerView3.getAdapter();
                    if (i4 < (adapter != null ? adapter.gsHzEVTj1SCIPR() - 1 : 0)) {
                        RecyclerView recyclerView4 = this.GO8WUug7ZWFCUI1zY;
                        recyclerView = recyclerView4 != null ? recyclerView4 : null;
                        int i5 = this.f2sXlW3st0rAKJwyOrCfOWc + 1;
                        this.f2sXlW3st0rAKJwyOrCfOWc = i5;
                        recyclerView.NceuzZQj3FhQAg0L(i5);
                    }
                }
            }
            this.Mej0x2K4ZGSUxtYNka4QZ = z;
        } else if (actionMasked == 2) {
            int i6 = iJY5knQmh7EQJEZ - point.x;
            int i7 = iJY5knQmh7EQJEZ2 - point.y;
            int iAbs = Math.abs(i6);
            int i8 = this.LcvPFGYKhAm4SS5FZ;
            if (iAbs > i8 || Math.abs(i7) > i8) {
                this.sCPtafveBAhdLIs2ajN3WV = true;
                if (this.Mej0x2K4ZGSUxtYNka4QZ) {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getDownTime(), 0, point.x, point.y, 0);
                    super.dispatchTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    this.Mej0x2K4ZGSUxtYNka4QZ = false;
                }
            }
        }
        if (!this.Mej0x2K4ZGSUxtYNka4QZ || c == 1) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public ClickScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
    }

    public ClickScrollView(Context context) {
        this(context, null, 14);
    }
}
