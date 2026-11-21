package bitpit.launcher.theming.sharing;

import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.aJLiMmqfPh61r;
import java.util.Arrays;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class FontSurrogate {
    public static final Companion Companion = new Companion();
    public final byte[] Aboow6rUrcY2SrFRa46C6uy;
    public final String BezslBgjveK3hODH;
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final String axL8FocTDLUdzg0XScbO;
    public final Boolean ziNFA7KzVfc6;

    public static final class Companion {
        public final KSerializer serializer() {
            return FontSurrogate$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FontSurrogate(int i, String str, String str2, String str3, Boolean bool, byte[] bArr) {
        if (1 != (i & 1)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 1, FontSurrogate$$serializer.INSTANCE.getDescriptor());
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
            this.ziNFA7KzVfc6 = bool;
        }
        if ((i & 16) == 0) {
            this.Aboow6rUrcY2SrFRa46C6uy = null;
        } else {
            this.Aboow6rUrcY2SrFRa46C6uy = bArr;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!FontSurrogate.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        FontSurrogate fontSurrogate = (FontSurrogate) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.ziNFA7KzVfc6, fontSurrogate.ziNFA7KzVfc6) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, fontSurrogate.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, fontSurrogate.axL8FocTDLUdzg0XScbO) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.BezslBgjveK3hODH, fontSurrogate.BezslBgjveK3hODH) && Arrays.equals(this.Aboow6rUrcY2SrFRa46C6uy, fontSurrogate.Aboow6rUrcY2SrFRa46C6uy);
    }

    public final int hashCode() {
        Boolean bool = this.ziNFA7KzVfc6;
        int iOx9eclwMpRd = LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd((bool != null ? Boolean.hashCode(bool.booleanValue()) : 0) * 31, this.S1zP5M3X7Ukq3ROlZ87G9I, 31);
        String str = this.axL8FocTDLUdzg0XScbO;
        int iHashCode = (iOx9eclwMpRd + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.BezslBgjveK3hODH;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        byte[] bArr = this.Aboow6rUrcY2SrFRa46C6uy;
        return iHashCode2 + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public final String toString() {
        String string = Arrays.toString(this.Aboow6rUrcY2SrFRa46C6uy);
        StringBuilder sbH5sQ15nhYoaKKHhx = aJLiMmqfPh61r.H5sQ15nhYoaKKHhx("FontSurrogate(type=", this.S1zP5M3X7Ukq3ROlZ87G9I, ", id=", this.axL8FocTDLUdzg0XScbO, ", name=");
        sbH5sQ15nhYoaKKHhx.append(this.BezslBgjveK3hODH);
        sbH5sQ15nhYoaKKHhx.append(", hybridMode=");
        sbH5sQ15nhYoaKKHhx.append(this.ziNFA7KzVfc6);
        sbH5sQ15nhYoaKKHhx.append(", data=");
        return aJLiMmqfPh61r.ToEIy0qfkltfGfO3vmAQG(sbH5sQ15nhYoaKKHhx, string, ")");
    }

    public FontSurrogate(String str, String str2, String str3, Boolean bool, byte[] bArr, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        bool = (i & 8) != 0 ? null : bool;
        bArr = (i & 16) != 0 ? null : bArr;
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = str2;
        this.BezslBgjveK3hODH = str3;
        this.ziNFA7KzVfc6 = bool;
        this.Aboow6rUrcY2SrFRa46C6uy = bArr;
    }
}
