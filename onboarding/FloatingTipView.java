package bitpit.launcher.onboarding;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import b.G3KC41OmeQJzL2PjhN2Kw;
import b.ZbcgI9XXVONHNu3wN5GnBrbUcVGyL;
import b.fpNgwZ132VoUkHxH2MqcZaz;
import b.zVkUtEURLvHNycfQPRiFy1I;
import bitpit.launcher.R;
import bitpit.launcher.onboarding.FloatingTipView;
import bitpit.launcher.ui.NextFlatButton;

/* JADX INFO: loaded from: classes.dex */
public final class FloatingTipView extends FrameLayout {
    public static final /* synthetic */ int Mej0x2K4ZGSUxtYNka4QZ = 0;
    public final TextView GO8WUug7ZWFCUI1zY;
    public fpNgwZ132VoUkHxH2MqcZaz LcvPFGYKhAm4SS5FZ;
    public final View Rdzg08aYlt0UsoLUNug9cESzgAY9R;
    public final G3KC41OmeQJzL2PjhN2Kw WIXlfFpvH7glAGsUk3;
    public final G3KC41OmeQJzL2PjhN2Kw cCmbv8Tzd2QLd161ImIZUlZ8n;
    public fpNgwZ132VoUkHxH2MqcZaz gsHzEVTj1SCIPR;
    public String qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
    public boolean sCPtafveBAhdLIs2ajN3WV;

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingTipView(Context context, AttributeSet attributeSet, int i) {
        final int i2 = 2;
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        final int i3 = 0;
        super(context, attributeSet2, 0);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.floating_tip, (ViewGroup) this, false);
        addView(viewInflate);
        TextView textView = (TextView) viewInflate.findViewById(R.id.floating_tip_title);
        this.GO8WUug7ZWFCUI1zY = (TextView) viewInflate.findViewById(R.id.floating_tip_body);
        NextFlatButton nextFlatButton = (NextFlatButton) viewInflate.findViewById(R.id.floating_tip_button);
        View viewFindViewById = viewInflate.findViewById(R.id.floating_tip_close);
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = viewFindViewById;
        Class<TextView> cls = TextView.class;
        this.cCmbv8Tzd2QLd161ImIZUlZ8n = new G3KC41OmeQJzL2PjhN2Kw(2, 12, cls, textView, "text", "getText()Ljava/lang/CharSequence;");
        this.WIXlfFpvH7glAGsUk3 = new G3KC41OmeQJzL2PjhN2Kw(2, 11, cls, nextFlatButton, "text", "getText()Ljava/lang/CharSequence;");
        viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: b.cRpPMxTmWqjxRbecYkEkv
            public final /* synthetic */ FloatingTipView Rdzg08aYlt0UsoLUNug9cESzgAY9R;

