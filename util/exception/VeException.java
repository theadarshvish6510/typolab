package bitpit.launcher.util.exception;

import b.gD2rKVU295TtHvegz;

/* JADX INFO: loaded from: classes.dex */
public class VeException extends Exception {
    public final int GO8WUug7ZWFCUI1zY;
    public final boolean Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    public final boolean cCmbv8Tzd2QLd161ImIZUlZ8n;

    /* JADX WARN: Illegal instructions before constructor call */
    public VeException(int i, Throwable th) {
        String message;
        if (th != null) {
            message = th.getMessage();
            if (message == null) {
                message = "w/o msg";
            }
        } else {
            message = "unknown cause";
        }
        super("VeError #" + i + ": " + message, th);
        this.GO8WUug7ZWFCUI1zY = i;
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = gD2rKVU295TtHvegz.JY5knQmh7EQJEZ(new int[]{7, 4, 2, 3, 10}, i);
        this.cCmbv8Tzd2QLd161ImIZUlZ8n = i == 0;
    }
}
