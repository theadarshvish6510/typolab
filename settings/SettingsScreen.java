package bitpit.launcher.settings;

import b.HlaGpRWB5yh0EgeuCV;
import b.nmXVdLD3wuhaqezxBBvorxOjwLT;
import b.sKhRxlrK0uZQTcvTyLdO1CgQhofD6;

/* JADX INFO: loaded from: classes.dex */
public enum SettingsScreen implements nmXVdLD3wuhaqezxBBvorxOjwLT {
    ROOT("screen_root"),
    PRODUCTIVITY("screen_feature"),
    THEMES("screen_themes"),
    HELP_AND_FEEDBACK("screen_help"),
    COMMUNITY("screen_community"),
    ADVANCED("screen_advanced");

    private static final /* synthetic */ HlaGpRWB5yh0EgeuCV $ENTRIES = new sKhRxlrK0uZQTcvTyLdO1CgQhofD6(values());
    private final String key;
    private final String serialized;

    SettingsScreen(String str) {
        this.key = str;
        this.serialized = str;
    }

    public static HlaGpRWB5yh0EgeuCV getEntries() {
        return $ENTRIES;
    }

    public final String getKey() {
        return this.key;
    }

    @Override // b.nmXVdLD3wuhaqezxBBvorxOjwLT
    public String getSerialized() {
        return this.serialized;
    }
}
