package bitpit.launcher.ataglance;

import b.D4uDt21iAp885MiybCJz3keA;
import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.XYtcAIGZkWt7;
import b.g3F3ECxxX7;
import b.mHW63SUma8isGb;
import b.qSDYaDqxbBy2QEeVAcFRy;
import bitpit.launcher.ataglance.clock.VerticalClockView;
import bitpit.launcher.text.RemoteFont;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class VerticalClockStyle$Serialized implements D4uDt21iAp885MiybCJz3keA {
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] fXBtMGfTIjGSHgK542 = {null, null, null, null, null, null, null, null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new g3F3ECxxX7(29)), qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new XYtcAIGZkWt7(0))};
    public final int Aboow6rUrcY2SrFRa46C6uy;
    public final RemoteFont BezslBgjveK3hODH;
    public final VerticalClockView.ColorPattern JY5knQmh7EQJEZ;
    public final qsTJuxvI0Yplnkz8 LYcdI4xpry8eXmFC9I4wyaLdcG1z;
    public final int PQQPeCDD0JLCT3aLz;
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final AtAGlanceInfo axL8FocTDLUdzg0XScbO;
    public final qsTJuxvI0Yplnkz8 flPMk2Ix9h3b95v;
    public final int ox9eclwMpRd;
    public final int ziNFA7KzVfc6;

    public static final class Companion {
        public final KSerializer serializer() {
            return VerticalClockStyle$Serialized$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VerticalClockStyle$Serialized(int i, String str, AtAGlanceInfo atAGlanceInfo, RemoteFont remoteFont, int i2, int i3, int i4, int i5, VerticalClockView.ColorPattern colorPattern, qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz8, qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz9) {
        if (911 != (i & 911)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 911, VerticalClockStyle$Serialized$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = atAGlanceInfo;
        this.BezslBgjveK3hODH = remoteFont;
        this.ziNFA7KzVfc6 = i2;
        if ((i & 16) == 0) {
            this.Aboow6rUrcY2SrFRa46C6uy = 8;
        } else {
            this.Aboow6rUrcY2SrFRa46C6uy = i3;
        }
        if ((i & 32) == 0) {
            this.ox9eclwMpRd = 4;
        } else {
            this.ox9eclwMpRd = i4;
        }
        if ((i & 64) == 0) {
            this.PQQPeCDD0JLCT3aLz = 4;
        } else {
            this.PQQPeCDD0JLCT3aLz = i5;
        }
        this.JY5knQmh7EQJEZ = colorPattern;
        this.LYcdI4xpry8eXmFC9I4wyaLdcG1z = qstjuxvi0yplnkz8;
        this.flPMk2Ix9h3b95v = qstjuxvi0yplnkz9;
    }

    public static VerticalClockStyle$Serialized S1zP5M3X7Ukq3ROlZ87G9I(VerticalClockStyle$Serialized verticalClockStyle$Serialized, String str, AtAGlanceInfo atAGlanceInfo, VerticalClockView.ColorPattern colorPattern, AtAGlanceStyleColor$PaletteColor atAGlanceStyleColor$PaletteColor, AtAGlanceStyleColor$PaletteColor atAGlanceStyleColor$PaletteColor2, int i) {
        return new VerticalClockStyle$Serialized(str, atAGlanceInfo, verticalClockStyle$Serialized.BezslBgjveK3hODH, verticalClockStyle$Serialized.ziNFA7KzVfc6, verticalClockStyle$Serialized.Aboow6rUrcY2SrFRa46C6uy, verticalClockStyle$Serialized.ox9eclwMpRd, verticalClockStyle$Serialized.PQQPeCDD0JLCT3aLz, colorPattern, atAGlanceStyleColor$PaletteColor, (i & 512) != 0 ? verticalClockStyle$Serialized.flPMk2Ix9h3b95v : atAGlanceStyleColor$PaletteColor2);
    }

    @Override // b.D4uDt21iAp885MiybCJz3keA
    public final String BezslBgjveK3hODH() {
        return this.S1zP5M3X7Ukq3ROlZ87G9I;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerticalClockStyle$Serialized)) {
            return false;
        }
        VerticalClockStyle$Serialized verticalClockStyle$Serialized = (VerticalClockStyle$Serialized) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, verticalClockStyle$Serialized.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, verticalClockStyle$Serialized.axL8FocTDLUdzg0XScbO) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.BezslBgjveK3hODH, verticalClockStyle$Serialized.BezslBgjveK3hODH) && this.ziNFA7KzVfc6 == verticalClockStyle$Serialized.ziNFA7KzVfc6 && this.Aboow6rUrcY2SrFRa46C6uy == verticalClockStyle$Serialized.Aboow6rUrcY2SrFRa46C6uy && this.ox9eclwMpRd == verticalClockStyle$Serialized.ox9eclwMpRd && this.PQQPeCDD0JLCT3aLz == verticalClockStyle$Serialized.PQQPeCDD0JLCT3aLz && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.JY5knQmh7EQJEZ, verticalClockStyle$Serialized.JY5knQmh7EQJEZ) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.LYcdI4xpry8eXmFC9I4wyaLdcG1z, verticalClockStyle$Serialized.LYcdI4xpry8eXmFC9I4wyaLdcG1z) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.flPMk2Ix9h3b95v, verticalClockStyle$Serialized.flPMk2Ix9h3b95v);
    }

    public final int hashCode() {
        int iHashCode = (this.JY5knQmh7EQJEZ.hashCode() + LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.PQQPeCDD0JLCT3aLz, LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.ox9eclwMpRd, LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.Aboow6rUrcY2SrFRa46C6uy, LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.ziNFA7KzVfc6, (this.BezslBgjveK3hODH.hashCode() + ((this.axL8FocTDLUdzg0XScbO.hashCode() + (this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31)) * 31)) * 31, 31), 31), 31), 31)) * 31;
        qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz8 = this.LYcdI4xpry8eXmFC9I4wyaLdcG1z;
        int iHashCode2 = (iHashCode + (qstjuxvi0yplnkz8 == null ? 0 : qstjuxvi0yplnkz8.hashCode())) * 31;
        qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz9 = this.flPMk2Ix9h3b95v;
        return iHashCode2 + (qstjuxvi0yplnkz9 != null ? qstjuxvi0yplnkz9.hashCode() : 0);
    }

    public final String toString() {
        return "Serialized(uuid=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", info=" + this.axL8FocTDLUdzg0XScbO + ", font=" + this.BezslBgjveK3hODH + ", clockTextSizeDp=" + this.ziNFA7KzVfc6 + ", verticalGapDp=" + this.Aboow6rUrcY2SrFRa46C6uy + ", horizontalPaddingDp=" + this.ox9eclwMpRd + ", bottomPaddingDp=" + this.PQQPeCDD0JLCT3aLz + ", colorPattern=" + this.JY5knQmh7EQJEZ + ", primaryColorOverride=" + this.LYcdI4xpry8eXmFC9I4wyaLdcG1z + ", secondaryColorOverride=" + this.flPMk2Ix9h3b95v + ")";
    }

    @Override // b.D4uDt21iAp885MiybCJz3keA
    public final AtAGlanceInfo ziNFA7KzVfc6() {
        return this.axL8FocTDLUdzg0XScbO;
    }

    public VerticalClockStyle$Serialized(String str, AtAGlanceInfo atAGlanceInfo, RemoteFont remoteFont, int i, int i2, int i3, int i4, VerticalClockView.ColorPattern colorPattern, qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz8, qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz9) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = atAGlanceInfo;
        this.BezslBgjveK3hODH = remoteFont;
        this.ziNFA7KzVfc6 = i;
        this.Aboow6rUrcY2SrFRa46C6uy = i2;
        this.ox9eclwMpRd = i3;
        this.PQQPeCDD0JLCT3aLz = i4;
        this.JY5knQmh7EQJEZ = colorPattern;
        this.LYcdI4xpry8eXmFC9I4wyaLdcG1z = qstjuxvi0yplnkz8;
        this.flPMk2Ix9h3b95v = qstjuxvi0yplnkz9;
    }

    public /* synthetic */ VerticalClockStyle$Serialized(String str, AtAGlanceInfo atAGlanceInfo, RemoteFont remoteFont, int i, int i2, VerticalClockView.ColorPattern colorPattern, int i3) {
        this(str, atAGlanceInfo, remoteFont, i, i2, 4, (i3 & 64) != 0 ? 4 : 8, colorPattern, null, null);
    }
}
