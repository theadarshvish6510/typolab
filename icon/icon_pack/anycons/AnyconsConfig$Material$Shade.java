package bitpit.launcher.icon.icon_pack.anycons;

import b.HlaGpRWB5yh0EgeuCV;
import b.sKhRxlrK0uZQTcvTyLdO1CgQhofD6;
import bitpit.launcher.R;

/* JADX INFO: loaded from: classes.dex */
public enum AnyconsConfig$Material$Shade implements AnyconsConfig$AnyconsVariant {
    LIGHT("pastel", R.string.anycons_material_shade_light),
    VIVID("vibrant", R.string.anycons_material_shade_vivid),
    DARK("dark", R.string.anycons_material_shade_dark);

    private static final /* synthetic */ HlaGpRWB5yh0EgeuCV $ENTRIES = new sKhRxlrK0uZQTcvTyLdO1CgQhofD6(values());
    private final int nameRes;
    private final String serialized;

    AnyconsConfig$Material$Shade(String str, int i) {
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
