package bitpit.launcher.core.startup;

import android.content.Context;
import b.RFExW4k0R9weQOUyk6QCatk;
import b.TUgymFFMQG8cKF;
import b.a9kWzoj6D3Yoa0;
import b.gFF2G92YfINCa5CZY;
import b.kDm7GqCT1ON0GdaY7Zfu6vmMSfm;
import b.uu0MDAPquWcyG3GFCvYoocT;
import java.util.List;
import org.koin.core.error.KoinApplicationAlreadyStartedException;

/* JADX INFO: loaded from: classes.dex */
public final class KoinInitializer implements gFF2G92YfINCa5CZY {
    public static final kDm7GqCT1ON0GdaY7Zfu6vmMSfm Companion = new kDm7GqCT1ON0GdaY7Zfu6vmMSfm();

    @Override // b.gFF2G92YfINCa5CZY
    public final List S1zP5M3X7Ukq3ROlZ87G9I() {
        return a9kWzoj6D3Yoa0.GO8WUug7ZWFCUI1zY;
    }

    @Override // b.gFF2G92YfINCa5CZY
    public final Object axL8FocTDLUdzg0XScbO(Context context) {
        RFExW4k0R9weQOUyk6QCatk rFExW4k0R9weQOUyk6QCatk;
        uu0MDAPquWcyG3GFCvYoocT uu0mdapquwcyg3gfcvyooct = new uu0MDAPquWcyG3GFCvYoocT(context, 2);
        synchronized (TUgymFFMQG8cKF.gsHzEVTj1SCIPR) {
            rFExW4k0R9weQOUyk6QCatk = new RFExW4k0R9weQOUyk6QCatk();
            if (TUgymFFMQG8cKF.LcvPFGYKhAm4SS5FZ != null) {
                throw new KoinApplicationAlreadyStartedException("A Koin Application has already been started");
            }
            TUgymFFMQG8cKF.LcvPFGYKhAm4SS5FZ = rFExW4k0R9weQOUyk6QCatk.S1zP5M3X7Ukq3ROlZ87G9I;
            uu0mdapquwcyg3gfcvyooct.S1zP5M3X7Ukq3ROlZ87G9I(rFExW4k0R9weQOUyk6QCatk);
            rFExW4k0R9weQOUyk6QCatk.S1zP5M3X7Ukq3ROlZ87G9I.axL8FocTDLUdzg0XScbO();
        }
        return rFExW4k0R9weQOUyk6QCatk;
    }
}
