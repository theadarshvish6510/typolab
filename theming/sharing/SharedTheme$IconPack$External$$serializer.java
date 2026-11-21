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
public final /* synthetic */ class SharedTheme$IconPack$External$$serializer implements qJbD6jRb3f7 {
    public static final int $stable;
    public static final SharedTheme$IconPack$External$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SharedTheme$IconPack$External$$serializer sharedTheme$IconPack$External$$serializer = new SharedTheme$IconPack$External$$serializer();
        INSTANCE = sharedTheme$IconPack$External$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("external", sharedTheme$IconPack$External$$serializer, 4);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("package", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("name", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("size", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("shape", false);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
        $stable = 8;
    }

    private SharedTheme$IconPack$External$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        mHW63SUma8isGb[] mhw63suma8isgbArr = SharedTheme$IconPack$External.Aboow6rUrcY2SrFRa46C6uy;
        iFFK8uDMEVqVo iffk8udmevqvo = iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I;
        return new KSerializer[]{iffk8udmevqvo, zdV2BnlTiQeQ.ziNFA7KzVfc6(iffk8udmevqvo), Gl8Ehe3l199fwoU53BVAGLsBEcSU.S1zP5M3X7Ukq3ROlZ87G9I, mhw63suma8isgbArr[3].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SharedTheme$IconPack$External deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = SharedTheme$IconPack$External.Aboow6rUrcY2SrFRa46C6uy;
        boolean z = true;
        int i = 0;
        int iFlPMk2Ix9h3b95v = 0;
        String strWT8HZhEwPEkG = null;
        String str = null;
        gubhzHXeHIlbXrmRj5i9I gubhzhxehilbxrmrj5i9i = null;
        while (z) {
            int iCS9Klw57l26qfkpcMlfmpU = nrflsjiodcr850bqbBezslBgjveK3hODH.cS9Klw57l26qfkpcMlfmpU(serialDescriptor);
            if (iCS9Klw57l26qfkpcMlfmpU == -1) {
                z = false;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 0) {
                strWT8HZhEwPEkG = nrflsjiodcr850bqbBezslBgjveK3hODH.WT8HZhEwPEkG(serialDescriptor, 0);
                i |= 1;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 1) {
                str = (String) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 1, iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, str);
                i |= 2;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 2) {
                iFlPMk2Ix9h3b95v = nrflsjiodcr850bqbBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iCS9Klw57l26qfkpcMlfmpU != 3) {
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return null;
                }
                gubhzhxehilbxrmrj5i9i = (gubhzHXeHIlbXrmRj5i9I) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 3, (KSerializer) mhw63suma8isgbArr[3].getValue(), gubhzhxehilbxrmrj5i9i);
                i |= 8;
            }
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new SharedTheme$IconPack$External(i, strWT8HZhEwPEkG, str, iFlPMk2Ix9h3b95v, gubhzhxehilbxrmrj5i9i);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SharedTheme$IconPack$External sharedTheme$IconPack$External) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = SharedTheme$IconPack$External.Aboow6rUrcY2SrFRa46C6uy;
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Rdzg08aYlt0UsoLUNug9cESzgAY9R(serialDescriptor, 0, sharedTheme$IconPack$External.S1zP5M3X7Ukq3ROlZ87G9I);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 1, iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, sharedTheme$IconPack$External.axL8FocTDLUdzg0XScbO);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Ql6q60SSx3(2, sharedTheme$IconPack$External.BezslBgjveK3hODH, serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 3, (KSerializer) mhw63suma8isgbArr[3].getValue(), sharedTheme$IconPack$External.ziNFA7KzVfc6);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
