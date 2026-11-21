package bitpit.launcher.theming.sharing;

import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.aJLiMmqfPh61r;
import java.util.Arrays;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class WallpaperSurrogate {
    public static final Companion Companion = new Companion();
    public final byte[] BezslBgjveK3hODH;
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final String axL8FocTDLUdzg0XScbO;

    public static final class Companion {
        public final KSerializer serializer() {
            return WallpaperSurrogate$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WallpaperSurrogate(int i, String str, String str2, byte[] bArr) {
        if (1 != (i & 1)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 1, WallpaperSurrogate$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        if ((i & 2) == 0) {
            this.axL8FocTDLUdzg0XScbO = null;
        } else {
            this.axL8FocTDLUdzg0XScbO = str2;
        }
        if ((i & 4) == 0) {
            this.BezslBgjveK3hODH = null;
        } else {
            this.BezslBgjveK3hODH = bArr;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!WallpaperSurrogate.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        WallpaperSurrogate wallpaperSurrogate = (WallpaperSurrogate) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, wallpaperSurrogate.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, wallpaperSurrogate.axL8FocTDLUdzg0XScbO) && Arrays.equals(this.BezslBgjveK3hODH, wallpaperSurrogate.BezslBgjveK3hODH);
    }

    public final int hashCode() {
        int iHashCode = this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31;
        String str = this.axL8FocTDLUdzg0XScbO;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        byte[] bArr = this.BezslBgjveK3hODH;
        return iHashCode2 + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public final String toString() {
        return aJLiMmqfPh61r.ToEIy0qfkltfGfO3vmAQG(aJLiMmqfPh61r.H5sQ15nhYoaKKHhx("WallpaperSurrogate(type=", this.S1zP5M3X7Ukq3ROlZ87G9I, ", id=", this.axL8FocTDLUdzg0XScbO, ", data="), Arrays.toString(this.BezslBgjveK3hODH), ")");
    }

    public WallpaperSurrogate(String str, String str2, byte[] bArr, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        bArr = (i & 4) != 0 ? null : bArr;
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = str2;
        this.BezslBgjveK3hODH = bArr;
    }
}
