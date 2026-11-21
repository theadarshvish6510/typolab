package bitpit.launcher.text;

import b.J7Tsg1eqTfbK8vIo4RFOyjPiu;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.Reomk3IeDtk2enO3p4;
import b.Rfp0CprLjJaYY8aiYk;
import b.XjgcutbMEecNupHg;
import b.aJLiMmqfPh61r;
import b.jtmhquXyO9e;
import b.uuyTGGFjNDiF1SxHW;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class RemoteFont {
    public static final Companion Companion = new Companion();
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final String axL8FocTDLUdzg0XScbO;

    public static final class Companion {
        public static Object S1zP5M3X7Ukq3ROlZ87G9I(String str) {
            List listCVfIGUKLEqID1HH = jtmhquXyO9e.cVfIGUKLEqID1HH(str, new String[]{"|"});
            if (!listCVfIGUKLEqID1HH.isEmpty()) {
                Iterator it = listCVfIGUKLEqID1HH.iterator();
                while (it.hasNext()) {
                    if (jtmhquXyO9e.LcvPFGYKhAm4SS5FZ((String) it.next())) {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(aJLiMmqfPh61r.flPMk2Ix9h3b95v("Invalid font '", str, "'"));
                        J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                        return new Rfp0CprLjJaYY8aiYk(illegalArgumentException);
                    }
                }
            }
            int size = listCVfIGUKLEqID1HH.size();
            if (size == 1) {
                RemoteFont remoteFont = new RemoteFont((String) listCVfIGUKLEqID1HH.get(0), 4);
                J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                return remoteFont;
            }
            if (size != 2) {
                IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(aJLiMmqfPh61r.flPMk2Ix9h3b95v("Invalid font '", str, "'"));
                J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                return new Rfp0CprLjJaYY8aiYk(illegalArgumentException2);
            }
            RemoteFont remoteFont2 = new RemoteFont((String) listCVfIGUKLEqID1HH.get(0), (String) listCVfIGUKLEqID1HH.get(1));
            J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
            return remoteFont2;
        }

        public final KSerializer serializer() {
            return RemoteFont$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RemoteFont(String str, int i) {
        String str2;
        switch (i) {
            case 1:
                str2 = "thin";
                break;
            case 2:
                str2 = "extra-light";
                break;
            case 3:
                str2 = "light";
                break;
            case 4:
                str2 = "regular";
                break;
            case 5:
                str2 = "medium";
                break;
            case 6:
                str2 = "semi-bold";
                break;
            case 7:
                str2 = "bold";
                break;
            case 8:
                str2 = "extra-bold";
                break;
            case 9:
                str2 = "black";
                break;
            default:
                throw null;
        }
        this(str, str2);
    }

    public final String S1zP5M3X7Ukq3ROlZ87G9I() {
        return this.S1zP5M3X7Ukq3ROlZ87G9I + "-" + this.axL8FocTDLUdzg0XScbO + ".ttf";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteFont)) {
            return false;
        }
        RemoteFont remoteFont = (RemoteFont) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, remoteFont.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, remoteFont.axL8FocTDLUdzg0XScbO);
    }

    public final int hashCode() {
        return this.axL8FocTDLUdzg0XScbO.hashCode() + (this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31);
    }

    public final String toString() {
        Reomk3IeDtk2enO3p4 reomk3IeDtk2enO3p4 = XjgcutbMEecNupHg.S1zP5M3X7Ukq3ROlZ87G9I;
        String str = this.S1zP5M3X7Ukq3ROlZ87G9I;
        if (jtmhquXyO9e.WT8HZhEwPEkG(str, '|')) {
            uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("Check failed.");
            return null;
        }
        String str2 = this.axL8FocTDLUdzg0XScbO;
        if (!jtmhquXyO9e.WT8HZhEwPEkG(str2, '|')) {
            return aJLiMmqfPh61r.flPMk2Ix9h3b95v(str, "|", str2);
        }
        uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("Check failed.");
        return null;
    }

    public RemoteFont(String str, String str2) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = str2;
        if (!jtmhquXyO9e.LcvPFGYKhAm4SS5FZ(str)) {
            if (jtmhquXyO9e.LcvPFGYKhAm4SS5FZ(str2)) {
                uuyTGGFjNDiF1SxHW.PQQPeCDD0JLCT3aLz("Failed requirement.");
                throw null;
            }
            return;
        }
        uuyTGGFjNDiF1SxHW.PQQPeCDD0JLCT3aLz("Failed requirement.");
        throw null;
    }

    public /* synthetic */ RemoteFont(String str, int i, String str2) {
        if (3 == (i & 3)) {
            this.S1zP5M3X7Ukq3ROlZ87G9I = str;
            this.axL8FocTDLUdzg0XScbO = str2;
            if (!jtmhquXyO9e.LcvPFGYKhAm4SS5FZ(str)) {
                if (jtmhquXyO9e.LcvPFGYKhAm4SS5FZ(str2)) {
                    uuyTGGFjNDiF1SxHW.PQQPeCDD0JLCT3aLz("Failed requirement.");
                    throw null;
                }
                return;
            }
            uuyTGGFjNDiF1SxHW.PQQPeCDD0JLCT3aLz("Failed requirement.");
            throw null;
        }
        PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 3, RemoteFont$$serializer.INSTANCE.getDescriptor());
        throw null;
    }
}
