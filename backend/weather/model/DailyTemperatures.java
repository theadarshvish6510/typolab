package bitpit.launcher.backend.weather.model;

import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.aJLiMmqfPh61r;
import b.oJ08Xj0ZV1gAa;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class DailyTemperatures {
    public static final Companion Companion = new Companion();
    public final float Aboow6rUrcY2SrFRa46C6uy;
    public final float BezslBgjveK3hODH;
    public final float S1zP5M3X7Ukq3ROlZ87G9I;
    public final float axL8FocTDLUdzg0XScbO;
    public final float ox9eclwMpRd;
    public final float ziNFA7KzVfc6;

    public static final class Companion {
        public final KSerializer serializer() {
            return DailyTemperatures$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DailyTemperatures(int i, float f, float f2, float f3, float f4, float f5, float f6) {
        if (63 != (i & 63)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 63, DailyTemperatures$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = f;
        this.axL8FocTDLUdzg0XScbO = f2;
        this.BezslBgjveK3hODH = f3;
        this.ziNFA7KzVfc6 = f4;
        this.Aboow6rUrcY2SrFRa46C6uy = f5;
        this.ox9eclwMpRd = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DailyTemperatures)) {
            return false;
        }
        DailyTemperatures dailyTemperatures = (DailyTemperatures) obj;
        return Float.compare(this.S1zP5M3X7Ukq3ROlZ87G9I, dailyTemperatures.S1zP5M3X7Ukq3ROlZ87G9I) == 0 && Float.compare(this.axL8FocTDLUdzg0XScbO, dailyTemperatures.axL8FocTDLUdzg0XScbO) == 0 && Float.compare(this.BezslBgjveK3hODH, dailyTemperatures.BezslBgjveK3hODH) == 0 && Float.compare(this.ziNFA7KzVfc6, dailyTemperatures.ziNFA7KzVfc6) == 0 && Float.compare(this.Aboow6rUrcY2SrFRa46C6uy, dailyTemperatures.Aboow6rUrcY2SrFRa46C6uy) == 0 && Float.compare(this.ox9eclwMpRd, dailyTemperatures.ox9eclwMpRd) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.ox9eclwMpRd) + aJLiMmqfPh61r.ziNFA7KzVfc6(this.Aboow6rUrcY2SrFRa46C6uy, aJLiMmqfPh61r.ziNFA7KzVfc6(this.ziNFA7KzVfc6, aJLiMmqfPh61r.ziNFA7KzVfc6(this.BezslBgjveK3hODH, aJLiMmqfPh61r.ziNFA7KzVfc6(this.axL8FocTDLUdzg0XScbO, Float.hashCode(this.S1zP5M3X7Ukq3ROlZ87G9I) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DailyTemperatures(day=");
        sb.append(this.S1zP5M3X7Ukq3ROlZ87G9I);
        sb.append(", min=");
        sb.append(this.axL8FocTDLUdzg0XScbO);
        sb.append(", max=");
        sb.append(this.BezslBgjveK3hODH);
        sb.append(", night=");
        sb.append(this.ziNFA7KzVfc6);
        sb.append(", evening=");
        sb.append(this.Aboow6rUrcY2SrFRa46C6uy);
        sb.append(", morning=");
        return oJ08Xj0ZV1gAa.sBV5EuS0mGuEYqc5nc5erhuwb1OG7(sb, this.ox9eclwMpRd, ')');
    }

    public DailyTemperatures(float f, float f2, float f3, float f4, float f5, float f6) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = f;
        this.axL8FocTDLUdzg0XScbO = f2;
        this.BezslBgjveK3hODH = f3;
        this.ziNFA7KzVfc6 = f4;
        this.Aboow6rUrcY2SrFRa46C6uy = f5;
        this.ox9eclwMpRd = f6;
    }
}
