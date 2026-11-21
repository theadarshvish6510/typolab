package bitpit.launcher.theming.wallpaper;

import android.hardware.display.DisplayManager;
import android.net.Uri;
import b.Emi5d0VyYZLZtm;
import b.Hnv6Te9rrTA0VqZMo;
import b.J7Tsg1eqTfbK8vIo4RFOyjPiu;
import b.Rfp0CprLjJaYY8aiYk;
import b.RuCg3XXu7LZvyo5FXJBn;
import b.St4uuNDPT6JWwQ0b4Ccvx2tANwVJk;
import b.Zju0RZrDKb;
import b.eHTq25lecw1gJw29hkAGanLM;
import b.ggQP1X3lG5YnLLjqLL6mgwsyjxGH;
import b.l7YDOnqLZi7ksTcZXYRzDOOs;
import b.r60CZQ816LNxQ;
import b.s9XnN7QTAJ;
import b.uuyTGGFjNDiF1SxHW;
import b.vOL3U3fINHMmdVoJz;
import b.yIUmlJr4ry9bFfGUrtH;
import b.zHfG9eBtghieLBn;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class NniqwgLR9Jo6Bl9Px0S5u extends l7YDOnqLZi7ksTcZXYRzDOOs implements r60CZQ816LNxQ {
    public final /* synthetic */ Uri LcvPFGYKhAm4SS5FZ;
    public final /* synthetic */ yIUmlJr4ry9bFfGUrtH gsHzEVTj1SCIPR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NniqwgLR9Jo6Bl9Px0S5u(yIUmlJr4ry9bFfGUrtH yiumljr4ry9bffgurth, Uri uri, vOL3U3fINHMmdVoJz vol3u3finhmmdvojz) {
        super(2, vol3u3finhmmdvojz);
        this.gsHzEVTj1SCIPR = yiumljr4ry9bffgurth;
        this.LcvPFGYKhAm4SS5FZ = uri;
    }

    @Override // b.FpwejIoNZIEGVIRY
    public final Object HveD9n1tOYlffjJDxghBitYNgB(Object obj) {
        eHTq25lecw1gJw29hkAGanLM ehtq25lecw1gjw29hkaganlmH5sQ15nhYoaKKHhx;
        Uri uri = this.LcvPFGYKhAm4SS5FZ;
        yIUmlJr4ry9bFfGUrtH yiumljr4ry9bffgurth = this.gsHzEVTj1SCIPR;
        Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
        try {
            St4uuNDPT6JWwQ0b4Ccvx2tANwVJk st4uuNDPT6JWwQ0b4Ccvx2tANwVJk = yIUmlJr4ry9bFfGUrtH.Companion;
            RuCg3XXu7LZvyo5FXJBn ruCg3XXu7LZvyo5FXJBnAxL8FocTDLUdzg0XScbO = yiumljr4ry9bffgurth.axL8FocTDLUdzg0XScbO(uri);
            if (ruCg3XXu7LZvyo5FXJBnAxL8FocTDLUdzg0XScbO == null) {
                WallpaperException.FileError.UserWallpaperFileNotFound userWallpaperFileNotFound = new WallpaperException.FileError.UserWallpaperFileNotFound(null);
                J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                return new J7Tsg1eqTfbK8vIo4RFOyjPiu(new Rfp0CprLjJaYY8aiYk(userWallpaperFileNotFound));
            }
            int i = ruCg3XXu7LZvyo5FXJBnAxL8FocTDLUdzg0XScbO.S1zP5M3X7Ukq3ROlZ87G9I;
            int i2 = ruCg3XXu7LZvyo5FXJBnAxL8FocTDLUdzg0XScbO.axL8FocTDLUdzg0XScbO;
            String str = ruCg3XXu7LZvyo5FXJBnAxL8FocTDLUdzg0XScbO.BezslBgjveK3hODH;
            Integer numZiNFA7KzVfc6 = yiumljr4ry9bffgurth.ziNFA7KzVfc6(uri);
            if (numZiNFA7KzVfc6 == null) {
                WallpaperException.FileError.UserWallpaperFileNotFound userWallpaperFileNotFound2 = new WallpaperException.FileError.UserWallpaperFileNotFound(null);
                J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                return new J7Tsg1eqTfbK8vIo4RFOyjPiu(new Rfp0CprLjJaYY8aiYk(userWallpaperFileNotFound2));
            }
            int iIntValue = numZiNFA7KzVfc6.intValue();
            Object systemService = yiumljr4ry9bffgurth.S1zP5M3X7Ukq3ROlZ87G9I.getSystemService((Class<Object>) DisplayManager.class);
            if (systemService != null) {
                ehtq25lecw1gjw29hkaganlmH5sQ15nhYoaKKHhx = Zju0RZrDKb.H5sQ15nhYoaKKHhx(((DisplayManager) systemService).getDisplay(0));
            } else {
                uuyTGGFjNDiF1SxHW.PQQPeCDD0JLCT3aLz("Required value was null.");
                ehtq25lecw1gjw29hkaganlmH5sQ15nhYoaKKHhx = null;
            }
            eHTq25lecw1gJw29hkAGanLM ehtq25lecw1gjw29hkaganlmS1zP5M3X7Ukq3ROlZ87G9I = ehtq25lecw1gjw29hkaganlmH5sQ15nhYoaKKHhx.S1zP5M3X7Ukq3ROlZ87G9I();
            if ((((iIntValue == 1 || iIntValue == 0) && ggQP1X3lG5YnLLjqLL6mgwsyjxGH.gsHzEVTj1SCIPR(yIUmlJr4ry9bFfGUrtH.BezslBgjveK3hODH, str)) ? yiumljr4ry9bffgurth.PQQPeCDD0JLCT3aLz(uri, i, i2, ehtq25lecw1gjw29hkaganlmS1zP5M3X7Ukq3ROlZ87G9I) : yiumljr4ry9bffgurth.ox9eclwMpRd(this.LcvPFGYKhAm4SS5FZ, i, i2, iIntValue, ehtq25lecw1gjw29hkaganlmS1zP5M3X7Ukq3ROlZ87G9I)) != 0) {
                J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
                return new J7Tsg1eqTfbK8vIo4RFOyjPiu(s9XnN7QTAJ.S1zP5M3X7Ukq3ROlZ87G9I);
            }
            WallpaperException.SystemSetWallpaperFailed systemSetWallpaperFailed = new WallpaperException.SystemSetWallpaperFailed(null);
            Emi5d0VyYZLZtm.Aboow6rUrcY2SrFRa46C6uy(systemSetWallpaperFailed);
            J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
            return new J7Tsg1eqTfbK8vIo4RFOyjPiu(new Rfp0CprLjJaYY8aiYk(systemSetWallpaperFailed));
        } catch (IOException e) {
            Emi5d0VyYZLZtm.Aboow6rUrcY2SrFRa46C6uy(e);
            WallpaperException.FileError.UserWallpaperFileNotFound userWallpaperFileNotFound3 = new WallpaperException.FileError.UserWallpaperFileNotFound(e);
            J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
            return new J7Tsg1eqTfbK8vIo4RFOyjPiu(new Rfp0CprLjJaYY8aiYk(userWallpaperFileNotFound3));
        } catch (SecurityException e2) {
            Emi5d0VyYZLZtm.Aboow6rUrcY2SrFRa46C6uy(e2);
            WallpaperException.FileError.UserWallpaperFileNotFound userWallpaperFileNotFound4 = new WallpaperException.FileError.UserWallpaperFileNotFound(e2);
            J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
            return new J7Tsg1eqTfbK8vIo4RFOyjPiu(new Rfp0CprLjJaYY8aiYk(userWallpaperFileNotFound4));
        }
    }

    @Override // b.FpwejIoNZIEGVIRY
    public final vOL3U3fINHMmdVoJz ToEIy0qfkltfGfO3vmAQG(vOL3U3fINHMmdVoJz vol3u3finhmmdvojz, Object obj) {
        return new NniqwgLR9Jo6Bl9Px0S5u(this.gsHzEVTj1SCIPR, this.LcvPFGYKhAm4SS5FZ, vol3u3finhmmdvojz);
    }

    @Override // b.r60CZQ816LNxQ
    public final Object flPMk2Ix9h3b95v(Object obj, Object obj2) {
        return ((NniqwgLR9Jo6Bl9Px0S5u) ToEIy0qfkltfGfO3vmAQG((vOL3U3fINHMmdVoJz) obj2, (zHfG9eBtghieLBn) obj)).HveD9n1tOYlffjJDxghBitYNgB(s9XnN7QTAJ.S1zP5M3X7Ukq3ROlZ87G9I);
    }
}
