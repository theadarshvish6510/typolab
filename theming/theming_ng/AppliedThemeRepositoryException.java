package bitpit.launcher.theming.theming_ng;

import android.database.SQLException;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppliedThemeRepositoryException extends Exception {

    public static final class DatabaseError extends AppliedThemeRepositoryException {
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

    public static final class Unknown extends AppliedThemeRepositoryException {
    }
}
