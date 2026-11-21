package bitpit.launcher.theming.sharing;

import b.AW4TehX5U1XIZthtc6OLhL;
import b.M5ZW8ThjzDgV;
import b.QJmLMy74NwphhvC;
import b.iFFK8uDMEVqVo;
import b.nelx5QXMyOjGbNm0aVhnj4x8qWdi;
import b.nrFLsJiodCR850bQB;
import b.o76yCzyy4hCTs9LzjVpiAs;
import b.qJbD6jRb3f7;
import b.rXX7u5bn2nCB6ANmnDyddVU4zbm;
import b.uYXuC099wzwCxl9PGqEP;
import b.zdV2BnlTiQeQ;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
@QJmLMy74NwphhvC
public final /* synthetic */ class FontSurrogate$$serializer implements qJbD6jRb3f7 {
    public static final int $stable;
    public static final FontSurrogate$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FontSurrogate$$serializer fontSurrogate$$serializer = new FontSurrogate$$serializer();
        INSTANCE = fontSurrogate$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("bitpit.launcher.theming.sharing.FontSurrogate", fontSurrogate$$serializer, 5);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("type", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("id", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("name", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("hybrid", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("data", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.H5sQ15nhYoaKKHhx(new MZ7LjLQoPezKOI1snCeqYdrQAIRLF());
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
        $stable = 8;
    }

    private FontSurrogate$$serializer() {
    }

    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        iFFK8uDMEVqVo iffk8udmevqvo = iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I;
        return new KSerializer[]{iffk8udmevqvo, zdV2BnlTiQeQ.ziNFA7KzVfc6(iffk8udmevqvo), zdV2BnlTiQeQ.ziNFA7KzVfc6(iffk8udmevqvo), zdV2BnlTiQeQ.ziNFA7KzVfc6(AW4TehX5U1XIZthtc6OLhL.S1zP5M3X7Ukq3ROlZ87G9I), zdV2BnlTiQeQ.ziNFA7KzVfc6(uYXuC099wzwCxl9PGqEP.BezslBgjveK3hODH)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final FontSurrogate deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strWT8HZhEwPEkG = null;
        String str = null;
        String str2 = null;
        Boolean bool = null;
        byte[] bArr = null;
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
                str2 = (String) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 2, iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, str2);
                i |= 4;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 3) {
                bool = (Boolean) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 3, AW4TehX5U1XIZthtc6OLhL.S1zP5M3X7Ukq3ROlZ87G9I, bool);
                i |= 8;
            } else {
                if (iCS9Klw57l26qfkpcMlfmpU != 4) {
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return null;
                }
                bArr = (byte[]) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 4, uYXuC099wzwCxl9PGqEP.BezslBgjveK3hODH, bArr);
                i |= 16;
            }
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new FontSurrogate(i, strWT8HZhEwPEkG, str, str2, bool, bArr);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, FontSurrogate fontSurrogate) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        String str = fontSurrogate.S1zP5M3X7Ukq3ROlZ87G9I;
        byte[] bArr = fontSurrogate.Aboow6rUrcY2SrFRa46C6uy;
        Boolean bool = fontSurrogate.ziNFA7KzVfc6;
        String str2 = fontSurrogate.BezslBgjveK3hODH;
        String str3 = fontSurrogate.axL8FocTDLUdzg0XScbO;
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Rdzg08aYlt0UsoLUNug9cESzgAY9R(serialDescriptor, 0, str);
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || str3 != null) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 1, iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, str3);
        }
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || str2 != null) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 2, iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, str2);
        }
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || bool != null) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 3, AW4TehX5U1XIZthtc6OLhL.S1zP5M3X7Ukq3ROlZ87G9I, bool);
        }
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || bArr != null) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 4, uYXuC099wzwCxl9PGqEP.BezslBgjveK3hODH, bArr);
        }
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
