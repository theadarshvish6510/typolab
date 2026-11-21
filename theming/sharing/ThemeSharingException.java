package bitpit.launcher.theming.sharing;

import bitpit.launcher.util.exception.ClientIsOutdatedException;

/* JADX INFO: loaded from: classes.dex */
public abstract class ThemeSharingException extends Exception {

    public static final class Cancelled extends ThemeSharingException {
        public Cancelled() {
            super("Import cancelled by user", null);
        }
    }

    public static final class Error extends ThemeSharingException {
    }

    public static final class ExternalWallpaper extends ThemeSharingException {
    }

    public static final class FileTooLarge extends ThemeSharingException {
        public FileTooLarge() {
            super("Theme file exceeds the maximum allowed size", null);
        }
    }

    public static final class IconPackStudio extends ThemeSharingException {
    }

    public static final class NewerAppVersion extends ThemeSharingException {
    }

    public static final class OutdatedVersion extends ThemeSharingException {
        public OutdatedVersion() {
            super("Theme sharing not supported on outdated versions", new ClientIsOutdatedException());
        }
    }

    public static final class SystemFont extends ThemeSharingException {
    }
}
