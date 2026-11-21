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
public final class DayOfWeekStyle$Serialized implements D4uDt21iAp885MiybCJz3keA {
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] JY5knQmh7EQJEZ = {null, null, null, null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new gkp6pLZDZ4B(4)), null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new gkp6pLZDZ4B(5))};
    public final qsTJuxvI0Yplnkz8 Aboow6rUrcY2SrFRa46C6uy;
    public final RemoteFont BezslBgjveK3hODH;
    public final qsTJuxvI0Yplnkz8 PQQPeCDD0JLCT3aLz;
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final AtAGlanceInfo axL8FocTDLUdzg0XScbO;
    public final RemoteFont ox9eclwMpRd;
    public final int ziNFA7KzVfc6;

    public static final class Companion {
        public final KSerializer serializer() {
            return DayOfWeekStyle$Serialized$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DayOfWeekStyle$Serialized(int i, String str, AtAGlanceInfo atAGlanceInfo, RemoteFont remoteFont, int i2, qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz8, RemoteFont remoteFont2, qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz9) {
        if (127 != (i & 127)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 127, DayOfWeekStyle$Serialized$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = atAGlanceInfo;
        this.BezslBgjveK3hODH = remoteFont;
        this.ziNFA7KzVfc6 = i2;
        this.Aboow6rUrcY2SrFRa46C6uy = qstjuxvi0yplnkz8;
        this.ox9eclwMpRd = remoteFont2;
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
        if (!(obj instanceof DayOfWeekStyle$Serialized)) {
            return false;
        }
        DayOfWeekStyle$Serialized dayOfWeekStyle$Serialized = (DayOfWeekStyle$Serialized) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, dayOfWeekStyle$Serialized.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, dayOfWeekStyle$Serialized.axL8FocTDLUdzg0XScbO) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.BezslBgjveK3hODH, dayOfWeekStyle$Serialized.BezslBgjveK3hODH) && this.ziNFA7KzVfc6 == dayOfWeekStyle$Serialized.ziNFA7KzVfc6 && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.Aboow6rUrcY2SrFRa46C6uy, dayOfWeekStyle$Serialized.Aboow6rUrcY2SrFRa46C6uy) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.ox9eclwMpRd, dayOfWeekStyle$Serialized.ox9eclwMpRd) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.PQQPeCDD0JLCT3aLz, dayOfWeekStyle$Serialized.PQQPeCDD0JLCT3aLz);
    }

    public final int hashCode() {
        int iWT8HZhEwPEkG = LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.ziNFA7KzVfc6, (this.BezslBgjveK3hODH.hashCode() + ((this.axL8FocTDLUdzg0XScbO.hashCode() + (this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31)) * 31)) * 31, 31);
        qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz8 = this.Aboow6rUrcY2SrFRa46C6uy;
        int iHashCode = (iWT8HZhEwPEkG + (qstjuxvi0yplnkz8 == null ? 0 : qstjuxvi0yplnkz8.hashCode())) * 31;
        RemoteFont remoteFont = this.ox9eclwMpRd;
        int iHashCode2 = (iHashCode + (remoteFont == null ? 0 : remoteFont.hashCode())) * 31;
        qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz9 = this.PQQPeCDD0JLCT3aLz;
        return iHashCode2 + (qstjuxvi0yplnkz9 != null ? qstjuxvi0yplnkz9.hashCode() : 0);
    }

    public final String toString() {
        return "Serialized(uuid=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", info=" + this.axL8FocTDLUdzg0XScbO + ", weekDayTextFont=" + this.BezslBgjveK3hODH + ", weekDayTextSizeDp=" + this.ziNFA7KzVfc6 + ", weekDayTextColorOverride=" + this.Aboow6rUrcY2SrFRa46C6uy + ", atAGlanceBarTextFontOverride=" + this.ox9eclwMpRd + ", atAGlanceBarTextColorOverride=" + this.PQQPeCDD0JLCT3aLz + ")";
    }

    @Override // b.D4uDt21iAp885MiybCJz3keA
    public final AtAGlanceInfo ziNFA7KzVfc6() {
        return this.axL8FocTDLUdzg0XScbO;
    }

    public DayOfWeekStyle$Serialized(String str, AtAGlanceInfo atAGlanceInfo, RemoteFont remoteFont, int i, qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz8, RemoteFont remoteFont2, qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz9) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = atAGlanceInfo;
        this.BezslBgjveK3hODH = remoteFont;
        this.ziNFA7KzVfc6 = i;
        this.Aboow6rUrcY2SrFRa46C6uy = qstjuxvi0yplnkz8;
        this.ox9eclwMpRd = remoteFont2;
        this.PQQPeCDD0JLCT3aLz = qstjuxvi0yplnkz9;
    }
}
