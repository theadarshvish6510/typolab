package bitpit.launcher.ataglance;

import android.content.Context;
import b.HlaGpRWB5yh0EgeuCV;
import b.JTZHV525LRyvzfegprFep9u;
import b.LTC5BQy9XspuFiw;
import b.POLYDU3BdDlat;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.mHW63SUma8isGb;
import b.nmXVdLD3wuhaqezxBBvorxOjwLT;
import b.qSDYaDqxbBy2QEeVAcFRy;
import b.sKhRxlrK0uZQTcvTyLdO1CgQhofD6;
import b.vdBBwKx45uSJHLCNxSnPL6OZU4;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class AtAGlanceStyleColor$PaletteColor extends qsTJuxvI0Yplnkz8 {
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] ziNFA7KzVfc6 = {qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new vdBBwKx45uSJHLCNxSnPL6OZU4(17)), qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new vdBBwKx45uSJHLCNxSnPL6OZU4(18))};
    public final Swatch BezslBgjveK3hODH;
    public final Palette axL8FocTDLUdzg0XScbO;

    public static final class Companion {
        public final KSerializer serializer() {
            return AtAGlanceStyleColor$PaletteColor$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AtAGlanceStyleColor$PaletteColor(int i, Palette palette, Swatch swatch) {
        if (3 != (i & 3)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 3, AtAGlanceStyleColor$PaletteColor$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.axL8FocTDLUdzg0XScbO = palette;
        this.BezslBgjveK3hODH = swatch;
    }

    @Override // bitpit.launcher.ataglance.qsTJuxvI0Yplnkz8
    public final Integer S1zP5M3X7Ukq3ROlZ87G9I(Context context, POLYDU3BdDlat pOLYDU3BdDlat) {
        JTZHV525LRyvzfegprFep9u jTZHV525LRyvzfegprFep9u;
        int i = NniqwgLR9Jo6Bl9Px0S5u.S1zP5M3X7Ukq3ROlZ87G9I[this.axL8FocTDLUdzg0XScbO.ordinal()];
        if (i == 1) {
            jTZHV525LRyvzfegprFep9u = pOLYDU3BdDlat.GO8WUug7ZWFCUI1zY;
        } else if (i == 2) {
            jTZHV525LRyvzfegprFep9u = pOLYDU3BdDlat.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
        } else if (i == 3) {
            jTZHV525LRyvzfegprFep9u = pOLYDU3BdDlat.cCmbv8Tzd2QLd161ImIZUlZ8n;
        } else {
            if (i != 4) {
                LTC5BQy9XspuFiw.axL8FocTDLUdzg0XScbO();
                return null;
            }
            jTZHV525LRyvzfegprFep9u = pOLYDU3BdDlat.WIXlfFpvH7glAGsUk3;
        }
        int i2 = NniqwgLR9Jo6Bl9Px0S5u.axL8FocTDLUdzg0XScbO[this.BezslBgjveK3hODH.ordinal()];
        if (i2 == 1) {
            return Integer.valueOf(jTZHV525LRyvzfegprFep9u.GO8WUug7ZWFCUI1zY);
        }
        if (i2 == 2) {
            return Integer.valueOf(jTZHV525LRyvzfegprFep9u.Rdzg08aYlt0UsoLUNug9cESzgAY9R);
        }
        if (i2 == 3) {
            return Integer.valueOf(jTZHV525LRyvzfegprFep9u.cCmbv8Tzd2QLd161ImIZUlZ8n);
        }
        if (i2 == 4) {
            return Integer.valueOf(jTZHV525LRyvzfegprFep9u.WIXlfFpvH7glAGsUk3);
        }
        LTC5BQy9XspuFiw.axL8FocTDLUdzg0XScbO();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AtAGlanceStyleColor$PaletteColor)) {
            return false;
        }
        AtAGlanceStyleColor$PaletteColor atAGlanceStyleColor$PaletteColor = (AtAGlanceStyleColor$PaletteColor) obj;
        return this.axL8FocTDLUdzg0XScbO == atAGlanceStyleColor$PaletteColor.axL8FocTDLUdzg0XScbO && this.BezslBgjveK3hODH == atAGlanceStyleColor$PaletteColor.BezslBgjveK3hODH;
    }

    public final int hashCode() {
        return this.BezslBgjveK3hODH.hashCode() + (this.axL8FocTDLUdzg0XScbO.hashCode() * 31);
    }

    public final String toString() {
        return "PaletteColor(palette=" + this.axL8FocTDLUdzg0XScbO + ", swatch=" + this.BezslBgjveK3hODH + ")";
    }

    public enum Palette implements nmXVdLD3wuhaqezxBBvorxOjwLT {
        MATERIAL_LIGHT("material_light"),
        MATERIAL_VIVID("material_vivid"),
        BRIGHT("bright"),
        OUTLINE_CHROMA("outline_chroma");

        private static final /* synthetic */ HlaGpRWB5yh0EgeuCV $ENTRIES = new sKhRxlrK0uZQTcvTyLdO1CgQhofD6(values());
        private final String serialized;

        Palette(String str) {
            this.serialized = str;
        }

        public static HlaGpRWB5yh0EgeuCV getEntries() {
            return $ENTRIES;
        }

        @Override // b.nmXVdLD3wuhaqezxBBvorxOjwLT
        public String getSerialized() {
            return this.serialized;
        }
    }

    public enum Swatch implements nmXVdLD3wuhaqezxBBvorxOjwLT {
        STROKE("stroke"),
        VIVID("vivid"),
        MUTED("muted"),
        OFF_WHITE("off_white");

        private static final /* synthetic */ HlaGpRWB5yh0EgeuCV $ENTRIES = new sKhRxlrK0uZQTcvTyLdO1CgQhofD6(values());
        private final String serialized;

        Swatch(String str) {
            this.serialized = str;
        }

        public static HlaGpRWB5yh0EgeuCV getEntries() {
            return $ENTRIES;
        }

        @Override // b.nmXVdLD3wuhaqezxBBvorxOjwLT
        public String getSerialized() {
            return this.serialized;
        }
    }

    public AtAGlanceStyleColor$PaletteColor(Palette palette, Swatch swatch) {
        this.axL8FocTDLUdzg0XScbO = palette;
        this.BezslBgjveK3hODH = swatch;
    }
}
