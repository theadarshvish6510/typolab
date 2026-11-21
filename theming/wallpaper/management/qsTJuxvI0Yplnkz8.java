package bitpit.launcher.theming.wallpaper.management;

import b.J7Tsg1eqTfbK8vIo4RFOyjPiu;
import b.OkhdZkC3NYLW;
import b.Rfp0CprLjJaYY8aiYk;
import b.hVMgzimHFGcOjX76;
import b.umWqS90Q130ssAHP;
import b.wYkdXH78rYumy6TO0br;
import b.zcVy9CxyjGv4fN7Bt9sR26dZr1mm;
import bitpit.launcher.themes.ThemeDefinition;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class qsTJuxvI0Yplnkz8 implements hVMgzimHFGcOjX76 {
    @Override // b.hVMgzimHFGcOjX76
    public final Object S1zP5M3X7Ukq3ROlZ87G9I(Object obj, wYkdXH78rYumy6TO0br wykdxh78ryumy6to0br) {
        Object next;
        String str = ((umWqS90Q130ssAHP) obj).S1zP5M3X7Ukq3ROlZ87G9I;
        ListIterator listIterator = bitpit.launcher.themes.qsTJuxvI0Yplnkz8.S1zP5M3X7Ukq3ROlZ87G9I.listIterator(0);
        do {
            zcVy9CxyjGv4fN7Bt9sR26dZr1mm zcvy9cxyjgv4fn7bt9sr26dzr1mm = (zcVy9CxyjGv4fN7Bt9sR26dZr1mm) listIterator;
            if (!zcvy9cxyjgv4fn7bt9sr26dzr1mm.hasNext()) {
                next = null;
                break;
            }
            next = zcvy9cxyjgv4fn7bt9sr26dzr1mm.next();
        } while (!OkhdZkC3NYLW.S1zP5M3X7Ukq3ROlZ87G9I(((ThemeDefinition) next).S1zP5M3X7Ukq3ROlZ87G9I, str));
        ThemeDefinition themeDefinition = (ThemeDefinition) next;
        if (themeDefinition != null) {
            J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
            return themeDefinition;
        }
        ThemeCollectionResolver$ThemeCollectionException.ThemeNotFound themeNotFound = new ThemeCollectionResolver$ThemeCollectionException.ThemeNotFound(str);
        J7Tsg1eqTfbK8vIo4RFOyjPiu.Companion.getClass();
        return new Rfp0CprLjJaYY8aiYk(themeNotFound);
    }
}
