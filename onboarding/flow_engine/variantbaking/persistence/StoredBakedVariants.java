package bitpit.launcher.onboarding.flow_engine.variantbaking.persistence;

import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.VyitELzKRokr;
import b.mHW63SUma8isGb;
import b.qSDYaDqxbBy2QEeVAcFRy;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class StoredBakedVariants {
    public final int S1zP5M3X7Ukq3ROlZ87G9I;
    public final Map axL8FocTDLUdzg0XScbO;
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] BezslBgjveK3hODH = {null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new VyitELzKRokr(23))};

    public static final class Companion {
        public final KSerializer serializer() {
            return StoredBakedVariants$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ StoredBakedVariants(int i, int i2, Map map) {
        if (3 != (i & 3)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 3, StoredBakedVariants$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = i2;
        this.axL8FocTDLUdzg0XScbO = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoredBakedVariants)) {
            return false;
        }
        StoredBakedVariants storedBakedVariants = (StoredBakedVariants) obj;
        return this.S1zP5M3X7Ukq3ROlZ87G9I == storedBakedVariants.S1zP5M3X7Ukq3ROlZ87G9I && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, storedBakedVariants.axL8FocTDLUdzg0XScbO);
    }

    public final int hashCode() {
        return this.axL8FocTDLUdzg0XScbO.hashCode() + (Integer.hashCode(this.S1zP5M3X7Ukq3ROlZ87G9I) * 31);
    }

    public final String toString() {
        return "StoredBakedVariants(appVersion=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", selections=" + this.axL8FocTDLUdzg0XScbO + ")";
    }

    public StoredBakedVariants(int i, LinkedHashMap linkedHashMap) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = i;
        this.axL8FocTDLUdzg0XScbO = linkedHashMap;
    }
}
