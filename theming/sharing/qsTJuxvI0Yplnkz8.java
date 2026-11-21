package bitpit.launcher.theming.sharing;

import b.LTC5BQy9XspuFiw;
import b.OkhdZkC3NYLW;
import b.aJLiMmqfPh61r;
import b.cBRnqJka9zlgT;
import java.util.Collections;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class qsTJuxvI0Yplnkz8 implements KSerializer {
    public static final SerialDescriptor BezslBgjveK3hODH;
    public static final qsTJuxvI0Yplnkz8 S1zP5M3X7Ukq3ROlZ87G9I = new qsTJuxvI0Yplnkz8();
    public static final KSerializer axL8FocTDLUdzg0XScbO;

    static {
        KSerializer kSerializerSerializer = FontSurrogate.Companion.serializer();
        axL8FocTDLUdzg0XScbO = kSerializerSerializer;
        BezslBgjveK3hODH = kSerializerSerializer.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        FontSurrogate fontSurrogate = (FontSurrogate) axL8FocTDLUdzg0XScbO.deserialize(decoder);
        String str = fontSurrogate.S1zP5M3X7Ukq3ROlZ87G9I;
        if (OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(str, "builtin")) {
            String str2 = fontSurrogate.axL8FocTDLUdzg0XScbO;
            if (str2 != null) {
                return new SharedTheme$Font$Niagara(str2);
            }
            throw new MissingFieldException(Collections.singletonList("id"), "Font.Niagara");
        }
        if (!OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(str, "file")) {
            throw new SerializationException(aJLiMmqfPh61r.flPMk2Ix9h3b95v("Unknown Font type: '", fontSurrogate.S1zP5M3X7Ukq3ROlZ87G9I, "'"));
        }
        String str3 = fontSurrogate.BezslBgjveK3hODH;
        if (str3 == null) {
            throw new MissingFieldException(Collections.singletonList("name"), "Font.File");
        }
        byte[] bArr = fontSurrogate.Aboow6rUrcY2SrFRa46C6uy;
        if (bArr == null) {
            throw new MissingFieldException(Collections.singletonList("data"), "Font.File");
        }
        Boolean bool = fontSurrogate.ziNFA7KzVfc6;
        return new SharedTheme$Font$File(str3, bool != null ? bool.booleanValue() : true, bArr);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return BezslBgjveK3hODH;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        FontSurrogate fontSurrogate;
        cBRnqJka9zlgT cbrnqjka9zlgt = (cBRnqJka9zlgT) obj;
        if (cbrnqjka9zlgt instanceof SharedTheme$Font$Niagara) {
            fontSurrogate = new FontSurrogate("builtin", ((SharedTheme$Font$Niagara) cbrnqjka9zlgt).S1zP5M3X7Ukq3ROlZ87G9I, (String) null, (Boolean) null, (byte[]) null, 28);
        } else if (!(cbrnqjka9zlgt instanceof SharedTheme$Font$File)) {
            LTC5BQy9XspuFiw.axL8FocTDLUdzg0XScbO();
            return;
        } else {
            SharedTheme$Font$File sharedTheme$Font$File = (SharedTheme$Font$File) cbrnqjka9zlgt;
            fontSurrogate = new FontSurrogate("file", (String) null, sharedTheme$Font$File.S1zP5M3X7Ukq3ROlZ87G9I, Boolean.valueOf(sharedTheme$Font$File.BezslBgjveK3hODH), sharedTheme$Font$File.axL8FocTDLUdzg0XScbO, 2);
        }
        axL8FocTDLUdzg0XScbO.serialize(encoder, fontSurrogate);
    }
}
