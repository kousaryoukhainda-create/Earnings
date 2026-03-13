package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
/* renamed from: N  reason: default package */
/* loaded from: classes.dex */
public class N implements Iterator {
    public final /* synthetic */ int b = 0;
    public final Iterator c;
    public Object d;
    public final /* synthetic */ Object f;

    public N(X x) {
        Iterator it;
        this.f = x;
        Collection collection = x.c;
        this.d = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.c = it;
    }

    public void b() {
        X x = (X) this.f;
        x.f();
        if (x.c == ((Collection) this.d)) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.b) {
            case 0:
                return this.c.hasNext();
            case 1:
                return this.c.hasNext();
            default:
                b();
                return this.c.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.b) {
            case 0:
                Map.Entry entry = (Map.Entry) this.c.next();
                this.d = (Collection) entry.getValue();
                return ((O) this.f).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.c.next();
                this.d = entry2;
                return entry2.getKey();
            default:
                b();
                return this.c.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z;
        boolean z2;
        switch (this.b) {
            case 0:
                if (((Collection) this.d) != null) {
                    z = true;
                } else {
                    z = false;
                }
                B10.v("no calls to next() since the last call to remove()", z);
                this.c.remove();
                ((O) this.f).f.g -= ((Collection) this.d).size();
                ((Collection) this.d).clear();
                this.d = null;
                return;
            case 1:
                if (((Map.Entry) this.d) != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                B10.v("no calls to next() since the last call to remove()", z2);
                Collection collection = (Collection) ((Map.Entry) this.d).getValue();
                this.c.remove();
                ((P) this.f).d.g -= collection.size();
                collection.clear();
                this.d = null;
                return;
            default:
                this.c.remove();
                X x = (X) this.f;
                C2753tN c2753tN = x.g;
                c2753tN.g--;
                x.g();
                return;
        }
    }

    public N(X x, ListIterator listIterator) {
        this.f = x;
        this.d = x.c;
        this.c = listIterator;
    }

    public N(P p, Iterator it) {
        this.f = p;
        this.c = it;
    }

    public N(O o) {
        this.f = o;
        this.c = o.d.entrySet().iterator();
    }
}
