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
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
@QJmLMy74NwphhvC
public final /* synthetic */ class SharedTheme$IconPack$Niagara$$serializer implements qJbD6jRb3f7 {
    public static final int $stable;
    public static final SharedTheme$IconPack$Niagara$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SharedTheme$IconPack$Niagara$$serializer sharedTheme$IconPack$Niagara$$serializer = new SharedTheme$IconPack$Niagara$$serializer();
        INSTANCE = sharedTheme$IconPack$Niagara$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("builtin", sharedTheme$IconPack$Niagara$$serializer, 3);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("id", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("size", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("shape", false);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
        $stable = 8;
    }

    private SharedTheme$IconPack$Niagara$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, Gl8Ehe3l199fwoU53BVAGLsBEcSU.S1zP5M3X7Ukq3ROlZ87G9I, SharedTheme$IconPack$Niagara.ziNFA7KzVfc6[2].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SharedTheme$IconPack$Niagara deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = SharedTheme$IconPack$Niagara.ziNFA7KzVfc6;
        boolean z = true;
        int i = 0;
        int iFlPMk2Ix9h3b95v = 0;
        String strWT8HZhEwPEkG = null;
        gubhzHXeHIlbXrmRj5i9I gubhzhxehilbxrmrj5i9i = null;
        while (z) {
            int iCS9Klw57l26qfkpcMlfmpU = nrflsjiodcr850bqbBezslBgjveK3hODH.cS9Klw57l26qfkpcMlfmpU(serialDescriptor);
            if (iCS9Klw57l26qfkpcMlfmpU == -1) {
                z = false;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 0) {
                strWT8HZhEwPEkG = nrflsjiodcr850bqbBezslBgjveK3hODH.WT8HZhEwPEkG(serialDescriptor, 0);
                i |= 1;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 1) {
                iFlPMk2Ix9h3b95v = nrflsjiodcr850bqbBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iCS9Klw57l26qfkpcMlfmpU != 2) {
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return null;
                }
                gubhzhxehilbxrmrj5i9i = (gubhzHXeHIlbXrmRj5i9I) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 2, (KSerializer) mhw63suma8isgbArr[2].getValue(), gubhzhxehilbxrmrj5i9i);
                i |= 4;
            }
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new SharedTheme$IconPack$Niagara(i, strWT8HZhEwPEkG, iFlPMk2Ix9h3b95v, gubhzhxehilbxrmrj5i9i);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SharedTheme$IconPack$Niagara sharedTheme$IconPack$Niagara) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = SharedTheme$IconPack$Niagara.ziNFA7KzVfc6;
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Rdzg08aYlt0UsoLUNug9cESzgAY9R(serialDescriptor, 0, sharedTheme$IconPack$Niagara.S1zP5M3X7Ukq3ROlZ87G9I);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Ql6q60SSx3(1, sharedTheme$IconPack$Niagara.axL8FocTDLUdzg0XScbO, serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 2, (KSerializer) mhw63suma8isgbArr[2].getValue(), sharedTheme$IconPack$Niagara.BezslBgjveK3hODH);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
