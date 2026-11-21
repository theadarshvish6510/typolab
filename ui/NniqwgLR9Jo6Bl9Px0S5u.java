package bitpit.launcher.ui;

import android.os.Bundle;
import android.view.View;
import b.AViCs2jU5Z52N2srqTZt718q0Q;
import b.FBt4N9gMbTjpN;
import b.HDzaRKEI4SxljA;
import b.HEdScr6Xmf7adTjb2FzVu9DibPff;
import b.Ne7IrXfSjRisooSM;
import b.Qs5il4A81sbf73pL1Mwnj;
import b.SCo4Ctd3zv2DHfczdi;
import b.WLZoEbRHGAYGtOeo6ZMxoLT9;
import b.Zo1YEZ6nT2Qsm9uBmmbXR;
import b.aotlxyJjNXIlC;
import b.hsH8TKGnt9DcOY8B2UCdWzMbWmiX;
import b.qAu8xPQt71QSu59v2YrEcbg7z;
import b.rQ9HJYgnWGlaj05E54n4BwVJQ8oK;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class NniqwgLR9Jo6Bl9Px0S5u extends qAu8xPQt71QSu59v2YrEcbg7z {
    public static final hsH8TKGnt9DcOY8B2UCdWzMbWmiX Companion = new hsH8TKGnt9DcOY8B2UCdWzMbWmiX();
    public static final long iXk6STWDu48PQFwNyHwi2a;
    public boolean GtGIZrsiVJNzid1Vu8XK;
    public aotlxyJjNXIlC LkMPQqEJluZFFX0mL;
    public View N1ENDx3UBC9JxmcGQyn59aqjOM;
    public boolean NceuzZQj3FhQAg0L;
    public boolean lgJtMcdLJn14MkPMn;
    public int ra4eheLgdhUxuEZ9vbYShAWJ;

    static {
        HDzaRKEI4SxljA hDzaRKEI4SxljA = Zo1YEZ6nT2Qsm9uBmmbXR.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
        iXk6STWDu48PQFwNyHwi2a = WLZoEbRHGAYGtOeo6ZMxoLT9.JY5knQmh7EQJEZ(4, SCo4Ctd3zv2DHfczdi.SECONDS);
    }

    public final void czGAefXQxIZzo() {
        int i = this.ra4eheLgdhUxuEZ9vbYShAWJ;
        boolean z = i == 1;
        boolean z2 = i != 3;
        int i2 = (!z || this.NceuzZQj3FhQAg0L) ? 0 : 1;
        if (z2 && !this.lgJtMcdLJn14MkPMn) {
            i2 |= 2;
        }
        int i3 = (z || !this.NceuzZQj3FhQAg0L) ? 0 : 1;
        if (!z2 && this.lgJtMcdLJn14MkPMn) {
            i3 |= 2;
        }
        if (i2 != 0) {
            AViCs2jU5Z52N2srqTZt718q0Q aViCs2jU5Z52N2srqTZt718q0Q = this.TRrGdQy1m1oiOyDDQetUoo3r;
            if (aViCs2jU5Z52N2srqTZt718q0Q == null) {
                aViCs2jU5Z52N2srqTZt718q0Q = null;
            }
            ((HEdScr6Xmf7adTjb2FzVu9DibPff) aViCs2jU5Z52N2srqTZt718q0Q.Rdzg08aYlt0UsoLUNug9cESzgAY9R).axL8FocTDLUdzg0XScbO(i2);
        }
        if (i3 != 0) {
            AViCs2jU5Z52N2srqTZt718q0Q aViCs2jU5Z52N2srqTZt718q0Q2 = this.TRrGdQy1m1oiOyDDQetUoo3r;
            (aViCs2jU5Z52N2srqTZt718q0Q2 != null ? aViCs2jU5Z52N2srqTZt718q0Q2 : null).axL8FocTDLUdzg0XScbO(i3);
        }
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z, b.nJMkSIuTHA4ytmN, b.QKXpIUPLGn, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        rQ9HJYgnWGlaj05E54n4BwVJQ8oK.BezslBgjveK3hODH(getWindow());
        View decorView = getWindow().getDecorView();
        FBt4N9gMbTjpN fBt4N9gMbTjpN = new FBt4N9gMbTjpN(8, this);
        WeakHashMap weakHashMap = Ne7IrXfSjRisooSM.S1zP5M3X7Ukq3ROlZ87G9I;
        Qs5il4A81sbf73pL1Mwnj.ToEIy0qfkltfGfO3vmAQG(decorView, fBt4N9gMbTjpN);
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.ra4eheLgdhUxuEZ9vbYShAWJ != 1) {
            if (z) {
                czGAefXQxIZzo();
                return;
            }
            aotlxyJjNXIlC aotlxyjjnxilc = this.LkMPQqEJluZFFX0mL;
            if (aotlxyjjnxilc != null) {
                aotlxyjjnxilc.JY5knQmh7EQJEZ(null);
            }
        }
    }
}
