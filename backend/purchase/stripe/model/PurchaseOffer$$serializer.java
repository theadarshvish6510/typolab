package bitpit.launcher.backend.purchase.stripe.model;

import b.M5ZW8ThjzDgV;
import b.QJmLMy74NwphhvC;
import b.nelx5QXMyOjGbNm0aVhnj4x8qWdi;
import b.nrFLsJiodCR850bQB;
import b.o76yCzyy4hCTs9LzjVpiAs;
import b.qJbD6jRb3f7;
import b.rXX7u5bn2nCB6ANmnDyddVU4zbm;
import b.zdV2BnlTiQeQ;
import bitpit.launcher.backend.trial.model.FreeTrialOffer;
import bitpit.launcher.backend.trial.model.FreeTrialOffer$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
@QJmLMy74NwphhvC
public /* synthetic */ class PurchaseOffer$$serializer implements qJbD6jRb3f7 {
    public static final PurchaseOffer$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PurchaseOffer$$serializer purchaseOffer$$serializer = new PurchaseOffer$$serializer();
        INSTANCE = purchaseOffer$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("bitpit.launcher.backend.purchase.stripe.model.PurchaseOffer", purchaseOffer$$serializer, 3);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("current", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("upcoming", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("freeTrial", true);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
    }

    private PurchaseOffer$$serializer() {
    }

    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        PriceEntry$$serializer priceEntry$$serializer = PriceEntry$$serializer.INSTANCE;
        return new KSerializer[]{priceEntry$$serializer, zdV2BnlTiQeQ.ziNFA7KzVfc6(priceEntry$$serializer), zdV2BnlTiQeQ.ziNFA7KzVfc6(FreeTrialOffer$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final PurchaseOffer deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        boolean z = true;
        int i = 0;
        PriceEntry priceEntry = null;
        PriceEntry priceEntry2 = null;
        FreeTrialOffer freeTrialOffer = null;
        while (z) {
            int iCS9Klw57l26qfkpcMlfmpU = nrflsjiodcr850bqbBezslBgjveK3hODH.cS9Klw57l26qfkpcMlfmpU(serialDescriptor);
            if (iCS9Klw57l26qfkpcMlfmpU == -1) {
                z = false;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 0) {
                priceEntry = (PriceEntry) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 0, PriceEntry$$serializer.INSTANCE, priceEntry);
                i |= 1;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 1) {
                priceEntry2 = (PriceEntry) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 1, PriceEntry$$serializer.INSTANCE, priceEntry2);
                i |= 2;
            } else {
                if (iCS9Klw57l26qfkpcMlfmpU != 2) {
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return null;
                }
                freeTrialOffer = (FreeTrialOffer) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 2, FreeTrialOffer$$serializer.INSTANCE, freeTrialOffer);
                i |= 4;
            }
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new PurchaseOffer(i, priceEntry, priceEntry2, freeTrialOffer);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PurchaseOffer purchaseOffer) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        PriceEntry$$serializer priceEntry$$serializer = PriceEntry$$serializer.INSTANCE;
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 0, priceEntry$$serializer, purchaseOffer.S1zP5M3X7Ukq3ROlZ87G9I);
        PriceEntry priceEntry = purchaseOffer.axL8FocTDLUdzg0XScbO;
        if (priceEntry != null) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 1, priceEntry$$serializer, priceEntry);
        }
        FreeTrialOffer freeTrialOffer = purchaseOffer.BezslBgjveK3hODH;
        if (freeTrialOffer != null) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 2, FreeTrialOffer$$serializer.INSTANCE, freeTrialOffer);
        }
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
