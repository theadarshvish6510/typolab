package bitpit.launcher.backend.weather.model;

import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.a9kWzoj6D3Yoa0;
import b.aJLiMmqfPh61r;
import b.fpNgwZ132VoUkHxH2MqcZaz;
import b.mHW63SUma8isGb;
import b.qSDYaDqxbBy2QEeVAcFRy;
import b.vdBBwKx45uSJHLCNxSnPL6OZU4;
import bitpit.launcher.backend.weather.model.CurrentWeatherDataPoint;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class CurrentWeatherDataPoint {
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] ox9eclwMpRd = {null, null, null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new vdBBwKx45uSJHLCNxSnPL6OZU4(29))};
    public final long Aboow6rUrcY2SrFRa46C6uy;
    public final float BezslBgjveK3hODH;
    public final long S1zP5M3X7Ukq3ROlZ87G9I;
    public final float axL8FocTDLUdzg0XScbO;
    public final List ziNFA7KzVfc6;

    public static final class Companion {
        public final KSerializer serializer() {
            return CurrentWeatherDataPoint$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CurrentWeatherDataPoint(int i, long j, float f, float f2, List list) {
        if (7 != (i & 7)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 7, CurrentWeatherDataPoint$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = j;
        this.axL8FocTDLUdzg0XScbO = f;
        this.BezslBgjveK3hODH = f2;
        if ((i & 8) == 0) {
            this.ziNFA7KzVfc6 = a9kWzoj6D3Yoa0.GO8WUug7ZWFCUI1zY;
        } else {
            this.ziNFA7KzVfc6 = list;
        }
        this.Aboow6rUrcY2SrFRa46C6uy = j * 1000;
        final int i2 = 0;
        qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(3, new fpNgwZ132VoUkHxH2MqcZaz(this) { // from class: b.B92QTxMIAh4NZnOw3YCKWwWp6V
            public final /* synthetic */ CurrentWeatherDataPoint Rdzg08aYlt0UsoLUNug9cESzgAY9R;

            {
                this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = this;
            }

            @Override // b.fpNgwZ132VoUkHxH2MqcZaz
            public final Object axL8FocTDLUdzg0XScbO() {
                float fS1zP5M3X7Ukq3ROlZ87G9I;
                int i3 = i2;
                CurrentWeatherDataPoint currentWeatherDataPoint = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
                switch (i3) {
                    case 0:
                        fS1zP5M3X7Ukq3ROlZ87G9I = fhSNm7dhXpC9W6pfm4CfVlFNDgpq.S1zP5M3X7Ukq3ROlZ87G9I(currentWeatherDataPoint.axL8FocTDLUdzg0XScbO);
                        break;
                    default:
                        fS1zP5M3X7Ukq3ROlZ87G9I = fhSNm7dhXpC9W6pfm4CfVlFNDgpq.S1zP5M3X7Ukq3ROlZ87G9I(currentWeatherDataPoint.BezslBgjveK3hODH);
                        break;
                }
                return Float.valueOf(fS1zP5M3X7Ukq3ROlZ87G9I);
            }
        });
        final int i3 = 1;
        qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(3, new fpNgwZ132VoUkHxH2MqcZaz(this) { // from class: b.B92QTxMIAh4NZnOw3YCKWwWp6V
            public final /* synthetic */ CurrentWeatherDataPoint Rdzg08aYlt0UsoLUNug9cESzgAY9R;

            {
                this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = this;
            }

            @Override // b.fpNgwZ132VoUkHxH2MqcZaz
            public final Object axL8FocTDLUdzg0XScbO() {
                float fS1zP5M3X7Ukq3ROlZ87G9I;
                int i4 = i3;
                CurrentWeatherDataPoint currentWeatherDataPoint = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
                switch (i4) {
                    case 0:
                        fS1zP5M3X7Ukq3ROlZ87G9I = fhSNm7dhXpC9W6pfm4CfVlFNDgpq.S1zP5M3X7Ukq3ROlZ87G9I(currentWeatherDataPoint.axL8FocTDLUdzg0XScbO);
                        break;
                    default:
                        fS1zP5M3X7Ukq3ROlZ87G9I = fhSNm7dhXpC9W6pfm4CfVlFNDgpq.S1zP5M3X7Ukq3ROlZ87G9I(currentWeatherDataPoint.BezslBgjveK3hODH);
                        break;
                }
                return Float.valueOf(fS1zP5M3X7Ukq3ROlZ87G9I);
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CurrentWeatherDataPoint)) {
            return false;
        }
        CurrentWeatherDataPoint currentWeatherDataPoint = (CurrentWeatherDataPoint) obj;
        return this.S1zP5M3X7Ukq3ROlZ87G9I == currentWeatherDataPoint.S1zP5M3X7Ukq3ROlZ87G9I && Float.compare(this.axL8FocTDLUdzg0XScbO, currentWeatherDataPoint.axL8FocTDLUdzg0XScbO) == 0 && Float.compare(this.BezslBgjveK3hODH, currentWeatherDataPoint.BezslBgjveK3hODH) == 0 && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.ziNFA7KzVfc6, currentWeatherDataPoint.ziNFA7KzVfc6);
    }

    public final int hashCode() {
        return this.ziNFA7KzVfc6.hashCode() + aJLiMmqfPh61r.ziNFA7KzVfc6(this.BezslBgjveK3hODH, aJLiMmqfPh61r.ziNFA7KzVfc6(this.axL8FocTDLUdzg0XScbO, Long.hashCode(this.S1zP5M3X7Ukq3ROlZ87G9I) * 31, 31), 31);
    }

    public final String toString() {
        return "CurrentWeatherDataPoint(timestamp=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", temperature=" + this.axL8FocTDLUdzg0XScbO + ", feelsLike=" + this.BezslBgjveK3hODH + ", weather=" + this.ziNFA7KzVfc6 + ')';
    }
}
