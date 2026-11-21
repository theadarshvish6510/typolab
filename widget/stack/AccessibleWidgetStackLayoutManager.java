package bitpit.launcher.widget.stack;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.NdfALyBmqoUgH2lf;
import b.gIQ6BdvuE0XFbBaF;
import b.pHA0P4Gw3bV;
import b.uuyTGGFjNDiF1SxHW;

/* JADX INFO: loaded from: classes.dex */
public final class AccessibleWidgetStackLayoutManager extends LinearLayoutManager implements gIQ6BdvuE0XFbBaF {
    public final float Mej0x2K4ZGSUxtYNka4QZ;
    public int qTa7aqjjB9Bt6mc;

    public AccessibleWidgetStackLayoutManager(Context context, float f) {
        super(context, 0, false);
        this.Mej0x2K4ZGSUxtYNka4QZ = f;
        this.qTa7aqjjB9Bt6mc = 1;
    }

    @Override // b.gIQ6BdvuE0XFbBaF
    public final int Aboow6rUrcY2SrFRa46C6uy() {
        return this.qTa7aqjjB9Bt6mc;
    }

    @Override // b.gIQ6BdvuE0XFbBaF
    public final void BezslBgjveK3hODH(int i) {
        if (1 > i || i > Integer.MAX_VALUE) {
            uuyTGGFjNDiF1SxHW.PQQPeCDD0JLCT3aLz("Failed requirement.");
        } else {
            this.qTa7aqjjB9Bt6mc = i;
        }
    }

    @Override // b.FdefTICOs2UQ1fmh66Mky
    public final void PQQPeCDD0JLCT3aLz(View view, int i) {
        JY5knQmh7EQJEZ(view, i, false);
        view.getLayoutParams().width = this.HveD9n1tOYlffjJDxghBitYNgB / this.qTa7aqjjB9Bt6mc;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b.FdefTICOs2UQ1fmh66Mky
    public final boolean fXBtMGfTIjGSHgK542() {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b.FdefTICOs2UQ1fmh66Mky
    public final boolean flPMk2Ix9h3b95v() {
        return super.flPMk2Ix9h3b95v() && tdNmBZIJHG1() > this.qTa7aqjjB9Bt6mc;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, b.FdefTICOs2UQ1fmh66Mky
    public final void nYT0DKgXJwaKUiSwy0PVds(RecyclerView recyclerView, pHA0P4Gw3bV pha0p4gw3bv, int i) {
        NdfALyBmqoUgH2lf ndfALyBmqoUgH2lf = new NdfALyBmqoUgH2lf(recyclerView.getContext(), this.Mej0x2K4ZGSUxtYNka4QZ);
        ndfALyBmqoUgH2lf.S1zP5M3X7Ukq3ROlZ87G9I = i;
        XsOEcVh9yrEYbnc(ndfALyBmqoUgH2lf);
    }
}
