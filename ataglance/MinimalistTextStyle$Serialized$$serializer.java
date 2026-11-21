package bitpit.launcher.ataglance;

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
import bitpit.launcher.text.RemoteFont;
import bitpit.launcher.text.RemoteFont$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
@QJmLMy74NwphhvC
public final /* synthetic */ class MinimalistTextStyle$Serialized$$serializer implements qJbD6jRb3f7 {
    public static final int $stable;
    public static final MinimalistTextStyle$Serialized$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MinimalistTextStyle$Serialized$$serializer minimalistTextStyle$Serialized$$serializer = new MinimalistTextStyle$Serialized$$serializer();
        INSTANCE = minimalistTextStyle$Serialized$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("minimalist_text", minimalistTextStyle$Serialized$$serializer, 13);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("uuid", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("info", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("background_text_font", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("background_text_size", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("background_text_letter_spacing", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("background_text_color", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("inner_text_font", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("inner_text_size", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("inner_text_letter_spacing", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("inner_text_segment_gap_min", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("inner_text_segment_gap_max", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("inner_text_vertical_padding", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("base_color", false);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
        $stable = 8;
    }

    private MinimalistTextStyle$Serialized$$serializer() {
    }

    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        mHW63SUma8isGb[] mhw63suma8isgbArr = MinimalistTextStyle$Serialized.HveD9n1tOYlffjJDxghBitYNgB;
        KSerializer kSerializerZiNFA7KzVfc6 = zdV2BnlTiQeQ.ziNFA7KzVfc6((KSerializer) mhw63suma8isgbArr[5].getValue());
        KSerializer kSerializerZiNFA7KzVfc7 = zdV2BnlTiQeQ.ziNFA7KzVfc6((KSerializer) mhw63suma8isgbArr[12].getValue());
        RemoteFont$$serializer remoteFont$$serializer = RemoteFont$$serializer.INSTANCE;
        Gl8Ehe3l199fwoU53BVAGLsBEcSU gl8Ehe3l199fwoU53BVAGLsBEcSU = Gl8Ehe3l199fwoU53BVAGLsBEcSU.S1zP5M3X7Ukq3ROlZ87G9I;
        vSNKvya7RsAhuSv vsnkvya7rsahusv = vSNKvya7RsAhuSv.S1zP5M3X7Ukq3ROlZ87G9I;
        return new KSerializer[]{iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, AtAGlanceInfo$$serializer.INSTANCE, remoteFont$$serializer, gl8Ehe3l199fwoU53BVAGLsBEcSU, vsnkvya7rsahusv, kSerializerZiNFA7KzVfc6, remoteFont$$serializer, gl8Ehe3l199fwoU53BVAGLsBEcSU, vsnkvya7rsahusv, gl8Ehe3l199fwoU53BVAGLsBEcSU, gl8Ehe3l199fwoU53BVAGLsBEcSU, gl8Ehe3l199fwoU53BVAGLsBEcSU, kSerializerZiNFA7KzVfc7};
    }

    @Override // kotlinx.serialization.KSerializer
    public final MinimalistTextStyle$Serialized deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = MinimalistTextStyle$Serialized.HveD9n1tOYlffjJDxghBitYNgB;
        MinimalistTextStyle$Serialized minimalistTextStyle$Serialized = null;
        qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz8 = null;
        String strWT8HZhEwPEkG = null;
        AtAGlanceInfo atAGlanceInfo = null;
        RemoteFont remoteFont = null;
        qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz9 = null;
        RemoteFont remoteFont2 = null;
        float fSCPtafveBAhdLIs2ajN3WV = 0.0f;
        float fSCPtafveBAhdLIs2ajN3WV2 = 0.0f;
        int i = 0;
        int iFlPMk2Ix9h3b95v = 0;
        int iFlPMk2Ix9h3b95v2 = 0;
        int iFlPMk2Ix9h3b95v3 = 0;
        int iFlPMk2Ix9h3b95v4 = 0;
        int iFlPMk2Ix9h3b95v5 = 0;
        boolean z = true;
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
                    fSCPtafveBAhdLIs2ajN3WV = nrflsjiodcr850bqbBezslBgjveK3hODH.sCPtafveBAhdLIs2ajN3WV(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    qstjuxvi0yplnkz9 = (qsTJuxvI0Yplnkz8) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 5, (KSerializer) mhw63suma8isgbArr[5].getValue(), qstjuxvi0yplnkz9);
                    i |= 32;
                    break;
                case 6:
                    remoteFont2 = (RemoteFont) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 6, RemoteFont$$serializer.INSTANCE, remoteFont2);
                    i |= 64;
                    break;
                case 7:
                    iFlPMk2Ix9h3b95v2 = nrflsjiodcr850bqbBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    fSCPtafveBAhdLIs2ajN3WV2 = nrflsjiodcr850bqbBezslBgjveK3hODH.sCPtafveBAhdLIs2ajN3WV(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    iFlPMk2Ix9h3b95v3 = nrflsjiodcr850bqbBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    iFlPMk2Ix9h3b95v4 = nrflsjiodcr850bqbBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 10);
                    i |= 1024;
                    break;
                case 11:
                    iFlPMk2Ix9h3b95v5 = nrflsjiodcr850bqbBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 11);
                    i |= 2048;
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    qstjuxvi0yplnkz8 = (qsTJuxvI0Yplnkz8) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 12, (KSerializer) mhw63suma8isgbArr[12].getValue(), qstjuxvi0yplnkz8);
                    i |= 4096;
                    break;
                default:
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return minimalistTextStyle$Serialized;
            }
            minimalistTextStyle$Serialized = null;
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new MinimalistTextStyle$Serialized(i, strWT8HZhEwPEkG, atAGlanceInfo, remoteFont, iFlPMk2Ix9h3b95v, fSCPtafveBAhdLIs2ajN3WV, qstjuxvi0yplnkz9, remoteFont2, iFlPMk2Ix9h3b95v2, fSCPtafveBAhdLIs2ajN3WV2, iFlPMk2Ix9h3b95v3, iFlPMk2Ix9h3b95v4, iFlPMk2Ix9h3b95v5, qstjuxvi0yplnkz8);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, MinimalistTextStyle$Serialized minimalistTextStyle$Serialized) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = MinimalistTextStyle$Serialized.HveD9n1tOYlffjJDxghBitYNgB;
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Rdzg08aYlt0UsoLUNug9cESzgAY9R(serialDescriptor, 0, minimalistTextStyle$Serialized.S1zP5M3X7Ukq3ROlZ87G9I);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 1, AtAGlanceInfo$$serializer.INSTANCE, minimalistTextStyle$Serialized.axL8FocTDLUdzg0XScbO);
        RemoteFont$$serializer remoteFont$$serializer = RemoteFont$$serializer.INSTANCE;
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 2, remoteFont$$serializer, minimalistTextStyle$Serialized.BezslBgjveK3hODH);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Ql6q60SSx3(3, minimalistTextStyle$Serialized.ziNFA7KzVfc6, serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.HveD9n1tOYlffjJDxghBitYNgB(serialDescriptor, 4, minimalistTextStyle$Serialized.Aboow6rUrcY2SrFRa46C6uy);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 5, (KSerializer) mhw63suma8isgbArr[5].getValue(), minimalistTextStyle$Serialized.ox9eclwMpRd);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 6, remoteFont$$serializer, minimalistTextStyle$Serialized.PQQPeCDD0JLCT3aLz);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Ql6q60SSx3(7, minimalistTextStyle$Serialized.JY5knQmh7EQJEZ, serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.HveD9n1tOYlffjJDxghBitYNgB(serialDescriptor, 8, minimalistTextStyle$Serialized.LYcdI4xpry8eXmFC9I4wyaLdcG1z);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Ql6q60SSx3(9, minimalistTextStyle$Serialized.flPMk2Ix9h3b95v, serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Ql6q60SSx3(10, minimalistTextStyle$Serialized.fXBtMGfTIjGSHgK542, serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Ql6q60SSx3(11, minimalistTextStyle$Serialized.ToEIy0qfkltfGfO3vmAQG, serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 12, (KSerializer) mhw63suma8isgbArr[12].getValue(), minimalistTextStyle$Serialized.H5sQ15nhYoaKKHhx);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