            {
                this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                FloatingTipView floatingTipView = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
                switch (i4) {
                    case 0:
                        if (!floatingTipView.sCPtafveBAhdLIs2ajN3WV) {
                            String str = floatingTipView.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
                            if (str != null) {
                                ZbcgI9XXVONHNu3wN5GnBrbUcVGyL.ziNFA7KzVfc6(ZbcgI9XXVONHNu3wN5GnBrbUcVGyL.GO8WUug7ZWFCUI1zY, 2, str, 4, null, 24);
                            }
                            fpNgwZ132VoUkHxH2MqcZaz fpngwz132voukhxh2mqczaz = floatingTipView.gsHzEVTj1SCIPR;
                            if (fpngwz132voukhxh2mqczaz != null) {
                                fpngwz132voukhxh2mqczaz.axL8FocTDLUdzg0XScbO();
                            }
                            break;
                        }
                        break;
                    case 1:
                        int i5 = FloatingTipView.Mej0x2K4ZGSUxtYNka4QZ;
                        floatingTipView.S1zP5M3X7Ukq3ROlZ87G9I();
                        break;
                    default:
                        int i6 = FloatingTipView.Mej0x2K4ZGSUxtYNka4QZ;
                        floatingTipView.S1zP5M3X7Ukq3ROlZ87G9I();
                        break;
                }
            }
        });
        final int i4 = 1;
        nextFlatButton.setOnClickListener(new View.OnClickListener(this) { // from class: b.cRpPMxTmWqjxRbecYkEkv
            public final /* synthetic */ FloatingTipView Rdzg08aYlt0UsoLUNug9cESzgAY9R;

            {
                this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = i4;
                FloatingTipView floatingTipView = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
                switch (i5) {
                    case 0:
                        if (!floatingTipView.sCPtafveBAhdLIs2ajN3WV) {
                            String str = floatingTipView.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
                            if (str != null) {
                                ZbcgI9XXVONHNu3wN5GnBrbUcVGyL.ziNFA7KzVfc6(ZbcgI9XXVONHNu3wN5GnBrbUcVGyL.GO8WUug7ZWFCUI1zY, 2, str, 4, null, 24);
                            }
                            fpNgwZ132VoUkHxH2MqcZaz fpngwz132voukhxh2mqczaz = floatingTipView.gsHzEVTj1SCIPR;
                            if (fpngwz132voukhxh2mqczaz != null) {
                                fpngwz132voukhxh2mqczaz.axL8FocTDLUdzg0XScbO();
                            }
                            break;
                        }
                        break;
                    case 1:
                        int i6 = FloatingTipView.Mej0x2K4ZGSUxtYNka4QZ;
                        floatingTipView.S1zP5M3X7Ukq3ROlZ87G9I();
                        break;
                    default:
                        int i7 = FloatingTipView.Mej0x2K4ZGSUxtYNka4QZ;
                        floatingTipView.S1zP5M3X7Ukq3ROlZ87G9I();
                        break;
                }
            }
        });
        viewInflate.setOnClickListener(new View.OnClickListener(this) { // from class: b.cRpPMxTmWqjxRbecYkEkv
            public final /* synthetic */ FloatingTipView Rdzg08aYlt0UsoLUNug9cESzgAY9R;

            {
                this.Rdzg08aYlt0UsoLUNug9cESzgAY9R = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = i2;
                FloatingTipView floatingTipView = this.Rdzg08aYlt0UsoLUNug9cESzgAY9R;
                switch (i5) {
                    case 0:
                        if (!floatingTipView.sCPtafveBAhdLIs2ajN3WV) {
                            String str = floatingTipView.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
                            if (str != null) {
                                ZbcgI9XXVONHNu3wN5GnBrbUcVGyL.ziNFA7KzVfc6(ZbcgI9XXVONHNu3wN5GnBrbUcVGyL.GO8WUug7ZWFCUI1zY, 2, str, 4, null, 24);
                            }
                            fpNgwZ132VoUkHxH2MqcZaz fpngwz132voukhxh2mqczaz = floatingTipView.gsHzEVTj1SCIPR;
                            if (fpngwz132voukhxh2mqczaz != null) {
                                fpngwz132voukhxh2mqczaz.axL8FocTDLUdzg0XScbO();
                            }
                            break;
                        }
                        break;
                    case 1:
                        int i6 = FloatingTipView.Mej0x2K4ZGSUxtYNka4QZ;
                        floatingTipView.S1zP5M3X7Ukq3ROlZ87G9I();
                        break;
                    default:
                        int i7 = FloatingTipView.Mej0x2K4ZGSUxtYNka4QZ;
                        floatingTipView.S1zP5M3X7Ukq3ROlZ87G9I();
                        break;
                }
            }
        });
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, zVkUtEURLvHNycfQPRiFy1I.ziNFA7KzVfc6, 0, 0);
            try {
                String string = typedArrayObtainStyledAttributes.getString(3);
                if (string != null) {
                    setTitle(string);
                }
                setBody(typedArrayObtainStyledAttributes.getString(1));
                String string2 = typedArrayObtainStyledAttributes.getString(2);
                if (string2 != null) {
                    setButtonLabel(string2);
                }
                setCloseButtonVisible(typedArrayObtainStyledAttributes.getBoolean(0, false));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
    }

    public final void S1zP5M3X7Ukq3ROlZ87G9I() {
        if (this.sCPtafveBAhdLIs2ajN3WV) {
            return;
        }
        String str = this.qaDSpeex0Oo1Qvt3oOrTJnbcQFp;
        if (str != null) {
            ZbcgI9XXVONHNu3wN5GnBrbUcVGyL.ziNFA7KzVfc6(ZbcgI9XXVONHNu3wN5GnBrbUcVGyL.GO8WUug7ZWFCUI1zY, 5, str, 4, "button_next", 16);
        }
        fpNgwZ132VoUkHxH2MqcZaz fpngwz132voukhxh2mqczaz = this.LcvPFGYKhAm4SS5FZ;
        if (fpngwz132voukhxh2mqczaz != null) {
            fpngwz132voukhxh2mqczaz.axL8FocTDLUdzg0XScbO();
        }
    }

    public final CharSequence getBody() {
        TextView textView = this.GO8WUug7ZWFCUI1zY;
        CharSequence text = textView.getText();
        if (textView.getVisibility() == 0) {
            return text;
        }
        return null;
    }

    public final CharSequence getButtonLabel() {
        return (CharSequence) this.WIXlfFpvH7glAGsUk3.fXBtMGfTIjGSHgK542();
    }

    public final fpNgwZ132VoUkHxH2MqcZaz getOnButtonClick() {
        return this.LcvPFGYKhAm4SS5FZ;
    }

    public final fpNgwZ132VoUkHxH2MqcZaz getOnCloseClick() {
        return this.gsHzEVTj1SCIPR;
    }

    public final CharSequence getTitle() {
        return (CharSequence) this.cCmbv8Tzd2QLd161ImIZUlZ8n.fXBtMGfTIjGSHgK542();
    }

    public final void setBody(CharSequence charSequence) {
        boolean z = charSequence == null || charSequence.length() == 0;
        int i = z ? 8 : 0;
        TextView textView = this.GO8WUug7ZWFCUI1zY;
        textView.setVisibility(i);
        if (z) {
            return;
        }
        textView.setText(charSequence);
    }

    public final void setButtonLabel(CharSequence charSequence) {
        ((TextView) this.WIXlfFpvH7glAGsUk3.Rdzg08aYlt0UsoLUNug9cESzgAY9R).setText(charSequence);
    }

    public final void setCloseButtonVisible(boolean z) {
        this.Rdzg08aYlt0UsoLUNug9cESzgAY9R.setVisibility(z ? 0 : 8);
    }

    public final void setOnButtonClick(fpNgwZ132VoUkHxH2MqcZaz fpngwz132voukhxh2mqczaz) {
        this.LcvPFGYKhAm4SS5FZ = fpngwz132voukhxh2mqczaz;
    }

    public final void setOnCloseClick(fpNgwZ132VoUkHxH2MqcZaz fpngwz132voukhxh2mqczaz) {
        this.gsHzEVTj1SCIPR = fpngwz132voukhxh2mqczaz;
    }

    public final void setTitle(CharSequence charSequence) {
        ((TextView) this.cCmbv8Tzd2QLd161ImIZUlZ8n.Rdzg08aYlt0UsoLUNug9cESzgAY9R).setText(charSequence);
    }

    public FloatingTipView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public FloatingTipView(Context context) {
        this(context, null, 6);
    }
}
