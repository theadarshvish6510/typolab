package bitpit.launcher.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import b.t7LLPo8kug;
import bitpit.launcher.R;

/* JADX INFO: loaded from: classes.dex */
public final class ButtonOnBackground extends ButtonDefaultBackground {
    public ButtonOnBackground(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.backgroundColorSecondary, R.attr.onBackgroundRippleColor, R.attr.primaryColorThin});
        try {
            t7LLPo8kug.PQQPeCDD0JLCT3aLz(typedArrayObtainStyledAttributes, 0);
            setBackgroundColor(typedArrayObtainStyledAttributes.getColor(0, 0));
            t7LLPo8kug.PQQPeCDD0JLCT3aLz(typedArrayObtainStyledAttributes, 1);
            setRippleColor(ColorStateList.valueOf(typedArrayObtainStyledAttributes.getColor(1, 0)));
            t7LLPo8kug.PQQPeCDD0JLCT3aLz(typedArrayObtainStyledAttributes, 2);
            setStrokeColor(ColorStateList.valueOf(typedArrayObtainStyledAttributes.getColor(2, 0)));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public ButtonOnBackground(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public ButtonOnBackground(Context context) {
        this(context, null, 6);
    }
}
