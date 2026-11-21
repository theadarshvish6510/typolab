package bitpit.launcher.niagarald;

/* JADX INFO: loaded from: classes.dex */
public final class EmailVerificationException extends Exception {
    public final int GO8WUug7ZWFCUI1zY;
    public final Exception Rdzg08aYlt0UsoLUNug9cESzgAY9R;

    public EmailVerificationException(int i, Exception exc) {
        super(exc);
        this.GO8WUug7ZWFCUI1zY = i;
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    }
}
