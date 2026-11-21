package bitpit.launcher.weather.location;

/* JADX INFO: loaded from: classes.dex */
public class NoLocationException extends Exception {
    public final String GO8WUug7ZWFCUI1zY;
    public final Throwable Rdzg08aYlt0UsoLUNug9cESzgAY9R;

    public /* synthetic */ NoLocationException(int i, String str, Throwable th) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.GO8WUug7ZWFCUI1zY;
    }

    public NoLocationException(String str, Throwable th) {
        super(th);
        this.GO8WUug7ZWFCUI1zY = str;
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = th;
    }
}
