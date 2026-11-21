package bitpit.launcher.item_info;

/* JADX INFO: loaded from: classes.dex */
public final class SetQuietModeException extends RuntimeException {
    public final String GO8WUug7ZWFCUI1zY;
    public final Throwable Rdzg08aYlt0UsoLUNug9cESzgAY9R;

    public SetQuietModeException(String str, SecurityException securityException, int i) {
        str = (i & 1) != 0 ? null : str;
        securityException = (i & 2) != 0 ? null : securityException;
        this.GO8WUug7ZWFCUI1zY = str;
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = securityException;
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
