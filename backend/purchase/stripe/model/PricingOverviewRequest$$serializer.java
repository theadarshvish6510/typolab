package bitpit.launcher.backend.purchase.stripe.model;

import b.M5ZW8ThjzDgV;
import b.QJmLMy74NwphhvC;
import b.eUwPamJ8sGfSyqS5ucd4;
import b.mHW63SUma8isGb;
import b.nelx5QXMyOjGbNm0aVhnj4x8qWdi;
import b.nrFLsJiodCR850bQB;
import b.o76yCzyy4hCTs9LzjVpiAs;
import b.qJbD6jRb3f7;
import b.rXX7u5bn2nCB6ANmnDyddVU4zbm;
import b.zdV2BnlTiQeQ;
import java.util.Locale;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
@QJmLMy74NwphhvC
public /* synthetic */ class PricingOverviewRequest$$serializer implements qJbD6jRb3f7 {
    public static final PricingOverviewRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PricingOverviewRequest$$serializer pricingOverviewRequest$$serializer = new PricingOverviewRequest$$serializer();
        INSTANCE = pricingOverviewRequest$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("bitpit.launcher.backend.purchase.stripe.model.PricingOverviewRequest", pricingOverviewRequest$$serializer, 2);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("currencylocale", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("country", true);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
    }

    private PricingOverviewRequest$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        mHW63SUma8isGb[] mhw63suma8isgbArr = PricingOverviewRequest.BezslBgjveK3hODH;
        return new KSerializer[]{mhw63suma8isgbArr[0].getValue(), zdV2BnlTiQeQ.ziNFA7KzVfc6((KSerializer) mhw63suma8isgbArr[1].getValue())};
    }

    @Override // kotlinx.serialization.KSerializer
    public final PricingOverviewRequest deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = PricingOverviewRequest.BezslBgjveK3hODH;
        boolean z = true;
        int i = 0;
        Locale locale = null;
        String str = null;
        while (z) {
            int iCS9Klw57l26qfkpcMlfmpU = nrflsjiodcr850bqbBezslBgjveK3hODH.cS9Klw57l26qfkpcMlfmpU(serialDescriptor);
            if (iCS9Klw57l26qfkpcMlfmpU == -1) {
                z = false;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 0) {
                locale = (Locale) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 0, (KSerializer) mhw63suma8isgbArr[0].getValue(), locale);
                i |= 1;
            } else {
                if (iCS9Klw57l26qfkpcMlfmpU != 1) {
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return null;
                }
                eUwPamJ8sGfSyqS5ucd4 euwpamj8sgfsyqs5ucd4 = (eUwPamJ8sGfSyqS5ucd4) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 1, (KSerializer) mhw63suma8isgbArr[1].getValue(), str != null ? new eUwPamJ8sGfSyqS5ucd4(str) : null);
                str = euwpamj8sgfsyqs5ucd4 != null ? euwpamj8sgfsyqs5ucd4.S1zP5M3X7Ukq3ROlZ87G9I : null;
                i |= 2;
            }
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new PricingOverviewRequest(i, locale, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PricingOverviewRequest pricingOverviewRequest) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = PricingOverviewRequest.BezslBgjveK3hODH;
        KSerializer kSerializer = (KSerializer) mhw63suma8isgbArr[0].getValue();
        Locale locale = pricingOverviewRequest.S1zP5M3X7Ukq3ROlZ87G9I;
        String str = pricingOverviewRequest.axL8FocTDLUdzg0XScbO;
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 0, kSerializer, locale);
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || str != null) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 1, (KSerializer) mhw63suma8isgbArr[1].getValue(), str != null ? new eUwPamJ8sGfSyqS5ucd4(str) : null);
        }
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
