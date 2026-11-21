package bitpit.launcher.categorization.source;

/* JADX INFO: loaded from: classes.dex */
public final class CategoryDatabaseRetrievalException extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public CategoryDatabaseRetrievalException(int i, Exception exc) {
        String str;
        if (i == 1) {
            str = "Invalid file";
        } else if (i == 2) {
            str = "Insufficient disk space";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "IO Exception";
        }
        super(str, exc);
    }
}
