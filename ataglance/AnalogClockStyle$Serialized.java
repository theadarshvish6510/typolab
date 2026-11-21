package bitpit.launcher.ataglance;

import b.D4uDt21iAp885MiybCJz3keA;
import b.FpPKuZSICRwmtnKMNyTFDH7cV;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.aJLiMmqfPh61r;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class AnalogClockStyle$Serialized implements D4uDt21iAp885MiybCJz3keA {
    public static final Companion Companion = new Companion();
    public final int BezslBgjveK3hODH;
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final AtAGlanceInfo axL8FocTDLUdzg0XScbO;

    public static final class Companion {
        public final KSerializer serializer() {
            return AnalogClockStyle$Serialized$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AnalogClockStyle$Serialized(int i, String str, AtAGlanceInfo atAGlanceInfo, FpPKuZSICRwmtnKMNyTFDH7cV fpPKuZSICRwmtnKMNyTFDH7cV) {
        if (7 != (i & 7)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 7, AnalogClockStyle$Serialized$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = atAGlanceInfo;
        this.BezslBgjveK3hODH = fpPKuZSICRwmtnKMNyTFDH7cV.S1zP5M3X7Ukq3ROlZ87G9I;
    }

    @Override // b.D4uDt21iAp885MiybCJz3keA
    public final String BezslBgjveK3hODH() {
        return this.S1zP5M3X7Ukq3ROlZ87G9I;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalogClockStyle$Serialized)) {
            return false;
        }
        AnalogClockStyle$Serialized analogClockStyle$Serialized = (AnalogClockStyle$Serialized) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, analogClockStyle$Serialized.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, analogClockStyle$Serialized.axL8FocTDLUdzg0XScbO) && this.BezslBgjveK3hODH == analogClockStyle$Serialized.BezslBgjveK3hODH;
    }

    public final int hashCode() {
        return Integer.hashCode(this.BezslBgjveK3hODH) + ((this.axL8FocTDLUdzg0XScbO.hashCode() + (this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String strS1zP5M3X7Ukq3ROlZ87G9I = FpPKuZSICRwmtnKMNyTFDH7cV.S1zP5M3X7Ukq3ROlZ87G9I(this.BezslBgjveK3hODH);
        StringBuilder sb = new StringBuilder("Serialized(uuid=");
        sb.append(this.S1zP5M3X7Ukq3ROlZ87G9I);
        sb.append(", info=");
        sb.append(this.axL8FocTDLUdzg0XScbO);
        sb.append(", style=");
        return aJLiMmqfPh61r.ToEIy0qfkltfGfO3vmAQG(sb, strS1zP5M3X7Ukq3ROlZ87G9I, ")");
    }

    @Override // b.D4uDt21iAp885MiybCJz3keA
    public final AtAGlanceInfo ziNFA7KzVfc6() {
        return this.axL8FocTDLUdzg0XScbO;
    }

    public AnalogClockStyle$Serialized(int i, AtAGlanceInfo atAGlanceInfo, String str) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = atAGlanceInfo;
        this.BezslBgjveK3hODH = i;
    }
}
