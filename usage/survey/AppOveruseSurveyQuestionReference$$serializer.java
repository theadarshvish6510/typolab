package bitpit.launcher.usage.survey;

import b.DY7rAMiwL4GxJalIAuGPP4NEMDd;
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
public final /* synthetic */ class AppOveruseSurveyQuestionReference$$serializer implements qJbD6jRb3f7 {
    public static final int $stable;
    public static final AppOveruseSurveyQuestionReference$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AppOveruseSurveyQuestionReference$$serializer appOveruseSurveyQuestionReference$$serializer = new AppOveruseSurveyQuestionReference$$serializer();
        INSTANCE = appOveruseSurveyQuestionReference$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("bitpit.launcher.usage.survey.AppOveruseSurveyQuestionReference", appOveruseSurveyQuestionReference$$serializer, 3);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("first_session_start_millis", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("last_session_end_millis", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("total_duration_millis", false);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
        $stable = 8;
    }

    private AppOveruseSurveyQuestionReference$$serializer() {
    }

    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        DY7rAMiwL4GxJalIAuGPP4NEMDd dY7rAMiwL4GxJalIAuGPP4NEMDd = DY7rAMiwL4GxJalIAuGPP4NEMDd.S1zP5M3X7Ukq3ROlZ87G9I;
        return new KSerializer[]{dY7rAMiwL4GxJalIAuGPP4NEMDd, dY7rAMiwL4GxJalIAuGPP4NEMDd, dY7rAMiwL4GxJalIAuGPP4NEMDd};
    }

    @Override // kotlinx.serialization.KSerializer
    public final AppOveruseSurveyQuestionReference deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        int i = 0;
        long jPQQPeCDD0JLCT3aLz = 0;
        long jPQQPeCDD0JLCT3aLz2 = 0;
        long jPQQPeCDD0JLCT3aLz3 = 0;
        boolean z = true;
        while (z) {
            int iCS9Klw57l26qfkpcMlfmpU = nrflsjiodcr850bqbBezslBgjveK3hODH.cS9Klw57l26qfkpcMlfmpU(serialDescriptor);
            if (iCS9Klw57l26qfkpcMlfmpU == -1) {
                z = false;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 0) {
                jPQQPeCDD0JLCT3aLz = nrflsjiodcr850bqbBezslBgjveK3hODH.PQQPeCDD0JLCT3aLz(serialDescriptor, 0);
                i |= 1;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 1) {
                jPQQPeCDD0JLCT3aLz2 = nrflsjiodcr850bqbBezslBgjveK3hODH.PQQPeCDD0JLCT3aLz(serialDescriptor, 1);
                i |= 2;
            } else {
                if (iCS9Klw57l26qfkpcMlfmpU != 2) {
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return null;
                }
                jPQQPeCDD0JLCT3aLz3 = nrflsjiodcr850bqbBezslBgjveK3hODH.PQQPeCDD0JLCT3aLz(serialDescriptor, 2);
                i |= 4;
            }
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new AppOveruseSurveyQuestionReference(i, jPQQPeCDD0JLCT3aLz, jPQQPeCDD0JLCT3aLz2, jPQQPeCDD0JLCT3aLz3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, AppOveruseSurveyQuestionReference appOveruseSurveyQuestionReference) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.J1BE9tYH1em4X1uAhc6L7f4M(serialDescriptor, 0, appOveruseSurveyQuestionReference.S1zP5M3X7Ukq3ROlZ87G9I);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.J1BE9tYH1em4X1uAhc6L7f4M(serialDescriptor, 1, appOveruseSurveyQuestionReference.axL8FocTDLUdzg0XScbO);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.J1BE9tYH1em4X1uAhc6L7f4M(serialDescriptor, 2, appOveruseSurveyQuestionReference.BezslBgjveK3hODH);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
