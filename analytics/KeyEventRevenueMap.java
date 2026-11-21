package bitpit.launcher.analytics;

import b.OkhdZkC3NYLW;
import b.PFgpcGG75zWSbgykRZqS7S;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.mHW63SUma8isGb;
import b.qSDYaDqxbBy2QEeVAcFRy;
import java.util.Map;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class KeyEventRevenueMap {
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] axL8FocTDLUdzg0XScbO = {qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new PFgpcGG75zWSbgykRZqS7S(15))};
    public final Map S1zP5M3X7Ukq3ROlZ87G9I;

    public static final class Companion {
        public final KSerializer serializer() {
            return KeyEventRevenueMap$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ KeyEventRevenueMap(int i, Map map) {
        if (1 == (i & 1)) {
            this.S1zP5M3X7Ukq3ROlZ87G9I = map;
        } else {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 1, KeyEventRevenueMap$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KeyEventRevenueMap) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, ((KeyEventRevenueMap) obj).S1zP5M3X7Ukq3ROlZ87G9I);
    }

    public final int hashCode() {
        return this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode();
    }

    public final String toString() {
        return "KeyEventRevenueMap(internalMap=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ")";
    }
}
