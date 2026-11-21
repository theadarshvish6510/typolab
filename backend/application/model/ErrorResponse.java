package bitpit.launcher.backend.application.model;

import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class ErrorResponse {
    public static final Companion Companion = new Companion();
    public final String BezslBgjveK3hODH;
    public final int S1zP5M3X7Ukq3ROlZ87G9I;
    public final String axL8FocTDLUdzg0XScbO;
    public final String ziNFA7KzVfc6;

    public static final class Companion {
        public final KSerializer serializer() {
            return ErrorResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ErrorResponse(int i, int i2, String str, String str2, String str3) {
        if (11 != (i & 11)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 11, ErrorResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = i2;
        this.axL8FocTDLUdzg0XScbO = str;
        if ((i & 4) == 0) {
            this.BezslBgjveK3hODH = null;
        } else {
            this.BezslBgjveK3hODH = str2;
        }
        this.ziNFA7KzVfc6 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorResponse)) {
            return false;
        }
        ErrorResponse errorResponse = (ErrorResponse) obj;
        return this.S1zP5M3X7Ukq3ROlZ87G9I == errorResponse.S1zP5M3X7Ukq3ROlZ87G9I && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, errorResponse.axL8FocTDLUdzg0XScbO) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.BezslBgjveK3hODH, errorResponse.BezslBgjveK3hODH) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.ziNFA7KzVfc6, errorResponse.ziNFA7KzVfc6);
    }

    public final int hashCode() {
        int iOx9eclwMpRd = LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(Integer.hashCode(this.S1zP5M3X7Ukq3ROlZ87G9I) * 31, this.axL8FocTDLUdzg0XScbO, 31);
        String str = this.BezslBgjveK3hODH;
        return this.ziNFA7KzVfc6.hashCode() + ((iOx9eclwMpRd + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorResponse(status=");
        sb.append(this.S1zP5M3X7Ukq3ROlZ87G9I);
        sb.append(", reason=");
        sb.append(this.axL8FocTDLUdzg0XScbO);
        sb.append(", errorMessage=");
        sb.append(this.BezslBgjveK3hODH);
        sb.append(", route=");
        return LthVJzs8YB767vHOMwO80UNP7QrQi.HveD9n1tOYlffjJDxghBitYNgB(sb, this.ziNFA7KzVfc6, ')');
    }
}
