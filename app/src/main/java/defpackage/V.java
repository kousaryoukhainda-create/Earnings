package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
/* renamed from: V  reason: default package */
/* loaded from: classes.dex */
public class V extends P implements SortedSet {
    public final /* synthetic */ C2753tN f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(C2753tN c2753tN, SortedMap sortedMap) {
        super(c2753tN, sortedMap);
        this.f = c2753tN;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return e().comparator();
    }

    public SortedMap e() {
        return (SortedMap) this.c;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return e().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new V(this.f, e().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return e().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new V(this.f, e().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new V(this.f, e().tailMap(obj));
    }
}
