package bitpit.launcher.core;

import android.app.Application;
import android.content.Context;
import b.AMVXMF4ZEayNO0TK1s5P6;
import b.EVNQjvikM7uoVSZz;
import b.JHnppaRJDZMMWaOU5cgIw;
import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.PFgpcGG75zWSbgykRZqS7S;
import b.TUgymFFMQG8cKF;
import b.VjGko9Bc4MowPDjS;
import b.YQBnJJCDXYaOuUNr;
import b.YuxxynphmLI;
import b.cdjHGKliASEP50WE;
import b.d0ivEMCg4QCovy;
import b.jJeM6UtIjva9olOYD;
import b.jQFOBT5BomJFCWUe;
import b.lF2Kzi8xli8ZFI6byuDbmdYsP6eiV;
import b.nWNp5lXd2UnmVHYiA23jIso8x9;
import b.pXynlL6SZmXt4dK1Q;
import b.wirydrGofe1Uj5iLkZxiodRu;
import b.zKStfmZtusZv8MqNlYqF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class LauncherApplication extends Application implements wirydrGofe1Uj5iLkZxiodRu {
    public static boolean Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    public static boolean cCmbv8Tzd2QLd161ImIZUlZ8n;
    public nWNp5lXd2UnmVHYiA23jIso8x9 GO8WUug7ZWFCUI1zY;
    public static final YuxxynphmLI Companion = new YuxxynphmLI();
    public static final StackTraceElement[] WIXlfFpvH7glAGsUk3 = new StackTraceElement[0];

    @Override // b.wirydrGofe1Uj5iLkZxiodRu
    public final d0ivEMCg4QCovy S1zP5M3X7Ukq3ROlZ87G9I(Context context) {
        EVNQjvikM7uoVSZz eVNQjvikM7uoVSZz = new EVNQjvikM7uoVSZz(context, 6);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        PFgpcGG75zWSbgykRZqS7S pFgpcGG75zWSbgykRZqS7S = new PFgpcGG75zWSbgykRZqS7S(21);
        int i = 7;
        arrayList4.add(new YQBnJJCDXYaOuUNr(i, new AMVXMF4ZEayNO0TK1s5P6(new VjGko9Bc4MowPDjS(3, pFgpcGG75zWSbgykRZqS7S), new PFgpcGG75zWSbgykRZqS7S(22), 4), JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(jQFOBT5BomJFCWUe.class)));
        eVNQjvikM7uoVSZz.cCmbv8Tzd2QLd161ImIZUlZ8n = new lF2Kzi8xli8ZFI6byuDbmdYsP6eiV(jJeM6UtIjva9olOYD.ziNFA7KzVfc6(arrayList), jJeM6UtIjva9olOYD.ziNFA7KzVfc6(arrayList2), jJeM6UtIjva9olOYD.ziNFA7KzVfc6(arrayList3), jJeM6UtIjva9olOYD.ziNFA7KzVfc6(arrayList4), jJeM6UtIjva9olOYD.ziNFA7KzVfc6(arrayList5));
        return eVNQjvikM7uoVSZz.WT8HZhEwPEkG();
    }

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        cdjHGKliASEP50WE.S1zP5M3X7Ukq3ROlZ87G9I.S1zP5M3X7Ukq3ROlZ87G9I("onCreateApp", new Object[0]);
    }

    @Override // android.app.Application
    public final void onTerminate() {
        super.onTerminate();
        synchronized (TUgymFFMQG8cKF.gsHzEVTj1SCIPR) {
            try {
                pXynlL6SZmXt4dK1Q pxynll6szmxt4dk1q = TUgymFFMQG8cKF.LcvPFGYKhAm4SS5FZ;
                if (pxynll6szmxt4dk1q != null) {
                    pxynll6szmxt4dk1q.S1zP5M3X7Ukq3ROlZ87G9I();
                }
                TUgymFFMQG8cKF.LcvPFGYKhAm4SS5FZ = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        int size;
        nWNp5lXd2UnmVHYiA23jIso8x9 nwnp5lxd2unmvhyia23jiso8x9 = this.GO8WUug7ZWFCUI1zY;
        if (nwnp5lxd2unmvhyia23jiso8x9 != null) {
            cdjHGKliASEP50WE.S1zP5M3X7Ukq3ROlZ87G9I.S1zP5M3X7Ukq3ROlZ87G9I(LthVJzs8YB767vHOMwO80UNP7QrQi.ToEIy0qfkltfGfO3vmAQG("onTrimMemory (trimLevel=", i, ")"), new Object[0]);
            if (i >= 60 || i == 10 || i == 15) {
                ArrayList arrayList = nwnp5lxd2unmvhyia23jiso8x9.S1zP5M3X7Ukq3ROlZ87G9I.GO8WUug7ZWFCUI1zY;
                if (!arrayList.isEmpty() && (size = arrayList.size() - 1) >= 0) {
                    while (true) {
                        int i2 = size - 1;
                        ((zKStfmZtusZv8MqNlYqF) arrayList.get(size)).axL8FocTDLUdzg0XScbO();
                        if (i2 < 0) {
                            break;
                        } else {
                            size = i2;
                        }
                    }
                }
            }
        }
        super.onTrimMemory(i);
    }
}
