package bitpit.launcher.icon.icon_pack.anycons;

import b.HlaGpRWB5yh0EgeuCV;
import b.sKhRxlrK0uZQTcvTyLdO1CgQhofD6;
import bitpit.launcher.R;

/* JADX INFO: loaded from: classes.dex */
public enum AnyconsConfig$OutlineChroma$Thickness implements AnyconsConfig$AnyconsVariant {
    THIN("thin", R.string.anycons_material_line_thickness_thin),
    BOLD("thick", R.string.anycons_material_line_thickness_thick);

    private static final /* synthetic */ HlaGpRWB5yh0EgeuCV $ENTRIES = new sKhRxlrK0uZQTcvTyLdO1CgQhofD6(values());
    private final int nameRes;
    private final String serialized;

    AnyconsConfig$OutlineChroma$Thickness(String str, int i) {
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
