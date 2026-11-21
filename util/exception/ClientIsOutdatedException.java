package bitpit.launcher.util.exception;

/* JADX INFO: loaded from: classes.dex */
public final class ClientIsOutdatedException extends ServerUnreachableException {
    public ClientIsOutdatedException() {
        super(1, "Aborted establishing connection because Niagara Launcher is outdated", null);
    }
}
