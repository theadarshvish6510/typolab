package bitpit.launcher.theming;

import b.O1VE8grxm4nj1d;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class WallpaperColorPalette {
    public static final Companion Companion = new Companion();
    public final Integer BezslBgjveK3hODH;
    public final int S1zP5M3X7Ukq3ROlZ87G9I;
    public final Integer axL8FocTDLUdzg0XScbO;
    public final int ziNFA7KzVfc6;

    public static final class Companion {
        public final KSerializer serializer() {
            return WallpaperColorPalette$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WallpaperColorPalette(int i, int i2, Integer num, Integer num2, int i3) {
        if (15 != (i & 15)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 15, WallpaperColorPalette$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = i2;
        this.axL8FocTDLUdzg0XScbO = num;
        this.BezslBgjveK3hODH = num2;
        this.ziNFA7KzVfc6 = i3;
    }

    public final boolean S1zP5M3X7Ukq3ROlZ87G9I(int i) {
        if (i == 0) {
            return (this.ziNFA7KzVfc6 & 1) == 1;
        }
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        O1VE8grxm4nj1d.ox9eclwMpRd(Integer.valueOf(i));
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WallpaperColorPalette)) {
            return false;
        }
        WallpaperColorPalette wallpaperColorPalette = (WallpaperColorPalette) obj;
        return this.S1zP5M3X7Ukq3ROlZ87G9I == wallpaperColorPalette.S1zP5M3X7Ukq3ROlZ87G9I && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, wallpaperColorPalette.axL8FocTDLUdzg0XScbO) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.BezslBgjveK3hODH, wallpaperColorPalette.BezslBgjveK3hODH) && this.ziNFA7KzVfc6 == wallpaperColorPalette.ziNFA7KzVfc6;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.S1zP5M3X7Ukq3ROlZ87G9I) * 31;
        Integer num = this.axL8FocTDLUdzg0XScbO;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.BezslBgjveK3hODH;
        return Integer.hashCode(this.ziNFA7KzVfc6) + ((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "WallpaperColorPalette(primaryColor=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", secondaryColor=" + this.axL8FocTDLUdzg0XScbO + ", tertiaryColor=" + this.BezslBgjveK3hODH + ", colorHints=" + this.ziNFA7KzVfc6 + ")";
    }

    public WallpaperColorPalette(int i, Integer num, Integer num2, int i2) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = i;
        this.axL8FocTDLUdzg0XScbO = num;
        this.BezslBgjveK3hODH = num2;
        this.ziNFA7KzVfc6 = i2;
    }
}
