package bitpit.launcher.themes;

import b.AW4TehX5U1XIZthtc6OLhL;
import b.M5ZW8ThjzDgV;
import b.QJmLMy74NwphhvC;
import b.TYcC5PUX0l9;
import b.iFFK8uDMEVqVo;
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
public final /* synthetic */ class PredefinedThemeWallpaper$$serializer implements qJbD6jRb3f7 {
    public static final int $stable;
    public static final PredefinedThemeWallpaper$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PredefinedThemeWallpaper$$serializer predefinedThemeWallpaper$$serializer = new PredefinedThemeWallpaper$$serializer();
        INSTANCE = predefinedThemeWallpaper$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("bitpit.launcher.themes.PredefinedThemeWallpaper", predefinedThemeWallpaper$$serializer, 5);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("id", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("path", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("thumb", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("artistInformation", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("isHidden", true);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
        $stable = 8;
    }

    private PredefinedThemeWallpaper$$serializer() {
    }

    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerZiNFA7KzVfc6 = zdV2BnlTiQeQ.ziNFA7KzVfc6(ArtistInformation$$serializer.INSTANCE);
        iFFK8uDMEVqVo iffk8udmevqvo = iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I;
        return new KSerializer[]{iffk8udmevqvo, iffk8udmevqvo, iffk8udmevqvo, kSerializerZiNFA7KzVfc6, AW4TehX5U1XIZthtc6OLhL.S1zP5M3X7Ukq3ROlZ87G9I};
    }

    @Override // kotlinx.serialization.KSerializer
    public final PredefinedThemeWallpaper deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zQl6q60SSx3 = false;
        String strWT8HZhEwPEkG = null;
        String strWT8HZhEwPEkG2 = null;
        String strWT8HZhEwPEkG3 = null;
        ArtistInformation artistInformation = null;
        while (z) {
            int iCS9Klw57l26qfkpcMlfmpU = nrflsjiodcr850bqbBezslBgjveK3hODH.cS9Klw57l26qfkpcMlfmpU(serialDescriptor);
            if (iCS9Klw57l26qfkpcMlfmpU == -1) {
                z = false;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 0) {
                strWT8HZhEwPEkG = nrflsjiodcr850bqbBezslBgjveK3hODH.WT8HZhEwPEkG(serialDescriptor, 0);
                i |= 1;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 1) {
                strWT8HZhEwPEkG2 = nrflsjiodcr850bqbBezslBgjveK3hODH.WT8HZhEwPEkG(serialDescriptor, 1);
                i |= 2;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 2) {
                strWT8HZhEwPEkG3 = nrflsjiodcr850bqbBezslBgjveK3hODH.WT8HZhEwPEkG(serialDescriptor, 2);
                i |= 4;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 3) {
                artistInformation = (ArtistInformation) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 3, ArtistInformation$$serializer.INSTANCE, artistInformation);
                i |= 8;
            } else {
                if (iCS9Klw57l26qfkpcMlfmpU != 4) {
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return null;
                }
                zQl6q60SSx3 = nrflsjiodcr850bqbBezslBgjveK3hODH.Ql6q60SSx3(serialDescriptor, 4);
                i |= 16;
            }
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new PredefinedThemeWallpaper(i, strWT8HZhEwPEkG, strWT8HZhEwPEkG2, strWT8HZhEwPEkG3, artistInformation, zQl6q60SSx3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PredefinedThemeWallpaper predefinedThemeWallpaper) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        String str = predefinedThemeWallpaper.GO8WUug7ZWFCUI1zY;
        boolean z = predefinedThemeWallpaper.gsHzEVTj1SCIPR;
        ArtistInformation artistInformation = predefinedThemeWallpaper.WIXlfFpvH7glAGsUk3;
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Rdzg08aYlt0UsoLUNug9cESzgAY9R(serialDescriptor, 0, str);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Rdzg08aYlt0UsoLUNug9cESzgAY9R(serialDescriptor, 1, predefinedThemeWallpaper.Rdzg08aYlt0UsoLUNug9cESzgAY9R);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Rdzg08aYlt0UsoLUNug9cESzgAY9R(serialDescriptor, 2, predefinedThemeWallpaper.cCmbv8Tzd2QLd161ImIZUlZ8n);
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || artistInformation != null) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 3, ArtistInformation$$serializer.INSTANCE, artistInformation);
        }
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || z != TYcC5PUX0l9.HveD9n1tOYlffjJDxghBitYNgB(str, "hidden", false)) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 4, z);
        }
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
