package bitpit.launcher.theming.sharing;

import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.VyitELzKRokr;
import b.gubhzHXeHIlbXrmRj5i9I;
import b.mHW63SUma8isGb;
import b.qSDYaDqxbBy2QEeVAcFRy;
import b.ttvfpMMiEF2T4RElgYAPdt;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class SharedTheme$IconPack$System implements ttvfpMMiEF2T4RElgYAPdt {
    public final int S1zP5M3X7Ukq3ROlZ87G9I;
    public final gubhzHXeHIlbXrmRj5i9I axL8FocTDLUdzg0XScbO;
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] BezslBgjveK3hODH = {null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new VyitELzKRokr(17))};

    public static final class Companion {
        public final KSerializer serializer() {
            return SharedTheme$IconPack$System$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SharedTheme$IconPack$System(int i, int i2, gubhzHXeHIlbXrmRj5i9I gubhzhxehilbxrmrj5i9i) {
        if (3 != (i & 3)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 3, SharedTheme$IconPack$System$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = i2;
        this.axL8FocTDLUdzg0XScbO = gubhzhxehilbxrmrj5i9i;
    }

    @Override // b.ttvfpMMiEF2T4RElgYAPdt
    public final gubhzHXeHIlbXrmRj5i9I S1zP5M3X7Ukq3ROlZ87G9I() {
        return this.axL8FocTDLUdzg0XScbO;
    }

    @Override // b.ttvfpMMiEF2T4RElgYAPdt
    public final int axL8FocTDLUdzg0XScbO() {
        return this.S1zP5M3X7Ukq3ROlZ87G9I;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedTheme$IconPack$System)) {
            return false;
        }
        SharedTheme$IconPack$System sharedTheme$IconPack$System = (SharedTheme$IconPack$System) obj;
        return this.S1zP5M3X7Ukq3ROlZ87G9I == sharedTheme$IconPack$System.S1zP5M3X7Ukq3ROlZ87G9I && this.axL8FocTDLUdzg0XScbO == sharedTheme$IconPack$System.axL8FocTDLUdzg0XScbO;
    }

    public final int hashCode() {
        return this.axL8FocTDLUdzg0XScbO.hashCode() + (Integer.hashCode(this.S1zP5M3X7Ukq3ROlZ87G9I) * 31);
    }

    public final String toString() {
        return "System(iconSizePercent=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", iconShape=" + this.axL8FocTDLUdzg0XScbO + ")";
    }

    public SharedTheme$IconPack$System(int i, gubhzHXeHIlbXrmRj5i9I gubhzhxehilbxrmrj5i9i) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = i;
        this.axL8FocTDLUdzg0XScbO = gubhzhxehilbxrmrj5i9i;
    }
}
