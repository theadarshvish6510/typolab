package bitpit.launcher.backend.analytics.singular.model;

import b.AW4TehX5U1XIZthtc6OLhL;
import b.DY7rAMiwL4GxJalIAuGPP4NEMDd;
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
public /* synthetic */ class SingularSessionParameters$$serializer implements qJbD6jRb3f7 {
    public static final SingularSessionParameters$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SingularSessionParameters$$serializer singularSessionParameters$$serializer = new SingularSessionParameters$$serializer();
        INSTANCE = singularSessionParameters$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("bitpit.launcher.backend.analytics.singular.model.SingularSessionParameters", singularSessionParameters$$serializer, 6);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("install", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("install_time", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("update_time", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("install_source", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("install_ref", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("fcm", true);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
    }

    private SingularSessionParameters$$serializer() {
    }

    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        iFFK8uDMEVqVo iffk8udmevqvo = iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I;
        KSerializer kSerializerZiNFA7KzVfc6 = zdV2BnlTiQeQ.ziNFA7KzVfc6(iffk8udmevqvo);
        KSerializer kSerializerZiNFA7KzVfc7 = zdV2BnlTiQeQ.ziNFA7KzVfc6(SingularInstallReferrer$$serializer.INSTANCE);
        KSerializer kSerializerZiNFA7KzVfc8 = zdV2BnlTiQeQ.ziNFA7KzVfc6(iffk8udmevqvo);
        DY7rAMiwL4GxJalIAuGPP4NEMDd dY7rAMiwL4GxJalIAuGPP4NEMDd = DY7rAMiwL4GxJalIAuGPP4NEMDd.S1zP5M3X7Ukq3ROlZ87G9I;
        return new KSerializer[]{AW4TehX5U1XIZthtc6OLhL.S1zP5M3X7Ukq3ROlZ87G9I, dY7rAMiwL4GxJalIAuGPP4NEMDd, dY7rAMiwL4GxJalIAuGPP4NEMDd, kSerializerZiNFA7KzVfc6, kSerializerZiNFA7KzVfc7, kSerializerZiNFA7KzVfc8};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SingularSessionParameters deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        SingularSessionParameters singularSessionParameters = null;
        int i = 0;
        boolean zQl6q60SSx3 = false;
        long jPQQPeCDD0JLCT3aLz = 0;
        long jPQQPeCDD0JLCT3aLz2 = 0;
        String str = null;
        String str2 = null;
        SingularInstallReferrer singularInstallReferrer = null;
        boolean z = true;
        while (z) {
            int iCS9Klw57l26qfkpcMlfmpU = nrflsjiodcr850bqbBezslBgjveK3hODH.cS9Klw57l26qfkpcMlfmpU(serialDescriptor);
            switch (iCS9Klw57l26qfkpcMlfmpU) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    zQl6q60SSx3 = nrflsjiodcr850bqbBezslBgjveK3hODH.Ql6q60SSx3(serialDescriptor, 0);
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
                    str2 = (String) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 3, iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, str2);
                    i |= 8;
                    break;
                case 4:
                    singularInstallReferrer = (SingularInstallReferrer) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 4, SingularInstallReferrer$$serializer.INSTANCE, singularInstallReferrer);
                    i |= 16;
                    break;
                case 5:
                    str = (String) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 5, iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, str);
                    i |= 32;
                    break;
                default:
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return singularSessionParameters;
            }
            singularSessionParameters = null;
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new SingularSessionParameters(i, zQl6q60SSx3, jPQQPeCDD0JLCT3aLz, jPQQPeCDD0JLCT3aLz2, str2, singularInstallReferrer, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SingularSessionParameters singularSessionParameters) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 0, singularSessionParameters.S1zP5M3X7Ukq3ROlZ87G9I);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.J1BE9tYH1em4X1uAhc6L7f4M(serialDescriptor, 1, singularSessionParameters.axL8FocTDLUdzg0XScbO);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.J1BE9tYH1em4X1uAhc6L7f4M(serialDescriptor, 2, singularSessionParameters.BezslBgjveK3hODH);
        String str = singularSessionParameters.ziNFA7KzVfc6;
        if (str != null) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 3, iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, str);
        }
        SingularInstallReferrer singularInstallReferrer = singularSessionParameters.Aboow6rUrcY2SrFRa46C6uy;
        if (singularInstallReferrer != null) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 4, SingularInstallReferrer$$serializer.INSTANCE, singularInstallReferrer);
        }
        String str2 = singularSessionParameters.ox9eclwMpRd;
        if (str2 != null) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 5, iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, str2);
        }
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
