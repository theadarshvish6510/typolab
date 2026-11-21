package bitpit.launcher.analytics.singular;

import android.content.Context;
import android.os.Bundle;
import androidx.work.WorkerParameters;
import b.B02bFCC1FS8AcUyF87x5Z;
import b.B4VuABB1m6ytu26MxoUBytPiQ;
import b.EBYB26okdpqSrWmlJdzTC;
import b.Emi5d0VyYZLZtm;
import b.GsmfcDlEOKdXJqNx4;
import b.HDzaRKEI4SxljA;
import b.Hnv6Te9rrTA0VqZMo;
import b.I5qoCfzcuaEfSU3Sc;
import b.LpRXf8zsxndinAW3;
import b.SCo4Ctd3zv2DHfczdi;
import b.WLZoEbRHGAYGtOeo6ZMxoLT9;
import b.Zo1YEZ6nT2Qsm9uBmmbXR;
import b.aJLiMmqfPh61r;
import b.bMjZFECsuU6MdmSOqmYrlYsV3oEeB;
import b.c71fwiAqHElhZapuFqyYb;
import b.cdjHGKliASEP50WE;
import b.gD2rKVU295TtHvegz;
import b.iG3sZbbi1nuA8YAuTWsV8I6yCqK;
import b.mHW63SUma8isGb;
import b.otD5bQR0LtT;
import b.pTutVDnWF0imMrA9g;
import b.qSDYaDqxbBy2QEeVAcFRy;
import b.rhAMfyhU6VaCyaMxtOo0dHjZLi;
import b.tIDTjdoK38;
import b.uuyTGGFjNDiF1SxHW;
import b.vJUYkbvHLXpeeF8N2X3A7dh;
import bitpit.launcher.backend.analytics.singular.model.SingularEventParameters;
import bitpit.launcher.core.LauncherWorker;
import bitpit.launcher.util.exception.HttpException;
import bitpit.launcher.util.exception.ServerConnectionException;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class SingularEventReportWorker extends LauncherWorker {
    public static final c71fwiAqHElhZapuFqyYb Companion;
    public static final long Mej0x2K4ZGSUxtYNka4QZ;
    public static final Set qTa7aqjjB9Bt6mc;
    public static final mHW63SUma8isGb sCPtafveBAhdLIs2ajN3WV;
    public final mHW63SUma8isGb qaDSpeex0Oo1Qvt3oOrTJnbcQFp;

    static {
        c71fwiAqHElhZapuFqyYb c71fwiaqhelhzapufqyyb = new c71fwiAqHElhZapuFqyYb();
        Companion = c71fwiaqhelhzapufqyyb;
        sCPtafveBAhdLIs2ajN3WV = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new iG3sZbbi1nuA8YAuTWsV8I6yCqK(c71fwiaqhelhzapufqyyb, 26));
        HDzaRKEI4SxljA hDzaRKEI4SxljA = Zo1YEZ6nT2Qsm9uBmmbXR.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
        Mej0x2K4ZGSUxtYNka4QZ = WLZoEbRHGAYGtOeo6ZMxoLT9.JY5knQmh7EQJEZ(30, SCo4Ctd3zv2DHfczdi.DAYS);
        qTa7aqjjB9Bt6mc = gD2rKVU295TtHvegz.Mej0x2K4ZGSUxtYNka4QZ(new Integer[]{408, 429});
    }

    public SingularEventReportWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new iG3sZbbi1nuA8YAuTWsV8I6yCqK(this, 25));
    }

    public final void Aboow6rUrcY2SrFRa46C6uy(SingularEventParameters singularEventParameters, int i) {
        String str;
        B4VuABB1m6ytu26MxoUBytPiQ b4VuABB1m6ytu26MxoUBytPiQ = otD5bQR0LtT.Companion;
        if (i == 1) {
            str = "expired";
        } else {
            if (i != 2) {
                throw null;
            }
            str = "client_error";
        }
        Bundle bundleS1zP5M3X7Ukq3ROlZ87G9I = GsmfcDlEOKdXJqNx4.S1zP5M3X7Ukq3ROlZ87G9I(new B02bFCC1FS8AcUyF87x5Z("outcome", str), new B02bFCC1FS8AcUyF87x5Z("detail", singularEventParameters.S1zP5M3X7Ukq3ROlZ87G9I), new B02bFCC1FS8AcUyF87x5Z("attempts", Integer.valueOf(this.Rdzg08aYlt0UsoLUNug9cESzgAY9R.BezslBgjveK3hODH + 1)));
        b4VuABB1m6ytu26MxoUBytPiQ.getClass();
        B4VuABB1m6ytu26MxoUBytPiQ.S1zP5M3X7Ukq3ROlZ87G9I(bundleS1zP5M3X7Ukq3ROlZ87G9I, "sng_event_dropped");
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:58:0x0107  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // bitpit.launcher.core.LauncherWorker
    public final Object ziNFA7KzVfc6(bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) throws Throwable {
        vJUYkbvHLXpeeF8N2X3A7dh vjuykbvhlxpeef8n2x3a7dh;
        SingularEventParameters singularEventParameters;
        HttpException e;
        int i;
        WorkerParameters workerParameters = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
        I5qoCfzcuaEfSU3Sc i5qoCfzcuaEfSU3Sc = workerParameters.axL8FocTDLUdzg0XScbO;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof vJUYkbvHLXpeeF8N2X3A7dh) {
            vjuykbvhlxpeef8n2x3a7dh = (vJUYkbvHLXpeeF8N2X3A7dh) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i2 = vjuykbvhlxpeef8n2x3a7dh.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vjuykbvhlxpeef8n2x3a7dh.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = i2 - Integer.MIN_VALUE;
            } else {
                vjuykbvhlxpeef8n2x3a7dh = new vJUYkbvHLXpeeF8N2X3A7dh(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            vjuykbvhlxpeef8n2x3a7dh = new vJUYkbvHLXpeeF8N2X3A7dh(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        Object obj = vjuykbvhlxpeef8n2x3a7dh.gsHzEVTj1SCIPR;
        int i3 = vjuykbvhlxpeef8n2x3a7dh.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
        try {
            if (i3 == 0) {
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
                try {
                    Object obj2 = i5qoCfzcuaEfSU3Sc.S1zP5M3X7Ukq3ROlZ87G9I.get("event");
                    String str = obj2 instanceof String ? (String) obj2 : null;
                    if (str == null) {
                        throw new IllegalArgumentException("Input has no event");
                    }
                    Companion.getClass();
                    SingularEventParameters singularEventParameters2 = (SingularEventParameters) ((LpRXf8zsxndinAW3) sCPtafveBAhdLIs2ajN3WV.getValue()).S1zP5M3X7Ukq3ROlZ87G9I(str, SingularEventParameters.Companion.serializer());
                    Object obj3 = i5qoCfzcuaEfSU3Sc.S1zP5M3X7Ukq3ROlZ87G9I.get("enqueued_at");
                    long jLongValue = ((Number) (obj3 instanceof Long ? obj3 : -1L)).longValue();
                    if (jLongValue < 0) {
                        throw new IllegalArgumentException("Input has no enqueue timestamp");
                    }
                    if (System.currentTimeMillis() - jLongValue > Zo1YEZ6nT2Qsm9uBmmbXR.PQQPeCDD0JLCT3aLz(Mej0x2K4ZGSUxtYNka4QZ)) {
                        cdjHGKliASEP50WE.S1zP5M3X7Ukq3ROlZ87G9I.flPMk2Ix9h3b95v(aJLiMmqfPh61r.LYcdI4xpry8eXmFC9I4wyaLdcG1z("Dropping expired event ", singularEventParameters2.S1zP5M3X7Ukq3ROlZ87G9I), new Object[0]);
                        Aboow6rUrcY2SrFRa46C6uy(singularEventParameters2, 1);
                        return pTutVDnWF0imMrA9g.S1zP5M3X7Ukq3ROlZ87G9I();
                    }
                    try {
                        rhAMfyhU6VaCyaMxtOo0dHjZLi rhamfyhu6vacyamxtoo0dhjzli = (rhAMfyhU6VaCyaMxtOo0dHjZLi) this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp.getValue();
                        vjuykbvhlxpeef8n2x3a7dh.WIXlfFpvH7glAGsUk3 = singularEventParameters2;
                        vjuykbvhlxpeef8n2x3a7dh.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = 1;
                        Object objZiNFA7KzVfc6 = rhamfyhu6vacyamxtoo0dhjzli.ziNFA7KzVfc6(singularEventParameters2, vjuykbvhlxpeef8n2x3a7dh);
                        tIDTjdoK38 tidtjdok38 = tIDTjdoK38.GO8WUug7ZWFCUI1zY;
                        if (objZiNFA7KzVfc6 == tidtjdok38) {
                            return tidtjdok38;
                        }
                        singularEventParameters = singularEventParameters2;
                    } catch (HttpException e2) {
                        singularEventParameters = singularEventParameters2;
                        e = e2;
                        i = e.GO8WUug7ZWFCUI1zY;
                        if (i < 500) {
                            if (!qTa7aqjjB9Bt6mc.contains(new Integer(i))) {
                                Emi5d0VyYZLZtm.Aboow6rUrcY2SrFRa46C6uy(e);
                                Aboow6rUrcY2SrFRa46C6uy(singularEventParameters, 2);
                                return pTutVDnWF0imMrA9g.S1zP5M3X7Ukq3ROlZ87G9I();
                            }
                        }
                        cdjHGKliASEP50WE.S1zP5M3X7Ukq3ROlZ87G9I.LYcdI4xpry8eXmFC9I4wyaLdcG1z(e);
                        return new EBYB26okdpqSrWmlJdzTC();
                    }
                } catch (IllegalArgumentException e3) {
                    Emi5d0VyYZLZtm.Aboow6rUrcY2SrFRa46C6uy(e3);
                    return pTutVDnWF0imMrA9g.S1zP5M3X7Ukq3ROlZ87G9I();
                }
            } else {
                if (i3 != 1) {
                    uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                singularEventParameters = vjuykbvhlxpeef8n2x3a7dh.WIXlfFpvH7glAGsUk3;
                try {
                    Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
                } catch (HttpException e4) {
                    e = e4;
                    i = e.GO8WUug7ZWFCUI1zY;
                    if (i < 500) {
                        if (!qTa7aqjjB9Bt6mc.contains(new Integer(i))) {
                            Emi5d0VyYZLZtm.Aboow6rUrcY2SrFRa46C6uy(e);
                            Aboow6rUrcY2SrFRa46C6uy(singularEventParameters, 2);
                            return pTutVDnWF0imMrA9g.S1zP5M3X7Ukq3ROlZ87G9I();
                        }
                    }
                    cdjHGKliASEP50WE.S1zP5M3X7Ukq3ROlZ87G9I.LYcdI4xpry8eXmFC9I4wyaLdcG1z(e);
                    return new EBYB26okdpqSrWmlJdzTC();
                }
            }
            return pTutVDnWF0imMrA9g.S1zP5M3X7Ukq3ROlZ87G9I();
        } catch (ServerConnectionException e5) {
            cdjHGKliASEP50WE.S1zP5M3X7Ukq3ROlZ87G9I.LYcdI4xpry8eXmFC9I4wyaLdcG1z(e5);
            return new EBYB26okdpqSrWmlJdzTC();
        } catch (CancellationException unused) {
            return new EBYB26okdpqSrWmlJdzTC();
        } catch (Exception e6) {
            if (workerParameters.BezslBgjveK3hODH == 0) {
                Emi5d0VyYZLZtm.Aboow6rUrcY2SrFRa46C6uy(e6);
            } else {
                cdjHGKliASEP50WE.S1zP5M3X7Ukq3ROlZ87G9I.LYcdI4xpry8eXmFC9I4wyaLdcG1z(e6);
            }
            return new EBYB26okdpqSrWmlJdzTC();
        }
    }
}
