package bitpit.launcher.ui;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import b.AnTQUiiMDX9I7wKaq4;
import b.DqzIs39qhlX8it8XteO;
import b.NWyqkAjsN1jl9KJXUqKCsRcgv19;
import b.ZUboA6FxcG5CkT3ZuNeq;
import b.mHW63SUma8isGb;
import b.mIRAh3PBGe8whGSCNLDU;
import b.qAu8xPQt71QSu59v2YrEcbg7z;
import b.qSDYaDqxbBy2QEeVAcFRy;
import b.rX022g0AQSRH;
import b.xWEvOc3gqLSn1SXDt2GvNO3HGucdx;
import b.xxuAhbXqLMelne8pXLi;
import b.ycFnS0z9Ddi2h4oSFO3lrkbjZ0cm8;
import bitpit.launcher.R;
import bitpit.launcher.ui.AccessDeniedActivity;

/* JADX INFO: loaded from: classes.dex */
public final class AccessDeniedActivity extends qAu8xPQt71QSu59v2YrEcbg7z implements DqzIs39qhlX8it8XteO {
    public static final rX022g0AQSRH Companion = new rX022g0AQSRH();
    public TextView GtGIZrsiVJNzid1Vu8XK;
    public ViewGroup LkMPQqEJluZFFX0mL;
    public TextView N1ENDx3UBC9JxmcGQyn59aqjOM;
    public TextView iXk6STWDu48PQFwNyHwi2a;
    public final mHW63SUma8isGb ra4eheLgdhUxuEZ9vbYShAWJ = qSDYaDqxbBy2QEeVAcFRy.Aboow6rUrcY2SrFRa46C6uy(1, new mIRAh3PBGe8whGSCNLDU(0, this));
    public final NWyqkAjsN1jl9KJXUqKCsRcgv19 NceuzZQj3FhQAg0L = new NWyqkAjsN1jl9KJXUqKCsRcgv19(this);
    public final ZUboA6FxcG5CkT3ZuNeq lgJtMcdLJn14MkPMn = ZUboA6FxcG5CkT3ZuNeq.f2sXlW3st0rAKJwyOrCfOWc;

    @Override // b.DqzIs39qhlX8it8XteO
    public final void BezslBgjveK3hODH(ycFnS0z9Ddi2h4oSFO3lrkbjZ0cm8 ycfns0z9ddi2h4osfo3lrkbjz0cm8) {
    }

