package bitpit.launcher.ataglance;

import b.D4uDt21iAp885MiybCJz3keA;
import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.aJLiMmqfPh61r;
import b.j1mrIRjYKLp7IIwdR9c;
import b.mHW63SUma8isGb;
import b.mrAjgCjIlpxZ7lEJ;
import b.qSDYaDqxbBy2QEeVAcFRy;
import bitpit.launcher.ataglance.clock.HorizontalClockAlignment;
import bitpit.launcher.text.RemoteFont;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class OverlapClockStyle$Serialized implements D4uDt21iAp885MiybCJz3keA {
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] ToEIy0qfkltfGfO3vmAQG = {null, null, null, null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new mrAjgCjIlpxZ7lEJ(10)), null, null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new mrAjgCjIlpxZ7lEJ(11)), qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new mrAjgCjIlpxZ7lEJ(12)), null, null};
    public final HorizontalClockAlignment Aboow6rUrcY2SrFRa46C6uy;
    public final RemoteFont BezslBgjveK3hODH;
    public final qsTJuxvI0Yplnkz8 JY5knQmh7EQJEZ;
    public final qsTJuxvI0Yplnkz8 LYcdI4xpry8eXmFC9I4wyaLdcG1z;
    public final float PQQPeCDD0JLCT3aLz;
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final AtAGlanceInfo axL8FocTDLUdzg0XScbO;
    public final float fXBtMGfTIjGSHgK542;
    public final boolean flPMk2Ix9h3b95v;
    public final int ox9eclwMpRd;
    public final int ziNFA7KzVfc6;

    public static final class Companion {
        public final KSerializer serializer() {
            return OverlapClockStyle$Serialized$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OverlapClockStyle$Serialized(int i, String str, AtAGlanceInfo atAGlanceInfo, RemoteFont remoteFont, int i2, HorizontalClockAlignment horizontalClockAlignment, int i3, float f, qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz8, qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz9, boolean z, float f2) {
        if (511 != (i & 511)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 511, OverlapClockStyle$Serialized$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = atAGlanceInfo;
        this.BezslBgjveK3hODH = remoteFont;
        this.ziNFA7KzVfc6 = i2;
        this.Aboow6rUrcY2SrFRa46C6uy = horizontalClockAlignment;
        this.ox9eclwMpRd = i3;
        this.PQQPeCDD0JLCT3aLz = f;
        this.JY5knQmh7EQJEZ = qstjuxvi0yplnkz8;
        this.LYcdI4xpry8eXmFC9I4wyaLdcG1z = qstjuxvi0yplnkz9;
        if ((i & 512) == 0) {
            this.flPMk2Ix9h3b95v = true;
        } else {
            this.flPMk2Ix9h3b95v = z;
        }
        if ((i & 1024) == 0) {
            this.fXBtMGfTIjGSHgK542 = 0.0f;
        } else {
            this.fXBtMGfTIjGSHgK542 = f2;
        }
    }

    public static OverlapClockStyle$Serialized S1zP5M3X7Ukq3ROlZ87G9I(OverlapClockStyle$Serialized overlapClockStyle$Serialized, String str, AtAGlanceInfo atAGlanceInfo, qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz8, qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz9) {
        return new OverlapClockStyle$Serialized(str, atAGlanceInfo, overlapClockStyle$Serialized.BezslBgjveK3hODH, overlapClockStyle$Serialized.ziNFA7KzVfc6, overlapClockStyle$Serialized.Aboow6rUrcY2SrFRa46C6uy, overlapClockStyle$Serialized.ox9eclwMpRd, overlapClockStyle$Serialized.PQQPeCDD0JLCT3aLz, qstjuxvi0yplnkz8, qstjuxvi0yplnkz9, overlapClockStyle$Serialized.flPMk2Ix9h3b95v, overlapClockStyle$Serialized.fXBtMGfTIjGSHgK542);
    }

    @Override // b.D4uDt21iAp885MiybCJz3keA
    public final String BezslBgjveK3hODH() {
        return this.S1zP5M3X7Ukq3ROlZ87G9I;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OverlapClockStyle$Serialized)) {
            return false;
        }
        OverlapClockStyle$Serialized overlapClockStyle$Serialized = (OverlapClockStyle$Serialized) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, overlapClockStyle$Serialized.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, overlapClockStyle$Serialized.axL8FocTDLUdzg0XScbO) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.BezslBgjveK3hODH, overlapClockStyle$Serialized.BezslBgjveK3hODH) && this.ziNFA7KzVfc6 == overlapClockStyle$Serialized.ziNFA7KzVfc6 && this.Aboow6rUrcY2SrFRa46C6uy == overlapClockStyle$Serialized.Aboow6rUrcY2SrFRa46C6uy && this.ox9eclwMpRd == overlapClockStyle$Serialized.ox9eclwMpRd && Float.compare(this.PQQPeCDD0JLCT3aLz, overlapClockStyle$Serialized.PQQPeCDD0JLCT3aLz) == 0 && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.JY5knQmh7EQJEZ, overlapClockStyle$Serialized.JY5knQmh7EQJEZ) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.LYcdI4xpry8eXmFC9I4wyaLdcG1z, overlapClockStyle$Serialized.LYcdI4xpry8eXmFC9I4wyaLdcG1z) && this.flPMk2Ix9h3b95v == overlapClockStyle$Serialized.flPMk2Ix9h3b95v && Float.compare(this.fXBtMGfTIjGSHgK542, overlapClockStyle$Serialized.fXBtMGfTIjGSHgK542) == 0;
    }

    public final int hashCode() {
        int iZiNFA7KzVfc6 = aJLiMmqfPh61r.ziNFA7KzVfc6(this.PQQPeCDD0JLCT3aLz, LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.ox9eclwMpRd, (this.Aboow6rUrcY2SrFRa46C6uy.hashCode() + LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.ziNFA7KzVfc6, (this.BezslBgjveK3hODH.hashCode() + ((this.axL8FocTDLUdzg0XScbO.hashCode() + (this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31)) * 31)) * 31, 31)) * 31, 31), 31);
        qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz8 = this.JY5knQmh7EQJEZ;
        int iHashCode = (iZiNFA7KzVfc6 + (qstjuxvi0yplnkz8 == null ? 0 : qstjuxvi0yplnkz8.hashCode())) * 31;
        qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz9 = this.LYcdI4xpry8eXmFC9I4wyaLdcG1z;
        return Float.hashCode(this.fXBtMGfTIjGSHgK542) + j1mrIRjYKLp7IIwdR9c.flPMk2Ix9h3b95v((iHashCode + (qstjuxvi0yplnkz9 != null ? qstjuxvi0yplnkz9.hashCode() : 0)) * 31, 31, this.flPMk2Ix9h3b95v);
    }

    public final String toString() {
        return "Serialized(uuid=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", info=" + this.axL8FocTDLUdzg0XScbO + ", clockFont=" + this.BezslBgjveK3hODH + ", clockTextSizeDp=" + this.ziNFA7KzVfc6 + ", horizontalAlignment=" + this.Aboow6rUrcY2SrFRa46C6uy + ", overlapCutoutSizeDp=" + this.ox9eclwMpRd + ", characterOverlapPercentage=" + this.PQQPeCDD0JLCT3aLz + ", primaryColorOverride=" + this.JY5knQmh7EQJEZ + ", secondaryColorOverride=" + this.LYcdI4xpry8eXmFC9I4wyaLdcG1z + ", useColonAsDivider=" + this.flPMk2Ix9h3b95v + ", dividerOverlapPercentage=" + this.fXBtMGfTIjGSHgK542 + ")";
    }

    @Override // b.D4uDt21iAp885MiybCJz3keA
    public final AtAGlanceInfo ziNFA7KzVfc6() {
        return this.axL8FocTDLUdzg0XScbO;
    }

    public OverlapClockStyle$Serialized(String str, AtAGlanceInfo atAGlanceInfo, RemoteFont remoteFont, int i, HorizontalClockAlignment horizontalClockAlignment, int i2, float f, qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz8, qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz9, boolean z, float f2) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = atAGlanceInfo;
        this.BezslBgjveK3hODH = remoteFont;
        this.ziNFA7KzVfc6 = i;
        this.Aboow6rUrcY2SrFRa46C6uy = horizontalClockAlignment;
        this.ox9eclwMpRd = i2;
        this.PQQPeCDD0JLCT3aLz = f;
        this.JY5knQmh7EQJEZ = qstjuxvi0yplnkz8;
        this.LYcdI4xpry8eXmFC9I4wyaLdcG1z = qstjuxvi0yplnkz9;
        this.flPMk2Ix9h3b95v = z;
        this.fXBtMGfTIjGSHgK542 = f2;
    }

    public /* synthetic */ OverlapClockStyle$Serialized(String str, AtAGlanceInfo atAGlanceInfo, RemoteFont remoteFont, int i, HorizontalClockAlignment horizontalClockAlignment, int i2, float f, int i3) {
        this(str, atAGlanceInfo, remoteFont, i, horizontalClockAlignment, i2, f, null, null, (i3 & 512) != 0, (i3 & 1024) != 0 ? 0.0f : 0.08f);
    }
}
