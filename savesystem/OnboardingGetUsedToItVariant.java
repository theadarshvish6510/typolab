package bitpit.launcher.savesystem;

import b.FygF4J2xQY;
import b.HlaGpRWB5yh0EgeuCV;
import b.nmXVdLD3wuhaqezxBBvorxOjwLT;
import b.sKhRxlrK0uZQTcvTyLdO1CgQhofD6;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v2 bitpit.launcher.savesystem.OnboardingGetUsedToItVariant, still in use, count: 1, list:
  (r0v2 bitpit.launcher.savesystem.OnboardingGetUsedToItVariant) from 0x0038: SPUT (r0v2 bitpit.launcher.savesystem.OnboardingGetUsedToItVariant) bitpit.launcher.savesystem.OnboardingGetUsedToItVariant.FALLBACK bitpit.launcher.savesystem.OnboardingGetUsedToItVariant
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
public final class OnboardingGetUsedToItVariant implements nmXVdLD3wuhaqezxBBvorxOjwLT {
    DEFAULT("default"),
    HEADS_UP("heads_up"),
    SKIP("skip");

    private final String serialized;
    private static final /* synthetic */ HlaGpRWB5yh0EgeuCV $ENTRIES = new sKhRxlrK0uZQTcvTyLdO1CgQhofD6(values());
    public static final FygF4J2xQY Companion = new FygF4J2xQY();
    private static final OnboardingGetUsedToItVariant FALLBACK = new OnboardingGetUsedToItVariant("skip");

    static {
    }

    private OnboardingGetUsedToItVariant(String str) {
        super(str, i);
        this.serialized = str;
    }

    public static HlaGpRWB5yh0EgeuCV getEntries() {
        return $ENTRIES;
    }

    public static OnboardingGetUsedToItVariant valueOf(String str) {
        return (OnboardingGetUsedToItVariant) Enum.valueOf(OnboardingGetUsedToItVariant.class, str);
    }

    public static OnboardingGetUsedToItVariant[] values() {
        return (OnboardingGetUsedToItVariant[]) $VALUES.clone();
    }

    @Override // b.nmXVdLD3wuhaqezxBBvorxOjwLT
    public String getSerialized() {
        return this.serialized;
    }
}
