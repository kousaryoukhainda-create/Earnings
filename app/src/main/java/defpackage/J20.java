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
/* renamed from: J20  reason: default package */
/* loaded from: classes.dex */
public final class J20 extends AbstractMap {
    public static final /* synthetic */ int i = 0;
    public final int b;
    public boolean f;
    public volatile Z4 g;
    public List c = Collections.emptyList();
    public Map d = Collections.emptyMap();
    public Map h = Collections.emptyMap();

    public J20(int i2) {
        this.b = i2;
    }

    public final int a(Comparable comparable) {
        int i2;
        int size = this.c.size();
        int i3 = size - 1;
        if (i3 >= 0) {
            int compareTo = comparable.compareTo(((N20) this.c.get(i3)).b);
            if (compareTo > 0) {
                i2 = size + 1;
                return -i2;
            } else if (compareTo == 0) {
                return i3;
            }
        }
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) / 2;
            int compareTo2 = comparable.compareTo(((N20) this.c.get(i5)).b);
            if (compareTo2 < 0) {
                i3 = i5 - 1;
            } else if (compareTo2 > 0) {
                i4 = i5 + 1;
            } else {
                return i5;
            }
        }
        i2 = i4 + 1;
        return -i2;
    }

    public final void b() {
        if (!this.f) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final Map.Entry c(int i2) {
        return (Map.Entry) this.c.get(i2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.c.isEmpty()) {
            this.c.clear();
        }
        if (!this.d.isEmpty()) {
            this.d.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (a(comparable) < 0 && !this.d.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final Iterable d() {
        if (this.d.isEmpty()) {
            return AbstractC1906jZ.h;
        }
        return this.d.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.d.isEmpty() && !(this.d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.d = treeMap;
            this.h = treeMap.descendingMap();
        }
        return (SortedMap) this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.g == null) {
            this.g = new Z4(this, 1);
        }
        return this.g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J20)) {
            return super.equals(obj);
        }
        J20 j20 = (J20) obj;
        int size = size();
        if (size != j20.size()) {
            return false;
        }
        int size2 = this.c.size();
        if (size2 != j20.c.size()) {
            return ((AbstractSet) entrySet()).equals(j20.entrySet());
        }
        for (int i2 = 0; i2 < size2; i2++) {
            if (!c(i2).equals(j20.c(i2))) {
                return false;
            }
        }
        if (size2 == size) {
            return true;
        }
        return this.d.equals(j20.d);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a = a(comparable);
        if (a >= 0) {
            return ((N20) this.c.get(a)).setValue(obj);
        }
        b();
        boolean isEmpty = this.c.isEmpty();
        int i2 = this.b;
        if (isEmpty && !(this.c instanceof ArrayList)) {
            this.c = new ArrayList(i2);
        }
        int i3 = -(a + 1);
        if (i3 >= i2) {
            return e().put(comparable, obj);
        }
        if (this.c.size() == i2) {
            N20 n20 = (N20) this.c.remove(i2 - 1);
            e().put(n20.b, n20.c);
        }
        this.c.add(i3, new N20(this, comparable, obj));
        return null;
    }

    public final Object g(int i2) {
        b();
        Object obj = ((N20) this.c.remove(i2)).c;
        if (!this.d.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new N20(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return ((N20) this.c.get(a)).c;
        }
        return this.d.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.c.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((N20) this.c.get(i3)).hashCode();
        }
        if (this.d.size() > 0) {
            return i2 + this.d.hashCode();
        }
        return i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return g(a);
        }
        if (this.d.isEmpty()) {
            return null;
        }
        return this.d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.d.size() + this.c.size();
    }
}
