package bitpit.launcher.core.startup;

import android.content.Context;
import android.os.StrictMode;
import b.O9Vq0pSiHJp;
import b.ReOf59F1spksEWaZRkyd;
import b.YuxxynphmLI;
import b.a9kWzoj6D3Yoa0;
import b.cdjHGKliASEP50WE;
import b.gFF2G92YfINCa5CZY;
import b.gT4sTdpjS277wbG60pk72fHWG7;
import b.s9XnN7QTAJ;
import b.tOXYB4PFVk7ops4U;
import b.uuyTGGFjNDiF1SxHW;
import bitpit.launcher.core.LauncherApplication;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class DebuggingInitializer implements gFF2G92YfINCa5CZY {
    @Override // b.gFF2G92YfINCa5CZY
    public final List S1zP5M3X7Ukq3ROlZ87G9I() {
        return a9kWzoj6D3Yoa0.GO8WUug7ZWFCUI1zY;
    }

    @Override // b.gFF2G92YfINCa5CZY
    public final Object axL8FocTDLUdzg0XScbO(Context context) {
        YuxxynphmLI yuxxynphmLI = LauncherApplication.Companion;
        boolean z = (context.getApplicationInfo().flags & 2) != 0;
        yuxxynphmLI.getClass();
        LauncherApplication.Rdzg08aYlt0UsoLUNug9cESzgAY9R = z;
        if (z) {
            StrictMode.ThreadPolicy.Builder builder = new StrictMode.ThreadPolicy.Builder();
            builder.detectAll();
            builder.permitDiskReads();
            builder.permitDiskWrites();
            builder.permitCustomSlowCalls();
            if (gT4sTdpjS277wbG60pk72fHWG7.JY5knQmh7EQJEZ) {
                builder.permitExplicitGc();
            }
            builder.penaltyLog();
            builder.penaltyDialog();
            StrictMode.setThreadPolicy(builder.build());
            StrictMode.VmPolicy.Builder builder2 = new StrictMode.VmPolicy.Builder();
            builder2.detectLeakedSqlLiteObjects();
            builder2.detectLeakedClosableObjects();
            builder2.detectActivityLeaks();
            builder2.detectLeakedRegistrationObjects();
            builder2.detectFileUriExposure();
            builder2.detectCleartextNetwork();
            builder2.detectContentUriWithoutPermission();
            if (gT4sTdpjS277wbG60pk72fHWG7.ziNFA7KzVfc6) {
                builder2.detectCredentialProtectedWhileLocked();
            }
            if (gT4sTdpjS277wbG60pk72fHWG7.ox9eclwMpRd) {
                builder2.detectIncorrectContextUse();
                builder2.detectUnsafeIntentLaunch();
            }
            builder2.penaltyLog();
            StrictMode.setVmPolicy(builder2.build());
            O9Vq0pSiHJp o9Vq0pSiHJp = cdjHGKliASEP50WE.S1zP5M3X7Ukq3ROlZ87G9I;
            ReOf59F1spksEWaZRkyd reOf59F1spksEWaZRkyd = new ReOf59F1spksEWaZRkyd();
            o9Vq0pSiHJp.getClass();
            if (reOf59F1spksEWaZRkyd == o9Vq0pSiHJp) {
                uuyTGGFjNDiF1SxHW.PQQPeCDD0JLCT3aLz("Cannot plant Timber into itself.");
                return null;
            }
            ArrayList arrayList = cdjHGKliASEP50WE.axL8FocTDLUdzg0XScbO;
            synchronized (arrayList) {
                arrayList.add(reOf59F1spksEWaZRkyd);
                Object[] array = arrayList.toArray(new tOXYB4PFVk7ops4U[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                cdjHGKliASEP50WE.BezslBgjveK3hODH = (tOXYB4PFVk7ops4U[]) array;
            }
        }
        return s9XnN7QTAJ.S1zP5M3X7Ukq3ROlZ87G9I;
    }
}
