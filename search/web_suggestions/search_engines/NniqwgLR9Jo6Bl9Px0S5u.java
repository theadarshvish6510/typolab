package bitpit.launcher.search.web_suggestions.search_engines;

import b.Dhm2doty979NYBGLOnA73YknEG9;
import b.GwaPFeEMycgFe2ISeXpFY;
import b.Hnv6Te9rrTA0VqZMo;
import b.KjpLK4IQzcoI;
import b.UE7MkxgXYXfsH;
import b.fkKJVnL14sc1;
import b.l7YDOnqLZi7ksTcZXYRzDOOs;
import b.r60CZQ816LNxQ;
import b.s9XnN7QTAJ;
import b.vOL3U3fINHMmdVoJz;
import b.xNthAUu9aBYOvIzNXbI;
import b.zHfG9eBtghieLBn;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class NniqwgLR9Jo6Bl9Px0S5u extends l7YDOnqLZi7ksTcZXYRzDOOs implements r60CZQ816LNxQ {
    public final /* synthetic */ xNthAUu9aBYOvIzNXbI LcvPFGYKhAm4SS5FZ;
    public final /* synthetic */ Dhm2doty979NYBGLOnA73YknEG9 gsHzEVTj1SCIPR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NniqwgLR9Jo6Bl9Px0S5u(Dhm2doty979NYBGLOnA73YknEG9 dhm2doty979NYBGLOnA73YknEG9, xNthAUu9aBYOvIzNXbI xnthauu9abyoviznxbi, vOL3U3fINHMmdVoJz vol3u3finhmmdvojz) {
        super(2, vol3u3finhmmdvojz);
        this.gsHzEVTj1SCIPR = dhm2doty979NYBGLOnA73YknEG9;
        this.LcvPFGYKhAm4SS5FZ = xnthauu9abyoviznxbi;
    }

    @Override // b.FpwejIoNZIEGVIRY
    public final Object HveD9n1tOYlffjJDxghBitYNgB(Object obj) {
        Hnv6Te9rrTA0VqZMo.PQQPeCDD0JLCT3aLz(obj);
        Iterable iterable = (Iterable) UE7MkxgXYXfsH.S1zP5M3X7Ukq3ROlZ87G9I(this.gsHzEVTj1SCIPR.LYcdI4xpry8eXmFC9I4wyaLdcG1z, this.LcvPFGYKhAm4SS5FZ, new GwaPFeEMycgFe2ISeXpFY(17, new fkKJVnL14sc1(DuckDuckGoSuggestionDto.Companion.serializer())));
        ArrayList arrayList = new ArrayList(KjpLK4IQzcoI.JY5knQmh7EQJEZ(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((DuckDuckGoSuggestionDto) it.next()).S1zP5M3X7Ukq3ROlZ87G9I);
        }
        return arrayList;
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
