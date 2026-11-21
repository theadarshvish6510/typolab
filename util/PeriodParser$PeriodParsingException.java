package bitpit.launcher.util;

/* JADX INFO: loaded from: classes.dex */
public final class PeriodParser$PeriodParsingException extends RuntimeException {
    public PeriodParser$PeriodParsingException(CharSequence charSequence, RuntimeException runtimeException) {
        super("Text cannot be parsed to a Period; parsedString=" + ((Object) charSequence), runtimeException);
    }
}
