package bitpit.launcher.ataglance;

import b.AW4TehX5U1XIZthtc6OLhL;
import b.Gl8Ehe3l199fwoU53BVAGLsBEcSU;
import b.M5ZW8ThjzDgV;
import b.QJmLMy74NwphhvC;
import b.iFFK8uDMEVqVo;
import b.mHW63SUma8isGb;
import b.nelx5QXMyOjGbNm0aVhnj4x8qWdi;
import b.nrFLsJiodCR850bQB;
import b.o76yCzyy4hCTs9LzjVpiAs;
import b.qJbD6jRb3f7;
import b.rXX7u5bn2nCB6ANmnDyddVU4zbm;
import b.vSNKvya7RsAhuSv;
import b.zdV2BnlTiQeQ;
import bitpit.launcher.ataglance.clock.HorizontalClockAlignment;
import bitpit.launcher.text.RemoteFont;
import bitpit.launcher.text.RemoteFont$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
@QJmLMy74NwphhvC
public final /* synthetic */ class OverlapClockStyle$Serialized$$serializer implements qJbD6jRb3f7 {
    public static final int $stable;
    public static final OverlapClockStyle$Serialized$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        OverlapClockStyle$Serialized$$serializer overlapClockStyle$Serialized$$serializer = new OverlapClockStyle$Serialized$$serializer();
        INSTANCE = overlapClockStyle$Serialized$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("overlap_clock", overlapClockStyle$Serialized$$serializer, 11);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("uuid", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("info", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("clock_font", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("clock_text_size", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("horizontal_alignment", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("overlap_cutout_size", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("character_overlap_percentage", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("primary_color", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("secondary_color", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("show_colon", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("divider_overlap_percentage", true);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
        $stable = 8;
    }

    private OverlapClockStyle$Serialized$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        mHW63SUma8isGb[] mhw63suma8isgbArr = OverlapClockStyle$Serialized.ToEIy0qfkltfGfO3vmAQG;
        Gl8Ehe3l199fwoU53BVAGLsBEcSU gl8Ehe3l199fwoU53BVAGLsBEcSU = Gl8Ehe3l199fwoU53BVAGLsBEcSU.S1zP5M3X7Ukq3ROlZ87G9I;
        vSNKvya7RsAhuSv vsnkvya7rsahusv = vSNKvya7RsAhuSv.S1zP5M3X7Ukq3ROlZ87G9I;
        return new KSerializer[]{iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, AtAGlanceInfo$$serializer.INSTANCE, RemoteFont$$serializer.INSTANCE, gl8Ehe3l199fwoU53BVAGLsBEcSU, mhw63suma8isgbArr[4].getValue(), gl8Ehe3l199fwoU53BVAGLsBEcSU, vsnkvya7rsahusv, zdV2BnlTiQeQ.ziNFA7KzVfc6((KSerializer) mhw63suma8isgbArr[7].getValue()), zdV2BnlTiQeQ.ziNFA7KzVfc6((KSerializer) mhw63suma8isgbArr[8].getValue()), AW4TehX5U1XIZthtc6OLhL.S1zP5M3X7Ukq3ROlZ87G9I, vsnkvya7rsahusv};
    }

    @Override // kotlinx.serialization.KSerializer
    public final OverlapClockStyle$Serialized deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = OverlapClockStyle$Serialized.ToEIy0qfkltfGfO3vmAQG;
        float fSCPtafveBAhdLIs2ajN3WV = 0.0f;
        float fSCPtafveBAhdLIs2ajN3WV2 = 0.0f;
        qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz8 = null;
        boolean z = true;
        qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz9 = null;
        int i = 0;
        String strWT8HZhEwPEkG = null;
        AtAGlanceInfo atAGlanceInfo = null;
        RemoteFont remoteFont = null;
        int iFlPMk2Ix9h3b95v = 0;
        HorizontalClockAlignment horizontalClockAlignment = null;
        int iFlPMk2Ix9h3b95v2 = 0;
        boolean zQl6q60SSx3 = false;
        while (z) {
            int iCS9Klw57l26qfkpcMlfmpU = nrflsjiodcr850bqbBezslBgjveK3hODH.cS9Klw57l26qfkpcMlfmpU(serialDescriptor);
            switch (iCS9Klw57l26qfkpcMlfmpU) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strWT8HZhEwPEkG = nrflsjiodcr850bqbBezslBgjveK3hODH.WT8HZhEwPEkG(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    atAGlanceInfo = (AtAGlanceInfo) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 1, AtAGlanceInfo$$serializer.INSTANCE, atAGlanceInfo);
                    i |= 2;
                    break;
                case 2:
                    remoteFont = (RemoteFont) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 2, RemoteFont$$serializer.INSTANCE, remoteFont);
                    i |= 4;
                    break;
                case 3:
                    iFlPMk2Ix9h3b95v = nrflsjiodcr850bqbBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    horizontalClockAlignment = (HorizontalClockAlignment) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 4, (KSerializer) mhw63suma8isgbArr[4].getValue(), horizontalClockAlignment);
                    i |= 16;
                    break;
                case 5:
                    iFlPMk2Ix9h3b95v2 = nrflsjiodcr850bqbBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    fSCPtafveBAhdLIs2ajN3WV = nrflsjiodcr850bqbBezslBgjveK3hODH.sCPtafveBAhdLIs2ajN3WV(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    qstjuxvi0yplnkz9 = (qsTJuxvI0Yplnkz8) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 7, (KSerializer) mhw63suma8isgbArr[7].getValue(), qstjuxvi0yplnkz9);
                    i |= 128;
                    break;
                case 8:
                    qstjuxvi0yplnkz8 = (qsTJuxvI0Yplnkz8) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 8, (KSerializer) mhw63suma8isgbArr[8].getValue(), qstjuxvi0yplnkz8);
                    i |= 256;
                    break;
                case 9:
                    zQl6q60SSx3 = nrflsjiodcr850bqbBezslBgjveK3hODH.Ql6q60SSx3(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    fSCPtafveBAhdLIs2ajN3WV2 = nrflsjiodcr850bqbBezslBgjveK3hODH.sCPtafveBAhdLIs2ajN3WV(serialDescriptor, 10);
                    i |= 1024;
                    break;
                default:
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return null;
            }
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new OverlapClockStyle$Serialized(i, strWT8HZhEwPEkG, atAGlanceInfo, remoteFont, iFlPMk2Ix9h3b95v, horizontalClockAlignment, iFlPMk2Ix9h3b95v2, fSCPtafveBAhdLIs2ajN3WV, qstjuxvi0yplnkz9, qstjuxvi0yplnkz8, zQl6q60SSx3, fSCPtafveBAhdLIs2ajN3WV2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, OverlapClockStyle$Serialized overlapClockStyle$Serialized) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = OverlapClockStyle$Serialized.ToEIy0qfkltfGfO3vmAQG;
        String str = overlapClockStyle$Serialized.S1zP5M3X7Ukq3ROlZ87G9I;
        float f = overlapClockStyle$Serialized.fXBtMGfTIjGSHgK542;
        boolean z = overlapClockStyle$Serialized.flPMk2Ix9h3b95v;
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Rdzg08aYlt0UsoLUNug9cESzgAY9R(serialDescriptor, 0, str);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 1, AtAGlanceInfo$$serializer.INSTANCE, overlapClockStyle$Serialized.axL8FocTDLUdzg0XScbO);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 2, RemoteFont$$serializer.INSTANCE, overlapClockStyle$Serialized.BezslBgjveK3hODH);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Ql6q60SSx3(3, overlapClockStyle$Serialized.ziNFA7KzVfc6, serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 4, (KSerializer) mhw63suma8isgbArr[4].getValue(), overlapClockStyle$Serialized.Aboow6rUrcY2SrFRa46C6uy);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Ql6q60SSx3(5, overlapClockStyle$Serialized.ox9eclwMpRd, serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.HveD9n1tOYlffjJDxghBitYNgB(serialDescriptor, 6, overlapClockStyle$Serialized.PQQPeCDD0JLCT3aLz);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 7, (KSerializer) mhw63suma8isgbArr[7].getValue(), overlapClockStyle$Serialized.JY5knQmh7EQJEZ);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 8, (KSerializer) mhw63suma8isgbArr[8].getValue(), overlapClockStyle$Serialized.LYcdI4xpry8eXmFC9I4wyaLdcG1z);
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || !z) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 9, z);
        }
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || Float.compare(f, 0.0f) != 0) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.HveD9n1tOYlffjJDxghBitYNgB(serialDescriptor, 10, f);
        }
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
