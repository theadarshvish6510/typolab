package bitpit.launcher.backend.analytics.singular.model;

import b.KNB69biQImOtxCbYZrxJ;
import b.QJmLMy74NwphhvC;
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
public /* synthetic */ class SingularRequest$$serializer<T> implements qJbD6jRb3f7 {
    private final SerialDescriptor descriptor;
    private final /* synthetic */ KSerializer typeSerial0;

    private SingularRequest$$serializer() {
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("bitpit.launcher.backend.analytics.singular.model.SingularRequest", this, 3);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("payload", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("context", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("consent", true);
        this.descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
    }

    private final /* synthetic */ KSerializer getTypeSerial0() {
        return this.typeSerial0;
    }

    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{this.typeSerial0, SingularRequestContext$$serializer.INSTANCE, zdV2BnlTiQeQ.ziNFA7KzVfc6(SingularConsentContext$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SingularRequest<T> deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = this.descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        boolean z = true;
        int i = 0;
        KNB69biQImOtxCbYZrxJ kNB69biQImOtxCbYZrxJ = null;
        SingularRequestContext singularRequestContext = null;
        SingularConsentContext singularConsentContext = null;
        while (z) {
            int iCS9Klw57l26qfkpcMlfmpU = nrflsjiodcr850bqbBezslBgjveK3hODH.cS9Klw57l26qfkpcMlfmpU(serialDescriptor);
            if (iCS9Klw57l26qfkpcMlfmpU == -1) {
                z = false;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 0) {
                kNB69biQImOtxCbYZrxJ = (KNB69biQImOtxCbYZrxJ) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 0, this.typeSerial0, kNB69biQImOtxCbYZrxJ);
                i |= 1;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 1) {
                singularRequestContext = (SingularRequestContext) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 1, SingularRequestContext$$serializer.INSTANCE, singularRequestContext);
                i |= 2;
            } else {
                if (iCS9Klw57l26qfkpcMlfmpU != 2) {
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return null;
                }
                singularConsentContext = (SingularConsentContext) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 2, SingularConsentContext$$serializer.INSTANCE, singularConsentContext);
                i |= 4;
            }
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new SingularRequest<>(i, kNB69biQImOtxCbYZrxJ, singularRequestContext, singularConsentContext);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SingularRequest<T> singularRequest) {
        SerialDescriptor serialDescriptor = this.descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        KSerializer kSerializer = this.typeSerial0;
        SingularRequest.Companion companion = SingularRequest.Companion;
        KNB69biQImOtxCbYZrxJ kNB69biQImOtxCbYZrxJ = singularRequest.S1zP5M3X7Ukq3ROlZ87G9I;
        SingularConsentContext singularConsentContext = singularRequest.BezslBgjveK3hODH;
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 0, kSerializer, kNB69biQImOtxCbYZrxJ);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 1, SingularRequestContext$$serializer.INSTANCE, singularRequest.axL8FocTDLUdzg0XScbO);
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || singularConsentContext != null) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 2, SingularConsentContext$$serializer.INSTANCE, singularConsentContext);
        }
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public final KSerializer[] typeParametersSerializers() {
        return new KSerializer[]{this.typeSerial0};
    }

    public SingularRequest$$serializer(KSerializer kSerializer) {
        this();
        this.typeSerial0 = kSerializer;
    }
}
