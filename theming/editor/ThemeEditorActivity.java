package bitpit.launcher.theming.editor;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import b.B02bFCC1FS8AcUyF87x5Z;
import b.C86kuN7RW1sU9gkzh10QEkPcLl;
import b.GsmfcDlEOKdXJqNx4;
import b.JHnppaRJDZMMWaOU5cgIw;
import b.LqH09V6V7Wln;
import b.Rf5D6NOIZm5CNoR4kEegvnPlfQ;
import b.TYcC5PUX0l9;
import b.VakjWjkrVf1;
import b.YcxZzIBwlnfeFQF30Mya4TC7Bd9e;
import b.ZUboA6FxcG5CkT3ZuNeq;
import b.ZfVTz8eNQNPc8Jg2BqHZIB;
import b.bvdM3ygDUZL;
import b.gT4sTdpjS277wbG60pk72fHWG7;
import b.j1mrIRjYKLp7IIwdR9c;
import b.mHW63SUma8isGb;
import b.mIRAh3PBGe8whGSCNLDU;
import b.oUjWr5Yscp8hIk;
import b.qAu8xPQt71QSu59v2YrEcbg7z;
import b.qSDYaDqxbBy2QEeVAcFRy;
import b.rQ9HJYgnWGlaj05E54n4BwVJQ8oK;
import b.rbpFGdpgDCAQXat;
import b.sYdaNWnYS5vuuA89cJ9eb;
import b.uTRDzfjsCa;
import b.xAH8gdKN7HdD1B0F793;
import b.xjArJznjoERN;
import bitpit.launcher.R;
import bitpit.launcher.theming.NniqwgLR9Jo6Bl9Px0S5u;
import bitpit.launcher.theming.editor.ThemeEditorActivity;

