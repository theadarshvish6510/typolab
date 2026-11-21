package bitpit.launcher.backend.analytics.singular.model;

import b.AW4TehX5U1XIZthtc6OLhL;
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
public /* synthetic */ class SingularEventParameters$DataSharingOptions$$serializer implements qJbD6jRb3f7 {
    public static final SingularEventParameters$DataSharingOptions$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SingularEventParameters$DataSharingOptions$$serializer singularEventParameters$DataSharingOptions$$serializer = new SingularEventParameters$DataSharingOptions$$serializer();
        INSTANCE = singularEventParameters$DataSharingOptions$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("bitpit.launcher.backend.analytics.singular.model.SingularEventParameters.DataSharingOptions", singularEventParameters$DataSharingOptions$$serializer, 1);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("limit_data_sharing", false);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
    }

    private SingularEventParameters$DataSharingOptions$$serializer() {
    }

    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AW4TehX5U1XIZthtc6OLhL.S1zP5M3X7Ukq3ROlZ87G9I};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SingularEventParameters.DataSharingOptions deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        boolean z = true;
        int i = 0;
        boolean zQl6q60SSx3 = false;
        while (z) {
            int iCS9Klw57l26qfkpcMlfmpU = nrflsjiodcr850bqbBezslBgjveK3hODH.cS9Klw57l26qfkpcMlfmpU(serialDescriptor);
            if (iCS9Klw57l26qfkpcMlfmpU == -1) {
                z = false;
            } else {
                if (iCS9Klw57l26qfkpcMlfmpU != 0) {
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return null;
                }
                zQl6q60SSx3 = nrflsjiodcr850bqbBezslBgjveK3hODH.Ql6q60SSx3(serialDescriptor, 0);
                i = 1;
            }
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new SingularEventParameters.DataSharingOptions(i, zQl6q60SSx3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SingularEventParameters.DataSharingOptions dataSharingOptions) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 0, dataSharingOptions.S1zP5M3X7Ukq3ROlZ87G9I);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
