package bitpit.launcher.backend.analytics.consent.model;

import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.j1mrIRjYKLp7IIwdR9c;
import b.oJ08Xj0ZV1gAa;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class AnalyticsConsent {
    public static final Companion Companion = new Companion();
    public final int Aboow6rUrcY2SrFRa46C6uy;
    public final boolean BezslBgjveK3hODH;
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final boolean axL8FocTDLUdzg0XScbO;
    public final int ox9eclwMpRd;
    public final Boolean ziNFA7KzVfc6;

    public static final class Companion {
        public final KSerializer serializer() {
            return AnalyticsConsent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AnalyticsConsent(int i, String str, boolean z, boolean z2, Boolean bool, int i2, int i3) {
        if (55 != (i & 55)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 55, AnalyticsConsent$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = z;
        this.BezslBgjveK3hODH = z2;
        if ((i & 8) == 0) {
            this.ziNFA7KzVfc6 = null;
        } else {
            this.ziNFA7KzVfc6 = bool;
        }
        this.Aboow6rUrcY2SrFRa46C6uy = i2;
        this.ox9eclwMpRd = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalyticsConsent)) {
            return false;
        }
        AnalyticsConsent analyticsConsent = (AnalyticsConsent) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, analyticsConsent.S1zP5M3X7Ukq3ROlZ87G9I) && this.axL8FocTDLUdzg0XScbO == analyticsConsent.axL8FocTDLUdzg0XScbO && this.BezslBgjveK3hODH == analyticsConsent.BezslBgjveK3hODH && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.ziNFA7KzVfc6, analyticsConsent.ziNFA7KzVfc6) && this.Aboow6rUrcY2SrFRa46C6uy == analyticsConsent.Aboow6rUrcY2SrFRa46C6uy && this.ox9eclwMpRd == analyticsConsent.ox9eclwMpRd;
    }

    public final int hashCode() {
        int iFlPMk2Ix9h3b95v = j1mrIRjYKLp7IIwdR9c.flPMk2Ix9h3b95v(j1mrIRjYKLp7IIwdR9c.flPMk2Ix9h3b95v(this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31, 31, this.axL8FocTDLUdzg0XScbO), 31, this.BezslBgjveK3hODH);
        Boolean bool = this.ziNFA7KzVfc6;
        return Integer.hashCode(this.ox9eclwMpRd) + LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.Aboow6rUrcY2SrFRa46C6uy, (iFlPMk2Ix9h3b95v + (bool == null ? 0 : bool.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnalyticsConsent(userId=");
        sb.append(this.S1zP5M3X7Ukq3ROlZ87G9I);
        sb.append(", isGdprUser=");
        sb.append(this.axL8FocTDLUdzg0XScbO);
        sb.append(", consentGiven=");
        sb.append(this.BezslBgjveK3hODH);
        sb.append(", marketingConsentGiven=");
        sb.append(this.ziNFA7KzVfc6);
        sb.append(", termsVersion=");
        sb.append(this.Aboow6rUrcY2SrFRa46C6uy);
        sb.append(", privacyPolicyVersion=");
        return oJ08Xj0ZV1gAa.Ql6q60SSx3(sb, this.ox9eclwMpRd, ')');
    }

    public AnalyticsConsent(String str, boolean z, boolean z2, Boolean bool, int i, int i2) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = z;
        this.BezslBgjveK3hODH = z2;
        this.ziNFA7KzVfc6 = bool;
        this.Aboow6rUrcY2SrFRa46C6uy = i;
        this.ox9eclwMpRd = i2;
    }
}
