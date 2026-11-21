package bitpit.launcher.analytics;

import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class Money {
    public static final Companion Companion = new Companion();
    public final double S1zP5M3X7Ukq3ROlZ87G9I;
    public final String axL8FocTDLUdzg0XScbO;

    public static final class Companion {
        public final KSerializer serializer() {
            return Money$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Money(int i, double d, String str) {
        if (3 != (i & 3)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 3, Money$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = d;
        this.axL8FocTDLUdzg0XScbO = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Money)) {
            return false;
        }
        Money money = (Money) obj;
        return Double.compare(this.S1zP5M3X7Ukq3ROlZ87G9I, money.S1zP5M3X7Ukq3ROlZ87G9I) == 0 && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, money.axL8FocTDLUdzg0XScbO);
    }

    public final int hashCode() {
        return this.axL8FocTDLUdzg0XScbO.hashCode() + (Double.hashCode(this.S1zP5M3X7Ukq3ROlZ87G9I) * 31);
    }

    public final String toString() {
        return "Money(amount=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", currency=" + this.axL8FocTDLUdzg0XScbO + ")";
    }
}
