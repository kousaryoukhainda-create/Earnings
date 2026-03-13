package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
/* renamed from: L  reason: default package */
/* loaded from: classes.dex */
public final class L implements Iterator {
    public final Iterator b;
    public Object c = null;
    public Collection d = null;
    public Iterator f = NE.b;
    public final /* synthetic */ C2753tN g;

    public L(C2753tN c2753tN) {
        this.g = c2753tN;
        this.b = c2753tN.f.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.b.hasNext() && !this.f.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f.hasNext()) {
            Map.Entry entry = (Map.Entry) this.b.next();
            this.c = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.d = collection;
            this.f = collection.iterator();
        }
        return this.f.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f.remove();
        Collection collection = this.d;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.b.remove();
        }
        C2753tN c2753tN = this.g;
        c2753tN.g--;
    }
}
