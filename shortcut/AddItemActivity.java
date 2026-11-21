package bitpit.launcher.shortcut;

import android.content.pm.LauncherApps;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import android.widget.Toast;
import b.BMYwKRSfoxaGgrW8gGwf4;
import b.HC4Qfv5U9BXKFJWuann4jjcUV;
import b.KjpLK4IQzcoI;
import b.LqH09V6V7Wln;
import b.QmMroMl3LFwZs5i8JSROIB1Cf;
import b.Z2Gz2vXdO3NF5dJaig954QLp;
import b.ZUboA6FxcG5CkT3ZuNeq;
import b.bMjZFECsuU6MdmSOqmYrlYsV3oEeB;
import b.e270j0JNN2i3LYK6vWOSxn;
import b.gT4sTdpjS277wbG60pk72fHWG7;
import b.mHW63SUma8isGb;
import b.pxIHJY45LsBs98maR1INey;
import b.qAu8xPQt71QSu59v2YrEcbg7z;
import b.qSDYaDqxbBy2QEeVAcFRy;
import b.rQ9HJYgnWGlaj05E54n4BwVJQ8oK;
import b.rbpFGdpgDCAQXat;
import b.xpDUZivG52LsEcd;
import bitpit.launcher.R;
import bitpit.launcher.theming.NniqwgLR9Jo6Bl9Px0S5u;

