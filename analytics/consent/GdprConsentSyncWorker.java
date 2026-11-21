package bitpit.launcher.analytics.consent;

import android.content.Context;
import androidx.work.WorkerParameters;
import b.B02bFCC1FS8AcUyF87x5Z;
import b.E2HluTi6Lsu9qRqv;
import b.EBYB26okdpqSrWmlJdzTC;
import b.G71ctMPy0O3NI7eWB;
import b.Hnv6Te9rrTA0VqZMo;
import b.I5qoCfzcuaEfSU3Sc;
import b.JwrOIGTLGilsppbPhN0BUWHPZ;
import b.KJ6Q7IzQUqsXSkx;
import b.NyMLDspuxoUZ61buwnujXDamSM0VK;
import b.O9Vq0pSiHJp;
import b.QTUUDdYAQaBj;
import b.QqKrtVzRryf;
import b.UE7MkxgXYXfsH;
import b.Yk9naq2GMZmGlztGWdn6a;
import b.axnoyrnt66y61MO14ZZ2kbqxvs6Ss;
import b.bMjZFECsuU6MdmSOqmYrlYsV3oEeB;
import b.cdjHGKliASEP50WE;
import b.fCSqEnq8QKZ;
import b.iG3sZbbi1nuA8YAuTWsV8I6yCqK;
import b.jf7TVgShkZMlAcs6Yp6jLfXQ;
import b.k3JpupUDYSJeXaJfHsv3zWuMS5X;
import b.mHW63SUma8isGb;
import b.qSDYaDqxbBy2QEeVAcFRy;
import b.qnbOXwz5xUaA;
import b.sRgu8ykgdYOnT49j1bPuQWmquU;
import b.tIDTjdoK38;
import b.uuyTGGFjNDiF1SxHW;
import b.vExJyE6LRl;
import b.xNthAUu9aBYOvIzNXbI;
import bitpit.launcher.backend.analytics.consent.model.AnalyticsConsent;
import bitpit.launcher.core.LauncherWorker;
import bitpit.launcher.util.exception.ClientIsOutdatedException;
import bitpit.launcher.util.exception.HttpException;
import bitpit.launcher.util.exception.ParseServerResponseException;
import bitpit.launcher.util.exception.ServerConnectionException;
import bitpit.launcher.util.exception.ServerUnreachableException;

/* JADX INFO: loaded from: classes.dex */
public final class GdprConsentSyncWorker extends LauncherWorker {
    public static final fCSqEnq8QKZ Companion = new fCSqEnq8QKZ();
    public final mHW63SUma8isGb Mej0x2K4ZGSUxtYNka4QZ;
    public final mHW63SUma8isGb qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
    public final mHW63SUma8isGb sCPtafveBAhdLIs2ajN3WV;

