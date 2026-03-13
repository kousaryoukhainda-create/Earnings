package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
/* renamed from: U  reason: default package */
/* loaded from: classes.dex */
public class U extends O implements SortedMap {
    public SortedSet g;
    public final /* synthetic */ C2753tN h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(C2753tN c2753tN, SortedMap sortedMap) {
        super(c2753tN, sortedMap);
        this.h = c2753tN;
    }

    public SortedSet b() {
        return new V(this.h, d());
    }

    @Override // defpackage.O, java.util.AbstractMap, java.util.Map
    /* renamed from: c */
    public SortedSet keySet() {
        SortedSet sortedSet = this.g;
        if (sortedSet == null) {
            SortedSet b = b();
            this.g = b;
            return b;
        }
        return sortedSet;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.d;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new U(this.h, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new U(this.h, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new U(this.h, d().tailMap(obj));
    }
}
