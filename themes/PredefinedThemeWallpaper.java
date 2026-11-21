package bitpit.launcher.themes;

import b.G71ctMPy0O3NI7eWB;
import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.TYcC5PUX0l9;
import b.aJLiMmqfPh61r;
import b.gf7AhHHqbn;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class PredefinedThemeWallpaper implements gf7AhHHqbn {
    public static final Companion Companion = new Companion();
    public final String GO8WUug7ZWFCUI1zY;
    public final String Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    public final ArtistInformation WIXlfFpvH7glAGsUk3;
    public final String cCmbv8Tzd2QLd161ImIZUlZ8n;
    public final boolean gsHzEVTj1SCIPR;

    public static final class Companion {
        public static PredefinedThemeWallpaper S1zP5M3X7Ukq3ROlZ87G9I(String str, ArtistInformation artistInformation) {
            return new PredefinedThemeWallpaper("hidden", str, artistInformation);
        }

        public static /* synthetic */ PredefinedThemeWallpaper axL8FocTDLUdzg0XScbO(Companion companion, String str) {
            companion.getClass();
            return S1zP5M3X7Ukq3ROlZ87G9I(str, null);
        }

        public final KSerializer serializer() {
            return PredefinedThemeWallpaper$$serializer.INSTANCE;
        }
    }

    public PredefinedThemeWallpaper(int i, String str, String str2, String str3, ArtistInformation artistInformation, boolean z) {
        if (7 != (i & 7)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 7, PredefinedThemeWallpaper$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.GO8WUug7ZWFCUI1zY = str;
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = str2;
        this.cCmbv8Tzd2QLd161ImIZUlZ8n = str3;
        if ((i & 8) == 0) {
            this.WIXlfFpvH7glAGsUk3 = null;
        } else {
            this.WIXlfFpvH7glAGsUk3 = artistInformation;
        }
        if ((i & 16) == 0) {
            this.gsHzEVTj1SCIPR = TYcC5PUX0l9.HveD9n1tOYlffjJDxghBitYNgB(str, "hidden", false);
        } else {
            this.gsHzEVTj1SCIPR = z;
        }
    }

    @Override // b.gf7AhHHqbn
    public final String S1zP5M3X7Ukq3ROlZ87G9I() {
        return this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    }

    @Override // b.gf7AhHHqbn
    public final String axL8FocTDLUdzg0XScbO() {
        return this.cCmbv8Tzd2QLd161ImIZUlZ8n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PredefinedThemeWallpaper)) {
            return false;
        }
        PredefinedThemeWallpaper predefinedThemeWallpaper = (PredefinedThemeWallpaper) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.GO8WUug7ZWFCUI1zY, predefinedThemeWallpaper.GO8WUug7ZWFCUI1zY) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.Rdzg08aYlt0UsoLUNug9cESzgAY9R, predefinedThemeWallpaper.Rdzg08aYlt0UsoLUNug9cESzgAY9R) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.cCmbv8Tzd2QLd161ImIZUlZ8n, predefinedThemeWallpaper.cCmbv8Tzd2QLd161ImIZUlZ8n) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.WIXlfFpvH7glAGsUk3, predefinedThemeWallpaper.WIXlfFpvH7glAGsUk3);
    }

    @Override // b.gf7AhHHqbn
    public final String getId() {
        return this.GO8WUug7ZWFCUI1zY;
    }

    public final int hashCode() {
        int iOx9eclwMpRd = LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(this.GO8WUug7ZWFCUI1zY.hashCode() * 31, this.Rdzg08aYlt0UsoLUNug9cESzgAY9R, 31), this.cCmbv8Tzd2QLd161ImIZUlZ8n, 31);
        ArtistInformation artistInformation = this.WIXlfFpvH7glAGsUk3;
        return iOx9eclwMpRd + (artistInformation == null ? 0 : artistInformation.hashCode());
    }

    public final String toString() {
        StringBuilder sbH5sQ15nhYoaKKHhx = aJLiMmqfPh61r.H5sQ15nhYoaKKHhx("PredefinedThemeWallpaper(id=", this.GO8WUug7ZWFCUI1zY, ", path=", this.Rdzg08aYlt0UsoLUNug9cESzgAY9R, ", thumb=");
        sbH5sQ15nhYoaKKHhx.append(this.cCmbv8Tzd2QLd161ImIZUlZ8n);
        sbH5sQ15nhYoaKKHhx.append(", artistInformation=");
        sbH5sQ15nhYoaKKHhx.append(this.WIXlfFpvH7glAGsUk3);
        sbH5sQ15nhYoaKKHhx.append(")");
        return sbH5sQ15nhYoaKKHhx.toString();
    }

    public PredefinedThemeWallpaper(String str, String str2, ArtistInformation artistInformation) {
        String strFlPMk2Ix9h3b95v = aJLiMmqfPh61r.flPMk2Ix9h3b95v(str, "/", str2);
        String strFlPMk2Ix9h3b95v2 = G71ctMPy0O3NI7eWB.flPMk2Ix9h3b95v("files/", str, "/", str2, ".webp");
        String strFlPMk2Ix9h3b95v3 = G71ctMPy0O3NI7eWB.flPMk2Ix9h3b95v("thumbs/", str, "/", str2, ".webp");
        this.GO8WUug7ZWFCUI1zY = strFlPMk2Ix9h3b95v;
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = strFlPMk2Ix9h3b95v2;
        this.cCmbv8Tzd2QLd161ImIZUlZ8n = strFlPMk2Ix9h3b95v3;
        this.WIXlfFpvH7glAGsUk3 = artistInformation;
        this.gsHzEVTj1SCIPR = TYcC5PUX0l9.HveD9n1tOYlffjJDxghBitYNgB(strFlPMk2Ix9h3b95v, "hidden", false);
    }

    public /* synthetic */ PredefinedThemeWallpaper(String str, String str2) {
        this(str, str2, null);
    }
}
