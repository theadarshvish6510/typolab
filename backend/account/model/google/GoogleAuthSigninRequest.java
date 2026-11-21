package bitpit.launcher.backend.account.model.google;

import b.G71ctMPy0O3NI7eWB;
import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.dz52zjPsVWHg6u;
import b.eUwPamJ8sGfSyqS5ucd4;
import b.gkp6pLZDZ4B;
import b.mHW63SUma8isGb;
import b.qSDYaDqxbBy2QEeVAcFRy;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class GoogleAuthSigninRequest {
    public final String BezslBgjveK3hODH;
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final String axL8FocTDLUdzg0XScbO;
    public final boolean ziNFA7KzVfc6;
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] Aboow6rUrcY2SrFRa46C6uy = {null, null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new gkp6pLZDZ4B(21)), null};

    public static final class Companion {
        public final KSerializer serializer() {
            return GoogleAuthSigninRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GoogleAuthSigninRequest(int i, String str, String str2, String str3, boolean z) {
        if (3 != (i & 3)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 3, GoogleAuthSigninRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = str2;
        if ((i & 4) == 0) {
            this.BezslBgjveK3hODH = null;
        } else {
            this.BezslBgjveK3hODH = str3;
        }
        if ((i & 8) == 0) {
            this.ziNFA7KzVfc6 = false;
        } else {
            this.ziNFA7KzVfc6 = z;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002c  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleAuthSigninRequest)) {
            return false;
        }
        GoogleAuthSigninRequest googleAuthSigninRequest = (GoogleAuthSigninRequest) obj;
        if (!OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, googleAuthSigninRequest.S1zP5M3X7Ukq3ROlZ87G9I) || !OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, googleAuthSigninRequest.axL8FocTDLUdzg0XScbO)) {
            return false;
        }
        String str = googleAuthSigninRequest.BezslBgjveK3hODH;
        String str2 = this.BezslBgjveK3hODH;
        if (str2 == null) {
            if (str == null) {
                zEquals = true;
            } else {
                zEquals = false;
            }
        } else if (str == null) {
            zEquals = false;
        } else {
            dz52zjPsVWHg6u dz52zjpsvwhg6u = eUwPamJ8sGfSyqS5ucd4.Companion;
            zEquals = str2.equals(str);
        }
        return zEquals && this.ziNFA7KzVfc6 == googleAuthSigninRequest.ziNFA7KzVfc6;
    }

    public final int hashCode() {
        int iHashCode;
        int iOx9eclwMpRd = LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31, this.axL8FocTDLUdzg0XScbO, 31);
        String str = this.BezslBgjveK3hODH;
        if (str == null) {
            iHashCode = 0;
        } else {
            dz52zjPsVWHg6u dz52zjpsvwhg6u = eUwPamJ8sGfSyqS5ucd4.Companion;
            iHashCode = str.hashCode();
        }
        return Boolean.hashCode(this.ziNFA7KzVfc6) + ((iOx9eclwMpRd + iHashCode) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoogleAuthSigninRequest(token=");
        sb.append(this.S1zP5M3X7Ukq3ROlZ87G9I);
        sb.append(", deviceName=");
        sb.append(this.axL8FocTDLUdzg0XScbO);
        sb.append(", country=");
        String str = this.BezslBgjveK3hODH;
        sb.append((Object) (str == null ? "null" : eUwPamJ8sGfSyqS5ucd4.axL8FocTDLUdzg0XScbO(str)));
        sb.append(", createAccountIfNotExists=");
        return G71ctMPy0O3NI7eWB.fXBtMGfTIjGSHgK542(sb, this.ziNFA7KzVfc6, ')');
    }

    public GoogleAuthSigninRequest(String str, String str2, String str3, boolean z) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = str2;
        this.BezslBgjveK3hODH = str3;
        this.ziNFA7KzVfc6 = z;
    }
}
