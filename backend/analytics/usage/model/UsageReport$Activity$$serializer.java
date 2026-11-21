package bitpit.launcher.backend.analytics.usage.model;

import b.DY7rAMiwL4GxJalIAuGPP4NEMDd;
import b.Gl8Ehe3l199fwoU53BVAGLsBEcSU;
import b.M5ZW8ThjzDgV;
import b.QJmLMy74NwphhvC;
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
public /* synthetic */ class UsageReport$Activity$$serializer implements qJbD6jRb3f7 {
    public static final UsageReport$Activity$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        UsageReport$Activity$$serializer usageReport$Activity$$serializer = new UsageReport$Activity$$serializer();
        INSTANCE = usageReport$Activity$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("bitpit.launcher.backend.analytics.usage.model.UsageReport.Activity", usageReport$Activity$$serializer, 5);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("type", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("startTime", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("duration", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("timeZoneOffset", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("flags", false);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
    }

    private UsageReport$Activity$$serializer() {
    }

    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        Gl8Ehe3l199fwoU53BVAGLsBEcSU gl8Ehe3l199fwoU53BVAGLsBEcSU = Gl8Ehe3l199fwoU53BVAGLsBEcSU.S1zP5M3X7Ukq3ROlZ87G9I;
        DY7rAMiwL4GxJalIAuGPP4NEMDd dY7rAMiwL4GxJalIAuGPP4NEMDd = DY7rAMiwL4GxJalIAuGPP4NEMDd.S1zP5M3X7Ukq3ROlZ87G9I;
        return new KSerializer[]{gl8Ehe3l199fwoU53BVAGLsBEcSU, dY7rAMiwL4GxJalIAuGPP4NEMDd, dY7rAMiwL4GxJalIAuGPP4NEMDd, gl8Ehe3l199fwoU53BVAGLsBEcSU, gl8Ehe3l199fwoU53BVAGLsBEcSU};
    }

    @Override // kotlinx.serialization.KSerializer
    public final UsageReport.Activity deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        int i = 0;
        int iFlPMk2Ix9h3b95v = 0;
        int iFlPMk2Ix9h3b95v2 = 0;
        int iFlPMk2Ix9h3b95v3 = 0;
        long jPQQPeCDD0JLCT3aLz = 0;
        long jPQQPeCDD0JLCT3aLz2 = 0;
        boolean z = true;
        while (z) {
            int iCS9Klw57l26qfkpcMlfmpU = nrflsjiodcr850bqbBezslBgjveK3hODH.cS9Klw57l26qfkpcMlfmpU(serialDescriptor);
            if (iCS9Klw57l26qfkpcMlfmpU == -1) {
                z = false;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 0) {
                iFlPMk2Ix9h3b95v = nrflsjiodcr850bqbBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 0);
                i |= 1;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 1) {
                jPQQPeCDD0JLCT3aLz = nrflsjiodcr850bqbBezslBgjveK3hODH.PQQPeCDD0JLCT3aLz(serialDescriptor, 1);
                i |= 2;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 2) {
                jPQQPeCDD0JLCT3aLz2 = nrflsjiodcr850bqbBezslBgjveK3hODH.PQQPeCDD0JLCT3aLz(serialDescriptor, 2);
                i |= 4;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 3) {
                iFlPMk2Ix9h3b95v2 = nrflsjiodcr850bqbBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 3);
                i |= 8;
            } else {
                if (iCS9Klw57l26qfkpcMlfmpU != 4) {
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return null;
                }
                iFlPMk2Ix9h3b95v3 = nrflsjiodcr850bqbBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 4);
                i |= 16;
            }
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new UsageReport.Activity(i, iFlPMk2Ix9h3b95v, jPQQPeCDD0JLCT3aLz, jPQQPeCDD0JLCT3aLz2, iFlPMk2Ix9h3b95v2, iFlPMk2Ix9h3b95v3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, UsageReport.Activity activity) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Ql6q60SSx3(0, activity.S1zP5M3X7Ukq3ROlZ87G9I, serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.J1BE9tYH1em4X1uAhc6L7f4M(serialDescriptor, 1, activity.axL8FocTDLUdzg0XScbO);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.J1BE9tYH1em4X1uAhc6L7f4M(serialDescriptor, 2, activity.BezslBgjveK3hODH);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Ql6q60SSx3(3, activity.ziNFA7KzVfc6, serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Ql6q60SSx3(4, activity.Aboow6rUrcY2SrFRa46C6uy, serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
