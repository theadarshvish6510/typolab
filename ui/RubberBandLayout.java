package bitpit.launcher.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import b.DzpY2fcAt8q;
import b.J6fVPc4iLDMOxXEbo87fhumCX;
import b.J70Ya4TOFj3iu5xt0S8ip7pX;
import b.O1VE8grxm4nj1d;
import b.OoGkScNURrapP;
import b.aBhc5Hosh3idQU7mazY;
import b.db7W22f2OwBZO1GzsWe8IM80qE;
import b.fhSNm7dhXpC9W6pfm4CfVlFNDgpq;
import b.iuodsTjbEDBjB;
import b.laJtmuavFe;
import b.lkiaEDM5lpT;
import b.mGx1Z0QoNwvrSy;
import b.mHW63SUma8isGb;
import b.mo4unDT7uci;
import b.mpy1wONnMS54uXfFaN;
import b.pFjE7x2dxZZq1cv5RhDwWf60chK42;
import b.pXynlL6SZmXt4dK1Q;
import b.qSDYaDqxbBy2QEeVAcFRy;
import b.rIZnKQgihO6DW5;
import b.rbpFGdpgDCAQXat;
import b.wLrBaxyMyO35AkdI;
import b.zHfG9eBtghieLBn;
import bitpit.launcher.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class RubberBandLayout extends FrameLayout implements lkiaEDM5lpT {
    public static final wLrBaxyMyO35AkdI Companion = new wLrBaxyMyO35AkdI();
    public static final J6fVPc4iLDMOxXEbo87fhumCX Mej0x2K4ZGSUxtYNka4QZ = new J6fVPc4iLDMOxXEbo87fhumCX(2);
    public final mHW63SUma8isGb GO8WUug7ZWFCUI1zY;
    public final aBhc5Hosh3idQU7mazY LcvPFGYKhAm4SS5FZ;
    public final mHW63SUma8isGb Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    public final float WIXlfFpvH7glAGsUk3;
    public final int cCmbv8Tzd2QLd161ImIZUlZ8n;
    public float gsHzEVTj1SCIPR;
    public final aBhc5Hosh3idQU7mazY qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
    public final float sCPtafveBAhdLIs2ajN3WV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RubberBandLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0, 0);
        Float fValueOf = Float.valueOf(0.0f);
        this.GO8WUug7ZWFCUI1zY = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new pFjE7x2dxZZq1cv5RhDwWf60chK42(this, 0));
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new pFjE7x2dxZZq1cv5RhDwWf60chK42(this, 1));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mpy1wONnMS54uXfFaN.S1zP5M3X7Ukq3ROlZ87G9I, 0, 0);
        try {
            int i2 = typedArrayObtainStyledAttributes.getInt(0, 1);
            typedArrayObtainStyledAttributes.recycle();
            this.cCmbv8Tzd2QLd161ImIZUlZ8n = i2;
            this.WIXlfFpvH7glAGsUk3 = db7W22f2OwBZO1GzsWe8IM80qE.S1zP5M3X7Ukq3ROlZ87G9I(context, R.dimen.rubber_band_max_overscroll);
            J6fVPc4iLDMOxXEbo87fhumCX j6fVPc4iLDMOxXEbo87fhumCX = Mej0x2K4ZGSUxtYNka4QZ;
            aBhc5Hosh3idQU7mazY abhc5hosh3idqu7mazy = new aBhc5Hosh3idQU7mazY((View) this, (iuodsTjbEDBjB) j6fVPc4iLDMOxXEbo87fhumCX);
            mGx1Z0QoNwvrSy.S1zP5M3X7Ukq3ROlZ87G9I(abhc5hosh3idqu7mazy, 525.0f, 0.75f, fValueOf);
            this.LcvPFGYKhAm4SS5FZ = abhc5hosh3idqu7mazy;
            aBhc5Hosh3idQU7mazY abhc5hosh3idqu7mazy2 = new aBhc5Hosh3idQU7mazY((View) this, (iuodsTjbEDBjB) j6fVPc4iLDMOxXEbo87fhumCX);
            mGx1Z0QoNwvrSy.S1zP5M3X7Ukq3ROlZ87G9I(abhc5hosh3idqu7mazy2, 200.0f, 0.75f, fValueOf);
            this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = abhc5hosh3idqu7mazy2;
            new ArrayList();
            new ArrayList();
            if (j6fVPc4iLDMOxXEbo87fhumCX != aBhc5Hosh3idQU7mazY.JPYjB0bzUqKR && j6fVPc4iLDMOxXEbo87fhumCX != aBhc5Hosh3idQU7mazY.caTQCiA8tNnV && j6fVPc4iLDMOxXEbo87fhumCX != aBhc5Hosh3idQU7mazY.GO8WUug7ZWFCUI1zY && j6fVPc4iLDMOxXEbo87fhumCX != aBhc5Hosh3idQU7mazY.gsHzEVTj1SCIPR && j6fVPc4iLDMOxXEbo87fhumCX != aBhc5Hosh3idQU7mazY.UV6K6VDbgDgzpi12QAEKN4Emq) {
                rIZnKQgihO6DW5 riznkqgiho6dw5 = aBhc5Hosh3idQU7mazY.cS9Klw57l26qfkpcMlfmpU;
            }
            new OoGkScNURrapP(0.0f);
            OoGkScNURrapP ooGkScNURrapP = new OoGkScNURrapP();
            ooGkScNURrapP.axL8FocTDLUdzg0XScbO(45.0f);
            ooGkScNURrapP.S1zP5M3X7Ukq3ROlZ87G9I(0.75f);
            ooGkScNURrapP.LYcdI4xpry8eXmFC9I4wyaLdcG1z = 0.0f;
            this.sCPtafveBAhdLIs2ajN3WV = -db7W22f2OwBZO1GzsWe8IM80qE.S1zP5M3X7Ukq3ROlZ87G9I(context, R.dimen.material72);
            float f = context.getResources().getDisplayMetrics().density;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final zHfG9eBtghieLBn getCoroutineScope() {
        return (zHfG9eBtghieLBn) this.Rdzg08aYlt0UsoLUNug9cESzgAY9R.getValue();
    }

    public final laJtmuavFe getHapticsManager() {
        return (laJtmuavFe) this.GO8WUug7ZWFCUI1zY.getValue();
    }

    private static /* synthetic */ void getLeaveHomeSpring$annotations() {
    }

    private static /* synthetic */ void getOverscrollSpring$annotations() {
    }

    private static /* synthetic */ void getReturnToHomeSpring$annotations() {
    }

    public final void axL8FocTDLUdzg0XScbO(float f, boolean z) {
        if (f == 0.0f && this.gsHzEVTj1SCIPR == 0.0f) {
            return;
        }
        if (z && f != 0.0f) {
            rbpFGdpgDCAQXat.ziNFA7KzVfc6(getCoroutineScope(), null, 0, new J70Ya4TOFj3iu5xt0S8ip7pX(this, mo4unDT7uci.ziNFA7KzVfc6((float) Math.pow(Math.abs((f / getContext().getResources().getDisplayMetrics().density) / 12000.0f), 0.800000011920929d), 0.0f, 1.0f), null), 3);
        }
        aBhc5Hosh3idQU7mazY abhc5hosh3idqu7mazy = this.LcvPFGYKhAm4SS5FZ;
        abhc5hosh3idqu7mazy.S1zP5M3X7Ukq3ROlZ87G9I = f;
        abhc5hosh3idqu7mazy.axL8FocTDLUdzg0XScbO = this.gsHzEVTj1SCIPR;
        abhc5hosh3idqu7mazy.BezslBgjveK3hODH = true;
        abhc5hosh3idqu7mazy.PQQPeCDD0JLCT3aLz();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.gsHzEVTj1SCIPR != 0.0f) {
            if (!(DzpY2fcAt8q.axL8FocTDLUdzg0XScbO == 0.0f)) {
                int iSave = canvas.save();
                float f = this.gsHzEVTj1SCIPR;
                float f2 = this.WIXlfFpvH7glAGsUk3;
                float fAbs = Math.abs(f / f2);
                float fSignum = Math.signum(this.gsHzEVTj1SCIPR) * f2 * (fAbs > 1.0f ? 0.19999999f : 0.8f * ((1.25f * fAbs) - ((float) Math.pow(fAbs, 1.25d))));
                int i = this.cCmbv8Tzd2QLd161ImIZUlZ8n;
                if (i == 0) {
                    canvas.translate(fSignum, 0.0f);
                } else {
                    if (i != 1) {
                        O1VE8grxm4nj1d.ox9eclwMpRd(Integer.valueOf(i));
                        return false;
                    }
                    canvas.translate(0.0f, fSignum);
                }
                boolean zDrawChild = super.drawChild(canvas, view, j);
                canvas.restoreToCount(iSave);
                return zDrawChild;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // b.lkiaEDM5lpT
    public /* bridge */ pXynlL6SZmXt4dK1Q getKoin() {
        return fhSNm7dhXpC9W6pfm4CfVlFNDgpq.axL8FocTDLUdzg0XScbO();
    }

    public final float getOverscroll() {
        return this.gsHzEVTj1SCIPR;
    }

    public final void setOverscroll(int i) {
        float f = this.gsHzEVTj1SCIPR - i;
        this.gsHzEVTj1SCIPR = f;
        float f2 = this.WIXlfFpvH7glAGsUk3;
        float f3 = -f2;
        if (f < f3) {
            f = f3;
        }
        if (f <= f2) {
            f2 = f;
        }
        this.gsHzEVTj1SCIPR = f2;
        invalidate();
    }

    public final void setOverscroll(float f) {
        this.gsHzEVTj1SCIPR = f;
    }

    public RubberBandLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12, 0);
    }

    public /* synthetic */ RubberBandLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    public RubberBandLayout(Context context) {
        this(context, null, 14, 0);
    }
}
