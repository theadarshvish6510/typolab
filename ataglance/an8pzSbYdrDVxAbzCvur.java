package bitpit.launcher.ataglance;

import b.KjpLK4IQzcoI;
import bitpit.launcher.text.RemoteFont;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class an8pzSbYdrDVxAbzCvur {
    public static final FlipClockStyle$Serialized S1zP5M3X7Ukq3ROlZ87G9I;
    public static final List axL8FocTDLUdzg0XScbO;

    static {
        FlipClockStyle$Serialized flipClockStyle$Serialized = new FlipClockStyle$Serialized("46A6413A-885C-4622-8A9D-757B7920C2A5", new AtAGlanceInfo("flip_clock", "default"), new RemoteFont("manrope", 5), null, null);
        FlipClockStyle$Serialized flipClockStyle$Serialized2 = new FlipClockStyle$Serialized("69736148-3778-47AA-A47A-8888635E0813", new AtAGlanceInfo("flip_clock", "black"), new RemoteFont("manrope", 5), new AtAGlanceStyleColor$MaterialYouColor(AtAGlanceStyleColor$MaterialYouColor.Swatch.NEUTRAL1_0050), new AtAGlanceStyleColor$StaticColor());
        AtAGlanceInfo atAGlanceInfo = new AtAGlanceInfo("flip_clock", "colorful", Collections.singletonMap("color", "material_light"));
        RemoteFont remoteFont = new RemoteFont("manrope", 5);
        AtAGlanceStyleColor$PaletteColor.Palette palette = AtAGlanceStyleColor$PaletteColor.Palette.MATERIAL_LIGHT;
        FlipClockStyle$Serialized flipClockStyle$Serialized3 = new FlipClockStyle$Serialized("844FE340-2CD8-4E3C-82BD-16448F067134", atAGlanceInfo, remoteFont, new AtAGlanceStyleColor$PaletteColor(palette, AtAGlanceStyleColor$PaletteColor.Swatch.STROKE), new AtAGlanceStyleColor$PaletteColor(palette, AtAGlanceStyleColor$PaletteColor.Swatch.VIVID));
        S1zP5M3X7Ukq3ROlZ87G9I = flipClockStyle$Serialized3;
        axL8FocTDLUdzg0XScbO = KjpLK4IQzcoI.H5sQ15nhYoaKKHhx(flipClockStyle$Serialized, flipClockStyle$Serialized2, flipClockStyle$Serialized3);
    }
}
