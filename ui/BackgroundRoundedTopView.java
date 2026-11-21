package bitpit.launcher.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import b.A0IZfgrF33;
import b.ASDwBkZhws;
import b.CI8FcH0QeBVrRPjK4vEdod0;
import b.GKMmVohPShski87EgCV23Luv8;
import b.PiLuoCym8e;
import b.V7J9earJNRGO02Kki0FSQVMSfu;
import b.YMiXHonxlHjbze5lzyHnXQ9;
import b.nEXsC4pm5jgWh4Yo3UswoU9VN8Ej;
import b.xhDtLRwjwU3pDzd;
import b.zVkUtEURLvHNycfQPRiFy1I;
import bitpit.launcher.R;

/* JADX INFO: loaded from: classes.dex */
public final class BackgroundRoundedTopView extends ConstraintLayout {
    public final GKMmVohPShski87EgCV23Luv8 tzMOyOc53ffl;

    /* JADX WARN: Illegal instructions before constructor call */
    public BackgroundRoundedTopView(Context context, AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        int i2 = 0;
        super(context, attributeSet2, 0);
        GKMmVohPShski87EgCV23Luv8 gKMmVohPShski87EgCV23Luv8Ox9eclwMpRd = GKMmVohPShski87EgCV23Luv8.ox9eclwMpRd(context, 0.0f, null);
        this.tzMOyOc53ffl = gKMmVohPShski87EgCV23Luv8Ox9eclwMpRd;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, zVkUtEURLvHNycfQPRiFy1I.axL8FocTDLUdzg0XScbO);
        float dimension = typedArrayObtainStyledAttributes.getDimension(0, getResources().getDimension(R.dimen.corner_radius_sheet));
        typedArrayObtainStyledAttributes.recycle();
        YMiXHonxlHjbze5lzyHnXQ9 yMiXHonxlHjbze5lzyHnXQ9 = new YMiXHonxlHjbze5lzyHnXQ9();
        YMiXHonxlHjbze5lzyHnXQ9 yMiXHonxlHjbze5lzyHnXQ10 = new YMiXHonxlHjbze5lzyHnXQ9();
        nEXsC4pm5jgWh4Yo3UswoU9VN8Ej nexsc4pm5jgwh4yo3uswou9vn8ej = new nEXsC4pm5jgWh4Yo3UswoU9VN8Ej(0.0f);
        nEXsC4pm5jgWh4Yo3UswoU9VN8Ej nexsc4pm5jgwh4yo3uswou9vn8ej2 = new nEXsC4pm5jgWh4Yo3UswoU9VN8Ej(0.0f);
        CI8FcH0QeBVrRPjK4vEdod0 cI8FcH0QeBVrRPjK4vEdod0 = new CI8FcH0QeBVrRPjK4vEdod0(i2);
        CI8FcH0QeBVrRPjK4vEdod0 cI8FcH0QeBVrRPjK4vEdod1 = new CI8FcH0QeBVrRPjK4vEdod0(i2);
        CI8FcH0QeBVrRPjK4vEdod0 cI8FcH0QeBVrRPjK4vEdod2 = new CI8FcH0QeBVrRPjK4vEdod0(i2);
        CI8FcH0QeBVrRPjK4vEdod0 cI8FcH0QeBVrRPjK4vEdod3 = new CI8FcH0QeBVrRPjK4vEdod0(i2);
        PiLuoCym8e piLuoCym8eAxL8FocTDLUdzg0XScbO = xhDtLRwjwU3pDzd.axL8FocTDLUdzg0XScbO(0);
        nEXsC4pm5jgWh4Yo3UswoU9VN8Ej nexsc4pm5jgwh4yo3uswou9vn8ej3 = new nEXsC4pm5jgWh4Yo3UswoU9VN8Ej(dimension);
        PiLuoCym8e piLuoCym8eAxL8FocTDLUdzg0XScbO2 = xhDtLRwjwU3pDzd.axL8FocTDLUdzg0XScbO(0);
        nEXsC4pm5jgWh4Yo3UswoU9VN8Ej nexsc4pm5jgwh4yo3uswou9vn8ej4 = new nEXsC4pm5jgWh4Yo3UswoU9VN8Ej(dimension);
        TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet2, V7J9earJNRGO02Kki0FSQVMSfu.WIXlfFpvH7glAGsUk3, 0, 0);
        int color = typedArrayObtainStyledAttributes2.getColor(1, 0);
        Integer numValueOf = color == 0 ? null : Integer.valueOf(color);
        int iIntValue = numValueOf != null ? numValueOf.intValue() : ASDwBkZhws.ox9eclwMpRd(context, R.attr.backgroundColor, null, 6);
        typedArrayObtainStyledAttributes2.recycle();
        gKMmVohPShski87EgCV23Luv8Ox9eclwMpRd.cS9Klw57l26qfkpcMlfmpU(ColorStateList.valueOf(iIntValue));
        A0IZfgrF33 a0IZfgrF33 = new A0IZfgrF33();
        a0IZfgrF33.S1zP5M3X7Ukq3ROlZ87G9I = piLuoCym8eAxL8FocTDLUdzg0XScbO2;
        a0IZfgrF33.axL8FocTDLUdzg0XScbO = piLuoCym8eAxL8FocTDLUdzg0XScbO;
        a0IZfgrF33.BezslBgjveK3hODH = yMiXHonxlHjbze5lzyHnXQ9;
        a0IZfgrF33.ziNFA7KzVfc6 = yMiXHonxlHjbze5lzyHnXQ10;
        a0IZfgrF33.Aboow6rUrcY2SrFRa46C6uy = nexsc4pm5jgwh4yo3uswou9vn8ej4;
        a0IZfgrF33.ox9eclwMpRd = nexsc4pm5jgwh4yo3uswou9vn8ej3;
        a0IZfgrF33.PQQPeCDD0JLCT3aLz = nexsc4pm5jgwh4yo3uswou9vn8ej;
        a0IZfgrF33.JY5knQmh7EQJEZ = nexsc4pm5jgwh4yo3uswou9vn8ej2;
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
        GKMmVohPShski87EgCV23Luv8 gKMmVohPShski87EgCV23Luv8 = this.tzMOyOc53ffl;
        if (gKMmVohPShski87EgCV23Luv8 != null) {
            gKMmVohPShski87EgCV23Luv8.UV6K6VDbgDgzpi12QAEKN4Emq(f);
        }
    }

    public BackgroundRoundedTopView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
    }

    public BackgroundRoundedTopView(Context context) {
        this(context, null, 14);
    }
}
