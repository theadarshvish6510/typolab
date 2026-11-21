package bitpit.launcher.theming.wallpapers;

import b.DY7rAMiwL4GxJalIAuGPP4NEMDd;
import b.M5ZW8ThjzDgV;
import b.QJmLMy74NwphhvC;
import b.mHW63SUma8isGb;
import b.nelx5QXMyOjGbNm0aVhnj4x8qWdi;
import b.nrFLsJiodCR850bQB;
import b.o76yCzyy4hCTs9LzjVpiAs;
import b.qJbD6jRb3f7;
import b.rXX7u5bn2nCB6ANmnDyddVU4zbm;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
@QJmLMy74NwphhvC
public final /* synthetic */ class WallpaperCollectionManifest$$serializer implements qJbD6jRb3f7 {
    public static final int $stable;
    public static final WallpaperCollectionManifest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        WallpaperCollectionManifest$$serializer wallpaperCollectionManifest$$serializer = new WallpaperCollectionManifest$$serializer();
        INSTANCE = wallpaperCollectionManifest$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("bitpit.launcher.theming.wallpapers.WallpaperCollectionManifest", wallpaperCollectionManifest$$serializer, 2);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("updated", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("wallpapers", false);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
        $stable = 8;
    }

    private WallpaperCollectionManifest$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{DY7rAMiwL4GxJalIAuGPP4NEMDd.S1zP5M3X7Ukq3ROlZ87G9I, WallpaperCollectionManifest.BezslBgjveK3hODH[1].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final WallpaperCollectionManifest deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = WallpaperCollectionManifest.BezslBgjveK3hODH;
        long jPQQPeCDD0JLCT3aLz = 0;
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iCS9Klw57l26qfkpcMlfmpU = nrflsjiodcr850bqbBezslBgjveK3hODH.cS9Klw57l26qfkpcMlfmpU(serialDescriptor);
            if (iCS9Klw57l26qfkpcMlfmpU == -1) {
                z = false;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 0) {
                jPQQPeCDD0JLCT3aLz = nrflsjiodcr850bqbBezslBgjveK3hODH.PQQPeCDD0JLCT3aLz(serialDescriptor, 0);
                i |= 1;
            } else {
                if (iCS9Klw57l26qfkpcMlfmpU != 1) {
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return null;
                }
                list = (List) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 1, (KSerializer) mhw63suma8isgbArr[1].getValue(), list);
                i |= 2;
            }
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new WallpaperCollectionManifest(i, jPQQPeCDD0JLCT3aLz, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, WallpaperCollectionManifest wallpaperCollectionManifest) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = WallpaperCollectionManifest.BezslBgjveK3hODH;
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.J1BE9tYH1em4X1uAhc6L7f4M(serialDescriptor, 0, wallpaperCollectionManifest.S1zP5M3X7Ukq3ROlZ87G9I);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 1, (KSerializer) mhw63suma8isgbArr[1].getValue(), wallpaperCollectionManifest.axL8FocTDLUdzg0XScbO);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
