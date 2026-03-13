package defpackage;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* renamed from: K20  reason: default package */
/* loaded from: classes.dex */
public final class K20 extends AbstractMap {
    public static final /* synthetic */ int h = 0;
    public List b;
    public Map c;
    public boolean d;
    public volatile Z4 f;
    public Map g;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, K20] */
    public static K20 f() {
        ?? abstractMap = new AbstractMap();
        abstractMap.b = Collections.emptyList();
        abstractMap.c = Collections.emptyMap();
        abstractMap.g = Collections.emptyMap();
        return abstractMap;
    }

    public final int a(Comparable comparable) {
        int i;
        int size = this.b.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((O20) this.b.get(i2)).b);
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            } else if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((O20) this.b.get(i4)).b);
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else if (compareTo2 > 0) {
                i3 = i4 + 1;
            } else {
                return i4;
            }
        }
        i = i3 + 1;
        return -i;
    }

    public final void b() {
        if (!this.d) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.b.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
        if (!this.c.isEmpty()) {
            this.c.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (a(comparable) < 0 && !this.c.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final Set d() {
        if (this.c.isEmpty()) {
            return Collections.emptySet();
        }
        return this.c.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.c.isEmpty() && !(this.c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.c = treeMap;
            this.g = treeMap.descendingMap();
        }
        return (SortedMap) this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f == null) {
            this.f = new Z4(this, 2);
        }
        return this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K20)) {
            return super.equals(obj);
        }
        K20 k20 = (K20) obj;
        int size = size();
        if (size != k20.size()) {
            return false;
        }
        int size2 = this.b.size();
        if (size2 != k20.b.size()) {
            return ((AbstractSet) entrySet()).equals(k20.entrySet());
        }
        for (int i = 0; i < size2; i++) {
            if (!c(i).equals(k20.c(i))) {
                return false;
            }
        }
        if (size2 == size) {
            return true;
        }
        return this.c.equals(k20.c);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a = a(comparable);
        if (a >= 0) {
            return ((O20) this.b.get(a)).setValue(obj);
        }
        b();
        if (this.b.isEmpty() && !(this.b instanceof ArrayList)) {
            this.b = new ArrayList(16);
        }
        int i = -(a + 1);
        if (i >= 16) {
            return e().put(comparable, obj);
        }
        if (this.b.size() == 16) {
            O20 o20 = (O20) this.b.remove(15);
            e().put(o20.b, o20.c);
        }
        this.b.add(i, new O20(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return ((O20) this.b.get(a)).c;
        }
        return this.c.get(comparable);
    }

    public final Object h(int i) {
        b();
        Object obj = ((O20) this.b.remove(i)).c;
        if (!this.c.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new O20(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((O20) this.b.get(i2)).hashCode();
        }
        if (this.c.size() > 0) {
            return i + this.c.hashCode();
        }
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return h(a);
        }
        if (this.c.isEmpty()) {
            return null;
        }
        return this.c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c.size() + this.b.size();
    }
}