/* JADX INFO: loaded from: classes.dex */
public final class AddItemActivity extends qAu8xPQt71QSu59v2YrEcbg7z implements e270j0JNN2i3LYK6vWOSxn {
    public static final /* synthetic */ int XdWfef3T7jQymi8jK = 0;
    public LauncherApps.PinItemRequest bVNWke9B4ojqaOyGLUguwc;
    public ViewGroup xrtRb0rUYgm4;
    public boolean xskpLJBhWb5xM802QFzgRuGk;
    public Bundle zCdRGk6THJnQtkzb;
    public final mHW63SUma8isGb ra4eheLgdhUxuEZ9vbYShAWJ = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new BMYwKRSfoxaGgrW8gGwf4(this, 0));
    public final mHW63SUma8isGb NceuzZQj3FhQAg0L = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new BMYwKRSfoxaGgrW8gGwf4(this, 1));
    public final mHW63SUma8isGb lgJtMcdLJn14MkPMn = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new BMYwKRSfoxaGgrW8gGwf4(this, 2));
    public final mHW63SUma8isGb LkMPQqEJluZFFX0mL = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new BMYwKRSfoxaGgrW8gGwf4(this, 3));
    public final mHW63SUma8isGb N1ENDx3UBC9JxmcGQyn59aqjOM = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new BMYwKRSfoxaGgrW8gGwf4(this, 4));
    public final mHW63SUma8isGb GtGIZrsiVJNzid1Vu8XK = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new BMYwKRSfoxaGgrW8gGwf4(this, 5));
    public final mHW63SUma8isGb iXk6STWDu48PQFwNyHwi2a = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new BMYwKRSfoxaGgrW8gGwf4(this, 6));
    public final mHW63SUma8isGb ymQF046nqhMXpxNsXtOg = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new BMYwKRSfoxaGgrW8gGwf4(this, 7));
    public final mHW63SUma8isGb xkTHQiCuIkifVig404IU19 = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new BMYwKRSfoxaGgrW8gGwf4(this, 8));
    public final ZUboA6FxcG5CkT3ZuNeq kDXsiSdVdmgsTVimtHda0 = ZUboA6FxcG5CkT3ZuNeq.Mej0x2K4ZGSUxtYNka4QZ;
    public final boolean KdeRfNMKV5NbGkNy3v0hdYzMi = true;

    public static RemoteViews yZj7bj6KyeuYi9woqDlC(LauncherApps.PinItemRequest pinItemRequest) {
        Bundle extras = pinItemRequest.getExtras();
        if (extras != null) {
            return (RemoteViews) (gT4sTdpjS277wbG60pk72fHWG7.JY5knQmh7EQJEZ ? (Parcelable) extras.getParcelable("appWidgetPreview", RemoteViews.class) : extras.getParcelable("appWidgetPreview"));
        }
        return null;
    }

    @Override // b.e270j0JNN2i3LYK6vWOSxn
    public final boolean Aboow6rUrcY2SrFRa46C6uy() {
        LauncherApps.PinItemRequest pinItemRequest = this.bVNWke9B4ojqaOyGLUguwc;
        if (pinItemRequest == null) {
            pinItemRequest = null;
        }
        if (pinItemRequest.isValid()) {
            return true;
        }
        ((QmMroMl3LFwZs5i8JSROIB1Cf) ((HC4Qfv5U9BXKFJWuann4jjcUV) this.xkTHQiCuIkifVig404IU19.getValue())).BezslBgjveK3hODH(null, new IllegalStateException("Pin request invalid"));
        finish();
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ba A[Catch: WidgetCreationException -> 0x002f, UserCanceledWidgetCreationException -> 0x00f6, TryCatch #3 {UserCanceledWidgetCreationException -> 0x00f6, WidgetCreationException -> 0x002f, blocks: (B:13:0x0029, B:42:0x00b0, B:44:0x00ba, B:45:0x00bf, B:49:0x00c5, B:39:0x008e), top: B:62:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e6, code lost:
    
        if (b.rbpFGdpgDCAQXat.JY5knQmh7EQJEZ(r11, r12, r7) == r0) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [b.vOL3U3fINHMmdVoJz] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object czGAefXQxIZzo(b.bMjZFECsuU6MdmSOqmYrlYsV3oEeB r12) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bitpit.launcher.shortcut.AddItemActivity.czGAefXQxIZzo(b.bMjZFECsuU6MdmSOqmYrlYsV3oEeB):java.lang.Object");
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z, b.nJMkSIuTHA4ytmN, b.QKXpIUPLGn, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTheme(((NniqwgLR9Jo6Bl9Px0S5u) J1BE9tYH1em4X1uAhc6L7f4M()).jvttfmFMQfShe6OfbNf1zF8CyEu.S1zP5M3X7Ukq3ROlZ87G9I.tzMOyOc53ffl ? R.style.TransparentTheme_Black : R.style.TransparentTheme);
        rQ9HJYgnWGlaj05E54n4BwVJQ8oK.BezslBgjveK3hODH(getWindow());
        LauncherApps.PinItemRequest pinItemRequestZiNFA7KzVfc6 = xpDUZivG52LsEcd.ziNFA7KzVfc6(getIntent());
        if (pinItemRequestZiNFA7KzVfc6 == null || !KjpLK4IQzcoI.H5sQ15nhYoaKKHhx(1, 2).contains(Integer.valueOf(pinItemRequestZiNFA7KzVfc6.getRequestType()))) {
            Toast.makeText(this, R.string.error_unknown, 0).show();
            finish();
        } else {
            this.bVNWke9B4ojqaOyGLUguwc = pinItemRequestZiNFA7KzVfc6;
            setContentView(R.layout.empty_activity);
            this.xrtRb0rUYgm4 = (ViewGroup) findViewById(R.id.root_view);
            rbpFGdpgDCAQXat.ziNFA7KzVfc6(LqH09V6V7Wln.Aboow6rUrcY2SrFRa46C6uy(this), null, 0, new Z2Gz2vXdO3NF5dJaig954QLp(this, null), 3);
        }
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z, b.LKywEzQDxQLVc8H82ZH, b.nJMkSIuTHA4ytmN, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        pxIHJY45LsBs98maR1INey.axL8FocTDLUdzg0XScbO(LcvPFGYKhAm4SS5FZ(), null, false, null, 5);
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z, b.nJMkSIuTHA4ytmN, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.xskpLJBhWb5xM802QFzgRuGk) {
            finish();
        }
    }

    @Override // b.e270j0JNN2i3LYK6vWOSxn
    public final Object ox9eclwMpRd(bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) {
        return Boolean.FALSE;
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z
    public final ViewGroup qaDSpeex0Oo1Qvt3oOrTJnbcQFp() {
        ViewGroup viewGroup = this.xrtRb0rUYgm4;
        if (viewGroup != null) {
            return viewGroup;
        }
        return null;
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z
    public final ZUboA6FxcG5CkT3ZuNeq sCPtafveBAhdLIs2ajN3WV() {
        return this.kDXsiSdVdmgsTVimtHda0;
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z
    public final boolean yM5HHkk1MhPLZFYTHm2JjrArud() {
        return this.KdeRfNMKV5NbGkNy3v0hdYzMi;
    }
}
