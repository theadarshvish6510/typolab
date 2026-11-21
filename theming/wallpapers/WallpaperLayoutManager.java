package bitpit.launcher.theming.wallpapers;

import androidx.recyclerview.widget.GridLayoutManager;
import b.Hu34J5xXQDG9B4X;
import b.jWzbk79VM3UFl2lFRxvg;
import b.pHA0P4Gw3bV;
import b.sTJIfGcSq8Uxx6t;
import bitpit.launcher.R;
import bitpit.launcher.ui.RubberBandLayout;

/* JADX INFO: loaded from: classes.dex */
public final class WallpaperLayoutManager extends GridLayoutManager implements sTJIfGcSq8Uxx6t {
    public final jWzbk79VM3UFl2lFRxvg IPi49brQACDpXJTJMp7;

    public WallpaperLayoutManager(WallpaperCollectionActivity wallpaperCollectionActivity, RubberBandLayout rubberBandLayout) {
        super(wallpaperCollectionActivity, wallpaperCollectionActivity.getResources().getInteger(R.integer.wallpaper_collection_columns));
        this.IPi49brQACDpXJTJMp7 = new jWzbk79VM3UFl2lFRxvg(rubberBandLayout);
        this.JY5knQmh7EQJEZ = false;
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
