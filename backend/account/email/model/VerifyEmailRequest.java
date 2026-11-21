package bitpit.launcher.backend.account.email.model;

import b.G71ctMPy0O3NI7eWB;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.g3F3ECxxX7;
import b.mHW63SUma8isGb;
import b.qSDYaDqxbBy2QEeVAcFRy;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class VerifyEmailRequest {
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] ziNFA7KzVfc6 = {null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new g3F3ECxxX7(28)), null};
    public final boolean BezslBgjveK3hODH;
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final List axL8FocTDLUdzg0XScbO;

    public static final class Companion {
        public final KSerializer serializer() {
            return VerifyEmailRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VerifyEmailRequest(int i, String str, List list, boolean z) {
        if (3 != (i & 3)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 3, VerifyEmailRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = list;
        if ((i & 4) == 0) {
            this.BezslBgjveK3hODH = true;
        } else {
            this.BezslBgjveK3hODH = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyEmailRequest)) {
            return false;
        }
        VerifyEmailRequest verifyEmailRequest = (VerifyEmailRequest) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, verifyEmailRequest.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, verifyEmailRequest.axL8FocTDLUdzg0XScbO) && this.BezslBgjveK3hODH == verifyEmailRequest.BezslBgjveK3hODH;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.BezslBgjveK3hODH) + ((this.axL8FocTDLUdzg0XScbO.hashCode() + (this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VerifyEmailRequest(email=");
        sb.append(this.S1zP5M3X7Ukq3ROlZ87G9I);
        sb.append(", languages=");
        sb.append(this.axL8FocTDLUdzg0XScbO);
        sb.append(", allowAccountCreation=");
        return G71ctMPy0O3NI7eWB.fXBtMGfTIjGSHgK542(sb, this.BezslBgjveK3hODH, ')');
    }

    public VerifyEmailRequest(String str, List list, boolean z) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = list;
        this.BezslBgjveK3hODH = z;
    }
}
