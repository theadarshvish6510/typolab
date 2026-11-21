package bitpit.launcher.onboarding.value_explainer;

import b.KjpLK4IQzcoI;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.aJLiMmqfPh61r;
import b.g3F3ECxxX7;
import b.mHW63SUma8isGb;
import b.qSDYaDqxbBy2QEeVAcFRy;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class ValueExplainerConfig {
    public final String BezslBgjveK3hODH;
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final List axL8FocTDLUdzg0XScbO;
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] ziNFA7KzVfc6 = {null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new g3F3ECxxX7(25)), null};
    public static final ValueExplainerConfig Aboow6rUrcY2SrFRa46C6uy = new ValueExplainerConfig(KjpLK4IQzcoI.H5sQ15nhYoaKKHhx(0L, 4300L, 7183L, 15000L));

    public static final class Companion {
        public final KSerializer serializer() {
            return ValueExplainerConfig$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ValueExplainerConfig(int i, String str, List list, String str2) {
        if (7 != (i & 7)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 7, ValueExplainerConfig$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = list;
        this.BezslBgjveK3hODH = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValueExplainerConfig)) {
            return false;
        }
        ValueExplainerConfig valueExplainerConfig = (ValueExplainerConfig) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, valueExplainerConfig.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, valueExplainerConfig.axL8FocTDLUdzg0XScbO) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.BezslBgjveK3hODH, valueExplainerConfig.BezslBgjveK3hODH);
    }

    public final int hashCode() {
        int iHashCode = (this.axL8FocTDLUdzg0XScbO.hashCode() + (this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31)) * 31;
        String str = this.BezslBgjveK3hODH;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValueExplainerConfig(videoManifestUrl=");
        sb.append(this.S1zP5M3X7Ukq3ROlZ87G9I);
        sb.append(", sceneStartsMs=");
        sb.append(this.axL8FocTDLUdzg0XScbO);
        sb.append(", backgroundColorHex=");
        return aJLiMmqfPh61r.ToEIy0qfkltfGfO3vmAQG(sb, this.BezslBgjveK3hODH, ")");
    }

    public ValueExplainerConfig(List list) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = "https://videos.niagaralauncher.app/onboarding_value_explainer_prototype.mpd";
        this.axL8FocTDLUdzg0XScbO = list;
        this.BezslBgjveK3hODH = null;
    }
}
