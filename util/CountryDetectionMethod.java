package bitpit.launcher.util;

import b.HlaGpRWB5yh0EgeuCV;
import b.nmXVdLD3wuhaqezxBBvorxOjwLT;
import b.sKhRxlrK0uZQTcvTyLdO1CgQhofD6;

/* JADX INFO: loaded from: classes.dex */
public enum CountryDetectionMethod implements nmXVdLD3wuhaqezxBBvorxOjwLT {
    GOOGLE_PLAY_SERVICES("g"),
    SIM("s"),
    NETWORK("n"),
    TIME_ZONE("t");

    private static final /* synthetic */ HlaGpRWB5yh0EgeuCV $ENTRIES = new sKhRxlrK0uZQTcvTyLdO1CgQhofD6(values());
    private final String serialized;

    CountryDetectionMethod(String str) {
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
