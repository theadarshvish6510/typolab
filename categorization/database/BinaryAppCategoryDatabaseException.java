package bitpit.launcher.categorization.database;

/* JADX INFO: loaded from: classes.dex */
public final class BinaryAppCategoryDatabaseException extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public BinaryAppCategoryDatabaseException(int i) {
        String str;
        if (i == 0) {
            str = null;
        } else if (i == 1) {
            str = "Invalid header";
        } else if (i == 2) {
            str = "Incomplete file";
        } else if (i == 3) {
            str = "Unsupported version";
        } else {
            if (i != 4) {
                throw null;
            }
            str = "Invalid checksum";
        }
        super(str, null);
    }
}
