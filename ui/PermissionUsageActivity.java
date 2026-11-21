package bitpit.launcher.ui;

import android.os.Bundle;
import android.view.ViewGroup;
import b.DbQNgaGHDHAbMye;
import b.HF5afwOkFj9V8;
import b.ZUboA6FxcG5CkT3ZuNeq;
import b.dGvRr0aa2CegMWZH8rJH9l1;
import b.gT4sTdpjS277wbG60pk72fHWG7;
import b.hwSYVZu6IevsK1z;
import b.qAu8xPQt71QSu59v2YrEcbg7z;
import b.rQ9HJYgnWGlaj05E54n4BwVJQ8oK;
import b.uuyTGGFjNDiF1SxHW;
import bitpit.launcher.R;

/* JADX INFO: loaded from: classes.dex */
public final class PermissionUsageActivity extends qAu8xPQt71QSu59v2YrEcbg7z {
    public static final /* synthetic */ int LkMPQqEJluZFFX0mL = 0;
    public ViewGroup lgJtMcdLJn14MkPMn;
    public final ZUboA6FxcG5CkT3ZuNeq ra4eheLgdhUxuEZ9vbYShAWJ = ZUboA6FxcG5CkT3ZuNeq.sCPtafveBAhdLIs2ajN3WV;
    public final boolean NceuzZQj3FhQAg0L = true;

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z, b.nJMkSIuTHA4ytmN, b.QKXpIUPLGn, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(((bitpit.launcher.theming.NniqwgLR9Jo6Bl9Px0S5u) J1BE9tYH1em4X1uAhc6L7f4M()).jvttfmFMQfShe6OfbNf1zF8CyEu.S1zP5M3X7Ukq3ROlZ87G9I.tzMOyOc53ffl ? R.style.TransparentTheme_Black : R.style.TransparentTheme);
        rQ9HJYgnWGlaj05E54n4BwVJQ8oK.BezslBgjveK3hODH(getWindow());
        if (!gT4sTdpjS277wbG60pk72fHWG7.ox9eclwMpRd) {
            finish();
            return;
        }
        setContentView(R.layout.empty_activity);
        this.lgJtMcdLJn14MkPMn = (ViewGroup) findViewById(R.id.root_view);
        String stringExtra = getIntent().getStringExtra("android.intent.extra.PERMISSION_GROUP_NAME");
        if (stringExtra == null) {
            uuyTGGFjNDiF1SxHW.PQQPeCDD0JLCT3aLz("Missing permission group in PermissionUsageActivity");
            return;
        }
        CharSequence charSequenceLoadLabel = getPackageManager().getPermissionGroupInfo(stringExtra, 0).loadLabel(getPackageManager());
        CharSequence charSequenceS1zP5M3X7Ukq3ROlZ87G9I = ((HF5afwOkFj9V8) ((hwSYVZu6IevsK1z) this.Cl5XA76hhttS71Yja18WBMw7.getValue())).S1zP5M3X7Ukq3ROlZ87G9I(stringExtra);
        ((dGvRr0aa2CegMWZH8rJH9l1) LcvPFGYKhAm4SS5FZ()).PQQPeCDD0JLCT3aLz(this.ra4eheLgdhUxuEZ9vbYShAWJ, new DbQNgaGHDHAbMye(charSequenceLoadLabel, charSequenceS1zP5M3X7Ukq3ROlZ87G9I, this, 16));
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z
    public final ViewGroup qaDSpeex0Oo1Qvt3oOrTJnbcQFp() {
        ViewGroup viewGroup = this.lgJtMcdLJn14MkPMn;
        if (viewGroup != null) {
            return viewGroup;
        }
        return null;
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z
    public final ZUboA6FxcG5CkT3ZuNeq sCPtafveBAhdLIs2ajN3WV() {
        return this.ra4eheLgdhUxuEZ9vbYShAWJ;
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z
    public final boolean yM5HHkk1MhPLZFYTHm2JjrArud() {
        return this.NceuzZQj3FhQAg0L;
    }
}
