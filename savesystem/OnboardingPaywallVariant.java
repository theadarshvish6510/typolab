package bitpit.launcher.savesystem;

import b.HlaGpRWB5yh0EgeuCV;
import b.nmXVdLD3wuhaqezxBBvorxOjwLT;
import b.sKhRxlrK0uZQTcvTyLdO1CgQhofD6;
import b.ss6SRiydp0J6;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 bitpit.launcher.savesystem.OnboardingPaywallVariant, still in use, count: 1, list:
  (r0v0 bitpit.launcher.savesystem.OnboardingPaywallVariant) from 0x0038: SPUT (r0v0 bitpit.launcher.savesystem.OnboardingPaywallVariant) bitpit.launcher.savesystem.OnboardingPaywallVariant.FALLBACK bitpit.launcher.savesystem.OnboardingPaywallVariant
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
public final class OnboardingPaywallVariant implements nmXVdLD3wuhaqezxBBvorxOjwLT {
    DEFAULT("default"),
    TRY_PRO_FREE("try_pro_free"),
    SKIP("skip");

    private final String serialized;
    private static final /* synthetic */ HlaGpRWB5yh0EgeuCV $ENTRIES = new sKhRxlrK0uZQTcvTyLdO1CgQhofD6(values());
    public static final ss6SRiydp0J6 Companion = new ss6SRiydp0J6();
    private static final OnboardingPaywallVariant FALLBACK = new OnboardingPaywallVariant("default");

    static {
    }

    private OnboardingPaywallVariant(String str) {
        super(str, i);
        this.serialized = str;
    }

    public static HlaGpRWB5yh0EgeuCV getEntries() {
        return $ENTRIES;
    }

    public static OnboardingPaywallVariant valueOf(String str) {
        return (OnboardingPaywallVariant) Enum.valueOf(OnboardingPaywallVariant.class, str);
    }

    public static OnboardingPaywallVariant[] values() {
        return (OnboardingPaywallVariant[]) $VALUES.clone();
    }

    @Override // b.nmXVdLD3wuhaqezxBBvorxOjwLT
    public String getSerialized() {
        return this.serialized;
    }
}
