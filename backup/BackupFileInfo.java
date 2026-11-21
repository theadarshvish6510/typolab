package bitpit.launcher.backup;

import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.oJ08Xj0ZV1gAa;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class BackupFileInfo {
    public static final Companion Companion = new Companion();
    public final int BezslBgjveK3hODH;
    public final int S1zP5M3X7Ukq3ROlZ87G9I;
    public final long axL8FocTDLUdzg0XScbO;

    public static final class Companion {
        public final KSerializer serializer() {
            return BackupFileInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BackupFileInfo(int i, int i2, long j, int i3) {
        if (7 != (i & 7)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 7, BackupFileInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = i2;
        this.axL8FocTDLUdzg0XScbO = j;
        this.BezslBgjveK3hODH = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackupFileInfo)) {
            return false;
        }
        BackupFileInfo backupFileInfo = (BackupFileInfo) obj;
        return this.S1zP5M3X7Ukq3ROlZ87G9I == backupFileInfo.S1zP5M3X7Ukq3ROlZ87G9I && this.axL8FocTDLUdzg0XScbO == backupFileInfo.axL8FocTDLUdzg0XScbO && this.BezslBgjveK3hODH == backupFileInfo.BezslBgjveK3hODH;
    }

    public final int hashCode() {
        return Integer.hashCode(this.BezslBgjveK3hODH) + oJ08Xj0ZV1gAa.PQQPeCDD0JLCT3aLz(Integer.hashCode(this.S1zP5M3X7Ukq3ROlZ87G9I) * 31, this.axL8FocTDLUdzg0XScbO, 31);
    }

    public final String toString() {
        return "BackupFileInfo(version=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", dateCreated=" + this.axL8FocTDLUdzg0XScbO + ", launcherVersionCode=" + this.BezslBgjveK3hODH + ")";
    }

    public BackupFileInfo(long j) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = 1;
        this.axL8FocTDLUdzg0XScbO = j;
        this.BezslBgjveK3hODH = 1642;
    }
}
