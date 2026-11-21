package bitpit.launcher.screen;

import b.G71ctMPy0O3NI7eWB;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class CurrentScreenAgentFunction$Result {
    public static final Companion Companion = new Companion();
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final String axL8FocTDLUdzg0XScbO;

    public static final class Companion {
        public final KSerializer serializer() {
            return CurrentScreenAgentFunction$Result$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CurrentScreenAgentFunction$Result(String str, int i, String str2) {
        if (3 != (i & 3)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 3, CurrentScreenAgentFunction$Result$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrentScreenAgentFunction$Result)) {
            return false;
        }
        CurrentScreenAgentFunction$Result currentScreenAgentFunction$Result = (CurrentScreenAgentFunction$Result) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, currentScreenAgentFunction$Result.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, currentScreenAgentFunction$Result.axL8FocTDLUdzg0XScbO);
    }

    public final int hashCode() {
        String str = this.S1zP5M3X7Ukq3ROlZ87G9I;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.axL8FocTDLUdzg0XScbO;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return G71ctMPy0O3NI7eWB.flPMk2Ix9h3b95v("Result(homeActivityState=", this.S1zP5M3X7Ukq3ROlZ87G9I, ", screen=", this.axL8FocTDLUdzg0XScbO, ")");
    }
}
