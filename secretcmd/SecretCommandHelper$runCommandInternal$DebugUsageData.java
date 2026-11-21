package bitpit.launcher.secretcmd;

import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.VyitELzKRokr;
import b.mHW63SUma8isGb;
import b.qSDYaDqxbBy2QEeVAcFRy;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class SecretCommandHelper$runCommandInternal$DebugUsageData {
    public final double S1zP5M3X7Ukq3ROlZ87G9I;
    public final List axL8FocTDLUdzg0XScbO;
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] BezslBgjveK3hODH = {null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new VyitELzKRokr(3))};

    public static final class Companion {
        public final KSerializer serializer() {
            return SecretCommandHelper$runCommandInternal$DebugUsageData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SecretCommandHelper$runCommandInternal$DebugUsageData(int i, double d, List list) {
        if (3 != (i & 3)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 3, SecretCommandHelper$runCommandInternal$DebugUsageData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = d;
        this.axL8FocTDLUdzg0XScbO = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecretCommandHelper$runCommandInternal$DebugUsageData)) {
            return false;
        }
        SecretCommandHelper$runCommandInternal$DebugUsageData secretCommandHelper$runCommandInternal$DebugUsageData = (SecretCommandHelper$runCommandInternal$DebugUsageData) obj;
        return Double.compare(this.S1zP5M3X7Ukq3ROlZ87G9I, secretCommandHelper$runCommandInternal$DebugUsageData.S1zP5M3X7Ukq3ROlZ87G9I) == 0 && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, secretCommandHelper$runCommandInternal$DebugUsageData.axL8FocTDLUdzg0XScbO);
    }

    public final int hashCode() {
        return this.axL8FocTDLUdzg0XScbO.hashCode() + (Double.hashCode(this.S1zP5M3X7Ukq3ROlZ87G9I) * 31);
    }

    public final String toString() {
        return "DebugUsageData(weightSum=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", entries=" + this.axL8FocTDLUdzg0XScbO + ")";
    }

    public SecretCommandHelper$runCommandInternal$DebugUsageData(double d, List list) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = d;
        this.axL8FocTDLUdzg0XScbO = list;
    }
}
