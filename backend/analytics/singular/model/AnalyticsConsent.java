package bitpit.launcher.backend.analytics.singular.model;

import b.G71ctMPy0O3NI7eWB;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class AnalyticsConsent {
    public static final Companion Companion = new Companion();
    public final boolean S1zP5M3X7Ukq3ROlZ87G9I;
    public final boolean axL8FocTDLUdzg0XScbO;

    public static final class Companion {
        public final KSerializer serializer() {
            return AnalyticsConsent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AnalyticsConsent(int i, boolean z, boolean z2) {
        if (3 != (i & 3)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 3, AnalyticsConsent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = z;
        this.axL8FocTDLUdzg0XScbO = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalyticsConsent)) {
            return false;
        }
        AnalyticsConsent analyticsConsent = (AnalyticsConsent) obj;
        return this.S1zP5M3X7Ukq3ROlZ87G9I == analyticsConsent.S1zP5M3X7Ukq3ROlZ87G9I && this.axL8FocTDLUdzg0XScbO == analyticsConsent.axL8FocTDLUdzg0XScbO;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.axL8FocTDLUdzg0XScbO) + (Boolean.hashCode(this.S1zP5M3X7Ukq3ROlZ87G9I) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnalyticsConsent(functionalAnalytics=");
        sb.append(this.S1zP5M3X7Ukq3ROlZ87G9I);
        sb.append(", marketingAnalytics=");
        return G71ctMPy0O3NI7eWB.fXBtMGfTIjGSHgK542(sb, this.axL8FocTDLUdzg0XScbO, ')');
    }

    public AnalyticsConsent(boolean z, boolean z2) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = z;
        this.axL8FocTDLUdzg0XScbO = z2;
    }
}
