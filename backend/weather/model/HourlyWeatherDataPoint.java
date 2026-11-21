package bitpit.launcher.backend.weather.model;

import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.a9kWzoj6D3Yoa0;
import b.aJLiMmqfPh61r;
import b.fpNgwZ132VoUkHxH2MqcZaz;
import b.ggQP1X3lG5YnLLjqLL6mgwsyjxGH;
import b.gkp6pLZDZ4B;
import b.mHW63SUma8isGb;
import b.qSDYaDqxbBy2QEeVAcFRy;
import bitpit.launcher.backend.weather.model.HourlyWeatherDataPoint;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class HourlyWeatherDataPoint {
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] JY5knQmh7EQJEZ = {null, null, null, null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new gkp6pLZDZ4B(27))};
    public final List Aboow6rUrcY2SrFRa46C6uy;
    public final float BezslBgjveK3hODH;
    public final mHW63SUma8isGb PQQPeCDD0JLCT3aLz;
    public final long S1zP5M3X7Ukq3ROlZ87G9I;
    public final float axL8FocTDLUdzg0XScbO;
    public final long ox9eclwMpRd;
    public final float ziNFA7KzVfc6;

    public static final class Companion {
        public final KSerializer serializer() {
            return HourlyWeatherDataPoint$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HourlyWeatherDataPoint(int i, long j, float f, float f2, float f3, List list) {
        if (7 != (i & 7)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 7, HourlyWeatherDataPoint$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = j;
        this.axL8FocTDLUdzg0XScbO = f;
        this.BezslBgjveK3hODH = f2;
        if ((i & 8) == 0) {
            this.ziNFA7KzVfc6 = 0.0f;
        } else {
            this.ziNFA7KzVfc6 = f3;
        }
        if ((i & 16) == 0) {
            this.Aboow6rUrcY2SrFRa46C6uy = a9kWzoj6D3Yoa0.GO8WUug7ZWFCUI1zY;
        } else {
            this.Aboow6rUrcY2SrFRa46C6uy = list;
        }
        this.ox9eclwMpRd = j * 1000;
        final int i2 = 0;
        this.PQQPeCDD0JLCT3aLz = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(3, new fpNgwZ132VoUkHxH2MqcZaz(this) { // from class: b.lRnTFfi7osjFVHhd4LcCReFLBbY3
            public final /* synthetic */ HourlyWeatherDataPoint Rdzg08aYlt0UsoLUNug9cESzgAY9R;

            {
                this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = this;
            }

            @Override // b.fpNgwZ132VoUkHxH2MqcZaz
            public final Object axL8FocTDLUdzg0XScbO() {
                float fS1zP5M3X7Ukq3ROlZ87G9I;
                int i3 = i2;
                HourlyWeatherDataPoint hourlyWeatherDataPoint = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
                switch (i3) {
                    case 0:
                        fS1zP5M3X7Ukq3ROlZ87G9I = fhSNm7dhXpC9W6pfm4CfVlFNDgpq.S1zP5M3X7Ukq3ROlZ87G9I(hourlyWeatherDataPoint.axL8FocTDLUdzg0XScbO);
                        break;
                    case 1:
                        fS1zP5M3X7Ukq3ROlZ87G9I = fhSNm7dhXpC9W6pfm4CfVlFNDgpq.S1zP5M3X7Ukq3ROlZ87G9I(hourlyWeatherDataPoint.BezslBgjveK3hODH);
                        break;
                    case 2:
                        fS1zP5M3X7Ukq3ROlZ87G9I = fhSNm7dhXpC9W6pfm4CfVlFNDgpq.S1zP5M3X7Ukq3ROlZ87G9I(hourlyWeatherDataPoint.axL8FocTDLUdzg0XScbO);
                        break;
                    default:
                        fS1zP5M3X7Ukq3ROlZ87G9I = fhSNm7dhXpC9W6pfm4CfVlFNDgpq.S1zP5M3X7Ukq3ROlZ87G9I(hourlyWeatherDataPoint.BezslBgjveK3hODH);
                        break;
                }
                return Float.valueOf(fS1zP5M3X7Ukq3ROlZ87G9I);
            }
        });
        final int i3 = 1;
        qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(3, new fpNgwZ132VoUkHxH2MqcZaz(this) { // from class: b.lRnTFfi7osjFVHhd4LcCReFLBbY3
            public final /* synthetic */ HourlyWeatherDataPoint Rdzg08aYlt0UsoLUNug9cESzgAY9R;

            {
                this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = this;
            }

            @Override // b.fpNgwZ132VoUkHxH2MqcZaz
            public final Object axL8FocTDLUdzg0XScbO() {
                float fS1zP5M3X7Ukq3ROlZ87G9I;
                int i4 = i3;
                HourlyWeatherDataPoint hourlyWeatherDataPoint = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
                switch (i4) {
                    case 0:
                        fS1zP5M3X7Ukq3ROlZ87G9I = fhSNm7dhXpC9W6pfm4CfVlFNDgpq.S1zP5M3X7Ukq3ROlZ87G9I(hourlyWeatherDataPoint.axL8FocTDLUdzg0XScbO);
                        break;
                    case 1:
                        fS1zP5M3X7Ukq3ROlZ87G9I = fhSNm7dhXpC9W6pfm4CfVlFNDgpq.S1zP5M3X7Ukq3ROlZ87G9I(hourlyWeatherDataPoint.BezslBgjveK3hODH);
                        break;
                    case 2:
                        fS1zP5M3X7Ukq3ROlZ87G9I = fhSNm7dhXpC9W6pfm4CfVlFNDgpq.S1zP5M3X7Ukq3ROlZ87G9I(hourlyWeatherDataPoint.axL8FocTDLUdzg0XScbO);
                        break;
                    default:
                        fS1zP5M3X7Ukq3ROlZ87G9I = fhSNm7dhXpC9W6pfm4CfVlFNDgpq.S1zP5M3X7Ukq3ROlZ87G9I(hourlyWeatherDataPoint.BezslBgjveK3hODH);
                        break;
                }
                return Float.valueOf(fS1zP5M3X7Ukq3ROlZ87G9I);
            }
        });
    }

    public final WeatherCondition S1zP5M3X7Ukq3ROlZ87G9I() {
        return (WeatherCondition) ggQP1X3lG5YnLLjqLL6mgwsyjxGH.yM5HHkk1MhPLZFYTHm2JjrArud(this.Aboow6rUrcY2SrFRa46C6uy);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HourlyWeatherDataPoint)) {
            return false;
        }
        HourlyWeatherDataPoint hourlyWeatherDataPoint = (HourlyWeatherDataPoint) obj;
        return this.S1zP5M3X7Ukq3ROlZ87G9I == hourlyWeatherDataPoint.S1zP5M3X7Ukq3ROlZ87G9I && Float.compare(this.axL8FocTDLUdzg0XScbO, hourlyWeatherDataPoint.axL8FocTDLUdzg0XScbO) == 0 && Float.compare(this.BezslBgjveK3hODH, hourlyWeatherDataPoint.BezslBgjveK3hODH) == 0 && Float.compare(this.ziNFA7KzVfc6, hourlyWeatherDataPoint.ziNFA7KzVfc6) == 0 && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.Aboow6rUrcY2SrFRa46C6uy, hourlyWeatherDataPoint.Aboow6rUrcY2SrFRa46C6uy);
    }

    public final int hashCode() {
        return this.Aboow6rUrcY2SrFRa46C6uy.hashCode() + aJLiMmqfPh61r.ziNFA7KzVfc6(this.ziNFA7KzVfc6, aJLiMmqfPh61r.ziNFA7KzVfc6(this.BezslBgjveK3hODH, aJLiMmqfPh61r.ziNFA7KzVfc6(this.axL8FocTDLUdzg0XScbO, Long.hashCode(this.S1zP5M3X7Ukq3ROlZ87G9I) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "HourlyWeatherDataPoint(timestamp=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", temperature=" + this.axL8FocTDLUdzg0XScbO + ", feelsLike=" + this.BezslBgjveK3hODH + ", precipitationProbability=" + this.ziNFA7KzVfc6 + ", weather=" + this.Aboow6rUrcY2SrFRa46C6uy + ')';
    }

    public HourlyWeatherDataPoint(long j, float f, float f2, float f3, List list) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = j;
        this.axL8FocTDLUdzg0XScbO = f;
        this.BezslBgjveK3hODH = f2;
        this.ziNFA7KzVfc6 = f3;
        this.Aboow6rUrcY2SrFRa46C6uy = list;
        this.ox9eclwMpRd = j * 1000;
        final int i = 2;
        fpNgwZ132VoUkHxH2MqcZaz fpngwz132voukhxh2mqczaz = new fpNgwZ132VoUkHxH2MqcZaz(this) { // from class: b.lRnTFfi7osjFVHhd4LcCReFLBbY3
            public final /* synthetic */ HourlyWeatherDataPoint Rdzg08aYlt0UsoLUNug9cESzgAY9R;

            {
                this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = this;
            }

            @Override // b.fpNgwZ132VoUkHxH2MqcZaz
            public final Object axL8FocTDLUdzg0XScbO() {
                float fS1zP5M3X7Ukq3ROlZ87G9I;
                int i4 = i;
                HourlyWeatherDataPoint hourlyWeatherDataPoint = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
                switch (i4) {
                    case 0:
                        fS1zP5M3X7Ukq3ROlZ87G9I = fhSNm7dhXpC9W6pfm4CfVlFNDgpq.S1zP5M3X7Ukq3ROlZ87G9I(hourlyWeatherDataPoint.axL8FocTDLUdzg0XScbO);
                        break;
                    case 1:
                        fS1zP5M3X7Ukq3ROlZ87G9I = fhSNm7dhXpC9W6pfm4CfVlFNDgpq.S1zP5M3X7Ukq3ROlZ87G9I(hourlyWeatherDataPoint.BezslBgjveK3hODH);
                        break;
                    case 2:
                        fS1zP5M3X7Ukq3ROlZ87G9I = fhSNm7dhXpC9W6pfm4CfVlFNDgpq.S1zP5M3X7Ukq3ROlZ87G9I(hourlyWeatherDataPoint.axL8FocTDLUdzg0XScbO);
                        break;
                    default:
                        fS1zP5M3X7Ukq3ROlZ87G9I = fhSNm7dhXpC9W6pfm4CfVlFNDgpq.S1zP5M3X7Ukq3ROlZ87G9I(hourlyWeatherDataPoint.BezslBgjveK3hODH);
                        break;
                }
                return Float.valueOf(fS1zP5M3X7Ukq3ROlZ87G9I);
            }
        };
        final int i2 = 3;
        this.PQQPeCDD0JLCT3aLz = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(3, fpngwz132voukhxh2mqczaz);
        qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(3, new fpNgwZ132VoUkHxH2MqcZaz(this) { // from class: b.lRnTFfi7osjFVHhd4LcCReFLBbY3
            public final /* synthetic */ HourlyWeatherDataPoint Rdzg08aYlt0UsoLUNug9cESzgAY9R;

            {
                this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = this;
            }

            @Override // b.fpNgwZ132VoUkHxH2MqcZaz
            public final Object axL8FocTDLUdzg0XScbO() {
                float fS1zP5M3X7Ukq3ROlZ87G9I;
                int i4 = i2;
                HourlyWeatherDataPoint hourlyWeatherDataPoint = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
                switch (i4) {
                    case 0:
                        fS1zP5M3X7Ukq3ROlZ87G9I = fhSNm7dhXpC9W6pfm4CfVlFNDgpq.S1zP5M3X7Ukq3ROlZ87G9I(hourlyWeatherDataPoint.axL8FocTDLUdzg0XScbO);
                        break;
                    case 1:
                        fS1zP5M3X7Ukq3ROlZ87G9I = fhSNm7dhXpC9W6pfm4CfVlFNDgpq.S1zP5M3X7Ukq3ROlZ87G9I(hourlyWeatherDataPoint.BezslBgjveK3hODH);
                        break;
                    case 2:
                        fS1zP5M3X7Ukq3ROlZ87G9I = fhSNm7dhXpC9W6pfm4CfVlFNDgpq.S1zP5M3X7Ukq3ROlZ87G9I(hourlyWeatherDataPoint.axL8FocTDLUdzg0XScbO);
                        break;
                    default:
                        fS1zP5M3X7Ukq3ROlZ87G9I = fhSNm7dhXpC9W6pfm4CfVlFNDgpq.S1zP5M3X7Ukq3ROlZ87G9I(hourlyWeatherDataPoint.BezslBgjveK3hODH);
                        break;
                }
                return Float.valueOf(fS1zP5M3X7Ukq3ROlZ87G9I);
            }
        });
    }
}
