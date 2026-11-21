package bitpit.launcher.theming;

import b.HlaGpRWB5yh0EgeuCV;
import b.nmXVdLD3wuhaqezxBBvorxOjwLT;
import b.o7RA1NLUSXOnejA;
import b.sKhRxlrK0uZQTcvTyLdO1CgQhofD6;

/* JADX INFO: loaded from: classes.dex */
public enum CustomMaterialYouColorFamily implements nmXVdLD3wuhaqezxBBvorxOjwLT {
    GRAYSCALE(10, null),
    RASPBERRY(11, 12),
    RED(12, 27),
    PERSIMMON(13, 42),
    ORANGE(14, 57),
    AMBER(HUE_FAMILY_STEP, 72),
    YELLOW(16, 87),
    PEAR(17, 102),
    MOSS(18, 117),
    LIME(19, 132),
    GREEN(20, 147),
    JADE(21, 162),
    TURQUOISE(22, 177),
    TEAL(23, 192),
    PEACOCK(24, 207),
    SKY(25, 222),
    CERULEAN(26, 237),
    AZURE(27, 252),
    NIAGARA_BLUE(28, 267),
    PERIWINKLE(29, 282),
    LAVENDER(30, 297),
    PURPLE(31, 312),
    MAGENTA(32, 327),
    SHOCKING_PINK(33, 342),
    FLAMINGO(34, 357);

    private static final int DEGREES_IN_CIRCLE = 360;
    private static final int HUE_FAMILY_OFFSET = 12;
    private static final int HUE_FAMILY_STEP = 15;
    private final Integer hue;
    private final int serialized;
    private static final /* synthetic */ HlaGpRWB5yh0EgeuCV $ENTRIES = new sKhRxlrK0uZQTcvTyLdO1CgQhofD6(values());
    public static final o7RA1NLUSXOnejA Companion = new o7RA1NLUSXOnejA();

    CustomMaterialYouColorFamily(int i, Integer num) {
        this.serialized = i;
        this.hue = num;
    }

    public static HlaGpRWB5yh0EgeuCV getEntries() {
        return $ENTRIES;
    }

    public final Integer getHue() {
        return this.hue;
    }

    @Override // b.nmXVdLD3wuhaqezxBBvorxOjwLT
    public Integer getSerialized() {
        return Integer.valueOf(this.serialized);
    }
}
