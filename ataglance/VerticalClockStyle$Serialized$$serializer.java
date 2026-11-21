package bitpit.launcher.ataglance;

import b.Gl8Ehe3l199fwoU53BVAGLsBEcSU;
import b.M5ZW8ThjzDgV;
import b.QJmLMy74NwphhvC;
import b.iFFK8uDMEVqVo;
import b.mHW63SUma8isGb;
import b.nelx5QXMyOjGbNm0aVhnj4x8qWdi;
import b.nrFLsJiodCR850bQB;
import b.o76yCzyy4hCTs9LzjVpiAs;
import b.qJbD6jRb3f7;
import b.rXX7u5bn2nCB6ANmnDyddVU4zbm;
import b.zdV2BnlTiQeQ;
import bitpit.launcher.ataglance.clock.VerticalClockView;
import bitpit.launcher.ataglance.clock.VerticalClockView$ColorPattern$$serializer;
import bitpit.launcher.text.RemoteFont;
import bitpit.launcher.text.RemoteFont$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
@QJmLMy74NwphhvC
public final /* synthetic */ class VerticalClockStyle$Serialized$$serializer implements qJbD6jRb3f7 {
    public static final int $stable;
    public static final VerticalClockStyle$Serialized$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        VerticalClockStyle$Serialized$$serializer verticalClockStyle$Serialized$$serializer = new VerticalClockStyle$Serialized$$serializer();
        INSTANCE = verticalClockStyle$Serialized$$serializer;
        rXX7u5bn2nCB6ANmnDyddVU4zbm rxx7u5bn2ncb6anmndyddvu4zbm = new rXX7u5bn2nCB6ANmnDyddVU4zbm("vertical_clock", verticalClockStyle$Serialized$$serializer, 10);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("uuid", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("info", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("font", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("clock_text_size", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("vertical_gap", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("horizontal_padding", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("bottom_padding", true);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("color_pattern", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("primary_color", false);
        rxx7u5bn2ncb6anmndyddvu4zbm.ToEIy0qfkltfGfO3vmAQG("secondary_color", false);
        descriptor = rxx7u5bn2ncb6anmndyddvu4zbm;
        $stable = 8;
    }

    private VerticalClockStyle$Serialized$$serializer() {
    }

    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        mHW63SUma8isGb[] mhw63suma8isgbArr = VerticalClockStyle$Serialized.fXBtMGfTIjGSHgK542;
        KSerializer kSerializerZiNFA7KzVfc6 = zdV2BnlTiQeQ.ziNFA7KzVfc6((KSerializer) mhw63suma8isgbArr[8].getValue());
        KSerializer kSerializerZiNFA7KzVfc7 = zdV2BnlTiQeQ.ziNFA7KzVfc6((KSerializer) mhw63suma8isgbArr[9].getValue());
        Gl8Ehe3l199fwoU53BVAGLsBEcSU gl8Ehe3l199fwoU53BVAGLsBEcSU = Gl8Ehe3l199fwoU53BVAGLsBEcSU.S1zP5M3X7Ukq3ROlZ87G9I;
        return new KSerializer[]{iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I, AtAGlanceInfo$$serializer.INSTANCE, RemoteFont$$serializer.INSTANCE, gl8Ehe3l199fwoU53BVAGLsBEcSU, gl8Ehe3l199fwoU53BVAGLsBEcSU, gl8Ehe3l199fwoU53BVAGLsBEcSU, gl8Ehe3l199fwoU53BVAGLsBEcSU, VerticalClockView$ColorPattern$$serializer.INSTANCE, kSerializerZiNFA7KzVfc6, kSerializerZiNFA7KzVfc7};
    }

    @Override // kotlinx.serialization.KSerializer
    public final VerticalClockStyle$Serialized deserialize(Decoder decoder) {
        mHW63SUma8isGb[] mhw63suma8isgbArr;
        SerialDescriptor serialDescriptor = descriptor;
        nrFLsJiodCR850bQB nrflsjiodcr850bqbBezslBgjveK3hODH = decoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr2 = VerticalClockStyle$Serialized.fXBtMGfTIjGSHgK542;
        qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz8 = null;
        qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz9 = null;
        boolean z = true;
        VerticalClockView.ColorPattern colorPattern = null;
        int i = 0;
        String strWT8HZhEwPEkG = null;
        AtAGlanceInfo atAGlanceInfo = null;
        RemoteFont remoteFont = null;
        int iFlPMk2Ix9h3b95v = 0;
        int iFlPMk2Ix9h3b95v2 = 0;
        int iFlPMk2Ix9h3b95v3 = 0;
        int iFlPMk2Ix9h3b95v4 = 0;
        while (z) {
            int iCS9Klw57l26qfkpcMlfmpU = nrflsjiodcr850bqbBezslBgjveK3hODH.cS9Klw57l26qfkpcMlfmpU(serialDescriptor);
            switch (iCS9Klw57l26qfkpcMlfmpU) {
                case -1:
                    mhw63suma8isgbArr = mhw63suma8isgbArr2;
                    z = false;
                    break;
                case 0:
                    mhw63suma8isgbArr = mhw63suma8isgbArr2;
                    strWT8HZhEwPEkG = nrflsjiodcr850bqbBezslBgjveK3hODH.WT8HZhEwPEkG(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    mhw63suma8isgbArr = mhw63suma8isgbArr2;
                    atAGlanceInfo = (AtAGlanceInfo) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 1, AtAGlanceInfo$$serializer.INSTANCE, atAGlanceInfo);
                    i |= 2;
                    break;
                case 2:
                    mhw63suma8isgbArr = mhw63suma8isgbArr2;
                    remoteFont = (RemoteFont) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 2, RemoteFont$$serializer.INSTANCE, remoteFont);
                    i |= 4;
                    break;
                case 3:
                    mhw63suma8isgbArr = mhw63suma8isgbArr2;
                    iFlPMk2Ix9h3b95v = nrflsjiodcr850bqbBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    mhw63suma8isgbArr = mhw63suma8isgbArr2;
                    iFlPMk2Ix9h3b95v2 = nrflsjiodcr850bqbBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    mhw63suma8isgbArr = mhw63suma8isgbArr2;
                    iFlPMk2Ix9h3b95v3 = nrflsjiodcr850bqbBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    mhw63suma8isgbArr = mhw63suma8isgbArr2;
                    iFlPMk2Ix9h3b95v4 = nrflsjiodcr850bqbBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    mhw63suma8isgbArr = mhw63suma8isgbArr2;
                    colorPattern = (VerticalClockView.ColorPattern) nrflsjiodcr850bqbBezslBgjveK3hODH.WIXlfFpvH7glAGsUk3(serialDescriptor, 7, VerticalClockView$ColorPattern$$serializer.INSTANCE, colorPattern);
                    i |= 128;
                    break;
                case 8:
                    mhw63suma8isgbArr = mhw63suma8isgbArr2;
                    qstjuxvi0yplnkz9 = (qsTJuxvI0Yplnkz8) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 8, (KSerializer) mhw63suma8isgbArr[8].getValue(), qstjuxvi0yplnkz9);
                    i |= 256;
                    break;
                case 9:
                    mhw63suma8isgbArr = mhw63suma8isgbArr2;
                    qstjuxvi0yplnkz8 = (qsTJuxvI0Yplnkz8) nrflsjiodcr850bqbBezslBgjveK3hODH.GO8WUug7ZWFCUI1zY(serialDescriptor, 9, (KSerializer) mhw63suma8isgbArr2[9].getValue(), qstjuxvi0yplnkz8);
                    i |= 512;
                    break;
                default:
                    o76yCzyy4hCTs9LzjVpiAs.JY5knQmh7EQJEZ(iCS9Klw57l26qfkpcMlfmpU);
                    return null;
            }
            mhw63suma8isgbArr2 = mhw63suma8isgbArr;
        }
        nrflsjiodcr850bqbBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
        return new VerticalClockStyle$Serialized(i, strWT8HZhEwPEkG, atAGlanceInfo, remoteFont, iFlPMk2Ix9h3b95v, iFlPMk2Ix9h3b95v2, iFlPMk2Ix9h3b95v3, iFlPMk2Ix9h3b95v4, colorPattern, qstjuxvi0yplnkz9, qstjuxvi0yplnkz8);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, VerticalClockStyle$Serialized verticalClockStyle$Serialized) {
        SerialDescriptor serialDescriptor = descriptor;
        nelx5QXMyOjGbNm0aVhnj4x8qWdi nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH = encoder.BezslBgjveK3hODH(serialDescriptor);
        mHW63SUma8isGb[] mhw63suma8isgbArr = VerticalClockStyle$Serialized.fXBtMGfTIjGSHgK542;
        String str = verticalClockStyle$Serialized.S1zP5M3X7Ukq3ROlZ87G9I;
        int i = verticalClockStyle$Serialized.PQQPeCDD0JLCT3aLz;
        int i2 = verticalClockStyle$Serialized.ox9eclwMpRd;
        int i3 = verticalClockStyle$Serialized.Aboow6rUrcY2SrFRa46C6uy;
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Rdzg08aYlt0UsoLUNug9cESzgAY9R(serialDescriptor, 0, str);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 1, AtAGlanceInfo$$serializer.INSTANCE, verticalClockStyle$Serialized.axL8FocTDLUdzg0XScbO);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 2, RemoteFont$$serializer.INSTANCE, verticalClockStyle$Serialized.BezslBgjveK3hODH);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Ql6q60SSx3(3, verticalClockStyle$Serialized.ziNFA7KzVfc6, serialDescriptor);
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || i3 != 8) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Ql6q60SSx3(4, i3, serialDescriptor);
        }
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || i2 != 4) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Ql6q60SSx3(5, i2, serialDescriptor);
        }
        if (nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.FzogU2bPCQtD6a1hMYB1kyti() || i != 4) {
            nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.Ql6q60SSx3(6, i, serialDescriptor);
        }
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.flPMk2Ix9h3b95v(serialDescriptor, 7, VerticalClockView$ColorPattern$$serializer.INSTANCE, verticalClockStyle$Serialized.JY5knQmh7EQJEZ);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 8, (KSerializer) mhw63suma8isgbArr[8].getValue(), verticalClockStyle$Serialized.LYcdI4xpry8eXmFC9I4wyaLdcG1z);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.cCmbv8Tzd2QLd161ImIZUlZ8n(serialDescriptor, 9, (KSerializer) mhw63suma8isgbArr[9].getValue(), verticalClockStyle$Serialized.flPMk2Ix9h3b95v);
        nelx5qxmyojgbnm0avhnj4x8qwdiBezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I(serialDescriptor);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
