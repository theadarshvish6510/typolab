package bitpit.launcher.backend.account.model.google;

import b.M5ZW8ThjzDgV;
import b.QJmLMy74NwphhvC;
import b.eUwPamJ8sGfSyqS5ucd4;
import b.iFFK8uDMEVqVo;
import b.mHW63SUma8isGb;
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
public /* synthetic */ class GoogleAuthAttachAccountRequest$$serializer implements qJbD6jRb3f7 {
    public static final GoogleAuthAttachAccountRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        GoogleAuthAttachAccountRequest$$serializer googleAuthAttachAccountRequest$$serializer = new GoogleAuthAttachAccountRequest$$serializer();
        INSTANCE = googleAuthAttachAccountRequest$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("bitpit.launcher.backend.account.model.google.GoogleAuthAttachAccountRequest", googleAuthAttachAccountRequest$$serializer, 2);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("token", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("cc", true);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
    }

    private GoogleAuthAttachAccountRequest$$serializer() {
    }

    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, zdV2BnlTiQeQ.ziNFA7KzVfc6((KSerializer) GoogleAuthAttachAccountRequest.BezslBgjveK3hODH[1].getValue())};
    }

    @Override // kotlinx.serialization.KSerializer
    public final GoogleAuthAttachAccountRequest deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = GoogleAuthAttachAccountRequest.BezslBgjveK3hODH;
        boolean z = true;
        int i = 0;
        String str = null;
        String strWT8HZhEwPEkG = null;
        while (z) {
            int iCS9Klw57l26qfkpcMlfmpU = nrflsjiodcr850bqbBezslBgjveK3hODH.cS9Klw57l26qfkpcMlfmpU(serialDescriptor);
            if (iCS9Klw57l26qfkpcMlfmpU == -1) {
                z = false;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 0) {
                strWT8HZhEwPEkG = nrflsjiodcr850bqbBezslBgjveK3hODH.WT8HZhEwPEkG(serialDescriptor, 0);
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
        return new GoogleAuthAttachAccountRequest(strWT8HZhEwPEkG, i, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, GoogleAuthAttachAccountRequest googleAuthAttachAccountRequest) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = GoogleAuthAttachAccountRequest.BezslBgjveK3hODH;
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Rdzg08aYlt0UsoLUNug9cESzgAY9R(serialDescriptor, 0, googleAuthAttachAccountRequest.S1zP5M3X7Ukq3ROlZ87G9I);
        String str = googleAuthAttachAccountRequest.axL8FocTDLUdzg0XScbO;
        if (str != null) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 1, (KSerializer) mhw63suma8isgbArr[1].getValue(), new eUwPamJ8sGfSyqS5ucd4(str));
        }
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
