package bitpit.launcher.theming.sharing;

import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.VyitELzKRokr;
import b.aJLiMmqfPh61r;
import b.gubhzHXeHIlbXrmRj5i9I;
import b.mHW63SUma8isGb;
import b.qSDYaDqxbBy2QEeVAcFRy;
import b.ttvfpMMiEF2T4RElgYAPdt;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class SharedTheme$IconPack$External implements ttvfpMMiEF2T4RElgYAPdt {
    public final int BezslBgjveK3hODH;
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final String axL8FocTDLUdzg0XScbO;
    public final gubhzHXeHIlbXrmRj5i9I ziNFA7KzVfc6;
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] Aboow6rUrcY2SrFRa46C6uy = {null, null, null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new VyitELzKRokr(14))};

    public static final class Companion {
        public final KSerializer serializer() {
            return SharedTheme$IconPack$External$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SharedTheme$IconPack$External(int i, String str, String str2, int i2, gubhzHXeHIlbXrmRj5i9I gubhzhxehilbxrmrj5i9i) {
        if (15 != (i & 15)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 15, SharedTheme$IconPack$External$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = str2;
        this.BezslBgjveK3hODH = i2;
        this.ziNFA7KzVfc6 = gubhzhxehilbxrmrj5i9i;
    }

    @Override // b.ttvfpMMiEF2T4RElgYAPdt
    public final gubhzHXeHIlbXrmRj5i9I S1zP5M3X7Ukq3ROlZ87G9I() {
        return this.ziNFA7KzVfc6;
    }

    @Override // b.ttvfpMMiEF2T4RElgYAPdt
    public final int axL8FocTDLUdzg0XScbO() {
        return this.BezslBgjveK3hODH;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedTheme$IconPack$External)) {
            return false;
        }
        SharedTheme$IconPack$External sharedTheme$IconPack$External = (SharedTheme$IconPack$External) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, sharedTheme$IconPack$External.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, sharedTheme$IconPack$External.axL8FocTDLUdzg0XScbO) && this.BezslBgjveK3hODH == sharedTheme$IconPack$External.BezslBgjveK3hODH && this.ziNFA7KzVfc6 == sharedTheme$IconPack$External.ziNFA7KzVfc6;
    }

    public final int hashCode() {
        int iHashCode = this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31;
        String str = this.axL8FocTDLUdzg0XScbO;
        return this.ziNFA7KzVfc6.hashCode() + LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.BezslBgjveK3hODH, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbH5sQ15nhYoaKKHhx = aJLiMmqfPh61r.H5sQ15nhYoaKKHhx("External(packageName=", this.S1zP5M3X7Ukq3ROlZ87G9I, ", name=", this.axL8FocTDLUdzg0XScbO, ", iconSizePercent=");
        sbH5sQ15nhYoaKKHhx.append(this.BezslBgjveK3hODH);
        sbH5sQ15nhYoaKKHhx.append(", iconShape=");
        sbH5sQ15nhYoaKKHhx.append(this.ziNFA7KzVfc6);
        sbH5sQ15nhYoaKKHhx.append(")");
        return sbH5sQ15nhYoaKKHhx.toString();
    }

    public SharedTheme$IconPack$External(String str, String str2, int i, gubhzHXeHIlbXrmRj5i9I gubhzhxehilbxrmrj5i9i) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = str2;
        this.BezslBgjveK3hODH = i;
        this.ziNFA7KzVfc6 = gubhzhxehilbxrmrj5i9i;
    }
}
