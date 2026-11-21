package bitpit.launcher.analytics.singular;

import android.content.Context;
import androidx.work.WorkerParameters;
import b.iG3sZbbi1nuA8YAuTWsV8I6yCqK;
import b.mHW63SUma8isGb;
import b.qSDYaDqxbBy2QEeVAcFRy;
import bitpit.launcher.core.LauncherWorker;

/* JADX INFO: loaded from: classes.dex */
public final class SingularFirstSessionReportWorker extends LauncherWorker {
    public final mHW63SUma8isGb qaDSpeex0Oo1Qvt3oOrTJnbcQFp;

    public SingularFirstSessionReportWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new iG3sZbbi1nuA8YAuTWsV8I6yCqK(this, 27));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (r5.BezslBgjveK3hODH(r0) == r4) goto L24;
     */
    @Override // bitpit.launcher.core.LauncherWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object ziNFA7KzVfc6(b.bMjZFECsuU6MdmSOqmYrlYsV3oEeB r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof b.sDEKcIc6Pxx9
            if (r0 == 0) goto L13
            r0 = r6
            b.sDEKcIc6Pxx9 r0 = (b.sDEKcIc6Pxx9) r0
            int r1 = r0.LcvPFGYKhAm4SS5FZ
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.LcvPFGYKhAm4SS5FZ = r1
            goto L18
        L13:
            b.sDEKcIc6Pxx9 r0 = new b.sDEKcIc6Pxx9
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.WIXlfFpvH7glAGsUk3
            int r1 = r0.LcvPFGYKhAm4SS5FZ
            b.mHW63SUma8isGb r5 = r5.qaDSpeex0Oo1Qvt3oOrTJnbcQFp
            r2 = 2
            r3 = 1
            b.tIDTjdoK38 r4 = b.tIDTjdoK38.GO8WUug7ZWFCUI1zY
            if (r1 == 0) goto L37
            if (r1 == r3) goto L33
            if (r1 != r2) goto L2c
            b.Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(r6)     // Catch: java.lang.Exception -> L5d bitpit.launcher.util.exception.HttpException -> L5f
            goto L58
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            b.uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG(r5)
            r5 = 0
            return r5
        L33:
            b.Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(r6)     // Catch: java.lang.Exception -> L5d bitpit.launcher.util.exception.HttpException -> L5f
            goto L49
        L37:
            b.Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(r6)
            java.lang.Object r6 = r5.getValue()     // Catch: java.lang.Exception -> L5d bitpit.launcher.util.exception.HttpException -> L5f
            b.rhAMfyhU6VaCyaMxtOo0dHjZLi r6 = (b.rhAMfyhU6VaCyaMxtOo0dHjZLi) r6     // Catch: java.lang.Exception -> L5d bitpit.launcher.util.exception.HttpException -> L5f
            r0.LcvPFGYKhAm4SS5FZ = r3     // Catch: java.lang.Exception -> L5d bitpit.launcher.util.exception.HttpException -> L5f
            java.lang.Object r6 = r6.ox9eclwMpRd(r3, r0)     // Catch: java.lang.Exception -> L5d bitpit.launcher.util.exception.HttpException -> L5f
            if (r6 != r4) goto L49
            goto L57
        L49:
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Exception -> L5d bitpit.launcher.util.exception.HttpException -> L5f
            b.rhAMfyhU6VaCyaMxtOo0dHjZLi r5 = (b.rhAMfyhU6VaCyaMxtOo0dHjZLi) r5     // Catch: java.lang.Exception -> L5d bitpit.launcher.util.exception.HttpException -> L5f
            r0.LcvPFGYKhAm4SS5FZ = r2     // Catch: java.lang.Exception -> L5d bitpit.launcher.util.exception.HttpException -> L5f
            java.lang.Object r5 = r5.BezslBgjveK3hODH(r0)     // Catch: java.lang.Exception -> L5d bitpit.launcher.util.exception.HttpException -> L5f
            if (r5 != r4) goto L58
        L57:
            return r4
        L58:
            b.E2HluTi6Lsu9qRqv r5 = b.pTutVDnWF0imMrA9g.S1zP5M3X7Ukq3ROlZ87G9I()     // Catch: java.lang.Exception -> L5d bitpit.launcher.util.exception.HttpException -> L5f
            return r5
        L5d:
            r5 = move-exception
            goto L61
        L5f:
            r5 = move-exception
            goto L6a
        L61:
            b.Emi5d0VyYZLZtm.Aboow6rUrcY2SrFRa46C6uy(r5)
            b.EBYB26okdpqSrWmlJdzTC r5 = new b.EBYB26okdpqSrWmlJdzTC
            r5.<init>()
            goto L7e
        L6a:
            int r6 = r5.GO8WUug7ZWFCUI1zY
            r0 = 500(0x1f4, float:7.0E-43)
            if (r6 < r0) goto L76
            b.EBYB26okdpqSrWmlJdzTC r5 = new b.EBYB26okdpqSrWmlJdzTC
            r5.<init>()
            goto L7e
        L76:
            b.Emi5d0VyYZLZtm.Aboow6rUrcY2SrFRa46C6uy(r5)
            b.k3JpupUDYSJeXaJfHsv3zWuMS5X r5 = new b.k3JpupUDYSJeXaJfHsv3zWuMS5X
            r5.<init>()
        L7e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bitpit.launcher.analytics.singular.SingularFirstSessionReportWorker.ziNFA7KzVfc6(b.bMjZFECsuU6MdmSOqmYrlYsV3oEeB):java.lang.Object");
    }
}
