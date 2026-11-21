package bitpit.launcher.backend.weather.model;

import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class WeatherResponse {
    public static final Companion Companion = new Companion();
    public final String Aboow6rUrcY2SrFRa46C6uy;
    public final String BezslBgjveK3hODH;
    public final long S1zP5M3X7Ukq3ROlZ87G9I;
    public final String axL8FocTDLUdzg0XScbO;
    public final WeatherForecast ox9eclwMpRd;
    public final String ziNFA7KzVfc6;

    public static final class Companion {
        public final KSerializer serializer() {
            return WeatherResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WeatherResponse(int i, long j, String str, String str2, String str3, String str4, WeatherForecast weatherForecast) {
        if (63 != (i & 63)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 63, WeatherResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = j;
        this.axL8FocTDLUdzg0XScbO = str;
        this.BezslBgjveK3hODH = str2;
        this.ziNFA7KzVfc6 = str3;
        this.Aboow6rUrcY2SrFRa46C6uy = str4;
        this.ox9eclwMpRd = weatherForecast;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WeatherResponse)) {
            return false;
        }
        WeatherResponse weatherResponse = (WeatherResponse) obj;
        return this.S1zP5M3X7Ukq3ROlZ87G9I == weatherResponse.S1zP5M3X7Ukq3ROlZ87G9I && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, weatherResponse.axL8FocTDLUdzg0XScbO) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.BezslBgjveK3hODH, weatherResponse.BezslBgjveK3hODH) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.ziNFA7KzVfc6, weatherResponse.ziNFA7KzVfc6) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.Aboow6rUrcY2SrFRa46C6uy, weatherResponse.Aboow6rUrcY2SrFRa46C6uy) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.ox9eclwMpRd, weatherResponse.ox9eclwMpRd);
    }

    public final int hashCode() {
        return this.ox9eclwMpRd.hashCode() + LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(Long.hashCode(this.S1zP5M3X7Ukq3ROlZ87G9I) * 31, this.axL8FocTDLUdzg0XScbO, 31), this.BezslBgjveK3hODH, 31), this.ziNFA7KzVfc6, 31), this.Aboow6rUrcY2SrFRa46C6uy, 31);
    }

    public final String toString() {
        return "WeatherResponse(timestamp=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", provider=" + this.axL8FocTDLUdzg0XScbO + ", lat=" + this.BezslBgjveK3hODH + ", long=" + this.ziNFA7KzVfc6 + ", lang=" + this.Aboow6rUrcY2SrFRa46C6uy + ", forecast=" + this.ox9eclwMpRd + ')';
    }
}
