package bitpit.launcher.theming.color_palette;

import android.content.SharedPreferences;
import b.AeQuqug4cjWl3vY5CUaNGtJ0l;
import b.Emi5d0VyYZLZtm;
import b.GZnU2p3i2qStYb;
import b.J7Tsg1eqTfbK8vIo4RFOyjPiu;
import b.JHnppaRJDZMMWaOU5cgIw;
import b.LpRXf8zsxndinAW3;
import b.XQCixPMPkXDW6;
import b.aJLiMmqfPh61r;
import b.aNONfmXWW0uqauI17bnoBjg;
import b.ePeofkcVTynxYThB4SKghg;
import b.o7RA1NLUSXOnejA;
import b.qEwqqDvm9wKfnhETPc16M;
import bitpit.launcher.theming.CustomMaterialYouColorFamily;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes.dex */
public final class NniqwgLR9Jo6Bl9Px0S5u implements ePeofkcVTynxYThB4SKghg {
    public static final /* synthetic */ GZnU2p3i2qStYb[] BezslBgjveK3hODH;
    public final LpRXf8zsxndinAW3 S1zP5M3X7Ukq3ROlZ87G9I;
    public final XQCixPMPkXDW6 axL8FocTDLUdzg0XScbO;

    static {
        qEwqqDvm9wKfnhETPc16M qewqqdvm9wkfnhetpc16m = new qEwqqDvm9wKfnhETPc16M(NniqwgLR9Jo6Bl9Px0S5u.class, "serializedColorPalette", "getSerializedColorPalette()Ljava/lang/String;", 0);
        JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I.getClass();
        BezslBgjveK3hODH = new GZnU2p3i2qStYb[]{qewqqdvm9wkfnhetpc16m};
    }

    public NniqwgLR9Jo6Bl9Px0S5u(SharedPreferences sharedPreferences, LpRXf8zsxndinAW3 lpRXf8zsxndinAW3) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = lpRXf8zsxndinAW3;
        this.axL8FocTDLUdzg0XScbO = new XQCixPMPkXDW6(sharedPreferences, "bitpit.launcher.key.THEME_COLOR_PALETTE", null, 3);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005b  */
    /* JADX WARN: Code duplicated, block: B:17:0x006f  */
    public final ColorPalette S1zP5M3X7Ukq3ROlZ87G9I() {
        Object objOx9eclwMpRd;
        Throwable thS1zP5M3X7Ukq3ROlZ87G9I;
        LpRXf8zsxndinAW3 lpRXf8zsxndinAW3 = this.S1zP5M3X7Ukq3ROlZ87G9I;
        GZnU2p3i2qStYb[] gZnU2p3i2qStYbArr = BezslBgjveK3hODH;
        GZnU2p3i2qStYb gZnU2p3i2qStYb = gZnU2p3i2qStYbArr[0];
        XQCixPMPkXDW6 xQCixPMPkXDW6 = this.axL8FocTDLUdzg0XScbO;
        String str = (String) xQCixPMPkXDW6.S1zP5M3X7Ukq3ROlZ87G9I();
        if (str == null) {
            return null;
        }
        try {
            try {
                return (ColorPalette) lpRXf8zsxndinAW3.S1zP5M3X7Ukq3ROlZ87G9I(str, ColorPalette.Companion.serializer());
            } catch (SerializationException unused) {
                aNONfmXWW0uqauI17bnoBjg anonfmxww0uqaui17bnobjg = J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion;
                ColorPaletteMigrator$LegacyColorPalette colorPaletteMigrator$LegacyColorPalette = (ColorPaletteMigrator$LegacyColorPalette) lpRXf8zsxndinAW3.S1zP5M3X7Ukq3ROlZ87G9I(str, ColorPaletteMigrator$LegacyColorPalette.Companion.serializer());
                int i = colorPaletteMigrator$LegacyColorPalette.S1zP5M3X7Ukq3ROlZ87G9I;
                int i2 = colorPaletteMigrator$LegacyColorPalette.axL8FocTDLUdzg0XScbO;
                int i3 = colorPaletteMigrator$LegacyColorPalette.BezslBgjveK3hODH;
                CustomMaterialYouColorFamily.Companion.getClass();
                objOx9eclwMpRd = new ColorPalette(i, i2, i3, o7RA1NLUSXOnejA.S1zP5M3X7Ukq3ROlZ87G9I(i));
                anonfmxww0uqaui17bnobjg.getClass();
                thS1zP5M3X7Ukq3ROlZ87G9I = AeQuqug4cjWl3vY5CUaNGtJ0l.S1zP5M3X7Ukq3ROlZ87G9I(objOx9eclwMpRd);
                if (thS1zP5M3X7Ukq3ROlZ87G9I == null) {
                    Emi5d0VyYZLZtm.Aboow6rUrcY2SrFRa46C6uy((IllegalArgumentException) thS1zP5M3X7Ukq3ROlZ87G9I);
                    return null;
                }
                ColorPalette colorPalette = (ColorPalette) objOx9eclwMpRd;
                String strAxL8FocTDLUdzg0XScbO = lpRXf8zsxndinAW3.axL8FocTDLUdzg0XScbO(ColorPalette.Companion.serializer(), colorPalette);
                GZnU2p3i2qStYb gZnU2p3i2qStYb2 = gZnU2p3i2qStYbArr[0];
                xQCixPMPkXDW6.BezslBgjveK3hODH(strAxL8FocTDLUdzg0XScbO);
                return colorPalette;
            }
        } catch (Throwable th) {
            if (!(th instanceof IllegalArgumentException)) {
                throw th;
            }
            objOx9eclwMpRd = aJLiMmqfPh61r.ox9eclwMpRd(J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion, th);
            thS1zP5M3X7Ukq3ROlZ87G9I = AeQuqug4cjWl3vY5CUaNGtJ0l.S1zP5M3X7Ukq3ROlZ87G9I(objOx9eclwMpRd);
            if (thS1zP5M3X7Ukq3ROlZ87G9I == null) {
                Emi5d0VyYZLZtm.Aboow6rUrcY2SrFRa46C6uy((IllegalArgumentException) thS1zP5M3X7Ukq3ROlZ87G9I);
                return null;
            }
            ColorPalette colorPalette2 = (ColorPalette) objOx9eclwMpRd;
            String strAxL8FocTDLUdzg0XScbO2 = lpRXf8zsxndinAW3.axL8FocTDLUdzg0XScbO(ColorPalette.Companion.serializer(), colorPalette2);
            GZnU2p3i2qStYb gZnU2p3i2qStYb3 = gZnU2p3i2qStYbArr[0];
            xQCixPMPkXDW6.BezslBgjveK3hODH(strAxL8FocTDLUdzg0XScbO2);
            return colorPalette2;
        }
    }
}
