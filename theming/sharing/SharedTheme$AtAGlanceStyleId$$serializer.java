package bitpit.launcher.theming.sharing;

import b.M5ZW8ThjzDgV;
import b.QJmLMy74NwphhvC;
import b.iFFK8uDMEVqVo;
import b.lcIUX9fjr221Pd;
import b.qJbD6jRb3f7;
import b.vw29bUfQvZw2cZjSs44q6UBiq;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
@QJmLMy74NwphhvC
public final /* synthetic */ class SharedTheme$AtAGlanceStyleId$$serializer implements qJbD6jRb3f7 {
    public static final int $stable;
    public static final SharedTheme$AtAGlanceStyleId$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SharedTheme$AtAGlanceStyleId$$serializer sharedTheme$AtAGlanceStyleId$$serializer = new SharedTheme$AtAGlanceStyleId$$serializer();
        INSTANCE = sharedTheme$AtAGlanceStyleId$$serializer;
        vw29bUfQvZw2cZjSs44q6UBiq vw29bufqvzw2czjss44q6ubiq = new vw29bUfQvZw2cZjSs44q6UBiq("bitpit.launcher.theming.sharing.SharedTheme.AtAGlanceStyleId", sharedTheme$AtAGlanceStyleId$$serializer);
        vw29bufqvzw2czjss44q6ubiq.ToEIy0qfkltfGfO3vmAQG("uuidString", false);
        descriptor = vw29bufqvzw2czjss44q6ubiq;
        $stable = 8;
    }

    private SharedTheme$AtAGlanceStyleId$$serializer() {
    }

    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I};
    }

    @Override // kotlinx.serialization.KSerializer
    public /* synthetic */ Object deserialize(Decoder decoder) {
        return new lcIUX9fjr221Pd(m22deserializeE58Apo0(decoder));
    }

    /* JADX INFO: renamed from: deserialize-E58Apo0, reason: not valid java name */
    public final String m22deserializeE58Apo0(Decoder decoder) {
        return decoder.Rdzg08aYlt0UsoLUNug9cESzgAY9R(descriptor).H5sQ15nhYoaKKHhx();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m23serializegSchq6U(encoder, ((lcIUX9fjr221Pd) obj).S1zP5M3X7Ukq3ROlZ87G9I);
    }

    /* JADX INFO: renamed from: serialize-gSchq6U, reason: not valid java name */
    public final void m23serializegSchq6U(Encoder encoder, String str) {
        encoder.sCPtafveBAhdLIs2ajN3WV(descriptor).tdNmBZIJHG1(str);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
