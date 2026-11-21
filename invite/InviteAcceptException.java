package bitpit.launcher.invite;

import bitpit.launcher.util.exception.ServerConnectionException;

/* JADX INFO: loaded from: classes.dex */
public final class InviteAcceptException extends Exception {
    public final int GO8WUug7ZWFCUI1zY;

    public InviteAcceptException(int i, ServerConnectionException serverConnectionException, int i2) {
        super((i2 & 2) != 0 ? null : "Emulator detected.", (i2 & 4) != 0 ? null : serverConnectionException);
        this.GO8WUug7ZWFCUI1zY = i;
    }
}
