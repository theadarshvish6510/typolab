package bitpit.launcher.backend.analytics.usage.model;

import b.DY7rAMiwL4GxJalIAuGPP4NEMDd;
import b.Gl8Ehe3l199fwoU53BVAGLsBEcSU;
import b.M5ZW8ThjzDgV;
import b.OkhdZkC3NYLW;
import b.Q1EVKexo2yndu3vM8gAwRGSPg;
import b.QJmLMy74NwphhvC;
import b.a9kWzoj6D3Yoa0;
import b.eUwPamJ8sGfSyqS5ucd4;
import b.iFFK8uDMEVqVo;
import b.mHW63SUma8isGb;
import b.nelx5QXMyOjGbNm0aVhnj4x8qWdi;
import b.nrFLsJiodCR850bQB;
import b.o76yCzyy4hCTs9LzjVpiAs;
import b.qJbD6jRb3f7;
import b.rXX7u5bn2nCB6ANmnDyddVU4zbm;
import b.zdV2BnlTiQeQ;
import java.util.List;
import java.util.UUID;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
@QJmLMy74NwphhvC
public /* synthetic */ class UsageReport$$serializer implements qJbD6jRb3f7 {
    public static final UsageReport$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        UsageReport$$serializer usageReport$$serializer = new UsageReport$$serializer();
        INSTANCE = usageReport$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("bitpit.launcher.backend.analytics.usage.model.UsageReport", usageReport$$serializer, 16);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("usageId", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("versionCode", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("uploadTime", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("startTime", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("endTime", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("timeZoneOffset", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("country", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("androidSdkVersion", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("deviceManufacturer", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("deviceModel", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("flags", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("feedEntries", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("launches", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("notifications", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("activities", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("surveyResponses", true);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
    }

    private UsageReport$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        mHW63SUma8isGb[] mhw63suma8isgbArr = UsageReport.Bk6w7oZjoWt9ZSRs4C7jIhbX3;
        Gl8Ehe3l199fwoU53BVAGLsBEcSU gl8Ehe3l199fwoU53BVAGLsBEcSU = Gl8Ehe3l199fwoU53BVAGLsBEcSU.S1zP5M3X7Ukq3ROlZ87G9I;
        DY7rAMiwL4GxJalIAuGPP4NEMDd dY7rAMiwL4GxJalIAuGPP4NEMDd = DY7rAMiwL4GxJalIAuGPP4NEMDd.S1zP5M3X7Ukq3ROlZ87G9I;
        iFFK8uDMEVqVo iffk8udmevqvo = iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I;
        return new KSerializer[]{Q1EVKexo2yndu3vM8gAwRGSPg.S1zP5M3X7Ukq3ROlZ87G9I, gl8Ehe3l199fwoU53BVAGLsBEcSU, dY7rAMiwL4GxJalIAuGPP4NEMDd, dY7rAMiwL4GxJalIAuGPP4NEMDd, dY7rAMiwL4GxJalIAuGPP4NEMDd, gl8Ehe3l199fwoU53BVAGLsBEcSU, zdV2BnlTiQeQ.ziNFA7KzVfc6((KSerializer) mhw63suma8isgbArr[6].getValue()), zdV2BnlTiQeQ.ziNFA7KzVfc6(gl8Ehe3l199fwoU53BVAGLsBEcSU), zdV2BnlTiQeQ.ziNFA7KzVfc6(iffk8udmevqvo), zdV2BnlTiQeQ.ziNFA7KzVfc6(iffk8udmevqvo), gl8Ehe3l199fwoU53BVAGLsBEcSU, mhw63suma8isgbArr[11].getValue(), mhw63suma8isgbArr[12].getValue(), mhw63suma8isgbArr[13].getValue(), mhw63suma8isgbArr[14].getValue(), mhw63suma8isgbArr[15].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final UsageReport deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = UsageReport.Bk6w7oZjoWt9ZSRs4C7jIhbX3;
        long jPQQPeCDD0JLCT3aLz = 0;
        long jPQQPeCDD0JLCT3aLz2 = 0;
        long jPQQPeCDD0JLCT3aLz3 = 0;
        List list = null;
        List list2 = null;
        List list3 = null;
        String str = null;
        List list4 = null;
        String str2 = null;
        Integer num = null;
        int i = 0;
        UUID uuid = null;
        String str3 = null;
        List list5 = null;
        int iFlPMk2Ix9h3b95v = 0;
        boolean z = true;
        int iFlPMk2Ix9h3b95v2 = 0;
        int iFlPMk2Ix9h3b95v3 = 0;
        while (z) {
            int iCS9Klw57l26qfkpcMlfmpU = nrflsjiodcr850bqbBezslBgjveK3hODH.cS9Klw57l26qfkpcMlfmpU(serialDescriptor);
            switch (iCS9Klw57l26qfkpcMlfmpU) {
                case -1:
                    jPQQPeCDD0JLCT3aLz = jPQQPeCDD0JLCT3aLz;
                    z = false;
                    jPQQPeCDD0JLCT3aLz = jPQQPeCDD0JLCT3aLz;
                    break;
                case 0:
                    uuid = (UUID) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 0, Q1EVKexo2yndu3vM8gAwRGSPg.S1zP5M3X7Ukq3ROlZ87G9I, uuid);
                    i |= 1;
                    iFlPMk2Ix9h3b95v = iFlPMk2Ix9h3b95v;
                    jPQQPeCDD0JLCT3aLz = jPQQPeCDD0JLCT3aLz;
                    break;
                case 1:
                    jPQQPeCDD0JLCT3aLz = jPQQPeCDD0JLCT3aLz;
                    i |= 2;
                    iFlPMk2Ix9h3b95v = nrflsjiodcr850bqbBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 1);
                    jPQQPeCDD0JLCT3aLz = jPQQPeCDD0JLCT3aLz;
                    break;
                case 2:
                    jPQQPeCDD0JLCT3aLz3 = nrflsjiodcr850bqbBezslBgjveK3hODH.PQQPeCDD0JLCT3aLz(serialDescriptor, 2);
                    i |= 4;
                    iFlPMk2Ix9h3b95v = iFlPMk2Ix9h3b95v;
                    break;
                case 3:
                    jPQQPeCDD0JLCT3aLz = nrflsjiodcr850bqbBezslBgjveK3hODH.PQQPeCDD0JLCT3aLz(serialDescriptor, 3);
                    i |= 8;
                    iFlPMk2Ix9h3b95v = iFlPMk2Ix9h3b95v;
                    break;
                case 4:
                    jPQQPeCDD0JLCT3aLz2 = nrflsjiodcr850bqbBezslBgjveK3hODH.PQQPeCDD0JLCT3aLz(serialDescriptor, 4);
                    i |= 16;
                    iFlPMk2Ix9h3b95v = iFlPMk2Ix9h3b95v;
                    break;
                case 5:
                    iFlPMk2Ix9h3b95v2 = nrflsjiodcr850bqbBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 5);
                    i |= 32;
                    iFlPMk2Ix9h3b95v = iFlPMk2Ix9h3b95v;
                    break;
                case 6:
                    eUwPamJ8sGfSyqS5ucd4 euwpamj8sgfsyqs5ucd4 = (eUwPamJ8sGfSyqS5ucd4) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 6, (KSerializer) mhw63suma8isgbArr[6].getValue(), str2 != null ? new eUwPamJ8sGfSyqS5ucd4(str2) : null);
                    str2 = euwpamj8sgfsyqs5ucd4 != null ? euwpamj8sgfsyqs5ucd4.S1zP5M3X7Ukq3ROlZ87G9I : null;
                    i |= 64;
                    iFlPMk2Ix9h3b95v = iFlPMk2Ix9h3b95v;
                    jPQQPeCDD0JLCT3aLz = jPQQPeCDD0JLCT3aLz;
                    break;
                case 7:
                    num = (Integer) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 7, Gl8Ehe3l199fwoU53BVAGLsBEcSU.S1zP5M3X7Ukq3ROlZ87G9I, num);
                    i |= 128;
                    iFlPMk2Ix9h3b95v = iFlPMk2Ix9h3b95v;
                    jPQQPeCDD0JLCT3aLz = jPQQPeCDD0JLCT3aLz;
                    break;
                case 8:
                    str3 = (String) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 8, iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, str3);
                    i |= 256;
                    iFlPMk2Ix9h3b95v = iFlPMk2Ix9h3b95v;
                    jPQQPeCDD0JLCT3aLz = jPQQPeCDD0JLCT3aLz;
                    break;
                case 9:
                    str = (String) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 9, iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, str);
                    i |= 512;
                    iFlPMk2Ix9h3b95v = iFlPMk2Ix9h3b95v;
                    jPQQPeCDD0JLCT3aLz = jPQQPeCDD0JLCT3aLz;
                    break;
                case 10:
                    iFlPMk2Ix9h3b95v3 = nrflsjiodcr850bqbBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 10);
                    i |= 1024;
                    iFlPMk2Ix9h3b95v = iFlPMk2Ix9h3b95v;
                    break;
                case 11:
                    list3 = (List) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 11, (KSerializer) mhw63suma8isgbArr[11].getValue(), list3);
                    i |= 2048;
                    iFlPMk2Ix9h3b95v = iFlPMk2Ix9h3b95v;
                    jPQQPeCDD0JLCT3aLz = jPQQPeCDD0JLCT3aLz;
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    list2 = (List) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 12, (KSerializer) mhw63suma8isgbArr[12].getValue(), list2);
                    i |= 4096;
                    iFlPMk2Ix9h3b95v = iFlPMk2Ix9h3b95v;
                    jPQQPeCDD0JLCT3aLz = jPQQPeCDD0JLCT3aLz;
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    list = (List) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 13, (KSerializer) mhw63suma8isgbArr[13].getValue(), list);
                    i |= 8192;
                    iFlPMk2Ix9h3b95v = iFlPMk2Ix9h3b95v;
                    jPQQPeCDD0JLCT3aLz = jPQQPeCDD0JLCT3aLz;
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    list4 = (List) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 14, (KSerializer) mhw63suma8isgbArr[14].getValue(), list4);
                    i |= 16384;
                    iFlPMk2Ix9h3b95v = iFlPMk2Ix9h3b95v;
                    jPQQPeCDD0JLCT3aLz = jPQQPeCDD0JLCT3aLz;
                    break;
                case 15:
                    list5 = (List) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 15, (KSerializer) mhw63suma8isgbArr[15].getValue(), list5);
                    i |= 32768;
                    iFlPMk2Ix9h3b95v = iFlPMk2Ix9h3b95v;
                    jPQQPeCDD0JLCT3aLz = jPQQPeCDD0JLCT3aLz;
                    break;
                default:
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return null;
            }
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new UsageReport(i, uuid, iFlPMk2Ix9h3b95v, jPQQPeCDD0JLCT3aLz3, jPQQPeCDD0JLCT3aLz, jPQQPeCDD0JLCT3aLz2, iFlPMk2Ix9h3b95v2, str2, num, str3, str, iFlPMk2Ix9h3b95v3, list3, list2, list, list4, list5);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, UsageReport usageReport) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = UsageReport.Bk6w7oZjoWt9ZSRs4C7jIhbX3;
        UUID uuid = usageReport.S1zP5M3X7Ukq3ROlZ87G9I;
        List list = usageReport.Ql6q60SSx3;
        List list2 = usageReport.sBV5EuS0mGuEYqc5nc5erhuwb1OG7;
        List list3 = usageReport.HveD9n1tOYlffjJDxghBitYNgB;
        List list4 = usageReport.H5sQ15nhYoaKKHhx;
        List list5 = usageReport.ToEIy0qfkltfGfO3vmAQG;
        String str = usageReport.flPMk2Ix9h3b95v;
        String str2 = usageReport.LYcdI4xpry8eXmFC9I4wyaLdcG1z;
        Integer num = usageReport.JY5knQmh7EQJEZ;
        String str3 = usageReport.PQQPeCDD0JLCT3aLz;
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 0, Q1EVKexo2yndu3vM8gAwRGSPg.S1zP5M3X7Ukq3ROlZ87G9I, uuid);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Ql6q60SSx3(1, usageReport.axL8FocTDLUdzg0XScbO, serialDescriptor);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.J1BE9tYH1em4X1uAhc6L7f4M(serialDescriptor, 2, usageReport.BezslBgjveK3hODH);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.J1BE9tYH1em4X1uAhc6L7f4M(serialDescriptor, 3, usageReport.ziNFA7KzVfc6);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.J1BE9tYH1em4X1uAhc6L7f4M(serialDescriptor, 4, usageReport.Aboow6rUrcY2SrFRa46C6uy);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Ql6q60SSx3(5, usageReport.ox9eclwMpRd, serialDescriptor);
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || str3 != null) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 6, (KSerializer) mhw63suma8isgbArr[6].getValue(), str3 != null ? new eUwPamJ8sGfSyqS5ucd4(str3) : null);
        }
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || num != null) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 7, Gl8Ehe3l199fwoU53BVAGLsBEcSU.S1zP5M3X7Ukq3ROlZ87G9I, num);
        }
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || str2 != null) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 8, iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, str2);
        }
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || str != null) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 9, iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, str);
        }
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Ql6q60SSx3(10, usageReport.fXBtMGfTIjGSHgK542, serialDescriptor);
        boolean zFzogU2bPCQtD6a1hMYB1kyti = nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti();
        a9kWzoj6D3Yoa0 a9kwzoj6d3yoa0 = a9kWzoj6D3Yoa0.GO8WUug7ZWFCUI1zY;
        if (zFzogU2bPCQtD6a1hMYB1kyti || !OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(list5, a9kwzoj6d3yoa0)) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 11, (KSerializer) mhw63suma8isgbArr[11].getValue(), list5);
        }
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || !OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(list4, a9kwzoj6d3yoa0)) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 12, (KSerializer) mhw63suma8isgbArr[12].getValue(), list4);
        }
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || !OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(list3, a9kwzoj6d3yoa0)) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 13, (KSerializer) mhw63suma8isgbArr[13].getValue(), list3);
        }
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || !OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(list2, a9kwzoj6d3yoa0)) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 14, (KSerializer) mhw63suma8isgbArr[14].getValue(), list2);
        }
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || !OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(list, a9kwzoj6d3yoa0)) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 15, (KSerializer) mhw63suma8isgbArr[15].getValue(), list);
        }
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
