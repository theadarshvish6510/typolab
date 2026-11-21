package bitpit.launcher.backend.weather.model;

import b.DY7rAMiwL4GxJalIAuGPP4NEMDd;
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
import b.vSNKvya7RsAhuSv;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
@QJmLMy74NwphhvC
public /* synthetic */ class HourlyWeatherDataPoint$$serializer implements qJbD6jRb3f7 {
    public static final HourlyWeatherDataPoint$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        HourlyWeatherDataPoint$$serializer hourlyWeatherDataPoint$$serializer = new HourlyWeatherDataPoint$$serializer();
        INSTANCE = hourlyWeatherDataPoint$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("bitpit.launcher.backend.weather.model.HourlyWeatherDataPoint", hourlyWeatherDataPoint$$serializer, 5);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("dt", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("temp", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("feels_like", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("pop", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("weather", true);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
    }

    private HourlyWeatherDataPoint$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        mHW63SUma8isGb[] mhw63suma8isgbArr = HourlyWeatherDataPoint.JY5knQmh7EQJEZ;
        vSNKvya7RsAhuSv vsnkvya7rsahusv = vSNKvya7RsAhuSv.S1zP5M3X7Ukq3ROlZ87G9I;
        return new KSerializer[]{DY7rAMiwL4GxJalIAuGPP4NEMDd.S1zP5M3X7Ukq3ROlZ87G9I, vsnkvya7rsahusv, vsnkvya7rsahusv, vsnkvya7rsahusv, mhw63suma8isgbArr[4].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final HourlyWeatherDataPoint deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = HourlyWeatherDataPoint.JY5knQmh7EQJEZ;
        int i = 0;
        long jPQQPeCDD0JLCT3aLz = 0;
        float fSCPtafveBAhdLIs2ajN3WV = 0.0f;
        float fSCPtafveBAhdLIs2ajN3WV2 = 0.0f;
        float fSCPtafveBAhdLIs2ajN3WV3 = 0.0f;
        List list = null;
        boolean z = true;
        while (z) {
            int iCS9Klw57l26qfkpcMlfmpU = nrflsjiodcr850bqbBezslBgjveK3hODH.cS9Klw57l26qfkpcMlfmpU(serialDescriptor);
            if (iCS9Klw57l26qfkpcMlfmpU == -1) {
                z = false;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 0) {
                jPQQPeCDD0JLCT3aLz = nrflsjiodcr850bqbBezslBgjveK3hODH.PQQPeCDD0JLCT3aLz(serialDescriptor, 0);
                i |= 1;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 1) {
                fSCPtafveBAhdLIs2ajN3WV = nrflsjiodcr850bqbBezslBgjveK3hODH.sCPtafveBAhdLIs2ajN3WV(serialDescriptor, 1);
                i |= 2;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 2) {
                fSCPtafveBAhdLIs2ajN3WV2 = nrflsjiodcr850bqbBezslBgjveK3hODH.sCPtafveBAhdLIs2ajN3WV(serialDescriptor, 2);
                i |= 4;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 3) {
                fSCPtafveBAhdLIs2ajN3WV3 = nrflsjiodcr850bqbBezslBgjveK3hODH.sCPtafveBAhdLIs2ajN3WV(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iCS9Klw57l26qfkpcMlfmpU != 4) {
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return null;
                }
                list = (List) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 4, (KSerializer) mhw63suma8isgbArr[4].getValue(), list);
                i |= 16;
            }
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new HourlyWeatherDataPoint(i, jPQQPeCDD0JLCT3aLz, fSCPtafveBAhdLIs2ajN3WV, fSCPtafveBAhdLIs2ajN3WV2, fSCPtafveBAhdLIs2ajN3WV3, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, HourlyWeatherDataPoint hourlyWeatherDataPoint) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = HourlyWeatherDataPoint.JY5knQmh7EQJEZ;
        long j = hourlyWeatherDataPoint.S1zP5M3X7Ukq3ROlZ87G9I;
        List list = hourlyWeatherDataPoint.Aboow6rUrcY2SrFRa46C6uy;
        float f = hourlyWeatherDataPoint.ziNFA7KzVfc6;
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.J1BE9tYH1em4X1uAhc6L7f4M(serialDescriptor, 0, j);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.HveD9n1tOYlffjJDxghBitYNgB(serialDescriptor, 1, hourlyWeatherDataPoint.axL8FocTDLUdzg0XScbO);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.HveD9n1tOYlffjJDxghBitYNgB(serialDescriptor, 2, hourlyWeatherDataPoint.BezslBgjveK3hODH);
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || Float.compare(f, 0.0f) != 0) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.HveD9n1tOYlffjJDxghBitYNgB(serialDescriptor, 3, f);
        }
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || !OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(list, a9kWzoj6D3Yoa0.GO8WUug7ZWFCUI1zY)) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 4, (KSerializer) mhw63suma8isgbArr[4].getValue(), list);
        }
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
