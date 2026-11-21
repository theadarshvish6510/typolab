package bitpit.launcher.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import b.Emi5d0VyYZLZtm;
import b.zVkUtEURLvHNycfQPRiFy1I;

/* JADX INFO: loaded from: classes.dex */
public final class MaxLinearLayout extends LinearLayout {
    public int GO8WUug7ZWFCUI1zY;
    public int Rdzg08aYlt0UsoLUNug9cESzgAY9R;

    /* JADX WARN: Illegal instructions before constructor call */
    public MaxLinearLayout(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0, 0);
        this.GO8WUug7ZWFCUI1zY = Integer.MAX_VALUE;
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = Integer.MAX_VALUE;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zVkUtEURLvHNycfQPRiFy1I.JY5knQmh7EQJEZ, 0, 0);
            try {
                setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(1, this.GO8WUug7ZWFCUI1zY));
                setMaxHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, this.Rdzg08aYlt0UsoLUNug9cESzgAY9R));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    public final int getMaxHeight() {
        return this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    }

    public final int getMaxWidth() {
        return this.GO8WUug7ZWFCUI1zY;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        try {
            int size = View.MeasureSpec.getSize(i);
            int i3 = this.GO8WUug7ZWFCUI1zY;
            int iMakeMeasureSpec = size > i3 ? View.MeasureSpec.makeMeasureSpec(i3, View.MeasureSpec.getMode(i)) : i;
            int size2 = View.MeasureSpec.getSize(i2);
            int i4 = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
            super.onMeasure(iMakeMeasureSpec, size2 > i4 ? View.MeasureSpec.makeMeasureSpec(i4, View.MeasureSpec.getMode(i2)) : i2);
        } catch (Exception e) {
            Emi5d0VyYZLZtm.ziNFA7KzVfc6(e, "MaxHeightException");
            super.onMeasure(i, i2);
        }
    }

    public final void setMaxHeight(int i) {
        if (this.Rdzg08aYlt0UsoLUNug9cESzgAY9R != i) {
            this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = i;
            requestLayout();
        }
    }

    public final void setMaxWidth(int i) {
        if (this.GO8WUug7ZWFCUI1zY != i) {
            this.GO8WUug7ZWFCUI1zY = i;
            requestLayout();
        }
    }

    public MaxLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
    }

    public MaxLinearLayout(Context context) {
        this(context, null, 14);
    }
}
