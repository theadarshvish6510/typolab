package bitpit.launcher.secretcmd;

import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.aJLiMmqfPh61r;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class SecretCommandHelper$runCommandInternal$DebugItemInfoUsageData {
    public static final Companion Companion = new Companion();
    public final Integer BezslBgjveK3hODH;
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final String axL8FocTDLUdzg0XScbO;
    public final Double ziNFA7KzVfc6;

    public static final class Companion {
        public final KSerializer serializer() {
            return SecretCommandHelper$runCommandInternal$DebugItemInfoUsageData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SecretCommandHelper$runCommandInternal$DebugItemInfoUsageData(int i, String str, String str2, Integer num, Double d) {
        if (15 != (i & 15)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 15, SecretCommandHelper$runCommandInternal$DebugItemInfoUsageData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = str2;
        this.BezslBgjveK3hODH = num;
        this.ziNFA7KzVfc6 = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecretCommandHelper$runCommandInternal$DebugItemInfoUsageData)) {
            return false;
        }
        SecretCommandHelper$runCommandInternal$DebugItemInfoUsageData secretCommandHelper$runCommandInternal$DebugItemInfoUsageData = (SecretCommandHelper$runCommandInternal$DebugItemInfoUsageData) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, secretCommandHelper$runCommandInternal$DebugItemInfoUsageData.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, secretCommandHelper$runCommandInternal$DebugItemInfoUsageData.axL8FocTDLUdzg0XScbO) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.BezslBgjveK3hODH, secretCommandHelper$runCommandInternal$DebugItemInfoUsageData.BezslBgjveK3hODH) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.ziNFA7KzVfc6, secretCommandHelper$runCommandInternal$DebugItemInfoUsageData.ziNFA7KzVfc6);
    }

    public final int hashCode() {
        int iOx9eclwMpRd = LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31, this.axL8FocTDLUdzg0XScbO, 31);
        Integer num = this.BezslBgjveK3hODH;
        int iHashCode = (iOx9eclwMpRd + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.ziNFA7KzVfc6;
        return iHashCode + (d != null ? d.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbH5sQ15nhYoaKKHhx = aJLiMmqfPh61r.H5sQ15nhYoaKKHhx("DebugItemInfoUsageData(packageName=", this.S1zP5M3X7Ukq3ROlZ87G9I, ", type=", this.axL8FocTDLUdzg0XScbO, ", weight=");
        sbH5sQ15nhYoaKKHhx.append(this.BezslBgjveK3hODH);
        sbH5sQ15nhYoaKKHhx.append(", percentage=");
        sbH5sQ15nhYoaKKHhx.append(this.ziNFA7KzVfc6);
        sbH5sQ15nhYoaKKHhx.append(")");
        return sbH5sQ15nhYoaKKHhx.toString();
    }

    public SecretCommandHelper$runCommandInternal$DebugItemInfoUsageData(String str, String str2, Integer num, Double d) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = str2;
        this.BezslBgjveK3hODH = num;
        this.ziNFA7KzVfc6 = d;
    }
}
