package bitpit.launcher.backup;

/* JADX INFO: loaded from: classes.dex */
public final class BackupException extends Exception {
    public final int GO8WUug7ZWFCUI1zY;

    /* JADX WARN: Illegal instructions before constructor call */
    public BackupException(String str, Exception exc, int i, int i2) {
        str = (i2 & 1) != 0 ? null : str;
        exc = (i2 & 2) != 0 ? null : exc;
        i = (i2 & 4) != 0 ? 4 : i;
        super(str, exc);
        this.GO8WUug7ZWFCUI1zY = i;
    }
}
