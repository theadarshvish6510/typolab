package bitpit.launcher.backend.weather.model;

import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.oJ08Xj0ZV1gAa;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class MinutelyWeatherDataPoint {
    public static final Companion Companion = new Companion();
    public final long S1zP5M3X7Ukq3ROlZ87G9I;
    public final float axL8FocTDLUdzg0XScbO;

    public static final class Companion {
        public final KSerializer serializer() {
            return MinutelyWeatherDataPoint$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MinutelyWeatherDataPoint(int i, long j, float f) {
        if (1 != (i & 1)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 1, MinutelyWeatherDataPoint$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = j;
        if ((i & 2) == 0) {
            this.axL8FocTDLUdzg0XScbO = 0.0f;
        } else {
            this.axL8FocTDLUdzg0XScbO = f;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MinutelyWeatherDataPoint)) {
            return false;
        }
        MinutelyWeatherDataPoint minutelyWeatherDataPoint = (MinutelyWeatherDataPoint) obj;
        return this.S1zP5M3X7Ukq3ROlZ87G9I == minutelyWeatherDataPoint.S1zP5M3X7Ukq3ROlZ87G9I && Float.compare(this.axL8FocTDLUdzg0XScbO, minutelyWeatherDataPoint.axL8FocTDLUdzg0XScbO) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.axL8FocTDLUdzg0XScbO) + (Long.hashCode(this.S1zP5M3X7Ukq3ROlZ87G9I) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MinutelyWeatherDataPoint(timestamp=");
        sb.append(this.S1zP5M3X7Ukq3ROlZ87G9I);
        sb.append(", precipitation=");
        return oJ08Xj0ZV1gAa.sBV5EuS0mGuEYqc5nc5erhuwb1OG7(sb, this.axL8FocTDLUdzg0XScbO, ')');
    }
}
