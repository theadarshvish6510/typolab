package bitpit.launcher.theming.sharing;

import b.CPoyWHoBAtUivR1jL;
import b.M5ZW8ThjzDgV;
import b.QJmLMy74NwphhvC;
import b.qJbD6jRb3f7;
import b.vSNKvya7RsAhuSv;
import b.vw29bUfQvZw2cZjSs44q6UBiq;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
@QJmLMy74NwphhvC
public final /* synthetic */ class SharedTheme$TopPadding$$serializer implements qJbD6jRb3f7 {
    public static final int $stable;
    public static final SharedTheme$TopPadding$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SharedTheme$TopPadding$$serializer sharedTheme$TopPadding$$serializer = new SharedTheme$TopPadding$$serializer();
        INSTANCE = sharedTheme$TopPadding$$serializer;
        vw29bUfQvZw2cZjSs44q6UBiq vw29bufqvzw2czjss44q6ubiq = new vw29bUfQvZw2cZjSs44q6UBiq("bitpit.launcher.theming.sharing.SharedTheme.TopPadding", sharedTheme$TopPadding$$serializer);
        vw29bufqvzw2czjss44q6ubiq.ToEIy0qfkltfGfO3vmAQG("percentage", false);
        descriptor = vw29bufqvzw2czjss44q6ubiq;
        $stable = 8;
    }

    private SharedTheme$TopPadding$$serializer() {
    }

    @Override // b.qJbD6jRb3f7
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{vSNKvya7RsAhuSv.S1zP5M3X7Ukq3ROlZ87G9I};
    }

    @Override // kotlinx.serialization.KSerializer
    public /* synthetic */ Object deserialize(Decoder decoder) {
        return new CPoyWHoBAtUivR1jL(m26deserialize32Q9h4g(decoder));
    }

    /* JADX INFO: renamed from: deserialize-32Q9h4g */
    public final float m26deserialize32Q9h4g(Decoder decoder) {
        return decoder.Rdzg08aYlt0UsoLUNug9cESzgAY9R(descriptor).qaDSpeex0Oo1Qvt3oOrTJnbcQFp();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public /* synthetic */ void serialize(Encoder encoder, Object obj) {
        m27serializej96bXZA(encoder, ((CPoyWHoBAtUivR1jL) obj).S1zP5M3X7Ukq3ROlZ87G9I);
    }

    /* JADX INFO: renamed from: serialize-j96bXZA */
    public final void m27serializej96bXZA(Encoder encoder, float f) {
        encoder.sCPtafveBAhdLIs2ajN3WV(descriptor).Bk6w7oZjoWt9ZSRs4C7jIhbX3(f);
    }

    @Override // b.qJbD6jRb3f7
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return M5ZW8ThjzDgV.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
