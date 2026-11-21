package bitpit.launcher.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.O9Vq0pSiHJp;
import b.OkhdZkC3NYLW;
import b.RrUZ7vqWrHnjp4ODYohqa;
import b.Yk9naq2GMZmGlztGWdn6a;
import b.YuxxynphmLI;
import b.cdjHGKliASEP50WE;
import b.fhSNm7dhXpC9W6pfm4CfVlFNDgpq;
import b.lkiaEDM5lpT;
import b.mHW63SUma8isGb;
import b.pXynlL6SZmXt4dK1Q;
import b.qSDYaDqxbBy2QEeVAcFRy;
import b.rbpFGdpgDCAQXat;
import b.zHfG9eBtghieLBn;
import bitpit.launcher.core.LauncherApplication;

/* JADX INFO: loaded from: classes.dex */
public final class AppWidgetsRestoredReceiver extends BroadcastReceiver implements lkiaEDM5lpT {
    public static final /* synthetic */ int WIXlfFpvH7glAGsUk3 = 0;
    public final mHW63SUma8isGb GO8WUug7ZWFCUI1zY = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new Yk9naq2GMZmGlztGWdn6a(this, 4));
    public final mHW63SUma8isGb Rdzg08aYlt0UsoLUNug9cESzgAY9R = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new Yk9naq2GMZmGlztGWdn6a(this, 5));
    public final mHW63SUma8isGb cCmbv8Tzd2QLd161ImIZUlZ8n = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new Yk9naq2GMZmGlztGWdn6a(this, 6));

    @Override // b.lkiaEDM5lpT
    public final /* bridge */ pXynlL6SZmXt4dK1Q getKoin() {
        return fhSNm7dhXpC9W6pfm4CfVlFNDgpq.axL8FocTDLUdzg0XScbO();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(intent.getAction(), "android.appwidget.action.APPWIDGET_HOST_RESTORED")) {
            int intExtra = intent.getIntExtra("hostId", 0);
            O9Vq0pSiHJp o9Vq0pSiHJp = cdjHGKliASEP50WE.S1zP5M3X7Ukq3ROlZ87G9I;
            o9Vq0pSiHJp.S1zP5M3X7Ukq3ROlZ87G9I(LthVJzs8YB767vHOMwO80UNP7QrQi.LYcdI4xpry8eXmFC9I4wyaLdcG1z(intExtra, "Widget ID map received for host: "), new Object[0]);
            if (intExtra != 4354) {
                return;
            }
            LauncherApplication.Companion.getClass();
            YuxxynphmLI.S1zP5M3X7Ukq3ROlZ87G9I(context);
            int[] intArrayExtra = intent.getIntArrayExtra("appWidgetOldIds");
            int[] intArrayExtra2 = intent.getIntArrayExtra("appWidgetIds");
            if (intArrayExtra == null || intArrayExtra2 == null || intArrayExtra.length != intArrayExtra2.length) {
                o9Vq0pSiHJp.ziNFA7KzVfc6("Received invalid widget ID map during restore", new Object[0]);
            } else {
                rbpFGdpgDCAQXat.ziNFA7KzVfc6((zHfG9eBtghieLBn) this.cCmbv8Tzd2QLd161ImIZUlZ8n.getValue(), null, 0, new RrUZ7vqWrHnjp4ODYohqa(this, intArrayExtra, intArrayExtra2, null, 8), 3);
            }
        }
    }
}
