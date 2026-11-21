package bitpit.launcher.usage.survey;

import b.HlaGpRWB5yh0EgeuCV;
import b.nmXVdLD3wuhaqezxBBvorxOjwLT;
import b.sKhRxlrK0uZQTcvTyLdO1CgQhofD6;

/* JADX INFO: loaded from: classes.dex */
public enum SurveyResponseType implements nmXVdLD3wuhaqezxBBvorxOjwLT {
    DECLINE_TO_ANSWER("decline_to_answer"),
    OTHER("other"),
    VERY_DISSATISFIED("very_dissatisfied"),
    DISSATISFIED("dissatisfied"),
    SLIGHTLY_DISSATISFIED("slightly_dissatisfied"),
    SLIGHTLY_SATISFIED("slightly_satisfied"),
    SATISFIED("satisfied"),
    VERY_SATISFIED("very_satisfied"),
    PERCENTAGE_0_TO_20("0.0-0.2"),
    PERCENTAGE_20_TO_40("0.2-0.4"),
    PERCENTAGE_40_TO_60("0.4-0.6"),
    PERCENTAGE_60_TO_80("0.6-0.8"),
    PERCENTAGE_80_TO_100("0.8-1.0"),
    NOT_AT_ALL("not_at_all"),
    SLIGHTLY("slightly"),
    SOMEWHAT("somewhat"),
    MODERATELY("moderately"),
    VERY("very"),
    EXTREMELY("extremely"),
    MORE_MINDFUL("more_mindful"),
    NO_CHANGE("no_change"),
    MORE_FRUSTRATING("more_frustrating"),
    YES("yes"),
    MAYBE("maybe"),
    NO("no"),
    NEED_CLARITY("need_clarity"),
    WANT_FEEDBACK("want_feedback"),
    MORE_INTRUSIVE("more_intrusive"),
    LESS_INTRUSIVE("less_intrusive"),
    MORE_CONTROL("more_control");

    private static final /* synthetic */ HlaGpRWB5yh0EgeuCV $ENTRIES = new sKhRxlrK0uZQTcvTyLdO1CgQhofD6(values());
    private final String serialized;

    SurveyResponseType(String str) {
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
