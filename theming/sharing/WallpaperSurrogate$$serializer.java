package bitpit.launcher.theming.sharing;

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
public final /* synthetic */ class WallpaperSurrogate$$serializer implements qJbD6jRb3f7 {
    public static final int $stable;
    public static final WallpaperSurrogate$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        WallpaperSurrogate$$serializer wallpaperSurrogate$$serializer = new WallpaperSurrogate$$serializer();
        INSTANCE = wallpaperSurrogate$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("bitpit.launcher.theming.sharing.WallpaperSurrogate", wallpaperSurrogate$$serializer, 3);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("type", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("id", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("data", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.H5sQ15nhYoaKKHhx(new MZ7LjLQoPezKOI1snCeqYdrQAIRLF());
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
        $stable = 8;
    }

    private WallpaperSurrogate$$serializer() {
    }

    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        iFFK8uDMEVqVo iffk8udmevqvo = iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I;
        return new KSerializer[]{iffk8udmevqvo, zdV2BnlTiQeQ.ziNFA7KzVfc6(iffk8udmevqvo), zdV2BnlTiQeQ.ziNFA7KzVfc6(uYXuC099wzwCxl9PGqEP.BezslBgjveK3hODH)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final WallpaperSurrogate deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strWT8HZhEwPEkG = null;
        String str = null;
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
            } else {
                if (iCS9Klw57l26qfkpcMlfmpU != 2) {
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return null;
                }
                bArr = (byte[]) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 2, uYXuC099wzwCxl9PGqEP.BezslBgjveK3hODH, bArr);
                i |= 4;
            }
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new WallpaperSurrogate(i, strWT8HZhEwPEkG, str, bArr);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, WallpaperSurrogate wallpaperSurrogate) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        String str = wallpaperSurrogate.S1zP5M3X7Ukq3ROlZ87G9I;
        byte[] bArr = wallpaperSurrogate.BezslBgjveK3hODH;
        String str2 = wallpaperSurrogate.axL8FocTDLUdzg0XScbO;
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Rdzg08aYlt0UsoLUNug9cESzgAY9R(serialDescriptor, 0, str);
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || str2 != null) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 1, iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, str2);
        }
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || bArr != null) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 2, uYXuC099wzwCxl9PGqEP.BezslBgjveK3hODH, bArr);
        }
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
