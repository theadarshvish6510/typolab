package bitpit.launcher.util.exception;

/* JADX INFO: loaded from: classes.dex */
public class ServerUnreachableException extends ServerConnectionException {
    public ServerUnreachableException(int i, String str, Throwable th) {
        super((i & 2) != 0 ? null : str, (i & 1) != 0 ? null : th);
    }
}
