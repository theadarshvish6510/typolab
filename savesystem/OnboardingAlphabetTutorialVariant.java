package bitpit.launcher.savesystem;

import b.HlaGpRWB5yh0EgeuCV;
import b.nmXVdLD3wuhaqezxBBvorxOjwLT;
import b.sKhRxlrK0uZQTcvTyLdO1CgQhofD6;
import b.uL4SnYV3fUIyV4bhPe4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 bitpit.launcher.savesystem.OnboardingAlphabetTutorialVariant, still in use, count: 1, list:
  (r0v0 bitpit.launcher.savesystem.OnboardingAlphabetTutorialVariant) from 0x002c: SPUT (r0v0 bitpit.launcher.savesystem.OnboardingAlphabetTutorialVariant) bitpit.launcher.savesystem.OnboardingAlphabetTutorialVariant.FALLBACK bitpit.launcher.savesystem.OnboardingAlphabetTutorialVariant
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
public final class OnboardingAlphabetTutorialVariant implements nmXVdLD3wuhaqezxBBvorxOjwLT {
    DEFAULT("default"),
    SKIP("skip");

    private final String serialized;
    private static final /* synthetic */ HlaGpRWB5yh0EgeuCV $ENTRIES = new sKhRxlrK0uZQTcvTyLdO1CgQhofD6(values());
    public static final uL4SnYV3fUIyV4bhPe4 Companion = new uL4SnYV3fUIyV4bhPe4();
    private static final OnboardingAlphabetTutorialVariant FALLBACK = new OnboardingAlphabetTutorialVariant("default");

    static {
    }

    private OnboardingAlphabetTutorialVariant(String str) {
        super(str, i);
        this.serialized = str;
    }

    public static HlaGpRWB5yh0EgeuCV getEntries() {
        return $ENTRIES;
    }

    public static OnboardingAlphabetTutorialVariant valueOf(String str) {
        return (OnboardingAlphabetTutorialVariant) Enum.valueOf(OnboardingAlphabetTutorialVariant.class, str);
    }

    public static OnboardingAlphabetTutorialVariant[] values() {
        return (OnboardingAlphabetTutorialVariant[]) $VALUES.clone();
    }

    @Override // b.nmXVdLD3wuhaqezxBBvorxOjwLT
    public String getSerialized() {
        return this.serialized;
    }
}
