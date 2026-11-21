package bitpit.launcher.backend.weather.model;

import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.XYtcAIGZkWt7;
import b.a9kWzoj6D3Yoa0;
import b.mHW63SUma8isGb;
import b.qSDYaDqxbBy2QEeVAcFRy;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class WeatherForecast {
    public final List BezslBgjveK3hODH;
    public final CurrentWeatherDataPoint S1zP5M3X7Ukq3ROlZ87G9I;
    public final List axL8FocTDLUdzg0XScbO;
    public final List ziNFA7KzVfc6;
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] Aboow6rUrcY2SrFRa46C6uy = {null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new XYtcAIGZkWt7(7)), qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new XYtcAIGZkWt7(8)), qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new XYtcAIGZkWt7(9))};

    public static final class Companion {
        public final KSerializer serializer() {
            return WeatherForecast$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ WeatherForecast(int i, CurrentWeatherDataPoint currentWeatherDataPoint, List list, List list2, List list3) {
        if (1 != (i & 1)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 1, WeatherForecast$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = currentWeatherDataPoint;
        int i2 = i & 2;
        a9kWzoj6D3Yoa0 a9kwzoj6d3yoa0 = a9kWzoj6D3Yoa0.GO8WUug7ZWFCUI1zY;
        if (i2 == 0) {
            this.axL8FocTDLUdzg0XScbO = a9kwzoj6d3yoa0;
        } else {
            this.axL8FocTDLUdzg0XScbO = list;
        }
        if ((i & 4) == 0) {
            this.BezslBgjveK3hODH = a9kwzoj6d3yoa0;
        } else {
            this.BezslBgjveK3hODH = list2;
        }
        if ((i & 8) == 0) {
            this.ziNFA7KzVfc6 = a9kwzoj6d3yoa0;
        } else {
            this.ziNFA7KzVfc6 = list3;
        }
    }
}
