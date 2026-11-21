package bitpit.launcher.alphabet_wave;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import b.BHVP7xpLA777nS4OnX;
import b.HDzaRKEI4SxljA;
import b.IH6VONurXjhprIFZP4Vg;
import b.IsWN4Jm8QfAIm2Fl1Y;
import b.JHnppaRJDZMMWaOU5cgIw;
import b.Ne7IrXfSjRisooSM;
import b.Qs5il4A81sbf73pL1Mwnj;
import b.SCo4Ctd3zv2DHfczdi;
import b.ToJDOfh5xT3nSP;
import b.WLZoEbRHGAYGtOeo6ZMxoLT9;
import b.YBxgAmBl6tbk30IoUbQsvDA3Ar;
import b.Zo1YEZ6nT2Qsm9uBmmbXR;
import b.fhSNm7dhXpC9W6pfm4CfVlFNDgpq;
import b.jxlgdotwt22;
import b.lkiaEDM5lpT;
import b.mBXBxKZkBu7SYBeFy2GatZuMt3;
import b.mGx1Z0QoNwvrSy;
import b.pXynlL6SZmXt4dK1Q;
import b.xmd77ORoMNAomGMloBLegtT;
import b.zmfKefolgpc94cTKByox;
import bitpit.launcher.R;
import bitpit.launcher.text.qsTJuxvI0Yplnkz8;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class AlphabetWaveHandle extends View implements lkiaEDM5lpT {
    public static final /* synthetic */ int sCPtafveBAhdLIs2ajN3WV = 0;
    public final Rect GO8WUug7ZWFCUI1zY;
    public float LcvPFGYKhAm4SS5FZ;
    public final Paint Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    public IH6VONurXjhprIFZP4Vg WIXlfFpvH7glAGsUk3;
    public final float cCmbv8Tzd2QLd161ImIZUlZ8n;
    public int gsHzEVTj1SCIPR;
    public final ValueAnimator qaDSpeex0Oo1Qvt3oOrTJnbcQFp;

    public AlphabetWaveHandle(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0, 0);
        this.GO8WUug7ZWFCUI1zY = new Rect();
        Paint paint = new Paint();
        xmd77ORoMNAomGMloBLegtT xmd77oromnaomgmloblegtt = (xmd77ORoMNAomGMloBLegtT) ((jxlgdotwt22) getKoin().BezslBgjveK3hODH.gsHzEVTj1SCIPR).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(xmd77ORoMNAomGMloBLegtT.class), null, null);
        paint.setAntiAlias(true);
        mBXBxKZkBu7SYBeFy2GatZuMt3 mbxbxkzkbu7sybefy2gatzumt3 = ((qsTJuxvI0Yplnkz8) xmd77oromnaomgmloblegtt).qTa7aqjjB9Bt6mc;
        YBxgAmBl6tbk30IoUbQsvDA3Ar yBxgAmBl6tbk30IoUbQsvDA3Ar = (mbxbxkzkbu7sybefy2gatzumt3 != null ? mbxbxkzkbu7sybefy2gatzumt3 : null).Aboow6rUrcY2SrFRa46C6uy;
        paint.setTypeface(yBxgAmBl6tbk30IoUbQsvDA3Ar.S1zP5M3X7Ukq3ROlZ87G9I);
        paint.setTextSize(getResources().getDimension(R.dimen.alphabet_wave_handle_text_size) * yBxgAmBl6tbk30IoUbQsvDA3Ar.axL8FocTDLUdzg0XScbO);
        paint.setTextAlign(Paint.Align.LEFT);
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = paint;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = valueAnimatorOfFloat;
        setBackgroundResource(R.drawable.circle_white);
        setVisibility(4);
        Resources resources = context.getResources();
        this.cCmbv8Tzd2QLd161ImIZUlZ8n = resources.getDimension(R.dimen.alphabet_wave_handle_icon_size);
        HDzaRKEI4SxljA hDzaRKEI4SxljA = Zo1YEZ6nT2Qsm9uBmmbXR.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
        mGx1Z0QoNwvrSy.LYcdI4xpry8eXmFC9I4wyaLdcG1z(valueAnimatorOfFloat, WLZoEbRHGAYGtOeo6ZMxoLT9.JY5knQmh7EQJEZ(resources.getInteger(R.integer.alphabet_wave_animation_time_press), SCo4Ctd3zv2DHfczdi.MILLISECONDS));
        valueAnimatorOfFloat.addUpdateListener(new zmfKefolgpc94cTKByox(0, this));
        float dimension = resources.getDimension(R.dimen.alphabet_wave_handle_elevation);
        WeakHashMap weakHashMap = Ne7IrXfSjRisooSM.S1zP5M3X7Ukq3ROlZ87G9I;
        Qs5il4A81sbf73pL1Mwnj.fXBtMGfTIjGSHgK542(this, dimension);
    }

    @Override // b.lkiaEDM5lpT
    public /* bridge */ pXynlL6SZmXt4dK1Q getKoin() {
        return fhSNm7dhXpC9W6pfm4CfVlFNDgpq.axL8FocTDLUdzg0XScbO();
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        IH6VONurXjhprIFZP4Vg iH6VONurXjhprIFZP4Vg = this.WIXlfFpvH7glAGsUk3;
        if (iH6VONurXjhprIFZP4Vg == null) {
            return;
        }
        if (iH6VONurXjhprIFZP4Vg instanceof IsWN4Jm8QfAIm2Fl1Y) {
            String str = ((IsWN4Jm8QfAIm2Fl1Y) iH6VONurXjhprIFZP4Vg).WIXlfFpvH7glAGsUk3;
            Rect rect = this.GO8WUug7ZWFCUI1zY;
            canvas.getClipBounds(rect);
            int iHeight = rect.height();
            int iWidth = rect.width();
            int length = str.length();
            Paint paint = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
            paint.getTextBounds(str, 0, length, rect);
            canvas.drawText(str, ((iHeight / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (iWidth / 2.0f)) - rect.bottom, paint);
            return;
        }
        if (iH6VONurXjhprIFZP4Vg instanceof BHVP7xpLA777nS4OnX) {
            BHVP7xpLA777nS4OnX bHVP7xpLA777nS4OnX = (BHVP7xpLA777nS4OnX) iH6VONurXjhprIFZP4Vg;
            Context context = getContext();
            int i = this.gsHzEVTj1SCIPR;
            Integer num = bHVP7xpLA777nS4OnX.qTa7aqjjB9Bt6mc;
            if (num == null || num.intValue() != i) {
                bHVP7xpLA777nS4OnX.qTa7aqjjB9Bt6mc = Integer.valueOf(i);
                int i2 = bHVP7xpLA777nS4OnX.LcvPFGYKhAm4SS5FZ;
                bHVP7xpLA777nS4OnX.sCPtafveBAhdLIs2ajN3WV = i2 != 0 ? ToJDOfh5xT3nSP.ziNFA7KzVfc6(i, context.getDrawable(i2)) : new ColorDrawable(0);
            }
            Drawable drawable = bHVP7xpLA777nS4OnX.sCPtafveBAhdLIs2ajN3WV;
            float width = getWidth();
            float f = this.cCmbv8Tzd2QLd161ImIZUlZ8n;
            this.LcvPFGYKhAm4SS5FZ = ((width - f) / 2.0f) - 1.0f;
            float height = (getHeight() - f) / 2.0f;
            float f2 = this.LcvPFGYKhAm4SS5FZ;
            drawable.setBounds((int) f2, (int) height, (int) (f2 + f), (int) (height + f));
            drawable.draw(canvas);
        }
    }

    public final void setCurrentSection(IH6VONurXjhprIFZP4Vg iH6VONurXjhprIFZP4Vg) {
        IH6VONurXjhprIFZP4Vg iH6VONurXjhprIFZP4Vg2 = this.WIXlfFpvH7glAGsUk3;
        if (iH6VONurXjhprIFZP4Vg2 != iH6VONurXjhprIFZP4Vg) {
            if (iH6VONurXjhprIFZP4Vg == null) {
                setVisibility(4);
            } else if (iH6VONurXjhprIFZP4Vg2 == null) {
                setVisibility(0);
                this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp.start();
            }
            this.WIXlfFpvH7glAGsUk3 = iH6VONurXjhprIFZP4Vg;
        }
        invalidate();
    }

    public AlphabetWaveHandle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
    }

    public AlphabetWaveHandle(Context context) {
        this(context, null, 14);
    }
}
