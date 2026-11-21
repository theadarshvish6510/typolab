package bitpit.launcher.categorization;

import bitpit.launcher.categorization.source.CategoryDatabaseRetrievalException;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppCategoryDatabaseProvider$DatabaseUnavailableException extends Exception {

    public static final class AccessModeUnavailable extends AppCategoryDatabaseProvider$DatabaseUnavailableException {
        public static final AccessModeUnavailable GO8WUug7ZWFCUI1zY = new AccessModeUnavailable("Requested access mode is unavailable", null);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AccessModeUnavailable);
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return null;
        }

        public final int hashCode() {
            return -623246897;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "AccessModeUnavailable";
        }
    }

    public static final class DatabaseRetrievalException extends AppCategoryDatabaseProvider$DatabaseUnavailableException {
        public final CategoryDatabaseRetrievalException GO8WUug7ZWFCUI1zY;

        public DatabaseRetrievalException(CategoryDatabaseRetrievalException categoryDatabaseRetrievalException) {
            super("Error while retrieving the database", null);
            this.GO8WUug7ZWFCUI1zY = categoryDatabaseRetrievalException;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DatabaseRetrievalException) && this.GO8WUug7ZWFCUI1zY == ((DatabaseRetrievalException) obj).GO8WUug7ZWFCUI1zY;
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.GO8WUug7ZWFCUI1zY;
        }

        public final int hashCode() {
            return this.GO8WUug7ZWFCUI1zY.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "DatabaseRetrievalException(cause=" + this.GO8WUug7ZWFCUI1zY + ")";
        }
    }
}
