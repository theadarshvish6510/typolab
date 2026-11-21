package bitpit.launcher.backend.categorization.model;

import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.mHW63SUma8isGb;
import b.qSDYaDqxbBy2QEeVAcFRy;
import b.vdBBwKx45uSJHLCNxSnPL6OZU4;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class AppInfoResponse {
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] ziNFA7KzVfc6 = {null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new vdBBwKx45uSJHLCNxSnPL6OZU4(4)), qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new vdBBwKx45uSJHLCNxSnPL6OZU4(5))};
    public final List BezslBgjveK3hODH;
    public final int S1zP5M3X7Ukq3ROlZ87G9I;
    public final List axL8FocTDLUdzg0XScbO;

    public static final class Companion {
        public final KSerializer serializer() {
            return AppInfoResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AppInfoResponse(int i, int i2, List list, List list2) {
        if (7 != (i & 7)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 7, AppInfoResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = i2;
        this.axL8FocTDLUdzg0XScbO = list;
        this.BezslBgjveK3hODH = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppInfoResponse)) {
            return false;
        }
        AppInfoResponse appInfoResponse = (AppInfoResponse) obj;
        return this.S1zP5M3X7Ukq3ROlZ87G9I == appInfoResponse.S1zP5M3X7Ukq3ROlZ87G9I && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, appInfoResponse.axL8FocTDLUdzg0XScbO) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.BezslBgjveK3hODH, appInfoResponse.BezslBgjveK3hODH);
    }

    public final int hashCode() {
        return this.BezslBgjveK3hODH.hashCode() + ((this.axL8FocTDLUdzg0XScbO.hashCode() + (Integer.hashCode(this.S1zP5M3X7Ukq3ROlZ87G9I) * 31)) * 31);
    }

    public final String toString() {
        return "AppInfoResponse(version=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", similarApps=" + this.axL8FocTDLUdzg0XScbO + ", tags=" + this.BezslBgjveK3hODH + ')';
    }
}
