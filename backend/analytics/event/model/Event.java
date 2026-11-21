package bitpit.launcher.backend.analytics.event.model;

import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.oJ08Xj0ZV1gAa;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class Event {
    public static final Companion Companion = new Companion();
    public final int BezslBgjveK3hODH;
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final String axL8FocTDLUdzg0XScbO;

    public static final class Companion {
        public final KSerializer serializer() {
            return Event$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Event(int i, int i2, String str, String str2) {
        if (1 != (i & 1)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 1, Event$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        if ((i & 2) == 0) {
            this.axL8FocTDLUdzg0XScbO = "";
        } else {
            this.axL8FocTDLUdzg0XScbO = str2;
        }
        if ((i & 4) == 0) {
            this.BezslBgjveK3hODH = 0;
        } else {
            this.BezslBgjveK3hODH = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, event.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, event.axL8FocTDLUdzg0XScbO) && this.BezslBgjveK3hODH == event.BezslBgjveK3hODH;
    }

    public final int hashCode() {
        return Integer.hashCode(this.BezslBgjveK3hODH) + LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31, this.axL8FocTDLUdzg0XScbO, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Event(name=");
        sb.append(this.S1zP5M3X7Ukq3ROlZ87G9I);
        sb.append(", value=");
        sb.append(this.axL8FocTDLUdzg0XScbO);
        sb.append(", flags=");
        return oJ08Xj0ZV1gAa.Ql6q60SSx3(sb, this.BezslBgjveK3hODH, ')');
    }
}
