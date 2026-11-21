package bitpit.launcher.backend.analytics.singular.model;

import b.KNB69biQImOtxCbYZrxJ;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.rXX7u5bn2nCB6ANmnDyddVU4zbm;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class SingularRequest<T extends KNB69biQImOtxCbYZrxJ> {
    public static final Companion Companion = new Companion();
    public static final rXX7u5bn2nCB6ANmnDyddVU4zbm ziNFA7KzVfc6;
    public final SingularConsentContext BezslBgjveK3hODH;
    public final KNB69biQImOtxCbYZrxJ S1zP5M3X7Ukq3ROlZ87G9I;
    public final SingularRequestContext axL8FocTDLUdzg0XScbO;

    public static final class Companion {
        public final <T> KSerializer serializer(KSerializer kSerializer) {
            return new SingularRequest$$serializer(kSerializer);
        }
    }

    static {
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("bitpit.launcher.backend.analytics.singular.model.SingularRequest", null, 3);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("payload", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("context", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("consent", true);
        ziNFA7KzVfc6 = rxx7u5bn2ncb6anmndyddvu4zbm;
    }

    public /* synthetic */ SingularRequest(int i, KNB69biQImOtxCbYZrxJ kNB69biQImOtxCbYZrxJ, SingularRequestContext singularRequestContext, SingularConsentContext singularConsentContext) {
        if (3 != (i & 3)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 3, ziNFA7KzVfc6);
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = kNB69biQImOtxCbYZrxJ;
        this.axL8FocTDLUdzg0XScbO = singularRequestContext;
        if ((i & 4) == 0) {
            this.BezslBgjveK3hODH = null;
        } else {
            this.BezslBgjveK3hODH = singularConsentContext;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingularRequest)) {
            return false;
        }
        SingularRequest singularRequest = (SingularRequest) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, singularRequest.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, singularRequest.axL8FocTDLUdzg0XScbO) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.BezslBgjveK3hODH, singularRequest.BezslBgjveK3hODH);
    }

    public final int hashCode() {
        int iHashCode = (this.axL8FocTDLUdzg0XScbO.hashCode() + (this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31)) * 31;
        SingularConsentContext singularConsentContext = this.BezslBgjveK3hODH;
        return iHashCode + (singularConsentContext == null ? 0 : singularConsentContext.hashCode());
    }

    public final String toString() {
        return "SingularRequest(payload=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", context=" + this.axL8FocTDLUdzg0XScbO + ", consent=" + this.BezslBgjveK3hODH + ')';
    }

    public SingularRequest(KNB69biQImOtxCbYZrxJ kNB69biQImOtxCbYZrxJ, SingularRequestContext singularRequestContext, SingularConsentContext singularConsentContext) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = kNB69biQImOtxCbYZrxJ;
        this.axL8FocTDLUdzg0XScbO = singularRequestContext;
        this.BezslBgjveK3hODH = singularConsentContext;
    }
}
