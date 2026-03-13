package defpackage;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;
/* renamed from: S  reason: default package */
/* loaded from: classes.dex */
public final class S extends V implements NavigableSet {
    public final /* synthetic */ C2753tN g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(C2753tN c2753tN, NavigableMap navigableMap) {
        super(c2753tN, navigableMap);
        this.g = c2753tN;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return e().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((P) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new S(this.g, e().descendingMap());
    }

    @Override // defpackage.V
    /* renamed from: f */
    public final NavigableMap e() {
        return (NavigableMap) ((SortedMap) this.c);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return e().floorKey(obj);
    }

    @Override // defpackage.V, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return e().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return e().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        N n = (N) iterator();
        if (n.hasNext()) {
            Object next = n.next();
            n.remove();
            return next;
        }
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (descendingIterator.hasNext()) {
            Object next = descendingIterator.next();
            descendingIterator.remove();
            return next;
        }
        return null;
    }

    @Override // defpackage.V, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // defpackage.V, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new S(this.g, e().headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new S(this.g, e().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new S(this.g, e().tailMap(obj, z));
    }
}
