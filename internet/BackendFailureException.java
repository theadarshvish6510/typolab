package bitpit.launcher.internet;

import b.Vis8JHzVmTTIi9VTkbMomR;
import b.aJLiMmqfPh61r;
import bitpit.launcher.backend.application.model.ErrorResponse;

/* JADX INFO: loaded from: classes.dex */
public final class BackendFailureException extends Exception {
    public static final Vis8JHzVmTTIi9VTkbMomR Companion = new Vis8JHzVmTTIi9VTkbMomR();
    public final ErrorResponse GO8WUug7ZWFCUI1zY;

    /* JADX WARN: Illegal instructions before constructor call */
    public BackendFailureException(ErrorResponse errorResponse) {
        Companion.getClass();
        String str = errorResponse.BezslBgjveK3hODH;
        str = str == null ? "not provided" : str;
        String str2 = errorResponse.axL8FocTDLUdzg0XScbO;
        String str3 = errorResponse.ziNFA7KzVfc6;
        StringBuilder sbH5sQ15nhYoaKKHhx = aJLiMmqfPh61r.H5sQ15nhYoaKKHhx("reason=", str2, ", msg=", str, ", route=");
        sbH5sQ15nhYoaKKHhx.append(str3);
        super(sbH5sQ15nhYoaKKHhx.toString());
        this.GO8WUug7ZWFCUI1zY = errorResponse;
    }
}
