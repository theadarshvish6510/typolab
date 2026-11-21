package bitpit.launcher.weather.location;

/* JADX INFO: loaded from: classes.dex */
public final class ExpectedNoLocationException extends NoLocationException {
    public ExpectedNoLocationException(int i, Exception exc) {
        super((i & 1) != 0 ? null : "location not available", (i & 2) != 0 ? null : exc);
    }
}
