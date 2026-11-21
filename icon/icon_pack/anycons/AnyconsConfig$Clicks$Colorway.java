package bitpit.launcher.icon.icon_pack.anycons;

import b.HlaGpRWB5yh0EgeuCV;
import b.sKhRxlrK0uZQTcvTyLdO1CgQhofD6;
import bitpit.launcher.R;

/* JADX INFO: loaded from: classes.dex */
public enum AnyconsConfig$Clicks$Colorway implements AnyconsConfig$AnyconsVariant {
    BACKLIT("backlit", R.string.anycons_clicks_colorway_backlit),
    DARK("dark", R.string.anycons_clicks_colorway_dark),
    GREEN("green", R.string.anycons_clicks_colorway_green),
    CREAM("cream", R.string.anycons_clicks_colorway_cream),
    APP_COLORS("app_colors", R.string.anycons_color_palette_app_colors);

    private static final /* synthetic */ HlaGpRWB5yh0EgeuCV $ENTRIES = new sKhRxlrK0uZQTcvTyLdO1CgQhofD6(values());
    private final int nameRes;
    private final String serialized;

    AnyconsConfig$Clicks$Colorway(String str, int i) {
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
