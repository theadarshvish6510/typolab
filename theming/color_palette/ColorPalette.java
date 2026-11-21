package bitpit.launcher.theming.color_palette;

import b.ERGkrVYauE1;
import b.G71ctMPy0O3NI7eWB;
import b.GkEpHTllUQBkRob2X6;
import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.P00nncIUw5Gr1An7tfyYdGDgSVo;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.WcFNuOEiWGqkNp;
import b.mHW63SUma8isGb;
import b.o7RA1NLUSXOnejA;
import b.qSDYaDqxbBy2QEeVAcFRy;
import b.vdBBwKx45uSJHLCNxSnPL6OZU4;
import bitpit.launcher.theming.CustomMaterialYouColorFamily;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class ColorPalette {
    public final int BezslBgjveK3hODH;
    public final int S1zP5M3X7Ukq3ROlZ87G9I;
    public final int axL8FocTDLUdzg0XScbO;
    public final CustomMaterialYouColorFamily ziNFA7KzVfc6;
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] Aboow6rUrcY2SrFRa46C6uy = {null, null, null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new vdBBwKx45uSJHLCNxSnPL6OZU4(24))};

    public static final class Companion {
        public static ColorPalette S1zP5M3X7Ukq3ROlZ87G9I(int i, boolean z) {
            ERGkrVYauE1 eRGkrVYauE1BezslBgjveK3hODH = GkEpHTllUQBkRob2X6.BezslBgjveK3hODH(i);
            WcFNuOEiWGqkNp wcFNuOEiWGqkNp = new WcFNuOEiWGqkNp(i);
            int iAboow6rUrcY2SrFRa46C6uy = (z ? eRGkrVYauE1BezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(new P00nncIUw5Gr1An7tfyYdGDgSVo(0.8d, 1.0d)).ox9eclwMpRd(0.22d) : eRGkrVYauE1BezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(new P00nncIUw5Gr1An7tfyYdGDgSVo(0.0d, 0.25d)).ox9eclwMpRd(0.1d)).Aboow6rUrcY2SrFRa46C6uy();
            int iAxL8FocTDLUdzg0XScbO = wcFNuOEiWGqkNp.axL8FocTDLUdzg0XScbO();
            CustomMaterialYouColorFamily.Companion.getClass();
            return new ColorPalette(i, iAxL8FocTDLUdzg0XScbO, iAboow6rUrcY2SrFRa46C6uy, o7RA1NLUSXOnejA.S1zP5M3X7Ukq3ROlZ87G9I(i));
        }

        public final KSerializer serializer() {
            return ColorPalette$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ColorPalette(int i, int i2, int i3, int i4, CustomMaterialYouColorFamily customMaterialYouColorFamily) {
        if (15 != (i & 15)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 15, ColorPalette$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = i2;
        this.axL8FocTDLUdzg0XScbO = i3;
        this.BezslBgjveK3hODH = i4;
        this.ziNFA7KzVfc6 = customMaterialYouColorFamily;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorPalette)) {
            return false;
        }
        ColorPalette colorPalette = (ColorPalette) obj;
        return this.S1zP5M3X7Ukq3ROlZ87G9I == colorPalette.S1zP5M3X7Ukq3ROlZ87G9I && this.axL8FocTDLUdzg0XScbO == colorPalette.axL8FocTDLUdzg0XScbO && this.BezslBgjveK3hODH == colorPalette.BezslBgjveK3hODH && this.ziNFA7KzVfc6 == colorPalette.ziNFA7KzVfc6;
    }

    public final int hashCode() {
        return this.ziNFA7KzVfc6.hashCode() + LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.BezslBgjveK3hODH, LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.axL8FocTDLUdzg0XScbO, Integer.hashCode(this.S1zP5M3X7Ukq3ROlZ87G9I) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbToEIy0qfkltfGfO3vmAQG = G71ctMPy0O3NI7eWB.ToEIy0qfkltfGfO3vmAQG(this.S1zP5M3X7Ukq3ROlZ87G9I, this.axL8FocTDLUdzg0XScbO, "Cp(p=", ", op=", ", pls=");
        sbToEIy0qfkltfGfO3vmAQG.append(this.BezslBgjveK3hODH);
        sbToEIy0qfkltfGfO3vmAQG.append(", myf=");
        sbToEIy0qfkltfGfO3vmAQG.append(this.ziNFA7KzVfc6);
        sbToEIy0qfkltfGfO3vmAQG.append(")");
        return sbToEIy0qfkltfGfO3vmAQG.toString();
    }

    public ColorPalette(int i, int i2, int i3, CustomMaterialYouColorFamily customMaterialYouColorFamily) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = i;
        this.axL8FocTDLUdzg0XScbO = i2;
        this.BezslBgjveK3hODH = i3;
        this.ziNFA7KzVfc6 = customMaterialYouColorFamily;
    }
}
