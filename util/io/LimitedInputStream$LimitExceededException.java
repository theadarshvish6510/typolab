package bitpit.launcher.util.io;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class LimitedInputStream$LimitExceededException extends IOException {
    public LimitedInputStream$LimitExceededException() {
        super("Reached limit of 26214400 bytes read");
    }
}
