package bitpit.launcher.ui;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Picture;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.Toast;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.A2mwGN92Kx;
import b.A6rA3FtBwC3bh5Re8ZRhWWJm;
import b.ADNIds0B2hvW712J3ebQfEXyQEZN;
import b.ASDwBkZhws;
import b.AhCZ3UMvtA;
import b.AjDJ06vrIA;
import b.BDJNYJBZKwLWlHia9hHMNdUvfP;
import b.BOj7Lk43NwFnPA7WQbM8o9fGX8;
import b.Bs6d0jOxI4D8gb1dAk;
import b.BvisryDRLQkgph00iQZ96whV;
import b.CJI9fJNh1Q2PBYQKjHaT4Ef4H;
import b.Cwc3EXEJz6AM6uT;
import b.CzxwlwBW4rlflb8gQRn;
import b.D0w4Fo3mGNjq7Qm8Kx;
import b.DB27iwgGPAe90MHd1m4;
import b.DEDkaDjg5PtPFwI1TzQritqKXN;
import b.DPjpTc5ZXh3u47bQjHCXMpRinV1s6;
import b.EmCrywYCUQTWPrPSAsgr;
import b.FL0CFFY0euvWvPjBw1P8USTTCd;
import b.FZnP9ijPzvOTXKvJgDC8k;
import b.FdefTICOs2UQ1fmh66Mky;
import b.FriQNvVsGpalCkl8iH;
import b.GZnU2p3i2qStYb;
import b.GaJEBx6eHS;
import b.GkEpHTllUQBkRob2X6;
import b.HF5afwOkFj9V8;
import b.HqHnjiCgPIDSJWjlkNjT0Z;
import b.Hw5TvtvxiEmdhtv2OKQrtXD;
import b.IuS0NVwJfBQ31sXIwXeJAo;
import b.IzCwLYLfrw4262Ji;
import b.JFbpof217h5syYjR;
import b.JHnppaRJDZMMWaOU5cgIw;
import b.JQDynrBXEyy1CqVm0rx57XCJsv2;
import b.K7k5h9eP8ZEPomZ3e;
import b.KGjoKHCGXMiM8O2q02X1Sb;
import b.L3Qlx1recqV5MubZz9QQ;
import b.LHNVaXbD6NtS3VtejUx;
import b.LqH09V6V7Wln;
import b.M9r85CYeTEytIsFRkQ72cgvGqDX;
import b.MJ4Qybv4FFP3bDz2UfzI43;
import b.MSO379Twj6q8RNPLwDx7Z;
import b.MVuyBRZ3P6eXlJ2OpESZb;
import b.Mr6zZVzX95znJox3gt9TK3PpOM;
import b.MtjpA6kdLgBnavFoDyA;
import b.NDHwVlwiTDCpc1s6p4j6;
import b.NMquq9o0FvRs5RyiTFrS;
import b.NOUX4kPYJkVqDQbilhFaow5G;
import b.NOZwTUrlUFlw;
import b.Ne7IrXfSjRisooSM;
import b.Nhi4hYmu4dFL3UI;
import b.O9Vq0pSiHJp;
import b.OAbMlpbVJU98L0lW2oHBNkO;
import b.OkhdZkC3NYLW;
import b.OzBGjmH3aEcSV8F1Hb0ZRMAx;
import b.PWokSaFpDS1dYO6NsJRP4I5m;
import b.PeLieoBN4yxYJZju3kQtKIsq7XL8;
import b.PpCiePLyew1Vrs3QgUHp663qLyt;
import b.QBYaql937t;
import b.QMQVwNPs3M8khSL8toijR8;
import b.Qa2oxHq90ujONOFj;
import b.QnIBewe1H5rxJPvVcOBSKmAwQIFl;
import b.Qs5il4A81sbf73pL1Mwnj;
import b.RD6cH12hvcraaybiM3;
import b.RS7Y0q5nV2sR79;
import b.S3Q1dtDfB7lO3W;
import b.S8qBhdLGd6CCJE34vX;
import b.Sx54ClmjiYlAvD6K2qw;
import b.TQxN1rEKLbE2ktDwmLbD293;
import b.TYcC5PUX0l9;
import b.UWAFgp496goLUihKAhfYmEHS;
import b.UXpkZe9MWL;
import b.UfBdTerHo7YiIb8;
import b.UgxoLusfimrPDl;
import b.UsJ6UuHRXRD1PdykxDIAtuk9m;
import b.V7MlVXoENpC;
import b.VEc6vB7hr2KpNlVCr11iSWUTe;
import b.VUTfKZyxja2kfM;
import b.WN74m0GEbQuEaa1c44;
import b.Wb2R3jKy46y0gol5x9fcJ69zK;
import b.WlMPmh05PXOtn;
import b.XQCixPMPkXDW6;
import b.Xufrqv4AGkFBA5pytuPp8JD;
import b.Y3TACImLpmsoxxe3uL3VJerMbyPo;
import b.YTs4nWeytJKgOLnERNkwrb;
import b.YwBT4ESCmAqS8d6lra4iy0u6E;
import b.ZGSDqjV1IQztRN1wWJd;
import b.ZUboA6FxcG5CkT3ZuNeq;
import b.ZusJI1VBMR;
import b.aBhc5Hosh3idQU7mazY;
import b.aJLiMmqfPh61r;
import b.aotlxyJjNXIlC;
import b.b6SghWTw4DZwFdwjzwqQSUYD;
import b.bmlKmN4g1kjOaCDcWBgOGpsq9wrS;
import b.cdjHGKliASEP50WE;
import b.cvu91h5WjQasu7vH8q4wQg9;
import b.dGvRr0aa2CegMWZH8rJH9l1;
import b.db7W22f2OwBZO1GzsWe8IM80qE;
import b.dg8bvHALOV6s53amgJ4;
import b.dxa6Q9x6jlKcJETDF;
import b.eQAnD1bU8DKJtvaXt;
import b.eY0AEVFwD2fuPwFF4IzZ2WAQ78;
import b.fNTMsWHktr2g00RrABSrY9jtX;
import b.fbgNavbqkSud;
import b.fyQnE5ZULPWZpTA;
import b.fzRzaUIpr20A;
import b.fziyXE1Q48ooPc99jMpISyi;
import b.gSPU8clJEfIPb0EQSKTd;
import b.gT4sTdpjS277wbG60pk72fHWG7;
import b.gWrwpDOz79pszaF;
import b.iHPHZIrmzz0Nhav1OcnsAYxx7Sm1;
import b.iLN8xCbOb5pFPzxOVRUSvcX2eCl;
import b.ilpysSw8y0jc4WIZ7W91VEcdHpp;
import b.jlsZKUdoG1o;
import b.jtmhquXyO9e;
import b.jy0D46ypSGfI27ARTWE;
import b.k8mpg40PgvXGbNW1aFOIFMNP;
import b.kKH5g1roXYyxc;
import b.kVpfGiXrYc3TukfKzy;
import b.kk7MNO9kXMrp2t;
import b.l5DAHmppgTm;
import b.lT14RDm4I5i5K8RS;
import b.lcSH5kzWGFN;
import b.lgqWour8ObB4j3Tj78V4L86PxKqIu;
import b.ljWrNhoeIXbJk;
import b.m6VeYiMqnaBahF88nkY76Vf;
import b.mHW63SUma8isGb;
import b.mojfch1cPgBWXXqcK;
import b.msN9fKEefAIkohzW;
import b.my55PDgWo5bYh9KBNXT;
import b.nWNp5lXd2UnmVHYiA23jIso8x9;
import b.pE6zh38jZw;
import b.pfRaBqECe5pV80vi;
import b.pxIHJY45LsBs98maR1INey;
import b.q7I8OyL9MwyU3IboIQV;
import b.qSDYaDqxbBy2QEeVAcFRy;
import b.qakwcvVaTwptUfUa5;
import b.qfeSq25MEaoh0juNRr;
import b.qfrlczGhegaHxa8kLz;
import b.r79MMhDRaCjmDEnEC9XSmV;
import b.rGyAcDmmLfQTLDbPj;
import b.rPqnGWlYqswCjhboAg7RDKNTU;
import b.rSQrYeRLvhT3W;
import b.rbpFGdpgDCAQXat;
import b.rkWSsEQgSAuoZe;
import b.rkqwFvjLjoZCrFLnsdi;
import b.ti3ATSynU1Wqgf;
import b.tnkHtSXZvBRSrQbhig;
import b.uoRPgKqjU6oCDU1BQIz;
import b.vE8fKiDsTteVxGTFj1KG5DyRHnRpG;
import b.vOL3U3fINHMmdVoJz;
import b.vkzrczFCWntH7ocuz8;
import b.wCtX9liBBqC8WStuSfU;
import b.wW4vjJYXED6OMqHRW;
import b.wkbOhyT0kOyLnK38jY432HJNRn;
import b.wnHGlh5hmdMATt;
import b.x4PcPRPmslEJW;
import b.x6OSbENKskcjaFYKlXf7;
import b.xKHQcxWowK0Qg;
import b.xLjKrJnLbF0Z7lIneP4pwNBwjTZ;
import b.xmd77ORoMNAomGMloBLegtT;
import b.ycFnS0z9Ddi2h4oSFO3lrkbjZ0cm8;
import b.ymEjTDJkfQpa5Y5K;
import b.z1jpZX9STmdA7rDJqTHkX09JG8;
import b.zaEQv9uah4s3bhwua8H;
import bitpit.launcher.R;
import bitpit.launcher.alphabet_wave.AlphabetWaveHandle;
import bitpit.launcher.alphabet_wave.AlphabetWaveView;
import bitpit.launcher.screen.CustomExtendedFab;
import bitpit.launcher.theming.BackgroundTintView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class HomeActivity extends NniqwgLR9Jo6Bl9Px0S5u implements ViewTreeObserver.OnGlobalLayoutListener, View.OnLayoutChangeListener, ilpysSw8y0jc4WIZ7W91VEcdHpp, uoRPgKqjU6oCDU1BQIz, SharedPreferences.OnSharedPreferenceChangeListener {
    public static final x6OSbENKskcjaFYKlXf7 Companion = new x6OSbENKskcjaFYKlXf7();
    public gWrwpDOz79pszaF F4k5NH3S8ussgsUI7ENrwWm3io;
    public wW4vjJYXED6OMqHRW ItAWeK8V06gR8MpzH;
    public CustomExtendedFab KXOE6Ztvu4LZmAnzfIo8;
    public ymEjTDJkfQpa5Y5K KdeRfNMKV5NbGkNy3v0hdYzMi;
    public CloseAppAnimationView LH4Kn997Cqv4prFe7Bqz4ByRaPw;
    public View LK4JMwppqYcAM4AShAbqsUc;
    public boolean NBdfCWeVOPpwOaZSGqvy;
    public final mHW63SUma8isGb O83A1TLi0vQZEL;
    public Guideline QwmsQctY9ld;
    public l5DAHmppgTm StxE0E5OcDxBRSm3TMzS;
    public NOZwTUrlUFlw Ugv06uQcsfU;
    public View VjB85JLsBZ;
    public msN9fKEefAIkohzW W990VlXItKZEUxjpiAhHWCW0;
    public ViewGroup WwLbT8A1DREUOMGqEk;
    public AlphabetWaveView X2LqfJkLDth1lHwRgNL5jfPDt00O2;
    public KGjoKHCGXMiM8O2q02X1Sb XRnBzHfiQNSY0R7MyxLAJXUJFfM;
    public lcSH5kzWGFN XdWfef3T7jQymi8jK;
    public Guideline XsOEcVh9yrEYbnc;
    public kKH5g1roXYyxc aOibpGlf3ldGa;
    public QBYaql937t bVNWke9B4ojqaOyGLUguwc;
    public EmCrywYCUQTWPrPSAsgr d3wjn0WBdr9Ap;
    public fbgNavbqkSud e1MXM38S89FAQkWn07KwuU;
    public z1jpZX9STmdA7rDJqTHkX09JG8 kDXsiSdVdmgsTVimtHda0;
    public BackgroundTintView kS1lZ76stxAmrE008w8qwZTo;
    public MJ4Qybv4FFP3bDz2UfzI43 kZrD9fJjn1Y7AUQvv0fun;
    public DB27iwgGPAe90MHd1m4 lZBbKIgtyUK3jX2HZ1rGt987Fo;
    public Guideline nYT0DKgXJwaKUiSwy0PVds;
    public rkWSsEQgSAuoZe szH17XxPzE7qDHHJ6;
    public iHPHZIrmzz0Nhav1OcnsAYxx7Sm1 vMtmuFr96pbRMPoPKPCkRzUEF8ug;
    public ViewGroup vtXr3xr3vQMVMTW;
    public lT14RDm4I5i5K8RS xkTHQiCuIkifVig404IU19;
    public qfeSq25MEaoh0juNRr xrtRb0rUYgm4;
    public S3Q1dtDfB7lO3W xskpLJBhWb5xM802QFzgRuGk;
    public boolean xu9cB1KZ6CllX;
    public AlphabetWaveHandle yEadMPRZv7QTCpzFKIx1Xmh2;
    public pfRaBqECe5pV80vi ymQF046nqhMXpxNsXtOg;
    public qakwcvVaTwptUfUa5 zCdRGk6THJnQtkzb;
    public FloatingActionButton zERj7wgTMSj5XP5;

    public HomeActivity() {
        this.ra4eheLgdhUxuEZ9vbYShAWJ = 1;
        this.NceuzZQj3FhQAg0L = true;
        this.lgJtMcdLJn14MkPMn = true;
        this.O83A1TLi0vQZEL = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(3, new Cwc3EXEJz6AM6uT(23, this));
    }

    @Override // b.uoRPgKqjU6oCDU1BQIz
    public final void BezslBgjveK3hODH(ycFnS0z9Ddi2h4oSFO3lrkbjZ0cm8 ycfns0z9ddi2h4osfo3lrkbjz0cm8) {
        bfvGkgRqVBmXp4z3D5cuKKKZz();
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z
    public final boolean FzogU2bPCQtD6a1hMYB1kyti() {
        return false;
    }

    @Override // b.ilpysSw8y0jc4WIZ7W91VEcdHpp
    public final UsJ6UuHRXRD1PdykxDIAtuk9m H5sQ15nhYoaKKHhx(View view, UsJ6UuHRXRD1PdykxDIAtuk9m usJ6UuHRXRD1PdykxDIAtuk9m) {
        int size;
        if (!isDestroyed()) {
            pfRaBqECe5pV80vi pfrabqece5pv80vi = this.ymQF046nqhMXpxNsXtOg;
            if (pfrabqece5pv80vi == null) {
                pfrabqece5pv80vi = null;
            }
            UsJ6UuHRXRD1PdykxDIAtuk9m usJ6UuHRXRD1PdykxDIAtuk9m2 = pfrabqece5pv80vi.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
            pfrabqece5pv80vi.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = usJ6UuHRXRD1PdykxDIAtuk9m;
            OzBGjmH3aEcSV8F1Hb0ZRMAx ozBGjmH3aEcSV8F1Hb0ZRMAx = usJ6UuHRXRD1PdykxDIAtuk9m.S1zP5M3X7Ukq3ROlZ87G9I;
            pfrabqece5pv80vi.sCPtafveBAhdLIs2ajN3WV = ozBGjmH3aEcSV8F1Hb0ZRMAx.JY5knQmh7EQJEZ(647);
            int i = ozBGjmH3aEcSV8F1Hb0ZRMAx.PQQPeCDD0JLCT3aLz(8).ziNFA7KzVfc6;
            if (pfrabqece5pv80vi.qTa7aqjjB9Bt6mc != i) {
                pfrabqece5pv80vi.qTa7aqjjB9Bt6mc = i;
                ArrayList arrayList = pfrabqece5pv80vi.gsHzEVTj1SCIPR.GO8WUug7ZWFCUI1zY;
                if (!arrayList.isEmpty() && (size = arrayList.size() - 1) >= 0) {
                    while (true) {
                        int i2 = size - 1;
                        if (i2 < 0) {
                            break;
                        }
                        size = i2;
                    }
                }
            }
            pfrabqece5pv80vi.Mej0x2K4ZGSUxtYNka4QZ = gT4sTdpjS277wbG60pk72fHWG7.ziNFA7KzVfc6 ? ozBGjmH3aEcSV8F1Hb0ZRMAx.PQQPeCDD0JLCT3aLz(16) : UgxoLusfimrPDl.Aboow6rUrcY2SrFRa46C6uy;
            if (!OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(usJ6UuHRXRD1PdykxDIAtuk9m2, usJ6UuHRXRD1PdykxDIAtuk9m) && this.NBdfCWeVOPpwOaZSGqvy) {
                nXIf4d0RGTWG1l(false);
            }
        }
        return usJ6UuHRXRD1PdykxDIAtuk9m;
    }

    public final ViewGroup IPi49brQACDpXJTJMp7() {
        ViewGroup viewGroup = this.vtXr3xr3vQMVMTW;
        if (viewGroup != null) {
            return viewGroup;
        }
        return null;
    }

    public final void IQ6Ug1woLp4DNbPVXhFhC3Fz() {
        View viewPeekDecorView = getWindow().peekDecorView();
        IBinder windowToken = viewPeekDecorView != null ? viewPeekDecorView.getWindowToken() : null;
        if (windowToken == null) {
            return;
        }
        bitpit.launcher.theming.NniqwgLR9Jo6Bl9Px0S5u nniqwgLR9Jo6Bl9Px0S5u = (bitpit.launcher.theming.NniqwgLR9Jo6Bl9Px0S5u) J1BE9tYH1em4X1uAhc6L7f4M();
        XQCixPMPkXDW6 xQCixPMPkXDW6 = nniqwgLR9Jo6Bl9Px0S5u.IPi49brQACDpXJTJMp7;
        GZnU2p3i2qStYb gZnU2p3i2qStYb = bitpit.launcher.theming.NniqwgLR9Jo6Bl9Px0S5u.hsgUkarQLKL1aF8JVboCqnbaz1[4];
        try {
            nniqwgLR9Jo6Bl9Px0S5u.sCPtafveBAhdLIs2ajN3WV.setWallpaperOffsets(windowToken, ((Boolean) xQCixPMPkXDW6.S1zP5M3X7Ukq3ROlZ87G9I()).booleanValue() ? 0.5f : 0.0f, 0.5f);
        } catch (Exception unused) {
        }
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z
    public final KGjoKHCGXMiM8O2q02X1Sb Mej0x2K4ZGSUxtYNka4QZ() {
        KGjoKHCGXMiM8O2q02X1Sb kGjoKHCGXMiM8O2q02X1Sb = this.XRnBzHfiQNSY0R7MyxLAJXUJFfM;
        if (kGjoKHCGXMiM8O2q02X1Sb == null) {
            return null;
        }
        return kGjoKHCGXMiM8O2q02X1Sb;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    public final void bfvGkgRqVBmXp4z3D5cuKKKZz() {
        int i;
        aotlxyJjNXIlC aotlxyjjnxilc;
        l5DAHmppgTm l5dahmppgtm = this.StxE0E5OcDxBRSm3TMzS;
        if (l5dahmppgtm == null) {
            l5dahmppgtm = null;
        }
        if (((Boolean) l5dahmppgtm.ziNFA7KzVfc6.GO8WUug7ZWFCUI1zY.getValue()).booleanValue()) {
            i = 3;
        } else if (iR1XUIc7FjhMl57O().getBoolean("bitpit.launcher.key.HIDE_STATUS_BAR", false)) {
            z1jpZX9STmdA7rDJqTHkX09JG8 z1jpzx9stmda7rdjqthkx09jg8 = this.kDXsiSdVdmgsTVimtHda0;
            if (z1jpzx9stmda7rdjqthkx09jg8 == null) {
                z1jpzx9stmda7rdjqthkx09jg8 = null;
            }
            if (((zaEQv9uah4s3bhwua8H) z1jpzx9stmda7rdjqthkx09jg8).ox9eclwMpRd().S1zP5M3X7Ukq3ROlZ87G9I) {
                i = 2;
            } else {
                i = 1;
            }
        } else {
            i = 1;
        }
        if (this.ra4eheLgdhUxuEZ9vbYShAWJ != i) {
            this.ra4eheLgdhUxuEZ9vbYShAWJ = i;
            if (i == 1 && (aotlxyjjnxilc = this.LkMPQqEJluZFFX0mL) != null) {
                aotlxyjjnxilc.JY5knQmh7EQJEZ(null);
            }
            czGAefXQxIZzo();
        }
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z
    public final boolean cVfIGUKLEqID1HH() {
        S3Q1dtDfB7lO3W s3Q1dtDfB7lO3W = this.xskpLJBhWb5xM802QFzgRuGk;
        if (s3Q1dtDfB7lO3W == null) {
            s3Q1dtDfB7lO3W = null;
        }
        s3Q1dtDfB7lO3W.axL8FocTDLUdzg0XScbO(false);
        return true;
    }

    @Override // b.LKywEzQDxQLVc8H82ZH, b.QKXpIUPLGn, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KGjoKHCGXMiM8O2q02X1Sb kGjoKHCGXMiM8O2q02X1Sb = this.XRnBzHfiQNSY0R7MyxLAJXUJFfM;
        if (kGjoKHCGXMiM8O2q02X1Sb == null) {
            kGjoKHCGXMiM8O2q02X1Sb = null;
        }
        LinkedHashSet linkedHashSet = kGjoKHCGXMiM8O2q02X1Sb.gsHzEVTj1SCIPR;
        eQAnD1bU8DKJtvaXt eqand1bu8dkjtvaxt = kGjoKHCGXMiM8O2q02X1Sb.WIXlfFpvH7glAGsUk3;
        kGjoKHCGXMiM8O2q02X1Sb.BezslBgjveK3hODH(keyEvent);
        View currentFocus = kGjoKHCGXMiM8O2q02X1Sb.GO8WUug7ZWFCUI1zY.getCurrentFocus();
        if (!(currentFocus instanceof EditText) || currentFocus == eqand1bu8dkjtvaxt) {
            int action = keyEvent.getAction();
            if (action != 0) {
                if (action == 1) {
                    if (!linkedHashSet.remove(Integer.valueOf(keyEvent.getKeyCode()))) {
                        KeyEvent keyEventChangeAction = KeyEvent.changeAction(keyEvent, 0);
                        if (!kGjoKHCGXMiM8O2q02X1Sb.S1zP5M3X7Ukq3ROlZ87G9I().S1zP5M3X7Ukq3ROlZ87G9I(keyEvent.getKeyCode(), keyEventChangeAction)) {
                            if (keyEvent.isPrintingKey()) {
                                if (kGjoKHCGXMiM8O2q02X1Sb.S1zP5M3X7Ukq3ROlZ87G9I().JY5knQmh7EQJEZ()) {
                                    eqand1bu8dkjtvaxt.requestFocus();
                                    eqand1bu8dkjtvaxt.dispatchKeyEvent(keyEventChangeAction);
                                }
                            }
                        }
                    }
                    return true;
                }
            } else {
                if (kGjoKHCGXMiM8O2q02X1Sb.S1zP5M3X7Ukq3ROlZ87G9I().S1zP5M3X7Ukq3ROlZ87G9I(keyEvent.getKeyCode(), keyEvent)) {
                    linkedHashSet.add(Integer.valueOf(keyEvent.getKeyCode()));
                    return true;
                }
                if (keyEvent.isPrintingKey()) {
                    if (!kGjoKHCGXMiM8O2q02X1Sb.S1zP5M3X7Ukq3ROlZ87G9I().JY5knQmh7EQJEZ()) {
                        linkedHashSet.add(Integer.valueOf(keyEvent.getKeyCode()));
                        return true;
                    }
                    eqand1bu8dkjtvaxt.requestFocus();
                }
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z
    public final FZnP9ijPzvOTXKvJgDC8k gsHzEVTj1SCIPR() {
        PpCiePLyew1Vrs3QgUHp663qLyt ppCiePLyew1Vrs3QgUHp663qLyt = f2sXlW3st0rAKJwyOrCfOWc().J1BE9tYH1em4X1uAhc6L7f4M;
        if (ppCiePLyew1Vrs3QgUHp663qLyt != null) {
            return ppCiePLyew1Vrs3QgUHp663qLyt.qaDSpeex0Oo1Qvt3oOrTJnbcQFp();
        }
        return null;
    }

    public final void hsgUkarQLKL1aF8JVboCqnbaz1() {
        setRequestedOrientation((iR1XUIc7FjhMl57O().getBoolean("bitpit.launcher.key.ALWAYS_ALLOW_LANDSCAPE_MODE", false) || getResources().getBoolean(R.bool.is_tablet)) ? -1 : 5);
    }

    public final void jvttfmFMQfShe6OfbNf1zF8CyEu(Intent intent, boolean z) {
        UgxoLusfimrPDl ugxoLusfimrPDlPQQPeCDD0JLCT3aLz;
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -1173447682) {
                if (iHashCode != -1173171990) {
                    if (iHashCode == 113752629 && action.equals("android.intent.action.ALL_APPS")) {
                        S8qBhdLGd6CCJE34vX s8qBhdLGd6CCJE34vXF2sXlW3st0rAKJwyOrCfOWc = f2sXlW3st0rAKJwyOrCfOWc();
                        fzRzaUIpr20A fzrzauipr20a = s8qBhdLGd6CCJE34vXF2sXlW3st0rAKJwyOrCfOWc.yM5HHkk1MhPLZFYTHm2JjrArud;
                        s8qBhdLGd6CCJE34vXF2sXlW3st0rAKJwyOrCfOWc.LYcdI4xpry8eXmFC9I4wyaLdcG1z(fzrzauipr20a != null ? fzrzauipr20a : null);
                        return;
                    }
                    return;
                }
                if (action.equals("android.intent.action.VIEW")) {
                    fyQnE5ZULPWZpTA.Companion.getClass();
                    ComponentName component = intent.getComponent();
                    Intent intent2 = !OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(component != null ? component.getClassName() : null, "bitpit.launcher.OpenNiagaraFile") ? null : intent;
                    if (intent2 == null) {
                        Uri data = intent.getData();
                        if (data != null) {
                            QBYaql937t qBYaql937t = this.bVNWke9B4ojqaOyGLUguwc;
                            (qBYaql937t != null ? qBYaql937t : null).BezslBgjveK3hODH(data);
                            return;
                        }
                        return;
                    }
                    DB27iwgGPAe90MHd1m4 dB27iwgGPAe90MHd1m4 = this.lZBbKIgtyUK3jX2HZ1rGt987Fo;
                    if (dB27iwgGPAe90MHd1m4 == null) {
                        dB27iwgGPAe90MHd1m4 = null;
                    }
                    dB27iwgGPAe90MHd1m4.getClass();
                    Uri data2 = intent2.getData();
                    if (data2 == null) {
                        return;
                    }
                    bmlKmN4g1kjOaCDcWBgOGpsq9wrS bmlkmn4g1kjoacdcwbgogpsq9wrsFXBtMGfTIjGSHgK542 = Sx54ClmjiYlAvD6K2qw.fXBtMGfTIjGSHgK542(this, data2);
                    String str = bmlkmn4g1kjoacdcwbgogpsq9wrsFXBtMGfTIjGSHgK542 != null ? (String) bmlkmn4g1kjoacdcwbgogpsq9wrsFXBtMGfTIjGSHgK542.cCmbv8Tzd2QLd161ImIZUlZ8n : null;
                    String strIPi49brQACDpXJTJMp7 = str != null ? jtmhquXyO9e.IPi49brQACDpXJTJMp7('.', str, str) : null;
                    if (TYcC5PUX0l9.LYcdI4xpry8eXmFC9I4wyaLdcG1z(strIPi49brQACDpXJTJMp7, "nlb", true)) {
                        wkbOhyT0kOyLnK38jY432HJNRn wkbohyt0koylnk38jy432hjnrn = (wkbOhyT0kOyLnK38jY432HJNRn) dB27iwgGPAe90MHd1m4.axL8FocTDLUdzg0XScbO;
                        rbpFGdpgDCAQXat.ziNFA7KzVfc6(wkbohyt0koylnk38jy432hjnrn.S1zP5M3X7Ukq3ROlZ87G9I, null, 0, new fNTMsWHktr2g00RrABSrY9jtX(wkbohyt0koylnk38jy432hjnrn, data2, null, 17), 3);
                        return;
                    } else if (TYcC5PUX0l9.LYcdI4xpry8eXmFC9I4wyaLdcG1z(strIPi49brQACDpXJTJMp7, "nlt", true)) {
                        rbpFGdpgDCAQXat.ziNFA7KzVfc6(dB27iwgGPAe90MHd1m4.ziNFA7KzVfc6, null, 0, new V7MlVXoENpC(dB27iwgGPAe90MHd1m4, this, data2, (vOL3U3fINHMmdVoJz) null, 16), 3);
                        return;
                    } else {
                        ((dGvRr0aa2CegMWZH8rJH9l1) dB27iwgGPAe90MHd1m4.S1zP5M3X7Ukq3ROlZ87G9I).PQQPeCDD0JLCT3aLz(null, new vkzrczFCWntH7ocuz8(29, this));
                        return;
                    }
                }
                return;
            }
            if (action.equals("android.intent.action.MAIN") && !intent.getBooleanExtra("bitpit.launcher.launchedItself", false)) {
                if (!z && gT4sTdpjS277wbG60pk72fHWG7.Aboow6rUrcY2SrFRa46C6uy) {
                    MJ4Qybv4FFP3bDz2UfzI43 mJ4Qybv4FFP3bDz2UfzI43 = this.kZrD9fJjn1Y7AUQvv0fun;
                    if (mJ4Qybv4FFP3bDz2UfzI43 == null) {
                        mJ4Qybv4FFP3bDz2UfzI43 = null;
                    }
                    if (mJ4Qybv4FFP3bDz2UfzI43.qaDSpeex0Oo1Qvt3oOrTJnbcQFp) {
                        VUTfKZyxja2kfM.Companion.getClass();
                        VUTfKZyxja2kfM vUTfKZyxja2kfMS1zP5M3X7Ukq3ROlZ87G9I = Y3TACImLpmsoxxe3uL3VJerMbyPo.S1zP5M3X7Ukq3ROlZ87G9I(intent);
                        if (vUTfKZyxja2kfMS1zP5M3X7Ukq3ROlZ87G9I != null) {
                            yZj7bj6KyeuYi9woqDlC();
                            CloseAppAnimationView.Companion.getClass();
                            CloseAppAnimationView closeAppAnimationView = this.LH4Kn997Cqv4prFe7Bqz4ByRaPw;
                            if (closeAppAnimationView != null) {
                                this.LH4Kn997Cqv4prFe7Bqz4ByRaPw = null;
                            } else {
                                ViewGroup viewGroup = this.vtXr3xr3vQMVMTW;
                                if (viewGroup == null) {
                                    viewGroup = null;
                                }
                                closeAppAnimationView = (CloseAppAnimationView) OAbMlpbVJU98L0lW2oHBNkO.ox9eclwMpRd(R.layout.close_app_animation_view, viewGroup);
                            }
                            closeAppAnimationView.GO8WUug7ZWFCUI1zY = this;
                            closeAppAnimationView.LcvPFGYKhAm4SS5FZ = vUTfKZyxja2kfMS1zP5M3X7Ukq3ROlZ87G9I;
                            Picture picture = closeAppAnimationView.qTa7aqjjB9Bt6mc;
                            picture.beginRecording(1, 1);
                            picture.endRecording();
                            HomeActivity homeActivity = closeAppAnimationView.GO8WUug7ZWFCUI1zY;
                            if (homeActivity == null) {
                                homeActivity = null;
                            }
                            ViewGroup viewGroup2 = homeActivity.vtXr3xr3vQMVMTW;
                            if (viewGroup2 == null) {
                                viewGroup2 = null;
                            }
                            viewGroup2.removeViewInLayout(closeAppAnimationView);
                            ViewGroup viewGroup3 = this.vtXr3xr3vQMVMTW;
                            if (viewGroup3 == null) {
                                viewGroup3 = null;
                            }
                            viewGroup3.addView(closeAppAnimationView);
                            closeAppAnimationView.WIXlfFpvH7glAGsUk3 = rbpFGdpgDCAQXat.ziNFA7KzVfc6(LqH09V6V7Wln.Aboow6rUrcY2SrFRa46C6uy(this), null, 0, new MtjpA6kdLgBnavFoDyA(closeAppAnimationView, (vOL3U3fINHMmdVoJz) null, 21), 3);
                        }
                    }
                }
                Set<String> categories = intent.getCategories();
                if (categories != null) {
                    if (!categories.contains("android.intent.category.HOME")) {
                        if (categories.contains("android.intent.category.LAUNCHER")) {
                            rbpFGdpgDCAQXat.ziNFA7KzVfc6(LqH09V6V7Wln.Aboow6rUrcY2SrFRa46C6uy(this), null, 0, new UXpkZe9MWL(this, null, 0), 3);
                            return;
                        }
                        return;
                    }
                    if (z) {
                        return;
                    }
                    A6rA3FtBwC3bh5Re8ZRhWWJm a6rA3FtBwC3bh5Re8ZRhWWJmS1zP5M3X7Ukq3ROlZ87G9I = ((dGvRr0aa2CegMWZH8rJH9l1) LcvPFGYKhAm4SS5FZ()).S1zP5M3X7Ukq3ROlZ87G9I();
                    if (a6rA3FtBwC3bh5Re8ZRhWWJmS1zP5M3X7Ukq3ROlZ87G9I == null || a6rA3FtBwC3bh5Re8ZRhWWJmS1zP5M3X7Ukq3ROlZ87G9I.ziNFA7KzVfc6()) {
                        AlphabetWaveView alphabetWaveView = this.X2LqfJkLDth1lHwRgNL5jfPDt00O2;
                        if (alphabetWaveView == null) {
                            alphabetWaveView = null;
                        }
                        float f = alphabetWaveView.sCPtafveBAhdLIs2ajN3WV;
                        alphabetWaveView.gsHzEVTj1SCIPR = f;
                        aBhc5Hosh3idQU7mazY abhc5hosh3idqu7mazy = alphabetWaveView.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
                        abhc5hosh3idqu7mazy.S1zP5M3X7Ukq3ROlZ87G9I = 0.0f;
                        abhc5hosh3idqu7mazy.axL8FocTDLUdzg0XScbO = f;
                        abhc5hosh3idqu7mazy.BezslBgjveK3hODH = true;
                        abhc5hosh3idqu7mazy.PQQPeCDD0JLCT3aLz();
                        alphabetWaveView.invalidate();
                        S3Q1dtDfB7lO3W s3Q1dtDfB7lO3W = this.xskpLJBhWb5xM802QFzgRuGk;
                        if (s3Q1dtDfB7lO3W == null) {
                            s3Q1dtDfB7lO3W = null;
                        }
                        pxIHJY45LsBs98maR1INey pxihjy45lsbs98mar1iney = s3Q1dtDfB7lO3W.BezslBgjveK3hODH;
                        dxa6Q9x6jlKcJETDF dxa6q9x6jlkcjetdf = s3Q1dtDfB7lO3W.ToEIy0qfkltfGfO3vmAQG;
                        S8qBhdLGd6CCJE34vX s8qBhdLGd6CCJE34vX = s3Q1dtDfB7lO3W.ox9eclwMpRd;
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        if (s3Q1dtDfB7lO3W.Ql6q60SSx3 || m6VeYiMqnaBahF88nkY76Vf.ox9eclwMpRd(s3Q1dtDfB7lO3W.HveD9n1tOYlffjJDxghBitYNgB, 100L, jElapsedRealtime)) {
                            cdjHGKliASEP50WE.S1zP5M3X7Ukq3ROlZ87G9I.S1zP5M3X7Ukq3ROlZ87G9I("onHomeButtonPressed", new Object[0]);
                            if (m6VeYiMqnaBahF88nkY76Vf.ox9eclwMpRd(S3Q1dtDfB7lO3W.WT8HZhEwPEkG, 700L, jElapsedRealtime) && m6VeYiMqnaBahF88nkY76Vf.ox9eclwMpRd(s3Q1dtDfB7lO3W.sBV5EuS0mGuEYqc5nc5erhuwb1OG7, 700L, jElapsedRealtime)) {
                                return;
                            }
                            s3Q1dtDfB7lO3W.sBV5EuS0mGuEYqc5nc5erhuwb1OG7 = jElapsedRealtime;
                            if (m6VeYiMqnaBahF88nkY76Vf.ox9eclwMpRd(S3Q1dtDfB7lO3W.WT8HZhEwPEkG, 700L, jElapsedRealtime)) {
                                return;
                            }
                            if (s8qBhdLGd6CCJE34vX.BezslBgjveK3hODH() == L3Qlx1recqV5MubZz9QQ.HOME) {
                                AjDJ06vrIA ajDJ06vrIA = (AjDJ06vrIA) dxa6q9x6jlkcjetdf;
                                if (ajDJ06vrIA.axL8FocTDLUdzg0XScbO() && s3Q1dtDfB7lO3W.S1zP5M3X7Ukq3ROlZ87G9I.GO8WUug7ZWFCUI1zY().qaDSpeex0Oo1Qvt3oOrTJnbcQFp(R.id.fragment_container) == null) {
                                    A6rA3FtBwC3bh5Re8ZRhWWJm a6rA3FtBwC3bh5Re8ZRhWWJmS1zP5M3X7Ukq3ROlZ87G9I2 = ((dGvRr0aa2CegMWZH8rJH9l1) s3Q1dtDfB7lO3W.PQQPeCDD0JLCT3aLz.Rdzg08aYlt0UsoLUNug9cESzgAY9R).S1zP5M3X7Ukq3ROlZ87G9I();
                                    if ((a6rA3FtBwC3bh5Re8ZRhWWJmS1zP5M3X7Ukq3ROlZ87G9I2 instanceof rSQrYeRLvhT3W ? (rSQrYeRLvhT3W) a6rA3FtBwC3bh5Re8ZRhWWJmS1zP5M3X7Ukq3ROlZ87G9I2 : null) == null && ((dGvRr0aa2CegMWZH8rJH9l1) pxihjy45lsbs98mar1iney).S1zP5M3X7Ukq3ROlZ87G9I() == null) {
                                        if (ajDJ06vrIA.S1zP5M3X7Ukq3ROlZ87G9I()) {
                                            if (!s3Q1dtDfB7lO3W.Bk6w7oZjoWt9ZSRs4C7jIhbX3) {
                                                s8qBhdLGd6CCJE34vX.flPMk2Ix9h3b95v(2);
                                                return;
                                            }
                                            ZusJI1VBMR.Companion.getClass();
                                            if (JFbpof217h5syYjR.Aboow6rUrcY2SrFRa46C6uy("samsung")) {
                                                pfRaBqECe5pV80vi pfrabqece5pv80vi = s3Q1dtDfB7lO3W.JY5knQmh7EQJEZ;
                                                if (gT4sTdpjS277wbG60pk72fHWG7.ziNFA7KzVfc6) {
                                                    UgxoLusfimrPDl ugxoLusfimrPDl = pfrabqece5pv80vi.Mej0x2K4ZGSUxtYNka4QZ;
                                                    if (ugxoLusfimrPDl.S1zP5M3X7Ukq3ROlZ87G9I != 0 || ugxoLusfimrPDl.BezslBgjveK3hODH != 0) {
                                                        UsJ6UuHRXRD1PdykxDIAtuk9m usJ6UuHRXRD1PdykxDIAtuk9m = pfrabqece5pv80vi.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
                                                        if (usJ6UuHRXRD1PdykxDIAtuk9m == null || (ugxoLusfimrPDlPQQPeCDD0JLCT3aLz = usJ6UuHRXRD1PdykxDIAtuk9m.S1zP5M3X7Ukq3ROlZ87G9I.PQQPeCDD0JLCT3aLz(2)) == null) {
                                                            ugxoLusfimrPDlPQQPeCDD0JLCT3aLz = UgxoLusfimrPDl.Aboow6rUrcY2SrFRa46C6uy;
                                                        }
                                                        if (pfrabqece5pv80vi.Mej0x2K4ZGSUxtYNka4QZ.ziNFA7KzVfc6 > ugxoLusfimrPDlPQQPeCDD0JLCT3aLz.ziNFA7KzVfc6) {
                                                            ((dGvRr0aa2CegMWZH8rJH9l1) pxihjy45lsbs98mar1iney).PQQPeCDD0JLCT3aLz(null, new vkzrczFCWntH7ocuz8(3, s3Q1dtDfB7lO3W));
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                            s3Q1dtDfB7lO3W.Bk6w7oZjoWt9ZSRs4C7jIhbX3 = false;
                                            aJLiMmqfPh61r.sBV5EuS0mGuEYqc5nc5erhuwb1OG7(s3Q1dtDfB7lO3W.axL8FocTDLUdzg0XScbO, "bitpit.launcher.key.CHECK_FOR_SAMSUNG_RECENT_APPS_GESTURE", false);
                                            return;
                                        }
                                        return;
                                    }
                                }
                            }
                            s3Q1dtDfB7lO3W.axL8FocTDLUdzg0XScbO(true);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:159:0x0249  */
    public final void nXIf4d0RGTWG1l(boolean z) {
        Integer numValueOf;
        int size;
        int size2;
        O9Vq0pSiHJp o9Vq0pSiHJp = cdjHGKliASEP50WE.S1zP5M3X7Ukq3ROlZ87G9I;
        o9Vq0pSiHJp.S1zP5M3X7Ukq3ROlZ87G9I("onInsetsOrHeightChanged", new Object[0]);
        pfRaBqECe5pV80vi pfrabqece5pv80vi = this.ymQF046nqhMXpxNsXtOg;
        if (pfrabqece5pv80vi == null) {
            pfrabqece5pv80vi = null;
        }
        UgxoLusfimrPDl ugxoLusfimrPDl = pfrabqece5pv80vi.sCPtafveBAhdLIs2ajN3WV;
        int i = ugxoLusfimrPDl.axL8FocTDLUdzg0XScbO;
        int i2 = ugxoLusfimrPDl.S1zP5M3X7Ukq3ROlZ87G9I;
        int i3 = ugxoLusfimrPDl.BezslBgjveK3hODH;
        int i4 = ugxoLusfimrPDl.ziNFA7KzVfc6;
        ViewGroup viewGroup = this.vtXr3xr3vQMVMTW;
        if (viewGroup == null) {
            viewGroup = null;
        }
        boolean z2 = viewGroup.getLayoutDirection() == 1;
        int i5 = z2 ? i3 : i2;
        if (!z2) {
            i2 = i3;
        }
        Guideline guideline = this.nYT0DKgXJwaKUiSwy0PVds;
        if (guideline == null) {
            guideline = null;
        }
        IuS0NVwJfBQ31sXIwXeJAo iuS0NVwJfBQ31sXIwXeJAo = (IuS0NVwJfBQ31sXIwXeJAo) guideline.getLayoutParams();
        if (iuS0NVwJfBQ31sXIwXeJAo.S1zP5M3X7Ukq3ROlZ87G9I != i) {
            iuS0NVwJfBQ31sXIwXeJAo.S1zP5M3X7Ukq3ROlZ87G9I = i;
            Guideline guideline2 = this.nYT0DKgXJwaKUiSwy0PVds;
            if (guideline2 == null) {
                guideline2 = null;
            }
            guideline2.setLayoutParams(iuS0NVwJfBQ31sXIwXeJAo);
        }
        Guideline guideline3 = this.XsOEcVh9yrEYbnc;
        if (guideline3 == null) {
            guideline3 = null;
        }
        IuS0NVwJfBQ31sXIwXeJAo iuS0NVwJfBQ31sXIwXeJAo2 = (IuS0NVwJfBQ31sXIwXeJAo) guideline3.getLayoutParams();
        if (iuS0NVwJfBQ31sXIwXeJAo2.axL8FocTDLUdzg0XScbO != i4) {
            iuS0NVwJfBQ31sXIwXeJAo2.axL8FocTDLUdzg0XScbO = i4;
            Guideline guideline4 = this.XsOEcVh9yrEYbnc;
            if (guideline4 == null) {
                guideline4 = null;
            }
            guideline4.setLayoutParams(iuS0NVwJfBQ31sXIwXeJAo2);
        }
        Guideline guideline5 = this.QwmsQctY9ld;
        if (guideline5 == null) {
            guideline5 = null;
        }
        IuS0NVwJfBQ31sXIwXeJAo iuS0NVwJfBQ31sXIwXeJAo3 = (IuS0NVwJfBQ31sXIwXeJAo) guideline5.getLayoutParams();
        int iAxL8FocTDLUdzg0XScbO = db7W22f2OwBZO1GzsWe8IM80qE.axL8FocTDLUdzg0XScbO(this, R.dimen.alphabet_wave_width) + i2;
        if (iuS0NVwJfBQ31sXIwXeJAo3.axL8FocTDLUdzg0XScbO != iAxL8FocTDLUdzg0XScbO) {
            iuS0NVwJfBQ31sXIwXeJAo3.axL8FocTDLUdzg0XScbO = iAxL8FocTDLUdzg0XScbO;
            Guideline guideline6 = this.QwmsQctY9ld;
            if (guideline6 == null) {
                guideline6 = null;
            }
            guideline6.setLayoutParams(iuS0NVwJfBQ31sXIwXeJAo3);
        }
        pfRaBqECe5pV80vi pfrabqece5pv80vi2 = this.ymQF046nqhMXpxNsXtOg;
        if (pfrabqece5pv80vi2 == null) {
            pfrabqece5pv80vi2 = null;
        }
        int iAxL8FocTDLUdzg0XScbO2 = db7W22f2OwBZO1GzsWe8IM80qE.axL8FocTDLUdzg0XScbO(this, R.dimen.home_activity_min_bottom_padding) + Math.max(pfrabqece5pv80vi2.sCPtafveBAhdLIs2ajN3WV.ziNFA7KzVfc6, pfrabqece5pv80vi2.qTa7aqjjB9Bt6mc);
        pfRaBqECe5pV80vi pfrabqece5pv80vi3 = this.ymQF046nqhMXpxNsXtOg;
        int i6 = (pfrabqece5pv80vi3 == null ? null : pfrabqece5pv80vi3).Mej0x2K4ZGSUxtYNka4QZ.ziNFA7KzVfc6;
        if (iAxL8FocTDLUdzg0XScbO2 < i6) {
            iAxL8FocTDLUdzg0XScbO2 = i6;
        }
        int i7 = (int) (((double) i) * 2.5d);
        if (pfrabqece5pv80vi3 == null) {
            pfrabqece5pv80vi3 = null;
        }
        int i8 = pfrabqece5pv80vi3.Mej0x2K4ZGSUxtYNka4QZ.axL8FocTDLUdzg0XScbO;
        if (i7 < i8) {
            i7 = i8;
        }
        View view = this.VjB85JLsBZ;
        View view2 = view == null ? null : view;
        if (view == null) {
            view = null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i7;
        view2.setLayoutParams(layoutParams);
        boolean z3 = ((float) i4) > db7W22f2OwBZO1GzsWe8IM80qE.S1zP5M3X7Ukq3ROlZ87G9I(this, R.dimen.max_gesture_nav_bar_size);
        View view3 = this.LK4JMwppqYcAM4AShAbqsUc;
        if (view3 == null) {
            view3 = null;
        }
        view3.setVisibility(z3 ? 0 : 8);
        if (z3) {
            View view4 = this.LK4JMwppqYcAM4AShAbqsUc;
            if (view4 == null) {
                view4 = null;
            }
            ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
            if (layoutParams2 == null) {
                QMQVwNPs3M8khSL8toijR8.H5sQ15nhYoaKKHhx("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            } else {
                layoutParams2.height = iAxL8FocTDLUdzg0XScbO2;
                view4.setLayoutParams(layoutParams2);
            }
        }
        AlphabetWaveView alphabetWaveView = this.X2LqfJkLDth1lHwRgNL5jfPDt00O2;
        if (alphabetWaveView == null) {
            alphabetWaveView = null;
        }
        int i9 = (int) (i * 1.5f);
        int i10 = z3 ? iAxL8FocTDLUdzg0XScbO2 : 0;
        if (alphabetWaveView.FzogU2bPCQtD6a1hMYB1kyti != i9) {
            alphabetWaveView.FzogU2bPCQtD6a1hMYB1kyti = i9;
            alphabetWaveView.iR1XUIc7FjhMl57O = i9 != 0;
            alphabetWaveView.yZj7bj6KyeuYi9woqDlC |= 1;
        }
        if (alphabetWaveView.J1BE9tYH1em4X1uAhc6L7f4M != i10) {
            alphabetWaveView.J1BE9tYH1em4X1uAhc6L7f4M = i10;
            alphabetWaveView.yM5HHkk1MhPLZFYTHm2JjrArud = i10 != 0;
            alphabetWaveView.yZj7bj6KyeuYi9woqDlC |= 2;
        }
        if (alphabetWaveView.yZj7bj6KyeuYi9woqDlC != 0) {
            alphabetWaveView.invalidate();
        }
        pfRaBqECe5pV80vi pfrabqece5pv80vi4 = this.ymQF046nqhMXpxNsXtOg;
        if (pfrabqece5pv80vi4 == null) {
            pfrabqece5pv80vi4 = null;
        }
        ViewGroup viewGroup2 = this.vtXr3xr3vQMVMTW;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        int height = viewGroup2.getHeight();
        pfrabqece5pv80vi4.getClass();
        o9Vq0pSiHJp.S1zP5M3X7Ukq3ROlZ87G9I("onHeightOrInsetsChanged", new Object[0]);
        pfrabqece5pv80vi4.f2sXlW3st0rAKJwyOrCfOWc = height;
        Context context = pfrabqece5pv80vi4.GO8WUug7ZWFCUI1zY;
        pfrabqece5pv80vi4.cVfIGUKLEqID1HH = (int) db7W22f2OwBZO1GzsWe8IM80qE.ziNFA7KzVfc6(context, R.dimen.toolbar_box_margin_vertical);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true);
        pfrabqece5pv80vi4.czGAefXQxIZzo = db7W22f2OwBZO1GzsWe8IM80qE.BezslBgjveK3hODH(context, R.dimen.material8) + ((int) typedValue.getDimension(context.getResources().getDisplayMetrics()));
        int i11 = pfrabqece5pv80vi4.iR1XUIc7FjhMl57O;
        pfrabqece5pv80vi4.iR1XUIc7FjhMl57O = pfrabqece5pv80vi4.LcvPFGYKhAm4SS5FZ.S1zP5M3X7Ukq3ROlZ87G9I(pfrabqece5pv80vi4.f2sXlW3st0rAKJwyOrCfOWc, pfrabqece5pv80vi4.sCPtafveBAhdLIs2ajN3WV.axL8FocTDLUdzg0XScbO);
        pfrabqece5pv80vi4.yM5HHkk1MhPLZFYTHm2JjrArud = pfrabqece5pv80vi4.BezslBgjveK3hODH(cvu91h5WjQasu7vH8q4wQg9.JY5knQmh7EQJEZ(pfrabqece5pv80vi4.ziNFA7KzVfc6() * pfrabqece5pv80vi4.Rdzg08aYlt0UsoLUNug9cESzgAY9R.getFloat("bitpit.launcher.key.FAVORITES_TOP_PADDING_PERCENTAGE", 1.0f)));
        CJI9fJNh1Q2PBYQKjHaT4Ef4H cJI9fJNh1Q2PBYQKjHaT4Ef4H = pfrabqece5pv80vi4.gsHzEVTj1SCIPR;
        ArrayList arrayList = cJI9fJNh1Q2PBYQKjHaT4Ef4H.GO8WUug7ZWFCUI1zY;
        if (!arrayList.isEmpty() && (size2 = arrayList.size() - 1) >= 0) {
            while (true) {
                int i12 = size2 - 1;
                ((kk7MNO9kXMrp2t) arrayList.get(size2)).flPMk2Ix9h3b95v(pfrabqece5pv80vi4);
                if (i12 < 0) {
                    break;
                } else {
                    size2 = i12;
                }
            }
        }
        if (pfrabqece5pv80vi4.iR1XUIc7FjhMl57O != i11) {
            o9Vq0pSiHJp.S1zP5M3X7Ukq3ROlZ87G9I("onTopPaddingChanged", new Object[0]);
            ArrayList arrayList2 = cJI9fJNh1Q2PBYQKjHaT4Ef4H.GO8WUug7ZWFCUI1zY;
            if (!arrayList2.isEmpty() && (size = arrayList2.size() - 1) >= 0) {
                while (true) {
                    int i13 = size - 1;
                    kk7MNO9kXMrp2t kk7mno9kxmrp2t = (kk7MNO9kXMrp2t) arrayList2.get(size);
                    kk7mno9kxmrp2t.ox9eclwMpRd();
                    kk7mno9kxmrp2t.Aboow6rUrcY2SrFRa46C6uy();
                    if (i13 < 0) {
                        break;
                    } else {
                        size = i13;
                    }
                }
            }
        }
        msN9fKEefAIkohzW msn9fkeefaikohzw = this.W990VlXItKZEUxjpiAhHWCW0;
        if (msn9fkeefaikohzw == null) {
            msn9fkeefaikohzw = null;
        }
        msn9fkeefaikohzw.BezslBgjveK3hODH();
        vHDGcerxdYUGlVld2h();
        EmCrywYCUQTWPrPSAsgr emCrywYCUQTWPrPSAsgr = this.d3wjn0WBdr9Ap;
        if (emCrywYCUQTWPrPSAsgr == null) {
            emCrywYCUQTWPrPSAsgr = null;
        }
        int i14 = emCrywYCUQTWPrPSAsgr.yM5HHkk1MhPLZFYTHm2JjrArud;
        HomeActivity homeActivity = emCrywYCUQTWPrPSAsgr.GO8WUug7ZWFCUI1zY;
        RecyclerView recyclerView = emCrywYCUQTWPrPSAsgr.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
        if (i14 != i || emCrywYCUQTWPrPSAsgr.FzogU2bPCQtD6a1hMYB1kyti != iAxL8FocTDLUdzg0XScbO2 || emCrywYCUQTWPrPSAsgr.J1BE9tYH1em4X1uAhc6L7f4M != i5 || emCrywYCUQTWPrPSAsgr.tdNmBZIJHG1 != i2 || z) {
            o9Vq0pSiHJp.S1zP5M3X7Ukq3ROlZ87G9I("onInsetsOrHeightChanged", new Object[0]);
            FdefTICOs2UQ1fmh66Mky layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                int iStxE0E5OcDxBRSm3TMzS = ((LinearLayoutManager) layoutManager).StxE0E5OcDxBRSm3TMzS();
                numValueOf = Integer.valueOf(iStxE0E5OcDxBRSm3TMzS);
                if (iStxE0E5OcDxBRSm3TMzS == -1) {
                    numValueOf = null;
                }
            } else {
                numValueOf = null;
            }
            boolean z4 = numValueOf != null && numValueOf.intValue() == 0;
            emCrywYCUQTWPrPSAsgr.yM5HHkk1MhPLZFYTHm2JjrArud = i;
            emCrywYCUQTWPrPSAsgr.FzogU2bPCQtD6a1hMYB1kyti = iAxL8FocTDLUdzg0XScbO2;
            emCrywYCUQTWPrPSAsgr.J1BE9tYH1em4X1uAhc6L7f4M = i5;
            emCrywYCUQTWPrPSAsgr.tdNmBZIJHG1 = i2;
            emCrywYCUQTWPrPSAsgr.Aboow6rUrcY2SrFRa46C6uy();
            boolean zS1zP5M3X7Ukq3ROlZ87G9I = emCrywYCUQTWPrPSAsgr.gsHzEVTj1SCIPR.S1zP5M3X7Ukq3ROlZ87G9I(homeActivity);
            if (emCrywYCUQTWPrPSAsgr.tzMOyOc53ffl != zS1zP5M3X7Ukq3ROlZ87G9I) {
                emCrywYCUQTWPrPSAsgr.tzMOyOc53ffl = zS1zP5M3X7Ukq3ROlZ87G9I;
                emCrywYCUQTWPrPSAsgr.cVfIGUKLEqID1HH = zS1zP5M3X7Ukq3ROlZ87G9I ? db7W22f2OwBZO1GzsWe8IM80qE.axL8FocTDLUdzg0XScbO(homeActivity, R.dimen.tile_grid_margin) : 0;
                emCrywYCUQTWPrPSAsgr.ziNFA7KzVfc6();
            }
            if (z4 && emCrywYCUQTWPrPSAsgr.czGAefXQxIZzo.S1zP5M3X7Ukq3ROlZ87G9I == 0) {
                recyclerView.sebuKkk408zGuONgFW1WknWYdAr6(0);
            }
        }
        ViewGroup viewGroup3 = this.vtXr3xr3vQMVMTW;
        if (viewGroup3 == null) {
            viewGroup3 = null;
        }
        viewGroup3.requestLayout();
        ViewGroup viewGroup4 = this.vtXr3xr3vQMVMTW;
        (viewGroup4 != null ? viewGroup4 : null).invalidate();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        IQ6Ug1woLp4DNbPVXhFhC3Fz();
    }

    @Override // b.LKywEzQDxQLVc8H82ZH, b.QKXpIUPLGn, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        nXIf4d0RGTWG1l(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v127, types: [b.jxlgdotwt22] */
    /* JADX WARN: Type inference failed for: r0v133, types: [b.jxlgdotwt22] */
    /* JADX WARN: Type inference failed for: r0v139, types: [b.jxlgdotwt22] */
    /* JADX WARN: Type inference failed for: r0v144, types: [b.pfRaBqECe5pV80vi] */
    /* JADX WARN: Type inference failed for: r0v147, types: [b.jxlgdotwt22] */
    /* JADX WARN: Type inference failed for: r0v153, types: [b.jxlgdotwt22] */
    /* JADX WARN: Type inference failed for: r0v159 */
    /* JADX WARN: Type inference failed for: r0v161, types: [b.jxlgdotwt22] */
    /* JADX WARN: Type inference failed for: r0v181 */
    /* JADX WARN: Type inference failed for: r13v11, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r13v13, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r13v15, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r13v17, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r13v19, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r13v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v28, types: [b.l5DAHmppgTm] */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r13v46 */
    /* JADX WARN: Type inference failed for: r13v47 */
    /* JADX WARN: Type inference failed for: r13v48 */
    /* JADX WARN: Type inference failed for: r13v49 */
    /* JADX WARN: Type inference failed for: r13v5, types: [b.pfRaBqECe5pV80vi] */
    /* JADX WARN: Type inference failed for: r13v50 */
    /* JADX WARN: Type inference failed for: r13v51 */
    /* JADX WARN: Type inference failed for: r13v52 */
    /* JADX WARN: Type inference failed for: r13v54, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r13v56 */
    /* JADX WARN: Type inference failed for: r13v57 */
    /* JADX WARN: Type inference failed for: r13v58 */
    /* JADX WARN: Type inference failed for: r13v59 */
    /* JADX WARN: Type inference failed for: r13v60 */
    /* JADX WARN: Type inference failed for: r13v61 */
    /* JADX WARN: Type inference failed for: r13v62 */
    /* JADX WARN: Type inference failed for: r13v63 */
    /* JADX WARN: Type inference failed for: r13v64 */
    /* JADX WARN: Type inference failed for: r13v65 */
    /* JADX WARN: Type inference failed for: r13v66 */
    /* JADX WARN: Type inference failed for: r13v67 */
    /* JADX WARN: Type inference failed for: r13v68 */
    /* JADX WARN: Type inference failed for: r13v69 */
    /* JADX WARN: Type inference failed for: r13v70 */
    /* JADX WARN: Type inference failed for: r13v71 */
    /* JADX WARN: Type inference failed for: r13v72 */
    /* JADX WARN: Type inference failed for: r13v73 */
    /* JADX WARN: Type inference failed for: r13v9, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r2v100 */
    /* JADX WARN: Type inference failed for: r2v103 */
    /* JADX WARN: Type inference failed for: r2v107 */
    /* JADX WARN: Type inference failed for: r2v108, types: [b.NOZwTUrlUFlw] */
    /* JADX WARN: Type inference failed for: r2v109 */
    /* JADX WARN: Type inference failed for: r2v110 */
    /* JADX WARN: Type inference failed for: r2v111 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49, types: [b.EmCrywYCUQTWPrPSAsgr] */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v71, types: [b.jxlgdotwt22] */
    /* JADX WARN: Type inference failed for: r2v84, types: [b.gWrwpDOz79pszaF, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r33v0, types: [b.VmURdWpuvI, b.fpNgwZ132VoUkHxH2MqcZaz, b.vOL3U3fINHMmdVoJz, b.ydiLY1gIANOut4wE381YtA2L] */
    /* JADX WARN: Type inference failed for: r3v102 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56, types: [b.msN9fKEefAIkohzW] */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v60, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v91 */
    /* JADX WARN: Type inference failed for: r3v93, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v97 */
    /* JADX WARN: Type inference failed for: r3v98 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [b.VmURdWpuvI, b.fpNgwZ132VoUkHxH2MqcZaz] */
    /* JADX WARN: Type inference failed for: r4v16, types: [bitpit.launcher.alphabet_wave.AlphabetWaveView] */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [bitpit.launcher.alphabet_wave.AlphabetWaveHandle] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v28 */
    @Override // bitpit.launcher.ui.NniqwgLR9Jo6Bl9Px0S5u, b.qAu8xPQt71QSu59v2YrEcbg7z, b.nJMkSIuTHA4ytmN, b.QKXpIUPLGn, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        ?? r4;
        char c;
        int size;
        super.onCreate(bundle);
        cdjHGKliASEP50WE.S1zP5M3X7Ukq3ROlZ87G9I.S1zP5M3X7Ukq3ROlZ87G9I("onCreate", new Object[0]);
        GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(r79MMhDRaCjmDEnEC9XSmV.class), null, null);
        GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(NDHwVlwiTDCpc1s6p4j6.class), null, null);
        GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(GaJEBx6eHS.class), null, null);
        GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(WN74m0GEbQuEaa1c44.class), null, null);
        GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(qfrlczGhegaHxa8kLz.class), null, null);
        GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(ymEjTDJkfQpa5Y5K.class), null, null);
        GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(FriQNvVsGpalCkl8iH.class), null, null);
        new Hw5TvtvxiEmdhtv2OKQrtXD(this, GO8WUug7ZWFCUI1zY(), ((wnHGlh5hmdMATt) GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(wnHGlh5hmdMATt.class), null, null)).S1zP5M3X7Ukq3ROlZ87G9I);
        GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(lgqWour8ObB4j3Tj78V4L86PxKqIu.class), null, null);
        GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(UWAFgp496goLUihKAhfYmEHS.class), null, null);
        GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(vE8fKiDsTteVxGTFj1KG5DyRHnRpG.class), null, null);
        GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(K7k5h9eP8ZEPomZ3e.class), null, null);
        GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(A2mwGN92Kx.class), null, null);
        GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(IzCwLYLfrw4262Ji.class), null, null);
        GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(LHNVaXbD6NtS3VtejUx.class), null, null);
        GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(RS7Y0q5nV2sR79.class), null, null);
        GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(Wb2R3jKy46y0gol5x9fcJ69zK.class), null, null);
        this.ymQF046nqhMXpxNsXtOg = (pfRaBqECe5pV80vi) GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(pfRaBqECe5pV80vi.class), null, null);
        this.xkTHQiCuIkifVig404IU19 = (lT14RDm4I5i5K8RS) GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(lT14RDm4I5i5K8RS.class), null, null);
        this.kDXsiSdVdmgsTVimtHda0 = (z1jpZX9STmdA7rDJqTHkX09JG8) GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(z1jpZX9STmdA7rDJqTHkX09JG8.class), null, null);
        this.KdeRfNMKV5NbGkNy3v0hdYzMi = (ymEjTDJkfQpa5Y5K) GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(ymEjTDJkfQpa5Y5K.class), null, null);
        this.xrtRb0rUYgm4 = (qfeSq25MEaoh0juNRr) GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(qfeSq25MEaoh0juNRr.class), null, null);
        wCtX9liBBqC8WStuSfU wctx9libbqc8wstusfu = (wCtX9liBBqC8WStuSfU) GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(wCtX9liBBqC8WStuSfU.class), null, null);
        this.xskpLJBhWb5xM802QFzgRuGk = new S3Q1dtDfB7lO3W(this, wctx9libbqc8wstusfu.S1zP5M3X7Ukq3ROlZ87G9I, wctx9libbqc8wstusfu.axL8FocTDLUdzg0XScbO, wctx9libbqc8wstusfu.BezslBgjveK3hODH, wctx9libbqc8wstusfu.ziNFA7KzVfc6, wctx9libbqc8wstusfu.Aboow6rUrcY2SrFRa46C6uy, wctx9libbqc8wstusfu.ox9eclwMpRd, wctx9libbqc8wstusfu.PQQPeCDD0JLCT3aLz, wctx9libbqc8wstusfu.JY5knQmh7EQJEZ, wctx9libbqc8wstusfu.LYcdI4xpry8eXmFC9I4wyaLdcG1z, wctx9libbqc8wstusfu.flPMk2Ix9h3b95v, wctx9libbqc8wstusfu.fXBtMGfTIjGSHgK542);
        q7I8OyL9MwyU3IboIQV q7i8oyl9mwyu3iboiqv = (q7I8OyL9MwyU3IboIQV) GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(q7I8OyL9MwyU3IboIQV.class), null, null);
        this.zCdRGk6THJnQtkzb = new qakwcvVaTwptUfUa5(this, q7i8oyl9mwyu3iboiqv.S1zP5M3X7Ukq3ROlZ87G9I, q7i8oyl9mwyu3iboiqv.axL8FocTDLUdzg0XScbO, q7i8oyl9mwyu3iboiqv.BezslBgjveK3hODH);
        M9r85CYeTEytIsFRkQ72cgvGqDX m9r85CYeTEytIsFRkQ72cgvGqDX = (M9r85CYeTEytIsFRkQ72cgvGqDX) GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(M9r85CYeTEytIsFRkQ72cgvGqDX.class), null, null);
        gSPU8clJEfIPb0EQSKTd gspu8cljefipb0eqsktdAboow6rUrcY2SrFRa46C6uy = LqH09V6V7Wln.Aboow6rUrcY2SrFRa46C6uy(this);
        Context context = m9r85CYeTEytIsFRkQ72cgvGqDX.S1zP5M3X7Ukq3ROlZ87G9I;
        SharedPreferences sharedPreferences = m9r85CYeTEytIsFRkQ72cgvGqDX.axL8FocTDLUdzg0XScbO;
        VEc6vB7hr2KpNlVCr11iSWUTe vEc6vB7hr2KpNlVCr11iSWUTe = m9r85CYeTEytIsFRkQ72cgvGqDX.BezslBgjveK3hODH;
        S8qBhdLGd6CCJE34vX s8qBhdLGd6CCJE34vX = m9r85CYeTEytIsFRkQ72cgvGqDX.ziNFA7KzVfc6;
        BvisryDRLQkgph00iQZ96whV bvisryDRLQkgph00iQZ96whV = m9r85CYeTEytIsFRkQ72cgvGqDX.Aboow6rUrcY2SrFRa46C6uy;
        QnIBewe1H5rxJPvVcOBSKmAwQIFl qnIBewe1H5rxJPvVcOBSKmAwQIFl = m9r85CYeTEytIsFRkQ72cgvGqDX.ox9eclwMpRd;
        pxIHJY45LsBs98maR1INey pxihjy45lsbs98mar1iney = m9r85CYeTEytIsFRkQ72cgvGqDX.PQQPeCDD0JLCT3aLz;
        Xufrqv4AGkFBA5pytuPp8JD xufrqv4AGkFBA5pytuPp8JD = m9r85CYeTEytIsFRkQ72cgvGqDX.JY5knQmh7EQJEZ;
        MSO379Twj6q8RNPLwDx7Z mSO379Twj6q8RNPLwDx7Z = m9r85CYeTEytIsFRkQ72cgvGqDX.LYcdI4xpry8eXmFC9I4wyaLdcG1z;
        kVpfGiXrYc3TukfKzy kvpfgixryc3tukfkzy = m9r85CYeTEytIsFRkQ72cgvGqDX.flPMk2Ix9h3b95v;
        WlMPmh05PXOtn wlMPmh05PXOtn = m9r85CYeTEytIsFRkQ72cgvGqDX.fXBtMGfTIjGSHgK542;
        RD6cH12hvcraaybiM3 rD6cH12hvcraaybiM3 = m9r85CYeTEytIsFRkQ72cgvGqDX.ToEIy0qfkltfGfO3vmAQG;
        eY0AEVFwD2fuPwFF4IzZ2WAQ78 ey0aevfwd2fupwff4izz2waq78 = m9r85CYeTEytIsFRkQ72cgvGqDX.H5sQ15nhYoaKKHhx;
        my55PDgWo5bYh9KBNXT my55pdgwo5byh9kbnxt = m9r85CYeTEytIsFRkQ72cgvGqDX.HveD9n1tOYlffjJDxghBitYNgB;
        mHW63SUma8isGb mhw63suma8isgb = this.O83A1TLi0vQZEL;
        this.bVNWke9B4ojqaOyGLUguwc = new QBYaql937t(mhw63suma8isgb, gspu8cljefipb0eqsktdAboow6rUrcY2SrFRa46C6uy, context, sharedPreferences, vEc6vB7hr2KpNlVCr11iSWUTe, s8qBhdLGd6CCJE34vX, bvisryDRLQkgph00iQZ96whV, qnIBewe1H5rxJPvVcOBSKmAwQIFl, pxihjy45lsbs98mar1iney, xufrqv4AGkFBA5pytuPp8JD, mSO379Twj6q8RNPLwDx7Z, kvpfgixryc3tukfkzy, wlMPmh05PXOtn, rD6cH12hvcraaybiM3, ey0aevfwd2fupwff4izz2waq78, my55pdgwo5byh9kbnxt);
        this.XdWfef3T7jQymi8jK = (lcSH5kzWGFN) GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(lcSH5kzWGFN.class), null, null);
        this.e1MXM38S89FAQkWn07KwuU = (fbgNavbqkSud) GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(fbgNavbqkSud.class), null, null);
        this.vMtmuFr96pbRMPoPKPCkRzUEF8ug = (iHPHZIrmzz0Nhav1OcnsAYxx7Sm1) GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(iHPHZIrmzz0Nhav1OcnsAYxx7Sm1.class), null, null);
        this.szH17XxPzE7qDHHJ6 = (rkWSsEQgSAuoZe) GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(rkWSsEQgSAuoZe.class), null, null);
        this.StxE0E5OcDxBRSm3TMzS = (l5DAHmppgTm) GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(l5DAHmppgTm.class), null, null);
        this.lZBbKIgtyUK3jX2HZ1rGt987Fo = (DB27iwgGPAe90MHd1m4) GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(DB27iwgGPAe90MHd1m4.class), null, null);
        hsgUkarQLKL1aF8JVboCqnbaz1();
        bitpit.launcher.theming.NniqwgLR9Jo6Bl9Px0S5u nniqwgLR9Jo6Bl9Px0S5u = ((bitpit.launcher.theming.NniqwgLR9Jo6Bl9Px0S5u) J1BE9tYH1em4X1uAhc6L7f4M()).jvttfmFMQfShe6OfbNf1zF8CyEu.S1zP5M3X7Ukq3ROlZ87G9I;
        boolean z = nniqwgLR9Jo6Bl9Px0S5u.tzMOyOc53ffl;
        boolean z2 = nniqwgLR9Jo6Bl9Px0S5u.yZj7bj6KyeuYi9woqDlC;
        if (z) {
            i = z2 ? R.style.BaseHomeTheme_Extras_Colors_DarkText_Black : R.style.BaseHomeTheme_Extras_Colors_Black;
        } else {
            i = z2 ? R.style.BaseHomeTheme_Extras_Colors_DarkText : R.style.BaseHomeTheme_Extras_Colors;
        }
        setTheme(i);
        setContentView(R.layout.home_activity);
        boolean z3 = bundle == null;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.root_view);
        this.vtXr3xr3vQMVMTW = viewGroup;
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.content_root_view);
        this.WwLbT8A1DREUOMGqEk = viewGroup2;
        this.X2LqfJkLDth1lHwRgNL5jfPDt00O2 = (AlphabetWaveView) viewGroup2.findViewById(R.id.alphabet_wave_view);
        ViewGroup viewGroup3 = this.WwLbT8A1DREUOMGqEk;
        if (viewGroup3 == null) {
            viewGroup3 = null;
        }
        this.yEadMPRZv7QTCpzFKIx1Xmh2 = (AlphabetWaveHandle) viewGroup3.findViewById(R.id.alphabet_wave_handle);
        AlphabetWaveView alphabetWaveView = this.X2LqfJkLDth1lHwRgNL5jfPDt00O2;
        if (alphabetWaveView == null) {
            alphabetWaveView = null;
        }
        RecyclerView recyclerView = (RecyclerView) alphabetWaveView.findViewById(R.id.recycler_view);
        ViewGroup viewGroup4 = this.WwLbT8A1DREUOMGqEk;
        if (viewGroup4 == null) {
            viewGroup4 = null;
        }
        this.zERj7wgTMSj5XP5 = (FloatingActionButton) viewGroup4.findViewById(R.id.large_fab);
        ViewGroup viewGroup5 = this.WwLbT8A1DREUOMGqEk;
        if (viewGroup5 == null) {
            viewGroup5 = null;
        }
        this.KXOE6Ztvu4LZmAnzfIo8 = (CustomExtendedFab) viewGroup5.findViewById(R.id.large_fab_extended);
        ViewGroup viewGroup6 = this.WwLbT8A1DREUOMGqEk;
        if (viewGroup6 == null) {
            viewGroup6 = null;
        }
        this.nYT0DKgXJwaKUiSwy0PVds = (Guideline) viewGroup6.findViewById(R.id.guideline_top);
        ViewGroup viewGroup7 = this.WwLbT8A1DREUOMGqEk;
        if (viewGroup7 == null) {
            viewGroup7 = null;
        }
        this.XsOEcVh9yrEYbnc = (Guideline) viewGroup7.findViewById(R.id.guideline_bottom);
        ViewGroup viewGroup8 = this.WwLbT8A1DREUOMGqEk;
        if (viewGroup8 == null) {
            viewGroup8 = null;
        }
        this.QwmsQctY9ld = (Guideline) viewGroup8.findViewById(R.id.guideline_end);
        ViewGroup viewGroup9 = this.WwLbT8A1DREUOMGqEk;
        if (viewGroup9 == null) {
            viewGroup9 = null;
        }
        this.kS1lZ76stxAmrE008w8qwZTo = (BackgroundTintView) viewGroup9.findViewById(R.id.background_tint_view);
        k8mpg40PgvXGbNW1aFOIFMNP k8mpg40pgvxgbnw1afoifmnp = new k8mpg40PgvXGbNW1aFOIFMNP(5, this);
        Bs6d0jOxI4D8gb1dAk bs6d0jOxI4D8gb1dAk = new Bs6d0jOxI4D8gb1dAk(1, this);
        GestureDetector gestureDetector = new GestureDetector(this, new BOj7Lk43NwFnPA7WQbM8o9fGX8(this, 0));
        gestureDetector.setIsLongpressEnabled(true);
        FloatingActionButton floatingActionButton = this.zERj7wgTMSj5XP5;
        if (floatingActionButton == null) {
            floatingActionButton = null;
        }
        floatingActionButton.setOnClickListener(k8mpg40pgvxgbnw1afoifmnp);
        floatingActionButton.setOnLongClickListener(bs6d0jOxI4D8gb1dAk);
        floatingActionButton.setOnTouchListener(new jy0D46ypSGfI27ARTWE(2, gestureDetector));
        CustomExtendedFab customExtendedFab = this.KXOE6Ztvu4LZmAnzfIo8;
        if (customExtendedFab == null) {
            customExtendedFab = null;
        }
        customExtendedFab.setOnClickListener(k8mpg40pgvxgbnw1afoifmnp);
        customExtendedFab.setOnLongClickListener(bs6d0jOxI4D8gb1dAk);
        ViewGroup viewGroup10 = this.WwLbT8A1DREUOMGqEk;
        if (viewGroup10 == null) {
            viewGroup10 = null;
        }
        this.LK4JMwppqYcAM4AShAbqsUc = viewGroup10.findViewById(R.id.scrim_view_bottom);
        ViewGroup viewGroup11 = this.WwLbT8A1DREUOMGqEk;
        if (viewGroup11 == null) {
            viewGroup11 = null;
        }
        View viewFindViewById = viewGroup11.findViewById(R.id.scrim_view_top);
        this.VjB85JLsBZ = viewFindViewById;
        View view = this.LK4JMwppqYcAM4AShAbqsUc;
        if (view == null) {
            view = null;
        }
        this.N1ENDx3UBC9JxmcGQyn59aqjOM = viewFindViewById;
        boolean zAboow6rUrcY2SrFRa46C6uy = ASDwBkZhws.Aboow6rUrcY2SrFRa46C6uy(this);
        this.GtGIZrsiVJNzid1Vu8XK = zAboow6rUrcY2SrFRa46C6uy;
        View decorView = getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        int i2 = zAboow6rUrcY2SrFRa46C6uy ? systemUiVisibility | 8192 : systemUiVisibility & (-8193);
        decorView.setSystemUiVisibility(zAboow6rUrcY2SrFRa46C6uy ? i2 | 16 : i2 & (-17));
        if (!this.GtGIZrsiVJNzid1Vu8XK) {
            int color = getColor(R.color.scrim);
            viewFindViewById.setBackground(xKHQcxWowK0Qg.ziNFA7KzVfc6(color, 48));
            view.setBackground(xKHQcxWowK0Qg.ziNFA7KzVfc6(color, 80));
        }
        viewFindViewById.setVisibility(0);
        view.setVisibility(0);
        CzxwlwBW4rlflb8gQRn czxwlwBW4rlflb8gQRn = (CzxwlwBW4rlflb8gQRn) GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(CzxwlwBW4rlflb8gQRn.class), null, null);
        this.W990VlXItKZEUxjpiAhHWCW0 = new msN9fKEefAIkohzW(this, recyclerView, mhw63suma8isgb, czxwlwBW4rlflb8gQRn.S1zP5M3X7Ukq3ROlZ87G9I, czxwlwBW4rlflb8gQRn.axL8FocTDLUdzg0XScbO, czxwlwBW4rlflb8gQRn.BezslBgjveK3hODH, czxwlwBW4rlflb8gQRn.ziNFA7KzVfc6, czxwlwBW4rlflb8gQRn.Aboow6rUrcY2SrFRa46C6uy, czxwlwBW4rlflb8gQRn.ox9eclwMpRd);
        if (gT4sTdpjS277wbG60pk72fHWG7.Aboow6rUrcY2SrFRa46C6uy) {
            r4 = 0;
            this.kZrD9fJjn1Y7AUQvv0fun = (MJ4Qybv4FFP3bDz2UfzI43) GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(MJ4Qybv4FFP3bDz2UfzI43.class), null, null);
        } else {
            r4 = 0;
        }
        D0w4Fo3mGNjq7Qm8Kx d0w4Fo3mGNjq7Qm8Kx = (D0w4Fo3mGNjq7Qm8Kx) GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(D0w4Fo3mGNjq7Qm8Kx.class), r4, r4);
        gSPU8clJEfIPb0EQSKTd gspu8cljefipb0eqsktdAboow6rUrcY2SrFRa46C6uy2 = LqH09V6V7Wln.Aboow6rUrcY2SrFRa46C6uy(this);
        AlphabetWaveView alphabetWaveView2 = this.X2LqfJkLDth1lHwRgNL5jfPDt00O2;
        ?? r5 = alphabetWaveView2;
        if (alphabetWaveView2 == null) {
            r5 = r4;
        }
        AlphabetWaveHandle alphabetWaveHandle = this.yEadMPRZv7QTCpzFKIx1Xmh2;
        ?? r6 = alphabetWaveHandle;
        if (alphabetWaveHandle == null) {
            r6 = r4;
        }
        ?? r33 = r4;
        EmCrywYCUQTWPrPSAsgr emCrywYCUQTWPrPSAsgr = new EmCrywYCUQTWPrPSAsgr(this, gspu8cljefipb0eqsktdAboow6rUrcY2SrFRa46C6uy2, recyclerView, r5, r6, (AhCZ3UMvtA) this.WIXlfFpvH7glAGsUk3.Rdzg08aYlt0UsoLUNug9cESzgAY9R, z3, d0w4Fo3mGNjq7Qm8Kx.S1zP5M3X7Ukq3ROlZ87G9I, d0w4Fo3mGNjq7Qm8Kx.axL8FocTDLUdzg0XScbO, d0w4Fo3mGNjq7Qm8Kx.BezslBgjveK3hODH, d0w4Fo3mGNjq7Qm8Kx.ziNFA7KzVfc6, d0w4Fo3mGNjq7Qm8Kx.Aboow6rUrcY2SrFRa46C6uy, d0w4Fo3mGNjq7Qm8Kx.ox9eclwMpRd, d0w4Fo3mGNjq7Qm8Kx.PQQPeCDD0JLCT3aLz);
        this.d3wjn0WBdr9Ap = emCrywYCUQTWPrPSAsgr;
        pfRaBqECe5pV80vi pfrabqece5pv80vi = this.ymQF046nqhMXpxNsXtOg;
        ?? r13 = pfrabqece5pv80vi;
        if (pfrabqece5pv80vi == null) {
            r13 = r33;
        }
        r13.IPi49brQACDpXJTJMp7 = new rkqwFvjLjoZCrFLnsdi(0, emCrywYCUQTWPrPSAsgr, EmCrywYCUQTWPrPSAsgr.class, "calculateFavoritesBounds", "calculateFavoritesBounds()Lbitpit/launcher/onboarding/OpenBounds;", 0, 10);
        this.Ugv06uQcsfU = emCrywYCUQTWPrPSAsgr.Mej0x2K4ZGSUxtYNka4QZ;
        DPjpTc5ZXh3u47bQjHCXMpRinV1s6 dPjpTc5ZXh3u47bQjHCXMpRinV1s6 = (DPjpTc5ZXh3u47bQjHCXMpRinV1s6) GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(DPjpTc5ZXh3u47bQjHCXMpRinV1s6.class), r33, r33);
        EmCrywYCUQTWPrPSAsgr emCrywYCUQTWPrPSAsgr2 = this.d3wjn0WBdr9Ap;
        ?? r2 = emCrywYCUQTWPrPSAsgr2 != null ? emCrywYCUQTWPrPSAsgr2 : r33;
        msN9fKEefAIkohzW msn9fkeefaikohzw = this.W990VlXItKZEUxjpiAhHWCW0;
        wW4vjJYXED6OMqHRW ww4vjjyxed6omqhrw = new wW4vjJYXED6OMqHRW(this, r2, msn9fkeefaikohzw == null ? r33 : msn9fkeefaikohzw, dPjpTc5ZXh3u47bQjHCXMpRinV1s6.S1zP5M3X7Ukq3ROlZ87G9I, dPjpTc5ZXh3u47bQjHCXMpRinV1s6.axL8FocTDLUdzg0XScbO, dPjpTc5ZXh3u47bQjHCXMpRinV1s6.BezslBgjveK3hODH, dPjpTc5ZXh3u47bQjHCXMpRinV1s6.ziNFA7KzVfc6);
        this.ItAWeK8V06gR8MpzH = ww4vjjyxed6omqhrw;
        ViewGroup viewGroup12 = this.vtXr3xr3vQMVMTW;
        ?? r14 = viewGroup12;
        if (viewGroup12 == null) {
            r14 = r33;
        }
        this.XRnBzHfiQNSY0R7MyxLAJXUJFfM = new KGjoKHCGXMiM8O2q02X1Sb(this, r14, ww4vjjyxed6omqhrw);
        if (gT4sTdpjS277wbG60pk72fHWG7.ziNFA7KzVfc6) {
            IuS0NVwJfBQ31sXIwXeJAo iuS0NVwJfBQ31sXIwXeJAo = new IuS0NVwJfBQ31sXIwXeJAo(0, 0);
            iuS0NVwJfBQ31sXIwXeJAo.cS9Klw57l26qfkpcMlfmpU = 0;
            iuS0NVwJfBQ31sXIwXeJAo.LYcdI4xpry8eXmFC9I4wyaLdcG1z = 0;
            iuS0NVwJfBQ31sXIwXeJAo.caTQCiA8tNnV = 0;
            iuS0NVwJfBQ31sXIwXeJAo.ToEIy0qfkltfGfO3vmAQG = 0;
            ViewGroup viewGroup13 = this.WwLbT8A1DREUOMGqEk;
            ?? r15 = viewGroup13;
            if (viewGroup13 == null) {
                r15 = r33;
            }
            ViewGroup viewGroup14 = this.WwLbT8A1DREUOMGqEk;
            ?? r3 = viewGroup14;
            if (viewGroup14 == null) {
                r3 = r33;
            }
            r15.addView(new ZGSDqjV1IQztRN1wWJd(r3.getContext()), 0, iuS0NVwJfBQ31sXIwXeJAo);
            rPqnGWlYqswCjhboAg7RDKNTU rpqngwlyqswcjhboag7rdkntu = (rPqnGWlYqswCjhboAg7RDKNTU) GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(rPqnGWlYqswCjhboAg7RDKNTU.class), r33, r33);
            NOZwTUrlUFlw nOZwTUrlUFlw = this.Ugv06uQcsfU;
            new ljWrNhoeIXbJk(this, (NOZwTUrlUFlw) (nOZwTUrlUFlw != null ? nOZwTUrlUFlw : r33), rpqngwlyqswcjhboag7rdkntu.S1zP5M3X7Ukq3ROlZ87G9I, rpqngwlyqswcjhboag7rdkntu.axL8FocTDLUdzg0XScbO, rpqngwlyqswcjhboag7rdkntu.BezslBgjveK3hODH);
        }
        xmd77ORoMNAomGMloBLegtT xmd77oromnaomgmloblegtt = (xmd77ORoMNAomGMloBLegtT) GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(xmd77ORoMNAomGMloBLegtT.class), r33, r33);
        ViewGroup viewGroup15 = this.vtXr3xr3vQMVMTW;
        ?? r16 = viewGroup15;
        if (viewGroup15 == null) {
            r16 = r33;
        }
        this.aOibpGlf3ldGa = new kKH5g1roXYyxc(r16.findViewById(R.id.popup_container), xmd77oromnaomgmloblegtt);
        ViewGroup viewGroup16 = this.vtXr3xr3vQMVMTW;
        ?? r17 = viewGroup16;
        if (viewGroup16 == null) {
            r17 = r33;
        }
        WeakHashMap weakHashMap = Ne7IrXfSjRisooSM.S1zP5M3X7Ukq3ROlZ87G9I;
        Qs5il4A81sbf73pL1Mwnj.ToEIy0qfkltfGfO3vmAQG(r17, this);
        ViewGroup viewGroup17 = this.vtXr3xr3vQMVMTW;
        ?? r18 = viewGroup17;
        if (viewGroup17 == null) {
            r18 = r33;
        }
        pfRaBqECe5pV80vi pfrabqece5pv80vi2 = this.ymQF046nqhMXpxNsXtOg;
        ?? r0 = pfrabqece5pv80vi2;
        if (pfrabqece5pv80vi2 == null) {
            r0 = r33;
        }
        HqHnjiCgPIDSJWjlkNjT0Z.S1zP5M3X7Ukq3ROlZ87G9I(r18, r0.yZj7bj6KyeuYi9woqDlC);
        ViewGroup viewGroup18 = this.vtXr3xr3vQMVMTW;
        ?? r19 = viewGroup18;
        if (viewGroup18 == null) {
            r19 = r33;
        }
        r19.addOnLayoutChangeListener(this);
        ViewGroup viewGroup19 = this.vtXr3xr3vQMVMTW;
        ?? r110 = viewGroup19;
        if (viewGroup19 == null) {
            r110 = r33;
        }
        r110.getViewTreeObserver().addOnGlobalLayoutListener(this);
        ADNIds0B2hvW712J3ebQfEXyQEZN aDNIds0B2hvW712J3ebQfEXyQEZN = (ADNIds0B2hvW712J3ebQfEXyQEZN) GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(ADNIds0B2hvW712J3ebQfEXyQEZN.class), r33, r33);
        FloatingActionButton floatingActionButton2 = this.zERj7wgTMSj5XP5;
        ?? r7 = floatingActionButton2 != null ? floatingActionButton2 : r33;
        CustomExtendedFab customExtendedFab2 = this.KXOE6Ztvu4LZmAnzfIo8;
        aDNIds0B2hvW712J3ebQfEXyQEZN.ziNFA7KzVfc6.observe(this, new DEDkaDjg5PtPFwI1TzQritqKXN(1, new NOUX4kPYJkVqDQbilhFaow5G(aDNIds0B2hvW712J3ebQfEXyQEZN, r7, customExtendedFab2 != null ? customExtendedFab2 : r33, this, 11)));
        BackgroundTintView backgroundTintView = this.kS1lZ76stxAmrE008w8qwZTo;
        ?? r111 = backgroundTintView;
        if (backgroundTintView == null) {
            r111 = r33;
        }
        aDNIds0B2hvW712J3ebQfEXyQEZN.ox9eclwMpRd.observe(this, new DEDkaDjg5PtPFwI1TzQritqKXN(1, new BDJNYJBZKwLWlHia9hHMNdUvfP(18, r111)));
        rbpFGdpgDCAQXat.ziNFA7KzVfc6(LqH09V6V7Wln.Aboow6rUrcY2SrFRa46C6uy(this), r33, 0, new fNTMsWHktr2g00RrABSrY9jtX(this, aDNIds0B2hvW712J3ebQfEXyQEZN, r33, 29), 3);
        rbpFGdpgDCAQXat.ziNFA7KzVfc6(LqH09V6V7Wln.Aboow6rUrcY2SrFRa46C6uy(this), r33, 0, new UXpkZe9MWL(this, r33, 3), 3);
        rbpFGdpgDCAQXat.ziNFA7KzVfc6(LqH09V6V7Wln.Aboow6rUrcY2SrFRa46C6uy(this), r33, 0, new UXpkZe9MWL(this, r33, 4), 3);
        rbpFGdpgDCAQXat.ziNFA7KzVfc6(LqH09V6V7Wln.Aboow6rUrcY2SrFRa46C6uy(this), r33, 0, new UXpkZe9MWL(this, r33, 2), 3);
        rbpFGdpgDCAQXat.ziNFA7KzVfc6(LqH09V6V7Wln.Aboow6rUrcY2SrFRa46C6uy(this), r33, 0, new UXpkZe9MWL(this, r33, 6), 3);
        iR1XUIc7FjhMl57O().registerOnSharedPreferenceChangeListener(this);
        z1jpZX9STmdA7rDJqTHkX09JG8 z1jpzx9stmda7rdjqthkx09jg8 = this.kDXsiSdVdmgsTVimtHda0;
        ?? r112 = z1jpzx9stmda7rdjqthkx09jg8;
        if (z1jpzx9stmda7rdjqthkx09jg8 == null) {
            r112 = r33;
        }
        ((zaEQv9uah4s3bhwua8H) r112).axL8FocTDLUdzg0XScbO(this, false);
        this.GO8WUug7ZWFCUI1zY.S1zP5M3X7Ukq3ROlZ87G9I(((MVuyBRZ3P6eXlJ2OpESZb) WIXlfFpvH7glAGsUk3()).ziNFA7KzVfc6);
        l5DAHmppgTm l5dahmppgtm = this.StxE0E5OcDxBRSm3TMzS;
        ?? r113 = l5dahmppgtm;
        if (l5dahmppgtm == null) {
            r113 = r33;
        }
        Mr6zZVzX95znJox3gt9TK3PpOM.BezslBgjveK3hODH(new dg8bvHALOV6s53amgJ4(r113.ziNFA7KzVfc6, new PWokSaFpDS1dYO6NsJRP4I5m(this, r33, 0), 2), LqH09V6V7Wln.Aboow6rUrcY2SrFRa46C6uy(this));
        tnkHtSXZvBRSrQbhig tnkhtsxzvbrsrqbhig = (tnkHtSXZvBRSrQbhig) GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(tnkHtSXZvBRSrQbhig.class), r33, r33);
        tnkhtsxzvbrsrqbhig.S1zP5M3X7Ukq3ROlZ87G9I.clear();
        tnkhtsxzvbrsrqbhig.axL8FocTDLUdzg0XScbO.clear();
        ymEjTDJkfQpa5Y5K ymejtdjkfqpa5y5k = this.KdeRfNMKV5NbGkNy3v0hdYzMi;
        ?? r114 = ymejtdjkfqpa5y5k;
        if (ymejtdjkfqpa5y5k == null) {
            r114 = r33;
        }
        ((ti3ATSynU1Wqgf) r114).axL8FocTDLUdzg0XScbO(this);
        ((bitpit.launcher.theming.NniqwgLR9Jo6Bl9Px0S5u) J1BE9tYH1em4X1uAhc6L7f4M()).getClass();
        gSPU8clJEfIPb0EQSKTd gspu8cljefipb0eqsktdAboow6rUrcY2SrFRa46C6uy3 = LqH09V6V7Wln.Aboow6rUrcY2SrFRa46C6uy(this);
        PeLieoBN4yxYJZju3kQtKIsq7XL8 peLieoBN4yxYJZju3kQtKIsq7XL8 = NMquq9o0FvRs5RyiTFrS.S1zP5M3X7Ukq3ROlZ87G9I;
        rbpFGdpgDCAQXat.ziNFA7KzVfc6(gspu8cljefipb0eqsktdAboow6rUrcY2SrFRa46C6uy3, x4PcPRPmslEJW.cCmbv8Tzd2QLd161ImIZUlZ8n, 0, new JQDynrBXEyy1CqVm0rx57XCJsv2(this, r33, 1), 2);
        f2sXlW3st0rAKJwyOrCfOWc().cVfIGUKLEqID1HH.observe(this, new Nhi4hYmu4dFL3UI(1, new TQxN1rEKLbE2ktDwmLbD293(28)));
        bitpit.launcher.theming.NniqwgLR9Jo6Bl9Px0S5u nniqwgLR9Jo6Bl9Px0S5u2 = (bitpit.launcher.theming.NniqwgLR9Jo6Bl9Px0S5u) J1BE9tYH1em4X1uAhc6L7f4M();
        AtomicBoolean atomicBoolean = nniqwgLR9Jo6Bl9Px0S5u2.nXIf4d0RGTWG1l;
        boolean z4 = atomicBoolean.get();
        boolean zBezslBgjveK3hODH = ASDwBkZhws.BezslBgjveK3hODH(this);
        if (z4 != zBezslBgjveK3hODH) {
            SharedPreferences.Editor editorEdit = nniqwgLR9Jo6Bl9Px0S5u2.cCmbv8Tzd2QLd161ImIZUlZ8n.edit();
            editorEdit.putBoolean("bitpit.launcher.key.CACHED_IS_HOME_IN_DARK_MODE", zBezslBgjveK3hODH);
            editorEdit.apply();
            atomicBoolean.set(zBezslBgjveK3hODH);
            ArrayList arrayList = nniqwgLR9Jo6Bl9Px0S5u2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp.GO8WUug7ZWFCUI1zY;
            if (!arrayList.isEmpty() && (size = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i3 = size - 1;
                    ((YTs4nWeytJKgOLnERNkwrb) arrayList.get(size)).Ql6q60SSx3();
                    if (i3 < 0) {
                        break;
                    } else {
                        size = i3;
                    }
                }
            }
        }
        lT14RDm4I5i5K8RS lt14rdm4i5i5k8rs = this.xkTHQiCuIkifVig404IU19;
        ?? r115 = lt14rdm4i5i5k8rs;
        if (lt14rdm4i5i5k8rs == null) {
            r115 = r33;
        }
        gWrwpDOz79pszaF gwrwpdoz79pszaf = new gWrwpDOz79pszaF(this, ((UfBdTerHo7YiIb8) r115).f2sXlW3st0rAKJwyOrCfOWc, LqH09V6V7Wln.Aboow6rUrcY2SrFRa46C6uy(this));
        this.F4k5NH3S8ussgsUI7ENrwWm3io = gwrwpdoz79pszaf;
        if (!gwrwpdoz79pszaf.ziNFA7KzVfc6) {
            gwrwpdoz79pszaf.startListening();
        }
        lT14RDm4I5i5K8RS lt14rdm4i5i5k8rs2 = this.xkTHQiCuIkifVig404IU19;
        ?? r116 = lt14rdm4i5i5k8rs2;
        if (lt14rdm4i5i5k8rs2 == null) {
            r116 = r33;
        }
        gWrwpDOz79pszaF gwrwpdoz79pszaf2 = this.F4k5NH3S8ussgsUI7ENrwWm3io;
        ?? r8 = gwrwpdoz79pszaf2;
        if (gwrwpdoz79pszaf2 == null) {
            r8 = r33;
        }
        UfBdTerHo7YiIb8 ufBdTerHo7YiIb8 = (UfBdTerHo7YiIb8) r116;
        ufBdTerHo7YiIb8.getClass();
        r8.BezslBgjveK3hODH.axL8FocTDLUdzg0XScbO(ufBdTerHo7YiIb8);
        ufBdTerHo7YiIb8.Mej0x2K4ZGSUxtYNka4QZ.add(new WeakReference(r8));
        qfeSq25MEaoh0juNRr qfesq25meaoh0junrr = this.xrtRb0rUYgm4;
        ?? r117 = qfesq25meaoh0junrr;
        if (qfesq25meaoh0junrr == null) {
            r117 = r33;
        }
        xLjKrJnLbF0Z7lIneP4pwNBwjTZ xljkrjnlbf0z7linep4pwnbwjtz = (xLjKrJnLbF0Z7lIneP4pwNBwjTZ) r117;
        if (((Boolean) xljkrjnlbf0z7linep4pwnbwjtz.BezslBgjveK3hODH.getValue()).booleanValue()) {
            c = 0;
            rbpFGdpgDCAQXat.ziNFA7KzVfc6(LqH09V6V7Wln.Aboow6rUrcY2SrFRa46C6uy(this), r33, 0, new Qa2oxHq90ujONOFj(this, xljkrjnlbf0z7linep4pwnbwjtz, (vOL3U3fINHMmdVoJz) r33), 3);
        } else {
            c = 0;
        }
        mojfch1cPgBWXXqcK mojfch1cpgbwxxqck = (mojfch1cPgBWXXqcK) GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(mojfch1cPgBWXXqcK.class), r33, r33);
        XQCixPMPkXDW6 xQCixPMPkXDW6 = mojfch1cpgbwxxqck.ziNFA7KzVfc6;
        GZnU2p3i2qStYb gZnU2p3i2qStYb = mojfch1cPgBWXXqcK.JY5knQmh7EQJEZ[c];
        if (((Boolean) xQCixPMPkXDW6.S1zP5M3X7Ukq3ROlZ87G9I()).booleanValue()) {
            if (Settings.canDrawOverlays(((HF5afwOkFj9V8) mojfch1cpgbwxxqck.S1zP5M3X7Ukq3ROlZ87G9I).S1zP5M3X7Ukq3ROlZ87G9I)) {
                mojfch1cpgbwxxqck.S1zP5M3X7Ukq3ROlZ87G9I(this);
            } else {
                Toast.makeText(this, "Grant permission for event overlay", 0).show();
            }
        }
        jvttfmFMQfShe6OfbNf1zF8CyEu(getIntent(), true);
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z, b.LKywEzQDxQLVc8H82ZH, b.nJMkSIuTHA4ytmN, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        pfRaBqECe5pV80vi pfrabqece5pv80vi = this.ymQF046nqhMXpxNsXtOg;
        if (pfrabqece5pv80vi == null) {
            pfrabqece5pv80vi = null;
        }
        pfrabqece5pv80vi.IPi49brQACDpXJTJMp7 = null;
        EmCrywYCUQTWPrPSAsgr emCrywYCUQTWPrPSAsgr = this.d3wjn0WBdr9Ap;
        if (emCrywYCUQTWPrPSAsgr == null) {
            emCrywYCUQTWPrPSAsgr = null;
        }
        emCrywYCUQTWPrPSAsgr.Rdzg08aYlt0UsoLUNug9cESzgAY9R.setAdapter(null);
        emCrywYCUQTWPrPSAsgr.qTa7aqjjB9Bt6mc.PQQPeCDD0JLCT3aLz(null);
        ((nWNp5lXd2UnmVHYiA23jIso8x9) emCrywYCUQTWPrPSAsgr.qaDSpeex0Oo1Qvt3oOrTJnbcQFp).S1zP5M3X7Ukq3ROlZ87G9I.S1zP5M3X7Ukq3ROlZ87G9I(emCrywYCUQTWPrPSAsgr);
        NOZwTUrlUFlw nOZwTUrlUFlw = emCrywYCUQTWPrPSAsgr.Mej0x2K4ZGSUxtYNka4QZ;
        nOZwTUrlUFlw.WTnUxqIXsY1ZtjOlRVhyf.gsHzEVTj1SCIPR.S1zP5M3X7Ukq3ROlZ87G9I(nOZwTUrlUFlw);
        ((jlsZKUdoG1o) nOZwTUrlUFlw.PoRwkUUfcmwTiLMm).axL8FocTDLUdzg0XScbO.S1zP5M3X7Ukq3ROlZ87G9I(nOZwTUrlUFlw);
        msN9fKEefAIkohzW msn9fkeefaikohzw = this.W990VlXItKZEUxjpiAhHWCW0;
        if (msn9fkeefaikohzw == null) {
            msn9fkeefaikohzw = null;
        }
        msn9fkeefaikohzw.getClass();
        lT14RDm4I5i5K8RS lt14rdm4i5i5k8rs = this.xkTHQiCuIkifVig404IU19;
        if (lt14rdm4i5i5k8rs == null) {
            lt14rdm4i5i5k8rs = null;
        }
        gWrwpDOz79pszaF gwrwpdoz79pszaf = this.F4k5NH3S8ussgsUI7ENrwWm3io;
        if (gwrwpdoz79pszaf == null) {
            gwrwpdoz79pszaf = null;
        }
        UfBdTerHo7YiIb8 ufBdTerHo7YiIb8 = (UfBdTerHo7YiIb8) lt14rdm4i5i5k8rs;
        if (gwrwpdoz79pszaf.ziNFA7KzVfc6) {
            ufBdTerHo7YiIb8.getClass();
            gwrwpdoz79pszaf.stopListening();
        }
        fziyXE1Q48ooPc99jMpISyi.GO8WUug7ZWFCUI1zY(ufBdTerHo7YiIb8.Mej0x2K4ZGSUxtYNka4QZ, new iLN8xCbOb5pFPzxOVRUSvcX2eCl(0, gwrwpdoz79pszaf), true);
        gwrwpdoz79pszaf.BezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(ufBdTerHo7YiIb8);
        iR1XUIc7FjhMl57O().unregisterOnSharedPreferenceChangeListener(this);
        z1jpZX9STmdA7rDJqTHkX09JG8 z1jpzx9stmda7rdjqthkx09jg8 = this.kDXsiSdVdmgsTVimtHda0;
        ((zaEQv9uah4s3bhwua8H) (z1jpzx9stmda7rdjqthkx09jg8 != null ? z1jpzx9stmda7rdjqthkx09jg8 : null)).cCmbv8Tzd2QLd161ImIZUlZ8n.remove(this);
    }

    @Override // android.app.Activity
    public final void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        if (gT4sTdpjS277wbG60pk72fHWG7.ox9eclwMpRd || !gT4sTdpjS277wbG60pk72fHWG7.Aboow6rUrcY2SrFRa46C6uy) {
            return;
        }
        yZj7bj6KyeuYi9woqDlC();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewGroup viewGroup = this.vtXr3xr3vQMVMTW;
        if (viewGroup == null) {
            viewGroup = null;
        }
        viewGroup.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.NBdfCWeVOPpwOaZSGqvy = true;
        if (isDestroyed()) {
            return;
        }
        nXIf4d0RGTWG1l(false);
        IQ6Ug1woLp4DNbPVXhFhC3Fz();
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        KGjoKHCGXMiM8O2q02X1Sb kGjoKHCGXMiM8O2q02X1Sb = this.XRnBzHfiQNSY0R7MyxLAJXUJFfM;
        if (kGjoKHCGXMiM8O2q02X1Sb == null) {
            kGjoKHCGXMiM8O2q02X1Sb = null;
        }
        if (!kGjoKHCGXMiM8O2q02X1Sb.S1zP5M3X7Ukq3ROlZ87G9I().S1zP5M3X7Ukq3ROlZ87G9I(i, keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        kGjoKHCGXMiM8O2q02X1Sb.gsHzEVTj1SCIPR.add(Integer.valueOf(i));
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        KGjoKHCGXMiM8O2q02X1Sb kGjoKHCGXMiM8O2q02X1Sb = this.XRnBzHfiQNSY0R7MyxLAJXUJFfM;
        if (kGjoKHCGXMiM8O2q02X1Sb == null) {
            kGjoKHCGXMiM8O2q02X1Sb = null;
        }
        if (kGjoKHCGXMiM8O2q02X1Sb.gsHzEVTj1SCIPR.remove(Integer.valueOf(i))) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.NBdfCWeVOPpwOaZSGqvy) {
            if (i2 == i6 && i4 == i8 && i == i5 && i3 == i7) {
                return;
            }
            nXIf4d0RGTWG1l(true);
        }
    }

    @Override // b.QKXpIUPLGn, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        jvttfmFMQfShe6OfbNf1zF8CyEu(intent, false);
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z, b.nJMkSIuTHA4ytmN, android.app.Activity
    public final void onPause() {
        ymEjTDJkfQpa5Y5K ymejtdjkfqpa5y5k = this.KdeRfNMKV5NbGkNy3v0hdYzMi;
        if (ymejtdjkfqpa5y5k == null) {
            ymejtdjkfqpa5y5k = null;
        }
        ((ti3ATSynU1Wqgf) ymejtdjkfqpa5y5k).Aboow6rUrcY2SrFRa46C6uy(null);
        super.onPause();
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z, b.nJMkSIuTHA4ytmN, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.xu9cB1KZ6CllX) {
            this.xu9cB1KZ6CllX = false;
            recreate();
        }
        ymEjTDJkfQpa5Y5K ymejtdjkfqpa5y5k = this.KdeRfNMKV5NbGkNy3v0hdYzMi;
        if (ymejtdjkfqpa5y5k == null) {
            ymejtdjkfqpa5y5k = null;
        }
        ((ti3ATSynU1Wqgf) ymejtdjkfqpa5y5k).Aboow6rUrcY2SrFRa46C6uy(f2sXlW3st0rAKJwyOrCfOWc().BezslBgjveK3hODH());
        if (f2sXlW3st0rAKJwyOrCfOWc().BezslBgjveK3hODH() == L3Qlx1recqV5MubZz9QQ.HOME) {
            rkWSsEQgSAuoZe rkwsseqgsauoze = this.szH17XxPzE7qDHHJ6;
            if (rkwsseqgsauoze == null) {
                rkwsseqgsauoze = null;
            }
            rbpFGdpgDCAQXat.ziNFA7KzVfc6(rkwsseqgsauoze.axL8FocTDLUdzg0XScbO, null, 0, new pE6zh38jZw(rkwsseqgsauoze, null, 4), 3);
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode == -1465692696) {
                if (str.equals("bitpit.launcher.key.SHIFT_WALLPAPER")) {
                    rbpFGdpgDCAQXat.ziNFA7KzVfc6(LqH09V6V7Wln.Aboow6rUrcY2SrFRa46C6uy(this), null, 0, new PWokSaFpDS1dYO6NsJRP4I5m(this, null, 1), 3);
                }
            } else if (iHashCode == -366149402) {
                if (str.equals("bitpit.launcher.key.HIDE_STATUS_BAR")) {
                    bfvGkgRqVBmXp4z3D5cuKKKZz();
                }
            } else if (iHashCode == 697006064 && str.equals("bitpit.launcher.key.ALWAYS_ALLOW_LANDSCAPE_MODE")) {
                hsgUkarQLKL1aF8JVboCqnbaz1();
            }
        }
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z, b.LKywEzQDxQLVc8H82ZH, b.nJMkSIuTHA4ytmN, android.app.Activity
    public final void onStart() {
        L3Qlx1recqV5MubZz9QQ l3Qlx1recqV5MubZz9QQBezslBgjveK3hODH;
        L3Qlx1recqV5MubZz9QQ l3Qlx1recqV5MubZz9QQ;
        super.onStart();
        S3Q1dtDfB7lO3W s3Q1dtDfB7lO3W = this.xskpLJBhWb5xM802QFzgRuGk;
        if (s3Q1dtDfB7lO3W == null) {
            s3Q1dtDfB7lO3W = null;
        }
        FL0CFFY0euvWvPjBw1P8USTTCd fL0CFFY0euvWvPjBw1P8USTTCd = s3Q1dtDfB7lO3W.LYcdI4xpry8eXmFC9I4wyaLdcG1z;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        S3Q1dtDfB7lO3W.WT8HZhEwPEkG = jElapsedRealtime;
        if (!s3Q1dtDfB7lO3W.H5sQ15nhYoaKKHhx) {
            s3Q1dtDfB7lO3W.H5sQ15nhYoaKKHhx = true;
            if (!m6VeYiMqnaBahF88nkY76Vf.ox9eclwMpRd(S3Q1dtDfB7lO3W.UV6K6VDbgDgzpi12QAEKN4Emq, 3000L, jElapsedRealtime) && ((l3Qlx1recqV5MubZz9QQBezslBgjveK3hODH = s3Q1dtDfB7lO3W.ox9eclwMpRd.BezslBgjveK3hODH()) == (l3Qlx1recqV5MubZz9QQ = L3Qlx1recqV5MubZz9QQ.HOME) || l3Qlx1recqV5MubZz9QQBezslBgjveK3hODH == L3Qlx1recqV5MubZz9QQ.ALL || l3Qlx1recqV5MubZz9QQBezslBgjveK3hODH == L3Qlx1recqV5MubZz9QQ.SEARCH)) {
                s3Q1dtDfB7lO3W.axL8FocTDLUdzg0XScbO(true);
                if (l3Qlx1recqV5MubZz9QQBezslBgjveK3hODH != l3Qlx1recqV5MubZz9QQ) {
                    s3Q1dtDfB7lO3W.Aboow6rUrcY2SrFRa46C6uy.ziNFA7KzVfc6();
                    EmCrywYCUQTWPrPSAsgr emCrywYCUQTWPrPSAsgr = s3Q1dtDfB7lO3W.S1zP5M3X7Ukq3ROlZ87G9I.d3wjn0WBdr9Ap;
                    if (emCrywYCUQTWPrPSAsgr == null) {
                        emCrywYCUQTWPrPSAsgr = null;
                    }
                    emCrywYCUQTWPrPSAsgr.Rdzg08aYlt0UsoLUNug9cESzgAY9R.post(new YwBT4ESCmAqS8d6lra4iy0u6E(19, emCrywYCUQTWPrPSAsgr));
                }
            }
        }
        gWrwpDOz79pszaF gwrwpdoz79pszaf = this.F4k5NH3S8ussgsUI7ENrwWm3io;
        gWrwpDOz79pszaF gwrwpdoz79pszaf2 = gwrwpdoz79pszaf != null ? gwrwpdoz79pszaf : null;
        if (gwrwpdoz79pszaf2.ziNFA7KzVfc6) {
            return;
        }
        gwrwpdoz79pszaf2.startListening();
    }

    @Override // b.LKywEzQDxQLVc8H82ZH, b.nJMkSIuTHA4ytmN, android.app.Activity
    public final void onStop() {
        super.onStop();
        S3Q1dtDfB7lO3W s3Q1dtDfB7lO3W = this.xskpLJBhWb5xM802QFzgRuGk;
        if (s3Q1dtDfB7lO3W == null) {
            s3Q1dtDfB7lO3W = null;
        }
        FL0CFFY0euvWvPjBw1P8USTTCd fL0CFFY0euvWvPjBw1P8USTTCd = s3Q1dtDfB7lO3W.LYcdI4xpry8eXmFC9I4wyaLdcG1z;
        S3Q1dtDfB7lO3W.UV6K6VDbgDgzpi12QAEKN4Emq = SystemClock.elapsedRealtime();
        s3Q1dtDfB7lO3W.H5sQ15nhYoaKKHhx = false;
        gWrwpDOz79pszaF gwrwpdoz79pszaf = this.F4k5NH3S8ussgsUI7ENrwWm3io;
        gWrwpDOz79pszaF gwrwpdoz79pszaf2 = gwrwpdoz79pszaf != null ? gwrwpdoz79pszaf : null;
        if (gwrwpdoz79pszaf2.ziNFA7KzVfc6) {
            gwrwpdoz79pszaf2.stopListening();
        }
    }

    @Override // bitpit.launcher.ui.NniqwgLR9Jo6Bl9Px0S5u, b.qAu8xPQt71QSu59v2YrEcbg7z, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        S3Q1dtDfB7lO3W s3Q1dtDfB7lO3W = this.xskpLJBhWb5xM802QFzgRuGk;
        if (s3Q1dtDfB7lO3W == null) {
            s3Q1dtDfB7lO3W = null;
        }
        if (!z) {
            FL0CFFY0euvWvPjBw1P8USTTCd fL0CFFY0euvWvPjBw1P8USTTCd = s3Q1dtDfB7lO3W.LYcdI4xpry8eXmFC9I4wyaLdcG1z;
            s3Q1dtDfB7lO3W.HveD9n1tOYlffjJDxghBitYNgB = SystemClock.elapsedRealtime();
        }
        s3Q1dtDfB7lO3W.Ql6q60SSx3 = z;
        KGjoKHCGXMiM8O2q02X1Sb kGjoKHCGXMiM8O2q02X1Sb = this.XRnBzHfiQNSY0R7MyxLAJXUJFfM;
        if (kGjoKHCGXMiM8O2q02X1Sb == null) {
            kGjoKHCGXMiM8O2q02X1Sb = null;
        }
        if (z) {
            kGjoKHCGXMiM8O2q02X1Sb.WIXlfFpvH7glAGsUk3.post(new YwBT4ESCmAqS8d6lra4iy0u6E(6, kGjoKHCGXMiM8O2q02X1Sb));
        } else {
            kGjoKHCGXMiM8O2q02X1Sb.gsHzEVTj1SCIPR.clear();
            rGyAcDmmLfQTLDbPj.Companion.getClass();
            if (kGjoKHCGXMiM8O2q02X1Sb.LcvPFGYKhAm4SS5FZ != 0) {
                kGjoKHCGXMiM8O2q02X1Sb.LcvPFGYKhAm4SS5FZ = 0;
                kGjoKHCGXMiM8O2q02X1Sb.S1zP5M3X7Ukq3ROlZ87G9I().BezslBgjveK3hODH(0);
            }
        }
        qakwcvVaTwptUfUa5 qakwcvvatwptufua5 = this.zCdRGk6THJnQtkzb;
        qakwcvVaTwptUfUa5 qakwcvvatwptufua6 = qakwcvvatwptufua5 != null ? qakwcvvatwptufua5 : null;
        if (z) {
            qakwcvvatwptufua6.BezslBgjveK3hODH();
            return;
        }
        qakwcvvatwptufua6.S1zP5M3X7Ukq3ROlZ87G9I().removeCallbacks(qakwcvvatwptufua6.qaDSpeex0Oo1Qvt3oOrTJnbcQFp);
        ViewTreeObserver viewTreeObserver = qakwcvvatwptufua6.S1zP5M3X7Ukq3ROlZ87G9I().getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnDrawListener(qakwcvvatwptufua6.sCPtafveBAhdLIs2ajN3WV);
        }
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z
    public final ViewGroup qaDSpeex0Oo1Qvt3oOrTJnbcQFp() {
        ViewGroup viewGroup = this.vtXr3xr3vQMVMTW;
        if (viewGroup != null) {
            return viewGroup;
        }
        return null;
    }

    @Override // android.app.Activity
    public final void recreate() {
        if (!this.xu9cB1KZ6CllX || this.GO8WUug7ZWFCUI1zY.JY5knQmh7EQJEZ.S1zP5M3X7Ukq3ROlZ87G9I(b6SghWTw4DZwFdwjzwqQSUYD.gsHzEVTj1SCIPR)) {
            super.recreate();
        }
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z
    public final ZUboA6FxcG5CkT3ZuNeq sCPtafveBAhdLIs2ajN3WV() {
        return ZUboA6FxcG5CkT3ZuNeq.GO8WUug7ZWFCUI1zY;
    }

    @Override // android.app.Activity
    public final void startSearch(String str, boolean z, Bundle bundle, boolean z2) {
        wW4vjJYXED6OMqHRW ww4vjjyxed6omqhrw = this.ItAWeK8V06gR8MpzH;
        if (ww4vjjyxed6omqhrw == null) {
            ww4vjjyxed6omqhrw = null;
        }
        ww4vjjyxed6omqhrw.axL8FocTDLUdzg0XScbO(str, z);
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z
    public final void tdNmBZIJHG1(boolean z) {
        ViewGroup viewGroup = this.WwLbT8A1DREUOMGqEk;
        if (viewGroup == null) {
            viewGroup = null;
        }
        viewGroup.setDescendantFocusability(z ? 393216 : 131072);
        ViewGroup viewGroup2 = this.WwLbT8A1DREUOMGqEk;
        View viewFindFocus = (viewGroup2 != null ? viewGroup2 : null).findFocus();
        if (viewFindFocus != null) {
            viewFindFocus.clearFocus();
        }
    }

    public final void vHDGcerxdYUGlVld2h() {
        AlphabetWaveView alphabetWaveView = this.X2LqfJkLDth1lHwRgNL5jfPDt00O2;
        Rect rect = null;
        rect = null;
        if (alphabetWaveView == null) {
            alphabetWaveView = null;
        }
        msN9fKEefAIkohzW msn9fkeefaikohzw = this.W990VlXItKZEUxjpiAhHWCW0;
        if (msn9fkeefaikohzw == null) {
            msn9fkeefaikohzw = null;
        }
        if (msn9fkeefaikohzw.yM5HHkk1MhPLZFYTHm2JjrArud && !msn9fkeefaikohzw.FzogU2bPCQtD6a1hMYB1kyti) {
            pfRaBqECe5pV80vi pfrabqece5pv80vi = this.ymQF046nqhMXpxNsXtOg;
            int i = (pfrabqece5pv80vi == null ? null : pfrabqece5pv80vi).sCPtafveBAhdLIs2ajN3WV.axL8FocTDLUdzg0XScbO + (pfrabqece5pv80vi == null ? null : pfrabqece5pv80vi).cVfIGUKLEqID1HH;
            if (pfrabqece5pv80vi == null) {
                pfrabqece5pv80vi = null;
            }
            int i2 = (pfrabqece5pv80vi.czGAefXQxIZzo / 2) + i;
            AlphabetWaveView alphabetWaveView2 = this.X2LqfJkLDth1lHwRgNL5jfPDt00O2;
            if (alphabetWaveView2 == null) {
                alphabetWaveView2 = null;
            }
            int width = alphabetWaveView2.getWidth();
            AlphabetWaveView alphabetWaveView3 = this.X2LqfJkLDth1lHwRgNL5jfPDt00O2;
            rect = new Rect(0, i2, width, (alphabetWaveView3 != null ? alphabetWaveView3 : null).getHeight());
        }
        alphabetWaveView.setClipBounds(rect);
    }

    public final void yZj7bj6KyeuYi9woqDlC() {
        ViewGroup viewGroup = this.vtXr3xr3vQMVMTW;
        if (viewGroup == null) {
            viewGroup = null;
        }
        int childCount = viewGroup.getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                return;
            }
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof CloseAppAnimationView) {
                ((CloseAppAnimationView) childAt).S1zP5M3X7Ukq3ROlZ87G9I();
            }
        }
    }
}
