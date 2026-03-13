package j$.time.zone;

import java.security.PrivilegedAction;
import java.util.ArrayList;
/* loaded from: classes4.dex */
final class h implements PrivilegedAction {
    final /* synthetic */ ArrayList a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        String property = System.getProperty("java.time.zone.DefaultZoneRulesProvider");
        if (property != null) {
            try {
                j jVar = (j) j.class.cast(Class.forName(property, true, j.class.getClassLoader()).newInstance());
                j.e(jVar);
                this.a.add(jVar);
                return null;
            } catch (Exception e) {
                throw new Error(e);
            }
        }
        j.e(new i());
        return null;
    }
}
