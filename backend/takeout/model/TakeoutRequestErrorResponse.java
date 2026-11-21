package bitpit.launcher.backend.takeout.model;

import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.VyitELzKRokr;
import b.mHW63SUma8isGb;
import b.qSDYaDqxbBy2QEeVAcFRy;
import b.uxkkm5JhDSUL7pvcl6Ce3hrrWo;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class TakeoutRequestErrorResponse {
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] axL8FocTDLUdzg0XScbO = {qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new VyitELzKRokr(28))};
    public final uxkkm5JhDSUL7pvcl6Ce3hrrWo S1zP5M3X7Ukq3ROlZ87G9I;

    public static final class Companion {
        public final KSerializer serializer() {
            return TakeoutRequestErrorResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TakeoutRequestErrorResponse(int i, uxkkm5JhDSUL7pvcl6Ce3hrrWo uxkkm5jhdsul7pvcl6ce3hrrwo) {
        if (1 == (i & 1)) {
            this.S1zP5M3X7Ukq3ROlZ87G9I = uxkkm5jhdsul7pvcl6ce3hrrwo;
        } else {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 1, TakeoutRequestErrorResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TakeoutRequestErrorResponse) && this.S1zP5M3X7Ukq3ROlZ87G9I == ((TakeoutRequestErrorResponse) obj).S1zP5M3X7Ukq3ROlZ87G9I;
    }

    public final int hashCode() {
        return this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode();
    }

    public final String toString() {
        return "TakeoutRequestErrorResponse(error=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ')';
    }
}
