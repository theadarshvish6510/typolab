package bitpit.launcher.clicks.message_hub.empty_state;

import b.FnJAr7PQdTXFvdr5UoH7yVBAHyqev;
import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class RandomBag$Memento {
    public static final Companion Companion = new Companion();
    public final boolean BezslBgjveK3hODH;
    public final long S1zP5M3X7Ukq3ROlZ87G9I;
    public final int axL8FocTDLUdzg0XScbO;

    public static final class Companion {
        public final KSerializer serializer() {
            return RandomBag$Memento$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RandomBag$Memento(int i, long j, FnJAr7PQdTXFvdr5UoH7yVBAHyqev fnJAr7PQdTXFvdr5UoH7yVBAHyqev, boolean z) {
        if (3 != (i & 3)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 3, RandomBag$Memento$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = j;
        this.axL8FocTDLUdzg0XScbO = fnJAr7PQdTXFvdr5UoH7yVBAHyqev.GO8WUug7ZWFCUI1zY;
        if ((i & 4) == 0) {
            this.BezslBgjveK3hODH = false;
        } else {
            this.BezslBgjveK3hODH = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RandomBag$Memento)) {
            return false;
        }
        RandomBag$Memento randomBag$Memento = (RandomBag$Memento) obj;
        return this.S1zP5M3X7Ukq3ROlZ87G9I == randomBag$Memento.S1zP5M3X7Ukq3ROlZ87G9I && this.axL8FocTDLUdzg0XScbO == randomBag$Memento.axL8FocTDLUdzg0XScbO && this.BezslBgjveK3hODH == randomBag$Memento.BezslBgjveK3hODH;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.BezslBgjveK3hODH) + LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.axL8FocTDLUdzg0XScbO, Long.hashCode(this.S1zP5M3X7Ukq3ROlZ87G9I) * 31, 31);
    }

    public final String toString() {
        return "Memento(seed=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", numItemsDrawn=" + String.valueOf(((long) this.axL8FocTDLUdzg0XScbO) & 4294967295L) + ", firstAndSecondSwapped=" + this.BezslBgjveK3hODH + ")";
    }

    public RandomBag$Memento(int i, long j, boolean z) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = j;
        this.axL8FocTDLUdzg0XScbO = i;
        this.BezslBgjveK3hODH = z;
    }
}
