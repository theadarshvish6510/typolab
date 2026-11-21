package bitpit.launcher.ataglance;

import b.J0tNOcVdQ2JmIxX3cTuEd;
import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.aJLiMmqfPh61r;
import b.mHW63SUma8isGb;
import b.qSDYaDqxbBy2QEeVAcFRy;
import b.vdBBwKx45uSJHLCNxSnPL6OZU4;
import bitpit.launcher.text.RemoteFont;
import java.util.Collections;
import java.util.Map;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class AtAGlanceInfo {
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] ziNFA7KzVfc6 = {null, null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new vdBBwKx45uSJHLCNxSnPL6OZU4(14))};
    public final Map BezslBgjveK3hODH;
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final String axL8FocTDLUdzg0XScbO;

    public static final class Companion {
        public static AtAGlanceInfo S1zP5M3X7Ukq3ROlZ87G9I(RemoteFont remoteFont) {
            return new AtAGlanceInfo("basic", "legacy", Collections.singletonMap("font", remoteFont.S1zP5M3X7Ukq3ROlZ87G9I));
        }

        public final KSerializer serializer() {
            return AtAGlanceInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AtAGlanceInfo(int i, String str, String str2, Map map) {
        if (3 != (i & 3)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 3, AtAGlanceInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = str2;
        if ((i & 4) == 0) {
            this.BezslBgjveK3hODH = J0tNOcVdQ2JmIxX3cTuEd.GO8WUug7ZWFCUI1zY;
        } else {
            this.BezslBgjveK3hODH = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtAGlanceInfo)) {
            return false;
        }
        AtAGlanceInfo atAGlanceInfo = (AtAGlanceInfo) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, atAGlanceInfo.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, atAGlanceInfo.axL8FocTDLUdzg0XScbO) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.BezslBgjveK3hODH, atAGlanceInfo.BezslBgjveK3hODH);
    }

    public final int hashCode() {
        return this.BezslBgjveK3hODH.hashCode() + LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31, this.axL8FocTDLUdzg0XScbO, 31);
    }

    public final String toString() {
        StringBuilder sbH5sQ15nhYoaKKHhx = aJLiMmqfPh61r.H5sQ15nhYoaKKHhx("AtAGlanceInfo(styleName=", this.S1zP5M3X7Ukq3ROlZ87G9I, ", variant=", this.axL8FocTDLUdzg0XScbO, ", options=");
        sbH5sQ15nhYoaKKHhx.append(this.BezslBgjveK3hODH);
        sbH5sQ15nhYoaKKHhx.append(")");
        return sbH5sQ15nhYoaKKHhx.toString();
    }

    public AtAGlanceInfo(String str, String str2, Map map) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = str2;
        this.BezslBgjveK3hODH = map;
    }

    public /* synthetic */ AtAGlanceInfo(String str, String str2) {
        this(str, str2, J0tNOcVdQ2JmIxX3cTuEd.GO8WUug7ZWFCUI1zY);
    }
}
