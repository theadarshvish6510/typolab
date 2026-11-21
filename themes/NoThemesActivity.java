package bitpit.launcher.themes;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.constraintlayout.widget.Guideline;
import b.ASUMsEp8e0SCC63Io08GE8;
import b.FBt4N9gMbTjpN;
import b.LqH09V6V7Wln;
import b.NPEmLML2NIbfyu6v42zIhMiyx;
import b.Ne7IrXfSjRisooSM;
import b.Qs5il4A81sbf73pL1Mwnj;
import b.ZUboA6FxcG5CkT3ZuNeq;
import b.mHW63SUma8isGb;
import b.mIRAh3PBGe8whGSCNLDU;
import b.mPHrBL8dw2;
import b.qAu8xPQt71QSu59v2YrEcbg7z;
import b.qSDYaDqxbBy2QEeVAcFRy;
import b.rQ9HJYgnWGlaj05E54n4BwVJQ8oK;
import b.rbpFGdpgDCAQXat;
import bitpit.launcher.R;
import bitpit.launcher.screen.CustomExtendedFab;
import bitpit.launcher.themes.NoThemesActivity;
import bitpit.launcher.themes.ThemesActivity;
import bitpit.launcher.theming.wallpapers.WallpaperCollectionActivity;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class NoThemesActivity extends qAu8xPQt71QSu59v2YrEcbg7z {
    public static final NPEmLML2NIbfyu6v42zIhMiyx Companion = new NPEmLML2NIbfyu6v42zIhMiyx();
    public Guideline GtGIZrsiVJNzid1Vu8XK;
    public ViewGroup LkMPQqEJluZFFX0mL;
    public Guideline N1ENDx3UBC9JxmcGQyn59aqjOM;
    public MaterialButton iXk6STWDu48PQFwNyHwi2a;
    public boolean kDXsiSdVdmgsTVimtHda0;
    public MaterialButton xkTHQiCuIkifVig404IU19;
    public CustomExtendedFab ymQF046nqhMXpxNsXtOg;
    public final ZUboA6FxcG5CkT3ZuNeq ra4eheLgdhUxuEZ9vbYShAWJ = ZUboA6FxcG5CkT3ZuNeq.cCmbv8Tzd2QLd161ImIZUlZ8n;
    public final boolean NceuzZQj3FhQAg0L = true;
    public final mHW63SUma8isGb lgJtMcdLJn14MkPMn = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new mIRAh3PBGe8whGSCNLDU(7, this));

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z, b.nJMkSIuTHA4ytmN, b.QKXpIUPLGn, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final int i = 0;
        this.kDXsiSdVdmgsTVimtHda0 = bundle != null ? bundle.getBoolean("child_activity_launched") : false;
        setTheme(((bitpit.launcher.theming.NniqwgLR9Jo6Bl9Px0S5u) J1BE9tYH1em4X1uAhc6L7f4M()).jvttfmFMQfShe6OfbNf1zF8CyEu.S1zP5M3X7Ukq3ROlZ87G9I.tzMOyOc53ffl ? R.style.DefaultTheme_Black : R.style.DefaultTheme);
        final int i2 = 1;
        getTheme().applyStyle(R.style.ThemeOverlay_SystemBars_Transparent_DarkBackground, true);
        rQ9HJYgnWGlaj05E54n4BwVJQ8oK.BezslBgjveK3hODH(getWindow());
        setContentView(R.layout.no_themes_activity);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.root_view);
        this.LkMPQqEJluZFFX0mL = viewGroup;
        viewGroup.setBackground(new ASUMsEp8e0SCC63Io08GE8(this));
        this.N1ENDx3UBC9JxmcGQyn59aqjOM = (Guideline) findViewById(R.id.guideline_top);
        this.GtGIZrsiVJNzid1Vu8XK = (Guideline) findViewById(R.id.guideline_bottom);
        this.iXk6STWDu48PQFwNyHwi2a = (MaterialButton) findViewById(R.id.button_back);
        this.ymQF046nqhMXpxNsXtOg = (CustomExtendedFab) findViewById(R.id.button_pick_ready_made_theme);
        this.xkTHQiCuIkifVig404IU19 = (MaterialButton) findViewById(R.id.button_create_own_theme);
        ViewGroup viewGroup2 = this.LkMPQqEJluZFFX0mL;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        FBt4N9gMbTjpN fBt4N9gMbTjpN = new FBt4N9gMbTjpN(13, this);
        WeakHashMap weakHashMap = Ne7IrXfSjRisooSM.S1zP5M3X7Ukq3ROlZ87G9I;
        Qs5il4A81sbf73pL1Mwnj.ToEIy0qfkltfGfO3vmAQG(viewGroup2, fBt4N9gMbTjpN);
        MaterialButton materialButton = this.iXk6STWDu48PQFwNyHwi2a;
        if (materialButton == null) {
            materialButton = null;
        }
        materialButton.setOnClickListener(new View.OnClickListener(this) { // from class: b.VquUzzfi9Xwe39WbkNce8AOdVLAH4
            public final /* synthetic */ NoThemesActivity Rdzg08aYlt0UsoLUNug9cESzgAY9R;

            {
                this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                NoThemesActivity noThemesActivity = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
                switch (i3) {
                    case 0:
                        NPEmLML2NIbfyu6v42zIhMiyx nPEmLML2NIbfyu6v42zIhMiyx = NoThemesActivity.Companion;
                        noThemesActivity.finish();
                        break;
                    case 1:
                        noThemesActivity.kDXsiSdVdmgsTVimtHda0 = true;
                        ThemesActivity.Companion.getClass();
                        cnceRC0XOJ7eD4ltUIwlj.S1zP5M3X7Ukq3ROlZ87G9I(1, noThemesActivity, null);
                        break;
                    default:
                        noThemesActivity.kDXsiSdVdmgsTVimtHda0 = true;
                        Intent intent = new Intent(noThemesActivity, (Class<?>) WallpaperCollectionActivity.class);
                        intent.setSourceBounds(null);
                        try {
                            noThemesActivity.startActivity(intent, ow4bmvzKZeUYgbzTvf2.ox9eclwMpRd(ActivityOptions.makeCustomAnimation(noThemesActivity, R.anim.slide_in_bottom, R.anim.slide_out_top)));
                        } catch (Exception unused) {
                            Toast.makeText(noThemesActivity, R.string.error_unknown, 0).show();
                        }
                        break;
                }
            }
        });
        CustomExtendedFab customExtendedFab = this.ymQF046nqhMXpxNsXtOg;
        if (customExtendedFab == null) {
            customExtendedFab = null;
        }
        customExtendedFab.setOnClickListener(new View.OnClickListener(this) { // from class: b.VquUzzfi9Xwe39WbkNce8AOdVLAH4
            public final /* synthetic */ NoThemesActivity Rdzg08aYlt0UsoLUNug9cESzgAY9R;

            {
                this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                NoThemesActivity noThemesActivity = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
                switch (i3) {
                    case 0:
                        NPEmLML2NIbfyu6v42zIhMiyx nPEmLML2NIbfyu6v42zIhMiyx = NoThemesActivity.Companion;
                        noThemesActivity.finish();
                        break;
                    case 1:
                        noThemesActivity.kDXsiSdVdmgsTVimtHda0 = true;
                        ThemesActivity.Companion.getClass();
                        cnceRC0XOJ7eD4ltUIwlj.S1zP5M3X7Ukq3ROlZ87G9I(1, noThemesActivity, null);
                        break;
                    default:
                        noThemesActivity.kDXsiSdVdmgsTVimtHda0 = true;
                        Intent intent = new Intent(noThemesActivity, (Class<?>) WallpaperCollectionActivity.class);
                        intent.setSourceBounds(null);
                        try {
                            noThemesActivity.startActivity(intent, ow4bmvzKZeUYgbzTvf2.ox9eclwMpRd(ActivityOptions.makeCustomAnimation(noThemesActivity, R.anim.slide_in_bottom, R.anim.slide_out_top)));
                        } catch (Exception unused) {
                            Toast.makeText(noThemesActivity, R.string.error_unknown, 0).show();
                        }
                        break;
                }
            }
        });
        MaterialButton materialButton2 = this.xkTHQiCuIkifVig404IU19;
        final int i3 = 2;
        (materialButton2 != null ? materialButton2 : null).setOnClickListener(new View.OnClickListener(this) { // from class: b.VquUzzfi9Xwe39WbkNce8AOdVLAH4
            public final /* synthetic */ NoThemesActivity Rdzg08aYlt0UsoLUNug9cESzgAY9R;

            {
                this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                NoThemesActivity noThemesActivity = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
                switch (i4) {
                    case 0:
                        NPEmLML2NIbfyu6v42zIhMiyx nPEmLML2NIbfyu6v42zIhMiyx = NoThemesActivity.Companion;
                        noThemesActivity.finish();
                        break;
                    case 1:
                        noThemesActivity.kDXsiSdVdmgsTVimtHda0 = true;
                        ThemesActivity.Companion.getClass();
                        cnceRC0XOJ7eD4ltUIwlj.S1zP5M3X7Ukq3ROlZ87G9I(1, noThemesActivity, null);
                        break;
                    default:
                        noThemesActivity.kDXsiSdVdmgsTVimtHda0 = true;
                        Intent intent = new Intent(noThemesActivity, (Class<?>) WallpaperCollectionActivity.class);
                        intent.setSourceBounds(null);
                        try {
                            noThemesActivity.startActivity(intent, ow4bmvzKZeUYgbzTvf2.ox9eclwMpRd(ActivityOptions.makeCustomAnimation(noThemesActivity, R.anim.slide_in_bottom, R.anim.slide_out_top)));
                        } catch (Exception unused) {
                            Toast.makeText(noThemesActivity, R.string.error_unknown, 0).show();
                        }
                        break;
                }
            }
        });
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z, b.nJMkSIuTHA4ytmN, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.kDXsiSdVdmgsTVimtHda0) {
            rbpFGdpgDCAQXat.ziNFA7KzVfc6(LqH09V6V7Wln.Aboow6rUrcY2SrFRa46C6uy(this), null, 0, new mPHrBL8dw2(this, null, 29), 3);
        }
    }

    @Override // b.QKXpIUPLGn, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("child_activity_launched", this.kDXsiSdVdmgsTVimtHda0);
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z
    public final ViewGroup qaDSpeex0Oo1Qvt3oOrTJnbcQFp() {
        ViewGroup viewGroup = this.LkMPQqEJluZFFX0mL;
        if (viewGroup == null) {
            return null;
        }
        return viewGroup;
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z
    public final ZUboA6FxcG5CkT3ZuNeq sCPtafveBAhdLIs2ajN3WV() {
        return this.ra4eheLgdhUxuEZ9vbYShAWJ;
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z
    public final boolean yM5HHkk1MhPLZFYTHm2JjrArud() {
        return this.NceuzZQj3FhQAg0L;
    }
}
