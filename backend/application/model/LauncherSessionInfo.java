package bitpit.launcher.backend.application.model;

import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class LauncherSessionInfo {
    public static final Companion Companion = new Companion();
    public final long BezslBgjveK3hODH;
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final String axL8FocTDLUdzg0XScbO;

    public static final class Companion {
        public final KSerializer serializer() {
            return LauncherSessionInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LauncherSessionInfo(int i, long j, String str, String str2) {
        if (7 != (i & 7)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 7, LauncherSessionInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = str2;
        this.BezslBgjveK3hODH = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LauncherSessionInfo)) {
            return false;
        }
        LauncherSessionInfo launcherSessionInfo = (LauncherSessionInfo) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, launcherSessionInfo.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, launcherSessionInfo.axL8FocTDLUdzg0XScbO) && this.BezslBgjveK3hODH == launcherSessionInfo.BezslBgjveK3hODH;
    }

    public final int hashCode() {
        return Long.hashCode(this.BezslBgjveK3hODH) + LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31, this.axL8FocTDLUdzg0XScbO, 31);
    }

    public final String toString() {
        return "LauncherSessionInfo(sessionId=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", deviceName=" + this.axL8FocTDLUdzg0XScbO + ", lastActiveTime=" + this.BezslBgjveK3hODH + ')';
    }
}
