package bitpit.launcher.backend.weather.model;

import b.M5ZW8ThjzDgV;
import b.OkhdZkC3NYLW;
import b.QJmLMy74NwphhvC;
import b.a9kWzoj6D3Yoa0;
import b.mHW63SUma8isGb;
import b.nelx5QXMyOjGbNm0aVhnj4x8qWdi;
import b.nrFLsJiodCR850bQB;
import b.o76yCzyy4hCTs9LzjVpiAs;
import b.qJbD6jRb3f7;
import b.rXX7u5bn2nCB6ANmnDyddVU4zbm;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
@QJmLMy74NwphhvC
public /* synthetic */ class WeatherForecast$$serializer implements qJbD6jRb3f7 {
    public static final WeatherForecast$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        WeatherForecast$$serializer weatherForecast$$serializer = new WeatherForecast$$serializer();
        INSTANCE = weatherForecast$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("bitpit.launcher.backend.weather.model.WeatherForecast", weatherForecast$$serializer, 4);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("current", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("minutely", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("hourly", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("daily", true);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
    }

    private WeatherForecast$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        mHW63SUma8isGb[] mhw63suma8isgbArr = WeatherForecast.Aboow6rUrcY2SrFRa46C6uy;
        return new KSerializer[]{CurrentWeatherDataPoint$$serializer.INSTANCE, mhw63suma8isgbArr[1].getValue(), mhw63suma8isgbArr[2].getValue(), mhw63suma8isgbArr[3].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final WeatherForecast deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = WeatherForecast.Aboow6rUrcY2SrFRa46C6uy;
        boolean z = true;
        int i = 0;
        CurrentWeatherDataPoint currentWeatherDataPoint = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        while (z) {
            int iCS9Klw57l26qfkpcMlfmpU = nrflsjiodcr850bqbBezslBgjveK3hODH.cS9Klw57l26qfkpcMlfmpU(serialDescriptor);
            if (iCS9Klw57l26qfkpcMlfmpU == -1) {
                z = false;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 0) {
                currentWeatherDataPoint = (CurrentWeatherDataPoint) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 0, CurrentWeatherDataPoint$$serializer.INSTANCE, currentWeatherDataPoint);
                i |= 1;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 1) {
                list = (List) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 1, (KSerializer) mhw63suma8isgbArr[1].getValue(), list);
                i |= 2;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 2) {
                list2 = (List) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 2, (KSerializer) mhw63suma8isgbArr[2].getValue(), list2);
                i |= 4;
            } else {
                if (iCS9Klw57l26qfkpcMlfmpU != 3) {
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return null;
                }
                list3 = (List) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 3, (KSerializer) mhw63suma8isgbArr[3].getValue(), list3);
                i |= 8;
            }
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new WeatherForecast(i, currentWeatherDataPoint, list, list2, list3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, WeatherForecast weatherForecast) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = WeatherForecast.Aboow6rUrcY2SrFRa46C6uy;
        CurrentWeatherDataPoint$$serializer currentWeatherDataPoint$$serializer = CurrentWeatherDataPoint$$serializer.INSTANCE;
        CurrentWeatherDataPoint currentWeatherDataPoint = weatherForecast.S1zP5M3X7Ukq3ROlZ87G9I;
        List list = weatherForecast.ziNFA7KzVfc6;
        List list2 = weatherForecast.BezslBgjveK3hODH;
        List list3 = weatherForecast.axL8FocTDLUdzg0XScbO;
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 0, currentWeatherDataPoint$$serializer, currentWeatherDataPoint);
        boolean zFzogU2bPCQtD6a1hMYB1kyti = nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti();
        a9kWzoj6D3Yoa0 a9kwzoj6d3yoa0 = a9kWzoj6D3Yoa0.GO8WUug7ZWFCUI1zY;
        if (zFzogU2bPCQtD6a1hMYB1kyti || !OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(list3, a9kwzoj6d3yoa0)) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 1, (KSerializer) mhw63suma8isgbArr[1].getValue(), list3);
        }
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || !OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(list2, a9kwzoj6d3yoa0)) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 2, (KSerializer) mhw63suma8isgbArr[2].getValue(), list2);
        }
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || !OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(list, a9kwzoj6d3yoa0)) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 3, (KSerializer) mhw63suma8isgbArr[3].getValue(), list);
        }
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
