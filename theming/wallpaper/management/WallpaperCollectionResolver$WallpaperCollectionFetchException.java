package bitpit.launcher.theming.wallpaper.management;

import bitpit.launcher.util.exception.ServerConnectionException;

/* JADX INFO: loaded from: classes.dex */
public abstract class WallpaperCollectionResolver$WallpaperCollectionFetchException extends Exception {

    public static final class ManifestFetchingFailed extends WallpaperCollectionResolver$WallpaperCollectionFetchException {
        public final ServerConnectionException GO8WUug7ZWFCUI1zY;

        public ManifestFetchingFailed(ServerConnectionException serverConnectionException) {
            super(serverConnectionException);
            this.GO8WUug7ZWFCUI1zY = serverConnectionException;
        }

        @Override // java.lang.Throwable
        public final Throwable getCause() {
            return this.GO8WUug7ZWFCUI1zY;
        }
    }

    public static final class WallpaperNotFound extends WallpaperCollectionResolver$WallpaperCollectionFetchException {
    }
}
