package bitpit.launcher.backend.reward.model;

import b.FnJAr7PQdTXFvdr5UoH7yVBAHyqev;
import b.M5ZW8ThjzDgV;
import b.QJmLMy74NwphhvC;
import b.nelx5QXMyOjGbNm0aVhnj4x8qWdi;
import b.nrFLsJiodCR850bQB;
import b.o76yCzyy4hCTs9LzjVpiAs;
import b.qJbD6jRb3f7;
import b.rXX7u5bn2nCB6ANmnDyddVU4zbm;
import b.rfws6iZeLER4kl3op6EXcK;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
@QJmLMy74NwphhvC
public /* synthetic */ class RewardSummary$$serializer implements qJbD6jRb3f7 {
    public static final RewardSummary$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        RewardSummary$$serializer rewardSummary$$serializer = new RewardSummary$$serializer();
        INSTANCE = rewardSummary$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("bitpit.launcher.backend.reward.model.RewardSummary", rewardSummary$$serializer, 1);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("totalExtensionDays", false);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
    }

    private RewardSummary$$serializer() {
    }

    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{rfws6iZeLER4kl3op6EXcK.S1zP5M3X7Ukq3ROlZ87G9I};
    }

    @Override // kotlinx.serialization.KSerializer
    public final RewardSummary deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        boolean z = true;
        int i = 0;
        FnJAr7PQdTXFvdr5UoH7yVBAHyqev fnJAr7PQdTXFvdr5UoH7yVBAHyqev = null;
        while (z) {
            int iCS9Klw57l26qfkpcMlfmpU = nrflsjiodcr850bqbBezslBgjveK3hODH.cS9Klw57l26qfkpcMlfmpU(serialDescriptor);
            if (iCS9Klw57l26qfkpcMlfmpU == -1) {
                z = false;
            } else {
                if (iCS9Klw57l26qfkpcMlfmpU != 0) {
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return null;
                }
                fnJAr7PQdTXFvdr5UoH7yVBAHyqev = (FnJAr7PQdTXFvdr5UoH7yVBAHyqev) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 0, rfws6iZeLER4kl3op6EXcK.S1zP5M3X7Ukq3ROlZ87G9I, fnJAr7PQdTXFvdr5UoH7yVBAHyqev);
                i = 1;
            }
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new RewardSummary(i, fnJAr7PQdTXFvdr5UoH7yVBAHyqev);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, RewardSummary rewardSummary) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 0, rfws6iZeLER4kl3op6EXcK.S1zP5M3X7Ukq3ROlZ87G9I, new FnJAr7PQdTXFvdr5UoH7yVBAHyqev(rewardSummary.S1zP5M3X7Ukq3ROlZ87G9I));
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
