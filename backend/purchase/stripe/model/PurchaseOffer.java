package bitpit.launcher.backend.purchase.stripe.model;

import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import bitpit.launcher.backend.trial.model.FreeTrialOffer;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class PurchaseOffer {
    public static final Companion Companion = new Companion();
    public final FreeTrialOffer BezslBgjveK3hODH;
    public final PriceEntry S1zP5M3X7Ukq3ROlZ87G9I;
    public final PriceEntry axL8FocTDLUdzg0XScbO;

    public static final class Companion {
        public final KSerializer serializer() {
            return PurchaseOffer$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PurchaseOffer(int i, PriceEntry priceEntry, PriceEntry priceEntry2, FreeTrialOffer freeTrialOffer) {
        if (1 != (i & 1)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 1, PurchaseOffer$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = priceEntry;
        if ((i & 2) == 0) {
            this.axL8FocTDLUdzg0XScbO = null;
        } else {
            this.axL8FocTDLUdzg0XScbO = priceEntry2;
        }
        if ((i & 4) == 0) {
            this.BezslBgjveK3hODH = null;
        } else {
            this.BezslBgjveK3hODH = freeTrialOffer;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseOffer)) {
            return false;
        }
        PurchaseOffer purchaseOffer = (PurchaseOffer) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, purchaseOffer.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, purchaseOffer.axL8FocTDLUdzg0XScbO) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.BezslBgjveK3hODH, purchaseOffer.BezslBgjveK3hODH);
    }

    public final int hashCode() {
        int iHashCode = this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31;
        PriceEntry priceEntry = this.axL8FocTDLUdzg0XScbO;
        int iHashCode2 = (iHashCode + (priceEntry == null ? 0 : priceEntry.hashCode())) * 31;
        FreeTrialOffer freeTrialOffer = this.BezslBgjveK3hODH;
        return iHashCode2 + (freeTrialOffer != null ? freeTrialOffer.hashCode() : 0);
    }

    public final String toString() {
        return "PurchaseOffer(current=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", upcoming=" + this.axL8FocTDLUdzg0XScbO + ", freeTrial=" + this.BezslBgjveK3hODH + ')';
    }
}
