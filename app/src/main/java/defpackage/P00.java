package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
/* renamed from: P00  reason: default package */
/* loaded from: classes.dex */
public final class P00 extends O00 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.b).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.b.iterator();
        it.getClass();
        ES es = this.c;
        es.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (es.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.SortedSet, O00] */
    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new O00(((SortedSet) this.b).headSet(obj), this.c);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.b;
        while (true) {
            Object last = sortedSet.last();
            if (this.c.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.SortedSet, O00] */
    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new O00(((SortedSet) this.b).subSet(obj, obj2), this.c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.SortedSet, O00] */
    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new O00(((SortedSet) this.b).tailSet(obj), this.c);
    }
}
