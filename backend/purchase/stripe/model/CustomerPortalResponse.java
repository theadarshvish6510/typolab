package bitpit.launcher.backend.purchase.stripe.model;

import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class CustomerPortalResponse {
    public static final Companion Companion = new Companion();
    public final String S1zP5M3X7Ukq3ROlZ87G9I;

    public static final class Companion {
        public final KSerializer serializer() {
            return CustomerPortalResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CustomerPortalResponse(int i, String str) {
        if (1 == (i & 1)) {
            this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        } else {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 1, CustomerPortalResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CustomerPortalResponse) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, ((CustomerPortalResponse) obj).S1zP5M3X7Ukq3ROlZ87G9I);
    }

    public final int hashCode() {
        String str = this.S1zP5M3X7Ukq3ROlZ87G9I;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return LthVJzs8YB767vHOMwO80UNP7QrQi.HveD9n1tOYlffjJDxghBitYNgB(new StringBuilder("CustomerPortalResponse(url="), this.S1zP5M3X7Ukq3ROlZ87G9I, ')');
    }
}
