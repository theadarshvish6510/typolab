package bitpit.launcher.util;

/* JADX INFO: loaded from: classes.dex */
public final class SwitchCaseException extends RuntimeException {
    public final Object GO8WUug7ZWFCUI1zY;

    public SwitchCaseException(Object obj) {
        this.GO8WUug7ZWFCUI1zY = obj;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "switch default type error: case " + this.GO8WUug7ZWFCUI1zY;
    }
}
