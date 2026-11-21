package bitpit.launcher.theming.wallpapers;

import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.XYtcAIGZkWt7;
import b.mHW63SUma8isGb;
import b.qSDYaDqxbBy2QEeVAcFRy;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class WallpaperCollectionManifest {
    public final long S1zP5M3X7Ukq3ROlZ87G9I;
    public final List axL8FocTDLUdzg0XScbO;
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] BezslBgjveK3hODH = {null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new XYtcAIGZkWt7(5))};

    public static final class Companion {
        public final KSerializer serializer() {
            return WallpaperCollectionManifest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WallpaperCollectionManifest(int i, long j, List list) {
        if (3 != (i & 3)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 3, WallpaperCollectionManifest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = j;
        this.axL8FocTDLUdzg0XScbO = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallpaperCollectionManifest)) {
            return false;
        }
        WallpaperCollectionManifest wallpaperCollectionManifest = (WallpaperCollectionManifest) obj;
        return this.S1zP5M3X7Ukq3ROlZ87G9I == wallpaperCollectionManifest.S1zP5M3X7Ukq3ROlZ87G9I && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, wallpaperCollectionManifest.axL8FocTDLUdzg0XScbO);
    }

    public final int hashCode() {
        return this.axL8FocTDLUdzg0XScbO.hashCode() + (Long.hashCode(this.S1zP5M3X7Ukq3ROlZ87G9I) * 31);
    }

    public final String toString() {
        return "WallpaperCollectionManifest(updated=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", wallpapers=" + this.axL8FocTDLUdzg0XScbO + ")";
    }
}
