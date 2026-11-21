package bitpit.launcher.backend.account.model.google;

import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.dz52zjPsVWHg6u;
import b.eUwPamJ8sGfSyqS5ucd4;
import b.gkp6pLZDZ4B;
import b.mHW63SUma8isGb;
import b.qSDYaDqxbBy2QEeVAcFRy;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class GoogleAuthAttachAccountRequest {
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final String axL8FocTDLUdzg0XScbO;
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] BezslBgjveK3hODH = {null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new gkp6pLZDZ4B(20))};

    public static final class Companion {
        public final KSerializer serializer() {
            return GoogleAuthAttachAccountRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GoogleAuthAttachAccountRequest(String str, int i, String str2) {
        if (1 != (i & 1)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 1, GoogleAuthAttachAccountRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        if ((i & 2) == 0) {
            this.axL8FocTDLUdzg0XScbO = null;
        } else {
            this.axL8FocTDLUdzg0XScbO = str2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0021  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleAuthAttachAccountRequest)) {
            return false;
        }
        GoogleAuthAttachAccountRequest googleAuthAttachAccountRequest = (GoogleAuthAttachAccountRequest) obj;
        if (!OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, googleAuthAttachAccountRequest.S1zP5M3X7Ukq3ROlZ87G9I)) {
            return false;
        }
        String str = googleAuthAttachAccountRequest.axL8FocTDLUdzg0XScbO;
        String str2 = this.axL8FocTDLUdzg0XScbO;
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
        return zEquals;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2 = this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31;
        String str = this.axL8FocTDLUdzg0XScbO;
        if (str == null) {
            iHashCode = 0;
        } else {
            dz52zjPsVWHg6u dz52zjpsvwhg6u = eUwPamJ8sGfSyqS5ucd4.Companion;
            iHashCode = str.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoogleAuthAttachAccountRequest(token=");
        sb.append(this.S1zP5M3X7Ukq3ROlZ87G9I);
        sb.append(", country=");
        String str = this.axL8FocTDLUdzg0XScbO;
        sb.append((Object) (str == null ? "null" : eUwPamJ8sGfSyqS5ucd4.axL8FocTDLUdzg0XScbO(str)));
        sb.append(')');
        return sb.toString();
    }

    public GoogleAuthAttachAccountRequest(String str, String str2) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = str2;
    }
}
