package bitpit.launcher.widget.stack;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b.FdefTICOs2UQ1fmh66Mky;
import b.GyOuKdDsNJYV1uL;
import b.Hu34J5xXQDG9B4X;
import b.Vmfnnzn0BGlsOA65tJ0u0;
import b.gIQ6BdvuE0XFbBaF;
import b.l8edj2cSYoQ;
import b.nWxlOFe6m1csz6tupPwhf9K;
import b.pHA0P4Gw3bV;
import b.qCq8JzZBRKFmnjJ5;
import b.t1qBI5bdDVp81qHUuT;
import b.uuyTGGFjNDiF1SxHW;
import com.bekawestberg.loopinglayout.library.LoopingLayoutManager;

/* JADX INFO: loaded from: classes.dex */
public final class WidgetStackLayoutManager extends LoopingLayoutManager implements gIQ6BdvuE0XFbBaF {
    public static final l8edj2cSYoQ Companion = new l8edj2cSYoQ();
    public static final qCq8JzZBRKFmnjJ5 WIXlfFpvH7glAGsUk3 = t1qBI5bdDVp81qHUuT.S1zP5M3X7Ukq3ROlZ87G9I;
    public final float Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    public int cCmbv8Tzd2QLd161ImIZUlZ8n;

    public WidgetStackLayoutManager(float f) {
        this.Ql6q60SSx3 = new Vmfnnzn0BGlsOA65tJ0u0(0, 0, 62);
        this.JPYjB0bzUqKR = GyOuKdDsNJYV1uL.sCPtafveBAhdLIs2ajN3WV;
        BPwL3vlF71kKo6p(0);
        if (this.GO8WUug7ZWFCUI1zY) {
            LYcdI4xpry8eXmFC9I4wyaLdcG1z(null);
            this.GO8WUug7ZWFCUI1zY = false;
            lZBbKIgtyUK3jX2HZ1rGt987Fo();
        }
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = f;
        this.cCmbv8Tzd2QLd161ImIZUlZ8n = 1;
    }

    @Override // b.gIQ6BdvuE0XFbBaF
    public final int Aboow6rUrcY2SrFRa46C6uy() {
        return this.cCmbv8Tzd2QLd161ImIZUlZ8n;
    }

    @Override // b.gIQ6BdvuE0XFbBaF
    public final void BezslBgjveK3hODH(int i) {
        if (1 > i || i > Integer.MAX_VALUE) {
            uuyTGGFjNDiF1SxHW.PQQPeCDD0JLCT3aLz("Failed requirement.");
        } else {
            this.cCmbv8Tzd2QLd161ImIZUlZ8n = i;
        }
    }

    @Override // b.FdefTICOs2UQ1fmh66Mky
    public final void KdeRfNMKV5NbGkNy3v0hdYzMi(int i) {
        int iLcvPFGYKhAm4SS5FZ = LcvPFGYKhAm4SS5FZ();
        for (int i2 = 0; i2 < iLcvPFGYKhAm4SS5FZ; i2++) {
            View viewGsHzEVTj1SCIPR = gsHzEVTj1SCIPR(i2);
            if (viewGsHzEVTj1SCIPR != null && i == 0) {
                viewGsHzEVTj1SCIPR.setScaleX(1.0f);
                viewGsHzEVTj1SCIPR.setScaleY(1.0f);
            }
        }
    }

