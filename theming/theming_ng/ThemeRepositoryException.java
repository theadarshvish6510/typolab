package bitpit.launcher.theming.theming_ng;

import android.database.SQLException;
import b.aJLiMmqfPh61r;
import bitpit.launcher.util.SwitchCaseException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ThemeRepositoryException extends Exception {

    public static final class DatabaseError extends ThemeRepositoryException {
        public final SQLException GO8WUug7ZWFCUI1zY;

        public DatabaseError(SQLException sQLException) {
            super(null, sQLException);
            this.GO8WUug7ZWFCUI1zY = sQLException;
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.GO8WUug7ZWFCUI1zY;
        }
    }

    public static final class Unknown extends ThemeRepositoryException {
    }

    public static final class ThemeCorrupted extends ThemeRepositoryException {
        public ThemeCorrupted(String str, String str2, Exception exc) {
            StringBuilder sb = new StringBuilder(aJLiMmqfPh61r.flPMk2Ix9h3b95v("Theme ", str, " is corrupted"));
            if (str2 != null) {
                sb.append(": ");
                sb.append(str2);
            }
            super(sb.toString(), exc);
        }

        public /* synthetic */ ThemeCorrupted(String str, String str2, SwitchCaseException switchCaseException, int i) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : switchCaseException);
        }
    }
}
