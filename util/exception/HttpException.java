package bitpit.launcher.util.exception;

import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.uuyTGGFjNDiF1SxHW;
import bitpit.launcher.backend.application.model.ErrorResponse;
import bitpit.launcher.internet.BackendFailureException;

/* JADX INFO: loaded from: classes.dex */
public final class HttpException extends ServerConnectionException {
    public final int GO8WUug7ZWFCUI1zY;

    public HttpException(int i, Throwable th) {
        super(LthVJzs8YB767vHOMwO80UNP7QrQi.LYcdI4xpry8eXmFC9I4wyaLdcG1z(i, "HTTP "), th);
        this.GO8WUug7ZWFCUI1zY = i;
        boolean z = false;
        if (200 <= i && i < 300) {
            z = true;
        }
        if (z) {
            uuyTGGFjNDiF1SxHW.PQQPeCDD0JLCT3aLz("statusCode must be an error code");
            throw null;
        }
    }

    public final String S1zP5M3X7Ukq3ROlZ87G9I() {
        ErrorResponse errorResponse;
        Throwable cause = getCause();
        BackendFailureException backendFailureException = cause instanceof BackendFailureException ? (BackendFailureException) cause : null;
        if (backendFailureException == null || (errorResponse = backendFailureException.GO8WUug7ZWFCUI1zY) == null) {
            return null;
        }
        return errorResponse.BezslBgjveK3hODH;
    }
}
