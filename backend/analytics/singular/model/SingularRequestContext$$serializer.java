package bitpit.launcher.backend.analytics.singular.model;

import b.M5ZW8ThjzDgV;
import b.Q1EVKexo2yndu3vM8gAwRGSPg;
import b.QJmLMy74NwphhvC;
import b.eUwPamJ8sGfSyqS5ucd4;
import b.iFFK8uDMEVqVo;
import b.mHW63SUma8isGb;
import b.nelx5QXMyOjGbNm0aVhnj4x8qWdi;
import b.nrFLsJiodCR850bQB;
import b.o76yCzyy4hCTs9LzjVpiAs;
import b.qJbD6jRb3f7;
import b.rXX7u5bn2nCB6ANmnDyddVU4zbm;
import b.zdV2BnlTiQeQ;
import java.util.UUID;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
@QJmLMy74NwphhvC
public /* synthetic */ class SingularRequestContext$$serializer implements qJbD6jRb3f7 {
    public static final SingularRequestContext$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SingularRequestContext$$serializer singularRequestContext$$serializer = new SingularRequestContext$$serializer();
        INSTANCE = singularRequestContext$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("bitpit.launcher.backend.analytics.singular.model.SingularRequestContext", singularRequestContext$$serializer, 10);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("aifa", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("asid", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("sdid", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("ve", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("ma", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("mo", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("lc", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("bd", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("country", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("custom_user_id", true);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
    }

    private SingularRequestContext$$serializer() {
    }

    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        mHW63SUma8isGb[] mhw63suma8isgbArr = SingularRequestContext.fXBtMGfTIjGSHgK542;
        iFFK8uDMEVqVo iffk8udmevqvo = iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I;
        return new KSerializer[]{zdV2BnlTiQeQ.ziNFA7KzVfc6(iffk8udmevqvo), zdV2BnlTiQeQ.ziNFA7KzVfc6(iffk8udmevqvo), Q1EVKexo2yndu3vM8gAwRGSPg.S1zP5M3X7Ukq3ROlZ87G9I, iffk8udmevqvo, iffk8udmevqvo, iffk8udmevqvo, iffk8udmevqvo, iffk8udmevqvo, zdV2BnlTiQeQ.ziNFA7KzVfc6((KSerializer) mhw63suma8isgbArr[8].getValue()), zdV2BnlTiQeQ.ziNFA7KzVfc6(iffk8udmevqvo)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SingularRequestContext deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = SingularRequestContext.fXBtMGfTIjGSHgK542;
        SingularRequestContext singularRequestContext = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        UUID uuid = null;
        String str4 = null;
        String strWT8HZhEwPEkG = null;
        String strWT8HZhEwPEkG2 = null;
        String strWT8HZhEwPEkG3 = null;
        String strWT8HZhEwPEkG4 = null;
        String strWT8HZhEwPEkG5 = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iCS9Klw57l26qfkpcMlfmpU = nrflsjiodcr850bqbBezslBgjveK3hODH.cS9Klw57l26qfkpcMlfmpU(serialDescriptor);
            switch (iCS9Klw57l26qfkpcMlfmpU) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str2 = (String) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 0, iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, str2);
                    i |= 1;
                    break;
                case 1:
                    str3 = (String) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 1, iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, str3);
                    i |= 2;
                    break;
                case 2:
                    uuid = (UUID) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 2, Q1EVKexo2yndu3vM8gAwRGSPg.S1zP5M3X7Ukq3ROlZ87G9I, uuid);
                    i |= 4;
                    break;
                case 3:
                    strWT8HZhEwPEkG = nrflsjiodcr850bqbBezslBgjveK3hODH.WT8HZhEwPEkG(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strWT8HZhEwPEkG2 = nrflsjiodcr850bqbBezslBgjveK3hODH.WT8HZhEwPEkG(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    strWT8HZhEwPEkG3 = nrflsjiodcr850bqbBezslBgjveK3hODH.WT8HZhEwPEkG(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    strWT8HZhEwPEkG4 = nrflsjiodcr850bqbBezslBgjveK3hODH.WT8HZhEwPEkG(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    strWT8HZhEwPEkG5 = nrflsjiodcr850bqbBezslBgjveK3hODH.WT8HZhEwPEkG(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    eUwPamJ8sGfSyqS5ucd4 euwpamj8sgfsyqs5ucd4 = (eUwPamJ8sGfSyqS5ucd4) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 8, (KSerializer) mhw63suma8isgbArr[8].getValue(), str != null ? new eUwPamJ8sGfSyqS5ucd4(str) : null);
                    str = euwpamj8sgfsyqs5ucd4 != null ? euwpamj8sgfsyqs5ucd4.S1zP5M3X7Ukq3ROlZ87G9I : null;
                    i |= 256;
                    break;
                case 9:
                    str4 = (String) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 9, iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, str4);
                    i |= 512;
                    break;
                default:
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return singularRequestContext;
            }
            singularRequestContext = null;
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new SingularRequestContext(i, str2, str3, uuid, strWT8HZhEwPEkG, strWT8HZhEwPEkG2, strWT8HZhEwPEkG3, strWT8HZhEwPEkG4, strWT8HZhEwPEkG5, str, str4);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SingularRequestContext singularRequestContext) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = SingularRequestContext.fXBtMGfTIjGSHgK542;
        String str = singularRequestContext.S1zP5M3X7Ukq3ROlZ87G9I;
        String str2 = singularRequestContext.LYcdI4xpry8eXmFC9I4wyaLdcG1z;
        if (str != null) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 0, iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, str);
        }
        String str3 = singularRequestContext.axL8FocTDLUdzg0XScbO;
        if (str3 != null) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 1, iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, str3);
        }
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 2, Q1EVKexo2yndu3vM8gAwRGSPg.S1zP5M3X7Ukq3ROlZ87G9I, singularRequestContext.BezslBgjveK3hODH);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Rdzg08aYlt0UsoLUNug9cESzgAY9R(serialDescriptor, 3, singularRequestContext.ziNFA7KzVfc6);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Rdzg08aYlt0UsoLUNug9cESzgAY9R(serialDescriptor, 4, singularRequestContext.Aboow6rUrcY2SrFRa46C6uy);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Rdzg08aYlt0UsoLUNug9cESzgAY9R(serialDescriptor, 5, singularRequestContext.ox9eclwMpRd);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Rdzg08aYlt0UsoLUNug9cESzgAY9R(serialDescriptor, 6, singularRequestContext.PQQPeCDD0JLCT3aLz);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Rdzg08aYlt0UsoLUNug9cESzgAY9R(serialDescriptor, 7, singularRequestContext.JY5knQmh7EQJEZ);
        if (str2 != null) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 8, (KSerializer) mhw63suma8isgbArr[8].getValue(), new eUwPamJ8sGfSyqS5ucd4(str2));
        }
        String str4 = singularRequestContext.flPMk2Ix9h3b95v;
        if (str4 != null) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 9, iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, str4);
        }
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