    public GdprConsentSyncWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new Yk9naq2GMZmGlztGWdn6a(this, 28));
        this.sCPtafveBAhdLIs2ajN3WV = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new QqKrtVzRryf(this));
        this.Mej0x2K4ZGSUxtYNka4QZ = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new iG3sZbbi1nuA8YAuTWsV8I6yCqK(this, 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    @Override // bitpit.launcher.core.LauncherWorker
    public final Object ziNFA7KzVfc6(bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) {
        vExJyE6LRl vexjye6lrl;
        int i;
        int i2;
        jf7TVgShkZMlAcs6Yp6jLfXQ jf7tvgshkzmlacs6yp6jlfxq;
        WorkerParameters workerParameters = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
        int i3 = workerParameters.BezslBgjveK3hODH;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof vExJyE6LRl) {
            vexjye6lrl = (vExJyE6LRl) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i4 = vexjye6lrl.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                vexjye6lrl.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = i4 - Integer.MIN_VALUE;
            } else {
                vexjye6lrl = new vExJyE6LRl(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            vexjye6lrl = new vExJyE6LRl(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        Object obj = vexjye6lrl.gsHzEVTj1SCIPR;
        int i5 = vexjye6lrl.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
        try {
            if (i5 == 0) {
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
                try {
                    axnoyrnt66y61MO14ZZ2kbqxvs6Ss axnoyrnt66y61mo14zz2kbqxvs6ss = jf7TVgShkZMlAcs6Yp6jLfXQ.Companion;
                    I5qoCfzcuaEfSU3Sc i5qoCfzcuaEfSU3Sc = workerParameters.axL8FocTDLUdzg0XScbO;
                    axnoyrnt66y61mo14zz2kbqxvs6ss.getClass();
                    jf7TVgShkZMlAcs6Yp6jLfXQ jf7tvgshkzmlacs6yp6jlfxqS1zP5M3X7Ukq3ROlZ87G9I = axnoyrnt66y61MO14ZZ2kbqxvs6Ss.S1zP5M3X7Ukq3ROlZ87G9I(i5qoCfzcuaEfSU3Sc);
                    String str = jf7tvgshkzmlacs6yp6jlfxqS1zP5M3X7Ukq3ROlZ87G9I.S1zP5M3X7Ukq3ROlZ87G9I;
                    boolean z = jf7tvgshkzmlacs6yp6jlfxqS1zP5M3X7Ukq3ROlZ87G9I.axL8FocTDLUdzg0XScbO;
                    boolean z2 = jf7tvgshkzmlacs6yp6jlfxqS1zP5M3X7Ukq3ROlZ87G9I.BezslBgjveK3hODH;
                    Boolean boolValueOf = Boolean.valueOf(jf7tvgshkzmlacs6yp6jlfxqS1zP5M3X7Ukq3ROlZ87G9I.ziNFA7KzVfc6);
                    mHW63SUma8isGb mhw63suma8isgb = this.sCPtafveBAhdLIs2ajN3WV;
                    int i6 = ((JwrOIGTLGilsppbPhN0BUWHPZ) mhw63suma8isgb.getValue()).WIXlfFpvH7glAGsUk3.cCmbv8Tzd2QLd161ImIZUlZ8n;
                    if (i6 == 1) {
                        i = 1;
                    } else {
                        if (i6 != 2) {
                            throw null;
                        }
                        i = 2;
                    }
                    int i7 = ((JwrOIGTLGilsppbPhN0BUWHPZ) mhw63suma8isgb.getValue()).WIXlfFpvH7glAGsUk3.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
                    if (i7 == 1) {
                        i2 = 1;
                    } else {
                        if (i7 != 2) {
                            throw null;
                        }
                        i2 = 2;
                    }
                    AnalyticsConsent analyticsConsent = new AnalyticsConsent(str, z, z2, boolValueOf, i, i2);
                    mHW63SUma8isGb mhw63suma8isgb2 = this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
                    UE7MkxgXYXfsH uE7MkxgXYXfsH = (UE7MkxgXYXfsH) mhw63suma8isgb2.getValue();
                    QTUUDdYAQaBj qTUUDdYAQaBj = new QTUUDdYAQaBj();
                    sRgu8ykgdYOnT49j1bPuQWmquU.axL8FocTDLUdzg0XScbO(qTUUDdYAQaBj, false);
                    qTUUDdYAQaBj.S1zP5M3X7Ukq3ROlZ87G9I("analytics-consent");
                    xNthAUu9aBYOvIzNXbI xnthauu9abyoviznxbiAxL8FocTDLUdzg0XScbO = UE7MkxgXYXfsH.axL8FocTDLUdzg0XScbO(uE7MkxgXYXfsH, qTUUDdYAQaBj.BezslBgjveK3hODH(), analyticsConsent, AnalyticsConsent.Companion.serializer(), null, jf7tvgshkzmlacs6yp6jlfxqS1zP5M3X7Ukq3ROlZ87G9I.S1zP5M3X7Ukq3ROlZ87G9I, 8);
                    O9Vq0pSiHJp o9Vq0pSiHJp = cdjHGKliASEP50WE.S1zP5M3X7Ukq3ROlZ87G9I;
                    o9Vq0pSiHJp.fXBtMGfTIjGSHgK542("GdprConsentSync");
                    o9Vq0pSiHJp.S1zP5M3X7Ukq3ROlZ87G9I("Requesting consent sync with " + analyticsConsent, new Object[0]);
                    UE7MkxgXYXfsH.S1zP5M3X7Ukq3ROlZ87G9I((UE7MkxgXYXfsH) mhw63suma8isgb2.getValue(), xnthauu9abyoviznxbiAxL8FocTDLUdzg0XScbO, new NyMLDspuxoUZ61buwnujXDamSM0VK(15));
                    o9Vq0pSiHJp.fXBtMGfTIjGSHgK542("GdprConsentSync");
                    o9Vq0pSiHJp.S1zP5M3X7Ukq3ROlZ87G9I("Consent sync request succeeded", new Object[0]);
                    qnbOXwz5xUaA qnboxwz5xuaa = (qnbOXwz5xUaA) this.Mej0x2K4ZGSUxtYNka4QZ.getValue();
                    String str2 = jf7tvgshkzmlacs6yp6jlfxqS1zP5M3X7Ukq3ROlZ87G9I.S1zP5M3X7Ukq3ROlZ87G9I;
                    boolean z3 = jf7tvgshkzmlacs6yp6jlfxqS1zP5M3X7Ukq3ROlZ87G9I.BezslBgjveK3hODH;
                    vexjye6lrl.WIXlfFpvH7glAGsUk3 = jf7tvgshkzmlacs6yp6jlfxqS1zP5M3X7Ukq3ROlZ87G9I;
                    vexjye6lrl.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = 1;
                    Object objS1zP5M3X7Ukq3ROlZ87G9I = qnboxwz5xuaa.S1zP5M3X7Ukq3ROlZ87G9I(str2, z3, vexjye6lrl);
                    tIDTjdoK38 tidtjdok38 = tIDTjdoK38.GO8WUug7ZWFCUI1zY;
                    if (objS1zP5M3X7Ukq3ROlZ87G9I == tidtjdok38) {
                        return tidtjdok38;
                    }
                    jf7tvgshkzmlacs6yp6jlfxq = jf7tvgshkzmlacs6yp6jlfxqS1zP5M3X7Ukq3ROlZ87G9I;
                } catch (IllegalArgumentException unused) {
                    O9Vq0pSiHJp o9Vq0pSiHJp2 = cdjHGKliASEP50WE.S1zP5M3X7Ukq3ROlZ87G9I;
                    o9Vq0pSiHJp2.fXBtMGfTIjGSHgK542("GdprConsentSync");
                    o9Vq0pSiHJp2.ziNFA7KzVfc6("Persist consent work received invalid input", new Object[0]);
                    B02bFCC1FS8AcUyF87x5Z[] b02bFCC1FS8AcUyF87x5ZArr = {new B02bFCC1FS8AcUyF87x5Z("out_failure_reason", "invalid_input"), new B02bFCC1FS8AcUyF87x5Z("out_run_attempt_count", Integer.valueOf(i3))};
                    KJ6Q7IzQUqsXSkx kJ6Q7IzQUqsXSkx = new KJ6Q7IzQUqsXSkx(0);
                    for (int i8 = 0; i8 < 2; i8++) {
                        B02bFCC1FS8AcUyF87x5Z b02bFCC1FS8AcUyF87x5Z = b02bFCC1FS8AcUyF87x5ZArr[i8];
                        kJ6Q7IzQUqsXSkx.axL8FocTDLUdzg0XScbO((String) b02bFCC1FS8AcUyF87x5Z.GO8WUug7ZWFCUI1zY, b02bFCC1FS8AcUyF87x5Z.Rdzg08aYlt0UsoLUNug9cESzgAY9R);
                    }
                    return new k3JpupUDYSJeXaJfHsv3zWuMS5X(kJ6Q7IzQUqsXSkx.S1zP5M3X7Ukq3ROlZ87G9I());
                }
            } else {
                if (i5 != 1) {
                    uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jf7tvgshkzmlacs6yp6jlfxq = vexjye6lrl.WIXlfFpvH7glAGsUk3;
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
            }
            B02bFCC1FS8AcUyF87x5Z[] b02bFCC1FS8AcUyF87x5ZArr2 = {new B02bFCC1FS8AcUyF87x5Z("out_session_user_id", jf7tvgshkzmlacs6yp6jlfxq.S1zP5M3X7Ukq3ROlZ87G9I), new B02bFCC1FS8AcUyF87x5Z("out_consent_given", Boolean.valueOf(jf7tvgshkzmlacs6yp6jlfxq.BezslBgjveK3hODH)), new B02bFCC1FS8AcUyF87x5Z("out_marketing_consent_given", Boolean.valueOf(jf7tvgshkzmlacs6yp6jlfxq.ziNFA7KzVfc6))};
            KJ6Q7IzQUqsXSkx kJ6Q7IzQUqsXSkx2 = new KJ6Q7IzQUqsXSkx(0);
            for (int i9 = 0; i9 < 3; i9++) {
                B02bFCC1FS8AcUyF87x5Z b02bFCC1FS8AcUyF87x5Z2 = b02bFCC1FS8AcUyF87x5ZArr2[i9];
                kJ6Q7IzQUqsXSkx2.axL8FocTDLUdzg0XScbO((String) b02bFCC1FS8AcUyF87x5Z2.GO8WUug7ZWFCUI1zY, b02bFCC1FS8AcUyF87x5Z2.Rdzg08aYlt0UsoLUNug9cESzgAY9R);
            }
            return new E2HluTi6Lsu9qRqv(kJ6Q7IzQUqsXSkx2.S1zP5M3X7Ukq3ROlZ87G9I());
        } catch (ServerConnectionException e) {
            O9Vq0pSiHJp o9Vq0pSiHJp3 = cdjHGKliASEP50WE.S1zP5M3X7Ukq3ROlZ87G9I;
            o9Vq0pSiHJp3.fXBtMGfTIjGSHgK542("GdprConsentSync");
            o9Vq0pSiHJp3.axL8FocTDLUdzg0XScbO(e);
            if ((e instanceof ClientIsOutdatedException) || (e instanceof ServerUnreachableException)) {
                return new EBYB26okdpqSrWmlJdzTC();
            }
            if (e instanceof HttpException) {
                o9Vq0pSiHJp3.fXBtMGfTIjGSHgK542("GdprConsentSync");
                o9Vq0pSiHJp3.ziNFA7KzVfc6(G71ctMPy0O3NI7eWB.Aboow6rUrcY2SrFRa46C6uy(((HttpException) e).GO8WUug7ZWFCUI1zY, i3, "HTTP ", " on attempt "), new Object[0]);
                return new EBYB26okdpqSrWmlJdzTC();
            }
            if (e instanceof ParseServerResponseException) {
                return new EBYB26okdpqSrWmlJdzTC();
            }
            B02bFCC1FS8AcUyF87x5Z[] b02bFCC1FS8AcUyF87x5ZArr3 = {new B02bFCC1FS8AcUyF87x5Z("out_failure_reason", "unexpected"), new B02bFCC1FS8AcUyF87x5Z("out_run_attempt_count", Integer.valueOf(i3))};
            KJ6Q7IzQUqsXSkx kJ6Q7IzQUqsXSkx3 = new KJ6Q7IzQUqsXSkx(0);
            for (int i10 = 0; i10 < 2; i10++) {
                B02bFCC1FS8AcUyF87x5Z b02bFCC1FS8AcUyF87x5Z3 = b02bFCC1FS8AcUyF87x5ZArr3[i10];
                kJ6Q7IzQUqsXSkx3.axL8FocTDLUdzg0XScbO((String) b02bFCC1FS8AcUyF87x5Z3.GO8WUug7ZWFCUI1zY, b02bFCC1FS8AcUyF87x5Z3.Rdzg08aYlt0UsoLUNug9cESzgAY9R);
            }
            return new k3JpupUDYSJeXaJfHsv3zWuMS5X(kJ6Q7IzQUqsXSkx3.S1zP5M3X7Ukq3ROlZ87G9I());
        }
    }
}
