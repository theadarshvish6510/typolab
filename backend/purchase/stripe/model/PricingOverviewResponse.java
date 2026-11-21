package bitpit.launcher.backend.purchase.stripe.model;

import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.mHW63SUma8isGb;
import b.mrAjgCjIlpxZ7lEJ;
import b.qSDYaDqxbBy2QEeVAcFRy;
import java.util.Map;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class PricingOverviewResponse {
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] axL8FocTDLUdzg0XScbO = {qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new mrAjgCjIlpxZ7lEJ(21))};
    public final Map S1zP5M3X7Ukq3ROlZ87G9I;

    public static final class Companion {
        public final KSerializer serializer() {
            return PricingOverviewResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PricingOverviewResponse(int i, Map map) {
        if (1 == (i & 1)) {
            this.S1zP5M3X7Ukq3ROlZ87G9I = map;
        } else {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 1, PricingOverviewResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PricingOverviewResponse) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, ((PricingOverviewResponse) obj).S1zP5M3X7Ukq3ROlZ87G9I);
    }

    public final int hashCode() {
        return this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode();
    }

    public final String toString() {
        return "PricingOverviewResponse(prices=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ')';
    }
}
