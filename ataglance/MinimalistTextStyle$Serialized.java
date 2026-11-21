package bitpit.launcher.ataglance;

import b.D4uDt21iAp885MiybCJz3keA;
import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.aJLiMmqfPh61r;
import b.mHW63SUma8isGb;
import b.mrAjgCjIlpxZ7lEJ;
import b.qSDYaDqxbBy2QEeVAcFRy;
import bitpit.launcher.text.RemoteFont;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class MinimalistTextStyle$Serialized implements D4uDt21iAp885MiybCJz3keA {
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] HveD9n1tOYlffjJDxghBitYNgB = {null, null, null, null, null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new mrAjgCjIlpxZ7lEJ(0)), null, null, null, null, null, null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new mrAjgCjIlpxZ7lEJ(1))};
    public final float Aboow6rUrcY2SrFRa46C6uy;
    public final RemoteFont BezslBgjveK3hODH;
    public final qsTJuxvI0Yplnkz8 H5sQ15nhYoaKKHhx;
    public final int JY5knQmh7EQJEZ;
    public final float LYcdI4xpry8eXmFC9I4wyaLdcG1z;
    public final RemoteFont PQQPeCDD0JLCT3aLz;
    public final String S1zP5M3X7Ukq3ROlZ87G9I;
    public final int ToEIy0qfkltfGfO3vmAQG;
    public final AtAGlanceInfo axL8FocTDLUdzg0XScbO;
    public final int fXBtMGfTIjGSHgK542;
    public final int flPMk2Ix9h3b95v;
    public final qsTJuxvI0Yplnkz8 ox9eclwMpRd;
    public final int ziNFA7KzVfc6;

    public static final class Companion {
        public final KSerializer serializer() {
            return MinimalistTextStyle$Serialized$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MinimalistTextStyle$Serialized(int i, String str, AtAGlanceInfo atAGlanceInfo, RemoteFont remoteFont, int i2, float f, qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz8, RemoteFont remoteFont2, int i3, float f2, int i4, int i5, int i6, qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz9) {
        if (8191 != (i & 8191)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 8191, MinimalistTextStyle$Serialized$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = atAGlanceInfo;
        this.BezslBgjveK3hODH = remoteFont;
        this.ziNFA7KzVfc6 = i2;
        this.Aboow6rUrcY2SrFRa46C6uy = f;
        this.ox9eclwMpRd = qstjuxvi0yplnkz8;
        this.PQQPeCDD0JLCT3aLz = remoteFont2;
        this.JY5knQmh7EQJEZ = i3;
        this.LYcdI4xpry8eXmFC9I4wyaLdcG1z = f2;
        this.flPMk2Ix9h3b95v = i4;
        this.fXBtMGfTIjGSHgK542 = i5;
        this.ToEIy0qfkltfGfO3vmAQG = i6;
        this.H5sQ15nhYoaKKHhx = qstjuxvi0yplnkz9;
    }

    public static MinimalistTextStyle$Serialized S1zP5M3X7Ukq3ROlZ87G9I(MinimalistTextStyle$Serialized minimalistTextStyle$Serialized, String str, AtAGlanceInfo atAGlanceInfo, AtAGlanceStyleColor$PaletteColor atAGlanceStyleColor$PaletteColor, RemoteFont remoteFont, int i) {
        return new MinimalistTextStyle$Serialized(str, atAGlanceInfo, minimalistTextStyle$Serialized.BezslBgjveK3hODH, minimalistTextStyle$Serialized.ziNFA7KzVfc6, minimalistTextStyle$Serialized.Aboow6rUrcY2SrFRa46C6uy, (i & 32) != 0 ? minimalistTextStyle$Serialized.ox9eclwMpRd : atAGlanceStyleColor$PaletteColor, (i & 64) != 0 ? minimalistTextStyle$Serialized.PQQPeCDD0JLCT3aLz : remoteFont, minimalistTextStyle$Serialized.JY5knQmh7EQJEZ, minimalistTextStyle$Serialized.LYcdI4xpry8eXmFC9I4wyaLdcG1z, minimalistTextStyle$Serialized.flPMk2Ix9h3b95v, minimalistTextStyle$Serialized.fXBtMGfTIjGSHgK542, minimalistTextStyle$Serialized.ToEIy0qfkltfGfO3vmAQG, minimalistTextStyle$Serialized.H5sQ15nhYoaKKHhx);
    }

    @Override // b.D4uDt21iAp885MiybCJz3keA
    public final String BezslBgjveK3hODH() {
        return this.S1zP5M3X7Ukq3ROlZ87G9I;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinimalistTextStyle$Serialized)) {
            return false;
        }
        MinimalistTextStyle$Serialized minimalistTextStyle$Serialized = (MinimalistTextStyle$Serialized) obj;
        return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, minimalistTextStyle$Serialized.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, minimalistTextStyle$Serialized.axL8FocTDLUdzg0XScbO) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.BezslBgjveK3hODH, minimalistTextStyle$Serialized.BezslBgjveK3hODH) && this.ziNFA7KzVfc6 == minimalistTextStyle$Serialized.ziNFA7KzVfc6 && Float.compare(this.Aboow6rUrcY2SrFRa46C6uy, minimalistTextStyle$Serialized.Aboow6rUrcY2SrFRa46C6uy) == 0 && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.ox9eclwMpRd, minimalistTextStyle$Serialized.ox9eclwMpRd) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.PQQPeCDD0JLCT3aLz, minimalistTextStyle$Serialized.PQQPeCDD0JLCT3aLz) && this.JY5knQmh7EQJEZ == minimalistTextStyle$Serialized.JY5knQmh7EQJEZ && Float.compare(this.LYcdI4xpry8eXmFC9I4wyaLdcG1z, minimalistTextStyle$Serialized.LYcdI4xpry8eXmFC9I4wyaLdcG1z) == 0 && this.flPMk2Ix9h3b95v == minimalistTextStyle$Serialized.flPMk2Ix9h3b95v && this.fXBtMGfTIjGSHgK542 == minimalistTextStyle$Serialized.fXBtMGfTIjGSHgK542 && this.ToEIy0qfkltfGfO3vmAQG == minimalistTextStyle$Serialized.ToEIy0qfkltfGfO3vmAQG && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.H5sQ15nhYoaKKHhx, minimalistTextStyle$Serialized.H5sQ15nhYoaKKHhx);
    }

    public final int hashCode() {
        int iZiNFA7KzVfc6 = aJLiMmqfPh61r.ziNFA7KzVfc6(this.Aboow6rUrcY2SrFRa46C6uy, LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.ziNFA7KzVfc6, (this.BezslBgjveK3hODH.hashCode() + ((this.axL8FocTDLUdzg0XScbO.hashCode() + (this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31)) * 31)) * 31, 31), 31);
        qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz8 = this.ox9eclwMpRd;
        int iWT8HZhEwPEkG = LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.ToEIy0qfkltfGfO3vmAQG, LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.fXBtMGfTIjGSHgK542, LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.flPMk2Ix9h3b95v, aJLiMmqfPh61r.ziNFA7KzVfc6(this.LYcdI4xpry8eXmFC9I4wyaLdcG1z, LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.JY5knQmh7EQJEZ, (this.PQQPeCDD0JLCT3aLz.hashCode() + ((iZiNFA7KzVfc6 + (qstjuxvi0yplnkz8 == null ? 0 : qstjuxvi0yplnkz8.hashCode())) * 31)) * 31, 31), 31), 31), 31), 31);
        qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz9 = this.H5sQ15nhYoaKKHhx;
        return iWT8HZhEwPEkG + (qstjuxvi0yplnkz9 != null ? qstjuxvi0yplnkz9.hashCode() : 0);
    }

    public final String toString() {
        return "Serialized(uuid=" + this.S1zP5M3X7Ukq3ROlZ87G9I + ", info=" + this.axL8FocTDLUdzg0XScbO + ", backgroundTextFont=" + this.BezslBgjveK3hODH + ", backgroundTextSizeDp=" + this.ziNFA7KzVfc6 + ", backgroundTextLetterSpacing=" + this.Aboow6rUrcY2SrFRa46C6uy + ", backgroundTextColorOverride=" + this.ox9eclwMpRd + ", innerTextFont=" + this.PQQPeCDD0JLCT3aLz + ", innerTextSizeDp=" + this.JY5knQmh7EQJEZ + ", innerTextLetterSpacing=" + this.LYcdI4xpry8eXmFC9I4wyaLdcG1z + ", innerTextSegmentGapMinDp=" + this.flPMk2Ix9h3b95v + ", innerTextSegmentGapMaxDp=" + this.fXBtMGfTIjGSHgK542 + ", innerTextVerticalPaddingDp=" + this.ToEIy0qfkltfGfO3vmAQG + ", baseColorOverride=" + this.H5sQ15nhYoaKKHhx + ")";
    }

    @Override // b.D4uDt21iAp885MiybCJz3keA
    public final AtAGlanceInfo ziNFA7KzVfc6() {
        return this.axL8FocTDLUdzg0XScbO;
    }

    public MinimalistTextStyle$Serialized(String str, AtAGlanceInfo atAGlanceInfo, RemoteFont remoteFont, int i, float f, qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz8, RemoteFont remoteFont2, int i2, float f2, int i3, int i4, int i5, qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz9) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        this.axL8FocTDLUdzg0XScbO = atAGlanceInfo;
        this.BezslBgjveK3hODH = remoteFont;
        this.ziNFA7KzVfc6 = i;
        this.Aboow6rUrcY2SrFRa46C6uy = f;
        this.ox9eclwMpRd = qstjuxvi0yplnkz8;
        this.PQQPeCDD0JLCT3aLz = remoteFont2;
        this.JY5knQmh7EQJEZ = i2;
        this.LYcdI4xpry8eXmFC9I4wyaLdcG1z = f2;
        this.flPMk2Ix9h3b95v = i3;
        this.fXBtMGfTIjGSHgK542 = i4;
        this.ToEIy0qfkltfGfO3vmAQG = i5;
        this.H5sQ15nhYoaKKHhx = qstjuxvi0yplnkz9;
    }
}
