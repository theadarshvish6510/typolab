package bitpit.launcher.usage.survey;

import b.HlaGpRWB5yh0EgeuCV;
import b.nmXVdLD3wuhaqezxBBvorxOjwLT;
import b.sKhRxlrK0uZQTcvTyLdO1CgQhofD6;

/* JADX INFO: loaded from: classes.dex */
public enum SurveyQuestionType implements nmXVdLD3wuhaqezxBBvorxOjwLT {
    PHONE_SATISFACTION("phone_satisfaction"),
    UNWANTED_APP_USE("unwanted_app_use"),
    USAGE_BREAKER_AWARENESS("usage_breaker_awareness"),
    USAGE_BREAKER_REDUCE_UNWANTED("usage_breaker_reduce_unwanted_phone_use"),
    USAGE_BREAKER_PHONE_USAGE_AFTER("usage_breaker_phone_usage_after"),
    USAGE_BREAKER_CONTINUE("usage_breaker_continue"),
    USAGE_BREAKER_IMPROVEMENTS("usage_breaker_improvements"),
    USAGE_BREAKER_OTHER_FEEDBACK("usage_breaker_other_feedback");

    private static final /* synthetic */ HlaGpRWB5yh0EgeuCV $ENTRIES = new sKhRxlrK0uZQTcvTyLdO1CgQhofD6(values());
    private final String serialized;

    SurveyQuestionType(String str) {
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
