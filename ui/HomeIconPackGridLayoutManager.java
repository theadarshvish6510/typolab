package bitpit.launcher.ui;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.FIpnp8oYYI3psx6d1rBySMc6E;
import b.Hu34J5xXQDG9B4X;
import b.aQq01kL7QVMmzLIqnbMAOCb;
import b.db7W22f2OwBZO1GzsWe8IM80qE;
import b.jWzbk79VM3UFl2lFRxvg;
import b.pHA0P4Gw3bV;
import b.sTJIfGcSq8Uxx6t;
import b.wGLoULxGiKTo;
import bitpit.launcher.R;

/* JADX INFO: loaded from: classes.dex */
public final class HomeIconPackGridLayoutManager extends GridLayoutManager implements sTJIfGcSq8Uxx6t {
    public static final aQq01kL7QVMmzLIqnbMAOCb Companion = new aQq01kL7QVMmzLIqnbMAOCb();
    public final Context IPi49brQACDpXJTJMp7;
    public final jWzbk79VM3UFl2lFRxvg jvttfmFMQfShe6OfbNf1zF8CyEu;
    public int nXIf4d0RGTWG1l;

    public HomeIconPackGridLayoutManager(Context context, jWzbk79VM3UFl2lFRxvg jwzbk79vm3ufl2lfrxvg, wGLoULxGiKTo wgloulxgikto) {
        super(context, 2);
        this.IPi49brQACDpXJTJMp7 = context;
        this.jvttfmFMQfShe6OfbNf1zF8CyEu = jwzbk79vm3ufl2lfrxvg;
        this.J1BE9tYH1em4X1uAhc6L7f4M = new FIpnp8oYYI3psx6d1rBySMc6E(wgloulxgikto, this, 0);
    }

    @Override // b.FdefTICOs2UQ1fmh66Mky
    public final void KdeRfNMKV5NbGkNy3v0hdYzMi(int i) {
        this.jvttfmFMQfShe6OfbNf1zF8CyEu.BezslBgjveK3hODH(i);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, b.FdefTICOs2UQ1fmh66Mky
    public final int WwLbT8A1DREUOMGqEk(int i, Hu34J5xXQDG9B4X hu34J5xXQDG9B4X, pHA0P4Gw3bV pha0p4gw3bv) {
        return this.jvttfmFMQfShe6OfbNf1zF8CyEu.PQQPeCDD0JLCT3aLz(i, hu34J5xXQDG9B4X, pha0p4gw3bv, this);
    }

    public final void ZmgcA4MRbtSHHYJk() {
        int i = this.HveD9n1tOYlffjJDxghBitYNgB;
        if (i == this.nXIf4d0RGTWG1l) {
            return;
        }
        this.nXIf4d0RGTWG1l = i;
        Context context = this.IPi49brQACDpXJTJMp7;
        int iS1zP5M3X7Ukq3ROlZ87G9I = (int) (this.HveD9n1tOYlffjJDxghBitYNgB / db7W22f2OwBZO1GzsWe8IM80qE.S1zP5M3X7Ukq3ROlZ87G9I(context, R.dimen.min_icon_pack_grid_column_width));
        if (iS1zP5M3X7Ukq3ROlZ87G9I < 2) {
            iS1zP5M3X7Ukq3ROlZ87G9I = 2;
        }
        if (iS1zP5M3X7Ukq3ROlZ87G9I > 5) {
            float fS1zP5M3X7Ukq3ROlZ87G9I = db7W22f2OwBZO1GzsWe8IM80qE.S1zP5M3X7Ukq3ROlZ87G9I(context, R.dimen.max_icon_pack_grid_column_width);
            float f = this.HveD9n1tOYlffjJDxghBitYNgB;
            float f2 = f / 5.0f;
            if (f2 <= fS1zP5M3X7Ukq3ROlZ87G9I) {
                fS1zP5M3X7Ukq3ROlZ87G9I = f2;
            }
            iS1zP5M3X7Ukq3ROlZ87G9I = (int) (f / fS1zP5M3X7Ukq3ROlZ87G9I);
        }
        q2ANEshEZ2s6SxvhXLcv(iS1zP5M3X7Ukq3ROlZ87G9I);
    }

    @Override // b.FdefTICOs2UQ1fmh66Mky
    public final void f5pjKkfEQcp(RecyclerView recyclerView) {
        ZmgcA4MRbtSHHYJk();
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, b.FdefTICOs2UQ1fmh66Mky
    public final void iXk6STWDu48PQFwNyHwi2a(Hu34J5xXQDG9B4X hu34J5xXQDG9B4X, pHA0P4Gw3bV pha0p4gw3bv) {
        super.iXk6STWDu48PQFwNyHwi2a(hu34J5xXQDG9B4X, pha0p4gw3bv);
        ZmgcA4MRbtSHHYJk();
    }

    @Override // b.sTJIfGcSq8Uxx6t
    public final int ox9eclwMpRd(int i, Hu34J5xXQDG9B4X hu34J5xXQDG9B4X, pHA0P4Gw3bV pha0p4gw3bv) {
        return super.WwLbT8A1DREUOMGqEk(i, hu34J5xXQDG9B4X, pha0p4gw3bv);
    }
}
