package bitpit.launcher.theming.sharing;

import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.aJLiMmqfPh61r;
import b.cBRnqJka9zlgT;
import java.util.Arrays;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class SharedTheme$Font$File implements cBRnqJka9zlgT {
    public static final Companion Companion = new Companion();
    public final boolean BezslBgjveK3hODH;
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final byte[] axL8FocTDLUdzg0XScbO;

    public static final class Companion {
        public final KSerializer serializer() {
            return SharedTheme$Font$File$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SharedTheme$Font$File(int i, String str, byte[] bArr, boolean z) {
        if (7 != (i & 7)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 7, SharedTheme$Font$File$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = bArr;
        this.BezslBgjveK3hODH = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SharedTheme$Font$File.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        SharedTheme$Font$File sharedTheme$Font$File = (SharedTheme$Font$File) obj;
        return this.BezslBgjveK3hODH == sharedTheme$Font$File.BezslBgjveK3hODH && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, sharedTheme$Font$File.S1zP5M3X7Ukq3ROlZ87G9I) && Arrays.equals(this.axL8FocTDLUdzg0XScbO, sharedTheme$Font$File.axL8FocTDLUdzg0XScbO);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.axL8FocTDLUdzg0XScbO) + LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(Boolean.hashCode(this.BezslBgjveK3hODH) * 31, this.S1zP5M3X7Ukq3ROlZ87G9I, 31);
    }

    public final String toString() {
        StringBuilder sbH5sQ15nhYoaKKHhx = aJLiMmqfPh61r.H5sQ15nhYoaKKHhx("File(fontName=", this.S1zP5M3X7Ukq3ROlZ87G9I, ", fontData=", Arrays.toString(this.axL8FocTDLUdzg0XScbO), ", hybridMode=");
        sbH5sQ15nhYoaKKHhx.append(this.BezslBgjveK3hODH);
        sbH5sQ15nhYoaKKHhx.append(")");
        return sbH5sQ15nhYoaKKHhx.toString();
    }

    public SharedTheme$Font$File(String str, boolean z, byte[] bArr) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = bArr;
        this.BezslBgjveK3hODH = z;
    }
}
