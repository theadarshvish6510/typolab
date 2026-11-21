package bitpit.launcher.genai;

import b.Emi5d0VyYZLZtm;
import b.uuyTGGFjNDiF1SxHW;

/* JADX INFO: loaded from: classes.dex */
public abstract class GenAiFailure extends Exception {

    public static final class InputRefused extends GenAiFailure {
    }

    public static final class NotDownloaded extends GenAiFailure {
    }

    public static final class RequestFailed extends GenAiFailure {
    }

    public static final class TemporarilyUnavailable extends GenAiFailure {
    }

    public static final class Unexpected extends GenAiFailure {
        @Override // java.lang.Throwable
        public final String getMessage() {
            Throwable cause = getCause();
            if (cause != null) {
                return Emi5d0VyYZLZtm.S1zP5M3X7Ukq3ROlZ87G9I(cause, null, 3).toString();
            }
            uuyTGGFjNDiF1SxHW.PQQPeCDD0JLCT3aLz("Required value was null.");
            return null;
        }
    }

    public static final class Unsupported extends GenAiFailure {
    }
}
