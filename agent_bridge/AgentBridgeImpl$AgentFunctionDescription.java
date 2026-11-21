package bitpit.launcher.agent_bridge;

import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.aJLiMmqfPh61r;
import b.mHW63SUma8isGb;
import b.qSDYaDqxbBy2QEeVAcFRy;
import b.vdBBwKx45uSJHLCNxSnPL6OZU4;
import java.util.Map;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class AgentBridgeImpl$AgentFunctionDescription {
    public final Map BezslBgjveK3hODH;
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final String axL8FocTDLUdzg0XScbO;
    public final Map ziNFA7KzVfc6;
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] Aboow6rUrcY2SrFRa46C6uy = {null, null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new vdBBwKx45uSJHLCNxSnPL6OZU4(0)), qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new vdBBwKx45uSJHLCNxSnPL6OZU4(1))};

    public static final class Companion {
        public final KSerializer serializer() {
            return AgentBridgeImpl$AgentFunctionDescription$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AgentBridgeImpl$AgentFunctionDescription(int i, String str, String str2, Map map, Map map2) {
        if (15 != (i & 15)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 15, AgentBridgeImpl$AgentFunctionDescription$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = str2;
        this.BezslBgjveK3hODH = map;
        this.ziNFA7KzVfc6 = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgentBridgeImpl$AgentFunctionDescription)) {
            return false;
        }
        AgentBridgeImpl$AgentFunctionDescription agentBridgeImpl$AgentFunctionDescription = (AgentBridgeImpl$AgentFunctionDescription) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, agentBridgeImpl$AgentFunctionDescription.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, agentBridgeImpl$AgentFunctionDescription.axL8FocTDLUdzg0XScbO) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.BezslBgjveK3hODH, agentBridgeImpl$AgentFunctionDescription.BezslBgjveK3hODH) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.ziNFA7KzVfc6, agentBridgeImpl$AgentFunctionDescription.ziNFA7KzVfc6);
    }

    public final int hashCode() {
        return this.ziNFA7KzVfc6.hashCode() + ((this.BezslBgjveK3hODH.hashCode() + LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31, this.axL8FocTDLUdzg0XScbO, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbH5sQ15nhYoaKKHhx = aJLiMmqfPh61r.H5sQ15nhYoaKKHhx("AgentFunctionDescription(name=", this.S1zP5M3X7Ukq3ROlZ87G9I, ", description=", this.axL8FocTDLUdzg0XScbO, ", arguments=");
        sbH5sQ15nhYoaKKHhx.append(this.BezslBgjveK3hODH);
        sbH5sQ15nhYoaKKHhx.append(", result=");
        sbH5sQ15nhYoaKKHhx.append(this.ziNFA7KzVfc6);
        sbH5sQ15nhYoaKKHhx.append(")");
        return sbH5sQ15nhYoaKKHhx.toString();
    }
}
