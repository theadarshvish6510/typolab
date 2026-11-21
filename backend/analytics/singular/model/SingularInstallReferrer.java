package bitpit.launcher.backend.analytics.singular.model;

import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class SingularInstallReferrer {
    public static final Companion Companion = new Companion();
    public final String Aboow6rUrcY2SrFRa46C6uy;
    public final String BezslBgjveK3hODH;
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final String axL8FocTDLUdzg0XScbO;
    public final String ziNFA7KzVfc6;

    public static final class Companion {
        public final KSerializer serializer() {
            return SingularInstallReferrer$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SingularInstallReferrer(int i, String str, String str2, String str3, String str4, String str5) {
        if (23 != (i & 23)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 23, SingularInstallReferrer$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = str2;
        this.BezslBgjveK3hODH = str3;
        if ((i & 8) == 0) {
            this.ziNFA7KzVfc6 = "service";
        } else {
            this.ziNFA7KzVfc6 = str4;
        }
        this.Aboow6rUrcY2SrFRa46C6uy = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingularInstallReferrer)) {
            return false;
        }
        SingularInstallReferrer singularInstallReferrer = (SingularInstallReferrer) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, singularInstallReferrer.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, singularInstallReferrer.axL8FocTDLUdzg0XScbO) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.BezslBgjveK3hODH, singularInstallReferrer.BezslBgjveK3hODH) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.ziNFA7KzVfc6, singularInstallReferrer.ziNFA7KzVfc6) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.Aboow6rUrcY2SrFRa46C6uy, singularInstallReferrer.Aboow6rUrcY2SrFRa46C6uy);
    }

    public final int hashCode() {
        return this.Aboow6rUrcY2SrFRa46C6uy.hashCode() + LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31, this.axL8FocTDLUdzg0XScbO, 31), this.BezslBgjveK3hODH, 31), this.ziNFA7KzVfc6, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SingularInstallReferrer(installBeginTimestampSeconds=");
        sb.append(this.S1zP5M3X7Ukq3ROlZ87G9I);
        sb.append(", referrer=");
        sb.append(this.axL8FocTDLUdzg0XScbO);
        sb.append(", clickTimestampSeconds=");
        sb.append(this.BezslBgjveK3hODH);
        sb.append(", referrerSource=");
        sb.append(this.ziNFA7KzVfc6);
        sb.append(", currentDeviceTime=");
        return LthVJzs8YB767vHOMwO80UNP7QrQi.HveD9n1tOYlffjJDxghBitYNgB(sb, this.Aboow6rUrcY2SrFRa46C6uy, ')');
    }

    public SingularInstallReferrer(String str, String str2, String str3, String str4) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = str2;
        this.BezslBgjveK3hODH = str3;
        this.ziNFA7KzVfc6 = "service";
        this.Aboow6rUrcY2SrFRa46C6uy = str4;
    }
}
