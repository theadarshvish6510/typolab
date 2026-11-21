package bitpit.launcher.backend.weather.model;

import b.M5ZW8ThjzDgV;
import b.QJmLMy74NwphhvC;
import b.nelx5QXMyOjGbNm0aVhnj4x8qWdi;
import b.nrFLsJiodCR850bQB;
import b.o76yCzyy4hCTs9LzjVpiAs;
import b.qJbD6jRb3f7;
import b.rXX7u5bn2nCB6ANmnDyddVU4zbm;
import b.vSNKvya7RsAhuSv;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
@QJmLMy74NwphhvC
public /* synthetic */ class DailyTemperatures$$serializer implements qJbD6jRb3f7 {
    public static final DailyTemperatures$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DailyTemperatures$$serializer dailyTemperatures$$serializer = new DailyTemperatures$$serializer();
        INSTANCE = dailyTemperatures$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("bitpit.launcher.backend.weather.model.DailyTemperatures", dailyTemperatures$$serializer, 6);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("day", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("min", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("max", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("night", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("eve", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("morn", false);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
    }

    private DailyTemperatures$$serializer() {
    }

    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        vSNKvya7RsAhuSv vsnkvya7rsahusv = vSNKvya7RsAhuSv.S1zP5M3X7Ukq3ROlZ87G9I;
        return new KSerializer[]{vsnkvya7rsahusv, vsnkvya7rsahusv, vsnkvya7rsahusv, vsnkvya7rsahusv, vsnkvya7rsahusv, vsnkvya7rsahusv};
    }

    @Override // kotlinx.serialization.KSerializer
    public final DailyTemperatures deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        int i = 0;
        float fSCPtafveBAhdLIs2ajN3WV = 0.0f;
        float fSCPtafveBAhdLIs2ajN3WV2 = 0.0f;
        float fSCPtafveBAhdLIs2ajN3WV3 = 0.0f;
        float fSCPtafveBAhdLIs2ajN3WV4 = 0.0f;
        float fSCPtafveBAhdLIs2ajN3WV5 = 0.0f;
        float fSCPtafveBAhdLIs2ajN3WV6 = 0.0f;
        boolean z = true;
        while (z) {
            int iCS9Klw57l26qfkpcMlfmpU = nrflsjiodcr850bqbBezslBgjveK3hODH.cS9Klw57l26qfkpcMlfmpU(serialDescriptor);
            switch (iCS9Klw57l26qfkpcMlfmpU) {
                case -1:
                    z = false;
                    break;
                case 0:
                    fSCPtafveBAhdLIs2ajN3WV = nrflsjiodcr850bqbBezslBgjveK3hODH.sCPtafveBAhdLIs2ajN3WV(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    fSCPtafveBAhdLIs2ajN3WV2 = nrflsjiodcr850bqbBezslBgjveK3hODH.sCPtafveBAhdLIs2ajN3WV(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    fSCPtafveBAhdLIs2ajN3WV3 = nrflsjiodcr850bqbBezslBgjveK3hODH.sCPtafveBAhdLIs2ajN3WV(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    fSCPtafveBAhdLIs2ajN3WV4 = nrflsjiodcr850bqbBezslBgjveK3hODH.sCPtafveBAhdLIs2ajN3WV(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    fSCPtafveBAhdLIs2ajN3WV5 = nrflsjiodcr850bqbBezslBgjveK3hODH.sCPtafveBAhdLIs2ajN3WV(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    fSCPtafveBAhdLIs2ajN3WV6 = nrflsjiodcr850bqbBezslBgjveK3hODH.sCPtafveBAhdLIs2ajN3WV(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return null;
            }
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new DailyTemperatures(i, fSCPtafveBAhdLIs2ajN3WV, fSCPtafveBAhdLIs2ajN3WV2, fSCPtafveBAhdLIs2ajN3WV3, fSCPtafveBAhdLIs2ajN3WV4, fSCPtafveBAhdLIs2ajN3WV5, fSCPtafveBAhdLIs2ajN3WV6);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, DailyTemperatures dailyTemperatures) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.HveD9n1tOYlffjJDxghBitYNgB(serialDescriptor, 0, dailyTemperatures.S1zP5M3X7Ukq3ROlZ87G9I);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.HveD9n1tOYlffjJDxghBitYNgB(serialDescriptor, 1, dailyTemperatures.axL8FocTDLUdzg0XScbO);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.HveD9n1tOYlffjJDxghBitYNgB(serialDescriptor, 2, dailyTemperatures.BezslBgjveK3hODH);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.HveD9n1tOYlffjJDxghBitYNgB(serialDescriptor, 3, dailyTemperatures.ziNFA7KzVfc6);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.HveD9n1tOYlffjJDxghBitYNgB(serialDescriptor, 4, dailyTemperatures.Aboow6rUrcY2SrFRa46C6uy);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.HveD9n1tOYlffjJDxghBitYNgB(serialDescriptor, 5, dailyTemperatures.ox9eclwMpRd);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
