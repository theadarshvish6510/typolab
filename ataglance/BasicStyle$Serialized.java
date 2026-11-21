package bitpit.launcher.ataglance;

import b.D4uDt21iAp885MiybCJz3keA;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import bitpit.launcher.text.RemoteFont;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class BasicStyle$Serialized implements D4uDt21iAp885MiybCJz3keA {
    public static final Companion Companion = new Companion();
    public final RemoteFont BezslBgjveK3hODH;
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final AtAGlanceInfo axL8FocTDLUdzg0XScbO;
    public final float ziNFA7KzVfc6;

    public static final class Companion {
        public final KSerializer serializer() {
            return BasicStyle$Serialized$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BasicStyle$Serialized(int i, String str, AtAGlanceInfo atAGlanceInfo, RemoteFont remoteFont, float f) {
        if (7 != (i & 7)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 7, BasicStyle$Serialized$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = atAGlanceInfo;
        this.BezslBgjveK3hODH = remoteFont;
        if ((i & 8) == 0) {
            this.ziNFA7KzVfc6 = 1.0f;
        } else {
            this.ziNFA7KzVfc6 = f;
        }
    }

    @Override // b.D4uDt21iAp885MiybCJz3keA
    public final String BezslBgjveK3hODH() {
        return this.S1zP5M3X7Ukq3ROlZ87G9I;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasicStyle$Serialized)) {
            return false;
        }
        BasicStyle$Serialized basicStyle$Serialized = (BasicStyle$Serialized) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, basicStyle$Serialized.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, basicStyle$Serialized.axL8FocTDLUdzg0XScbO) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.BezslBgjveK3hODH, basicStyle$Serialized.BezslBgjveK3hODH) && Float.compare(this.ziNFA7KzVfc6, basicStyle$Serialized.ziNFA7KzVfc6) == 0;
    }

    public final int hashCode() {
        int iHashCode = (this.axL8FocTDLUdzg0XScbO.hashCode() + (this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31)) * 31;
        RemoteFont remoteFont = this.BezslBgjveK3hODH;
        return Float.hashCode(this.ziNFA7KzVfc6) + ((iHashCode + (remoteFont == null ? 0 : remoteFont.hashCode())) * 31);
    }

    public final String toString() {
        return "Serialized(uuid=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", info=" + this.axL8FocTDLUdzg0XScbO + ", font=" + this.BezslBgjveK3hODH + ", extraClockScale=" + this.ziNFA7KzVfc6 + ")";
    }

    @Override // b.D4uDt21iAp885MiybCJz3keA
    public final AtAGlanceInfo ziNFA7KzVfc6() {
        return this.axL8FocTDLUdzg0XScbO;
    }

    public BasicStyle$Serialized(String str, AtAGlanceInfo atAGlanceInfo, RemoteFont remoteFont, float f) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = atAGlanceInfo;
        this.BezslBgjveK3hODH = remoteFont;
        this.ziNFA7KzVfc6 = f;
    }

    public /* synthetic */ BasicStyle$Serialized(String str, AtAGlanceInfo atAGlanceInfo, RemoteFont remoteFont) {
        this(str, atAGlanceInfo, remoteFont, 1.0f);
    }
}
