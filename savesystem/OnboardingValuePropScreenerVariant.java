package bitpit.launcher.savesystem;

import b.HlaGpRWB5yh0EgeuCV;
import b.MCgfC7ENPv2K6mkQYL30l4OPRVn;
import b.nmXVdLD3wuhaqezxBBvorxOjwLT;
import b.sKhRxlrK0uZQTcvTyLdO1CgQhofD6;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 bitpit.launcher.savesystem.OnboardingValuePropScreenerVariant, still in use, count: 1, list:
  (r0v1 bitpit.launcher.savesystem.OnboardingValuePropScreenerVariant) from 0x002c: SPUT (r0v1 bitpit.launcher.savesystem.OnboardingValuePropScreenerVariant) bitpit.launcher.savesystem.OnboardingValuePropScreenerVariant.FALLBACK bitpit.launcher.savesystem.OnboardingValuePropScreenerVariant
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(Unknown Source)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class OnboardingValuePropScreenerVariant implements nmXVdLD3wuhaqezxBBvorxOjwLT {
    DEFAULT("default"),
    SKIP("skip");

    private final String serialized;
    private static final /* synthetic */ HlaGpRWB5yh0EgeuCV $ENTRIES = new sKhRxlrK0uZQTcvTyLdO1CgQhofD6(values());
    public static final MCgfC7ENPv2K6mkQYL30l4OPRVn Companion = new MCgfC7ENPv2K6mkQYL30l4OPRVn();
    private static final OnboardingValuePropScreenerVariant FALLBACK = new OnboardingValuePropScreenerVariant("skip");

    static {
    }

    private OnboardingValuePropScreenerVariant(String str) {
        super(str, i);
        this.serialized = str;
    }

    public static HlaGpRWB5yh0EgeuCV getEntries() {
        return $ENTRIES;
    }

    public static OnboardingValuePropScreenerVariant valueOf(String str) {
        return (OnboardingValuePropScreenerVariant) Enum.valueOf(OnboardingValuePropScreenerVariant.class, str);
    }

    public static OnboardingValuePropScreenerVariant[] values() {
        return (OnboardingValuePropScreenerVariant[]) $VALUES.clone();
    }

    @Override // b.nmXVdLD3wuhaqezxBBvorxOjwLT
    public String getSerialized() {
        return this.serialized;
    }
}
