package bitpit.launcher.util.animation.surfaceeffects;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import b.A7IIxyFhxIhDDKjWpWrmrNMLgN;
import b.Av9SEbfwagaf9yqbiAb;
import b.B3CeKjLCD7DD3fZaBpX1cN8lJ;
import b.Hnv6Te9rrTA0VqZMo;
import b.LqH09V6V7Wln;
import b.NMquq9o0FvRs5RyiTFrS;
import b.PeLieoBN4yxYJZju3kQtKIsq7XL8;
import b.bMjZFECsuU6MdmSOqmYrlYsV3oEeB;
import b.frHxX8EDVHMQDl9;
import b.k1iM5dQzsEb;
import b.nPL4I1M5HxOl7aeBz;
import b.rbpFGdpgDCAQXat;
import b.s9XnN7QTAJ;
import b.tIDTjdoK38;
import b.uubBtIW8of;
import b.uuyTGGFjNDiF1SxHW;
import b.x4PcPRPmslEJW;
import b.xgW46F6QWqmVkWL1qC5k6XY8SAR;
import b.zG00SFXQdEpsUm2PH2lfVfb;
import bitpit.launcher.R;

/* JADX INFO: loaded from: classes.dex */
public final class LaurelGoldShaderView extends View implements nPL4I1M5HxOl7aeBz {
    public static final frHxX8EDVHMQDl9 Companion = new frHxX8EDVHMQDl9();
    public final B3CeKjLCD7DD3fZaBpX1cN8lJ GO8WUug7ZWFCUI1zY;
    public final Paint Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    public zG00SFXQdEpsUm2PH2lfVfb WIXlfFpvH7glAGsUk3;
    public ValueAnimator cCmbv8Tzd2QLd161ImIZUlZ8n;

