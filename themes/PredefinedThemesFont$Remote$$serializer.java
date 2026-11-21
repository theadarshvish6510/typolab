package bitpit.launcher.themes;

import b.LyQ0jSODlYeW5DOmKU9Ue2;
import b.M5ZW8ThjzDgV;
import b.QJmLMy74NwphhvC;
import b.qJbD6jRb3f7;
import b.vw29bUfQvZw2cZjSs44q6UBiq;
import bitpit.launcher.text.RemoteFont;
import bitpit.launcher.text.RemoteFont$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
@QJmLMy74NwphhvC
public final /* synthetic */ class PredefinedThemesFont$Remote$$serializer implements qJbD6jRb3f7 {
    public static final int $stable;
    public static final PredefinedThemesFont$Remote$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PredefinedThemesFont$Remote$$serializer predefinedThemesFont$Remote$$serializer = new PredefinedThemesFont$Remote$$serializer();
        INSTANCE = predefinedThemesFont$Remote$$serializer;
        vw29bUfQvZw2cZjSs44q6UBiq vw29bufqvzw2czjss44q6ubiq = new vw29bUfQvZw2cZjSs44q6UBiq("remote", predefinedThemesFont$Remote$$serializer);
        vw29bufqvzw2czjss44q6ubiq.ToEIy0qfkltfGfO3vmAQG("value", false);
        descriptor = vw29bufqvzw2czjss44q6ubiq;
        $stable = 8;
    }

    private PredefinedThemesFont$Remote$$serializer() {
    }

    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{RemoteFont$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer
    public /* synthetic */ Object deserialize(Decoder decoder) {
        return new LyQ0jSODlYeW5DOmKU9Ue2(m20deserializeGGdaYO0(decoder));
    }

    /* JADX INFO: renamed from: deserialize-GGdaYO0 */
    public final RemoteFont m20deserializeGGdaYO0(Decoder decoder) {
        return (RemoteFont) decoder.Rdzg08aYlt0UsoLUNug9cESzgAY9R(descriptor).caTQCiA8tNnV(RemoteFont$$serializer.INSTANCE);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m21serializelZemYwA(encoder, ((LyQ0jSODlYeW5DOmKU9Ue2) obj).S1zP5M3X7Ukq3ROlZ87G9I);
    }

    /* JADX INFO: renamed from: serialize-lZemYwA */
    public final void m21serializelZemYwA(Encoder encoder, RemoteFont remoteFont) {
        encoder.sCPtafveBAhdLIs2ajN3WV(descriptor).Mej0x2K4ZGSUxtYNka4QZ(RemoteFont$$serializer.INSTANCE, remoteFont);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
