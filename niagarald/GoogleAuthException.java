package bitpit.launcher.niagarald;

/* JADX INFO: loaded from: classes.dex */
public final class GoogleAuthException extends Exception {
    public final int GO8WUug7ZWFCUI1zY;

    /* JADX WARN: Illegal instructions before constructor call */
    public GoogleAuthException(int i, Exception exc) {
        String str;
        switch (i) {
            case 1:
                str = "NO_LINKED_ACCOUNT_FOUND";
                break;
            case 2:
                str = "EMAIL_ALREADY_TAKEN";
                break;
            case 3:
                str = "NO_GOOGLE_ACCOUNT_AVAILABLE";
                break;
            case 4:
                str = "INVALID_AUTH_SESSION";
                break;
            case 5:
                str = "INVALID_GOOGLE_ID_TOKEN";
                break;
            case 6:
                str = "CREDENTIAL_MANAGER_ERROR";
                break;
            case 7:
                str = "GOOGLE_SIGNIN_UNAVAILABLE_FOR_EMAIL";
                break;
            case 8:
                str = "MISC";
                break;
            default:
                throw null;
        }
        super(str, exc);
        this.GO8WUug7ZWFCUI1zY = i;
    }
}
