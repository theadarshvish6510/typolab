package bitpit.launcher.theming.sharing;

import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.OkhdZkC3NYLW;
import b.PFgpcGG75zWSbgykRZqS7S;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.aJLiMmqfPh61r;
import b.gubhzHXeHIlbXrmRj5i9I;
import b.mHW63SUma8isGb;
import b.qSDYaDqxbBy2QEeVAcFRy;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class IconPackSurrogate {
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] PQQPeCDD0JLCT3aLz = {null, null, null, null, null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new PFgpcGG75zWSbgykRZqS7S(1))};
    public final int Aboow6rUrcY2SrFRa46C6uy;
    public final String BezslBgjveK3hODH;
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final String axL8FocTDLUdzg0XScbO;
    public final gubhzHXeHIlbXrmRj5i9I ox9eclwMpRd;
    public final String ziNFA7KzVfc6;

    public static final class Companion {
        public final KSerializer serializer() {
            return IconPackSurrogate$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IconPackSurrogate(int i, String str, String str2, String str3, String str4, int i2, gubhzHXeHIlbXrmRj5i9I gubhzhxehilbxrmrj5i9i) {
        if (49 != (i & 49)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 49, IconPackSurrogate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        if ((i & 2) == 0) {
            this.axL8FocTDLUdzg0XScbO = null;
        } else {
            this.axL8FocTDLUdzg0XScbO = str2;
        }
        if ((i & 4) == 0) {
            this.BezslBgjveK3hODH = null;
        } else {
            this.BezslBgjveK3hODH = str3;
        }
        if ((i & 8) == 0) {
            this.ziNFA7KzVfc6 = null;
        } else {
            this.ziNFA7KzVfc6 = str4;
        }
        this.Aboow6rUrcY2SrFRa46C6uy = i2;
        this.ox9eclwMpRd = gubhzhxehilbxrmrj5i9i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IconPackSurrogate)) {
            return false;
        }
        IconPackSurrogate iconPackSurrogate = (IconPackSurrogate) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, iconPackSurrogate.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, iconPackSurrogate.axL8FocTDLUdzg0XScbO) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.BezslBgjveK3hODH, iconPackSurrogate.BezslBgjveK3hODH) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.ziNFA7KzVfc6, iconPackSurrogate.ziNFA7KzVfc6) && this.Aboow6rUrcY2SrFRa46C6uy == iconPackSurrogate.Aboow6rUrcY2SrFRa46C6uy && this.ox9eclwMpRd == iconPackSurrogate.ox9eclwMpRd;
    }

    public final int hashCode() {
        int iHashCode = this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31;
        String str = this.axL8FocTDLUdzg0XScbO;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.BezslBgjveK3hODH;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ziNFA7KzVfc6;
        return this.ox9eclwMpRd.hashCode() + LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.Aboow6rUrcY2SrFRa46C6uy, (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbH5sQ15nhYoaKKHhx = aJLiMmqfPh61r.H5sQ15nhYoaKKHhx("IconPackSurrogate(type=", this.S1zP5M3X7Ukq3ROlZ87G9I, ", id=", this.axL8FocTDLUdzg0XScbO, ", packageName=");
        aJLiMmqfPh61r.Bk6w7oZjoWt9ZSRs4C7jIhbX3(sbH5sQ15nhYoaKKHhx, this.BezslBgjveK3hODH, ", name=", this.ziNFA7KzVfc6, ", size=");
        sbH5sQ15nhYoaKKHhx.append(this.Aboow6rUrcY2SrFRa46C6uy);
        sbH5sQ15nhYoaKKHhx.append(", shape=");
        sbH5sQ15nhYoaKKHhx.append(this.ox9eclwMpRd);
        sbH5sQ15nhYoaKKHhx.append(")");
        return sbH5sQ15nhYoaKKHhx.toString();
    }

    public IconPackSurrogate(String str, String str2, String str3, String str4, int i, gubhzHXeHIlbXrmRj5i9I gubhzhxehilbxrmrj5i9i, int i2) {
        str2 = (i2 & 2) != 0 ? null : str2;
        str3 = (i2 & 4) != 0 ? null : str3;
        str4 = (i2 & 8) != 0 ? null : str4;
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = str2;
        this.BezslBgjveK3hODH = str3;
        this.ziNFA7KzVfc6 = str4;
        this.Aboow6rUrcY2SrFRa46C6uy = i;
        this.ox9eclwMpRd = gubhzhxehilbxrmrj5i9i;
    }
}
