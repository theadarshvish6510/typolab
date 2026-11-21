package bitpit.launcher.genai;

import b.Emi5d0VyYZLZtm;
import b.LthVJzs8YB767vHOMwO80UNP7QrQi;
import b.SCo4Ctd3zv2DHfczdi;
import b.WLZoEbRHGAYGtOeo6ZMxoLT9;
import b.Zo1YEZ6nT2Qsm9uBmmbXR;
import com.google.mlkit.genai.common.GenAiException;
import java.time.Duration;

/* JADX INFO: loaded from: classes.dex */
public abstract class NniqwgLR9Jo6Bl9Px0S5u {
    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a7  */
    public static final GenAiFailure S1zP5M3X7Ukq3ROlZ87G9I(Exception exc) {
        GenAiFailure unsupported;
        GenAiFailure requestFailed;
        if (exc instanceof GenAiException) {
            GenAiException genAiException = (GenAiException) exc;
            int i = genAiException.GO8WUug7ZWFCUI1zY;
            int i2 = i == 28 ? 9 : i;
            if (i2 == -101) {
                unsupported = new GenAiFailure.Unsupported("unsupported", exc);
            } else if (i2 == -100) {
                if (i == 28) {
                    i = 9;
                }
                requestFailed = new GenAiFailure.RequestFailed("request failed (" + Integer.valueOf(i) + ")", genAiException);
                unsupported = requestFailed;
            } else {
                if (i2 != 4) {
                    if (i2 != 27 && i2 != 30) {
                        if (i2 != 501 && i2 != 604) {
                            if (i2 == 8) {
                                unsupported = new GenAiFailure.Unsupported("unsupported", exc);
                            } else if (i2 != 9) {
                                if (i2 != 11 && i2 != 12 && i2 != 15) {
                                    if (i2 != 16) {
                                        switch (i2) {
                                            case -106:
                                            case -105:
                                            case -104:
                                            case -103:
                                                break;
                                            default:
                                                unsupported = new GenAiFailure.Unexpected(null, exc);
                                                break;
                                        }
                                    } else {
                                        unsupported = new GenAiFailure.Unsupported("unsupported", exc);
                                    }
                                }
                            }
                        }
                        if (i == 28) {
                            i = 9;
                        }
                        requestFailed = new GenAiFailure.RequestFailed("request failed (" + Integer.valueOf(i) + ")", genAiException);
                    }
                    Duration duration = genAiException.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
                    Zo1YEZ6nT2Qsm9uBmmbXR.Rdzg08aYlt0UsoLUNug9cESzgAY9R(WLZoEbRHGAYGtOeo6ZMxoLT9.LYcdI4xpry8eXmFC9I4wyaLdcG1z(duration.getSeconds(), SCo4Ctd3zv2DHfczdi.SECONDS), WLZoEbRHGAYGtOeo6ZMxoLT9.JY5knQmh7EQJEZ(duration.getNano(), SCo4Ctd3zv2DHfczdi.NANOSECONDS));
                    if (i == 28) {
                        i = 9;
                    }
                    requestFailed = new GenAiFailure.TemporarilyUnavailable(LthVJzs8YB767vHOMwO80UNP7QrQi.ToEIy0qfkltfGfO3vmAQG("temporarily unavailable (", i, ")"), genAiException);
                } else {
                    requestFailed = new GenAiFailure.InputRefused("input refused", genAiException);
                }
                unsupported = requestFailed;
            }
        } else {
            unsupported = new GenAiFailure.Unexpected(null, exc);
        }
        if (unsupported instanceof GenAiFailure.Unexpected) {
            Emi5d0VyYZLZtm.Aboow6rUrcY2SrFRa46C6uy(unsupported);
            return unsupported;
        }
        Emi5d0VyYZLZtm.ox9eclwMpRd(unsupported);
        return unsupported;
    }
}
