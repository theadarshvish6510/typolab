package bitpit.launcher.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import b.GZnU2p3i2qStYb;
import b.GaJEBx6eHS;
import b.JHnppaRJDZMMWaOU5cgIw;
import b.XQCixPMPkXDW6;
import b.YuxxynphmLI;
import b.fhSNm7dhXpC9W6pfm4CfVlFNDgpq;
import b.jxlgdotwt22;
import b.lkiaEDM5lpT;
import b.pXynlL6SZmXt4dK1Q;
import b.rKGSZcCPL4d7Re;
import bitpit.launcher.core.LauncherApplication;

/* JADX INFO: loaded from: classes.dex */
public final class OwnNotificationDismissedReceiver extends BroadcastReceiver implements lkiaEDM5lpT {
    public static final rKGSZcCPL4d7Re Companion = new rKGSZcCPL4d7Re();

    @Override // b.lkiaEDM5lpT
    public final /* bridge */ pXynlL6SZmXt4dK1Q getKoin() {
        return fhSNm7dhXpC9W6pfm4CfVlFNDgpq.axL8FocTDLUdzg0XScbO();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (context == null) {
            return;
        }
        LauncherApplication.Companion.getClass();
        YuxxynphmLI.S1zP5M3X7Ukq3ROlZ87G9I(context);
        String action = intent != null ? intent.getAction() : null;
        if (action != null && action.hashCode() == 576488800 && action.equals("changelog_notification_dismissed")) {
            XQCixPMPkXDW6 xQCixPMPkXDW6 = ((GaJEBx6eHS) ((jxlgdotwt22) fhSNm7dhXpC9W6pfm4CfVlFNDgpq.axL8FocTDLUdzg0XScbO().BezslBgjveK3hODH.gsHzEVTj1SCIPR).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(GaJEBx6eHS.class), null, null)).PQQPeCDD0JLCT3aLz;
            GZnU2p3i2qStYb gZnU2p3i2qStYb = GaJEBx6eHS.JY5knQmh7EQJEZ[0];
            xQCixPMPkXDW6.BezslBgjveK3hODH(1642);
        }
    }
}
