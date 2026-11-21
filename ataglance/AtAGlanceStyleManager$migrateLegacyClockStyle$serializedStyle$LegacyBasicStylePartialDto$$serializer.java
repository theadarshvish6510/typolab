package bitpit.launcher.ataglance;

import b.M5ZW8ThjzDgV;
import b.QJmLMy74NwphhvC;
import b.iFFK8uDMEVqVo;
import b.nelx5QXMyOjGbNm0aVhnj4x8qWdi;
import b.nrFLsJiodCR850bQB;
import b.o76yCzyy4hCTs9LzjVpiAs;
import b.qJbD6jRb3f7;
import b.rXX7u5bn2nCB6ANmnDyddVU4zbm;
import b.zdV2BnlTiQeQ;
import bitpit.launcher.text.RemoteFont;
import bitpit.launcher.text.RemoteFont$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
@QJmLMy74NwphhvC
public final /* synthetic */ class AtAGlanceStyleManager$migrateLegacyClockStyle$serializedStyle$LegacyBasicStylePartialDto$$serializer implements qJbD6jRb3f7 {
    public static final int $stable;
    public static final AtAGlanceStyleManager$migrateLegacyClockStyle$serializedStyle$LegacyBasicStylePartialDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AtAGlanceStyleManager$migrateLegacyClockStyle$serializedStyle$LegacyBasicStylePartialDto$$serializer atAGlanceStyleManager$migrateLegacyClockStyle$serializedStyle$LegacyBasicStylePartialDto$$serializer = new AtAGlanceStyleManager$migrateLegacyClockStyle$serializedStyle$LegacyBasicStylePartialDto$$serializer();
        INSTANCE = atAGlanceStyleManager$migrateLegacyClockStyle$serializedStyle$LegacyBasicStylePartialDto$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("bitpit.launcher.ataglance.AtAGlanceStyleManager.migrateLegacyClockStyle.LegacyBasicStylePartialDto", atAGlanceStyleManager$migrateLegacyClockStyle$serializedStyle$LegacyBasicStylePartialDto$$serializer, 2);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("type", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("font", true);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
        $stable = 8;
    }

    private AtAGlanceStyleManager$migrateLegacyClockStyle$serializedStyle$LegacyBasicStylePartialDto$$serializer() {
    }

    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, zdV2BnlTiQeQ.ziNFA7KzVfc6(RemoteFont$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final AtAGlanceStyleManager$migrateLegacyClockStyle$serializedStyle$LegacyBasicStylePartialDto deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strWT8HZhEwPEkG = null;
        RemoteFont remoteFont = null;
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
                remoteFont = (RemoteFont) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 1, RemoteFont$$serializer.INSTANCE, remoteFont);
                i |= 2;
            }
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new AtAGlanceStyleManager$migrateLegacyClockStyle$serializedStyle$LegacyBasicStylePartialDto(i, strWT8HZhEwPEkG, remoteFont);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, AtAGlanceStyleManager$migrateLegacyClockStyle$serializedStyle$LegacyBasicStylePartialDto atAGlanceStyleManager$migrateLegacyClockStyle$serializedStyle$LegacyBasicStylePartialDto) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        String str = atAGlanceStyleManager$migrateLegacyClockStyle$serializedStyle$LegacyBasicStylePartialDto.S1zP5M3X7Ukq3ROlZ87G9I;
        RemoteFont remoteFont = atAGlanceStyleManager$migrateLegacyClockStyle$serializedStyle$LegacyBasicStylePartialDto.axL8FocTDLUdzg0XScbO;
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Rdzg08aYlt0UsoLUNug9cESzgAY9R(serialDescriptor, 0, str);
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || remoteFont != null) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 1, RemoteFont$$serializer.INSTANCE, remoteFont);
        }
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
