package bitpit.launcher.icon.icon_pack.anycons;

import android.content.Context;
import android.view.ContextThemeWrapper;
import b.HlaGpRWB5yh0EgeuCV;
import b.LTC5BQy9XspuFiw;
import b.nWyzQOsL5qz4IhB7;
import b.nmXVdLD3wuhaqezxBBvorxOjwLT;
import b.sKhRxlrK0uZQTcvTyLdO1CgQhofD6;
import bitpit.launcher.R;

/* JADX INFO: loaded from: classes.dex */
public enum AnyconsStrokeWidth implements nmXVdLD3wuhaqezxBBvorxOjwLT {
    W10("10"),
    W11("11"),
    W12("12"),
    W13("13"),
    W15("15"),
    W16("16"),
    W17("17");

    private static final /* synthetic */ HlaGpRWB5yh0EgeuCV $ENTRIES = new sKhRxlrK0uZQTcvTyLdO1CgQhofD6(values());
    private final String serialized;

    AnyconsStrokeWidth(String str) {
        this.serialized = str;
    }

    public static HlaGpRWB5yh0EgeuCV getEntries() {
        return $ENTRIES;
    }

    public final Context getStrokeContext(Context context) {
        int i;
        switch (nWyzQOsL5qz4IhB7.S1zP5M3X7Ukq3ROlZ87G9I[ordinal()]) {
            case 1:
                i = R.style.AnyconsStroke10;
                break;
            case 2:
                i = R.style.AnyconsStroke11;
                break;
            case 3:
                i = R.style.AnyconsStroke12;
                break;
            case 4:
                i = R.style.AnyconsStroke13;
                break;
            case 5:
                i = R.style.AnyconsStroke15;
                break;
            case 6:
                i = R.style.AnyconsStroke16;
                break;
            case 7:
                i = R.style.AnyconsStroke17;
                break;
            default:
                LTC5BQy9XspuFiw.axL8FocTDLUdzg0XScbO();
                return null;
        }
        return new ContextThemeWrapper(context, i);
    }

    @Override // b.nmXVdLD3wuhaqezxBBvorxOjwLT
    public String getSerialized() {
        return this.serialized;
    }
}