/* JADX INFO: loaded from: classes.dex */
public final class ThemeEditorActivity extends qAu8xPQt71QSu59v2YrEcbg7z {
    public static final YcxZzIBwlnfeFQF30Mya4TC7Bd9e Companion = new YcxZzIBwlnfeFQF30Mya4TC7Bd9e();
    public ViewGroup LkMPQqEJluZFFX0mL;
    public final ZUboA6FxcG5CkT3ZuNeq ra4eheLgdhUxuEZ9vbYShAWJ = ZUboA6FxcG5CkT3ZuNeq.WIXlfFpvH7glAGsUk3;
    public final mHW63SUma8isGb NceuzZQj3FhQAg0L = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new mIRAh3PBGe8whGSCNLDU(10, this));
    public final Rf5D6NOIZm5CNoR4kEegvnPlfQ lgJtMcdLJn14MkPMn = new Rf5D6NOIZm5CNoR4kEegvnPlfQ(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(xAH8gdKN7HdD1B0F793.class), new bvdM3ygDUZL(this, 1), new bvdM3ygDUZL(this, 0), new bvdM3ygDUZL(this, 2));

    public final boolean czGAefXQxIZzo() {
        String type = getIntent().getType();
        return (type == null || TYcC5PUX0l9.HveD9n1tOYlffjJDxghBitYNgB(type, "image/", false)) ? false : true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:53:0x0122  */
    /* JADX WARN: Code duplicated, block: B:57:0x013c  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z, b.nJMkSIuTHA4ytmN, b.QKXpIUPLGn, android.app.Activity
    public final void onCreate(Bundle bundle) {
        sYdaNWnYS5vuuA89cJ9eb sydanwnys5vuua89cj9ebAxL8FocTDLUdzg0XScbO;
        String type;
        Uri data;
        super.onCreate(bundle);
        setTheme(((NniqwgLR9Jo6Bl9Px0S5u) J1BE9tYH1em4X1uAhc6L7f4M()).jvttfmFMQfShe6OfbNf1zF8CyEu.S1zP5M3X7Ukq3ROlZ87G9I.tzMOyOc53ffl ? R.style.TransparentTheme_Black : R.style.TransparentTheme);
        rQ9HJYgnWGlaj05E54n4BwVJQ8oK.BezslBgjveK3hODH(getWindow());
        setContentView(R.layout.fragment_activity);
        this.LkMPQqEJluZFFX0mL = (ViewGroup) findViewById(R.id.root_view);
        final int i = 0;
        GO8WUug7ZWFCUI1zY().PoRwkUUfcmwTiLMm("themeEditor", this, new C86kuN7RW1sU9gkzh10QEkPcLl(this) { // from class: b.Jx5Tby95Ze9y81yGqPhmW
            public final /* synthetic */ ThemeEditorActivity Rdzg08aYlt0UsoLUNug9cESzgAY9R;

            {
                this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = this;
            }

            @Override // b.C86kuN7RW1sU9gkzh10QEkPcLl
            public final void S1zP5M3X7Ukq3ROlZ87G9I(Bundle bundle2, String str) {
                int i2 = i;
                ThemeEditorActivity themeEditorActivity = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
                switch (i2) {
                    case 0:
                        YcxZzIBwlnfeFQF30Mya4TC7Bd9e ycxZzIBwlnfeFQF30Mya4TC7Bd9e = ThemeEditorActivity.Companion;
                        themeEditorActivity.setResult(bundle2.getBoolean("hasAppliedWallpaper") ? -1 : 0);
                        themeEditorActivity.finish();
                        break;
                    default:
                        YcxZzIBwlnfeFQF30Mya4TC7Bd9e ycxZzIBwlnfeFQF30Mya4TC7Bd9e2 = ThemeEditorActivity.Companion;
                        QC10gg8FtWqhPEXgF6JafOCDg.Companion.getClass();
                        String string = bundle2.getString("location");
                        vOL3U3fINHMmdVoJz vol3u3finhmmdvojz = null;
                        HlCAZbf4GQAQgn hlCAZbf4GQAQgnValueOf = string != null ? HlCAZbf4GQAQgn.valueOf(string) : null;
                        if (!themeEditorActivity.czGAefXQxIZzo() && hlCAZbf4GQAQgnValueOf != null) {
                            Uri data2 = themeEditorActivity.getIntent().getData();
                            if (data2 != null) {
                                int iOrdinal = hlCAZbf4GQAQgnValueOf.ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal != 1) {
                                        if (iOrdinal != 2) {
                                            LTC5BQy9XspuFiw.axL8FocTDLUdzg0XScbO();
                                        } else {
                                            sYdaNWnYS5vuuA89cJ9eb.Companion.getClass();
                                            themeEditorActivity.yZj7bj6KyeuYi9woqDlC(ZfVTz8eNQNPc8Jg2BqHZIB.S1zP5M3X7Ukq3ROlZ87G9I(data2, 2));
                                        }
                                        break;
                                    } else {
                                        xAH8gdKN7HdD1B0F793 xah8gdkn7hdd1b0f793 = (xAH8gdKN7HdD1B0F793) themeEditorActivity.lgJtMcdLJn14MkPMn.getValue();
                                        ZUboA6FxcG5CkT3ZuNeq zUboA6FxcG5CkT3ZuNeq = themeEditorActivity.ra4eheLgdhUxuEZ9vbYShAWJ;
                                        CmUECThaulvcM4E cmUECThaulvcM4E = xah8gdkn7hdd1b0f793.WIXlfFpvH7glAGsUk3;
                                        Object value = cmUECThaulvcM4E.getValue();
                                        TXlVNIHshnkDFx7qtgvMY3K1kUgj tXlVNIHshnkDFx7qtgvMY3K1kUgj = TXlVNIHshnkDFx7qtgvMY3K1kUgj.S1zP5M3X7Ukq3ROlZ87G9I;
                                        if (!OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(value, tXlVNIHshnkDFx7qtgvMY3K1kUgj)) {
                                            cmUECThaulvcM4E.fXBtMGfTIjGSHgK542(null, tXlVNIHshnkDFx7qtgvMY3K1kUgj);
                                            rbpFGdpgDCAQXat.ziNFA7KzVfc6(FpXtcGqmjCSqKnGnE78.ox9eclwMpRd(xah8gdkn7hdd1b0f793), null, 0, new E7fO9cCdrJY5E(xah8gdkn7hdd1b0f793, zUboA6FxcG5CkT3ZuNeq, data2, vol3u3finhmmdvojz, 7), 3);
                                            break;
                                        }
                                    }
                                } else {
                                    sYdaNWnYS5vuuA89cJ9eb.Companion.getClass();
                                    themeEditorActivity.yZj7bj6KyeuYi9woqDlC(ZfVTz8eNQNPc8Jg2BqHZIB.S1zP5M3X7Ukq3ROlZ87G9I(data2, 1));
                                    break;
                                }
                            } else {
                                uuyTGGFjNDiF1SxHW.PQQPeCDD0JLCT3aLz("Required value was null.");
                                break;
                            }
                        } else {
                            themeEditorActivity.setResult(0);
                            themeEditorActivity.finish();
                            break;
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        GO8WUug7ZWFCUI1zY().PoRwkUUfcmwTiLMm("wallpaperLocation", this, new C86kuN7RW1sU9gkzh10QEkPcLl(this) { // from class: b.Jx5Tby95Ze9y81yGqPhmW
            public final /* synthetic */ ThemeEditorActivity Rdzg08aYlt0UsoLUNug9cESzgAY9R;

            {
                this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = this;
            }

            @Override // b.C86kuN7RW1sU9gkzh10QEkPcLl
            public final void S1zP5M3X7Ukq3ROlZ87G9I(Bundle bundle2, String str) {
                int i3 = i2;
                ThemeEditorActivity themeEditorActivity = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
                switch (i3) {
                    case 0:
                        YcxZzIBwlnfeFQF30Mya4TC7Bd9e ycxZzIBwlnfeFQF30Mya4TC7Bd9e = ThemeEditorActivity.Companion;
                        themeEditorActivity.setResult(bundle2.getBoolean("hasAppliedWallpaper") ? -1 : 0);
                        themeEditorActivity.finish();
                        break;
                    default:
                        YcxZzIBwlnfeFQF30Mya4TC7Bd9e ycxZzIBwlnfeFQF30Mya4TC7Bd9e2 = ThemeEditorActivity.Companion;
                        QC10gg8FtWqhPEXgF6JafOCDg.Companion.getClass();
                        String string = bundle2.getString("location");
                        vOL3U3fINHMmdVoJz vol3u3finhmmdvojz = null;
                        HlCAZbf4GQAQgn hlCAZbf4GQAQgnValueOf = string != null ? HlCAZbf4GQAQgn.valueOf(string) : null;
                        if (!themeEditorActivity.czGAefXQxIZzo() && hlCAZbf4GQAQgnValueOf != null) {
                            Uri data2 = themeEditorActivity.getIntent().getData();
                            if (data2 != null) {
                                int iOrdinal = hlCAZbf4GQAQgnValueOf.ordinal();
                                if (iOrdinal != 0) {
                                    if (iOrdinal != 1) {
                                        if (iOrdinal != 2) {
                                            LTC5BQy9XspuFiw.axL8FocTDLUdzg0XScbO();
                                        } else {
                                            sYdaNWnYS5vuuA89cJ9eb.Companion.getClass();
                                            themeEditorActivity.yZj7bj6KyeuYi9woqDlC(ZfVTz8eNQNPc8Jg2BqHZIB.S1zP5M3X7Ukq3ROlZ87G9I(data2, 2));
                                        }
                                        break;
                                    } else {
                                        xAH8gdKN7HdD1B0F793 xah8gdkn7hdd1b0f793 = (xAH8gdKN7HdD1B0F793) themeEditorActivity.lgJtMcdLJn14MkPMn.getValue();
                                        ZUboA6FxcG5CkT3ZuNeq zUboA6FxcG5CkT3ZuNeq = themeEditorActivity.ra4eheLgdhUxuEZ9vbYShAWJ;
                                        CmUECThaulvcM4E cmUECThaulvcM4E = xah8gdkn7hdd1b0f793.WIXlfFpvH7glAGsUk3;
                                        Object value = cmUECThaulvcM4E.getValue();
                                        TXlVNIHshnkDFx7qtgvMY3K1kUgj tXlVNIHshnkDFx7qtgvMY3K1kUgj = TXlVNIHshnkDFx7qtgvMY3K1kUgj.S1zP5M3X7Ukq3ROlZ87G9I;
                                        if (!OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(value, tXlVNIHshnkDFx7qtgvMY3K1kUgj)) {
                                            cmUECThaulvcM4E.fXBtMGfTIjGSHgK542(null, tXlVNIHshnkDFx7qtgvMY3K1kUgj);
                                            rbpFGdpgDCAQXat.ziNFA7KzVfc6(FpXtcGqmjCSqKnGnE78.ox9eclwMpRd(xah8gdkn7hdd1b0f793), null, 0, new E7fO9cCdrJY5E(xah8gdkn7hdd1b0f793, zUboA6FxcG5CkT3ZuNeq, data2, vol3u3finhmmdvojz, 7), 3);
                                            break;
                                        }
                                    }
                                } else {
                                    sYdaNWnYS5vuuA89cJ9eb.Companion.getClass();
                                    themeEditorActivity.yZj7bj6KyeuYi9woqDlC(ZfVTz8eNQNPc8Jg2BqHZIB.S1zP5M3X7Ukq3ROlZ87G9I(data2, 1));
                                    break;
                                }
                            } else {
                                uuyTGGFjNDiF1SxHW.PQQPeCDD0JLCT3aLz("Required value was null.");
                                break;
                            }
                        } else {
                            themeEditorActivity.setResult(0);
                            themeEditorActivity.finish();
                            break;
                        }
                        break;
                }
            }
        });
        rbpFGdpgDCAQXat.ziNFA7KzVfc6(LqH09V6V7Wln.Aboow6rUrcY2SrFRa46C6uy(this), null, 0, new oUjWr5Yscp8hIk(this, null, i2), 3);
        if (bundle == null) {
            String action = getIntent().getAction();
            if (action != null) {
                switch (action.hashCode()) {
                    case -1401676846:
                        if (action.equals("android.service.wallpaper.CROP_AND_SET_WALLPAPER") && !czGAefXQxIZzo() && getIntent().getData() != null) {
                            uTRDzfjsCa utrdzfjsca = new uTRDzfjsCa(GO8WUug7ZWFCUI1zY());
                            utrdzfjsca.flPMk2Ix9h3b95v(R.id.fragment_container, utrdzfjsca.LYcdI4xpry8eXmFC9I4wyaLdcG1z(null, xjArJznjoERN.class), null, 2);
                            utrdzfjsca.PQQPeCDD0JLCT3aLz();
                        }
                        break;
                    case -1173264947:
                        if (action.equals("android.intent.action.SEND") && (type = getIntent().getType()) != null && TYcC5PUX0l9.HveD9n1tOYlffjJDxghBitYNgB(type, "image/", false)) {
                            Intent intent = getIntent();
                            Uri uri = (Uri) (gT4sTdpjS277wbG60pk72fHWG7.JY5knQmh7EQJEZ ? (Parcelable) intent.getParcelableExtra("android.intent.extra.STREAM", Uri.class) : intent.getParcelableExtra("android.intent.extra.STREAM"));
                            if (uri != null) {
                                sYdaNWnYS5vuuA89cJ9eb.Companion.getClass();
                                yZj7bj6KyeuYi9woqDlC(ZfVTz8eNQNPc8Jg2BqHZIB.S1zP5M3X7Ukq3ROlZ87G9I(uri, 3));
                            }
                        }
                        break;
                    case -1173171990:
                        if (action.equals("android.intent.action.VIEW")) {
                            ZfVTz8eNQNPc8Jg2BqHZIB zfVTz8eNQNPc8Jg2BqHZIB = sYdaNWnYS5vuuA89cJ9eb.Companion;
                            Bundle extras = getIntent().getExtras();
                            zfVTz8eNQNPc8Jg2BqHZIB.getClass();
                            sydanwnys5vuua89cj9ebAxL8FocTDLUdzg0XScbO = ZfVTz8eNQNPc8Jg2BqHZIB.axL8FocTDLUdzg0XScbO(extras);
                            if (sydanwnys5vuua89cj9ebAxL8FocTDLUdzg0XScbO != null) {
                                yZj7bj6KyeuYi9woqDlC(sydanwnys5vuua89cj9ebAxL8FocTDLUdzg0XScbO);
                            }
                        }
                        break;
                    case 2038242175:
                        if (action.equals("android.intent.action.ATTACH_DATA") && !czGAefXQxIZzo() && (data = getIntent().getData()) != null) {
                            sYdaNWnYS5vuuA89cJ9eb.Companion.getClass();
                            yZj7bj6KyeuYi9woqDlC(ZfVTz8eNQNPc8Jg2BqHZIB.S1zP5M3X7Ukq3ROlZ87G9I(data, 3));
                        }
                        break;
                }
                return;
            }
            ZfVTz8eNQNPc8Jg2BqHZIB zfVTz8eNQNPc8Jg2BqHZIB2 = sYdaNWnYS5vuuA89cJ9eb.Companion;
            Bundle extras2 = getIntent().getExtras();
            zfVTz8eNQNPc8Jg2BqHZIB2.getClass();
            sydanwnys5vuua89cj9ebAxL8FocTDLUdzg0XScbO = ZfVTz8eNQNPc8Jg2BqHZIB.axL8FocTDLUdzg0XScbO(extras2);
            if (sydanwnys5vuua89cj9ebAxL8FocTDLUdzg0XScbO != null) {
                yZj7bj6KyeuYi9woqDlC(sydanwnys5vuua89cj9ebAxL8FocTDLUdzg0XScbO);
                return;
            }
            setResult(0);
            finish();
        }
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
        return this.ra4eheLgdhUxuEZ9vbYShAWJ;
    }

    public final void yZj7bj6KyeuYi9woqDlC(sYdaNWnYS5vuuA89cJ9eb sydanwnys5vuua89cj9eb) {
        uTRDzfjsCa utrdzfjsca = new uTRDzfjsCa(GO8WUug7ZWFCUI1zY());
        utrdzfjsca.flPMk2Ix9h3b95v(R.id.fragment_container, utrdzfjsca.LYcdI4xpry8eXmFC9I4wyaLdcG1z(GsmfcDlEOKdXJqNx4.S1zP5M3X7Ukq3ROlZ87G9I(new B02bFCC1FS8AcUyF87x5Z("arg_wallpaper_source", sydanwnys5vuua89cj9eb.S1zP5M3X7Ukq3ROlZ87G9I), new B02bFCC1FS8AcUyF87x5Z("arg_application_strategy", j1mrIRjYKLp7IIwdR9c.Rdzg08aYlt0UsoLUNug9cESzgAY9R(sydanwnys5vuua89cj9eb.axL8FocTDLUdzg0XScbO))), VakjWjkrVf1.class), null, 2);
        utrdzfjsca.PQQPeCDD0JLCT3aLz();
    }
}
