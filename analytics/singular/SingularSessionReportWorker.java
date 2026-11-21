package bitpit.launcher.analytics.singular;

import android.content.Context;
import androidx.work.WorkerParameters;
import b.iG3sZbbi1nuA8YAuTWsV8I6yCqK;
import b.mHW63SUma8isGb;
import b.qSDYaDqxbBy2QEeVAcFRy;
import bitpit.launcher.core.LauncherWorker;

/* JADX INFO: loaded from: classes.dex */
public final class SingularSessionReportWorker extends LauncherWorker {
    public final mHW63SUma8isGb qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
    public final mHW63SUma8isGb sCPtafveBAhdLIs2ajN3WV;

    public SingularSessionReportWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new iG3sZbbi1nuA8YAuTWsV8I6yCqK(this, 28));
        this.sCPtafveBAhdLIs2ajN3WV = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new iG3sZbbi1nuA8YAuTWsV8I6yCqK(this, 29));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (((b.lGu4hbqDeY14JtrULY2Bza9Y) r5).Aboow6rUrcY2SrFRa46C6uy(b.zvrDNoSsQjNXqoxr.SNG_DAILY_SESSION_REPORT, r0) == r4) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if (r5.ox9eclwMpRd(false, r0) == r4) goto L26;
     */
    @Override // bitpit.launcher.core.LauncherWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object ziNFA7KzVfc6(b.bMjZFECsuU6MdmSOqmYrlYsV3oEeB r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof b.iiHTgRFziHa2c
            if (r0 == 0) goto L13
            r0 = r6
            b.iiHTgRFziHa2c r0 = (b.iiHTgRFziHa2c) r0
            int r1 = r0.LcvPFGYKhAm4SS5FZ
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.LcvPFGYKhAm4SS5FZ = r1
            goto L18
        L13:
            b.iiHTgRFziHa2c r0 = new b.iiHTgRFziHa2c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.WIXlfFpvH7glAGsUk3
            int r1 = r0.LcvPFGYKhAm4SS5FZ
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 == r3) goto L2f
            if (r1 != r2) goto L28
            b.Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(r6)     // Catch: java.lang.Exception -> L79 bitpit.launcher.util.exception.HttpException -> L7b
            goto L74
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            b.uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG(r5)
            r5 = 0
            return r5
        L2f:
            b.Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(r6)
            b.J7Tsg1eqTfbK8vIo4RFOyjPiu r6 = (b.J7Tsg1eqTfbK8vIo4RFOyjPiu) r6
            java.lang.Object r5 = r6.S1zP5M3X7Ukq3ROlZ87G9I
            goto L5f
        L37:
            b.Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(r6)
            b.mHW63SUma8isGb r6 = r5.sCPtafveBAhdLIs2ajN3WV
            java.lang.Object r1 = r6.getValue()
            b.rhAMfyhU6VaCyaMxtOo0dHjZLi r1 = (b.rhAMfyhU6VaCyaMxtOo0dHjZLi) r1
            boolean r1 = r1.axL8FocTDLUdzg0XScbO()
            b.tIDTjdoK38 r4 = b.tIDTjdoK38.GO8WUug7ZWFCUI1zY
            if (r1 != 0) goto L64
            b.mHW63SUma8isGb r5 = r5.qaDSpeex0Oo1Qvt3oOrTJnbcQFp
            java.lang.Object r5 = r5.getValue()
            b.O6lZlYscUJqRKM r5 = (b.O6lZlYscUJqRKM) r5
            r0.LcvPFGYKhAm4SS5FZ = r3
            b.lGu4hbqDeY14JtrULY2Bza9Y r5 = (b.lGu4hbqDeY14JtrULY2Bza9Y) r5
            b.zvrDNoSsQjNXqoxr r6 = b.zvrDNoSsQjNXqoxr.SNG_DAILY_SESSION_REPORT
            java.lang.Object r5 = r5.Aboow6rUrcY2SrFRa46C6uy(r6, r0)
            if (r5 != r4) goto L5f
            goto L73
        L5f:
            b.E2HluTi6Lsu9qRqv r5 = b.pTutVDnWF0imMrA9g.S1zP5M3X7Ukq3ROlZ87G9I()
            return r5
        L64:
            java.lang.Object r5 = r6.getValue()     // Catch: java.lang.Exception -> L79 bitpit.launcher.util.exception.HttpException -> L7b
            b.rhAMfyhU6VaCyaMxtOo0dHjZLi r5 = (b.rhAMfyhU6VaCyaMxtOo0dHjZLi) r5     // Catch: java.lang.Exception -> L79 bitpit.launcher.util.exception.HttpException -> L7b
            r0.LcvPFGYKhAm4SS5FZ = r2     // Catch: java.lang.Exception -> L79 bitpit.launcher.util.exception.HttpException -> L7b
            r6 = 0
            java.lang.Object r5 = r5.ox9eclwMpRd(r6, r0)     // Catch: java.lang.Exception -> L79 bitpit.launcher.util.exception.HttpException -> L7b
            if (r5 != r4) goto L74
        L73:
            return r4
        L74:
            b.E2HluTi6Lsu9qRqv r5 = b.pTutVDnWF0imMrA9g.S1zP5M3X7Ukq3ROlZ87G9I()     // Catch: java.lang.Exception -> L79 bitpit.launcher.util.exception.HttpException -> L7b
            return r5
        L79:
            r5 = move-exception
            goto L7d
        L7b:
            r5 = move-exception
            goto L86
        L7d:
            b.Emi5d0VyYZLZtm.Aboow6rUrcY2SrFRa46C6uy(r5)
            b.EBYB26okdpqSrWmlJdzTC r5 = new b.EBYB26okdpqSrWmlJdzTC
            r5.<init>()
            goto L9a
        L86:
            int r6 = r5.GO8WUug7ZWFCUI1zY
            r0 = 500(0x1f4, float:7.0E-43)
            if (r6 < r0) goto L92
            b.EBYB26okdpqSrWmlJdzTC r5 = new b.EBYB26okdpqSrWmlJdzTC
            r5.<init>()
            goto L9a
        L92:
            b.Emi5d0VyYZLZtm.Aboow6rUrcY2SrFRa46C6uy(r5)
            b.k3JpupUDYSJeXaJfHsv3zWuMS5X r5 = new b.k3JpupUDYSJeXaJfHsv3zWuMS5X
            r5.<init>()
        L9a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bitpit.launcher.analytics.singular.SingularSessionReportWorker.ziNFA7KzVfc6(b.bMjZFECsuU6MdmSOqmYrlYsV3oEeB):java.lang.Object");
    }
}
