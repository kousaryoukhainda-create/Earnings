package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.impl.AbstractC1067h;
import com.applovin.impl.uc;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1065f extends AbstractC1067h implements Serializable {
    private transient Map d;
    private transient int f;

    /* renamed from: com.applovin.impl.f$a */
    /* loaded from: classes.dex */
    public class a extends c {
        public a() {
            super();
        }

        @Override // com.applovin.impl.AbstractC1065f.c
        public Object a(Object obj, Object obj2) {
            return obj2;
        }
    }

    /* renamed from: com.applovin.impl.f$b */
    /* loaded from: classes.dex */
    public class b extends uc.f {
        final transient Map c;

        /* renamed from: com.applovin.impl.f$b$a */
        /* loaded from: classes.dex */
        public class a extends uc.c {
            public a() {
            }

            @Override // com.applovin.impl.uc.c
            public Map a() {
                return b.this;
            }

            @Override // com.applovin.impl.uc.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return q3.a(b.this.c.entrySet(), obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator iterator() {
                return new C0011b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (contains(obj)) {
                    AbstractC1065f.this.c(((Map.Entry) obj).getKey());
                    return true;
                }
                return false;
            }
        }

        /* renamed from: com.applovin.impl.f$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0011b implements Iterator {
            final Iterator a;
            Collection b;

            public C0011b() {
                this.a = b.this.c.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: a */
            public Map.Entry next() {
                Map.Entry entry = (Map.Entry) this.a.next();
                this.b = (Collection) entry.getValue();
                return b.this.a(entry);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.a.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                boolean z;
                if (this.b != null) {
                    z = true;
                } else {
                    z = false;
                }
                p3.a(z);
                this.a.remove();
                AbstractC1065f.b(AbstractC1065f.this, this.b.size());
                this.b.clear();
                this.b = null;
            }
        }

        public b(Map map) {
            this.c = map;
        }

        public Map.Entry a(Map.Entry entry) {
            Object key = entry.getKey();
            return uc.a(key, AbstractC1065f.this.a(key, (Collection) entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.c == AbstractC1065f.this.d) {
                AbstractC1065f.this.clear();
            } else {
                wb.a((Iterator) new C0011b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return uc.b(this.c, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            if (this != obj && !this.c.equals(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.c.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set keySet() {
            return AbstractC1065f.this.e();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.c.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.c.toString();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection get(Object obj) {
            Collection collection = (Collection) uc.c(this.c, obj);
            if (collection == null) {
                return null;
            }
            return AbstractC1065f.this.a(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection remove(Object obj) {
            Collection collection = (Collection) this.c.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection g = AbstractC1065f.this.g();
            g.addAll(collection);
            AbstractC1065f.b(AbstractC1065f.this, collection.size());
            collection.clear();
            return g;
        }

        @Override // com.applovin.impl.uc.f
        public Set a() {
            return new a();
        }
    }

    /* renamed from: com.applovin.impl.f$c */
    /* loaded from: classes.dex */
    public abstract class c implements Iterator {
        final Iterator a;
        Object b = null;
        Collection c = null;
        Iterator d = wb.c();

        public c() {
            this.a = AbstractC1065f.this.d.entrySet().iterator();
        }

        public abstract Object a(Object obj, Object obj2);

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.a.hasNext() && !this.d.hasNext()) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.d.hasNext()) {
                Map.Entry entry = (Map.Entry) this.a.next();
                this.b = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                this.c = collection;
                this.d = collection.iterator();
            }
            return a(this.b, this.d.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.d.remove();
            if (this.c.isEmpty()) {
                this.a.remove();
            }
            AbstractC1065f.c(AbstractC1065f.this);
        }
    }

    /* renamed from: com.applovin.impl.f$d */
    /* loaded from: classes.dex */
    public class d extends uc.d {

        /* renamed from: com.applovin.impl.f$d$a */
        /* loaded from: classes.dex */
        public class a implements Iterator {
            Map.Entry a;
            final /* synthetic */ Iterator b;

            public a(Iterator it) {
                this.b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.b.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                Map.Entry entry = (Map.Entry) this.b.next();
                this.a = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                boolean z;
                if (this.a != null) {
                    z = true;
                } else {
                    z = false;
                }
                p3.a(z);
                Collection collection = (Collection) this.a.getValue();
                this.b.remove();
                AbstractC1065f.b(AbstractC1065f.this, collection.size());
                collection.clear();
                this.a = null;
            }
        }

        public d(Map map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            wb.a(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection collection) {
            return a().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            if (this != obj && !a().keySet().equals(obj)) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return a().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new a(a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Collection collection = (Collection) a().remove(obj);
            if (collection != null) {
                int size = collection.size();
                collection.clear();
                AbstractC1065f.b(AbstractC1065f.this, size);
                if (size > 0) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.applovin.impl.f$e */
    /* loaded from: classes.dex */
    public class e extends h implements NavigableMap {
        public e(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // com.applovin.impl.AbstractC1065f.h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: a */
        public NavigableMap headMap(Object obj) {
            return headMap(obj, false);
        }

        @Override // com.applovin.impl.AbstractC1065f.h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: b */
        public NavigableMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        @Override // java.util.NavigableMap
        public Map.Entry ceilingEntry(Object obj) {
            Map.Entry ceilingEntry = d().ceilingEntry(obj);
            if (ceilingEntry == null) {
                return null;
            }
            return a(ceilingEntry);
        }

        @Override // java.util.NavigableMap
        public Object ceilingKey(Object obj) {
            return d().ceilingKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableSet descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap descendingMap() {
            return new e(d().descendingMap());
        }

        @Override // com.applovin.impl.AbstractC1065f.h
        /* renamed from: e */
        public NavigableSet c() {
            return new C0012f(d());
        }

        @Override // com.applovin.impl.AbstractC1065f.h
        /* renamed from: f */
        public NavigableMap d() {
            return (NavigableMap) super.d();
        }

        @Override // java.util.NavigableMap
        public Map.Entry firstEntry() {
            Map.Entry firstEntry = d().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return a(firstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry floorEntry(Object obj) {
            Map.Entry floorEntry = d().floorEntry(obj);
            if (floorEntry == null) {
                return null;
            }
            return a(floorEntry);
        }

        @Override // java.util.NavigableMap
        public Object floorKey(Object obj) {
            return d().floorKey(obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry higherEntry(Object obj) {
            Map.Entry higherEntry = d().higherEntry(obj);
            if (higherEntry == null) {
                return null;
            }
            return a(higherEntry);
        }

        @Override // java.util.NavigableMap
        public Object higherKey(Object obj) {
            return d().higherKey(obj);
        }

        @Override // com.applovin.impl.AbstractC1065f.h, com.applovin.impl.AbstractC1065f.b, java.util.AbstractMap, java.util.Map
        public NavigableSet keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry lastEntry() {
            Map.Entry lastEntry = d().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return a(lastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry lowerEntry(Object obj) {
            Map.Entry lowerEntry = d().lowerEntry(obj);
            if (lowerEntry == null) {
                return null;
            }
            return a(lowerEntry);
        }

        @Override // java.util.NavigableMap
        public Object lowerKey(Object obj) {
            return d().lowerKey(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableSet navigableKeySet() {
            return keySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollFirstEntry() {
            return a(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry pollLastEntry() {
            return a(descendingMap().entrySet().iterator());
        }

        public Map.Entry a(Iterator it) {
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Collection g = AbstractC1065f.this.g();
                g.addAll((Collection) entry.getValue());
                it.remove();
                return uc.a(entry.getKey(), AbstractC1065f.this.c(g));
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public NavigableMap headMap(Object obj, boolean z) {
            return new e(d().headMap(obj, z));
        }

        @Override // java.util.NavigableMap
        public NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
            return new e(d().subMap(obj, z, obj2, z2));
        }

        @Override // java.util.NavigableMap
        public NavigableMap tailMap(Object obj, boolean z) {
            return new e(d().tailMap(obj, z));
        }

        @Override // com.applovin.impl.AbstractC1065f.h, java.util.SortedMap, java.util.NavigableMap
        /* renamed from: a */
        public NavigableMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }
    }

    /* renamed from: com.applovin.impl.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0012f extends i implements NavigableSet {
        public C0012f(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // com.applovin.impl.AbstractC1065f.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: a */
        public NavigableSet headSet(Object obj) {
            return headSet(obj, false);
        }

        @Override // com.applovin.impl.AbstractC1065f.i
        /* renamed from: c */
        public NavigableMap b() {
            return (NavigableMap) super.b();
        }

        @Override // java.util.NavigableSet
        public Object ceiling(Object obj) {
            return b().ceilingKey(obj);
        }

        @Override // java.util.NavigableSet
        public Iterator descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet descendingSet() {
            return new C0012f(b().descendingMap());
        }

        @Override // java.util.NavigableSet
        public Object floor(Object obj) {
            return b().floorKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object higher(Object obj) {
            return b().higherKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object lower(Object obj) {
            return b().lowerKey(obj);
        }

        @Override // java.util.NavigableSet
        public Object pollFirst() {
            return wb.c(iterator());
        }

        @Override // java.util.NavigableSet
        public Object pollLast() {
            return wb.c(descendingIterator());
        }

        @Override // com.applovin.impl.AbstractC1065f.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: a */
        public NavigableSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        @Override // com.applovin.impl.AbstractC1065f.i, java.util.SortedSet, java.util.NavigableSet
        /* renamed from: b */
        public NavigableSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        @Override // java.util.NavigableSet
        public NavigableSet headSet(Object obj, boolean z) {
            return new C0012f(b().headMap(obj, z));
        }

        @Override // java.util.NavigableSet
        public NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
            return new C0012f(b().subMap(obj, z, obj2, z2));
        }

        @Override // java.util.NavigableSet
        public NavigableSet tailSet(Object obj, boolean z) {
            return new C0012f(b().tailMap(obj, z));
        }
    }

    /* renamed from: com.applovin.impl.f$g */
    /* loaded from: classes.dex */
    public class g extends k implements RandomAccess {
        public g(Object obj, List list, j jVar) {
            super(obj, list, jVar);
        }
    }

    /* renamed from: com.applovin.impl.f$h */
    /* loaded from: classes.dex */
    public class h extends b implements SortedMap {
        SortedSet f;

        public h(SortedMap sortedMap) {
            super(sortedMap);
        }

        public SortedSet c() {
            return new i(d());
        }

        @Override // java.util.SortedMap
        public Comparator comparator() {
            return d().comparator();
        }

        public SortedMap d() {
            return (SortedMap) this.c;
        }

        @Override // java.util.SortedMap
        public Object firstKey() {
            return d().firstKey();
        }

        public SortedMap headMap(Object obj) {
            return new h(d().headMap(obj));
        }

        @Override // java.util.SortedMap
        public Object lastKey() {
            return d().lastKey();
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return new h(d().subMap(obj, obj2));
        }

        public SortedMap tailMap(Object obj) {
            return new h(d().tailMap(obj));
        }

        @Override // com.applovin.impl.AbstractC1065f.b, java.util.AbstractMap, java.util.Map
        public SortedSet keySet() {
            SortedSet sortedSet = this.f;
            if (sortedSet == null) {
                SortedSet c = c();
                this.f = c;
                return c;
            }
            return sortedSet;
        }
    }

    /* renamed from: com.applovin.impl.f$i */
    /* loaded from: classes.dex */
    public class i extends d implements SortedSet {
        public i(SortedMap sortedMap) {
            super(sortedMap);
        }

        public SortedMap b() {
            return (SortedMap) super.a();
        }

        @Override // java.util.SortedSet
        public Comparator comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedSet
        public Object first() {
            return b().firstKey();
        }

        public SortedSet headSet(Object obj) {
            return new i(b().headMap(obj));
        }

        @Override // java.util.SortedSet
        public Object last() {
            return b().lastKey();
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return new i(b().subMap(obj, obj2));
        }

        public SortedSet tailSet(Object obj) {
            return new i(b().tailMap(obj));
        }
    }

    public AbstractC1065f(Map map) {
        Preconditions.checkArgument(map.isEmpty());
        this.d = map;
    }

    public static /* synthetic */ int b(AbstractC1065f abstractC1065f) {
        int i2 = abstractC1065f.f;
        abstractC1065f.f = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int c(AbstractC1065f abstractC1065f) {
        int i2 = abstractC1065f.f;
        abstractC1065f.f = i2 - 1;
        return i2;
    }

    public abstract Collection a(Object obj, Collection collection);

    public abstract Collection c(Collection collection);

    @Override // com.applovin.impl.tf
    public void clear() {
        for (Collection collection : this.d.values()) {
            collection.clear();
        }
        this.d.clear();
        this.f = 0;
    }

    @Override // com.applovin.impl.AbstractC1067h
    public Collection d() {
        return new AbstractC1067h.a();
    }

    @Override // com.applovin.impl.AbstractC1067h
    public Iterator f() {
        return new a();
    }

    public abstract Collection g();

    public final Map h() {
        Map map = this.d;
        if (map instanceof NavigableMap) {
            return new e((NavigableMap) this.d);
        }
        if (map instanceof SortedMap) {
            return new h((SortedMap) this.d);
        }
        return new b(this.d);
    }

    public final Set i() {
        Map map = this.d;
        if (map instanceof NavigableMap) {
            return new C0012f((NavigableMap) this.d);
        }
        if (map instanceof SortedMap) {
            return new i((SortedMap) this.d);
        }
        return new d(this.d);
    }

    @Override // com.applovin.impl.tf
    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.d.get(obj);
        if (collection == null) {
            Collection b2 = b(obj);
            if (b2.add(obj2)) {
                this.f++;
                this.d.put(obj, b2);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(obj2)) {
            this.f++;
            return true;
        } else {
            return false;
        }
    }

    @Override // com.applovin.impl.tf
    public int size() {
        return this.f;
    }

    @Override // com.applovin.impl.AbstractC1067h, com.applovin.impl.tf
    public Collection values() {
        return super.values();
    }

    /* renamed from: com.applovin.impl.f$j */
    /* loaded from: classes.dex */
    public class j extends AbstractCollection {
        final Object a;
        Collection b;
        final j c;
        final Collection d;

        public j(Object obj, Collection collection, j jVar) {
            Collection c;
            this.a = obj;
            this.b = collection;
            this.c = jVar;
            if (jVar == null) {
                c = null;
            } else {
                c = jVar.c();
            }
            this.d = c;
        }

        public void a() {
            j jVar = this.c;
            if (jVar != null) {
                jVar.a();
            } else {
                AbstractC1065f.this.d.put(this.a, this.b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            e();
            boolean isEmpty = this.b.isEmpty();
            boolean add = this.b.add(obj);
            if (add) {
                AbstractC1065f.b(AbstractC1065f.this);
                if (isEmpty) {
                    a();
                }
            }
            return add;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.b.addAll(collection);
            if (addAll) {
                AbstractC1065f.a(AbstractC1065f.this, this.b.size() - size);
                if (size == 0) {
                    a();
                }
            }
            return addAll;
        }

        public j b() {
            return this.c;
        }

        public Collection c() {
            return this.b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.b.clear();
            AbstractC1065f.b(AbstractC1065f.this, size);
            f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            e();
            return this.b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection collection) {
            e();
            return this.b.containsAll(collection);
        }

        public Object d() {
            return this.a;
        }

        public void e() {
            Collection collection;
            j jVar = this.c;
            if (jVar != null) {
                jVar.e();
                if (this.c.c() != this.d) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.b.isEmpty() && (collection = (Collection) AbstractC1065f.this.d.get(this.a)) != null) {
                this.b = collection;
            }
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            e();
            return this.b.equals(obj);
        }

        public void f() {
            j jVar = this.c;
            if (jVar != null) {
                jVar.f();
            } else if (this.b.isEmpty()) {
                AbstractC1065f.this.d.remove(this.a);
            }
        }

        @Override // java.util.Collection
        public int hashCode() {
            e();
            return this.b.hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            e();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            e();
            boolean remove = this.b.remove(obj);
            if (remove) {
                AbstractC1065f.c(AbstractC1065f.this);
                f();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.b.removeAll(collection);
            if (removeAll) {
                AbstractC1065f.a(AbstractC1065f.this, this.b.size() - size);
                f();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            Preconditions.checkNotNull(collection);
            int size = size();
            boolean retainAll = this.b.retainAll(collection);
            if (retainAll) {
                AbstractC1065f.a(AbstractC1065f.this, this.b.size() - size);
                f();
            }
            return retainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            e();
            return this.b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            e();
            return this.b.toString();
        }

        /* renamed from: com.applovin.impl.f$j$a */
        /* loaded from: classes.dex */
        public class a implements Iterator {
            final Iterator a;
            final Collection b;

            public a() {
                Collection collection = j.this.b;
                this.b = collection;
                this.a = AbstractC1065f.b(collection);
            }

            public Iterator a() {
                b();
                return this.a;
            }

            public void b() {
                j.this.e();
                if (j.this.b == this.b) {
                    return;
                }
                throw new ConcurrentModificationException();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                return this.a.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                b();
                return this.a.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.a.remove();
                AbstractC1065f.c(AbstractC1065f.this);
                j.this.f();
            }

            public a(Iterator it) {
                this.b = j.this.b;
                this.a = it;
            }
        }
    }

    /* renamed from: com.applovin.impl.f$k */
    /* loaded from: classes.dex */
    public class k extends j implements List {

        /* renamed from: com.applovin.impl.f$k$a */
        /* loaded from: classes.dex */
        public class a extends j.a implements ListIterator {
            public a() {
                super();
            }

            private ListIterator c() {
                return (ListIterator) a();
            }

            @Override // java.util.ListIterator
            public void add(Object obj) {
                boolean isEmpty = k.this.isEmpty();
                c().add(obj);
                AbstractC1065f.b(AbstractC1065f.this);
                if (isEmpty) {
                    k.this.a();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return c().nextIndex();
            }

            @Override // java.util.ListIterator
            public Object previous() {
                return c().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(Object obj) {
                c().set(obj);
            }

            public a(int i) {
                super(k.this.g().listIterator(i));
            }
        }

        public k(Object obj, List list, j jVar) {
            super(obj, list, jVar);
        }

        @Override // java.util.List
        public void add(int i, Object obj) {
            e();
            boolean isEmpty = c().isEmpty();
            g().add(i, obj);
            AbstractC1065f.b(AbstractC1065f.this);
            if (isEmpty) {
                a();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = g().addAll(i, collection);
            if (addAll) {
                AbstractC1065f.a(AbstractC1065f.this, c().size() - size);
                if (size == 0) {
                    a();
                }
            }
            return addAll;
        }

        public List g() {
            return (List) c();
        }

        @Override // java.util.List
        public Object get(int i) {
            e();
            return g().get(i);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            e();
            return g().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            e();
            return g().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            e();
            return new a();
        }

        @Override // java.util.List
        public Object remove(int i) {
            e();
            Object remove = g().remove(i);
            AbstractC1065f.c(AbstractC1065f.this);
            f();
            return remove;
        }

        @Override // java.util.List
        public Object set(int i, Object obj) {
            e();
            return g().set(i, obj);
        }

        @Override // java.util.List
        public List subList(int i, int i2) {
            j b;
            e();
            AbstractC1065f abstractC1065f = AbstractC1065f.this;
            Object d = d();
            List subList = g().subList(i, i2);
            if (b() == null) {
                b = this;
            } else {
                b = b();
            }
            return abstractC1065f.a(d, subList, b);
        }

        @Override // java.util.List
        public ListIterator listIterator(int i) {
            e();
            return new a(i);
        }
    }

    public static /* synthetic */ int b(AbstractC1065f abstractC1065f, int i2) {
        int i3 = abstractC1065f.f - i2;
        abstractC1065f.f = i3;
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Object obj) {
        Collection collection = (Collection) uc.d(this.d, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f -= size;
        }
    }

    public static /* synthetic */ int a(AbstractC1065f abstractC1065f, int i2) {
        int i3 = abstractC1065f.f + i2;
        abstractC1065f.f = i3;
        return i3;
    }

    public Collection b(Object obj) {
        return g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Iterator b(Collection collection) {
        if (collection instanceof List) {
            return ((List) collection).listIterator();
        }
        return collection.iterator();
    }

    public final List a(Object obj, List list, j jVar) {
        if (list instanceof RandomAccess) {
            return new g(obj, list, jVar);
        }
        return new k(obj, list, jVar);
    }
}
