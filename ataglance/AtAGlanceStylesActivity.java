package bitpit.launcher.ataglance;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b.ASDwBkZhws;
import b.AhIYAsrrj3BcWG;
import b.C6QK4ofHI3PMsCdB5gHo5Q;
import b.CWrU38EGd8CJKwnJ2WJ;
import b.GkEpHTllUQBkRob2X6;
import b.JHnppaRJDZMMWaOU5cgIw;
import b.KjpLK4IQzcoI;
import b.LqH09V6V7Wln;
import b.NdHgGJm8ARUBFS;
import b.Ne7IrXfSjRisooSM;
import b.OAbMlpbVJU98L0lW2oHBNkO;
import b.OkhdZkC3NYLW;
import b.POLYDU3BdDlat;
import b.Qs5il4A81sbf73pL1Mwnj;
import b.TXotOFAXyesISl;
import b.UHUzfrCtV0bKdPp9KPrZVY;
import b.XSiZqjZ3VeBTuhOwd;
import b.ZUboA6FxcG5CkT3ZuNeq;
import b.a4mKF3RHQRHGEYXlfylvHn;
import b.aGvtvP8CxSeJF;
import b.fJYurV0RINLuDr3D8tga69;
import b.gSPU8clJEfIPb0EQSKTd;
import b.gT4sTdpjS277wbG60pk72fHWG7;
import b.jZVEAMvY0wczSb7lNA;
import b.kLnZvLaq9JkPUaVA;
import b.mGTzVH0lYzo3iE5Sh6CQcEh8AZE4J;
import b.nmXVdLD3wuhaqezxBBvorxOjwLT;
import b.qAu8xPQt71QSu59v2YrEcbg7z;
import b.rQ9HJYgnWGlaj05E54n4BwVJQ8oK;
import b.vOL3U3fINHMmdVoJz;
import bitpit.launcher.R;
import bitpit.launcher.theming.CustomMaterialYouColorFamily;
import bitpit.launcher.ui.MotionLayoutRubberBandChild;
import bitpit.launcher.ui.RubberBandLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class AtAGlanceStylesActivity extends qAu8xPQt71QSu59v2YrEcbg7z {
    public static final AhIYAsrrj3BcWG Companion = new AhIYAsrrj3BcWG();
    public RecyclerView LkMPQqEJluZFFX0mL;
    public ViewGroup lgJtMcdLJn14MkPMn;
    public final ZUboA6FxcG5CkT3ZuNeq ra4eheLgdhUxuEZ9vbYShAWJ = ZUboA6FxcG5CkT3ZuNeq.gsHzEVTj1SCIPR;
    public final jZVEAMvY0wczSb7lNA NceuzZQj3FhQAg0L = (jZVEAMvY0wczSb7lNA) GkEpHTllUQBkRob2X6.ziNFA7KzVfc6(this).S1zP5M3X7Ukq3ROlZ87G9I(JHnppaRJDZMMWaOU5cgIw.S1zP5M3X7Ukq3ROlZ87G9I(jZVEAMvY0wczSb7lNA.class), null, null);

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z, b.nJMkSIuTHA4ytmN, b.QKXpIUPLGn, android.app.Activity
    public final void onCreate(Bundle bundle) {
        CustomMaterialYouColorFamily customMaterialYouColorFamily;
        super.onCreate(bundle);
        setTheme(((bitpit.launcher.theming.NniqwgLR9Jo6Bl9Px0S5u) J1BE9tYH1em4X1uAhc6L7f4M()).jvttfmFMQfShe6OfbNf1zF8CyEu.S1zP5M3X7Ukq3ROlZ87G9I.tzMOyOc53ffl ? R.style.DefaultTheme_Black : R.style.DefaultTheme);
        rQ9HJYgnWGlaj05E54n4BwVJQ8oK.BezslBgjveK3hODH(getWindow());
        setContentView(R.layout.at_a_glance_styles_activity);
        this.lgJtMcdLJn14MkPMn = (ViewGroup) findViewById(R.id.root_view);
        RubberBandLayout rubberBandLayout = (RubberBandLayout) findViewById(R.id.rubber_band_layout);
        MotionLayoutRubberBandChild motionLayoutRubberBandChild = (MotionLayoutRubberBandChild) findViewById(R.id.motion_layout);
        TextView textView = (TextView) findViewById(R.id.header_text_view);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = 0;
        fJYurV0RINLuDr3D8tga69.axL8FocTDLUdzg0XScbO(spannableStringBuilder, this, getDrawable(R.drawable.ic_ip_act_niagara_pro), Integer.valueOf(R.attr.primaryColor), false);
        spannableStringBuilder.append(textView.getText());
        textView.setText(spannableStringBuilder);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        this.LkMPQqEJluZFFX0mL = recyclerView;
        recyclerView.setClipChildren(false);
        motionLayoutRubberBandChild.setRubberBandLayout(rubberBandLayout);
        RecyclerView recyclerView2 = this.LkMPQqEJluZFFX0mL;
        byte b2 = 0;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setHasFixedSize(true);
        RecyclerView recyclerView3 = this.LkMPQqEJluZFFX0mL;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        recyclerView3.setEdgeEffectFactory(new CWrU38EGd8CJKwnJ2WJ(rubberBandLayout));
        OAbMlpbVJU98L0lW2oHBNkO.BezslBgjveK3hODH(motionLayoutRubberBandChild, new kLnZvLaq9JkPUaVA(i));
        ViewGroup viewGroup = this.lgJtMcdLJn14MkPMn;
        if (viewGroup == null) {
            viewGroup = null;
        }
        a4mKF3RHQRHGEYXlfylvHn a4mkf3rhqrhgeyxlfylvhn = new a4mKF3RHQRHGEYXlfylvHn(i, textView, this);
        WeakHashMap weakHashMap = Ne7IrXfSjRisooSM.S1zP5M3X7Ukq3ROlZ87G9I;
        Qs5il4A81sbf73pL1Mwnj.ToEIy0qfkltfGfO3vmAQG(viewGroup, a4mkf3rhqrhgeyxlfylvhn);
        C6QK4ofHI3PMsCdB5gHo5Q c6QK4ofHI3PMsCdB5gHo5Q = nmXVdLD3wuhaqezxBBvorxOjwLT.Companion;
        Integer numValueOf = Integer.valueOf(getIntent().getIntExtra("arg_material_you_fallback_color_family", ((bitpit.launcher.theming.NniqwgLR9Jo6Bl9Px0S5u) J1BE9tYH1em4X1uAhc6L7f4M()).HveD9n1tOYlffjJDxghBitYNgB().ziNFA7KzVfc6.getSerialized().intValue()));
        CustomMaterialYouColorFamily[] customMaterialYouColorFamilyArrValues = CustomMaterialYouColorFamily.values();
        int length = customMaterialYouColorFamilyArrValues.length;
        while (true) {
            if (i >= length) {
                customMaterialYouColorFamily = null;
                break;
            }
            customMaterialYouColorFamily = customMaterialYouColorFamilyArrValues[i];
            if (OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(customMaterialYouColorFamily.getSerialized(), numValueOf)) {
                break;
            } else {
                i++;
            }
        }
        if (customMaterialYouColorFamily == null) {
            NdHgGJm8ARUBFS.ToEIy0qfkltfGfO3vmAQG(numValueOf);
            return;
        }
        Intent intent = getIntent();
        POLYDU3BdDlat pOLYDU3BdDlat = (POLYDU3BdDlat) (gT4sTdpjS277wbG60pk72fHWG7.JY5knQmh7EQJEZ ? (Parcelable) intent.getParcelableExtra("arg_combined_anycons_palettes", POLYDU3BdDlat.class) : intent.getParcelableExtra("arg_combined_anycons_palettes"));
        if (pOLYDU3BdDlat == null) {
            pOLYDU3BdDlat = (POLYDU3BdDlat) ((bitpit.launcher.theming.NniqwgLR9Jo6Bl9Px0S5u) J1BE9tYH1em4X1uAhc6L7f4M()).J1BE9tYH1em4X1uAhc6L7f4M.GO8WUug7ZWFCUI1zY.getValue();
        }
        POLYDU3BdDlat pOLYDU3BdDlat2 = pOLYDU3BdDlat;
        ContextThemeWrapper contextThemeWrapperS1zP5M3X7Ukq3ROlZ87G9I = ASDwBkZhws.S1zP5M3X7Ukq3ROlZ87G9I(this, customMaterialYouColorFamily, ((bitpit.launcher.theming.NniqwgLR9Jo6Bl9Px0S5u) J1BE9tYH1em4X1uAhc6L7f4M()).yZj7bj6KyeuYi9woqDlC ? UHUzfrCtV0bKdPp9KPrZVY.Rdzg08aYlt0UsoLUNug9cESzgAY9R : UHUzfrCtV0bKdPp9KPrZVY.GO8WUug7ZWFCUI1zY);
        mGTzVH0lYzo3iE5Sh6CQcEh8AZE4J mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z = KjpLK4IQzcoI.LYcdI4xpry8eXmFC9I4wyaLdcG1z();
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(TXotOFAXyesISl.S1zP5M3X7Ukq3ROlZ87G9I);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(new NoClockStyle$Serialized());
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(TXotOFAXyesISl.axL8FocTDLUdzg0XScbO);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(TXotOFAXyesISl.BezslBgjveK3hODH);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(TXotOFAXyesISl.ziNFA7KzVfc6);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(TXotOFAXyesISl.Aboow6rUrcY2SrFRa46C6uy);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(TXotOFAXyesISl.ox9eclwMpRd);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(TXotOFAXyesISl.PQQPeCDD0JLCT3aLz);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(TXotOFAXyesISl.JY5knQmh7EQJEZ);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(TXotOFAXyesISl.flPMk2Ix9h3b95v);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(TXotOFAXyesISl.fXBtMGfTIjGSHgK542);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(TXotOFAXyesISl.LYcdI4xpry8eXmFC9I4wyaLdcG1z);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(TXotOFAXyesISl.ToEIy0qfkltfGfO3vmAQG);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(i0YlVphodcWUxwNU3hOoJ.S1zP5M3X7Ukq3ROlZ87G9I);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(i0YlVphodcWUxwNU3hOoJ.axL8FocTDLUdzg0XScbO);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(i0YlVphodcWUxwNU3hOoJ.BezslBgjveK3hODH);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(i0YlVphodcWUxwNU3hOoJ.ziNFA7KzVfc6);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(i0YlVphodcWUxwNU3hOoJ.Aboow6rUrcY2SrFRa46C6uy);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(i0YlVphodcWUxwNU3hOoJ.ox9eclwMpRd);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(qkRbKeI7vgjH72fB.S1zP5M3X7Ukq3ROlZ87G9I);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(qkRbKeI7vgjH72fB.BezslBgjveK3hODH);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(qkRbKeI7vgjH72fB.axL8FocTDLUdzg0XScbO);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(qkRbKeI7vgjH72fB.ziNFA7KzVfc6);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(qkRbKeI7vgjH72fB.Aboow6rUrcY2SrFRa46C6uy);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(qkRbKeI7vgjH72fB.ox9eclwMpRd);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(qkRbKeI7vgjH72fB.PQQPeCDD0JLCT3aLz);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(qkRbKeI7vgjH72fB.JY5knQmh7EQJEZ);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(qkRbKeI7vgjH72fB.LYcdI4xpry8eXmFC9I4wyaLdcG1z);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(qkRbKeI7vgjH72fB.flPMk2Ix9h3b95v);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(qkRbKeI7vgjH72fB.fXBtMGfTIjGSHgK542);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(qkRbKeI7vgjH72fB.ToEIy0qfkltfGfO3vmAQG);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(qkRbKeI7vgjH72fB.H5sQ15nhYoaKKHhx);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(qkRbKeI7vgjH72fB.HveD9n1tOYlffjJDxghBitYNgB);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(qkRbKeI7vgjH72fB.sBV5EuS0mGuEYqc5nc5erhuwb1OG7);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(qkRbKeI7vgjH72fB.Ql6q60SSx3);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(qkRbKeI7vgjH72fB.Bk6w7oZjoWt9ZSRs4C7jIhbX3);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(QYmREUxnplxOJLNn98BDpc019O.S1zP5M3X7Ukq3ROlZ87G9I);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(QYmREUxnplxOJLNn98BDpc019O.axL8FocTDLUdzg0XScbO);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(QYmREUxnplxOJLNn98BDpc019O.BezslBgjveK3hODH);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(QYmREUxnplxOJLNn98BDpc019O.ziNFA7KzVfc6);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(vxiZbdLTrD.S1zP5M3X7Ukq3ROlZ87G9I);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(vxiZbdLTrD.axL8FocTDLUdzg0XScbO);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(vxiZbdLTrD.BezslBgjveK3hODH);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(vxiZbdLTrD.ziNFA7KzVfc6);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(vxiZbdLTrD.Aboow6rUrcY2SrFRa46C6uy);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(vxiZbdLTrD.ox9eclwMpRd);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(vxiZbdLTrD.PQQPeCDD0JLCT3aLz);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(vxiZbdLTrD.LYcdI4xpry8eXmFC9I4wyaLdcG1z);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(UeQ6N4ecQ7ohQ.S1zP5M3X7Ukq3ROlZ87G9I);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(UeQ6N4ecQ7ohQ.axL8FocTDLUdzg0XScbO);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(UeQ6N4ecQ7ohQ.BezslBgjveK3hODH);
        mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z.add(UeQ6N4ecQ7ohQ.ziNFA7KzVfc6);
        mGTzVH0lYzo3iE5Sh6CQcEh8AZE4J mgtzvh0lyzo3ie5sh6cqceh8aze4jPQQPeCDD0JLCT3aLz = KjpLK4IQzcoI.PQQPeCDD0JLCT3aLz(mgtzvh0lyzo3ie5sh6cqceh8aze4jLYcdI4xpry8eXmFC9I4wyaLdcG1z);
        gSPU8clJEfIPb0EQSKTd gspu8cljefipb0eqsktdAboow6rUrcY2SrFRa46C6uy = LqH09V6V7Wln.Aboow6rUrcY2SrFRa46C6uy(this);
        XSiZqjZ3VeBTuhOwd xSiZqjZ3VeBTuhOwd = new XSiZqjZ3VeBTuhOwd((Object) this, (vOL3U3fINHMmdVoJz) (b2 == true ? 1 : 0), 8);
        jZVEAMvY0wczSb7lNA jzveamvy0wczsb7lna = this.NceuzZQj3FhQAg0L;
        aGvtvP8CxSeJF agvtvp8cxsejf = new aGvtvP8CxSeJF(gspu8cljefipb0eqsktdAboow6rUrcY2SrFRa46C6uy, contextThemeWrapperS1zP5M3X7Ukq3ROlZ87G9I, pOLYDU3BdDlat2, mgtzvh0lyzo3ie5sh6cqceh8aze4jPQQPeCDD0JLCT3aLz, xSiZqjZ3VeBTuhOwd, jzveamvy0wczsb7lna.S1zP5M3X7Ukq3ROlZ87G9I, jzveamvy0wczsb7lna.axL8FocTDLUdzg0XScbO, jzveamvy0wczsb7lna.BezslBgjveK3hODH, jzveamvy0wczsb7lna.ziNFA7KzVfc6, jzveamvy0wczsb7lna.Aboow6rUrcY2SrFRa46C6uy, jzveamvy0wczsb7lna.ox9eclwMpRd, jzveamvy0wczsb7lna.PQQPeCDD0JLCT3aLz);
        RecyclerView recyclerView4 = this.LkMPQqEJluZFFX0mL;
        (recyclerView4 != null ? recyclerView4 : null).setAdapter(agvtvp8cxsejf);
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z
    public final ViewGroup qaDSpeex0Oo1Qvt3oOrTJnbcQFp() {
        ViewGroup viewGroup = this.lgJtMcdLJn14MkPMn;
        if (viewGroup == null) {
            return null;
        }
        return viewGroup;
    }

    @Override // b.qAu8xPQt71QSu59v2YrEcbg7z
    public final ZUboA6FxcG5CkT3ZuNeq sCPtafveBAhdLIs2ajN3WV() {
        return this.ra4eheLgdhUxuEZ9vbYShAWJ;
    }
}
