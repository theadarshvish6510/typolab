package bitpit.launcher.secretcmd;

import b.Gl8Ehe3l199fwoU53BVAGLsBEcSU;
import b.M5ZW8ThjzDgV;
import b.QJmLMy74NwphhvC;
import b.dBjj8dRBlsNpBvfB0d120r2;
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
public final /* synthetic */ class SecretCommandHelper$runCommandInternal$DebugItemInfoUsageData$$serializer implements qJbD6jRb3f7 {
    public static final int $stable;
    public static final SecretCommandHelper$runCommandInternal$DebugItemInfoUsageData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SecretCommandHelper$runCommandInternal$DebugItemInfoUsageData$$serializer secretCommandHelper$runCommandInternal$DebugItemInfoUsageData$$serializer = new SecretCommandHelper$runCommandInternal$DebugItemInfoUsageData$$serializer();
        INSTANCE = secretCommandHelper$runCommandInternal$DebugItemInfoUsageData$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("bitpit.launcher.secretcmd.SecretCommandHelper.runCommandInternal.DebugItemInfoUsageData", secretCommandHelper$runCommandInternal$DebugItemInfoUsageData$$serializer, 4);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("packageName", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("type", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("weight", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("percentage", false);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
        $stable = 8;
    }

    private SecretCommandHelper$runCommandInternal$DebugItemInfoUsageData$$serializer() {
    }

    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerZiNFA7KzVfc6 = zdV2BnlTiQeQ.ziNFA7KzVfc6(Gl8Ehe3l199fwoU53BVAGLsBEcSU.S1zP5M3X7Ukq3ROlZ87G9I);
        KSerializer kSerializerZiNFA7KzVfc7 = zdV2BnlTiQeQ.ziNFA7KzVfc6(dBjj8dRBlsNpBvfB0d120r2.S1zP5M3X7Ukq3ROlZ87G9I);
        iFFK8uDMEVqVo iffk8udmevqvo = iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I;
        return new KSerializer[]{iffk8udmevqvo, iffk8udmevqvo, kSerializerZiNFA7KzVfc6, kSerializerZiNFA7KzVfc7};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SecretCommandHelper$runCommandInternal$DebugItemInfoUsageData deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        boolean z = true;
        int i = 0;
        String strWT8HZhEwPEkG = null;
        String strWT8HZhEwPEkG2 = null;
        Integer num = null;
        Double d = null;
        while (z) {
            int iCS9Klw57l26qfkpcMlfmpU = nrflsjiodcr850bqbBezslBgjveK3hODH.cS9Klw57l26qfkpcMlfmpU(serialDescriptor);
            if (iCS9Klw57l26qfkpcMlfmpU == -1) {
                z = false;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 0) {
                strWT8HZhEwPEkG = nrflsjiodcr850bqbBezslBgjveK3hODH.WT8HZhEwPEkG(serialDescriptor, 0);
                i |= 1;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 1) {
                strWT8HZhEwPEkG2 = nrflsjiodcr850bqbBezslBgjveK3hODH.WT8HZhEwPEkG(serialDescriptor, 1);
                i |= 2;
            } else if (iCS9Klw57l26qfkpcMlfmpU == 2) {
                num = (Integer) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 2, Gl8Ehe3l199fwoU53BVAGLsBEcSU.S1zP5M3X7Ukq3ROlZ87G9I, num);
                i |= 4;
            } else {
                if (iCS9Klw57l26qfkpcMlfmpU != 3) {
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return null;
                }
                d = (Double) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 3, dBjj8dRBlsNpBvfB0d120r2.S1zP5M3X7Ukq3ROlZ87G9I, d);
                i |= 8;
            }
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new SecretCommandHelper$runCommandInternal$DebugItemInfoUsageData(i, strWT8HZhEwPEkG, strWT8HZhEwPEkG2, num, d);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SecretCommandHelper$runCommandInternal$DebugItemInfoUsageData secretCommandHelper$runCommandInternal$DebugItemInfoUsageData) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Rdzg08aYlt0UsoLUNug9cESzgAY9R(serialDescriptor, 0, secretCommandHelper$runCommandInternal$DebugItemInfoUsageData.S1zP5M3X7Ukq3ROlZ87G9I);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Rdzg08aYlt0UsoLUNug9cESzgAY9R(serialDescriptor, 1, secretCommandHelper$runCommandInternal$DebugItemInfoUsageData.axL8FocTDLUdzg0XScbO);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 2, Gl8Ehe3l199fwoU53BVAGLsBEcSU.S1zP5M3X7Ukq3ROlZ87G9I, secretCommandHelper$runCommandInternal$DebugItemInfoUsageData.BezslBgjveK3hODH);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 3, dBjj8dRBlsNpBvfB0d120r2.S1zP5M3X7Ukq3ROlZ87G9I, secretCommandHelper$runCommandInternal$DebugItemInfoUsageData.ziNFA7KzVfc6);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
