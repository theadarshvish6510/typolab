package bitpit.launcher.ataglance;

import b.D4uDt21iAp885MiybCJz3keA;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class NoClockStyle$Serialized implements D4uDt21iAp885MiybCJz3keA {
    public static final Companion Companion = new Companion();
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final AtAGlanceInfo axL8FocTDLUdzg0XScbO;

    public static final class Companion {
        public final KSerializer serializer() {
            return NoClockStyle$Serialized$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NoClockStyle$Serialized(int i, AtAGlanceInfo atAGlanceInfo, String str) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = (i & 1) == 0 ? "D1E8BD54-4CA6-4B57-9089-72117E37053E" : str;
        if ((i & 2) == 0) {
            this.axL8FocTDLUdzg0XScbO = new AtAGlanceInfo("no_clock", "default");
        } else {
            this.axL8FocTDLUdzg0XScbO = atAGlanceInfo;
        }
    }

    @Override // b.D4uDt21iAp885MiybCJz3keA
    public final String BezslBgjveK3hODH() {
        return this.S1zP5M3X7Ukq3ROlZ87G9I;
    }

    @Override // b.D4uDt21iAp885MiybCJz3keA
    public final AtAGlanceInfo ziNFA7KzVfc6() {
        return this.axL8FocTDLUdzg0XScbO;
    }

    public NoClockStyle$Serialized() {
        this.S1zP5M3X7Ukq3ROlZ87G9I = "D1E8BD54-4CA6-4B57-9089-72117E37053E";
        this.axL8FocTDLUdzg0XScbO = new AtAGlanceInfo("no_clock", "default");
    }
}
