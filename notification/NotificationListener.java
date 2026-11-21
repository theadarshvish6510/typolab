package bitpit.launcher.notification;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.session.MediaSessionManager;
import android.os.Handler;
import android.os.Looper;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import b.AlfjqIWYtShTgT;
import b.B4VuABB1m6ytu26MxoUBytPiQ;
import b.CTid586a2W9uiqX3Zqsu;
import b.D1j0Lzz35o2R615m4Z;
import b.Emi5d0VyYZLZtm;
import b.HF5afwOkFj9V8;
import b.Hnv6Te9rrTA0VqZMo;
import b.IyJ5Qc4DxtDd1Zs;
import b.K7k5h9eP8ZEPomZ3e;
import b.LCJv4jbu5X0qa1vYjoshgr5P6i;
import b.LEcOHJkjxcSWOL9Q6Cc1rlZh;
import b.LLnhW2rxhI026DTfznKMKaPBh;
import b.NMquq9o0FvRs5RyiTFrS;
import b.OUw39KtIsdT3yYWqqOrKN6;
import b.OkhdZkC3NYLW;
import b.PeLieoBN4yxYJZju3kQtKIsq7XL8;
import b.SgSF8q31AMTBQ3uIGh;
import b.XdTaYoQ5W9eSG4E;
import b.YuxxynphmLI;
import b.a9kWzoj6D3Yoa0;
import b.bMjZFECsuU6MdmSOqmYrlYsV3oEeB;
import b.fhSNm7dhXpC9W6pfm4CfVlFNDgpq;
import b.gDorRusXxz4vI7fqTkfdRMN;
import b.gT4sTdpjS277wbG60pk72fHWG7;
import b.hwSYVZu6IevsK1z;
import b.iHPHZIrmzz0Nhav1OcnsAYxx7Sm1;
import b.lkiaEDM5lpT;
import b.mHW63SUma8isGb;
import b.otD5bQR0LtT;
import b.pCmqsvINHWuPw6ahG;
import b.pXynlL6SZmXt4dK1Q;
import b.qAu8xPQt71QSu59v2YrEcbg7z;
import b.qEmNd4hFCjWjhU1elUAACVJk1;
import b.qSDYaDqxbBy2QEeVAcFRy;
import b.rQx2qnAJALGv3rjYdbUuz5;
import b.rbpFGdpgDCAQXat;
import b.s9XnN7QTAJ;
import b.sjCeNEhTnfBmL01vsDu;
import b.tIDTjdoK38;
import b.uuyTGGFjNDiF1SxHW;
import b.vLj5VkJxtnUVpBDSpQ;
import b.vOL3U3fINHMmdVoJz;
import b.vQJ4Und6sZug3zzwEj0gveJQ1Ya;
import b.vuuAFB94cPCyZ24F3m3k;
import b.wCM739wpWKTM7TvL8KzIH;
import b.zHfG9eBtghieLBn;
import b.zU7xpvgNfkyHyk7tsWFg0i29X;
import bitpit.launcher.core.LauncherApplication;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationListener extends NotificationListenerService implements MediaSessionManager.OnActiveSessionsChangedListener, SharedPreferences.OnSharedPreferenceChangeListener, qEmNd4hFCjWjhU1elUAACVJk1, LEcOHJkjxcSWOL9Q6Cc1rlZh, lkiaEDM5lpT {
    public static final OUw39KtIsdT3yYWqqOrKN6 Companion = new OUw39KtIsdT3yYWqqOrKN6();
    public static WeakReference IPi49brQACDpXJTJMp7;
    public static CTid586a2W9uiqX3Zqsu yZj7bj6KyeuYi9woqDlC;
    public vuuAFB94cPCyZ24F3m3k FzogU2bPCQtD6a1hMYB1kyti;
    public boolean GO8WUug7ZWFCUI1zY;
    public IyJ5Qc4DxtDd1Zs J1BE9tYH1em4X1uAhc6L7f4M;
    public D1j0Lzz35o2R615m4Z sCPtafveBAhdLIs2ajN3WV;
    public boolean tdNmBZIJHG1;
    public NotificationListenerService.RankingMap tzMOyOc53ffl;
    public final mHW63SUma8isGb Rdzg08aYlt0UsoLUNug9cESzgAY9R = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new XdTaYoQ5W9eSG4E(this, 0));
    public final Handler cCmbv8Tzd2QLd161ImIZUlZ8n = new Handler(Looper.getMainLooper());
    public final mHW63SUma8isGb WIXlfFpvH7glAGsUk3 = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new XdTaYoQ5W9eSG4E(this, 1));
    public final mHW63SUma8isGb gsHzEVTj1SCIPR = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new XdTaYoQ5W9eSG4E(this, 2));
    public final mHW63SUma8isGb LcvPFGYKhAm4SS5FZ = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new XdTaYoQ5W9eSG4E(this, 3));
    public final mHW63SUma8isGb qaDSpeex0Oo1Qvt3oOrTJnbcQFp = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new XdTaYoQ5W9eSG4E(this, 4));
    public final mHW63SUma8isGb Mej0x2K4ZGSUxtYNka4QZ = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new XdTaYoQ5W9eSG4E(this, 5));
    public final mHW63SUma8isGb qTa7aqjjB9Bt6mc = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new XdTaYoQ5W9eSG4E(this, 6));
    public final mHW63SUma8isGb f2sXlW3st0rAKJwyOrCfOWc = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new XdTaYoQ5W9eSG4E(this, 7));
    public final mHW63SUma8isGb iR1XUIc7FjhMl57O = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new XdTaYoQ5W9eSG4E(this, 8));
    public final pCmqsvINHWuPw6ahG yM5HHkk1MhPLZFYTHm2JjrArud = new pCmqsvINHWuPw6ahG();
    public final boolean cVfIGUKLEqID1HH = true;
    public final NotificationListenerService.Ranking czGAefXQxIZzo = new NotificationListenerService.Ranking();

    public final void Aboow6rUrcY2SrFRa46C6uy(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        if (rankingMap != null) {
            this.tzMOyOc53ffl = rankingMap;
        }
        OUw39KtIsdT3yYWqqOrKN6 oUw39KtIsdT3yYWqqOrKN6 = Companion;
        NotificationListenerService.RankingMap rankingMap2 = this.tzMOyOc53ffl;
        oUw39KtIsdT3yYWqqOrKN6.getClass();
        NotificationListenerService.Ranking ranking = this.czGAefXQxIZzo;
        if (rankingMap2 != null ? rankingMap2.getRanking(statusBarNotification.getKey(), ranking) : false) {
            vQJ4Und6sZug3zzwEj0gveJQ1Ya vqj4und6szug3zzwej0gvejq1ya = new vQJ4Und6sZug3zzwEj0gveJQ1Ya(getApplicationContext(), statusBarNotification, new SgSF8q31AMTBQ3uIGh(ranking), 24);
            if (this.GO8WUug7ZWFCUI1zY) {
                ox9eclwMpRd(vqj4und6szug3zzwej0gvejq1ya);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object BezslBgjveK3hODH(AlfjqIWYtShTgT alfjqIWYtShTgT, vOL3U3fINHMmdVoJz vol3u3finhmmdvojz) throws Throwable {
        sjCeNEhTnfBmL01vsDu sjcenehtnfbml01vsdu;
        ArrayList arrayList;
        vLj5VkJxtnUVpBDSpQ vlj5vkjxtnuvpbdspqS1zP5M3X7Ukq3ROlZ87G9I;
        ArrayList arrayList2;
        if (vol3u3finhmmdvojz instanceof sjCeNEhTnfBmL01vsDu) {
            sjcenehtnfbml01vsdu = (sjCeNEhTnfBmL01vsDu) vol3u3finhmmdvojz;
            int i = sjcenehtnfbml01vsdu.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
            if ((i & Integer.MIN_VALUE) != 0) {
                sjcenehtnfbml01vsdu.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = i - Integer.MIN_VALUE;
            } else {
                sjcenehtnfbml01vsdu = new sjCeNEhTnfBmL01vsDu(this, (bMjZFECsuU6MdmSOqmYrlYsV3oEeB) vol3u3finhmmdvojz);
            }
        } else {
            sjcenehtnfbml01vsdu = new sjCeNEhTnfBmL01vsDu(this, (bMjZFECsuU6MdmSOqmYrlYsV3oEeB) vol3u3finhmmdvojz);
        }
        Object objJY5knQmh7EQJEZ = sjcenehtnfbml01vsdu.gsHzEVTj1SCIPR;
        int i2 = sjcenehtnfbml01vsdu.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
        pCmqsvINHWuPw6ahG pcmqsvinhwupw6ahg = this.yM5HHkk1MhPLZFYTHm2JjrArud;
        if (i2 == 0) {
            Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objJY5knQmh7EQJEZ);
            vLj5VkJxtnUVpBDSpQ vlj5vkjxtnuvpbdspqS1zP5M3X7Ukq3ROlZ87G9I2 = pcmqsvinhwupw6ahg.S1zP5M3X7Ukq3ROlZ87G9I(alfjqIWYtShTgT);
            if (vlj5vkjxtnuvpbdspqS1zP5M3X7Ukq3ROlZ87G9I2 != null && (arrayList = vlj5vkjxtnuvpbdspqS1zP5M3X7Ukq3ROlZ87G9I2.Aboow6rUrcY2SrFRa46C6uy) != null) {
                ArrayList arrayList3 = new ArrayList(arrayList);
                PeLieoBN4yxYJZju3kQtKIsq7XL8 peLieoBN4yxYJZju3kQtKIsq7XL8 = NMquq9o0FvRs5RyiTFrS.S1zP5M3X7Ukq3ROlZ87G9I;
                zU7xpvgNfkyHyk7tsWFg0i29X zu7xpvgnfkyhyk7tswfg0i29x = new zU7xpvgNfkyHyk7tsWFg0i29X(arrayList3, null, 0);
                sjcenehtnfbml01vsdu.WIXlfFpvH7glAGsUk3 = alfjqIWYtShTgT;
                sjcenehtnfbml01vsdu.qaDSpeex0Oo1Qvt3oOrTJnbcQFp = 1;
                objJY5knQmh7EQJEZ = rbpFGdpgDCAQXat.JY5knQmh7EQJEZ(peLieoBN4yxYJZju3kQtKIsq7XL8, zu7xpvgnfkyhyk7tswfg0i29x, sjcenehtnfbml01vsdu);
                tIDTjdoK38 tidtjdok38 = tIDTjdoK38.GO8WUug7ZWFCUI1zY;
                if (objJY5knQmh7EQJEZ == tidtjdok38) {
                    return tidtjdok38;
                }
            }
            return s9XnN7QTAJ.S1zP5M3X7Ukq3ROlZ87G9I;
        }
        if (i2 != 1) {
            uuyTGGFjNDiF1SxHW.ToEIy0qfkltfGfO3vmAQG("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        alfjqIWYtShTgT = sjcenehtnfbml01vsdu.WIXlfFpvH7glAGsUk3;
        Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(objJY5knQmh7EQJEZ);
        List<vQJ4Und6sZug3zzwEj0gveJQ1Ya> list = (List) objJY5knQmh7EQJEZ;
        if (!list.isEmpty() && (vlj5vkjxtnuvpbdspqS1zP5M3X7Ukq3ROlZ87G9I = pcmqsvinhwupw6ahg.S1zP5M3X7Ukq3ROlZ87G9I(alfjqIWYtShTgT)) != null && (arrayList2 = vlj5vkjxtnuvpbdspqS1zP5M3X7Ukq3ROlZ87G9I.Aboow6rUrcY2SrFRa46C6uy) != null && this.cVfIGUKLEqID1HH) {
            for (vQJ4Und6sZug3zzwEj0gveJQ1Ya vqj4und6szug3zzwej0gvejq1ya : list) {
                if (arrayList2.contains(vqj4und6szug3zzwej0gvejq1ya)) {
                    AlfjqIWYtShTgT alfjqIWYtShTgT2 = vqj4und6szug3zzwej0gvejq1ya.LcvPFGYKhAm4SS5FZ;
                    LinkedHashMap linkedHashMap = pcmqsvinhwupw6ahg.GO8WUug7ZWFCUI1zY;
                    vLj5VkJxtnUVpBDSpQ vlj5vkjxtnuvpbdspq = (vLj5VkJxtnUVpBDSpQ) linkedHashMap.get(alfjqIWYtShTgT2);
                    if (vlj5vkjxtnuvpbdspq != null) {
                        vlj5vkjxtnuvpbdspq.S1zP5M3X7Ukq3ROlZ87G9I(vqj4und6szug3zzwej0gvejq1ya);
                    } else {
                        linkedHashMap.put(alfjqIWYtShTgT2, new vLj5VkJxtnUVpBDSpQ(vqj4und6szug3zzwej0gvejq1ya, alfjqIWYtShTgT2, pcmqsvinhwupw6ahg.Rdzg08aYlt0UsoLUNug9cESzgAY9R, pcmqsvinhwupw6ahg));
                    }
                    vuuAFB94cPCyZ24F3m3k vuuafb94cpcyz24f3m3k = this.FzogU2bPCQtD6a1hMYB1kyti;
                    if (vuuafb94cpcyz24f3m3k == null) {
                        vuuafb94cpcyz24f3m3k = null;
                    }
                    vuuafb94cpcyz24f3m3k.S1zP5M3X7Ukq3ROlZ87G9I(vqj4und6szug3zzwej0gvejq1ya, true);
                }
            }
        }
        return s9XnN7QTAJ.S1zP5M3X7Ukq3ROlZ87G9I;
    }

    @Override // b.LEcOHJkjxcSWOL9Q6Cc1rlZh
    public final void JY5knQmh7EQJEZ(D1j0Lzz35o2R615m4Z d1j0Lzz35o2R615m4Z, List list, List list2, Collection collection, Collection collection2, boolean z, boolean z2) {
        D1j0Lzz35o2R615m4Z d1j0Lzz35o2R615m4Z2 = this.sCPtafveBAhdLIs2ajN3WV;
        if (d1j0Lzz35o2R615m4Z2 == null) {
            d1j0Lzz35o2R615m4Z2 = null;
        }
        if (!d1j0Lzz35o2R615m4Z.equals(d1j0Lzz35o2R615m4Z2) || z2) {
            return;
        }
        flPMk2Ix9h3b95v(true);
    }

    public final void LYcdI4xpry8eXmFC9I4wyaLdcG1z(vQJ4Und6sZug3zzwEj0gveJQ1Ya vqj4und6szug3zzwej0gvejq1ya, Integer num) {
        int i;
        int size;
        if (this.cVfIGUKLEqID1HH) {
            if (num != null) {
                OUw39KtIsdT3yYWqqOrKN6 oUw39KtIsdT3yYWqqOrKN6 = Companion;
                int iIntValue = num.intValue();
                oUw39KtIsdT3yYWqqOrKN6.getClass();
                switch (iIntValue) {
                    case 1:
                        i = 1;
                        break;
                    case 2:
                        i = 2;
                        break;
                    case 3:
                        i = 3;
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    default:
                        i = 0;
                        break;
                    case 7:
                        i = 7;
                        break;
                    case 8:
                        i = 8;
                        break;
                    case 9:
                        i = 9;
                        break;
                    case 10:
                        i = 10;
                        break;
                    case 11:
                        i = 11;
                        break;
                    case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                        i = 12;
                        break;
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                        i = 13;
                        break;
                    case 15:
                        i = 15;
                        break;
                    case 16:
                        i = 16;
                        break;
                    case 17:
                        i = 17;
                        break;
                    case 18:
                        i = 18;
                        break;
                    case 19:
                        i = 19;
                        break;
                }
                ziNFA7KzVfc6(i, vqj4und6szug3zzwej0gvejq1ya);
                CTid586a2W9uiqX3Zqsu cTid586a2W9uiqX3Zqsu = yZj7bj6KyeuYi9woqDlC;
                if (cTid586a2W9uiqX3Zqsu != null) {
                    int iIntValue2 = num.intValue();
                    ArrayList arrayList = cTid586a2W9uiqX3Zqsu.WIXlfFpvH7glAGsUk3.GO8WUug7ZWFCUI1zY;
                    if (!arrayList.isEmpty() && (size = arrayList.size() - 1) >= 0) {
                        while (true) {
                            int i2 = size - 1;
                            ((wCM739wpWKTM7TvL8KzIH) arrayList.get(size)).WT8HZhEwPEkG(iIntValue2, vqj4und6szug3zzwej0gvejq1ya);
                            if (i2 >= 0) {
                                size = i2;
                            }
                        }
                    }
                }
            }
            vLj5VkJxtnUVpBDSpQ vlj5vkjxtnuvpbdspq = (vLj5VkJxtnUVpBDSpQ) this.yM5HHkk1MhPLZFYTHm2JjrArud.GO8WUug7ZWFCUI1zY.get(vqj4und6szug3zzwej0gvejq1ya.LcvPFGYKhAm4SS5FZ);
            if (vlj5vkjxtnuvpbdspq != null && vlj5vkjxtnuvpbdspq.Aboow6rUrcY2SrFRa46C6uy.remove(vqj4und6szug3zzwej0gvejq1ya)) {
                vlj5vkjxtnuvpbdspq.axL8FocTDLUdzg0XScbO();
            }
            vuuAFB94cPCyZ24F3m3k vuuafb94cpcyz24f3m3k = this.FzogU2bPCQtD6a1hMYB1kyti;
            if (vuuafb94cpcyz24f3m3k == null) {
                vuuafb94cpcyz24f3m3k = null;
            }
            vuuafb94cpcyz24f3m3k.S1zP5M3X7Ukq3ROlZ87G9I(vqj4und6szug3zzwej0gvejq1ya, false);
        }
    }

    public final void PQQPeCDD0JLCT3aLz(StatusBarNotification statusBarNotification, Integer num) {
        if (statusBarNotification != null && this.GO8WUug7ZWFCUI1zY) {
            vLj5VkJxtnUVpBDSpQ vlj5vkjxtnuvpbdspqS1zP5M3X7Ukq3ROlZ87G9I = this.yM5HHkk1MhPLZFYTHm2JjrArud.S1zP5M3X7Ukq3ROlZ87G9I(new AlfjqIWYtShTgT(statusBarNotification.getPackageName(), statusBarNotification.getUser()));
            vQJ4Und6sZug3zzwEj0gveJQ1Ya vqj4und6szug3zzwej0gvejq1ya = null;
            Object obj = null;
            if (vlj5vkjxtnuvpbdspqS1zP5M3X7Ukq3ROlZ87G9I != null) {
                String key = statusBarNotification.getKey();
                int iHashCode = key.hashCode();
                ArrayList arrayList = vlj5vkjxtnuvpbdspqS1zP5M3X7Ukq3ROlZ87G9I.Aboow6rUrcY2SrFRa46C6uy;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    vQJ4Und6sZug3zzwEj0gveJQ1Ya vqj4und6szug3zzwej0gvejq1ya2 = (vQJ4Und6sZug3zzwEj0gveJQ1Ya) obj2;
                    if (vqj4und6szug3zzwej0gvejq1ya2.f2sXlW3st0rAKJwyOrCfOWc != iHashCode ? false : vqj4und6szug3zzwej0gvejq1ya2.Rdzg08aYlt0UsoLUNug9cESzgAY9R.getKey().equals(key)) {
                        obj = obj2;
                        break;
                    }
                }
                vqj4und6szug3zzwej0gvejq1ya = (vQJ4Und6sZug3zzwEj0gveJQ1Ya) obj;
            }
            if (vqj4und6szug3zzwej0gvejq1ya == null) {
                return;
            }
            LYcdI4xpry8eXmFC9I4wyaLdcG1z(vqj4und6szug3zzwej0gvejq1ya, num);
        }
    }

    @Override // b.qEmNd4hFCjWjhU1elUAACVJk1
    public final void axL8FocTDLUdzg0XScbO(qAu8xPQt71QSu59v2YrEcbg7z qau8xpqt71qsu59v2yrecbg7z, String str, boolean z) {
        if (gT4sTdpjS277wbG60pk72fHWG7.PQQPeCDD0JLCT3aLz && str.equals("android.permission.POST_NOTIFICATIONS")) {
            flPMk2Ix9h3b95v(false);
        }
    }

    public final void fXBtMGfTIjGSHgK542() {
        NotificationListenerService.RankingMap rankingMap;
        if (this.tdNmBZIJHG1 && this.cVfIGUKLEqID1HH && (rankingMap = this.tzMOyOc53ffl) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.yM5HHkk1MhPLZFYTHm2JjrArud.GO8WUug7ZWFCUI1zY.values().iterator();
            while (true) {
                int i = 0;
                if (!it.hasNext()) {
                    break;
                }
                ArrayList arrayList2 = ((vLj5VkJxtnUVpBDSpQ) it.next()).Aboow6rUrcY2SrFRa46C6uy;
                int size = arrayList2.size();
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    vQJ4Und6sZug3zzwEj0gveJQ1Ya vqj4und6szug3zzwej0gvejq1ya = (vQJ4Und6sZug3zzwEj0gveJQ1Ya) obj;
                    String key = vqj4und6szug3zzwej0gvejq1ya.Rdzg08aYlt0UsoLUNug9cESzgAY9R.getKey();
                    NotificationListenerService.Ranking ranking = this.czGAefXQxIZzo;
                    if (rankingMap.getRanking(key, ranking)) {
                        SgSF8q31AMTBQ3uIGh sgSF8q31AMTBQ3uIGh = new SgSF8q31AMTBQ3uIGh(ranking);
                        if (!OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(vqj4und6szug3zzwej0gvejq1ya.cCmbv8Tzd2QLd161ImIZUlZ8n, sgSF8q31AMTBQ3uIGh)) {
                            arrayList.add(new vQJ4Und6sZug3zzwEj0gveJQ1Ya(vqj4und6szug3zzwej0gvejq1ya, sgSF8q31AMTBQ3uIGh, (Collection) null, 12));
                        }
                    }
                }
            }
            int size2 = arrayList.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList.get(i2);
                i2++;
                ox9eclwMpRd((vQJ4Und6sZug3zzwEj0gveJQ1Ya) obj2);
            }
            this.tdNmBZIJHG1 = false;
        }
    }

    public final void flPMk2Ix9h3b95v(boolean z) {
        mHW63SUma8isGb mhw63suma8isgb = this.gsHzEVTj1SCIPR;
        if (((SharedPreferences) mhw63suma8isgb.getValue()).getBoolean("bitpit.launcher.key.NOTIFICATION_BATCHING_ENABLED", false) && !OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(((iHPHZIrmzz0Nhav1OcnsAYxx7Sm1) this.f2sXlW3st0rAKJwyOrCfOWc.getValue()).S1zP5M3X7Ukq3ROlZ87G9I("allow_notification_summary"), Boolean.FALSE) && (!gT4sTdpjS277wbG60pk72fHWG7.PQQPeCDD0JLCT3aLz || ((HF5afwOkFj9V8) ((hwSYVZu6IevsK1z) this.iR1XUIc7FjhMl57O.getValue())).BezslBgjveK3hODH("android.permission.POST_NOTIFICATIONS"))) {
            boolean z2 = ((SharedPreferences) mhw63suma8isgb.getValue()).getBoolean("bitpit.launcher.key.BATCH_SILENT_NOTIFICATIONS", false);
            D1j0Lzz35o2R615m4Z d1j0Lzz35o2R615m4Z = this.sCPtafveBAhdLIs2ajN3WV;
            if (d1j0Lzz35o2R615m4Z == null) {
                d1j0Lzz35o2R615m4Z = null;
            }
            boolean zIsEmpty = d1j0Lzz35o2R615m4Z.gsHzEVTj1SCIPR.isEmpty();
            if (z2 || !zIsEmpty) {
                if (this.J1BE9tYH1em4X1uAhc6L7f4M == null) {
                    LCJv4jbu5X0qa1vYjoshgr5P6i lCJv4jbu5X0qa1vYjoshgr5P6i = (LCJv4jbu5X0qa1vYjoshgr5P6i) this.WIXlfFpvH7glAGsUk3.getValue();
                    lCJv4jbu5X0qa1vYjoshgr5P6i.getClass();
                    this.J1BE9tYH1em4X1uAhc6L7f4M = new IyJ5Qc4DxtDd1Zs(this, z, lCJv4jbu5X0qa1vYjoshgr5P6i.S1zP5M3X7Ukq3ROlZ87G9I, lCJv4jbu5X0qa1vYjoshgr5P6i.axL8FocTDLUdzg0XScbO, lCJv4jbu5X0qa1vYjoshgr5P6i.BezslBgjveK3hODH, lCJv4jbu5X0qa1vYjoshgr5P6i.ziNFA7KzVfc6, lCJv4jbu5X0qa1vYjoshgr5P6i.Aboow6rUrcY2SrFRa46C6uy, lCJv4jbu5X0qa1vYjoshgr5P6i.ox9eclwMpRd, lCJv4jbu5X0qa1vYjoshgr5P6i.PQQPeCDD0JLCT3aLz, lCJv4jbu5X0qa1vYjoshgr5P6i.JY5knQmh7EQJEZ, lCJv4jbu5X0qa1vYjoshgr5P6i.LYcdI4xpry8eXmFC9I4wyaLdcG1z, lCJv4jbu5X0qa1vYjoshgr5P6i.flPMk2Ix9h3b95v, lCJv4jbu5X0qa1vYjoshgr5P6i.fXBtMGfTIjGSHgK542);
                    if (z) {
                        B4VuABB1m6ytu26MxoUBytPiQ.axL8FocTDLUdzg0XScbO(otD5bQR0LtT.Companion, "notification_summary_enabled");
                        return;
                    }
                    return;
                }
                return;
            }
        }
        IyJ5Qc4DxtDd1Zs iyJ5Qc4DxtDd1Zs = this.J1BE9tYH1em4X1uAhc6L7f4M;
        if (iyJ5Qc4DxtDd1Zs != null) {
            iyJ5Qc4DxtDd1Zs.HveD9n1tOYlffjJDxghBitYNgB(true);
            if (z) {
                B4VuABB1m6ytu26MxoUBytPiQ.axL8FocTDLUdzg0XScbO(otD5bQR0LtT.Companion, "notification_summary_disabled");
            }
            this.J1BE9tYH1em4X1uAhc6L7f4M = null;
        }
    }

    @Override // b.lkiaEDM5lpT
    public final /* bridge */ pXynlL6SZmXt4dK1Q getKoin() {
        return fhSNm7dhXpC9W6pfm4CfVlFNDgpq.axL8FocTDLUdzg0XScbO();
    }

    @Override // android.media.session.MediaSessionManager.OnActiveSessionsChangedListener
    public final void onActiveSessionsChanged(List list) {
        vuuAFB94cPCyZ24F3m3k vuuafb94cpcyz24f3m3k = this.FzogU2bPCQtD6a1hMYB1kyti;
        if (vuuafb94cpcyz24f3m3k == null) {
            vuuafb94cpcyz24f3m3k = null;
        }
        if (list == null) {
            list = a9kWzoj6D3Yoa0.GO8WUug7ZWFCUI1zY;
        }
        vuuafb94cpcyz24f3m3k.BezslBgjveK3hODH(list);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        YuxxynphmLI yuxxynphmLI = LauncherApplication.Companion;
        Context applicationContext = getApplicationContext();
        yuxxynphmLI.getClass();
        YuxxynphmLI.S1zP5M3X7Ukq3ROlZ87G9I(applicationContext);
        ((SharedPreferences) this.gsHzEVTj1SCIPR.getValue()).registerOnSharedPreferenceChangeListener(this);
        this.FzogU2bPCQtD6a1hMYB1kyti = new vuuAFB94cPCyZ24F3m3k(this, this.cCmbv8Tzd2QLd161ImIZUlZ8n);
        mHW63SUma8isGb mhw63suma8isgb = this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
        ((LLnhW2rxhI026DTfznKMKaPBh) ((gDorRusXxz4vI7fqTkfdRMN) mhw63suma8isgb.getValue())).Aboow6rUrcY2SrFRa46C6uy(this);
        this.sCPtafveBAhdLIs2ajN3WV = ((LLnhW2rxhI026DTfznKMKaPBh) ((gDorRusXxz4vI7fqTkfdRMN) mhw63suma8isgb.getValue())).FzogU2bPCQtD6a1hMYB1kyti;
        ((HF5afwOkFj9V8) ((hwSYVZu6IevsK1z) this.iR1XUIc7FjhMl57O.getValue())).PQQPeCDD0JLCT3aLz.axL8FocTDLUdzg0XScbO(this);
    }

    @Override // android.service.notification.NotificationListenerService, android.app.Service
    public final void onDestroy() {
        if (this.GO8WUug7ZWFCUI1zY) {
            try {
                requestUnbind();
            } catch (RuntimeException unused) {
            }
        }
        super.onDestroy();
        ((SharedPreferences) this.gsHzEVTj1SCIPR.getValue()).unregisterOnSharedPreferenceChangeListener(this);
        IyJ5Qc4DxtDd1Zs iyJ5Qc4DxtDd1Zs = this.J1BE9tYH1em4X1uAhc6L7f4M;
        if (iyJ5Qc4DxtDd1Zs != null) {
            iyJ5Qc4DxtDd1Zs.HveD9n1tOYlffjJDxghBitYNgB(false);
        }
        this.J1BE9tYH1em4X1uAhc6L7f4M = null;
        ((LLnhW2rxhI026DTfznKMKaPBh) ((gDorRusXxz4vI7fqTkfdRMN) this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp.getValue())).flPMk2Ix9h3b95v(this);
        ((HF5afwOkFj9V8) ((hwSYVZu6IevsK1z) this.iR1XUIc7FjhMl57O.getValue())).PQQPeCDD0JLCT3aLz.S1zP5M3X7Ukq3ROlZ87G9I(this);
        IPi49brQACDpXJTJMp7 = null;
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onListenerConnected() {
        StatusBarNotification[] activeNotifications;
        int size;
        int size2;
        super.onListenerConnected();
        IPi49brQACDpXJTJMp7 = new WeakReference(this);
        this.GO8WUug7ZWFCUI1zY = true;
        vuuAFB94cPCyZ24F3m3k vuuafb94cpcyz24f3m3k = this.FzogU2bPCQtD6a1hMYB1kyti;
        if (vuuafb94cpcyz24f3m3k == null) {
            vuuafb94cpcyz24f3m3k = null;
        }
        ComponentName componentName = vuuafb94cpcyz24f3m3k.BezslBgjveK3hODH;
        try {
            MediaSessionManager mediaSessionManager = vuuafb94cpcyz24f3m3k.ziNFA7KzVfc6;
            if (mediaSessionManager != null) {
                mediaSessionManager.addOnActiveSessionsChangedListener(vuuafb94cpcyz24f3m3k.S1zP5M3X7Ukq3ROlZ87G9I, componentName, vuuafb94cpcyz24f3m3k.axL8FocTDLUdzg0XScbO);
                vuuafb94cpcyz24f3m3k.BezslBgjveK3hODH(mediaSessionManager.getActiveSessions(componentName));
            }
        } catch (Exception e) {
            Emi5d0VyYZLZtm.ox9eclwMpRd(e);
        }
        pCmqsvINHWuPw6ahG<Map.Entry> pcmqsvinhwupw6ahg = this.yM5HHkk1MhPLZFYTHm2JjrArud;
        pcmqsvinhwupw6ahg.clear();
        if (this.cVfIGUKLEqID1HH) {
            try {
                activeNotifications = getActiveNotifications();
            } catch (Exception e2) {
                Emi5d0VyYZLZtm.Aboow6rUrcY2SrFRa46C6uy(e2);
                activeNotifications = null;
            } catch (OutOfMemoryError | SecurityException unused) {
                activeNotifications = null;
            }
            if (activeNotifications != null) {
                NotificationListenerService.RankingMap currentRanking = getCurrentRanking();
                for (StatusBarNotification statusBarNotification : activeNotifications) {
                    Aboow6rUrcY2SrFRa46C6uy(statusBarNotification, currentRanking);
                }
            }
        }
        CTid586a2W9uiqX3Zqsu cTid586a2W9uiqX3Zqsu = yZj7bj6KyeuYi9woqDlC;
        if (cTid586a2W9uiqX3Zqsu != null) {
            cTid586a2W9uiqX3Zqsu.gsHzEVTj1SCIPR = true;
            for (Map.Entry entry : pcmqsvinhwupw6ahg) {
                ArrayList arrayList = cTid586a2W9uiqX3Zqsu.WIXlfFpvH7glAGsUk3.GO8WUug7ZWFCUI1zY;
                if (!arrayList.isEmpty() && (size2 = arrayList.size() - 1) >= 0) {
                    while (true) {
                        int i = size2 - 1;
                        ((wCM739wpWKTM7TvL8KzIH) arrayList.get(size2)).HveD9n1tOYlffjJDxghBitYNgB((AlfjqIWYtShTgT) entry.getKey(), (vLj5VkJxtnUVpBDSpQ) entry.getValue(), true);
                        if (i < 0) {
                            break;
                        } else {
                            size2 = i;
                        }
                    }
                }
            }
            ArrayList arrayList2 = cTid586a2W9uiqX3Zqsu.LcvPFGYKhAm4SS5FZ.GO8WUug7ZWFCUI1zY;
            if (!arrayList2.isEmpty() && (size = arrayList2.size() - 1) >= 0) {
                while (true) {
                    int i2 = size - 1;
                    ((K7k5h9eP8ZEPomZ3e) arrayList2.get(size)).PQQPeCDD0JLCT3aLz();
                    if (i2 < 0) {
                        break;
                    } else {
                        size = i2;
                    }
                }
            }
            pcmqsvinhwupw6ahg.cCmbv8Tzd2QLd161ImIZUlZ8n = cTid586a2W9uiqX3Zqsu;
            for (vLj5VkJxtnUVpBDSpQ vlj5vkjxtnuvpbdspq : pcmqsvinhwupw6ahg.GO8WUug7ZWFCUI1zY.values()) {
                if (vlj5vkjxtnuvpbdspq.ox9eclwMpRd) {
                    cTid586a2W9uiqX3Zqsu.HveD9n1tOYlffjJDxghBitYNgB(vlj5vkjxtnuvpbdspq.S1zP5M3X7Ukq3ROlZ87G9I, vlj5vkjxtnuvpbdspq, vlj5vkjxtnuvpbdspq.PQQPeCDD0JLCT3aLz);
                    vlj5vkjxtnuvpbdspq.ox9eclwMpRd = false;
                    vlj5vkjxtnuvpbdspq.PQQPeCDD0JLCT3aLz = false;
                }
            }
            vuuAFB94cPCyZ24F3m3k vuuafb94cpcyz24f3m3k2 = this.FzogU2bPCQtD6a1hMYB1kyti;
            vuuAFB94cPCyZ24F3m3k vuuafb94cpcyz24f3m3k3 = vuuafb94cpcyz24f3m3k2 != null ? vuuafb94cpcyz24f3m3k2 : null;
            vuuafb94cpcyz24f3m3k3.H5sQ15nhYoaKKHhx = cTid586a2W9uiqX3Zqsu;
            if (vuuafb94cpcyz24f3m3k3.ToEIy0qfkltfGfO3vmAQG) {
                cTid586a2W9uiqX3Zqsu.axL8FocTDLUdzg0XScbO(vuuafb94cpcyz24f3m3k3.ox9eclwMpRd);
                vuuafb94cpcyz24f3m3k3.ToEIy0qfkltfGfO3vmAQG = false;
            }
            fXBtMGfTIjGSHgK542();
        }
        flPMk2Ix9h3b95v(false);
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onListenerDisconnected() {
        super.onListenerDisconnected();
        IPi49brQACDpXJTJMp7 = null;
        this.GO8WUug7ZWFCUI1zY = false;
        this.yM5HHkk1MhPLZFYTHm2JjrArud.clear();
        vuuAFB94cPCyZ24F3m3k vuuafb94cpcyz24f3m3k = this.FzogU2bPCQtD6a1hMYB1kyti;
        if (vuuafb94cpcyz24f3m3k == null) {
            vuuafb94cpcyz24f3m3k = null;
        }
        MediaSessionManager mediaSessionManager = vuuafb94cpcyz24f3m3k.ziNFA7KzVfc6;
        if (mediaSessionManager != null) {
            mediaSessionManager.removeOnActiveSessionsChangedListener(vuuafb94cpcyz24f3m3k.S1zP5M3X7Ukq3ROlZ87G9I);
        }
        vuuafb94cpcyz24f3m3k.Aboow6rUrcY2SrFRa46C6uy = null;
        vuuafb94cpcyz24f3m3k.axL8FocTDLUdzg0XScbO(null);
        vuuafb94cpcyz24f3m3k.JY5knQmh7EQJEZ = a9kWzoj6D3Yoa0.GO8WUug7ZWFCUI1zY;
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onNotificationPosted(StatusBarNotification statusBarNotification) {
        if (statusBarNotification == null) {
            return;
        }
        Aboow6rUrcY2SrFRa46C6uy(statusBarNotification, null);
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onNotificationRankingUpdate(NotificationListenerService.RankingMap rankingMap) {
        super.onNotificationRankingUpdate(rankingMap);
        if (rankingMap == null) {
            return;
        }
        this.tzMOyOc53ffl = rankingMap;
        this.tdNmBZIJHG1 = true;
        if (yZj7bj6KyeuYi9woqDlC != null) {
            fXBtMGfTIjGSHgK542();
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onNotificationRemoved(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap, int i) {
        PQQPeCDD0JLCT3aLz(statusBarNotification, Integer.valueOf(i));
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(str, "bitpit.launcher.key.NOTIFICATION_BATCHING_ENABLED") || OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(str, "bitpit.launcher.key.BATCH_SILENT_NOTIFICATIONS")) {
            flPMk2Ix9h3b95v(true);
        }
    }

    public final void ox9eclwMpRd(vQJ4Und6sZug3zzwEj0gveJQ1Ya vqj4und6szug3zzwej0gvejq1ya) {
        if (this.cVfIGUKLEqID1HH) {
            IyJ5Qc4DxtDd1Zs iyJ5Qc4DxtDd1Zs = this.J1BE9tYH1em4X1uAhc6L7f4M;
            if (iyJ5Qc4DxtDd1Zs == null || !iyJ5Qc4DxtDd1Zs.axL8FocTDLUdzg0XScbO(vqj4und6szug3zzwej0gvejq1ya)) {
                AlfjqIWYtShTgT alfjqIWYtShTgT = vqj4und6szug3zzwej0gvejq1ya.LcvPFGYKhAm4SS5FZ;
                pCmqsvINHWuPw6ahG pcmqsvinhwupw6ahg = this.yM5HHkk1MhPLZFYTHm2JjrArud;
                LinkedHashMap linkedHashMap = pcmqsvinhwupw6ahg.GO8WUug7ZWFCUI1zY;
                vLj5VkJxtnUVpBDSpQ vlj5vkjxtnuvpbdspq = (vLj5VkJxtnUVpBDSpQ) linkedHashMap.get(alfjqIWYtShTgT);
                if (vlj5vkjxtnuvpbdspq != null) {
                    vlj5vkjxtnuvpbdspq.S1zP5M3X7Ukq3ROlZ87G9I(vqj4und6szug3zzwej0gvejq1ya);
                } else {
                    linkedHashMap.put(alfjqIWYtShTgT, new vLj5VkJxtnUVpBDSpQ(vqj4und6szug3zzwej0gvejq1ya, alfjqIWYtShTgT, pcmqsvinhwupw6ahg.Rdzg08aYlt0UsoLUNug9cESzgAY9R, pcmqsvinhwupw6ahg));
                }
                vuuAFB94cPCyZ24F3m3k vuuafb94cpcyz24f3m3k = this.FzogU2bPCQtD6a1hMYB1kyti;
                if (vuuafb94cpcyz24f3m3k == null) {
                    vuuafb94cpcyz24f3m3k = null;
                }
                vuuafb94cpcyz24f3m3k.S1zP5M3X7Ukq3ROlZ87G9I(vqj4und6szug3zzwej0gvejq1ya, true);
            }
        }
    }

    public final void ziNFA7KzVfc6(int i, vQJ4Und6sZug3zzwEj0gveJQ1Ya vqj4und6szug3zzwej0gvejq1ya) {
        if (vqj4und6szug3zzwej0gvejq1ya.jvttfmFMQfShe6OfbNf1zF8CyEu == null) {
            vqj4und6szug3zzwej0gvejq1ya.jvttfmFMQfShe6OfbNf1zF8CyEu = Integer.valueOf(i);
            vqj4und6szug3zzwej0gvejq1ya.nXIf4d0RGTWG1l = Long.valueOf(System.currentTimeMillis());
        }
        rbpFGdpgDCAQXat.ziNFA7KzVfc6((zHfG9eBtghieLBn) this.Rdzg08aYlt0UsoLUNug9cESzgAY9R.getValue(), null, 0, new rQx2qnAJALGv3rjYdbUuz5(vqj4und6szug3zzwej0gvejq1ya, this, null, 22), 3);
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onNotificationPosted(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        if (statusBarNotification == null) {
            return;
        }
        Aboow6rUrcY2SrFRa46C6uy(statusBarNotification, rankingMap);
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onNotificationRemoved(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        PQQPeCDD0JLCT3aLz(statusBarNotification, null);
    }

    @Override // android.service.notification.NotificationListenerService
    public final void onNotificationRemoved(StatusBarNotification statusBarNotification) {
        PQQPeCDD0JLCT3aLz(statusBarNotification, null);
    }
}
