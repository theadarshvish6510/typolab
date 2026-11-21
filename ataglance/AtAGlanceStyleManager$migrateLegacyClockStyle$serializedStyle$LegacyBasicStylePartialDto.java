package bitpit.launcher.ataglance;

import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import bitpit.launcher.text.RemoteFont;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class AtAGlanceStyleManager$migrateLegacyClockStyle$serializedStyle$LegacyBasicStylePartialDto {
    public static final Companion Companion = new Companion();
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final RemoteFont axL8FocTDLUdzg0XScbO;

    public static final class Companion {
        public final KSerializer serializer() {
            return AtAGlanceStyleManager$migrateLegacyClockStyle$serializedStyle$LegacyBasicStylePartialDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AtAGlanceStyleManager$migrateLegacyClockStyle$serializedStyle$LegacyBasicStylePartialDto(int i, String str, RemoteFont remoteFont) {
        if (1 != (i & 1)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 1, AtAGlanceStyleManager$migrateLegacyClockStyle$serializedStyle$LegacyBasicStylePartialDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        if ((i & 2) == 0) {
            this.axL8FocTDLUdzg0XScbO = null;
        } else {
            this.axL8FocTDLUdzg0XScbO = remoteFont;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtAGlanceStyleManager$migrateLegacyClockStyle$serializedStyle$LegacyBasicStylePartialDto)) {
            return false;
        }
        AtAGlanceStyleManager$migrateLegacyClockStyle$serializedStyle$LegacyBasicStylePartialDto atAGlanceStyleManager$migrateLegacyClockStyle$serializedStyle$LegacyBasicStylePartialDto = (AtAGlanceStyleManager$migrateLegacyClockStyle$serializedStyle$LegacyBasicStylePartialDto) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, atAGlanceStyleManager$migrateLegacyClockStyle$serializedStyle$LegacyBasicStylePartialDto.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, atAGlanceStyleManager$migrateLegacyClockStyle$serializedStyle$LegacyBasicStylePartialDto.axL8FocTDLUdzg0XScbO);
    }

    public final int hashCode() {
        int iHashCode = this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31;
        RemoteFont remoteFont = this.axL8FocTDLUdzg0XScbO;
        return iHashCode + (remoteFont == null ? 0 : remoteFont.hashCode());
    }

    public final String toString() {
        return "LegacyBasicStylePartialDto(type=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", font=" + this.axL8FocTDLUdzg0XScbO + ")";
    }
}
