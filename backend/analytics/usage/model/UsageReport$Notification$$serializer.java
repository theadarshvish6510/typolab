package bitpit.launcher.backend.analytics.usage.model;

import b.DY7rAMiwL4GxJalIAuGPP4NEMDd;
import b.Gl8Ehe3l199fwoU53BVAGLsBEcSU;
import b.M5ZW8ThjzDgV;
import b.QJmLMy74NwphhvC;
import b.iFFK8uDMEVqVo;
import b.nelx5QXMyOjGbNm0aVhnj4x8qWdi;
import b.nrFLsJiodCR850bQB;
import b.o76yCzyy4hCTs9LzjVpiAs;
import b.qJbD6jRb3f7;
import b.rXX7u5bn2nCB6ANmnDyddVU4zbm;
import b.zdV2BnlTiQeQ;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
@QJmLMy74NwphhvC
public /* synthetic */ class UsageReport$Notification$$serializer implements qJbD6jRb3f7 {
    public static final UsageReport$Notification$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        UsageReport$Notification$$serializer usageReport$Notification$$serializer = new UsageReport$Notification$$serializer();
        INSTANCE = usageReport$Notification$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("bitpit.launcher.backend.analytics.usage.model.UsageReport.Notification", usageReport$Notification$$serializer, 9);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("packageName", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("postTime", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("removalTime", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("timeZoneOffset", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("removeReason", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("category", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("userSentiment", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("importance", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("flags", false);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
    }

    private UsageReport$Notification$$serializer() {
    }

    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        iFFK8uDMEVqVo iffk8udmevqvo = iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I;
        Gl8Ehe3l199fwoU53BVAGLsBEcSU gl8Ehe3l199fwoU53BVAGLsBEcSU = Gl8Ehe3l199fwoU53BVAGLsBEcSU.S1zP5M3X7Ukq3ROlZ87G9I;
        KSerializer kSerializerZiNFA7KzVfc6 = zdV2BnlTiQeQ.ziNFA7KzVfc6(iffk8udmevqvo);
        KSerializer kSerializerZiNFA7KzVfc7 = zdV2BnlTiQeQ.ziNFA7KzVfc6(gl8Ehe3l199fwoU53BVAGLsBEcSU);
        DY7rAMiwL4GxJalIAuGPP4NEMDd dY7rAMiwL4GxJalIAuGPP4NEMDd = DY7rAMiwL4GxJalIAuGPP4NEMDd.S1zP5M3X7Ukq3ROlZ87G9I;
        return new KSerializer[]{iffk8udmevqvo, dY7rAMiwL4GxJalIAuGPP4NEMDd, dY7rAMiwL4GxJalIAuGPP4NEMDd, gl8Ehe3l199fwoU53BVAGLsBEcSU, gl8Ehe3l199fwoU53BVAGLsBEcSU, kSerializerZiNFA7KzVfc6, kSerializerZiNFA7KzVfc7, gl8Ehe3l199fwoU53BVAGLsBEcSU, gl8Ehe3l199fwoU53BVAGLsBEcSU};
    }

    @Override // kotlinx.serialization.KSerializer
    public final UsageReport.Notification deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        UsageReport.Notification notification = null;
        Integer num = null;
        String strWT8HZhEwPEkG = null;
        long jPQQPeCDD0JLCT3aLz = 0;
        long jPQQPeCDD0JLCT3aLz2 = 0;
        int i = 0;
        int iFlPMk2Ix9h3b95v = 0;
        int iFlPMk2Ix9h3b95v2 = 0;
        int iFlPMk2Ix9h3b95v3 = 0;
        int iFlPMk2Ix9h3b95v4 = 0;
        boolean z = true;
        String str = null;
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
                    jPQQPeCDD0JLCT3aLz = nrflsjiodcr850bqbBezslBgjveK3hODH.PQQPeCDD0JLCT3aLz(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    jPQQPeCDD0JLCT3aLz2 = nrflsjiodcr850bqbBezslBgjveK3hODH.PQQPeCDD0JLCT3aLz(serialDescriptor, 2);
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
                    str = (String) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 5, iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, str);
                    i |= 32;
                    break;
                case 6:
                    num = (Integer) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 6, Gl8Ehe3l199fwoU53BVAGLsBEcSU.S1zP5M3X7Ukq3ROlZ87G9I, num);
                    i |= 64;
                    break;
                case 7:
                    iFlPMk2Ix9h3b95v3 = nrflsjiodcr850bqbBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    iFlPMk2Ix9h3b95v4 = nrflsjiodcr850bqbBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 8);
                    i |= 256;
                    break;
                default:
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return notification;
            }
            notification = null;
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new UsageReport.Notification(i, strWT8HZhEwPEkG, jPQQPeCDD0JLCT3aLz, jPQQPeCDD0JLCT3aLz2, iFlPMk2Ix9h3b95v, iFlPMk2Ix9h3b95v2, str, num, iFlPMk2Ix9h3b95v3, iFlPMk2Ix9h3b95v4);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, UsageReport.Notification notification) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Rdzg08aYlt0UsoLUNug9cESzgAY9R(serialDescriptor, 0, notification.S1zP5M3X7Ukq3ROlZ87G9I);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.J1BE9tYH1em4X1uAhc6L7f4M(serialDescriptor, 1, notification.axL8FocTDLUdzg0XScbO);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.J1BE9tYH1em4X1uAhc6L7f4M(serialDescriptor, 2, notification.BezslBgjveK3hODH);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Ql6q60SSx3(3, notification.ziNFA7KzVfc6, serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Ql6q60SSx3(4, notification.Aboow6rUrcY2SrFRa46C6uy, serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 5, iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, notification.ox9eclwMpRd);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 6, Gl8Ehe3l199fwoU53BVAGLsBEcSU.S1zP5M3X7Ukq3ROlZ87G9I, notification.PQQPeCDD0JLCT3aLz);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Ql6q60SSx3(7, notification.JY5knQmh7EQJEZ, serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Ql6q60SSx3(8, notification.LYcdI4xpry8eXmFC9I4wyaLdcG1z, serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
