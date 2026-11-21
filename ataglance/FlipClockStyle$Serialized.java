package bitpit.launcher.ataglance;

import b.D4uDt21iAp885MiybCJz3keA;
import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.gkp6pLZDZ4B;
import b.mHW63SUma8isGb;
import b.qSDYaDqxbBy2QEeVAcFRy;
import bitpit.launcher.text.RemoteFont;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class FlipClockStyle$Serialized implements D4uDt21iAp885MiybCJz3keA {
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] JY5knQmh7EQJEZ = {null, null, null, null, null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new gkp6pLZDZ4B(14)), qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new gkp6pLZDZ4B(15))};
    public final int Aboow6rUrcY2SrFRa46C6uy;
    public final RemoteFont BezslBgjveK3hODH;
    public final qsTJuxvI0Yplnkz8 PQQPeCDD0JLCT3aLz;
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final AtAGlanceInfo axL8FocTDLUdzg0XScbO;
    public final qsTJuxvI0Yplnkz8 ox9eclwMpRd;
    public final int ziNFA7KzVfc6;

    public static final class Companion {
        public final KSerializer serializer() {
            return FlipClockStyle$Serialized$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FlipClockStyle$Serialized(int i, String str, AtAGlanceInfo atAGlanceInfo, RemoteFont remoteFont, int i2, int i3, qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz8, qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz9) {
        if (127 != (i & 127)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 127, FlipClockStyle$Serialized$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = atAGlanceInfo;
        this.BezslBgjveK3hODH = remoteFont;
        this.ziNFA7KzVfc6 = i2;
        this.Aboow6rUrcY2SrFRa46C6uy = i3;
        this.ox9eclwMpRd = qstjuxvi0yplnkz8;
        this.PQQPeCDD0JLCT3aLz = qstjuxvi0yplnkz9;
    }

    @Override // b.D4uDt21iAp885MiybCJz3keA
    public final String BezslBgjveK3hODH() {
        return this.S1zP5M3X7Ukq3ROlZ87G9I;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlipClockStyle$Serialized)) {
            return false;
        }
        FlipClockStyle$Serialized flipClockStyle$Serialized = (FlipClockStyle$Serialized) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, flipClockStyle$Serialized.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, flipClockStyle$Serialized.axL8FocTDLUdzg0XScbO) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.BezslBgjveK3hODH, flipClockStyle$Serialized.BezslBgjveK3hODH) && this.ziNFA7KzVfc6 == flipClockStyle$Serialized.ziNFA7KzVfc6 && this.Aboow6rUrcY2SrFRa46C6uy == flipClockStyle$Serialized.Aboow6rUrcY2SrFRa46C6uy && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.ox9eclwMpRd, flipClockStyle$Serialized.ox9eclwMpRd) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.PQQPeCDD0JLCT3aLz, flipClockStyle$Serialized.PQQPeCDD0JLCT3aLz);
    }

    public final int hashCode() {
        int iWT8HZhEwPEkG = LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.Aboow6rUrcY2SrFRa46C6uy, LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.ziNFA7KzVfc6, (this.BezslBgjveK3hODH.hashCode() + ((this.axL8FocTDLUdzg0XScbO.hashCode() + (this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31)) * 31)) * 31, 31), 31);
        qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz8 = this.ox9eclwMpRd;
        int iHashCode = (iWT8HZhEwPEkG + (qstjuxvi0yplnkz8 == null ? 0 : qstjuxvi0yplnkz8.hashCode())) * 31;
        qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz9 = this.PQQPeCDD0JLCT3aLz;
        return iHashCode + (qstjuxvi0yplnkz9 != null ? qstjuxvi0yplnkz9.hashCode() : 0);
    }

    public final String toString() {
        return "Serialized(uuid=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", info=" + this.axL8FocTDLUdzg0XScbO + ", font=" + this.BezslBgjveK3hODH + ", cornerRadiusDp=" + this.ziNFA7KzVfc6 + ", dividerHeightDp=" + this.Aboow6rUrcY2SrFRa46C6uy + ", textColorOverride=" + this.ox9eclwMpRd + ", backgroundColorOverride=" + this.PQQPeCDD0JLCT3aLz + ")";
    }

    @Override // b.D4uDt21iAp885MiybCJz3keA
    public final AtAGlanceInfo ziNFA7KzVfc6() {
        return this.axL8FocTDLUdzg0XScbO;
    }

    public FlipClockStyle$Serialized(String str, AtAGlanceInfo atAGlanceInfo, RemoteFont remoteFont, qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz8, qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz9) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = atAGlanceInfo;
        this.BezslBgjveK3hODH = remoteFont;
        this.ziNFA7KzVfc6 = 16;
        this.Aboow6rUrcY2SrFRa46C6uy = 3;
        this.ox9eclwMpRd = qstjuxvi0yplnkz8;
        this.PQQPeCDD0JLCT3aLz = qstjuxvi0yplnkz9;
    }
}
