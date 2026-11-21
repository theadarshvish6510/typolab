package bitpit.launcher.search.web_suggestions.search_engines;

import b.OkhdZkC3NYLW;
import b.PPOwFQ9aEaUdFYptuBEaTPbaIKQ;
import b.aJLiMmqfPh61r;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public final class DuckDuckGoSuggestionDto {
    public static final Companion Companion = new Companion();
    public final String S1zP5M3X7Ukq3ROlZ87G9I;

    public static final class Companion {
        public final KSerializer serializer() {
            return DuckDuckGoSuggestionDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DuckDuckGoSuggestionDto(int i, String str) {
        if (1 == (i & 1)) {
            this.S1zP5M3X7Ukq3ROlZ87G9I = str;
        } else {
            PPOwFQ9aEaUdFYptuBEaTPbaIKQ.BezslBgjveK3hODH(i, 1, DuckDuckGoSuggestionDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DuckDuckGoSuggestionDto) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(this.S1zP5M3X7Ukq3ROlZ87G9I, ((DuckDuckGoSuggestionDto) obj).S1zP5M3X7Ukq3ROlZ87G9I);
    }

    public final int hashCode() {
        return this.S1zP5M3X7Ukq3ROlZ87G9I.hashCode();
    }

    public final String toString() {
        return aJLiMmqfPh61r.flPMk2Ix9h3b95v("DuckDuckGoSuggestionDto(phrase=", this.S1zP5M3X7Ukq3ROlZ87G9I, ")");
    }
}
