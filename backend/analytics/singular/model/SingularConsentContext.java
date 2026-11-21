package bitpit.launcher.backend.analytics.singular.model;

import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class SingularConsentContext {
    public static final Companion Companion = new Companion();
    public final AnalyticsConsent S1zP5M3X7Ukq3ROlZ87G9I;
    public final AnalyticsConsent axL8FocTDLUdzg0XScbO;

    public static final class Companion {
        public final KSerializer serializer() {
            return SingularConsentContext$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SingularConsentContext(int i, AnalyticsConsent analyticsConsent, AnalyticsConsent analyticsConsent2) {
        if (2 != (i & 2)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 2, SingularConsentContext$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.S1zP5M3X7Ukq3ROlZ87G9I = null;
        } else {
            this.S1zP5M3X7Ukq3ROlZ87G9I = analyticsConsent;
        }
        this.axL8FocTDLUdzg0XScbO = analyticsConsent2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingularConsentContext)) {
            return false;
        }
        SingularConsentContext singularConsentContext = (SingularConsentContext) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, singularConsentContext.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, singularConsentContext.axL8FocTDLUdzg0XScbO);
    }

    public final int hashCode() {
        AnalyticsConsent analyticsConsent = this.S1zP5M3X7Ukq3ROlZ87G9I;
        return this.axL8FocTDLUdzg0XScbO.hashCode() + ((analyticsConsent == null ? 0 : analyticsConsent.hashCode()) * 31);
    }

    public final String toString() {
        return "SingularConsentContext(sticky=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", current=" + this.axL8FocTDLUdzg0XScbO + ')';
    }

    public SingularConsentContext(AnalyticsConsent analyticsConsent, AnalyticsConsent analyticsConsent2) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = analyticsConsent;
        this.axL8FocTDLUdzg0XScbO = analyticsConsent2;
    }
}
