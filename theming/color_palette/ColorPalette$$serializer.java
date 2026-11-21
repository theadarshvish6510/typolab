package bitpit.launcher.theming.color_palette;

import b.Gl8Ehe3l199fwoU53BVAGLsBEcSU;
import b.M5ZW8ThjzDgV;
import b.QJmLMy74NwphhvC;
import b.mHW63SUma8isGb;
import b.nelx5QXMyOjGbNm0aVhnj4x8qWdi;
import b.nrFLsJiodCR850bQB;
import b.o76yCzyy4hCTs9LzjVpiAs;
import b.qJbD6jRb3f7;
import b.rXX7u5bn2nCB6ANmnDyddVU4zbm;
import bitpit.launcher.theming.CustomMaterialYouColorFamily;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
@QJmLMy74NwphhvC
public final /* synthetic */ class ColorPalette$$serializer implements qJbD6jRb3f7 {
    public static final int $stable;
    public static final ColorPalette$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ColorPalette$$serializer colorPalette$$serializer = new ColorPalette$$serializer();
        INSTANCE = colorPalette$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("bitpit.launcher.theming.color_palette.ColorPalette", colorPalette$$serializer, 4);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("primary", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("onPrimary", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("primaryLargeSurface", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("customMaterialYouColorFamily", false);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
        $stable = 8;
    }

    private ColorPalette$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        mHW63SUma8isGb[] mhw63suma8isgbArr = ColorPalette.Aboow6rUrcY2SrFRa46C6uy;
        Gl8Ehe3l199fwoU53BVAGLsBEcSU gl8Ehe3l199fwoU53BVAGLsBEcSU = Gl8Ehe3l199fwoU53BVAGLsBEcSU.S1zP5M3X7Ukq3ROlZ87G9I;
        return new KSerializer[]{gl8Ehe3l199fwoU53BVAGLsBEcSU, gl8Ehe3l199fwoU53BVAGLsBEcSU, gl8Ehe3l199fwoU53BVAGLsBEcSU, mhw63suma8isgbArr[3].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ColorPalette deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = ColorPalette.Aboow6rUrcY2SrFRa46C6uy;
        boolean z = true;
        int i = 0;
        int iFlPMk2Ix9h3b95v = 0;
        int iFlPMk2Ix9h3b95v2 = 0;
        int iFlPMk2Ix9h3b95v3 = 0;
        CustomMaterialYouColorFamily customMaterialYouColorFamily = null;
        while (z) {
            int iCS9Klw57l26qfkpcMlfmpU = nrflsjiodcr850bqbBezslBgjveK3hODH.cS9Klw57l26qfkpcMlfmpU(serialDescriptor);
            if (iCS9Klw57l26qfkpcMlfmpU == -1) {
                z = false;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 0) {
                iFlPMk2Ix9h3b95v = nrflsjiodcr850bqbBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 0);
                i |= 1;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 1) {
                iFlPMk2Ix9h3b95v2 = nrflsjiodcr850bqbBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 1);
                i |= 2;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 2) {
                iFlPMk2Ix9h3b95v3 = nrflsjiodcr850bqbBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 2);
                i |= 4;
            } else {
                if (iCS9Klw57l26qfkpcMlfmpU != 3) {
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return null;
                }
                customMaterialYouColorFamily = (CustomMaterialYouColorFamily) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 3, (KSerializer) mhw63suma8isgbArr[3].getValue(), customMaterialYouColorFamily);
                i |= 8;
            }
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new ColorPalette(i, iFlPMk2Ix9h3b95v, iFlPMk2Ix9h3b95v2, iFlPMk2Ix9h3b95v3, customMaterialYouColorFamily);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ColorPalette colorPalette) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = ColorPalette.Aboow6rUrcY2SrFRa46C6uy;
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Ql6q60SSx3(0, colorPalette.S1zP5M3X7Ukq3ROlZ87G9I, serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Ql6q60SSx3(1, colorPalette.axL8FocTDLUdzg0XScbO, serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Ql6q60SSx3(2, colorPalette.BezslBgjveK3hODH, serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 3, (KSerializer) mhw63suma8isgbArr[3].getValue(), colorPalette.ziNFA7KzVfc6);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