    @Override // com.bekawestberg.loopinglayout.library.LoopingLayoutManager, b.FdefTICOs2UQ1fmh66Mky
    public final int NBdfCWeVOPpwOaZSGqvy(int i, Hu34J5xXQDG9B4X hu34J5xXQDG9B4X, pHA0P4Gw3bV pha0p4gw3bv) {
        float f;
        if (this.caTQCiA8tNnV != 0) {
            uuyTGGFjNDiF1SxHW.PQQPeCDD0JLCT3aLz("Failed requirement.");
            return 0;
        }
        int iLH4Kn997Cqv4prFe7Bqz4ByRaPw = LH4Kn997Cqv4prFe7Bqz4ByRaPw(i, hu34J5xXQDG9B4X, pha0p4gw3bv);
        float f2 = this.HveD9n1tOYlffjJDxghBitYNgB;
        float f3 = f2 / 2.0f;
        float f4 = (f2 * 0.5f) / this.cCmbv8Tzd2QLd161ImIZUlZ8n;
        int iLcvPFGYKhAm4SS5FZ = LcvPFGYKhAm4SS5FZ();
        for (int i2 = 0; i2 < iLcvPFGYKhAm4SS5FZ; i2++) {
            View viewGsHzEVTj1SCIPR = gsHzEVTj1SCIPR(i2);
            if (viewGsHzEVTj1SCIPR != null) {
                float fF2sXlW3st0rAKJwyOrCfOWc = (FdefTICOs2UQ1fmh66Mky.f2sXlW3st0rAKJwyOrCfOWc(viewGsHzEVTj1SCIPR) + FdefTICOs2UQ1fmh66Mky.FzogU2bPCQtD6a1hMYB1kyti(viewGsHzEVTj1SCIPR)) / 2.0f;
                int i3 = this.cCmbv8Tzd2QLd161ImIZUlZ8n;
                if (i3 > 1) {
                    int i4 = this.HveD9n1tOYlffjJDxghBitYNgB / (i3 * 2);
                    f = Float.MAX_VALUE;
                    for (int i5 = 0; i5 < i3; i5++) {
                        float fCVfIGUKLEqID1HH = fF2sXlW3st0rAKJwyOrCfOWc - (((i4 * i5) * 2) + (cVfIGUKLEqID1HH() + i4));
                        if (Math.abs(fCVfIGUKLEqID1HH) < Math.abs(f)) {
                            f = fCVfIGUKLEqID1HH;
                        }
                    }
                } else {
                    f = f3 - fF2sXlW3st0rAKJwyOrCfOWc;
                }
                float fAbs = Math.abs(f);
                if (fAbs > f4) {
                    fAbs = f4;
                }
                float interpolation = 1.0f - (WIXlfFpvH7glAGsUk3.getInterpolation(fAbs / f4) * 0.125f);
                viewGsHzEVTj1SCIPR.setScaleX(interpolation);
                viewGsHzEVTj1SCIPR.setScaleY(interpolation);
            }
        }
        return iLH4Kn997Cqv4prFe7Bqz4ByRaPw;
    }

    @Override // b.FdefTICOs2UQ1fmh66Mky
    public final void PQQPeCDD0JLCT3aLz(View view, int i) {
        JY5knQmh7EQJEZ(view, i, false);
        view.getLayoutParams().width = this.HveD9n1tOYlffjJDxghBitYNgB / this.cCmbv8Tzd2QLd161ImIZUlZ8n;
    }

    @Override // com.bekawestberg.loopinglayout.library.LoopingLayoutManager, b.FdefTICOs2UQ1fmh66Mky
    public final boolean fXBtMGfTIjGSHgK542() {
        return false;
    }

    @Override // com.bekawestberg.loopinglayout.library.LoopingLayoutManager, b.FdefTICOs2UQ1fmh66Mky
    public final boolean flPMk2Ix9h3b95v() {
        return super.flPMk2Ix9h3b95v() && tdNmBZIJHG1() > this.cCmbv8Tzd2QLd161ImIZUlZ8n;
    }

    @Override // com.bekawestberg.loopinglayout.library.LoopingLayoutManager, b.FdefTICOs2UQ1fmh66Mky
    public final void nYT0DKgXJwaKUiSwy0PVds(RecyclerView recyclerView, pHA0P4Gw3bV pha0p4gw3bv, int i) {
        nWxlOFe6m1csz6tupPwhf9K nwxlofe6m1csz6tuppwhf9k = new nWxlOFe6m1csz6tupPwhf9K(recyclerView.getContext(), pha0p4gw3bv, this.Rdzg08aYlt0UsoLUNug9cESzgAY9R);
        nwxlofe6m1csz6tuppwhf9k.S1zP5M3X7Ukq3ROlZ87G9I = i;
        XsOEcVh9yrEYbnc(nwxlofe6m1csz6tuppwhf9k);
    }
}
