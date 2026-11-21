package bitpit.launcher.onboarding.privacy_prompt;

import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class OnboardingAnalyticsPreferences {
    public static final Companion Companion = new Companion();
    public final boolean S1zP5M3X7Ukq3ROlZ87G9I;
    public final boolean axL8FocTDLUdzg0XScbO;

    public static final class Companion {
        public final KSerializer serializer() {
            return OnboardingAnalyticsPreferences$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OnboardingAnalyticsPreferences(int i, boolean z, boolean z2) {
        if (3 != (i & 3)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 3, OnboardingAnalyticsPreferences$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = z;
        this.axL8FocTDLUdzg0XScbO = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingAnalyticsPreferences)) {
            return false;
        }
        OnboardingAnalyticsPreferences onboardingAnalyticsPreferences = (OnboardingAnalyticsPreferences) obj;
        return this.S1zP5M3X7Ukq3ROlZ87G9I == onboardingAnalyticsPreferences.S1zP5M3X7Ukq3ROlZ87G9I && this.axL8FocTDLUdzg0XScbO == onboardingAnalyticsPreferences.axL8FocTDLUdzg0XScbO;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.axL8FocTDLUdzg0XScbO) + (Boolean.hashCode(this.S1zP5M3X7Ukq3ROlZ87G9I) * 31);
    }

    public final String toString() {
        return "OnboardingAnalyticsPreferences(allowMarketingAnalytics=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", allowFunctionalAnalytics=" + this.axL8FocTDLUdzg0XScbO + ")";
    }

    public OnboardingAnalyticsPreferences(boolean z, boolean z2) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = z;
        this.axL8FocTDLUdzg0XScbO = z2;
    }
}
