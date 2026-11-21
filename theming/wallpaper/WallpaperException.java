package bitpit.launcher.theming.wallpaper;

/* JADX INFO: loaded from: classes.dex */
public abstract class WallpaperException extends Exception {
    public final String GO8WUug7ZWFCUI1zY;
    public final Throwable Rdzg08aYlt0UsoLUNug9cESzgAY9R;

    public static abstract class FetchError extends WallpaperException {

        public static abstract class DownloadFailed extends FetchError {

            public static final class ManifestFetchFailed extends DownloadFailed {
            }

            public static final class WallpaperDownloadFailed extends DownloadFailed {
            }
        }

        public static abstract class NotFound extends FetchError {

            public static final class ThemeNotFound extends NotFound {
            }

            public static final class WallpaperNotFound extends NotFound {
            }
        }
    }

    public static abstract class FileError extends WallpaperException {

        public static final class UserWallpaperCreationFailed extends FileError {
            public UserWallpaperCreationFailed(Exception exc) {
                super("I/O error while creating wallpaper file", exc);
            }
        }

        public static final class UserWallpaperFileNotFound extends FileError {
            public UserWallpaperFileNotFound(Exception exc) {
                super("Wallpaper file not found or inaccessible", exc);
            }
        }
    }

    public static abstract class PersistenceError extends WallpaperException {

        public static final class CorruptedData extends PersistenceError {
        }

        public static final class DatabaseError extends PersistenceError {
            public final Throwable cCmbv8Tzd2QLd161ImIZUlZ8n;

            public DatabaseError(Throwable th) {
                super(th);
                this.cCmbv8Tzd2QLd161ImIZUlZ8n = th;
            }

            @Override // bitpit.launcher.theming.wallpaper.WallpaperException, java.lang.Throwable
            public final Throwable getCause() {
                return this.cCmbv8Tzd2QLd161ImIZUlZ8n;
            }
        }

        public PersistenceError(Throwable th) {
            super("Error while interacting with the wallpaper database", th);
        }
    }

    public static final class ProRequired extends WallpaperException {
    }

    public static final class SystemSetWallpaperFailed extends WallpaperException {
        public SystemSetWallpaperFailed(Throwable th) {
            super("System failed to set wallpaper", th);
        }
    }

    public WallpaperException(String str, Throwable th) {
        super(str, th);
        this.GO8WUug7ZWFCUI1zY = str;
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.GO8WUug7ZWFCUI1zY;
    }
}
