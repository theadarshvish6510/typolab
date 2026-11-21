package bitpit.launcher.shortcut;

/* JADX INFO: loaded from: classes.dex */
public class ShortcutCreationException extends RuntimeException {
    public final String GO8WUug7ZWFCUI1zY;
    public final Throwable Rdzg08aYlt0UsoLUNug9cESzgAY9R;

    public /* synthetic */ ShortcutCreationException(String str, RuntimeException runtimeException, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : runtimeException);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.GO8WUug7ZWFCUI1zY;
    }

    public ShortcutCreationException(String str, Throwable th) {
        this.GO8WUug7ZWFCUI1zY = str;
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = th;
    }
}
