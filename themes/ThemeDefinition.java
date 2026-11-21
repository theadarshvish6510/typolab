package bitpit.launcher.themes;

import b.EblMJsgsrKqHFhQN297jSXU;
import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.TXotOFAXyesISl;
import b.aJLiMmqfPh61r;
import b.g3F3ECxxX7;
import b.mHW63SUma8isGb;
import b.qSDYaDqxbBy2QEeVAcFRy;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class ThemeDefinition {
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] LYcdI4xpry8eXmFC9I4wyaLdcG1z = {null, null, null, null, null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new g3F3ECxxX7(5)), null, null};
    public final String Aboow6rUrcY2SrFRa46C6uy;
    public final String BezslBgjveK3hODH;
    public final boolean JY5knQmh7EQJEZ;
    public final ThemeSettings PQQPeCDD0JLCT3aLz;
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final PredefinedThemeWallpaper axL8FocTDLUdzg0XScbO;
    public final EblMJsgsrKqHFhQN297jSXU ox9eclwMpRd;
    public final String ziNFA7KzVfc6;

    public static final class Companion {
        public final KSerializer serializer() {
            return ThemeDefinition$$serializer.INSTANCE;
        }
    }

    public ThemeDefinition(int i, String str, PredefinedThemeWallpaper predefinedThemeWallpaper, String str2, String str3, String str4, EblMJsgsrKqHFhQN297jSXU eblMJsgsrKqHFhQN297jSXU, ThemeSettings themeSettings, boolean z) {
        if (15 != (i & 15)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 15, ThemeDefinition$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = predefinedThemeWallpaper;
        this.BezslBgjveK3hODH = str2;
        this.ziNFA7KzVfc6 = str3;
        if ((i & 16) == 0) {
            this.Aboow6rUrcY2SrFRa46C6uy = TXotOFAXyesISl.S1zP5M3X7Ukq3ROlZ87G9I.S1zP5M3X7Ukq3ROlZ87G9I;
        } else {
            this.Aboow6rUrcY2SrFRa46C6uy = str4;
        }
        if ((i & 32) == 0) {
            this.ox9eclwMpRd = PredefinedThemesFont$Default.INSTANCE;
        } else {
            this.ox9eclwMpRd = eblMJsgsrKqHFhQN297jSXU;
        }
        if ((i & 64) == 0) {
            this.PQQPeCDD0JLCT3aLz = new ThemeSettings(0.0f, null, 0, null, 31);
        } else {
            this.PQQPeCDD0JLCT3aLz = themeSettings;
        }
        if ((i & 128) == 0) {
            this.JY5knQmh7EQJEZ = false;
        } else {
            this.JY5knQmh7EQJEZ = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThemeDefinition)) {
            return false;
        }
        ThemeDefinition themeDefinition = (ThemeDefinition) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, themeDefinition.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, themeDefinition.axL8FocTDLUdzg0XScbO) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.BezslBgjveK3hODH, themeDefinition.BezslBgjveK3hODH) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.ziNFA7KzVfc6, themeDefinition.ziNFA7KzVfc6) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.Aboow6rUrcY2SrFRa46C6uy, themeDefinition.Aboow6rUrcY2SrFRa46C6uy) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.ox9eclwMpRd, themeDefinition.ox9eclwMpRd) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.PQQPeCDD0JLCT3aLz, themeDefinition.PQQPeCDD0JLCT3aLz) && this.JY5knQmh7EQJEZ == themeDefinition.JY5knQmh7EQJEZ;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.JY5knQmh7EQJEZ) + ((this.PQQPeCDD0JLCT3aLz.hashCode() + ((this.ox9eclwMpRd.hashCode() + LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd((this.axL8FocTDLUdzg0XScbO.hashCode() + (this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31)) * 31, this.BezslBgjveK3hODH, 31), this.ziNFA7KzVfc6, 31), this.Aboow6rUrcY2SrFRa46C6uy, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ThemeDefinition(id=");
        sb.append(this.S1zP5M3X7Ukq3ROlZ87G9I);
        sb.append(", wallpaper=");
        sb.append(this.axL8FocTDLUdzg0XScbO);
        sb.append(", themeColor=");
        aJLiMmqfPh61r.Bk6w7oZjoWt9ZSRs4C7jIhbX3(sb, this.BezslBgjveK3hODH, ", anyconsConfig=", this.ziNFA7KzVfc6, ", atAGlanceStyleId=");
        sb.append(this.Aboow6rUrcY2SrFRa46C6uy);
        sb.append(", font=");
        sb.append(this.ox9eclwMpRd);
        sb.append(", settings=");
        sb.append(this.PQQPeCDD0JLCT3aLz);
        sb.append(", isFreeTheme=");
        sb.append(this.JY5knQmh7EQJEZ);
        sb.append(")");
        return sb.toString();
    }

    public ThemeDefinition(String str, PredefinedThemeWallpaper predefinedThemeWallpaper, String str2, String str3, String str4, EblMJsgsrKqHFhQN297jSXU eblMJsgsrKqHFhQN297jSXU, ThemeSettings themeSettings, boolean z) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = predefinedThemeWallpaper;
        this.BezslBgjveK3hODH = str2;
        this.ziNFA7KzVfc6 = str3;
        this.Aboow6rUrcY2SrFRa46C6uy = str4;
        this.ox9eclwMpRd = eblMJsgsrKqHFhQN297jSXU;
        this.PQQPeCDD0JLCT3aLz = themeSettings;
        this.JY5knQmh7EQJEZ = z;
    }

    public ThemeDefinition(String str, PredefinedThemeWallpaper predefinedThemeWallpaper, String str2, String str3, String str4, EblMJsgsrKqHFhQN297jSXU eblMJsgsrKqHFhQN297jSXU, ThemeSettings themeSettings, int i) {
        this(str, predefinedThemeWallpaper, str2, str3, str4, eblMJsgsrKqHFhQN297jSXU, (i & 64) != 0 ? new ThemeSettings(0.0f, null, 0, null, 31) : themeSettings, false);
    }
}
