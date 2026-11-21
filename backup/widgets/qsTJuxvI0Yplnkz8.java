package bitpit.launcher.backup.widgets;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.SQLException;
import android.os.UserHandle;
import b.BUWtWmSwsxqWsAJR6in;
import b.DbQNgaGHDHAbMye;
import b.FAcOmIkfv5ix8sNJsaM6iT;
import b.HC4Qfv5U9BXKFJWuann4jjcUV;
import b.HDzaRKEI4SxljA;
import b.Hnv6Te9rrTA0VqZMo;
import b.ImpthMuH1b3Ns681NDYjG0;
import b.J7Tsg1eqTfbK8vIo4RFOyjPiu;
import b.KIg99xM55G;
import b.MiJr28KwaBWegerQb0;
import b.Mrfemq5Sav3yOR731;
import b.NMquq9o0FvRs5RyiTFrS;
import b.PeLieoBN4yxYJZju3kQtKIsq7XL8;
import b.RvhyPjquEfKeg2aqLeO7fm7;
import b.SCo4Ctd3zv2DHfczdi;
import b.SLOwxJpIB9B5UOjbTCfECaqChB;
import b.U9zqAKZlD2;
import b.UfBdTerHo7YiIb8;
import b.WLZoEbRHGAYGtOeo6ZMxoLT9;
import b.Z8IDXN2k45p3I6p;
import b.Zju0RZrDKb;
import b.Zo1YEZ6nT2Qsm9uBmmbXR;
import b.aJLiMmqfPh61r;
import b.aNONfmXWW0uqauI17bnoBjg;
import b.aUjEJZsbYKT7;
import b.amndRZ6ZiSy4ZOFMYy0W;
import b.bMjZFECsuU6MdmSOqmYrlYsV3oEeB;
import b.c8uqyFj2S96xj6puCWQdV;
import b.cdjHGKliASEP50WE;
import b.dGvRr0aa2CegMWZH8rJH9l1;
import b.dJccTiqzGk;
import b.gWrwpDOz79pszaF;
import b.hubmHEjGWrZxs6O0S;
import b.lT14RDm4I5i5K8RS;
import b.p5dObLCCwDWdcCs;
import b.pxIHJY45LsBs98maR1INey;
import b.rbpFGdpgDCAQXat;
import b.s9XnN7QTAJ;
import b.tIDTjdoK38;
import b.uuyTGGFjNDiF1SxHW;
import b.w0uweGyT374wMBSB;
import b.wQATOGDnLEyL;
import b.x4PcPRPmslEJW;
import b.zHfG9eBtghieLBn;
import bitpit.launcher.util.exception.EntityException;
import bitpit.launcher.widget.UserCanceledWidgetCreationException;

/* JADX INFO: loaded from: classes.dex */
public final class qsTJuxvI0Yplnkz8 implements c8uqyFj2S96xj6puCWQdV {
    public static final Z8IDXN2k45p3I6p Companion = new Z8IDXN2k45p3I6p();
    public static final long LYcdI4xpry8eXmFC9I4wyaLdcG1z;
    public final MiJr28KwaBWegerQb0 Aboow6rUrcY2SrFRa46C6uy;
    public final pxIHJY45LsBs98maR1INey BezslBgjveK3hODH;
    public final UfBdTerHo7YiIb8 JY5knQmh7EQJEZ;
    public final HC4Qfv5U9BXKFJWuann4jjcUV PQQPeCDD0JLCT3aLz;
    public final Context S1zP5M3X7Ukq3ROlZ87G9I;
    public final zHfG9eBtghieLBn axL8FocTDLUdzg0XScbO;
    public final U9zqAKZlD2 ox9eclwMpRd;
    public final Mrfemq5Sav3yOR731 ziNFA7KzVfc6;

    static {
        HDzaRKEI4SxljA hDzaRKEI4SxljA = Zo1YEZ6nT2Qsm9uBmmbXR.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
        LYcdI4xpry8eXmFC9I4wyaLdcG1z = WLZoEbRHGAYGtOeo6ZMxoLT9.JY5knQmh7EQJEZ(600, SCo4Ctd3zv2DHfczdi.MILLISECONDS);
    }

