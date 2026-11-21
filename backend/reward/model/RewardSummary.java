package bitpit.launcher.backend.reward.model;

import b.FnJAr7PQdTXFvdr5UoH7yVBAHyqev;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class RewardSummary {
    public static final Companion Companion = new Companion();
    public final int S1zP5M3X7Ukq3ROlZ87G9I;

    public static final class Companion {
        public final KSerializer serializer() {
            return RewardSummary$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RewardSummary(int i, FnJAr7PQdTXFvdr5UoH7yVBAHyqev fnJAr7PQdTXFvdr5UoH7yVBAHyqev) {
        if (1 == (i & 1)) {
            this.S1zP5M3X7Ukq3ROlZ87G9I = fnJAr7PQdTXFvdr5UoH7yVBAHyqev.GO8WUug7ZWFCUI1zY;
        } else {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 1, RewardSummary$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RewardSummary) && this.S1zP5M3X7Ukq3ROlZ87G9I == ((RewardSummary) obj).S1zP5M3X7Ukq3ROlZ87G9I;
    }

    public final int hashCode() {
        return Integer.hashCode(this.S1zP5M3X7Ukq3ROlZ87G9I);
    }

    public final String toString() {
        return "RewardSummary(totalExtensionDays=" + ((Object) String.valueOf(((long) this.S1zP5M3X7Ukq3ROlZ87G9I) & 4294967295L)) + ')';
    }
}
