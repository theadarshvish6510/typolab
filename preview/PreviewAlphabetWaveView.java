package bitpit.launcher.preview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import b.vYmuZ1YssoLimkM3XwMKMkzHEtza;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewAlphabetWaveView extends FrameLayout {
    public vYmuZ1YssoLimkM3XwMKMkzHEtza GO8WUug7ZWFCUI1zY;

    public PreviewAlphabetWaveView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0, 0);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        vYmuZ1YssoLimkM3XwMKMkzHEtza vymuz1yssolimkm3xwmkmkzhetza = this.GO8WUug7ZWFCUI1zY;
        if (vymuz1yssolimkm3xwmkmkzhetza != null) {
            vymuz1yssolimkm3xwmkmkzhetza.BezslBgjveK3hODH(canvas);
        }
    }

    public final vYmuZ1YssoLimkM3XwMKMkzHEtza getAlphabetWave() {
        return this.GO8WUug7ZWFCUI1zY;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        vYmuZ1YssoLimkM3XwMKMkzHEtza vymuz1yssolimkm3xwmkmkzhetza = this.GO8WUug7ZWFCUI1zY;
        if (vymuz1yssolimkm3xwmkmkzhetza != null) {
            vymuz1yssolimkm3xwmkmkzhetza.HveD9n1tOYlffjJDxghBitYNgB(i);
        }
    }

    public final void setAlphabetWave(vYmuZ1YssoLimkM3XwMKMkzHEtza vymuz1yssolimkm3xwmkmkzhetza) {
        this.GO8WUug7ZWFCUI1zY = vymuz1yssolimkm3xwmkmkzhetza;
        invalidate();
    }

    public PreviewAlphabetWaveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
    }

    public PreviewAlphabetWaveView(Context context) {
        this(context, null, 14);
    }
}
