package bitpit.launcher.ataglance;

import android.content.Context;
import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.POLYDU3BdDlat;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class AtAGlanceStyleColor$StaticColor extends qsTJuxvI0Yplnkz8 {
    public static final Companion Companion = new Companion();
    public final int axL8FocTDLUdzg0XScbO;

    public static final class Companion {
        public final KSerializer serializer() {
            return AtAGlanceStyleColor$StaticColor$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AtAGlanceStyleColor$StaticColor(int i, int i2) {
        if (1 == (i & 1)) {
            this.axL8FocTDLUdzg0XScbO = i2;
        } else {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 1, AtAGlanceStyleColor$StaticColor$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    @Override // bitpit.launcher.ataglance.qsTJuxvI0Yplnkz8
    public final Integer S1zP5M3X7Ukq3ROlZ87G9I(Context context, POLYDU3BdDlat pOLYDU3BdDlat) {
        return Integer.valueOf(this.axL8FocTDLUdzg0XScbO);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AtAGlanceStyleColor$StaticColor) && this.axL8FocTDLUdzg0XScbO == ((AtAGlanceStyleColor$StaticColor) obj).axL8FocTDLUdzg0XScbO;
    }

    public final int hashCode() {
        return Integer.hashCode(this.axL8FocTDLUdzg0XScbO);
    }

    public final String toString() {
        return LthVJzs8YB767vHOMwO80UNP7QrQi.ToEIy0qfkltfGfO3vmAQG("StaticColor(color=", this.axL8FocTDLUdzg0XScbO, ")");
    }

    public AtAGlanceStyleColor$StaticColor() {
        this.axL8FocTDLUdzg0XScbO = -16777216;
    }
}
