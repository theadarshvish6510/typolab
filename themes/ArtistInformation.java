package bitpit.launcher.themes;

import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.Tm9djk0is0;
import b.aJLiMmqfPh61r;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class ArtistInformation {
    public static final Factory Factory = new Factory();
    public final ArtistSignature BezslBgjveK3hODH;
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final ArtistProfilePicture axL8FocTDLUdzg0XScbO;
    public final String ziNFA7KzVfc6;

    public static final class Factory {
        public static ArtistInformation S1zP5M3X7Ukq3ROlZ87G9I(String str, String str2, String str3) {
            ArtistProfilePicture.Factory.getClass();
            ArtistProfilePicture artistProfilePicture = new ArtistProfilePicture(new Tm9djk0is0(aJLiMmqfPh61r.flPMk2Ix9h3b95v("artists/", str2, "/profile.webp"), "artist_profile_".concat(str2)));
            ArtistSignature.Factory.getClass();
            return new ArtistInformation(str, artistProfilePicture, new ArtistSignature(new Tm9djk0is0(aJLiMmqfPh61r.flPMk2Ix9h3b95v("artists/", str2, "/signature.webp"), "artist_signature_".concat(str2))), str3);
        }

        public final KSerializer serializer() {
            return ArtistInformation$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ArtistInformation(int i, String str, ArtistProfilePicture artistProfilePicture, ArtistSignature artistSignature, String str2) {
        if (7 != (i & 7)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 7, ArtistInformation$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = artistProfilePicture;
        this.BezslBgjveK3hODH = artistSignature;
        if ((i & 8) == 0) {
            this.ziNFA7KzVfc6 = null;
        } else {
            this.ziNFA7KzVfc6 = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArtistInformation)) {
            return false;
        }
        ArtistInformation artistInformation = (ArtistInformation) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, artistInformation.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, artistInformation.axL8FocTDLUdzg0XScbO) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.BezslBgjveK3hODH, artistInformation.BezslBgjveK3hODH) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.ziNFA7KzVfc6, artistInformation.ziNFA7KzVfc6);
    }

    public final int hashCode() {
        int iHashCode = (this.BezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() + ((this.axL8FocTDLUdzg0XScbO.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() + (this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31)) * 31)) * 31;
        String str = this.ziNFA7KzVfc6;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ArtistInformation(name=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", profilePicture=" + this.axL8FocTDLUdzg0XScbO + ", signature=" + this.BezslBgjveK3hODH + ", link=" + this.ziNFA7KzVfc6 + ")";
    }

    public ArtistInformation(String str, ArtistProfilePicture artistProfilePicture, ArtistSignature artistSignature, String str2) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = artistProfilePicture;
        this.BezslBgjveK3hODH = artistSignature;
        this.ziNFA7KzVfc6 = str2;
    }
}
