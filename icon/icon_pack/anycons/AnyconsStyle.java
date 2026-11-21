package bitpit.launcher.icon.icon_pack.anycons;

import b.HlaGpRWB5yh0EgeuCV;
import b.nmXVdLD3wuhaqezxBBvorxOjwLT;
import b.sKhRxlrK0uZQTcvTyLdO1CgQhofD6;

/* JADX INFO: loaded from: classes.dex */
public enum AnyconsStyle implements nmXVdLD3wuhaqezxBBvorxOjwLT {
    OUTLINE("outline"),
    MATERIAL("material"),
    STICKER("sticker"),
    MARBLE("marble"),
    WATERCOLOR("watercolor"),
    BRIGHT("bright"),
    Stellar("stellar"),
    OUTLINE_CHROMA("outline_chroma"),
    DOTS("dots"),
    DOODLE("doodle"),
    CLICKS("clicks");

    private static final /* synthetic */ HlaGpRWB5yh0EgeuCV $ENTRIES = new sKhRxlrK0uZQTcvTyLdO1CgQhofD6(values());
    private final String serialized;

    AnyconsStyle(String str) {
        this.serialized = str;
    }

    public static HlaGpRWB5yh0EgeuCV getEntries() {
        return $ENTRIES;
    }

    @Override // b.nmXVdLD3wuhaqezxBBvorxOjwLT
    public String getSerialized() {
        return this.serialized;
    }
}
