package bitpit.launcher.util.exception;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityLaunchFailedException extends Exception {
    public final Exception GO8WUug7ZWFCUI1zY;

    public ActivityLaunchFailedException(Exception exc) {
        this.GO8WUug7ZWFCUI1zY = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.GO8WUug7ZWFCUI1zY;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return null;
    }
}
