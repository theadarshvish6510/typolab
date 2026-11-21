package bitpit.launcher.backend.purchase.stripe.model;

import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.WODNjgP22iG;
import b.mHW63SUma8isGb;
import b.mrAjgCjIlpxZ7lEJ;
import b.qSDYaDqxbBy2QEeVAcFRy;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class PurchaseRequest {
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] axL8FocTDLUdzg0XScbO = {qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new mrAjgCjIlpxZ7lEJ(25))};
    public final WODNjgP22iG S1zP5M3X7Ukq3ROlZ87G9I;

    public static final class Companion {
        public final KSerializer serializer() {
            return PurchaseRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PurchaseRequest(int i, WODNjgP22iG wODNjgP22iG) {
        if (1 == (i & 1)) {
            this.S1zP5M3X7Ukq3ROlZ87G9I = wODNjgP22iG;
        } else {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 1, PurchaseRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PurchaseRequest) && this.S1zP5M3X7Ukq3ROlZ87G9I == ((PurchaseRequest) obj).S1zP5M3X7Ukq3ROlZ87G9I;
    }

    public final int hashCode() {
        return this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode();
    }

    public final String toString() {
        return "PurchaseRequest(licenseType=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ')';
    }

    public PurchaseRequest(WODNjgP22iG wODNjgP22iG) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = wODNjgP22iG;
    }
}
