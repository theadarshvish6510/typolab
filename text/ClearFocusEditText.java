package bitpit.launcher.text;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.google.android.material.textfield.TextInputEditText;

/* JADX INFO: loaded from: classes.dex */
public final class ClearFocusEditText extends TextInputEditText {
    public ClearFocusEditText(Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            clearFocus();
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public ClearFocusEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
