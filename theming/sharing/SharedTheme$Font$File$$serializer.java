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
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
@QJmLMy74NwphhvC
public final /* synthetic */ class SharedTheme$Font$File$$serializer implements qJbD6jRb3f7 {
    public static final int $stable;
    public static final SharedTheme$Font$File$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SharedTheme$Font$File$$serializer sharedTheme$Font$File$$serializer = new SharedTheme$Font$File$$serializer();
        INSTANCE = sharedTheme$Font$File$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("file", sharedTheme$Font$File$$serializer, 3);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("name", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("data", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.H5sQ15nhYoaKKHhx(new NniqwgLR9Jo6Bl9Px0S5u());
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("hybrid", false);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
        $stable = 8;
    }

    private SharedTheme$Font$File$$serializer() {
    }

    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, uYXuC099wzwCxl9PGqEP.BezslBgjveK3hODH, AW4TehX5U1XIZthtc6OLhL.S1zP5M3X7Ukq3ROlZ87G9I};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SharedTheme$Font$File deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zQl6q60SSx3 = false;
        String strWT8HZhEwPEkG = null;
        byte[] bArr = null;
        while (z) {
            int iCS9Klw57l26qfkpcMlfmpU = nrflsjiodcr850bqbBezslBgjveK3hODH.cS9Klw57l26qfkpcMlfmpU(serialDescriptor);
            if (iCS9Klw57l26qfkpcMlfmpU == -1) {
                z = false;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 0) {
                strWT8HZhEwPEkG = nrflsjiodcr850bqbBezslBgjveK3hODH.WT8HZhEwPEkG(serialDescriptor, 0);
                i |= 1;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 1) {
                bArr = (byte[]) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 1, uYXuC099wzwCxl9PGqEP.BezslBgjveK3hODH, bArr);
                i |= 2;
            } else {
                if (iCS9Klw57l26qfkpcMlfmpU != 2) {
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return null;
                }
                zQl6q60SSx3 = nrflsjiodcr850bqbBezslBgjveK3hODH.Ql6q60SSx3(serialDescriptor, 2);
                i |= 4;
            }
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new SharedTheme$Font$File(i, strWT8HZhEwPEkG, bArr, zQl6q60SSx3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SharedTheme$Font$File sharedTheme$Font$File) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Rdzg08aYlt0UsoLUNug9cESzgAY9R(serialDescriptor, 0, sharedTheme$Font$File.S1zP5M3X7Ukq3ROlZ87G9I);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 1, uYXuC099wzwCxl9PGqEP.BezslBgjveK3hODH, sharedTheme$Font$File.axL8FocTDLUdzg0XScbO);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 2, sharedTheme$Font$File.BezslBgjveK3hODH);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
