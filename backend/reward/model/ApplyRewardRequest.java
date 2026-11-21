package bitpit.launcher.backend.reward.model;

import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.mHW63SUma8isGb;
import b.qSDYaDqxbBy2QEeVAcFRy;
import b.vdBBwKx45uSJHLCNxSnPL6OZU4;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class ApplyRewardRequest {
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final List axL8FocTDLUdzg0XScbO;
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] BezslBgjveK3hODH = {null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new vdBBwKx45uSJHLCNxSnPL6OZU4(8))};

    public static final class Companion {
        public final KSerializer serializer() {
            return ApplyRewardRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ApplyRewardRequest(int i, String str, List list) {
        if (3 != (i & 3)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 3, ApplyRewardRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplyRewardRequest)) {
            return false;
        }
        ApplyRewardRequest applyRewardRequest = (ApplyRewardRequest) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, applyRewardRequest.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, applyRewardRequest.axL8FocTDLUdzg0XScbO);
    }

    public final int hashCode() {
        return this.axL8FocTDLUdzg0XScbO.hashCode() + (this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31);
    }

    public final String toString() {
        return "ApplyRewardRequest(androidId=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", purchaseTokens=" + this.axL8FocTDLUdzg0XScbO + ')';
    }

    public ApplyRewardRequest(String str, ArrayList arrayList) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = arrayList;
    }
}
