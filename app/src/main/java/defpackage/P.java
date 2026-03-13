package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
/* renamed from: P  reason: default package */
/* loaded from: classes.dex */
public class P extends Q00 {
    public final Map c;
    public final /* synthetic */ C2753tN d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(C2753tN c2753tN, Map map) {
        super(0);
        this.d = c2753tN;
        map.getClass();
        this.c = map;
    }

    @Override // defpackage.Q00, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            N n = (N) it;
            if (n.hasNext()) {
                n.next();
                n.remove();
            } else {
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.c.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this != obj && !this.c.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.c.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.c.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new N(this, this.c.entrySet().iterator());
    }

    @Override // defpackage.Q00, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i;
        Collection collection = (Collection) this.c.remove(obj);
        if (collection != null) {
            i = collection.size();
            collection.clear();
            this.d.g -= i;
        } else {
            i = 0;
        }
        if (i <= 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c.size();
    }
}
