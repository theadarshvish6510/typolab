package bitpit.launcher.savesystem;

import b.HlaGpRWB5yh0EgeuCV;
import b.nmXVdLD3wuhaqezxBBvorxOjwLT;
import b.sKhRxlrK0uZQTcvTyLdO1CgQhofD6;
import b.t7R7RnPCMFv3kam;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 bitpit.launcher.savesystem.OnboardingValueExplainerVariant, still in use, count: 1, list:
  (r0v1 bitpit.launcher.savesystem.OnboardingValueExplainerVariant) from 0x002c: SPUT (r0v1 bitpit.launcher.savesystem.OnboardingValueExplainerVariant) bitpit.launcher.savesystem.OnboardingValueExplainerVariant.FALLBACK bitpit.launcher.savesystem.OnboardingValueExplainerVariant
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
public final class OnboardingValueExplainerVariant implements nmXVdLD3wuhaqezxBBvorxOjwLT {
    STORY("story"),
    SKIP("skip");

    private final String serialized;
    private static final /* synthetic */ HlaGpRWB5yh0EgeuCV $ENTRIES = new sKhRxlrK0uZQTcvTyLdO1CgQhofD6(values());
    public static final t7R7RnPCMFv3kam Companion = new t7R7RnPCMFv3kam();
    private static final OnboardingValueExplainerVariant FALLBACK = new OnboardingValueExplainerVariant("skip");

    static {
    }

    private OnboardingValueExplainerVariant(String str) {
        super(str, i);
        this.serialized = str;
    }

    public static HlaGpRWB5yh0EgeuCV getEntries() {
        return $ENTRIES;
    }

    public static OnboardingValueExplainerVariant valueOf(String str) {
        return (OnboardingValueExplainerVariant) Enum.valueOf(OnboardingValueExplainerVariant.class, str);
    }

    public static OnboardingValueExplainerVariant[] values() {
        return (OnboardingValueExplainerVariant[]) $VALUES.clone();
    }

    @Override // b.nmXVdLD3wuhaqezxBBvorxOjwLT
    public String getSerialized() {
        return this.serialized;
    }
}
