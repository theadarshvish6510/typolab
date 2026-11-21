package bitpit.launcher.analytics;

import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.gkp6pLZDZ4B;
import b.mHW63SUma8isGb;
import b.qSDYaDqxbBy2QEeVAcFRy;
import java.util.Map;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseEventValidator$EventDto {
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final Map axL8FocTDLUdzg0XScbO;
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] BezslBgjveK3hODH = {null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new gkp6pLZDZ4B(13))};

    public static final class Companion {
        public final KSerializer serializer() {
            return FirebaseEventValidator$EventDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FirebaseEventValidator$EventDto(int i, String str, Map map) {
        if (1 != (i & 1)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 1, FirebaseEventValidator$EventDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        if ((i & 2) == 0) {
            this.axL8FocTDLUdzg0XScbO = null;
        } else {
            this.axL8FocTDLUdzg0XScbO = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirebaseEventValidator$EventDto)) {
            return false;
        }
        FirebaseEventValidator$EventDto firebaseEventValidator$EventDto = (FirebaseEventValidator$EventDto) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, firebaseEventValidator$EventDto.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, firebaseEventValidator$EventDto.axL8FocTDLUdzg0XScbO);
    }

    public final int hashCode() {
        int iHashCode = this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31;
        Map map = this.axL8FocTDLUdzg0XScbO;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "EventDto(eventName=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", parameters=" + this.axL8FocTDLUdzg0XScbO + ")";
    }
}
