package bitpit.launcher.themes;

import b.Gl8Ehe3l199fwoU53BVAGLsBEcSU;
import b.M5ZW8ThjzDgV;
import b.QJmLMy74NwphhvC;
import b.UHUzfrCtV0bKdPp9KPrZVY;
import b.dLBfLob8jpOy0bTgh4DyI8FXicA;
import b.mHW63SUma8isGb;
import b.nelx5QXMyOjGbNm0aVhnj4x8qWdi;
import b.nrFLsJiodCR850bQB;
import b.o76yCzyy4hCTs9LzjVpiAs;
import b.qJbD6jRb3f7;
import b.rXX7u5bn2nCB6ANmnDyddVU4zbm;
import b.tbCHMbh7VLrZiXXlBt3XbITMEmSn;
import b.vSNKvya7RsAhuSv;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
@QJmLMy74NwphhvC
public final /* synthetic */ class ThemeSettings$$serializer implements qJbD6jRb3f7 {
    public static final int $stable;
    public static final ThemeSettings$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ThemeSettings$$serializer themeSettings$$serializer = new ThemeSettings$$serializer();
        INSTANCE = themeSettings$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("bitpit.launcher.themes.ThemeSettings", themeSettings$$serializer, 5);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("top_padding_percentage", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("hide_favorites_labels", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("text_theme_mode", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("icon_size", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("icon_shape", true);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
        $stable = 8;
    }

    private ThemeSettings$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        mHW63SUma8isGb[] mhw63suma8isgbArr = ThemeSettings.ox9eclwMpRd;
        return new KSerializer[]{vSNKvya7RsAhuSv.S1zP5M3X7Ukq3ROlZ87G9I, mhw63suma8isgbArr[1].getValue(), mhw63suma8isgbArr[2].getValue(), Gl8Ehe3l199fwoU53BVAGLsBEcSU.S1zP5M3X7Ukq3ROlZ87G9I, mhw63suma8isgbArr[4].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ThemeSettings deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = ThemeSettings.ox9eclwMpRd;
        int i = 0;
        int iFlPMk2Ix9h3b95v = 0;
        float fSCPtafveBAhdLIs2ajN3WV = 0.0f;
        dLBfLob8jpOy0bTgh4DyI8FXicA dlbflob8jpoy0btgh4dyi8fxica = null;
        UHUzfrCtV0bKdPp9KPrZVY uHUzfrCtV0bKdPp9KPrZVY = null;
        tbCHMbh7VLrZiXXlBt3XbITMEmSn tbchmbh7vlrzixxlbt3xbitmemsn = null;
        boolean z = true;
        while (z) {
            int iCS9Klw57l26qfkpcMlfmpU = nrflsjiodcr850bqbBezslBgjveK3hODH.cS9Klw57l26qfkpcMlfmpU(serialDescriptor);
            if (iCS9Klw57l26qfkpcMlfmpU == -1) {
                z = false;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 0) {
                fSCPtafveBAhdLIs2ajN3WV = nrflsjiodcr850bqbBezslBgjveK3hODH.sCPtafveBAhdLIs2ajN3WV(serialDescriptor, 0);
                i |= 1;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 1) {
                dlbflob8jpoy0btgh4dyi8fxica = (dLBfLob8jpOy0bTgh4DyI8FXicA) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 1, (KSerializer) mhw63suma8isgbArr[1].getValue(), dlbflob8jpoy0btgh4dyi8fxica);
                i |= 2;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 2) {
                uHUzfrCtV0bKdPp9KPrZVY = (UHUzfrCtV0bKdPp9KPrZVY) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 2, (KSerializer) mhw63suma8isgbArr[2].getValue(), uHUzfrCtV0bKdPp9KPrZVY);
                i |= 4;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 3) {
                iFlPMk2Ix9h3b95v = nrflsjiodcr850bqbBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iCS9Klw57l26qfkpcMlfmpU != 4) {
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return null;
                }
                tbchmbh7vlrzixxlbt3xbitmemsn = (tbCHMbh7VLrZiXXlBt3XbITMEmSn) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 4, (KSerializer) mhw63suma8isgbArr[4].getValue(), tbchmbh7vlrzixxlbt3xbitmemsn);
                i |= 16;
            }
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new ThemeSettings(i, fSCPtafveBAhdLIs2ajN3WV, dlbflob8jpoy0btgh4dyi8fxica, uHUzfrCtV0bKdPp9KPrZVY, iFlPMk2Ix9h3b95v, tbchmbh7vlrzixxlbt3xbitmemsn);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ThemeSettings themeSettings) {
        tbCHMbh7VLrZiXXlBt3XbITMEmSn tbchmbh7vlrzixxlbt3xbitmemsn = themeSettings.Aboow6rUrcY2SrFRa46C6uy;
        int i = themeSettings.ziNFA7KzVfc6;
        UHUzfrCtV0bKdPp9KPrZVY uHUzfrCtV0bKdPp9KPrZVY = themeSettings.BezslBgjveK3hODH;
        dLBfLob8jpOy0bTgh4DyI8FXicA dlbflob8jpoy0btgh4dyi8fxica = themeSettings.axL8FocTDLUdzg0XScbO;
        float f = themeSettings.S1zP5M3X7Ukq3ROlZ87G9I;
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = ThemeSettings.ox9eclwMpRd;
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || Float.compare(f, 1.0f) != 0) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.HveD9n1tOYlffjJDxghBitYNgB(serialDescriptor, 0, f);
        }
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || dlbflob8jpoy0btgh4dyi8fxica != dLBfLob8jpOy0bTgh4DyI8FXicA.GO8WUug7ZWFCUI1zY) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 1, (KSerializer) mhw63suma8isgbArr[1].getValue(), dlbflob8jpoy0btgh4dyi8fxica);
        }
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || uHUzfrCtV0bKdPp9KPrZVY != UHUzfrCtV0bKdPp9KPrZVY.GO8WUug7ZWFCUI1zY) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 2, (KSerializer) mhw63suma8isgbArr[2].getValue(), uHUzfrCtV0bKdPp9KPrZVY);
        }
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || i != 100) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Ql6q60SSx3(3, i, serialDescriptor);
        }
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti()) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 4, (KSerializer) mhw63suma8isgbArr[4].getValue(), tbchmbh7vlrzixxlbt3xbitmemsn);
        } else {
            tbCHMbh7VLrZiXXlBt3XbITMEmSn.Companion.getClass();
            if (tbchmbh7vlrzixxlbt3xbitmemsn != tbCHMbh7VLrZiXXlBt3XbITMEmSn.WIXlfFpvH7glAGsUk3) {
                nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 4, (KSerializer) mhw63suma8isgbArr[4].getValue(), tbchmbh7vlrzixxlbt3xbitmemsn);
            }
        }
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
