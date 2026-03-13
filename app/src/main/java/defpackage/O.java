package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
/* renamed from: O  reason: default package */
/* loaded from: classes.dex */
public class O extends AbstractMap {
    public transient M b;
    public transient C0901b0 c;
    public final transient Map d;
    public final /* synthetic */ C2753tN f;

    public O(C2753tN c2753tN, Map map) {
        this.f = c2753tN;
        this.d = map;
    }

    public final C2142mD a(Map.Entry entry) {
        X x;
        Object key = entry.getKey();
        C2753tN c2753tN = this.f;
        c2753tN.getClass();
        List list = (List) ((Collection) entry.getValue());
        if (list instanceof RandomAccess) {
            x = new X(c2753tN, key, list, null);
        } else {
            x = new X(c2753tN, key, list, null);
        }
        return new C2142mD(key, x);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        C2753tN c2753tN = this.f;
        if (this.d == c2753tN.f) {
            c2753tN.c();
            return;
        }
        N n = new N(this);
        while (n.hasNext()) {
            n.next();
            n.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.d;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        M m = this.b;
        if (m == null) {
            M m2 = new M(this);
            this.b = m2;
            return m2;
        }
        return m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj && !this.d.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        X x;
        Map map = this.d;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        C2753tN c2753tN = this.f;
        c2753tN.getClass();
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            x = new X(c2753tN, obj, list, null);
        } else {
            x = new X(c2753tN, obj, list, null);
        }
        return x;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set p;
        C2753tN c2753tN = this.f;
        Set set = c2753tN.b;
        if (set == null) {
            Map map = c2753tN.f;
            if (map instanceof NavigableMap) {
                p = new S(c2753tN, (NavigableMap) map);
            } else if (map instanceof SortedMap) {
                p = new V(c2753tN, (SortedMap) map);
            } else {
                p = new P(c2753tN, map);
            }
            set = p;
            c2753tN.b = set;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.d.remove(obj);
        if (collection == null) {
            return null;
        }
        C2753tN c2753tN = this.f;
        Collection d = c2753tN.d();
        d.addAll(collection);
        c2753tN.g -= collection.size();
        collection.clear();
        return d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.d.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.d.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C0901b0 c0901b0 = this.c;
        if (c0901b0 == null) {
            C0901b0 c0901b02 = new C0901b0(this);
            this.c = c0901b02;
            return c0901b02;
        }
        return c0901b0;
    }
}
