package bitpit.launcher.icon.icon_pack.anycons;

import b.HlaGpRWB5yh0EgeuCV;
import b.sKhRxlrK0uZQTcvTyLdO1CgQhofD6;
import bitpit.launcher.R;

/* JADX INFO: loaded from: classes.dex */
public enum AnyconsConfig$Sticker$ColorPalette implements AnyconsConfig$AnyconsVariant {
    APP_COLORS("app_colors", R.string.anycons_color_palette_app_colors),
    CORAL("coral", R.string.anycons_color_palette_coral),
    OPAL("opal", R.string.anycons_color_palette_opal),
    THEME_COLORS("theme_colors", R.string.anycons_color_palette_theme_colors);

    private static final /* synthetic */ HlaGpRWB5yh0EgeuCV $ENTRIES = new sKhRxlrK0uZQTcvTyLdO1CgQhofD6(values());
    private final int nameRes;
    private final String serialized;

    AnyconsConfig$Sticker$ColorPalette(String str, int i) {
        this.serialized = str;
        this.nameRes = i;
    }

    public static HlaGpRWB5yh0EgeuCV getEntries() {
        return $ENTRIES;
    }

    @Override // bitpit.launcher.icon.icon_pack.anycons.AnyconsConfig$AnyconsVariant
    public int getNameRes() {
        return this.nameRes;
    }

    @Override // bitpit.launcher.icon.icon_pack.anycons.AnyconsConfig$AnyconsVariant, b.nmXVdLD3wuhaqezxBBvorxOjwLT
    public String getSerialized() {
        return this.serialized;
    }
}
