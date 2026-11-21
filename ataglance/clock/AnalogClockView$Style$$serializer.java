package bitpit.launcher.ataglance.clock;

import b.FpPKuZSICRwmtnKMNyTFDH7cV;
import b.Gl8Ehe3l199fwoU53BVAGLsBEcSU;
import b.M5ZW8ThjzDgV;
import b.QJmLMy74NwphhvC;
import b.qJbD6jRb3f7;
import b.vw29bUfQvZw2cZjSs44q6UBiq;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
@QJmLMy74NwphhvC
public final /* synthetic */ class AnalogClockView$Style$$serializer implements qJbD6jRb3f7 {
    public static final int $stable;
    public static final AnalogClockView$Style$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AnalogClockView$Style$$serializer analogClockView$Style$$serializer = new AnalogClockView$Style$$serializer();
        INSTANCE = analogClockView$Style$$serializer;
        vw29bUfQvZw2cZjSs44q6UBiq vw29bufqvzw2czjss44q6ubiq = new vw29bUfQvZw2cZjSs44q6UBiq("bitpit.launcher.ataglance.clock.AnalogClockView.Style", analogClockView$Style$$serializer);
        vw29bufqvzw2czjss44q6ubiq.ToEIy0qfkltfGfO3vmAQG("flags", true);
        descriptor = vw29bufqvzw2czjss44q6ubiq;
        $stable = 8;
    }

    private AnalogClockView$Style$$serializer() {
    }

    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{Gl8Ehe3l199fwoU53BVAGLsBEcSU.S1zP5M3X7Ukq3ROlZ87G9I};
    }

    @Override // kotlinx.serialization.KSerializer
    public /* synthetic */ Object deserialize(Decoder decoder) {
        return new FpPKuZSICRwmtnKMNyTFDH7cV(m16deserializewoDyNuo(decoder));
    }

    /* JADX INFO: renamed from: deserialize-woDyNuo */
    public final int m16deserializewoDyNuo(Decoder decoder) {
        return decoder.Rdzg08aYlt0UsoLUNug9cESzgAY9R(descriptor).LYcdI4xpry8eXmFC9I4wyaLdcG1z();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m17serializeianRa9w(encoder, ((FpPKuZSICRwmtnKMNyTFDH7cV) obj).S1zP5M3X7Ukq3ROlZ87G9I);
    }

    /* JADX INFO: renamed from: serialize-ianRa9w */
    public final void m17serializeianRa9w(Encoder encoder, int i) {
        encoder.sCPtafveBAhdLIs2ajN3WV(descriptor).qaDSpeex0Oo1Qvt3oOrTJnbcQFp(i);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
