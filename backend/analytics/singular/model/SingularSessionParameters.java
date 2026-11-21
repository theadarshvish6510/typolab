package bitpit.launcher.backend.analytics.singular.model;

import b.KNB69biQImOtxCbYZrxJ;
import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.oJ08Xj0ZV1gAa;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class SingularSessionParameters implements KNB69biQImOtxCbYZrxJ {
    public static final Companion Companion = new Companion();
    public final SingularInstallReferrer Aboow6rUrcY2SrFRa46C6uy;
    public final long BezslBgjveK3hODH;
    public final boolean S1zP5M3X7Ukq3ROlZ87G9I;
    public final long axL8FocTDLUdzg0XScbO;
    public final String ox9eclwMpRd;
    public final String ziNFA7KzVfc6;

    public static final class Companion {
        public final KSerializer serializer() {
            return SingularSessionParameters$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SingularSessionParameters(int i, boolean z, long j, long j2, String str, SingularInstallReferrer singularInstallReferrer, String str2) {
        if (7 != (i & 7)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 7, SingularSessionParameters$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = z;
        this.axL8FocTDLUdzg0XScbO = j;
        this.BezslBgjveK3hODH = j2;
        if ((i & 8) == 0) {
            this.ziNFA7KzVfc6 = null;
        } else {
            this.ziNFA7KzVfc6 = str;
        }
        if ((i & 16) == 0) {
            this.Aboow6rUrcY2SrFRa46C6uy = null;
        } else {
            this.Aboow6rUrcY2SrFRa46C6uy = singularInstallReferrer;
        }
        if ((i & 32) == 0) {
            this.ox9eclwMpRd = null;
        } else {
            this.ox9eclwMpRd = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingularSessionParameters)) {
            return false;
        }
        SingularSessionParameters singularSessionParameters = (SingularSessionParameters) obj;
        return this.S1zP5M3X7Ukq3ROlZ87G9I == singularSessionParameters.S1zP5M3X7Ukq3ROlZ87G9I && this.axL8FocTDLUdzg0XScbO == singularSessionParameters.axL8FocTDLUdzg0XScbO && this.BezslBgjveK3hODH == singularSessionParameters.BezslBgjveK3hODH && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.ziNFA7KzVfc6, singularSessionParameters.ziNFA7KzVfc6) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.Aboow6rUrcY2SrFRa46C6uy, singularSessionParameters.Aboow6rUrcY2SrFRa46C6uy) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.ox9eclwMpRd, singularSessionParameters.ox9eclwMpRd);
    }

    public final int hashCode() {
        int iPQQPeCDD0JLCT3aLz = oJ08Xj0ZV1gAa.PQQPeCDD0JLCT3aLz(oJ08Xj0ZV1gAa.PQQPeCDD0JLCT3aLz(Boolean.hashCode(this.S1zP5M3X7Ukq3ROlZ87G9I) * 31, this.axL8FocTDLUdzg0XScbO, 31), this.BezslBgjveK3hODH, 31);
        String str = this.ziNFA7KzVfc6;
        int iHashCode = (iPQQPeCDD0JLCT3aLz + (str == null ? 0 : str.hashCode())) * 31;
        SingularInstallReferrer singularInstallReferrer = this.Aboow6rUrcY2SrFRa46C6uy;
        int iHashCode2 = (iHashCode + (singularInstallReferrer == null ? 0 : singularInstallReferrer.hashCode())) * 31;
        String str2 = this.ox9eclwMpRd;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SingularSessionParameters(install=");
        sb.append(this.S1zP5M3X7Ukq3ROlZ87G9I);
        sb.append(", installTime=");
        sb.append(this.axL8FocTDLUdzg0XScbO);
        sb.append(", updateTime=");
        sb.append(this.BezslBgjveK3hODH);
        sb.append(", installSource=");
        sb.append(this.ziNFA7KzVfc6);
        sb.append(", installReferrer=");
        sb.append(this.Aboow6rUrcY2SrFRa46C6uy);
        sb.append(", fcmToken=");
        return LthVJzs8YB767vHOMwO80UNP7QrQi.HveD9n1tOYlffjJDxghBitYNgB(sb, this.ox9eclwMpRd, ')');
    }

    public SingularSessionParameters(boolean z, long j, long j2, String str, SingularInstallReferrer singularInstallReferrer) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = z;
        this.axL8FocTDLUdzg0XScbO = j;
        this.BezslBgjveK3hODH = j2;
        this.ziNFA7KzVfc6 = str;
        this.Aboow6rUrcY2SrFRa46C6uy = singularInstallReferrer;
        this.ox9eclwMpRd = null;
    }
}
