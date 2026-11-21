package bitpit.launcher.theming;

import android.app.WallpaperColors;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import android.view.ContextThemeWrapper;
import b.A5porU7u8X1VonihuxSSB;
import b.AeQuqug4cjWl3vY5CUaNGtJ0l;
import b.B4VuABB1m6ytu26MxoUBytPiQ;
import b.CJI9fJNh1Q2PBYQKjHaT4Ef4H;
import b.CaIU5GnhTZOX;
import b.CmUECThaulvcM4E;
import b.DcCYZ00uLGz5DopIuEingorhi8ELc;
import b.ERGkrVYauE1;
import b.Emi5d0VyYZLZtm;
import b.GZnU2p3i2qStYb;
import b.GcJ3diO9dV0WWNY5MN5A9;
import b.GkEpHTllUQBkRob2X6;
import b.Gyx5iNzPN5hbJptykezC2wo;
import b.HDzaRKEI4SxljA;
import b.Hnv6Te9rrTA0VqZMo;
import b.JHnppaRJDZMMWaOU5cgIw;
import b.JwYrfEmVh5cLq99jiA5V2;
import b.KBAljZ4gNp;
import b.KTJUlzHnAh7a9Bh;
import b.KxMa18LIrAcX;
import b.LpRXf8zsxndinAW3;
import b.MT34qfvzSXQtPd1EA63;
import b.MVHpAPdve4;
import b.NMquq9o0FvRs5RyiTFrS;
import b.O1VE8grxm4nj1d;
import b.OkhdZkC3NYLW;
import b.OmuAja0gDG;
import b.POLYDU3BdDlat;
import b.PeLieoBN4yxYJZju3kQtKIsq7XL8;
import b.Reomk3IeDtk2enO3p4;
import b.Rfp0CprLjJaYY8aiYk;
import b.S4NQkiLIFBi;
import b.SCo4Ctd3zv2DHfczdi;
import b.SXPderDlYRFnia0Fx;
import b.SnehnOCu20dNNwjUly;
import b.T7bLXYJFPi0Yphv7AcXMz4qeX;
import b.TB9XgFDfvLRtLF;
import b.UTd7rzkLVEMWlpMBsEC;
import b.UlPBFNmBDW;
import b.UyZmyVQuKtDBvg7JbApYs0Bsa;
import b.V1ILteCyL3ENl;
import b.VmbK6PYRLAkydzCWkPIhMksv;
import b.WLZoEbRHGAYGtOeo6ZMxoLT9;
import b.XQCixPMPkXDW6;
import b.YTs4nWeytJKgOLnERNkwrb;
import b.Zo1YEZ6nT2Qsm9uBmmbXR;
import b.a05MjsTtylUXo;
import b.bMjZFECsuU6MdmSOqmYrlYsV3oEeB;
import b.cAOCGl5k5uCM8FvPCKC;
import b.cDYmJRU7q3PixwqqSKESq;
import b.cPphBbOpLsxF20;
import b.dlgqlTraJx3;
import b.eM3zq40gn9wbO038r2XTsRB;
import b.ePeofkcVTynxYThB4SKghg;
import b.eWPntzx23K;
import b.gD2rKVU295TtHvegz;
import b.gT4sTdpjS277wbG60pk72fHWG7;
import b.hUqvWgWzeJgjDE;
import b.ht9cc82PFVuTSlziixRsHlYU;
import b.iFDZzYzOvAXqFbRpTJa4rtD;
import b.iXYuiKB6hlvuKua28Q9sCxO11f;
import b.jA2DEPO9jFbEwXbrTexRrn;
import b.k5k3oiVTtVy70LV;
import b.kVlghxO2ZCrhns3hLgPpCNNG8nhEe;
import b.kjBkI9UgSN4k8Ij0Q0qZm;
import b.lu57g3hpixirwi8MEO;
import b.mkeB609Q34mPahD;
import b.otD5bQR0LtT;
import b.pob9VHWg0ny05T0ct13ri11UrwoE;
import b.qEwqqDvm9wKfnhETPc16M;
import b.qJy5uUbPQ1B2fNruHHuWNHFMESln;
import b.r79MMhDRaCjmDEnEC9XSmV;
import b.rFIOv4rH29IBPB69hahw9W;
import b.raCbApsSYtHAh9GLADn;
import b.rbpFGdpgDCAQXat;
import b.s9XnN7QTAJ;
import b.sEKry1ND5xKz7Ht2raVJx6dXY39zn;
import b.tIDTjdoK38;
import b.uuyTGGFjNDiF1SxHW;
import b.vOL3U3fINHMmdVoJz;
import b.x3H7wwOTOTOBlvzl0WJMm41FgYl;
import b.x4PcPRPmslEJW;
import b.xFsSkhbqTbJaCcPs5UY6QyfFLuTn;
import b.yOakydjtTd3XnUszCrtMlBu;
import b.zHfG9eBtghieLBn;
import b.zrw5z7iOPuv6y;
import bitpit.launcher.R;
import bitpit.launcher.theming.color_palette.ColorPalette;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class NniqwgLR9Jo6Bl9Px0S5u implements r79MMhDRaCjmDEnEC9XSmV, mkeB609Q34mPahD, sEKry1ND5xKz7Ht2raVJx6dXY39zn {
    public static final zrw5z7iOPuv6y Companion;
    public static final /* synthetic */ GZnU2p3i2qStYb[] hsgUkarQLKL1aF8JVboCqnbaz1;
    public final CmUECThaulvcM4E FzogU2bPCQtD6a1hMYB1kyti;
    public final zHfG9eBtghieLBn GO8WUug7ZWFCUI1zY;
    public final XQCixPMPkXDW6 IPi49brQACDpXJTJMp7;
    public final S4NQkiLIFBi J1BE9tYH1em4X1uAhc6L7f4M;
    public final ePeofkcVTynxYThB4SKghg LcvPFGYKhAm4SS5FZ;
    public final Reomk3IeDtk2enO3p4 Mej0x2K4ZGSUxtYNka4QZ;
    public final Context Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    public final JwYrfEmVh5cLq99jiA5V2 WIXlfFpvH7glAGsUk3;
    public final SharedPreferences cCmbv8Tzd2QLd161ImIZUlZ8n;
    public final XQCixPMPkXDW6 cVfIGUKLEqID1HH;
    public final UlPBFNmBDW czGAefXQxIZzo;
    public final LruCache f2sXlW3st0rAKJwyOrCfOWc;
    public final LpRXf8zsxndinAW3 gsHzEVTj1SCIPR;
    public final UlPBFNmBDW iR1XUIc7FjhMl57O;
    public final cAOCGl5k5uCM8FvPCKC jvttfmFMQfShe6OfbNf1zF8CyEu;
    public final AtomicBoolean nXIf4d0RGTWG1l;
    public WallpaperColorPalette qTa7aqjjB9Bt6mc;
    public final CJI9fJNh1Q2PBYQKjHaT4Ef4H qaDSpeex0Oo1Qvt3oOrTJnbcQFp = new CJI9fJNh1Q2PBYQKjHaT4Ef4H();
    public final WallpaperManager sCPtafveBAhdLIs2ajN3WV;
    public final LruCache tdNmBZIJHG1;
    public boolean tzMOyOc53ffl;
    public final CmUECThaulvcM4E yM5HHkk1MhPLZFYTHm2JjrArud;
    public boolean yZj7bj6KyeuYi9woqDlC;

    static {
        qEwqqDvm9wKfnhETPc16M qewqqdvm9wkfnhetpc16m = new qEwqqDvm9wKfnhETPc16M(NniqwgLR9Jo6Bl9Px0S5u.class, "themeColorOverride", "getThemeColorOverride()I", 0);
        JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I.getClass();
        hsgUkarQLKL1aF8JVboCqnbaz1 = new GZnU2p3i2qStYb[]{qewqqdvm9wkfnhetpc16m, new qEwqqDvm9wKfnhETPc16M(NniqwgLR9Jo6Bl9Px0S5u.class, "themeColorPalette", "getThemeColorPalette()Lbitpit/launcher/theming/color_palette/ColorPalette;", 0), new qEwqqDvm9wKfnhETPc16M(NniqwgLR9Jo6Bl9Px0S5u.class, "darkModeStrategy", "getDarkModeStrategy()I", 0), new qEwqqDvm9wKfnhETPc16M(NniqwgLR9Jo6Bl9Px0S5u.class, "textThemeModeStrategy", "getTextThemeModeStrategy()I", 0), new qEwqqDvm9wKfnhETPc16M(NniqwgLR9Jo6Bl9Px0S5u.class, "shiftWallpaper", "getShiftWallpaper()Z", 0)};
        Companion = new zrw5z7iOPuv6y();
    }

    /* JADX WARN: Type inference failed for: r5v21, types: [b.Qb0WD7M1xaDyEdUQ3Msnd] */
    public NniqwgLR9Jo6Bl9Px0S5u(zHfG9eBtghieLBn zhfg9ebtghielbn, Context context, SharedPreferences sharedPreferences, JwYrfEmVh5cLq99jiA5V2 jwYrfEmVh5cLq99jiA5V2, LpRXf8zsxndinAW3 lpRXf8zsxndinAW3, ePeofkcVTynxYThB4SKghg epeofkcvtynxythb4skghg, T7bLXYJFPi0Yphv7AcXMz4qeX t7bLXYJFPi0Yphv7AcXMz4qeX, KTJUlzHnAh7a9Bh kTJUlzHnAh7a9Bh) {
        WallpaperColorPalette wallpaperColorPalette;
        this.GO8WUug7ZWFCUI1zY = zhfg9ebtghielbn;
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = context;
        this.cCmbv8Tzd2QLd161ImIZUlZ8n = sharedPreferences;
        this.WIXlfFpvH7glAGsUk3 = jwYrfEmVh5cLq99jiA5V2;
        this.gsHzEVTj1SCIPR = lpRXf8zsxndinAW3;
        this.LcvPFGYKhAm4SS5FZ = epeofkcvtynxythb4skghg;
        WallpaperManager wallpaperManager = WallpaperManager.getInstance(context);
        this.sCPtafveBAhdLIs2ajN3WV = wallpaperManager;
        this.Mej0x2K4ZGSUxtYNka4QZ = new Reomk3IeDtk2enO3p4(new eWPntzx23K(2, this));
        String string = sharedPreferences.getString("bitpit.launcher.key.WALLPAPER_COLOR_PALETTE", null);
        this.qTa7aqjjB9Bt6mc = (string == null || (wallpaperColorPalette = (WallpaperColorPalette) lpRXf8zsxndinAW3.S1zP5M3X7Ukq3ROlZ87G9I(string, WallpaperColorPalette.Companion.serializer())) == null) ? new WallpaperColorPalette(0, null, null, 0) : wallpaperColorPalette;
        this.f2sXlW3st0rAKJwyOrCfOWc = new LruCache(5);
        this.iR1XUIc7FjhMl57O = new UlPBFNmBDW(iXYuiKB6hlvuKua28Q9sCxO11f.axL8FocTDLUdzg0XScbO(sharedPreferences, "bitpit.launcher.key.THEME_COLOR_OVERRIDE", 0), null);
        ColorPalette colorPaletteS1zP5M3X7Ukq3ROlZ87G9I = ((bitpit.launcher.theming.color_palette.NniqwgLR9Jo6Bl9Px0S5u) epeofkcvtynxythb4skghg).S1zP5M3X7Ukq3ROlZ87G9I();
        if (colorPaletteS1zP5M3X7Ukq3ROlZ87G9I == null) {
            ColorPalette.Companion.getClass();
            colorPaletteS1zP5M3X7Ukq3ROlZ87G9I = new ColorPalette(context.getColor(R.color.accent1_0500_niagara_blue), context.getColor(R.color.neutral1_0000_niagara_blue), 0, CustomMaterialYouColorFamily.NIAGARA_BLUE);
        }
        CmUECThaulvcM4E cmUECThaulvcM4ES1zP5M3X7Ukq3ROlZ87G9I = OmuAja0gDG.S1zP5M3X7Ukq3ROlZ87G9I(colorPaletteS1zP5M3X7Ukq3ROlZ87G9I);
        this.yM5HHkk1MhPLZFYTHm2JjrArud = cmUECThaulvcM4ES1zP5M3X7Ukq3ROlZ87G9I;
        this.FzogU2bPCQtD6a1hMYB1kyti = cmUECThaulvcM4ES1zP5M3X7Ukq3ROlZ87G9I;
        V1ILteCyL3ENl v1ILteCyL3ENl = new V1ILteCyL3ENl(7, cmUECThaulvcM4ES1zP5M3X7Ukq3ROlZ87G9I);
        UyZmyVQuKtDBvg7JbApYs0Bsa uyZmyVQuKtDBvg7JbApYs0Bsa = POLYDU3BdDlat.Companion;
        ERGkrVYauE1 eRGkrVYauE1BezslBgjveK3hODH = GkEpHTllUQBkRob2X6.BezslBgjveK3hODH(((ColorPalette) cmUECThaulvcM4ES1zP5M3X7Ukq3ROlZ87G9I.getValue()).S1zP5M3X7Ukq3ROlZ87G9I);
        uyZmyVQuKtDBvg7JbApYs0Bsa.getClass();
        this.J1BE9tYH1em4X1uAhc6L7f4M = UTd7rzkLVEMWlpMBsEC.JY5knQmh7EQJEZ(v1ILteCyL3ENl, zhfg9ebtghielbn, kjBkI9UgSN4k8Ij0Q0qZm.S1zP5M3X7Ukq3ROlZ87G9I, UyZmyVQuKtDBvg7JbApYs0Bsa.S1zP5M3X7Ukq3ROlZ87G9I(eRGkrVYauE1BezslBgjveK3hODH));
        this.tdNmBZIJHG1 = new LruCache(5);
        this.tzMOyOc53ffl = sharedPreferences.getBoolean("bitpit.launcher.key.USE_BLACK_AS_DARK_THEME", false);
        XQCixPMPkXDW6 xQCixPMPkXDW6AxL8FocTDLUdzg0XScbO = iXYuiKB6hlvuKua28Q9sCxO11f.axL8FocTDLUdzg0XScbO(sharedPreferences, "bitpit.launcher.key.DARK_BACKGROUND_MODE", gT4sTdpjS277wbG60pk72fHWG7.ziNFA7KzVfc6 ? 3 : 0);
        xQCixPMPkXDW6AxL8FocTDLUdzg0XScbO.ziNFA7KzVfc6(new dlgqlTraJx3(1, this));
        this.cVfIGUKLEqID1HH = xQCixPMPkXDW6AxL8FocTDLUdzg0XScbO;
        this.czGAefXQxIZzo = new UlPBFNmBDW(iXYuiKB6hlvuKua28Q9sCxO11f.axL8FocTDLUdzg0XScbO(sharedPreferences, "bitpit.launcher.key.DARK_TEXT_MODE", 0), null);
        this.yZj7bj6KyeuYi9woqDlC = this.qTa7aqjjB9Bt6mc.S1zP5M3X7Ukq3ROlZ87G9I(ToEIy0qfkltfGfO3vmAQG());
        this.IPi49brQACDpXJTJMp7 = iXYuiKB6hlvuKua28Q9sCxO11f.S1zP5M3X7Ukq3ROlZ87G9I(sharedPreferences, "bitpit.launcher.key.SHIFT_WALLPAPER", false);
        this.jvttfmFMQfShe6OfbNf1zF8CyEu = new cAOCGl5k5uCM8FvPCKC(this);
        this.nXIf4d0RGTWG1l = new AtomicBoolean(sharedPreferences.getBoolean("bitpit.launcher.key.CACHED_IS_HOME_IN_DARK_MODE", false));
        UV6K6VDbgDgzpi12QAEKN4Emq();
        ((a05MjsTtylUXo) t7bLXYJFPi0Yphv7AcXMz4qeX).GO8WUug7ZWFCUI1zY.axL8FocTDLUdzg0XScbO(this);
        ((SXPderDlYRFnia0Fx) kTJUlzHnAh7a9Bh).WIXlfFpvH7glAGsUk3.axL8FocTDLUdzg0XScbO(this);
        if (gT4sTdpjS277wbG60pk72fHWG7.S1zP5M3X7Ukq3ROlZ87G9I) {
            TB9XgFDfvLRtLF.S1zP5M3X7Ukq3ROlZ87G9I(wallpaperManager, new WallpaperManager.OnColorsChangedListener() { // from class: b.Qb0WD7M1xaDyEdUQ3Msnd
                @Override // android.app.WallpaperManager.OnColorsChangedListener
                public final void onColorsChanged(WallpaperColors wallpaperColors, int i) {
                    bitpit.launcher.theming.NniqwgLR9Jo6Bl9Px0S5u nniqwgLR9Jo6Bl9Px0S5u = this.S1zP5M3X7Ukq3ROlZ87G9I;
                    if ((i & 1) == 1) {
                        r79MMhDRaCjmDEnEC9XSmV.BezslBgjveK3hODH(nniqwgLR9Jo6Bl9Px0S5u, true, false, null, wallpaperColors != null ? Zju0RZrDKb.LcvPFGYKhAm4SS5FZ(wallpaperColors) : null, 6);
                    }
                }
            });
        }
        Gyx5iNzPN5hbJptykezC2wo.Companion.getClass();
        r79MMhDRaCjmDEnEC9XSmV.BezslBgjveK3hODH(this, false, iFDZzYzOvAXqFbRpTJa4rtD.S1zP5M3X7Ukq3ROlZ87G9I(sharedPreferences), null, null, 12);
    }

    @Override // b.sEKry1ND5xKz7Ht2raVJx6dXY39zn
    public final Object Aboow6rUrcY2SrFRa46C6uy(KxMa18LIrAcX kxMa18LIrAcX) throws Throwable {
        Object objJY5knQmh7EQJEZ = JY5knQmh7EQJEZ(true, (14 & 2) == 0, null, null, kxMa18LIrAcX);
        return objJY5knQmh7EQJEZ == tIDTjdoK38.GO8WUug7ZWFCUI1zY ? objJY5knQmh7EQJEZ : s9XnN7QTAJ.S1zP5M3X7Ukq3ROlZ87G9I;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Bk6w7oZjoWt9ZSRs4C7jIhbX3(File file, int i, bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) {
        yOakydjtTd3XnUszCrtMlBu yoakydjttd3xnuszcrtmlbu;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof yOakydjtTd3XnUszCrtMlBu) {
            yoakydjttd3xnuszcrtmlbu = (yOakydjtTd3XnUszCrtMlBu) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i2 = yoakydjttd3xnuszcrtmlbu.LcvPFGYKhAm4SS5FZ;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yoakydjttd3xnuszcrtmlbu.LcvPFGYKhAm4SS5FZ = i2 - Integer.MIN_VALUE;
            } else {
                yoakydjttd3xnuszcrtmlbu = new yOakydjtTd3XnUszCrtMlBu(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            yoakydjttd3xnuszcrtmlbu = new yOakydjtTd3XnUszCrtMlBu(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        Object obj = yoakydjttd3xnuszcrtmlbu.WIXlfFpvH7glAGsUk3;
        int i3 = yoakydjttd3xnuszcrtmlbu.LcvPFGYKhAm4SS5FZ;
        if (i3 != 0) {
            if (i3 == 1) {
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
                return ((AeQuqug4cjWl3vY5CUaNGtJ0l) obj).GO8WUug7ZWFCUI1zY;
            }
            uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
        lu57g3hpixirwi8MEO x3h7wwototoblvzl0wjmm41fgyl = new x3H7wwOTOTOBlvzl0WJMm41FgYl(file);
        yoakydjttd3xnuszcrtmlbu.LcvPFGYKhAm4SS5FZ = 1;
        Serializable serializableSBV5EuS0mGuEYqc5nc5erhuwb1OG7 = sBV5EuS0mGuEYqc5nc5erhuwb1OG7(x3h7wwototoblvzl0wjmm41fgyl, i, yoakydjttd3xnuszcrtmlbu);
        Serializable serializable = tIDTjdoK38.GO8WUug7ZWFCUI1zY;
        return serializableSBV5EuS0mGuEYqc5nc5erhuwb1OG7 == serializable ? serializable : serializableSBV5EuS0mGuEYqc5nc5erhuwb1OG7;
    }

    public final int H5sQ15nhYoaKKHhx() {
        GZnU2p3i2qStYb gZnU2p3i2qStYb = hsgUkarQLKL1aF8JVboCqnbaz1[0];
        return ((Number) this.iR1XUIc7FjhMl57O.Aboow6rUrcY2SrFRa46C6uy).intValue();
    }

    public final ColorPalette HveD9n1tOYlffjJDxghBitYNgB() {
        GZnU2p3i2qStYb gZnU2p3i2qStYb = hsgUkarQLKL1aF8JVboCqnbaz1[1];
        return (ColorPalette) this.FzogU2bPCQtD6a1hMYB1kyti.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:101:0x022f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0231  */
    /* JADX WARN: Code duplicated, block: B:103:0x0237 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x0239  */
    /* JADX WARN: Code duplicated, block: B:106:0x0240  */
    /* JADX WARN: Code duplicated, block: B:111:0x024f  */
    /* JADX WARN: Code duplicated, block: B:114:0x019e A[EDGE_INSN: B:114:0x019e->B:72:0x019e BREAK  A[LOOP:0: B:68:0x018c->B:71:0x019c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x022d A[EDGE_INSN: B:115:0x022d->B:100:0x022d BREAK  A[LOOP:1: B:96:0x021d->B:99:0x022b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0124  */
    /* JADX WARN: Code duplicated, block: B:71:0x019c A[LOOP:0: B:68:0x018c->B:71:0x019c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:86:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x0206  */
    /* JADX WARN: Code duplicated, block: B:90:0x0209  */
    /* JADX WARN: Code duplicated, block: B:92:0x020d  */
    /* JADX WARN: Code duplicated, block: B:99:0x022b A[LOOP:1: B:96:0x021d->B:99:0x022b, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object JY5knQmh7EQJEZ(boolean z, boolean z2, Integer num, WallpaperColorPalette wallpaperColorPalette, bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) throws Throwable {
        jA2DEPO9jFbEwXbrTexRrn ja2depo9jfbewxbrtexrrn;
        WallpaperColorPalette wallpaperColorPalette2;
        k5k3oiVTtVy70LV k5k3oivttvy70lv;
        boolean z3;
        boolean z4;
        int i;
        ColorPalette colorPalette;
        boolean z5;
        SnehnOCu20dNNwjUly snehnOCu20dNNwjUly;
        WallpaperColorPalette wallpaperColorPalette3;
        int i2;
        int i3;
        int i4;
        int i5;
        CJI9fJNh1Q2PBYQKjHaT4Ef4H cJI9fJNh1Q2PBYQKjHaT4Ef4H;
        SnehnOCu20dNNwjUly snehnOCu20dNNwjUly2;
        int i6;
        boolean z6;
        ColorPalette colorPalette2;
        WallpaperColorPalette wallpaperColorPalette4;
        boolean z7;
        boolean z8;
        int i7;
        boolean z9;
        GZnU2p3i2qStYb[] gZnU2p3i2qStYbArr;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z10;
        ArrayList arrayList;
        int size;
        int i12;
        ArrayList arrayList2;
        int size2;
        int i13;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof jA2DEPO9jFbEwXbrTexRrn) {
            ja2depo9jfbewxbrtexrrn = (jA2DEPO9jFbEwXbrTexRrn) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i14 = ja2depo9jfbewxbrtexrrn.cVfIGUKLEqID1HH;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                ja2depo9jfbewxbrtexrrn.cVfIGUKLEqID1HH = i14 - Integer.MIN_VALUE;
            } else {
                ja2depo9jfbewxbrtexrrn = new jA2DEPO9jFbEwXbrTexRrn(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            ja2depo9jfbewxbrtexrrn = new jA2DEPO9jFbEwXbrTexRrn(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        Object obj = ja2depo9jfbewxbrtexrrn.tdNmBZIJHG1;
        int i15 = ja2depo9jfbewxbrtexrrn.cVfIGUKLEqID1HH;
        CJI9fJNh1Q2PBYQKjHaT4Ef4H cJI9fJNh1Q2PBYQKjHaT4Ef4H2 = this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
        vOL3U3fINHMmdVoJz vol3u3finhmmdvojz = null;
        tIDTjdoK38 tidtjdok38 = tIDTjdoK38.GO8WUug7ZWFCUI1zY;
        if (i15 != 0) {
            if (i15 == 1) {
                z5 = ja2depo9jfbewxbrtexrrn.LcvPFGYKhAm4SS5FZ;
                boolean z11 = ja2depo9jfbewxbrtexrrn.gsHzEVTj1SCIPR;
                boolean z12 = ja2depo9jfbewxbrtexrrn.WIXlfFpvH7glAGsUk3;
                k5k3oiVTtVy70LV k5k3oivttvy70lv2 = ja2depo9jfbewxbrtexrrn.qTa7aqjjB9Bt6mc;
                colorPalette = ja2depo9jfbewxbrtexrrn.Mej0x2K4ZGSUxtYNka4QZ;
                wallpaperColorPalette2 = ja2depo9jfbewxbrtexrrn.sCPtafveBAhdLIs2ajN3WV;
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
                z4 = z11;
                z3 = z12;
                k5k3oivttvy70lv = k5k3oivttvy70lv2;
                i = 0;
            } else {
                if (i15 != 2) {
                    uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i7 = ja2depo9jfbewxbrtexrrn.J1BE9tYH1em4X1uAhc6L7f4M;
                i3 = ja2depo9jfbewxbrtexrrn.FzogU2bPCQtD6a1hMYB1kyti;
                z6 = ja2depo9jfbewxbrtexrrn.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
                i6 = ja2depo9jfbewxbrtexrrn.yM5HHkk1MhPLZFYTHm2JjrArud;
                z8 = ja2depo9jfbewxbrtexrrn.LcvPFGYKhAm4SS5FZ;
                z7 = ja2depo9jfbewxbrtexrrn.gsHzEVTj1SCIPR;
                wallpaperColorPalette4 = ja2depo9jfbewxbrtexrrn.iR1XUIc7FjhMl57O;
                snehnOCu20dNNwjUly2 = ja2depo9jfbewxbrtexrrn.f2sXlW3st0rAKJwyOrCfOWc;
                k5k3oivttvy70lv = ja2depo9jfbewxbrtexrrn.qTa7aqjjB9Bt6mc;
                colorPalette2 = ja2depo9jfbewxbrtexrrn.Mej0x2K4ZGSUxtYNka4QZ;
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
                i2 = 1;
                i = 0;
                cJI9fJNh1Q2PBYQKjHaT4Ef4H = cJI9fJNh1Q2PBYQKjHaT4Ef4H2;
            }
            arrayList2 = cJI9fJNh1Q2PBYQKjHaT4Ef4H.GO8WUug7ZWFCUI1zY;
            if (!arrayList2.isEmpty() && (size2 = arrayList2.size() - 1) >= 0) {
                while (true) {
                    i13 = size2 - 1;
                    ((YTs4nWeytJKgOLnERNkwrb) arrayList2.get(size2)).PQQPeCDD0JLCT3aLz(snehnOCu20dNNwjUly2.ziNFA7KzVfc6, z6);
                    if (i13 < 0) {
                        break;
                    }
                    size2 = i13;
                }
            }
            i5 = i7;
            z9 = z6;
            i4 = i6;
            z5 = z8;
            z4 = z7;
            wallpaperColorPalette3 = wallpaperColorPalette4;
            snehnOCu20dNNwjUly = snehnOCu20dNNwjUly2;
            colorPalette = colorPalette2;
            WT8HZhEwPEkG(wallpaperColorPalette3);
            this.yZj7bj6KyeuYi9woqDlC = this.qTa7aqjjB9Bt6mc.S1zP5M3X7Ukq3ROlZ87G9I(ToEIy0qfkltfGfO3vmAQG());
            if (i5 != 0) {
                UV6K6VDbgDgzpi12QAEKN4Emq();
            }
            gZnU2p3i2qStYbArr = k5k3oiVTtVy70LV.fXBtMGfTIjGSHgK542;
            if (snehnOCu20dNNwjUly.Aboow6rUrcY2SrFRa46C6uy) {
                int i16 = snehnOCu20dNNwjUly.BezslBgjveK3hODH;
                XQCixPMPkXDW6 xQCixPMPkXDW6 = k5k3oivttvy70lv.PQQPeCDD0JLCT3aLz;
                GZnU2p3i2qStYb gZnU2p3i2qStYb = gZnU2p3i2qStYbArr[i2];
                xQCixPMPkXDW6.BezslBgjveK3hODH(Integer.valueOf(i16));
                int i17 = snehnOCu20dNNwjUly.ziNFA7KzVfc6;
                XQCixPMPkXDW6 xQCixPMPkXDW7 = k5k3oivttvy70lv.ox9eclwMpRd;
                GZnU2p3i2qStYb gZnU2p3i2qStYb2 = gZnU2p3i2qStYbArr[i];
                xQCixPMPkXDW7.BezslBgjveK3hODH(Integer.valueOf(i17));
            }
            i8 = k5k3oivttvy70lv.LYcdI4xpry8eXmFC9I4wyaLdcG1z;
            i9 = k5k3oivttvy70lv.flPMk2Ix9h3b95v;
            if (i8 != i9) {
                XQCixPMPkXDW6 xQCixPMPkXDW8 = k5k3oivttvy70lv.JY5knQmh7EQJEZ;
                GZnU2p3i2qStYb gZnU2p3i2qStYb3 = gZnU2p3i2qStYbArr[2];
                xQCixPMPkXDW8.BezslBgjveK3hODH(Integer.valueOf(i9));
            }
            cS9Klw57l26qfkpcMlfmpU(i4, i3);
            if (this.yZj7bj6KyeuYi9woqDlC != z5) {
                i10 = i2;
            } else {
                i10 = i;
            }
            if (HveD9n1tOYlffjJDxghBitYNgB().ziNFA7KzVfc6 != colorPalette.ziNFA7KzVfc6) {
                i11 = i2;
            } else {
                i11 = i;
            }
            if (i10 != 0) {
                arrayList = cJI9fJNh1Q2PBYQKjHaT4Ef4H.GO8WUug7ZWFCUI1zY;
                if (!arrayList.isEmpty() && (size = arrayList.size() - 1) >= 0) {
                    while (true) {
                        i12 = size - 1;
                        ((YTs4nWeytJKgOLnERNkwrb) arrayList.get(size)).fXBtMGfTIjGSHgK542();
                        if (i12 < 0) {
                            break;
                        }
                        size = i12;
                    }
                }
            }
            if (!z4) {
                if (i11 != 0) {
                    A5porU7u8X1VonihuxSSB.S1zP5M3X7Ukq3ROlZ87G9I.ziNFA7KzVfc6();
                } else if (i10 != 0) {
                    A5porU7u8X1VonihuxSSB.S1zP5M3X7Ukq3ROlZ87G9I.Aboow6rUrcY2SrFRa46C6uy();
                }
            }
            if (z9) {
                B4VuABB1m6ytu26MxoUBytPiQ.axL8FocTDLUdzg0XScbO(otD5bQR0LtT.Companion, "wallpaper_changed");
            }
            if (i11 == 0 || i10 != 0) {
                z10 = i2;
            } else {
                z10 = i;
            }
            return Boolean.valueOf(z10);
        }
        Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
        wallpaperColorPalette2 = this.qTa7aqjjB9Bt6mc;
        boolean z13 = this.yZj7bj6KyeuYi9woqDlC;
        ColorPalette colorPaletteHveD9n1tOYlffjJDxghBitYNgB = HveD9n1tOYlffjJDxghBitYNgB();
        JwYrfEmVh5cLq99jiA5V2 jwYrfEmVh5cLq99jiA5V2 = this.WIXlfFpvH7glAGsUk3;
        k5k3oivttvy70lv = new k5k3oiVTtVy70LV(this.sCPtafveBAhdLIs2ajN3WV, z, num, wallpaperColorPalette, jwYrfEmVh5cLq99jiA5V2.S1zP5M3X7Ukq3ROlZ87G9I, jwYrfEmVh5cLq99jiA5V2.axL8FocTDLUdzg0XScbO);
        ja2depo9jfbewxbrtexrrn.sCPtafveBAhdLIs2ajN3WV = wallpaperColorPalette2;
        ja2depo9jfbewxbrtexrrn.Mej0x2K4ZGSUxtYNka4QZ = colorPaletteHveD9n1tOYlffjJDxghBitYNgB;
        ja2depo9jfbewxbrtexrrn.qTa7aqjjB9Bt6mc = k5k3oivttvy70lv;
        z3 = z;
        ja2depo9jfbewxbrtexrrn.WIXlfFpvH7glAGsUk3 = z3;
        z4 = z2;
        ja2depo9jfbewxbrtexrrn.gsHzEVTj1SCIPR = z4;
        ja2depo9jfbewxbrtexrrn.LcvPFGYKhAm4SS5FZ = z13;
        ja2depo9jfbewxbrtexrrn.cVfIGUKLEqID1HH = 1;
        PeLieoBN4yxYJZju3kQtKIsq7XL8 peLieoBN4yxYJZju3kQtKIsq7XL8 = NMquq9o0FvRs5RyiTFrS.S1zP5M3X7Ukq3ROlZ87G9I;
        i = 0;
        Object objJY5knQmh7EQJEZ = rbpFGdpgDCAQXat.JY5knQmh7EQJEZ(x4PcPRPmslEJW.cCmbv8Tzd2QLd161ImIZUlZ8n, new GcJ3diO9dV0WWNY5MN5A9(k5k3oivttvy70lv, vol3u3finhmmdvojz, 10), ja2depo9jfbewxbrtexrrn);
        if (objJY5knQmh7EQJEZ == tidtjdok38) {
            return tidtjdok38;
        }
        colorPalette = colorPaletteHveD9n1tOYlffjJDxghBitYNgB;
        z5 = z13;
        obj = objJY5knQmh7EQJEZ;
        snehnOCu20dNNwjUly = (SnehnOCu20dNNwjUly) obj;
        if (snehnOCu20dNNwjUly == null) {
            return Boolean.FALSE;
        }
        boolean z14 = snehnOCu20dNNwjUly.Aboow6rUrcY2SrFRa46C6uy;
        wallpaperColorPalette3 = snehnOCu20dNNwjUly.S1zP5M3X7Ukq3ROlZ87G9I;
        i2 = 1;
        int i18 = k5k3oivttvy70lv.LYcdI4xpry8eXmFC9I4wyaLdcG1z;
        i3 = k5k3oivttvy70lv.flPMk2Ix9h3b95v;
        int i19 = i18 != i3 ? 1 : i;
        if (!z3 && !z14 && i19 == 0 && wallpaperColorPalette3.equals(wallpaperColorPalette2)) {
            return Boolean.FALSE;
        }
        int i20 = snehnOCu20dNNwjUly.BezslBgjveK3hODH;
        i4 = snehnOCu20dNNwjUly.ziNFA7KzVfc6;
        boolean z15 = (!z14 || i4 == snehnOCu20dNNwjUly.axL8FocTDLUdzg0XScbO) ? i : 1;
        if (flPMk2Ix9h3b95v() == 3 || (!gT4sTdpjS277wbG60pk72fHWG7.ziNFA7KzVfc6 && flPMk2Ix9h3b95v() == 0)) {
            if (((wallpaperColorPalette3.ziNFA7KzVfc6 & 2) == 2 ? 1 : i) != ((wallpaperColorPalette2.ziNFA7KzVfc6 & 2) == 2 ? 1 : i)) {
                i5 = 1;
            } else {
                i5 = i;
            }
        } else {
            i5 = i;
        }
        if (z14) {
            Set setMej0x2K4ZGSUxtYNka4QZ = gD2rKVU295TtHvegz.Mej0x2K4ZGSUxtYNka4QZ(new String[]{String.valueOf(i20), String.valueOf(i4)});
            PeLieoBN4yxYJZju3kQtKIsq7XL8 peLieoBN4yxYJZju3kQtKIsq7XL9 = NMquq9o0FvRs5RyiTFrS.S1zP5M3X7Ukq3ROlZ87G9I;
            x4PcPRPmslEJW x4pcprpmslejw = x4PcPRPmslEJW.cCmbv8Tzd2QLd161ImIZUlZ8n;
            int i21 = i5;
            MVHpAPdve4 mVHpAPdve4 = new MVHpAPdve4(this, setMej0x2K4ZGSUxtYNka4QZ, null, 19);
            ja2depo9jfbewxbrtexrrn.sCPtafveBAhdLIs2ajN3WV = null;
            ja2depo9jfbewxbrtexrrn.Mej0x2K4ZGSUxtYNka4QZ = colorPalette;
            ja2depo9jfbewxbrtexrrn.qTa7aqjjB9Bt6mc = k5k3oivttvy70lv;
            ja2depo9jfbewxbrtexrrn.f2sXlW3st0rAKJwyOrCfOWc = snehnOCu20dNNwjUly;
            ja2depo9jfbewxbrtexrrn.iR1XUIc7FjhMl57O = wallpaperColorPalette3;
            ja2depo9jfbewxbrtexrrn.WIXlfFpvH7glAGsUk3 = z3;
            ja2depo9jfbewxbrtexrrn.gsHzEVTj1SCIPR = z4;
            ja2depo9jfbewxbrtexrrn.LcvPFGYKhAm4SS5FZ = z5;
            ja2depo9jfbewxbrtexrrn.yM5HHkk1MhPLZFYTHm2JjrArud = i4;
            ja2depo9jfbewxbrtexrrn.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = z15;
            ja2depo9jfbewxbrtexrrn.FzogU2bPCQtD6a1hMYB1kyti = i3;
            ja2depo9jfbewxbrtexrrn.J1BE9tYH1em4X1uAhc6L7f4M = i21;
            ja2depo9jfbewxbrtexrrn.cVfIGUKLEqID1HH = 2;
            if (rbpFGdpgDCAQXat.JY5knQmh7EQJEZ(x4pcprpmslejw, mVHpAPdve4, ja2depo9jfbewxbrtexrrn) == tidtjdok38) {
                return tidtjdok38;
            }
            snehnOCu20dNNwjUly2 = snehnOCu20dNNwjUly;
            i6 = i4;
            z6 = z15 ? 1 : 0;
            colorPalette2 = colorPalette;
            cJI9fJNh1Q2PBYQKjHaT4Ef4H = cJI9fJNh1Q2PBYQKjHaT4Ef4H2;
            wallpaperColorPalette4 = wallpaperColorPalette3;
            z7 = z4;
            z8 = z5;
            i7 = i21;
            arrayList2 = cJI9fJNh1Q2PBYQKjHaT4Ef4H.GO8WUug7ZWFCUI1zY;
            if (!arrayList2.isEmpty()) {
                while (true) {
                    i13 = size2 - 1;
                    ((YTs4nWeytJKgOLnERNkwrb) arrayList2.get(size2)).PQQPeCDD0JLCT3aLz(snehnOCu20dNNwjUly2.ziNFA7KzVfc6, z6);
                    if (i13 < 0) {
                        break;
                        break;
                    }
                    size2 = i13;
                }
            }
            i5 = i7;
            z9 = z6;
            i4 = i6;
            z5 = z8;
            z4 = z7;
            wallpaperColorPalette3 = wallpaperColorPalette4;
            snehnOCu20dNNwjUly = snehnOCu20dNNwjUly2;
            colorPalette = colorPalette2;
        } else {
            cJI9fJNh1Q2PBYQKjHaT4Ef4H = cJI9fJNh1Q2PBYQKjHaT4Ef4H2;
            z9 = z15;
        }
        WT8HZhEwPEkG(wallpaperColorPalette3);
        this.yZj7bj6KyeuYi9woqDlC = this.qTa7aqjjB9Bt6mc.S1zP5M3X7Ukq3ROlZ87G9I(ToEIy0qfkltfGfO3vmAQG());
        if (i5 != 0) {
            UV6K6VDbgDgzpi12QAEKN4Emq();
        }
        gZnU2p3i2qStYbArr = k5k3oiVTtVy70LV.fXBtMGfTIjGSHgK542;
        if (snehnOCu20dNNwjUly.Aboow6rUrcY2SrFRa46C6uy) {
            int i110 = snehnOCu20dNNwjUly.BezslBgjveK3hODH;
            XQCixPMPkXDW6 xQCixPMPkXDW9 = k5k3oivttvy70lv.PQQPeCDD0JLCT3aLz;
            GZnU2p3i2qStYb gZnU2p3i2qStYb4 = gZnU2p3i2qStYbArr[i2];
            xQCixPMPkXDW9.BezslBgjveK3hODH(Integer.valueOf(i110));
            int i111 = snehnOCu20dNNwjUly.ziNFA7KzVfc6;
            XQCixPMPkXDW6 xQCixPMPkXDW10 = k5k3oivttvy70lv.ox9eclwMpRd;
            GZnU2p3i2qStYb gZnU2p3i2qStYb5 = gZnU2p3i2qStYbArr[i];
            xQCixPMPkXDW10.BezslBgjveK3hODH(Integer.valueOf(i111));
        }
        i8 = k5k3oivttvy70lv.LYcdI4xpry8eXmFC9I4wyaLdcG1z;
        i9 = k5k3oivttvy70lv.flPMk2Ix9h3b95v;
        if (i8 != i9) {
            XQCixPMPkXDW6 xQCixPMPkXDW11 = k5k3oivttvy70lv.JY5knQmh7EQJEZ;
            GZnU2p3i2qStYb gZnU2p3i2qStYb6 = gZnU2p3i2qStYbArr[2];
            xQCixPMPkXDW11.BezslBgjveK3hODH(Integer.valueOf(i9));
        }
        cS9Klw57l26qfkpcMlfmpU(i4, i3);
        if (this.yZj7bj6KyeuYi9woqDlC != z5) {
            i10 = i2;
        } else {
            i10 = i;
        }
        if (HveD9n1tOYlffjJDxghBitYNgB().ziNFA7KzVfc6 != colorPalette.ziNFA7KzVfc6) {
            i11 = i2;
        } else {
            i11 = i;
        }
        if (i10 != 0) {
            arrayList = cJI9fJNh1Q2PBYQKjHaT4Ef4H.GO8WUug7ZWFCUI1zY;
            if (!arrayList.isEmpty()) {
                while (true) {
                    i12 = size - 1;
                    ((YTs4nWeytJKgOLnERNkwrb) arrayList.get(size)).fXBtMGfTIjGSHgK542();
                    if (i12 < 0) {
                        break;
                        break;
                    }
                    size = i12;
                }
            }
        }
        if (!z4) {
            if (i11 != 0) {
                A5porU7u8X1VonihuxSSB.S1zP5M3X7Ukq3ROlZ87G9I.ziNFA7KzVfc6();
            } else if (i10 != 0) {
                A5porU7u8X1VonihuxSSB.S1zP5M3X7Ukq3ROlZ87G9I.Aboow6rUrcY2SrFRa46C6uy();
            }
        }
        if (z9) {
            B4VuABB1m6ytu26MxoUBytPiQ.axL8FocTDLUdzg0XScbO(otD5bQR0LtT.Companion, "wallpaper_changed");
        }
        if (i11 == 0) {
            z10 = i2;
        } else {
            z10 = i2;
        }
        return Boolean.valueOf(z10);
    }

    public final xFsSkhbqTbJaCcPs5UY6QyfFLuTn LYcdI4xpry8eXmFC9I4wyaLdcG1z(boolean z) {
        int i;
        int iFXBtMGfTIjGSHgK542 = fXBtMGfTIjGSHgK542();
        Context context = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, iFXBtMGfTIjGSHgK542);
        Configuration configuration = new Configuration();
        int i2 = z ? 32 : 16;
        configuration.setTo(context.getResources().getConfiguration());
        configuration.uiMode = i2 | (configuration.uiMode & (-49));
        contextThemeWrapper.applyOverrideConfiguration(configuration);
        NniqwgLR9Jo6Bl9Px0S5u nniqwgLR9Jo6Bl9Px0S5u = this.jvttfmFMQfShe6OfbNf1zF8CyEu.S1zP5M3X7Ukq3ROlZ87G9I;
        boolean z2 = nniqwgLR9Jo6Bl9Px0S5u.tzMOyOc53ffl;
        boolean z3 = nniqwgLR9Jo6Bl9Px0S5u.yZj7bj6KyeuYi9woqDlC;
        if (z2) {
            i = z3 ? R.style.BaseHomeTheme_Extras_Colors_DarkText_Black : R.style.BaseHomeTheme_Extras_Colors_Black;
        } else {
            i = z3 ? R.style.BaseHomeTheme_Extras_Colors_DarkText : R.style.BaseHomeTheme_Extras_Colors;
        }
        return new xFsSkhbqTbJaCcPs5UY6QyfFLuTn(contextThemeWrapper, i);
    }

    public final void PQQPeCDD0JLCT3aLz(int i, boolean z) {
        if (i == H5sQ15nhYoaKKHhx()) {
            return;
        }
        GZnU2p3i2qStYb gZnU2p3i2qStYb = hsgUkarQLKL1aF8JVboCqnbaz1[0];
        this.iR1XUIc7FjhMl57O.BezslBgjveK3hODH(Integer.valueOf(i));
        ColorPalette colorPaletteHveD9n1tOYlffjJDxghBitYNgB = HveD9n1tOYlffjJDxghBitYNgB();
        HDzaRKEI4SxljA hDzaRKEI4SxljA = Zo1YEZ6nT2Qsm9uBmmbXR.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
        Integer numBezslBgjveK3hODH = rFIOv4rH29IBPB69hahw9W.BezslBgjveK3hODH(this.sCPtafveBAhdLIs2ajN3WV, this.GO8WUug7ZWFCUI1zY, WLZoEbRHGAYGtOeo6ZMxoLT9.JY5knQmh7EQJEZ(500, SCo4Ctd3zv2DHfczdi.MILLISECONDS), 2);
        cS9Klw57l26qfkpcMlfmpU(numBezslBgjveK3hODH != null ? numBezslBgjveK3hODH.intValue() : -1, gT4sTdpjS277wbG60pk72fHWG7.ox9eclwMpRd ? this.Rdzg08aYlt0UsoLUNug9cESzgAY9R.getResources().getColor(android.R.color.system_accent1_500, null) : 0);
        if (z || HveD9n1tOYlffjJDxghBitYNgB().ziNFA7KzVfc6 == colorPaletteHveD9n1tOYlffjJDxghBitYNgB.ziNFA7KzVfc6) {
            return;
        }
        A5porU7u8X1VonihuxSSB.S1zP5M3X7Ukq3ROlZ87G9I.ziNFA7KzVfc6();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Ql6q60SSx3(Drawable drawable, int i, bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) {
        KBAljZ4gNp kBAljZ4gNp;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof KBAljZ4gNp) {
            kBAljZ4gNp = (KBAljZ4gNp) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i2 = kBAljZ4gNp.LcvPFGYKhAm4SS5FZ;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kBAljZ4gNp.LcvPFGYKhAm4SS5FZ = i2 - Integer.MIN_VALUE;
            } else {
                kBAljZ4gNp = new KBAljZ4gNp(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            kBAljZ4gNp = new KBAljZ4gNp(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        Object obj = kBAljZ4gNp.WIXlfFpvH7glAGsUk3;
        int i3 = kBAljZ4gNp.LcvPFGYKhAm4SS5FZ;
        if (i3 != 0) {
            if (i3 == 1) {
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
                return ((AeQuqug4cjWl3vY5CUaNGtJ0l) obj).GO8WUug7ZWFCUI1zY;
            }
            uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
        lu57g3hpixirwi8MEO ht9cc82pfvutslziixrshlyu = new ht9cc82PFVuTSlziixRsHlYU(drawable);
        kBAljZ4gNp.LcvPFGYKhAm4SS5FZ = 1;
        Serializable serializableSBV5EuS0mGuEYqc5nc5erhuwb1OG7 = sBV5EuS0mGuEYqc5nc5erhuwb1OG7(ht9cc82pfvutslziixrshlyu, i, kBAljZ4gNp);
        Serializable serializable = tIDTjdoK38.GO8WUug7ZWFCUI1zY;
        return serializableSBV5EuS0mGuEYqc5nc5erhuwb1OG7 == serializable ? serializable : serializableSBV5EuS0mGuEYqc5nc5erhuwb1OG7;
    }

    public final int ToEIy0qfkltfGfO3vmAQG() {
        GZnU2p3i2qStYb gZnU2p3i2qStYb = hsgUkarQLKL1aF8JVboCqnbaz1[3];
        return ((Number) this.czGAefXQxIZzo.Aboow6rUrcY2SrFRa46C6uy).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    public final void UV6K6VDbgDgzpi12QAEKN4Emq() {
        int i;
        A5porU7u8X1VonihuxSSB.S1zP5M3X7Ukq3ROlZ87G9I.BezslBgjveK3hODH(new CaIU5GnhTZOX(12));
        int iFlPMk2Ix9h3b95v = flPMk2Ix9h3b95v();
        if (iFlPMk2Ix9h3b95v == 0) {
            if ((gT4sTdpjS277wbG60pk72fHWG7.ziNFA7KzVfc6 || iFlPMk2Ix9h3b95v == 3) && (this.qTa7aqjjB9Bt6mc.ziNFA7KzVfc6 & 2) == 2) {
                i = 2;
            } else if (gT4sTdpjS277wbG60pk72fHWG7.axL8FocTDLUdzg0XScbO) {
                i = -1;
            } else {
                i = 1;
            }
        } else if (iFlPMk2Ix9h3b95v == 1) {
            i = 1;
        } else if (iFlPMk2Ix9h3b95v == 2) {
            i = 2;
        } else {
            if (iFlPMk2Ix9h3b95v != 3) {
                O1VE8grxm4nj1d.ox9eclwMpRd(Integer.valueOf(iFlPMk2Ix9h3b95v));
                return;
            }
            if (gT4sTdpjS277wbG60pk72fHWG7.ziNFA7KzVfc6) {
                i = 2;
            } else {
                i = 2;
            }
            if (gT4sTdpjS277wbG60pk72fHWG7.axL8FocTDLUdzg0XScbO) {
                i = -1;
            } else {
                i = 1;
            }
        }
        raCbApsSYtHAh9GLADn racbapssythah9gladn = qJy5uUbPQ1B2fNruHHuWNHFMESln.GO8WUug7ZWFCUI1zY;
        if ((i == -1 || i == 0 || i == 1 || i == 2) && qJy5uUbPQ1B2fNruHHuWNHFMESln.Rdzg08aYlt0UsoLUNug9cESzgAY9R != i) {
            qJy5uUbPQ1B2fNruHHuWNHFMESln.Rdzg08aYlt0UsoLUNug9cESzgAY9R = i;
            synchronized (qJy5uUbPQ1B2fNruHHuWNHFMESln.sCPtafveBAhdLIs2ajN3WV) {
                try {
                    VmbK6PYRLAkydzCWkPIhMksv vmbK6PYRLAkydzCWkPIhMksv = qJy5uUbPQ1B2fNruHHuWNHFMESln.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
                    vmbK6PYRLAkydzCWkPIhMksv.getClass();
                    kVlghxO2ZCrhns3hLgPpCNNG8nhEe kvlghxo2zcrhns3hlgppcnng8nhee = new kVlghxO2ZCrhns3hLgPpCNNG8nhEe(vmbK6PYRLAkydzCWkPIhMksv);
                    while (kvlghxo2zcrhns3hlgppcnng8nhee.hasNext()) {
                        qJy5uUbPQ1B2fNruHHuWNHFMESln qjy5uubpq1b2fnruhhuwnhfmesln = (qJy5uUbPQ1B2fNruHHuWNHFMESln) ((WeakReference) kvlghxo2zcrhns3hlgppcnng8nhee.next()).get();
                        if (qjy5uubpq1b2fnruhhuwnhfmesln != null) {
                            ((DcCYZ00uLGz5DopIuEingorhi8ELc) qjy5uubpq1b2fnruhhuwnhfmesln).fXBtMGfTIjGSHgK542(true, true);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void WT8HZhEwPEkG(WallpaperColorPalette wallpaperColorPalette) {
        if (OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.qTa7aqjjB9Bt6mc, wallpaperColorPalette)) {
            return;
        }
        this.qTa7aqjjB9Bt6mc = wallpaperColorPalette;
        SharedPreferences.Editor editorEdit = this.cCmbv8Tzd2QLd161ImIZUlZ8n.edit();
        editorEdit.putString("bitpit.launcher.key.WALLPAPER_COLOR_PALETTE", this.gsHzEVTj1SCIPR.axL8FocTDLUdzg0XScbO(WallpaperColorPalette.Companion.serializer(), wallpaperColorPalette));
        editorEdit.apply();
    }

    public final void cS9Klw57l26qfkpcMlfmpU(int i, int i2) {
        int size;
        int iH5sQ15nhYoaKKHhx = H5sQ15nhYoaKKHhx();
        if (iH5sQ15nhYoaKKHhx == 0) {
            iH5sQ15nhYoaKKHhx = pob9VHWg0ny05T0ct13ri11UrwoE.BezslBgjveK3hODH(this.Rdzg08aYlt0UsoLUNug9cESzgAY9R, this.qTa7aqjjB9Bt6mc);
        }
        ColorPalette colorPaletteHveD9n1tOYlffjJDxghBitYNgB = HveD9n1tOYlffjJDxghBitYNgB();
        ColorPalette.Companion companion = ColorPalette.Companion;
        boolean z = this.yZj7bj6KyeuYi9woqDlC;
        companion.getClass();
        ColorPalette colorPaletteS1zP5M3X7Ukq3ROlZ87G9I = ColorPalette.Companion.S1zP5M3X7Ukq3ROlZ87G9I(iH5sQ15nhYoaKKHhx, z);
        if (OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(colorPaletteHveD9n1tOYlffjJDxghBitYNgB, colorPaletteS1zP5M3X7Ukq3ROlZ87G9I)) {
            return;
        }
        MT34qfvzSXQtPd1EA63 mT34qfvzSXQtPd1EA63 = new MT34qfvzSXQtPd1EA63(i, i2, H5sQ15nhYoaKKHhx(), ToEIy0qfkltfGfO3vmAQG());
        GZnU2p3i2qStYb gZnU2p3i2qStYb = hsgUkarQLKL1aF8JVboCqnbaz1[1];
        this.FzogU2bPCQtD6a1hMYB1kyti.fXBtMGfTIjGSHgK542(null, colorPaletteS1zP5M3X7Ukq3ROlZ87G9I);
        this.tdNmBZIJHG1.put(mT34qfvzSXQtPd1EA63, colorPaletteS1zP5M3X7Ukq3ROlZ87G9I);
        bitpit.launcher.theming.color_palette.NniqwgLR9Jo6Bl9Px0S5u nniqwgLR9Jo6Bl9Px0S5u = (bitpit.launcher.theming.color_palette.NniqwgLR9Jo6Bl9Px0S5u) this.LcvPFGYKhAm4SS5FZ;
        String strAxL8FocTDLUdzg0XScbO = nniqwgLR9Jo6Bl9Px0S5u.S1zP5M3X7Ukq3ROlZ87G9I.axL8FocTDLUdzg0XScbO(companion.serializer(), colorPaletteS1zP5M3X7Ukq3ROlZ87G9I);
        XQCixPMPkXDW6 xQCixPMPkXDW6 = nniqwgLR9Jo6Bl9Px0S5u.axL8FocTDLUdzg0XScbO;
        GZnU2p3i2qStYb gZnU2p3i2qStYb2 = bitpit.launcher.theming.color_palette.NniqwgLR9Jo6Bl9Px0S5u.BezslBgjveK3hODH[0];
        xQCixPMPkXDW6.BezslBgjveK3hODH(strAxL8FocTDLUdzg0XScbO);
        ArrayList arrayList = this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp.GO8WUug7ZWFCUI1zY;
        if (arrayList.isEmpty() || (size = arrayList.size() - 1) < 0) {
            return;
        }
        while (true) {
            int i3 = size - 1;
            ((YTs4nWeytJKgOLnERNkwrb) arrayList.get(size)).gsHzEVTj1SCIPR();
            if (i3 < 0) {
                return;
            } else {
                size = i3;
            }
        }
    }

    public final int fXBtMGfTIjGSHgK542() {
        eM3zq40gn9wbO038r2XTsRB em3zq40gn9wbo038r2xtsrb = cAOCGl5k5uCM8FvPCKC.Companion;
        CustomMaterialYouColorFamily customMaterialYouColorFamily = this.jvttfmFMQfShe6OfbNf1zF8CyEu.S1zP5M3X7Ukq3ROlZ87G9I.HveD9n1tOYlffjJDxghBitYNgB().ziNFA7KzVfc6;
        em3zq40gn9wbo038r2xtsrb.getClass();
        return eM3zq40gn9wbO038r2XTsRB.S1zP5M3X7Ukq3ROlZ87G9I(customMaterialYouColorFamily);
    }

    public final int flPMk2Ix9h3b95v() {
        GZnU2p3i2qStYb gZnU2p3i2qStYb = hsgUkarQLKL1aF8JVboCqnbaz1[2];
        return ((Number) this.cVfIGUKLEqID1HH.S1zP5M3X7Ukq3ROlZ87G9I()).intValue();
    }

    @Override // b.mkeB609Q34mPahD
    public final void ox9eclwMpRd(Intent intent, String str) {
        if (str.equals("android.intent.action.WALLPAPER_CHANGED")) {
            if (gT4sTdpjS277wbG60pk72fHWG7.S1zP5M3X7Ukq3ROlZ87G9I) {
                uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("Check failed.");
            } else {
                r79MMhDRaCjmDEnEC9XSmV.BezslBgjveK3hODH(this, true, false, null, null, 14);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable sBV5EuS0mGuEYqc5nc5erhuwb1OG7(lu57g3hpixirwi8MEO lu57g3hpixirwi8meo, int i, bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) {
        hUqvWgWzeJgjDE huqvwgwzejgjde;
        NniqwgLR9Jo6Bl9Px0S5u nniqwgLR9Jo6Bl9Px0S5u;
        lu57g3hpixirwi8MEO lu57g3hpixirwi8meo2;
        int i2;
        int i3;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof hUqvWgWzeJgjDE) {
            huqvwgwzejgjde = (hUqvWgWzeJgjDE) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i4 = huqvwgwzejgjde.Mej0x2K4ZGSUxtYNka4QZ;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                huqvwgwzejgjde.Mej0x2K4ZGSUxtYNka4QZ = i4 - Integer.MIN_VALUE;
            } else {
                huqvwgwzejgjde = new hUqvWgWzeJgjDE(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            huqvwgwzejgjde = new hUqvWgWzeJgjDE(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        Object objJY5knQmh7EQJEZ = huqvwgwzejgjde.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
        int i5 = huqvwgwzejgjde.Mej0x2K4ZGSUxtYNka4QZ;
        vOL3U3fINHMmdVoJz vol3u3finhmmdvojz = null;
        tIDTjdoK38 tidtjdok38 = tIDTjdoK38.GO8WUug7ZWFCUI1zY;
        if (i5 == 0) {
            Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objJY5knQmh7EQJEZ);
            PeLieoBN4yxYJZju3kQtKIsq7XL8 peLieoBN4yxYJZju3kQtKIsq7XL8 = NMquq9o0FvRs5RyiTFrS.S1zP5M3X7Ukq3ROlZ87G9I;
            x4PcPRPmslEJW x4pcprpmslejw = x4PcPRPmslEJW.cCmbv8Tzd2QLd161ImIZUlZ8n;
            nniqwgLR9Jo6Bl9Px0S5u = this;
            cPphBbOpLsxF20 cpphbboplsxf20 = new cPphBbOpLsxF20(lu57g3hpixirwi8meo, nniqwgLR9Jo6Bl9Px0S5u, i, vol3u3finhmmdvojz, 4);
            huqvwgwzejgjde.WIXlfFpvH7glAGsUk3 = lu57g3hpixirwi8meo;
            huqvwgwzejgjde.gsHzEVTj1SCIPR = i;
            huqvwgwzejgjde.Mej0x2K4ZGSUxtYNka4QZ = 1;
            objJY5knQmh7EQJEZ = rbpFGdpgDCAQXat.JY5knQmh7EQJEZ(x4pcprpmslejw, cpphbboplsxf20, huqvwgwzejgjde);
            if (objJY5knQmh7EQJEZ != tidtjdok38) {
                lu57g3hpixirwi8meo2 = lu57g3hpixirwi8meo;
                i2 = i;
            }
            return tidtjdok38;
        }
        if (i5 == 1) {
            i2 = huqvwgwzejgjde.gsHzEVTj1SCIPR;
            lu57g3hpixirwi8meo2 = huqvwgwzejgjde.WIXlfFpvH7glAGsUk3;
            Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objJY5knQmh7EQJEZ);
            nniqwgLR9Jo6Bl9Px0S5u = this;
        } else {
            if (i5 != 2) {
                uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = huqvwgwzejgjde.LcvPFGYKhAm4SS5FZ;
            Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objJY5knQmh7EQJEZ);
            nniqwgLR9Jo6Bl9Px0S5u = this;
        }
        GZnU2p3i2qStYb gZnU2p3i2qStYb = hsgUkarQLKL1aF8JVboCqnbaz1[4];
        nniqwgLR9Jo6Bl9Px0S5u.IPi49brQACDpXJTJMp7.BezslBgjveK3hODH(Boolean.FALSE);
        return new Integer(i3);
        int iIntValue = ((Number) objJY5knQmh7EQJEZ).intValue();
        if (iIntValue == 0) {
            IllegalStateException illegalStateException = new IllegalStateException("Retrieving wallpaper ID failed or timed out");
            Emi5d0VyYZLZtm.Aboow6rUrcY2SrFRa46C6uy(illegalStateException);
            return new Rfp0CprLjJaYY8aiYk(illegalStateException);
        }
        PeLieoBN4yxYJZju3kQtKIsq7XL8 peLieoBN4yxYJZju3kQtKIsq7XL9 = NMquq9o0FvRs5RyiTFrS.S1zP5M3X7Ukq3ROlZ87G9I;
        x4PcPRPmslEJW x4pcprpmslejw2 = x4PcPRPmslEJW.cCmbv8Tzd2QLd161ImIZUlZ8n;
        cDYmJRU7q3PixwqqSKESq cdymjru7q3pixwqqskesq = new cDYmJRU7q3PixwqqSKESq(nniqwgLR9Jo6Bl9Px0S5u, iIntValue, lu57g3hpixirwi8meo2, null);
        huqvwgwzejgjde.WIXlfFpvH7glAGsUk3 = null;
        huqvwgwzejgjde.gsHzEVTj1SCIPR = i2;
        huqvwgwzejgjde.LcvPFGYKhAm4SS5FZ = iIntValue;
        huqvwgwzejgjde.Mej0x2K4ZGSUxtYNka4QZ = 2;
        if (rbpFGdpgDCAQXat.JY5knQmh7EQJEZ(x4pcprpmslejw2, cdymjru7q3pixwqqskesq, huqvwgwzejgjde) != tidtjdok38) {
            i3 = iIntValue;
            GZnU2p3i2qStYb gZnU2p3i2qStYb2 = hsgUkarQLKL1aF8JVboCqnbaz1[4];
            nniqwgLR9Jo6Bl9Px0S5u.IPi49brQACDpXJTJMp7.BezslBgjveK3hODH(Boolean.FALSE);
            return new Integer(i3);
        }
        return tidtjdok38;
    }

    public final void ziNFA7KzVfc6(int i, boolean z) {
        int size;
        GZnU2p3i2qStYb gZnU2p3i2qStYb = hsgUkarQLKL1aF8JVboCqnbaz1[3];
        this.czGAefXQxIZzo.BezslBgjveK3hODH(Integer.valueOf(i));
        boolean z2 = this.yZj7bj6KyeuYi9woqDlC;
        boolean zS1zP5M3X7Ukq3ROlZ87G9I = this.qTa7aqjjB9Bt6mc.S1zP5M3X7Ukq3ROlZ87G9I(ToEIy0qfkltfGfO3vmAQG());
        this.yZj7bj6KyeuYi9woqDlC = zS1zP5M3X7Ukq3ROlZ87G9I;
        if (zS1zP5M3X7Ukq3ROlZ87G9I != z2) {
            HDzaRKEI4SxljA hDzaRKEI4SxljA = Zo1YEZ6nT2Qsm9uBmmbXR.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
            Integer numBezslBgjveK3hODH = rFIOv4rH29IBPB69hahw9W.BezslBgjveK3hODH(this.sCPtafveBAhdLIs2ajN3WV, this.GO8WUug7ZWFCUI1zY, WLZoEbRHGAYGtOeo6ZMxoLT9.JY5knQmh7EQJEZ(500, SCo4Ctd3zv2DHfczdi.MILLISECONDS), 2);
            cS9Klw57l26qfkpcMlfmpU(numBezslBgjveK3hODH != null ? numBezslBgjveK3hODH.intValue() : -1, gT4sTdpjS277wbG60pk72fHWG7.ox9eclwMpRd ? this.Rdzg08aYlt0UsoLUNug9cESzgAY9R.getResources().getColor(android.R.color.system_accent1_500, null) : 0);
            ArrayList arrayList = this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp.GO8WUug7ZWFCUI1zY;
            if (!arrayList.isEmpty() && (size = arrayList.size() - 1) >= 0) {
                while (true) {
                    int i2 = size - 1;
                    ((YTs4nWeytJKgOLnERNkwrb) arrayList.get(size)).fXBtMGfTIjGSHgK542();
                    if (i2 < 0) {
                        break;
                    } else {
                        size = i2;
                    }
                }
            }
            if (z) {
                return;
            }
            A5porU7u8X1VonihuxSSB.S1zP5M3X7Ukq3ROlZ87G9I.Aboow6rUrcY2SrFRa46C6uy();
        }
    }
}
