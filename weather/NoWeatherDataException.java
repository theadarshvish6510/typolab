package bitpit.launcher.weather;

import bitpit.launcher.util.OptionalTraceException;

/* JADX INFO: loaded from: classes.dex */
public final class NoWeatherDataException extends OptionalTraceException {
    public final String Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    public final Throwable cCmbv8Tzd2QLd161ImIZUlZ8n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoWeatherDataException(int i, Exception exc, String str) {
        super((i & 4) != 0);
        str = (i & 1) != 0 ? null : str;
        exc = (i & 2) != 0 ? null : exc;
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = str;
        this.cCmbv8Tzd2QLd161ImIZUlZ8n = exc;
    }

    @Override // bitpit.launcher.util.OptionalTraceException, java.lang.Throwable
    public final Throwable getCause() {
        return this.cCmbv8Tzd2QLd161ImIZUlZ8n;
    }

    @Override // bitpit.launcher.util.OptionalTraceException, java.lang.Throwable
    public final String getMessage() {
        return this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    }
}
