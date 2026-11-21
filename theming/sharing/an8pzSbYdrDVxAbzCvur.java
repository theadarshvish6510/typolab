package bitpit.launcher.theming.sharing;

import b.LTC5BQy9XspuFiw;
import b.aJLiMmqfPh61r;
import b.nXCqkIgElhEtQLnIIyiqEb64Wlgp;
import java.util.Collections;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class an8pzSbYdrDVxAbzCvur implements KSerializer {
    public static final SerialDescriptor BezslBgjveK3hODH;
    public static final an8pzSbYdrDVxAbzCvur S1zP5M3X7Ukq3ROlZ87G9I = new an8pzSbYdrDVxAbzCvur();
    public static final KSerializer axL8FocTDLUdzg0XScbO;

    static {
        KSerializer kSerializerSerializer = WallpaperSurrogate.Companion.serializer();
        axL8FocTDLUdzg0XScbO = kSerializerSerializer;
        BezslBgjveK3hODH = kSerializerSerializer.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        WallpaperSurrogate wallpaperSurrogate = (WallpaperSurrogate) axL8FocTDLUdzg0XScbO.deserialize(decoder);
        String str = wallpaperSurrogate.S1zP5M3X7Ukq3ROlZ87G9I;
        String str2 = wallpaperSurrogate.axL8FocTDLUdzg0XScbO;
        int iHashCode = str.hashCode();
        if (iHashCode != -1741312354) {
            if (iHashCode != 3143036) {
                if (iHashCode == 110327241 && str.equals("theme")) {
                    if (str2 != null) {
                        return new SharedTheme$Wallpaper$Niagara$Theme(str2);
                    }
                    throw new MissingFieldException(Collections.singletonList("id"), "Wallpaper.Niagara.Theme");
                }
            } else if (str.equals("file")) {
                byte[] bArr = wallpaperSurrogate.BezslBgjveK3hODH;
                if (bArr != null) {
                    return new SharedTheme$Wallpaper$File(bArr);
                }
                throw new MissingFieldException(Collections.singletonList("data"), "Wallpaper.File");
            }
        } else if (str.equals("collection")) {
            if (str2 != null) {
                return new SharedTheme$Wallpaper$Niagara$WallpaperCollection(str2);
            }
            throw new MissingFieldException(Collections.singletonList("id"), "Wallpaper.Niagara.WallpaperCollection");
        }
        throw new SerializationException(aJLiMmqfPh61r.flPMk2Ix9h3b95v("Unknown Wallpaper type: '", wallpaperSurrogate.S1zP5M3X7Ukq3ROlZ87G9I, "'"));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return BezslBgjveK3hODH;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        WallpaperSurrogate wallpaperSurrogate;
        nXCqkIgElhEtQLnIIyiqEb64Wlgp nxcqkigelhetqlniiyiqeb64wlgp = (nXCqkIgElhEtQLnIIyiqEb64Wlgp) obj;
        if (nxcqkigelhetqlniiyiqeb64wlgp instanceof SharedTheme$Wallpaper$File) {
            wallpaperSurrogate = new WallpaperSurrogate("file", (String) null, ((SharedTheme$Wallpaper$File) nxcqkigelhetqlniiyiqeb64wlgp).S1zP5M3X7Ukq3ROlZ87G9I, 2);
        } else if (nxcqkigelhetqlniiyiqeb64wlgp instanceof SharedTheme$Wallpaper$Niagara$Theme) {
            wallpaperSurrogate = new WallpaperSurrogate("theme", ((SharedTheme$Wallpaper$Niagara$Theme) nxcqkigelhetqlniiyiqeb64wlgp).S1zP5M3X7Ukq3ROlZ87G9I, (byte[]) null, 4);
        } else {
            if (!(nxcqkigelhetqlniiyiqeb64wlgp instanceof SharedTheme$Wallpaper$Niagara$WallpaperCollection)) {
                LTC5BQy9XspuFiw.axL8FocTDLUdzg0XScbO();
                return;
            }
            wallpaperSurrogate = new WallpaperSurrogate("collection", ((SharedTheme$Wallpaper$Niagara$WallpaperCollection) nxcqkigelhetqlniiyiqeb64wlgp).S1zP5M3X7Ukq3ROlZ87G9I, (byte[]) null, 4);
        }
        axL8FocTDLUdzg0XScbO.serialize(encoder, wallpaperSurrogate);
    }
}
