package bitpit.launcher.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import b.A0IZfgrF33;
import b.ASDwBkZhws;
import b.CI8FcH0QeBVrRPjK4vEdod0;
import b.GKMmVohPShski87EgCV23Luv8;
import b.PiLuoCym8e;
import b.nEXsC4pm5jgWh4Yo3UswoU9VN8Ej;
import b.xhDtLRwjwU3pDzd;
import bitpit.launcher.R;

/* JADX INFO: loaded from: classes.dex */
public final class SettingsToolbar extends View {
    public final GKMmVohPShski87EgCV23Luv8 GO8WUug7ZWFCUI1zY;

    /* JADX WARN: Illegal instructions before constructor call */
    public SettingsToolbar(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        int i2 = 0;
        super(context, attributeSet, 0, 0);
        GKMmVohPShski87EgCV23Luv8 gKMmVohPShski87EgCV23Luv8Ox9eclwMpRd = GKMmVohPShski87EgCV23Luv8.ox9eclwMpRd(context, 0.0f, null);
        this.GO8WUug7ZWFCUI1zY = gKMmVohPShski87EgCV23Luv8Ox9eclwMpRd;
        gKMmVohPShski87EgCV23Luv8Ox9eclwMpRd.cS9Klw57l26qfkpcMlfmpU(ColorStateList.valueOf(ASDwBkZhws.ox9eclwMpRd(context, R.attr.backgroundColor, null, 6)));
        CI8FcH0QeBVrRPjK4vEdod0 cI8FcH0QeBVrRPjK4vEdod0 = new CI8FcH0QeBVrRPjK4vEdod0(i2);
        CI8FcH0QeBVrRPjK4vEdod0 cI8FcH0QeBVrRPjK4vEdod1 = new CI8FcH0QeBVrRPjK4vEdod0(i2);
        CI8FcH0QeBVrRPjK4vEdod0 cI8FcH0QeBVrRPjK4vEdod2 = new CI8FcH0QeBVrRPjK4vEdod0(i2);
        CI8FcH0QeBVrRPjK4vEdod0 cI8FcH0QeBVrRPjK4vEdod3 = new CI8FcH0QeBVrRPjK4vEdod0(i2);
        float dimension = getResources().getDimension(R.dimen.corner_radius_huge);
        PiLuoCym8e piLuoCym8eAxL8FocTDLUdzg0XScbO = xhDtLRwjwU3pDzd.axL8FocTDLUdzg0XScbO(0);
        nEXsC4pm5jgWh4Yo3UswoU9VN8Ej nexsc4pm5jgwh4yo3uswou9vn8ej = new nEXsC4pm5jgWh4Yo3UswoU9VN8Ej(dimension);
        nEXsC4pm5jgWh4Yo3UswoU9VN8Ej nexsc4pm5jgwh4yo3uswou9vn8ej2 = new nEXsC4pm5jgWh4Yo3UswoU9VN8Ej(dimension);
        nEXsC4pm5jgWh4Yo3UswoU9VN8Ej nexsc4pm5jgwh4yo3uswou9vn8ej3 = new nEXsC4pm5jgWh4Yo3UswoU9VN8Ej(dimension);
        nEXsC4pm5jgWh4Yo3UswoU9VN8Ej nexsc4pm5jgwh4yo3uswou9vn8ej4 = new nEXsC4pm5jgWh4Yo3UswoU9VN8Ej(dimension);
        A0IZfgrF33 a0IZfgrF33 = new A0IZfgrF33();
        a0IZfgrF33.S1zP5M3X7Ukq3ROlZ87G9I = piLuoCym8eAxL8FocTDLUdzg0XScbO;
        a0IZfgrF33.axL8FocTDLUdzg0XScbO = piLuoCym8eAxL8FocTDLUdzg0XScbO;
        a0IZfgrF33.BezslBgjveK3hODH = piLuoCym8eAxL8FocTDLUdzg0XScbO;
        a0IZfgrF33.ziNFA7KzVfc6 = piLuoCym8eAxL8FocTDLUdzg0XScbO;
        a0IZfgrF33.Aboow6rUrcY2SrFRa46C6uy = nexsc4pm5jgwh4yo3uswou9vn8ej;
        a0IZfgrF33.ox9eclwMpRd = nexsc4pm5jgwh4yo3uswou9vn8ej2;
        a0IZfgrF33.PQQPeCDD0JLCT3aLz = nexsc4pm5jgwh4yo3uswou9vn8ej3;
        a0IZfgrF33.JY5knQmh7EQJEZ = nexsc4pm5jgwh4yo3uswou9vn8ej4;
        a0IZfgrF33.LYcdI4xpry8eXmFC9I4wyaLdcG1z = cI8FcH0QeBVrRPjK4vEdod0;
        a0IZfgrF33.flPMk2Ix9h3b95v = cI8FcH0QeBVrRPjK4vEdod1;
        a0IZfgrF33.fXBtMGfTIjGSHgK542 = cI8FcH0QeBVrRPjK4vEdod2;
        a0IZfgrF33.ToEIy0qfkltfGfO3vmAQG = cI8FcH0QeBVrRPjK4vEdod3;
        gKMmVohPShski87EgCV23Luv8Ox9eclwMpRd.setShapeAppearanceModel(a0IZfgrF33);
        setBackground(gKMmVohPShski87EgCV23Luv8Ox9eclwMpRd);
    }

    private static /* synthetic */ void getMaterialShapeDrawable$annotations() {
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        GKMmVohPShski87EgCV23Luv8 gKMmVohPShski87EgCV23Luv8 = this.GO8WUug7ZWFCUI1zY;
        if (gKMmVohPShski87EgCV23Luv8 != null) {
            gKMmVohPShski87EgCV23Luv8.UV6K6VDbgDgzpi12QAEKN4Emq(f);
        }
    }

    public SettingsToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
    }

    public SettingsToolbar(Context context) {
        this(context, null, 14);
    }
}
