package bitpit.launcher.backend.account.play.model;

import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.dz52zjPsVWHg6u;
import b.eUwPamJ8sGfSyqS5ucd4;
import b.mHW63SUma8isGb;
import b.mrAjgCjIlpxZ7lEJ;
import b.qSDYaDqxbBy2QEeVAcFRy;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class PlayPurchaseSignInRequest {
    public final String BezslBgjveK3hODH;
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final String axL8FocTDLUdzg0XScbO;
    public final String ziNFA7KzVfc6;
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] Aboow6rUrcY2SrFRa46C6uy = {null, null, null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new mrAjgCjIlpxZ7lEJ(14))};

    public static final class Companion {
        public final KSerializer serializer() {
            return PlayPurchaseSignInRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PlayPurchaseSignInRequest(int i, String str, String str2, String str3, String str4) {
        if (7 != (i & 7)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 7, PlayPurchaseSignInRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = str2;
        this.BezslBgjveK3hODH = str3;
        if ((i & 8) == 0) {
            this.ziNFA7KzVfc6 = null;
        } else {
            this.ziNFA7KzVfc6 = str4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0037  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayPurchaseSignInRequest)) {
            return false;
        }
        PlayPurchaseSignInRequest playPurchaseSignInRequest = (PlayPurchaseSignInRequest) obj;
        if (!OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, playPurchaseSignInRequest.S1zP5M3X7Ukq3ROlZ87G9I) || !OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, playPurchaseSignInRequest.axL8FocTDLUdzg0XScbO) || !OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.BezslBgjveK3hODH, playPurchaseSignInRequest.BezslBgjveK3hODH)) {
            return false;
        }
        String str = playPurchaseSignInRequest.ziNFA7KzVfc6;
        String str2 = this.ziNFA7KzVfc6;
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
        int iOx9eclwMpRd = LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31, this.axL8FocTDLUdzg0XScbO, 31), this.BezslBgjveK3hODH, 31);
        String str = this.ziNFA7KzVfc6;
        if (str == null) {
            iHashCode = 0;
        } else {
            dz52zjPsVWHg6u dz52zjpsvwhg6u = eUwPamJ8sGfSyqS5ucd4.Companion;
            iHashCode = str.hashCode();
        }
        return iOx9eclwMpRd + iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayPurchaseSignInRequest(purchaseToken=");
        sb.append(this.S1zP5M3X7Ukq3ROlZ87G9I);
        sb.append(", sku=");
        sb.append(this.axL8FocTDLUdzg0XScbO);
        sb.append(", deviceName=");
        sb.append(this.BezslBgjveK3hODH);
        sb.append(", country=");
        String str = this.ziNFA7KzVfc6;
        sb.append((Object) (str == null ? "null" : eUwPamJ8sGfSyqS5ucd4.axL8FocTDLUdzg0XScbO(str)));
        sb.append(')');
        return sb.toString();
    }

    public PlayPurchaseSignInRequest(String str, String str2, String str3, String str4) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = str2;
        this.BezslBgjveK3hODH = str3;
        this.ziNFA7KzVfc6 = str4;
    }
}
