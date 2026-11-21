package bitpit.launcher.backend.analytics.usage.model;

import android.os.Build;
import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.a9kWzoj6D3Yoa0;
import b.dz52zjPsVWHg6u;
import b.eUwPamJ8sGfSyqS5ucd4;
import b.g3F3ECxxX7;
import b.mHW63SUma8isGb;
import b.oJ08Xj0ZV1gAa;
import b.qSDYaDqxbBy2QEeVAcFRy;
import java.util.List;
import java.util.UUID;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class UsageReport {
    public final long Aboow6rUrcY2SrFRa46C6uy;
    public final long BezslBgjveK3hODH;
    public final List H5sQ15nhYoaKKHhx;
    public final List HveD9n1tOYlffjJDxghBitYNgB;
    public final Integer JY5knQmh7EQJEZ;
    public final String LYcdI4xpry8eXmFC9I4wyaLdcG1z;
    public final String PQQPeCDD0JLCT3aLz;
    public final List Ql6q60SSx3;
    public final UUID S1zP5M3X7Ukq3ROlZ87G9I;
    public final List ToEIy0qfkltfGfO3vmAQG;
    public final int axL8FocTDLUdzg0XScbO;
    public final int fXBtMGfTIjGSHgK542;
    public final String flPMk2Ix9h3b95v;
    public final int ox9eclwMpRd;
    public final List sBV5EuS0mGuEYqc5nc5erhuwb1OG7;
    public final long ziNFA7KzVfc6;
    public static final Companion Companion = new Companion();
    public static final mHW63SUma8isGb[] Bk6w7oZjoWt9ZSRs4C7jIhbX3 = {null, null, null, null, null, null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new g3F3ECxxX7(12)), null, null, null, null, qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new g3F3ECxxX7(13)), qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new g3F3ECxxX7(14)), qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new g3F3ECxxX7(15)), qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new g3F3ECxxX7(16)), qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(2, new g3F3ECxxX7(17))};

    public static final class Companion {
        public final KSerializer serializer() {
            return UsageReport$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UsageReport(int i, UUID uuid, int i2, long j, long j2, long j3, int i3, String str, Integer num, String str2, String str3, int i4, List list, List list2, List list3, List list4, List list5) {
        if (1087 != (i & 1087)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 1087, UsageReport$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = uuid;
        this.axL8FocTDLUdzg0XScbO = i2;
        this.BezslBgjveK3hODH = j;
        this.ziNFA7KzVfc6 = j2;
        this.Aboow6rUrcY2SrFRa46C6uy = j3;
        this.ox9eclwMpRd = i3;
        if ((i & 64) == 0) {
            this.PQQPeCDD0JLCT3aLz = null;
        } else {
            this.PQQPeCDD0JLCT3aLz = str;
        }
        if ((i & 128) == 0) {
            this.JY5knQmh7EQJEZ = null;
        } else {
            this.JY5knQmh7EQJEZ = num;
        }
        if ((i & 256) == 0) {
            this.LYcdI4xpry8eXmFC9I4wyaLdcG1z = null;
        } else {
            this.LYcdI4xpry8eXmFC9I4wyaLdcG1z = str2;
        }
        if ((i & 512) == 0) {
            this.flPMk2Ix9h3b95v = null;
        } else {
            this.flPMk2Ix9h3b95v = str3;
        }
        this.fXBtMGfTIjGSHgK542 = i4;
        int i5 = i & 2048;
        a9kWzoj6D3Yoa0 a9kwzoj6d3yoa0 = a9kWzoj6D3Yoa0.GO8WUug7ZWFCUI1zY;
        if (i5 == 0) {
            this.ToEIy0qfkltfGfO3vmAQG = a9kwzoj6d3yoa0;
        } else {
            this.ToEIy0qfkltfGfO3vmAQG = list;
        }
        if ((i & 4096) == 0) {
            this.H5sQ15nhYoaKKHhx = a9kwzoj6d3yoa0;
        } else {
            this.H5sQ15nhYoaKKHhx = list2;
        }
        if ((i & 8192) == 0) {
            this.HveD9n1tOYlffjJDxghBitYNgB = a9kwzoj6d3yoa0;
        } else {
            this.HveD9n1tOYlffjJDxghBitYNgB = list3;
        }
        if ((i & 16384) == 0) {
            this.sBV5EuS0mGuEYqc5nc5erhuwb1OG7 = a9kwzoj6d3yoa0;
        } else {
            this.sBV5EuS0mGuEYqc5nc5erhuwb1OG7 = list4;
        }
        if ((i & 32768) == 0) {
            this.Ql6q60SSx3 = a9kwzoj6d3yoa0;
        } else {
            this.Ql6q60SSx3 = list5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004a  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsageReport)) {
            return false;
        }
        UsageReport usageReport = (UsageReport) obj;
        if (!OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, usageReport.S1zP5M3X7Ukq3ROlZ87G9I) || this.axL8FocTDLUdzg0XScbO != usageReport.axL8FocTDLUdzg0XScbO || this.BezslBgjveK3hODH != usageReport.BezslBgjveK3hODH || this.ziNFA7KzVfc6 != usageReport.ziNFA7KzVfc6 || this.Aboow6rUrcY2SrFRa46C6uy != usageReport.Aboow6rUrcY2SrFRa46C6uy || this.ox9eclwMpRd != usageReport.ox9eclwMpRd) {
            return false;
        }
        String str = usageReport.PQQPeCDD0JLCT3aLz;
        String str2 = this.PQQPeCDD0JLCT3aLz;
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
        return zEquals && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.JY5knQmh7EQJEZ, usageReport.JY5knQmh7EQJEZ) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.LYcdI4xpry8eXmFC9I4wyaLdcG1z, usageReport.LYcdI4xpry8eXmFC9I4wyaLdcG1z) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.flPMk2Ix9h3b95v, usageReport.flPMk2Ix9h3b95v) && this.fXBtMGfTIjGSHgK542 == usageReport.fXBtMGfTIjGSHgK542 && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.ToEIy0qfkltfGfO3vmAQG, usageReport.ToEIy0qfkltfGfO3vmAQG) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.H5sQ15nhYoaKKHhx, usageReport.H5sQ15nhYoaKKHhx) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.HveD9n1tOYlffjJDxghBitYNgB, usageReport.HveD9n1tOYlffjJDxghBitYNgB) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.sBV5EuS0mGuEYqc5nc5erhuwb1OG7, usageReport.sBV5EuS0mGuEYqc5nc5erhuwb1OG7) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.Ql6q60SSx3, usageReport.Ql6q60SSx3);
    }

    public final int hashCode() {
        int iHashCode;
        int iWT8HZhEwPEkG = LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.ox9eclwMpRd, oJ08Xj0ZV1gAa.PQQPeCDD0JLCT3aLz(oJ08Xj0ZV1gAa.PQQPeCDD0JLCT3aLz(oJ08Xj0ZV1gAa.PQQPeCDD0JLCT3aLz(LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.axL8FocTDLUdzg0XScbO, this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31, 31), this.BezslBgjveK3hODH, 31), this.ziNFA7KzVfc6, 31), this.Aboow6rUrcY2SrFRa46C6uy, 31), 31);
        String str = this.PQQPeCDD0JLCT3aLz;
        if (str == null) {
            iHashCode = 0;
        } else {
            dz52zjPsVWHg6u dz52zjpsvwhg6u = eUwPamJ8sGfSyqS5ucd4.Companion;
            iHashCode = str.hashCode();
        }
        int i = (iWT8HZhEwPEkG + iHashCode) * 31;
        Integer num = this.JY5knQmh7EQJEZ;
        int iHashCode2 = (i + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.LYcdI4xpry8eXmFC9I4wyaLdcG1z;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.flPMk2Ix9h3b95v;
        return this.Ql6q60SSx3.hashCode() + ((this.sBV5EuS0mGuEYqc5nc5erhuwb1OG7.hashCode() + ((this.HveD9n1tOYlffjJDxghBitYNgB.hashCode() + ((this.H5sQ15nhYoaKKHhx.hashCode() + ((this.ToEIy0qfkltfGfO3vmAQG.hashCode() + LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.fXBtMGfTIjGSHgK542, (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsageReport(usageId=");
        sb.append(this.S1zP5M3X7Ukq3ROlZ87G9I);
        sb.append(", versionCode=");
        sb.append(this.axL8FocTDLUdzg0XScbO);
        sb.append(", uploadTime=");
        sb.append(this.BezslBgjveK3hODH);
        sb.append(", startTime=");
        sb.append(this.ziNFA7KzVfc6);
        sb.append(", endTime=");
        sb.append(this.Aboow6rUrcY2SrFRa46C6uy);
        sb.append(", timeZoneOffset=");
        sb.append(this.ox9eclwMpRd);
        sb.append(", country=");
        String str = this.PQQPeCDD0JLCT3aLz;
        sb.append((Object) (str == null ? "null" : eUwPamJ8sGfSyqS5ucd4.axL8FocTDLUdzg0XScbO(str)));
        sb.append(", androidSdkVersion=");
        sb.append(this.JY5knQmh7EQJEZ);
        sb.append(", deviceManufacturer=");
        sb.append(this.LYcdI4xpry8eXmFC9I4wyaLdcG1z);
        sb.append(", deviceModel=");
        sb.append(this.flPMk2Ix9h3b95v);
        sb.append(", flags=");
        sb.append(this.fXBtMGfTIjGSHgK542);
        sb.append(", feedEntries=");
        sb.append(this.ToEIy0qfkltfGfO3vmAQG);
        sb.append(", launches=");
        sb.append(this.H5sQ15nhYoaKKHhx);
        sb.append(", notifications=");
        sb.append(this.HveD9n1tOYlffjJDxghBitYNgB);
        sb.append(", activities=");
        sb.append(this.sBV5EuS0mGuEYqc5nc5erhuwb1OG7);
        sb.append(", surveyResponses=");
        sb.append(this.Ql6q60SSx3);
        sb.append(')');
        return sb.toString();
    }

    public static final class Activity {
        public static final Companion Companion = new Companion();
        public final int Aboow6rUrcY2SrFRa46C6uy;
        public final long BezslBgjveK3hODH;
        public final int S1zP5M3X7Ukq3ROlZ87G9I;
        public final long axL8FocTDLUdzg0XScbO;
        public final int ziNFA7KzVfc6;

        public static final class Companion {
            public final KSerializer serializer() {
                return UsageReport$Activity$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Activity(int i, int i2, long j, long j2, int i3, int i4) {
            if (31 != (i & 31)) {
                PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 31, UsageReport$Activity$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.S1zP5M3X7Ukq3ROlZ87G9I = i2;
            this.axL8FocTDLUdzg0XScbO = j;
            this.BezslBgjveK3hODH = j2;
            this.ziNFA7KzVfc6 = i3;
            this.Aboow6rUrcY2SrFRa46C6uy = i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return this.S1zP5M3X7Ukq3ROlZ87G9I == activity.S1zP5M3X7Ukq3ROlZ87G9I && this.axL8FocTDLUdzg0XScbO == activity.axL8FocTDLUdzg0XScbO && this.BezslBgjveK3hODH == activity.BezslBgjveK3hODH && this.ziNFA7KzVfc6 == activity.ziNFA7KzVfc6 && this.Aboow6rUrcY2SrFRa46C6uy == activity.Aboow6rUrcY2SrFRa46C6uy;
        }

        public final int hashCode() {
            return Integer.hashCode(this.Aboow6rUrcY2SrFRa46C6uy) + LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.ziNFA7KzVfc6, oJ08Xj0ZV1gAa.PQQPeCDD0JLCT3aLz(oJ08Xj0ZV1gAa.PQQPeCDD0JLCT3aLz(Integer.hashCode(this.S1zP5M3X7Ukq3ROlZ87G9I) * 31, this.axL8FocTDLUdzg0XScbO, 31), this.BezslBgjveK3hODH, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Activity(type=");
            sb.append(this.S1zP5M3X7Ukq3ROlZ87G9I);
            sb.append(", startTime=");
            sb.append(this.axL8FocTDLUdzg0XScbO);
            sb.append(", duration=");
            sb.append(this.BezslBgjveK3hODH);
            sb.append(", timeZoneOffset=");
            sb.append(this.ziNFA7KzVfc6);
            sb.append(", flags=");
            return oJ08Xj0ZV1gAa.Ql6q60SSx3(sb, this.Aboow6rUrcY2SrFRa46C6uy, ')');
        }

        public Activity(int i, int i2, int i3, long j, long j2) {
            this.S1zP5M3X7Ukq3ROlZ87G9I = i;
            this.axL8FocTDLUdzg0XScbO = j;
            this.BezslBgjveK3hODH = j2;
            this.ziNFA7KzVfc6 = i2;
            this.Aboow6rUrcY2SrFRa46C6uy = i3;
        }
    }

    public static final class FeedEntry {
        public static final Companion Companion = new Companion();
        public final int Aboow6rUrcY2SrFRa46C6uy;
        public final int BezslBgjveK3hODH;
        public final String S1zP5M3X7Ukq3ROlZ87G9I;
        public final String axL8FocTDLUdzg0XScbO;
        public final int ox9eclwMpRd;
        public final int ziNFA7KzVfc6;

        public static final class Companion {
            public final KSerializer serializer() {
                return UsageReport$FeedEntry$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ FeedEntry(int i, String str, String str2, int i2, int i3, int i4, int i5) {
            if (63 != (i & 63)) {
                PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 63, UsageReport$FeedEntry$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.S1zP5M3X7Ukq3ROlZ87G9I = str;
            this.axL8FocTDLUdzg0XScbO = str2;
            this.BezslBgjveK3hODH = i2;
            this.ziNFA7KzVfc6 = i3;
            this.Aboow6rUrcY2SrFRa46C6uy = i4;
            this.ox9eclwMpRd = i5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FeedEntry)) {
                return false;
            }
            FeedEntry feedEntry = (FeedEntry) obj;
            return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, feedEntry.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, feedEntry.axL8FocTDLUdzg0XScbO) && this.BezslBgjveK3hODH == feedEntry.BezslBgjveK3hODH && this.ziNFA7KzVfc6 == feedEntry.ziNFA7KzVfc6 && this.Aboow6rUrcY2SrFRa46C6uy == feedEntry.Aboow6rUrcY2SrFRa46C6uy && this.ox9eclwMpRd == feedEntry.ox9eclwMpRd;
        }

        public final int hashCode() {
            int iHashCode = this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31;
            String str = this.axL8FocTDLUdzg0XScbO;
            return Integer.hashCode(this.ox9eclwMpRd) + LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.Aboow6rUrcY2SrFRa46C6uy, LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.ziNFA7KzVfc6, LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.BezslBgjveK3hODH, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FeedEntry(packageName=");
            sb.append(this.S1zP5M3X7Ukq3ROlZ87G9I);
            sb.append(", className=");
            sb.append(this.axL8FocTDLUdzg0XScbO);
            sb.append(", infoType=");
            sb.append(this.BezslBgjveK3hODH);
            sb.append(", feedType=");
            sb.append(this.ziNFA7KzVfc6);
            sb.append(", feedGroup=");
            sb.append(this.Aboow6rUrcY2SrFRa46C6uy);
            sb.append(", flags=");
            return oJ08Xj0ZV1gAa.Ql6q60SSx3(sb, this.ox9eclwMpRd, ')');
        }

        public FeedEntry(String str, String str2, int i, int i2, int i3, int i4) {
            this.S1zP5M3X7Ukq3ROlZ87G9I = str;
            this.axL8FocTDLUdzg0XScbO = str2;
            this.BezslBgjveK3hODH = i;
            this.ziNFA7KzVfc6 = i2;
            this.Aboow6rUrcY2SrFRa46C6uy = i3;
            this.ox9eclwMpRd = i4;
        }
    }

    public static final class Launch {
        public static final Companion Companion = new Companion();
        public final int Aboow6rUrcY2SrFRa46C6uy;
        public final int BezslBgjveK3hODH;
        public final int PQQPeCDD0JLCT3aLz;
        public final String S1zP5M3X7Ukq3ROlZ87G9I;
        public final String axL8FocTDLUdzg0XScbO;
        public final int ox9eclwMpRd;
        public final long ziNFA7KzVfc6;

        public static final class Companion {
            public final KSerializer serializer() {
                return UsageReport$Launch$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Launch(int i, String str, String str2, int i2, long j, int i3, int i4, int i5) {
            if (127 != (i & 127)) {
                PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 127, UsageReport$Launch$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.S1zP5M3X7Ukq3ROlZ87G9I = str;
            this.axL8FocTDLUdzg0XScbO = str2;
            this.BezslBgjveK3hODH = i2;
            this.ziNFA7KzVfc6 = j;
            this.Aboow6rUrcY2SrFRa46C6uy = i3;
            this.ox9eclwMpRd = i4;
            this.PQQPeCDD0JLCT3aLz = i5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Launch)) {
                return false;
            }
            Launch launch = (Launch) obj;
            return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, launch.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, launch.axL8FocTDLUdzg0XScbO) && this.BezslBgjveK3hODH == launch.BezslBgjveK3hODH && this.ziNFA7KzVfc6 == launch.ziNFA7KzVfc6 && this.Aboow6rUrcY2SrFRa46C6uy == launch.Aboow6rUrcY2SrFRa46C6uy && this.ox9eclwMpRd == launch.ox9eclwMpRd && this.PQQPeCDD0JLCT3aLz == launch.PQQPeCDD0JLCT3aLz;
        }

        public final int hashCode() {
            int iHashCode = this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31;
            String str = this.axL8FocTDLUdzg0XScbO;
            return Integer.hashCode(this.PQQPeCDD0JLCT3aLz) + LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.ox9eclwMpRd, LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.Aboow6rUrcY2SrFRa46C6uy, oJ08Xj0ZV1gAa.PQQPeCDD0JLCT3aLz(LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.BezslBgjveK3hODH, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), this.ziNFA7KzVfc6, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Launch(packageName=");
            sb.append(this.S1zP5M3X7Ukq3ROlZ87G9I);
            sb.append(", className=");
            sb.append(this.axL8FocTDLUdzg0XScbO);
            sb.append(", infoType=");
            sb.append(this.BezslBgjveK3hODH);
            sb.append(", time=");
            sb.append(this.ziNFA7KzVfc6);
            sb.append(", timeZoneOffset=");
            sb.append(this.Aboow6rUrcY2SrFRa46C6uy);
            sb.append(", duration=");
            sb.append(this.ox9eclwMpRd);
            sb.append(", flags=");
            return oJ08Xj0ZV1gAa.Ql6q60SSx3(sb, this.PQQPeCDD0JLCT3aLz, ')');
        }

        public Launch(String str, String str2, int i, long j, int i2, int i3, int i4) {
            this.S1zP5M3X7Ukq3ROlZ87G9I = str;
            this.axL8FocTDLUdzg0XScbO = str2;
            this.BezslBgjveK3hODH = i;
            this.ziNFA7KzVfc6 = j;
            this.Aboow6rUrcY2SrFRa46C6uy = i2;
            this.ox9eclwMpRd = i3;
            this.PQQPeCDD0JLCT3aLz = i4;
        }
    }

    public static final class SurveyResponse {
        public static final Companion Companion = new Companion();
        public final String Aboow6rUrcY2SrFRa46C6uy;
        public final String BezslBgjveK3hODH;
        public final int JY5knQmh7EQJEZ;
        public final int PQQPeCDD0JLCT3aLz;
        public final String S1zP5M3X7Ukq3ROlZ87G9I;
        public final String axL8FocTDLUdzg0XScbO;
        public final long ox9eclwMpRd;
        public final String ziNFA7KzVfc6;

        public static final class Companion {
            public final KSerializer serializer() {
                return UsageReport$SurveyResponse$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SurveyResponse(int i, String str, String str2, String str3, String str4, String str5, long j, int i2, int i3) {
            if (255 != (i & 255)) {
                PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 255, UsageReport$SurveyResponse$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.S1zP5M3X7Ukq3ROlZ87G9I = str;
            this.axL8FocTDLUdzg0XScbO = str2;
            this.BezslBgjveK3hODH = str3;
            this.ziNFA7KzVfc6 = str4;
            this.Aboow6rUrcY2SrFRa46C6uy = str5;
            this.ox9eclwMpRd = j;
            this.PQQPeCDD0JLCT3aLz = i2;
            this.JY5knQmh7EQJEZ = i3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SurveyResponse)) {
                return false;
            }
            SurveyResponse surveyResponse = (SurveyResponse) obj;
            return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, surveyResponse.S1zP5M3X7Ukq3ROlZ87G9I) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.axL8FocTDLUdzg0XScbO, surveyResponse.axL8FocTDLUdzg0XScbO) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.BezslBgjveK3hODH, surveyResponse.BezslBgjveK3hODH) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.ziNFA7KzVfc6, surveyResponse.ziNFA7KzVfc6) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.Aboow6rUrcY2SrFRa46C6uy, surveyResponse.Aboow6rUrcY2SrFRa46C6uy) && this.ox9eclwMpRd == surveyResponse.ox9eclwMpRd && this.PQQPeCDD0JLCT3aLz == surveyResponse.PQQPeCDD0JLCT3aLz && this.JY5knQmh7EQJEZ == surveyResponse.JY5knQmh7EQJEZ;
        }

        public final int hashCode() {
            return Integer.hashCode(this.JY5knQmh7EQJEZ) + LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.PQQPeCDD0JLCT3aLz, oJ08Xj0ZV1gAa.PQQPeCDD0JLCT3aLz(LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(LthVJzs8YB767vHOMwO80UNP7QrQi.ox9eclwMpRd(this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31, this.axL8FocTDLUdzg0XScbO, 31), this.BezslBgjveK3hODH, 31), this.ziNFA7KzVfc6, 31), this.Aboow6rUrcY2SrFRa46C6uy, 31), this.ox9eclwMpRd, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SurveyResponse(questionType=");
            sb.append(this.S1zP5M3X7Ukq3ROlZ87G9I);
            sb.append(", questionReference=");
            sb.append(this.axL8FocTDLUdzg0XScbO);
            sb.append(", questionText=");
            sb.append(this.BezslBgjveK3hODH);
            sb.append(", responseData=");
            sb.append(this.ziNFA7KzVfc6);
            sb.append(", responseText=");
            sb.append(this.Aboow6rUrcY2SrFRa46C6uy);
            sb.append(", time=");
            sb.append(this.ox9eclwMpRd);
            sb.append(", timeZoneOffset=");
            sb.append(this.PQQPeCDD0JLCT3aLz);
            sb.append(", flags=");
            return oJ08Xj0ZV1gAa.Ql6q60SSx3(sb, this.JY5knQmh7EQJEZ, ')');
        }

        public SurveyResponse(String str, String str2, String str3, String str4, String str5, long j, int i, int i2) {
            this.S1zP5M3X7Ukq3ROlZ87G9I = str;
            this.axL8FocTDLUdzg0XScbO = str2;
            this.BezslBgjveK3hODH = str3;
            this.ziNFA7KzVfc6 = str4;
            this.Aboow6rUrcY2SrFRa46C6uy = str5;
            this.ox9eclwMpRd = j;
            this.PQQPeCDD0JLCT3aLz = i;
            this.JY5knQmh7EQJEZ = i2;
        }
    }

    public static final class Notification {
        public static final Companion Companion = new Companion();
        public final int Aboow6rUrcY2SrFRa46C6uy;
        public final long BezslBgjveK3hODH;
        public final int JY5knQmh7EQJEZ;
        public final int LYcdI4xpry8eXmFC9I4wyaLdcG1z;
        public final Integer PQQPeCDD0JLCT3aLz;
        public final String S1zP5M3X7Ukq3ROlZ87G9I;
        public final long axL8FocTDLUdzg0XScbO;
        public final String ox9eclwMpRd;
        public final int ziNFA7KzVfc6;

        public static final class Companion {
            public final KSerializer serializer() {
                return UsageReport$Notification$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Notification(int i, String str, long j, long j2, int i2, int i3, String str2, Integer num, int i4, int i5) {
            if (511 != (i & 511)) {
                PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 511, UsageReport$Notification$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.S1zP5M3X7Ukq3ROlZ87G9I = str;
            this.axL8FocTDLUdzg0XScbO = j;
            this.BezslBgjveK3hODH = j2;
            this.ziNFA7KzVfc6 = i2;
            this.Aboow6rUrcY2SrFRa46C6uy = i3;
            this.ox9eclwMpRd = str2;
            this.PQQPeCDD0JLCT3aLz = num;
            this.JY5knQmh7EQJEZ = i4;
            this.LYcdI4xpry8eXmFC9I4wyaLdcG1z = i5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Notification)) {
                return false;
            }
            Notification notification = (Notification) obj;
            return OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, notification.S1zP5M3X7Ukq3ROlZ87G9I) && this.axL8FocTDLUdzg0XScbO == notification.axL8FocTDLUdzg0XScbO && this.BezslBgjveK3hODH == notification.BezslBgjveK3hODH && this.ziNFA7KzVfc6 == notification.ziNFA7KzVfc6 && this.Aboow6rUrcY2SrFRa46C6uy == notification.Aboow6rUrcY2SrFRa46C6uy && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.ox9eclwMpRd, notification.ox9eclwMpRd) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.PQQPeCDD0JLCT3aLz, notification.PQQPeCDD0JLCT3aLz) && this.JY5knQmh7EQJEZ == notification.JY5knQmh7EQJEZ && this.LYcdI4xpry8eXmFC9I4wyaLdcG1z == notification.LYcdI4xpry8eXmFC9I4wyaLdcG1z;
        }

        public final int hashCode() {
            int iWT8HZhEwPEkG = LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.Aboow6rUrcY2SrFRa46C6uy, LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.ziNFA7KzVfc6, oJ08Xj0ZV1gAa.PQQPeCDD0JLCT3aLz(oJ08Xj0ZV1gAa.PQQPeCDD0JLCT3aLz(this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode() * 31, this.axL8FocTDLUdzg0XScbO, 31), this.BezslBgjveK3hODH, 31), 31), 31);
            String str = this.ox9eclwMpRd;
            int iHashCode = (iWT8HZhEwPEkG + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.PQQPeCDD0JLCT3aLz;
            return Integer.hashCode(this.LYcdI4xpry8eXmFC9I4wyaLdcG1z) + LthVJzs8YB767vHOMwO80UNP7QrQi.WT8HZhEwPEkG(this.JY5knQmh7EQJEZ, (iHashCode + (num != null ? num.hashCode() : 0)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Notification(packageName=");
            sb.append(this.S1zP5M3X7Ukq3ROlZ87G9I);
            sb.append(", postTime=");
            sb.append(this.axL8FocTDLUdzg0XScbO);
            sb.append(", removalTime=");
            sb.append(this.BezslBgjveK3hODH);
            sb.append(", timeZoneOffset=");
            sb.append(this.ziNFA7KzVfc6);
            sb.append(", removeReason=");
            sb.append(this.Aboow6rUrcY2SrFRa46C6uy);
            sb.append(", category=");
            sb.append(this.ox9eclwMpRd);
            sb.append(", userSentiment=");
            sb.append(this.PQQPeCDD0JLCT3aLz);
            sb.append(", importance=");
            sb.append(this.JY5knQmh7EQJEZ);
            sb.append(", flags=");
            return oJ08Xj0ZV1gAa.Ql6q60SSx3(sb, this.LYcdI4xpry8eXmFC9I4wyaLdcG1z, ')');
        }

        public Notification(String str, long j, long j2, int i, int i2, String str2, Integer num, int i3, int i4) {
            this.S1zP5M3X7Ukq3ROlZ87G9I = str;
            this.axL8FocTDLUdzg0XScbO = j;
            this.BezslBgjveK3hODH = j2;
            this.ziNFA7KzVfc6 = i;
            this.Aboow6rUrcY2SrFRa46C6uy = i2;
            this.ox9eclwMpRd = str2;
            this.PQQPeCDD0JLCT3aLz = num;
            this.JY5knQmh7EQJEZ = i3;
            this.LYcdI4xpry8eXmFC9I4wyaLdcG1z = i4;
        }
    }

    public UsageReport(UUID uuid, long j, long j2, long j3, int i, String str, Integer num, int i2, List list, List list2, List list3, List list4, List list5) {
        String str2 = Build.MANUFACTURER;
        String str3 = Build.MODEL;
        this.S1zP5M3X7Ukq3ROlZ87G9I = uuid;
        this.axL8FocTDLUdzg0XScbO = 1642;
        this.BezslBgjveK3hODH = j;
        this.ziNFA7KzVfc6 = j2;
        this.Aboow6rUrcY2SrFRa46C6uy = j3;
        this.ox9eclwMpRd = i;
        this.PQQPeCDD0JLCT3aLz = str;
        this.JY5knQmh7EQJEZ = num;
        this.LYcdI4xpry8eXmFC9I4wyaLdcG1z = str2;
        this.flPMk2Ix9h3b95v = str3;
        this.fXBtMGfTIjGSHgK542 = i2;
        this.ToEIy0qfkltfGfO3vmAQG = list;
        this.H5sQ15nhYoaKKHhx = list2;
        this.HveD9n1tOYlffjJDxghBitYNgB = list3;
        this.sBV5EuS0mGuEYqc5nc5erhuwb1OG7 = list4;
        this.Ql6q60SSx3 = list5;
    }
}
