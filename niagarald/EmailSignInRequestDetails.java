package bitpit.launcher.niagarald;

import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class EmailSignInRequestDetails {
    public static final Companion Companion = new Companion();
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final long axL8FocTDLUdzg0XScbO;

    public static final class Companion {
        public final KSerializer serializer() {
            return EmailSignInRequestDetails$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EmailSignInRequestDetails(long j, String str, int i) {
        if (3 != (i & 3)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 3, EmailSignInRequestDetails$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmailSignInRequestDetails)) {
            return false;
        }
        EmailSignInRequestDetails emailSignInRequestDetails = (EmailSignInRequestDetails) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, emailSignInRequestDetails.S1zP5M3X7Ukq3ROlZ87G9I) && this.axL8FocTDLUdzg0XScbO == emailSignInRequestDetails.axL8FocTDLUdzg0XScbO;
    }

    public final int hashCode() {
        return Long.hashCode(this.axL8FocTDLUdzg0XScbO) + (this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31);
    }

    public final String toString() {
        return "EmailSignInRequestDetails(emailAddress=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", emailRequestTimestamp=" + this.axL8FocTDLUdzg0XScbO + ")";
    }

    public EmailSignInRequestDetails(String str, long j) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = j;
    }
}
