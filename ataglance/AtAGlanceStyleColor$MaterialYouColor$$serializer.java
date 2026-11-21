package bitpit.launcher.ataglance;

import b.M5ZW8ThjzDgV;
import b.QJmLMy74NwphhvC;
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
public final /* synthetic */ class AtAGlanceStyleColor$MaterialYouColor$$serializer implements qJbD6jRb3f7 {
    public static final int $stable;
    public static final AtAGlanceStyleColor$MaterialYouColor$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AtAGlanceStyleColor$MaterialYouColor$$serializer atAGlanceStyleColor$MaterialYouColor$$serializer = new AtAGlanceStyleColor$MaterialYouColor$$serializer();
        INSTANCE = atAGlanceStyleColor$MaterialYouColor$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("theme", atAGlanceStyleColor$MaterialYouColor$$serializer, 1);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("swatch", false);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
        $stable = 8;
    }

    private AtAGlanceStyleColor$MaterialYouColor$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AtAGlanceStyleColor$MaterialYouColor.BezslBgjveK3hODH[0].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final AtAGlanceStyleColor$MaterialYouColor deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = AtAGlanceStyleColor$MaterialYouColor.BezslBgjveK3hODH;
        boolean z = true;
        int i = 0;
        AtAGlanceStyleColor$MaterialYouColor.Swatch swatch = null;
        while (z) {
            int iCS9Klw57l26qfkpcMlfmpU = nrflsjiodcr850bqbBezslBgjveK3hODH.cS9Klw57l26qfkpcMlfmpU(serialDescriptor);
            if (iCS9Klw57l26qfkpcMlfmpU == -1) {
                z = false;
            } else {
                if (iCS9Klw57l26qfkpcMlfmpU != 0) {
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return null;
                }
                swatch = (AtAGlanceStyleColor$MaterialYouColor.Swatch) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 0, (KSerializer) mhw63suma8isgbArr[0].getValue(), swatch);
                i = 1;
            }
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new AtAGlanceStyleColor$MaterialYouColor(i, swatch);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, AtAGlanceStyleColor$MaterialYouColor atAGlanceStyleColor$MaterialYouColor) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 0, (KSerializer) AtAGlanceStyleColor$MaterialYouColor.BezslBgjveK3hODH[0].getValue(), atAGlanceStyleColor$MaterialYouColor.axL8FocTDLUdzg0XScbO);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
