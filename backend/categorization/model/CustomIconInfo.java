package bitpit.launcher.backend.categorization.model;

import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.oJ08Xj0ZV1gAa;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class CustomIconInfo {
    public static final Companion Companion = new Companion();
    public final String Aboow6rUrcY2SrFRa46C6uy;
    public final String BezslBgjveK3hODH;
    public final int PQQPeCDD0JLCT3aLz;
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final String axL8FocTDLUdzg0XScbO;
    public final String ox9eclwMpRd;
    public final String ziNFA7KzVfc6;

    public static final class Companion {
        public final KSerializer serializer() {
            return CustomIconInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CustomIconInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2) {
        if (63 != (i & 63)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 63, CustomIconInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = str2;
        this.BezslBgjveK3hODH = str3;
        this.ziNFA7KzVfc6 = str4;
        this.Aboow6rUrcY2SrFRa46C6uy = str5;
        this.ox9eclwMpRd = str6;
        if ((i & 64) == 0) {
            this.PQQPeCDD0JLCT3aLz = 0;
        } else {
            this.PQQPeCDD0JLCT3aLz = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomIconInfo)) {
            return false;
        }
        CustomIconInfo customIconInfo = (CustomIconInfo) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, customIconInfo.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, customIconInfo.axL8FocTDLUdzg0XScbO) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.BezslBgjveK3hODH, customIconInfo.BezslBgjveK3hODH) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.ziNFA7KzVfc6, customIconInfo.ziNFA7KzVfc6) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.Aboow6rUrcY2SrFRa46C6uy, customIconInfo.Aboow6rUrcY2SrFRa46C6uy) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.ox9eclwMpRd, customIconInfo.ox9eclwMpRd) && this.PQQPeCDD0JLCT3aLz == customIconInfo.PQQPeCDD0JLCT3aLz;
    }

    public final int hashCode() {
        int iOx9eclwMpRd = LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31, this.axL8FocTDLUdzg0XScbO, 31);
        String str = this.BezslBgjveK3hODH;
        int iHashCode = (iOx9eclwMpRd + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ziNFA7KzVfc6;
        return Integer.hashCode(this.PQQPeCDD0JLCT3aLz) + LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, this.Aboow6rUrcY2SrFRa46C6uy, 31), this.ox9eclwMpRd, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomIconInfo(appPackageName=");
        sb.append(this.S1zP5M3X7Ukq3ROlZ87G9I);
        sb.append(", appClassName=");
        sb.append(this.axL8FocTDLUdzg0XScbO);
        sb.append(", iconResourceName=");
        sb.append(this.BezslBgjveK3hODH);
        sb.append(", iconPackageName=");
        sb.append(this.ziNFA7KzVfc6);
        sb.append(", sourceIPPN=");
        sb.append(this.Aboow6rUrcY2SrFRa46C6uy);
        sb.append(", launcherIPPN=");
        sb.append(this.ox9eclwMpRd);
        sb.append(", flags=");
        return oJ08Xj0ZV1gAa.Ql6q60SSx3(sb, this.PQQPeCDD0JLCT3aLz, ')');
    }

    public CustomIconInfo(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = str2;
        this.BezslBgjveK3hODH = str3;
        this.ziNFA7KzVfc6 = str4;
        this.Aboow6rUrcY2SrFRa46C6uy = str5;
        this.ox9eclwMpRd = str6;
        this.PQQPeCDD0JLCT3aLz = i;
    }
}
