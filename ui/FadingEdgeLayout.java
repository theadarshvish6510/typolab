package bitpit.launcher.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import b.B02bFCC1FS8AcUyF87x5Z;
import b.LTC5BQy9XspuFiw;
import b.NX07oEsYbx;
import b.OAbMlpbVJU98L0lW2oHBNkO;
import b.VCtiWpoPT19G22Gwj81vBKvC;
import b.h5LYFTO2Mud;
import b.uuyTGGFjNDiF1SxHW;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class FadingEdgeLayout extends FrameLayout {
    public final LinkedHashMap GO8WUug7ZWFCUI1zY;
    public static final VCtiWpoPT19G22Gwj81vBKvC Companion = new VCtiWpoPT19G22Gwj81vBKvC();
    public static final int[] Rdzg08aYlt0UsoLUNug9cESzgAY9R = {0, 1342177280, -16777216};
    public static final float[] cCmbv8Tzd2QLd161ImIZUlZ8n = {0.0f, 0.66f, 1.0f};
    public static final int[] WIXlfFpvH7glAGsUk3 = {-16777216, 1342177280, 0};
    public static final float[] gsHzEVTj1SCIPR = {0.0f, 0.33f, 1.0f};

    public FadingEdgeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0, 0);
        B02bFCC1FS8AcUyF87x5Z[] b02bFCC1FS8AcUyF87x5ZArr = {new B02bFCC1FS8AcUyF87x5Z(NX07oEsYbx.GO8WUug7ZWFCUI1zY, new h5LYFTO2Mud()), new B02bFCC1FS8AcUyF87x5Z(NX07oEsYbx.Rdzg08aYlt0UsoLUNug9cESzgAY9R, new h5LYFTO2Mud()), new B02bFCC1FS8AcUyF87x5Z(NX07oEsYbx.cCmbv8Tzd2QLd161ImIZUlZ8n, new h5LYFTO2Mud()), new B02bFCC1FS8AcUyF87x5Z(NX07oEsYbx.WIXlfFpvH7glAGsUk3, new h5LYFTO2Mud())};
        LinkedHashMap linkedHashMap = new LinkedHashMap(OAbMlpbVJU98L0lW2oHBNkO.JY5knQmh7EQJEZ(4));
        OAbMlpbVJU98L0lW2oHBNkO.flPMk2Ix9h3b95v(linkedHashMap, b02bFCC1FS8AcUyF87x5ZArr);
        this.GO8WUug7ZWFCUI1zY = linkedHashMap;
    }

    public final void S1zP5M3X7Ukq3ROlZ87G9I(NX07oEsYbx... nX07oEsYbxArr) {
        for (NX07oEsYbx nX07oEsYbx : nX07oEsYbxArr) {
            Object obj = this.GO8WUug7ZWFCUI1zY.get(nX07oEsYbx);
            if (obj == null) {
                uuyTGGFjNDiF1SxHW.PQQPeCDD0JLCT3aLz("Required value was null.");
                return;
            }
            ((h5LYFTO2Mud) obj).BezslBgjveK3hODH = true;
        }
    }

    public final void axL8FocTDLUdzg0XScbO(NX07oEsYbx nX07oEsYbx, int i) {
        Object obj = this.GO8WUug7ZWFCUI1zY.get(nX07oEsYbx);
        if (obj == null) {
            uuyTGGFjNDiF1SxHW.PQQPeCDD0JLCT3aLz("Required value was null.");
            return;
        }
        h5LYFTO2Mud h5lyfto2mud = (h5LYFTO2Mud) obj;
        if (h5lyfto2mud.ziNFA7KzVfc6 != i) {
            h5lyfto2mud.ziNFA7KzVfc6 = i;
            h5lyfto2mud.Aboow6rUrcY2SrFRa46C6uy = i > 0;
            h5lyfto2mud.BezslBgjveK3hODH = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int paddingTop;
        int paddingRight;
        LinearGradient linearGradient;
        int i;
        int paddingBottom;
        int paddingLeft;
        LinearGradient linearGradient2;
        if (getVisibility() != 0 || getWidth() == 0 || getHeight() == 0) {
            super.dispatchDraw(canvas);
            return;
        }
        LinkedHashMap linkedHashMap = this.GO8WUug7ZWFCUI1zY;
        Collection<h5LYFTO2Mud> collectionValues = linkedHashMap.values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            for (h5LYFTO2Mud h5lyfto2mud : collectionValues) {
                if (h5lyfto2mud.Aboow6rUrcY2SrFRa46C6uy && h5lyfto2mud.ziNFA7KzVfc6 > 0) {
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        NX07oEsYbx nX07oEsYbx = (NX07oEsYbx) entry.getKey();
                        h5LYFTO2Mud h5lyfto2mud2 = (h5LYFTO2Mud) entry.getValue();
                        if (h5lyfto2mud2.BezslBgjveK3hODH && h5lyfto2mud2.Aboow6rUrcY2SrFRa46C6uy && h5lyfto2mud2.ziNFA7KzVfc6 > 0) {
                            h5LYFTO2Mud h5lyfto2mud3 = (h5LYFTO2Mud) linkedHashMap.get(nX07oEsYbx);
                            int width = getWidth();
                            int height = getHeight();
                            int iOrdinal = nX07oEsYbx.ordinal();
                            float[] fArr = cCmbv8Tzd2QLd161ImIZUlZ8n;
                            int[] iArr = Rdzg08aYlt0UsoLUNug9cESzgAY9R;
                            if (iOrdinal != 0) {
                                float[] fArr2 = gsHzEVTj1SCIPR;
                                int[] iArr2 = WIXlfFpvH7glAGsUk3;
                                if (iOrdinal == 1) {
                                    int i2 = h5lyfto2mud3.ziNFA7KzVfc6;
                                    int paddingTop2 = (height - getPaddingTop()) - getPaddingBottom();
                                    if (i2 > paddingTop2) {
                                        i2 = paddingTop2;
                                    }
                                    paddingBottom = height - getPaddingBottom();
                                    paddingTop = paddingBottom - i2;
                                    paddingLeft = getPaddingLeft();
                                    paddingRight = width - getPaddingRight();
                                    linearGradient2 = new LinearGradient(0.0f, paddingTop, 0.0f, paddingBottom, iArr2, fArr2, Shader.TileMode.CLAMP);
                                } else if (iOrdinal == 2) {
                                    int i3 = h5lyfto2mud3.ziNFA7KzVfc6;
                                    int paddingLeft2 = (width - getPaddingLeft()) - getPaddingRight();
                                    if (i3 > paddingLeft2) {
                                        i3 = paddingLeft2;
                                    }
                                    int paddingLeft3 = getPaddingLeft();
                                    int i4 = i3 + paddingLeft3;
                                    paddingTop = getPaddingTop();
                                    paddingBottom = height - getPaddingBottom();
                                    linearGradient = new LinearGradient(paddingLeft3, 0.0f, i4, 0.0f, iArr, fArr, Shader.TileMode.CLAMP);
                                    i = paddingLeft3;
                                    paddingRight = i4;
                                } else {
                                    if (iOrdinal != 3) {
                                        LTC5BQy9XspuFiw.axL8FocTDLUdzg0XScbO();
                                        return;
                                    }
                                    int i5 = h5lyfto2mud3.ziNFA7KzVfc6;
                                    int paddingLeft4 = (width - getPaddingLeft()) - getPaddingRight();
                                    if (i5 > paddingLeft4) {
                                        i5 = paddingLeft4;
                                    }
                                    paddingRight = width - getPaddingRight();
                                    paddingLeft = paddingRight - i5;
                                    paddingTop = getPaddingTop();
                                    paddingBottom = height - getPaddingBottom();
                                    linearGradient2 = new LinearGradient(paddingLeft, 0.0f, paddingRight, 0.0f, iArr2, fArr2, Shader.TileMode.CLAMP);
                                }
                                h5lyfto2mud3.axL8FocTDLUdzg0XScbO.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
                                h5lyfto2mud3.S1zP5M3X7Ukq3ROlZ87G9I.setShader(linearGradient2);
                                h5lyfto2mud3.BezslBgjveK3hODH = false;
                            } else {
                                int i6 = h5lyfto2mud3.ziNFA7KzVfc6;
                                int paddingTop3 = (height - getPaddingTop()) - getPaddingBottom();
                                if (i6 > paddingTop3) {
                                    i6 = paddingTop3;
                                }
                                int paddingLeft5 = getPaddingLeft();
                                paddingTop = getPaddingTop();
                                paddingRight = width - getPaddingRight();
                                int i7 = i6 + paddingTop;
                                linearGradient = new LinearGradient(0.0f, paddingTop, 0.0f, i7, iArr, fArr, Shader.TileMode.CLAMP);
                                i = paddingLeft5;
                                paddingBottom = i7;
                            }
                            paddingLeft = i;
                            linearGradient2 = linearGradient;
                            h5lyfto2mud3.axL8FocTDLUdzg0XScbO.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
                            h5lyfto2mud3.S1zP5M3X7Ukq3ROlZ87G9I.setShader(linearGradient2);
                            h5lyfto2mud3.BezslBgjveK3hODH = false;
                        }
                    }
                    int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
                    super.dispatchDraw(canvas);
                    for (h5LYFTO2Mud h5lyfto2mud4 : linkedHashMap.values()) {
                        if (h5lyfto2mud4.Aboow6rUrcY2SrFRa46C6uy && h5lyfto2mud4.ziNFA7KzVfc6 > 0) {
                            canvas.drawRect(h5lyfto2mud4.axL8FocTDLUdzg0XScbO, h5lyfto2mud4.S1zP5M3X7Ukq3ROlZ87G9I);
                        }
                    }
                    canvas.restoreToCount(iSaveLayer);
                    return;
                }
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i != i3) {
            S1zP5M3X7Ukq3ROlZ87G9I(NX07oEsYbx.cCmbv8Tzd2QLd161ImIZUlZ8n, NX07oEsYbx.WIXlfFpvH7glAGsUk3);
        }
        if (i2 != i4) {
            S1zP5M3X7Ukq3ROlZ87G9I(NX07oEsYbx.GO8WUug7ZWFCUI1zY, NX07oEsYbx.Rdzg08aYlt0UsoLUNug9cESzgAY9R);
        }
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        if (getPaddingTop() != i2) {
            S1zP5M3X7Ukq3ROlZ87G9I(NX07oEsYbx.GO8WUug7ZWFCUI1zY);
        }
        if (getPaddingBottom() != i4) {
            S1zP5M3X7Ukq3ROlZ87G9I(NX07oEsYbx.Rdzg08aYlt0UsoLUNug9cESzgAY9R);
        }
        if (getPaddingLeft() != i) {
            S1zP5M3X7Ukq3ROlZ87G9I(NX07oEsYbx.cCmbv8Tzd2QLd161ImIZUlZ8n);
        }
        if (getPaddingRight() != i3) {
            S1zP5M3X7Ukq3ROlZ87G9I(NX07oEsYbx.WIXlfFpvH7glAGsUk3);
        }
        super.setPadding(i, i2, i3, i4);
    }

    public FadingEdgeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
    }

    public FadingEdgeLayout(Context context) {
        this(context, null, 14);
    }
}
