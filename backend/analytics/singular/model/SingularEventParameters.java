package bitpit.launcher.backend.analytics.singular.model;

import b.G71ctMPy0O3NI7eWB;
import b.J0tNOcVdQ2JmIxX3cTuEd;
import b.KNB69biQImOtxCbYZrxJ;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.VyitELzKRokr;
import b.mHW63SUma8isGb;
import b.qSDYaDqxbBy2QEeVAcFRy;
import java.util.Map;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class SingularEventParameters implements KNB69biQImOtxCbYZrxJ {
    public final Map BezslBgjveK3hODH;
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final Map axL8FocTDLUdzg0XScbO;
    public final DataSharingOptions ziNFA7KzVfc6;
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] Aboow6rUrcY2SrFRa46C6uy = {null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new VyitELzKRokr(20)), qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new VyitELzKRokr(21)), null};

    public static final class Companion {
        public final KSerializer serializer() {
            return SingularEventParameters$$serializer.INSTANCE;
        }
    }

    public static final class DataSharingOptions {
        public static final Companion Companion = new Companion();
        public final boolean S1zP5M3X7Ukq3ROlZ87G9I;

        public static final class Companion {
            public final KSerializer serializer() {
                return SingularEventParameters$DataSharingOptions$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ DataSharingOptions(int i, boolean z) {
            if (1 == (i & 1)) {
                this.S1zP5M3X7Ukq3ROlZ87G9I = z;
            } else {
                PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 1, SingularEventParameters$DataSharingOptions$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DataSharingOptions) && this.S1zP5M3X7Ukq3ROlZ87G9I == ((DataSharingOptions) obj).S1zP5M3X7Ukq3ROlZ87G9I;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.S1zP5M3X7Ukq3ROlZ87G9I);
        }

        public final String toString() {
            return G71ctMPy0O3NI7eWB.fXBtMGfTIjGSHgK542(new StringBuilder("DataSharingOptions(limitDataSharing="), this.S1zP5M3X7Ukq3ROlZ87G9I, ')');
        }
    }

    public /* synthetic */ SingularEventParameters(int i, String str, Map map, Map map2, DataSharingOptions dataSharingOptions) {
        if (1 != (i & 1)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 1, SingularEventParameters$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        int i2 = i & 2;
        J0tNOcVdQ2JmIxX3cTuEd j0tNOcVdQ2JmIxX3cTuEd = J0tNOcVdQ2JmIxX3cTuEd.GO8WUug7ZWFCUI1zY;
        if (i2 == 0) {
            this.axL8FocTDLUdzg0XScbO = j0tNOcVdQ2JmIxX3cTuEd;
        } else {
            this.axL8FocTDLUdzg0XScbO = map;
        }
        if ((i & 4) == 0) {
            this.BezslBgjveK3hODH = j0tNOcVdQ2JmIxX3cTuEd;
        } else {
            this.BezslBgjveK3hODH = map2;
        }
        if ((i & 8) == 0) {
            this.ziNFA7KzVfc6 = null;
        } else {
            this.ziNFA7KzVfc6 = dataSharingOptions;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingularEventParameters)) {
            return false;
        }
        SingularEventParameters singularEventParameters = (SingularEventParameters) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, singularEventParameters.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, singularEventParameters.axL8FocTDLUdzg0XScbO) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.BezslBgjveK3hODH, singularEventParameters.BezslBgjveK3hODH) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.ziNFA7KzVfc6, singularEventParameters.ziNFA7KzVfc6);
    }

    public final int hashCode() {
        int iHashCode = (this.BezslBgjveK3hODH.hashCode() + ((this.axL8FocTDLUdzg0XScbO.hashCode() + (this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31)) * 31)) * 31;
        DataSharingOptions dataSharingOptions = this.ziNFA7KzVfc6;
        return iHashCode + (dataSharingOptions == null ? 0 : Boolean.hashCode(dataSharingOptions.S1zP5M3X7Ukq3ROlZ87G9I));
    }

    public final String toString() {
        return "SingularEventParameters(event=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", eventAttributes=" + this.axL8FocTDLUdzg0XScbO + ", globalProperties=" + this.BezslBgjveK3hODH + ", dataSharingOptions=" + this.ziNFA7KzVfc6 + ')';
    }

    public SingularEventParameters(String str, Map map, Map map2) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = map;
        this.BezslBgjveK3hODH = map2;
        this.ziNFA7KzVfc6 = null;
    }
}
