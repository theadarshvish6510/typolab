package bitpit.launcher.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import b.CuOsK2nTVAC88o;
import b.HDzaRKEI4SxljA;
import b.Hnv6Te9rrTA0VqZMo;
import b.RVJBOzj6VzMj8qEghjVt;
import b.SCo4Ctd3zv2DHfczdi;
import b.WLZoEbRHGAYGtOeo6ZMxoLT9;
import b.XEGJiY1J9xuVtiSW9zVDs9yxMzM;
import b.YwBT4ESCmAqS8d6lra4iy0u6E;
import b.Zo1YEZ6nT2Qsm9uBmmbXR;
import b.bMjZFECsuU6MdmSOqmYrlYsV3oEeB;
import b.lC1GawAFS6bap;
import b.mGx1Z0QoNwvrSy;
import b.r9sCUPycjv5zN8GYk6Xh;
import b.s9XnN7QTAJ;
import b.t1qBI5bdDVp81qHUuT;
import b.tIDTjdoK38;
import b.uuyTGGFjNDiF1SxHW;
import b.wFIO6q9fiuz1bTK;
import b.zVkUtEURLvHNycfQPRiFy1I;
import bitpit.launcher.R;
import com.airbnb.lottie.LottieAnimationView;

/* JADX INFO: loaded from: classes.dex */
public final class LoadingAnimationView extends LottieAnimationView {
    public static final /* synthetic */ int cVfIGUKLEqID1HH = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public LoadingAnimationView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        setAnimation(R.raw.loading_animation);
        setRepeatCount(-1);
        setAlpha(0.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zVkUtEURLvHNycfQPRiFy1I.PQQPeCDD0JLCT3aLz, 0, 0);
        try {
            if (typedArrayObtainStyledAttributes.hasValue(0)) {
                XEGJiY1J9xuVtiSW9zVDs9yxMzM.ziNFA7KzVfc6(this, typedArrayObtainStyledAttributes.getColor(0, 0), "**");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void JY5knQmh7EQJEZ() {
        HDzaRKEI4SxljA hDzaRKEI4SxljA = Zo1YEZ6nT2Qsm9uBmmbXR.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
        long jLYcdI4xpry8eXmFC9I4wyaLdcG1z = WLZoEbRHGAYGtOeo6ZMxoLT9.LYcdI4xpry8eXmFC9I4wyaLdcG1z(250L, SCo4Ctd3zv2DHfczdi.MILLISECONDS);
        ViewPropertyAnimator interpolator = mGx1Z0QoNwvrSy.JY5knQmh7EQJEZ(animate().alpha(0.0f), jLYcdI4xpry8eXmFC9I4wyaLdcG1z).setInterpolator(t1qBI5bdDVp81qHUuT.BezslBgjveK3hODH);
        interpolator.setListener(new CuOsK2nTVAC88o(1, this));
        interpolator.withEndAction(new RVJBOzj6VzMj8qEghjVt(5, interpolator, this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, bitpit.launcher.ui.LoadingAnimationView, com.airbnb.lottie.LottieAnimationView] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.airbnb.lottie.LottieAnimationView] */
    /* JADX WARN: Type inference failed for: r6v2, types: [b.s9XnN7QTAJ, java.lang.Object] */
    public final Object LYcdI4xpry8eXmFC9I4wyaLdcG1z(bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) {
        lC1GawAFS6bap lc1gawafs6bap;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof lC1GawAFS6bap) {
            lc1gawafs6bap = (lC1GawAFS6bap) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i = lc1gawafs6bap.LcvPFGYKhAm4SS5FZ;
            if ((i & Integer.MIN_VALUE) != 0) {
                lc1gawafs6bap.LcvPFGYKhAm4SS5FZ = i - Integer.MIN_VALUE;
            } else {
                lc1gawafs6bap = new lC1GawAFS6bap(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            lc1gawafs6bap = new lC1GawAFS6bap(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        Object obj = lc1gawafs6bap.WIXlfFpvH7glAGsUk3;
        int i2 = lc1gawafs6bap.LcvPFGYKhAm4SS5FZ;
        try {
            if (i2 == 0) {
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
                HDzaRKEI4SxljA hDzaRKEI4SxljA = Zo1YEZ6nT2Qsm9uBmmbXR.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
                long jLYcdI4xpry8eXmFC9I4wyaLdcG1z = WLZoEbRHGAYGtOeo6ZMxoLT9.LYcdI4xpry8eXmFC9I4wyaLdcG1z(250L, SCo4Ctd3zv2DHfczdi.MILLISECONDS);
                ViewPropertyAnimator interpolator = mGx1Z0QoNwvrSy.JY5knQmh7EQJEZ(animate().alpha(0.0f), jLYcdI4xpry8eXmFC9I4wyaLdcG1z).setInterpolator(t1qBI5bdDVp81qHUuT.BezslBgjveK3hODH);
                lc1gawafs6bap.LcvPFGYKhAm4SS5FZ = 1;
                Object objToEIy0qfkltfGfO3vmAQG = mGx1Z0QoNwvrSy.ToEIy0qfkltfGfO3vmAQG(interpolator, lc1gawafs6bap);
                tIDTjdoK38 tidtjdok38 = tIDTjdoK38.GO8WUug7ZWFCUI1zY;
                if (objToEIy0qfkltfGfO3vmAQG == tidtjdok38) {
                    return tidtjdok38;
                }
            } else {
                if (i2 != 1) {
                    uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
            }
            Aboow6rUrcY2SrFRa46C6uy();
            this = s9XnN7QTAJ.S1zP5M3X7Ukq3ROlZ87G9I;
            return this;
        } catch (Throwable th) {
            this.Aboow6rUrcY2SrFRa46C6uy();
            throw th;
        }
    }

    public final void PQQPeCDD0JLCT3aLz() {
        HDzaRKEI4SxljA hDzaRKEI4SxljA = Zo1YEZ6nT2Qsm9uBmmbXR.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
        long jLYcdI4xpry8eXmFC9I4wyaLdcG1z = WLZoEbRHGAYGtOeo6ZMxoLT9.LYcdI4xpry8eXmFC9I4wyaLdcG1z(300L, SCo4Ctd3zv2DHfczdi.MILLISECONDS);
        mGx1Z0QoNwvrSy.JY5knQmh7EQJEZ(animate().alpha(1.0f), jLYcdI4xpry8eXmFC9I4wyaLdcG1z).setInterpolator(t1qBI5bdDVp81qHUuT.axL8FocTDLUdzg0XScbO).start();
        ox9eclwMpRd();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:33:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX WARN: Code duplicated, block: B:39:0x0092  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object flPMk2Ix9h3b95v(long j, boolean z, wFIO6q9fiuz1bTK wfio6q9fiuz1btk, bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) throws Throwable {
        r9sCUPycjv5zN8GYk6Xh r9scupycjv5zn8gyk6xh;
        YwBT4ESCmAqS8d6lra4iy0u6E ywBT4ESCmAqS8d6lra4iy0u6E;
        YwBT4ESCmAqS8d6lra4iy0u6E ywBT4ESCmAqS8d6lra4iy0u6E2;
        Throwable th;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof r9sCUPycjv5zN8GYk6Xh) {
            r9scupycjv5zn8gyk6xh = (r9sCUPycjv5zN8GYk6Xh) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i = r9scupycjv5zn8gyk6xh.qTa7aqjjB9Bt6mc;
            if ((i & Integer.MIN_VALUE) != 0) {
                r9scupycjv5zn8gyk6xh.qTa7aqjjB9Bt6mc = i - Integer.MIN_VALUE;
            } else {
                r9scupycjv5zn8gyk6xh = new r9sCUPycjv5zN8GYk6Xh(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            r9scupycjv5zn8gyk6xh = new r9sCUPycjv5zN8GYk6Xh(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        Object obj = r9scupycjv5zn8gyk6xh.sCPtafveBAhdLIs2ajN3WV;
        int i2 = r9scupycjv5zn8gyk6xh.qTa7aqjjB9Bt6mc;
        Object obj2 = tIDTjdoK38.GO8WUug7ZWFCUI1zY;
        if (i2 == 0) {
            Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
            ywBT4ESCmAqS8d6lra4iy0u6E = new YwBT4ESCmAqS8d6lra4iy0u6E(8, this);
            postDelayed(ywBT4ESCmAqS8d6lra4iy0u6E, Zo1YEZ6nT2Qsm9uBmmbXR.PQQPeCDD0JLCT3aLz(j));
            try {
                r9scupycjv5zn8gyk6xh.LcvPFGYKhAm4SS5FZ = ywBT4ESCmAqS8d6lra4iy0u6E;
                r9scupycjv5zn8gyk6xh.WIXlfFpvH7glAGsUk3 = j;
                r9scupycjv5zn8gyk6xh.gsHzEVTj1SCIPR = z;
                r9scupycjv5zn8gyk6xh.qTa7aqjjB9Bt6mc = 1;
                Object objS1zP5M3X7Ukq3ROlZ87G9I = wfio6q9fiuz1btk.S1zP5M3X7Ukq3ROlZ87G9I(r9scupycjv5zn8gyk6xh);
                if (objS1zP5M3X7Ukq3ROlZ87G9I != obj2) {
                    obj = objS1zP5M3X7Ukq3ROlZ87G9I;
                    ywBT4ESCmAqS8d6lra4iy0u6E2 = ywBT4ESCmAqS8d6lra4iy0u6E;
                    removeCallbacks(ywBT4ESCmAqS8d6lra4iy0u6E2);
                    if (z) {
                        JY5knQmh7EQJEZ();
                        return obj;
                    }
                    r9scupycjv5zn8gyk6xh.LcvPFGYKhAm4SS5FZ = null;
                    r9scupycjv5zn8gyk6xh.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = obj;
                    r9scupycjv5zn8gyk6xh.WIXlfFpvH7glAGsUk3 = j;
                    r9scupycjv5zn8gyk6xh.gsHzEVTj1SCIPR = z;
                    r9scupycjv5zn8gyk6xh.qTa7aqjjB9Bt6mc = 2;
                    if (LYcdI4xpry8eXmFC9I4wyaLdcG1z(r9scupycjv5zn8gyk6xh) == obj2) {
                        return obj;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                removeCallbacks(ywBT4ESCmAqS8d6lra4iy0u6E);
                if (z) {
                    JY5knQmh7EQJEZ();
                    throw th;
                }
                r9scupycjv5zn8gyk6xh.LcvPFGYKhAm4SS5FZ = null;
                r9scupycjv5zn8gyk6xh.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = th;
                r9scupycjv5zn8gyk6xh.WIXlfFpvH7glAGsUk3 = j;
                r9scupycjv5zn8gyk6xh.gsHzEVTj1SCIPR = z;
                r9scupycjv5zn8gyk6xh.qTa7aqjjB9Bt6mc = 3;
                if (LYcdI4xpry8eXmFC9I4wyaLdcG1z(r9scupycjv5zn8gyk6xh) != obj2) {
                    th = th;
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    Object obj3 = r9scupycjv5zn8gyk6xh.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
                    Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
                    return obj3;
                }
                if (i2 != 3) {
                    uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = (Throwable) r9scupycjv5zn8gyk6xh.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
                throw th;
            }
            z = r9scupycjv5zn8gyk6xh.gsHzEVTj1SCIPR;
            j = r9scupycjv5zn8gyk6xh.WIXlfFpvH7glAGsUk3;
            ywBT4ESCmAqS8d6lra4iy0u6E2 = r9scupycjv5zn8gyk6xh.LcvPFGYKhAm4SS5FZ;
            try {
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
                removeCallbacks(ywBT4ESCmAqS8d6lra4iy0u6E2);
                if (z) {
                    JY5knQmh7EQJEZ();
                    return obj;
                }
                r9scupycjv5zn8gyk6xh.LcvPFGYKhAm4SS5FZ = null;
                r9scupycjv5zn8gyk6xh.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = obj;
                r9scupycjv5zn8gyk6xh.WIXlfFpvH7glAGsUk3 = j;
                r9scupycjv5zn8gyk6xh.gsHzEVTj1SCIPR = z;
                r9scupycjv5zn8gyk6xh.qTa7aqjjB9Bt6mc = 2;
                if (LYcdI4xpry8eXmFC9I4wyaLdcG1z(r9scupycjv5zn8gyk6xh) == obj2) {
                    return obj;
                }
            } catch (Throwable th3) {
                ywBT4ESCmAqS8d6lra4iy0u6E = ywBT4ESCmAqS8d6lra4iy0u6E2;
                th = th3;
                removeCallbacks(ywBT4ESCmAqS8d6lra4iy0u6E);
                if (z) {
                    JY5knQmh7EQJEZ();
                    throw th;
                }
                r9scupycjv5zn8gyk6xh.LcvPFGYKhAm4SS5FZ = null;
                r9scupycjv5zn8gyk6xh.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = th;
                r9scupycjv5zn8gyk6xh.WIXlfFpvH7glAGsUk3 = j;
                r9scupycjv5zn8gyk6xh.gsHzEVTj1SCIPR = z;
                r9scupycjv5zn8gyk6xh.qTa7aqjjB9Bt6mc = 3;
                if (LYcdI4xpry8eXmFC9I4wyaLdcG1z(r9scupycjv5zn8gyk6xh) != obj2) {
                    th = th;
                    throw th;
                }
            }
        }
        return obj2;
    }

    public LoadingAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public LoadingAnimationView(Context context) {
        this(context, null, 6);
    }
}
