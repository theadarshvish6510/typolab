package bitpit.launcher.backend.push.data.model;

import b.M5ZW8ThjzDgV;
import b.QJmLMy74NwphhvC;
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
public /* synthetic */ class InvitationRewardAccepted$$serializer implements qJbD6jRb3f7 {
    public static final InvitationRewardAccepted$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        InvitationRewardAccepted$$serializer invitationRewardAccepted$$serializer = new InvitationRewardAccepted$$serializer();
        INSTANCE = invitationRewardAccepted$$serializer;
        descriptor = new rXX7u5bn2nCB6ANmnDyddVU4zbm("IRAc", invitationRewardAccepted$$serializer, 0);
    }

    private InvitationRewardAccepted$$serializer() {
    }

    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        return new KSerializer[0];
    }

    @Override // kotlinx.serialization.KSerializer
    public final InvitationRewardAccepted deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        int iCS9Klw57l26qfkpcMlfmpU = nrflsjiodcr850bqbBezslBgjveK3hODH.cS9Klw57l26qfkpcMlfmpU(serialDescriptor);
        if (iCS9Klw57l26qfkpcMlfmpU == -1) {
            nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
            return new InvitationRewardAccepted();
        }
        o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
        return null;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, InvitationRewardAccepted invitationRewardAccepted) {
        SerialDescriptor serialDescriptor = descriptor;
        encoder.BezslBgjveK3hODH(serialDescriptor).S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
