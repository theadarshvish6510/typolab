package bitpit.launcher.icon.icon_pack;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Toast;
import b.AGbBeHA0jn5gC8O;
import b.KKBZo65kviK70HdepiufV963fKbnO;
import b.LqH09V6V7Wln;
import b.XSiZqjZ3VeBTuhOwd;
import b.ZUboA6FxcG5CkT3ZuNeq;
import b.mHW63SUma8isGb;
import b.mIRAh3PBGe8whGSCNLDU;
import b.qAu8xPQt71QSu59v2YrEcbg7z;
import b.qSDYaDqxbBy2QEeVAcFRy;
import b.rQ9HJYgnWGlaj05E54n4BwVJQ8oK;
import b.rbpFGdpgDCAQXat;
import b.vOL3U3fINHMmdVoJz;
import bitpit.launcher.R;
import bitpit.launcher.theming.NniqwgLR9Jo6Bl9Px0S5u;

/* JADX INFO: loaded from: classes.dex */
public final class ApplyIconPackActivity extends qAu8xPQt71QSu59v2YrEcbg7z {
    public static final /* synthetic */ int N1ENDx3UBC9JxmcGQyn59aqjOM = 0;
    public ViewGroup LkMPQqEJluZFFX0mL;
    public final mHW63SUma8isGb ra4eheLgdhUxuEZ9vbYShAWJ = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new mIRAh3PBGe8whGSCNLDU(2, this));
    public final ZUboA6FxcG5CkT3ZuNeq NceuzZQj3FhQAg0L = ZUboA6FxcG5CkT3ZuNeq.Mej0x2K4ZGSUxtYNka4QZ;
    public final boolean lgJtMcdLJn14MkPMn = true;

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z, b.nJMkSIuTHA4ytmN, b.QKXpIUPLGn, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(((NniqwgLR9Jo6Bl9Px0S5u) J1BE9tYH1em4X1uAhc6L7f4M()).jvttfmFMQfShe6OfbNf1zF8CyEu.S1zP5M3X7Ukq3ROlZ87G9I.tzMOyOc53ffl ? R.style.TransparentTheme_Black : R.style.TransparentTheme);
        rQ9HJYgnWGlaj05E54n4BwVJQ8oK.BezslBgjveK3hODH(getWindow());
        String stringExtra = getIntent().getStringExtra("packageName");
        if (stringExtra != null && stringExtra.length() != 0) {
            KKBZo65kviK70HdepiufV963fKbnO.Companion.getClass();
            if (!AGbBeHA0jn5gC8O.S1zP5M3X7Ukq3ROlZ87G9I(stringExtra)) {
                setContentView(R.layout.empty_activity);
                this.LkMPQqEJluZFFX0mL = (ViewGroup) findViewById(R.id.root_view);
                rbpFGdpgDCAQXat.ziNFA7KzVfc6(LqH09V6V7Wln.Aboow6rUrcY2SrFRa46C6uy(this), null, 0, new XSiZqjZ3VeBTuhOwd(this, stringExtra, (vOL3U3fINHMmdVoJz) null, 4), 3);
                return;
            }
        }
        Toast.makeText(this, R.string.error_unknown, 0).show();
        finish();
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z
    public final ViewGroup qaDSpeex0Oo1Qvt3oOrTJnbcQFp() {
        ViewGroup viewGroup = this.LkMPQqEJluZFFX0mL;
        if (viewGroup != null) {
            return viewGroup;
        }
        return null;
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z
    public final ZUboA6FxcG5CkT3ZuNeq sCPtafveBAhdLIs2ajN3WV() {
        return this.NceuzZQj3FhQAg0L;
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z
    public final boolean yM5HHkk1MhPLZFYTHm2JjrArud() {
        return this.lgJtMcdLJn14MkPMn;
    }
}
