package bitpit.launcher.play_store;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import b.Bjb9YDfmSZis4LSw34qZCfHQhQ4;
import b.C0Lcl8TLIqtjid1OKj1tuGqaVk;
import b.DGkltVqph8879qbu2WnQHzOk;
import b.Emi5d0VyYZLZtm;
import b.Hnv6Te9rrTA0VqZMo;
import b.LBlveSXMqXZPlHvd1p7x2pK0;
import b.LpRXf8zsxndinAW3;
import b.ScJENg2agTkUXoVRQ;
import b.YxrFo5RpmIrw2P77;
import b.bMjZFECsuU6MdmSOqmYrlYsV3oEeB;
import b.fl8FVjtg7xNlpXEVV9;
import b.hsCekn50u6ss8LE0LvKqB4b8QGs2I;
import b.jtmhquXyO9e;
import b.oc1WFILq84tcWjkVT;
import b.tIDTjdoK38;
import b.uuyTGGFjNDiF1SxHW;
import b.vQiHTsvbC98wKH;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes.dex */
public final class NniqwgLR9Jo6Bl9Px0S5u implements fl8FVjtg7xNlpXEVV9 {
    public final SharedPreferences BezslBgjveK3hODH;
    public final Context S1zP5M3X7Ukq3ROlZ87G9I;
    public final LpRXf8zsxndinAW3 axL8FocTDLUdzg0XScbO;

    public NniqwgLR9Jo6Bl9Px0S5u(Context context, LpRXf8zsxndinAW3 lpRXf8zsxndinAW3, SharedPreferences sharedPreferences) {
        this.S1zP5M3X7Ukq3ROlZ87G9I = context;
        this.axL8FocTDLUdzg0XScbO = lpRXf8zsxndinAW3;
        this.BezslBgjveK3hODH = sharedPreferences;
    }

