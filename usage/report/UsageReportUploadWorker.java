package bitpit.launcher.usage.report;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import androidx.work.WorkerParameters;
import b.AJBhDJgkMCa;
import b.AeQuqug4cjWl3vY5CUaNGtJ0l;
import b.BwvZOBiCEIFJtYnaz097d;
import b.CTid586a2W9uiqX3Zqsu;
import b.EaKSYhhqmDVGL;
import b.Emi5d0VyYZLZtm;
import b.GZnU2p3i2qStYb;
import b.HF5afwOkFj9V8;
import b.Hnv6Te9rrTA0VqZMo;
import b.IyJ5Qc4DxtDd1Zs;
import b.J7Tsg1eqTfbK8vIo4RFOyjPiu;
import b.JHbD5ZdLzavjhaIS0;
import b.JHnppaRJDZMMWaOU5cgIw;
import b.JTgp3EtWPwqBZ;
import b.KjpLK4IQzcoI;
import b.LLnhW2rxhI026DTfznKMKaPBh;
import b.MO8X3Df5DMAnakA6Of3Uxzy;
import b.Mrfemq5Sav3yOR731;
import b.NMquq9o0FvRs5RyiTFrS;
import b.NyMLDspuxoUZ61buwnujXDamSM0VK;
import b.OUw39KtIsdT3yYWqqOrKN6;
import b.OkhdZkC3NYLW;
import b.PeLieoBN4yxYJZju3kQtKIsq7XL8;
import b.PsxyR34EwEPK6iGSwfdc8qX0m;
import b.Q4FYfLImt1X;
import b.QTUUDdYAQaBj;
import b.RvhyPjquEfKeg2aqLeO7fm7;
import b.UE7MkxgXYXfsH;
import b.W6Cvbh5ibKri8VKtZx5qw;
import b.XE7YgBVDjBXkAAp;
import b.XQCixPMPkXDW6;
import b.XvGKjmlJpHb7zYfxX2mymFDx2M;
import b.Y74MyUCLMhd2zBD2Mw8M;
import b.YbhkWJ1zvclL;
import b.YwBUKqJjphOMW;
import b.Zo1YEZ6nT2Qsm9uBmmbXR;
import b.a9kWzoj6D3Yoa0;
import b.bMjZFECsuU6MdmSOqmYrlYsV3oEeB;
import b.c7SrswmGzM;
import b.c7wGsGbKcH1sEEIn2uNXXf3;
import b.cvu91h5WjQasu7vH8q4wQg9;
import b.eY0AEVFwD2fuPwFF4IzZ2WAQ78;
import b.fdnz7zsh9e;
import b.g72QTnntwDS9UTJ;
import b.gDorRusXxz4vI7fqTkfdRMN;
import b.gT4sTdpjS277wbG60pk72fHWG7;
import b.hwSYVZu6IevsK1z;
import b.i4R6OERALqwOeabhCa69f;
import b.kAffANyp2QybsMt;
import b.l2D8c8VIWWisH;
import b.m6VeYiMqnaBahF88nkY76Vf;
import b.mHW63SUma8isGb;
import b.mo4unDT7uci;
import b.oe96GFUATOa5;
import b.ogNIMHDmW40UC1xJL3PaVCbnHRx;
import b.oyNYA2tTXPYTjnSB;
import b.pijs62HGGnGxq0xD0cXq;
import b.ptgnZZCKaE4jZ;
import b.qEwqqDvm9wKfnhETPc16M;
import b.qSDYaDqxbBy2QEeVAcFRy;
import b.rHbvTwvrJMCknMWt2V;
import b.rbpFGdpgDCAQXat;
import b.rqAjigHBNnNXGk1aKUqlUvOLCOEc;
import b.s9XnN7QTAJ;
import b.sRgu8ykgdYOnT49j1bPuQWmquU;
import b.stzlAQBLXkK5;
import b.t371EfbQKhkqgzmeFM3wdztuQG6;
import b.t3o4R1jMAJ4bpO8Sdk1tyTzzQPE;
import b.tC3sgxzCZkUNJgjSQwq;
import b.tIDTjdoK38;
import b.uBuYBv2i9glqnEpN6eM75e1rnoqmf;
import b.uuyTGGFjNDiF1SxHW;
import b.v1H71pZfvCVU4;
import b.v6AbqsUKKmmrd2I;
import b.vN6oJjNAWOkYHUJX;
import b.w0U8PgpNFLkhFXGnjwC1GUzyF;
import b.w0uweGyT374wMBSB;
import b.wiJre1CnJq2BRBGVdP5;
import b.x4PcPRPmslEJW;
import b.xSr1hPBbWjW;
import b.z1jpZX9STmdA7rDJqTHkX09JG8;
import b.zaEQv9uah4s3bhwua8H;
import b.zhu5w6ruDywapzKgcV;
import b.zpNs6MUm6xEe4ualhXrHL;
import bitpit.launcher.backend.analytics.usage.model.UsageReport;
import bitpit.launcher.core.LauncherWorker;
import bitpit.launcher.notification.NotificationListener;
import bitpit.launcher.savesystem.Database;
import bitpit.launcher.util.exception.ServerConnectionException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class UsageReportUploadWorker extends LauncherWorker {
    public static final PsxyR34EwEPK6iGSwfdc8qX0m Companion;
    public static final /* synthetic */ GZnU2p3i2qStYb[] jvttfmFMQfShe6OfbNf1zF8CyEu;
    public final mHW63SUma8isGb FzogU2bPCQtD6a1hMYB1kyti;
    public final XQCixPMPkXDW6 IPi49brQACDpXJTJMp7;
    public final mHW63SUma8isGb J1BE9tYH1em4X1uAhc6L7f4M;
    public final mHW63SUma8isGb Mej0x2K4ZGSUxtYNka4QZ;
    public final mHW63SUma8isGb cVfIGUKLEqID1HH;
    public final mHW63SUma8isGb czGAefXQxIZzo;
    public final mHW63SUma8isGb f2sXlW3st0rAKJwyOrCfOWc;
    public final mHW63SUma8isGb iR1XUIc7FjhMl57O;
    public final mHW63SUma8isGb qTa7aqjjB9Bt6mc;
    public final mHW63SUma8isGb qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
    public final mHW63SUma8isGb sCPtafveBAhdLIs2ajN3WV;
    public final mHW63SUma8isGb tdNmBZIJHG1;
    public final mHW63SUma8isGb tzMOyOc53ffl;
    public final mHW63SUma8isGb yM5HHkk1MhPLZFYTHm2JjrArud;
    public final mHW63SUma8isGb yZj7bj6KyeuYi9woqDlC;

    static {
        qEwqqDvm9wKfnhETPc16M qewqqdvm9wkfnhetpc16m = new qEwqqDvm9wKfnhETPc16M(UsageReportUploadWorker.class, "lastAllAppsUploadTime", "getLastAllAppsUploadTime()J", 0);
        JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I.getClass();
        jvttfmFMQfShe6OfbNf1zF8CyEu = new GZnU2p3i2qStYb[]{qewqqdvm9wkfnhetpc16m};
        Companion = new PsxyR34EwEPK6iGSwfdc8qX0m();
    }

    public UsageReportUploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new AJBhDJgkMCa(this, 20));
        this.sCPtafveBAhdLIs2ajN3WV = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new AJBhDJgkMCa(this, 21));
        this.Mej0x2K4ZGSUxtYNka4QZ = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new AJBhDJgkMCa(this, 22));
        this.qTa7aqjjB9Bt6mc = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new AJBhDJgkMCa(this, 23));
        this.f2sXlW3st0rAKJwyOrCfOWc = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new AJBhDJgkMCa(this, 24));
        this.iR1XUIc7FjhMl57O = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new AJBhDJgkMCa(this, 25));
        mHW63SUma8isGb mhw63suma8isgbAboow6rUrcY2SrFRa46C6uy = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new AJBhDJgkMCa(this, 26));
        this.yM5HHkk1MhPLZFYTHm2JjrArud = mhw63suma8isgbAboow6rUrcY2SrFRa46C6uy;
        this.FzogU2bPCQtD6a1hMYB1kyti = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new AJBhDJgkMCa(this, 27));
        this.J1BE9tYH1em4X1uAhc6L7f4M = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new AJBhDJgkMCa(this, 28));
        this.tdNmBZIJHG1 = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new AJBhDJgkMCa(this, 15));
        this.tzMOyOc53ffl = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new AJBhDJgkMCa(this, 16));
        this.cVfIGUKLEqID1HH = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new AJBhDJgkMCa(this, 17));
        this.czGAefXQxIZzo = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new AJBhDJgkMCa(this, 18));
        this.yZj7bj6KyeuYi9woqDlC = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new AJBhDJgkMCa(this, 19));
        this.IPi49brQACDpXJTJMp7 = new XQCixPMPkXDW6((SharedPreferences) mhw63suma8isgbAboow6rUrcY2SrFRa46C6uy.getValue(), "bitpit.launcher.key.LAST_ALL_APPS_UPLOAD_START_TIME", 0L, 2);
    }

    public static String Aboow6rUrcY2SrFRa46C6uy(ogNIMHDmW40UC1xJL3PaVCbnHRx ognimhdmw40uc1xjl3pavcbnhrx) {
        if (ognimhdmw40uc1xjl3pavcbnhrx instanceof t371EfbQKhkqgzmeFM3wdztuQG6) {
            return null;
        }
        if (ognimhdmw40uc1xjl3pavcbnhrx instanceof w0uweGyT374wMBSB) {
            return ((w0uweGyT374wMBSB) ognimhdmw40uc1xjl3pavcbnhrx).vHDGcerxdYUGlVld2h.S1zP5M3X7Ukq3ROlZ87G9I.getClassName();
        }
        if (!(ognimhdmw40uc1xjl3pavcbnhrx instanceof uBuYBv2i9glqnEpN6eM75e1rnoqmf)) {
            return null;
        }
        uBuYBv2i9glqnEpN6eM75e1rnoqmf ubuybv2i9glqnepn6em75e1rnoqmf = (uBuYBv2i9glqnEpN6eM75e1rnoqmf) ognimhdmw40uc1xjl3pavcbnhrx;
        String str = ubuybv2i9glqnepn6em75e1rnoqmf.bfvGkgRqVBmXp4z3D5cuKKKZz;
        int i = ubuybv2i9glqnepn6em75e1rnoqmf.PoRwkUUfcmwTiLMm;
        if (i == 0) {
            return (ubuybv2i9glqnepn6em75e1rnoqmf.Cl5XA76hhttS71Yja18WBMw7 & 4) == 4 ? str : "dynamic";
        }
        if (i == 1) {
            return "legacy";
        }
        if (i == 2) {
            return "sesame";
        }
        if (i == 3) {
            return "folder";
        }
        if (i != 4) {
            return null;
        }
        return Uri.parse(str).getHost();
    }

    /* JADX WARN: Code duplicated, block: B:113:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:117:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:125:0x0514 A[LOOP:2: B:124:0x0512->B:125:0x0514, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:131:0x0577  */
    /* JADX WARN: Code duplicated, block: B:134:0x05ac A[LOOP:3: B:132:0x05a6->B:134:0x05ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:136:0x05f7  */
    /* JADX WARN: Code duplicated, block: B:140:0x062b A[LOOP:4: B:138:0x0625->B:140:0x062b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:144:0x068a A[LOOP:5: B:142:0x0684->B:144:0x068a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:147:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:148:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:150:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:151:0x06da  */
    /* JADX WARN: Code duplicated, block: B:154:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:157:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:160:0x0705  */
    /* JADX WARN: Code duplicated, block: B:164:0x0745  */
    /* JADX WARN: Code duplicated, block: B:167:0x074a  */
    /* JADX WARN: Code duplicated, block: B:171:0x0783  */
    /* JADX WARN: Code duplicated, block: B:176:0x07b0  */
    /* JADX WARN: Code duplicated, block: B:177:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:180:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:198:0x07d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x079b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x077d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0163  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [int] */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r12v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r42v3 */
    /* JADX WARN: Type inference failed for: r42v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r42v9 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v81 */
    /* JADX WARN: Type inference failed for: r5v82 */
    /* JADX WARN: Type inference failed for: r5v83 */
    /* JADX WARN: Type inference failed for: r5v84 */
    /* JADX WARN: Type inference failed for: r5v85 */
    /* JADX WARN: Type inference failed for: r5v86 */
    public final Object ox9eclwMpRd(long j, long j2, long j3, bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) throws Throwable {
        fdnz7zsh9e fdnz7zsh9eVar;
        UUID uuidFromString;
        mHW63SUma8isGb mhw63suma8isgb;
        mHW63SUma8isGb mhw63suma8isgb2;
        mHW63SUma8isGb mhw63suma8isgb3;
        Q4FYfLImt1X q4FYfLImt1X;
        mHW63SUma8isGb mhw63suma8isgb4;
        long j4;
        tIDTjdoK38 tidtjdok38;
        int i;
        long j5;
        List list;
        UUID uuid;
        long j6;
        List list2;
        long j7;
        long j8;
        Object obj;
        int i2;
        Y74MyUCLMhd2zBD2Mw8M y74MyUCLMhd2zBD2Mw8M;
        List list3;
        Y74MyUCLMhd2zBD2Mw8M y74MyUCLMhd2zBD2Mw8M2;
        tIDTjdoK38 tidtjdok39;
        long j9;
        long j10;
        List list4;
        List list5;
        Object obj2;
        List list6;
        long j11;
        Object objBezslBgjveK3hODH;
        Y74MyUCLMhd2zBD2Mw8M y74MyUCLMhd2zBD2Mw8M3;
        Q4FYfLImt1X q4FYfLImt1X2;
        int i3;
        List list7;
        UsageReportUploadWorker usageReportUploadWorker;
        ?? arrayList;
        long j12;
        long j13;
        int i4;
        ArrayList arrayList2;
        Iterator it;
        long j14;
        NotificationListener notificationListenerS1zP5M3X7Ukq3ROlZ87G9I;
        IyJ5Qc4DxtDd1Zs iyJ5Qc4DxtDd1Zs;
        boolean z;
        boolean z2;
        ?? r5;
        ?? r6;
        ?? r7;
        ?? r0;
        List list8;
        List list9;
        Object objQl6q60SSx3;
        tIDTjdoK38 tidtjdok310;
        int i5;
        int i6;
        List list10;
        long j15;
        UUID uuid2;
        List list11;
        List list12;
        ?? r42;
        long j16;
        List list13;
        long j17;
        Iterator it2;
        Throwable thS1zP5M3X7Ukq3ROlZ87G9I;
        ArrayList arrayList3;
        Iterator it3;
        int size;
        int i7;
        long j18;
        long jPQQPeCDD0JLCT3aLz;
        int i8;
        pijs62HGGnGxq0xD0cXq pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO;
        String str;
        UsageReport usageReport;
        boolean z3;
        boolean z4;
        boolean z5;
        int i9;
        mHW63SUma8isGb mhw63suma8isgb5 = this.iR1XUIc7FjhMl57O;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof fdnz7zsh9e) {
            fdnz7zsh9eVar = (fdnz7zsh9e) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i10 = fdnz7zsh9eVar.yZj7bj6KyeuYi9woqDlC;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fdnz7zsh9eVar.yZj7bj6KyeuYi9woqDlC = i10 - Integer.MIN_VALUE;
            } else {
                fdnz7zsh9eVar = new fdnz7zsh9e(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            fdnz7zsh9eVar = new fdnz7zsh9e(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        fdnz7zsh9e fdnz7zsh9eVar2 = fdnz7zsh9eVar;
        Object obj3 = fdnz7zsh9eVar2.cVfIGUKLEqID1HH;
        int i11 = fdnz7zsh9eVar2.yZj7bj6KyeuYi9woqDlC;
        mHW63SUma8isGb mhw63suma8isgb6 = this.yZj7bj6KyeuYi9woqDlC;
        mHW63SUma8isGb mhw63suma8isgb7 = this.tdNmBZIJHG1;
        tIDTjdoK38 tidtjdok311 = tIDTjdoK38.GO8WUug7ZWFCUI1zY;
        mHW63SUma8isGb mhw63suma8isgb8 = this.Mej0x2K4ZGSUxtYNka4QZ;
        a9kWzoj6D3Yoa0 a9kwzoj6d3yoa0 = a9kWzoj6D3Yoa0.GO8WUug7ZWFCUI1zY;
        if (i11 == 0) {
            Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj3);
            long j19 = j2 - 1;
            SharedPreferences sharedPreferences = (SharedPreferences) this.yM5HHkk1MhPLZFYTHm2JjrArud.getValue();
            String string = sharedPreferences.getString("bitpit.launcher.key.USAGE_ID", null);
            if (string != null) {
                long jCurrentTimeMillis = System.currentTimeMillis() - sharedPreferences.getLong("bitpit.launcher.key.USAGE_ID_GENERATION_TIME", 0L);
                if (0 > jCurrentTimeMillis || jCurrentTimeMillis > Long.MAX_VALUE) {
                    UUID uuidRandomUUID = UUID.randomUUID();
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString("bitpit.launcher.key.USAGE_ID", uuidRandomUUID.toString());
                    editorEdit.putLong("bitpit.launcher.key.USAGE_ID_GENERATION_TIME", jCurrentTimeMillis2);
                    editorEdit.apply();
                    uuidFromString = uuidRandomUUID;
                } else {
                    try {
                        uuidFromString = UUID.fromString(string);
                    } catch (IllegalArgumentException unused) {
                        UUID uuidRandomUUID2 = UUID.randomUUID();
                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                        editorEdit2.putString("bitpit.launcher.key.USAGE_ID", uuidRandomUUID2.toString());
                        editorEdit2.putLong("bitpit.launcher.key.USAGE_ID_GENERATION_TIME", jCurrentTimeMillis3);
                        editorEdit2.apply();
                        uuidFromString = uuidRandomUUID2;
                    }
                }
            } else {
                UUID uuidRandomUUID3 = UUID.randomUUID();
                long jCurrentTimeMillis4 = System.currentTimeMillis();
                SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                editorEdit3.putString("bitpit.launcher.key.USAGE_ID", uuidRandomUUID3.toString());
                editorEdit3.putLong("bitpit.launcher.key.USAGE_ID_GENERATION_TIME", jCurrentTimeMillis4);
                editorEdit3.apply();
                uuidFromString = uuidRandomUUID3;
            }
            LinkedHashMap linkedHashMapS1zP5M3X7Ukq3ROlZ87G9I = ((RvhyPjquEfKeg2aqLeO7fm7) ((Mrfemq5Sav3yOR731) this.qTa7aqjjB9Bt6mc.getValue())).S1zP5M3X7Ukq3ROlZ87G9I();
            int iS1zP5M3X7Ukq3ROlZ87G9I = ((JTgp3EtWPwqBZ) ((tC3sgxzCZkUNJgjSQwq) this.sCPtafveBAhdLIs2ajN3WV.getValue())).S1zP5M3X7Ukq3ROlZ87G9I();
            Q4FYfLImt1X q4FYfLImt1X3 = new Q4FYfLImt1X();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            for (Iterator it4 = ((List) cvu91h5WjQasu7vH8q4wQg9.ziNFA7KzVfc6(((LLnhW2rxhI026DTfznKMKaPBh) ((gDorRusXxz4vI7fqTkfdRMN) this.FzogU2bPCQtD6a1hMYB1kyti.getValue())).Rdzg08aYlt0UsoLUNug9cESzgAY9R.S1zP5M3X7Ukq3ROlZ87G9I, true, false, new EaKSYhhqmDVGL(6, j3 - 7344000000L))).iterator(); it4.hasNext(); it4 = it4) {
                l2D8c8VIWWisH l2d8c8viwwish = (l2D8c8VIWWisH) it4.next();
                ogNIMHDmW40UC1xJL3PaVCbnHRx ognimhdmw40uc1xjl3pavcbnhrx = (ogNIMHDmW40UC1xJL3PaVCbnHRx) linkedHashMapS1zP5M3X7Ukq3ROlZ87G9I.get(l2d8c8viwwish.BezslBgjveK3hODH);
                UsageReport.FeedEntry feedEntry = ognimhdmw40uc1xjl3pavcbnhrx == null ? null : new UsageReport.FeedEntry(ognimhdmw40uc1xjl3pavcbnhrx.GO8WUug7ZWFCUI1zY.S1zP5M3X7Ukq3ROlZ87G9I, Aboow6rUrcY2SrFRa46C6uy(ognimhdmw40uc1xjl3pavcbnhrx), l2d8c8viwwish.BezslBgjveK3hODH.axL8FocTDLUdzg0XScbO, l2d8c8viwwish.S1zP5M3X7Ukq3ROlZ87G9I, l2d8c8viwwish.axL8FocTDLUdzg0XScbO, l2d8c8viwwish.ox9eclwMpRd);
                if (feedEntry != null) {
                    arrayList6.add(feedEntry);
                }
            }
            GZnU2p3i2qStYb gZnU2p3i2qStYb = jvttfmFMQfShe6OfbNf1zF8CyEu[0];
            mhw63suma8isgb = mhw63suma8isgb5;
            mhw63suma8isgb2 = mhw63suma8isgb6;
            mhw63suma8isgb3 = mhw63suma8isgb7;
            ArrayList arrayList7 = arrayList4;
            q4FYfLImt1X = q4FYfLImt1X3;
            ArrayList arrayList8 = arrayList6;
            if (!m6VeYiMqnaBahF88nkY76Vf.ox9eclwMpRd(((Number) this.IPi49brQACDpXJTJMp7.S1zP5M3X7Ukq3ROlZ87G9I()).longValue(), 7344000000L, j3)) {
                for (ogNIMHDmW40UC1xJL3PaVCbnHRx ognimhdmw40uc1xjl3pavcbnhrx2 : linkedHashMapS1zP5M3X7Ukq3ROlZ87G9I.values()) {
                    UsageReport.FeedEntry feedEntry2 = (ognimhdmw40uc1xjl3pavcbnhrx2.sCPtafveBAhdLIs2ajN3WV() && (!(ognimhdmw40uc1xjl3pavcbnhrx2 instanceof uBuYBv2i9glqnEpN6eM75e1rnoqmf) || ((uBuYBv2i9glqnEpN6eM75e1rnoqmf) ognimhdmw40uc1xjl3pavcbnhrx2).JY5knQmh7EQJEZ())) ? new UsageReport.FeedEntry(ognimhdmw40uc1xjl3pavcbnhrx2.GO8WUug7ZWFCUI1zY.S1zP5M3X7Ukq3ROlZ87G9I, Aboow6rUrcY2SrFRa46C6uy(ognimhdmw40uc1xjl3pavcbnhrx2), ognimhdmw40uc1xjl3pavcbnhrx2.Rdzg08aYlt0UsoLUNug9cESzgAY9R.axL8FocTDLUdzg0XScbO, 1, 4, 0) : null;
                    if (feedEntry2 != null) {
                        arrayList8.add(feedEntry2);
                    }
                }
            }
            mhw63suma8isgb4 = mhw63suma8isgb8;
            long j20 = j19;
            j4 = j3;
            Iterator it5 = ((List) cvu91h5WjQasu7vH8q4wQg9.ziNFA7KzVfc6(((Database) mhw63suma8isgb8.getValue()).cCmbv8Tzd2QLd161ImIZUlZ8n().S1zP5M3X7Ukq3ROlZ87G9I, true, false, new c7SrswmGzM(4, j, j20))).iterator();
            while (it5.hasNext()) {
                JHbD5ZdLzavjhaIS0 jHbD5ZdLzavjhaIS0 = (JHbD5ZdLzavjhaIS0) it5.next();
                ogNIMHDmW40UC1xJL3PaVCbnHRx ognimhdmw40uc1xjl3pavcbnhrx3 = (ogNIMHDmW40UC1xJL3PaVCbnHRx) linkedHashMapS1zP5M3X7Ukq3ROlZ87G9I.get(jHbD5ZdLzavjhaIS0.ziNFA7KzVfc6);
                UsageReport.Launch launch = ognimhdmw40uc1xjl3pavcbnhrx3 == null ? null : new UsageReport.Launch(ognimhdmw40uc1xjl3pavcbnhrx3.GO8WUug7ZWFCUI1zY.S1zP5M3X7Ukq3ROlZ87G9I, Aboow6rUrcY2SrFRa46C6uy(ognimhdmw40uc1xjl3pavcbnhrx3), jHbD5ZdLzavjhaIS0.ziNFA7KzVfc6.axL8FocTDLUdzg0XScbO, jHbD5ZdLzavjhaIS0.S1zP5M3X7Ukq3ROlZ87G9I, jHbD5ZdLzavjhaIS0.axL8FocTDLUdzg0XScbO, jHbD5ZdLzavjhaIS0.BezslBgjveK3hODH, jHbD5ZdLzavjhaIS0.Aboow6rUrcY2SrFRa46C6uy);
                ArrayList arrayList9 = arrayList7;
                if (launch != null) {
                    arrayList9.add(launch);
                }
                arrayList7 = arrayList9;
                it5 = it5;
                j20 = j20;
            }
            long j21 = j20;
            ArrayList arrayList10 = arrayList7;
            if (((HF5afwOkFj9V8) ((hwSYVZu6IevsK1z) this.J1BE9tYH1em4X1uAhc6L7f4M.getValue())).axL8FocTDLUdzg0XScbO() && gT4sTdpjS277wbG60pk72fHWG7.axL8FocTDLUdzg0XScbO) {
                long j22 = j4 - 518400000;
                if (j >= j22) {
                    j22 = j;
                }
                Y74MyUCLMhd2zBD2Mw8M y74MyUCLMhd2zBD2Mw8MHveD9n1tOYlffjJDxghBitYNgB = mo4unDT7uci.HveD9n1tOYlffjJDxghBitYNgB(j22, j2);
                long j23 = j22;
                Y74MyUCLMhd2zBD2Mw8M y74MyUCLMhd2zBD2Mw8MHveD9n1tOYlffjJDxghBitYNgB2 = mo4unDT7uci.HveD9n1tOYlffjJDxghBitYNgB(j23 - 21600000, j4);
                q4FYfLImt1X.GO8WUug7ZWFCUI1zY = true;
                w0U8PgpNFLkhFXGnjwC1GUzyF w0u8pgpnflkhfxgnjwc1guzyf = (w0U8PgpNFLkhFXGnjwC1GUzyF) mhw63suma8isgb3.getValue();
                fdnz7zsh9eVar2.Mej0x2K4ZGSUxtYNka4QZ = uuidFromString;
                fdnz7zsh9eVar2.qTa7aqjjB9Bt6mc = q4FYfLImt1X;
                fdnz7zsh9eVar2.f2sXlW3st0rAKJwyOrCfOWc = arrayList10;
                fdnz7zsh9eVar2.iR1XUIc7FjhMl57O = arrayList5;
                fdnz7zsh9eVar2.yM5HHkk1MhPLZFYTHm2JjrArud = arrayList8;
                fdnz7zsh9eVar2.FzogU2bPCQtD6a1hMYB1kyti = y74MyUCLMhd2zBD2Mw8MHveD9n1tOYlffjJDxghBitYNgB;
                fdnz7zsh9eVar2.J1BE9tYH1em4X1uAhc6L7f4M = y74MyUCLMhd2zBD2Mw8MHveD9n1tOYlffjJDxghBitYNgB2;
                j8 = j;
                fdnz7zsh9eVar2.WIXlfFpvH7glAGsUk3 = j8;
                fdnz7zsh9eVar2.gsHzEVTj1SCIPR = j2;
                fdnz7zsh9eVar2.LcvPFGYKhAm4SS5FZ = j4;
                fdnz7zsh9eVar2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = j21;
                fdnz7zsh9eVar2.tdNmBZIJHG1 = iS1zP5M3X7Ukq3ROlZ87G9I;
                fdnz7zsh9eVar2.sCPtafveBAhdLIs2ajN3WV = j23;
                fdnz7zsh9eVar2.yZj7bj6KyeuYi9woqDlC = 1;
                Object objAxL8FocTDLUdzg0XScbO = ((YbhkWJ1zvclL) w0u8pgpnflkhfxgnjwc1guzyf).axL8FocTDLUdzg0XScbO(y74MyUCLMhd2zBD2Mw8MHveD9n1tOYlffjJDxghBitYNgB2, null, fdnz7zsh9eVar2);
                if (objAxL8FocTDLUdzg0XScbO == tidtjdok311) {
                    return tidtjdok311;
                }
                obj = objAxL8FocTDLUdzg0XScbO;
                i2 = iS1zP5M3X7Ukq3ROlZ87G9I;
                y74MyUCLMhd2zBD2Mw8M = y74MyUCLMhd2zBD2Mw8MHveD9n1tOYlffjJDxghBitYNgB2;
                list3 = arrayList8;
                y74MyUCLMhd2zBD2Mw8M2 = y74MyUCLMhd2zBD2Mw8MHveD9n1tOYlffjJDxghBitYNgB;
                tidtjdok39 = tidtjdok311;
                j9 = j21;
                j10 = j23;
                list4 = arrayList10;
                list5 = arrayList5;
                uuid = uuidFromString;
            } else {
                tidtjdok38 = tidtjdok311;
                i = iS1zP5M3X7Ukq3ROlZ87G9I;
                j5 = j;
                list = arrayList5;
                uuid = uuidFromString;
                j6 = j21;
                list2 = arrayList10;
                j7 = j2;
                list7 = arrayList8;
            }
            usageReportUploadWorker = this;
            if (OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(((vN6oJjNAWOkYHUJX) ((stzlAQBLXkK5) usageReportUploadWorker.qaDSpeex0Oo1Qvt3oOrTJnbcQFp.getValue())).cCmbv8Tzd2QLd161ImIZUlZ8n.S1zP5M3X7Ukq3ROlZ87G9I("allow_usage_report_notification_upload"), Boolean.TRUE)) {
                oyNYA2tTXPYTjnSB oynya2ttxpytjnsbWIXlfFpvH7glAGsUk3 = ((Database) mhw63suma8isgb4.getValue()).WIXlfFpvH7glAGsUk3();
                List list14 = (List) cvu91h5WjQasu7vH8q4wQg9.ziNFA7KzVfc6(oynya2ttxpytjnsbWIXlfFpvH7glAGsUk3.S1zP5M3X7Ukq3ROlZ87G9I, true, true, new BwvZOBiCEIFJtYnaz097d(j5, j6, oynya2ttxpytjnsbWIXlfFpvH7glAGsUk3, 1));
                arrayList = new ArrayList(KjpLK4IQzcoI.JY5knQmh7EQJEZ(list14, 10));
                it2 = list14.iterator();
                while (it2.hasNext()) {
                    oe96GFUATOa5 oe96gfuatoa5 = (oe96GFUATOa5) it2.next();
                    rHbvTwvrJMCknMWt2V rhbvtwvrjmcknmwt2v = oe96gfuatoa5.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
                    c7wGsGbKcH1sEEIn2uNXXf3 c7wgsgbkch1seein2unxxf3 = oe96gfuatoa5.GO8WUug7ZWFCUI1zY;
                    arrayList.add(new UsageReport.Notification(rhbvtwvrjmcknmwt2v.cCmbv8Tzd2QLd161ImIZUlZ8n, c7wgsgbkch1seein2unxxf3.WIXlfFpvH7glAGsUk3, c7wgsgbkch1seein2unxxf3.LcvPFGYKhAm4SS5FZ, c7wgsgbkch1seein2unxxf3.qaDSpeex0Oo1Qvt3oOrTJnbcQFp, c7wgsgbkch1seein2unxxf3.qTa7aqjjB9Bt6mc, c7wgsgbkch1seein2unxxf3.f2sXlW3st0rAKJwyOrCfOWc.getAsString(), new Integer(c7wgsgbkch1seein2unxxf3.Mej0x2K4ZGSUxtYNka4QZ), c7wgsgbkch1seein2unxxf3.sCPtafveBAhdLIs2ajN3WV, c7wgsgbkch1seein2unxxf3.iR1XUIc7FjhMl57O));
                    it2 = it2;
                    j4 = j4;
                }
            } else {
                arrayList = a9kwzoj6d3yoa0;
            }
            j12 = j4;
            long j24 = j6;
            j13 = j5;
            for (t3o4R1jMAJ4bpO8Sdk1tyTzzQPE t3o4r1jmaj4bpo8sdk1tytzzqpe : (List) cvu91h5WjQasu7vH8q4wQg9.ziNFA7KzVfc6(((Database) mhw63suma8isgb4.getValue()).WT8HZhEwPEkG().S1zP5M3X7Ukq3ROlZ87G9I, true, false, new c7SrswmGzM(2, j13, j24))) {
                list.add(new UsageReport.Activity(t3o4r1jmaj4bpo8sdk1tytzzqpe.S1zP5M3X7Ukq3ROlZ87G9I, t3o4r1jmaj4bpo8sdk1tytzzqpe.ziNFA7KzVfc6, t3o4r1jmaj4bpo8sdk1tytzzqpe.Aboow6rUrcY2SrFRa46C6uy, t3o4r1jmaj4bpo8sdk1tytzzqpe.axL8FocTDLUdzg0XScbO, t3o4r1jmaj4bpo8sdk1tytzzqpe.BezslBgjveK3hODH));
            }
            g72QTnntwDS9UTJ g72qtnntwds9utjMej0x2K4ZGSUxtYNka4QZ = ((Database) mhw63suma8isgb4.getValue()).Mej0x2K4ZGSUxtYNka4QZ();
            i4 = i;
            List list15 = (List) cvu91h5WjQasu7vH8q4wQg9.ziNFA7KzVfc6(g72qtnntwds9utjMej0x2K4ZGSUxtYNka4QZ.S1zP5M3X7Ukq3ROlZ87G9I, true, false, new rqAjigHBNnNXGk1aKUqlUvOLCOEc(j13, j24, g72qtnntwds9utjMej0x2K4ZGSUxtYNka4QZ, 1));
            arrayList2 = new ArrayList(KjpLK4IQzcoI.JY5knQmh7EQJEZ(list15, 10));
            it = list15.iterator();
            while (it.hasNext()) {
                i4R6OERALqwOeabhCa69f i4r6oeralqwoeabhca69f = (i4R6OERALqwOeabhCa69f) it.next();
                arrayList2.add(new UsageReport.SurveyResponse(i4r6oeralqwoeabhca69f.S1zP5M3X7Ukq3ROlZ87G9I.getSerialized(), i4r6oeralqwoeabhca69f.BezslBgjveK3hODH, i4r6oeralqwoeabhca69f.axL8FocTDLUdzg0XScbO, i4r6oeralqwoeabhca69f.ziNFA7KzVfc6, i4r6oeralqwoeabhca69f.Aboow6rUrcY2SrFRa46C6uy, i4r6oeralqwoeabhca69f.ox9eclwMpRd, i4r6oeralqwoeabhca69f.PQQPeCDD0JLCT3aLz, i4r6oeralqwoeabhca69f.LYcdI4xpry8eXmFC9I4wyaLdcG1z));
                it = it;
                j7 = j7;
            }
            j14 = j7;
            NotificationListener.Companion.getClass();
            notificationListenerS1zP5M3X7Ukq3ROlZ87G9I = OUw39KtIsdT3yYWqqOrKN6.S1zP5M3X7Ukq3ROlZ87G9I();
            if (notificationListenerS1zP5M3X7Ukq3ROlZ87G9I != null) {
                iyJ5Qc4DxtDd1Zs = notificationListenerS1zP5M3X7Ukq3ROlZ87G9I.J1BE9tYH1em4X1uAhc6L7f4M;
            } else {
                iyJ5Qc4DxtDd1Zs = null;
            }
            if (iyJ5Qc4DxtDd1Zs != null) {
                z = true;
            } else {
                z = false;
            }
            z2 = ((zaEQv9uah4s3bhwua8H) ((z1jpZX9STmdA7rDJqTHkX09JG8) usageReportUploadWorker.f2sXlW3st0rAKJwyOrCfOWc.getValue())).ox9eclwMpRd().S1zP5M3X7Ukq3ROlZ87G9I;
            r5 = z2;
            if (z) {
                r5 = (z2 ? 1 : 0) | 2;
            }
            r6 = r5;
            if (((CTid586a2W9uiqX3Zqsu) ((zpNs6MUm6xEe4ualhXrHL) usageReportUploadWorker.cVfIGUKLEqID1HH.getValue())).PQQPeCDD0JLCT3aLz()) {
                r6 = (r5 == true ? 1 : 0) | 8;
            }
            r7 = r6;
            if (q4FYfLImt1X.GO8WUug7ZWFCUI1zY) {
                r7 = (r6 == true ? 1 : 0) | 16;
            }
            r0 = 1048576 | r7;
            eY0AEVFwD2fuPwFF4IzZ2WAQ78 ey0aevfwd2fupwff4izz2waq78 = (eY0AEVFwD2fuPwFF4IzZ2WAQ78) mhw63suma8isgb2.getValue();
            fdnz7zsh9eVar2.Mej0x2K4ZGSUxtYNka4QZ = uuid;
            fdnz7zsh9eVar2.qTa7aqjjB9Bt6mc = null;
            fdnz7zsh9eVar2.f2sXlW3st0rAKJwyOrCfOWc = list2;
            fdnz7zsh9eVar2.iR1XUIc7FjhMl57O = list;
            fdnz7zsh9eVar2.yM5HHkk1MhPLZFYTHm2JjrArud = list7;
            fdnz7zsh9eVar2.FzogU2bPCQtD6a1hMYB1kyti = arrayList;
            fdnz7zsh9eVar2.J1BE9tYH1em4X1uAhc6L7f4M = arrayList2;
            fdnz7zsh9eVar2.WIXlfFpvH7glAGsUk3 = j13;
            fdnz7zsh9eVar2.gsHzEVTj1SCIPR = j14;
            list8 = list;
            list9 = list2;
            fdnz7zsh9eVar2.LcvPFGYKhAm4SS5FZ = j12;
            fdnz7zsh9eVar2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = j24;
            fdnz7zsh9eVar2.tdNmBZIJHG1 = i4;
            fdnz7zsh9eVar2.tzMOyOc53ffl = r0;
            fdnz7zsh9eVar2.yZj7bj6KyeuYi9woqDlC = 3;
            objQl6q60SSx3 = ((kAffANyp2QybsMt) ey0aevfwd2fupwff4izz2waq78).PQQPeCDD0JLCT3aLz.Ql6q60SSx3(fdnz7zsh9eVar2);
            tidtjdok310 = tidtjdok38;
            if (objQl6q60SSx3 != tidtjdok310) {
                objQl6q60SSx3 = s9XnN7QTAJ.S1zP5M3X7Ukq3ROlZ87G9I;
            }
            if (objQl6q60SSx3 == tidtjdok310) {
                return tidtjdok310;
            }
            i5 = r0;
            i6 = i4;
            list10 = arrayList2;
            j15 = j14;
            uuid2 = uuid;
            list11 = list8;
            list12 = list7;
            r42 = arrayList;
            j16 = j13;
            list13 = list9;
            j17 = j12;
            v1H71pZfvCVU4.Companion.getClass();
            i8 = i5;
            for (v1H71pZfvCVU4 v1h71pzfvcvu4 : KjpLK4IQzcoI.H5sQ15nhYoaKKHhx(XvGKjmlJpHb7zYfxX2mymFDx2M.BezslBgjveK3hODH, wiJre1CnJq2BRBGVdP5.BezslBgjveK3hODH)) {
                z5 = ((kAffANyp2QybsMt) ((eY0AEVFwD2fuPwFF4IzZ2WAQ78) mhw63suma8isgb2.getValue())).S1zP5M3X7Ukq3ROlZ87G9I(v1h71pzfvcvu4) instanceof YwBUKqJjphOMW;
                i9 = v1h71pzfvcvu4.axL8FocTDLUdzg0XScbO;
                if (z5) {
                    i8 |= i9;
                }
            }
            pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO = ((xSr1hPBbWjW) ((ptgnZZCKaE4jZ) usageReportUploadWorker.czGAefXQxIZzo.getValue())).axL8FocTDLUdzg0XScbO();
            if (pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO != null) {
                str = pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO.S1zP5M3X7Ukq3ROlZ87G9I;
            } else {
                str = null;
            }
            int i12 = Build.VERSION.SDK_INT;
            String str2 = Build.MANUFACTURER;
            String str3 = Build.MODEL;
            usageReport = new UsageReport(uuid2, j17, j16, j15, i6, str, new Integer(i12), i8, list12, list13, r42, list11, list10);
            if (usageReportUploadWorker.cCmbv8Tzd2QLd161ImIZUlZ8n.get() != -256) {
                return Boolean.FALSE;
            }
            UE7MkxgXYXfsH uE7MkxgXYXfsH = (UE7MkxgXYXfsH) mhw63suma8isgb.getValue();
            QTUUDdYAQaBj qTUUDdYAQaBj = new QTUUDdYAQaBj();
            z3 = false;
            sRgu8ykgdYOnT49j1bPuQWmquU.axL8FocTDLUdzg0XScbO(qTUUDdYAQaBj, false);
            qTUUDdYAQaBj.S1zP5M3X7Ukq3ROlZ87G9I("usage-report");
            UE7MkxgXYXfsH.S1zP5M3X7Ukq3ROlZ87G9I((UE7MkxgXYXfsH) mhw63suma8isgb.getValue(), UE7MkxgXYXfsH.axL8FocTDLUdzg0XScbO(uE7MkxgXYXfsH, qTUUDdYAQaBj.BezslBgjveK3hODH(), usageReport, UsageReport.Companion.serializer(), null, null, 24), new NyMLDspuxoUZ61buwnujXDamSM0VK(15));
            z4 = true;
            return Boolean.valueOf(z4);
        }
        if (i11 == 1) {
            long j25 = fdnz7zsh9eVar2.sCPtafveBAhdLIs2ajN3WV;
            int i13 = fdnz7zsh9eVar2.tdNmBZIJHG1;
            long j26 = fdnz7zsh9eVar2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
            long j27 = fdnz7zsh9eVar2.LcvPFGYKhAm4SS5FZ;
            j2 = fdnz7zsh9eVar2.gsHzEVTj1SCIPR;
            long j28 = fdnz7zsh9eVar2.WIXlfFpvH7glAGsUk3;
            Y74MyUCLMhd2zBD2Mw8M y74MyUCLMhd2zBD2Mw8M4 = (Y74MyUCLMhd2zBD2Mw8M) fdnz7zsh9eVar2.J1BE9tYH1em4X1uAhc6L7f4M;
            Y74MyUCLMhd2zBD2Mw8M y74MyUCLMhd2zBD2Mw8M5 = (Y74MyUCLMhd2zBD2Mw8M) fdnz7zsh9eVar2.FzogU2bPCQtD6a1hMYB1kyti;
            List list16 = fdnz7zsh9eVar2.yM5HHkk1MhPLZFYTHm2JjrArud;
            List list17 = fdnz7zsh9eVar2.iR1XUIc7FjhMl57O;
            List list18 = fdnz7zsh9eVar2.f2sXlW3st0rAKJwyOrCfOWc;
            Q4FYfLImt1X q4FYfLImt1X4 = fdnz7zsh9eVar2.qTa7aqjjB9Bt6mc;
            UUID uuid3 = fdnz7zsh9eVar2.Mej0x2K4ZGSUxtYNka4QZ;
            Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj3);
            list5 = list17;
            y74MyUCLMhd2zBD2Mw8M2 = y74MyUCLMhd2zBD2Mw8M5;
            i2 = i13;
            j9 = j26;
            mhw63suma8isgb = mhw63suma8isgb5;
            mhw63suma8isgb2 = mhw63suma8isgb6;
            mhw63suma8isgb3 = mhw63suma8isgb7;
            tidtjdok39 = tidtjdok311;
            list3 = list16;
            list4 = list18;
            q4FYfLImt1X = q4FYfLImt1X4;
            j10 = j25;
            j8 = j28;
            obj = ((J7Tsg1eqTfbK8vIo4RFOyjPiu) obj3).S1zP5M3X7Ukq3ROlZ87G9I;
            y74MyUCLMhd2zBD2Mw8M = y74MyUCLMhd2zBD2Mw8M4;
            mhw63suma8isgb4 = mhw63suma8isgb8;
            uuid = uuid3;
            j4 = j27;
        } else if (i11 == 2) {
            int i14 = fdnz7zsh9eVar2.tdNmBZIJHG1;
            long j29 = fdnz7zsh9eVar2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
            long j30 = fdnz7zsh9eVar2.LcvPFGYKhAm4SS5FZ;
            j7 = fdnz7zsh9eVar2.gsHzEVTj1SCIPR;
            long j31 = fdnz7zsh9eVar2.WIXlfFpvH7glAGsUk3;
            Y74MyUCLMhd2zBD2Mw8M y74MyUCLMhd2zBD2Mw8M6 = (Y74MyUCLMhd2zBD2Mw8M) fdnz7zsh9eVar2.FzogU2bPCQtD6a1hMYB1kyti;
            List list19 = fdnz7zsh9eVar2.yM5HHkk1MhPLZFYTHm2JjrArud;
            list5 = fdnz7zsh9eVar2.iR1XUIc7FjhMl57O;
            List list20 = fdnz7zsh9eVar2.f2sXlW3st0rAKJwyOrCfOWc;
            q4FYfLImt1X2 = fdnz7zsh9eVar2.qTa7aqjjB9Bt6mc;
            UUID uuid4 = fdnz7zsh9eVar2.Mej0x2K4ZGSUxtYNka4QZ;
            Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj3);
            objBezslBgjveK3hODH = ((J7Tsg1eqTfbK8vIo4RFOyjPiu) obj3).S1zP5M3X7Ukq3ROlZ87G9I;
            j11 = j29;
            i3 = i14;
            mhw63suma8isgb = mhw63suma8isgb5;
            mhw63suma8isgb2 = mhw63suma8isgb6;
            tidtjdok38 = tidtjdok311;
            mhw63suma8isgb4 = mhw63suma8isgb8;
            uuid = uuid4;
            y74MyUCLMhd2zBD2Mw8M3 = y74MyUCLMhd2zBD2Mw8M6;
            j4 = j30;
            j8 = j31;
            list4 = list20;
            list6 = list19;
            W6Cvbh5ibKri8VKtZx5qw.Aboow6rUrcY2SrFRa46C6uy(objBezslBgjveK3hODH);
            thS1zP5M3X7Ukq3ROlZ87G9I = AeQuqug4cjWl3vY5CUaNGtJ0l.S1zP5M3X7Ukq3ROlZ87G9I(objBezslBgjveK3hODH);
            if (thS1zP5M3X7Ukq3ROlZ87G9I != null) {
                q4FYfLImt1X2.GO8WUug7ZWFCUI1zY = false;
                objBezslBgjveK3hODH = a9kwzoj6d3yoa0;
            }
            arrayList3 = new ArrayList();
            it3 = ((Iterable) objBezslBgjveK3hODH).iterator();
            while (it3.hasNext()) {
                Iterator it6 = it3;
                Object next = it6.next();
                Q4FYfLImt1X q4FYfLImt1X5 = q4FYfLImt1X2;
                zhu5w6ruDywapzKgcV zhu5w6rudywapzkgcv = (zhu5w6ruDywapzKgcV) next;
                List list21 = list4;
                long j32 = j8;
                j18 = y74MyUCLMhd2zBD2Mw8M3.GO8WUug7ZWFCUI1zY;
                long j33 = y74MyUCLMhd2zBD2Mw8M3.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
                jPQQPeCDD0JLCT3aLz = Zo1YEZ6nT2Qsm9uBmmbXR.PQQPeCDD0JLCT3aLz(zhu5w6rudywapzkgcv.axL8FocTDLUdzg0XScbO) + zhu5w6rudywapzkgcv.S1zP5M3X7Ukq3ROlZ87G9I;
                if (j18 > jPQQPeCDD0JLCT3aLz && jPQQPeCDD0JLCT3aLz <= j33) {
                    arrayList3.add(next);
                }
                it3 = it6;
                j8 = j32;
                list4 = list21;
                q4FYfLImt1X2 = q4FYfLImt1X5;
            }
            Q4FYfLImt1X q4FYfLImt1X6 = q4FYfLImt1X2;
            List list22 = list4;
            long j34 = j8;
            size = arrayList3.size();
            for (i7 = 0; i7 < size; i7++) {
                zhu5w6ruDywapzKgcV zhu5w6rudywapzkgcv2 = (zhu5w6ruDywapzKgcV) arrayList3.get(i7);
                list5.add(new UsageReport.Activity(2, i3, 0, zhu5w6rudywapzkgcv2.S1zP5M3X7Ukq3ROlZ87G9I, Zo1YEZ6nT2Qsm9uBmmbXR.PQQPeCDD0JLCT3aLz(zhu5w6rudywapzkgcv2.axL8FocTDLUdzg0XScbO)));
            }
            j5 = j34;
            list2 = list22;
            list7 = list6;
            list = list5;
            q4FYfLImt1X = q4FYfLImt1X6;
            j6 = j11;
            i = i3;
            usageReportUploadWorker = this;
            if (OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(((vN6oJjNAWOkYHUJX) ((stzlAQBLXkK5) usageReportUploadWorker.qaDSpeex0Oo1Qvt3oOrTJnbcQFp.getValue())).cCmbv8Tzd2QLd161ImIZUlZ8n.S1zP5M3X7Ukq3ROlZ87G9I("allow_usage_report_notification_upload"), Boolean.TRUE)) {
                oyNYA2tTXPYTjnSB oynya2ttxpytjnsbWIXlfFpvH7glAGsUk4 = ((Database) mhw63suma8isgb4.getValue()).WIXlfFpvH7glAGsUk3();
                List list110 = (List) cvu91h5WjQasu7vH8q4wQg9.ziNFA7KzVfc6(oynya2ttxpytjnsbWIXlfFpvH7glAGsUk4.S1zP5M3X7Ukq3ROlZ87G9I, true, true, new BwvZOBiCEIFJtYnaz097d(j5, j6, oynya2ttxpytjnsbWIXlfFpvH7glAGsUk4, 1));
                arrayList = new ArrayList(KjpLK4IQzcoI.JY5knQmh7EQJEZ(list110, 10));
                it2 = list110.iterator();
                while (it2.hasNext()) {
                    oe96GFUATOa5 oe96gfuatoa6 = (oe96GFUATOa5) it2.next();
                    rHbvTwvrJMCknMWt2V rhbvtwvrjmcknmwt2v2 = oe96gfuatoa6.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
                    c7wGsGbKcH1sEEIn2uNXXf3 c7wgsgbkch1seein2unxxf4 = oe96gfuatoa6.GO8WUug7ZWFCUI1zY;
                    arrayList.add(new UsageReport.Notification(rhbvtwvrjmcknmwt2v2.cCmbv8Tzd2QLd161ImIZUlZ8n, c7wgsgbkch1seein2unxxf4.WIXlfFpvH7glAGsUk3, c7wgsgbkch1seein2unxxf4.LcvPFGYKhAm4SS5FZ, c7wgsgbkch1seein2unxxf4.qaDSpeex0Oo1Qvt3oOrTJnbcQFp, c7wgsgbkch1seein2unxxf4.qTa7aqjjB9Bt6mc, c7wgsgbkch1seein2unxxf4.f2sXlW3st0rAKJwyOrCfOWc.getAsString(), new Integer(c7wgsgbkch1seein2unxxf4.Mej0x2K4ZGSUxtYNka4QZ), c7wgsgbkch1seein2unxxf4.sCPtafveBAhdLIs2ajN3WV, c7wgsgbkch1seein2unxxf4.iR1XUIc7FjhMl57O));
                    it2 = it2;
                    j4 = j4;
                }
            } else {
                arrayList = a9kwzoj6d3yoa0;
            }
            j12 = j4;
            long j210 = j6;
            j13 = j5;
            while (r0.hasNext()) {
                list.add(new UsageReport.Activity(t3o4r1jmaj4bpo8sdk1tytzzqpe.S1zP5M3X7Ukq3ROlZ87G9I, t3o4r1jmaj4bpo8sdk1tytzzqpe.ziNFA7KzVfc6, t3o4r1jmaj4bpo8sdk1tytzzqpe.Aboow6rUrcY2SrFRa46C6uy, t3o4r1jmaj4bpo8sdk1tytzzqpe.axL8FocTDLUdzg0XScbO, t3o4r1jmaj4bpo8sdk1tytzzqpe.BezslBgjveK3hODH));
            }
            g72QTnntwDS9UTJ g72qtnntwds9utjMej0x2K4ZGSUxtYNka4QZ2 = ((Database) mhw63suma8isgb4.getValue()).Mej0x2K4ZGSUxtYNka4QZ();
            i4 = i;
            List list111 = (List) cvu91h5WjQasu7vH8q4wQg9.ziNFA7KzVfc6(g72qtnntwds9utjMej0x2K4ZGSUxtYNka4QZ2.S1zP5M3X7Ukq3ROlZ87G9I, true, false, new rqAjigHBNnNXGk1aKUqlUvOLCOEc(j13, j210, g72qtnntwds9utjMej0x2K4ZGSUxtYNka4QZ2, 1));
            arrayList2 = new ArrayList(KjpLK4IQzcoI.JY5knQmh7EQJEZ(list111, 10));
            it = list111.iterator();
            while (it.hasNext()) {
                i4R6OERALqwOeabhCa69f i4r6oeralqwoeabhca69f2 = (i4R6OERALqwOeabhCa69f) it.next();
                arrayList2.add(new UsageReport.SurveyResponse(i4r6oeralqwoeabhca69f2.S1zP5M3X7Ukq3ROlZ87G9I.getSerialized(), i4r6oeralqwoeabhca69f2.BezslBgjveK3hODH, i4r6oeralqwoeabhca69f2.axL8FocTDLUdzg0XScbO, i4r6oeralqwoeabhca69f2.ziNFA7KzVfc6, i4r6oeralqwoeabhca69f2.Aboow6rUrcY2SrFRa46C6uy, i4r6oeralqwoeabhca69f2.ox9eclwMpRd, i4r6oeralqwoeabhca69f2.PQQPeCDD0JLCT3aLz, i4r6oeralqwoeabhca69f2.LYcdI4xpry8eXmFC9I4wyaLdcG1z));
                it = it;
                j7 = j7;
            }
            j14 = j7;
            NotificationListener.Companion.getClass();
            notificationListenerS1zP5M3X7Ukq3ROlZ87G9I = OUw39KtIsdT3yYWqqOrKN6.S1zP5M3X7Ukq3ROlZ87G9I();
            if (notificationListenerS1zP5M3X7Ukq3ROlZ87G9I != null) {
                iyJ5Qc4DxtDd1Zs = notificationListenerS1zP5M3X7Ukq3ROlZ87G9I.J1BE9tYH1em4X1uAhc6L7f4M;
            } else {
                iyJ5Qc4DxtDd1Zs = null;
            }
            if (iyJ5Qc4DxtDd1Zs != null) {
                z = true;
            } else {
                z = false;
            }
            z2 = ((zaEQv9uah4s3bhwua8H) ((z1jpZX9STmdA7rDJqTHkX09JG8) usageReportUploadWorker.f2sXlW3st0rAKJwyOrCfOWc.getValue())).ox9eclwMpRd().S1zP5M3X7Ukq3ROlZ87G9I;
            r5 = z2;
            if (z) {
                r5 = (z2 ? 1 : 0) | 2;
            }
            r6 = r5;
            if (((CTid586a2W9uiqX3Zqsu) ((zpNs6MUm6xEe4ualhXrHL) usageReportUploadWorker.cVfIGUKLEqID1HH.getValue())).PQQPeCDD0JLCT3aLz()) {
                r6 = (r5 == true ? 1 : 0) | 8;
            }
            r7 = r6;
            if (q4FYfLImt1X.GO8WUug7ZWFCUI1zY) {
                r7 = (r6 == true ? 1 : 0) | 16;
            }
            r0 = 1048576 | r7;
            eY0AEVFwD2fuPwFF4IzZ2WAQ78 ey0aevfwd2fupwff4izz2waq79 = (eY0AEVFwD2fuPwFF4IzZ2WAQ78) mhw63suma8isgb2.getValue();
            fdnz7zsh9eVar2.Mej0x2K4ZGSUxtYNka4QZ = uuid;
            fdnz7zsh9eVar2.qTa7aqjjB9Bt6mc = null;
            fdnz7zsh9eVar2.f2sXlW3st0rAKJwyOrCfOWc = list2;
            fdnz7zsh9eVar2.iR1XUIc7FjhMl57O = list;
            fdnz7zsh9eVar2.yM5HHkk1MhPLZFYTHm2JjrArud = list7;
            fdnz7zsh9eVar2.FzogU2bPCQtD6a1hMYB1kyti = arrayList;
            fdnz7zsh9eVar2.J1BE9tYH1em4X1uAhc6L7f4M = arrayList2;
            fdnz7zsh9eVar2.WIXlfFpvH7glAGsUk3 = j13;
            fdnz7zsh9eVar2.gsHzEVTj1SCIPR = j14;
            list8 = list;
            list9 = list2;
            fdnz7zsh9eVar2.LcvPFGYKhAm4SS5FZ = j12;
            fdnz7zsh9eVar2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = j210;
            fdnz7zsh9eVar2.tdNmBZIJHG1 = i4;
            fdnz7zsh9eVar2.tzMOyOc53ffl = r0;
            fdnz7zsh9eVar2.yZj7bj6KyeuYi9woqDlC = 3;
            objQl6q60SSx3 = ((kAffANyp2QybsMt) ey0aevfwd2fupwff4izz2waq79).PQQPeCDD0JLCT3aLz.Ql6q60SSx3(fdnz7zsh9eVar2);
            tidtjdok310 = tidtjdok38;
            if (objQl6q60SSx3 != tidtjdok310) {
                objQl6q60SSx3 = s9XnN7QTAJ.S1zP5M3X7Ukq3ROlZ87G9I;
            }
            if (objQl6q60SSx3 == tidtjdok310) {
                return tidtjdok310;
            }
            i5 = r0;
            i6 = i4;
            list10 = arrayList2;
            j15 = j14;
            uuid2 = uuid;
            list11 = list8;
            list12 = list7;
            r42 = arrayList;
            j16 = j13;
            list13 = list9;
            j17 = j12;
        } else {
            if (i11 != 3) {
                uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i5 = fdnz7zsh9eVar2.tzMOyOc53ffl;
            int i15 = fdnz7zsh9eVar2.tdNmBZIJHG1;
            long j35 = fdnz7zsh9eVar2.LcvPFGYKhAm4SS5FZ;
            long j36 = fdnz7zsh9eVar2.gsHzEVTj1SCIPR;
            long j37 = fdnz7zsh9eVar2.WIXlfFpvH7glAGsUk3;
            List list23 = (List) fdnz7zsh9eVar2.J1BE9tYH1em4X1uAhc6L7f4M;
            List list24 = (List) fdnz7zsh9eVar2.FzogU2bPCQtD6a1hMYB1kyti;
            List list25 = fdnz7zsh9eVar2.yM5HHkk1MhPLZFYTHm2JjrArud;
            List list26 = fdnz7zsh9eVar2.iR1XUIc7FjhMl57O;
            List list27 = fdnz7zsh9eVar2.f2sXlW3st0rAKJwyOrCfOWc;
            UUID uuid5 = fdnz7zsh9eVar2.Mej0x2K4ZGSUxtYNka4QZ;
            Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj3);
            list13 = list27;
            j16 = j37;
            r42 = list24;
            list12 = list25;
            i6 = i15;
            list10 = list23;
            mhw63suma8isgb = mhw63suma8isgb5;
            uuid2 = uuid5;
            mhw63suma8isgb2 = mhw63suma8isgb6;
            j17 = j35;
            j15 = j36;
            list11 = list26;
            usageReportUploadWorker = this;
        }
        v1H71pZfvCVU4.Companion.getClass();
        i8 = i5;
        while (r0.hasNext()) {
            z5 = ((kAffANyp2QybsMt) ((eY0AEVFwD2fuPwFF4IzZ2WAQ78) mhw63suma8isgb2.getValue())).S1zP5M3X7Ukq3ROlZ87G9I(v1h71pzfvcvu4) instanceof YwBUKqJjphOMW;
            i9 = v1h71pzfvcvu4.axL8FocTDLUdzg0XScbO;
            if (z5) {
                i8 |= i9;
            }
        }
        pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO = ((xSr1hPBbWjW) ((ptgnZZCKaE4jZ) usageReportUploadWorker.czGAefXQxIZzo.getValue())).axL8FocTDLUdzg0XScbO();
        if (pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO != null) {
            str = pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO.S1zP5M3X7Ukq3ROlZ87G9I;
        } else {
            str = null;
        }
        int i16 = Build.VERSION.SDK_INT;
        String str4 = Build.MANUFACTURER;
        String str5 = Build.MODEL;
        usageReport = new UsageReport(uuid2, j17, j16, j15, i6, str, new Integer(i16), i8, list12, list13, r42, list11, list10);
        if (usageReportUploadWorker.cCmbv8Tzd2QLd161ImIZUlZ8n.get() != -256) {
            return Boolean.FALSE;
        }
        try {
            UE7MkxgXYXfsH uE7MkxgXYXfsH2 = (UE7MkxgXYXfsH) mhw63suma8isgb.getValue();
            QTUUDdYAQaBj qTUUDdYAQaBj2 = new QTUUDdYAQaBj();
            z3 = false;
            try {
                sRgu8ykgdYOnT49j1bPuQWmquU.axL8FocTDLUdzg0XScbO(qTUUDdYAQaBj2, false);
                qTUUDdYAQaBj2.S1zP5M3X7Ukq3ROlZ87G9I("usage-report");
                UE7MkxgXYXfsH.S1zP5M3X7Ukq3ROlZ87G9I((UE7MkxgXYXfsH) mhw63suma8isgb.getValue(), UE7MkxgXYXfsH.axL8FocTDLUdzg0XScbO(uE7MkxgXYXfsH2, qTUUDdYAQaBj2.BezslBgjveK3hODH(), usageReport, UsageReport.Companion.serializer(), null, null, 24), new NyMLDspuxoUZ61buwnujXDamSM0VK(15));
                z4 = true;
            } catch (ServerConnectionException e) {
                e = e;
                Emi5d0VyYZLZtm.Aboow6rUrcY2SrFRa46C6uy(e);
                z4 = z3;
            }
        } catch (ServerConnectionException e2) {
            e = e2;
            z3 = false;
        }
        return Boolean.valueOf(z4);
        j7 = j2;
        W6Cvbh5ibKri8VKtZx5qw.Aboow6rUrcY2SrFRa46C6uy(obj);
        Throwable thS1zP5M3X7Ukq3ROlZ87G9I2 = AeQuqug4cjWl3vY5CUaNGtJ0l.S1zP5M3X7Ukq3ROlZ87G9I(obj);
        if (thS1zP5M3X7Ukq3ROlZ87G9I2 == null) {
            obj2 = obj;
        } else {
            q4FYfLImt1X.GO8WUug7ZWFCUI1zY = false;
            obj2 = a9kwzoj6d3yoa0;
        }
        Iterable iterable = (Iterable) obj2;
        ArrayList arrayList11 = new ArrayList();
        for (Object obj4 : iterable) {
            long j38 = j10;
            XE7YgBVDjBXkAAp xE7YgBVDjBXkAAp = (XE7YgBVDjBXkAAp) obj4;
            long j39 = j4;
            long j40 = y74MyUCLMhd2zBD2Mw8M2.GO8WUug7ZWFCUI1zY;
            long j41 = y74MyUCLMhd2zBD2Mw8M2.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
            long jPQQPeCDD0JLCT3aLz2 = Zo1YEZ6nT2Qsm9uBmmbXR.PQQPeCDD0JLCT3aLz(xE7YgBVDjBXkAAp.BezslBgjveK3hODH) + xE7YgBVDjBXkAAp.axL8FocTDLUdzg0XScbO;
            if (j40 <= jPQQPeCDD0JLCT3aLz2 && jPQQPeCDD0JLCT3aLz2 <= j41) {
                arrayList11.add(obj4);
            }
            j10 = j38;
            j4 = j39;
        }
        long j42 = j10;
        long j43 = j4;
        int size2 = arrayList11.size();
        int i17 = 0;
        while (i17 < size2) {
            Object obj5 = arrayList11.get(i17);
            int i18 = i17 + 1;
            XE7YgBVDjBXkAAp xE7YgBVDjBXkAAp2 = (XE7YgBVDjBXkAAp) obj5;
            int i19 = size2;
            long jPQQPeCDD0JLCT3aLz3 = Zo1YEZ6nT2Qsm9uBmmbXR.PQQPeCDD0JLCT3aLz(xE7YgBVDjBXkAAp2.BezslBgjveK3hODH);
            Integer numValueOf = (-2147483648L > jPQQPeCDD0JLCT3aLz3 || jPQQPeCDD0JLCT3aLz3 > 2147483647L) ? null : Integer.valueOf((int) jPQQPeCDD0JLCT3aLz3);
            UsageReport.Launch launch2 = numValueOf != null ? new UsageReport.Launch(xE7YgBVDjBXkAAp2.S1zP5M3X7Ukq3ROlZ87G9I, null, 9, xE7YgBVDjBXkAAp2.axL8FocTDLUdzg0XScbO, i2, numValueOf.intValue(), 0) : null;
            int i20 = i2;
            if (launch2 != null) {
                list4.add(launch2);
            }
            i17 = i18;
            i2 = i20;
            size2 = i19;
        }
        int i21 = i2;
        w0U8PgpNFLkhFXGnjwC1GUzyF w0u8pgpnflkhfxgnjwc1guzyf2 = (w0U8PgpNFLkhFXGnjwC1GUzyF) mhw63suma8isgb3.getValue();
        fdnz7zsh9eVar2.Mej0x2K4ZGSUxtYNka4QZ = uuid;
        fdnz7zsh9eVar2.qTa7aqjjB9Bt6mc = q4FYfLImt1X;
        fdnz7zsh9eVar2.f2sXlW3st0rAKJwyOrCfOWc = list4;
        fdnz7zsh9eVar2.iR1XUIc7FjhMl57O = list5;
        fdnz7zsh9eVar2.yM5HHkk1MhPLZFYTHm2JjrArud = list3;
        fdnz7zsh9eVar2.FzogU2bPCQtD6a1hMYB1kyti = y74MyUCLMhd2zBD2Mw8M2;
        fdnz7zsh9eVar2.J1BE9tYH1em4X1uAhc6L7f4M = null;
        fdnz7zsh9eVar2.WIXlfFpvH7glAGsUk3 = j8;
        fdnz7zsh9eVar2.gsHzEVTj1SCIPR = j7;
        j4 = j43;
        fdnz7zsh9eVar2.LcvPFGYKhAm4SS5FZ = j4;
        list6 = list3;
        long j44 = j9;
        fdnz7zsh9eVar2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = j44;
        fdnz7zsh9eVar2.tdNmBZIJHG1 = i21;
        j11 = j44;
        fdnz7zsh9eVar2.sCPtafveBAhdLIs2ajN3WV = j42;
        fdnz7zsh9eVar2.yZj7bj6KyeuYi9woqDlC = 2;
        objBezslBgjveK3hODH = ((YbhkWJ1zvclL) w0u8pgpnflkhfxgnjwc1guzyf2).BezslBgjveK3hODH(y74MyUCLMhd2zBD2Mw8M, fdnz7zsh9eVar2);
        tidtjdok38 = tidtjdok39;
        if (objBezslBgjveK3hODH == tidtjdok38) {
            return tidtjdok38;
        }
        Q4FYfLImt1X q4FYfLImt1X7 = q4FYfLImt1X;
        y74MyUCLMhd2zBD2Mw8M3 = y74MyUCLMhd2zBD2Mw8M2;
        q4FYfLImt1X2 = q4FYfLImt1X7;
        i3 = i21;
        W6Cvbh5ibKri8VKtZx5qw.Aboow6rUrcY2SrFRa46C6uy(objBezslBgjveK3hODH);
        thS1zP5M3X7Ukq3ROlZ87G9I = AeQuqug4cjWl3vY5CUaNGtJ0l.S1zP5M3X7Ukq3ROlZ87G9I(objBezslBgjveK3hODH);
        if (thS1zP5M3X7Ukq3ROlZ87G9I != null) {
            q4FYfLImt1X2.GO8WUug7ZWFCUI1zY = false;
            objBezslBgjveK3hODH = a9kwzoj6d3yoa0;
        }
        arrayList3 = new ArrayList();
        it3 = ((Iterable) objBezslBgjveK3hODH).iterator();
        while (it3.hasNext()) {
            Iterator it7 = it3;
            Object next2 = it7.next();
            Q4FYfLImt1X q4FYfLImt1X8 = q4FYfLImt1X2;
            zhu5w6ruDywapzKgcV zhu5w6rudywapzkgcv3 = (zhu5w6ruDywapzKgcV) next2;
            List list28 = list4;
            long j310 = j8;
            j18 = y74MyUCLMhd2zBD2Mw8M3.GO8WUug7ZWFCUI1zY;
            long j311 = y74MyUCLMhd2zBD2Mw8M3.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
            jPQQPeCDD0JLCT3aLz = Zo1YEZ6nT2Qsm9uBmmbXR.PQQPeCDD0JLCT3aLz(zhu5w6rudywapzkgcv3.axL8FocTDLUdzg0XScbO) + zhu5w6rudywapzkgcv3.S1zP5M3X7Ukq3ROlZ87G9I;
            if (j18 > jPQQPeCDD0JLCT3aLz) {
            }
            it3 = it7;
            j8 = j310;
            list4 = list28;
            q4FYfLImt1X2 = q4FYfLImt1X8;
        }
        Q4FYfLImt1X q4FYfLImt1X9 = q4FYfLImt1X2;
        List list29 = list4;
        long j312 = j8;
        size = arrayList3.size();
        while (i7 < size) {
            zhu5w6ruDywapzKgcV zhu5w6rudywapzkgcv4 = (zhu5w6ruDywapzKgcV) arrayList3.get(i7);
            list5.add(new UsageReport.Activity(2, i3, 0, zhu5w6rudywapzkgcv4.S1zP5M3X7Ukq3ROlZ87G9I, Zo1YEZ6nT2Qsm9uBmmbXR.PQQPeCDD0JLCT3aLz(zhu5w6rudywapzkgcv4.axL8FocTDLUdzg0XScbO)));
        }
        j5 = j312;
        list2 = list29;
        list7 = list6;
        list = list5;
        q4FYfLImt1X = q4FYfLImt1X9;
        j6 = j11;
        i = i3;
        usageReportUploadWorker = this;
        if (OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(((vN6oJjNAWOkYHUJX) ((stzlAQBLXkK5) usageReportUploadWorker.qaDSpeex0Oo1Qvt3oOrTJnbcQFp.getValue())).cCmbv8Tzd2QLd161ImIZUlZ8n.S1zP5M3X7Ukq3ROlZ87G9I("allow_usage_report_notification_upload"), Boolean.TRUE)) {
            oyNYA2tTXPYTjnSB oynya2ttxpytjnsbWIXlfFpvH7glAGsUk5 = ((Database) mhw63suma8isgb4.getValue()).WIXlfFpvH7glAGsUk3();
            List list112 = (List) cvu91h5WjQasu7vH8q4wQg9.ziNFA7KzVfc6(oynya2ttxpytjnsbWIXlfFpvH7glAGsUk5.S1zP5M3X7Ukq3ROlZ87G9I, true, true, new BwvZOBiCEIFJtYnaz097d(j5, j6, oynya2ttxpytjnsbWIXlfFpvH7glAGsUk5, 1));
            arrayList = new ArrayList(KjpLK4IQzcoI.JY5knQmh7EQJEZ(list112, 10));
            it2 = list112.iterator();
            while (it2.hasNext()) {
                oe96GFUATOa5 oe96gfuatoa7 = (oe96GFUATOa5) it2.next();
                rHbvTwvrJMCknMWt2V rhbvtwvrjmcknmwt2v3 = oe96gfuatoa7.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
                c7wGsGbKcH1sEEIn2uNXXf3 c7wgsgbkch1seein2unxxf5 = oe96gfuatoa7.GO8WUug7ZWFCUI1zY;
                arrayList.add(new UsageReport.Notification(rhbvtwvrjmcknmwt2v3.cCmbv8Tzd2QLd161ImIZUlZ8n, c7wgsgbkch1seein2unxxf5.WIXlfFpvH7glAGsUk3, c7wgsgbkch1seein2unxxf5.LcvPFGYKhAm4SS5FZ, c7wgsgbkch1seein2unxxf5.qaDSpeex0Oo1Qvt3oOrTJnbcQFp, c7wgsgbkch1seein2unxxf5.qTa7aqjjB9Bt6mc, c7wgsgbkch1seein2unxxf5.f2sXlW3st0rAKJwyOrCfOWc.getAsString(), new Integer(c7wgsgbkch1seein2unxxf5.Mej0x2K4ZGSUxtYNka4QZ), c7wgsgbkch1seein2unxxf5.sCPtafveBAhdLIs2ajN3WV, c7wgsgbkch1seein2unxxf5.iR1XUIc7FjhMl57O));
                it2 = it2;
                j4 = j4;
            }
        } else {
            arrayList = a9kwzoj6d3yoa0;
        }
        j12 = j4;
        long j211 = j6;
        j13 = j5;
        while (r0.hasNext()) {
            list.add(new UsageReport.Activity(t3o4r1jmaj4bpo8sdk1tytzzqpe.S1zP5M3X7Ukq3ROlZ87G9I, t3o4r1jmaj4bpo8sdk1tytzzqpe.ziNFA7KzVfc6, t3o4r1jmaj4bpo8sdk1tytzzqpe.Aboow6rUrcY2SrFRa46C6uy, t3o4r1jmaj4bpo8sdk1tytzzqpe.axL8FocTDLUdzg0XScbO, t3o4r1jmaj4bpo8sdk1tytzzqpe.BezslBgjveK3hODH));
        }
        g72QTnntwDS9UTJ g72qtnntwds9utjMej0x2K4ZGSUxtYNka4QZ3 = ((Database) mhw63suma8isgb4.getValue()).Mej0x2K4ZGSUxtYNka4QZ();
        i4 = i;
        List list113 = (List) cvu91h5WjQasu7vH8q4wQg9.ziNFA7KzVfc6(g72qtnntwds9utjMej0x2K4ZGSUxtYNka4QZ3.S1zP5M3X7Ukq3ROlZ87G9I, true, false, new rqAjigHBNnNXGk1aKUqlUvOLCOEc(j13, j211, g72qtnntwds9utjMej0x2K4ZGSUxtYNka4QZ3, 1));
        arrayList2 = new ArrayList(KjpLK4IQzcoI.JY5knQmh7EQJEZ(list113, 10));
        it = list113.iterator();
        while (it.hasNext()) {
            i4R6OERALqwOeabhCa69f i4r6oeralqwoeabhca69f3 = (i4R6OERALqwOeabhCa69f) it.next();
            arrayList2.add(new UsageReport.SurveyResponse(i4r6oeralqwoeabhca69f3.S1zP5M3X7Ukq3ROlZ87G9I.getSerialized(), i4r6oeralqwoeabhca69f3.BezslBgjveK3hODH, i4r6oeralqwoeabhca69f3.axL8FocTDLUdzg0XScbO, i4r6oeralqwoeabhca69f3.ziNFA7KzVfc6, i4r6oeralqwoeabhca69f3.Aboow6rUrcY2SrFRa46C6uy, i4r6oeralqwoeabhca69f3.ox9eclwMpRd, i4r6oeralqwoeabhca69f3.PQQPeCDD0JLCT3aLz, i4r6oeralqwoeabhca69f3.LYcdI4xpry8eXmFC9I4wyaLdcG1z));
            it = it;
            j7 = j7;
        }
        j14 = j7;
        NotificationListener.Companion.getClass();
        notificationListenerS1zP5M3X7Ukq3ROlZ87G9I = OUw39KtIsdT3yYWqqOrKN6.S1zP5M3X7Ukq3ROlZ87G9I();
        if (notificationListenerS1zP5M3X7Ukq3ROlZ87G9I != null) {
            iyJ5Qc4DxtDd1Zs = notificationListenerS1zP5M3X7Ukq3ROlZ87G9I.J1BE9tYH1em4X1uAhc6L7f4M;
        } else {
            iyJ5Qc4DxtDd1Zs = null;
        }
        if (iyJ5Qc4DxtDd1Zs != null) {
            z = true;
        } else {
            z = false;
        }
        z2 = ((zaEQv9uah4s3bhwua8H) ((z1jpZX9STmdA7rDJqTHkX09JG8) usageReportUploadWorker.f2sXlW3st0rAKJwyOrCfOWc.getValue())).ox9eclwMpRd().S1zP5M3X7Ukq3ROlZ87G9I;
        r5 = z2;
        if (z) {
            r5 = (z2 ? 1 : 0) | 2;
        }
        r6 = r5;
        if (((CTid586a2W9uiqX3Zqsu) ((zpNs6MUm6xEe4ualhXrHL) usageReportUploadWorker.cVfIGUKLEqID1HH.getValue())).PQQPeCDD0JLCT3aLz()) {
            r6 = (r5 == true ? 1 : 0) | 8;
        }
        r7 = r6;
        if (q4FYfLImt1X.GO8WUug7ZWFCUI1zY) {
            r7 = (r6 == true ? 1 : 0) | 16;
        }
        r0 = 1048576 | r7;
        eY0AEVFwD2fuPwFF4IzZ2WAQ78 ey0aevfwd2fupwff4izz2waq710 = (eY0AEVFwD2fuPwFF4IzZ2WAQ78) mhw63suma8isgb2.getValue();
        fdnz7zsh9eVar2.Mej0x2K4ZGSUxtYNka4QZ = uuid;
        fdnz7zsh9eVar2.qTa7aqjjB9Bt6mc = null;
        fdnz7zsh9eVar2.f2sXlW3st0rAKJwyOrCfOWc = list2;
        fdnz7zsh9eVar2.iR1XUIc7FjhMl57O = list;
        fdnz7zsh9eVar2.yM5HHkk1MhPLZFYTHm2JjrArud = list7;
        fdnz7zsh9eVar2.FzogU2bPCQtD6a1hMYB1kyti = arrayList;
        fdnz7zsh9eVar2.J1BE9tYH1em4X1uAhc6L7f4M = arrayList2;
        fdnz7zsh9eVar2.WIXlfFpvH7glAGsUk3 = j13;
        fdnz7zsh9eVar2.gsHzEVTj1SCIPR = j14;
        list8 = list;
        list9 = list2;
        fdnz7zsh9eVar2.LcvPFGYKhAm4SS5FZ = j12;
        fdnz7zsh9eVar2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = j211;
        fdnz7zsh9eVar2.tdNmBZIJHG1 = i4;
        fdnz7zsh9eVar2.tzMOyOc53ffl = r0;
        fdnz7zsh9eVar2.yZj7bj6KyeuYi9woqDlC = 3;
        objQl6q60SSx3 = ((kAffANyp2QybsMt) ey0aevfwd2fupwff4izz2waq710).PQQPeCDD0JLCT3aLz.Ql6q60SSx3(fdnz7zsh9eVar2);
        tidtjdok310 = tidtjdok38;
        if (objQl6q60SSx3 != tidtjdok310) {
            objQl6q60SSx3 = s9XnN7QTAJ.S1zP5M3X7Ukq3ROlZ87G9I;
        }
        if (objQl6q60SSx3 == tidtjdok310) {
            return tidtjdok310;
        }
        i5 = r0;
        i6 = i4;
        list10 = arrayList2;
        j15 = j14;
        uuid2 = uuid;
        list11 = list8;
        list12 = list7;
        r42 = arrayList;
        j16 = j13;
        list13 = list9;
        j17 = j12;
        v1H71pZfvCVU4.Companion.getClass();
        i8 = i5;
        while (r0.hasNext()) {
            z5 = ((kAffANyp2QybsMt) ((eY0AEVFwD2fuPwFF4IzZ2WAQ78) mhw63suma8isgb2.getValue())).S1zP5M3X7Ukq3ROlZ87G9I(v1h71pzfvcvu4) instanceof YwBUKqJjphOMW;
            i9 = v1h71pzfvcvu4.axL8FocTDLUdzg0XScbO;
            if (z5) {
                i8 |= i9;
            }
        }
        pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO = ((xSr1hPBbWjW) ((ptgnZZCKaE4jZ) usageReportUploadWorker.czGAefXQxIZzo.getValue())).axL8FocTDLUdzg0XScbO();
        if (pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO != null) {
            str = pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO.S1zP5M3X7Ukq3ROlZ87G9I;
        } else {
            str = null;
        }
        int i110 = Build.VERSION.SDK_INT;
        String str6 = Build.MANUFACTURER;
        String str7 = Build.MODEL;
        usageReport = new UsageReport(uuid2, j17, j16, j15, i6, str, new Integer(i110), i8, list12, list13, r42, list11, list10);
        if (usageReportUploadWorker.cCmbv8Tzd2QLd161ImIZUlZ8n.get() != -256) {
            return Boolean.FALSE;
        }
        UE7MkxgXYXfsH uE7MkxgXYXfsH3 = (UE7MkxgXYXfsH) mhw63suma8isgb.getValue();
        QTUUDdYAQaBj qTUUDdYAQaBj3 = new QTUUDdYAQaBj();
        z3 = false;
        sRgu8ykgdYOnT49j1bPuQWmquU.axL8FocTDLUdzg0XScbO(qTUUDdYAQaBj3, false);
        qTUUDdYAQaBj3.S1zP5M3X7Ukq3ROlZ87G9I("usage-report");
        UE7MkxgXYXfsH.S1zP5M3X7Ukq3ROlZ87G9I((UE7MkxgXYXfsH) mhw63suma8isgb.getValue(), UE7MkxgXYXfsH.axL8FocTDLUdzg0XScbO(uE7MkxgXYXfsH3, qTUUDdYAQaBj3.BezslBgjveK3hODH(), usageReport, UsageReport.Companion.serializer(), null, null, 24), new NyMLDspuxoUZ61buwnujXDamSM0VK(15));
        z4 = true;
        return Boolean.valueOf(z4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // bitpit.launcher.core.LauncherWorker
    public final Object ziNFA7KzVfc6(bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) throws Throwable {
        MO8X3Df5DMAnakA6Of3Uxzy mO8X3Df5DMAnakA6Of3Uxzy;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof MO8X3Df5DMAnakA6Of3Uxzy) {
            mO8X3Df5DMAnakA6Of3Uxzy = (MO8X3Df5DMAnakA6Of3Uxzy) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i = mO8X3Df5DMAnakA6Of3Uxzy.LcvPFGYKhAm4SS5FZ;
            if ((i & Integer.MIN_VALUE) != 0) {
                mO8X3Df5DMAnakA6Of3Uxzy.LcvPFGYKhAm4SS5FZ = i - Integer.MIN_VALUE;
            } else {
                mO8X3Df5DMAnakA6Of3Uxzy = new MO8X3Df5DMAnakA6Of3Uxzy(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            mO8X3Df5DMAnakA6Of3Uxzy = new MO8X3Df5DMAnakA6Of3Uxzy(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        Object objJY5knQmh7EQJEZ = mO8X3Df5DMAnakA6Of3Uxzy.WIXlfFpvH7glAGsUk3;
        int i2 = mO8X3Df5DMAnakA6Of3Uxzy.LcvPFGYKhAm4SS5FZ;
        if (i2 == 0) {
            Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objJY5knQmh7EQJEZ);
            PeLieoBN4yxYJZju3kQtKIsq7XL8 peLieoBN4yxYJZju3kQtKIsq7XL8 = NMquq9o0FvRs5RyiTFrS.S1zP5M3X7Ukq3ROlZ87G9I;
            x4PcPRPmslEJW x4pcprpmslejw = x4PcPRPmslEJW.cCmbv8Tzd2QLd161ImIZUlZ8n;
            v6AbqsUKKmmrd2I v6abqsukkmmrd2i = new v6AbqsUKKmmrd2I(this, null, 2);
            mO8X3Df5DMAnakA6Of3Uxzy.LcvPFGYKhAm4SS5FZ = 1;
            objJY5knQmh7EQJEZ = rbpFGdpgDCAQXat.JY5knQmh7EQJEZ(x4pcprpmslejw, v6abqsukkmmrd2i, mO8X3Df5DMAnakA6Of3Uxzy);
            tIDTjdoK38 tidtjdok38 = tIDTjdoK38.GO8WUug7ZWFCUI1zY;
            if (objJY5knQmh7EQJEZ == tidtjdok38) {
                return tidtjdok38;
            }
        } else {
            if (i2 != 1) {
                uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objJY5knQmh7EQJEZ);
        }
        return objJY5knQmh7EQJEZ;
    }
}
