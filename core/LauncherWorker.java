package bitpit.launcher.core;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import b.FAcOmIkfv5ix8sNJsaM6iT;
import b.Hnv6Te9rrTA0VqZMo;
import b.NMquq9o0FvRs5RyiTFrS;
import b.PeLieoBN4yxYJZju3kQtKIsq7XL8;
import b.amndRZ6ZiSy4ZOFMYy0W;
import b.bMjZFECsuU6MdmSOqmYrlYsV3oEeB;
import b.fhSNm7dhXpC9W6pfm4CfVlFNDgpq;
import b.hz8gXL0MSZdMP;
import b.lkiaEDM5lpT;
import b.pXynlL6SZmXt4dK1Q;
import b.rbpFGdpgDCAQXat;
import b.t97QynDSclYrfM0cEoP4dfDO;
import b.tIDTjdoK38;
import b.uuyTGGFjNDiF1SxHW;
import b.vOL3U3fINHMmdVoJz;

/* JADX INFO: loaded from: classes.dex */
public abstract class LauncherWorker extends CoroutineWorker implements lkiaEDM5lpT {
    public LauncherWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object BezslBgjveK3hODH(bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) {
        t97QynDSclYrfM0cEoP4dfDO t97qyndsclyrfm0ceop4dfdo;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof t97QynDSclYrfM0cEoP4dfDO) {
            t97qyndsclyrfm0ceop4dfdo = (t97QynDSclYrfM0cEoP4dfDO) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i = t97qyndsclyrfm0ceop4dfdo.LcvPFGYKhAm4SS5FZ;
            if ((i & Integer.MIN_VALUE) != 0) {
                t97qyndsclyrfm0ceop4dfdo.LcvPFGYKhAm4SS5FZ = i - Integer.MIN_VALUE;
            } else {
                t97qyndsclyrfm0ceop4dfdo = new t97QynDSclYrfM0cEoP4dfDO(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            t97qyndsclyrfm0ceop4dfdo = new t97QynDSclYrfM0cEoP4dfDO(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        Object obj = t97qyndsclyrfm0ceop4dfdo.WIXlfFpvH7glAGsUk3;
        int i2 = t97qyndsclyrfm0ceop4dfdo.LcvPFGYKhAm4SS5FZ;
        vOL3U3fINHMmdVoJz vol3u3finhmmdvojz = null;
        int i3 = 2;
        Object obj2 = tIDTjdoK38.GO8WUug7ZWFCUI1zY;
        if (i2 == 0) {
            Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
            PeLieoBN4yxYJZju3kQtKIsq7XL8 peLieoBN4yxYJZju3kQtKIsq7XL8 = NMquq9o0FvRs5RyiTFrS.S1zP5M3X7Ukq3ROlZ87G9I;
            FAcOmIkfv5ix8sNJsaM6iT fAcOmIkfv5ix8sNJsaM6iT = amndRZ6ZiSy4ZOFMYy0W.S1zP5M3X7Ukq3ROlZ87G9I;
            hz8gXL0MSZdMP hz8gxl0mszdmp = new hz8gXL0MSZdMP(this, vol3u3finhmmdvojz, i3);
            t97qyndsclyrfm0ceop4dfdo.LcvPFGYKhAm4SS5FZ = 1;
            if (rbpFGdpgDCAQXat.JY5knQmh7EQJEZ(fAcOmIkfv5ix8sNJsaM6iT, hz8gxl0mszdmp, t97qyndsclyrfm0ceop4dfdo) != obj2) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
                return obj;
            }
            uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
        t97qyndsclyrfm0ceop4dfdo.LcvPFGYKhAm4SS5FZ = 2;
        Object objZiNFA7KzVfc6 = ziNFA7KzVfc6(t97qyndsclyrfm0ceop4dfdo);
        return objZiNFA7KzVfc6 == obj2 ? obj2 : objZiNFA7KzVfc6;
    }

    @Override // b.lkiaEDM5lpT
    public final /* bridge */ pXynlL6SZmXt4dK1Q getKoin() {
        return fhSNm7dhXpC9W6pfm4CfVlFNDgpq.axL8FocTDLUdzg0XScbO();
    }

    public abstract Object ziNFA7KzVfc6(bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb);
}
