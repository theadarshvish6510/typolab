package bitpit.launcher.shortcut;

/* JADX INFO: loaded from: classes.dex */
public final class NougatShortcutOpException extends RuntimeException {
    public final String GO8WUug7ZWFCUI1zY;
    public final Throwable Rdzg08aYlt0UsoLUNug9cESzgAY9R;

    public NougatShortcutOpException(int i, Exception exc) {
        String str = (i & 1) != 0 ? null : "User is null";
        exc = (i & 2) != 0 ? null : exc;
        this.GO8WUug7ZWFCUI1zY = str;
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.GO8WUug7ZWFCUI1zY;
    }
}
