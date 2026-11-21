package bitpit.launcher.backup.widgets;

import b.aJLiMmqfPh61r;
import bitpit.launcher.widget.UserCanceledWidgetCreationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class WidgetRestoreException extends Exception {
    public final String GO8WUug7ZWFCUI1zY;
    public final Throwable Rdzg08aYlt0UsoLUNug9cESzgAY9R;

    public static final class AppDoesNotSupportWidget extends WidgetRestoreException {
    }

    public static final class AppNotInstalled extends WidgetRestoreException {
    }

    public static final class SystemComponentUnavailable extends WidgetRestoreException {
        public SystemComponentUnavailable(Exception exc, String str) {
            super("Parts of the system are not available".concat(str != null ? aJLiMmqfPh61r.flPMk2Ix9h3b95v(" (", str, ")") : ""), exc);
        }
    }

    public static final class SystemFailure extends WidgetRestoreException {
    }

    public static final class WidgetCreationPermissionMissing extends WidgetRestoreException {
        public WidgetCreationPermissionMissing(UserCanceledWidgetCreationException userCanceledWidgetCreationException) {
            super("Permission to create widgets is missing".concat(""), userCanceledWidgetCreationException);
        }
    }

    public static final class WidgetRequiresConfiguration extends WidgetRestoreException {
        /* JADX WARN: Illegal instructions before constructor call */
        public WidgetRequiresConfiguration(int i) {
            String str = (i & 1) != 0 ? null : "User canceled necessary initial widget configuration";
            super("Widget requires user configuration".concat(str != null ? aJLiMmqfPh61r.flPMk2Ix9h3b95v(" (", str, ")") : ""), null);
        }
    }

    public WidgetRestoreException(String str, Throwable th) {
        super(str, th);
        this.GO8WUug7ZWFCUI1zY = str;
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.GO8WUug7ZWFCUI1zY;
    }
}
