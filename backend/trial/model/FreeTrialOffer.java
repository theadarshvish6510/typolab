package bitpit.launcher.backend.trial.model;

import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class FreeTrialOffer {
    public static final Companion Companion = new Companion();
    public final FreeTrialClaim S1zP5M3X7Ukq3ROlZ87G9I;
    public final Boolean axL8FocTDLUdzg0XScbO;

    public static final class Companion {
        public final KSerializer serializer() {
            return FreeTrialOffer$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FreeTrialOffer(int i, FreeTrialClaim freeTrialClaim, Boolean bool) {
        if (1 != (i & 1)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 1, FreeTrialOffer$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = freeTrialClaim;
        if ((i & 2) == 0) {
            this.axL8FocTDLUdzg0XScbO = null;
        } else {
            this.axL8FocTDLUdzg0XScbO = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FreeTrialOffer)) {
            return false;
        }
        FreeTrialOffer freeTrialOffer = (FreeTrialOffer) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, freeTrialOffer.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, freeTrialOffer.axL8FocTDLUdzg0XScbO);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.S1zP5M3X7Ukq3ROlZ87G9I.S1zP5M3X7Ukq3ROlZ87G9I) * 31;
        Boolean bool = this.axL8FocTDLUdzg0XScbO;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "FreeTrialOffer(claim=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", eligible=" + this.axL8FocTDLUdzg0XScbO + ')';
    }
}
