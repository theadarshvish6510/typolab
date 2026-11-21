package bitpit.launcher.backend.weather.model;

import b.Cwc3EXEJz6AM6uT;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.a9kWzoj6D3Yoa0;
import b.aJLiMmqfPh61r;
import b.gkp6pLZDZ4B;
import b.mHW63SUma8isGb;
import b.oJ08Xj0ZV1gAa;
import b.qSDYaDqxbBy2QEeVAcFRy;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class DailyWeatherDataPoint {
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] LYcdI4xpry8eXmFC9I4wyaLdcG1z = {null, null, null, null, null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new gkp6pLZDZ4B(0))};
    public final float Aboow6rUrcY2SrFRa46C6uy;
    public final long BezslBgjveK3hODH;
    public final mHW63SUma8isGb JY5knQmh7EQJEZ;
    public final long PQQPeCDD0JLCT3aLz;
    public final long S1zP5M3X7Ukq3ROlZ87G9I;
    public final long axL8FocTDLUdzg0XScbO;
    public final List ox9eclwMpRd;
    public final DailyTemperatures ziNFA7KzVfc6;

    public static final class Companion {
        public final KSerializer serializer() {
            return DailyWeatherDataPoint$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DailyWeatherDataPoint(int i, long j, long j2, long j3, DailyTemperatures dailyTemperatures, float f, List list) {
        if (9 != (i & 9)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 9, DailyWeatherDataPoint$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = j;
        if ((i & 2) == 0) {
            this.axL8FocTDLUdzg0XScbO = 0L;
        } else {
            this.axL8FocTDLUdzg0XScbO = j2;
        }
        if ((i & 4) == 0) {
            this.BezslBgjveK3hODH = 0L;
        } else {
            this.BezslBgjveK3hODH = j3;
        }
        this.ziNFA7KzVfc6 = dailyTemperatures;
        if ((i & 16) == 0) {
            this.Aboow6rUrcY2SrFRa46C6uy = 0.0f;
        } else {
            this.Aboow6rUrcY2SrFRa46C6uy = f;
        }
        if ((i & 32) == 0) {
            this.ox9eclwMpRd = a9kWzoj6D3Yoa0.GO8WUug7ZWFCUI1zY;
        } else {
            this.ox9eclwMpRd = list;
        }
        this.PQQPeCDD0JLCT3aLz = j * 1000;
        this.JY5knQmh7EQJEZ = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(3, new Cwc3EXEJz6AM6uT(15, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DailyWeatherDataPoint)) {
            return false;
        }
        DailyWeatherDataPoint dailyWeatherDataPoint = (DailyWeatherDataPoint) obj;
        return this.S1zP5M3X7Ukq3ROlZ87G9I == dailyWeatherDataPoint.S1zP5M3X7Ukq3ROlZ87G9I && this.axL8FocTDLUdzg0XScbO == dailyWeatherDataPoint.axL8FocTDLUdzg0XScbO && this.BezslBgjveK3hODH == dailyWeatherDataPoint.BezslBgjveK3hODH && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.ziNFA7KzVfc6, dailyWeatherDataPoint.ziNFA7KzVfc6) && Float.compare(this.Aboow6rUrcY2SrFRa46C6uy, dailyWeatherDataPoint.Aboow6rUrcY2SrFRa46C6uy) == 0 && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.ox9eclwMpRd, dailyWeatherDataPoint.ox9eclwMpRd);
    }

    public final int hashCode() {
        return this.ox9eclwMpRd.hashCode() + aJLiMmqfPh61r.ziNFA7KzVfc6(this.Aboow6rUrcY2SrFRa46C6uy, (this.ziNFA7KzVfc6.hashCode() + oJ08Xj0ZV1gAa.PQQPeCDD0JLCT3aLz(oJ08Xj0ZV1gAa.PQQPeCDD0JLCT3aLz(Long.hashCode(this.S1zP5M3X7Ukq3ROlZ87G9I) * 31, this.axL8FocTDLUdzg0XScbO, 31), this.BezslBgjveK3hODH, 31)) * 31, 31);
    }

    public final String toString() {
        return "DailyWeatherDataPoint(timestamp=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", sunrise=" + this.axL8FocTDLUdzg0XScbO + ", sunset=" + this.BezslBgjveK3hODH + ", temperatures=" + this.ziNFA7KzVfc6 + ", precipitationProbability=" + this.Aboow6rUrcY2SrFRa46C6uy + ", weather=" + this.ox9eclwMpRd + ')';
    }
}