    public LaurelGoldShaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        B3CeKjLCD7DD3fZaBpX1cN8lJ b3CeKjLCD7DD3fZaBpX1cN8lJ = new B3CeKjLCD7DD3fZaBpX1cN8lJ();
        this.GO8WUug7ZWFCUI1zY = b3CeKjLCD7DD3fZaBpX1cN8lJ;
        Paint paint = new Paint();
        paint.setShader(b3CeKjLCD7DD3fZaBpX1cN8lJ);
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = paint;
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new xgW46F6QWqmVkWL1qC5k6XY8SAR(2, this));
            return;
        }
        k1iM5dQzsEb k1im5dqzsebS1zP5M3X7Ukq3ROlZ87G9I = uubBtIW8of.S1zP5M3X7Ukq3ROlZ87G9I(this);
        if (k1im5dqzsebS1zP5M3X7Ukq3ROlZ87G9I != null) {
            rbpFGdpgDCAQXat.ziNFA7KzVfc6(LqH09V6V7Wln.Aboow6rUrcY2SrFRa46C6uy(k1im5dqzsebS1zP5M3X7Ukq3ROlZ87G9I), null, 0, new A7IIxyFhxIhDDKjWpWrmrNMLgN(this, null), 3);
        } else {
            uuyTGGFjNDiF1SxHW.PQQPeCDD0JLCT3aLz("Required value was null.");
            throw null;
        }
    }

    @Override // b.nPL4I1M5HxOl7aeBz
    public final void LcvPFGYKhAm4SS5FZ() {
        ValueAnimator valueAnimator = this.cCmbv8Tzd2QLd161ImIZUlZ8n;
        if (valueAnimator != null) {
            valueAnimator.resume();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object S1zP5M3X7Ukq3ROlZ87G9I(bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) throws Throwable {
        Av9SEbfwagaf9yqbiAb av9SEbfwagaf9yqbiAb;
        int width;
        Bitmap bitmap;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof Av9SEbfwagaf9yqbiAb) {
            av9SEbfwagaf9yqbiAb = (Av9SEbfwagaf9yqbiAb) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i = av9SEbfwagaf9yqbiAb.sCPtafveBAhdLIs2ajN3WV;
            if ((i & Integer.MIN_VALUE) != 0) {
                av9SEbfwagaf9yqbiAb.sCPtafveBAhdLIs2ajN3WV = i - Integer.MIN_VALUE;
            } else {
                av9SEbfwagaf9yqbiAb = new Av9SEbfwagaf9yqbiAb(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            av9SEbfwagaf9yqbiAb = new Av9SEbfwagaf9yqbiAb(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        Object objJY5knQmh7EQJEZ = av9SEbfwagaf9yqbiAb.LcvPFGYKhAm4SS5FZ;
        int i2 = av9SEbfwagaf9yqbiAb.sCPtafveBAhdLIs2ajN3WV;
        tIDTjdoK38 tidtjdok38 = tIDTjdoK38.GO8WUug7ZWFCUI1zY;
        if (i2 == 0) {
            Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objJY5knQmh7EQJEZ);
            width = getWidth();
            PeLieoBN4yxYJZju3kQtKIsq7XL8 peLieoBN4yxYJZju3kQtKIsq7XL8 = NMquq9o0FvRs5RyiTFrS.S1zP5M3X7Ukq3ROlZ87G9I;
            x4PcPRPmslEJW x4pcprpmslejw = x4PcPRPmslEJW.cCmbv8Tzd2QLd161ImIZUlZ8n;
            A7IIxyFhxIhDDKjWpWrmrNMLgN a7IIxyFhxIhDDKjWpWrmrNMLgN = new A7IIxyFhxIhDDKjWpWrmrNMLgN(this, width, null, 1);
            av9SEbfwagaf9yqbiAb.WIXlfFpvH7glAGsUk3 = width;
            av9SEbfwagaf9yqbiAb.sCPtafveBAhdLIs2ajN3WV = 1;
            objJY5knQmh7EQJEZ = rbpFGdpgDCAQXat.JY5knQmh7EQJEZ(x4pcprpmslejw, a7IIxyFhxIhDDKjWpWrmrNMLgN, av9SEbfwagaf9yqbiAb);
            if (objJY5knQmh7EQJEZ != tidtjdok38) {
            }
            return tidtjdok38;
        }
        if (i2 == 1) {
            width = av9SEbfwagaf9yqbiAb.WIXlfFpvH7glAGsUk3;
            Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objJY5knQmh7EQJEZ);
        } else {
            if (i2 != 2) {
                uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bitmap = av9SEbfwagaf9yqbiAb.gsHzEVTj1SCIPR;
            Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objJY5knQmh7EQJEZ);
        }
        Bitmap bitmap2 = (Bitmap) objJY5knQmh7EQJEZ;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setFilterMode(2);
        BitmapShader bitmapShader2 = new BitmapShader(bitmap2, tileMode, tileMode);
        bitmapShader2.setFilterMode(2);
        B3CeKjLCD7DD3fZaBpX1cN8lJ b3CeKjLCD7DD3fZaBpX1cN8lJ = this.GO8WUug7ZWFCUI1zY;
        b3CeKjLCD7DD3fZaBpX1cN8lJ.setInputShader("in_bitmap", bitmapShader);
        b3CeKjLCD7DD3fZaBpX1cN8lJ.setFloatUniform("in_bitmap_size", bitmap.getWidth(), bitmap.getHeight());
        b3CeKjLCD7DD3fZaBpX1cN8lJ.setInputShader("in_bitmap_reflection", bitmapShader2);
        b3CeKjLCD7DD3fZaBpX1cN8lJ.setFloatUniform("in_bitmap_reflection_size", bitmap2.getWidth(), bitmap2.getHeight());
        b3CeKjLCD7DD3fZaBpX1cN8lJ.setColorUniform("in_backgroundColor", getContext().getColor(R.color.purchase_pro_laurel_dark));
        b3CeKjLCD7DD3fZaBpX1cN8lJ.setColorUniform("in_backgroundColor2", getContext().getColor(R.color.purchase_pro_laurel_light));
        invalidate();
        return s9XnN7QTAJ.S1zP5M3X7Ukq3ROlZ87G9I;
        Bitmap bitmap3 = (Bitmap) objJY5knQmh7EQJEZ;
        PeLieoBN4yxYJZju3kQtKIsq7XL8 peLieoBN4yxYJZju3kQtKIsq7XL9 = NMquq9o0FvRs5RyiTFrS.S1zP5M3X7Ukq3ROlZ87G9I;
        x4PcPRPmslEJW x4pcprpmslejw2 = x4PcPRPmslEJW.cCmbv8Tzd2QLd161ImIZUlZ8n;
        A7IIxyFhxIhDDKjWpWrmrNMLgN a7IIxyFhxIhDDKjWpWrmrNMLgN2 = new A7IIxyFhxIhDDKjWpWrmrNMLgN(this, width, null, 2);
        av9SEbfwagaf9yqbiAb.gsHzEVTj1SCIPR = bitmap3;
        av9SEbfwagaf9yqbiAb.WIXlfFpvH7glAGsUk3 = width;
        av9SEbfwagaf9yqbiAb.sCPtafveBAhdLIs2ajN3WV = 2;
        Object objJY5knQmh7EQJEZ2 = rbpFGdpgDCAQXat.JY5knQmh7EQJEZ(x4pcprpmslejw2, a7IIxyFhxIhDDKjWpWrmrNMLgN2, av9SEbfwagaf9yqbiAb);
        if (objJY5knQmh7EQJEZ2 != tidtjdok38) {
            bitmap = bitmap3;
            objJY5knQmh7EQJEZ = objJY5knQmh7EQJEZ2;
            Bitmap bitmap4 = (Bitmap) objJY5knQmh7EQJEZ;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader3 = new BitmapShader(bitmap, tileMode2, tileMode2);
            bitmapShader3.setFilterMode(2);
            BitmapShader bitmapShader4 = new BitmapShader(bitmap4, tileMode2, tileMode2);
            bitmapShader4.setFilterMode(2);
            B3CeKjLCD7DD3fZaBpX1cN8lJ b3CeKjLCD7DD3fZaBpX1cN8lJ2 = this.GO8WUug7ZWFCUI1zY;
            b3CeKjLCD7DD3fZaBpX1cN8lJ2.setInputShader("in_bitmap", bitmapShader3);
            b3CeKjLCD7DD3fZaBpX1cN8lJ2.setFloatUniform("in_bitmap_size", bitmap.getWidth(), bitmap.getHeight());
            b3CeKjLCD7DD3fZaBpX1cN8lJ2.setInputShader("in_bitmap_reflection", bitmapShader4);
            b3CeKjLCD7DD3fZaBpX1cN8lJ2.setFloatUniform("in_bitmap_reflection_size", bitmap4.getWidth(), bitmap4.getHeight());
            b3CeKjLCD7DD3fZaBpX1cN8lJ2.setColorUniform("in_backgroundColor", getContext().getColor(R.color.purchase_pro_laurel_dark));
            b3CeKjLCD7DD3fZaBpX1cN8lJ2.setColorUniform("in_backgroundColor2", getContext().getColor(R.color.purchase_pro_laurel_light));
            invalidate();
            return s9XnN7QTAJ.S1zP5M3X7Ukq3ROlZ87G9I;
        }
        return tidtjdok38;
    }

    @Override // b.nPL4I1M5HxOl7aeBz
    public final void cS9Klw57l26qfkpcMlfmpU() {
        ValueAnimator valueAnimator = this.cCmbv8Tzd2QLd161ImIZUlZ8n;
        if (valueAnimator != null) {
            valueAnimator.pause();
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k1iM5dQzsEb k1im5dqzsebS1zP5M3X7Ukq3ROlZ87G9I = uubBtIW8of.S1zP5M3X7Ukq3ROlZ87G9I(this);
        if (k1im5dqzsebS1zP5M3X7Ukq3ROlZ87G9I == null) {
            uuyTGGFjNDiF1SxHW.PQQPeCDD0JLCT3aLz("Required value was null.");
            return;
        }
        zG00SFXQdEpsUm2PH2lfVfb zg00sfxqdepsum2ph2lfvfbQl6q60SSx3 = k1im5dqzsebS1zP5M3X7Ukq3ROlZ87G9I.Ql6q60SSx3();
        zg00sfxqdepsum2ph2lfvfbQl6q60SSx3.S1zP5M3X7Ukq3ROlZ87G9I(this);
        this.WIXlfFpvH7glAGsUk3 = zg00sfxqdepsum2ph2lfvfbQl6q60SSx3;
        ValueAnimator valueAnimator = this.cCmbv8Tzd2QLd161ImIZUlZ8n;
        if (valueAnimator != null) {
            valueAnimator.resume();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zG00SFXQdEpsUm2PH2lfVfb zg00sfxqdepsum2ph2lfvfb = this.WIXlfFpvH7glAGsUk3;
        if (zg00sfxqdepsum2ph2lfvfb != null) {
            zg00sfxqdepsum2ph2lfvfb.ox9eclwMpRd(this);
        }
        ValueAnimator valueAnimator = this.cCmbv8Tzd2QLd161ImIZUlZ8n;
        if (valueAnimator != null) {
            valueAnimator.pause();
        }
        this.WIXlfFpvH7glAGsUk3 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (canvas.isHardwareAccelerated()) {
            canvas.drawPaint(this.Rdzg08aYlt0UsoLUNug9cESzgAY9R);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.GO8WUug7ZWFCUI1zY.S1zP5M3X7Ukq3ROlZ87G9I(i3 - i, i4 - i2);
        invalidate();
    }

    @Override // b.nPL4I1M5HxOl7aeBz
    public final void sBV5EuS0mGuEYqc5nc5erhuwb1OG7() {
        ValueAnimator valueAnimator = this.cCmbv8Tzd2QLd161ImIZUlZ8n;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        this.cCmbv8Tzd2QLd161ImIZUlZ8n = null;
    }
}
