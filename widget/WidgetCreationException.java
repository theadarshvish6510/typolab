package bitpit.launcher.widget;

/* JADX INFO: loaded from: classes.dex */
public class WidgetCreationException extends Exception {
    public final String GO8WUug7ZWFCUI1zY;
    public final Throwable Rdzg08aYlt0UsoLUNug9cESzgAY9R;

    /* JADX WARN: Illegal instructions before constructor call */
    public WidgetCreationException(int i, Exception exc, String str) {
        str = (i & 1) != 0 ? null : str;
        exc = (i & 2) != 0 ? null : exc;
        super(exc);
        this.GO8WUug7ZWFCUI1zY = str;
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = exc;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.GO8WUug7ZWFCUI1zY;
    }
}
