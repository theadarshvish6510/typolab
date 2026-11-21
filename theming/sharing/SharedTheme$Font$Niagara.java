package bitpit.launcher.theming.sharing;

import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.aJLiMmqfPh61r;
import b.cBRnqJka9zlgT;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class SharedTheme$Font$Niagara implements cBRnqJka9zlgT {
    public static final Companion Companion = new Companion();
    public final String S1zP5M3X7Ukq3ROlZ87G9I;

    public static final class Companion {
        public final KSerializer serializer() {
            return SharedTheme$Font$Niagara$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SharedTheme$Font$Niagara(int i, String str) {
        if (1 == (i & 1)) {
            this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        } else {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 1, SharedTheme$Font$Niagara$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SharedTheme$Font$Niagara) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, ((SharedTheme$Font$Niagara) obj).S1zP5M3X7Ukq3ROlZ87G9I);
    }

    public final int hashCode() {
        return this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode();
    }

    public final String toString() {
        return aJLiMmqfPh61r.flPMk2Ix9h3b95v("Niagara(fontId=", this.S1zP5M3X7Ukq3ROlZ87G9I, ")");
    }

    public SharedTheme$Font$Niagara(String str) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
    }
}
