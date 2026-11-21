package bitpit.launcher.dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class DialogDismissView extends View {
    public final float GO8WUug7ZWFCUI1zY;
    public float Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    public boolean WIXlfFpvH7glAGsUk3;
    public float cCmbv8Tzd2QLd161ImIZUlZ8n;

    public DialogDismissView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0, 0);
        this.GO8WUug7ZWFCUI1zY = ViewConfiguration.get(context).getScaledTouchSlop();
        setWillNotDraw(true);
        setFocusable(0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = motionEvent.getX();
            this.cCmbv8Tzd2QLd161ImIZUlZ8n = motionEvent.getY();
            this.WIXlfFpvH7glAGsUk3 = true;
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                float fAbs = Math.abs(motionEvent.getX() - this.Rdzg08aYlt0UsoLUNug9cESzgAY9R);
                float f = this.GO8WUug7ZWFCUI1zY;
                if (fAbs > f || Math.abs(motionEvent.getY() - this.cCmbv8Tzd2QLd161ImIZUlZ8n) > f) {
                    this.WIXlfFpvH7glAGsUk3 = false;
                    return true;
                }
            }
        } else if (this.WIXlfFpvH7glAGsUk3) {
            performClick();
        }
        return true;
    }

    public DialogDismissView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
    }

    public DialogDismissView(Context context) {
        this(context, null, 14);
    }
}
