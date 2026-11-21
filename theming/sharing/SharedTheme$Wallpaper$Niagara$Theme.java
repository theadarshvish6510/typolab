package bitpit.launcher.theming.sharing;

import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.aJLiMmqfPh61r;
import b.vpMuxUmciyvptHwzlEl8ZQ;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class SharedTheme$Wallpaper$Niagara$Theme implements vpMuxUmciyvptHwzlEl8ZQ {
    public static final Companion Companion = new Companion();
    public final String S1zP5M3X7Ukq3ROlZ87G9I;

    public static final class Companion {
        public final KSerializer serializer() {
            return SharedTheme$Wallpaper$Niagara$Theme$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SharedTheme$Wallpaper$Niagara$Theme(int i, String str) {
        if (1 == (i & 1)) {
            this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        } else {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 1, SharedTheme$Wallpaper$Niagara$Theme$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SharedTheme$Wallpaper$Niagara$Theme) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, ((SharedTheme$Wallpaper$Niagara$Theme) obj).S1zP5M3X7Ukq3ROlZ87G9I);
    }

    public final int hashCode() {
        return this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode();
    }

    public final String toString() {
        return aJLiMmqfPh61r.flPMk2Ix9h3b95v("Theme(name=", this.S1zP5M3X7Ukq3ROlZ87G9I, ")");
    }

    public SharedTheme$Wallpaper$Niagara$Theme(String str) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
    }
}