    public static LinkedHashMap S1zP5M3X7Ukq3ROlZ87G9I(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str2 : jtmhquXyO9e.cVfIGUKLEqID1HH(str, new String[]{"&"})) {
            int iWIXlfFpvH7glAGsUk3 = jtmhquXyO9e.WIXlfFpvH7glAGsUk3(str2, "=", 0, false, 6);
            if (iWIXlfFpvH7glAGsUk3 == -1) {
                Emi5d0VyYZLZtm.Aboow6rUrcY2SrFRa46C6uy(new IndexOutOfBoundsException("Invalid referer query: ".concat(str)));
            } else {
                linkedHashMap.put(URLDecoder.decode(str2.substring(0, iWIXlfFpvH7glAGsUk3), "UTF-8"), URLDecoder.decode(str2.substring(iWIXlfFpvH7glAGsUk3 + 1), "UTF-8"));
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0106  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object BezslBgjveK3hODH(bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) {
        DGkltVqph8879qbu2WnQHzOk dGkltVqph8879qbu2WnQHzOk;
        ServiceInfo serviceInfo;
        YxrFo5RpmIrw2P77 yxrFo5RpmIrw2P77;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof DGkltVqph8879qbu2WnQHzOk) {
            dGkltVqph8879qbu2WnQHzOk = (DGkltVqph8879qbu2WnQHzOk) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i = dGkltVqph8879qbu2WnQHzOk.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
            if ((i & Integer.MIN_VALUE) != 0) {
                dGkltVqph8879qbu2WnQHzOk.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = i - Integer.MIN_VALUE;
            } else {
                dGkltVqph8879qbu2WnQHzOk = new DGkltVqph8879qbu2WnQHzOk(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            dGkltVqph8879qbu2WnQHzOk = new DGkltVqph8879qbu2WnQHzOk(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        Object obj = dGkltVqph8879qbu2WnQHzOk.gsHzEVTj1SCIPR;
        int i2 = dGkltVqph8879qbu2WnQHzOk.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
        if (i2 == 0) {
            Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
            YxrFo5RpmIrw2P77 yxrFo5RpmIrw2P78 = new YxrFo5RpmIrw2P77();
            yxrFo5RpmIrw2P78.S1zP5M3X7Ukq3ROlZ87G9I = 0;
            yxrFo5RpmIrw2P78.axL8FocTDLUdzg0XScbO = this.S1zP5M3X7Ukq3ROlZ87G9I.getApplicationContext();
            dGkltVqph8879qbu2WnQHzOk.WIXlfFpvH7glAGsUk3 = yxrFo5RpmIrw2P78;
            dGkltVqph8879qbu2WnQHzOk.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = 1;
            hsCekn50u6ss8LE0LvKqB4b8QGs2I hscekn50u6ss8le0lvkqb4b8qgs2i = new hsCekn50u6ss8LE0LvKqB4b8QGs2I(1, C0Lcl8TLIqtjid1OKj1tuGqaVk.axL8FocTDLUdzg0XScbO(dGkltVqph8879qbu2WnQHzOk));
            hscekn50u6ss8le0lvkqb4b8qgs2i.UV6K6VDbgDgzpi12QAEKN4Emq();
            vQiHTsvbC98wKH vqihtsvbc98wkh = new vQiHTsvbC98wKH();
            vqihtsvbc98wkh.GO8WUug7ZWFCUI1zY = yxrFo5RpmIrw2P78;
            vqihtsvbc98wkh.Rdzg08aYlt0UsoLUNug9cESzgAY9R = hscekn50u6ss8le0lvkqb4b8qgs2i;
            Context context = (Context) yxrFo5RpmIrw2P78.axL8FocTDLUdzg0XScbO;
            int i3 = yxrFo5RpmIrw2P78.S1zP5M3X7Ukq3ROlZ87G9I;
            if (i3 == 2 && ((LBlveSXMqXZPlHvd1p7x2pK0) yxrFo5RpmIrw2P78.BezslBgjveK3hODH) != null && ((Bjb9YDfmSZis4LSw34qZCfHQhQ4) yxrFo5RpmIrw2P78.ziNFA7KzVfc6) != null) {
                Log.isLoggable("InstallReferrerClient", 2);
                vqihtsvbc98wkh.flPMk2Ix9h3b95v(0);
            } else if (i3 == 1 || i3 == 3) {
                Log.isLoggable("InstallReferrerClient", 5);
                vqihtsvbc98wkh.flPMk2Ix9h3b95v(3);
            } else {
                Log.isLoggable("InstallReferrerClient", 2);
                Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                if (listQueryIntentServices == null || listQueryIntentServices.isEmpty() || (serviceInfo = listQueryIntentServices.get(0).serviceInfo) == null) {
                    yxrFo5RpmIrw2P78.S1zP5M3X7Ukq3ROlZ87G9I = 0;
                    Log.isLoggable("InstallReferrerClient", 2);
                    vqihtsvbc98wkh.flPMk2Ix9h3b95v(2);
                } else {
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    if (!"com.android.vending".equals(str) || str2 == null) {
                        Log.isLoggable("InstallReferrerClient", 5);
                        yxrFo5RpmIrw2P78.S1zP5M3X7Ukq3ROlZ87G9I = 0;
                        vqihtsvbc98wkh.flPMk2Ix9h3b95v(2);
                    } else {
                        try {
                            if (context.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                                Intent intent2 = new Intent(intent);
                                Bjb9YDfmSZis4LSw34qZCfHQhQ4 bjb9YDfmSZis4LSw34qZCfHQhQ4 = new Bjb9YDfmSZis4LSw34qZCfHQhQ4(yxrFo5RpmIrw2P78, vqihtsvbc98wkh);
                                yxrFo5RpmIrw2P78.ziNFA7KzVfc6 = bjb9YDfmSZis4LSw34qZCfHQhQ4;
                                try {
                                    if (context.bindService(intent2, bjb9YDfmSZis4LSw34qZCfHQhQ4, 1)) {
                                        Log.isLoggable("InstallReferrerClient", 2);
                                    } else {
                                        Log.isLoggable("InstallReferrerClient", 5);
                                        yxrFo5RpmIrw2P78.S1zP5M3X7Ukq3ROlZ87G9I = 0;
                                        vqihtsvbc98wkh.flPMk2Ix9h3b95v(1);
                                    }
                                } catch (SecurityException unused) {
                                    Log.isLoggable("InstallReferrerClient", 5);
                                    yxrFo5RpmIrw2P78.S1zP5M3X7Ukq3ROlZ87G9I = 0;
                                    vqihtsvbc98wkh.flPMk2Ix9h3b95v(4);
                                }
                            } else {
                                Log.isLoggable("InstallReferrerClient", 5);
                                yxrFo5RpmIrw2P78.S1zP5M3X7Ukq3ROlZ87G9I = 0;
                                vqihtsvbc98wkh.flPMk2Ix9h3b95v(2);
                            }
                        } catch (PackageManager.NameNotFoundException unused2) {
                        }
                    }
                }
            }
            hscekn50u6ss8le0lvkqb4b8qgs2i.cCmbv8Tzd2QLd161ImIZUlZ8n(new oc1WFILq84tcWjkVT(7, yxrFo5RpmIrw2P78));
            Object objBk6w7oZjoWt9ZSRs4C7jIhbX3 = hscekn50u6ss8le0lvkqb4b8qgs2i.Bk6w7oZjoWt9ZSRs4C7jIhbX3();
            tIDTjdoK38 tidtjdok38 = tIDTjdoK38.GO8WUug7ZWFCUI1zY;
            if (objBk6w7oZjoWt9ZSRs4C7jIhbX3 == tidtjdok38) {
                return tidtjdok38;
            }
            obj = objBk6w7oZjoWt9ZSRs4C7jIhbX3;
            yxrFo5RpmIrw2P77 = yxrFo5RpmIrw2P78;
        } else {
            if (i2 != 1) {
                uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yxrFo5RpmIrw2P77 = dGkltVqph8879qbu2WnQHzOk.WIXlfFpvH7glAGsUk3;
            Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
        }
        ReferrerDetails referrerDetails = (ReferrerDetails) obj;
        yxrFo5RpmIrw2P77.S1zP5M3X7Ukq3ROlZ87G9I = 3;
        if (((Bjb9YDfmSZis4LSw34qZCfHQhQ4) yxrFo5RpmIrw2P77.ziNFA7KzVfc6) != null) {
            Log.isLoggable("InstallReferrerClient", 2);
            ((Context) yxrFo5RpmIrw2P77.axL8FocTDLUdzg0XScbO).unbindService((Bjb9YDfmSZis4LSw34qZCfHQhQ4) yxrFo5RpmIrw2P77.ziNFA7KzVfc6);
            yxrFo5RpmIrw2P77.ziNFA7KzVfc6 = null;
        }
        yxrFo5RpmIrw2P77.BezslBgjveK3hODH = null;
        return referrerDetails;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object axL8FocTDLUdzg0XScbO(bMjZFECsuU6MdmSOqmYrlYsV3oEeB bmjzfecsuu6mdmsoqmyrlysv3oeeb) {
        ScJENg2agTkUXoVRQ scJENg2agTkUXoVRQ;
        if (bmjzfecsuu6mdmsoqmyrlysv3oeeb instanceof ScJENg2agTkUXoVRQ) {
            scJENg2agTkUXoVRQ = (ScJENg2agTkUXoVRQ) bmjzfecsuu6mdmsoqmyrlysv3oeeb;
            int i = scJENg2agTkUXoVRQ.LcvPFGYKhAm4SS5FZ;
            if ((i & Integer.MIN_VALUE) != 0) {
                scJENg2agTkUXoVRQ.LcvPFGYKhAm4SS5FZ = i - Integer.MIN_VALUE;
            } else {
                scJENg2agTkUXoVRQ = new ScJENg2agTkUXoVRQ(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
            }
        } else {
            scJENg2agTkUXoVRQ = new ScJENg2agTkUXoVRQ(this, bmjzfecsuu6mdmsoqmyrlysv3oeeb);
        }
        Object objBezslBgjveK3hODH = scJENg2agTkUXoVRQ.WIXlfFpvH7glAGsUk3;
        int i2 = scJENg2agTkUXoVRQ.LcvPFGYKhAm4SS5FZ;
        LpRXf8zsxndinAW3 lpRXf8zsxndinAW3 = this.axL8FocTDLUdzg0XScbO;
        SharedPreferences sharedPreferences = this.BezslBgjveK3hODH;
        String strAxL8FocTDLUdzg0XScbO = null;
        if (i2 == 0) {
            Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objBezslBgjveK3hODH);
            String string = sharedPreferences.getString("bitpit.launcher.key.PLAY_REFERRAL_INFO", "");
            if (string == null) {
                return null;
            }
            if (string.length() > 0) {
                try {
                    return lpRXf8zsxndinAW3.S1zP5M3X7Ukq3ROlZ87G9I(string, ReferrerDetails.Companion.serializer());
                } catch (SerializationException e) {
                    Emi5d0VyYZLZtm.Aboow6rUrcY2SrFRa46C6uy(e);
                }
            }
            scJENg2agTkUXoVRQ.LcvPFGYKhAm4SS5FZ = 1;
            objBezslBgjveK3hODH = BezslBgjveK3hODH(scJENg2agTkUXoVRQ);
            Object obj = tIDTjdoK38.GO8WUug7ZWFCUI1zY;
            if (objBezslBgjveK3hODH == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objBezslBgjveK3hODH);
        }
        ReferrerDetails referrerDetails = (ReferrerDetails) objBezslBgjveK3hODH;
        if (referrerDetails != null) {
            try {
                strAxL8FocTDLUdzg0XScbO = lpRXf8zsxndinAW3.axL8FocTDLUdzg0XScbO(ReferrerDetails.Companion.serializer(), referrerDetails);
            } catch (SerializationException e2) {
                Emi5d0VyYZLZtm.Aboow6rUrcY2SrFRa46C6uy(e2);
            }
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("bitpit.launcher.key.PLAY_REFERRAL_INFO", strAxL8FocTDLUdzg0XScbO);
        editorEdit.apply();
        return referrerDetails;
    }
}
