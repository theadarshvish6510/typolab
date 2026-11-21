package bitpit.launcher.purchase.ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import bitpit.launcher.R;

/* JADX INFO: loaded from: classes.dex */
public final class SheetView extends ConstraintLayout {
    public SheetView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        setBackground(context.getDrawable(R.drawable.box_sheet));
    }

    public SheetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
    }

    public SheetView(Context context) {
        this(context, null, 14);
    }
}
