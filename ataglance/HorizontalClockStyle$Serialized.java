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
public final class HorizontalClockStyle$Serialized implements D4uDt21iAp885MiybCJz3keA {
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] fXBtMGfTIjGSHgK542 = {null, null, null, null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new gkp6pLZDZ4B(24)), null, null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new gkp6pLZDZ4B(25)), null, null};
    public final qsTJuxvI0Yplnkz8 Aboow6rUrcY2SrFRa46C6uy;
    public final RemoteFont BezslBgjveK3hODH;
    public final qsTJuxvI0Yplnkz8 JY5knQmh7EQJEZ;
    public final int LYcdI4xpry8eXmFC9I4wyaLdcG1z;
    public final int PQQPeCDD0JLCT3aLz;
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final AtAGlanceInfo axL8FocTDLUdzg0XScbO;
    public final int flPMk2Ix9h3b95v;
    public final RemoteFont ox9eclwMpRd;
    public final int ziNFA7KzVfc6;

    public static final class Companion {
        public final KSerializer serializer() {
            return HorizontalClockStyle$Serialized$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HorizontalClockStyle$Serialized(int i, String str, AtAGlanceInfo atAGlanceInfo, RemoteFont remoteFont, int i2, qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz8, RemoteFont remoteFont2, int i3, qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz9, int i4, int i5) {
        if (1023 != (i & 1023)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 1023, HorizontalClockStyle$Serialized$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = atAGlanceInfo;
        this.BezslBgjveK3hODH = remoteFont;
        this.ziNFA7KzVfc6 = i2;
        this.Aboow6rUrcY2SrFRa46C6uy = qstjuxvi0yplnkz8;
        this.ox9eclwMpRd = remoteFont2;
        this.PQQPeCDD0JLCT3aLz = i3;
        this.JY5knQmh7EQJEZ = qstjuxvi0yplnkz9;
        this.LYcdI4xpry8eXmFC9I4wyaLdcG1z = i4;
        this.flPMk2Ix9h3b95v = i5;
    }

    public static HorizontalClockStyle$Serialized S1zP5M3X7Ukq3ROlZ87G9I(HorizontalClockStyle$Serialized horizontalClockStyle$Serialized, String str, AtAGlanceInfo atAGlanceInfo, AtAGlanceStyleColor$PaletteColor atAGlanceStyleColor$PaletteColor, AtAGlanceStyleColor$PaletteColor atAGlanceStyleColor$PaletteColor2) {
        return new HorizontalClockStyle$Serialized(str, atAGlanceInfo, horizontalClockStyle$Serialized.BezslBgjveK3hODH, horizontalClockStyle$Serialized.ziNFA7KzVfc6, atAGlanceStyleColor$PaletteColor, horizontalClockStyle$Serialized.ox9eclwMpRd, horizontalClockStyle$Serialized.PQQPeCDD0JLCT3aLz, atAGlanceStyleColor$PaletteColor2, horizontalClockStyle$Serialized.LYcdI4xpry8eXmFC9I4wyaLdcG1z, horizontalClockStyle$Serialized.flPMk2Ix9h3b95v);
    }

    @Override // b.D4uDt21iAp885MiybCJz3keA
    public final String BezslBgjveK3hODH() {
        return this.S1zP5M3X7Ukq3ROlZ87G9I;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HorizontalClockStyle$Serialized)) {
            return false;
        }
        HorizontalClockStyle$Serialized horizontalClockStyle$Serialized = (HorizontalClockStyle$Serialized) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, horizontalClockStyle$Serialized.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, horizontalClockStyle$Serialized.axL8FocTDLUdzg0XScbO) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.BezslBgjveK3hODH, horizontalClockStyle$Serialized.BezslBgjveK3hODH) && this.ziNFA7KzVfc6 == horizontalClockStyle$Serialized.ziNFA7KzVfc6 && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.Aboow6rUrcY2SrFRa46C6uy, horizontalClockStyle$Serialized.Aboow6rUrcY2SrFRa46C6uy) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.ox9eclwMpRd, horizontalClockStyle$Serialized.ox9eclwMpRd) && this.PQQPeCDD0JLCT3aLz == horizontalClockStyle$Serialized.PQQPeCDD0JLCT3aLz && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.JY5knQmh7EQJEZ, horizontalClockStyle$Serialized.JY5knQmh7EQJEZ) && this.LYcdI4xpry8eXmFC9I4wyaLdcG1z == horizontalClockStyle$Serialized.LYcdI4xpry8eXmFC9I4wyaLdcG1z && this.flPMk2Ix9h3b95v == horizontalClockStyle$Serialized.flPMk2Ix9h3b95v;
    }

    public final int hashCode() {
        int iWT8HZhEwPEkG = LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.ziNFA7KzVfc6, (this.BezslBgjveK3hODH.hashCode() + ((this.axL8FocTDLUdzg0XScbO.hashCode() + (this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31)) * 31)) * 31, 31);
        qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz8 = this.Aboow6rUrcY2SrFRa46C6uy;
        int iWT8HZhEwPEkG2 = LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.PQQPeCDD0JLCT3aLz, (this.ox9eclwMpRd.hashCode() + ((iWT8HZhEwPEkG + (qstjuxvi0yplnkz8 == null ? 0 : qstjuxvi0yplnkz8.hashCode())) * 31)) * 31, 31);
        qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz9 = this.JY5knQmh7EQJEZ;
        return Integer.hashCode(this.flPMk2Ix9h3b95v) + LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.LYcdI4xpry8eXmFC9I4wyaLdcG1z, (iWT8HZhEwPEkG2 + (qstjuxvi0yplnkz9 != null ? qstjuxvi0yplnkz9.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "Serialized(uuid=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", info=" + this.axL8FocTDLUdzg0XScbO + ", hoursFont=" + this.BezslBgjveK3hODH + ", hoursTextSizeDp=" + this.ziNFA7KzVfc6 + ", hoursTextColorOverride=" + this.Aboow6rUrcY2SrFRa46C6uy + ", minutesFont=" + this.ox9eclwMpRd + ", minutesTextSizeDp=" + this.PQQPeCDD0JLCT3aLz + ", minutesTextColorOverride=" + this.JY5knQmh7EQJEZ + ", minutesTextHorizontalOffsetDp=" + this.LYcdI4xpry8eXmFC9I4wyaLdcG1z + ", minutesTextVerticalOffsetDp=" + this.flPMk2Ix9h3b95v + ")";
    }

    @Override // b.D4uDt21iAp885MiybCJz3keA
    public final AtAGlanceInfo ziNFA7KzVfc6() {
        return this.axL8FocTDLUdzg0XScbO;
    }

    public HorizontalClockStyle$Serialized(String str, AtAGlanceInfo atAGlanceInfo, RemoteFont remoteFont, int i, qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz8, RemoteFont remoteFont2, int i2, qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz9, int i3, int i4) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = atAGlanceInfo;
        this.BezslBgjveK3hODH = remoteFont;
        this.ziNFA7KzVfc6 = i;
        this.Aboow6rUrcY2SrFRa46C6uy = qstjuxvi0yplnkz8;
        this.ox9eclwMpRd = remoteFont2;
        this.PQQPeCDD0JLCT3aLz = i2;
        this.JY5knQmh7EQJEZ = qstjuxvi0yplnkz9;
        this.LYcdI4xpry8eXmFC9I4wyaLdcG1z = i3;
        this.flPMk2Ix9h3b95v = i4;
    }
}
