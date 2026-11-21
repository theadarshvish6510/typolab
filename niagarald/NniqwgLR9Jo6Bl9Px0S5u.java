package bitpit.launcher.niagarald;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import b.AdoBuEHLsY;
import b.AeQuqug4cjWl3vY5CUaNGtJ0l;
import b.B4VuABB1m6ytu26MxoUBytPiQ;
import b.Bul0eKPbYgOsdDtCanEKYj20;
import b.CJI9fJNh1Q2PBYQKjHaT4Ef4H;
import b.CJMcI4a6x01TSJBmvdZtLpc;
import b.DZXdSyEzUhQZ7Xn8;
import b.DgVNcEV9XmhNPNS4qVNd;
import b.DqzIs39qhlX8it8XteO;
import b.E1vQSmAuo4MQHsMm;
import b.Emi5d0VyYZLZtm;
import b.ExfviZSyLb6NqRatU;
import b.FAcOmIkfv5ix8sNJsaM6iT;
import b.G7lapk01c8Qj9rz59i;
import b.GiFxY9WDHrWlHPyoti;
import b.HnW1ODcJQZf9Rt7okcoWsDS;
import b.Hnv6Te9rrTA0VqZMo;
import b.Iol76NSeORZn3oKb4C49HtqjkRhNL;
import b.J7Tsg1eqTfbK8vIo4RFOyjPiu;
import b.K7Yl5bhSoiualwU2G89VGiJTS;
import b.Ka8INCBqfwCeAoFT4mw74QJG;
import b.L2LA4UZY6TFARndeYyO8MldsoOIm;
import b.LJmIWKCOd33Br;
import b.LpRXf8zsxndinAW3;
import b.M09PCcKE8f3p5upL5YjVWVv;
import b.NMquq9o0FvRs5RyiTFrS;
import b.NrAPIWeT5aG2qCTyQxy550YaK;
import b.O6lZlYscUJqRKM;
import b.OkhdZkC3NYLW;
import b.PeLieoBN4yxYJZju3kQtKIsq7XL8;
import b.PyaABL8uMuLgCjJcfM;
import b.QTUUDdYAQaBj;
import b.Rfp0CprLjJaYY8aiYk;
import b.SJcHSjzDzq3QX10c;
import b.T6IajJ3vOYOMX8I8;
import b.T7bLXYJFPi0Yphv7AcXMz4qeX;
import b.TpmtxzzffNctZqQnPBhD;
import b.UE7MkxgXYXfsH;
import b.UOdbn0BbqEbVKpITLTOKPLNI;
import b.XmacCNxiXPR0cfyyx756Yz;
import b.ZEglJWpYNlWl;
import b.Zus6J6a6yEd4hDe6wgCNYv;
import b.a05MjsTtylUXo;
import b.aJLiMmqfPh61r;
import b.aNONfmXWW0uqauI17bnoBjg;
import b.amndRZ6ZiSy4ZOFMYy0W;
import b.b39QtV1GMvoIl;
import b.bMjZFECsuU6MdmSOqmYrlYsV3oEeB;
import b.bwfdobG5WIUWeudrECajr;
import b.cdjHGKliASEP50WE;
import b.dmS6wyHAG6gvZAivjtzncxH1NYIQ;
import b.g3Qz0j6vVi8z5QcL;
import b.gHV1nNWnRM13P;
import b.gMyMutkofs;
import b.gbloYmVPghjTo5;
import b.gv5ryUbldVFoNt;
import b.hXkXXj9pcUCh;
import b.iHPHZIrmzz0Nhav1OcnsAYxx7Sm1;
import b.ihaOqtO8vhfVeT5tdIPOEGawOKH;
import b.jeiWptqnGk3ia;
import b.kFiAqAMnNGuF0jddbuIE;
import b.kYpdCL1nl75iKYHfZA;
import b.lGu4hbqDeY14JtrULY2Bza9Y;
import b.m6VeYiMqnaBahF88nkY76Vf;
import b.mkeB609Q34mPahD;
import b.otD5bQR0LtT;
import b.pijs62HGGnGxq0xD0cXq;
import b.ptgnZZCKaE4jZ;
import b.rbpFGdpgDCAQXat;
import b.s9XnN7QTAJ;
import b.sRgu8ykgdYOnT49j1bPuQWmquU;
import b.tIDTjdoK38;
import b.tRh8nLx7q1GvbQd;
import b.tgMet9jM9GcEKx69Vk37kbMAN;
import b.uuyTGGFjNDiF1SxHW;
import b.vPv6XGKAxAxSJlqmIbMY;
import b.vv6HiZyCYq6R;
import b.w7Rv7Ji0PyiNFA0okBo59Ev1J;
import b.wFIO6q9fiuz1bTK;
import b.wrz9Uvn4UHMfMyrKHE1X8T3q;
import b.x4PcPRPmslEJW;
import b.xNthAUu9aBYOvIzNXbI;
import b.xSr1hPBbWjW;
import b.xWEvOc3gqLSn1SXDt2GvNO3HGucdx;
import b.xxuAhbXqLMelne8pXLi;
import b.ycFnS0z9Ddi2h4oSFO3lrkbjZ0cm8;
import b.zHfG9eBtghieLBn;
import b.zmCoJh1USrJrRRZYOd98SBr;
import b.zvrDNoSsQjNXqoxr;
import bitpit.launcher.backend.account.model.AuthenticationResponse;
import bitpit.launcher.backend.account.model.google.GoogleAuthClientSession;
import bitpit.launcher.util.UpdateWorkException;
import bitpit.launcher.util.exception.DecException;
import bitpit.launcher.util.exception.HttpException;
import bitpit.launcher.util.exception.ParseServerResponseException;
import bitpit.launcher.util.exception.PvException;
import bitpit.launcher.util.exception.ServerConnectionException;
import bitpit.launcher.util.exception.ServerUnreachableException;
import bitpit.launcher.util.exception.VeException;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.SerializationException;
import ninja.sesame.lib.bridge.v1.ActionCategory;

/* JADX INFO: loaded from: classes.dex */
public final class NniqwgLR9Jo6Bl9Px0S5u implements xxuAhbXqLMelne8pXLi, mkeB609Q34mPahD {
    public static final wrz9Uvn4UHMfMyrKHE1X8T3q Companion = new wrz9Uvn4UHMfMyrKHE1X8T3q();
    public static final String FzogU2bPCQtD6a1hMYB1kyti = Build.MANUFACTURER + " " + Build.MODEL;
    public final zHfG9eBtghieLBn GO8WUug7ZWFCUI1zY;
    public final UE7MkxgXYXfsH LcvPFGYKhAm4SS5FZ;
    public final LJmIWKCOd33Br Mej0x2K4ZGSUxtYNka4QZ;
    public final LpRXf8zsxndinAW3 Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    public final Context WIXlfFpvH7glAGsUk3;
    public final iHPHZIrmzz0Nhav1OcnsAYxx7Sm1 cCmbv8Tzd2QLd161ImIZUlZ8n;
    public final SharedPreferences gsHzEVTj1SCIPR;
    public final ptgnZZCKaE4jZ qTa7aqjjB9Bt6mc;
    public final K7Yl5bhSoiualwU2G89VGiJTS qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
    public final O6lZlYscUJqRKM sCPtafveBAhdLIs2ajN3WV;
    public final AtomicReference yM5HHkk1MhPLZFYTHm2JjrArud;
    public final CJI9fJNh1Q2PBYQKjHaT4Ef4H f2sXlW3st0rAKJwyOrCfOWc = new CJI9fJNh1Q2PBYQKjHaT4Ef4H();
    public final ihaOqtO8vhfVeT5tdIPOEGawOKH iR1XUIc7FjhMl57O = new ihaOqtO8vhfVeT5tdIPOEGawOKH();

    /* JADX WARN: Code duplicated, block: B:27:0x009a  */
    public NniqwgLR9Jo6Bl9Px0S5u(Object obj, T7bLXYJFPi0Yphv7AcXMz4qeX t7bLXYJFPi0Yphv7AcXMz4qeX, zHfG9eBtghieLBn zhfg9ebtghielbn, LpRXf8zsxndinAW3 lpRXf8zsxndinAW3, iHPHZIrmzz0Nhav1OcnsAYxx7Sm1 ihphzirmzz0nhav1ocnsayxx7sm1, Context context, SharedPreferences sharedPreferences, UE7MkxgXYXfsH uE7MkxgXYXfsH, K7Yl5bhSoiualwU2G89VGiJTS k7Yl5bhSoiualwU2G89VGiJTS, O6lZlYscUJqRKM o6lZlYscUJqRKM, LJmIWKCOd33Br lJmIWKCOd33Br, ptgnZZCKaE4jZ ptgnzzckae4jz) throws Throwable {
        this.GO8WUug7ZWFCUI1zY = zhfg9ebtghielbn;
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = lpRXf8zsxndinAW3;
        this.cCmbv8Tzd2QLd161ImIZUlZ8n = ihphzirmzz0nhav1ocnsayxx7sm1;
        this.WIXlfFpvH7glAGsUk3 = context;
        this.gsHzEVTj1SCIPR = sharedPreferences;
        this.LcvPFGYKhAm4SS5FZ = uE7MkxgXYXfsH;
        this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = k7Yl5bhSoiualwU2G89VGiJTS;
        this.sCPtafveBAhdLIs2ajN3WV = o6lZlYscUJqRKM;
        this.Mej0x2K4ZGSUxtYNka4QZ = lJmIWKCOd33Br;
        this.qTa7aqjjB9Bt6mc = ptgnzzckae4jz;
        boolean z = obj instanceof Rfp0CprLjJaYY8aiYk;
        xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdx = (xWEvOc3gqLSn1SXDt2GvNO3HGucdx) (z ? null : obj);
        this.yM5HHkk1MhPLZFYTHm2JjrArud = new AtomicReference(xwevoc3gqlsn1sxdt2gvno3hgucdx != null ? xwevoc3gqlsn1sxdt2gvno3hgucdx.axL8FocTDLUdzg0XScbO(sharedPreferences) : null);
        xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdx2 = (xWEvOc3gqLSn1SXDt2GvNO3HGucdx) (z ? null : obj);
        if (xwevoc3gqlsn1sxdt2gvno3hgucdx2 != null) {
            com.auth0.android.jwt.NniqwgLR9Jo6Bl9Px0S5u nniqwgLR9Jo6Bl9Px0S5u = xwevoc3gqlsn1sxdt2gvno3hgucdx2.Aboow6rUrcY2SrFRa46C6uy;
            Date date = nniqwgLR9Jo6Bl9Px0S5u.Rdzg08aYlt0UsoLUNug9cESzgAY9R.BezslBgjveK3hODH;
            if (date != null) {
                long time = date.getTime();
                Date date2 = nniqwgLR9Jo6Bl9Px0S5u.Rdzg08aYlt0UsoLUNug9cESzgAY9R.ziNFA7KzVfc6;
                if (date2 != null) {
                    long time2 = date2.getTime();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (time2 > jCurrentTimeMillis + 3600000 || jCurrentTimeMillis - 3600000 > time) {
                        rbpFGdpgDCAQXat.ziNFA7KzVfc6(zhfg9ebtghielbn, null, 0, new T6IajJ3vOYOMX8I8(this, null, 0), 3);
                    } else {
                        if (jCurrentTimeMillis > ((long) (((time - time2) * 0.8d) + time2))) {
                            rbpFGdpgDCAQXat.ziNFA7KzVfc6(zhfg9ebtghielbn, null, 0, new T6IajJ3vOYOMX8I8(this, null, 0), 3);
                        }
                    }
                } else {
                    rbpFGdpgDCAQXat.ziNFA7KzVfc6(zhfg9ebtghielbn, null, 0, new T6IajJ3vOYOMX8I8(this, null, 0), 3);
                }
            } else {
                rbpFGdpgDCAQXat.ziNFA7KzVfc6(zhfg9ebtghielbn, null, 0, new T6IajJ3vOYOMX8I8(this, null, 0), 3);
            }
        }
        Throwable thS1zP5M3X7Ukq3ROlZ87G9I = AeQuqug4cjWl3vY5CUaNGtJ0l.S1zP5M3X7Ukq3ROlZ87G9I(obj);
        if (thS1zP5M3X7Ukq3ROlZ87G9I != null) {
            if (!(thS1zP5M3X7Ukq3ROlZ87G9I instanceof Exception)) {
                throw thS1zP5M3X7Ukq3ROlZ87G9I;
            }
            Emi5d0VyYZLZtm.Aboow6rUrcY2SrFRa46C6uy(thS1zP5M3X7Ukq3ROlZ87G9I);
            rbpFGdpgDCAQXat.ziNFA7KzVfc6(zhfg9ebtghielbn, null, 0, new T6IajJ3vOYOMX8I8(this, null, 1), 3);
        }
        ((a05MjsTtylUXo) t7bLXYJFPi0Yphv7AcXMz4qeX).GO8WUug7ZWFCUI1zY.axL8FocTDLUdzg0XScbO(this);
    }

