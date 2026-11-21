package bitpit.launcher.themes;

import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.UHUzfrCtV0bKdPp9KPrZVY;
import b.dLBfLob8jpOy0bTgh4DyI8FXicA;
import b.g3F3ECxxX7;
import b.mHW63SUma8isGb;
import b.qSDYaDqxbBy2QEeVAcFRy;
import b.tbCHMbh7VLrZiXXlBt3XbITMEmSn;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class ThemeSettings {
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] ox9eclwMpRd = {null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new g3F3ECxxX7(6)), qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new g3F3ECxxX7(7)), null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new g3F3ECxxX7(8))};
    public final tbCHMbh7VLrZiXXlBt3XbITMEmSn Aboow6rUrcY2SrFRa46C6uy;
    public final UHUzfrCtV0bKdPp9KPrZVY BezslBgjveK3hODH;
    public final float S1zP5M3X7Ukq3ROlZ87G9I;
    public final dLBfLob8jpOy0bTgh4DyI8FXicA axL8FocTDLUdzg0XScbO;
    public final int ziNFA7KzVfc6;

    public static final class Companion {
        public final KSerializer serializer() {
            return ThemeSettings$$serializer.INSTANCE;
        }
    }

    public ThemeSettings(int i, float f, dLBfLob8jpOy0bTgh4DyI8FXicA dlbflob8jpoy0btgh4dyi8fxica, UHUzfrCtV0bKdPp9KPrZVY uHUzfrCtV0bKdPp9KPrZVY, int i2, tbCHMbh7VLrZiXXlBt3XbITMEmSn tbchmbh7vlrzixxlbt3xbitmemsn) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = (i & 1) == 0 ? 1.0f : f;
        if ((i & 2) == 0) {
            this.axL8FocTDLUdzg0XScbO = dLBfLob8jpOy0bTgh4DyI8FXicA.GO8WUug7ZWFCUI1zY;
        } else {
            this.axL8FocTDLUdzg0XScbO = dlbflob8jpoy0btgh4dyi8fxica;
        }
        if ((i & 4) == 0) {
            this.BezslBgjveK3hODH = UHUzfrCtV0bKdPp9KPrZVY.GO8WUug7ZWFCUI1zY;
        } else {
            this.BezslBgjveK3hODH = uHUzfrCtV0bKdPp9KPrZVY;
        }
        if ((i & 8) == 0) {
            this.ziNFA7KzVfc6 = 100;
        } else {
            this.ziNFA7KzVfc6 = i2;
        }
        if ((i & 16) != 0) {
            this.Aboow6rUrcY2SrFRa46C6uy = tbchmbh7vlrzixxlbt3xbitmemsn;
        } else {
            tbCHMbh7VLrZiXXlBt3XbITMEmSn.Companion.getClass();
            this.Aboow6rUrcY2SrFRa46C6uy = tbCHMbh7VLrZiXXlBt3XbITMEmSn.WIXlfFpvH7glAGsUk3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThemeSettings)) {
            return false;
        }
        ThemeSettings themeSettings = (ThemeSettings) obj;
        return Float.compare(this.S1zP5M3X7Ukq3ROlZ87G9I, themeSettings.S1zP5M3X7Ukq3ROlZ87G9I) == 0 && this.axL8FocTDLUdzg0XScbO == themeSettings.axL8FocTDLUdzg0XScbO && this.BezslBgjveK3hODH == themeSettings.BezslBgjveK3hODH && this.ziNFA7KzVfc6 == themeSettings.ziNFA7KzVfc6 && this.Aboow6rUrcY2SrFRa46C6uy == themeSettings.Aboow6rUrcY2SrFRa46C6uy;
    }

    public final int hashCode() {
        return this.Aboow6rUrcY2SrFRa46C6uy.hashCode() + LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.ziNFA7KzVfc6, (this.BezslBgjveK3hODH.hashCode() + ((this.axL8FocTDLUdzg0XScbO.hashCode() + (Float.hashCode(this.S1zP5M3X7Ukq3ROlZ87G9I) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "ThemeSettings(topPaddingPercentage=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", hideFavoritesLabels=" + this.axL8FocTDLUdzg0XScbO + ", textThemeMode=" + this.BezslBgjveK3hODH + ", iconSize=" + this.ziNFA7KzVfc6 + ", iconShape=" + this.Aboow6rUrcY2SrFRa46C6uy + ")";
    }

    public ThemeSettings(float f, UHUzfrCtV0bKdPp9KPrZVY uHUzfrCtV0bKdPp9KPrZVY, int i, tbCHMbh7VLrZiXXlBt3XbITMEmSn tbchmbh7vlrzixxlbt3xbitmemsn, int i2) {
        f = (i2 & 1) != 0 ? 1.0f : f;
        uHUzfrCtV0bKdPp9KPrZVY = (i2 & 4) != 0 ? UHUzfrCtV0bKdPp9KPrZVY.GO8WUug7ZWFCUI1zY : uHUzfrCtV0bKdPp9KPrZVY;
        i = (i2 & 8) != 0 ? 100 : i;
        if ((i2 & 16) != 0) {
            tbCHMbh7VLrZiXXlBt3XbITMEmSn.Companion.getClass();
            tbchmbh7vlrzixxlbt3xbitmemsn = tbCHMbh7VLrZiXXlBt3XbITMEmSn.WIXlfFpvH7glAGsUk3;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = f;
        this.axL8FocTDLUdzg0XScbO = dLBfLob8jpOy0bTgh4DyI8FXicA.GO8WUug7ZWFCUI1zY;
        this.BezslBgjveK3hODH = uHUzfrCtV0bKdPp9KPrZVY;
        this.ziNFA7KzVfc6 = i;
        this.Aboow6rUrcY2SrFRa46C6uy = tbchmbh7vlrzixxlbt3xbitmemsn;
    }
}
