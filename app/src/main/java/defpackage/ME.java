package defpackage;

import java.util.Iterator;
/* renamed from: ME  reason: default package */
/* loaded from: classes.dex */
public final class ME extends F {
    public final /* synthetic */ int f = 1;
    public final Iterator g;
    public final /* synthetic */ Object h;

    public ME(Iterator it, ES es) {
        this.g = it;
        this.h = es;
    }

    @Override // defpackage.F
    public final Object b() {
        Object next;
        Object next2;
        switch (this.f) {
            case 0:
                do {
                    Iterator it = this.g;
                    if (it.hasNext()) {
                        next = it.next();
                    } else {
                        this.c = 3;
                        return null;
                    }
                } while (!((ES) this.h).apply(next));
                return next;
            default:
                do {
                    Iterator it2 = this.g;
                    if (it2.hasNext()) {
                        next2 = it2.next();
                    } else {
                        this.c = 3;
                        return null;
                    }
                } while (!((AbstractC3001wD) ((N00) this.h).f).contains(next2));
                return next2;
        }
    }

    public ME(N00 n00) {
        this.h = n00;
        this.g = ((AbstractC3001wD) n00.d).iterator();
    }
}
