package bitpit.launcher.backend.weather.model;

import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class WeatherCondition {
    public static final Companion Companion = new Companion();
    public final String BezslBgjveK3hODH;
    public final int S1zP5M3X7Ukq3ROlZ87G9I;
    public final String axL8FocTDLUdzg0XScbO;

    public static final class Companion {
        public final KSerializer serializer() {
            return WeatherCondition$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WeatherCondition(int i, int i2, String str, String str2) {
        if (5 != (i & 5)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 5, WeatherCondition$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = i2;
        if ((i & 2) == 0) {
            this.axL8FocTDLUdzg0XScbO = "";
        } else {
            this.axL8FocTDLUdzg0XScbO = str;
        }
        this.BezslBgjveK3hODH = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WeatherCondition)) {
            return false;
        }
        WeatherCondition weatherCondition = (WeatherCondition) obj;
        return this.S1zP5M3X7Ukq3ROlZ87G9I == weatherCondition.S1zP5M3X7Ukq3ROlZ87G9I && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, weatherCondition.axL8FocTDLUdzg0XScbO) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.BezslBgjveK3hODH, weatherCondition.BezslBgjveK3hODH);
    }

    public final int hashCode() {
        return this.BezslBgjveK3hODH.hashCode() + LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(Integer.hashCode(this.S1zP5M3X7Ukq3ROlZ87G9I) * 31, this.axL8FocTDLUdzg0XScbO, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WeatherCondition(id=");
        sb.append(this.S1zP5M3X7Ukq3ROlZ87G9I);
        sb.append(", description=");
        sb.append(this.axL8FocTDLUdzg0XScbO);
        sb.append(", icon=");
        return LthVJzs8YB767vHOMwO80UNP7QrQi.HveD9n1tOYlffjJDxghBitYNgB(sb, this.BezslBgjveK3hODH, ')');
    }

    public WeatherCondition(String str, int i, String str2) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = i;
        this.axL8FocTDLUdzg0XScbO = str;
        this.BezslBgjveK3hODH = str2;
    }
}
