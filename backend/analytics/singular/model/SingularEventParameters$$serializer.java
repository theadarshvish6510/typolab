package bitpit.launcher.backend.analytics.singular.model;

import b.J0tNOcVdQ2JmIxX3cTuEd;
import b.M5ZW8ThjzDgV;
import b.OkhdZkC3NYLW;
import b.QJmLMy74NwphhvC;
import b.iFFK8uDMEVqVo;
import b.mHW63SUma8isGb;
import b.nelx5QXMyOjGbNm0aVhnj4x8qWdi;
import b.nrFLsJiodCR850bQB;
import b.o76yCzyy4hCTs9LzjVpiAs;
import b.qJbD6jRb3f7;
import b.rXX7u5bn2nCB6ANmnDyddVU4zbm;
import b.zdV2BnlTiQeQ;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
@QJmLMy74NwphhvC
public /* synthetic */ class SingularEventParameters$$serializer implements qJbD6jRb3f7 {
    public static final SingularEventParameters$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SingularEventParameters$$serializer singularEventParameters$$serializer = new SingularEventParameters$$serializer();
        INSTANCE = singularEventParameters$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("bitpit.launcher.backend.analytics.singular.model.SingularEventParameters", singularEventParameters$$serializer, 4);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("n", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("e", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("global_properties", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("data_sharing_options", true);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
    }

    private SingularEventParameters$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        mHW63SUma8isGb[] mhw63suma8isgbArr = SingularEventParameters.Aboow6rUrcY2SrFRa46C6uy;
        return new KSerializer[]{iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, mhw63suma8isgbArr[1].getValue(), mhw63suma8isgbArr[2].getValue(), zdV2BnlTiQeQ.ziNFA7KzVfc6(SingularEventParameters$DataSharingOptions$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SingularEventParameters deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = SingularEventParameters.Aboow6rUrcY2SrFRa46C6uy;
        boolean z = true;
        int i = 0;
        String strWT8HZhEwPEkG = null;
        Map map = null;
        Map map2 = null;
        SingularEventParameters.DataSharingOptions dataSharingOptions = null;
        while (z) {
            int iCS9Klw57l26qfkpcMlfmpU = nrflsjiodcr850bqbBezslBgjveK3hODH.cS9Klw57l26qfkpcMlfmpU(serialDescriptor);
            if (iCS9Klw57l26qfkpcMlfmpU == -1) {
                z = false;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 0) {
                strWT8HZhEwPEkG = nrflsjiodcr850bqbBezslBgjveK3hODH.WT8HZhEwPEkG(serialDescriptor, 0);
                i |= 1;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 1) {
                map = (Map) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 1, (KSerializer) mhw63suma8isgbArr[1].getValue(), map);
                i |= 2;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 2) {
                map2 = (Map) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 2, (KSerializer) mhw63suma8isgbArr[2].getValue(), map2);
                i |= 4;
            } else {
                if (iCS9Klw57l26qfkpcMlfmpU != 3) {
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return null;
                }
                dataSharingOptions = (SingularEventParameters.DataSharingOptions) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 3, SingularEventParameters$DataSharingOptions$$serializer.INSTANCE, dataSharingOptions);
                i |= 8;
            }
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new SingularEventParameters(i, strWT8HZhEwPEkG, map, map2, dataSharingOptions);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SingularEventParameters singularEventParameters) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = SingularEventParameters.Aboow6rUrcY2SrFRa46C6uy;
        String str = singularEventParameters.S1zP5M3X7Ukq3ROlZ87G9I;
        SingularEventParameters.DataSharingOptions dataSharingOptions = singularEventParameters.ziNFA7KzVfc6;
        Map map = singularEventParameters.BezslBgjveK3hODH;
        Map map2 = singularEventParameters.axL8FocTDLUdzg0XScbO;
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Rdzg08aYlt0UsoLUNug9cESzgAY9R(serialDescriptor, 0, str);
        boolean zFzogU2bPCQtD6a1hMYB1kyti = nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti();
        J0tNOcVdQ2JmIxX3cTuEd j0tNOcVdQ2JmIxX3cTuEd = J0tNOcVdQ2JmIxX3cTuEd.GO8WUug7ZWFCUI1zY;
        if (zFzogU2bPCQtD6a1hMYB1kyti || !OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(map2, j0tNOcVdQ2JmIxX3cTuEd)) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 1, (KSerializer) mhw63suma8isgbArr[1].getValue(), map2);
        }
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || !OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(map, j0tNOcVdQ2JmIxX3cTuEd)) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 2, (KSerializer) mhw63suma8isgbArr[2].getValue(), map);
        }
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || dataSharingOptions != null) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 3, SingularEventParameters$DataSharingOptions$$serializer.INSTANCE, dataSharingOptions);
        }
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
