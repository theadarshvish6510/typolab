package bitpit.launcher.savesystem;

import b.HlaGpRWB5yh0EgeuCV;
import b.nmXVdLD3wuhaqezxBBvorxOjwLT;
import b.sKhRxlrK0uZQTcvTyLdO1CgQhofD6;

/* JADX INFO: loaded from: classes.dex */
public enum OnboardingSetAsDefaultPromptVariant implements nmXVdLD3wuhaqezxBBvorxOjwLT {
    BEFORE_AFTER_CONTINUE("before_after_continue"),
    BEFORE_AFTER_SWITCH("before_after_switch"),
    SYSTEM_DIALOG_PREVIEW("system_preview"),
    DEFAULT("default");

    private static final /* synthetic */ HlaGpRWB5yh0EgeuCV $ENTRIES = new sKhRxlrK0uZQTcvTyLdO1CgQhofD6(values());
    private final String serialized;

    OnboardingSetAsDefaultPromptVariant(String str) {
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