    public static void sBV5EuS0mGuEYqc5nc5erhuwb1OG7(int i, int i2) {
        String str;
        String str2;
        Bundle bundle = new Bundle();
        if (i == 1) {
            str = "attach";
        } else if (i == 2) {
            str = "change";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "signupin";
        }
        if (i2 == 1) {
            str2 = "google";
        } else {
            if (i2 != 2) {
                throw null;
            }
            str2 = ActionCategory.EMAIL;
        }
        bundle.putString("item_id", str + "_" + str2);
        otD5bQR0LtT.Companion.getClass();
        B4VuABB1m6ytu26MxoUBytPiQ.S1zP5M3X7Ukq3ROlZ87G9I(bundle, "login");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v15, types: [java.lang.Object] */
    public final Object Aboow6rUrcY2SrFRa46C6uy(bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) throws VeException {
        DZXdSyEzUhQZ7Xn8 dZXdSyEzUhQZ7Xn8;
        ServerConnectionException serverConnectionException;
        String str;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof DZXdSyEzUhQZ7Xn8) {
            dZXdSyEzUhQZ7Xn8 = (DZXdSyEzUhQZ7Xn8) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i = dZXdSyEzUhQZ7Xn8.sCPtafveBAhdLIs2ajN3WV;
            if ((i & Integer.MIN_VALUE) != 0) {
                dZXdSyEzUhQZ7Xn8.sCPtafveBAhdLIs2ajN3WV = i - Integer.MIN_VALUE;
            } else {
                dZXdSyEzUhQZ7Xn8 = new DZXdSyEzUhQZ7Xn8(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            dZXdSyEzUhQZ7Xn8 = new DZXdSyEzUhQZ7Xn8(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        Object objS1zP5M3X7Ukq3ROlZ87G9I = dZXdSyEzUhQZ7Xn8.LcvPFGYKhAm4SS5FZ;
        int i2 = dZXdSyEzUhQZ7Xn8.sCPtafveBAhdLIs2ajN3WV;
        s9XnN7QTAJ s9xnn7qtaj = s9XnN7QTAJ.S1zP5M3X7Ukq3ROlZ87G9I;
        tIDTjdoK38 tidtjdok38 = tIDTjdoK38.GO8WUug7ZWFCUI1zY;
        try {
            if (i2 == 0) {
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objS1zP5M3X7Ukq3ROlZ87G9I);
                xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz = PQQPeCDD0JLCT3aLz();
                if (xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz == null) {
                    throw new VeException(16, null);
                }
                str = xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz.BezslBgjveK3hODH;
                dZXdSyEzUhQZ7Xn8.WIXlfFpvH7glAGsUk3 = str;
                dZXdSyEzUhQZ7Xn8.sCPtafveBAhdLIs2ajN3WV = 1;
                objS1zP5M3X7Ukq3ROlZ87G9I = this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp.S1zP5M3X7Ukq3ROlZ87G9I(dZXdSyEzUhQZ7Xn8);
                if (objS1zP5M3X7Ukq3ROlZ87G9I != tidtjdok38) {
                }
                return tidtjdok38;
            }
            if (i2 == 1) {
                str = dZXdSyEzUhQZ7Xn8.WIXlfFpvH7glAGsUk3;
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objS1zP5M3X7Ukq3ROlZ87G9I);
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        serverConnectionException = dZXdSyEzUhQZ7Xn8.gsHzEVTj1SCIPR;
                        Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objS1zP5M3X7Ukq3ROlZ87G9I);
                        throw new VeException(14, serverConnectionException);
                    }
                    if (i2 == 4) {
                        Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objS1zP5M3X7Ukq3ROlZ87G9I);
                        return s9xnn7qtaj;
                    }
                    uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objS1zP5M3X7Ukq3ROlZ87G9I);
            }
            dZXdSyEzUhQZ7Xn8.WIXlfFpvH7glAGsUk3 = null;
            dZXdSyEzUhQZ7Xn8.sCPtafveBAhdLIs2ajN3WV = 4;
            this = JPYjB0bzUqKR(true, dZXdSyEzUhQZ7Xn8);
            if (this != tidtjdok38) {
                return tidtjdok38;
            }
            return s9xnn7qtaj;
            XmacCNxiXPR0cfyyx756Yz xmacCNxiXPR0cfyyx756Yz = new XmacCNxiXPR0cfyyx756Yz();
            xmacCNxiXPR0cfyyx756Yz.S1zP5M3X7Ukq3ROlZ87G9I = sRgu8ykgdYOnT49j1bPuQWmquU.S1zP5M3X7Ukq3ROlZ87G9I(new dmS6wyHAG6gvZAivjtzncxH1NYIQ(9));
            sRgu8ykgdYOnT49j1bPuQWmquU.Aboow6rUrcY2SrFRa46C6uy(xmacCNxiXPR0cfyyx756Yz, new tRh8nLx7q1GvbQd(((G7lapk01c8Qj9rz59i) objS1zP5M3X7Ukq3ROlZ87G9I).axL8FocTDLUdzg0XScbO, str));
            xmacCNxiXPR0cfyyx756Yz.BezslBgjveK3hODH("DELETE", vv6HiZyCYq6R.S1zP5M3X7Ukq3ROlZ87G9I);
            xNthAUu9aBYOvIzNXbI xnthauu9abyoviznxbi = new xNthAUu9aBYOvIzNXbI(xmacCNxiXPR0cfyyx756Yz);
            PeLieoBN4yxYJZju3kQtKIsq7XL8 peLieoBN4yxYJZju3kQtKIsq7XL8 = NMquq9o0FvRs5RyiTFrS.S1zP5M3X7Ukq3ROlZ87G9I;
            x4PcPRPmslEJW x4pcprpmslejw = x4PcPRPmslEJW.cCmbv8Tzd2QLd161ImIZUlZ8n;
            TpmtxzzffNctZqQnPBhD tpmtxzzffNctZqQnPBhD = new TpmtxzzffNctZqQnPBhD(this, xnthauu9abyoviznxbi, null, 20);
            dZXdSyEzUhQZ7Xn8.WIXlfFpvH7glAGsUk3 = null;
            dZXdSyEzUhQZ7Xn8.sCPtafveBAhdLIs2ajN3WV = 2;
            if (rbpFGdpgDCAQXat.JY5knQmh7EQJEZ(x4pcprpmslejw, tpmtxzzffNctZqQnPBhD, dZXdSyEzUhQZ7Xn8) != tidtjdok38) {
                dZXdSyEzUhQZ7Xn8.WIXlfFpvH7glAGsUk3 = null;
                dZXdSyEzUhQZ7Xn8.sCPtafveBAhdLIs2ajN3WV = 4;
                this = JPYjB0bzUqKR(true, dZXdSyEzUhQZ7Xn8);
                if (this != tidtjdok38) {
                    return s9xnn7qtaj;
                }
            }
        } catch (ServerConnectionException e) {
            if (!(e instanceof HttpException)) {
                if (e instanceof ParseServerResponseException) {
                    throw new VeException(3, e);
                }
                throw new VeException(0, e);
            }
            HttpException httpException = (HttpException) e;
            int i3 = httpException.GO8WUug7ZWFCUI1zY;
            if (i3 == 400) {
                throw new VeException(12, e);
            }
            if (i3 != 401) {
                if (i3 == 502 || i3 == 504) {
                    throw new VeException(0, e);
                }
                throw new VeException(3, e);
            }
            dZXdSyEzUhQZ7Xn8.WIXlfFpvH7glAGsUk3 = null;
            dZXdSyEzUhQZ7Xn8.gsHzEVTj1SCIPR = httpException;
            dZXdSyEzUhQZ7Xn8.sCPtafveBAhdLIs2ajN3WV = 3;
            if (this.JPYjB0bzUqKR(true, dZXdSyEzUhQZ7Xn8) != tidtjdok38) {
                serverConnectionException = e;
            }
            return tidtjdok38;
        }
        return tidtjdok38;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x023c  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object BezslBgjveK3hODH(String str, String str2, bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) throws Throwable {
        vPv6XGKAxAxSJlqmIbMY vpv6xgkaxaxsjlqmibmy;
        int i;
        int i2;
        int i3;
        String strS1zP5M3X7Ukq3ROlZ87G9I;
        EmailSignInRequestDetails emailSignInRequestDetails;
        String str3;
        EmailSignInRequestDetails emailSignInRequestDetails2;
        String str4;
        xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdx;
        tIDTjdoK38 tidtjdok38;
        String str5;
        xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdx2;
        EmailSignInRequestDetails emailSignInRequestDetails3;
        G7lapk01c8Qj9rz59i g7lapk01c8Qj9rz59i;
        AuthenticationResponse authenticationResponse;
        String str6;
        xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdx3;
        EmailSignInRequestDetails emailSignInRequestDetails4;
        xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdx4;
        int i4;
        NniqwgLR9Jo6Bl9Px0S5u nniqwgLR9Jo6Bl9Px0S5u = this;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof vPv6XGKAxAxSJlqmIbMY) {
            vpv6xgkaxaxsjlqmibmy = (vPv6XGKAxAxSJlqmIbMY) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i5 = vpv6xgkaxaxsjlqmibmy.f2sXlW3st0rAKJwyOrCfOWc;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                vpv6xgkaxaxsjlqmibmy.f2sXlW3st0rAKJwyOrCfOWc = i5 - Integer.MIN_VALUE;
            } else {
                vpv6xgkaxaxsjlqmibmy = new vPv6XGKAxAxSJlqmIbMY(nniqwgLR9Jo6Bl9Px0S5u, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            vpv6xgkaxaxsjlqmibmy = new vPv6XGKAxAxSJlqmIbMY(nniqwgLR9Jo6Bl9Px0S5u, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        vPv6XGKAxAxSJlqmIbMY vpv6xgkaxaxsjlqmibmy2 = vpv6xgkaxaxsjlqmibmy;
        Object objBk6w7oZjoWt9ZSRs4C7jIhbX3 = vpv6xgkaxaxsjlqmibmy2.Mej0x2K4ZGSUxtYNka4QZ;
        int i6 = vpv6xgkaxaxsjlqmibmy2.f2sXlW3st0rAKJwyOrCfOWc;
        SharedPreferences sharedPreferences = nniqwgLR9Jo6Bl9Px0S5u.gsHzEVTj1SCIPR;
        int i7 = 3;
        tIDTjdoK38 tidtjdok39 = tIDTjdoK38.GO8WUug7ZWFCUI1zY;
        try {
            try {
                if (i6 != 0) {
                    if (i6 != 1) {
                        try {
                            if (i6 == 2) {
                                g7lapk01c8Qj9rz59i = vpv6xgkaxaxsjlqmibmy2.sCPtafveBAhdLIs2ajN3WV;
                                emailSignInRequestDetails3 = vpv6xgkaxaxsjlqmibmy2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
                                xwevoc3gqlsn1sxdt2gvno3hgucdx2 = vpv6xgkaxaxsjlqmibmy2.LcvPFGYKhAm4SS5FZ;
                                str5 = vpv6xgkaxaxsjlqmibmy2.WIXlfFpvH7glAGsUk3;
                                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objBk6w7oZjoWt9ZSRs4C7jIhbX3);
                                tidtjdok38 = tidtjdok39;
                                authenticationResponse = (AuthenticationResponse) objBk6w7oZjoWt9ZSRs4C7jIhbX3;
                                nniqwgLR9Jo6Bl9Px0S5u = this;
                                String str7 = authenticationResponse.S1zP5M3X7Ukq3ROlZ87G9I;
                                vpv6xgkaxaxsjlqmibmy2.WIXlfFpvH7glAGsUk3 = str5;
                                vpv6xgkaxaxsjlqmibmy2.gsHzEVTj1SCIPR = null;
                                vpv6xgkaxaxsjlqmibmy2.LcvPFGYKhAm4SS5FZ = xwevoc3gqlsn1sxdt2gvno3hgucdx2;
                                vpv6xgkaxaxsjlqmibmy2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = emailSignInRequestDetails3;
                                vpv6xgkaxaxsjlqmibmy2.sCPtafveBAhdLIs2ajN3WV = null;
                                vpv6xgkaxaxsjlqmibmy2.f2sXlW3st0rAKJwyOrCfOWc = 4;
                                objBk6w7oZjoWt9ZSRs4C7jIhbX3 = nniqwgLR9Jo6Bl9Px0S5u.Bk6w7oZjoWt9ZSRs4C7jIhbX3(str7, g7lapk01c8Qj9rz59i, vpv6xgkaxaxsjlqmibmy2);
                                if (objBk6w7oZjoWt9ZSRs4C7jIhbX3 == tidtjdok38) {
                                    return tidtjdok38;
                                }
                                emailSignInRequestDetails4 = emailSignInRequestDetails3;
                                xwevoc3gqlsn1sxdt2gvno3hgucdx3 = xwevoc3gqlsn1sxdt2gvno3hgucdx2;
                                str6 = str5;
                            } else if (i6 == 3) {
                                g7lapk01c8Qj9rz59i = vpv6xgkaxaxsjlqmibmy2.sCPtafveBAhdLIs2ajN3WV;
                                emailSignInRequestDetails3 = vpv6xgkaxaxsjlqmibmy2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
                                xwevoc3gqlsn1sxdt2gvno3hgucdx2 = vpv6xgkaxaxsjlqmibmy2.LcvPFGYKhAm4SS5FZ;
                                str5 = vpv6xgkaxaxsjlqmibmy2.WIXlfFpvH7glAGsUk3;
                                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objBk6w7oZjoWt9ZSRs4C7jIhbX3);
                                tidtjdok38 = tidtjdok39;
                                authenticationResponse = (AuthenticationResponse) objBk6w7oZjoWt9ZSRs4C7jIhbX3;
                                String str8 = authenticationResponse.S1zP5M3X7Ukq3ROlZ87G9I;
                                vpv6xgkaxaxsjlqmibmy2.WIXlfFpvH7glAGsUk3 = str5;
                                vpv6xgkaxaxsjlqmibmy2.gsHzEVTj1SCIPR = null;
                                vpv6xgkaxaxsjlqmibmy2.LcvPFGYKhAm4SS5FZ = xwevoc3gqlsn1sxdt2gvno3hgucdx2;
                                vpv6xgkaxaxsjlqmibmy2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = emailSignInRequestDetails3;
                                vpv6xgkaxaxsjlqmibmy2.sCPtafveBAhdLIs2ajN3WV = null;
                                vpv6xgkaxaxsjlqmibmy2.f2sXlW3st0rAKJwyOrCfOWc = 4;
                                objBk6w7oZjoWt9ZSRs4C7jIhbX3 = nniqwgLR9Jo6Bl9Px0S5u.Bk6w7oZjoWt9ZSRs4C7jIhbX3(str8, g7lapk01c8Qj9rz59i, vpv6xgkaxaxsjlqmibmy2);
                                if (objBk6w7oZjoWt9ZSRs4C7jIhbX3 == tidtjdok38) {
                                    return tidtjdok38;
                                }
                                emailSignInRequestDetails4 = emailSignInRequestDetails3;
                                xwevoc3gqlsn1sxdt2gvno3hgucdx3 = xwevoc3gqlsn1sxdt2gvno3hgucdx2;
                                str6 = str5;
                            } else {
                                if (i6 != 4) {
                                    uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                emailSignInRequestDetails4 = vpv6xgkaxaxsjlqmibmy2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
                                xwevoc3gqlsn1sxdt2gvno3hgucdx3 = vpv6xgkaxaxsjlqmibmy2.LcvPFGYKhAm4SS5FZ;
                                str6 = vpv6xgkaxaxsjlqmibmy2.WIXlfFpvH7glAGsUk3;
                                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objBk6w7oZjoWt9ZSRs4C7jIhbX3);
                            }
                        } catch (ServerConnectionException e) {
                            e = e;
                            i2 = 4;
                            i = 2;
                            if (e instanceof HttpException) {
                                HttpException httpException = (HttpException) e;
                                if (httpException.GO8WUug7ZWFCUI1zY != 400 || (strS1zP5M3X7Ukq3ROlZ87G9I = httpException.S1zP5M3X7Ukq3ROlZ87G9I()) == null) {
                                    i3 = 5;
                                } else {
                                    int iHashCode = strS1zP5M3X7Ukq3ROlZ87G9I.hashCode();
                                    if (iHashCode != -2078517667) {
                                        if (iHashCode != -1914668759) {
                                            if (iHashCode == 1907118978 && strS1zP5M3X7Ukq3ROlZ87G9I.equals("INVALID_EMAIL_FORMAT")) {
                                                i3 = i;
                                            } else {
                                                i3 = 5;
                                            }
                                        } else if (strS1zP5M3X7Ukq3ROlZ87G9I.equals("INVALID_VERIFICATION_CODE")) {
                                            i3 = 3;
                                        } else {
                                            i3 = 5;
                                        }
                                    } else if (strS1zP5M3X7Ukq3ROlZ87G9I.equals("EMAIL_ALREADY_TAKEN")) {
                                        i3 = i2;
                                    } else {
                                        i3 = 5;
                                    }
                                }
                            } else {
                                i3 = 5;
                            }
                            throw new EmailVerificationException(i3, e);
                        }
                    } else {
                        emailSignInRequestDetails2 = vpv6xgkaxaxsjlqmibmy2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
                        xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdx5 = vpv6xgkaxaxsjlqmibmy2.LcvPFGYKhAm4SS5FZ;
                        String str9 = vpv6xgkaxaxsjlqmibmy2.gsHzEVTj1SCIPR;
                        String str10 = vpv6xgkaxaxsjlqmibmy2.WIXlfFpvH7glAGsUk3;
                        Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objBk6w7oZjoWt9ZSRs4C7jIhbX3);
                        str4 = str9;
                        xwevoc3gqlsn1sxdt2gvno3hgucdx = xwevoc3gqlsn1sxdt2gvno3hgucdx5;
                        str3 = str10;
                    }
                    xwevoc3gqlsn1sxdt2gvno3hgucdx4 = (xWEvOc3gqLSn1SXDt2GvNO3HGucdx) objBk6w7oZjoWt9ZSRs4C7jIhbX3;
                    if (!OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(xwevoc3gqlsn1sxdt2gvno3hgucdx4.axL8FocTDLUdzg0XScbO, str6)) {
                        throw new EmailVerificationException(5, new IllegalStateException("mail address mismatch"));
                    }
                    if (xwevoc3gqlsn1sxdt2gvno3hgucdx3 == null) {
                        i4 = 2;
                    } else if (xwevoc3gqlsn1sxdt2gvno3hgucdx3.axL8FocTDLUdzg0XScbO == null) {
                        i4 = 2;
                        i7 = 1;
                    } else {
                        i4 = 2;
                        i7 = 2;
                    }
                    sBV5EuS0mGuEYqc5nc5erhuwb1OG7(i7, i4);
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.remove("bitpit.launcher.key.EMAIL_SIGN_IN_REQUEST_DETAILS");
                    editorEdit.apply();
                    return new GiFxY9WDHrWlHPyoti(xwevoc3gqlsn1sxdt2gvno3hgucdx4, emailSignInRequestDetails4.S1zP5M3X7Ukq3ROlZ87G9I);
                }
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objBk6w7oZjoWt9ZSRs4C7jIhbX3);
                xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz = nniqwgLR9Jo6Bl9Px0S5u.PQQPeCDD0JLCT3aLz();
                if (OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz != null ? xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz.axL8FocTDLUdzg0XScbO : null, str)) {
                    return new GiFxY9WDHrWlHPyoti(xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz, str);
                }
                String string = sharedPreferences.getString("bitpit.launcher.key.EMAIL_SIGN_IN_REQUEST_DETAILS", null);
                if (string == null) {
                    emailSignInRequestDetails = null;
                } else {
                    try {
                        emailSignInRequestDetails = (EmailSignInRequestDetails) nniqwgLR9Jo6Bl9Px0S5u.Rdzg08aYlt0UsoLUNug9cESzgAY9R.S1zP5M3X7Ukq3ROlZ87G9I(string, EmailSignInRequestDetails.Companion.serializer());
                    } catch (SerializationException unused) {
                        SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                        editorEdit2.remove("bitpit.launcher.key.EMAIL_SIGN_IN_REQUEST_DETAILS");
                        editorEdit2.apply();
                        emailSignInRequestDetails = null;
                    }
                }
                if (emailSignInRequestDetails == null) {
                    throw new EmailVerificationException(1, new IllegalStateException("No persisted sign-in request details found"));
                }
                long j = emailSignInRequestDetails.axL8FocTDLUdzg0XScbO;
                xxuAhbXqLMelne8pXLi.Companion.getClass();
                if (!m6VeYiMqnaBahF88nkY76Vf.JY5knQmh7EQJEZ(j, kYpdCL1nl75iKYHfZA.axL8FocTDLUdzg0XScbO, System.currentTimeMillis())) {
                    SharedPreferences.Editor editorEdit3 = sharedPreferences.edit();
                    editorEdit3.remove("bitpit.launcher.key.EMAIL_SIGN_IN_REQUEST_DETAILS");
                    editorEdit3.apply();
                    throw new EmailVerificationException(3, new IllegalStateException("Verification code expired"));
                }
                if (!OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(emailSignInRequestDetails.S1zP5M3X7Ukq3ROlZ87G9I, str)) {
                    throw new EmailVerificationException(3, new IllegalStateException("Email address mismatch"));
                }
                vpv6xgkaxaxsjlqmibmy2.WIXlfFpvH7glAGsUk3 = str;
                vpv6xgkaxaxsjlqmibmy2.gsHzEVTj1SCIPR = str2;
                vpv6xgkaxaxsjlqmibmy2.LcvPFGYKhAm4SS5FZ = xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz;
                vpv6xgkaxaxsjlqmibmy2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = emailSignInRequestDetails;
                vpv6xgkaxaxsjlqmibmy2.f2sXlW3st0rAKJwyOrCfOWc = 1;
                Object objS1zP5M3X7Ukq3ROlZ87G9I = nniqwgLR9Jo6Bl9Px0S5u.qaDSpeex0Oo1Qvt3oOrTJnbcQFp.S1zP5M3X7Ukq3ROlZ87G9I(vpv6xgkaxaxsjlqmibmy2);
                if (objS1zP5M3X7Ukq3ROlZ87G9I == tidtjdok39) {
                    return tidtjdok39;
                }
                EmailSignInRequestDetails emailSignInRequestDetails5 = emailSignInRequestDetails;
                str3 = str;
                emailSignInRequestDetails2 = emailSignInRequestDetails5;
                str4 = str2;
                xwevoc3gqlsn1sxdt2gvno3hgucdx = xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz;
                objBk6w7oZjoWt9ZSRs4C7jIhbX3 = objS1zP5M3X7Ukq3ROlZ87G9I;
                String str11 = str4;
                G7lapk01c8Qj9rz59i g7lapk01c8Qj9rz59i2 = (G7lapk01c8Qj9rz59i) objBk6w7oZjoWt9ZSRs4C7jIhbX3;
                if (xwevoc3gqlsn1sxdt2gvno3hgucdx == null) {
                    QTUUDdYAQaBj qTUUDdYAQaBj = new QTUUDdYAQaBj();
                    sRgu8ykgdYOnT49j1bPuQWmquU.BezslBgjveK3hODH(qTUUDdYAQaBj);
                    qTUUDdYAQaBj.S1zP5M3X7Ukq3ROlZ87G9I("sign-in");
                    qTUUDdYAQaBj.S1zP5M3X7Ukq3ROlZ87G9I(ActionCategory.EMAIL);
                    ZEglJWpYNlWl zEglJWpYNlWlBezslBgjveK3hODH = qTUUDdYAQaBj.BezslBgjveK3hODH();
                    UOdbn0BbqEbVKpITLTOKPLNI uOdbn0BbqEbVKpITLTOKPLNI = new UOdbn0BbqEbVKpITLTOKPLNI(g7lapk01c8Qj9rz59i2.axL8FocTDLUdzg0XScbO);
                    vpv6xgkaxaxsjlqmibmy2.WIXlfFpvH7glAGsUk3 = str3;
                    vpv6xgkaxaxsjlqmibmy2.gsHzEVTj1SCIPR = null;
                    vpv6xgkaxaxsjlqmibmy2.LcvPFGYKhAm4SS5FZ = xwevoc3gqlsn1sxdt2gvno3hgucdx;
                    vpv6xgkaxaxsjlqmibmy2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = emailSignInRequestDetails2;
                    vpv6xgkaxaxsjlqmibmy2.sCPtafveBAhdLIs2ajN3WV = g7lapk01c8Qj9rz59i2;
                    vpv6xgkaxaxsjlqmibmy2.f2sXlW3st0rAKJwyOrCfOWc = 2;
                    PeLieoBN4yxYJZju3kQtKIsq7XL8 peLieoBN4yxYJZju3kQtKIsq7XL8 = NMquq9o0FvRs5RyiTFrS.S1zP5M3X7Ukq3ROlZ87G9I;
                    EmailSignInRequestDetails emailSignInRequestDetails6 = emailSignInRequestDetails2;
                    xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdx6 = xwevoc3gqlsn1sxdt2gvno3hgucdx;
                    tidtjdok38 = tidtjdok39;
                    objBk6w7oZjoWt9ZSRs4C7jIhbX3 = rbpFGdpgDCAQXat.JY5knQmh7EQJEZ(x4PcPRPmslEJW.cCmbv8Tzd2QLd161ImIZUlZ8n, new L2LA4UZY6TFARndeYyO8MldsoOIm(nniqwgLR9Jo6Bl9Px0S5u, zEglJWpYNlWlBezslBgjveK3hODH, str3, str11, uOdbn0BbqEbVKpITLTOKPLNI, null), vpv6xgkaxaxsjlqmibmy2);
                    if (objBk6w7oZjoWt9ZSRs4C7jIhbX3 == tidtjdok38) {
                        return tidtjdok38;
                    }
                    str5 = str3;
                    xwevoc3gqlsn1sxdt2gvno3hgucdx2 = xwevoc3gqlsn1sxdt2gvno3hgucdx6;
                    g7lapk01c8Qj9rz59i = g7lapk01c8Qj9rz59i2;
                    emailSignInRequestDetails3 = emailSignInRequestDetails6;
                    authenticationResponse = (AuthenticationResponse) objBk6w7oZjoWt9ZSRs4C7jIhbX3;
                    nniqwgLR9Jo6Bl9Px0S5u = this;
                    String str12 = authenticationResponse.S1zP5M3X7Ukq3ROlZ87G9I;
                    vpv6xgkaxaxsjlqmibmy2.WIXlfFpvH7glAGsUk3 = str5;
                    vpv6xgkaxaxsjlqmibmy2.gsHzEVTj1SCIPR = null;
                    vpv6xgkaxaxsjlqmibmy2.LcvPFGYKhAm4SS5FZ = xwevoc3gqlsn1sxdt2gvno3hgucdx2;
                    vpv6xgkaxaxsjlqmibmy2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = emailSignInRequestDetails3;
                    vpv6xgkaxaxsjlqmibmy2.sCPtafveBAhdLIs2ajN3WV = null;
                    vpv6xgkaxaxsjlqmibmy2.f2sXlW3st0rAKJwyOrCfOWc = 4;
                    objBk6w7oZjoWt9ZSRs4C7jIhbX3 = nniqwgLR9Jo6Bl9Px0S5u.Bk6w7oZjoWt9ZSRs4C7jIhbX3(str12, g7lapk01c8Qj9rz59i, vpv6xgkaxaxsjlqmibmy2);
                    if (objBk6w7oZjoWt9ZSRs4C7jIhbX3 == tidtjdok38) {
                        return tidtjdok38;
                    }
                    emailSignInRequestDetails4 = emailSignInRequestDetails3;
                    xwevoc3gqlsn1sxdt2gvno3hgucdx3 = xwevoc3gqlsn1sxdt2gvno3hgucdx2;
                    str6 = str5;
                    xwevoc3gqlsn1sxdt2gvno3hgucdx4 = (xWEvOc3gqLSn1SXDt2GvNO3HGucdx) objBk6w7oZjoWt9ZSRs4C7jIhbX3;
                    if (!OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(xwevoc3gqlsn1sxdt2gvno3hgucdx4.axL8FocTDLUdzg0XScbO, str6)) {
                        throw new EmailVerificationException(5, new IllegalStateException("mail address mismatch"));
                    }
                    if (xwevoc3gqlsn1sxdt2gvno3hgucdx3 == null) {
                        i4 = 2;
                    } else if (xwevoc3gqlsn1sxdt2gvno3hgucdx3.axL8FocTDLUdzg0XScbO == null) {
                        i4 = 2;
                        i7 = 1;
                    } else {
                        i4 = 2;
                        i7 = 2;
                    }
                    sBV5EuS0mGuEYqc5nc5erhuwb1OG7(i7, i4);
                    SharedPreferences.Editor editorEdit4 = sharedPreferences.edit();
                    editorEdit4.remove("bitpit.launcher.key.EMAIL_SIGN_IN_REQUEST_DETAILS");
                    editorEdit4.apply();
                    return new GiFxY9WDHrWlHPyoti(xwevoc3gqlsn1sxdt2gvno3hgucdx4, emailSignInRequestDetails4.S1zP5M3X7Ukq3ROlZ87G9I);
                }
                EmailSignInRequestDetails emailSignInRequestDetails7 = emailSignInRequestDetails2;
                xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdx7 = xwevoc3gqlsn1sxdt2gvno3hgucdx;
                tidtjdok38 = tidtjdok39;
                QTUUDdYAQaBj qTUUDdYAQaBj2 = new QTUUDdYAQaBj();
                sRgu8ykgdYOnT49j1bPuQWmquU.BezslBgjveK3hODH(qTUUDdYAQaBj2);
                qTUUDdYAQaBj2.S1zP5M3X7Ukq3ROlZ87G9I("attach");
                qTUUDdYAQaBj2.S1zP5M3X7Ukq3ROlZ87G9I(ActionCategory.EMAIL);
                ZEglJWpYNlWl zEglJWpYNlWlBezslBgjveK3hODH2 = qTUUDdYAQaBj2.BezslBgjveK3hODH();
                tRh8nLx7q1GvbQd trh8nlx7q1gvbqd = new tRh8nLx7q1GvbQd(g7lapk01c8Qj9rz59i2.axL8FocTDLUdzg0XScbO, xwevoc3gqlsn1sxdt2gvno3hgucdx7.BezslBgjveK3hODH);
                vpv6xgkaxaxsjlqmibmy2.WIXlfFpvH7glAGsUk3 = str3;
                vpv6xgkaxaxsjlqmibmy2.gsHzEVTj1SCIPR = null;
                vpv6xgkaxaxsjlqmibmy2.LcvPFGYKhAm4SS5FZ = xwevoc3gqlsn1sxdt2gvno3hgucdx7;
                vpv6xgkaxaxsjlqmibmy2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = emailSignInRequestDetails7;
                vpv6xgkaxaxsjlqmibmy2.sCPtafveBAhdLIs2ajN3WV = g7lapk01c8Qj9rz59i2;
                vpv6xgkaxaxsjlqmibmy2.f2sXlW3st0rAKJwyOrCfOWc = 3;
                PeLieoBN4yxYJZju3kQtKIsq7XL8 peLieoBN4yxYJZju3kQtKIsq7XL9 = NMquq9o0FvRs5RyiTFrS.S1zP5M3X7Ukq3ROlZ87G9I;
                nniqwgLR9Jo6Bl9Px0S5u = this;
                objBk6w7oZjoWt9ZSRs4C7jIhbX3 = rbpFGdpgDCAQXat.JY5knQmh7EQJEZ(x4PcPRPmslEJW.cCmbv8Tzd2QLd161ImIZUlZ8n, new L2LA4UZY6TFARndeYyO8MldsoOIm(nniqwgLR9Jo6Bl9Px0S5u, zEglJWpYNlWlBezslBgjveK3hODH2, str3, str11, trh8nlx7q1gvbqd, null), vpv6xgkaxaxsjlqmibmy2);
                if (objBk6w7oZjoWt9ZSRs4C7jIhbX3 == tidtjdok38) {
                    return tidtjdok38;
                }
                str5 = str3;
                xwevoc3gqlsn1sxdt2gvno3hgucdx2 = xwevoc3gqlsn1sxdt2gvno3hgucdx7;
                emailSignInRequestDetails3 = emailSignInRequestDetails7;
                g7lapk01c8Qj9rz59i = g7lapk01c8Qj9rz59i2;
                authenticationResponse = (AuthenticationResponse) objBk6w7oZjoWt9ZSRs4C7jIhbX3;
                String str13 = authenticationResponse.S1zP5M3X7Ukq3ROlZ87G9I;
                vpv6xgkaxaxsjlqmibmy2.WIXlfFpvH7glAGsUk3 = str5;
                vpv6xgkaxaxsjlqmibmy2.gsHzEVTj1SCIPR = null;
                vpv6xgkaxaxsjlqmibmy2.LcvPFGYKhAm4SS5FZ = xwevoc3gqlsn1sxdt2gvno3hgucdx2;
                vpv6xgkaxaxsjlqmibmy2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = emailSignInRequestDetails3;
                vpv6xgkaxaxsjlqmibmy2.sCPtafveBAhdLIs2ajN3WV = null;
                vpv6xgkaxaxsjlqmibmy2.f2sXlW3st0rAKJwyOrCfOWc = 4;
                objBk6w7oZjoWt9ZSRs4C7jIhbX3 = nniqwgLR9Jo6Bl9Px0S5u.Bk6w7oZjoWt9ZSRs4C7jIhbX3(str13, g7lapk01c8Qj9rz59i, vpv6xgkaxaxsjlqmibmy2);
                if (objBk6w7oZjoWt9ZSRs4C7jIhbX3 == tidtjdok38) {
                    return tidtjdok38;
                }
                emailSignInRequestDetails4 = emailSignInRequestDetails3;
                xwevoc3gqlsn1sxdt2gvno3hgucdx3 = xwevoc3gqlsn1sxdt2gvno3hgucdx2;
                str6 = str5;
                xwevoc3gqlsn1sxdt2gvno3hgucdx4 = (xWEvOc3gqLSn1SXDt2GvNO3HGucdx) objBk6w7oZjoWt9ZSRs4C7jIhbX3;
                if (!OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(xwevoc3gqlsn1sxdt2gvno3hgucdx4.axL8FocTDLUdzg0XScbO, str6)) {
                    throw new EmailVerificationException(5, new IllegalStateException("mail address mismatch"));
                }
                if (xwevoc3gqlsn1sxdt2gvno3hgucdx3 == null) {
                    i4 = 2;
                } else if (xwevoc3gqlsn1sxdt2gvno3hgucdx3.axL8FocTDLUdzg0XScbO == null) {
                    i4 = 2;
                    i7 = 1;
                } else {
                    i4 = 2;
                    i7 = 2;
                }
                sBV5EuS0mGuEYqc5nc5erhuwb1OG7(i7, i4);
                SharedPreferences.Editor editorEdit5 = sharedPreferences.edit();
                editorEdit5.remove("bitpit.launcher.key.EMAIL_SIGN_IN_REQUEST_DETAILS");
                editorEdit5.apply();
                return new GiFxY9WDHrWlHPyoti(xwevoc3gqlsn1sxdt2gvno3hgucdx4, emailSignInRequestDetails4.S1zP5M3X7Ukq3ROlZ87G9I);
            } catch (ServerUnreachableException e2) {
                throw new EmailVerificationException(5, e2);
            }
        } catch (ServerConnectionException e3) {
            e = e3;
            i = 2;
            i2 = 4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c4 A[PHI: r11 r13
  0x00c4: PHI (r11v5 b.xWEvOc3gqLSn1SXDt2GvNO3HGucdx) = (r11v4 b.xWEvOc3gqLSn1SXDt2GvNO3HGucdx), (r11v8 b.xWEvOc3gqLSn1SXDt2GvNO3HGucdx) binds: [B:43:0x00c1, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]
  0x00c4: PHI (r13v12 java.lang.Object) = (r13v11 java.lang.Object), (r13v1 java.lang.Object) binds: [B:43:0x00c1, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:53:0x0106  */
    /* JADX WARN: Code duplicated, block: B:55:0x010c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Bk6w7oZjoWt9ZSRs4C7jIhbX3(String str, G7lapk01c8Qj9rz59i g7lapk01c8Qj9rz59i, bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) throws Throwable {
        b39QtV1GMvoIl b39qtv1gmvoil;
        xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdx;
        Object objCaTQCiA8tNnV;
        Throwable thS1zP5M3X7Ukq3ROlZ87G9I;
        FAcOmIkfv5ix8sNJsaM6iT fAcOmIkfv5ix8sNJsaM6iT;
        TpmtxzzffNctZqQnPBhD tpmtxzzffNctZqQnPBhD;
        xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdx2;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof b39QtV1GMvoIl) {
            b39qtv1gmvoil = (b39QtV1GMvoIl) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i = b39qtv1gmvoil.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
            if ((i & Integer.MIN_VALUE) != 0) {
                b39qtv1gmvoil.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = i - Integer.MIN_VALUE;
            } else {
                b39qtv1gmvoil = new b39QtV1GMvoIl(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            b39qtv1gmvoil = new b39QtV1GMvoIl(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        Object objJY5knQmh7EQJEZ = b39qtv1gmvoil.gsHzEVTj1SCIPR;
        int i2 = b39qtv1gmvoil.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
        Object obj = tIDTjdoK38.GO8WUug7ZWFCUI1zY;
        try {
            if (i2 == 0) {
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objJY5knQmh7EQJEZ);
                PeLieoBN4yxYJZju3kQtKIsq7XL8 peLieoBN4yxYJZju3kQtKIsq7XL8 = NMquq9o0FvRs5RyiTFrS.S1zP5M3X7Ukq3ROlZ87G9I;
                x4PcPRPmslEJW x4pcprpmslejw = x4PcPRPmslEJW.cCmbv8Tzd2QLd161ImIZUlZ8n;
                TpmtxzzffNctZqQnPBhD tpmtxzzffNctZqQnPBhD2 = new TpmtxzzffNctZqQnPBhD(str, g7lapk01c8Qj9rz59i, null, 22);
                b39qtv1gmvoil.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = 1;
                objJY5knQmh7EQJEZ = rbpFGdpgDCAQXat.JY5knQmh7EQJEZ(x4pcprpmslejw, tpmtxzzffNctZqQnPBhD2, b39qtv1gmvoil);
                if (objJY5knQmh7EQJEZ == obj) {
                }
                return obj;
            }
            if (i2 == 1) {
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objJY5knQmh7EQJEZ);
            } else {
                if (i2 == 2) {
                    xwevoc3gqlsn1sxdt2gvno3hgucdx = b39qtv1gmvoil.WIXlfFpvH7glAGsUk3;
                    Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objJY5knQmh7EQJEZ);
                    objCaTQCiA8tNnV = ((J7Tsg1eqTfbK8vIo4RFOyjPiu) objJY5knQmh7EQJEZ).S1zP5M3X7Ukq3ROlZ87G9I;
                    thS1zP5M3X7Ukq3ROlZ87G9I = AeQuqug4cjWl3vY5CUaNGtJ0l.S1zP5M3X7Ukq3ROlZ87G9I(objCaTQCiA8tNnV);
                    if (thS1zP5M3X7Ukq3ROlZ87G9I == null) {
                        throw new VeException(5, (UpdateWorkException) thS1zP5M3X7Ukq3ROlZ87G9I);
                    }
                    File file = new File(this.WIXlfFpvH7glAGsUk3.getFilesDir(), "niagarald_data");
                    b39qtv1gmvoil.WIXlfFpvH7glAGsUk3 = xwevoc3gqlsn1sxdt2gvno3hgucdx;
                    b39qtv1gmvoil.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = 3;
                    xwevoc3gqlsn1sxdt2gvno3hgucdx.getClass();
                    PeLieoBN4yxYJZju3kQtKIsq7XL8 peLieoBN4yxYJZju3kQtKIsq7XL9 = NMquq9o0FvRs5RyiTFrS.S1zP5M3X7Ukq3ROlZ87G9I;
                    objJY5knQmh7EQJEZ = rbpFGdpgDCAQXat.JY5knQmh7EQJEZ(x4PcPRPmslEJW.cCmbv8Tzd2QLd161ImIZUlZ8n, new TpmtxzzffNctZqQnPBhD(file, xwevoc3gqlsn1sxdt2gvno3hgucdx, null, 23), b39qtv1gmvoil);
                    if (objJY5knQmh7EQJEZ != obj) {
                        if (!((Boolean) objJY5knQmh7EQJEZ).booleanValue()) {
                            throw new VeException(5, null);
                        }
                        PeLieoBN4yxYJZju3kQtKIsq7XL8 peLieoBN4yxYJZju3kQtKIsq7XL10 = NMquq9o0FvRs5RyiTFrS.S1zP5M3X7Ukq3ROlZ87G9I;
                        fAcOmIkfv5ix8sNJsaM6iT = amndRZ6ZiSy4ZOFMYy0W.S1zP5M3X7Ukq3ROlZ87G9I;
                        tpmtxzzffNctZqQnPBhD = new TpmtxzzffNctZqQnPBhD(this, xwevoc3gqlsn1sxdt2gvno3hgucdx, null, 21);
                        b39qtv1gmvoil.WIXlfFpvH7glAGsUk3 = xwevoc3gqlsn1sxdt2gvno3hgucdx;
                        b39qtv1gmvoil.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = 4;
                        if (rbpFGdpgDCAQXat.JY5knQmh7EQJEZ(fAcOmIkfv5ix8sNJsaM6iT, tpmtxzzffNctZqQnPBhD, b39qtv1gmvoil) != obj) {
                            xwevoc3gqlsn1sxdt2gvno3hgucdx2 = xwevoc3gqlsn1sxdt2gvno3hgucdx;
                        }
                    }
                    return obj;
                }
                if (i2 == 3) {
                    xwevoc3gqlsn1sxdt2gvno3hgucdx = b39qtv1gmvoil.WIXlfFpvH7glAGsUk3;
                    Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objJY5knQmh7EQJEZ);
                    if (!((Boolean) objJY5knQmh7EQJEZ).booleanValue()) {
                        throw new VeException(5, null);
                    }
                    PeLieoBN4yxYJZju3kQtKIsq7XL8 peLieoBN4yxYJZju3kQtKIsq7XL11 = NMquq9o0FvRs5RyiTFrS.S1zP5M3X7Ukq3ROlZ87G9I;
                    fAcOmIkfv5ix8sNJsaM6iT = amndRZ6ZiSy4ZOFMYy0W.S1zP5M3X7Ukq3ROlZ87G9I;
                    tpmtxzzffNctZqQnPBhD = new TpmtxzzffNctZqQnPBhD(this, xwevoc3gqlsn1sxdt2gvno3hgucdx, null, 21);
                    b39qtv1gmvoil.WIXlfFpvH7glAGsUk3 = xwevoc3gqlsn1sxdt2gvno3hgucdx;
                    b39qtv1gmvoil.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = 4;
                    if (rbpFGdpgDCAQXat.JY5knQmh7EQJEZ(fAcOmIkfv5ix8sNJsaM6iT, tpmtxzzffNctZqQnPBhD, b39qtv1gmvoil) != obj) {
                        xwevoc3gqlsn1sxdt2gvno3hgucdx2 = xwevoc3gqlsn1sxdt2gvno3hgucdx;
                    }
                    return obj;
                }
                if (i2 != 4) {
                    uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xwevoc3gqlsn1sxdt2gvno3hgucdx2 = b39qtv1gmvoil.WIXlfFpvH7glAGsUk3;
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objJY5knQmh7EQJEZ);
            }
            cdjHGKliASEP50WE.S1zP5M3X7Ukq3ROlZ87G9I.S1zP5M3X7Ukq3ROlZ87G9I("Successfully persisted user data for " + xwevoc3gqlsn1sxdt2gvno3hgucdx2.S1zP5M3X7Ukq3ROlZ87G9I + " with " + xwevoc3gqlsn1sxdt2gvno3hgucdx2.ziNFA7KzVfc6, new Object[0]);
            return xwevoc3gqlsn1sxdt2gvno3hgucdx2;
            xwevoc3gqlsn1sxdt2gvno3hgucdx = (xWEvOc3gqLSn1SXDt2GvNO3HGucdx) objJY5knQmh7EQJEZ;
            if (gHV1nNWnRM13P.axL8FocTDLUdzg0XScbO(xwevoc3gqlsn1sxdt2gvno3hgucdx.Aboow6rUrcY2SrFRa46C6uy)) {
                throw new VeException(2, null);
            }
            xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz = PQQPeCDD0JLCT3aLz();
            if (xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz != null && !xwevoc3gqlsn1sxdt2gvno3hgucdx.S1zP5M3X7Ukq3ROlZ87G9I.equals(xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz.S1zP5M3X7Ukq3ROlZ87G9I)) {
                throw new VeException(4, null);
            }
            b39qtv1gmvoil.WIXlfFpvH7glAGsUk3 = xwevoc3gqlsn1sxdt2gvno3hgucdx;
            b39qtv1gmvoil.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = 2;
            objCaTQCiA8tNnV = caTQCiA8tNnV(b39qtv1gmvoil);
            if (objCaTQCiA8tNnV != obj) {
                thS1zP5M3X7Ukq3ROlZ87G9I = AeQuqug4cjWl3vY5CUaNGtJ0l.S1zP5M3X7Ukq3ROlZ87G9I(objCaTQCiA8tNnV);
                if (thS1zP5M3X7Ukq3ROlZ87G9I == null) {
                    throw new VeException(5, (UpdateWorkException) thS1zP5M3X7Ukq3ROlZ87G9I);
                }
                File file2 = new File(this.WIXlfFpvH7glAGsUk3.getFilesDir(), "niagarald_data");
                b39qtv1gmvoil.WIXlfFpvH7glAGsUk3 = xwevoc3gqlsn1sxdt2gvno3hgucdx;
                b39qtv1gmvoil.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = 3;
                xwevoc3gqlsn1sxdt2gvno3hgucdx.getClass();
                PeLieoBN4yxYJZju3kQtKIsq7XL8 peLieoBN4yxYJZju3kQtKIsq7XL12 = NMquq9o0FvRs5RyiTFrS.S1zP5M3X7Ukq3ROlZ87G9I;
                objJY5knQmh7EQJEZ = rbpFGdpgDCAQXat.JY5knQmh7EQJEZ(x4PcPRPmslEJW.cCmbv8Tzd2QLd161ImIZUlZ8n, new TpmtxzzffNctZqQnPBhD(file2, xwevoc3gqlsn1sxdt2gvno3hgucdx, null, 23), b39qtv1gmvoil);
                if (objJY5knQmh7EQJEZ != obj) {
                    if (!((Boolean) objJY5knQmh7EQJEZ).booleanValue()) {
                        throw new VeException(5, null);
                    }
                    PeLieoBN4yxYJZju3kQtKIsq7XL8 peLieoBN4yxYJZju3kQtKIsq7XL13 = NMquq9o0FvRs5RyiTFrS.S1zP5M3X7Ukq3ROlZ87G9I;
                    fAcOmIkfv5ix8sNJsaM6iT = amndRZ6ZiSy4ZOFMYy0W.S1zP5M3X7Ukq3ROlZ87G9I;
                    tpmtxzzffNctZqQnPBhD = new TpmtxzzffNctZqQnPBhD(this, xwevoc3gqlsn1sxdt2gvno3hgucdx, null, 21);
                    b39qtv1gmvoil.WIXlfFpvH7glAGsUk3 = xwevoc3gqlsn1sxdt2gvno3hgucdx;
                    b39qtv1gmvoil.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = 4;
                    if (rbpFGdpgDCAQXat.JY5knQmh7EQJEZ(fAcOmIkfv5ix8sNJsaM6iT, tpmtxzzffNctZqQnPBhD, b39qtv1gmvoil) != obj) {
                        xwevoc3gqlsn1sxdt2gvno3hgucdx2 = xwevoc3gqlsn1sxdt2gvno3hgucdx;
                        cdjHGKliASEP50WE.S1zP5M3X7Ukq3ROlZ87G9I.S1zP5M3X7Ukq3ROlZ87G9I("Successfully persisted user data for " + xwevoc3gqlsn1sxdt2gvno3hgucdx2.S1zP5M3X7Ukq3ROlZ87G9I + " with " + xwevoc3gqlsn1sxdt2gvno3hgucdx2.ziNFA7KzVfc6, new Object[0]);
                        return xwevoc3gqlsn1sxdt2gvno3hgucdx2;
                    }
                }
            }
            return obj;
        } catch (DecException e) {
            throw new VeException(4, e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object H5sQ15nhYoaKKHhx(kFiAqAMnNGuF0jddbuIE kfiaqamnnguf0jddbuie, bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) throws Throwable {
        zmCoJh1USrJrRRZYOd98SBr zmcojh1usrjrrrzyod98sbr;
        Ka8INCBqfwCeAoFT4mw74QJG ka8INCBqfwCeAoFT4mw74QJG;
        int i;
        Ka8INCBqfwCeAoFT4mw74QJG ka8INCBqfwCeAoFT4mw74QJG2;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof zmCoJh1USrJrRRZYOd98SBr) {
            zmcojh1usrjrrrzyod98sbr = (zmCoJh1USrJrRRZYOd98SBr) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i2 = zmcojh1usrjrrrzyod98sbr.Mej0x2K4ZGSUxtYNka4QZ;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zmcojh1usrjrrrzyod98sbr.Mej0x2K4ZGSUxtYNka4QZ = i2 - Integer.MIN_VALUE;
            } else {
                zmcojh1usrjrrrzyod98sbr = new zmCoJh1USrJrRRZYOd98SBr(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            zmcojh1usrjrrrzyod98sbr = new zmCoJh1USrJrRRZYOd98SBr(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        Object obj = zmcojh1usrjrrrzyod98sbr.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
        int i3 = zmcojh1usrjrrrzyod98sbr.Mej0x2K4ZGSUxtYNka4QZ;
        Object obj2 = tIDTjdoK38.GO8WUug7ZWFCUI1zY;
        try {
            if (i3 == 0) {
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
                zmcojh1usrjrrrzyod98sbr.WIXlfFpvH7glAGsUk3 = kfiaqamnnguf0jddbuie;
                ka8INCBqfwCeAoFT4mw74QJG = this.iR1XUIc7FjhMl57O;
                zmcojh1usrjrrrzyod98sbr.gsHzEVTj1SCIPR = ka8INCBqfwCeAoFT4mw74QJG;
                i = 0;
                zmcojh1usrjrrrzyod98sbr.LcvPFGYKhAm4SS5FZ = 0;
                zmcojh1usrjrrrzyod98sbr.Mej0x2K4ZGSUxtYNka4QZ = 1;
                if (ka8INCBqfwCeAoFT4mw74QJG.axL8FocTDLUdzg0XScbO(zmcojh1usrjrrrzyod98sbr) != obj2) {
                }
                return obj2;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ka8INCBqfwCeAoFT4mw74QJG2 = zmcojh1usrjrrrzyod98sbr.gsHzEVTj1SCIPR;
                try {
                    Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
                    ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                    return s9XnN7QTAJ.S1zP5M3X7Ukq3ROlZ87G9I;
                } catch (Throwable th) {
                    th = th;
                    ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                    throw th;
                }
            }
            int i4 = zmcojh1usrjrrrzyod98sbr.LcvPFGYKhAm4SS5FZ;
            Ka8INCBqfwCeAoFT4mw74QJG ka8INCBqfwCeAoFT4mw74QJG3 = zmcojh1usrjrrrzyod98sbr.gsHzEVTj1SCIPR;
            kFiAqAMnNGuF0jddbuIE kfiaqamnnguf0jddbuie2 = zmcojh1usrjrrrzyod98sbr.WIXlfFpvH7glAGsUk3;
            Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
            ka8INCBqfwCeAoFT4mw74QJG = ka8INCBqfwCeAoFT4mw74QJG3;
            i = i4;
            kfiaqamnnguf0jddbuie = kfiaqamnnguf0jddbuie2;
            zmcojh1usrjrrrzyod98sbr.WIXlfFpvH7glAGsUk3 = null;
            zmcojh1usrjrrrzyod98sbr.gsHzEVTj1SCIPR = ka8INCBqfwCeAoFT4mw74QJG;
            zmcojh1usrjrrrzyod98sbr.LcvPFGYKhAm4SS5FZ = i;
            zmcojh1usrjrrrzyod98sbr.Mej0x2K4ZGSUxtYNka4QZ = 2;
            if (HveD9n1tOYlffjJDxghBitYNgB(kfiaqamnnguf0jddbuie, zmcojh1usrjrrrzyod98sbr) != obj2) {
                ka8INCBqfwCeAoFT4mw74QJG2 = ka8INCBqfwCeAoFT4mw74QJG;
                ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                return s9XnN7QTAJ.S1zP5M3X7Ukq3ROlZ87G9I;
            }
            return obj2;
        } catch (Throwable th2) {
            th = th2;
            ka8INCBqfwCeAoFT4mw74QJG2 = ka8INCBqfwCeAoFT4mw74QJG;
            ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
            throw th;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x019d  */
    /* JADX WARN: Code duplicated, block: B:102:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:109:0x01be  */
    /* JADX WARN: Code duplicated, block: B:111:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:116:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:118:0x01dc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:125:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:126:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:129:0x0206  */
    /* JADX WARN: Code duplicated, block: B:130:0x0209  */
    /* JADX WARN: Code duplicated, block: B:133:0x0212  */
    /* JADX WARN: Code duplicated, block: B:135:0x021a  */
    /* JADX WARN: Code duplicated, block: B:137:0x021e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0224  */
    /* JADX WARN: Code duplicated, block: B:70:0x0140  */
    /* JADX WARN: Code duplicated, block: B:85:0x015d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0166  */
    /* JADX WARN: Code duplicated, block: B:89:0x016a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code duplicated, block: B:91:0x016e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0180  */
    /* JADX WARN: Code duplicated, block: B:98:0x0192  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [b.xWEvOc3gqLSn1SXDt2GvNO3HGucdx] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v36, types: [b.AX8OpcrytEmWWdzON9t3GX2crGDGF] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v42, types: [b.kFiAqAMnNGuF0jddbuIE] */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [b.AX8OpcrytEmWWdzON9t3GX2crGDGF, b.kFiAqAMnNGuF0jddbuIE] */
    /* JADX WARN: Type inference failed for: r2v7, types: [b.AX8OpcrytEmWWdzON9t3GX2crGDGF] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v19, types: [b.kFiAqAMnNGuF0jddbuIE] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [b.kFiAqAMnNGuF0jddbuIE] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    public final Object HveD9n1tOYlffjJDxghBitYNgB(kFiAqAMnNGuF0jddbuIE kfiaqamnnguf0jddbuie, bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) throws Throwable {
        HnW1ODcJQZf9Rt7okcoWsDS hnW1ODcJQZf9Rt7okcoWsDS;
        ?? r4;
        ?? r15;
        ?? r2;
        NniqwgLR9Jo6Bl9Px0S5u nniqwgLR9Jo6Bl9Px0S5u;
        HttpException httpException;
        int i;
        boolean zFXBtMGfTIjGSHgK542;
        iHPHZIrmzz0Nhav1OcnsAYxx7Sm1 ihphzirmzz0nhav1ocnsayxx7sm1;
        String strS1zP5M3X7Ukq3ROlZ87G9I;
        int i2;
        Long lAboow6rUrcY2SrFRa46C6uy;
        long jLongValue;
        ServerConnectionException serverConnectionException;
        ?? r3;
        kFiAqAMnNGuF0jddbuIE kfiaqamnnguf0jddbuie2;
        G7lapk01c8Qj9rz59i g7lapk01c8Qj9rz59i;
        xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz;
        G7lapk01c8Qj9rz59i g7lapk01c8Qj9rz59i2;
        NniqwgLR9Jo6Bl9Px0S5u nniqwgLR9Jo6Bl9Px0S5u2;
        ?? r5;
        G7lapk01c8Qj9rz59i g7lapk01c8Qj9rz59i3;
        AuthenticationResponse authenticationResponse;
        NniqwgLR9Jo6Bl9Px0S5u nniqwgLR9Jo6Bl9Px0S5u3;
        ?? r6;
        G7lapk01c8Qj9rz59i g7lapk01c8Qj9rz59i4;
        ?? r1;
        NniqwgLR9Jo6Bl9Px0S5u nniqwgLR9Jo6Bl9Px0S5u4;
        NniqwgLR9Jo6Bl9Px0S5u nniqwgLR9Jo6Bl9Px0S5u5 = this;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof HnW1ODcJQZf9Rt7okcoWsDS) {
            hnW1ODcJQZf9Rt7okcoWsDS = (HnW1ODcJQZf9Rt7okcoWsDS) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i3 = hnW1ODcJQZf9Rt7okcoWsDS.qTa7aqjjB9Bt6mc;
            r4 = -2147483648;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hnW1ODcJQZf9Rt7okcoWsDS.qTa7aqjjB9Bt6mc = i3 - Integer.MIN_VALUE;
            } else {
                hnW1ODcJQZf9Rt7okcoWsDS = new HnW1ODcJQZf9Rt7okcoWsDS(nniqwgLR9Jo6Bl9Px0S5u5, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            hnW1ODcJQZf9Rt7okcoWsDS = new HnW1ODcJQZf9Rt7okcoWsDS(nniqwgLR9Jo6Bl9Px0S5u5, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        HnW1ODcJQZf9Rt7okcoWsDS hnW1ODcJQZf9Rt7okcoWsDS2 = hnW1ODcJQZf9Rt7okcoWsDS;
        Object objJY5knQmh7EQJEZ = hnW1ODcJQZf9Rt7okcoWsDS2.sCPtafveBAhdLIs2ajN3WV;
        ?? r7 = hnW1ODcJQZf9Rt7okcoWsDS2.qTa7aqjjB9Bt6mc;
        ?? r8 = 2;
        s9XnN7QTAJ s9xnn7qtaj = s9XnN7QTAJ.S1zP5M3X7Ukq3ROlZ87G9I;
        tIDTjdoK38 tidtjdok38 = tIDTjdoK38.GO8WUug7ZWFCUI1zY;
        try {
            try {
                if (r7 == 0) {
                    Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objJY5knQmh7EQJEZ);
                    hnW1ODcJQZf9Rt7okcoWsDS2.WIXlfFpvH7glAGsUk3 = kfiaqamnnguf0jddbuie;
                    hnW1ODcJQZf9Rt7okcoWsDS2.qTa7aqjjB9Bt6mc = 1;
                    Object objS1zP5M3X7Ukq3ROlZ87G9I = nniqwgLR9Jo6Bl9Px0S5u5.qaDSpeex0Oo1Qvt3oOrTJnbcQFp.S1zP5M3X7Ukq3ROlZ87G9I(hnW1ODcJQZf9Rt7okcoWsDS2);
                    if (objS1zP5M3X7Ukq3ROlZ87G9I != tidtjdok38) {
                        kfiaqamnnguf0jddbuie2 = kfiaqamnnguf0jddbuie;
                        objJY5knQmh7EQJEZ = objS1zP5M3X7Ukq3ROlZ87G9I;
                    }
                    return tidtjdok38;
                }
                if (r7 != 1) {
                    if (r7 != 2) {
                        if (r7 != 3) {
                            if (r7 == 4) {
                                serverConnectionException = hnW1ODcJQZf9Rt7okcoWsDS2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
                                kFiAqAMnNGuF0jddbuIE kfiaqamnnguf0jddbuie3 = hnW1ODcJQZf9Rt7okcoWsDS2.WIXlfFpvH7glAGsUk3;
                                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objJY5knQmh7EQJEZ);
                                r3 = kfiaqamnnguf0jddbuie3;
                                throw new PvException(14, r3, serverConnectionException);
                            }
                            if (r7 != 5) {
                                uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            r1 = hnW1ODcJQZf9Rt7okcoWsDS2.WIXlfFpvH7glAGsUk3;
                            try {
                                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objJY5knQmh7EQJEZ);
                                r1 = r1;
                                return s9xnn7qtaj;
                            } catch (VeException e) {
                                e = e;
                                throw new PvException(e.GO8WUug7ZWFCUI1zY, r1, e.getCause());
                            }
                        }
                        xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdx = hnW1ODcJQZf9Rt7okcoWsDS2.LcvPFGYKhAm4SS5FZ;
                        G7lapk01c8Qj9rz59i g7lapk01c8Qj9rz59i5 = hnW1ODcJQZf9Rt7okcoWsDS2.gsHzEVTj1SCIPR;
                        kFiAqAMnNGuF0jddbuIE kfiaqamnnguf0jddbuie4 = hnW1ODcJQZf9Rt7okcoWsDS2.WIXlfFpvH7glAGsUk3;
                        Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objJY5knQmh7EQJEZ);
                        nniqwgLR9Jo6Bl9Px0S5u4 = nniqwgLR9Jo6Bl9Px0S5u5;
                        g7lapk01c8Qj9rz59i3 = g7lapk01c8Qj9rz59i5;
                        r5 = kfiaqamnnguf0jddbuie4;
                        authenticationResponse = (AuthenticationResponse) objJY5knQmh7EQJEZ;
                        nniqwgLR9Jo6Bl9Px0S5u3 = nniqwgLR9Jo6Bl9Px0S5u4;
                        g7lapk01c8Qj9rz59i4 = g7lapk01c8Qj9rz59i3;
                        r6 = r5;
                        try {
                            String str = authenticationResponse.S1zP5M3X7Ukq3ROlZ87G9I;
                            hnW1ODcJQZf9Rt7okcoWsDS2.WIXlfFpvH7glAGsUk3 = r6;
                            hnW1ODcJQZf9Rt7okcoWsDS2.gsHzEVTj1SCIPR = null;
                            hnW1ODcJQZf9Rt7okcoWsDS2.LcvPFGYKhAm4SS5FZ = null;
                            hnW1ODcJQZf9Rt7okcoWsDS2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                            hnW1ODcJQZf9Rt7okcoWsDS2.qTa7aqjjB9Bt6mc = 5;
                            objJY5knQmh7EQJEZ = nniqwgLR9Jo6Bl9Px0S5u3.Bk6w7oZjoWt9ZSRs4C7jIhbX3(str, g7lapk01c8Qj9rz59i4, hnW1ODcJQZf9Rt7okcoWsDS2);
                            r8 = g7lapk01c8Qj9rz59i4;
                            if (objJY5knQmh7EQJEZ != tidtjdok38) {
                                r1 = r6;
                                return s9xnn7qtaj;
                            }
                            return tidtjdok38;
                        } catch (VeException e2) {
                            e = e2;
                            r1 = r6;
                            throw new PvException(e.GO8WUug7ZWFCUI1zY, r1, e.getCause());
                        }
                    }
                    xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdx2 = hnW1ODcJQZf9Rt7okcoWsDS2.LcvPFGYKhAm4SS5FZ;
                    G7lapk01c8Qj9rz59i g7lapk01c8Qj9rz59i6 = hnW1ODcJQZf9Rt7okcoWsDS2.gsHzEVTj1SCIPR;
                    kFiAqAMnNGuF0jddbuIE kfiaqamnnguf0jddbuie5 = hnW1ODcJQZf9Rt7okcoWsDS2.WIXlfFpvH7glAGsUk3;
                    Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objJY5knQmh7EQJEZ);
                    r7 = xwevoc3gqlsn1sxdt2gvno3hgucdx2;
                    g7lapk01c8Qj9rz59i2 = g7lapk01c8Qj9rz59i6;
                    r4 = kfiaqamnnguf0jddbuie5;
                    try {
                        authenticationResponse = (AuthenticationResponse) objJY5knQmh7EQJEZ;
                        nniqwgLR9Jo6Bl9Px0S5u3 = this;
                        g7lapk01c8Qj9rz59i4 = g7lapk01c8Qj9rz59i2;
                        r6 = r4;
                        String str2 = authenticationResponse.S1zP5M3X7Ukq3ROlZ87G9I;
                        hnW1ODcJQZf9Rt7okcoWsDS2.WIXlfFpvH7glAGsUk3 = r6;
                        hnW1ODcJQZf9Rt7okcoWsDS2.gsHzEVTj1SCIPR = null;
                        hnW1ODcJQZf9Rt7okcoWsDS2.LcvPFGYKhAm4SS5FZ = null;
                        hnW1ODcJQZf9Rt7okcoWsDS2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                        hnW1ODcJQZf9Rt7okcoWsDS2.qTa7aqjjB9Bt6mc = 5;
                        objJY5knQmh7EQJEZ = nniqwgLR9Jo6Bl9Px0S5u3.Bk6w7oZjoWt9ZSRs4C7jIhbX3(str2, g7lapk01c8Qj9rz59i4, hnW1ODcJQZf9Rt7okcoWsDS2);
                        r8 = g7lapk01c8Qj9rz59i4;
                        if (objJY5knQmh7EQJEZ != tidtjdok38) {
                            r1 = r6;
                            return s9xnn7qtaj;
                        }
                    } catch (ServerConnectionException e3) {
                        e = e3;
                        nniqwgLR9Jo6Bl9Px0S5u5 = this;
                        r15 = r7;
                        r2 = r4;
                        nniqwgLR9Jo6Bl9Px0S5u = nniqwgLR9Jo6Bl9Px0S5u5;
                        if (!(e instanceof HttpException)) {
                            if (e instanceof ParseServerResponseException) {
                                throw new PvException(3, r2, e);
                            }
                            throw new PvException(0, r2, e);
                        }
                        httpException = (HttpException) e;
                        i = httpException.GO8WUug7ZWFCUI1zY;
                        if (i == 400) {
                            zFXBtMGfTIjGSHgK542 = r2.fXBtMGfTIjGSHgK542();
                            ihphzirmzz0nhav1ocnsayxx7sm1 = nniqwgLR9Jo6Bl9Px0S5u.cCmbv8Tzd2QLd161ImIZUlZ8n;
                            if (!zFXBtMGfTIjGSHgK542) {
                                strS1zP5M3X7Ukq3ROlZ87G9I = httpException.S1zP5M3X7Ukq3ROlZ87G9I();
                                i2 = 12;
                                if (strS1zP5M3X7Ukq3ROlZ87G9I != null) {
                                    switch (strS1zP5M3X7Ukq3ROlZ87G9I.hashCode()) {
                                        case -715678495:
                                            if (strS1zP5M3X7Ukq3ROlZ87G9I.equals("INVALID_SKU_FORMAT")) {
                                                i2 = 10;
                                            }
                                            break;
                                        case 13843587:
                                            if (strS1zP5M3X7Ukq3ROlZ87G9I.equals("INVALID_PURCHASE_TOKEN")) {
                                                i2 = 13;
                                            }
                                            break;
                                        case 835121488:
                                            strS1zP5M3X7Ukq3ROlZ87G9I.equals("SKU_DATABASE_MISMATCH");
                                            break;
                                        case 1078432073:
                                            if (strS1zP5M3X7Ukq3ROlZ87G9I.equals("PURCHASE_ALREADY_ATTACHED")) {
                                                if (r2.axL8FocTDLUdzg0XScbO() || r15 == 0 || !r15.ziNFA7KzVfc6.S1zP5M3X7Ukq3ROlZ87G9I || OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(ihphzirmzz0nhav1ocnsayxx7sm1.S1zP5M3X7Ukq3ROlZ87G9I("ignore_useless_purchase_attach_fails"), Boolean.FALSE)) {
                                                    i2 = 17;
                                                }
                                            }
                                            break;
                                    }
                                }
                                throw new PvException(i2, r2, e);
                            }
                            lAboow6rUrcY2SrFRa46C6uy = ihphzirmzz0nhav1ocnsayxx7sm1.Aboow6rUrcY2SrFRa46C6uy("silence_inactive_purchase_fail_max_date");
                            if (lAboow6rUrcY2SrFRa46C6uy != null) {
                                jLongValue = lAboow6rUrcY2SrFRa46C6uy.longValue();
                            } else {
                                jLongValue = Long.MAX_VALUE;
                            }
                            if (r2.BezslBgjveK3hODH >= jLongValue) {
                                strS1zP5M3X7Ukq3ROlZ87G9I = httpException.S1zP5M3X7Ukq3ROlZ87G9I();
                                i2 = 12;
                                if (strS1zP5M3X7Ukq3ROlZ87G9I != null) {
                                    switch (strS1zP5M3X7Ukq3ROlZ87G9I.hashCode()) {
                                        case -715678495:
                                            if (strS1zP5M3X7Ukq3ROlZ87G9I.equals("INVALID_SKU_FORMAT")) {
                                                i2 = 10;
                                            }
                                            break;
                                        case 13843587:
                                            if (strS1zP5M3X7Ukq3ROlZ87G9I.equals("INVALID_PURCHASE_TOKEN")) {
                                                i2 = 13;
                                            }
                                            break;
                                        case 835121488:
                                            strS1zP5M3X7Ukq3ROlZ87G9I.equals("SKU_DATABASE_MISMATCH");
                                            break;
                                        case 1078432073:
                                            if (strS1zP5M3X7Ukq3ROlZ87G9I.equals("PURCHASE_ALREADY_ATTACHED")) {
                                                if (r2.axL8FocTDLUdzg0XScbO()) {
                                                }
                                                i2 = 17;
                                            }
                                            break;
                                    }
                                }
                                throw new PvException(i2, r2, e);
                            }
                            return s9xnn7qtaj;
                        }
                        if (i != 401) {
                            if (i != 502 || i == 504) {
                                throw new PvException(0, r2, e);
                            }
                            throw new PvException(3, r2, e);
                        }
                        hnW1ODcJQZf9Rt7okcoWsDS2.WIXlfFpvH7glAGsUk3 = r2;
                        hnW1ODcJQZf9Rt7okcoWsDS2.gsHzEVTj1SCIPR = null;
                        hnW1ODcJQZf9Rt7okcoWsDS2.LcvPFGYKhAm4SS5FZ = null;
                        hnW1ODcJQZf9Rt7okcoWsDS2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = httpException;
                        hnW1ODcJQZf9Rt7okcoWsDS2.qTa7aqjjB9Bt6mc = 4;
                        if (nniqwgLR9Jo6Bl9Px0S5u.JPYjB0bzUqKR(true, hnW1ODcJQZf9Rt7okcoWsDS2) != tidtjdok38) {
                            serverConnectionException = e;
                            r3 = r2;
                            throw new PvException(14, r3, serverConnectionException);
                        }
                    }
                    return tidtjdok38;
                }
                kFiAqAMnNGuF0jddbuIE kfiaqamnnguf0jddbuie6 = hnW1ODcJQZf9Rt7okcoWsDS2.WIXlfFpvH7glAGsUk3;
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objJY5knQmh7EQJEZ);
                kfiaqamnnguf0jddbuie2 = kfiaqamnnguf0jddbuie6;
                if (xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz == null) {
                    try {
                        QTUUDdYAQaBj qTUUDdYAQaBj = new QTUUDdYAQaBj();
                        sRgu8ykgdYOnT49j1bPuQWmquU.BezslBgjveK3hODH(qTUUDdYAQaBj);
                        qTUUDdYAQaBj.S1zP5M3X7Ukq3ROlZ87G9I("sign-in");
                        qTUUDdYAQaBj.S1zP5M3X7Ukq3ROlZ87G9I("play-purchase");
                        ZEglJWpYNlWl zEglJWpYNlWlBezslBgjveK3hODH = qTUUDdYAQaBj.BezslBgjveK3hODH();
                        try {
                            UOdbn0BbqEbVKpITLTOKPLNI uOdbn0BbqEbVKpITLTOKPLNI = new UOdbn0BbqEbVKpITLTOKPLNI(g7lapk01c8Qj9rz59i.axL8FocTDLUdzg0XScbO);
                            hnW1ODcJQZf9Rt7okcoWsDS2.WIXlfFpvH7glAGsUk3 = kfiaqamnnguf0jddbuie2;
                            hnW1ODcJQZf9Rt7okcoWsDS2.gsHzEVTj1SCIPR = g7lapk01c8Qj9rz59i;
                            hnW1ODcJQZf9Rt7okcoWsDS2.LcvPFGYKhAm4SS5FZ = xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz;
                            hnW1ODcJQZf9Rt7okcoWsDS2.qTa7aqjjB9Bt6mc = 2;
                            PeLieoBN4yxYJZju3kQtKIsq7XL8 peLieoBN4yxYJZju3kQtKIsq7XL8 = NMquq9o0FvRs5RyiTFrS.S1zP5M3X7Ukq3ROlZ87G9I;
                            kFiAqAMnNGuF0jddbuIE kfiaqamnnguf0jddbuie7 = kfiaqamnnguf0jddbuie2;
                            objJY5knQmh7EQJEZ = rbpFGdpgDCAQXat.JY5knQmh7EQJEZ(x4PcPRPmslEJW.cCmbv8Tzd2QLd161ImIZUlZ8n, new E1vQSmAuo4MQHsMm(nniqwgLR9Jo6Bl9Px0S5u5, zEglJWpYNlWlBezslBgjveK3hODH, kfiaqamnnguf0jddbuie7, uOdbn0BbqEbVKpITLTOKPLNI, null), hnW1ODcJQZf9Rt7okcoWsDS2);
                            r8 = kfiaqamnnguf0jddbuie7;
                            if (objJY5knQmh7EQJEZ != tidtjdok38) {
                                r4 = kfiaqamnnguf0jddbuie7;
                                g7lapk01c8Qj9rz59i2 = g7lapk01c8Qj9rz59i;
                                r7 = xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz;
                                authenticationResponse = (AuthenticationResponse) objJY5knQmh7EQJEZ;
                                nniqwgLR9Jo6Bl9Px0S5u3 = this;
                                g7lapk01c8Qj9rz59i4 = g7lapk01c8Qj9rz59i2;
                                r6 = r4;
                                String str3 = authenticationResponse.S1zP5M3X7Ukq3ROlZ87G9I;
                                hnW1ODcJQZf9Rt7okcoWsDS2.WIXlfFpvH7glAGsUk3 = r6;
                                hnW1ODcJQZf9Rt7okcoWsDS2.gsHzEVTj1SCIPR = null;
                                hnW1ODcJQZf9Rt7okcoWsDS2.LcvPFGYKhAm4SS5FZ = null;
                                hnW1ODcJQZf9Rt7okcoWsDS2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                                hnW1ODcJQZf9Rt7okcoWsDS2.qTa7aqjjB9Bt6mc = 5;
                                objJY5knQmh7EQJEZ = nniqwgLR9Jo6Bl9Px0S5u3.Bk6w7oZjoWt9ZSRs4C7jIhbX3(str3, g7lapk01c8Qj9rz59i4, hnW1ODcJQZf9Rt7okcoWsDS2);
                                r8 = g7lapk01c8Qj9rz59i4;
                                if (objJY5knQmh7EQJEZ != tidtjdok38) {
                                    r1 = r6;
                                    return s9xnn7qtaj;
                                }
                            }
                        } catch (ServerConnectionException e4) {
                            e = e4;
                            nniqwgLR9Jo6Bl9Px0S5u = this;
                            r2 = kfiaqamnnguf0jddbuie2;
                            r15 = xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz;
                            if (!(e instanceof HttpException)) {
                                if (e instanceof ParseServerResponseException) {
                                    throw new PvException(3, r2, e);
                                }
                                throw new PvException(0, r2, e);
                            }
                            httpException = (HttpException) e;
                            i = httpException.GO8WUug7ZWFCUI1zY;
                            if (i == 400) {
                                zFXBtMGfTIjGSHgK542 = r2.fXBtMGfTIjGSHgK542();
                                ihphzirmzz0nhav1ocnsayxx7sm1 = nniqwgLR9Jo6Bl9Px0S5u.cCmbv8Tzd2QLd161ImIZUlZ8n;
                                if (!zFXBtMGfTIjGSHgK542) {
                                    strS1zP5M3X7Ukq3ROlZ87G9I = httpException.S1zP5M3X7Ukq3ROlZ87G9I();
                                    i2 = 12;
                                    if (strS1zP5M3X7Ukq3ROlZ87G9I != null) {
                                        switch (strS1zP5M3X7Ukq3ROlZ87G9I.hashCode()) {
                                            case -715678495:
                                                if (strS1zP5M3X7Ukq3ROlZ87G9I.equals("INVALID_SKU_FORMAT")) {
                                                    i2 = 10;
                                                }
                                                break;
                                            case 13843587:
                                                if (strS1zP5M3X7Ukq3ROlZ87G9I.equals("INVALID_PURCHASE_TOKEN")) {
                                                    i2 = 13;
                                                }
                                                break;
                                            case 835121488:
                                                strS1zP5M3X7Ukq3ROlZ87G9I.equals("SKU_DATABASE_MISMATCH");
                                                break;
                                            case 1078432073:
                                                if (strS1zP5M3X7Ukq3ROlZ87G9I.equals("PURCHASE_ALREADY_ATTACHED")) {
                                                    if (r2.axL8FocTDLUdzg0XScbO()) {
                                                    }
                                                    i2 = 17;
                                                }
                                                break;
                                        }
                                    }
                                    throw new PvException(i2, r2, e);
                                }
                                lAboow6rUrcY2SrFRa46C6uy = ihphzirmzz0nhav1ocnsayxx7sm1.Aboow6rUrcY2SrFRa46C6uy("silence_inactive_purchase_fail_max_date");
                                if (lAboow6rUrcY2SrFRa46C6uy != null) {
                                    jLongValue = lAboow6rUrcY2SrFRa46C6uy.longValue();
                                } else {
                                    jLongValue = Long.MAX_VALUE;
                                }
                                if (r2.BezslBgjveK3hODH >= jLongValue) {
                                    strS1zP5M3X7Ukq3ROlZ87G9I = httpException.S1zP5M3X7Ukq3ROlZ87G9I();
                                    i2 = 12;
                                    if (strS1zP5M3X7Ukq3ROlZ87G9I != null) {
                                        switch (strS1zP5M3X7Ukq3ROlZ87G9I.hashCode()) {
                                            case -715678495:
                                                if (strS1zP5M3X7Ukq3ROlZ87G9I.equals("INVALID_SKU_FORMAT")) {
                                                    i2 = 10;
                                                }
                                                break;
                                            case 13843587:
                                                if (strS1zP5M3X7Ukq3ROlZ87G9I.equals("INVALID_PURCHASE_TOKEN")) {
                                                    i2 = 13;
                                                }
                                                break;
                                            case 835121488:
                                                strS1zP5M3X7Ukq3ROlZ87G9I.equals("SKU_DATABASE_MISMATCH");
                                                break;
                                            case 1078432073:
                                                if (strS1zP5M3X7Ukq3ROlZ87G9I.equals("PURCHASE_ALREADY_ATTACHED")) {
                                                    if (r2.axL8FocTDLUdzg0XScbO()) {
                                                    }
                                                    i2 = 17;
                                                }
                                                break;
                                        }
                                    }
                                    throw new PvException(i2, r2, e);
                                }
                                return s9xnn7qtaj;
                            }
                            if (i != 401) {
                                if (i != 502) {
                                }
                                throw new PvException(0, r2, e);
                            }
                            hnW1ODcJQZf9Rt7okcoWsDS2.WIXlfFpvH7glAGsUk3 = r2;
                            hnW1ODcJQZf9Rt7okcoWsDS2.gsHzEVTj1SCIPR = null;
                            hnW1ODcJQZf9Rt7okcoWsDS2.LcvPFGYKhAm4SS5FZ = null;
                            hnW1ODcJQZf9Rt7okcoWsDS2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = httpException;
                            hnW1ODcJQZf9Rt7okcoWsDS2.qTa7aqjjB9Bt6mc = 4;
                            if (nniqwgLR9Jo6Bl9Px0S5u.JPYjB0bzUqKR(true, hnW1ODcJQZf9Rt7okcoWsDS2) != tidtjdok38) {
                                serverConnectionException = e;
                                r3 = r2;
                                throw new PvException(14, r3, serverConnectionException);
                            }
                        }
                    } catch (ServerConnectionException e5) {
                        e = e5;
                        r8 = kfiaqamnnguf0jddbuie2;
                        nniqwgLR9Jo6Bl9Px0S5u2 = this;
                        r2 = r8;
                        nniqwgLR9Jo6Bl9Px0S5u = nniqwgLR9Jo6Bl9Px0S5u2;
                        r15 = xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz;
                        if (!(e instanceof HttpException)) {
                            if (e instanceof ParseServerResponseException) {
                                throw new PvException(3, r2, e);
                            }
                            throw new PvException(0, r2, e);
                        }
                        httpException = (HttpException) e;
                        i = httpException.GO8WUug7ZWFCUI1zY;
                        if (i == 400) {
                            if (i != 401) {
                                if (i != 502) {
                                }
                                throw new PvException(0, r2, e);
                            }
                            hnW1ODcJQZf9Rt7okcoWsDS2.WIXlfFpvH7glAGsUk3 = r2;
                            hnW1ODcJQZf9Rt7okcoWsDS2.gsHzEVTj1SCIPR = null;
                            hnW1ODcJQZf9Rt7okcoWsDS2.LcvPFGYKhAm4SS5FZ = null;
                            hnW1ODcJQZf9Rt7okcoWsDS2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = httpException;
                            hnW1ODcJQZf9Rt7okcoWsDS2.qTa7aqjjB9Bt6mc = 4;
                            if (nniqwgLR9Jo6Bl9Px0S5u.JPYjB0bzUqKR(true, hnW1ODcJQZf9Rt7okcoWsDS2) != tidtjdok38) {
                                serverConnectionException = e;
                                r3 = r2;
                                throw new PvException(14, r3, serverConnectionException);
                            }
                            return tidtjdok38;
                        }
                        zFXBtMGfTIjGSHgK542 = r2.fXBtMGfTIjGSHgK542();
                        ihphzirmzz0nhav1ocnsayxx7sm1 = nniqwgLR9Jo6Bl9Px0S5u.cCmbv8Tzd2QLd161ImIZUlZ8n;
                        if (!zFXBtMGfTIjGSHgK542) {
                            strS1zP5M3X7Ukq3ROlZ87G9I = httpException.S1zP5M3X7Ukq3ROlZ87G9I();
                            i2 = 12;
                            if (strS1zP5M3X7Ukq3ROlZ87G9I != null) {
                                switch (strS1zP5M3X7Ukq3ROlZ87G9I.hashCode()) {
                                    case -715678495:
                                        if (strS1zP5M3X7Ukq3ROlZ87G9I.equals("INVALID_SKU_FORMAT")) {
                                            i2 = 10;
                                        }
                                        break;
                                    case 13843587:
                                        if (strS1zP5M3X7Ukq3ROlZ87G9I.equals("INVALID_PURCHASE_TOKEN")) {
                                            i2 = 13;
                                        }
                                        break;
                                    case 835121488:
                                        strS1zP5M3X7Ukq3ROlZ87G9I.equals("SKU_DATABASE_MISMATCH");
                                        break;
                                    case 1078432073:
                                        if (strS1zP5M3X7Ukq3ROlZ87G9I.equals("PURCHASE_ALREADY_ATTACHED")) {
                                            if (r2.axL8FocTDLUdzg0XScbO()) {
                                            }
                                            i2 = 17;
                                        }
                                        break;
                                }
                            }
                            throw new PvException(i2, r2, e);
                        }
                        lAboow6rUrcY2SrFRa46C6uy = ihphzirmzz0nhav1ocnsayxx7sm1.Aboow6rUrcY2SrFRa46C6uy("silence_inactive_purchase_fail_max_date");
                        if (lAboow6rUrcY2SrFRa46C6uy != null) {
                            jLongValue = lAboow6rUrcY2SrFRa46C6uy.longValue();
                        } else {
                            jLongValue = Long.MAX_VALUE;
                        }
                        if (r2.BezslBgjveK3hODH >= jLongValue) {
                            strS1zP5M3X7Ukq3ROlZ87G9I = httpException.S1zP5M3X7Ukq3ROlZ87G9I();
                            i2 = 12;
                            if (strS1zP5M3X7Ukq3ROlZ87G9I != null) {
                                switch (strS1zP5M3X7Ukq3ROlZ87G9I.hashCode()) {
                                    case -715678495:
                                        if (strS1zP5M3X7Ukq3ROlZ87G9I.equals("INVALID_SKU_FORMAT")) {
                                            i2 = 10;
                                        }
                                        break;
                                    case 13843587:
                                        if (strS1zP5M3X7Ukq3ROlZ87G9I.equals("INVALID_PURCHASE_TOKEN")) {
                                            i2 = 13;
                                        }
                                        break;
                                    case 835121488:
                                        strS1zP5M3X7Ukq3ROlZ87G9I.equals("SKU_DATABASE_MISMATCH");
                                        break;
                                    case 1078432073:
                                        if (strS1zP5M3X7Ukq3ROlZ87G9I.equals("PURCHASE_ALREADY_ATTACHED")) {
                                            if (r2.axL8FocTDLUdzg0XScbO()) {
                                            }
                                            i2 = 17;
                                        }
                                        break;
                                }
                            }
                            throw new PvException(i2, r2, e);
                        }
                        return s9xnn7qtaj;
                    }
                } else {
                    r8 = kfiaqamnnguf0jddbuie2;
                    try {
                        QTUUDdYAQaBj qTUUDdYAQaBj2 = new QTUUDdYAQaBj();
                        sRgu8ykgdYOnT49j1bPuQWmquU.BezslBgjveK3hODH(qTUUDdYAQaBj2);
                        qTUUDdYAQaBj2.S1zP5M3X7Ukq3ROlZ87G9I("attach");
                        qTUUDdYAQaBj2.S1zP5M3X7Ukq3ROlZ87G9I("play-purchase");
                        ZEglJWpYNlWl zEglJWpYNlWlBezslBgjveK3hODH2 = qTUUDdYAQaBj2.BezslBgjveK3hODH();
                        tRh8nLx7q1GvbQd trh8nlx7q1gvbqd = new tRh8nLx7q1GvbQd(g7lapk01c8Qj9rz59i.axL8FocTDLUdzg0XScbO, xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz.BezslBgjveK3hODH);
                        hnW1ODcJQZf9Rt7okcoWsDS2.WIXlfFpvH7glAGsUk3 = r8;
                        hnW1ODcJQZf9Rt7okcoWsDS2.gsHzEVTj1SCIPR = g7lapk01c8Qj9rz59i;
                        hnW1ODcJQZf9Rt7okcoWsDS2.LcvPFGYKhAm4SS5FZ = xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz;
                        hnW1ODcJQZf9Rt7okcoWsDS2.qTa7aqjjB9Bt6mc = 3;
                        PeLieoBN4yxYJZju3kQtKIsq7XL8 peLieoBN4yxYJZju3kQtKIsq7XL9 = NMquq9o0FvRs5RyiTFrS.S1zP5M3X7Ukq3ROlZ87G9I;
                        nniqwgLR9Jo6Bl9Px0S5u2 = this;
                        try {
                            objJY5knQmh7EQJEZ = rbpFGdpgDCAQXat.JY5knQmh7EQJEZ(x4PcPRPmslEJW.cCmbv8Tzd2QLd161ImIZUlZ8n, new E1vQSmAuo4MQHsMm(nniqwgLR9Jo6Bl9Px0S5u2, zEglJWpYNlWlBezslBgjveK3hODH2, r8, trh8nlx7q1gvbqd, null), hnW1ODcJQZf9Rt7okcoWsDS2);
                            r8 = r8;
                            if (objJY5knQmh7EQJEZ != tidtjdok38) {
                                r5 = r8;
                                g7lapk01c8Qj9rz59i3 = g7lapk01c8Qj9rz59i;
                                nniqwgLR9Jo6Bl9Px0S5u4 = nniqwgLR9Jo6Bl9Px0S5u2;
                                authenticationResponse = (AuthenticationResponse) objJY5knQmh7EQJEZ;
                                nniqwgLR9Jo6Bl9Px0S5u3 = nniqwgLR9Jo6Bl9Px0S5u4;
                                g7lapk01c8Qj9rz59i4 = g7lapk01c8Qj9rz59i3;
                                r6 = r5;
                                String str4 = authenticationResponse.S1zP5M3X7Ukq3ROlZ87G9I;
                                hnW1ODcJQZf9Rt7okcoWsDS2.WIXlfFpvH7glAGsUk3 = r6;
                                hnW1ODcJQZf9Rt7okcoWsDS2.gsHzEVTj1SCIPR = null;
                                hnW1ODcJQZf9Rt7okcoWsDS2.LcvPFGYKhAm4SS5FZ = null;
                                hnW1ODcJQZf9Rt7okcoWsDS2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                                hnW1ODcJQZf9Rt7okcoWsDS2.qTa7aqjjB9Bt6mc = 5;
                                objJY5knQmh7EQJEZ = nniqwgLR9Jo6Bl9Px0S5u3.Bk6w7oZjoWt9ZSRs4C7jIhbX3(str4, g7lapk01c8Qj9rz59i4, hnW1ODcJQZf9Rt7okcoWsDS2);
                                r8 = g7lapk01c8Qj9rz59i4;
                                if (objJY5knQmh7EQJEZ != tidtjdok38) {
                                    r1 = r6;
                                    return s9xnn7qtaj;
                                }
                            }
                        } catch (ServerConnectionException e6) {
                            e = e6;
                            r2 = r8;
                            nniqwgLR9Jo6Bl9Px0S5u = nniqwgLR9Jo6Bl9Px0S5u2;
                            r15 = xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz;
                            if (!(e instanceof HttpException)) {
                                if (e instanceof ParseServerResponseException) {
                                    throw new PvException(3, r2, e);
                                }
                                throw new PvException(0, r2, e);
                            }
                            httpException = (HttpException) e;
                            i = httpException.GO8WUug7ZWFCUI1zY;
                            if (i == 400) {
                                zFXBtMGfTIjGSHgK542 = r2.fXBtMGfTIjGSHgK542();
                                ihphzirmzz0nhav1ocnsayxx7sm1 = nniqwgLR9Jo6Bl9Px0S5u.cCmbv8Tzd2QLd161ImIZUlZ8n;
                                if (!zFXBtMGfTIjGSHgK542) {
                                    strS1zP5M3X7Ukq3ROlZ87G9I = httpException.S1zP5M3X7Ukq3ROlZ87G9I();
                                    i2 = 12;
                                    if (strS1zP5M3X7Ukq3ROlZ87G9I != null) {
                                        switch (strS1zP5M3X7Ukq3ROlZ87G9I.hashCode()) {
                                            case -715678495:
                                                if (strS1zP5M3X7Ukq3ROlZ87G9I.equals("INVALID_SKU_FORMAT")) {
                                                    i2 = 10;
                                                }
                                                break;
                                            case 13843587:
                                                if (strS1zP5M3X7Ukq3ROlZ87G9I.equals("INVALID_PURCHASE_TOKEN")) {
                                                    i2 = 13;
                                                }
                                                break;
                                            case 835121488:
                                                strS1zP5M3X7Ukq3ROlZ87G9I.equals("SKU_DATABASE_MISMATCH");
                                                break;
                                            case 1078432073:
                                                if (strS1zP5M3X7Ukq3ROlZ87G9I.equals("PURCHASE_ALREADY_ATTACHED")) {
                                                    if (r2.axL8FocTDLUdzg0XScbO()) {
                                                    }
                                                    i2 = 17;
                                                }
                                                break;
                                        }
                                    }
                                    throw new PvException(i2, r2, e);
                                }
                                lAboow6rUrcY2SrFRa46C6uy = ihphzirmzz0nhav1ocnsayxx7sm1.Aboow6rUrcY2SrFRa46C6uy("silence_inactive_purchase_fail_max_date");
                                if (lAboow6rUrcY2SrFRa46C6uy != null) {
                                    jLongValue = lAboow6rUrcY2SrFRa46C6uy.longValue();
                                } else {
                                    jLongValue = Long.MAX_VALUE;
                                }
                                if (r2.BezslBgjveK3hODH >= jLongValue) {
                                    strS1zP5M3X7Ukq3ROlZ87G9I = httpException.S1zP5M3X7Ukq3ROlZ87G9I();
                                    i2 = 12;
                                    if (strS1zP5M3X7Ukq3ROlZ87G9I != null) {
                                        switch (strS1zP5M3X7Ukq3ROlZ87G9I.hashCode()) {
                                            case -715678495:
                                                if (strS1zP5M3X7Ukq3ROlZ87G9I.equals("INVALID_SKU_FORMAT")) {
                                                    i2 = 10;
                                                }
                                                break;
                                            case 13843587:
                                                if (strS1zP5M3X7Ukq3ROlZ87G9I.equals("INVALID_PURCHASE_TOKEN")) {
                                                    i2 = 13;
                                                }
                                                break;
                                            case 835121488:
                                                strS1zP5M3X7Ukq3ROlZ87G9I.equals("SKU_DATABASE_MISMATCH");
                                                break;
                                            case 1078432073:
                                                if (strS1zP5M3X7Ukq3ROlZ87G9I.equals("PURCHASE_ALREADY_ATTACHED")) {
                                                    if (r2.axL8FocTDLUdzg0XScbO()) {
                                                    }
                                                    i2 = 17;
                                                }
                                                break;
                                        }
                                    }
                                    throw new PvException(i2, r2, e);
                                }
                                return s9xnn7qtaj;
                            }
                            if (i != 401) {
                                if (i != 502) {
                                }
                                throw new PvException(0, r2, e);
                            }
                            hnW1ODcJQZf9Rt7okcoWsDS2.WIXlfFpvH7glAGsUk3 = r2;
                            hnW1ODcJQZf9Rt7okcoWsDS2.gsHzEVTj1SCIPR = null;
                            hnW1ODcJQZf9Rt7okcoWsDS2.LcvPFGYKhAm4SS5FZ = null;
                            hnW1ODcJQZf9Rt7okcoWsDS2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = httpException;
                            hnW1ODcJQZf9Rt7okcoWsDS2.qTa7aqjjB9Bt6mc = 4;
                            if (nniqwgLR9Jo6Bl9Px0S5u.JPYjB0bzUqKR(true, hnW1ODcJQZf9Rt7okcoWsDS2) != tidtjdok38) {
                                serverConnectionException = e;
                                r3 = r2;
                                throw new PvException(14, r3, serverConnectionException);
                            }
                        }
                    } catch (ServerConnectionException e7) {
                        e = e7;
                        nniqwgLR9Jo6Bl9Px0S5u2 = this;
                        r2 = r8;
                        nniqwgLR9Jo6Bl9Px0S5u = nniqwgLR9Jo6Bl9Px0S5u2;
                        r15 = xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz;
                        if (!(e instanceof HttpException)) {
                            if (e instanceof ParseServerResponseException) {
                                throw new PvException(3, r2, e);
                            }
                            throw new PvException(0, r2, e);
                        }
                        httpException = (HttpException) e;
                        i = httpException.GO8WUug7ZWFCUI1zY;
                        if (i == 400) {
                            if (i != 401) {
                                if (i != 502) {
                                }
                                throw new PvException(0, r2, e);
                            }
                            hnW1ODcJQZf9Rt7okcoWsDS2.WIXlfFpvH7glAGsUk3 = r2;
                            hnW1ODcJQZf9Rt7okcoWsDS2.gsHzEVTj1SCIPR = null;
                            hnW1ODcJQZf9Rt7okcoWsDS2.LcvPFGYKhAm4SS5FZ = null;
                            hnW1ODcJQZf9Rt7okcoWsDS2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = httpException;
                            hnW1ODcJQZf9Rt7okcoWsDS2.qTa7aqjjB9Bt6mc = 4;
                            if (nniqwgLR9Jo6Bl9Px0S5u.JPYjB0bzUqKR(true, hnW1ODcJQZf9Rt7okcoWsDS2) != tidtjdok38) {
                                serverConnectionException = e;
                                r3 = r2;
                                throw new PvException(14, r3, serverConnectionException);
                            }
                            return tidtjdok38;
                        }
                        zFXBtMGfTIjGSHgK542 = r2.fXBtMGfTIjGSHgK542();
                        ihphzirmzz0nhav1ocnsayxx7sm1 = nniqwgLR9Jo6Bl9Px0S5u.cCmbv8Tzd2QLd161ImIZUlZ8n;
                        if (!zFXBtMGfTIjGSHgK542) {
                            strS1zP5M3X7Ukq3ROlZ87G9I = httpException.S1zP5M3X7Ukq3ROlZ87G9I();
                            i2 = 12;
                            if (strS1zP5M3X7Ukq3ROlZ87G9I != null) {
                                switch (strS1zP5M3X7Ukq3ROlZ87G9I.hashCode()) {
                                    case -715678495:
                                        if (strS1zP5M3X7Ukq3ROlZ87G9I.equals("INVALID_SKU_FORMAT")) {
                                            i2 = 10;
                                        }
                                        break;
                                    case 13843587:
                                        if (strS1zP5M3X7Ukq3ROlZ87G9I.equals("INVALID_PURCHASE_TOKEN")) {
                                            i2 = 13;
                                        }
                                        break;
                                    case 835121488:
                                        strS1zP5M3X7Ukq3ROlZ87G9I.equals("SKU_DATABASE_MISMATCH");
                                        break;
                                    case 1078432073:
                                        if (strS1zP5M3X7Ukq3ROlZ87G9I.equals("PURCHASE_ALREADY_ATTACHED")) {
                                            if (r2.axL8FocTDLUdzg0XScbO()) {
                                            }
                                            i2 = 17;
                                        }
                                        break;
                                }
                            }
                            throw new PvException(i2, r2, e);
                        }
                        lAboow6rUrcY2SrFRa46C6uy = ihphzirmzz0nhav1ocnsayxx7sm1.Aboow6rUrcY2SrFRa46C6uy("silence_inactive_purchase_fail_max_date");
                        if (lAboow6rUrcY2SrFRa46C6uy != null) {
                            jLongValue = lAboow6rUrcY2SrFRa46C6uy.longValue();
                        } else {
                            jLongValue = Long.MAX_VALUE;
                        }
                        if (r2.BezslBgjveK3hODH >= jLongValue) {
                            strS1zP5M3X7Ukq3ROlZ87G9I = httpException.S1zP5M3X7Ukq3ROlZ87G9I();
                            i2 = 12;
                            if (strS1zP5M3X7Ukq3ROlZ87G9I != null) {
                                switch (strS1zP5M3X7Ukq3ROlZ87G9I.hashCode()) {
                                    case -715678495:
                                        if (strS1zP5M3X7Ukq3ROlZ87G9I.equals("INVALID_SKU_FORMAT")) {
                                            i2 = 10;
                                        }
                                        break;
                                    case 13843587:
                                        if (strS1zP5M3X7Ukq3ROlZ87G9I.equals("INVALID_PURCHASE_TOKEN")) {
                                            i2 = 13;
                                        }
                                        break;
                                    case 835121488:
                                        strS1zP5M3X7Ukq3ROlZ87G9I.equals("SKU_DATABASE_MISMATCH");
                                        break;
                                    case 1078432073:
                                        if (strS1zP5M3X7Ukq3ROlZ87G9I.equals("PURCHASE_ALREADY_ATTACHED")) {
                                            if (r2.axL8FocTDLUdzg0XScbO()) {
                                            }
                                            i2 = 17;
                                        }
                                        break;
                                }
                            }
                            throw new PvException(i2, r2, e);
                        }
                        return s9xnn7qtaj;
                    }
                }
            } catch (ServerConnectionException e8) {
                e = e8;
            }
            g7lapk01c8Qj9rz59i = (G7lapk01c8Qj9rz59i) objJY5knQmh7EQJEZ;
            xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz = nniqwgLR9Jo6Bl9Px0S5u5.PQQPeCDD0JLCT3aLz();
        } catch (ServerConnectionException e9) {
            e = e9;
        }
        return tidtjdok38;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        if (((b.lGu4hbqDeY14JtrULY2Bza9Y) r8.sCPtafveBAhdLIs2ajN3WV).Aboow6rUrcY2SrFRa46C6uy(b.zvrDNoSsQjNXqoxr.NIAGARALD_USER_DATA_REFRESH, r0) == r6) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object JPYjB0bzUqKR(boolean r9, b.bMjZFECsuU6MdmSOqmYrlYsV3oEeB r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof b.jvQ453o5zOHLJc
            if (r0 == 0) goto L13
            r0 = r10
            b.jvQ453o5zOHLJc r0 = (b.jvQ453o5zOHLJc) r0
            int r1 = r0.qaDSpeex0Oo1Qvt3oOrTJnbcQFp
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = r1
            goto L18
        L13:
            b.jvQ453o5zOHLJc r0 = new b.jvQ453o5zOHLJc
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.gsHzEVTj1SCIPR
            int r1 = r0.qaDSpeex0Oo1Qvt3oOrTJnbcQFp
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            b.tIDTjdoK38 r6 = b.tIDTjdoK38.GO8WUug7ZWFCUI1zY
            if (r1 == 0) goto L44
            if (r1 == r5) goto L3e
            if (r1 == r4) goto L38
            if (r1 != r3) goto L32
            b.Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(r10)
            b.J7Tsg1eqTfbK8vIo4RFOyjPiu r10 = (b.J7Tsg1eqTfbK8vIo4RFOyjPiu) r10
            java.lang.Object r8 = r10.S1zP5M3X7Ukq3ROlZ87G9I
            goto L81
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            b.uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG(r8)
            return r2
        L38:
            boolean r9 = r0.WIXlfFpvH7glAGsUk3
            b.Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(r10)
            goto L70
        L3e:
            boolean r9 = r0.WIXlfFpvH7glAGsUk3
            b.Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(r10)
            goto L5c
        L44:
            b.Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(r10)
            b.PeLieoBN4yxYJZju3kQtKIsq7XL8 r10 = b.NMquq9o0FvRs5RyiTFrS.S1zP5M3X7Ukq3ROlZ87G9I
            b.x4PcPRPmslEJW r10 = b.x4PcPRPmslEJW.cCmbv8Tzd2QLd161ImIZUlZ8n
            b.hz8gXL0MSZdMP r1 = new b.hz8gXL0MSZdMP
            r7 = 4
            r1.<init>(r8, r2, r7)
            r0.WIXlfFpvH7glAGsUk3 = r9
            r0.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = r5
            java.lang.Object r10 = b.rbpFGdpgDCAQXat.JY5knQmh7EQJEZ(r10, r1, r0)
            if (r10 != r6) goto L5c
            goto L80
        L5c:
            b.PeLieoBN4yxYJZju3kQtKIsq7XL8 r10 = b.NMquq9o0FvRs5RyiTFrS.S1zP5M3X7Ukq3ROlZ87G9I
            b.FAcOmIkfv5ix8sNJsaM6iT r10 = b.amndRZ6ZiSy4ZOFMYy0W.S1zP5M3X7Ukq3ROlZ87G9I
            b.Jul0FAfcc5159Ef2 r1 = new b.Jul0FAfcc5159Ef2
            r1.<init>(r8, r9, r2, r4)
            r0.WIXlfFpvH7glAGsUk3 = r9
            r0.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = r4
            java.lang.Object r10 = b.rbpFGdpgDCAQXat.JY5knQmh7EQJEZ(r10, r1, r0)
            if (r10 != r6) goto L70
            goto L80
        L70:
            r0.WIXlfFpvH7glAGsUk3 = r9
            r0.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = r3
            b.O6lZlYscUJqRKM r8 = r8.sCPtafveBAhdLIs2ajN3WV
            b.lGu4hbqDeY14JtrULY2Bza9Y r8 = (b.lGu4hbqDeY14JtrULY2Bza9Y) r8
            b.zvrDNoSsQjNXqoxr r9 = b.zvrDNoSsQjNXqoxr.NIAGARALD_USER_DATA_REFRESH
            java.lang.Object r8 = r8.Aboow6rUrcY2SrFRa46C6uy(r9, r0)
            if (r8 != r6) goto L81
        L80:
            return r6
        L81:
            b.s9XnN7QTAJ r8 = b.s9XnN7QTAJ.S1zP5M3X7Ukq3ROlZ87G9I
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: bitpit.launcher.niagarald.NniqwgLR9Jo6Bl9Px0S5u.JPYjB0bzUqKR(boolean, b.bMjZFECsuU6MdmSOqmYrlYsV3oEeB):java.lang.Object");
    }

    public final ycFnS0z9Ddi2h4oSFO3lrkbjZ0cm8 JY5knQmh7EQJEZ() {
        xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz = PQQPeCDD0JLCT3aLz();
        return xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz != null ? xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz.ziNFA7KzVfc6 : new ycFnS0z9Ddi2h4oSFO3lrkbjZ0cm8(false, false, false);
    }

    public final boolean LYcdI4xpry8eXmFC9I4wyaLdcG1z() {
        SharedPreferences sharedPreferences = this.gsHzEVTj1SCIPR;
        boolean z = sharedPreferences.getBoolean("bitpit.launcher.key.ASK_USER_TO_LOG_IN_AGAIN", false);
        if (!z || PQQPeCDD0JLCT3aLz() == null) {
            return z;
        }
        aJLiMmqfPh61r.sBV5EuS0mGuEYqc5nc5erhuwb1OG7(sharedPreferences, "bitpit.launcher.key.ASK_USER_TO_LOG_IN_AGAIN", false);
        return false;
    }

    public final xWEvOc3gqLSn1SXDt2GvNO3HGucdx PQQPeCDD0JLCT3aLz() {
        return (xWEvOc3gqLSn1SXDt2GvNO3HGucdx) this.yM5HHkk1MhPLZFYTHm2JjrArud.get();
    }

    public final void Ql6q60SSx3(xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdx) {
        int size;
        if (!this.iR1XUIc7FjhMl57O.Aboow6rUrcY2SrFRa46C6uy()) {
            uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("Writing user data not allowed without holding mutex");
            return;
        }
        SharedPreferences sharedPreferences = this.gsHzEVTj1SCIPR;
        xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdxAxL8FocTDLUdzg0XScbO = xwevoc3gqlsn1sxdt2gvno3hgucdx != null ? xwevoc3gqlsn1sxdt2gvno3hgucdx.axL8FocTDLUdzg0XScbO(sharedPreferences) : null;
        if (xwevoc3gqlsn1sxdt2gvno3hgucdxAxL8FocTDLUdzg0XScbO != null && LYcdI4xpry8eXmFC9I4wyaLdcG1z()) {
            aJLiMmqfPh61r.sBV5EuS0mGuEYqc5nc5erhuwb1OG7(sharedPreferences, "bitpit.launcher.key.ASK_USER_TO_LOG_IN_AGAIN", false);
        }
        AtomicReference atomicReference = this.yM5HHkk1MhPLZFYTHm2JjrArud;
        xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdx2 = (xWEvOc3gqLSn1SXDt2GvNO3HGucdx) atomicReference.get();
        ycFnS0z9Ddi2h4oSFO3lrkbjZ0cm8 ycfns0z9ddi2h4osfo3lrkbjz0cm8 = xwevoc3gqlsn1sxdt2gvno3hgucdx2 != null ? xwevoc3gqlsn1sxdt2gvno3hgucdx2.ziNFA7KzVfc6 : new ycFnS0z9Ddi2h4oSFO3lrkbjZ0cm8(false, false, false);
        ycFnS0z9Ddi2h4oSFO3lrkbjZ0cm8 ycfns0z9ddi2h4osfo3lrkbjz0cm9 = xwevoc3gqlsn1sxdt2gvno3hgucdxAxL8FocTDLUdzg0XScbO != null ? xwevoc3gqlsn1sxdt2gvno3hgucdxAxL8FocTDLUdzg0XScbO.ziNFA7KzVfc6 : new ycFnS0z9Ddi2h4oSFO3lrkbjZ0cm8(false, false, false);
        atomicReference.set(xwevoc3gqlsn1sxdt2gvno3hgucdxAxL8FocTDLUdzg0XScbO);
        boolean zEquals = ycfns0z9ddi2h4osfo3lrkbjz0cm8.equals(ycfns0z9ddi2h4osfo3lrkbjz0cm9);
        boolean z = !zEquals;
        ArrayList arrayList = this.f2sXlW3st0rAKJwyOrCfOWc.GO8WUug7ZWFCUI1zY;
        if (arrayList.isEmpty() || (size = arrayList.size() - 1) < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            DqzIs39qhlX8it8XteO dqzIs39qhlX8it8XteO = (DqzIs39qhlX8it8XteO) arrayList.get(size);
            dqzIs39qhlX8it8XteO.sBV5EuS0mGuEYqc5nc5erhuwb1OG7(xwevoc3gqlsn1sxdt2gvno3hgucdxAxL8FocTDLUdzg0XScbO, z);
            if (!zEquals) {
                dqzIs39qhlX8it8XteO.BezslBgjveK3hODH(ycfns0z9ddi2h4osfo3lrkbjz0cm9);
            }
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:38:0x0107  */
    /* JADX WARN: Code duplicated, block: B:42:0x0128  */
    /* JADX WARN: Code duplicated, block: B:45:0x0130  */
    /* JADX WARN: Code duplicated, block: B:47:0x013a  */
    /* JADX WARN: Code duplicated, block: B:48:0x013d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0156  */
    /* JADX WARN: Code duplicated, block: B:55:0x015d  */
    /* JADX WARN: Code duplicated, block: B:61:0x019d  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:70:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:76:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x017f A[EXC_TOP_SPLITTER, PHI: r1 r4 r7 r13 r14
  0x017f: PHI (r1v19 b.xWEvOc3gqLSn1SXDt2GvNO3HGucdx) = (r1v17 b.xWEvOc3gqLSn1SXDt2GvNO3HGucdx), (r1v21 b.xWEvOc3gqLSn1SXDt2GvNO3HGucdx) binds: [B:56:0x017c, B:17:0x0040] A[DONT_GENERATE, DONT_INLINE]
  0x017f: PHI (r4v4 bitpit.launcher.backend.account.model.AuthenticationResponse) = 
  (r4v3 bitpit.launcher.backend.account.model.AuthenticationResponse)
  (r4v6 bitpit.launcher.backend.account.model.AuthenticationResponse)
 binds: [B:56:0x017c, B:17:0x0040] A[DONT_GENERATE, DONT_INLINE]
  0x017f: PHI (r7v14 b.G7lapk01c8Qj9rz59i) = (r7v12 b.G7lapk01c8Qj9rz59i), (r7v19 b.G7lapk01c8Qj9rz59i) binds: [B:56:0x017c, B:17:0x0040] A[DONT_GENERATE, DONT_INLINE]
  0x017f: PHI (r13v24 b.Ka8INCBqfwCeAoFT4mw74QJG) = (r13v18 b.Ka8INCBqfwCeAoFT4mw74QJG), (r13v28 b.Ka8INCBqfwCeAoFT4mw74QJG) binds: [B:56:0x017c, B:17:0x0040] A[DONT_GENERATE, DONT_INLINE]
  0x017f: PHI (r14v28 int) = (r14v25 int), (r14v31 int) binds: [B:56:0x017c, B:17:0x0040] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public final Object S1zP5M3X7Ukq3ROlZ87G9I(wFIO6q9fiuz1bTK wfio6q9fiuz1btk, bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) throws Throwable {
        M09PCcKE8f3p5upL5YjVWVv m09PCcKE8f3p5upL5YjVWVv;
        wFIO6q9fiuz1bTK wfio6q9fiuz1btk2;
        xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdx;
        G7lapk01c8Qj9rz59i g7lapk01c8Qj9rz59i;
        tRh8nLx7q1GvbQd trh8nlx7q1gvbqd;
        Object objAxL8FocTDLUdzg0XScbO;
        G7lapk01c8Qj9rz59i g7lapk01c8Qj9rz59i2;
        Object obj;
        wFIO6q9fiuz1bTK wfio6q9fiuz1btk3;
        xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdx2;
        tRh8nLx7q1GvbQd trh8nlx7q1gvbqd2;
        Throwable thS1zP5M3X7Ukq3ROlZ87G9I;
        GoogleAuthClientSession googleAuthClientSession;
        Object objS1zP5M3X7Ukq3ROlZ87G9I;
        tRh8nLx7q1GvbQd trh8nlx7q1gvbqd3;
        GoogleAuthClientSession googleAuthClientSession2;
        G7lapk01c8Qj9rz59i g7lapk01c8Qj9rz59i3;
        LJmIWKCOd33Br lJmIWKCOd33Br;
        tRh8nLx7q1GvbQd trh8nlx7q1gvbqd4;
        xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdx3;
        SJcHSjzDzq3QX10c sJcHSjzDzq3QX10c;
        PyaABL8uMuLgCjJcfM pyaABL8uMuLgCjJcfM;
        GoogleAuthException googleAuthException;
        pijs62HGGnGxq0xD0cXq pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO;
        String str;
        Object objS1zP5M3X7Ukq3ROlZ87G9I2;
        G7lapk01c8Qj9rz59i g7lapk01c8Qj9rz59i4;
        Throwable thS1zP5M3X7Ukq3ROlZ87G9I2;
        AuthenticationResponse authenticationResponse;
        Ka8INCBqfwCeAoFT4mw74QJG ka8INCBqfwCeAoFT4mw74QJG;
        int i;
        Throwable th;
        Ka8INCBqfwCeAoFT4mw74QJG ka8INCBqfwCeAoFT4mw74QJG2;
        xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdx4;
        xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdx5;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof M09PCcKE8f3p5upL5YjVWVv) {
            m09PCcKE8f3p5upL5YjVWVv = (M09PCcKE8f3p5upL5YjVWVv) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i2 = m09PCcKE8f3p5upL5YjVWVv.J1BE9tYH1em4X1uAhc6L7f4M;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m09PCcKE8f3p5upL5YjVWVv.J1BE9tYH1em4X1uAhc6L7f4M = i2 - Integer.MIN_VALUE;
            } else {
                m09PCcKE8f3p5upL5YjVWVv = new M09PCcKE8f3p5upL5YjVWVv(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            m09PCcKE8f3p5upL5YjVWVv = new M09PCcKE8f3p5upL5YjVWVv(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        Object objBezslBgjveK3hODH = m09PCcKE8f3p5upL5YjVWVv.yM5HHkk1MhPLZFYTHm2JjrArud;
        int i3 = m09PCcKE8f3p5upL5YjVWVv.J1BE9tYH1em4X1uAhc6L7f4M;
        LJmIWKCOd33Br lJmIWKCOd33Br2 = this.Mej0x2K4ZGSUxtYNka4QZ;
        Object obj2 = tIDTjdoK38.GO8WUug7ZWFCUI1zY;
        switch (i3) {
            case 0:
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objBezslBgjveK3hODH);
                xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz = PQQPeCDD0JLCT3aLz();
                if (xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz == null) {
                    uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("Cannot attach email address to a non-logged in account");
                    return null;
                }
                m09PCcKE8f3p5upL5YjVWVv.WIXlfFpvH7glAGsUk3 = wfio6q9fiuz1btk;
                m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR = xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz;
                m09PCcKE8f3p5upL5YjVWVv.J1BE9tYH1em4X1uAhc6L7f4M = 1;
                Object objS1zP5M3X7Ukq3ROlZ87G9I3 = this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp.S1zP5M3X7Ukq3ROlZ87G9I(m09PCcKE8f3p5upL5YjVWVv);
                if (objS1zP5M3X7Ukq3ROlZ87G9I3 != obj2) {
                    wfio6q9fiuz1btk2 = wfio6q9fiuz1btk;
                    xwevoc3gqlsn1sxdt2gvno3hgucdx = xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz;
                    objBezslBgjveK3hODH = objS1zP5M3X7Ukq3ROlZ87G9I3;
                    g7lapk01c8Qj9rz59i = (G7lapk01c8Qj9rz59i) objBezslBgjveK3hODH;
                    trh8nlx7q1gvbqd = new tRh8nLx7q1GvbQd(g7lapk01c8Qj9rz59i.axL8FocTDLUdzg0XScbO, xwevoc3gqlsn1sxdt2gvno3hgucdx.BezslBgjveK3hODH);
                    m09PCcKE8f3p5upL5YjVWVv.WIXlfFpvH7glAGsUk3 = wfio6q9fiuz1btk2;
                    m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR = xwevoc3gqlsn1sxdt2gvno3hgucdx;
                    m09PCcKE8f3p5upL5YjVWVv.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i;
                    m09PCcKE8f3p5upL5YjVWVv.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = trh8nlx7q1gvbqd;
                    m09PCcKE8f3p5upL5YjVWVv.J1BE9tYH1em4X1uAhc6L7f4M = 2;
                    objAxL8FocTDLUdzg0XScbO = ((Iol76NSeORZn3oKb4C49HtqjkRhNL) lJmIWKCOd33Br2).axL8FocTDLUdzg0XScbO(trh8nlx7q1gvbqd, m09PCcKE8f3p5upL5YjVWVv);
                    if (objAxL8FocTDLUdzg0XScbO != obj2) {
                        wFIO6q9fiuz1bTK wfio6q9fiuz1btk4 = wfio6q9fiuz1btk2;
                        g7lapk01c8Qj9rz59i2 = g7lapk01c8Qj9rz59i;
                        obj = objAxL8FocTDLUdzg0XScbO;
                        wfio6q9fiuz1btk3 = wfio6q9fiuz1btk4;
                        xwevoc3gqlsn1sxdt2gvno3hgucdx2 = xwevoc3gqlsn1sxdt2gvno3hgucdx;
                        trh8nlx7q1gvbqd2 = trh8nlx7q1gvbqd;
                        thS1zP5M3X7Ukq3ROlZ87G9I = AeQuqug4cjWl3vY5CUaNGtJ0l.S1zP5M3X7Ukq3ROlZ87G9I(obj);
                        if (thS1zP5M3X7Ukq3ROlZ87G9I != null) {
                            J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                            return new Rfp0CprLjJaYY8aiYk((GoogleAuthException) thS1zP5M3X7Ukq3ROlZ87G9I);
                        }
                        googleAuthClientSession = (GoogleAuthClientSession) obj;
                        m09PCcKE8f3p5upL5YjVWVv.WIXlfFpvH7glAGsUk3 = null;
                        m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR = xwevoc3gqlsn1sxdt2gvno3hgucdx2;
                        m09PCcKE8f3p5upL5YjVWVv.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i2;
                        m09PCcKE8f3p5upL5YjVWVv.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = trh8nlx7q1gvbqd2;
                        m09PCcKE8f3p5upL5YjVWVv.sCPtafveBAhdLIs2ajN3WV = lJmIWKCOd33Br2;
                        m09PCcKE8f3p5upL5YjVWVv.Mej0x2K4ZGSUxtYNka4QZ = googleAuthClientSession;
                        m09PCcKE8f3p5upL5YjVWVv.J1BE9tYH1em4X1uAhc6L7f4M = 3;
                        objS1zP5M3X7Ukq3ROlZ87G9I = wfio6q9fiuz1btk3.S1zP5M3X7Ukq3ROlZ87G9I(m09PCcKE8f3p5upL5YjVWVv);
                        if (objS1zP5M3X7Ukq3ROlZ87G9I != obj2) {
                            trh8nlx7q1gvbqd3 = trh8nlx7q1gvbqd2;
                            googleAuthClientSession2 = googleAuthClientSession;
                            objBezslBgjveK3hODH = objS1zP5M3X7Ukq3ROlZ87G9I;
                            g7lapk01c8Qj9rz59i3 = g7lapk01c8Qj9rz59i2;
                            lJmIWKCOd33Br = lJmIWKCOd33Br2;
                            m09PCcKE8f3p5upL5YjVWVv.WIXlfFpvH7glAGsUk3 = null;
                            m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR = xwevoc3gqlsn1sxdt2gvno3hgucdx2;
                            m09PCcKE8f3p5upL5YjVWVv.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i3;
                            m09PCcKE8f3p5upL5YjVWVv.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = trh8nlx7q1gvbqd3;
                            m09PCcKE8f3p5upL5YjVWVv.sCPtafveBAhdLIs2ajN3WV = null;
                            m09PCcKE8f3p5upL5YjVWVv.Mej0x2K4ZGSUxtYNka4QZ = null;
                            m09PCcKE8f3p5upL5YjVWVv.J1BE9tYH1em4X1uAhc6L7f4M = 4;
                            objBezslBgjveK3hODH = ((Iol76NSeORZn3oKb4C49HtqjkRhNL) lJmIWKCOd33Br).BezslBgjveK3hODH(googleAuthClientSession2, (Activity) objBezslBgjveK3hODH, m09PCcKE8f3p5upL5YjVWVv);
                            if (objBezslBgjveK3hODH != obj2) {
                                trh8nlx7q1gvbqd4 = trh8nlx7q1gvbqd3;
                                xwevoc3gqlsn1sxdt2gvno3hgucdx3 = xwevoc3gqlsn1sxdt2gvno3hgucdx2;
                                sJcHSjzDzq3QX10c = (SJcHSjzDzq3QX10c) objBezslBgjveK3hODH;
                                pyaABL8uMuLgCjJcfM = sJcHSjzDzq3QX10c.S1zP5M3X7Ukq3ROlZ87G9I;
                                if (pyaABL8uMuLgCjJcfM == null) {
                                    googleAuthException = sJcHSjzDzq3QX10c.axL8FocTDLUdzg0XScbO;
                                    if (googleAuthException == null) {
                                        throw new CancellationException("User cancelled Dialog or has no accounts available.");
                                    }
                                    J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                                    return new Rfp0CprLjJaYY8aiYk(googleAuthException);
                                }
                                pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO = ((xSr1hPBbWjW) this.qTa7aqjjB9Bt6mc).axL8FocTDLUdzg0XScbO();
                                if (pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO != null) {
                                    str = pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO.S1zP5M3X7Ukq3ROlZ87G9I;
                                } else {
                                    str = null;
                                }
                                m09PCcKE8f3p5upL5YjVWVv.WIXlfFpvH7glAGsUk3 = null;
                                m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR = xwevoc3gqlsn1sxdt2gvno3hgucdx3;
                                m09PCcKE8f3p5upL5YjVWVv.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i3;
                                m09PCcKE8f3p5upL5YjVWVv.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                                m09PCcKE8f3p5upL5YjVWVv.sCPtafveBAhdLIs2ajN3WV = null;
                                m09PCcKE8f3p5upL5YjVWVv.Mej0x2K4ZGSUxtYNka4QZ = null;
                                m09PCcKE8f3p5upL5YjVWVv.J1BE9tYH1em4X1uAhc6L7f4M = 5;
                                objS1zP5M3X7Ukq3ROlZ87G9I2 = ((Iol76NSeORZn3oKb4C49HtqjkRhNL) lJmIWKCOd33Br2).S1zP5M3X7Ukq3ROlZ87G9I(trh8nlx7q1gvbqd4, pyaABL8uMuLgCjJcfM, str, m09PCcKE8f3p5upL5YjVWVv);
                                if (objS1zP5M3X7Ukq3ROlZ87G9I2 != obj2) {
                                    g7lapk01c8Qj9rz59i4 = g7lapk01c8Qj9rz59i3;
                                    thS1zP5M3X7Ukq3ROlZ87G9I2 = AeQuqug4cjWl3vY5CUaNGtJ0l.S1zP5M3X7Ukq3ROlZ87G9I(objS1zP5M3X7Ukq3ROlZ87G9I2);
                                    if (thS1zP5M3X7Ukq3ROlZ87G9I2 == null) {
                                        J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                                        return new Rfp0CprLjJaYY8aiYk((GoogleAuthException) thS1zP5M3X7Ukq3ROlZ87G9I2);
                                    }
                                    authenticationResponse = (AuthenticationResponse) objS1zP5M3X7Ukq3ROlZ87G9I2;
                                    m09PCcKE8f3p5upL5YjVWVv.WIXlfFpvH7glAGsUk3 = null;
                                    m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR = xwevoc3gqlsn1sxdt2gvno3hgucdx3;
                                    m09PCcKE8f3p5upL5YjVWVv.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i4;
                                    m09PCcKE8f3p5upL5YjVWVv.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                                    m09PCcKE8f3p5upL5YjVWVv.sCPtafveBAhdLIs2ajN3WV = null;
                                    m09PCcKE8f3p5upL5YjVWVv.Mej0x2K4ZGSUxtYNka4QZ = null;
                                    m09PCcKE8f3p5upL5YjVWVv.qTa7aqjjB9Bt6mc = authenticationResponse;
                                    ka8INCBqfwCeAoFT4mw74QJG = this.iR1XUIc7FjhMl57O;
                                    m09PCcKE8f3p5upL5YjVWVv.f2sXlW3st0rAKJwyOrCfOWc = ka8INCBqfwCeAoFT4mw74QJG;
                                    i = 0;
                                    m09PCcKE8f3p5upL5YjVWVv.iR1XUIc7FjhMl57O = 0;
                                    m09PCcKE8f3p5upL5YjVWVv.J1BE9tYH1em4X1uAhc6L7f4M = 6;
                                    if (ka8INCBqfwCeAoFT4mw74QJG.axL8FocTDLUdzg0XScbO(m09PCcKE8f3p5upL5YjVWVv) != obj2) {
                                        try {
                                            String str2 = authenticationResponse.S1zP5M3X7Ukq3ROlZ87G9I;
                                            m09PCcKE8f3p5upL5YjVWVv.WIXlfFpvH7glAGsUk3 = null;
                                            m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR = xwevoc3gqlsn1sxdt2gvno3hgucdx3;
                                            m09PCcKE8f3p5upL5YjVWVv.LcvPFGYKhAm4SS5FZ = null;
                                            m09PCcKE8f3p5upL5YjVWVv.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                                            m09PCcKE8f3p5upL5YjVWVv.sCPtafveBAhdLIs2ajN3WV = null;
                                            m09PCcKE8f3p5upL5YjVWVv.Mej0x2K4ZGSUxtYNka4QZ = null;
                                            m09PCcKE8f3p5upL5YjVWVv.qTa7aqjjB9Bt6mc = null;
                                            m09PCcKE8f3p5upL5YjVWVv.f2sXlW3st0rAKJwyOrCfOWc = ka8INCBqfwCeAoFT4mw74QJG;
                                            m09PCcKE8f3p5upL5YjVWVv.iR1XUIc7FjhMl57O = i;
                                            m09PCcKE8f3p5upL5YjVWVv.J1BE9tYH1em4X1uAhc6L7f4M = 7;
                                            objBezslBgjveK3hODH = Bk6w7oZjoWt9ZSRs4C7jIhbX3(str2, g7lapk01c8Qj9rz59i4, m09PCcKE8f3p5upL5YjVWVv);
                                            if (objBezslBgjveK3hODH != obj2) {
                                                ka8INCBqfwCeAoFT4mw74QJG2 = ka8INCBqfwCeAoFT4mw74QJG;
                                                xwevoc3gqlsn1sxdt2gvno3hgucdx4 = xwevoc3gqlsn1sxdt2gvno3hgucdx3;
                                                xwevoc3gqlsn1sxdt2gvno3hgucdx5 = (xWEvOc3gqLSn1SXDt2GvNO3HGucdx) objBezslBgjveK3hODH;
                                                ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                                                if (xwevoc3gqlsn1sxdt2gvno3hgucdx5.axL8FocTDLUdzg0XScbO != null) {
                                                    uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("Expected account to have an email address attached");
                                                    return null;
                                                }
                                                sBV5EuS0mGuEYqc5nc5erhuwb1OG7(xwevoc3gqlsn1sxdt2gvno3hgucdx4.axL8FocTDLUdzg0XScbO == null ? 1 : 2, 1);
                                                aNONfmXWW0uqauI17bnoBjg anonfmxww0uqaui17bnobjg = J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion;
                                                GiFxY9WDHrWlHPyoti giFxY9WDHrWlHPyoti = new GiFxY9WDHrWlHPyoti(xwevoc3gqlsn1sxdt2gvno3hgucdx5, xwevoc3gqlsn1sxdt2gvno3hgucdx5.axL8FocTDLUdzg0XScbO);
                                                anonfmxww0uqaui17bnobjg.getClass();
                                                return giFxY9WDHrWlHPyoti;
                                            }
                                        } catch (Throwable th2) {
                                            Ka8INCBqfwCeAoFT4mw74QJG ka8INCBqfwCeAoFT4mw74QJG3 = ka8INCBqfwCeAoFT4mw74QJG;
                                            th = th2;
                                            ka8INCBqfwCeAoFT4mw74QJG2 = ka8INCBqfwCeAoFT4mw74QJG3;
                                            ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                                            throw th;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return obj2;
            case 1:
                xwevoc3gqlsn1sxdt2gvno3hgucdx = m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR;
                wfio6q9fiuz1btk2 = m09PCcKE8f3p5upL5YjVWVv.WIXlfFpvH7glAGsUk3;
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objBezslBgjveK3hODH);
                g7lapk01c8Qj9rz59i = (G7lapk01c8Qj9rz59i) objBezslBgjveK3hODH;
                trh8nlx7q1gvbqd = new tRh8nLx7q1GvbQd(g7lapk01c8Qj9rz59i.axL8FocTDLUdzg0XScbO, xwevoc3gqlsn1sxdt2gvno3hgucdx.BezslBgjveK3hODH);
                m09PCcKE8f3p5upL5YjVWVv.WIXlfFpvH7glAGsUk3 = wfio6q9fiuz1btk2;
                m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR = xwevoc3gqlsn1sxdt2gvno3hgucdx;
                m09PCcKE8f3p5upL5YjVWVv.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i;
                m09PCcKE8f3p5upL5YjVWVv.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = trh8nlx7q1gvbqd;
                m09PCcKE8f3p5upL5YjVWVv.J1BE9tYH1em4X1uAhc6L7f4M = 2;
                objAxL8FocTDLUdzg0XScbO = ((Iol76NSeORZn3oKb4C49HtqjkRhNL) lJmIWKCOd33Br2).axL8FocTDLUdzg0XScbO(trh8nlx7q1gvbqd, m09PCcKE8f3p5upL5YjVWVv);
                if (objAxL8FocTDLUdzg0XScbO != obj2) {
                    wFIO6q9fiuz1bTK wfio6q9fiuz1btk5 = wfio6q9fiuz1btk2;
                    g7lapk01c8Qj9rz59i2 = g7lapk01c8Qj9rz59i;
                    obj = objAxL8FocTDLUdzg0XScbO;
                    wfio6q9fiuz1btk3 = wfio6q9fiuz1btk5;
                    xwevoc3gqlsn1sxdt2gvno3hgucdx2 = xwevoc3gqlsn1sxdt2gvno3hgucdx;
                    trh8nlx7q1gvbqd2 = trh8nlx7q1gvbqd;
                    thS1zP5M3X7Ukq3ROlZ87G9I = AeQuqug4cjWl3vY5CUaNGtJ0l.S1zP5M3X7Ukq3ROlZ87G9I(obj);
                    if (thS1zP5M3X7Ukq3ROlZ87G9I != null) {
                        J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                        return new Rfp0CprLjJaYY8aiYk((GoogleAuthException) thS1zP5M3X7Ukq3ROlZ87G9I);
                    }
                    googleAuthClientSession = (GoogleAuthClientSession) obj;
                    m09PCcKE8f3p5upL5YjVWVv.WIXlfFpvH7glAGsUk3 = null;
                    m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR = xwevoc3gqlsn1sxdt2gvno3hgucdx2;
                    m09PCcKE8f3p5upL5YjVWVv.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i2;
                    m09PCcKE8f3p5upL5YjVWVv.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = trh8nlx7q1gvbqd2;
                    m09PCcKE8f3p5upL5YjVWVv.sCPtafveBAhdLIs2ajN3WV = lJmIWKCOd33Br2;
                    m09PCcKE8f3p5upL5YjVWVv.Mej0x2K4ZGSUxtYNka4QZ = googleAuthClientSession;
                    m09PCcKE8f3p5upL5YjVWVv.J1BE9tYH1em4X1uAhc6L7f4M = 3;
                    objS1zP5M3X7Ukq3ROlZ87G9I = wfio6q9fiuz1btk3.S1zP5M3X7Ukq3ROlZ87G9I(m09PCcKE8f3p5upL5YjVWVv);
                    if (objS1zP5M3X7Ukq3ROlZ87G9I != obj2) {
                        trh8nlx7q1gvbqd3 = trh8nlx7q1gvbqd2;
                        googleAuthClientSession2 = googleAuthClientSession;
                        objBezslBgjveK3hODH = objS1zP5M3X7Ukq3ROlZ87G9I;
                        g7lapk01c8Qj9rz59i3 = g7lapk01c8Qj9rz59i2;
                        lJmIWKCOd33Br = lJmIWKCOd33Br2;
                        m09PCcKE8f3p5upL5YjVWVv.WIXlfFpvH7glAGsUk3 = null;
                        m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR = xwevoc3gqlsn1sxdt2gvno3hgucdx2;
                        m09PCcKE8f3p5upL5YjVWVv.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i3;
                        m09PCcKE8f3p5upL5YjVWVv.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = trh8nlx7q1gvbqd3;
                        m09PCcKE8f3p5upL5YjVWVv.sCPtafveBAhdLIs2ajN3WV = null;
                        m09PCcKE8f3p5upL5YjVWVv.Mej0x2K4ZGSUxtYNka4QZ = null;
                        m09PCcKE8f3p5upL5YjVWVv.J1BE9tYH1em4X1uAhc6L7f4M = 4;
                        objBezslBgjveK3hODH = ((Iol76NSeORZn3oKb4C49HtqjkRhNL) lJmIWKCOd33Br).BezslBgjveK3hODH(googleAuthClientSession2, (Activity) objBezslBgjveK3hODH, m09PCcKE8f3p5upL5YjVWVv);
                        if (objBezslBgjveK3hODH != obj2) {
                            trh8nlx7q1gvbqd4 = trh8nlx7q1gvbqd3;
                            xwevoc3gqlsn1sxdt2gvno3hgucdx3 = xwevoc3gqlsn1sxdt2gvno3hgucdx2;
                            sJcHSjzDzq3QX10c = (SJcHSjzDzq3QX10c) objBezslBgjveK3hODH;
                            pyaABL8uMuLgCjJcfM = sJcHSjzDzq3QX10c.S1zP5M3X7Ukq3ROlZ87G9I;
                            if (pyaABL8uMuLgCjJcfM == null) {
                                googleAuthException = sJcHSjzDzq3QX10c.axL8FocTDLUdzg0XScbO;
                                if (googleAuthException == null) {
                                    throw new CancellationException("User cancelled Dialog or has no accounts available.");
                                }
                                J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                                return new Rfp0CprLjJaYY8aiYk(googleAuthException);
                            }
                            pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO = ((xSr1hPBbWjW) this.qTa7aqjjB9Bt6mc).axL8FocTDLUdzg0XScbO();
                            if (pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO != null) {
                                str = pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO.S1zP5M3X7Ukq3ROlZ87G9I;
                            } else {
                                str = null;
                            }
                            m09PCcKE8f3p5upL5YjVWVv.WIXlfFpvH7glAGsUk3 = null;
                            m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR = xwevoc3gqlsn1sxdt2gvno3hgucdx3;
                            m09PCcKE8f3p5upL5YjVWVv.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i3;
                            m09PCcKE8f3p5upL5YjVWVv.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                            m09PCcKE8f3p5upL5YjVWVv.sCPtafveBAhdLIs2ajN3WV = null;
                            m09PCcKE8f3p5upL5YjVWVv.Mej0x2K4ZGSUxtYNka4QZ = null;
                            m09PCcKE8f3p5upL5YjVWVv.J1BE9tYH1em4X1uAhc6L7f4M = 5;
                            objS1zP5M3X7Ukq3ROlZ87G9I2 = ((Iol76NSeORZn3oKb4C49HtqjkRhNL) lJmIWKCOd33Br2).S1zP5M3X7Ukq3ROlZ87G9I(trh8nlx7q1gvbqd4, pyaABL8uMuLgCjJcfM, str, m09PCcKE8f3p5upL5YjVWVv);
                            if (objS1zP5M3X7Ukq3ROlZ87G9I2 != obj2) {
                                g7lapk01c8Qj9rz59i4 = g7lapk01c8Qj9rz59i3;
                                thS1zP5M3X7Ukq3ROlZ87G9I2 = AeQuqug4cjWl3vY5CUaNGtJ0l.S1zP5M3X7Ukq3ROlZ87G9I(objS1zP5M3X7Ukq3ROlZ87G9I2);
                                if (thS1zP5M3X7Ukq3ROlZ87G9I2 == null) {
                                    J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                                    return new Rfp0CprLjJaYY8aiYk((GoogleAuthException) thS1zP5M3X7Ukq3ROlZ87G9I2);
                                }
                                authenticationResponse = (AuthenticationResponse) objS1zP5M3X7Ukq3ROlZ87G9I2;
                                m09PCcKE8f3p5upL5YjVWVv.WIXlfFpvH7glAGsUk3 = null;
                                m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR = xwevoc3gqlsn1sxdt2gvno3hgucdx3;
                                m09PCcKE8f3p5upL5YjVWVv.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i4;
                                m09PCcKE8f3p5upL5YjVWVv.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                                m09PCcKE8f3p5upL5YjVWVv.sCPtafveBAhdLIs2ajN3WV = null;
                                m09PCcKE8f3p5upL5YjVWVv.Mej0x2K4ZGSUxtYNka4QZ = null;
                                m09PCcKE8f3p5upL5YjVWVv.qTa7aqjjB9Bt6mc = authenticationResponse;
                                ka8INCBqfwCeAoFT4mw74QJG = this.iR1XUIc7FjhMl57O;
                                m09PCcKE8f3p5upL5YjVWVv.f2sXlW3st0rAKJwyOrCfOWc = ka8INCBqfwCeAoFT4mw74QJG;
                                i = 0;
                                m09PCcKE8f3p5upL5YjVWVv.iR1XUIc7FjhMl57O = 0;
                                m09PCcKE8f3p5upL5YjVWVv.J1BE9tYH1em4X1uAhc6L7f4M = 6;
                                if (ka8INCBqfwCeAoFT4mw74QJG.axL8FocTDLUdzg0XScbO(m09PCcKE8f3p5upL5YjVWVv) != obj2) {
                                    String str3 = authenticationResponse.S1zP5M3X7Ukq3ROlZ87G9I;
                                    m09PCcKE8f3p5upL5YjVWVv.WIXlfFpvH7glAGsUk3 = null;
                                    m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR = xwevoc3gqlsn1sxdt2gvno3hgucdx3;
                                    m09PCcKE8f3p5upL5YjVWVv.LcvPFGYKhAm4SS5FZ = null;
                                    m09PCcKE8f3p5upL5YjVWVv.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                                    m09PCcKE8f3p5upL5YjVWVv.sCPtafveBAhdLIs2ajN3WV = null;
                                    m09PCcKE8f3p5upL5YjVWVv.Mej0x2K4ZGSUxtYNka4QZ = null;
                                    m09PCcKE8f3p5upL5YjVWVv.qTa7aqjjB9Bt6mc = null;
                                    m09PCcKE8f3p5upL5YjVWVv.f2sXlW3st0rAKJwyOrCfOWc = ka8INCBqfwCeAoFT4mw74QJG;
                                    m09PCcKE8f3p5upL5YjVWVv.iR1XUIc7FjhMl57O = i;
                                    m09PCcKE8f3p5upL5YjVWVv.J1BE9tYH1em4X1uAhc6L7f4M = 7;
                                    objBezslBgjveK3hODH = Bk6w7oZjoWt9ZSRs4C7jIhbX3(str3, g7lapk01c8Qj9rz59i4, m09PCcKE8f3p5upL5YjVWVv);
                                    if (objBezslBgjveK3hODH != obj2) {
                                        ka8INCBqfwCeAoFT4mw74QJG2 = ka8INCBqfwCeAoFT4mw74QJG;
                                        xwevoc3gqlsn1sxdt2gvno3hgucdx4 = xwevoc3gqlsn1sxdt2gvno3hgucdx3;
                                        xwevoc3gqlsn1sxdt2gvno3hgucdx5 = (xWEvOc3gqLSn1SXDt2GvNO3HGucdx) objBezslBgjveK3hODH;
                                        ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                                        if (xwevoc3gqlsn1sxdt2gvno3hgucdx5.axL8FocTDLUdzg0XScbO != null) {
                                            uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("Expected account to have an email address attached");
                                            return null;
                                        }
                                        sBV5EuS0mGuEYqc5nc5erhuwb1OG7(xwevoc3gqlsn1sxdt2gvno3hgucdx4.axL8FocTDLUdzg0XScbO == null ? 1 : 2, 1);
                                        aNONfmXWW0uqauI17bnoBjg anonfmxww0uqaui17bnobjg2 = J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion;
                                        GiFxY9WDHrWlHPyoti giFxY9WDHrWlHPyoti2 = new GiFxY9WDHrWlHPyoti(xwevoc3gqlsn1sxdt2gvno3hgucdx5, xwevoc3gqlsn1sxdt2gvno3hgucdx5.axL8FocTDLUdzg0XScbO);
                                        anonfmxww0uqaui17bnobjg2.getClass();
                                        return giFxY9WDHrWlHPyoti2;
                                    }
                                }
                            }
                        }
                    }
                }
                return obj2;
            case 2:
                trh8nlx7q1gvbqd2 = m09PCcKE8f3p5upL5YjVWVv.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
                g7lapk01c8Qj9rz59i2 = m09PCcKE8f3p5upL5YjVWVv.LcvPFGYKhAm4SS5FZ;
                xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdx6 = m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR;
                wfio6q9fiuz1btk3 = m09PCcKE8f3p5upL5YjVWVv.WIXlfFpvH7glAGsUk3;
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objBezslBgjveK3hODH);
                obj = ((J7Tsg1eqTfbK8vIo4RFOyjPiu) objBezslBgjveK3hODH).S1zP5M3X7Ukq3ROlZ87G9I;
                xwevoc3gqlsn1sxdt2gvno3hgucdx2 = xwevoc3gqlsn1sxdt2gvno3hgucdx6;
                thS1zP5M3X7Ukq3ROlZ87G9I = AeQuqug4cjWl3vY5CUaNGtJ0l.S1zP5M3X7Ukq3ROlZ87G9I(obj);
                if (thS1zP5M3X7Ukq3ROlZ87G9I != null) {
                    J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                    return new Rfp0CprLjJaYY8aiYk((GoogleAuthException) thS1zP5M3X7Ukq3ROlZ87G9I);
                }
                googleAuthClientSession = (GoogleAuthClientSession) obj;
                m09PCcKE8f3p5upL5YjVWVv.WIXlfFpvH7glAGsUk3 = null;
                m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR = xwevoc3gqlsn1sxdt2gvno3hgucdx2;
                m09PCcKE8f3p5upL5YjVWVv.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i2;
                m09PCcKE8f3p5upL5YjVWVv.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = trh8nlx7q1gvbqd2;
                m09PCcKE8f3p5upL5YjVWVv.sCPtafveBAhdLIs2ajN3WV = lJmIWKCOd33Br2;
                m09PCcKE8f3p5upL5YjVWVv.Mej0x2K4ZGSUxtYNka4QZ = googleAuthClientSession;
                m09PCcKE8f3p5upL5YjVWVv.J1BE9tYH1em4X1uAhc6L7f4M = 3;
                objS1zP5M3X7Ukq3ROlZ87G9I = wfio6q9fiuz1btk3.S1zP5M3X7Ukq3ROlZ87G9I(m09PCcKE8f3p5upL5YjVWVv);
                if (objS1zP5M3X7Ukq3ROlZ87G9I != obj2) {
                    trh8nlx7q1gvbqd3 = trh8nlx7q1gvbqd2;
                    googleAuthClientSession2 = googleAuthClientSession;
                    objBezslBgjveK3hODH = objS1zP5M3X7Ukq3ROlZ87G9I;
                    g7lapk01c8Qj9rz59i3 = g7lapk01c8Qj9rz59i2;
                    lJmIWKCOd33Br = lJmIWKCOd33Br2;
                    m09PCcKE8f3p5upL5YjVWVv.WIXlfFpvH7glAGsUk3 = null;
                    m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR = xwevoc3gqlsn1sxdt2gvno3hgucdx2;
                    m09PCcKE8f3p5upL5YjVWVv.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i3;
                    m09PCcKE8f3p5upL5YjVWVv.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = trh8nlx7q1gvbqd3;
                    m09PCcKE8f3p5upL5YjVWVv.sCPtafveBAhdLIs2ajN3WV = null;
                    m09PCcKE8f3p5upL5YjVWVv.Mej0x2K4ZGSUxtYNka4QZ = null;
                    m09PCcKE8f3p5upL5YjVWVv.J1BE9tYH1em4X1uAhc6L7f4M = 4;
                    objBezslBgjveK3hODH = ((Iol76NSeORZn3oKb4C49HtqjkRhNL) lJmIWKCOd33Br).BezslBgjveK3hODH(googleAuthClientSession2, (Activity) objBezslBgjveK3hODH, m09PCcKE8f3p5upL5YjVWVv);
                    if (objBezslBgjveK3hODH != obj2) {
                        trh8nlx7q1gvbqd4 = trh8nlx7q1gvbqd3;
                        xwevoc3gqlsn1sxdt2gvno3hgucdx3 = xwevoc3gqlsn1sxdt2gvno3hgucdx2;
                        sJcHSjzDzq3QX10c = (SJcHSjzDzq3QX10c) objBezslBgjveK3hODH;
                        pyaABL8uMuLgCjJcfM = sJcHSjzDzq3QX10c.S1zP5M3X7Ukq3ROlZ87G9I;
                        if (pyaABL8uMuLgCjJcfM == null) {
                            googleAuthException = sJcHSjzDzq3QX10c.axL8FocTDLUdzg0XScbO;
                            if (googleAuthException == null) {
                                throw new CancellationException("User cancelled Dialog or has no accounts available.");
                            }
                            J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                            return new Rfp0CprLjJaYY8aiYk(googleAuthException);
                        }
                        pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO = ((xSr1hPBbWjW) this.qTa7aqjjB9Bt6mc).axL8FocTDLUdzg0XScbO();
                        if (pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO != null) {
                            str = pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO.S1zP5M3X7Ukq3ROlZ87G9I;
                        } else {
                            str = null;
                        }
                        m09PCcKE8f3p5upL5YjVWVv.WIXlfFpvH7glAGsUk3 = null;
                        m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR = xwevoc3gqlsn1sxdt2gvno3hgucdx3;
                        m09PCcKE8f3p5upL5YjVWVv.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i3;
                        m09PCcKE8f3p5upL5YjVWVv.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                        m09PCcKE8f3p5upL5YjVWVv.sCPtafveBAhdLIs2ajN3WV = null;
                        m09PCcKE8f3p5upL5YjVWVv.Mej0x2K4ZGSUxtYNka4QZ = null;
                        m09PCcKE8f3p5upL5YjVWVv.J1BE9tYH1em4X1uAhc6L7f4M = 5;
                        objS1zP5M3X7Ukq3ROlZ87G9I2 = ((Iol76NSeORZn3oKb4C49HtqjkRhNL) lJmIWKCOd33Br2).S1zP5M3X7Ukq3ROlZ87G9I(trh8nlx7q1gvbqd4, pyaABL8uMuLgCjJcfM, str, m09PCcKE8f3p5upL5YjVWVv);
                        if (objS1zP5M3X7Ukq3ROlZ87G9I2 != obj2) {
                            g7lapk01c8Qj9rz59i4 = g7lapk01c8Qj9rz59i3;
                            thS1zP5M3X7Ukq3ROlZ87G9I2 = AeQuqug4cjWl3vY5CUaNGtJ0l.S1zP5M3X7Ukq3ROlZ87G9I(objS1zP5M3X7Ukq3ROlZ87G9I2);
                            if (thS1zP5M3X7Ukq3ROlZ87G9I2 == null) {
                                J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                                return new Rfp0CprLjJaYY8aiYk((GoogleAuthException) thS1zP5M3X7Ukq3ROlZ87G9I2);
                            }
                            authenticationResponse = (AuthenticationResponse) objS1zP5M3X7Ukq3ROlZ87G9I2;
                            m09PCcKE8f3p5upL5YjVWVv.WIXlfFpvH7glAGsUk3 = null;
                            m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR = xwevoc3gqlsn1sxdt2gvno3hgucdx3;
                            m09PCcKE8f3p5upL5YjVWVv.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i4;
                            m09PCcKE8f3p5upL5YjVWVv.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                            m09PCcKE8f3p5upL5YjVWVv.sCPtafveBAhdLIs2ajN3WV = null;
                            m09PCcKE8f3p5upL5YjVWVv.Mej0x2K4ZGSUxtYNka4QZ = null;
                            m09PCcKE8f3p5upL5YjVWVv.qTa7aqjjB9Bt6mc = authenticationResponse;
                            ka8INCBqfwCeAoFT4mw74QJG = this.iR1XUIc7FjhMl57O;
                            m09PCcKE8f3p5upL5YjVWVv.f2sXlW3st0rAKJwyOrCfOWc = ka8INCBqfwCeAoFT4mw74QJG;
                            i = 0;
                            m09PCcKE8f3p5upL5YjVWVv.iR1XUIc7FjhMl57O = 0;
                            m09PCcKE8f3p5upL5YjVWVv.J1BE9tYH1em4X1uAhc6L7f4M = 6;
                            if (ka8INCBqfwCeAoFT4mw74QJG.axL8FocTDLUdzg0XScbO(m09PCcKE8f3p5upL5YjVWVv) != obj2) {
                                String str4 = authenticationResponse.S1zP5M3X7Ukq3ROlZ87G9I;
                                m09PCcKE8f3p5upL5YjVWVv.WIXlfFpvH7glAGsUk3 = null;
                                m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR = xwevoc3gqlsn1sxdt2gvno3hgucdx3;
                                m09PCcKE8f3p5upL5YjVWVv.LcvPFGYKhAm4SS5FZ = null;
                                m09PCcKE8f3p5upL5YjVWVv.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                                m09PCcKE8f3p5upL5YjVWVv.sCPtafveBAhdLIs2ajN3WV = null;
                                m09PCcKE8f3p5upL5YjVWVv.Mej0x2K4ZGSUxtYNka4QZ = null;
                                m09PCcKE8f3p5upL5YjVWVv.qTa7aqjjB9Bt6mc = null;
                                m09PCcKE8f3p5upL5YjVWVv.f2sXlW3st0rAKJwyOrCfOWc = ka8INCBqfwCeAoFT4mw74QJG;
                                m09PCcKE8f3p5upL5YjVWVv.iR1XUIc7FjhMl57O = i;
                                m09PCcKE8f3p5upL5YjVWVv.J1BE9tYH1em4X1uAhc6L7f4M = 7;
                                objBezslBgjveK3hODH = Bk6w7oZjoWt9ZSRs4C7jIhbX3(str4, g7lapk01c8Qj9rz59i4, m09PCcKE8f3p5upL5YjVWVv);
                                if (objBezslBgjveK3hODH != obj2) {
                                    ka8INCBqfwCeAoFT4mw74QJG2 = ka8INCBqfwCeAoFT4mw74QJG;
                                    xwevoc3gqlsn1sxdt2gvno3hgucdx4 = xwevoc3gqlsn1sxdt2gvno3hgucdx3;
                                    xwevoc3gqlsn1sxdt2gvno3hgucdx5 = (xWEvOc3gqLSn1SXDt2GvNO3HGucdx) objBezslBgjveK3hODH;
                                    ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                                    if (xwevoc3gqlsn1sxdt2gvno3hgucdx5.axL8FocTDLUdzg0XScbO != null) {
                                        uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("Expected account to have an email address attached");
                                        return null;
                                    }
                                    sBV5EuS0mGuEYqc5nc5erhuwb1OG7(xwevoc3gqlsn1sxdt2gvno3hgucdx4.axL8FocTDLUdzg0XScbO == null ? 1 : 2, 1);
                                    aNONfmXWW0uqauI17bnoBjg anonfmxww0uqaui17bnobjg3 = J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion;
                                    GiFxY9WDHrWlHPyoti giFxY9WDHrWlHPyoti3 = new GiFxY9WDHrWlHPyoti(xwevoc3gqlsn1sxdt2gvno3hgucdx5, xwevoc3gqlsn1sxdt2gvno3hgucdx5.axL8FocTDLUdzg0XScbO);
                                    anonfmxww0uqaui17bnobjg3.getClass();
                                    return giFxY9WDHrWlHPyoti3;
                                }
                            }
                        }
                    }
                }
                return obj2;
            case 3:
                googleAuthClientSession2 = m09PCcKE8f3p5upL5YjVWVv.Mej0x2K4ZGSUxtYNka4QZ;
                lJmIWKCOd33Br = m09PCcKE8f3p5upL5YjVWVv.sCPtafveBAhdLIs2ajN3WV;
                trh8nlx7q1gvbqd3 = m09PCcKE8f3p5upL5YjVWVv.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
                g7lapk01c8Qj9rz59i3 = m09PCcKE8f3p5upL5YjVWVv.LcvPFGYKhAm4SS5FZ;
                xwevoc3gqlsn1sxdt2gvno3hgucdx2 = m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR;
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objBezslBgjveK3hODH);
                m09PCcKE8f3p5upL5YjVWVv.WIXlfFpvH7glAGsUk3 = null;
                m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR = xwevoc3gqlsn1sxdt2gvno3hgucdx2;
                m09PCcKE8f3p5upL5YjVWVv.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i3;
                m09PCcKE8f3p5upL5YjVWVv.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = trh8nlx7q1gvbqd3;
                m09PCcKE8f3p5upL5YjVWVv.sCPtafveBAhdLIs2ajN3WV = null;
                m09PCcKE8f3p5upL5YjVWVv.Mej0x2K4ZGSUxtYNka4QZ = null;
                m09PCcKE8f3p5upL5YjVWVv.J1BE9tYH1em4X1uAhc6L7f4M = 4;
                objBezslBgjveK3hODH = ((Iol76NSeORZn3oKb4C49HtqjkRhNL) lJmIWKCOd33Br).BezslBgjveK3hODH(googleAuthClientSession2, (Activity) objBezslBgjveK3hODH, m09PCcKE8f3p5upL5YjVWVv);
                if (objBezslBgjveK3hODH != obj2) {
                    trh8nlx7q1gvbqd4 = trh8nlx7q1gvbqd3;
                    xwevoc3gqlsn1sxdt2gvno3hgucdx3 = xwevoc3gqlsn1sxdt2gvno3hgucdx2;
                    sJcHSjzDzq3QX10c = (SJcHSjzDzq3QX10c) objBezslBgjveK3hODH;
                    pyaABL8uMuLgCjJcfM = sJcHSjzDzq3QX10c.S1zP5M3X7Ukq3ROlZ87G9I;
                    if (pyaABL8uMuLgCjJcfM == null) {
                        googleAuthException = sJcHSjzDzq3QX10c.axL8FocTDLUdzg0XScbO;
                        if (googleAuthException == null) {
                            throw new CancellationException("User cancelled Dialog or has no accounts available.");
                        }
                        J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                        return new Rfp0CprLjJaYY8aiYk(googleAuthException);
                    }
                    pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO = ((xSr1hPBbWjW) this.qTa7aqjjB9Bt6mc).axL8FocTDLUdzg0XScbO();
                    if (pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO != null) {
                        str = pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO.S1zP5M3X7Ukq3ROlZ87G9I;
                    } else {
                        str = null;
                    }
                    m09PCcKE8f3p5upL5YjVWVv.WIXlfFpvH7glAGsUk3 = null;
                    m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR = xwevoc3gqlsn1sxdt2gvno3hgucdx3;
                    m09PCcKE8f3p5upL5YjVWVv.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i3;
                    m09PCcKE8f3p5upL5YjVWVv.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                    m09PCcKE8f3p5upL5YjVWVv.sCPtafveBAhdLIs2ajN3WV = null;
                    m09PCcKE8f3p5upL5YjVWVv.Mej0x2K4ZGSUxtYNka4QZ = null;
                    m09PCcKE8f3p5upL5YjVWVv.J1BE9tYH1em4X1uAhc6L7f4M = 5;
                    objS1zP5M3X7Ukq3ROlZ87G9I2 = ((Iol76NSeORZn3oKb4C49HtqjkRhNL) lJmIWKCOd33Br2).S1zP5M3X7Ukq3ROlZ87G9I(trh8nlx7q1gvbqd4, pyaABL8uMuLgCjJcfM, str, m09PCcKE8f3p5upL5YjVWVv);
                    if (objS1zP5M3X7Ukq3ROlZ87G9I2 != obj2) {
                        g7lapk01c8Qj9rz59i4 = g7lapk01c8Qj9rz59i3;
                        thS1zP5M3X7Ukq3ROlZ87G9I2 = AeQuqug4cjWl3vY5CUaNGtJ0l.S1zP5M3X7Ukq3ROlZ87G9I(objS1zP5M3X7Ukq3ROlZ87G9I2);
                        if (thS1zP5M3X7Ukq3ROlZ87G9I2 == null) {
                            J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                            return new Rfp0CprLjJaYY8aiYk((GoogleAuthException) thS1zP5M3X7Ukq3ROlZ87G9I2);
                        }
                        authenticationResponse = (AuthenticationResponse) objS1zP5M3X7Ukq3ROlZ87G9I2;
                        m09PCcKE8f3p5upL5YjVWVv.WIXlfFpvH7glAGsUk3 = null;
                        m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR = xwevoc3gqlsn1sxdt2gvno3hgucdx3;
                        m09PCcKE8f3p5upL5YjVWVv.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i4;
                        m09PCcKE8f3p5upL5YjVWVv.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                        m09PCcKE8f3p5upL5YjVWVv.sCPtafveBAhdLIs2ajN3WV = null;
                        m09PCcKE8f3p5upL5YjVWVv.Mej0x2K4ZGSUxtYNka4QZ = null;
                        m09PCcKE8f3p5upL5YjVWVv.qTa7aqjjB9Bt6mc = authenticationResponse;
                        ka8INCBqfwCeAoFT4mw74QJG = this.iR1XUIc7FjhMl57O;
                        m09PCcKE8f3p5upL5YjVWVv.f2sXlW3st0rAKJwyOrCfOWc = ka8INCBqfwCeAoFT4mw74QJG;
                        i = 0;
                        m09PCcKE8f3p5upL5YjVWVv.iR1XUIc7FjhMl57O = 0;
                        m09PCcKE8f3p5upL5YjVWVv.J1BE9tYH1em4X1uAhc6L7f4M = 6;
                        if (ka8INCBqfwCeAoFT4mw74QJG.axL8FocTDLUdzg0XScbO(m09PCcKE8f3p5upL5YjVWVv) != obj2) {
                            String str5 = authenticationResponse.S1zP5M3X7Ukq3ROlZ87G9I;
                            m09PCcKE8f3p5upL5YjVWVv.WIXlfFpvH7glAGsUk3 = null;
                            m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR = xwevoc3gqlsn1sxdt2gvno3hgucdx3;
                            m09PCcKE8f3p5upL5YjVWVv.LcvPFGYKhAm4SS5FZ = null;
                            m09PCcKE8f3p5upL5YjVWVv.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                            m09PCcKE8f3p5upL5YjVWVv.sCPtafveBAhdLIs2ajN3WV = null;
                            m09PCcKE8f3p5upL5YjVWVv.Mej0x2K4ZGSUxtYNka4QZ = null;
                            m09PCcKE8f3p5upL5YjVWVv.qTa7aqjjB9Bt6mc = null;
                            m09PCcKE8f3p5upL5YjVWVv.f2sXlW3st0rAKJwyOrCfOWc = ka8INCBqfwCeAoFT4mw74QJG;
                            m09PCcKE8f3p5upL5YjVWVv.iR1XUIc7FjhMl57O = i;
                            m09PCcKE8f3p5upL5YjVWVv.J1BE9tYH1em4X1uAhc6L7f4M = 7;
                            objBezslBgjveK3hODH = Bk6w7oZjoWt9ZSRs4C7jIhbX3(str5, g7lapk01c8Qj9rz59i4, m09PCcKE8f3p5upL5YjVWVv);
                            if (objBezslBgjveK3hODH != obj2) {
                                ka8INCBqfwCeAoFT4mw74QJG2 = ka8INCBqfwCeAoFT4mw74QJG;
                                xwevoc3gqlsn1sxdt2gvno3hgucdx4 = xwevoc3gqlsn1sxdt2gvno3hgucdx3;
                                xwevoc3gqlsn1sxdt2gvno3hgucdx5 = (xWEvOc3gqLSn1SXDt2GvNO3HGucdx) objBezslBgjveK3hODH;
                                ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                                if (xwevoc3gqlsn1sxdt2gvno3hgucdx5.axL8FocTDLUdzg0XScbO != null) {
                                    uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("Expected account to have an email address attached");
                                    return null;
                                }
                                sBV5EuS0mGuEYqc5nc5erhuwb1OG7(xwevoc3gqlsn1sxdt2gvno3hgucdx4.axL8FocTDLUdzg0XScbO == null ? 1 : 2, 1);
                                aNONfmXWW0uqauI17bnoBjg anonfmxww0uqaui17bnobjg4 = J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion;
                                GiFxY9WDHrWlHPyoti giFxY9WDHrWlHPyoti4 = new GiFxY9WDHrWlHPyoti(xwevoc3gqlsn1sxdt2gvno3hgucdx5, xwevoc3gqlsn1sxdt2gvno3hgucdx5.axL8FocTDLUdzg0XScbO);
                                anonfmxww0uqaui17bnobjg4.getClass();
                                return giFxY9WDHrWlHPyoti4;
                            }
                        }
                    }
                }
                return obj2;
            case 4:
                trh8nlx7q1gvbqd4 = m09PCcKE8f3p5upL5YjVWVv.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
                G7lapk01c8Qj9rz59i g7lapk01c8Qj9rz59i5 = m09PCcKE8f3p5upL5YjVWVv.LcvPFGYKhAm4SS5FZ;
                xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdx7 = m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR;
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objBezslBgjveK3hODH);
                g7lapk01c8Qj9rz59i3 = g7lapk01c8Qj9rz59i5;
                xwevoc3gqlsn1sxdt2gvno3hgucdx3 = xwevoc3gqlsn1sxdt2gvno3hgucdx7;
                sJcHSjzDzq3QX10c = (SJcHSjzDzq3QX10c) objBezslBgjveK3hODH;
                pyaABL8uMuLgCjJcfM = sJcHSjzDzq3QX10c.S1zP5M3X7Ukq3ROlZ87G9I;
                if (pyaABL8uMuLgCjJcfM == null) {
                    googleAuthException = sJcHSjzDzq3QX10c.axL8FocTDLUdzg0XScbO;
                    if (googleAuthException == null) {
                        throw new CancellationException("User cancelled Dialog or has no accounts available.");
                    }
                    J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                    return new Rfp0CprLjJaYY8aiYk(googleAuthException);
                }
                pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO = ((xSr1hPBbWjW) this.qTa7aqjjB9Bt6mc).axL8FocTDLUdzg0XScbO();
                if (pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO != null) {
                    str = pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO.S1zP5M3X7Ukq3ROlZ87G9I;
                } else {
                    str = null;
                }
                m09PCcKE8f3p5upL5YjVWVv.WIXlfFpvH7glAGsUk3 = null;
                m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR = xwevoc3gqlsn1sxdt2gvno3hgucdx3;
                m09PCcKE8f3p5upL5YjVWVv.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i3;
                m09PCcKE8f3p5upL5YjVWVv.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                m09PCcKE8f3p5upL5YjVWVv.sCPtafveBAhdLIs2ajN3WV = null;
                m09PCcKE8f3p5upL5YjVWVv.Mej0x2K4ZGSUxtYNka4QZ = null;
                m09PCcKE8f3p5upL5YjVWVv.J1BE9tYH1em4X1uAhc6L7f4M = 5;
                objS1zP5M3X7Ukq3ROlZ87G9I2 = ((Iol76NSeORZn3oKb4C49HtqjkRhNL) lJmIWKCOd33Br2).S1zP5M3X7Ukq3ROlZ87G9I(trh8nlx7q1gvbqd4, pyaABL8uMuLgCjJcfM, str, m09PCcKE8f3p5upL5YjVWVv);
                if (objS1zP5M3X7Ukq3ROlZ87G9I2 != obj2) {
                    g7lapk01c8Qj9rz59i4 = g7lapk01c8Qj9rz59i3;
                    thS1zP5M3X7Ukq3ROlZ87G9I2 = AeQuqug4cjWl3vY5CUaNGtJ0l.S1zP5M3X7Ukq3ROlZ87G9I(objS1zP5M3X7Ukq3ROlZ87G9I2);
                    if (thS1zP5M3X7Ukq3ROlZ87G9I2 == null) {
                        J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                        return new Rfp0CprLjJaYY8aiYk((GoogleAuthException) thS1zP5M3X7Ukq3ROlZ87G9I2);
                    }
                    authenticationResponse = (AuthenticationResponse) objS1zP5M3X7Ukq3ROlZ87G9I2;
                    m09PCcKE8f3p5upL5YjVWVv.WIXlfFpvH7glAGsUk3 = null;
                    m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR = xwevoc3gqlsn1sxdt2gvno3hgucdx3;
                    m09PCcKE8f3p5upL5YjVWVv.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i4;
                    m09PCcKE8f3p5upL5YjVWVv.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                    m09PCcKE8f3p5upL5YjVWVv.sCPtafveBAhdLIs2ajN3WV = null;
                    m09PCcKE8f3p5upL5YjVWVv.Mej0x2K4ZGSUxtYNka4QZ = null;
                    m09PCcKE8f3p5upL5YjVWVv.qTa7aqjjB9Bt6mc = authenticationResponse;
                    ka8INCBqfwCeAoFT4mw74QJG = this.iR1XUIc7FjhMl57O;
                    m09PCcKE8f3p5upL5YjVWVv.f2sXlW3st0rAKJwyOrCfOWc = ka8INCBqfwCeAoFT4mw74QJG;
                    i = 0;
                    m09PCcKE8f3p5upL5YjVWVv.iR1XUIc7FjhMl57O = 0;
                    m09PCcKE8f3p5upL5YjVWVv.J1BE9tYH1em4X1uAhc6L7f4M = 6;
                    if (ka8INCBqfwCeAoFT4mw74QJG.axL8FocTDLUdzg0XScbO(m09PCcKE8f3p5upL5YjVWVv) != obj2) {
                        String str6 = authenticationResponse.S1zP5M3X7Ukq3ROlZ87G9I;
                        m09PCcKE8f3p5upL5YjVWVv.WIXlfFpvH7glAGsUk3 = null;
                        m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR = xwevoc3gqlsn1sxdt2gvno3hgucdx3;
                        m09PCcKE8f3p5upL5YjVWVv.LcvPFGYKhAm4SS5FZ = null;
                        m09PCcKE8f3p5upL5YjVWVv.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                        m09PCcKE8f3p5upL5YjVWVv.sCPtafveBAhdLIs2ajN3WV = null;
                        m09PCcKE8f3p5upL5YjVWVv.Mej0x2K4ZGSUxtYNka4QZ = null;
                        m09PCcKE8f3p5upL5YjVWVv.qTa7aqjjB9Bt6mc = null;
                        m09PCcKE8f3p5upL5YjVWVv.f2sXlW3st0rAKJwyOrCfOWc = ka8INCBqfwCeAoFT4mw74QJG;
                        m09PCcKE8f3p5upL5YjVWVv.iR1XUIc7FjhMl57O = i;
                        m09PCcKE8f3p5upL5YjVWVv.J1BE9tYH1em4X1uAhc6L7f4M = 7;
                        objBezslBgjveK3hODH = Bk6w7oZjoWt9ZSRs4C7jIhbX3(str6, g7lapk01c8Qj9rz59i4, m09PCcKE8f3p5upL5YjVWVv);
                        if (objBezslBgjveK3hODH != obj2) {
                            ka8INCBqfwCeAoFT4mw74QJG2 = ka8INCBqfwCeAoFT4mw74QJG;
                            xwevoc3gqlsn1sxdt2gvno3hgucdx4 = xwevoc3gqlsn1sxdt2gvno3hgucdx3;
                            xwevoc3gqlsn1sxdt2gvno3hgucdx5 = (xWEvOc3gqLSn1SXDt2GvNO3HGucdx) objBezslBgjveK3hODH;
                            ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                            if (xwevoc3gqlsn1sxdt2gvno3hgucdx5.axL8FocTDLUdzg0XScbO != null) {
                                uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("Expected account to have an email address attached");
                                return null;
                            }
                            sBV5EuS0mGuEYqc5nc5erhuwb1OG7(xwevoc3gqlsn1sxdt2gvno3hgucdx4.axL8FocTDLUdzg0XScbO == null ? 1 : 2, 1);
                            aNONfmXWW0uqauI17bnoBjg anonfmxww0uqaui17bnobjg5 = J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion;
                            GiFxY9WDHrWlHPyoti giFxY9WDHrWlHPyoti5 = new GiFxY9WDHrWlHPyoti(xwevoc3gqlsn1sxdt2gvno3hgucdx5, xwevoc3gqlsn1sxdt2gvno3hgucdx5.axL8FocTDLUdzg0XScbO);
                            anonfmxww0uqaui17bnobjg5.getClass();
                            return giFxY9WDHrWlHPyoti5;
                        }
                    }
                }
                return obj2;
            case 5:
                G7lapk01c8Qj9rz59i g7lapk01c8Qj9rz59i6 = m09PCcKE8f3p5upL5YjVWVv.LcvPFGYKhAm4SS5FZ;
                xwevoc3gqlsn1sxdt2gvno3hgucdx3 = m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR;
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objBezslBgjveK3hODH);
                objS1zP5M3X7Ukq3ROlZ87G9I2 = ((J7Tsg1eqTfbK8vIo4RFOyjPiu) objBezslBgjveK3hODH).S1zP5M3X7Ukq3ROlZ87G9I;
                g7lapk01c8Qj9rz59i4 = g7lapk01c8Qj9rz59i6;
                thS1zP5M3X7Ukq3ROlZ87G9I2 = AeQuqug4cjWl3vY5CUaNGtJ0l.S1zP5M3X7Ukq3ROlZ87G9I(objS1zP5M3X7Ukq3ROlZ87G9I2);
                if (thS1zP5M3X7Ukq3ROlZ87G9I2 == null) {
                    J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                    return new Rfp0CprLjJaYY8aiYk((GoogleAuthException) thS1zP5M3X7Ukq3ROlZ87G9I2);
                }
                authenticationResponse = (AuthenticationResponse) objS1zP5M3X7Ukq3ROlZ87G9I2;
                m09PCcKE8f3p5upL5YjVWVv.WIXlfFpvH7glAGsUk3 = null;
                m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR = xwevoc3gqlsn1sxdt2gvno3hgucdx3;
                m09PCcKE8f3p5upL5YjVWVv.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i4;
                m09PCcKE8f3p5upL5YjVWVv.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                m09PCcKE8f3p5upL5YjVWVv.sCPtafveBAhdLIs2ajN3WV = null;
                m09PCcKE8f3p5upL5YjVWVv.Mej0x2K4ZGSUxtYNka4QZ = null;
                m09PCcKE8f3p5upL5YjVWVv.qTa7aqjjB9Bt6mc = authenticationResponse;
                ka8INCBqfwCeAoFT4mw74QJG = this.iR1XUIc7FjhMl57O;
                m09PCcKE8f3p5upL5YjVWVv.f2sXlW3st0rAKJwyOrCfOWc = ka8INCBqfwCeAoFT4mw74QJG;
                i = 0;
                m09PCcKE8f3p5upL5YjVWVv.iR1XUIc7FjhMl57O = 0;
                m09PCcKE8f3p5upL5YjVWVv.J1BE9tYH1em4X1uAhc6L7f4M = 6;
                if (ka8INCBqfwCeAoFT4mw74QJG.axL8FocTDLUdzg0XScbO(m09PCcKE8f3p5upL5YjVWVv) != obj2) {
                    String str7 = authenticationResponse.S1zP5M3X7Ukq3ROlZ87G9I;
                    m09PCcKE8f3p5upL5YjVWVv.WIXlfFpvH7glAGsUk3 = null;
                    m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR = xwevoc3gqlsn1sxdt2gvno3hgucdx3;
                    m09PCcKE8f3p5upL5YjVWVv.LcvPFGYKhAm4SS5FZ = null;
                    m09PCcKE8f3p5upL5YjVWVv.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                    m09PCcKE8f3p5upL5YjVWVv.sCPtafveBAhdLIs2ajN3WV = null;
                    m09PCcKE8f3p5upL5YjVWVv.Mej0x2K4ZGSUxtYNka4QZ = null;
                    m09PCcKE8f3p5upL5YjVWVv.qTa7aqjjB9Bt6mc = null;
                    m09PCcKE8f3p5upL5YjVWVv.f2sXlW3st0rAKJwyOrCfOWc = ka8INCBqfwCeAoFT4mw74QJG;
                    m09PCcKE8f3p5upL5YjVWVv.iR1XUIc7FjhMl57O = i;
                    m09PCcKE8f3p5upL5YjVWVv.J1BE9tYH1em4X1uAhc6L7f4M = 7;
                    objBezslBgjveK3hODH = Bk6w7oZjoWt9ZSRs4C7jIhbX3(str7, g7lapk01c8Qj9rz59i4, m09PCcKE8f3p5upL5YjVWVv);
                    if (objBezslBgjveK3hODH != obj2) {
                        ka8INCBqfwCeAoFT4mw74QJG2 = ka8INCBqfwCeAoFT4mw74QJG;
                        xwevoc3gqlsn1sxdt2gvno3hgucdx4 = xwevoc3gqlsn1sxdt2gvno3hgucdx3;
                        xwevoc3gqlsn1sxdt2gvno3hgucdx5 = (xWEvOc3gqLSn1SXDt2GvNO3HGucdx) objBezslBgjveK3hODH;
                        ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                        if (xwevoc3gqlsn1sxdt2gvno3hgucdx5.axL8FocTDLUdzg0XScbO != null) {
                            uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("Expected account to have an email address attached");
                            return null;
                        }
                        sBV5EuS0mGuEYqc5nc5erhuwb1OG7(xwevoc3gqlsn1sxdt2gvno3hgucdx4.axL8FocTDLUdzg0XScbO == null ? 1 : 2, 1);
                        aNONfmXWW0uqauI17bnoBjg anonfmxww0uqaui17bnobjg6 = J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion;
                        GiFxY9WDHrWlHPyoti giFxY9WDHrWlHPyoti6 = new GiFxY9WDHrWlHPyoti(xwevoc3gqlsn1sxdt2gvno3hgucdx5, xwevoc3gqlsn1sxdt2gvno3hgucdx5.axL8FocTDLUdzg0XScbO);
                        anonfmxww0uqaui17bnobjg6.getClass();
                        return giFxY9WDHrWlHPyoti6;
                    }
                }
                return obj2;
            case 6:
                int i4 = m09PCcKE8f3p5upL5YjVWVv.iR1XUIc7FjhMl57O;
                Ka8INCBqfwCeAoFT4mw74QJG ka8INCBqfwCeAoFT4mw74QJG4 = m09PCcKE8f3p5upL5YjVWVv.f2sXlW3st0rAKJwyOrCfOWc;
                authenticationResponse = m09PCcKE8f3p5upL5YjVWVv.qTa7aqjjB9Bt6mc;
                g7lapk01c8Qj9rz59i4 = m09PCcKE8f3p5upL5YjVWVv.LcvPFGYKhAm4SS5FZ;
                xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdx8 = m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR;
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objBezslBgjveK3hODH);
                i = i4;
                ka8INCBqfwCeAoFT4mw74QJG = ka8INCBqfwCeAoFT4mw74QJG4;
                xwevoc3gqlsn1sxdt2gvno3hgucdx3 = xwevoc3gqlsn1sxdt2gvno3hgucdx8;
                String str8 = authenticationResponse.S1zP5M3X7Ukq3ROlZ87G9I;
                m09PCcKE8f3p5upL5YjVWVv.WIXlfFpvH7glAGsUk3 = null;
                m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR = xwevoc3gqlsn1sxdt2gvno3hgucdx3;
                m09PCcKE8f3p5upL5YjVWVv.LcvPFGYKhAm4SS5FZ = null;
                m09PCcKE8f3p5upL5YjVWVv.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                m09PCcKE8f3p5upL5YjVWVv.sCPtafveBAhdLIs2ajN3WV = null;
                m09PCcKE8f3p5upL5YjVWVv.Mej0x2K4ZGSUxtYNka4QZ = null;
                m09PCcKE8f3p5upL5YjVWVv.qTa7aqjjB9Bt6mc = null;
                m09PCcKE8f3p5upL5YjVWVv.f2sXlW3st0rAKJwyOrCfOWc = ka8INCBqfwCeAoFT4mw74QJG;
                m09PCcKE8f3p5upL5YjVWVv.iR1XUIc7FjhMl57O = i;
                m09PCcKE8f3p5upL5YjVWVv.J1BE9tYH1em4X1uAhc6L7f4M = 7;
                objBezslBgjveK3hODH = Bk6w7oZjoWt9ZSRs4C7jIhbX3(str8, g7lapk01c8Qj9rz59i4, m09PCcKE8f3p5upL5YjVWVv);
                if (objBezslBgjveK3hODH != obj2) {
                    ka8INCBqfwCeAoFT4mw74QJG2 = ka8INCBqfwCeAoFT4mw74QJG;
                    xwevoc3gqlsn1sxdt2gvno3hgucdx4 = xwevoc3gqlsn1sxdt2gvno3hgucdx3;
                    xwevoc3gqlsn1sxdt2gvno3hgucdx5 = (xWEvOc3gqLSn1SXDt2GvNO3HGucdx) objBezslBgjveK3hODH;
                    ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                    if (xwevoc3gqlsn1sxdt2gvno3hgucdx5.axL8FocTDLUdzg0XScbO != null) {
                        uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("Expected account to have an email address attached");
                        return null;
                    }
                    sBV5EuS0mGuEYqc5nc5erhuwb1OG7(xwevoc3gqlsn1sxdt2gvno3hgucdx4.axL8FocTDLUdzg0XScbO == null ? 1 : 2, 1);
                    aNONfmXWW0uqauI17bnoBjg anonfmxww0uqaui17bnobjg7 = J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion;
                    GiFxY9WDHrWlHPyoti giFxY9WDHrWlHPyoti7 = new GiFxY9WDHrWlHPyoti(xwevoc3gqlsn1sxdt2gvno3hgucdx5, xwevoc3gqlsn1sxdt2gvno3hgucdx5.axL8FocTDLUdzg0XScbO);
                    anonfmxww0uqaui17bnobjg7.getClass();
                    return giFxY9WDHrWlHPyoti7;
                }
                return obj2;
            case 7:
                ka8INCBqfwCeAoFT4mw74QJG2 = m09PCcKE8f3p5upL5YjVWVv.f2sXlW3st0rAKJwyOrCfOWc;
                xwevoc3gqlsn1sxdt2gvno3hgucdx4 = m09PCcKE8f3p5upL5YjVWVv.gsHzEVTj1SCIPR;
                try {
                    Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objBezslBgjveK3hODH);
                    xwevoc3gqlsn1sxdt2gvno3hgucdx5 = (xWEvOc3gqLSn1SXDt2GvNO3HGucdx) objBezslBgjveK3hODH;
                    ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                    if (xwevoc3gqlsn1sxdt2gvno3hgucdx5.axL8FocTDLUdzg0XScbO != null) {
                        uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("Expected account to have an email address attached");
                        return null;
                    }
                    sBV5EuS0mGuEYqc5nc5erhuwb1OG7(xwevoc3gqlsn1sxdt2gvno3hgucdx4.axL8FocTDLUdzg0XScbO == null ? 1 : 2, 1);
                    aNONfmXWW0uqauI17bnoBjg anonfmxww0uqaui17bnobjg8 = J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion;
                    GiFxY9WDHrWlHPyoti giFxY9WDHrWlHPyoti8 = new GiFxY9WDHrWlHPyoti(xwevoc3gqlsn1sxdt2gvno3hgucdx5, xwevoc3gqlsn1sxdt2gvno3hgucdx5.axL8FocTDLUdzg0XScbO);
                    anonfmxww0uqaui17bnobjg8.getClass();
                    return giFxY9WDHrWlHPyoti8;
                } catch (Throwable th3) {
                    th = th3;
                    ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                    throw th;
                }
            default:
                uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ToEIy0qfkltfGfO3vmAQG(bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) throws Throwable {
        g3Qz0j6vVi8z5QcL g3qz0j6vvi8z5qcl;
        ServerConnectionException serverConnectionException;
        String str;
        G7lapk01c8Qj9rz59i g7lapk01c8Qj9rz59i;
        String str2;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof g3Qz0j6vVi8z5QcL) {
            g3qz0j6vvi8z5qcl = (g3Qz0j6vVi8z5QcL) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i = g3qz0j6vvi8z5qcl.Mej0x2K4ZGSUxtYNka4QZ;
            if ((i & Integer.MIN_VALUE) != 0) {
                g3qz0j6vvi8z5qcl.Mej0x2K4ZGSUxtYNka4QZ = i - Integer.MIN_VALUE;
            } else {
                g3qz0j6vvi8z5qcl = new g3Qz0j6vVi8z5QcL(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            g3qz0j6vvi8z5qcl = new g3Qz0j6vVi8z5QcL(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        Object objS1zP5M3X7Ukq3ROlZ87G9I = g3qz0j6vvi8z5qcl.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
        int i2 = g3qz0j6vvi8z5qcl.Mej0x2K4ZGSUxtYNka4QZ;
        s9XnN7QTAJ s9xnn7qtaj = s9XnN7QTAJ.S1zP5M3X7Ukq3ROlZ87G9I;
        Object obj = tIDTjdoK38.GO8WUug7ZWFCUI1zY;
        try {
            if (i2 == 0) {
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objS1zP5M3X7Ukq3ROlZ87G9I);
                xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz = PQQPeCDD0JLCT3aLz();
                if (xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz != null) {
                    str = xwevoc3gqlsn1sxdt2gvno3hgucdxPQQPeCDD0JLCT3aLz.BezslBgjveK3hODH;
                    g3qz0j6vvi8z5qcl.WIXlfFpvH7glAGsUk3 = str;
                    g3qz0j6vvi8z5qcl.Mej0x2K4ZGSUxtYNka4QZ = 1;
                    objS1zP5M3X7Ukq3ROlZ87G9I = this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp.S1zP5M3X7Ukq3ROlZ87G9I(g3qz0j6vvi8z5qcl);
                    if (objS1zP5M3X7Ukq3ROlZ87G9I != obj) {
                    }
                    return obj;
                }
                return s9xnn7qtaj;
            }
            if (i2 == 1) {
                str = g3qz0j6vvi8z5qcl.WIXlfFpvH7glAGsUk3;
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objS1zP5M3X7Ukq3ROlZ87G9I);
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        serverConnectionException = g3qz0j6vvi8z5qcl.LcvPFGYKhAm4SS5FZ;
                        Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objS1zP5M3X7Ukq3ROlZ87G9I);
                        throw new VeException(14, serverConnectionException);
                    }
                    if (i2 != 4) {
                        uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objS1zP5M3X7Ukq3ROlZ87G9I);
                    return s9xnn7qtaj;
                }
                g7lapk01c8Qj9rz59i = g3qz0j6vvi8z5qcl.gsHzEVTj1SCIPR;
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objS1zP5M3X7Ukq3ROlZ87G9I);
            }
            str2 = ((AuthenticationResponse) objS1zP5M3X7Ukq3ROlZ87G9I).S1zP5M3X7Ukq3ROlZ87G9I;
            g3qz0j6vvi8z5qcl.WIXlfFpvH7glAGsUk3 = null;
            g3qz0j6vvi8z5qcl.gsHzEVTj1SCIPR = null;
            g3qz0j6vvi8z5qcl.LcvPFGYKhAm4SS5FZ = null;
            g3qz0j6vvi8z5qcl.Mej0x2K4ZGSUxtYNka4QZ = 4;
            if (Bk6w7oZjoWt9ZSRs4C7jIhbX3(str2, g7lapk01c8Qj9rz59i, g3qz0j6vvi8z5qcl) != obj) {
                return obj;
            }
            return s9xnn7qtaj;
            G7lapk01c8Qj9rz59i g7lapk01c8Qj9rz59i2 = (G7lapk01c8Qj9rz59i) objS1zP5M3X7Ukq3ROlZ87G9I;
            XmacCNxiXPR0cfyyx756Yz xmacCNxiXPR0cfyyx756Yz = new XmacCNxiXPR0cfyyx756Yz();
            xmacCNxiXPR0cfyyx756Yz.S1zP5M3X7Ukq3ROlZ87G9I = sRgu8ykgdYOnT49j1bPuQWmquU.S1zP5M3X7Ukq3ROlZ87G9I(new dmS6wyHAG6gvZAivjtzncxH1NYIQ(10));
            sRgu8ykgdYOnT49j1bPuQWmquU.Aboow6rUrcY2SrFRa46C6uy(xmacCNxiXPR0cfyyx756Yz, new tRh8nLx7q1GvbQd(g7lapk01c8Qj9rz59i2.axL8FocTDLUdzg0XScbO, str));
            xNthAUu9aBYOvIzNXbI xnthauu9abyoviznxbi = new xNthAUu9aBYOvIzNXbI(xmacCNxiXPR0cfyyx756Yz);
            PeLieoBN4yxYJZju3kQtKIsq7XL8 peLieoBN4yxYJZju3kQtKIsq7XL8 = NMquq9o0FvRs5RyiTFrS.S1zP5M3X7Ukq3ROlZ87G9I;
            x4PcPRPmslEJW x4pcprpmslejw = x4PcPRPmslEJW.cCmbv8Tzd2QLd161ImIZUlZ8n;
            Zus6J6a6yEd4hDe6wgCNYv zus6J6a6yEd4hDe6wgCNYv = new Zus6J6a6yEd4hDe6wgCNYv(this, xnthauu9abyoviznxbi, null);
            g3qz0j6vvi8z5qcl.WIXlfFpvH7glAGsUk3 = null;
            g3qz0j6vvi8z5qcl.gsHzEVTj1SCIPR = g7lapk01c8Qj9rz59i2;
            g3qz0j6vvi8z5qcl.Mej0x2K4ZGSUxtYNka4QZ = 2;
            Object objJY5knQmh7EQJEZ = rbpFGdpgDCAQXat.JY5knQmh7EQJEZ(x4pcprpmslejw, zus6J6a6yEd4hDe6wgCNYv, g3qz0j6vvi8z5qcl);
            if (objJY5knQmh7EQJEZ != obj) {
                g7lapk01c8Qj9rz59i = g7lapk01c8Qj9rz59i2;
                objS1zP5M3X7Ukq3ROlZ87G9I = objJY5knQmh7EQJEZ;
                str2 = ((AuthenticationResponse) objS1zP5M3X7Ukq3ROlZ87G9I).S1zP5M3X7Ukq3ROlZ87G9I;
                g3qz0j6vvi8z5qcl.WIXlfFpvH7glAGsUk3 = null;
                g3qz0j6vvi8z5qcl.gsHzEVTj1SCIPR = null;
                g3qz0j6vvi8z5qcl.LcvPFGYKhAm4SS5FZ = null;
                g3qz0j6vvi8z5qcl.Mej0x2K4ZGSUxtYNka4QZ = 4;
                if (Bk6w7oZjoWt9ZSRs4C7jIhbX3(str2, g7lapk01c8Qj9rz59i, g3qz0j6vvi8z5qcl) != obj) {
                    return s9xnn7qtaj;
                }
            }
        } catch (ServerConnectionException e) {
            if (!(e instanceof HttpException)) {
                if (e instanceof ParseServerResponseException) {
                    throw new VeException(3, e);
                }
                throw new VeException(0, e);
            }
            HttpException httpException = (HttpException) e;
            int i3 = httpException.GO8WUug7ZWFCUI1zY;
            if (i3 == 400) {
                throw new VeException(12, e);
            }
            if (i3 != 401) {
                if (i3 == 502 || i3 == 504) {
                    throw new VeException(0, e);
                }
                throw new VeException(3, e);
            }
            g3qz0j6vvi8z5qcl.WIXlfFpvH7glAGsUk3 = null;
            g3qz0j6vvi8z5qcl.gsHzEVTj1SCIPR = null;
            g3qz0j6vvi8z5qcl.LcvPFGYKhAm4SS5FZ = httpException;
            g3qz0j6vvi8z5qcl.Mej0x2K4ZGSUxtYNka4QZ = 3;
            if (JPYjB0bzUqKR(true, g3qz0j6vvi8z5qcl) != obj) {
                serverConnectionException = e;
            }
            return obj;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:41:0x011f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0128  */
    /* JADX WARN: Code duplicated, block: B:46:0x0132  */
    /* JADX WARN: Code duplicated, block: B:47:0x0136  */
    /* JADX WARN: Code duplicated, block: B:51:0x0151  */
    /* JADX WARN: Code duplicated, block: B:54:0x0159  */
    /* JADX WARN: Code duplicated, block: B:57:0x017b  */
    /* JADX WARN: Code duplicated, block: B:61:0x019a  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:75:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object UV6K6VDbgDgzpi12QAEKN4Emq(boolean z, wFIO6q9fiuz1bTK wfio6q9fiuz1btk, bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) throws Throwable {
        NrAPIWeT5aG2qCTyQxy550YaK nrAPIWeT5aG2qCTyQxy550YaK;
        wFIO6q9fiuz1bTK wfio6q9fiuz1btk2;
        Object objS1zP5M3X7Ukq3ROlZ87G9I;
        boolean z2;
        G7lapk01c8Qj9rz59i g7lapk01c8Qj9rz59i;
        UOdbn0BbqEbVKpITLTOKPLNI uOdbn0BbqEbVKpITLTOKPLNI;
        Object objAxL8FocTDLUdzg0XScbO;
        wFIO6q9fiuz1bTK wfio6q9fiuz1btk3;
        Object obj;
        Throwable thS1zP5M3X7Ukq3ROlZ87G9I;
        GoogleAuthClientSession googleAuthClientSession;
        Object objS1zP5M3X7Ukq3ROlZ87G9I2;
        GoogleAuthClientSession googleAuthClientSession2;
        UOdbn0BbqEbVKpITLTOKPLNI uOdbn0BbqEbVKpITLTOKPLNI2;
        G7lapk01c8Qj9rz59i g7lapk01c8Qj9rz59i2;
        LJmIWKCOd33Br lJmIWKCOd33Br;
        boolean z3;
        UOdbn0BbqEbVKpITLTOKPLNI uOdbn0BbqEbVKpITLTOKPLNI3;
        G7lapk01c8Qj9rz59i g7lapk01c8Qj9rz59i3;
        SJcHSjzDzq3QX10c sJcHSjzDzq3QX10c;
        PyaABL8uMuLgCjJcfM pyaABL8uMuLgCjJcfM;
        GoogleAuthException googleAuthException;
        pijs62HGGnGxq0xD0cXq pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO;
        String str;
        Object objZiNFA7KzVfc6;
        G7lapk01c8Qj9rz59i g7lapk01c8Qj9rz59i4;
        boolean z4;
        Throwable thS1zP5M3X7Ukq3ROlZ87G9I2;
        AuthenticationResponse authenticationResponse;
        ihaOqtO8vhfVeT5tdIPOEGawOKH ihaoqto8vhfvet5tdipoegawokh;
        int i;
        Ka8INCBqfwCeAoFT4mw74QJG ka8INCBqfwCeAoFT4mw74QJG;
        Ka8INCBqfwCeAoFT4mw74QJG ka8INCBqfwCeAoFT4mw74QJG2;
        xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdx;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof NrAPIWeT5aG2qCTyQxy550YaK) {
            nrAPIWeT5aG2qCTyQxy550YaK = (NrAPIWeT5aG2qCTyQxy550YaK) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i2 = nrAPIWeT5aG2qCTyQxy550YaK.J1BE9tYH1em4X1uAhc6L7f4M;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nrAPIWeT5aG2qCTyQxy550YaK.J1BE9tYH1em4X1uAhc6L7f4M = i2 - Integer.MIN_VALUE;
            } else {
                nrAPIWeT5aG2qCTyQxy550YaK = new NrAPIWeT5aG2qCTyQxy550YaK(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            nrAPIWeT5aG2qCTyQxy550YaK = new NrAPIWeT5aG2qCTyQxy550YaK(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        NrAPIWeT5aG2qCTyQxy550YaK nrAPIWeT5aG2qCTyQxy550YaK2 = nrAPIWeT5aG2qCTyQxy550YaK;
        Object objBezslBgjveK3hODH = nrAPIWeT5aG2qCTyQxy550YaK2.yM5HHkk1MhPLZFYTHm2JjrArud;
        int i3 = nrAPIWeT5aG2qCTyQxy550YaK2.J1BE9tYH1em4X1uAhc6L7f4M;
        LJmIWKCOd33Br lJmIWKCOd33Br2 = this.Mej0x2K4ZGSUxtYNka4QZ;
        Object obj2 = tIDTjdoK38.GO8WUug7ZWFCUI1zY;
        switch (i3) {
            case 0:
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objBezslBgjveK3hODH);
                wfio6q9fiuz1btk2 = wfio6q9fiuz1btk;
                nrAPIWeT5aG2qCTyQxy550YaK2.gsHzEVTj1SCIPR = wfio6q9fiuz1btk2;
                nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3 = z;
                nrAPIWeT5aG2qCTyQxy550YaK2.J1BE9tYH1em4X1uAhc6L7f4M = 1;
                objS1zP5M3X7Ukq3ROlZ87G9I = this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp.S1zP5M3X7Ukq3ROlZ87G9I(nrAPIWeT5aG2qCTyQxy550YaK2);
                if (objS1zP5M3X7Ukq3ROlZ87G9I != obj2) {
                    z2 = z;
                    g7lapk01c8Qj9rz59i = (G7lapk01c8Qj9rz59i) objS1zP5M3X7Ukq3ROlZ87G9I;
                    uOdbn0BbqEbVKpITLTOKPLNI = new UOdbn0BbqEbVKpITLTOKPLNI(g7lapk01c8Qj9rz59i.axL8FocTDLUdzg0XScbO);
                    nrAPIWeT5aG2qCTyQxy550YaK2.gsHzEVTj1SCIPR = wfio6q9fiuz1btk2;
                    nrAPIWeT5aG2qCTyQxy550YaK2.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i;
                    nrAPIWeT5aG2qCTyQxy550YaK2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = uOdbn0BbqEbVKpITLTOKPLNI;
                    nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3 = z2;
                    nrAPIWeT5aG2qCTyQxy550YaK2.J1BE9tYH1em4X1uAhc6L7f4M = 2;
                    objAxL8FocTDLUdzg0XScbO = ((Iol76NSeORZn3oKb4C49HtqjkRhNL) lJmIWKCOd33Br2).axL8FocTDLUdzg0XScbO(uOdbn0BbqEbVKpITLTOKPLNI, nrAPIWeT5aG2qCTyQxy550YaK2);
                    if (objAxL8FocTDLUdzg0XScbO != obj2) {
                        wfio6q9fiuz1btk3 = wfio6q9fiuz1btk2;
                        obj = objAxL8FocTDLUdzg0XScbO;
                        thS1zP5M3X7Ukq3ROlZ87G9I = AeQuqug4cjWl3vY5CUaNGtJ0l.S1zP5M3X7Ukq3ROlZ87G9I(obj);
                        if (thS1zP5M3X7Ukq3ROlZ87G9I != null) {
                            J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                            return new Rfp0CprLjJaYY8aiYk((GoogleAuthException) thS1zP5M3X7Ukq3ROlZ87G9I);
                        }
                        googleAuthClientSession = (GoogleAuthClientSession) obj;
                        nrAPIWeT5aG2qCTyQxy550YaK2.gsHzEVTj1SCIPR = null;
                        nrAPIWeT5aG2qCTyQxy550YaK2.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i;
                        nrAPIWeT5aG2qCTyQxy550YaK2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = uOdbn0BbqEbVKpITLTOKPLNI;
                        nrAPIWeT5aG2qCTyQxy550YaK2.sCPtafveBAhdLIs2ajN3WV = lJmIWKCOd33Br2;
                        nrAPIWeT5aG2qCTyQxy550YaK2.Mej0x2K4ZGSUxtYNka4QZ = googleAuthClientSession;
                        nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3 = z2;
                        nrAPIWeT5aG2qCTyQxy550YaK2.J1BE9tYH1em4X1uAhc6L7f4M = 3;
                        objS1zP5M3X7Ukq3ROlZ87G9I2 = wfio6q9fiuz1btk3.S1zP5M3X7Ukq3ROlZ87G9I(nrAPIWeT5aG2qCTyQxy550YaK2);
                        if (objS1zP5M3X7Ukq3ROlZ87G9I2 != obj2) {
                            UOdbn0BbqEbVKpITLTOKPLNI uOdbn0BbqEbVKpITLTOKPLNI4 = uOdbn0BbqEbVKpITLTOKPLNI;
                            googleAuthClientSession2 = googleAuthClientSession;
                            objBezslBgjveK3hODH = objS1zP5M3X7Ukq3ROlZ87G9I2;
                            uOdbn0BbqEbVKpITLTOKPLNI2 = uOdbn0BbqEbVKpITLTOKPLNI4;
                            g7lapk01c8Qj9rz59i2 = g7lapk01c8Qj9rz59i;
                            lJmIWKCOd33Br = lJmIWKCOd33Br2;
                            nrAPIWeT5aG2qCTyQxy550YaK2.gsHzEVTj1SCIPR = null;
                            nrAPIWeT5aG2qCTyQxy550YaK2.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i2;
                            nrAPIWeT5aG2qCTyQxy550YaK2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = uOdbn0BbqEbVKpITLTOKPLNI2;
                            nrAPIWeT5aG2qCTyQxy550YaK2.sCPtafveBAhdLIs2ajN3WV = null;
                            nrAPIWeT5aG2qCTyQxy550YaK2.Mej0x2K4ZGSUxtYNka4QZ = null;
                            nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3 = z2;
                            nrAPIWeT5aG2qCTyQxy550YaK2.J1BE9tYH1em4X1uAhc6L7f4M = 4;
                            objBezslBgjveK3hODH = ((Iol76NSeORZn3oKb4C49HtqjkRhNL) lJmIWKCOd33Br).BezslBgjveK3hODH(googleAuthClientSession2, (Activity) objBezslBgjveK3hODH, nrAPIWeT5aG2qCTyQxy550YaK2);
                            if (objBezslBgjveK3hODH != obj2) {
                                z3 = z2;
                                uOdbn0BbqEbVKpITLTOKPLNI3 = uOdbn0BbqEbVKpITLTOKPLNI2;
                                g7lapk01c8Qj9rz59i3 = g7lapk01c8Qj9rz59i2;
                                sJcHSjzDzq3QX10c = (SJcHSjzDzq3QX10c) objBezslBgjveK3hODH;
                                pyaABL8uMuLgCjJcfM = sJcHSjzDzq3QX10c.S1zP5M3X7Ukq3ROlZ87G9I;
                                if (pyaABL8uMuLgCjJcfM == null) {
                                    googleAuthException = sJcHSjzDzq3QX10c.axL8FocTDLUdzg0XScbO;
                                    if (googleAuthException == null) {
                                        throw new CancellationException("User cancelled Dialog or has no accounts available.");
                                    }
                                    J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                                    return new Rfp0CprLjJaYY8aiYk(googleAuthException);
                                }
                                pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO = ((xSr1hPBbWjW) this.qTa7aqjjB9Bt6mc).axL8FocTDLUdzg0XScbO();
                                if (pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO != null) {
                                    str = pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO.S1zP5M3X7Ukq3ROlZ87G9I;
                                } else {
                                    str = null;
                                }
                                nrAPIWeT5aG2qCTyQxy550YaK2.gsHzEVTj1SCIPR = null;
                                nrAPIWeT5aG2qCTyQxy550YaK2.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i3;
                                nrAPIWeT5aG2qCTyQxy550YaK2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                                nrAPIWeT5aG2qCTyQxy550YaK2.sCPtafveBAhdLIs2ajN3WV = null;
                                nrAPIWeT5aG2qCTyQxy550YaK2.Mej0x2K4ZGSUxtYNka4QZ = null;
                                nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3 = z3;
                                nrAPIWeT5aG2qCTyQxy550YaK2.J1BE9tYH1em4X1uAhc6L7f4M = 5;
                                objZiNFA7KzVfc6 = ((Iol76NSeORZn3oKb4C49HtqjkRhNL) lJmIWKCOd33Br2).ziNFA7KzVfc6(uOdbn0BbqEbVKpITLTOKPLNI3, pyaABL8uMuLgCjJcfM, FzogU2bPCQtD6a1hMYB1kyti, str, z3, nrAPIWeT5aG2qCTyQxy550YaK2);
                                if (objZiNFA7KzVfc6 != obj2) {
                                    g7lapk01c8Qj9rz59i4 = g7lapk01c8Qj9rz59i3;
                                    z4 = z3;
                                    thS1zP5M3X7Ukq3ROlZ87G9I2 = AeQuqug4cjWl3vY5CUaNGtJ0l.S1zP5M3X7Ukq3ROlZ87G9I(objZiNFA7KzVfc6);
                                    if (thS1zP5M3X7Ukq3ROlZ87G9I2 == null) {
                                        J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                                        return new Rfp0CprLjJaYY8aiYk((GoogleAuthException) thS1zP5M3X7Ukq3ROlZ87G9I2);
                                    }
                                    authenticationResponse = (AuthenticationResponse) objZiNFA7KzVfc6;
                                    nrAPIWeT5aG2qCTyQxy550YaK2.gsHzEVTj1SCIPR = null;
                                    nrAPIWeT5aG2qCTyQxy550YaK2.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i4;
                                    nrAPIWeT5aG2qCTyQxy550YaK2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                                    nrAPIWeT5aG2qCTyQxy550YaK2.sCPtafveBAhdLIs2ajN3WV = null;
                                    nrAPIWeT5aG2qCTyQxy550YaK2.Mej0x2K4ZGSUxtYNka4QZ = null;
                                    nrAPIWeT5aG2qCTyQxy550YaK2.qTa7aqjjB9Bt6mc = authenticationResponse;
                                    ihaoqto8vhfvet5tdipoegawokh = this.iR1XUIc7FjhMl57O;
                                    nrAPIWeT5aG2qCTyQxy550YaK2.f2sXlW3st0rAKJwyOrCfOWc = ihaoqto8vhfvet5tdipoegawokh;
                                    nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3 = z4;
                                    i = 0;
                                    nrAPIWeT5aG2qCTyQxy550YaK2.iR1XUIc7FjhMl57O = 0;
                                    nrAPIWeT5aG2qCTyQxy550YaK2.J1BE9tYH1em4X1uAhc6L7f4M = 6;
                                    if (ihaoqto8vhfvet5tdipoegawokh.axL8FocTDLUdzg0XScbO(nrAPIWeT5aG2qCTyQxy550YaK2) != obj2) {
                                        ka8INCBqfwCeAoFT4mw74QJG = ihaoqto8vhfvet5tdipoegawokh;
                                        try {
                                            String str2 = authenticationResponse.S1zP5M3X7Ukq3ROlZ87G9I;
                                            nrAPIWeT5aG2qCTyQxy550YaK2.gsHzEVTj1SCIPR = null;
                                            nrAPIWeT5aG2qCTyQxy550YaK2.LcvPFGYKhAm4SS5FZ = null;
                                            nrAPIWeT5aG2qCTyQxy550YaK2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                                            nrAPIWeT5aG2qCTyQxy550YaK2.sCPtafveBAhdLIs2ajN3WV = null;
                                            nrAPIWeT5aG2qCTyQxy550YaK2.Mej0x2K4ZGSUxtYNka4QZ = null;
                                            nrAPIWeT5aG2qCTyQxy550YaK2.qTa7aqjjB9Bt6mc = null;
                                            nrAPIWeT5aG2qCTyQxy550YaK2.f2sXlW3st0rAKJwyOrCfOWc = ka8INCBqfwCeAoFT4mw74QJG;
                                            nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3 = z4;
                                            nrAPIWeT5aG2qCTyQxy550YaK2.iR1XUIc7FjhMl57O = i;
                                            nrAPIWeT5aG2qCTyQxy550YaK2.J1BE9tYH1em4X1uAhc6L7f4M = 7;
                                            objBezslBgjveK3hODH = Bk6w7oZjoWt9ZSRs4C7jIhbX3(str2, g7lapk01c8Qj9rz59i4, nrAPIWeT5aG2qCTyQxy550YaK2);
                                            if (objBezslBgjveK3hODH != obj2) {
                                                ka8INCBqfwCeAoFT4mw74QJG2 = ka8INCBqfwCeAoFT4mw74QJG;
                                                xwevoc3gqlsn1sxdt2gvno3hgucdx = (xWEvOc3gqLSn1SXDt2GvNO3HGucdx) objBezslBgjveK3hODH;
                                                ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                                                if (xwevoc3gqlsn1sxdt2gvno3hgucdx.axL8FocTDLUdzg0XScbO != null) {
                                                    uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("Expected account to have an email address attached");
                                                    return null;
                                                }
                                                sBV5EuS0mGuEYqc5nc5erhuwb1OG7(3, 1);
                                                aNONfmXWW0uqauI17bnoBjg anonfmxww0uqaui17bnobjg = J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion;
                                                GiFxY9WDHrWlHPyoti giFxY9WDHrWlHPyoti = new GiFxY9WDHrWlHPyoti(xwevoc3gqlsn1sxdt2gvno3hgucdx, xwevoc3gqlsn1sxdt2gvno3hgucdx.axL8FocTDLUdzg0XScbO);
                                                anonfmxww0uqaui17bnobjg.getClass();
                                                return giFxY9WDHrWlHPyoti;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            ka8INCBqfwCeAoFT4mw74QJG2 = ka8INCBqfwCeAoFT4mw74QJG;
                                            ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                                            throw th;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return obj2;
            case 1:
                z2 = nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3;
                wFIO6q9fiuz1bTK wfio6q9fiuz1btk4 = nrAPIWeT5aG2qCTyQxy550YaK2.gsHzEVTj1SCIPR;
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objBezslBgjveK3hODH);
                objS1zP5M3X7Ukq3ROlZ87G9I = objBezslBgjveK3hODH;
                wfio6q9fiuz1btk2 = wfio6q9fiuz1btk4;
                g7lapk01c8Qj9rz59i = (G7lapk01c8Qj9rz59i) objS1zP5M3X7Ukq3ROlZ87G9I;
                uOdbn0BbqEbVKpITLTOKPLNI = new UOdbn0BbqEbVKpITLTOKPLNI(g7lapk01c8Qj9rz59i.axL8FocTDLUdzg0XScbO);
                nrAPIWeT5aG2qCTyQxy550YaK2.gsHzEVTj1SCIPR = wfio6q9fiuz1btk2;
                nrAPIWeT5aG2qCTyQxy550YaK2.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i;
                nrAPIWeT5aG2qCTyQxy550YaK2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = uOdbn0BbqEbVKpITLTOKPLNI;
                nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3 = z2;
                nrAPIWeT5aG2qCTyQxy550YaK2.J1BE9tYH1em4X1uAhc6L7f4M = 2;
                objAxL8FocTDLUdzg0XScbO = ((Iol76NSeORZn3oKb4C49HtqjkRhNL) lJmIWKCOd33Br2).axL8FocTDLUdzg0XScbO(uOdbn0BbqEbVKpITLTOKPLNI, nrAPIWeT5aG2qCTyQxy550YaK2);
                if (objAxL8FocTDLUdzg0XScbO != obj2) {
                    wfio6q9fiuz1btk3 = wfio6q9fiuz1btk2;
                    obj = objAxL8FocTDLUdzg0XScbO;
                    thS1zP5M3X7Ukq3ROlZ87G9I = AeQuqug4cjWl3vY5CUaNGtJ0l.S1zP5M3X7Ukq3ROlZ87G9I(obj);
                    if (thS1zP5M3X7Ukq3ROlZ87G9I != null) {
                        J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                        return new Rfp0CprLjJaYY8aiYk((GoogleAuthException) thS1zP5M3X7Ukq3ROlZ87G9I);
                    }
                    googleAuthClientSession = (GoogleAuthClientSession) obj;
                    nrAPIWeT5aG2qCTyQxy550YaK2.gsHzEVTj1SCIPR = null;
                    nrAPIWeT5aG2qCTyQxy550YaK2.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i;
                    nrAPIWeT5aG2qCTyQxy550YaK2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = uOdbn0BbqEbVKpITLTOKPLNI;
                    nrAPIWeT5aG2qCTyQxy550YaK2.sCPtafveBAhdLIs2ajN3WV = lJmIWKCOd33Br2;
                    nrAPIWeT5aG2qCTyQxy550YaK2.Mej0x2K4ZGSUxtYNka4QZ = googleAuthClientSession;
                    nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3 = z2;
                    nrAPIWeT5aG2qCTyQxy550YaK2.J1BE9tYH1em4X1uAhc6L7f4M = 3;
                    objS1zP5M3X7Ukq3ROlZ87G9I2 = wfio6q9fiuz1btk3.S1zP5M3X7Ukq3ROlZ87G9I(nrAPIWeT5aG2qCTyQxy550YaK2);
                    if (objS1zP5M3X7Ukq3ROlZ87G9I2 != obj2) {
                        UOdbn0BbqEbVKpITLTOKPLNI uOdbn0BbqEbVKpITLTOKPLNI5 = uOdbn0BbqEbVKpITLTOKPLNI;
                        googleAuthClientSession2 = googleAuthClientSession;
                        objBezslBgjveK3hODH = objS1zP5M3X7Ukq3ROlZ87G9I2;
                        uOdbn0BbqEbVKpITLTOKPLNI2 = uOdbn0BbqEbVKpITLTOKPLNI5;
                        g7lapk01c8Qj9rz59i2 = g7lapk01c8Qj9rz59i;
                        lJmIWKCOd33Br = lJmIWKCOd33Br2;
                        nrAPIWeT5aG2qCTyQxy550YaK2.gsHzEVTj1SCIPR = null;
                        nrAPIWeT5aG2qCTyQxy550YaK2.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i2;
                        nrAPIWeT5aG2qCTyQxy550YaK2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = uOdbn0BbqEbVKpITLTOKPLNI2;
                        nrAPIWeT5aG2qCTyQxy550YaK2.sCPtafveBAhdLIs2ajN3WV = null;
                        nrAPIWeT5aG2qCTyQxy550YaK2.Mej0x2K4ZGSUxtYNka4QZ = null;
                        nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3 = z2;
                        nrAPIWeT5aG2qCTyQxy550YaK2.J1BE9tYH1em4X1uAhc6L7f4M = 4;
                        objBezslBgjveK3hODH = ((Iol76NSeORZn3oKb4C49HtqjkRhNL) lJmIWKCOd33Br).BezslBgjveK3hODH(googleAuthClientSession2, (Activity) objBezslBgjveK3hODH, nrAPIWeT5aG2qCTyQxy550YaK2);
                        if (objBezslBgjveK3hODH != obj2) {
                            z3 = z2;
                            uOdbn0BbqEbVKpITLTOKPLNI3 = uOdbn0BbqEbVKpITLTOKPLNI2;
                            g7lapk01c8Qj9rz59i3 = g7lapk01c8Qj9rz59i2;
                            sJcHSjzDzq3QX10c = (SJcHSjzDzq3QX10c) objBezslBgjveK3hODH;
                            pyaABL8uMuLgCjJcfM = sJcHSjzDzq3QX10c.S1zP5M3X7Ukq3ROlZ87G9I;
                            if (pyaABL8uMuLgCjJcfM == null) {
                                googleAuthException = sJcHSjzDzq3QX10c.axL8FocTDLUdzg0XScbO;
                                if (googleAuthException == null) {
                                    throw new CancellationException("User cancelled Dialog or has no accounts available.");
                                }
                                J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                                return new Rfp0CprLjJaYY8aiYk(googleAuthException);
                            }
                            pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO = ((xSr1hPBbWjW) this.qTa7aqjjB9Bt6mc).axL8FocTDLUdzg0XScbO();
                            if (pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO != null) {
                                str = pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO.S1zP5M3X7Ukq3ROlZ87G9I;
                            } else {
                                str = null;
                            }
                            nrAPIWeT5aG2qCTyQxy550YaK2.gsHzEVTj1SCIPR = null;
                            nrAPIWeT5aG2qCTyQxy550YaK2.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i3;
                            nrAPIWeT5aG2qCTyQxy550YaK2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                            nrAPIWeT5aG2qCTyQxy550YaK2.sCPtafveBAhdLIs2ajN3WV = null;
                            nrAPIWeT5aG2qCTyQxy550YaK2.Mej0x2K4ZGSUxtYNka4QZ = null;
                            nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3 = z3;
                            nrAPIWeT5aG2qCTyQxy550YaK2.J1BE9tYH1em4X1uAhc6L7f4M = 5;
                            objZiNFA7KzVfc6 = ((Iol76NSeORZn3oKb4C49HtqjkRhNL) lJmIWKCOd33Br2).ziNFA7KzVfc6(uOdbn0BbqEbVKpITLTOKPLNI3, pyaABL8uMuLgCjJcfM, FzogU2bPCQtD6a1hMYB1kyti, str, z3, nrAPIWeT5aG2qCTyQxy550YaK2);
                            if (objZiNFA7KzVfc6 != obj2) {
                                g7lapk01c8Qj9rz59i4 = g7lapk01c8Qj9rz59i3;
                                z4 = z3;
                                thS1zP5M3X7Ukq3ROlZ87G9I2 = AeQuqug4cjWl3vY5CUaNGtJ0l.S1zP5M3X7Ukq3ROlZ87G9I(objZiNFA7KzVfc6);
                                if (thS1zP5M3X7Ukq3ROlZ87G9I2 == null) {
                                    J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                                    return new Rfp0CprLjJaYY8aiYk((GoogleAuthException) thS1zP5M3X7Ukq3ROlZ87G9I2);
                                }
                                authenticationResponse = (AuthenticationResponse) objZiNFA7KzVfc6;
                                nrAPIWeT5aG2qCTyQxy550YaK2.gsHzEVTj1SCIPR = null;
                                nrAPIWeT5aG2qCTyQxy550YaK2.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i4;
                                nrAPIWeT5aG2qCTyQxy550YaK2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                                nrAPIWeT5aG2qCTyQxy550YaK2.sCPtafveBAhdLIs2ajN3WV = null;
                                nrAPIWeT5aG2qCTyQxy550YaK2.Mej0x2K4ZGSUxtYNka4QZ = null;
                                nrAPIWeT5aG2qCTyQxy550YaK2.qTa7aqjjB9Bt6mc = authenticationResponse;
                                ihaoqto8vhfvet5tdipoegawokh = this.iR1XUIc7FjhMl57O;
                                nrAPIWeT5aG2qCTyQxy550YaK2.f2sXlW3st0rAKJwyOrCfOWc = ihaoqto8vhfvet5tdipoegawokh;
                                nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3 = z4;
                                i = 0;
                                nrAPIWeT5aG2qCTyQxy550YaK2.iR1XUIc7FjhMl57O = 0;
                                nrAPIWeT5aG2qCTyQxy550YaK2.J1BE9tYH1em4X1uAhc6L7f4M = 6;
                                if (ihaoqto8vhfvet5tdipoegawokh.axL8FocTDLUdzg0XScbO(nrAPIWeT5aG2qCTyQxy550YaK2) != obj2) {
                                    ka8INCBqfwCeAoFT4mw74QJG = ihaoqto8vhfvet5tdipoegawokh;
                                    String str3 = authenticationResponse.S1zP5M3X7Ukq3ROlZ87G9I;
                                    nrAPIWeT5aG2qCTyQxy550YaK2.gsHzEVTj1SCIPR = null;
                                    nrAPIWeT5aG2qCTyQxy550YaK2.LcvPFGYKhAm4SS5FZ = null;
                                    nrAPIWeT5aG2qCTyQxy550YaK2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                                    nrAPIWeT5aG2qCTyQxy550YaK2.sCPtafveBAhdLIs2ajN3WV = null;
                                    nrAPIWeT5aG2qCTyQxy550YaK2.Mej0x2K4ZGSUxtYNka4QZ = null;
                                    nrAPIWeT5aG2qCTyQxy550YaK2.qTa7aqjjB9Bt6mc = null;
                                    nrAPIWeT5aG2qCTyQxy550YaK2.f2sXlW3st0rAKJwyOrCfOWc = ka8INCBqfwCeAoFT4mw74QJG;
                                    nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3 = z4;
                                    nrAPIWeT5aG2qCTyQxy550YaK2.iR1XUIc7FjhMl57O = i;
                                    nrAPIWeT5aG2qCTyQxy550YaK2.J1BE9tYH1em4X1uAhc6L7f4M = 7;
                                    objBezslBgjveK3hODH = Bk6w7oZjoWt9ZSRs4C7jIhbX3(str3, g7lapk01c8Qj9rz59i4, nrAPIWeT5aG2qCTyQxy550YaK2);
                                    if (objBezslBgjveK3hODH != obj2) {
                                        ka8INCBqfwCeAoFT4mw74QJG2 = ka8INCBqfwCeAoFT4mw74QJG;
                                        xwevoc3gqlsn1sxdt2gvno3hgucdx = (xWEvOc3gqLSn1SXDt2GvNO3HGucdx) objBezslBgjveK3hODH;
                                        ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                                        if (xwevoc3gqlsn1sxdt2gvno3hgucdx.axL8FocTDLUdzg0XScbO != null) {
                                            uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("Expected account to have an email address attached");
                                            return null;
                                        }
                                        sBV5EuS0mGuEYqc5nc5erhuwb1OG7(3, 1);
                                        aNONfmXWW0uqauI17bnoBjg anonfmxww0uqaui17bnobjg2 = J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion;
                                        GiFxY9WDHrWlHPyoti giFxY9WDHrWlHPyoti2 = new GiFxY9WDHrWlHPyoti(xwevoc3gqlsn1sxdt2gvno3hgucdx, xwevoc3gqlsn1sxdt2gvno3hgucdx.axL8FocTDLUdzg0XScbO);
                                        anonfmxww0uqaui17bnobjg2.getClass();
                                        return giFxY9WDHrWlHPyoti2;
                                    }
                                }
                            }
                        }
                    }
                }
                return obj2;
            case 2:
                z2 = nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3;
                uOdbn0BbqEbVKpITLTOKPLNI = nrAPIWeT5aG2qCTyQxy550YaK2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
                g7lapk01c8Qj9rz59i = nrAPIWeT5aG2qCTyQxy550YaK2.LcvPFGYKhAm4SS5FZ;
                wfio6q9fiuz1btk3 = nrAPIWeT5aG2qCTyQxy550YaK2.gsHzEVTj1SCIPR;
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objBezslBgjveK3hODH);
                obj = ((J7Tsg1eqTfbK8vIo4RFOyjPiu) objBezslBgjveK3hODH).S1zP5M3X7Ukq3ROlZ87G9I;
                thS1zP5M3X7Ukq3ROlZ87G9I = AeQuqug4cjWl3vY5CUaNGtJ0l.S1zP5M3X7Ukq3ROlZ87G9I(obj);
                if (thS1zP5M3X7Ukq3ROlZ87G9I != null) {
                    J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                    return new Rfp0CprLjJaYY8aiYk((GoogleAuthException) thS1zP5M3X7Ukq3ROlZ87G9I);
                }
                googleAuthClientSession = (GoogleAuthClientSession) obj;
                nrAPIWeT5aG2qCTyQxy550YaK2.gsHzEVTj1SCIPR = null;
                nrAPIWeT5aG2qCTyQxy550YaK2.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i;
                nrAPIWeT5aG2qCTyQxy550YaK2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = uOdbn0BbqEbVKpITLTOKPLNI;
                nrAPIWeT5aG2qCTyQxy550YaK2.sCPtafveBAhdLIs2ajN3WV = lJmIWKCOd33Br2;
                nrAPIWeT5aG2qCTyQxy550YaK2.Mej0x2K4ZGSUxtYNka4QZ = googleAuthClientSession;
                nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3 = z2;
                nrAPIWeT5aG2qCTyQxy550YaK2.J1BE9tYH1em4X1uAhc6L7f4M = 3;
                objS1zP5M3X7Ukq3ROlZ87G9I2 = wfio6q9fiuz1btk3.S1zP5M3X7Ukq3ROlZ87G9I(nrAPIWeT5aG2qCTyQxy550YaK2);
                if (objS1zP5M3X7Ukq3ROlZ87G9I2 != obj2) {
                    UOdbn0BbqEbVKpITLTOKPLNI uOdbn0BbqEbVKpITLTOKPLNI6 = uOdbn0BbqEbVKpITLTOKPLNI;
                    googleAuthClientSession2 = googleAuthClientSession;
                    objBezslBgjveK3hODH = objS1zP5M3X7Ukq3ROlZ87G9I2;
                    uOdbn0BbqEbVKpITLTOKPLNI2 = uOdbn0BbqEbVKpITLTOKPLNI6;
                    g7lapk01c8Qj9rz59i2 = g7lapk01c8Qj9rz59i;
                    lJmIWKCOd33Br = lJmIWKCOd33Br2;
                    nrAPIWeT5aG2qCTyQxy550YaK2.gsHzEVTj1SCIPR = null;
                    nrAPIWeT5aG2qCTyQxy550YaK2.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i2;
                    nrAPIWeT5aG2qCTyQxy550YaK2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = uOdbn0BbqEbVKpITLTOKPLNI2;
                    nrAPIWeT5aG2qCTyQxy550YaK2.sCPtafveBAhdLIs2ajN3WV = null;
                    nrAPIWeT5aG2qCTyQxy550YaK2.Mej0x2K4ZGSUxtYNka4QZ = null;
                    nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3 = z2;
                    nrAPIWeT5aG2qCTyQxy550YaK2.J1BE9tYH1em4X1uAhc6L7f4M = 4;
                    objBezslBgjveK3hODH = ((Iol76NSeORZn3oKb4C49HtqjkRhNL) lJmIWKCOd33Br).BezslBgjveK3hODH(googleAuthClientSession2, (Activity) objBezslBgjveK3hODH, nrAPIWeT5aG2qCTyQxy550YaK2);
                    if (objBezslBgjveK3hODH != obj2) {
                        z3 = z2;
                        uOdbn0BbqEbVKpITLTOKPLNI3 = uOdbn0BbqEbVKpITLTOKPLNI2;
                        g7lapk01c8Qj9rz59i3 = g7lapk01c8Qj9rz59i2;
                        sJcHSjzDzq3QX10c = (SJcHSjzDzq3QX10c) objBezslBgjveK3hODH;
                        pyaABL8uMuLgCjJcfM = sJcHSjzDzq3QX10c.S1zP5M3X7Ukq3ROlZ87G9I;
                        if (pyaABL8uMuLgCjJcfM == null) {
                            googleAuthException = sJcHSjzDzq3QX10c.axL8FocTDLUdzg0XScbO;
                            if (googleAuthException == null) {
                                throw new CancellationException("User cancelled Dialog or has no accounts available.");
                            }
                            J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                            return new Rfp0CprLjJaYY8aiYk(googleAuthException);
                        }
                        pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO = ((xSr1hPBbWjW) this.qTa7aqjjB9Bt6mc).axL8FocTDLUdzg0XScbO();
                        if (pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO != null) {
                            str = pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO.S1zP5M3X7Ukq3ROlZ87G9I;
                        } else {
                            str = null;
                        }
                        nrAPIWeT5aG2qCTyQxy550YaK2.gsHzEVTj1SCIPR = null;
                        nrAPIWeT5aG2qCTyQxy550YaK2.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i3;
                        nrAPIWeT5aG2qCTyQxy550YaK2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                        nrAPIWeT5aG2qCTyQxy550YaK2.sCPtafveBAhdLIs2ajN3WV = null;
                        nrAPIWeT5aG2qCTyQxy550YaK2.Mej0x2K4ZGSUxtYNka4QZ = null;
                        nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3 = z3;
                        nrAPIWeT5aG2qCTyQxy550YaK2.J1BE9tYH1em4X1uAhc6L7f4M = 5;
                        objZiNFA7KzVfc6 = ((Iol76NSeORZn3oKb4C49HtqjkRhNL) lJmIWKCOd33Br2).ziNFA7KzVfc6(uOdbn0BbqEbVKpITLTOKPLNI3, pyaABL8uMuLgCjJcfM, FzogU2bPCQtD6a1hMYB1kyti, str, z3, nrAPIWeT5aG2qCTyQxy550YaK2);
                        if (objZiNFA7KzVfc6 != obj2) {
                            g7lapk01c8Qj9rz59i4 = g7lapk01c8Qj9rz59i3;
                            z4 = z3;
                            thS1zP5M3X7Ukq3ROlZ87G9I2 = AeQuqug4cjWl3vY5CUaNGtJ0l.S1zP5M3X7Ukq3ROlZ87G9I(objZiNFA7KzVfc6);
                            if (thS1zP5M3X7Ukq3ROlZ87G9I2 == null) {
                                J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                                return new Rfp0CprLjJaYY8aiYk((GoogleAuthException) thS1zP5M3X7Ukq3ROlZ87G9I2);
                            }
                            authenticationResponse = (AuthenticationResponse) objZiNFA7KzVfc6;
                            nrAPIWeT5aG2qCTyQxy550YaK2.gsHzEVTj1SCIPR = null;
                            nrAPIWeT5aG2qCTyQxy550YaK2.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i4;
                            nrAPIWeT5aG2qCTyQxy550YaK2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                            nrAPIWeT5aG2qCTyQxy550YaK2.sCPtafveBAhdLIs2ajN3WV = null;
                            nrAPIWeT5aG2qCTyQxy550YaK2.Mej0x2K4ZGSUxtYNka4QZ = null;
                            nrAPIWeT5aG2qCTyQxy550YaK2.qTa7aqjjB9Bt6mc = authenticationResponse;
                            ihaoqto8vhfvet5tdipoegawokh = this.iR1XUIc7FjhMl57O;
                            nrAPIWeT5aG2qCTyQxy550YaK2.f2sXlW3st0rAKJwyOrCfOWc = ihaoqto8vhfvet5tdipoegawokh;
                            nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3 = z4;
                            i = 0;
                            nrAPIWeT5aG2qCTyQxy550YaK2.iR1XUIc7FjhMl57O = 0;
                            nrAPIWeT5aG2qCTyQxy550YaK2.J1BE9tYH1em4X1uAhc6L7f4M = 6;
                            if (ihaoqto8vhfvet5tdipoegawokh.axL8FocTDLUdzg0XScbO(nrAPIWeT5aG2qCTyQxy550YaK2) != obj2) {
                                ka8INCBqfwCeAoFT4mw74QJG = ihaoqto8vhfvet5tdipoegawokh;
                                String str4 = authenticationResponse.S1zP5M3X7Ukq3ROlZ87G9I;
                                nrAPIWeT5aG2qCTyQxy550YaK2.gsHzEVTj1SCIPR = null;
                                nrAPIWeT5aG2qCTyQxy550YaK2.LcvPFGYKhAm4SS5FZ = null;
                                nrAPIWeT5aG2qCTyQxy550YaK2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                                nrAPIWeT5aG2qCTyQxy550YaK2.sCPtafveBAhdLIs2ajN3WV = null;
                                nrAPIWeT5aG2qCTyQxy550YaK2.Mej0x2K4ZGSUxtYNka4QZ = null;
                                nrAPIWeT5aG2qCTyQxy550YaK2.qTa7aqjjB9Bt6mc = null;
                                nrAPIWeT5aG2qCTyQxy550YaK2.f2sXlW3st0rAKJwyOrCfOWc = ka8INCBqfwCeAoFT4mw74QJG;
                                nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3 = z4;
                                nrAPIWeT5aG2qCTyQxy550YaK2.iR1XUIc7FjhMl57O = i;
                                nrAPIWeT5aG2qCTyQxy550YaK2.J1BE9tYH1em4X1uAhc6L7f4M = 7;
                                objBezslBgjveK3hODH = Bk6w7oZjoWt9ZSRs4C7jIhbX3(str4, g7lapk01c8Qj9rz59i4, nrAPIWeT5aG2qCTyQxy550YaK2);
                                if (objBezslBgjveK3hODH != obj2) {
                                    ka8INCBqfwCeAoFT4mw74QJG2 = ka8INCBqfwCeAoFT4mw74QJG;
                                    xwevoc3gqlsn1sxdt2gvno3hgucdx = (xWEvOc3gqLSn1SXDt2GvNO3HGucdx) objBezslBgjveK3hODH;
                                    ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                                    if (xwevoc3gqlsn1sxdt2gvno3hgucdx.axL8FocTDLUdzg0XScbO != null) {
                                        uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("Expected account to have an email address attached");
                                        return null;
                                    }
                                    sBV5EuS0mGuEYqc5nc5erhuwb1OG7(3, 1);
                                    aNONfmXWW0uqauI17bnoBjg anonfmxww0uqaui17bnobjg3 = J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion;
                                    GiFxY9WDHrWlHPyoti giFxY9WDHrWlHPyoti3 = new GiFxY9WDHrWlHPyoti(xwevoc3gqlsn1sxdt2gvno3hgucdx, xwevoc3gqlsn1sxdt2gvno3hgucdx.axL8FocTDLUdzg0XScbO);
                                    anonfmxww0uqaui17bnobjg3.getClass();
                                    return giFxY9WDHrWlHPyoti3;
                                }
                            }
                        }
                    }
                }
                return obj2;
            case 3:
                z2 = nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3;
                googleAuthClientSession2 = nrAPIWeT5aG2qCTyQxy550YaK2.Mej0x2K4ZGSUxtYNka4QZ;
                lJmIWKCOd33Br = nrAPIWeT5aG2qCTyQxy550YaK2.sCPtafveBAhdLIs2ajN3WV;
                uOdbn0BbqEbVKpITLTOKPLNI2 = nrAPIWeT5aG2qCTyQxy550YaK2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
                g7lapk01c8Qj9rz59i2 = nrAPIWeT5aG2qCTyQxy550YaK2.LcvPFGYKhAm4SS5FZ;
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objBezslBgjveK3hODH);
                nrAPIWeT5aG2qCTyQxy550YaK2.gsHzEVTj1SCIPR = null;
                nrAPIWeT5aG2qCTyQxy550YaK2.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i2;
                nrAPIWeT5aG2qCTyQxy550YaK2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = uOdbn0BbqEbVKpITLTOKPLNI2;
                nrAPIWeT5aG2qCTyQxy550YaK2.sCPtafveBAhdLIs2ajN3WV = null;
                nrAPIWeT5aG2qCTyQxy550YaK2.Mej0x2K4ZGSUxtYNka4QZ = null;
                nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3 = z2;
                nrAPIWeT5aG2qCTyQxy550YaK2.J1BE9tYH1em4X1uAhc6L7f4M = 4;
                objBezslBgjveK3hODH = ((Iol76NSeORZn3oKb4C49HtqjkRhNL) lJmIWKCOd33Br).BezslBgjveK3hODH(googleAuthClientSession2, (Activity) objBezslBgjveK3hODH, nrAPIWeT5aG2qCTyQxy550YaK2);
                if (objBezslBgjveK3hODH != obj2) {
                    z3 = z2;
                    uOdbn0BbqEbVKpITLTOKPLNI3 = uOdbn0BbqEbVKpITLTOKPLNI2;
                    g7lapk01c8Qj9rz59i3 = g7lapk01c8Qj9rz59i2;
                    sJcHSjzDzq3QX10c = (SJcHSjzDzq3QX10c) objBezslBgjveK3hODH;
                    pyaABL8uMuLgCjJcfM = sJcHSjzDzq3QX10c.S1zP5M3X7Ukq3ROlZ87G9I;
                    if (pyaABL8uMuLgCjJcfM == null) {
                        googleAuthException = sJcHSjzDzq3QX10c.axL8FocTDLUdzg0XScbO;
                        if (googleAuthException == null) {
                            throw new CancellationException("User cancelled Dialog or has no accounts available.");
                        }
                        J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                        return new Rfp0CprLjJaYY8aiYk(googleAuthException);
                    }
                    pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO = ((xSr1hPBbWjW) this.qTa7aqjjB9Bt6mc).axL8FocTDLUdzg0XScbO();
                    if (pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO != null) {
                        str = pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO.S1zP5M3X7Ukq3ROlZ87G9I;
                    } else {
                        str = null;
                    }
                    nrAPIWeT5aG2qCTyQxy550YaK2.gsHzEVTj1SCIPR = null;
                    nrAPIWeT5aG2qCTyQxy550YaK2.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i3;
                    nrAPIWeT5aG2qCTyQxy550YaK2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                    nrAPIWeT5aG2qCTyQxy550YaK2.sCPtafveBAhdLIs2ajN3WV = null;
                    nrAPIWeT5aG2qCTyQxy550YaK2.Mej0x2K4ZGSUxtYNka4QZ = null;
                    nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3 = z3;
                    nrAPIWeT5aG2qCTyQxy550YaK2.J1BE9tYH1em4X1uAhc6L7f4M = 5;
                    objZiNFA7KzVfc6 = ((Iol76NSeORZn3oKb4C49HtqjkRhNL) lJmIWKCOd33Br2).ziNFA7KzVfc6(uOdbn0BbqEbVKpITLTOKPLNI3, pyaABL8uMuLgCjJcfM, FzogU2bPCQtD6a1hMYB1kyti, str, z3, nrAPIWeT5aG2qCTyQxy550YaK2);
                    if (objZiNFA7KzVfc6 != obj2) {
                        g7lapk01c8Qj9rz59i4 = g7lapk01c8Qj9rz59i3;
                        z4 = z3;
                        thS1zP5M3X7Ukq3ROlZ87G9I2 = AeQuqug4cjWl3vY5CUaNGtJ0l.S1zP5M3X7Ukq3ROlZ87G9I(objZiNFA7KzVfc6);
                        if (thS1zP5M3X7Ukq3ROlZ87G9I2 == null) {
                            J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                            return new Rfp0CprLjJaYY8aiYk((GoogleAuthException) thS1zP5M3X7Ukq3ROlZ87G9I2);
                        }
                        authenticationResponse = (AuthenticationResponse) objZiNFA7KzVfc6;
                        nrAPIWeT5aG2qCTyQxy550YaK2.gsHzEVTj1SCIPR = null;
                        nrAPIWeT5aG2qCTyQxy550YaK2.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i4;
                        nrAPIWeT5aG2qCTyQxy550YaK2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                        nrAPIWeT5aG2qCTyQxy550YaK2.sCPtafveBAhdLIs2ajN3WV = null;
                        nrAPIWeT5aG2qCTyQxy550YaK2.Mej0x2K4ZGSUxtYNka4QZ = null;
                        nrAPIWeT5aG2qCTyQxy550YaK2.qTa7aqjjB9Bt6mc = authenticationResponse;
                        ihaoqto8vhfvet5tdipoegawokh = this.iR1XUIc7FjhMl57O;
                        nrAPIWeT5aG2qCTyQxy550YaK2.f2sXlW3st0rAKJwyOrCfOWc = ihaoqto8vhfvet5tdipoegawokh;
                        nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3 = z4;
                        i = 0;
                        nrAPIWeT5aG2qCTyQxy550YaK2.iR1XUIc7FjhMl57O = 0;
                        nrAPIWeT5aG2qCTyQxy550YaK2.J1BE9tYH1em4X1uAhc6L7f4M = 6;
                        if (ihaoqto8vhfvet5tdipoegawokh.axL8FocTDLUdzg0XScbO(nrAPIWeT5aG2qCTyQxy550YaK2) != obj2) {
                            ka8INCBqfwCeAoFT4mw74QJG = ihaoqto8vhfvet5tdipoegawokh;
                            String str5 = authenticationResponse.S1zP5M3X7Ukq3ROlZ87G9I;
                            nrAPIWeT5aG2qCTyQxy550YaK2.gsHzEVTj1SCIPR = null;
                            nrAPIWeT5aG2qCTyQxy550YaK2.LcvPFGYKhAm4SS5FZ = null;
                            nrAPIWeT5aG2qCTyQxy550YaK2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                            nrAPIWeT5aG2qCTyQxy550YaK2.sCPtafveBAhdLIs2ajN3WV = null;
                            nrAPIWeT5aG2qCTyQxy550YaK2.Mej0x2K4ZGSUxtYNka4QZ = null;
                            nrAPIWeT5aG2qCTyQxy550YaK2.qTa7aqjjB9Bt6mc = null;
                            nrAPIWeT5aG2qCTyQxy550YaK2.f2sXlW3st0rAKJwyOrCfOWc = ka8INCBqfwCeAoFT4mw74QJG;
                            nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3 = z4;
                            nrAPIWeT5aG2qCTyQxy550YaK2.iR1XUIc7FjhMl57O = i;
                            nrAPIWeT5aG2qCTyQxy550YaK2.J1BE9tYH1em4X1uAhc6L7f4M = 7;
                            objBezslBgjveK3hODH = Bk6w7oZjoWt9ZSRs4C7jIhbX3(str5, g7lapk01c8Qj9rz59i4, nrAPIWeT5aG2qCTyQxy550YaK2);
                            if (objBezslBgjveK3hODH != obj2) {
                                ka8INCBqfwCeAoFT4mw74QJG2 = ka8INCBqfwCeAoFT4mw74QJG;
                                xwevoc3gqlsn1sxdt2gvno3hgucdx = (xWEvOc3gqLSn1SXDt2GvNO3HGucdx) objBezslBgjveK3hODH;
                                ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                                if (xwevoc3gqlsn1sxdt2gvno3hgucdx.axL8FocTDLUdzg0XScbO != null) {
                                    uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("Expected account to have an email address attached");
                                    return null;
                                }
                                sBV5EuS0mGuEYqc5nc5erhuwb1OG7(3, 1);
                                aNONfmXWW0uqauI17bnoBjg anonfmxww0uqaui17bnobjg4 = J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion;
                                GiFxY9WDHrWlHPyoti giFxY9WDHrWlHPyoti4 = new GiFxY9WDHrWlHPyoti(xwevoc3gqlsn1sxdt2gvno3hgucdx, xwevoc3gqlsn1sxdt2gvno3hgucdx.axL8FocTDLUdzg0XScbO);
                                anonfmxww0uqaui17bnobjg4.getClass();
                                return giFxY9WDHrWlHPyoti4;
                            }
                        }
                    }
                }
                return obj2;
            case 4:
                boolean z5 = nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3;
                uOdbn0BbqEbVKpITLTOKPLNI3 = nrAPIWeT5aG2qCTyQxy550YaK2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
                G7lapk01c8Qj9rz59i g7lapk01c8Qj9rz59i5 = nrAPIWeT5aG2qCTyQxy550YaK2.LcvPFGYKhAm4SS5FZ;
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objBezslBgjveK3hODH);
                z3 = z5;
                g7lapk01c8Qj9rz59i3 = g7lapk01c8Qj9rz59i5;
                sJcHSjzDzq3QX10c = (SJcHSjzDzq3QX10c) objBezslBgjveK3hODH;
                pyaABL8uMuLgCjJcfM = sJcHSjzDzq3QX10c.S1zP5M3X7Ukq3ROlZ87G9I;
                if (pyaABL8uMuLgCjJcfM == null) {
                    googleAuthException = sJcHSjzDzq3QX10c.axL8FocTDLUdzg0XScbO;
                    if (googleAuthException == null) {
                        throw new CancellationException("User cancelled Dialog or has no accounts available.");
                    }
                    J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                    return new Rfp0CprLjJaYY8aiYk(googleAuthException);
                }
                pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO = ((xSr1hPBbWjW) this.qTa7aqjjB9Bt6mc).axL8FocTDLUdzg0XScbO();
                if (pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO != null) {
                    str = pijs62hggngxq0xd0cxqAxL8FocTDLUdzg0XScbO.S1zP5M3X7Ukq3ROlZ87G9I;
                } else {
                    str = null;
                }
                nrAPIWeT5aG2qCTyQxy550YaK2.gsHzEVTj1SCIPR = null;
                nrAPIWeT5aG2qCTyQxy550YaK2.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i3;
                nrAPIWeT5aG2qCTyQxy550YaK2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                nrAPIWeT5aG2qCTyQxy550YaK2.sCPtafveBAhdLIs2ajN3WV = null;
                nrAPIWeT5aG2qCTyQxy550YaK2.Mej0x2K4ZGSUxtYNka4QZ = null;
                nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3 = z3;
                nrAPIWeT5aG2qCTyQxy550YaK2.J1BE9tYH1em4X1uAhc6L7f4M = 5;
                objZiNFA7KzVfc6 = ((Iol76NSeORZn3oKb4C49HtqjkRhNL) lJmIWKCOd33Br2).ziNFA7KzVfc6(uOdbn0BbqEbVKpITLTOKPLNI3, pyaABL8uMuLgCjJcfM, FzogU2bPCQtD6a1hMYB1kyti, str, z3, nrAPIWeT5aG2qCTyQxy550YaK2);
                if (objZiNFA7KzVfc6 != obj2) {
                    g7lapk01c8Qj9rz59i4 = g7lapk01c8Qj9rz59i3;
                    z4 = z3;
                    thS1zP5M3X7Ukq3ROlZ87G9I2 = AeQuqug4cjWl3vY5CUaNGtJ0l.S1zP5M3X7Ukq3ROlZ87G9I(objZiNFA7KzVfc6);
                    if (thS1zP5M3X7Ukq3ROlZ87G9I2 == null) {
                        J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                        return new Rfp0CprLjJaYY8aiYk((GoogleAuthException) thS1zP5M3X7Ukq3ROlZ87G9I2);
                    }
                    authenticationResponse = (AuthenticationResponse) objZiNFA7KzVfc6;
                    nrAPIWeT5aG2qCTyQxy550YaK2.gsHzEVTj1SCIPR = null;
                    nrAPIWeT5aG2qCTyQxy550YaK2.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i4;
                    nrAPIWeT5aG2qCTyQxy550YaK2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                    nrAPIWeT5aG2qCTyQxy550YaK2.sCPtafveBAhdLIs2ajN3WV = null;
                    nrAPIWeT5aG2qCTyQxy550YaK2.Mej0x2K4ZGSUxtYNka4QZ = null;
                    nrAPIWeT5aG2qCTyQxy550YaK2.qTa7aqjjB9Bt6mc = authenticationResponse;
                    ihaoqto8vhfvet5tdipoegawokh = this.iR1XUIc7FjhMl57O;
                    nrAPIWeT5aG2qCTyQxy550YaK2.f2sXlW3st0rAKJwyOrCfOWc = ihaoqto8vhfvet5tdipoegawokh;
                    nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3 = z4;
                    i = 0;
                    nrAPIWeT5aG2qCTyQxy550YaK2.iR1XUIc7FjhMl57O = 0;
                    nrAPIWeT5aG2qCTyQxy550YaK2.J1BE9tYH1em4X1uAhc6L7f4M = 6;
                    if (ihaoqto8vhfvet5tdipoegawokh.axL8FocTDLUdzg0XScbO(nrAPIWeT5aG2qCTyQxy550YaK2) != obj2) {
                        ka8INCBqfwCeAoFT4mw74QJG = ihaoqto8vhfvet5tdipoegawokh;
                        String str6 = authenticationResponse.S1zP5M3X7Ukq3ROlZ87G9I;
                        nrAPIWeT5aG2qCTyQxy550YaK2.gsHzEVTj1SCIPR = null;
                        nrAPIWeT5aG2qCTyQxy550YaK2.LcvPFGYKhAm4SS5FZ = null;
                        nrAPIWeT5aG2qCTyQxy550YaK2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                        nrAPIWeT5aG2qCTyQxy550YaK2.sCPtafveBAhdLIs2ajN3WV = null;
                        nrAPIWeT5aG2qCTyQxy550YaK2.Mej0x2K4ZGSUxtYNka4QZ = null;
                        nrAPIWeT5aG2qCTyQxy550YaK2.qTa7aqjjB9Bt6mc = null;
                        nrAPIWeT5aG2qCTyQxy550YaK2.f2sXlW3st0rAKJwyOrCfOWc = ka8INCBqfwCeAoFT4mw74QJG;
                        nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3 = z4;
                        nrAPIWeT5aG2qCTyQxy550YaK2.iR1XUIc7FjhMl57O = i;
                        nrAPIWeT5aG2qCTyQxy550YaK2.J1BE9tYH1em4X1uAhc6L7f4M = 7;
                        objBezslBgjveK3hODH = Bk6w7oZjoWt9ZSRs4C7jIhbX3(str6, g7lapk01c8Qj9rz59i4, nrAPIWeT5aG2qCTyQxy550YaK2);
                        if (objBezslBgjveK3hODH != obj2) {
                            ka8INCBqfwCeAoFT4mw74QJG2 = ka8INCBqfwCeAoFT4mw74QJG;
                            xwevoc3gqlsn1sxdt2gvno3hgucdx = (xWEvOc3gqLSn1SXDt2GvNO3HGucdx) objBezslBgjveK3hODH;
                            ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                            if (xwevoc3gqlsn1sxdt2gvno3hgucdx.axL8FocTDLUdzg0XScbO != null) {
                                uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("Expected account to have an email address attached");
                                return null;
                            }
                            sBV5EuS0mGuEYqc5nc5erhuwb1OG7(3, 1);
                            aNONfmXWW0uqauI17bnoBjg anonfmxww0uqaui17bnobjg5 = J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion;
                            GiFxY9WDHrWlHPyoti giFxY9WDHrWlHPyoti5 = new GiFxY9WDHrWlHPyoti(xwevoc3gqlsn1sxdt2gvno3hgucdx, xwevoc3gqlsn1sxdt2gvno3hgucdx.axL8FocTDLUdzg0XScbO);
                            anonfmxww0uqaui17bnobjg5.getClass();
                            return giFxY9WDHrWlHPyoti5;
                        }
                    }
                }
                return obj2;
            case 5:
                boolean z6 = nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3;
                G7lapk01c8Qj9rz59i g7lapk01c8Qj9rz59i6 = nrAPIWeT5aG2qCTyQxy550YaK2.LcvPFGYKhAm4SS5FZ;
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objBezslBgjveK3hODH);
                objZiNFA7KzVfc6 = ((J7Tsg1eqTfbK8vIo4RFOyjPiu) objBezslBgjveK3hODH).S1zP5M3X7Ukq3ROlZ87G9I;
                g7lapk01c8Qj9rz59i4 = g7lapk01c8Qj9rz59i6;
                z4 = z6;
                thS1zP5M3X7Ukq3ROlZ87G9I2 = AeQuqug4cjWl3vY5CUaNGtJ0l.S1zP5M3X7Ukq3ROlZ87G9I(objZiNFA7KzVfc6);
                if (thS1zP5M3X7Ukq3ROlZ87G9I2 == null) {
                    J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                    return new Rfp0CprLjJaYY8aiYk((GoogleAuthException) thS1zP5M3X7Ukq3ROlZ87G9I2);
                }
                authenticationResponse = (AuthenticationResponse) objZiNFA7KzVfc6;
                nrAPIWeT5aG2qCTyQxy550YaK2.gsHzEVTj1SCIPR = null;
                nrAPIWeT5aG2qCTyQxy550YaK2.LcvPFGYKhAm4SS5FZ = g7lapk01c8Qj9rz59i4;
                nrAPIWeT5aG2qCTyQxy550YaK2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                nrAPIWeT5aG2qCTyQxy550YaK2.sCPtafveBAhdLIs2ajN3WV = null;
                nrAPIWeT5aG2qCTyQxy550YaK2.Mej0x2K4ZGSUxtYNka4QZ = null;
                nrAPIWeT5aG2qCTyQxy550YaK2.qTa7aqjjB9Bt6mc = authenticationResponse;
                ihaoqto8vhfvet5tdipoegawokh = this.iR1XUIc7FjhMl57O;
                nrAPIWeT5aG2qCTyQxy550YaK2.f2sXlW3st0rAKJwyOrCfOWc = ihaoqto8vhfvet5tdipoegawokh;
                nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3 = z4;
                i = 0;
                nrAPIWeT5aG2qCTyQxy550YaK2.iR1XUIc7FjhMl57O = 0;
                nrAPIWeT5aG2qCTyQxy550YaK2.J1BE9tYH1em4X1uAhc6L7f4M = 6;
                if (ihaoqto8vhfvet5tdipoegawokh.axL8FocTDLUdzg0XScbO(nrAPIWeT5aG2qCTyQxy550YaK2) != obj2) {
                    ka8INCBqfwCeAoFT4mw74QJG = ihaoqto8vhfvet5tdipoegawokh;
                    String str7 = authenticationResponse.S1zP5M3X7Ukq3ROlZ87G9I;
                    nrAPIWeT5aG2qCTyQxy550YaK2.gsHzEVTj1SCIPR = null;
                    nrAPIWeT5aG2qCTyQxy550YaK2.LcvPFGYKhAm4SS5FZ = null;
                    nrAPIWeT5aG2qCTyQxy550YaK2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                    nrAPIWeT5aG2qCTyQxy550YaK2.sCPtafveBAhdLIs2ajN3WV = null;
                    nrAPIWeT5aG2qCTyQxy550YaK2.Mej0x2K4ZGSUxtYNka4QZ = null;
                    nrAPIWeT5aG2qCTyQxy550YaK2.qTa7aqjjB9Bt6mc = null;
                    nrAPIWeT5aG2qCTyQxy550YaK2.f2sXlW3st0rAKJwyOrCfOWc = ka8INCBqfwCeAoFT4mw74QJG;
                    nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3 = z4;
                    nrAPIWeT5aG2qCTyQxy550YaK2.iR1XUIc7FjhMl57O = i;
                    nrAPIWeT5aG2qCTyQxy550YaK2.J1BE9tYH1em4X1uAhc6L7f4M = 7;
                    objBezslBgjveK3hODH = Bk6w7oZjoWt9ZSRs4C7jIhbX3(str7, g7lapk01c8Qj9rz59i4, nrAPIWeT5aG2qCTyQxy550YaK2);
                    if (objBezslBgjveK3hODH != obj2) {
                        ka8INCBqfwCeAoFT4mw74QJG2 = ka8INCBqfwCeAoFT4mw74QJG;
                        xwevoc3gqlsn1sxdt2gvno3hgucdx = (xWEvOc3gqLSn1SXDt2GvNO3HGucdx) objBezslBgjveK3hODH;
                        ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                        if (xwevoc3gqlsn1sxdt2gvno3hgucdx.axL8FocTDLUdzg0XScbO != null) {
                            uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("Expected account to have an email address attached");
                            return null;
                        }
                        sBV5EuS0mGuEYqc5nc5erhuwb1OG7(3, 1);
                        aNONfmXWW0uqauI17bnoBjg anonfmxww0uqaui17bnobjg6 = J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion;
                        GiFxY9WDHrWlHPyoti giFxY9WDHrWlHPyoti6 = new GiFxY9WDHrWlHPyoti(xwevoc3gqlsn1sxdt2gvno3hgucdx, xwevoc3gqlsn1sxdt2gvno3hgucdx.axL8FocTDLUdzg0XScbO);
                        anonfmxww0uqaui17bnobjg6.getClass();
                        return giFxY9WDHrWlHPyoti6;
                    }
                }
                return obj2;
            case 6:
                i = nrAPIWeT5aG2qCTyQxy550YaK2.iR1XUIc7FjhMl57O;
                z4 = nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3;
                ka8INCBqfwCeAoFT4mw74QJG = nrAPIWeT5aG2qCTyQxy550YaK2.f2sXlW3st0rAKJwyOrCfOWc;
                authenticationResponse = nrAPIWeT5aG2qCTyQxy550YaK2.qTa7aqjjB9Bt6mc;
                g7lapk01c8Qj9rz59i4 = nrAPIWeT5aG2qCTyQxy550YaK2.LcvPFGYKhAm4SS5FZ;
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objBezslBgjveK3hODH);
                String str8 = authenticationResponse.S1zP5M3X7Ukq3ROlZ87G9I;
                nrAPIWeT5aG2qCTyQxy550YaK2.gsHzEVTj1SCIPR = null;
                nrAPIWeT5aG2qCTyQxy550YaK2.LcvPFGYKhAm4SS5FZ = null;
                nrAPIWeT5aG2qCTyQxy550YaK2.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = null;
                nrAPIWeT5aG2qCTyQxy550YaK2.sCPtafveBAhdLIs2ajN3WV = null;
                nrAPIWeT5aG2qCTyQxy550YaK2.Mej0x2K4ZGSUxtYNka4QZ = null;
                nrAPIWeT5aG2qCTyQxy550YaK2.qTa7aqjjB9Bt6mc = null;
                nrAPIWeT5aG2qCTyQxy550YaK2.f2sXlW3st0rAKJwyOrCfOWc = ka8INCBqfwCeAoFT4mw74QJG;
                nrAPIWeT5aG2qCTyQxy550YaK2.WIXlfFpvH7glAGsUk3 = z4;
                nrAPIWeT5aG2qCTyQxy550YaK2.iR1XUIc7FjhMl57O = i;
                nrAPIWeT5aG2qCTyQxy550YaK2.J1BE9tYH1em4X1uAhc6L7f4M = 7;
                objBezslBgjveK3hODH = Bk6w7oZjoWt9ZSRs4C7jIhbX3(str8, g7lapk01c8Qj9rz59i4, nrAPIWeT5aG2qCTyQxy550YaK2);
                if (objBezslBgjveK3hODH != obj2) {
                    ka8INCBqfwCeAoFT4mw74QJG2 = ka8INCBqfwCeAoFT4mw74QJG;
                    xwevoc3gqlsn1sxdt2gvno3hgucdx = (xWEvOc3gqLSn1SXDt2GvNO3HGucdx) objBezslBgjveK3hODH;
                    ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                    if (xwevoc3gqlsn1sxdt2gvno3hgucdx.axL8FocTDLUdzg0XScbO != null) {
                        uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("Expected account to have an email address attached");
                        return null;
                    }
                    sBV5EuS0mGuEYqc5nc5erhuwb1OG7(3, 1);
                    aNONfmXWW0uqauI17bnoBjg anonfmxww0uqaui17bnobjg7 = J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion;
                    GiFxY9WDHrWlHPyoti giFxY9WDHrWlHPyoti7 = new GiFxY9WDHrWlHPyoti(xwevoc3gqlsn1sxdt2gvno3hgucdx, xwevoc3gqlsn1sxdt2gvno3hgucdx.axL8FocTDLUdzg0XScbO);
                    anonfmxww0uqaui17bnobjg7.getClass();
                    return giFxY9WDHrWlHPyoti7;
                }
                return obj2;
            case 7:
                ka8INCBqfwCeAoFT4mw74QJG2 = nrAPIWeT5aG2qCTyQxy550YaK2.f2sXlW3st0rAKJwyOrCfOWc;
                try {
                    Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objBezslBgjveK3hODH);
                    xwevoc3gqlsn1sxdt2gvno3hgucdx = (xWEvOc3gqLSn1SXDt2GvNO3HGucdx) objBezslBgjveK3hODH;
                    ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                    if (xwevoc3gqlsn1sxdt2gvno3hgucdx.axL8FocTDLUdzg0XScbO != null) {
                        uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("Expected account to have an email address attached");
                        return null;
                    }
                    sBV5EuS0mGuEYqc5nc5erhuwb1OG7(3, 1);
                    aNONfmXWW0uqauI17bnoBjg anonfmxww0uqaui17bnobjg8 = J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion;
                    GiFxY9WDHrWlHPyoti giFxY9WDHrWlHPyoti8 = new GiFxY9WDHrWlHPyoti(xwevoc3gqlsn1sxdt2gvno3hgucdx, xwevoc3gqlsn1sxdt2gvno3hgucdx.axL8FocTDLUdzg0XScbO);
                    anonfmxww0uqaui17bnobjg8.getClass();
                    return giFxY9WDHrWlHPyoti8;
                } catch (Throwable th2) {
                    th = th2;
                    ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                    throw th;
                }
            default:
                uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public final Object WT8HZhEwPEkG(bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) {
        Iol76NSeORZn3oKb4C49HtqjkRhNL iol76NSeORZn3oKb4C49HtqjkRhNL = (Iol76NSeORZn3oKb4C49HtqjkRhNL) this.Mej0x2K4ZGSUxtYNka4QZ;
        Boolean boolS1zP5M3X7Ukq3ROlZ87G9I = iol76NSeORZn3oKb4C49HtqjkRhNL.BezslBgjveK3hODH.S1zP5M3X7Ukq3ROlZ87G9I("allow_sign_in_with_google");
        if (!(boolS1zP5M3X7Ukq3ROlZ87G9I != null ? boolS1zP5M3X7Ukq3ROlZ87G9I.booleanValue() : false)) {
            return Boolean.FALSE;
        }
        Context context = iol76NSeORZn3oKb4C49HtqjkRhNL.axL8FocTDLUdzg0XScbO;
        PeLieoBN4yxYJZju3kQtKIsq7XL8 peLieoBN4yxYJZju3kQtKIsq7XL8 = NMquq9o0FvRs5RyiTFrS.S1zP5M3X7Ukq3ROlZ87G9I;
        return rbpFGdpgDCAQXat.JY5knQmh7EQJEZ(x4PcPRPmslEJW.cCmbv8Tzd2QLd161ImIZUlZ8n, new gbloYmVPghjTo5(1, context, null), bmjzfecsuu6mdmsoqmyrlysv3oeeb);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object axL8FocTDLUdzg0XScbO(String str, String str2, bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) throws Throwable {
        AdoBuEHLsY adoBuEHLsY;
        int i;
        String str3;
        Ka8INCBqfwCeAoFT4mw74QJG ka8INCBqfwCeAoFT4mw74QJG;
        Ka8INCBqfwCeAoFT4mw74QJG ka8INCBqfwCeAoFT4mw74QJG2;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof AdoBuEHLsY) {
            adoBuEHLsY = (AdoBuEHLsY) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i2 = adoBuEHLsY.qTa7aqjjB9Bt6mc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                adoBuEHLsY.qTa7aqjjB9Bt6mc = i2 - Integer.MIN_VALUE;
            } else {
                adoBuEHLsY = new AdoBuEHLsY(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            adoBuEHLsY = new AdoBuEHLsY(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        Object objBezslBgjveK3hODH = adoBuEHLsY.sCPtafveBAhdLIs2ajN3WV;
        int i3 = adoBuEHLsY.qTa7aqjjB9Bt6mc;
        Object obj = tIDTjdoK38.GO8WUug7ZWFCUI1zY;
        try {
            if (i3 == 0) {
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objBezslBgjveK3hODH);
                adoBuEHLsY.WIXlfFpvH7glAGsUk3 = str;
                adoBuEHLsY.gsHzEVTj1SCIPR = str2;
                ihaOqtO8vhfVeT5tdIPOEGawOKH ihaoqto8vhfvet5tdipoegawokh = this.iR1XUIc7FjhMl57O;
                adoBuEHLsY.LcvPFGYKhAm4SS5FZ = ihaoqto8vhfvet5tdipoegawokh;
                i = 0;
                adoBuEHLsY.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = 0;
                adoBuEHLsY.qTa7aqjjB9Bt6mc = 1;
                if (ihaoqto8vhfvet5tdipoegawokh.axL8FocTDLUdzg0XScbO(adoBuEHLsY) != obj) {
                    str3 = str2;
                    ka8INCBqfwCeAoFT4mw74QJG = ihaoqto8vhfvet5tdipoegawokh;
                }
                return obj;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ka8INCBqfwCeAoFT4mw74QJG2 = adoBuEHLsY.LcvPFGYKhAm4SS5FZ;
                try {
                    Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objBezslBgjveK3hODH);
                    GiFxY9WDHrWlHPyoti giFxY9WDHrWlHPyoti = (GiFxY9WDHrWlHPyoti) objBezslBgjveK3hODH;
                    ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                    return giFxY9WDHrWlHPyoti;
                } catch (Throwable th) {
                    th = th;
                    ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                    throw th;
                }
            }
            int i4 = adoBuEHLsY.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
            ka8INCBqfwCeAoFT4mw74QJG = adoBuEHLsY.LcvPFGYKhAm4SS5FZ;
            String str4 = adoBuEHLsY.gsHzEVTj1SCIPR;
            String str5 = adoBuEHLsY.WIXlfFpvH7glAGsUk3;
            Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objBezslBgjveK3hODH);
            str3 = str4;
            i = i4;
            str = str5;
            adoBuEHLsY.WIXlfFpvH7glAGsUk3 = null;
            adoBuEHLsY.gsHzEVTj1SCIPR = null;
            adoBuEHLsY.LcvPFGYKhAm4SS5FZ = ka8INCBqfwCeAoFT4mw74QJG;
            adoBuEHLsY.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = i;
            adoBuEHLsY.qTa7aqjjB9Bt6mc = 2;
            objBezslBgjveK3hODH = BezslBgjveK3hODH(str, str3, adoBuEHLsY);
            if (objBezslBgjveK3hODH != obj) {
                ka8INCBqfwCeAoFT4mw74QJG2 = ka8INCBqfwCeAoFT4mw74QJG;
                GiFxY9WDHrWlHPyoti giFxY9WDHrWlHPyoti2 = (GiFxY9WDHrWlHPyoti) objBezslBgjveK3hODH;
                ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                return giFxY9WDHrWlHPyoti2;
            }
            return obj;
        } catch (Throwable th2) {
            th = th2;
            ka8INCBqfwCeAoFT4mw74QJG2 = ka8INCBqfwCeAoFT4mw74QJG;
            ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object cS9Klw57l26qfkpcMlfmpU(boolean z, bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) throws Throwable {
        DgVNcEV9XmhNPNS4qVNd dgVNcEV9XmhNPNS4qVNd;
        Ka8INCBqfwCeAoFT4mw74QJG ka8INCBqfwCeAoFT4mw74QJG;
        int i;
        Ka8INCBqfwCeAoFT4mw74QJG ka8INCBqfwCeAoFT4mw74QJG2;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof DgVNcEV9XmhNPNS4qVNd) {
            dgVNcEV9XmhNPNS4qVNd = (DgVNcEV9XmhNPNS4qVNd) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i2 = dgVNcEV9XmhNPNS4qVNd.Mej0x2K4ZGSUxtYNka4QZ;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dgVNcEV9XmhNPNS4qVNd.Mej0x2K4ZGSUxtYNka4QZ = i2 - Integer.MIN_VALUE;
            } else {
                dgVNcEV9XmhNPNS4qVNd = new DgVNcEV9XmhNPNS4qVNd(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            dgVNcEV9XmhNPNS4qVNd = new DgVNcEV9XmhNPNS4qVNd(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        Object obj = dgVNcEV9XmhNPNS4qVNd.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
        int i3 = dgVNcEV9XmhNPNS4qVNd.Mej0x2K4ZGSUxtYNka4QZ;
        Object obj2 = tIDTjdoK38.GO8WUug7ZWFCUI1zY;
        try {
            if (i3 == 0) {
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
                ka8INCBqfwCeAoFT4mw74QJG = this.iR1XUIc7FjhMl57O;
                dgVNcEV9XmhNPNS4qVNd.gsHzEVTj1SCIPR = ka8INCBqfwCeAoFT4mw74QJG;
                dgVNcEV9XmhNPNS4qVNd.WIXlfFpvH7glAGsUk3 = z;
                i = 0;
                dgVNcEV9XmhNPNS4qVNd.LcvPFGYKhAm4SS5FZ = 0;
                dgVNcEV9XmhNPNS4qVNd.Mej0x2K4ZGSUxtYNka4QZ = 1;
                if (ka8INCBqfwCeAoFT4mw74QJG.axL8FocTDLUdzg0XScbO(dgVNcEV9XmhNPNS4qVNd) != obj2) {
                }
                return obj2;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ka8INCBqfwCeAoFT4mw74QJG2 = dgVNcEV9XmhNPNS4qVNd.gsHzEVTj1SCIPR;
                try {
                    Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
                    ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                    return s9XnN7QTAJ.S1zP5M3X7Ukq3ROlZ87G9I;
                } catch (Throwable th) {
                    th = th;
                    ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                    throw th;
                }
            }
            int i4 = dgVNcEV9XmhNPNS4qVNd.LcvPFGYKhAm4SS5FZ;
            boolean z2 = dgVNcEV9XmhNPNS4qVNd.WIXlfFpvH7glAGsUk3;
            Ka8INCBqfwCeAoFT4mw74QJG ka8INCBqfwCeAoFT4mw74QJG3 = dgVNcEV9XmhNPNS4qVNd.gsHzEVTj1SCIPR;
            Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
            i = i4;
            z = z2;
            ka8INCBqfwCeAoFT4mw74QJG = ka8INCBqfwCeAoFT4mw74QJG3;
            dgVNcEV9XmhNPNS4qVNd.gsHzEVTj1SCIPR = ka8INCBqfwCeAoFT4mw74QJG;
            dgVNcEV9XmhNPNS4qVNd.WIXlfFpvH7glAGsUk3 = z;
            dgVNcEV9XmhNPNS4qVNd.LcvPFGYKhAm4SS5FZ = i;
            dgVNcEV9XmhNPNS4qVNd.Mej0x2K4ZGSUxtYNka4QZ = 2;
            if (JPYjB0bzUqKR(z, dgVNcEV9XmhNPNS4qVNd) != obj2) {
                ka8INCBqfwCeAoFT4mw74QJG2 = ka8INCBqfwCeAoFT4mw74QJG;
                ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                return s9XnN7QTAJ.S1zP5M3X7Ukq3ROlZ87G9I;
            }
            return obj2;
        } catch (Throwable th2) {
            th = th2;
            ka8INCBqfwCeAoFT4mw74QJG2 = ka8INCBqfwCeAoFT4mw74QJG;
            ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object caTQCiA8tNnV(bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) {
        tgMet9jM9GcEKx69Vk37kbMAN tgmet9jm9gcekx69vk37kbman;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof tgMet9jM9GcEKx69Vk37kbMAN) {
            tgmet9jm9gcekx69vk37kbman = (tgMet9jM9GcEKx69Vk37kbMAN) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i = tgmet9jm9gcekx69vk37kbman.LcvPFGYKhAm4SS5FZ;
            if ((i & Integer.MIN_VALUE) != 0) {
                tgmet9jm9gcekx69vk37kbman.LcvPFGYKhAm4SS5FZ = i - Integer.MIN_VALUE;
            } else {
                tgmet9jm9gcekx69vk37kbman = new tgMet9jM9GcEKx69Vk37kbMAN(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            tgmet9jm9gcekx69vk37kbman = new tgMet9jM9GcEKx69Vk37kbMAN(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        Object obj = tgmet9jm9gcekx69vk37kbman.WIXlfFpvH7glAGsUk3;
        int i2 = tgmet9jm9gcekx69vk37kbman.LcvPFGYKhAm4SS5FZ;
        if (i2 != 0) {
            if (i2 == 1) {
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
                return ((J7Tsg1eqTfbK8vIo4RFOyjPiu) obj).S1zP5M3X7Ukq3ROlZ87G9I;
            }
            uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
        xWEvOc3gqLSn1SXDt2GvNO3HGucdx.Companion.getClass();
        Long lAboow6rUrcY2SrFRa46C6uy = this.cCmbv8Tzd2QLd161ImIZUlZ8n.Aboow6rUrcY2SrFRa46C6uy("niagarald_jwt_refresh_interval");
        long jLongValue = lAboow6rUrcY2SrFRa46C6uy != null ? lAboow6rUrcY2SrFRa46C6uy.longValue() : 86400000L;
        jeiWptqnGk3ia jeiwptqngk3ia = new jeiWptqnGk3ia(2, 10);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ExfviZSyLb6NqRatU exfviZSyLb6NqRatU = new ExfviZSyLb6NqRatU(RefreshNiagaraldUserDataWorker.class, jLongValue, timeUnit);
        exfviZSyLb6NqRatU.ox9eclwMpRd(jLongValue, timeUnit);
        exfviZSyLb6NqRatU.Aboow6rUrcY2SrFRa46C6uy(jeiwptqngk3ia);
        exfviZSyLb6NqRatU.ziNFA7KzVfc6(1L, TimeUnit.HOURS);
        bwfdobG5WIUWeudrECajr bwfdobg5wiuweudrecajr = (bwfdobG5WIUWeudrECajr) exfviZSyLb6NqRatU.S1zP5M3X7Ukq3ROlZ87G9I();
        tgmet9jm9gcekx69vk37kbman.LcvPFGYKhAm4SS5FZ = 1;
        Object objPQQPeCDD0JLCT3aLz = ((lGu4hbqDeY14JtrULY2Bza9Y) this.sCPtafveBAhdLIs2ajN3WV).PQQPeCDD0JLCT3aLz(zvrDNoSsQjNXqoxr.NIAGARALD_USER_DATA_REFRESH, bwfdobg5wiuweudrecajr, gv5ryUbldVFoNt.Rdzg08aYlt0UsoLUNug9cESzgAY9R, tgmet9jm9gcekx69vk37kbman);
        tIDTjdoK38 tidtjdok38 = tIDTjdoK38.GO8WUug7ZWFCUI1zY;
        return objPQQPeCDD0JLCT3aLz == tidtjdok38 ? tidtjdok38 : objPQQPeCDD0JLCT3aLz;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fXBtMGfTIjGSHgK542(bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) throws Throwable {
        w7Rv7Ji0PyiNFA0okBo59Ev1J w7rv7ji0pyinfa0okbo59ev1j;
        Ka8INCBqfwCeAoFT4mw74QJG ka8INCBqfwCeAoFT4mw74QJG;
        int i;
        Throwable th;
        Ka8INCBqfwCeAoFT4mw74QJG ka8INCBqfwCeAoFT4mw74QJG2;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof w7Rv7Ji0PyiNFA0okBo59Ev1J) {
            w7rv7ji0pyinfa0okbo59ev1j = (w7Rv7Ji0PyiNFA0okBo59Ev1J) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i2 = w7rv7ji0pyinfa0okbo59ev1j.sCPtafveBAhdLIs2ajN3WV;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w7rv7ji0pyinfa0okbo59ev1j.sCPtafveBAhdLIs2ajN3WV = i2 - Integer.MIN_VALUE;
            } else {
                w7rv7ji0pyinfa0okbo59ev1j = new w7Rv7Ji0PyiNFA0okBo59Ev1J(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            w7rv7ji0pyinfa0okbo59ev1j = new w7Rv7Ji0PyiNFA0okBo59Ev1J(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        Object obj = w7rv7ji0pyinfa0okbo59ev1j.LcvPFGYKhAm4SS5FZ;
        int i3 = w7rv7ji0pyinfa0okbo59ev1j.sCPtafveBAhdLIs2ajN3WV;
        Object obj2 = tIDTjdoK38.GO8WUug7ZWFCUI1zY;
        try {
            if (i3 == 0) {
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
                ka8INCBqfwCeAoFT4mw74QJG = this.iR1XUIc7FjhMl57O;
                w7rv7ji0pyinfa0okbo59ev1j.WIXlfFpvH7glAGsUk3 = ka8INCBqfwCeAoFT4mw74QJG;
                i = 0;
                w7rv7ji0pyinfa0okbo59ev1j.gsHzEVTj1SCIPR = 0;
                w7rv7ji0pyinfa0okbo59ev1j.sCPtafveBAhdLIs2ajN3WV = 1;
                if (ka8INCBqfwCeAoFT4mw74QJG.axL8FocTDLUdzg0XScbO(w7rv7ji0pyinfa0okbo59ev1j) != obj2) {
                }
                return obj2;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ka8INCBqfwCeAoFT4mw74QJG2 = w7rv7ji0pyinfa0okbo59ev1j.WIXlfFpvH7glAGsUk3;
                try {
                    Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
                    ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                    return s9XnN7QTAJ.S1zP5M3X7Ukq3ROlZ87G9I;
                } catch (Throwable th2) {
                    th = th2;
                    ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                    throw th;
                }
            }
            i = w7rv7ji0pyinfa0okbo59ev1j.gsHzEVTj1SCIPR;
            Ka8INCBqfwCeAoFT4mw74QJG ka8INCBqfwCeAoFT4mw74QJG3 = w7rv7ji0pyinfa0okbo59ev1j.WIXlfFpvH7glAGsUk3;
            Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
            ka8INCBqfwCeAoFT4mw74QJG = ka8INCBqfwCeAoFT4mw74QJG3;
            w7rv7ji0pyinfa0okbo59ev1j.WIXlfFpvH7glAGsUk3 = ka8INCBqfwCeAoFT4mw74QJG;
            w7rv7ji0pyinfa0okbo59ev1j.gsHzEVTj1SCIPR = i;
            w7rv7ji0pyinfa0okbo59ev1j.sCPtafveBAhdLIs2ajN3WV = 2;
            if (ToEIy0qfkltfGfO3vmAQG(w7rv7ji0pyinfa0okbo59ev1j) != obj2) {
                ka8INCBqfwCeAoFT4mw74QJG2 = ka8INCBqfwCeAoFT4mw74QJG;
                ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                return s9XnN7QTAJ.S1zP5M3X7Ukq3ROlZ87G9I;
            }
            return obj2;
        } catch (Throwable th3) {
            Ka8INCBqfwCeAoFT4mw74QJG ka8INCBqfwCeAoFT4mw74QJG4 = ka8INCBqfwCeAoFT4mw74QJG;
            th = th3;
            ka8INCBqfwCeAoFT4mw74QJG2 = ka8INCBqfwCeAoFT4mw74QJG4;
            ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
            throw th;
        }
    }

    public final Object flPMk2Ix9h3b95v(String str, boolean z, CJMcI4a6x01TSJBmvdZtLpc cJMcI4a6x01TSJBmvdZtLpc) throws Throwable {
        ArrayList arrayListS1zP5M3X7Ukq3ROlZ87G9I = hXkXXj9pcUCh.S1zP5M3X7Ukq3ROlZ87G9I(this.WIXlfFpvH7glAGsUk3.getResources().getConfiguration().getLocales());
        boolean zIsEmpty = arrayListS1zP5M3X7Ukq3ROlZ87G9I.isEmpty();
        List listSingletonList = arrayListS1zP5M3X7Ukq3ROlZ87G9I;
        if (zIsEmpty) {
            listSingletonList = Collections.singletonList(Locale.ENGLISH);
        }
        List list = listSingletonList;
        String strAxL8FocTDLUdzg0XScbO = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R.axL8FocTDLUdzg0XScbO(EmailSignInRequestDetails.Companion.serializer(), new EmailSignInRequestDetails(str, System.currentTimeMillis()));
        SharedPreferences.Editor editorEdit = this.gsHzEVTj1SCIPR.edit();
        editorEdit.putString("bitpit.launcher.key.EMAIL_SIGN_IN_REQUEST_DETAILS", strAxL8FocTDLUdzg0XScbO);
        editorEdit.apply();
        PeLieoBN4yxYJZju3kQtKIsq7XL8 peLieoBN4yxYJZju3kQtKIsq7XL8 = NMquq9o0FvRs5RyiTFrS.S1zP5M3X7Ukq3ROlZ87G9I;
        Object objJY5knQmh7EQJEZ = rbpFGdpgDCAQXat.JY5knQmh7EQJEZ(x4PcPRPmslEJW.cCmbv8Tzd2QLd161ImIZUlZ8n, new Bul0eKPbYgOsdDtCanEKYj20(this, str, list, z, null), cJMcI4a6x01TSJBmvdZtLpc);
        return objJY5knQmh7EQJEZ == tIDTjdoK38.GO8WUug7ZWFCUI1zY ? objJY5knQmh7EQJEZ : s9XnN7QTAJ.S1zP5M3X7Ukq3ROlZ87G9I;
    }

    @Override // b.mkeB609Q34mPahD
    public final void ox9eclwMpRd(Intent intent, String str) {
        if ((str.equals("android.intent.action.DATE_CHANGED") || str.equals("android.intent.action.TIME_SET")) && JY5knQmh7EQJEZ().BezslBgjveK3hODH) {
            rbpFGdpgDCAQXat.ziNFA7KzVfc6(this.GO8WUug7ZWFCUI1zY, null, 0, new T6IajJ3vOYOMX8I8(this, null, 2), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object ziNFA7KzVfc6(bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) throws Throwable {
        gMyMutkofs gmymutkofs;
        Ka8INCBqfwCeAoFT4mw74QJG ka8INCBqfwCeAoFT4mw74QJG;
        int i;
        Throwable th;
        Ka8INCBqfwCeAoFT4mw74QJG ka8INCBqfwCeAoFT4mw74QJG2;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof gMyMutkofs) {
            gmymutkofs = (gMyMutkofs) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i2 = gmymutkofs.sCPtafveBAhdLIs2ajN3WV;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gmymutkofs.sCPtafveBAhdLIs2ajN3WV = i2 - Integer.MIN_VALUE;
            } else {
                gmymutkofs = new gMyMutkofs(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            gmymutkofs = new gMyMutkofs(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        Object obj = gmymutkofs.LcvPFGYKhAm4SS5FZ;
        int i3 = gmymutkofs.sCPtafveBAhdLIs2ajN3WV;
        Object obj2 = tIDTjdoK38.GO8WUug7ZWFCUI1zY;
        try {
            if (i3 == 0) {
                Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
                ka8INCBqfwCeAoFT4mw74QJG = this.iR1XUIc7FjhMl57O;
                gmymutkofs.WIXlfFpvH7glAGsUk3 = ka8INCBqfwCeAoFT4mw74QJG;
                i = 0;
                gmymutkofs.gsHzEVTj1SCIPR = 0;
                gmymutkofs.sCPtafveBAhdLIs2ajN3WV = 1;
                if (ka8INCBqfwCeAoFT4mw74QJG.axL8FocTDLUdzg0XScbO(gmymutkofs) != obj2) {
                }
                return obj2;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ka8INCBqfwCeAoFT4mw74QJG2 = gmymutkofs.WIXlfFpvH7glAGsUk3;
                try {
                    Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
                    ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                    return s9XnN7QTAJ.S1zP5M3X7Ukq3ROlZ87G9I;
                } catch (Throwable th2) {
                    th = th2;
                    ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                    throw th;
                }
            }
            i = gmymutkofs.gsHzEVTj1SCIPR;
            Ka8INCBqfwCeAoFT4mw74QJG ka8INCBqfwCeAoFT4mw74QJG3 = gmymutkofs.WIXlfFpvH7glAGsUk3;
            Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
            ka8INCBqfwCeAoFT4mw74QJG = ka8INCBqfwCeAoFT4mw74QJG3;
            gmymutkofs.WIXlfFpvH7glAGsUk3 = ka8INCBqfwCeAoFT4mw74QJG;
            gmymutkofs.gsHzEVTj1SCIPR = i;
            gmymutkofs.sCPtafveBAhdLIs2ajN3WV = 2;
            if (Aboow6rUrcY2SrFRa46C6uy(gmymutkofs) != obj2) {
                ka8INCBqfwCeAoFT4mw74QJG2 = ka8INCBqfwCeAoFT4mw74QJG;
                ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
                return s9XnN7QTAJ.S1zP5M3X7Ukq3ROlZ87G9I;
            }
            return obj2;
        } catch (Throwable th3) {
            Ka8INCBqfwCeAoFT4mw74QJG ka8INCBqfwCeAoFT4mw74QJG4 = ka8INCBqfwCeAoFT4mw74QJG;
            th = th3;
            ka8INCBqfwCeAoFT4mw74QJG2 = ka8INCBqfwCeAoFT4mw74QJG4;
            ka8INCBqfwCeAoFT4mw74QJG2.JY5knQmh7EQJEZ(null);
            throw th;
        }
    }
}