    public final void czGAefXQxIZzo(xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdx) {
        final int i = 1;
        if (xwevoc3gqlsn1sxdt2gvno3hgucdx != null && xwevoc3gqlsn1sxdt2gvno3hgucdx.ziNFA7KzVfc6.axL8FocTDLUdzg0XScbO) {
            finish();
        }
        TextView textView = this.N1ENDx3UBC9JxmcGQyn59aqjOM;
        if (textView == null) {
            textView = null;
        }
        String string = xwevoc3gqlsn1sxdt2gvno3hgucdx != null ? xwevoc3gqlsn1sxdt2gvno3hgucdx.S1zP5M3X7Ukq3ROlZ87G9I.toString() : null;
        if (string == null) {
            string = "";
        }
        textView.setText(string);
        TextView textView2 = this.GtGIZrsiVJNzid1Vu8XK;
        TextView textView3 = textView2 != null ? textView2 : null;
        if (xwevoc3gqlsn1sxdt2gvno3hgucdx != null) {
            textView3.setText(getText(R.string.access_denied_refresh_access));
            textView3.setOnClickListener(new View.OnClickListener(this) { // from class: b.ShGcDmfBbfH3IkMLP
                public final /* synthetic */ AccessDeniedActivity Rdzg08aYlt0UsoLUNug9cESzgAY9R;

                {
                    this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i2 = i;
                    vOL3U3fINHMmdVoJz vol3u3finhmmdvojz = null;
                    AccessDeniedActivity accessDeniedActivity = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
                    int i3 = 0;
                    switch (i2) {
                        case 0:
                            rX022g0AQSRH rx022g0aqsrh = AccessDeniedActivity.Companion;
                            rbpFGdpgDCAQXat.ziNFA7KzVfc6(LqH09V6V7Wln.Aboow6rUrcY2SrFRa46C6uy(accessDeniedActivity), null, 0, new DZALESDEZkZfdDzkr5KAfKntrqN(accessDeniedActivity, vol3u3finhmmdvojz, i3), 3);
                            break;
                        default:
                            rX022g0AQSRH rx022g0aqsrh2 = AccessDeniedActivity.Companion;
                            rbpFGdpgDCAQXat.ziNFA7KzVfc6(LqH09V6V7Wln.Aboow6rUrcY2SrFRa46C6uy(accessDeniedActivity), null, 0, new DZALESDEZkZfdDzkr5KAfKntrqN(accessDeniedActivity, vol3u3finhmmdvojz, 1), 3);
                            break;
                    }
                }
            });
        } else {
            textView3.setText(getText(R.string.access_denied_sign_in));
            final int i2 = 0;
            textView3.setOnClickListener(new View.OnClickListener(this) { // from class: b.ShGcDmfBbfH3IkMLP
                public final /* synthetic */ AccessDeniedActivity Rdzg08aYlt0UsoLUNug9cESzgAY9R;

                {
                    this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = i2;
                    vOL3U3fINHMmdVoJz vol3u3finhmmdvojz = null;
                    AccessDeniedActivity accessDeniedActivity = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
                    int i4 = 0;
                    switch (i3) {
                        case 0:
                            rX022g0AQSRH rx022g0aqsrh = AccessDeniedActivity.Companion;
                            rbpFGdpgDCAQXat.ziNFA7KzVfc6(LqH09V6V7Wln.Aboow6rUrcY2SrFRa46C6uy(accessDeniedActivity), null, 0, new DZALESDEZkZfdDzkr5KAfKntrqN(accessDeniedActivity, vol3u3finhmmdvojz, i4), 3);
                            break;
                        default:
                            rX022g0AQSRH rx022g0aqsrh2 = AccessDeniedActivity.Companion;
                            rbpFGdpgDCAQXat.ziNFA7KzVfc6(LqH09V6V7Wln.Aboow6rUrcY2SrFRa46C6uy(accessDeniedActivity), null, 0, new DZALESDEZkZfdDzkr5KAfKntrqN(accessDeniedActivity, vol3u3finhmmdvojz, 1), 3);
                            break;
                    }
                }
            });
        }
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z, b.nJMkSIuTHA4ytmN, b.QKXpIUPLGn, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.access_denied_activity);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.root_view);
        this.LkMPQqEJluZFFX0mL = viewGroup;
        this.N1ENDx3UBC9JxmcGQyn59aqjOM = (TextView) viewGroup.findViewById(R.id.content_text_view);
        ViewGroup viewGroup2 = this.LkMPQqEJluZFFX0mL;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        this.GtGIZrsiVJNzid1Vu8XK = (TextView) viewGroup2.findViewById(R.id.button_positive);
        ViewGroup viewGroup3 = this.LkMPQqEJluZFFX0mL;
        if (viewGroup3 == null) {
            viewGroup3 = null;
        }
        this.iXk6STWDu48PQFwNyHwi2a = (TextView) viewGroup3.findViewById(R.id.button_negative);
        mHW63SUma8isGb mhw63suma8isgb = this.ra4eheLgdhUxuEZ9vbYShAWJ;
        ((bitpit.launcher.niagarald.NniqwgLR9Jo6Bl9Px0S5u) ((xxuAhbXqLMelne8pXLi) mhw63suma8isgb.getValue())).f2sXlW3st0rAKJwyOrCfOWc.axL8FocTDLUdzg0XScbO(this);
        TextView textView = this.iXk6STWDu48PQFwNyHwi2a;
        TextView textView2 = textView != null ? textView : null;
        textView2.setText(getText(R.string.pref_switch_launcher));
        textView2.setOnClickListener(new AnTQUiiMDX9I7wKaq4(0, this, textView2));
        czGAefXQxIZzo(((bitpit.launcher.niagarald.NniqwgLR9Jo6Bl9Px0S5u) ((xxuAhbXqLMelne8pXLi) mhw63suma8isgb.getValue())).PQQPeCDD0JLCT3aLz());
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z
    public final ViewGroup qaDSpeex0Oo1Qvt3oOrTJnbcQFp() {
        ViewGroup viewGroup = this.LkMPQqEJluZFFX0mL;
        if (viewGroup == null) {
            return null;
        }
        return viewGroup;
    }

    @Override // b.DqzIs39qhlX8it8XteO
    public final void sBV5EuS0mGuEYqc5nc5erhuwb1OG7(xWEvOc3gqLSn1SXDt2GvNO3HGucdx xwevoc3gqlsn1sxdt2gvno3hgucdx, boolean z) {
        czGAefXQxIZzo(xwevoc3gqlsn1sxdt2gvno3hgucdx);
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z
    public final ZUboA6FxcG5CkT3ZuNeq sCPtafveBAhdLIs2ajN3WV() {
        return this.lgJtMcdLJn14MkPMn;
    }
}
