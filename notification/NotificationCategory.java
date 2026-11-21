package bitpit.launcher.notification;

import b.HlaGpRWB5yh0EgeuCV;
import b.l6kXukUGq6NA6sWATDR;
import b.nmXVdLD3wuhaqezxBBvorxOjwLT;
import b.sKhRxlrK0uZQTcvTyLdO1CgQhofD6;
import ninja.sesame.lib.bridge.v1.ActionCategory;

/* JADX INFO: loaded from: classes.dex */
public enum NotificationCategory implements nmXVdLD3wuhaqezxBBvorxOjwLT {
    NONE(null, 0),
    CALL(ActionCategory.CALL, 1),
    NAVIGATION("navigation", 2),
    MESSAGE("msg", 3),
    EMAIL(ActionCategory.EMAIL, 4),
    EVENT("event", 5),
    PROMO("promo", 6),
    ALARM("alarm", 7),
    PROGRESS("progress", 8),
    SOCIAL("social", 9),
    ERROR("err", 10),
    TRANSPORT("transport", 11),
    SYSTEM("sys", 12),
    SERVICE("service", 13),
    REMINDER("reminder", 14),
    RECOMMENDATION("recommendation", 15),
    STATUS("status", 16),
    WORKOUT("workout", 17),
    LOCATION_SHARING("location_sharing", 18),
    STOPWATCH("stopwatch", 19),
    MISSED_CALL("missed_call", 20);

    private final int asInt;
    private final String asString;
    private static final /* synthetic */ HlaGpRWB5yh0EgeuCV $ENTRIES = new sKhRxlrK0uZQTcvTyLdO1CgQhofD6(values());
    public static final l6kXukUGq6NA6sWATDR Companion = new l6kXukUGq6NA6sWATDR();

    NotificationCategory(String str, int i) {
        this.asString = str;
        this.asInt = i;
    }

    public static HlaGpRWB5yh0EgeuCV getEntries() {
        return $ENTRIES;
    }

    public final int getAsInt() {
        return this.asInt;
    }

    public final String getAsString() {
        return this.asString;
    }

    @Override // b.nmXVdLD3wuhaqezxBBvorxOjwLT
    public Integer getSerialized() {
        return Integer.valueOf(this.asInt);
    }
}
