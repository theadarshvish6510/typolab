package bitpit.launcher.themes;

import b.AW4TehX5U1XIZthtc6OLhL;
import b.EblMJsgsrKqHFhQN297jSXU;
import b.M5ZW8ThjzDgV;
import b.OkhdZkC3NYLW;
import b.QJmLMy74NwphhvC;
import b.TXotOFAXyesISl;
import b.iFFK8uDMEVqVo;
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
public final /* synthetic */ class ThemeDefinition$$serializer implements qJbD6jRb3f7 {
    public static final int $stable;
    public static final ThemeDefinition$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ThemeDefinition$$serializer themeDefinition$$serializer = new ThemeDefinition$$serializer();
        INSTANCE = themeDefinition$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("bitpit.launcher.themes.ThemeDefinition", themeDefinition$$serializer, 8);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("theme_id", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("wallpaper", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("theme_color", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("anycons_config", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("at_a_glance_style_id", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("font", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("settings", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("is_free_theme", true);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
        $stable = 8;
    }

    private ThemeDefinition$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        mHW63SUma8isGb[] mhw63suma8isgbArr = ThemeDefinition.LYcdI4xpry8eXmFC9I4wyaLdcG1z;
        iFFK8uDMEVqVo iffk8udmevqvo = iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I;
        return new KSerializer[]{iffk8udmevqvo, PredefinedThemeWallpaper$$serializer.INSTANCE, iffk8udmevqvo, iffk8udmevqvo, iffk8udmevqvo, mhw63suma8isgbArr[5].getValue(), ThemeSettings$$serializer.INSTANCE, AW4TehX5U1XIZthtc6OLhL.S1zP5M3X7Ukq3ROlZ87G9I};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ThemeDefinition deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = ThemeDefinition.LYcdI4xpry8eXmFC9I4wyaLdcG1z;
        ThemeDefinition themeDefinition = null;
        boolean z = true;
        int i = 0;
        boolean zQl6q60SSx3 = false;
        String strWT8HZhEwPEkG = null;
        PredefinedThemeWallpaper predefinedThemeWallpaper = null;
        String strWT8HZhEwPEkG2 = null;
        String strWT8HZhEwPEkG3 = null;
        String strWT8HZhEwPEkG4 = null;
        EblMJsgsrKqHFhQN297jSXU eblMJsgsrKqHFhQN297jSXU = null;
        ThemeSettings themeSettings = null;
        while (z) {
            int iCS9Klw57l26qfkpcMlfmpU = nrflsjiodcr850bqbBezslBgjveK3hODH.cS9Klw57l26qfkpcMlfmpU(serialDescriptor);
            switch (iCS9Klw57l26qfkpcMlfmpU) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strWT8HZhEwPEkG = nrflsjiodcr850bqbBezslBgjveK3hODH.WT8HZhEwPEkG(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    predefinedThemeWallpaper = (PredefinedThemeWallpaper) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 1, PredefinedThemeWallpaper$$serializer.INSTANCE, predefinedThemeWallpaper);
                    i |= 2;
                    break;
                case 2:
                    strWT8HZhEwPEkG2 = nrflsjiodcr850bqbBezslBgjveK3hODH.WT8HZhEwPEkG(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strWT8HZhEwPEkG3 = nrflsjiodcr850bqbBezslBgjveK3hODH.WT8HZhEwPEkG(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    strWT8HZhEwPEkG4 = nrflsjiodcr850bqbBezslBgjveK3hODH.WT8HZhEwPEkG(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    eblMJsgsrKqHFhQN297jSXU = (EblMJsgsrKqHFhQN297jSXU) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 5, (KSerializer) mhw63suma8isgbArr[5].getValue(), eblMJsgsrKqHFhQN297jSXU);
                    i |= 32;
                    break;
                case 6:
                    themeSettings = (ThemeSettings) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 6, ThemeSettings$$serializer.INSTANCE, themeSettings);
                    i |= 64;
                    break;
                case 7:
                    zQl6q60SSx3 = nrflsjiodcr850bqbBezslBgjveK3hODH.Ql6q60SSx3(serialDescriptor, 7);
                    i |= 128;
                    continue;
                default:
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return themeDefinition;
            }
            themeDefinition = null;
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new ThemeDefinition(i, strWT8HZhEwPEkG, predefinedThemeWallpaper, strWT8HZhEwPEkG2, strWT8HZhEwPEkG3, strWT8HZhEwPEkG4, eblMJsgsrKqHFhQN297jSXU, themeSettings, zQl6q60SSx3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ThemeDefinition themeDefinition) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = ThemeDefinition.LYcdI4xpry8eXmFC9I4wyaLdcG1z;
        String str = themeDefinition.S1zP5M3X7Ukq3ROlZ87G9I;
        boolean z = themeDefinition.JY5knQmh7EQJEZ;
        ThemeSettings themeSettings = themeDefinition.PQQPeCDD0JLCT3aLz;
        EblMJsgsrKqHFhQN297jSXU eblMJsgsrKqHFhQN297jSXU = themeDefinition.ox9eclwMpRd;
        String str2 = themeDefinition.Aboow6rUrcY2SrFRa46C6uy;
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Rdzg08aYlt0UsoLUNug9cESzgAY9R(serialDescriptor, 0, str);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 1, PredefinedThemeWallpaper$$serializer.INSTANCE, themeDefinition.axL8FocTDLUdzg0XScbO);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Rdzg08aYlt0UsoLUNug9cESzgAY9R(serialDescriptor, 2, themeDefinition.BezslBgjveK3hODH);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Rdzg08aYlt0UsoLUNug9cESzgAY9R(serialDescriptor, 3, themeDefinition.ziNFA7KzVfc6);
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || !OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(str2, TXotOFAXyesISl.S1zP5M3X7Ukq3ROlZ87G9I.S1zP5M3X7Ukq3ROlZ87G9I)) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Rdzg08aYlt0UsoLUNug9cESzgAY9R(serialDescriptor, 4, str2);
        }
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || !OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(eblMJsgsrKqHFhQN297jSXU, PredefinedThemesFont$Default.INSTANCE)) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 5, (KSerializer) mhw63suma8isgbArr[5].getValue(), eblMJsgsrKqHFhQN297jSXU);
        }
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || !OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(themeSettings, new ThemeSettings(0.0f, null, 0, null, 31))) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 6, ThemeSettings$$serializer.INSTANCE, themeSettings);
        }
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || z) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 7, z);
        }
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
