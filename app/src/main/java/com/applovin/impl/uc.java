package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Function;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.impl.rj;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class uc {

    /* loaded from: classes.dex */
    public class a extends yo {
        public a(Iterator it) {
            super(it);
        }

        @Override // com.applovin.impl.yo
        public Object a(Map.Entry entry) {
            return entry.getValue();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public static abstract class b implements Function {
        public static final b a = new a("KEY", 0);
        public static final b b = new C0034b("VALUE", 1);
        private static final /* synthetic */ b[] c = a();

        /* loaded from: classes.dex */
        public enum a extends b {
            public a(String str, int i) {
                super(str, i, null);
            }

            @Override // com.applovin.exoplayer2.common.base.Function
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        }

        /* renamed from: com.applovin.impl.uc$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public enum C0034b extends b {
            public C0034b(String str, int i) {
                super(str, i, null);
            }

            @Override // com.applovin.exoplayer2.common.base.Function
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        }

        private b(String str, int i) {
        }

        private static /* synthetic */ b[] a() {
            return new b[]{a, b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) c.clone();
        }

        public /* synthetic */ b(String str, int i, tc tcVar) {
            this(str, i);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c extends rj.b {
        public abstract Map a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // com.applovin.impl.rj.b, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                return rj.a((Set) this, collection.iterator());
            }
        }

        @Override // com.applovin.impl.rj.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet a = rj.a(collection.size());
                for (Object obj : collection) {
                    if (contains(obj)) {
                        a.add(((Map.Entry) obj).getKey());
                    }
                }
                return a().keySet().retainAll(a);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().size();
        }
    }

    /* loaded from: classes.dex */
    public static class d extends rj.b {
        final Map a;

        public d(Map map) {
            this.a = (Map) Preconditions.checkNotNull(map);
        }

        public Map a() {
            return this.a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return a().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a().size();
        }
    }

    /* loaded from: classes.dex */
    public static class e extends AbstractCollection {
        final Map a;

        public e(Map map) {
            this.a = (Map) Preconditions.checkNotNull(map);
        }

        public final Map a() {
            return this.a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return a().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return uc.a(a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : a().entrySet()) {
                    if (Objects.equal(obj, entry.getValue())) {
                        a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet a = rj.a();
                for (Map.Entry entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        a.add(entry.getKey());
                    }
                }
                return a().keySet().removeAll(a);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet a = rj.a();
                for (Map.Entry entry : a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        a.add(entry.getKey());
                    }
                }
                return a().keySet().retainAll(a);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return a().size();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f extends AbstractMap {
        private transient Set a;
        private transient Collection b;

        public abstract Set a();

        public Collection b() {
            return new e(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set entrySet() {
            Set set = this.a;
            if (set == null) {
                Set a = a();
                this.a = a;
                return a;
            }
            return set;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection values() {
            Collection collection = this.b;
            if (collection == null) {
                Collection b = b();
                this.b = b;
                return b;
            }
            return collection;
        }
    }

    public static int a(int i) {
        if (i < 3) {
            p3.a(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public static boolean b(Map map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static Object c(Map map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static Object d(Map map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static boolean a(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static IdentityHashMap b() {
        return new IdentityHashMap();
    }

    public static Function c() {
        return b.b;
    }

    public static String a(Map map) {
        StringBuilder a2 = q3.a(map.size());
        a2.append('{');
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z) {
                a2.append(", ");
            }
            a2.append(entry.getKey());
            a2.append('=');
            a2.append(entry.getValue());
            z = false;
        }
        a2.append('}');
        return a2.toString();
    }

    public static Function a() {
        return b.a;
    }

    public static Iterator a(Iterator it) {
        return new a(it);
    }

    public static Map.Entry a(Object obj, Object obj2) {
        return new cb(obj, obj2);
    }
}
