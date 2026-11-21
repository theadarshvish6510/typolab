package bitpit.launcher.notification.batching;

import android.os.Bundle;
import android.view.ViewGroup;
import b.Cwc3EXEJz6AM6uT;
import b.IuDX6utLTSd2Fq33gMoPBCVMA;
import b.IyJ5Qc4DxtDd1Zs;
import b.LqH09V6V7Wln;
import b.OUw39KtIsdT3yYWqqOrKN6;
import b.TIE9VIHmQrj3LsG;
import b.XSiZqjZ3VeBTuhOwd;
import b.ZUboA6FxcG5CkT3ZuNeq;
import b.mHW63SUma8isGb;
import b.mIRAh3PBGe8whGSCNLDU;
import b.pxIHJY45LsBs98maR1INey;
import b.qAu8xPQt71QSu59v2YrEcbg7z;
import b.qSDYaDqxbBy2QEeVAcFRy;
import b.rQ9HJYgnWGlaj05E54n4BwVJQ8oK;
import b.rbpFGdpgDCAQXat;
import b.vOL3U3fINHMmdVoJz;
import bitpit.launcher.R;
import bitpit.launcher.notification.NotificationListener;
import bitpit.launcher.theming.NniqwgLR9Jo6Bl9Px0S5u;

/* JADX INFO: loaded from: classes.dex */
public final class BatchedNotificationsActivity extends qAu8xPQt71QSu59v2YrEcbg7z {
    public static final /* synthetic */ int N1ENDx3UBC9JxmcGQyn59aqjOM = 0;
    public ViewGroup lgJtMcdLJn14MkPMn;
    public final ZUboA6FxcG5CkT3ZuNeq ra4eheLgdhUxuEZ9vbYShAWJ = ZUboA6FxcG5CkT3ZuNeq.qTa7aqjjB9Bt6mc;
    public final boolean NceuzZQj3FhQAg0L = true;
    public final mHW63SUma8isGb LkMPQqEJluZFFX0mL = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new mIRAh3PBGe8whGSCNLDU(3, this));

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z, b.nJMkSIuTHA4ytmN, b.QKXpIUPLGn, android.app.Activity
    public final void onCreate(Bundle bundle) {
        IyJ5Qc4DxtDd1Zs iyJ5Qc4DxtDd1Zs;
        super.onCreate(bundle);
        setTheme(((NniqwgLR9Jo6Bl9Px0S5u) J1BE9tYH1em4X1uAhc6L7f4M()).jvttfmFMQfShe6OfbNf1zF8CyEu.S1zP5M3X7Ukq3ROlZ87G9I.tzMOyOc53ffl ? R.style.TransparentTheme_Black : R.style.TransparentTheme);
        rQ9HJYgnWGlaj05E54n4BwVJQ8oK.BezslBgjveK3hODH(getWindow());
        setContentView(R.layout.empty_activity);
        this.lgJtMcdLJn14MkPMn = (ViewGroup) findViewById(R.id.root_view);
        NotificationListener.Companion.getClass();
        NotificationListener notificationListenerS1zP5M3X7Ukq3ROlZ87G9I = OUw39KtIsdT3yYWqqOrKN6.S1zP5M3X7Ukq3ROlZ87G9I();
        if (notificationListenerS1zP5M3X7Ukq3ROlZ87G9I == null || (iyJ5Qc4DxtDd1Zs = notificationListenerS1zP5M3X7Ukq3ROlZ87G9I.J1BE9tYH1em4X1uAhc6L7f4M) == null) {
            finish();
        } else {
            rbpFGdpgDCAQXat.ziNFA7KzVfc6(LqH09V6V7Wln.Aboow6rUrcY2SrFRa46C6uy(this), null, 0, new XSiZqjZ3VeBTuhOwd(new TIE9VIHmQrj3LsG(iyJ5Qc4DxtDd1Zs, new Cwc3EXEJz6AM6uT(10, this), ((IuDX6utLTSd2Fq33gMoPBCVMA) this.LkMPQqEJluZFFX0mL.getValue()).S1zP5M3X7Ukq3ROlZ87G9I), this, (vOL3U3fINHMmdVoJz) null, 11), 3);
        }
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z, b.LKywEzQDxQLVc8H82ZH, b.nJMkSIuTHA4ytmN, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        pxIHJY45LsBs98maR1INey.axL8FocTDLUdzg0XScbO(LcvPFGYKhAm4SS5FZ(), null, false, null, 5);
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
