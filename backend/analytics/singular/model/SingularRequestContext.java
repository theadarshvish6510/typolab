package bitpit.launcher.backend.analytics.singular.model;

import android.os.Build;
import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.VyitELzKRokr;
import b.dz52zjPsVWHg6u;
import b.eUwPamJ8sGfSyqS5ucd4;
import b.mHW63SUma8isGb;
import b.qSDYaDqxbBy2QEeVAcFRy;
import java.util.UUID;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class SingularRequestContext {
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] fXBtMGfTIjGSHgK542 = {null, null, null, null, null, null, null, null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new VyitELzKRokr(22)), null};
    public final String Aboow6rUrcY2SrFRa46C6uy;
    public final UUID BezslBgjveK3hODH;
    public final String JY5knQmh7EQJEZ;
    public final String LYcdI4xpry8eXmFC9I4wyaLdcG1z;
    public final String PQQPeCDD0JLCT3aLz;
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final String axL8FocTDLUdzg0XScbO;
    public final String flPMk2Ix9h3b95v;
    public final String ox9eclwMpRd;
    public final String ziNFA7KzVfc6;

    public static final class Companion {
        public final KSerializer serializer() {
            return SingularRequestContext$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SingularRequestContext(int i, String str, String str2, UUID uuid, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        if (252 != (i & 252)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 252, SingularRequestContext$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.S1zP5M3X7Ukq3ROlZ87G9I = null;
        } else {
            this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        }
        if ((i & 2) == 0) {
            this.axL8FocTDLUdzg0XScbO = null;
        } else {
            this.axL8FocTDLUdzg0XScbO = str2;
        }
        this.BezslBgjveK3hODH = uuid;
        this.ziNFA7KzVfc6 = str3;
        this.Aboow6rUrcY2SrFRa46C6uy = str4;
        this.ox9eclwMpRd = str5;
        this.PQQPeCDD0JLCT3aLz = str6;
        this.JY5knQmh7EQJEZ = str7;
        if ((i & 256) == 0) {
            this.LYcdI4xpry8eXmFC9I4wyaLdcG1z = null;
        } else {
            this.LYcdI4xpry8eXmFC9I4wyaLdcG1z = str8;
        }
        if ((i & 512) == 0) {
            this.flPMk2Ix9h3b95v = null;
        } else {
            this.flPMk2Ix9h3b95v = str9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingularRequestContext)) {
            return false;
        }
        SingularRequestContext singularRequestContext = (SingularRequestContext) obj;
        if (!OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, singularRequestContext.S1zP5M3X7Ukq3ROlZ87G9I) || !OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, singularRequestContext.axL8FocTDLUdzg0XScbO) || !OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.BezslBgjveK3hODH, singularRequestContext.BezslBgjveK3hODH) || !OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.ziNFA7KzVfc6, singularRequestContext.ziNFA7KzVfc6) || !OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.Aboow6rUrcY2SrFRa46C6uy, singularRequestContext.Aboow6rUrcY2SrFRa46C6uy) || !OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.ox9eclwMpRd, singularRequestContext.ox9eclwMpRd) || !OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.PQQPeCDD0JLCT3aLz, singularRequestContext.PQQPeCDD0JLCT3aLz) || !OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.JY5knQmh7EQJEZ, singularRequestContext.JY5knQmh7EQJEZ)) {
            return false;
        }
        String str = singularRequestContext.LYcdI4xpry8eXmFC9I4wyaLdcG1z;
        String str2 = this.LYcdI4xpry8eXmFC9I4wyaLdcG1z;
        if (str2 == null) {
            if (str == null) {
                zEquals = true;
            } else {
                zEquals = false;
            }
        } else if (str == null) {
            zEquals = false;
        } else {
            dz52zjPsVWHg6u dz52zjpsvwhg6u = eUwPamJ8sGfSyqS5ucd4.Companion;
            zEquals = str2.equals(str);
        }
        return zEquals && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.flPMk2Ix9h3b95v, singularRequestContext.flPMk2Ix9h3b95v);
    }

    public final int hashCode() {
        int iHashCode;
        String str = this.S1zP5M3X7Ukq3ROlZ87G9I;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.axL8FocTDLUdzg0XScbO;
        int iOx9eclwMpRd = LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd((this.BezslBgjveK3hODH.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, this.ziNFA7KzVfc6, 31), this.Aboow6rUrcY2SrFRa46C6uy, 31), this.ox9eclwMpRd, 31), this.PQQPeCDD0JLCT3aLz, 31), this.JY5knQmh7EQJEZ, 31);
        String str3 = this.LYcdI4xpry8eXmFC9I4wyaLdcG1z;
        if (str3 == null) {
            iHashCode = 0;
        } else {
            dz52zjPsVWHg6u dz52zjpsvwhg6u = eUwPamJ8sGfSyqS5ucd4.Companion;
            iHashCode = str3.hashCode();
        }
        int i = (iOx9eclwMpRd + iHashCode) * 31;
        String str4 = this.flPMk2Ix9h3b95v;
        return i + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SingularRequestContext(advertisingId=");
        sb.append(this.S1zP5M3X7Ukq3ROlZ87G9I);
        sb.append(", appSetId=");
        sb.append(this.axL8FocTDLUdzg0XScbO);
        sb.append(", singularDeviceId=");
        sb.append(this.BezslBgjveK3hODH);
        sb.append(", osVersion=");
        sb.append(this.ziNFA7KzVfc6);
        sb.append(", manufacturer=");
        sb.append(this.Aboow6rUrcY2SrFRa46C6uy);
        sb.append(", model=");
        sb.append(this.ox9eclwMpRd);
        sb.append(", locale=");
        sb.append(this.PQQPeCDD0JLCT3aLz);
        sb.append(", deviceBuild=");
        sb.append(this.JY5knQmh7EQJEZ);
        sb.append(", country=");
        String str = this.LYcdI4xpry8eXmFC9I4wyaLdcG1z;
        sb.append((Object) (str == null ? "null" : eUwPamJ8sGfSyqS5ucd4.axL8FocTDLUdzg0XScbO(str)));
        sb.append(", customUserId=");
        return LthVJzs8YB767vHOMwO80UNP7QrQi.HveD9n1tOYlffjJDxghBitYNgB(sb, this.flPMk2Ix9h3b95v, ')');
    }

    public SingularRequestContext(String str, String str2, UUID uuid, String str3, String str4, String str5, String str6) {
        String str7 = Build.VERSION.RELEASE;
        String str8 = Build.MANUFACTURER;
        String str9 = Build.MODEL;
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = str2;
        this.BezslBgjveK3hODH = uuid;
        this.ziNFA7KzVfc6 = str7;
        this.Aboow6rUrcY2SrFRa46C6uy = str8;
        this.ox9eclwMpRd = str9;
        this.PQQPeCDD0JLCT3aLz = str3;
        this.JY5knQmh7EQJEZ = str4;
        this.LYcdI4xpry8eXmFC9I4wyaLdcG1z = str5;
        this.flPMk2Ix9h3b95v = str6;
    }
}
