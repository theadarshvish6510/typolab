package bitpit.launcher.backend.push.fcm.model;

import b.M5ZW8ThjzDgV;
import b.QJmLMy74NwphhvC;
import b.XDn1uLM5AMS1;
import b.iFFK8uDMEVqVo;
import b.qJbD6jRb3f7;
import b.vw29bUfQvZw2cZjSs44q6UBiq;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
@QJmLMy74NwphhvC
public final /* synthetic */ class FcmToken$$serializer implements qJbD6jRb3f7 {
    public static final FcmToken$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        FcmToken$$serializer fcmToken$$serializer = new FcmToken$$serializer();
        INSTANCE = fcmToken$$serializer;
        vw29bUfQvZw2cZjSs44q6UBiq vw29bufqvzw2czjss44q6ubiq = new vw29bUfQvZw2cZjSs44q6UBiq("bitpit.launcher.backend.push.fcm.model.FcmToken", fcmToken$$serializer);
        vw29bufqvzw2czjss44q6ubiq.ToEIy0qfkltfGfO3vmAQG("token", false);
        descriptor = vw29bufqvzw2czjss44q6ubiq;
    }

    private FcmToken$$serializer() {
    }

    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I};
    }

    @Override // kotlinx.serialization.KSerializer
    public /* synthetic */ Object deserialize(Decoder decoder) {
        return new XDn1uLM5AMS1(m18deserializeQ0CfxVk(decoder));
    }

    /* JADX INFO: renamed from: deserialize-Q0CfxVk, reason: not valid java name */
    public final String m18deserializeQ0CfxVk(Decoder decoder) {
        return decoder.Rdzg08aYlt0UsoLUNug9cESzgAY9R(descriptor).H5sQ15nhYoaKKHhx();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m19serialize2o0IEGQ(encoder, ((XDn1uLM5AMS1) obj).S1zP5M3X7Ukq3ROlZ87G9I);
    }

    /* JADX INFO: renamed from: serialize-2o0IEGQ, reason: not valid java name */
    public final void m19serialize2o0IEGQ(Encoder encoder, String str) {
        encoder.sCPtafveBAhdLIs2ajN3WV(descriptor).tdNmBZIJHG1(str);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
