package bitpit.launcher.niagarald;

import android.content.Context;
import androidx.work.WorkerParameters;
import b.Hnv6Te9rrTA0VqZMo;
import b.NMquq9o0FvRs5RyiTFrS;
import b.PeLieoBN4yxYJZju3kQtKIsq7XL8;
import b.bMjZFECsuU6MdmSOqmYrlYsV3oEeB;
import b.iG3sZbbi1nuA8YAuTWsV8I6yCqK;
import b.mHW63SUma8isGb;
import b.pE6zh38jZw;
import b.qSDYaDqxbBy2QEeVAcFRy;
import b.rbpFGdpgDCAQXat;
import b.sObxz7BEKthx6w3VX5;
import b.tIDTjdoK38;
import b.uuyTGGFjNDiF1SxHW;
import b.vOL3U3fINHMmdVoJz;
import b.x4PcPRPmslEJW;
import bitpit.launcher.core.LauncherWorker;

/* JADX INFO: loaded from: classes.dex */
public final class RefreshNiagaraldUserDataWorker extends LauncherWorker {
    public final mHW63SUma8isGb Mej0x2K4ZGSUxtYNka4QZ;
    public final mHW63SUma8isGb qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
    public final mHW63SUma8isGb sCPtafveBAhdLIs2ajN3WV;

    public RefreshNiagaraldUserDataWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new iG3sZbbi1nuA8YAuTWsV8I6yCqK(this, 7));
        this.sCPtafveBAhdLIs2ajN3WV = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new iG3sZbbi1nuA8YAuTWsV8I6yCqK(this, 8));
        this.Mej0x2K4ZGSUxtYNka4QZ = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new iG3sZbbi1nuA8YAuTWsV8I6yCqK(this, 9));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // bitpit.launcher.core.LauncherWorker
    public final Object ziNFA7KzVfc6(bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) throws Throwable {
        sObxz7BEKthx6w3VX5 sobxz7bekthx6w3vx5;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof sObxz7BEKthx6w3VX5) {
            sobxz7bekthx6w3vx5 = (sObxz7BEKthx6w3VX5) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i = sobxz7bekthx6w3vx5.LcvPFGYKhAm4SS5FZ;
            if ((i & Integer.MIN_VALUE) != 0) {
                sobxz7bekthx6w3vx5.LcvPFGYKhAm4SS5FZ = i - Integer.MIN_VALUE;
            } else {
                sobxz7bekthx6w3vx5 = new sObxz7BEKthx6w3VX5(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            sobxz7bekthx6w3vx5 = new sObxz7BEKthx6w3VX5(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        Object objJY5knQmh7EQJEZ = sobxz7bekthx6w3vx5.WIXlfFpvH7glAGsUk3;
        int i2 = sobxz7bekthx6w3vx5.LcvPFGYKhAm4SS5FZ;
        vOL3U3fINHMmdVoJz vol3u3finhmmdvojz = null;
        if (i2 == 0) {
            Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objJY5knQmh7EQJEZ);
            PeLieoBN4yxYJZju3kQtKIsq7XL8 peLieoBN4yxYJZju3kQtKIsq7XL8 = NMquq9o0FvRs5RyiTFrS.S1zP5M3X7Ukq3ROlZ87G9I;
            x4PcPRPmslEJW x4pcprpmslejw = x4PcPRPmslEJW.cCmbv8Tzd2QLd161ImIZUlZ8n;
            pE6zh38jZw pe6zh38jzw = new pE6zh38jZw(this, vol3u3finhmmdvojz, 13);
            sobxz7bekthx6w3vx5.LcvPFGYKhAm4SS5FZ = 1;
            objJY5knQmh7EQJEZ = rbpFGdpgDCAQXat.JY5knQmh7EQJEZ(x4pcprpmslejw, pe6zh38jzw, sobxz7bekthx6w3vx5);
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
