package bitpit.launcher.themes;

import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.Tm9djk0is0;
import b.jl76lKYqK2jmdbZYUP;
import b.mHW63SUma8isGb;
import b.qSDYaDqxbBy2QEeVAcFRy;
import b.vdBBwKx45uSJHLCNxSnPL6OZU4;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class ArtistProfilePicture {
    public static final Factory Factory = new Factory();
    public static final mHW63SUma8isGb[] axL8FocTDLUdzg0XScbO = {qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new vdBBwKx45uSJHLCNxSnPL6OZU4(9))};
    public final jl76lKYqK2jmdbZYUP S1zP5M3X7Ukq3ROlZ87G9I;

    public static final class Factory {
        public final KSerializer serializer() {
            return ArtistProfilePicture$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ArtistProfilePicture(int i, jl76lKYqK2jmdbZYUP jl76lkyqk2jmdbzyup) {
        if (1 == (i & 1)) {
            this.S1zP5M3X7Ukq3ROlZ87G9I = jl76lkyqk2jmdbzyup;
        } else {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 1, ArtistProfilePicture$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ArtistProfilePicture) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, ((ArtistProfilePicture) obj).S1zP5M3X7Ukq3ROlZ87G9I);
    }

    public final int hashCode() {
        return this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode();
    }

    public final String toString() {
        return "ArtistProfilePicture(resource=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ")";
    }

    public ArtistProfilePicture(Tm9djk0is0 tm9djk0is0) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = tm9djk0is0;
    }
}
