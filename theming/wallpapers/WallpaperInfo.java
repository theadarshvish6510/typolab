package bitpit.launcher.theming.wallpapers;

import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.aJLiMmqfPh61r;
import b.gf7AhHHqbn;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class WallpaperInfo implements gf7AhHHqbn, Comparable<WallpaperInfo> {
    public static final Companion Companion = new Companion();
    public final String GO8WUug7ZWFCUI1zY;
    public final String Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    public final String WIXlfFpvH7glAGsUk3;
    public final String cCmbv8Tzd2QLd161ImIZUlZ8n;
    public final String gsHzEVTj1SCIPR;

    public static final class Companion {
        public final KSerializer serializer() {
            return WallpaperInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WallpaperInfo(int i, String str, String str2, String str3, String str4, String str5) {
        if (31 != (i & 31)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 31, WallpaperInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.GO8WUug7ZWFCUI1zY = str;
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = str2;
        this.cCmbv8Tzd2QLd161ImIZUlZ8n = str3;
        this.WIXlfFpvH7glAGsUk3 = str4;
        this.gsHzEVTj1SCIPR = str5;
    }

    @Override // b.gf7AhHHqbn
    public final String S1zP5M3X7Ukq3ROlZ87G9I() {
        return this.WIXlfFpvH7glAGsUk3;
    }

    @Override // b.gf7AhHHqbn
    public final String axL8FocTDLUdzg0XScbO() {
        return this.gsHzEVTj1SCIPR;
    }

    @Override // java.lang.Comparable
    public final int compareTo(WallpaperInfo wallpaperInfo) {
        return this.cCmbv8Tzd2QLd161ImIZUlZ8n.compareToIgnoreCase(wallpaperInfo.cCmbv8Tzd2QLd161ImIZUlZ8n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallpaperInfo)) {
            return false;
        }
        WallpaperInfo wallpaperInfo = (WallpaperInfo) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.GO8WUug7ZWFCUI1zY, wallpaperInfo.GO8WUug7ZWFCUI1zY) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.Rdzg08aYlt0UsoLUNug9cESzgAY9R, wallpaperInfo.Rdzg08aYlt0UsoLUNug9cESzgAY9R) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.cCmbv8Tzd2QLd161ImIZUlZ8n, wallpaperInfo.cCmbv8Tzd2QLd161ImIZUlZ8n) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.WIXlfFpvH7glAGsUk3, wallpaperInfo.WIXlfFpvH7glAGsUk3) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.gsHzEVTj1SCIPR, wallpaperInfo.gsHzEVTj1SCIPR);
    }

    @Override // b.gf7AhHHqbn
    public final String getId() {
        return this.GO8WUug7ZWFCUI1zY;
    }

    public final int hashCode() {
        return this.gsHzEVTj1SCIPR.hashCode() + LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(this.GO8WUug7ZWFCUI1zY.hashCode() * 31, this.Rdzg08aYlt0UsoLUNug9cESzgAY9R, 31), this.cCmbv8Tzd2QLd161ImIZUlZ8n, 31), this.WIXlfFpvH7glAGsUk3, 31);
    }

    public final String toString() {
        StringBuilder sbH5sQ15nhYoaKKHhx = aJLiMmqfPh61r.H5sQ15nhYoaKKHhx("WallpaperInfo(id=", this.GO8WUug7ZWFCUI1zY, ", category=", this.Rdzg08aYlt0UsoLUNug9cESzgAY9R, ", name=");
        aJLiMmqfPh61r.Bk6w7oZjoWt9ZSRs4C7jIhbX3(sbH5sQ15nhYoaKKHhx, this.cCmbv8Tzd2QLd161ImIZUlZ8n, ", path=", this.WIXlfFpvH7glAGsUk3, ", thumb=");
        return aJLiMmqfPh61r.ToEIy0qfkltfGfO3vmAQG(sbH5sQ15nhYoaKKHhx, this.gsHzEVTj1SCIPR, ")");
    }
}
