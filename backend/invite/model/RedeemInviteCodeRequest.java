package bitpit.launcher.backend.invite.model;

import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class RedeemInviteCodeRequest {
    public static final Companion Companion = new Companion();
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final String axL8FocTDLUdzg0XScbO;

    public static final class Companion {
        public final KSerializer serializer() {
            return RedeemInviteCodeRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RedeemInviteCodeRequest(String str, int i, String str2) {
        if (3 != (i & 3)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 3, RedeemInviteCodeRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RedeemInviteCodeRequest)) {
            return false;
        }
        RedeemInviteCodeRequest redeemInviteCodeRequest = (RedeemInviteCodeRequest) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, redeemInviteCodeRequest.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, redeemInviteCodeRequest.axL8FocTDLUdzg0XScbO);
    }

    public final int hashCode() {
        return this.axL8FocTDLUdzg0XScbO.hashCode() + (this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RedeemInviteCodeRequest(inviteCode=");
        sb.append(this.S1zP5M3X7Ukq3ROlZ87G9I);
        sb.append(", androidId=");
        return LthVJzs8YB767vHOMwO80UNP7QrQi.HveD9n1tOYlffjJDxghBitYNgB(sb, this.axL8FocTDLUdzg0XScbO, ')');
    }

    public RedeemInviteCodeRequest(String str, String str2) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = str2;
    }
}
