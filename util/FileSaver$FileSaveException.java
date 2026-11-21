package bitpit.launcher.util;

/* JADX INFO: loaded from: classes.dex */
public final class FileSaver$FileSaveException extends Exception {
    public FileSaver$FileSaveException(int i, Exception exc, String str) {
        super((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : exc);
    }
}
