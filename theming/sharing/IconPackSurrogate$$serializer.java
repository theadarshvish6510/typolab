package bitpit.launcher.theming.sharing;

import b.Gl8Ehe3l199fwoU53BVAGLsBEcSU;
import b.M5ZW8ThjzDgV;
import b.QJmLMy74NwphhvC;
import b.gubhzHXeHIlbXrmRj5i9I;
import b.iFFK8uDMEVqVo;
import b.mHW63SUma8isGb;
import b.nelx5QXMyOjGbNm0aVhnj4x8qWdi;
import b.nrFLsJiodCR850bQB;
import b.o76yCzyy4hCTs9LzjVpiAs;
import b.qJbD6jRb3f7;
import b.rXX7u5bn2nCB6ANmnDyddVU4zbm;
import b.zdV2BnlTiQeQ;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
@QJmLMy74NwphhvC
public final /* synthetic */ class IconPackSurrogate$$serializer implements qJbD6jRb3f7 {
    public static final int $stable;
    public static final IconPackSurrogate$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        IconPackSurrogate$$serializer iconPackSurrogate$$serializer = new IconPackSurrogate$$serializer();
        INSTANCE = iconPackSurrogate$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("bitpit.launcher.theming.sharing.IconPackSurrogate", iconPackSurrogate$$serializer, 6);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("type", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("id", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("package", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("name", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("size", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("shape", false);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
        $stable = 8;
    }

    private IconPackSurrogate$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        mHW63SUma8isGb[] mhw63suma8isgbArr = IconPackSurrogate.PQQPeCDD0JLCT3aLz;
        iFFK8uDMEVqVo iffk8udmevqvo = iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I;
        return new KSerializer[]{iffk8udmevqvo, zdV2BnlTiQeQ.ziNFA7KzVfc6(iffk8udmevqvo), zdV2BnlTiQeQ.ziNFA7KzVfc6(iffk8udmevqvo), zdV2BnlTiQeQ.ziNFA7KzVfc6(iffk8udmevqvo), Gl8Ehe3l199fwoU53BVAGLsBEcSU.S1zP5M3X7Ukq3ROlZ87G9I, mhw63suma8isgbArr[5].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final IconPackSurrogate deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = IconPackSurrogate.PQQPeCDD0JLCT3aLz;
        boolean z = true;
        int i = 0;
        int iFlPMk2Ix9h3b95v = 0;
        String strWT8HZhEwPEkG = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        gubhzHXeHIlbXrmRj5i9I gubhzhxehilbxrmrj5i9i = null;
        while (z) {
            int iCS9Klw57l26qfkpcMlfmpU = nrflsjiodcr850bqbBezslBgjveK3hODH.cS9Klw57l26qfkpcMlfmpU(serialDescriptor);
            switch (iCS9Klw57l26qfkpcMlfmpU) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strWT8HZhEwPEkG = nrflsjiodcr850bqbBezslBgjveK3hODH.WT8HZhEwPEkG(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str = (String) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 1, iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 2, iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 3, iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, str3);
                    i |= 8;
                    break;
                case 4:
                    iFlPMk2Ix9h3b95v = nrflsjiodcr850bqbBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    gubhzhxehilbxrmrj5i9i = (gubhzHXeHIlbXrmRj5i9I) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 5, (KSerializer) mhw63suma8isgbArr[5].getValue(), gubhzhxehilbxrmrj5i9i);
                    i |= 32;
                    break;
                default:
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return null;
            }
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new IconPackSurrogate(i, strWT8HZhEwPEkG, str, str2, str3, iFlPMk2Ix9h3b95v, gubhzhxehilbxrmrj5i9i);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, IconPackSurrogate iconPackSurrogate) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = IconPackSurrogate.PQQPeCDD0JLCT3aLz;
        String str = iconPackSurrogate.S1zP5M3X7Ukq3ROlZ87G9I;
        String str2 = iconPackSurrogate.ziNFA7KzVfc6;
        String str3 = iconPackSurrogate.BezslBgjveK3hODH;
        String str4 = iconPackSurrogate.axL8FocTDLUdzg0XScbO;
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Rdzg08aYlt0UsoLUNug9cESzgAY9R(serialDescriptor, 0, str);
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || str4 != null) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 1, iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, str4);
        }
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || str3 != null) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 2, iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, str3);
        }
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || str2 != null) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 3, iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, str2);
        }
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Ql6q60SSx3(4, iconPackSurrogate.Aboow6rUrcY2SrFRa46C6uy, serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 5, (KSerializer) mhw63suma8isgbArr[5].getValue(), iconPackSurrogate.ox9eclwMpRd);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
