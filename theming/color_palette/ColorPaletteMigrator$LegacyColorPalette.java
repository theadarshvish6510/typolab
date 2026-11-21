package bitpit.launcher.theming.color_palette;

import b.G54t5S0KdLlCy;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.uuyTGGFjNDiF1SxHW;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class ColorPaletteMigrator$LegacyColorPalette {
    public final int BezslBgjveK3hODH;
    public final int S1zP5M3X7Ukq3ROlZ87G9I;
    public final int axL8FocTDLUdzg0XScbO;
    public final int ziNFA7KzVfc6;
    public static final Companion Companion = new Companion();
    public static final G54t5S0KdLlCy Aboow6rUrcY2SrFRa46C6uy = new G54t5S0KdLlCy(0, 9, 1);

    public static final class Companion {
        public final KSerializer serializer() {
            return ColorPaletteMigrator$LegacyColorPalette$$serializer.INSTANCE;
        }
    }

    public ColorPaletteMigrator$LegacyColorPalette(int i, int i2, int i3, int i4, int i5) {
        if (15 != (i & 15)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 15, ColorPaletteMigrator$LegacyColorPalette$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = i2;
        this.axL8FocTDLUdzg0XScbO = i3;
        this.BezslBgjveK3hODH = i4;
        this.ziNFA7KzVfc6 = i5;
        G54t5S0KdLlCy g54t5S0KdLlCy = Aboow6rUrcY2SrFRa46C6uy;
        int i6 = g54t5S0KdLlCy.GO8WUug7ZWFCUI1zY;
        int i7 = g54t5S0KdLlCy.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
        if (i6 > i5 || i5 > i7) {
            uuyTGGFjNDiF1SxHW.PQQPeCDD0JLCT3aLz("Color palette does not have a legacy materialYouFallbackColorFamily");
            throw null;
        }
    }
}
