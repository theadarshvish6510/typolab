package bitpit.launcher.usage.survey;

import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.oJ08Xj0ZV1gAa;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class AppOveruseSurveyQuestionReference {
    public static final Companion Companion = new Companion();
    public final long BezslBgjveK3hODH;
    public final long S1zP5M3X7Ukq3ROlZ87G9I;
    public final long axL8FocTDLUdzg0XScbO;

    public static final class Companion {
        public final KSerializer serializer() {
            return AppOveruseSurveyQuestionReference$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AppOveruseSurveyQuestionReference(int i, long j, long j2, long j3) {
        if (7 != (i & 7)) {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 7, AppOveruseSurveyQuestionReference$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.S1zP5M3X7Ukq3ROlZ87G9I = j;
        this.axL8FocTDLUdzg0XScbO = j2;
        this.BezslBgjveK3hODH = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppOveruseSurveyQuestionReference)) {
            return false;
        }
        AppOveruseSurveyQuestionReference appOveruseSurveyQuestionReference = (AppOveruseSurveyQuestionReference) obj;
        return this.S1zP5M3X7Ukq3ROlZ87G9I == appOveruseSurveyQuestionReference.S1zP5M3X7Ukq3ROlZ87G9I && this.axL8FocTDLUdzg0XScbO == appOveruseSurveyQuestionReference.axL8FocTDLUdzg0XScbO && this.BezslBgjveK3hODH == appOveruseSurveyQuestionReference.BezslBgjveK3hODH;
    }

    public final int hashCode() {
        return Long.hashCode(this.BezslBgjveK3hODH) + oJ08Xj0ZV1gAa.PQQPeCDD0JLCT3aLz(Long.hashCode(this.S1zP5M3X7Ukq3ROlZ87G9I) * 31, this.axL8FocTDLUdzg0XScbO, 31);
    }

    public final String toString() {
        StringBuilder sbSBV5EuS0mGuEYqc5nc5erhuwb1OG7 = LthVJzs8YB767vHOMwO80UNP7QrQi.sBV5EuS0mGuEYqc5nc5erhuwb1OG7(this.S1zP5M3X7Ukq3ROlZ87G9I, "AppOveruseSurveyQuestionReference(firstSessionStartMillis=", ", lastSessionEndMillis=");
        sbSBV5EuS0mGuEYqc5nc5erhuwb1OG7.append(this.axL8FocTDLUdzg0XScbO);
        sbSBV5EuS0mGuEYqc5nc5erhuwb1OG7.append(", totalDurationMillis=");
        sbSBV5EuS0mGuEYqc5nc5erhuwb1OG7.append(this.BezslBgjveK3hODH);
        sbSBV5EuS0mGuEYqc5nc5erhuwb1OG7.append(")");
        return sbSBV5EuS0mGuEYqc5nc5erhuwb1OG7.toString();
    }

    public AppOveruseSurveyQuestionReference(long j, long j2, long j3) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = j;
        this.axL8FocTDLUdzg0XScbO = j2;
        this.BezslBgjveK3hODH = j3;
    }
}
