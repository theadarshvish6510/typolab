package bitpit.launcher.util.exception;

/* JADX INFO: loaded from: classes.dex */
public final class DecException extends JvException {
    public DecException(int i, Exception exc, String str) {
        super((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : exc);
    }
}
