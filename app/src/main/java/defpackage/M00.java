package defpackage;

import java.util.Iterator;
/* renamed from: M00  reason: default package */
/* loaded from: classes.dex */
public final class M00 extends F {
    public final Iterator f;
    public final Iterator g;
    public final /* synthetic */ N00 h;

    public M00(N00 n00) {
        this.h = n00;
        this.f = n00.d.iterator();
        this.g = n00.f.iterator();
    }

    @Override // defpackage.F
    public final Object b() {
        Object next;
        Iterator it = this.f;
        if (it.hasNext()) {
            return it.next();
        }
        do {
            Iterator it2 = this.g;
            if (it2.hasNext()) {
                next = it2.next();
            } else {
                this.c = 3;
                return null;
            }
        } while (this.h.d.contains(next));
        return next;
    }
}
