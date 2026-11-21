package bitpit.launcher.util;

/* JADX INFO: loaded from: classes.dex */
public class OptionalTraceException extends Exception {
    public final boolean GO8WUug7ZWFCUI1zY;

    public OptionalTraceException(boolean z) {
        this.GO8WUug7ZWFCUI1zY = z;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this.GO8WUug7ZWFCUI1zY ? super.fillInStackTrace() : this;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return null;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return null;
    }
}
