package bitpit.launcher.ui;

import android.content.Context;
import android.util.AttributeSet;
import bitpit.launcher.R;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes.dex */
public final class NextFlatButton extends MaterialButton {
    public NextFlatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, R.attr.nextFlatButtonStyle);
        setTextAppearance(R.style.Text_Button);
        setPadding(getPaddingLeft(), 0, getPaddingRight(), 0);
    }

    public NextFlatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public NextFlatButton(Context context) {
        this(context, null, 6);
    }
}
