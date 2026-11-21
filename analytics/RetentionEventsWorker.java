package bitpit.launcher.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.WorkerParameters;
import b.GZnU2p3i2qStYb;
import b.Hnv6Te9rrTA0VqZMo;
import b.JHnppaRJDZMMWaOU5cgIw;
import b.KjpLK4IQzcoI;
import b.NMquq9o0FvRs5RyiTFrS;
import b.PeLieoBN4yxYJZju3kQtKIsq7XL8;
import b.XQCixPMPkXDW6;
import b.bMjZFECsuU6MdmSOqmYrlYsV3oEeB;
import b.d6qU99jNxmihv;
import b.iG3sZbbi1nuA8YAuTWsV8I6yCqK;
import b.iXYuiKB6hlvuKua28Q9sCxO11f;
import b.mHW63SUma8isGb;
import b.mpoEYsfPpp7vqQovIE5OHvd;
import b.pE6zh38jZw;
import b.qEwqqDvm9wKfnhETPc16M;
import b.qSDYaDqxbBy2QEeVAcFRy;
import b.rbpFGdpgDCAQXat;
import b.tIDTjdoK38;
import b.uuyTGGFjNDiF1SxHW;
import b.vOL3U3fINHMmdVoJz;
import b.x4PcPRPmslEJW;
import bitpit.launcher.core.LauncherWorker;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class RetentionEventsWorker extends LauncherWorker {
    public static final d6qU99jNxmihv Companion;
    public static final /* synthetic */ GZnU2p3i2qStYb[] iR1XUIc7FjhMl57O;
    public static final List yM5HHkk1MhPLZFYTHm2JjrArud;
    public final mHW63SUma8isGb Mej0x2K4ZGSUxtYNka4QZ;
    public final XQCixPMPkXDW6 f2sXlW3st0rAKJwyOrCfOWc;
    public final mHW63SUma8isGb qTa7aqjjB9Bt6mc;
    public final mHW63SUma8isGb qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
    public final mHW63SUma8isGb sCPtafveBAhdLIs2ajN3WV;

    static {
        qEwqqDvm9wKfnhETPc16M qewqqdvm9wkfnhetpc16m = new qEwqqDvm9wKfnhETPc16M(RetentionEventsWorker.class, "lastLoggedRetentionDay", "getLastLoggedRetentionDay()I", 0);
        JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I.getClass();
        iR1XUIc7FjhMl57O = new GZnU2p3i2qStYb[]{qewqqdvm9wkfnhetpc16m};
        Companion = new d6qU99jNxmihv();
        yM5HHkk1MhPLZFYTHm2JjrArud = KjpLK4IQzcoI.H5sQ15nhYoaKKHhx(1, 2, 3, 30, 90);
    }

    public RetentionEventsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new iG3sZbbi1nuA8YAuTWsV8I6yCqK(this, 10));
        mHW63SUma8isGb mhw63suma8isgbAboow6rUrcY2SrFRa46C6uy = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new iG3sZbbi1nuA8YAuTWsV8I6yCqK(this, 11));
        this.sCPtafveBAhdLIs2ajN3WV = mhw63suma8isgbAboow6rUrcY2SrFRa46C6uy;
        this.Mej0x2K4ZGSUxtYNka4QZ = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new iG3sZbbi1nuA8YAuTWsV8I6yCqK(this, 12));
        this.qTa7aqjjB9Bt6mc = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new iG3sZbbi1nuA8YAuTWsV8I6yCqK(this, 13));
        this.f2sXlW3st0rAKJwyOrCfOWc = iXYuiKB6hlvuKua28Q9sCxO11f.axL8FocTDLUdzg0XScbO((SharedPreferences) mhw63suma8isgbAboow6rUrcY2SrFRa46C6uy.getValue(), "bitpit.launcher.key.LAST_LOGGED_RETENTION_DAY", 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // bitpit.launcher.core.LauncherWorker
    public final Object ziNFA7KzVfc6(bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) throws Throwable {
        mpoEYsfPpp7vqQovIE5OHvd mpoeysfppp7vqqovie5ohvd;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof mpoEYsfPpp7vqQovIE5OHvd) {
            mpoeysfppp7vqqovie5ohvd = (mpoEYsfPpp7vqQovIE5OHvd) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i = mpoeysfppp7vqqovie5ohvd.LcvPFGYKhAm4SS5FZ;
            if ((i & Integer.MIN_VALUE) != 0) {
                mpoeysfppp7vqqovie5ohvd.LcvPFGYKhAm4SS5FZ = i - Integer.MIN_VALUE;
            } else {
                mpoeysfppp7vqqovie5ohvd = new mpoEYsfPpp7vqQovIE5OHvd(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            mpoeysfppp7vqqovie5ohvd = new mpoEYsfPpp7vqQovIE5OHvd(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        Object objJY5knQmh7EQJEZ = mpoeysfppp7vqqovie5ohvd.WIXlfFpvH7glAGsUk3;
        int i2 = mpoeysfppp7vqqovie5ohvd.LcvPFGYKhAm4SS5FZ;
        vOL3U3fINHMmdVoJz vol3u3finhmmdvojz = null;
        if (i2 == 0) {
            Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objJY5knQmh7EQJEZ);
            PeLieoBN4yxYJZju3kQtKIsq7XL8 peLieoBN4yxYJZju3kQtKIsq7XL8 = NMquq9o0FvRs5RyiTFrS.S1zP5M3X7Ukq3ROlZ87G9I;
            x4PcPRPmslEJW x4pcprpmslejw = x4PcPRPmslEJW.cCmbv8Tzd2QLd161ImIZUlZ8n;
            pE6zh38jZw pe6zh38jzw = new pE6zh38jZw(this, vol3u3finhmmdvojz, 15);
            mpoeysfppp7vqqovie5ohvd.LcvPFGYKhAm4SS5FZ = 1;
            objJY5knQmh7EQJEZ = rbpFGdpgDCAQXat.JY5knQmh7EQJEZ(x4pcprpmslejw, pe6zh38jzw, mpoeysfppp7vqqovie5ohvd);
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
