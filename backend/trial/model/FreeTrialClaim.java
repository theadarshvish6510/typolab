package bitpit.launcher.backend.trial.model;

import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.oJ08Xj0ZV1gAa;
import b.uuyTGGFjNDiF1SxHW;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class FreeTrialClaim {
    public static final Companion Companion = new Companion();
    public final int S1zP5M3X7Ukq3ROlZ87G9I;

    public static final class Companion {
        public final KSerializer serializer() {
            return FreeTrialClaim$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FreeTrialClaim(int i, int i2) {
        if (1 != (i & 1)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 1, FreeTrialClaim$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = i2;
        if (i2 == 0) {
            uuyTGGFjNDiF1SxHW.PQQPeCDD0JLCT3aLz("A free trial must last at least 1 day");
            throw null;
        }
        if (i2 > 0) {
            return;
        }
        uuyTGGFjNDiF1SxHW.PQQPeCDD0JLCT3aLz("A free trial can't last negative days");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FreeTrialClaim) && this.S1zP5M3X7Ukq3ROlZ87G9I == ((FreeTrialClaim) obj).S1zP5M3X7Ukq3ROlZ87G9I;
    }

    public final int hashCode() {
        return Integer.hashCode(this.S1zP5M3X7Ukq3ROlZ87G9I);
    }

    public final String toString() {
        return oJ08Xj0ZV1gAa.Ql6q60SSx3(new StringBuilder("FreeTrialClaim(days="), this.S1zP5M3X7Ukq3ROlZ87G9I, ')');
    }
}
