package bitpit.launcher.theming.sharing;

import b.M5ZW8ThjzDgV;
import b.QJmLMy74NwphhvC;
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
public final /* synthetic */ class SharedTheme$Wallpaper$File$$serializer implements qJbD6jRb3f7 {
    public static final int $stable;
    public static final SharedTheme$Wallpaper$File$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SharedTheme$Wallpaper$File$$serializer sharedTheme$Wallpaper$File$$serializer = new SharedTheme$Wallpaper$File$$serializer();
        INSTANCE = sharedTheme$Wallpaper$File$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("file", sharedTheme$Wallpaper$File$$serializer, 1);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("data", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.H5sQ15nhYoaKKHhx(new NniqwgLR9Jo6Bl9Px0S5u());
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
        $stable = 8;
    }

    private SharedTheme$Wallpaper$File$$serializer() {
    }

    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{uYXuC099wzwCxl9PGqEP.BezslBgjveK3hODH};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SharedTheme$Wallpaper$File deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        boolean z = true;
        int i = 0;
        byte[] bArr = null;
        while (z) {
            int iCS9Klw57l26qfkpcMlfmpU = nrflsjiodcr850bqbBezslBgjveK3hODH.cS9Klw57l26qfkpcMlfmpU(serialDescriptor);
            if (iCS9Klw57l26qfkpcMlfmpU == -1) {
                z = false;
            } else {
                if (iCS9Klw57l26qfkpcMlfmpU != 0) {
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return null;
                }
                bArr = (byte[]) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 0, uYXuC099wzwCxl9PGqEP.BezslBgjveK3hODH, bArr);
                i = 1;
            }
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new SharedTheme$Wallpaper$File(i, bArr);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SharedTheme$Wallpaper$File sharedTheme$Wallpaper$File) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 0, uYXuC099wzwCxl9PGqEP.BezslBgjveK3hODH, sharedTheme$Wallpaper$File.S1zP5M3X7Ukq3ROlZ87G9I);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
