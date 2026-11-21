package bitpit.launcher.ui;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import b.Hu34J5xXQDG9B4X;
import b.O1VE8grxm4nj1d;
import b.jWzbk79VM3UFl2lFRxvg;
import b.pHA0P4Gw3bV;
import b.sTJIfGcSq8Uxx6t;

/* JADX INFO: loaded from: classes.dex */
public class RubberBandListLayoutManager extends LinearLayoutManager implements sTJIfGcSq8Uxx6t {
    public final jWzbk79VM3UFl2lFRxvg Mej0x2K4ZGSUxtYNka4QZ;

    public RubberBandListLayoutManager(Context context, jWzbk79VM3UFl2lFRxvg jwzbk79vm3ufl2lfrxvg, int i) {
        super(context, i, false);
        this.Mej0x2K4ZGSUxtYNka4QZ = jwzbk79vm3ufl2lfrxvg;
    }

    @Override // b.FdefTICOs2UQ1fmh66Mky
    public final void KdeRfNMKV5NbGkNy3v0hdYzMi(int i) {
        this.Mej0x2K4ZGSUxtYNka4QZ.BezslBgjveK3hODH(i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b.FdefTICOs2UQ1fmh66Mky
    public final int NBdfCWeVOPpwOaZSGqvy(int i, Hu34J5xXQDG9B4X hu34J5xXQDG9B4X, pHA0P4Gw3bV pha0p4gw3bv) {
        return this.Mej0x2K4ZGSUxtYNka4QZ.PQQPeCDD0JLCT3aLz(i, hu34J5xXQDG9B4X, pha0p4gw3bv, this);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b.FdefTICOs2UQ1fmh66Mky
    public final int WwLbT8A1DREUOMGqEk(int i, Hu34J5xXQDG9B4X hu34J5xXQDG9B4X, pHA0P4Gw3bV pha0p4gw3bv) {
        return this.Mej0x2K4ZGSUxtYNka4QZ.PQQPeCDD0JLCT3aLz(i, hu34J5xXQDG9B4X, pha0p4gw3bv, this);
    }

    @Override // b.sTJIfGcSq8Uxx6t
    public final int ox9eclwMpRd(int i, Hu34J5xXQDG9B4X hu34J5xXQDG9B4X, pHA0P4Gw3bV pha0p4gw3bv) {
        int i2 = this.Ql6q60SSx3;
        if (i2 == 0) {
            return super.NBdfCWeVOPpwOaZSGqvy(i, hu34J5xXQDG9B4X, pha0p4gw3bv);
        }
        if (i2 == 1) {
            return super.WwLbT8A1DREUOMGqEk(i, hu34J5xXQDG9B4X, pha0p4gw3bv);
        }
        O1VE8grxm4nj1d.ox9eclwMpRd(Integer.valueOf(i2));
        return 0;
    }
}
