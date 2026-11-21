package bitpit.launcher.ui;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Message;
import android.os.RemoteException;
import android.os.UserHandle;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.AlfjqIWYtShTgT;
import b.Dr3SceIJk5QdOSvJZUsQq;
import b.EmCrywYCUQTWPrPSAsgr;
import b.Emi5d0VyYZLZtm;
import b.FdefTICOs2UQ1fmh66Mky;
import b.HDzaRKEI4SxljA;
import b.JHnppaRJDZMMWaOU5cgIw;
import b.KBz1eieO0k9owh1wnSfkfN;
import b.LLnhW2rxhI026DTfznKMKaPBh;
import b.MJ4Qybv4FFP3bDz2UfzI43;
import b.OkhdZkC3NYLW;
import b.PfboXxqhqiZ0LaoZSANtHKV24;
import b.PpCiePLyew1Vrs3QgUHp663qLyt;
import b.Q5S2F6AHqOkV;
import b.RoFfOkR0Uic3DzqQQ6ekGEhXOaohZ;
import b.SCo4Ctd3zv2DHfczdi;
import b.T3aKaGFxHTFPHfFB;
import b.Ua6X4s3Ghck1i;
import b.VUTfKZyxja2kfM;
import b.WLZoEbRHGAYGtOeo6ZMxoLT9;
import b.XDQC1zlC3KPCLsjTsC8nzqEofqpOn;
import b.Zo1YEZ6nT2Qsm9uBmmbXR;
import b.aotlxyJjNXIlC;
import b.cvu91h5WjQasu7vH8q4wQg9;
import b.dGvRr0aa2CegMWZH8rJH9l1;
import b.fhSNm7dhXpC9W6pfm4CfVlFNDgpq;
import b.gDorRusXxz4vI7fqTkfdRMN;
import b.ggQP1X3lG5YnLLjqLL6mgwsyjxGH;
import b.jxlgdotwt22;
import b.lkiaEDM5lpT;
import b.ogNIMHDmW40UC1xJL3PaVCbnHRx;
import b.pXynlL6SZmXt4dK1Q;
import b.t371EfbQKhkqgzmeFM3wdztuQG6;
import b.tj1tYp1XVFXK9fT3YxA;
import b.vlfokMigIwh;
import b.vqKYGfr8vB0BoMsUd5;
import b.zoZVPf2UIUyDLwN9nQbJV;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CloseAppAnimationView extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener, SurfaceHolder.Callback2, lkiaEDM5lpT {
    public static final tj1tYp1XVFXK9fT3YxA Companion = new tj1tYp1XVFXK9fT3YxA();
    public static final long yM5HHkk1MhPLZFYTHm2JjrArud;
    public HomeActivity GO8WUug7ZWFCUI1zY;
    public VUTfKZyxja2kfM LcvPFGYKhAm4SS5FZ;
    public final Rect Mej0x2K4ZGSUxtYNka4QZ;
    public final MJ4Qybv4FFP3bDz2UfzI43 Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    public aotlxyJjNXIlC WIXlfFpvH7glAGsUk3;
    public ImageView cCmbv8Tzd2QLd161ImIZUlZ8n;
    public final SurfaceView f2sXlW3st0rAKJwyOrCfOWc;
    public Q5S2F6AHqOkV gsHzEVTj1SCIPR;
    public final Choreographer iR1XUIc7FjhMl57O;
    public final Picture qTa7aqjjB9Bt6mc;
    public final RectF qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
    public final RectF sCPtafveBAhdLIs2ajN3WV;

    static {
        HDzaRKEI4SxljA hDzaRKEI4SxljA = Zo1YEZ6nT2Qsm9uBmmbXR.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
        yM5HHkk1MhPLZFYTHm2JjrArud = WLZoEbRHGAYGtOeo6ZMxoLT9.JY5knQmh7EQJEZ(800, SCo4Ctd3zv2DHfczdi.MILLISECONDS);
    }

    public CloseAppAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0, 0);
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = (MJ4Qybv4FFP3bDz2UfzI43) ((jxlgdotwt22) getKoin().BezslBgjveK3hODH.gsHzEVTj1SCIPR).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(MJ4Qybv4FFP3bDz2UfzI43.class), null, null);
        this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = new RectF();
        this.sCPtafveBAhdLIs2ajN3WV = new RectF();
        this.Mej0x2K4ZGSUxtYNka4QZ = new Rect();
        this.qTa7aqjjB9Bt6mc = new Picture();
        SurfaceView surfaceView = new SurfaceView(context);
        surfaceView.setZOrderOnTop(true);
        surfaceView.getHolder().setFormat(-3);
        surfaceView.getHolder().addCallback(this);
        this.f2sXlW3st0rAKJwyOrCfOWc = surfaceView;
        this.iR1XUIc7FjhMl57O = Choreographer.getInstance();
        addView(surfaceView);
    }

    private final void setCurrentIconVisible(boolean z) {
        ImageView imageView = this.cCmbv8Tzd2QLd161ImIZUlZ8n;
        if (imageView != null) {
            imageView.setVisibility(!z ? 4 : 0);
        }
    }

    public final void BezslBgjveK3hODH() {
        VUTfKZyxja2kfM vUTfKZyxja2kfM;
        RectF rectF = this.sCPtafveBAhdLIs2ajN3WV;
        if (rectF.isEmpty() || (vUTfKZyxja2kfM = this.LcvPFGYKhAm4SS5FZ) == null) {
            return;
        }
        SurfaceControl surfaceControl = this.f2sXlW3st0rAKJwyOrCfOWc.getSurfaceControl();
        Bundle bundle = new Bundle();
        bundle.putParcelable("gesture_nav_contract_icon_position", rectF);
        bundle.putParcelable("gesture_nav_contract_surface_control", surfaceControl);
        VUTfKZyxja2kfM.Companion.getClass();
        Ua6X4s3Ghck1i ua6X4s3Ghck1i = (Ua6X4s3Ghck1i) VUTfKZyxja2kfM.BezslBgjveK3hODH.getValue();
        ua6X4s3Ghck1i.getClass();
        ua6X4s3Ghck1i.Rdzg08aYlt0UsoLUNug9cESzgAY9R = new WeakReference(this);
        Message messageObtain = Message.obtain();
        messageObtain.replyTo = ua6X4s3Ghck1i.GO8WUug7ZWFCUI1zY;
        messageObtain.what = 0;
        bundle.putParcelable("gesture_nav_contract_finish_callback", messageObtain);
        Message messageObtain2 = Message.obtain();
        messageObtain2.copyFrom(vUTfKZyxja2kfM.axL8FocTDLUdzg0XScbO);
        messageObtain2.setData(bundle);
        try {
            messageObtain2.replyTo.send(messageObtain2);
        } catch (RemoteException e) {
            Emi5d0VyYZLZtm.ziNFA7KzVfc6(e, "Error sending icon position");
        }
    }

    public final void S1zP5M3X7Ukq3ROlZ87G9I() {
        setCurrentIconVisible(true);
        this.LcvPFGYKhAm4SS5FZ = null;
        this.cCmbv8Tzd2QLd161ImIZUlZ8n = null;
        aotlxyJjNXIlC aotlxyjjnxilc = this.WIXlfFpvH7glAGsUk3;
        if (aotlxyjjnxilc != null) {
            aotlxyjjnxilc.JY5knQmh7EQJEZ(null);
        }
        this.WIXlfFpvH7glAGsUk3 = null;
        if (this.gsHzEVTj1SCIPR == null) {
            Q5S2F6AHqOkV q5S2F6AHqOkV = new Q5S2F6AHqOkV(3, this);
            this.iR1XUIc7FjhMl57O.postFrameCallback(q5S2F6AHqOkV);
            this.gsHzEVTj1SCIPR = q5S2F6AHqOkV;
        }
    }

    public final void axL8FocTDLUdzg0XScbO() {
        SurfaceHolder holder = this.f2sXlW3st0rAKJwyOrCfOWc.getHolder();
        Canvas canvasLockHardwareCanvas = holder.lockHardwareCanvas();
        if (canvasLockHardwareCanvas == null) {
            return;
        }
        this.qTa7aqjjB9Bt6mc.draw(canvasLockHardwareCanvas);
        holder.unlockCanvasAndPost(canvasLockHardwareCanvas);
    }

    @Override // b.lkiaEDM5lpT
    public /* bridge */ pXynlL6SZmXt4dK1Q getKoin() {
        return fhSNm7dhXpC9W6pfm4CfVlFNDgpq.axL8FocTDLUdzg0XScbO();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        ziNFA7KzVfc6();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        setCurrentIconVisible(true);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ziNFA7KzVfc6();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        axL8FocTDLUdzg0XScbO();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        axL8FocTDLUdzg0XScbO();
        BezslBgjveK3hODH();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        axL8FocTDLUdzg0XScbO();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:156:0x00e1 A[EDGE_INSN: B:156:0x00e1->B:67:0x00e1 BREAK  A[LOOP:3: B:33:0x0078->B:66:0x00de], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0060 A[EDGE_INSN: B:26:0x0060->B:67:0x00e1 BREAK  A[LOOP:3: B:33:0x0078->B:66:0x00de]] */
    /* JADX WARN: Code duplicated, block: B:65:0x00dc A[DONT_INVERT, PHI: r11
  0x00dc: PHI (r11v4 android.widget.ImageView) = 
  (r11v2 android.widget.ImageView)
  (r11v2 android.widget.ImageView)
  (r11v2 android.widget.ImageView)
  (r11v2 android.widget.ImageView)
  (r11v2 android.widget.ImageView)
  (r11v5 android.widget.ImageView)
  (r11v2 android.widget.ImageView)
  (r11v2 android.widget.ImageView)
 binds: [B:53:0x00b6, B:56:0x00bb, B:58:0x00c9, B:63:0x00d7, B:48:0x00ad, B:50:0x00b1, B:41:0x0095, B:43:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x00de A[LOOP:3: B:33:0x0078->B:66:0x00de, LOOP_END] */
    public final void ziNFA7KzVfc6() {
        int iAxL8FocTDLUdzg0XScbO;
        ImageView imageView;
        VUTfKZyxja2kfM vUTfKZyxja2kfM = this.LcvPFGYKhAm4SS5FZ;
        if (vUTfKZyxja2kfM == null) {
            return;
        }
        RoFfOkR0Uic3DzqQQ6ekGEhXOaohZ roFfOkR0Uic3DzqQQ6ekGEhXOaohZ = vUTfKZyxja2kfM.S1zP5M3X7Ukq3ROlZ87G9I;
        UserHandle userHandle = roFfOkR0Uic3DzqQQ6ekGEhXOaohZ.axL8FocTDLUdzg0XScbO;
        ComponentName componentName = roFfOkR0Uic3DzqQQ6ekGEhXOaohZ.S1zP5M3X7Ukq3ROlZ87G9I;
        HomeActivity homeActivity = this.GO8WUug7ZWFCUI1zY;
        if (homeActivity == null) {
            homeActivity = null;
        }
        MJ4Qybv4FFP3bDz2UfzI43 mJ4Qybv4FFP3bDz2UfzI43 = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
        if (((dGvRr0aa2CegMWZH8rJH9l1) mJ4Qybv4FFP3bDz2UfzI43.cCmbv8Tzd2QLd161ImIZUlZ8n).S1zP5M3X7Ukq3ROlZ87G9I() == null) {
            ogNIMHDmW40UC1xJL3PaVCbnHRx ognimhdmw40uc1xjl3pavcbnhrx = ((T3aKaGFxHTFPHfFB) mJ4Qybv4FFP3bDz2UfzI43.WIXlfFpvH7glAGsUk3).UV6K6VDbgDgzpi12QAEKN4Emq;
            if (ognimhdmw40uc1xjl3pavcbnhrx == null || !OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(ognimhdmw40uc1xjl3pavcbnhrx.GO8WUug7ZWFCUI1zY, new AlfjqIWYtShTgT(componentName.getPackageName(), userHandle))) {
                ognimhdmw40uc1xjl3pavcbnhrx = null;
            }
            EmCrywYCUQTWPrPSAsgr emCrywYCUQTWPrPSAsgr = homeActivity.d3wjn0WBdr9Ap;
            if (emCrywYCUQTWPrPSAsgr == null) {
                emCrywYCUQTWPrPSAsgr = null;
            }
            emCrywYCUQTWPrPSAsgr.getClass();
            AlfjqIWYtShTgT alfjqIWYtShTgT = new AlfjqIWYtShTgT(componentName.getPackageName(), userHandle);
            RecyclerView recyclerView = emCrywYCUQTWPrPSAsgr.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
            FdefTICOs2UQ1fmh66Mky layoutManager = recyclerView.getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager != null && (iAxL8FocTDLUdzg0XScbO = linearLayoutManager.axL8FocTDLUdzg0XScbO()) != -1) {
                int iZiNFA7KzVfc6 = linearLayoutManager.ziNFA7KzVfc6();
                List list = emCrywYCUQTWPrPSAsgr.WIXlfFpvH7glAGsUk3.qTa7aqjjB9Bt6mc.sCPtafveBAhdLIs2ajN3WV;
                if (iAxL8FocTDLUdzg0XScbO > iZiNFA7KzVfc6) {
                    imageView = null;
                    break;
                }
                imageView = null;
                while (true) {
                    if (iAxL8FocTDLUdzg0XScbO >= list.size()) {
                        imageView = null;
                        break;
                    }
                    vlfokMigIwh vlfokmigiwh = (vlfokMigIwh) list.get(iAxL8FocTDLUdzg0XScbO);
                    if (vlfokmigiwh instanceof XDQC1zlC3KPCLsjTsC8nzqEofqpOn) {
                        ogNIMHDmW40UC1xJL3PaVCbnHRx ognimhdmw40uc1xjl3pavcbnhrx2 = ((XDQC1zlC3KPCLsjTsC8nzqEofqpOn) vlfokmigiwh).WIXlfFpvH7glAGsUk3;
                        boolean zS1zP5M3X7Ukq3ROlZ87G9I = OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(ognimhdmw40uc1xjl3pavcbnhrx2, ognimhdmw40uc1xjl3pavcbnhrx);
                        if (zS1zP5M3X7Ukq3ROlZ87G9I || ((ognimhdmw40uc1xjl3pavcbnhrx2 instanceof t371EfbQKhkqgzmeFM3wdztuQG6) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(((t371EfbQKhkqgzmeFM3wdztuQG6) ognimhdmw40uc1xjl3pavcbnhrx2).bfvGkgRqVBmXp4z3D5cuKKKZz, roFfOkR0Uic3DzqQQ6ekGEhXOaohZ))) {
                            zoZVPf2UIUyDLwN9nQbJV zozvpf2uiuydlwn9nqbjvIR1XUIc7FjhMl57O = recyclerView.iR1XUIc7FjhMl57O(iAxL8FocTDLUdzg0XScbO);
                            Dr3SceIJk5QdOSvJZUsQq dr3SceIJk5QdOSvJZUsQq = zozvpf2uiuydlwn9nqbjvIR1XUIc7FjhMl57O instanceof Dr3SceIJk5QdOSvJZUsQq ? (Dr3SceIJk5QdOSvJZUsQq) zozvpf2uiuydlwn9nqbjvIR1XUIc7FjhMl57O : null;
                            if (dr3SceIJk5QdOSvJZUsQq != null) {
                                imageView = dr3SceIJk5QdOSvJZUsQq.nXIf4d0RGTWG1l;
                                if (zS1zP5M3X7Ukq3ROlZ87G9I) {
                                    break;
                                } else if (iAxL8FocTDLUdzg0XScbO == iZiNFA7KzVfc6) {
                                    break;
                                } else {
                                    iAxL8FocTDLUdzg0XScbO++;
                                }
                            } else {
                                if (iAxL8FocTDLUdzg0XScbO == iZiNFA7KzVfc6) {
                                    break;
                                    break;
                                }
                                iAxL8FocTDLUdzg0XScbO++;
                            }
                        } else {
                            if (iAxL8FocTDLUdzg0XScbO == iZiNFA7KzVfc6) {
                                break;
                                break;
                            }
                            iAxL8FocTDLUdzg0XScbO++;
                        }
                    } else if (!(vlfokmigiwh instanceof PfboXxqhqiZ0LaoZSANtHKV24) && (vlfokmigiwh instanceof vqKYGfr8vB0BoMsUd5) && OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(((vqKYGfr8vB0BoMsUd5) vlfokmigiwh).WIXlfFpvH7glAGsUk3.BezslBgjveK3hODH.LcvPFGYKhAm4SS5FZ, alfjqIWYtShTgT)) {
                        zoZVPf2UIUyDLwN9nQbJV zozvpf2uiuydlwn9nqbjvIR1XUIc7FjhMl57O2 = recyclerView.iR1XUIc7FjhMl57O(iAxL8FocTDLUdzg0XScbO);
                        Dr3SceIJk5QdOSvJZUsQq dr3SceIJk5QdOSvJZUsQq2 = zozvpf2uiuydlwn9nqbjvIR1XUIc7FjhMl57O2 instanceof Dr3SceIJk5QdOSvJZUsQq ? (Dr3SceIJk5QdOSvJZUsQq) zozvpf2uiuydlwn9nqbjvIR1XUIc7FjhMl57O2 : null;
                        if (dr3SceIJk5QdOSvJZUsQq2 != null) {
                            imageView = dr3SceIJk5QdOSvJZUsQq2.nXIf4d0RGTWG1l;
                            break;
                        }
                        if (iAxL8FocTDLUdzg0XScbO == iZiNFA7KzVfc6) {
                            break;
                            break;
                        }
                        iAxL8FocTDLUdzg0XScbO++;
                    } else {
                        if (iAxL8FocTDLUdzg0XScbO == iZiNFA7KzVfc6) {
                            break;
                            break;
                        }
                        iAxL8FocTDLUdzg0XScbO++;
                    }
                }
            } else {
                imageView = null;
                break;
            }
            if (imageView == null) {
                gDorRusXxz4vI7fqTkfdRMN gdorrusxxz4vi7fqtkfdrmn = mJ4Qybv4FFP3bDz2UfzI43.GO8WUug7ZWFCUI1zY;
                PpCiePLyew1Vrs3QgUHp663qLyt ppCiePLyew1Vrs3QgUHp663qLyt = mJ4Qybv4FFP3bDz2UfzI43.Rdzg08aYlt0UsoLUNug9cESzgAY9R.J1BE9tYH1em4X1uAhc6L7f4M;
                if (ppCiePLyew1Vrs3QgUHp663qLyt == null) {
                    ppCiePLyew1Vrs3QgUHp663qLyt = null;
                }
                KBz1eieO0k9owh1wnSfkfN kBz1eieO0k9owh1wnSfkfN = ppCiePLyew1Vrs3QgUHp663qLyt instanceof KBz1eieO0k9owh1wnSfkfN ? (KBz1eieO0k9owh1wnSfkfN) ppCiePLyew1Vrs3QgUHp663qLyt : null;
                if (kBz1eieO0k9owh1wnSfkfN == null || kBz1eieO0k9owh1wnSfkfN.ymQF046nqhMXpxNsXtOg == null) {
                    imageView = null;
                } else {
                    LLnhW2rxhI026DTfznKMKaPBh lLnhW2rxhI026DTfznKMKaPBh = (LLnhW2rxhI026DTfznKMKaPBh) gdorrusxxz4vi7fqtkfdrmn;
                    ogNIMHDmW40UC1xJL3PaVCbnHRx ognimhdmw40uc1xjl3pavcbnhrx3 = (ogNIMHDmW40UC1xJL3PaVCbnHRx) ggQP1X3lG5YnLLjqLL6mgwsyjxGH.yM5HHkk1MhPLZFYTHm2JjrArud(lLnhW2rxhI026DTfznKMKaPBh.cVfIGUKLEqID1HH.gsHzEVTj1SCIPR);
                    ogNIMHDmW40UC1xJL3PaVCbnHRx ognimhdmw40uc1xjl3pavcbnhrx4 = (ogNIMHDmW40UC1xJL3PaVCbnHRx) ggQP1X3lG5YnLLjqLL6mgwsyjxGH.yM5HHkk1MhPLZFYTHm2JjrArud(lLnhW2rxhI026DTfznKMKaPBh.czGAefXQxIZzo.gsHzEVTj1SCIPR);
                    if (((ognimhdmw40uc1xjl3pavcbnhrx == null || (!OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(ognimhdmw40uc1xjl3pavcbnhrx3, ognimhdmw40uc1xjl3pavcbnhrx) && !OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(ognimhdmw40uc1xjl3pavcbnhrx4, ognimhdmw40uc1xjl3pavcbnhrx))) && ((!(ognimhdmw40uc1xjl3pavcbnhrx3 instanceof t371EfbQKhkqgzmeFM3wdztuQG6) || !OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(((t371EfbQKhkqgzmeFM3wdztuQG6) ognimhdmw40uc1xjl3pavcbnhrx3).bfvGkgRqVBmXp4z3D5cuKKKZz, roFfOkR0Uic3DzqQQ6ekGEhXOaohZ)) && (!(ognimhdmw40uc1xjl3pavcbnhrx4 instanceof t371EfbQKhkqgzmeFM3wdztuQG6) || !OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(((t371EfbQKhkqgzmeFM3wdztuQG6) ognimhdmw40uc1xjl3pavcbnhrx4).bfvGkgRqVBmXp4z3D5cuKKKZz, roFfOkR0Uic3DzqQQ6ekGEhXOaohZ)))) || (imageView = homeActivity.zERj7wgTMSj5XP5) == null) {
                        imageView = null;
                    }
                }
            }
        } else {
            imageView = null;
        }
        boolean z = this.cCmbv8Tzd2QLd161ImIZUlZ8n != imageView;
        if (z) {
            setCurrentIconVisible(true);
            this.cCmbv8Tzd2QLd161ImIZUlZ8n = imageView;
            setCurrentIconVisible(false);
        }
        Rect rect = this.Mej0x2K4ZGSUxtYNka4QZ;
        if (imageView != null && imageView.isAttachedToWindow()) {
            rect.set(0, 0, imageView.getWidth(), imageView.getHeight());
            float f = rect.left;
            float f2 = rect.top;
            float f3 = rect.right;
            float f4 = rect.bottom;
            float[] fArr = new float[4];
            fArr[0] = f;
            fArr[1] = f2;
            fArr[2] = f3;
            fArr[3] = f4;
            HomeActivity homeActivity2 = this.GO8WUug7ZWFCUI1zY;
            if (homeActivity2 == null) {
                homeActivity2 = null;
            }
            ViewGroup viewGroup = homeActivity2.vtXr3xr3vQMVMTW;
            ViewGroup viewGroup2 = viewGroup != null ? viewGroup : null;
            for (View view = imageView; view != viewGroup2; view = (View) view.getParent()) {
                if (view != imageView) {
                    float f5 = -view.getScrollX();
                    float f6 = -view.getScrollY();
                    for (int i = 0; i < 4; i += 2) {
                        fArr[i] = fArr[i] + f5;
                        int i2 = i + 1;
                        fArr[i2] = fArr[i2] + f6;
                    }
                }
                float left = view.getLeft();
                float top = view.getTop();
                for (int i3 = 0; i3 < 4; i3 += 2) {
                    fArr[i3] = fArr[i3] + left;
                    int i4 = i3 + 1;
                    fArr[i4] = fArr[i4] + top;
                }
                view.getScaleX();
            }
            float f7 = fArr[0];
            float f8 = fArr[2];
            float f9 = f7 > f8 ? f8 : f7;
            float f10 = fArr[1];
            float f11 = fArr[3];
            float f12 = f10 > f11 ? f11 : f10;
            if (f7 < f8) {
                f7 = f8;
            }
            if (f10 < f11) {
                f10 = f11;
            }
            RectF rectF = this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
            rectF.set(f9, f12, f7, f10);
            RectF rectF2 = this.sCPtafveBAhdLIs2ajN3WV;
            if (!rectF.equals(rectF2)) {
                rectF2.set(rectF);
                BezslBgjveK3hODH();
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f2sXlW3st0rAKJwyOrCfOWc.getLayoutParams();
                layoutParams.width = cvu91h5WjQasu7vH8q4wQg9.JY5knQmh7EQJEZ(rectF2.width());
                layoutParams.height = cvu91h5WjQasu7vH8q4wQg9.JY5knQmh7EQJEZ(rectF2.height());
                layoutParams.leftMargin = cvu91h5WjQasu7vH8q4wQg9.JY5knQmh7EQJEZ(rectF2.left);
                layoutParams.topMargin = cvu91h5WjQasu7vH8q4wQg9.JY5knQmh7EQJEZ(rectF2.top);
            }
        }
        if (!z || rect.isEmpty()) {
            return;
        }
        setCurrentIconVisible(true);
        int iWidth = rect.width();
        int iHeight = rect.height();
        Picture picture = this.qTa7aqjjB9Bt6mc;
        Canvas canvasBeginRecording = picture.beginRecording(iWidth, iHeight);
        canvasBeginRecording.translate(-rect.left, -rect.top);
        if (imageView != null) {
            imageView.draw(canvasBeginRecording);
        }
        picture.endRecording();
        setCurrentIconVisible(false);
        axL8FocTDLUdzg0XScbO();
    }

    public CloseAppAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
    }

    public CloseAppAnimationView(Context context) {
        this(context, null, 14);
    }
}
