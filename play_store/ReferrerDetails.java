package bitpit.launcher.play_store;

import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.mHW63SUma8isGb;
import b.mrAjgCjIlpxZ7lEJ;
import b.oJ08Xj0ZV1gAa;
import b.qSDYaDqxbBy2QEeVAcFRy;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class ReferrerDetails {
    public final long BezslBgjveK3hODH;
    public final long S1zP5M3X7Ukq3ROlZ87G9I;
    public final String axL8FocTDLUdzg0XScbO;
    public final Map ziNFA7KzVfc6;
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] Aboow6rUrcY2SrFRa46C6uy = {null, null, null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new mrAjgCjIlpxZ7lEJ(28))};

    public static final class Companion {
        public final KSerializer serializer() {
            return ReferrerDetails$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ReferrerDetails(int i, long j, String str, long j2, Map map) {
        if (9 != (i & 9)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 9, ReferrerDetails$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = j;
        if ((i & 2) == 0) {
            this.axL8FocTDLUdzg0XScbO = "";
        } else {
            this.axL8FocTDLUdzg0XScbO = str;
        }
        if ((i & 4) == 0) {
            this.BezslBgjveK3hODH = 0L;
        } else {
            this.BezslBgjveK3hODH = j2;
        }
        this.ziNFA7KzVfc6 = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReferrerDetails)) {
            return false;
        }
        ReferrerDetails referrerDetails = (ReferrerDetails) obj;
        return this.S1zP5M3X7Ukq3ROlZ87G9I == referrerDetails.S1zP5M3X7Ukq3ROlZ87G9I && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, referrerDetails.axL8FocTDLUdzg0XScbO) && this.BezslBgjveK3hODH == referrerDetails.BezslBgjveK3hODH && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.ziNFA7KzVfc6, referrerDetails.ziNFA7KzVfc6);
    }

    public final int hashCode() {
        return this.ziNFA7KzVfc6.hashCode() + oJ08Xj0ZV1gAa.PQQPeCDD0JLCT3aLz(LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(Long.hashCode(this.S1zP5M3X7Ukq3ROlZ87G9I) * 31, this.axL8FocTDLUdzg0XScbO, 31), this.BezslBgjveK3hODH, 31);
    }

    public final String toString() {
        return "RD(ts=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", rs=" + this.axL8FocTDLUdzg0XScbO + ", cts=" + this.BezslBgjveK3hODH + ", pa=" + this.ziNFA7KzVfc6 + ")";
    }

    public ReferrerDetails(long j, String str, long j2, LinkedHashMap linkedHashMap) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = j;
        this.axL8FocTDLUdzg0XScbO = str;
        this.BezslBgjveK3hODH = j2;
        this.ziNFA7KzVfc6 = linkedHashMap;
    }
}
