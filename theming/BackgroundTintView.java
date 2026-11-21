package bitpit.launcher.theming;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import b.Z20oLrSruu4ogWgHZ3;
import b.zdNzte79M7pe;
import b.zmfKefolgpc94cTKByox;

/* JADX INFO: loaded from: classes.dex */
public final class BackgroundTintView extends View {
    public static final Z20oLrSruu4ogWgHZ3 Companion = new Z20oLrSruu4ogWgHZ3();
    public zdNzte79M7pe GO8WUug7ZWFCUI1zY;
    public int Rdzg08aYlt0UsoLUNug9cESzgAY9R;

    public BackgroundTintView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0, 0);
        this.GO8WUug7ZWFCUI1zY = zdNzte79M7pe.NONE;
        setAlpha(0.0f);
    }

    public static final void S1zP5M3X7Ukq3ROlZ87G9I(BackgroundTintView backgroundTintView, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        super.setBackgroundColor(iIntValue);
        backgroundTintView.Rdzg08aYlt0UsoLUNug9cESzgAY9R = iIntValue;
    }

    public final zdNzte79M7pe getTintMode() {
        return this.GO8WUug7ZWFCUI1zY;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (getAlpha() <= 0.0f) {
            super.setBackgroundColor(i);
            this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = i;
        } else {
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.Rdzg08aYlt0UsoLUNug9cESzgAY9R), Integer.valueOf(i));
            valueAnimatorOfObject.setDuration(300L);
            valueAnimatorOfObject.addUpdateListener(new zmfKefolgpc94cTKByox(1, this));
            valueAnimatorOfObject.start();
        }
    }

    public final void setTintMode(zdNzte79M7pe zdnzte79m7pe) {
        if (zdnzte79m7pe == this.GO8WUug7ZWFCUI1zY) {
            return;
        }
        this.GO8WUug7ZWFCUI1zY = zdnzte79m7pe;
        animate().alpha(zdnzte79m7pe.GO8WUug7ZWFCUI1zY).setDuration(300L).start();
    }

    public BackgroundTintView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
    }

    public BackgroundTintView(Context context) {
        this(context, null, 14);
    }
}
