package bitpit.launcher.theming.sharing;

import b.GcGct2MUjTurFIWwZyToV;
import b.M5ZW8ThjzDgV;
import b.QJmLMy74NwphhvC;
import b.iFFK8uDMEVqVo;
import b.qJbD6jRb3f7;
import b.vw29bUfQvZw2cZjSs44q6UBiq;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
@QJmLMy74NwphhvC
public final /* synthetic */ class SharedTheme$RgbHexString$$serializer implements qJbD6jRb3f7 {
    public static final int $stable;
    public static final SharedTheme$RgbHexString$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SharedTheme$RgbHexString$$serializer sharedTheme$RgbHexString$$serializer = new SharedTheme$RgbHexString$$serializer();
        INSTANCE = sharedTheme$RgbHexString$$serializer;
        vw29bUfQvZw2cZjSs44q6UBiq vw29bufqvzw2czjss44q6ubiq = new vw29bUfQvZw2cZjSs44q6UBiq("bitpit.launcher.theming.sharing.SharedTheme.RgbHexString", sharedTheme$RgbHexString$$serializer);
        vw29bufqvzw2czjss44q6ubiq.ToEIy0qfkltfGfO3vmAQG("value", false);
        descriptor = vw29bufqvzw2czjss44q6ubiq;
        $stable = 8;
    }

    private SharedTheme$RgbHexString$$serializer() {
    }

    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{iFFK8uDMEVqVo.S1zP5M3X7Ukq3ROlZ87G9I};
    }

    @Override // kotlinx.serialization.KSerializer
    public /* synthetic */ Object deserialize(Decoder decoder) {
        return new GcGct2MUjTurFIWwZyToV(m24deserializexSaWz4I(decoder));
    }

    /* JADX INFO: renamed from: deserialize-xSaWz4I, reason: not valid java name */
    public final String m24deserializexSaWz4I(Decoder decoder) {
        return decoder.Rdzg08aYlt0UsoLUNug9cESzgAY9R(descriptor).H5sQ15nhYoaKKHhx();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m25serializefEQpxn8(encoder, ((GcGct2MUjTurFIWwZyToV) obj).S1zP5M3X7Ukq3ROlZ87G9I);
    }

    /* JADX INFO: renamed from: serialize-fEQpxn8, reason: not valid java name */
    public final void m25serializefEQpxn8(Encoder encoder, String str) {
        encoder.sCPtafveBAhdLIs2ajN3WV(descriptor).tdNmBZIJHG1(str);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
