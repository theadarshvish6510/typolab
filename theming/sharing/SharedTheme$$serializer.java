package bitpit.launcher.theming.sharing;

import b.CPoyWHoBAtUivR1jL;
import b.DY7rAMiwL4GxJalIAuGPP4NEMDd;
import b.GcGct2MUjTurFIWwZyToV;
import b.Gl8Ehe3l199fwoU53BVAGLsBEcSU;
import b.M5ZW8ThjzDgV;
import b.QJmLMy74NwphhvC;
import b.cBRnqJka9zlgT;
import b.iFFK8uDMEVqVo;
import b.lcIUX9fjr221Pd;
import b.mHW63SUma8isGb;
import b.nXCqkIgElhEtQLnIIyiqEb64Wlgp;
import b.nelx5QXMyOjGbNm0aVhnj4x8qWdi;
import b.nrFLsJiodCR850bQB;
import b.o76yCzyy4hCTs9LzjVpiAs;
import b.qJbD6jRb3f7;
import b.rXX7u5bn2nCB6ANmnDyddVU4zbm;
import b.ttvfpMMiEF2T4RElgYAPdt;
import b.vtyPIVYEkYFjJFqO2HO;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
@QJmLMy74NwphhvC
public final /* synthetic */ class SharedTheme$$serializer implements qJbD6jRb3f7 {
    public static final int $stable;
    public static final SharedTheme$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SharedTheme$$serializer sharedTheme$$serializer = new SharedTheme$$serializer();
        INSTANCE = sharedTheme$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("bitpit.launcher.theming.sharing.SharedTheme", sharedTheme$$serializer, 11);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("app_version", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("created_at", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("file_id", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("id", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("wallpaper", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("icon", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("font", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("color", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("text_color", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("ataglance", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("padding", false);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
        $stable = 8;
    }

    private SharedTheme$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        mHW63SUma8isGb[] mhw63suma8isgbArr = SharedTheme.ToEIy0qfkltfGfO3vmAQG;
        iFFK8uDMEVqVo iffk8udmevqvo = iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I;
        return new KSerializer[]{Gl8Ehe3l199fwoU53BVAGLsBEcSU.S1zP5M3X7Ukq3ROlZ87G9I, DY7rAMiwL4GxJalIAuGPP4NEMDd.S1zP5M3X7Ukq3ROlZ87G9I, iffk8udmevqvo, iffk8udmevqvo, an8pzSbYdrDVxAbzCvur.S1zP5M3X7Ukq3ROlZ87G9I, QYmREUxnplxOJLNn98BDpc019O.S1zP5M3X7Ukq3ROlZ87G9I, qsTJuxvI0Yplnkz8.S1zP5M3X7Ukq3ROlZ87G9I, SharedTheme$RgbHexString$$serializer.INSTANCE, mhw63suma8isgbArr[8].getValue(), SharedTheme$AtAGlanceStyleId$$serializer.INSTANCE, SharedTheme$TopPadding$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SharedTheme deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = SharedTheme.ToEIy0qfkltfGfO3vmAQG;
        long jPQQPeCDD0JLCT3aLz = 0;
        boolean z = true;
        ttvfpMMiEF2T4RElgYAPdt ttvfpmmief2t4relgyapdt = null;
        CPoyWHoBAtUivR1jL cPoyWHoBAtUivR1jL = null;
        cBRnqJka9zlgT cbrnqjka9zlgt = null;
        int i = 0;
        String str = null;
        vtyPIVYEkYFjJFqO2HO vtypivyekyfjjfqo2ho = null;
        String str2 = null;
        nXCqkIgElhEtQLnIIyiqEb64Wlgp nxcqkigelhetqlniiyiqeb64wlgp = null;
        int iFlPMk2Ix9h3b95v = 0;
        String strWT8HZhEwPEkG = null;
        String strWT8HZhEwPEkG2 = null;
        while (z) {
            int iCS9Klw57l26qfkpcMlfmpU = nrflsjiodcr850bqbBezslBgjveK3hODH.cS9Klw57l26qfkpcMlfmpU(serialDescriptor);
            switch (iCS9Klw57l26qfkpcMlfmpU) {
                case -1:
                    z = false;
                    break;
                case 0:
                    iFlPMk2Ix9h3b95v = nrflsjiodcr850bqbBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    jPQQPeCDD0JLCT3aLz = nrflsjiodcr850bqbBezslBgjveK3hODH.PQQPeCDD0JLCT3aLz(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    strWT8HZhEwPEkG = nrflsjiodcr850bqbBezslBgjveK3hODH.WT8HZhEwPEkG(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    strWT8HZhEwPEkG2 = nrflsjiodcr850bqbBezslBgjveK3hODH.WT8HZhEwPEkG(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    nxcqkigelhetqlniiyiqeb64wlgp = (nXCqkIgElhEtQLnIIyiqEb64Wlgp) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 4, an8pzSbYdrDVxAbzCvur.S1zP5M3X7Ukq3ROlZ87G9I, nxcqkigelhetqlniiyiqeb64wlgp);
                    i |= 16;
                    break;
                case 5:
                    ttvfpmmief2t4relgyapdt = (ttvfpMMiEF2T4RElgYAPdt) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 5, QYmREUxnplxOJLNn98BDpc019O.S1zP5M3X7Ukq3ROlZ87G9I, ttvfpmmief2t4relgyapdt);
                    i |= 32;
                    break;
                case 6:
                    cbrnqjka9zlgt = (cBRnqJka9zlgT) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 6, qsTJuxvI0Yplnkz8.S1zP5M3X7Ukq3ROlZ87G9I, cbrnqjka9zlgt);
                    i |= 64;
                    break;
                case 7:
                    GcGct2MUjTurFIWwZyToV gcGct2MUjTurFIWwZyToV = (GcGct2MUjTurFIWwZyToV) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 7, SharedTheme$RgbHexString$$serializer.INSTANCE, str != null ? new GcGct2MUjTurFIWwZyToV(str) : null);
                    str = gcGct2MUjTurFIWwZyToV != null ? gcGct2MUjTurFIWwZyToV.S1zP5M3X7Ukq3ROlZ87G9I : null;
                    i |= 128;
                    break;
                case 8:
                    vtypivyekyfjjfqo2ho = (vtyPIVYEkYFjJFqO2HO) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 8, (KSerializer) mhw63suma8isgbArr[8].getValue(), vtypivyekyfjjfqo2ho);
                    i |= 256;
                    break;
                case 9:
                    lcIUX9fjr221Pd lciux9fjr221pd = (lcIUX9fjr221Pd) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 9, SharedTheme$AtAGlanceStyleId$$serializer.INSTANCE, str2 != null ? new lcIUX9fjr221Pd(str2) : null);
                    str2 = lciux9fjr221pd != null ? lciux9fjr221pd.S1zP5M3X7Ukq3ROlZ87G9I : null;
                    i |= 512;
                    break;
                case 10:
                    cPoyWHoBAtUivR1jL = (CPoyWHoBAtUivR1jL) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 10, SharedTheme$TopPadding$$serializer.INSTANCE, cPoyWHoBAtUivR1jL);
                    i |= 1024;
                    break;
                default:
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return null;
            }
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new SharedTheme(i, iFlPMk2Ix9h3b95v, jPQQPeCDD0JLCT3aLz, strWT8HZhEwPEkG, strWT8HZhEwPEkG2, nxcqkigelhetqlniiyiqeb64wlgp, ttvfpmmief2t4relgyapdt, cbrnqjka9zlgt, str, vtypivyekyfjjfqo2ho, str2, cPoyWHoBAtUivR1jL);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SharedTheme sharedTheme) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = SharedTheme.ToEIy0qfkltfGfO3vmAQG;
        int i = sharedTheme.S1zP5M3X7Ukq3ROlZ87G9I;
        vtyPIVYEkYFjJFqO2HO vtypivyekyfjjfqo2ho = sharedTheme.LYcdI4xpry8eXmFC9I4wyaLdcG1z;
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Ql6q60SSx3(0, i, serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.J1BE9tYH1em4X1uAhc6L7f4M(serialDescriptor, 1, sharedTheme.axL8FocTDLUdzg0XScbO);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Rdzg08aYlt0UsoLUNug9cESzgAY9R(serialDescriptor, 2, sharedTheme.BezslBgjveK3hODH);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Rdzg08aYlt0UsoLUNug9cESzgAY9R(serialDescriptor, 3, sharedTheme.ziNFA7KzVfc6);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 4, an8pzSbYdrDVxAbzCvur.S1zP5M3X7Ukq3ROlZ87G9I, sharedTheme.Aboow6rUrcY2SrFRa46C6uy);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 5, QYmREUxnplxOJLNn98BDpc019O.S1zP5M3X7Ukq3ROlZ87G9I, sharedTheme.ox9eclwMpRd);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 6, qsTJuxvI0Yplnkz8.S1zP5M3X7Ukq3ROlZ87G9I, sharedTheme.PQQPeCDD0JLCT3aLz);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 7, SharedTheme$RgbHexString$$serializer.INSTANCE, new GcGct2MUjTurFIWwZyToV(sharedTheme.JY5knQmh7EQJEZ));
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || vtypivyekyfjjfqo2ho != vtyPIVYEkYFjJFqO2HO.Rdzg08aYlt0UsoLUNug9cESzgAY9R) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 8, (KSerializer) mhw63suma8isgbArr[8].getValue(), vtypivyekyfjjfqo2ho);
        }
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 9, SharedTheme$AtAGlanceStyleId$$serializer.INSTANCE, new lcIUX9fjr221Pd(sharedTheme.flPMk2Ix9h3b95v));
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 10, SharedTheme$TopPadding$$serializer.INSTANCE, new CPoyWHoBAtUivR1jL(sharedTheme.fXBtMGfTIjGSHgK542));
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
