package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
/* renamed from: tN  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2753tN extends AbstractC0986c0 implements Serializable {
    public final transient Map f;
    public transient int g;
    public transient C2667sN h;

    public C2753tN(Map map) {
        if (map.isEmpty()) {
            this.f = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.AbstractC0986c0
    public final Map a() {
        Map o;
        Map map = this.d;
        if (map == null) {
            Map map2 = this.f;
            if (map2 instanceof NavigableMap) {
                o = new Q(this, (NavigableMap) map2);
            } else if (map2 instanceof SortedMap) {
                o = new U(this, (SortedMap) map2);
            } else {
                o = new O(this, map2);
            }
            map = o;
            this.d = map;
        }
        return map;
    }

    public final void c() {
        Map map = this.f;
        for (Collection collection : map.values()) {
            collection.clear();
        }
        map.clear();
        this.g = 0;
    }

    public final Collection d() {
        return (List) this.h.get();
    }
}
