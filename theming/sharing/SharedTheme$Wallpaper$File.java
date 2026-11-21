package bitpit.launcher.theming.sharing;

import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.aJLiMmqfPh61r;
import b.nXCqkIgElhEtQLnIIyiqEb64Wlgp;
import java.util.Arrays;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class SharedTheme$Wallpaper$File implements nXCqkIgElhEtQLnIIyiqEb64Wlgp {
    public static final Companion Companion = new Companion();
    public final byte[] S1zP5M3X7Ukq3ROlZ87G9I;

    public static final class Companion {
        public final KSerializer serializer() {
            return SharedTheme$Wallpaper$File$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SharedTheme$Wallpaper$File(int i, byte[] bArr) {
        if (1 == (i & 1)) {
            this.S1zP5M3X7Ukq3ROlZ87G9I = bArr;
        } else {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 1, SharedTheme$Wallpaper$File$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (SharedTheme$Wallpaper$File.class.equals(obj != null ? obj.getClass() : null)) {
            return Arrays.equals(this.S1zP5M3X7Ukq3ROlZ87G9I, ((SharedTheme$Wallpaper$File) obj).S1zP5M3X7Ukq3ROlZ87G9I);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.S1zP5M3X7Ukq3ROlZ87G9I);
    }

    public final String toString() {
        return aJLiMmqfPh61r.flPMk2Ix9h3b95v("File(imageData=", Arrays.toString(this.S1zP5M3X7Ukq3ROlZ87G9I), ")");
    }

    public SharedTheme$Wallpaper$File(byte[] bArr) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = bArr;
    }
}
