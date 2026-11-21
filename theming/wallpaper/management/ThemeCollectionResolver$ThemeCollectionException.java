package bitpit.launcher.theming.wallpaper.management;

/* JADX INFO: loaded from: classes.dex */
public abstract class ThemeCollectionResolver$ThemeCollectionException extends Exception {

    public static final class ThemeNotFound extends ThemeCollectionResolver$ThemeCollectionException {
        public final String GO8WUug7ZWFCUI1zY;

        public ThemeNotFound(String str) {
            super("Theme not found: ".concat(str));
            this.GO8WUug7ZWFCUI1zY = str;
        }
    }
}
