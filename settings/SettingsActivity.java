package bitpit.launcher.settings;

import android.os.Bundle;
import android.view.ViewGroup;
import b.BocJheSwDYKoclT;
import b.C6QK4ofHI3PMsCdB5gHo5Q;
import b.EOtsfqwLeTYnKWo;
import b.FBt4N9gMbTjpN;
import b.FZnP9ijPzvOTXKvJgDC8k;
import b.GZnU2p3i2qStYb;
import b.JHnppaRJDZMMWaOU5cgIw;
import b.KjpLK4IQzcoI;
import b.LqH09V6V7Wln;
import b.OkhdZkC3NYLW;
import b.Rf5D6NOIZm5CNoR4kEegvnPlfQ;
import b.Rfp0CprLjJaYY8aiYk;
import b.S95jvT8jvhnY;
import b.U5aMVCG8wpBKO6GL0Y;
import b.VrpXranFBK8;
import b.WJdoiEumjlSq4thRU0NNS;
import b.XQCixPMPkXDW6;
import b.ZUboA6FxcG5CkT3ZuNeq;
import b.b6SghWTw4DZwFdwjzwqQSUYD;
import b.bfRzmrSrA0S2m;
import b.cdjHGKliASEP50WE;
import b.hM3KtTxZoCPTxtWIwH5nGdMqbFs;
import b.iHPHZIrmzz0Nhav1OcnsAYxx7Sm1;
import b.iXYuiKB6hlvuKua28Q9sCxO11f;
import b.k3HorVrck7OL;
import b.lcSH5kzWGFN;
import b.mHW63SUma8isGb;
import b.mnmfBlKBEoBp0HBR;
import b.nfZTwjhBuOUgm8Ip;
import b.nmXVdLD3wuhaqezxBBvorxOjwLT;
import b.pE6zh38jZw;
import b.pMtryS1pfa06jCDW5l5K89;
import b.qAu8xPQt71QSu59v2YrEcbg7z;
import b.qSDYaDqxbBy2QEeVAcFRy;
import b.rQ9HJYgnWGlaj05E54n4BwVJQ8oK;
import b.rbpFGdpgDCAQXat;
import b.uuyTGGFjNDiF1SxHW;
import b.vE8fKiDsTteVxGTFj1KG5DyRHnRpG;
import b.zG00SFXQdEpsUm2PH2lfVfb;
import bitpit.launcher.R;
import bitpit.launcher.theming.NniqwgLR9Jo6Bl9Px0S5u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes.dex */
public final class SettingsActivity extends qAu8xPQt71QSu59v2YrEcbg7z {
    public static final bfRzmrSrA0S2m Companion;
    public static final /* synthetic */ GZnU2p3i2qStYb[] ymQF046nqhMXpxNsXtOg;
    public final Rf5D6NOIZm5CNoR4kEegvnPlfQ GtGIZrsiVJNzid1Vu8XK;
    public final XQCixPMPkXDW6 LkMPQqEJluZFFX0mL;
    public ViewGroup N1ENDx3UBC9JxmcGQyn59aqjOM;
    public pMtryS1pfa06jCDW5l5K89 iXk6STWDu48PQFwNyHwi2a;
    public final mHW63SUma8isGb ra4eheLgdhUxuEZ9vbYShAWJ = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new k3HorVrck7OL(this, 0));
    public final mHW63SUma8isGb NceuzZQj3FhQAg0L = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new k3HorVrck7OL(this, 1));
    public final mHW63SUma8isGb lgJtMcdLJn14MkPMn = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new k3HorVrck7OL(this, 2));

    static {
        U5aMVCG8wpBKO6GL0Y u5aMVCG8wpBKO6GL0Y = new U5aMVCG8wpBKO6GL0Y(SettingsActivity.class, "shouldAlwaysAllowLandscapeMode", "getShouldAlwaysAllowLandscapeMode()Z", 0);
        JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I.getClass();
        ymQF046nqhMXpxNsXtOg = new GZnU2p3i2qStYb[]{u5aMVCG8wpBKO6GL0Y};
        Companion = new bfRzmrSrA0S2m();
    }

    public SettingsActivity() {
        XQCixPMPkXDW6 xQCixPMPkXDW6S1zP5M3X7Ukq3ROlZ87G9I = iXYuiKB6hlvuKua28Q9sCxO11f.S1zP5M3X7Ukq3ROlZ87G9I(iR1XUIc7FjhMl57O(), "bitpit.launcher.key.ALWAYS_ALLOW_LANDSCAPE_MODE", false);
        zG00SFXQdEpsUm2PH2lfVfb zg00sfxqdepsum2ph2lfvfb = this.GO8WUug7ZWFCUI1zY;
        FBt4N9gMbTjpN fBt4N9gMbTjpN = new FBt4N9gMbTjpN(23, this);
        if (zg00sfxqdepsum2ph2lfvfb.JY5knQmh7EQJEZ.compareTo(b6SghWTw4DZwFdwjzwqQSUYD.GO8WUug7ZWFCUI1zY) <= 0) {
            uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("Cannot add a listener to a destroyed lifecycle");
            throw null;
        }
        mnmfBlKBEoBp0HBR mnmfblkbeobp0hbr = new mnmfBlKBEoBp0HBR(0, xQCixPMPkXDW6S1zP5M3X7Ukq3ROlZ87G9I, fBt4N9gMbTjpN);
        zg00sfxqdepsum2ph2lfvfb.S1zP5M3X7Ukq3ROlZ87G9I(new VrpXranFBK8(zg00sfxqdepsum2ph2lfvfb, xQCixPMPkXDW6S1zP5M3X7Ukq3ROlZ87G9I, mnmfblkbeobp0hbr, 0));
        xQCixPMPkXDW6S1zP5M3X7Ukq3ROlZ87G9I.BezslBgjveK3hODH.registerOnSharedPreferenceChangeListener(mnmfblkbeobp0hbr);
        this.LkMPQqEJluZFFX0mL = xQCixPMPkXDW6S1zP5M3X7Ukq3ROlZ87G9I;
        this.GtGIZrsiVJNzid1Vu8XK = new Rf5D6NOIZm5CNoR4kEegvnPlfQ(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(BocJheSwDYKoclT.class), new S95jvT8jvhnY(this, 1), new S95jvT8jvhnY(this, 0), new S95jvT8jvhnY(this, 2));
        new LinkedHashMap();
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z
    public final boolean cVfIGUKLEqID1HH() {
        hM3KtTxZoCPTxtWIwH5nGdMqbFs hm3kttxzocptxtwiwh5ngdmqbfsGO8WUug7ZWFCUI1zY = GO8WUug7ZWFCUI1zY();
        if (hm3kttxzocptxtwiwh5ngdmqbfsGO8WUug7ZWFCUI1zY.f2sXlW3st0rAKJwyOrCfOWc() > 0) {
            hm3kttxzocptxtwiwh5ngdmqbfsGO8WUug7ZWFCUI1zY.jvttfmFMQfShe6OfbNf1zF8CyEu();
            return true;
        }
        pMtryS1pfa06jCDW5l5K89 pmtrys1pfa06jcdw5l5k89 = this.iXk6STWDu48PQFwNyHwi2a;
        if (pmtrys1pfa06jcdw5l5k89 == null) {
            pmtrys1pfa06jcdw5l5k89 = null;
        }
        vE8fKiDsTteVxGTFj1KG5DyRHnRpG ve8fkidsttevxgtfj1kg5dyrhnrpg = (vE8fKiDsTteVxGTFj1KG5DyRHnRpG) pmtrys1pfa06jcdw5l5k89.S1zP5M3X7Ukq3ROlZ87G9I.WIXlfFpvH7glAGsUk3;
        if (ve8fkidsttevxgtfj1kg5dyrhnrpg == null) {
            f2sXlW3st0rAKJwyOrCfOWc().ziNFA7KzVfc6();
            return false;
        }
        pmtrys1pfa06jcdw5l5k89.ziNFA7KzVfc6.axL8FocTDLUdzg0XScbO(ve8fkidsttevxgtfj1kg5dyrhnrpg);
        return true;
    }

    public final BocJheSwDYKoclT czGAefXQxIZzo() {
        return (BocJheSwDYKoclT) this.GtGIZrsiVJNzid1Vu8XK.getValue();
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_top, R.anim.slide_out_bottom);
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z
    public final FZnP9ijPzvOTXKvJgDC8k gsHzEVTj1SCIPR() {
        return czGAefXQxIZzo().cCmbv8Tzd2QLd161ImIZUlZ8n.BezslBgjveK3hODH();
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z, b.nJMkSIuTHA4ytmN, b.QKXpIUPLGn, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object rfp0CprLjJaYY8aiYk;
        SettingsScreen settingsScreen;
        SettingsScreen settingsScreen2;
        WJdoiEumjlSq4thRU0NNS wJdoiEumjlSq4thRU0NNS;
        super.onCreate(bundle);
        yZj7bj6KyeuYi9woqDlC();
        setTheme(((NniqwgLR9Jo6Bl9Px0S5u) J1BE9tYH1em4X1uAhc6L7f4M()).jvttfmFMQfShe6OfbNf1zF8CyEu.S1zP5M3X7Ukq3ROlZ87G9I.tzMOyOc53ffl ? R.style.DefaultTheme_Black : R.style.DefaultTheme);
        getTheme().applyStyle(R.style.ThemeOverlay_SystemBars_Transparent, true);
        rQ9HJYgnWGlaj05E54n4BwVJQ8oK.BezslBgjveK3hODH(getWindow());
        setContentView(R.layout.settings_activity);
        this.N1ENDx3UBC9JxmcGQyn59aqjOM = (ViewGroup) findViewById(R.id.root_view);
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra("extra_entry_point_screen");
            if (stringExtra != null) {
                try {
                    C6QK4ofHI3PMsCdB5gHo5Q c6QK4ofHI3PMsCdB5gHo5Q = nmXVdLD3wuhaqezxBBvorxOjwLT.Companion;
                    SettingsScreen[] settingsScreenArrValues = SettingsScreen.values();
                    int length = settingsScreenArrValues.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            settingsScreen2 = null;
                            break;
                        }
                        SettingsScreen settingsScreen3 = settingsScreenArrValues[i];
                        if (OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(settingsScreen3.getSerialized(), stringExtra)) {
                            settingsScreen2 = settingsScreen3;
                            break;
                        }
                        i++;
                    }
                    if (settingsScreen2 == null) {
                        throw new SerializationException("Invalid serialized form: " + ((Object) stringExtra));
                    }
                    rfp0CprLjJaYY8aiYk = settingsScreen2;
                } catch (Throwable th) {
                    rfp0CprLjJaYY8aiYk = new Rfp0CprLjJaYY8aiYk(th);
                }
                boolean z = rfp0CprLjJaYY8aiYk instanceof Rfp0CprLjJaYY8aiYk;
                Object obj = rfp0CprLjJaYY8aiYk;
                if (z) {
                    obj = null;
                }
                settingsScreen = (SettingsScreen) obj;
            } else {
                settingsScreen = null;
            }
            if (settingsScreen != null) {
                BocJheSwDYKoclT bocJheSwDYKoclTCzGAefXQxIZzo = czGAefXQxIZzo();
                String key = settingsScreen.getKey();
                ArrayList arrayListHveD9n1tOYlffjJDxghBitYNgB = KjpLK4IQzcoI.HveD9n1tOYlffjJDxghBitYNgB(bocJheSwDYKoclTCzGAefXQxIZzo.Rdzg08aYlt0UsoLUNug9cESzgAY9R);
                while (true) {
                    if (arrayListHveD9n1tOYlffjJDxghBitYNgB.isEmpty()) {
                        wJdoiEumjlSq4thRU0NNS = null;
                        break;
                    }
                    wJdoiEumjlSq4thRU0NNS = (WJdoiEumjlSq4thRU0NNS) arrayListHveD9n1tOYlffjJDxghBitYNgB.remove(0);
                    if (wJdoiEumjlSq4thRU0NNS.GO8WUug7ZWFCUI1zY.equals(key)) {
                        break;
                    }
                    Iterator it = wJdoiEumjlSq4thRU0NNS.ziNFA7KzVfc6().iterator();
                    while (it.hasNext()) {
                        arrayListHveD9n1tOYlffjJDxghBitYNgB.add((WJdoiEumjlSq4thRU0NNS) it.next());
                    }
                }
                if (wJdoiEumjlSq4thRU0NNS == null) {
                    cdjHGKliASEP50WE.S1zP5M3X7Ukq3ROlZ87G9I.LYcdI4xpry8eXmFC9I4wyaLdcG1z(new IllegalStateException("Requested settings entry point not in settings tree"));
                } else {
                    bocJheSwDYKoclTCzGAefXQxIZzo.cCmbv8Tzd2QLd161ImIZUlZ8n = wJdoiEumjlSq4thRU0NNS;
                }
            }
        }
        WJdoiEumjlSq4thRU0NNS wJdoiEumjlSq4thRU0NNS2 = czGAefXQxIZzo().cCmbv8Tzd2QLd161ImIZUlZ8n;
        this.iXk6STWDu48PQFwNyHwi2a = wJdoiEumjlSq4thRU0NNS2.axL8FocTDLUdzg0XScbO(this, new vE8fKiDsTteVxGTFj1KG5DyRHnRpG(wJdoiEumjlSq4thRU0NNS2, wJdoiEumjlSq4thRU0NNS2.S1zP5M3X7Ukq3ROlZ87G9I(this, new nfZTwjhBuOUgm8Ip(this)), (Object) null, 24));
        czGAefXQxIZzo().WIXlfFpvH7glAGsUk3 = this;
        BocJheSwDYKoclT bocJheSwDYKoclTCzGAefXQxIZzo2 = czGAefXQxIZzo();
        bocJheSwDYKoclTCzGAefXQxIZzo2.S1zP5M3X7Ukq3ROlZ87G9I(bocJheSwDYKoclTCzGAefXQxIZzo2.cCmbv8Tzd2QLd161ImIZUlZ8n);
        ((EOtsfqwLeTYnKWo) ((lcSH5kzWGFN) this.ra4eheLgdhUxuEZ9vbYShAWJ.getValue())).BezslBgjveK3hODH(iHPHZIrmzz0Nhav1OcnsAYxx7Sm1.ox9eclwMpRd((iHPHZIrmzz0Nhav1OcnsAYxx7Sm1) this.lgJtMcdLJn14MkPMn.getValue(), "rate_prompt_settings_probability"));
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z, b.LKywEzQDxQLVc8H82ZH, b.nJMkSIuTHA4ytmN, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        pMtryS1pfa06jCDW5l5K89 pmtrys1pfa06jcdw5l5k89 = this.iXk6STWDu48PQFwNyHwi2a;
        if (pmtrys1pfa06jcdw5l5k89 == null) {
            pmtrys1pfa06jcdw5l5k89 = null;
        }
        pmtrys1pfa06jcdw5l5k89.S1zP5M3X7Ukq3ROlZ87G9I();
        BocJheSwDYKoclT bocJheSwDYKoclTCzGAefXQxIZzo = czGAefXQxIZzo();
        if (OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(bocJheSwDYKoclTCzGAefXQxIZzo.WIXlfFpvH7glAGsUk3, this)) {
            bocJheSwDYKoclTCzGAefXQxIZzo.WIXlfFpvH7glAGsUk3 = null;
        }
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z, b.LKywEzQDxQLVc8H82ZH, b.nJMkSIuTHA4ytmN, android.app.Activity
    public final void onStart() {
        super.onStart();
        rbpFGdpgDCAQXat.ziNFA7KzVfc6(LqH09V6V7Wln.Aboow6rUrcY2SrFRa46C6uy(this), null, 0, new pE6zh38jZw(this, null, 23), 3);
        pMtryS1pfa06jCDW5l5K89 pmtrys1pfa06jcdw5l5k89 = this.iXk6STWDu48PQFwNyHwi2a;
        ((WJdoiEumjlSq4thRU0NNS) (pmtrys1pfa06jcdw5l5k89 != null ? pmtrys1pfa06jcdw5l5k89 : null).S1zP5M3X7Ukq3ROlZ87G9I.Rdzg08aYlt0UsoLUNug9cESzgAY9R).ox9eclwMpRd();
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z
    public final ViewGroup qaDSpeex0Oo1Qvt3oOrTJnbcQFp() {
        ViewGroup viewGroup = this.N1ENDx3UBC9JxmcGQyn59aqjOM;
        if (viewGroup != null) {
            return viewGroup;
        }
        return null;
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z
    public final ZUboA6FxcG5CkT3ZuNeq sCPtafveBAhdLIs2ajN3WV() {
        return ZUboA6FxcG5CkT3ZuNeq.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    }

    public final void yZj7bj6KyeuYi9woqDlC() {
        GZnU2p3i2qStYb gZnU2p3i2qStYb = ymQF046nqhMXpxNsXtOg[0];
        setRequestedOrientation((((Boolean) this.LkMPQqEJluZFFX0mL.S1zP5M3X7Ukq3ROlZ87G9I()).booleanValue() || getResources().getBoolean(R.bool.is_tablet)) ? -1 : 5);
    }
}
