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
public final /* synthetic */ class DayOfWeekStyle$Serialized$$serializer implements qJbD6jRb3f7 {
    public static final int $stable;
    public static final DayOfWeekStyle$Serialized$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DayOfWeekStyle$Serialized$$serializer dayOfWeekStyle$Serialized$$serializer = new DayOfWeekStyle$Serialized$$serializer();
        INSTANCE = dayOfWeekStyle$Serialized$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("day_of_week", dayOfWeekStyle$Serialized$$serializer, 7);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("uuid", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("info", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("week_day_text_font", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("week_day_text_size", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("week_day_text_color", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("at_a_glance_bar_text_font", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("at_a_glance_bar_text_color", false);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
        $stable = 8;
    }

    private DayOfWeekStyle$Serialized$$serializer() {
    }

    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        mHW63SUma8isGb[] mhw63suma8isgbArr = DayOfWeekStyle$Serialized.JY5knQmh7EQJEZ;
        RemoteFont$$serializer remoteFont$$serializer = RemoteFont$$serializer.INSTANCE;
        return new KSerializer[]{iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, AtAGlanceInfo$$serializer.INSTANCE, remoteFont$$serializer, Gl8Ehe3l199fwoU53BVAGLsBEcSU.S1zP5M3X7Ukq3ROlZ87G9I, zdV2BnlTiQeQ.ziNFA7KzVfc6((KSerializer) mhw63suma8isgbArr[4].getValue()), zdV2BnlTiQeQ.ziNFA7KzVfc6(remoteFont$$serializer), zdV2BnlTiQeQ.ziNFA7KzVfc6((KSerializer) mhw63suma8isgbArr[6].getValue())};
    }

    @Override // kotlinx.serialization.KSerializer
    public final DayOfWeekStyle$Serialized deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = DayOfWeekStyle$Serialized.JY5knQmh7EQJEZ;
        DayOfWeekStyle$Serialized dayOfWeekStyle$Serialized = null;
        boolean z = true;
        int i = 0;
        int iFlPMk2Ix9h3b95v = 0;
        String strWT8HZhEwPEkG = null;
        AtAGlanceInfo atAGlanceInfo = null;
        RemoteFont remoteFont = null;
        qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz8 = null;
        RemoteFont remoteFont2 = null;
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
                    qstjuxvi0yplnkz8 = (qsTJuxvI0Yplnkz8) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 4, (KSerializer) mhw63suma8isgbArr[4].getValue(), qstjuxvi0yplnkz8);
                    i |= 16;
                    break;
                case 5:
                    remoteFont2 = (RemoteFont) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 5, RemoteFont$$serializer.INSTANCE, remoteFont2);
                    i |= 32;
                    break;
                case 6:
                    qstjuxvi0yplnkz9 = (qsTJuxvI0Yplnkz8) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 6, (KSerializer) mhw63suma8isgbArr[6].getValue(), qstjuxvi0yplnkz9);
                    i |= 64;
                    break;
                default:
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return dayOfWeekStyle$Serialized;
            }
            dayOfWeekStyle$Serialized = null;
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new DayOfWeekStyle$Serialized(i, strWT8HZhEwPEkG, atAGlanceInfo, remoteFont, iFlPMk2Ix9h3b95v, qstjuxvi0yplnkz8, remoteFont2, qstjuxvi0yplnkz9);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, DayOfWeekStyle$Serialized dayOfWeekStyle$Serialized) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = DayOfWeekStyle$Serialized.JY5knQmh7EQJEZ;
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Rdzg08aYlt0UsoLUNug9cESzgAY9R(serialDescriptor, 0, dayOfWeekStyle$Serialized.S1zP5M3X7Ukq3ROlZ87G9I);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 1, AtAGlanceInfo$$serializer.INSTANCE, dayOfWeekStyle$Serialized.axL8FocTDLUdzg0XScbO);
        RemoteFont$$serializer remoteFont$$serializer = RemoteFont$$serializer.INSTANCE;
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 2, remoteFont$$serializer, dayOfWeekStyle$Serialized.BezslBgjveK3hODH);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Ql6q60SSx3(3, dayOfWeekStyle$Serialized.ziNFA7KzVfc6, serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 4, (KSerializer) mhw63suma8isgbArr[4].getValue(), dayOfWeekStyle$Serialized.Aboow6rUrcY2SrFRa46C6uy);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 5, remoteFont$$serializer, dayOfWeekStyle$Serialized.ox9eclwMpRd);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 6, (KSerializer) mhw63suma8isgbArr[6].getValue(), dayOfWeekStyle$Serialized.PQQPeCDD0JLCT3aLz);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