    public qsTJuxvI0Yplnkz8(Context context, zHfG9eBtghieLBn zhfg9ebtghielbn, pxIHJY45LsBs98maR1INey pxihjy45lsbs98mar1iney, Mrfemq5Sav3yOR731 mrfemq5Sav3yOR731, MiJr28KwaBWegerQb0 miJr28KwaBWegerQb0, U9zqAKZlD2 u9zqAKZlD2, HC4Qfv5U9BXKFJWuann4jjcUV hC4Qfv5U9BXKFJWuann4jjcUV, UfBdTerHo7YiIb8 ufBdTerHo7YiIb8) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = context;
        this.axL8FocTDLUdzg0XScbO = zhfg9ebtghielbn;
        this.BezslBgjveK3hODH = pxihjy45lsbs98mar1iney;
        this.ziNFA7KzVfc6 = mrfemq5Sav3yOR731;
        this.Aboow6rUrcY2SrFRa46C6uy = miJr28KwaBWegerQb0;
        this.ox9eclwMpRd = u9zqAKZlD2;
        this.PQQPeCDD0JLCT3aLz = hC4Qfv5U9BXKFJWuann4jjcUV;
        this.JY5knQmh7EQJEZ = ufBdTerHo7YiIb8;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object Aboow6rUrcY2SrFRa46C6uy(w0uweGyT374wMBSB w0uwegyt374wmbsb, bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) {
        p5dObLCCwDWdcCs p5doblccwdwdccs;
        aNONfmXWW0uqauI17bnoBjg anonfmxww0uqaui17bnobjg;
        int iAllocateAppWidgetId;
        Exception exc;
        int i;
        gWrwpDOz79pszaF gwrwpdoz79pszaf;
        int i2;
        qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz8;
        AppWidgetProviderInfo appWidgetProviderInfo;
        gWrwpDOz79pszaF gwrwpdoz79pszaf2;
        int i3;
        aNONfmXWW0uqauI17bnoBjg anonfmxww0uqaui17bnobjg2;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof p5dObLCCwDWdcCs) {
            p5doblccwdwdccs = (p5dObLCCwDWdcCs) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i4 = p5doblccwdwdccs.FzogU2bPCQtD6a1hMYB1kyti;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                p5doblccwdwdccs.FzogU2bPCQtD6a1hMYB1kyti = i4 - Integer.MIN_VALUE;
            } else {
                p5doblccwdwdccs = new p5dObLCCwDWdcCs(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            p5doblccwdwdccs = new p5dObLCCwDWdcCs(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        p5dObLCCwDWdcCs p5doblccwdwdccs2 = p5doblccwdwdccs;
        Object obj = p5doblccwdwdccs2.iR1XUIc7FjhMl57O;
        int i5 = p5doblccwdwdccs2.FzogU2bPCQtD6a1hMYB1kyti;
        tIDTjdoK38 tidtjdok38 = tIDTjdoK38.GO8WUug7ZWFCUI1zY;
        try {
            try {
                if (i5 == 0) {
                    Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
                    anonfmxww0uqaui17bnobjg = J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion;
                    UfBdTerHo7YiIb8 ufBdTerHo7YiIb8 = this.JY5knQmh7EQJEZ;
                    AppWidgetManager appWidgetManager = ufBdTerHo7YiIb8.qTa7aqjjB9Bt6mc;
                    if (appWidgetManager == null) {
                        throw new WidgetRestoreException.SystemComponentUnavailable(null, "AppWidgetManager");
                    }
                    gWrwpDOz79pszaF gwrwpdoz79pszafJY5knQmh7EQJEZ = ufBdTerHo7YiIb8.JY5knQmh7EQJEZ();
                    if (gwrwpdoz79pszafJY5knQmh7EQJEZ == null) {
                        throw new WidgetRestoreException.SystemComponentUnavailable(null, "AppWidgetHost");
                    }
                    iAllocateAppWidgetId = gwrwpdoz79pszafJY5knQmh7EQJEZ.allocateAppWidgetId();
                    try {
                        AppWidgetProviderInfo appWidgetProviderInfoAxL8FocTDLUdzg0XScbO = axL8FocTDLUdzg0XScbO(w0uwegyt374wmbsb);
                        p5doblccwdwdccs2.WIXlfFpvH7glAGsUk3 = w0uwegyt374wmbsb;
                        p5doblccwdwdccs2.gsHzEVTj1SCIPR = this;
                        p5doblccwdwdccs2.LcvPFGYKhAm4SS5FZ = gwrwpdoz79pszafJY5knQmh7EQJEZ;
                        p5doblccwdwdccs2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = appWidgetProviderInfoAxL8FocTDLUdzg0XScbO;
                        p5doblccwdwdccs2.sCPtafveBAhdLIs2ajN3WV = anonfmxww0uqaui17bnobjg;
                        i2 = 0;
                        p5doblccwdwdccs2.Mej0x2K4ZGSUxtYNka4QZ = 0;
                        p5doblccwdwdccs2.qTa7aqjjB9Bt6mc = 0;
                        p5doblccwdwdccs2.f2sXlW3st0rAKJwyOrCfOWc = iAllocateAppWidgetId;
                        p5doblccwdwdccs2.FzogU2bPCQtD6a1hMYB1kyti = 1;
                        if (S1zP5M3X7Ukq3ROlZ87G9I(iAllocateAppWidgetId, appWidgetProviderInfoAxL8FocTDLUdzg0XScbO, false, appWidgetManager, p5doblccwdwdccs2) != tidtjdok38) {
                            qstjuxvi0yplnkz8 = this;
                            appWidgetProviderInfo = appWidgetProviderInfoAxL8FocTDLUdzg0XScbO;
                            gwrwpdoz79pszaf2 = gwrwpdoz79pszafJY5knQmh7EQJEZ;
                            i3 = 0;
                        }
                        return tidtjdok38;
                    } catch (Exception e) {
                        exc = e;
                        i = iAllocateAppWidgetId;
                        gwrwpdoz79pszaf = gwrwpdoz79pszafJY5knQmh7EQJEZ;
                        gwrwpdoz79pszaf.deleteAppWidgetId(i);
                        throw exc;
                    }
                }
                if (i5 != 1) {
                    if (i5 != 2) {
                        uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = p5doblccwdwdccs2.f2sXlW3st0rAKJwyOrCfOWc;
                    anonfmxww0uqaui17bnobjg2 = p5doblccwdwdccs2.sCPtafveBAhdLIs2ajN3WV;
                    gwrwpdoz79pszaf = p5doblccwdwdccs2.LcvPFGYKhAm4SS5FZ;
                    try {
                        Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
                        w0uweGyT374wMBSB w0uwegyt374wmbsb2 = (w0uweGyT374wMBSB) obj;
                        anonfmxww0uqaui17bnobjg2.getClass();
                        return w0uwegyt374wmbsb2;
                    } catch (Exception e2) {
                        exc = e2;
                        gwrwpdoz79pszaf.deleteAppWidgetId(i);
                        throw exc;
                    }
                }
                i = p5doblccwdwdccs2.f2sXlW3st0rAKJwyOrCfOWc;
                int i6 = p5doblccwdwdccs2.qTa7aqjjB9Bt6mc;
                int i7 = p5doblccwdwdccs2.Mej0x2K4ZGSUxtYNka4QZ;
                aNONfmXWW0uqauI17bnoBjg anonfmxww0uqaui17bnobjg3 = p5doblccwdwdccs2.sCPtafveBAhdLIs2ajN3WV;
                AppWidgetProviderInfo appWidgetProviderInfo2 = p5doblccwdwdccs2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
                gwrwpdoz79pszaf2 = p5doblccwdwdccs2.LcvPFGYKhAm4SS5FZ;
                qsTJuxvI0Yplnkz8 qstjuxvi0yplnkz9 = p5doblccwdwdccs2.gsHzEVTj1SCIPR;
                w0uweGyT374wMBSB w0uwegyt374wmbsb3 = p5doblccwdwdccs2.WIXlfFpvH7glAGsUk3;
                try {
                    Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
                    iAllocateAppWidgetId = i;
                    qstjuxvi0yplnkz8 = qstjuxvi0yplnkz9;
                    appWidgetProviderInfo = appWidgetProviderInfo2;
                    anonfmxww0uqaui17bnobjg = anonfmxww0uqaui17bnobjg3;
                    i3 = i7;
                    i2 = i6;
                    w0uwegyt374wmbsb = w0uwegyt374wmbsb3;
                } catch (Exception e3) {
                    exc = e3;
                    gwrwpdoz79pszaf = gwrwpdoz79pszaf2;
                    gwrwpdoz79pszaf.deleteAppWidgetId(i);
                    throw exc;
                }
                if (Zju0RZrDKb.WT8HZhEwPEkG(appWidgetProviderInfo)) {
                    gwrwpdoz79pszaf2.deleteAppWidgetId(iAllocateAppWidgetId);
                    throw new WidgetRestoreException.WidgetRequiresConfiguration(3);
                }
                p5doblccwdwdccs2.WIXlfFpvH7glAGsUk3 = null;
                p5doblccwdwdccs2.gsHzEVTj1SCIPR = null;
                p5doblccwdwdccs2.LcvPFGYKhAm4SS5FZ = gwrwpdoz79pszaf2;
                p5doblccwdwdccs2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                p5doblccwdwdccs2.sCPtafveBAhdLIs2ajN3WV = anonfmxww0uqaui17bnobjg;
                p5doblccwdwdccs2.Mej0x2K4ZGSUxtYNka4QZ = i3;
                p5doblccwdwdccs2.qTa7aqjjB9Bt6mc = i2;
                p5doblccwdwdccs2.f2sXlW3st0rAKJwyOrCfOWc = iAllocateAppWidgetId;
                p5doblccwdwdccs2.FzogU2bPCQtD6a1hMYB1kyti = 2;
                Object objLYcdI4xpry8eXmFC9I4wyaLdcG1z = qstjuxvi0yplnkz8.LYcdI4xpry8eXmFC9I4wyaLdcG1z(w0uwegyt374wmbsb, appWidgetProviderInfo, iAllocateAppWidgetId, p5doblccwdwdccs2);
                if (objLYcdI4xpry8eXmFC9I4wyaLdcG1z != tidtjdok38) {
                    anonfmxww0uqaui17bnobjg2 = anonfmxww0uqaui17bnobjg;
                    gwrwpdoz79pszaf = gwrwpdoz79pszaf2;
                    obj = objLYcdI4xpry8eXmFC9I4wyaLdcG1z;
                    i = iAllocateAppWidgetId;
                    w0uweGyT374wMBSB w0uwegyt374wmbsb4 = (w0uweGyT374wMBSB) obj;
                    anonfmxww0uqaui17bnobjg2.getClass();
                    return w0uwegyt374wmbsb4;
                }
                return tidtjdok38;
            } catch (Exception e4) {
                exc = e4;
                i = iAllocateAppWidgetId;
                gwrwpdoz79pszaf = gwrwpdoz79pszaf2;
                gwrwpdoz79pszaf.deleteAppWidgetId(i);
                throw exc;
            }
        } catch (Throwable th) {
            if (th instanceof WidgetRestoreException) {
                return aJLiMmqfPh61r.ox9eclwMpRd(J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion, th);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011a, code lost:
    
        if (r8 == r3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0142, code lost:
    
        if (r8 == r3) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object BezslBgjveK3hODH(b.w0uweGyT374wMBSB r6, bitpit.launcher.backup.widgets.WidgetRestoreException r7, b.bMjZFECsuU6MdmSOqmYrlYsV3oEeB r8) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bitpit.launcher.backup.widgets.qsTJuxvI0Yplnkz8.BezslBgjveK3hODH(b.w0uweGyT374wMBSB, bitpit.launcher.backup.widgets.WidgetRestoreException, b.bMjZFECsuU6MdmSOqmYrlYsV3oEeB):java.lang.Object");
    }

    public final void JY5knQmh7EQJEZ(w0uweGyT374wMBSB w0uwegyt374wmbsb) {
        int i = w0uwegyt374wmbsb.PoRwkUUfcmwTiLMm;
        if ((i & 256) == 256) {
            return;
        }
        if ((i & 63) == 0) {
            cdjHGKliASEP50WE.S1zP5M3X7Ukq3ROlZ87G9I.flPMk2Ix9h3b95v("Attempted to create WidgetCreationErrorDialog even though the widget did not fail to restore", new Object[0]);
        } else {
            rbpFGdpgDCAQXat.ziNFA7KzVfc6(this.axL8FocTDLUdzg0XScbO, null, 0, new KIg99xM55G(this, w0uwegyt374wmbsb, null, 1), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object LYcdI4xpry8eXmFC9I4wyaLdcG1z(w0uweGyT374wMBSB w0uwegyt374wmbsb, AppWidgetProviderInfo appWidgetProviderInfo, int i, bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) throws WidgetRestoreException.SystemFailure, WidgetRestoreException.SystemComponentUnavailable {
        SLOwxJpIB9B5UOjbTCfECaqChB sLOwxJpIB9B5UOjbTCfECaqChB;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof SLOwxJpIB9B5UOjbTCfECaqChB) {
            sLOwxJpIB9B5UOjbTCfECaqChB = (SLOwxJpIB9B5UOjbTCfECaqChB) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i2 = sLOwxJpIB9B5UOjbTCfECaqChB.LcvPFGYKhAm4SS5FZ;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sLOwxJpIB9B5UOjbTCfECaqChB.LcvPFGYKhAm4SS5FZ = i2 - Integer.MIN_VALUE;
            } else {
                sLOwxJpIB9B5UOjbTCfECaqChB = new SLOwxJpIB9B5UOjbTCfECaqChB(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            sLOwxJpIB9B5UOjbTCfECaqChB = new SLOwxJpIB9B5UOjbTCfECaqChB(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        Object objAxL8FocTDLUdzg0XScbO = sLOwxJpIB9B5UOjbTCfECaqChB.WIXlfFpvH7glAGsUk3;
        int i3 = sLOwxJpIB9B5UOjbTCfECaqChB.LcvPFGYKhAm4SS5FZ;
        try {
            if (i3 == 0) {
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objAxL8FocTDLUdzg0XScbO);
                Mrfemq5Sav3yOR731 mrfemq5Sav3yOR731 = this.ziNFA7KzVfc6;
                BUWtWmSwsxqWsAJR6in bUWtWmSwsxqWsAJR6in = new BUWtWmSwsxqWsAJR6in(i, 4, w0uwegyt374wmbsb, this, appWidgetProviderInfo);
                sLOwxJpIB9B5UOjbTCfECaqChB.LcvPFGYKhAm4SS5FZ = 1;
                objAxL8FocTDLUdzg0XScbO = ((RvhyPjquEfKeg2aqLeO7fm7) mrfemq5Sav3yOR731).axL8FocTDLUdzg0XScbO(16, bUWtWmSwsxqWsAJR6in, sLOwxJpIB9B5UOjbTCfECaqChB);
                tIDTjdoK38 tidtjdok38 = tIDTjdoK38.GO8WUug7ZWFCUI1zY;
                if (objAxL8FocTDLUdzg0XScbO == tidtjdok38) {
                    return tidtjdok38;
                }
            } else {
                if (i3 != 1) {
                    uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objAxL8FocTDLUdzg0XScbO);
            }
            return (w0uweGyT374wMBSB) objAxL8FocTDLUdzg0XScbO;
        } catch (SQLException e) {
            throw new WidgetRestoreException.SystemFailure("Some system functionality has failed".concat(" (Updated widget entity could not be inserted into database)"), e);
        } catch (EntityException e2) {
            throw new WidgetRestoreException.SystemComponentUnavailable(e2, e2.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object PQQPeCDD0JLCT3aLz(w0uweGyT374wMBSB w0uwegyt374wmbsb, bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) throws Throwable {
        aUjEJZsbYKT7 aujejzsbykt7;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof aUjEJZsbYKT7) {
            aujejzsbykt7 = (aUjEJZsbYKT7) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i = aujejzsbykt7.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
            if ((i & Integer.MIN_VALUE) != 0) {
                aujejzsbykt7.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = i - Integer.MIN_VALUE;
            } else {
                aujejzsbykt7 = new aUjEJZsbYKT7(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            aujejzsbykt7 = new aUjEJZsbYKT7(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        Object objJY5knQmh7EQJEZ = aujejzsbykt7.gsHzEVTj1SCIPR;
        int i2 = aujejzsbykt7.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
        if (i2 == 0) {
            Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objJY5knQmh7EQJEZ);
            PeLieoBN4yxYJZju3kQtKIsq7XL8 peLieoBN4yxYJZju3kQtKIsq7XL8 = NMquq9o0FvRs5RyiTFrS.S1zP5M3X7Ukq3ROlZ87G9I;
            x4PcPRPmslEJW x4pcprpmslejw = x4PcPRPmslEJW.cCmbv8Tzd2QLd161ImIZUlZ8n;
            wQATOGDnLEyL wqatogdnleyl = new wQATOGDnLEyL(this, w0uwegyt374wmbsb, null, 2);
            aujejzsbykt7.WIXlfFpvH7glAGsUk3 = w0uwegyt374wmbsb;
            aujejzsbykt7.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = 1;
            objJY5knQmh7EQJEZ = rbpFGdpgDCAQXat.JY5knQmh7EQJEZ(x4pcprpmslejw, wqatogdnleyl, aujejzsbykt7);
            tIDTjdoK38 tidtjdok38 = tIDTjdoK38.GO8WUug7ZWFCUI1zY;
            if (objJY5knQmh7EQJEZ == tidtjdok38) {
                return tidtjdok38;
            }
        } else {
            if (i2 != 1) {
                uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w0uwegyt374wmbsb = aujejzsbykt7.WIXlfFpvH7glAGsUk3;
            Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objJY5knQmh7EQJEZ);
        }
        ((dGvRr0aa2CegMWZH8rJH9l1) this.BezslBgjveK3hODH).PQQPeCDD0JLCT3aLz(null, new DbQNgaGHDHAbMye((String) objJY5knQmh7EQJEZ, this, w0uwegyt374wmbsb, 29));
        return s9XnN7QTAJ.S1zP5M3X7Ukq3ROlZ87G9I;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object S1zP5M3X7Ukq3ROlZ87G9I(int i, AppWidgetProviderInfo appWidgetProviderInfo, boolean z, AppWidgetManager appWidgetManager, bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) throws Throwable {
        ImpthMuH1b3Ns681NDYjG0 impthMuH1b3Ns681NDYjG0;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof ImpthMuH1b3Ns681NDYjG0) {
            impthMuH1b3Ns681NDYjG0 = (ImpthMuH1b3Ns681NDYjG0) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i2 = impthMuH1b3Ns681NDYjG0.LcvPFGYKhAm4SS5FZ;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                impthMuH1b3Ns681NDYjG0.LcvPFGYKhAm4SS5FZ = i2 - Integer.MIN_VALUE;
            } else {
                impthMuH1b3Ns681NDYjG0 = new ImpthMuH1b3Ns681NDYjG0(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            impthMuH1b3Ns681NDYjG0 = new ImpthMuH1b3Ns681NDYjG0(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        Object objJY5knQmh7EQJEZ = impthMuH1b3Ns681NDYjG0.WIXlfFpvH7glAGsUk3;
        int i3 = impthMuH1b3Ns681NDYjG0.LcvPFGYKhAm4SS5FZ;
        try {
            if (i3 == 0) {
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objJY5knQmh7EQJEZ);
                ComponentName componentName = appWidgetProviderInfo.provider;
                UserHandle profile = appWidgetProviderInfo.getProfile();
                if (!appWidgetManager.bindAppWidgetIdIfAllowed(i, profile, componentName, null)) {
                    if (!z) {
                        throw new WidgetRestoreException.WidgetCreationPermissionMissing(null);
                    }
                    Intent intentPutExtra = new Intent("android.appwidget.action.APPWIDGET_BIND").putExtra("appWidgetId", i).putExtra("appWidgetProvider", componentName).putExtra("appWidgetProviderProfile", profile);
                    PeLieoBN4yxYJZju3kQtKIsq7XL8 peLieoBN4yxYJZju3kQtKIsq7XL8 = NMquq9o0FvRs5RyiTFrS.S1zP5M3X7Ukq3ROlZ87G9I;
                    FAcOmIkfv5ix8sNJsaM6iT fAcOmIkfv5ix8sNJsaM6iT = amndRZ6ZiSy4ZOFMYy0W.S1zP5M3X7Ukq3ROlZ87G9I;
                    dJccTiqzGk djcctiqzgk = new dJccTiqzGk(this, intentPutExtra, null, 4);
                    impthMuH1b3Ns681NDYjG0.LcvPFGYKhAm4SS5FZ = 1;
                    objJY5knQmh7EQJEZ = rbpFGdpgDCAQXat.JY5knQmh7EQJEZ(fAcOmIkfv5ix8sNJsaM6iT, djcctiqzgk, impthMuH1b3Ns681NDYjG0);
                    tIDTjdoK38 tidtjdok38 = tIDTjdoK38.GO8WUug7ZWFCUI1zY;
                    if (objJY5knQmh7EQJEZ == tidtjdok38) {
                        return tidtjdok38;
                    }
                }
                return s9XnN7QTAJ.S1zP5M3X7Ukq3ROlZ87G9I;
            }
            if (i3 != 1) {
                uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objJY5knQmh7EQJEZ);
            hubmHEjGWrZxs6O0S hubmhejgwrzxs6o0s = (hubmHEjGWrZxs6O0S) objJY5knQmh7EQJEZ;
            if (hubmhejgwrzxs6o0s == null || hubmhejgwrzxs6o0s.S1zP5M3X7Ukq3ROlZ87G9I != -1) {
                throw new UserCanceledWidgetCreationException();
            }
            return s9XnN7QTAJ.S1zP5M3X7Ukq3ROlZ87G9I;
        } catch (ActivityNotFoundException e) {
            throw new WidgetRestoreException.SystemComponentUnavailable(e, "Widget creation activity not found");
        } catch (UserCanceledWidgetCreationException e2) {
            throw new WidgetRestoreException.WidgetCreationPermissionMissing(e2);
        }
    }

    public final AppWidgetProviderInfo axL8FocTDLUdzg0XScbO(w0uweGyT374wMBSB w0uwegyt374wmbsb) throws WidgetRestoreException.AppDoesNotSupportWidget, WidgetRestoreException.AppNotInstalled {
        AppWidgetProviderInfo appWidgetProviderInfoOx9eclwMpRd = this.JY5knQmh7EQJEZ.ox9eclwMpRd(w0uwegyt374wmbsb.vHDGcerxdYUGlVld2h);
        if (appWidgetProviderInfoOx9eclwMpRd != null) {
            return appWidgetProviderInfoOx9eclwMpRd;
        }
        if (((RvhyPjquEfKeg2aqLeO7fm7) this.ziNFA7KzVfc6).Aboow6rUrcY2SrFRa46C6uy(w0uwegyt374wmbsb.GO8WUug7ZWFCUI1zY, true).isEmpty()) {
            throw new WidgetRestoreException.AppNotInstalled("App is not installed".concat(""), null);
        }
        throw new WidgetRestoreException.AppDoesNotSupportWidget("App no longer supports this type of widget".concat(""), null);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f1 A[Catch: Exception -> 0x003b, all -> 0x014e, TRY_ENTER, TryCatch #3 {Exception -> 0x003b, blocks: (B:15:0x0036, B:63:0x0130, B:49:0x00ed, B:51:0x00f1, B:60:0x0117, B:54:0x00fa, B:55:0x0102, B:57:0x0104, B:58:0x0110, B:43:0x00be, B:45:0x00c4), top: B:85:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0111  */
    /* JADX WARN: Code duplicated, block: B:83:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012d, code lost:
    
        if (r1 == r9) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [b.gWrwpDOz79pszaF] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object ox9eclwMpRd(b.w0uweGyT374wMBSB r18, b.bMjZFECsuU6MdmSOqmYrlYsV3oEeB r19) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bitpit.launcher.backup.widgets.qsTJuxvI0Yplnkz8.ox9eclwMpRd(b.w0uweGyT374wMBSB, b.bMjZFECsuU6MdmSOqmYrlYsV3oEeB):java.lang.Object");
    }

    public final Object ziNFA7KzVfc6(w0uweGyT374wMBSB w0uwegyt374wmbsb, Integer num, bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) {
        UfBdTerHo7YiIb8 ufBdTerHo7YiIb8 = this.JY5knQmh7EQJEZ;
        if (num == null) {
            return lT14RDm4I5i5K8RS.S1zP5M3X7Ukq3ROlZ87G9I(ufBdTerHo7YiIb8, w0uwegyt374wmbsb, new Integer(w0uwegyt374wmbsb.PoRwkUUfcmwTiLMm & (-257)), null, null, bmjzfecsuu6mdmsoqmyrlysv3oeeb, 26);
        }
        if ((num.intValue() & (-320)) == 0) {
            return lT14RDm4I5i5K8RS.S1zP5M3X7Ukq3ROlZ87G9I(ufBdTerHo7YiIb8, w0uwegyt374wmbsb, new Integer(((w0uwegyt374wmbsb.PoRwkUUfcmwTiLMm & (-320)) | num.intValue()) & (-257)), null, null, bmjzfecsuu6mdmsoqmyrlysv3oeeb, 26);
        }
        uuyTGGFjNDiF1SxHW.PQQPeCDD0JLCT3aLz("Trying to set non-widget-restore flags while handling finishing a restore");
        return null;
    }
}
