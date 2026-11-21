package bitpit.launcher.ui;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import b.Hu34J5xXQDG9B4X;
import b.L0hgQ8DgTqzW4MEtZNoFb7cpyin;
import b.jWzbk79VM3UFl2lFRxvg;
import b.pHA0P4Gw3bV;
import b.pXOCJGtyThh1D9sAI9;
import b.sTJIfGcSq8Uxx6t;
import b.wGLoULxGiKTo;

/* JADX INFO: loaded from: classes.dex */
public final class HomeTabletGridLayoutManager extends GridLayoutManager implements sTJIfGcSq8Uxx6t {
    public static final pXOCJGtyThh1D9sAI9 Companion = new pXOCJGtyThh1D9sAI9();
    public final jWzbk79VM3UFl2lFRxvg IPi49brQACDpXJTJMp7;

    public HomeTabletGridLayoutManager(Context context, jWzbk79VM3UFl2lFRxvg jwzbk79vm3ufl2lfrxvg, wGLoULxGiKTo wgloulxgikto) {
        super(context, 2);
        this.IPi49brQACDpXJTJMp7 = jwzbk79vm3ufl2lfrxvg;
        this.J1BE9tYH1em4X1uAhc6L7f4M = new L0hgQ8DgTqzW4MEtZNoFb7cpyin(wgloulxgikto);
    }

    @Override // b.FdefTICOs2UQ1fmh66Mky
    public final void KdeRfNMKV5NbGkNy3v0hdYzMi(int i) {
        this.IPi49brQACDpXJTJMp7.BezslBgjveK3hODH(i);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, b.FdefTICOs2UQ1fmh66Mky
    public final int WwLbT8A1DREUOMGqEk(int i, Hu34J5xXQDG9B4X hu34J5xXQDG9B4X, pHA0P4Gw3bV pha0p4gw3bv) {
        return this.IPi49brQACDpXJTJMp7.PQQPeCDD0JLCT3aLz(i, hu34J5xXQDG9B4X, pha0p4gw3bv, this);
    }

    @Override // b.sTJIfGcSq8Uxx6t
    public final int ox9eclwMpRd(int i, Hu34J5xXQDG9B4X hu34J5xXQDG9B4X, pHA0P4Gw3bV pha0p4gw3bv) {
        return super.WwLbT8A1DREUOMGqEk(i, hu34J5xXQDG9B4X, pha0p4gw3bv);
    }
}
