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
import b.zdV2BnlTiQeQ;
import bitpit.launcher.text.RemoteFont;
import bitpit.launcher.text.RemoteFont$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
@QJmLMy74NwphhvC
public final /* synthetic */ class FlipClockStyle$Serialized$$serializer implements qJbD6jRb3f7 {
    public static final int $stable;
    public static final FlipClockStyle$Serialized$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FlipClockStyle$Serialized$$serializer flipClockStyle$Serialized$$serializer = new FlipClockStyle$Serialized$$serializer();
        INSTANCE = flipClockStyle$Serialized$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("flip_clock", flipClockStyle$Serialized$$serializer, 7);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("uuid", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("info", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("font", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("corner_radius", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("divider_height", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("text_color", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("background_color", false);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
        $stable = 8;
    }

    private FlipClockStyle$Serialized$$serializer() {
    }

    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        mHW63SUma8isGb[] mhw63suma8isgbArr = FlipClockStyle$Serialized.JY5knQmh7EQJEZ;
        KSerializer kSerializerZiNFA7KzVfc6 = zdV2BnlTiQeQ.ziNFA7KzVfc6((KSerializer) mhw63suma8isgbArr[5].getValue());
        KSerializer kSerializerZiNFA7KzVfc7 = zdV2BnlTiQeQ.ziNFA7KzVfc6((KSerializer) mhw63suma8isgbArr[6].getValue());
        Gl8Ehe3l199fwoU53BVAGLsBEcSU gl8Ehe3l199fwoU53BVAGLsBEcSU = Gl8Ehe3l199fwoU53BVAGLsBEcSU.S1zP5M3X7Ukq3ROlZ87G9I;
        return new KSerializer[]{iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, AtAGlanceInfo$$serializer.INSTANCE, RemoteFont$$serializer.INSTANCE, gl8Ehe3l199fwoU53BVAGLsBEcSU, gl8Ehe3l199fwoU53BVAGLsBEcSU, kSerializerZiNFA7KzVfc6, kSerializerZiNFA7KzVfc7};
    }

    @Override // kotlinx.serialization.KSerializer
    public final FlipClockStyle$Serialized deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = FlipClockStyle$Serialized.JY5knQmh7EQJEZ;
        FlipClockStyle$Serialized flipClockStyle$Serialized = null;
        boolean z = true;
        int i = 0;
        int iFlPMk2Ix9h3b95v = 0;
        int iFlPMk2Ix9h3b95v2 = 0;
        String strWT8HZhEwPEkG = null;
        AtAGlanceInfo atAGlanceInfo = null;
        RemoteFont remoteFont = null;
        qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz8 = null;
        qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz9 = null;
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
                    iFlPMk2Ix9h3b95v2 = nrflsjiodcr850bqbBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    qstjuxvi0yplnkz8 = (qsTJuxvI0Yplnkz8) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 5, (KSerializer) mhw63suma8isgbArr[5].getValue(), qstjuxvi0yplnkz8);
                    i |= 32;
                    break;
                case 6:
                    qstjuxvi0yplnkz9 = (qsTJuxvI0Yplnkz8) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 6, (KSerializer) mhw63suma8isgbArr[6].getValue(), qstjuxvi0yplnkz9);
                    i |= 64;
                    break;
                default:
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return flipClockStyle$Serialized;
            }
            flipClockStyle$Serialized = null;
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new FlipClockStyle$Serialized(i, strWT8HZhEwPEkG, atAGlanceInfo, remoteFont, iFlPMk2Ix9h3b95v, iFlPMk2Ix9h3b95v2, qstjuxvi0yplnkz8, qstjuxvi0yplnkz9);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, FlipClockStyle$Serialized flipClockStyle$Serialized) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = FlipClockStyle$Serialized.JY5knQmh7EQJEZ;
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Rdzg08aYlt0UsoLUNug9cESzgAY9R(serialDescriptor, 0, flipClockStyle$Serialized.S1zP5M3X7Ukq3ROlZ87G9I);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 1, AtAGlanceInfo$$serializer.INSTANCE, flipClockStyle$Serialized.axL8FocTDLUdzg0XScbO);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 2, RemoteFont$$serializer.INSTANCE, flipClockStyle$Serialized.BezslBgjveK3hODH);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Ql6q60SSx3(3, flipClockStyle$Serialized.ziNFA7KzVfc6, serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Ql6q60SSx3(4, flipClockStyle$Serialized.Aboow6rUrcY2SrFRa46C6uy, serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 5, (KSerializer) mhw63suma8isgbArr[5].getValue(), flipClockStyle$Serialized.ox9eclwMpRd);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 6, (KSerializer) mhw63suma8isgbArr[6].getValue(), flipClockStyle$Serialized.PQQPeCDD0JLCT3aLz);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
