package bitpit.launcher.play_store;

/* JADX INFO: loaded from: classes.dex */
public final class ReferrerException extends Exception {
    public ReferrerException(int i, Exception exc, String str) {
        super((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : exc);
    }
}
