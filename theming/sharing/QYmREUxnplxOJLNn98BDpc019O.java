package bitpit.launcher.theming.sharing;

import b.LTC5BQy9XspuFiw;
import b.aJLiMmqfPh61r;
import b.gubhzHXeHIlbXrmRj5i9I;
import b.ttvfpMMiEF2T4RElgYAPdt;
import java.util.Collections;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class QYmREUxnplxOJLNn98BDpc019O implements KSerializer {
    public static final SerialDescriptor BezslBgjveK3hODH;
    public static final QYmREUxnplxOJLNn98BDpc019O S1zP5M3X7Ukq3ROlZ87G9I = new QYmREUxnplxOJLNn98BDpc019O();
    public static final KSerializer axL8FocTDLUdzg0XScbO;

    static {
        KSerializer kSerializerSerializer = IconPackSurrogate.Companion.serializer();
        axL8FocTDLUdzg0XScbO = kSerializerSerializer;
        BezslBgjveK3hODH = kSerializerSerializer.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        IconPackSurrogate iconPackSurrogate = (IconPackSurrogate) axL8FocTDLUdzg0XScbO.deserialize(decoder);
        String str = iconPackSurrogate.S1zP5M3X7Ukq3ROlZ87G9I;
        gubhzHXeHIlbXrmRj5i9I gubhzhxehilbxrmrj5i9i = iconPackSurrogate.ox9eclwMpRd;
        int i = iconPackSurrogate.Aboow6rUrcY2SrFRa46C6uy;
        int iHashCode = str.hashCode();
        if (iHashCode != -1820761141) {
            if (iHashCode != -887328209) {
                if (iHashCode == 230960163 && str.equals("builtin")) {
                    String str2 = iconPackSurrogate.axL8FocTDLUdzg0XScbO;
                    if (str2 != null) {
                        return new SharedTheme$IconPack$Niagara(str2, i, gubhzhxehilbxrmrj5i9i);
                    }
                    throw new MissingFieldException(Collections.singletonList("id"), "IconPack.Niagara");
                }
            } else if (str.equals("system")) {
                return new SharedTheme$IconPack$System(i, gubhzhxehilbxrmrj5i9i);
            }
        } else if (str.equals("external")) {
            String str3 = iconPackSurrogate.BezslBgjveK3hODH;
            if (str3 != null) {
                return new SharedTheme$IconPack$External(str3, iconPackSurrogate.ziNFA7KzVfc6, i, gubhzhxehilbxrmrj5i9i);
            }
            throw new MissingFieldException(Collections.singletonList("package"), "IconPack.External");
        }
        throw new SerializationException(aJLiMmqfPh61r.flPMk2Ix9h3b95v("Unknown IconPack type: '", iconPackSurrogate.S1zP5M3X7Ukq3ROlZ87G9I, "'"));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return BezslBgjveK3hODH;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        IconPackSurrogate iconPackSurrogate;
        ttvfpMMiEF2T4RElgYAPdt ttvfpmmief2t4relgyapdt = (ttvfpMMiEF2T4RElgYAPdt) obj;
        if (ttvfpmmief2t4relgyapdt instanceof SharedTheme$IconPack$Niagara) {
            SharedTheme$IconPack$Niagara sharedTheme$IconPack$Niagara = (SharedTheme$IconPack$Niagara) ttvfpmmief2t4relgyapdt;
            iconPackSurrogate = new IconPackSurrogate("builtin", sharedTheme$IconPack$Niagara.S1zP5M3X7Ukq3ROlZ87G9I, (String) null, (String) null, sharedTheme$IconPack$Niagara.axL8FocTDLUdzg0XScbO, sharedTheme$IconPack$Niagara.BezslBgjveK3hODH, 12);
        } else if (ttvfpmmief2t4relgyapdt instanceof SharedTheme$IconPack$External) {
            SharedTheme$IconPack$External sharedTheme$IconPack$External = (SharedTheme$IconPack$External) ttvfpmmief2t4relgyapdt;
            iconPackSurrogate = new IconPackSurrogate("external", (String) null, sharedTheme$IconPack$External.S1zP5M3X7Ukq3ROlZ87G9I, sharedTheme$IconPack$External.axL8FocTDLUdzg0XScbO, sharedTheme$IconPack$External.BezslBgjveK3hODH, sharedTheme$IconPack$External.ziNFA7KzVfc6, 2);
        } else if (!(ttvfpmmief2t4relgyapdt instanceof SharedTheme$IconPack$System)) {
            LTC5BQy9XspuFiw.axL8FocTDLUdzg0XScbO();
            return;
        } else {
            SharedTheme$IconPack$System sharedTheme$IconPack$System = (SharedTheme$IconPack$System) ttvfpmmief2t4relgyapdt;
            iconPackSurrogate = new IconPackSurrogate("system", (String) null, (String) null, (String) null, sharedTheme$IconPack$System.S1zP5M3X7Ukq3ROlZ87G9I, sharedTheme$IconPack$System.axL8FocTDLUdzg0XScbO, 14);
        }
        axL8FocTDLUdzg0XScbO.serialize(encoder, iconPackSurrogate);
    }
}
