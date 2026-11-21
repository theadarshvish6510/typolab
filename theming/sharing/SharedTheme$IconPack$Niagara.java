package bitpit.launcher.theming.sharing;

import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.VyitELzKRokr;
import b.gubhzHXeHIlbXrmRj5i9I;
import b.mHW63SUma8isGb;
import b.qSDYaDqxbBy2QEeVAcFRy;
import b.ttvfpMMiEF2T4RElgYAPdt;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class SharedTheme$IconPack$Niagara implements ttvfpMMiEF2T4RElgYAPdt {
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] ziNFA7KzVfc6 = {null, null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new VyitELzKRokr(15))};
    public final gubhzHXeHIlbXrmRj5i9I BezslBgjveK3hODH;
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final int axL8FocTDLUdzg0XScbO;

    public static final class Companion {
        public final KSerializer serializer() {
            return SharedTheme$IconPack$Niagara$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SharedTheme$IconPack$Niagara(int i, String str, int i2, gubhzHXeHIlbXrmRj5i9I gubhzhxehilbxrmrj5i9i) {
        if (7 != (i & 7)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 7, SharedTheme$IconPack$Niagara$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = i2;
        this.BezslBgjveK3hODH = gubhzhxehilbxrmrj5i9i;
    }

    @Override // b.ttvfpMMiEF2T4RElgYAPdt
    public final gubhzHXeHIlbXrmRj5i9I S1zP5M3X7Ukq3ROlZ87G9I() {
        return this.BezslBgjveK3hODH;
    }

    @Override // b.ttvfpMMiEF2T4RElgYAPdt
    public final int axL8FocTDLUdzg0XScbO() {
        return this.axL8FocTDLUdzg0XScbO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedTheme$IconPack$Niagara)) {
            return false;
        }
        SharedTheme$IconPack$Niagara sharedTheme$IconPack$Niagara = (SharedTheme$IconPack$Niagara) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, sharedTheme$IconPack$Niagara.S1zP5M3X7Ukq3ROlZ87G9I) && this.axL8FocTDLUdzg0XScbO == sharedTheme$IconPack$Niagara.axL8FocTDLUdzg0XScbO && this.BezslBgjveK3hODH == sharedTheme$IconPack$Niagara.BezslBgjveK3hODH;
    }

    public final int hashCode() {
        return this.BezslBgjveK3hODH.hashCode() + LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.axL8FocTDLUdzg0XScbO, this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Niagara(identifier=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", iconSizePercent=" + this.axL8FocTDLUdzg0XScbO + ", iconShape=" + this.BezslBgjveK3hODH + ")";
    }

    public SharedTheme$IconPack$Niagara(String str, int i, gubhzHXeHIlbXrmRj5i9I gubhzhxehilbxrmrj5i9i) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = i;
        this.BezslBgjveK3hODH = gubhzhxehilbxrmrj5i9i;
    }
}
