package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.exoplayer2.common.base.Preconditions;
import io.flutter.embedding.android.KeyboardMap;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class w3 extends AbstractMap implements Serializable {
    private transient int[] a;
    transient long[] b;
    transient Object[] c;
    transient Object[] d;
    transient float f;
    transient int g;
    private transient int h;
    private transient int i;
    private transient Set j;
    private transient Set k;
    private transient Collection l;

    /* loaded from: classes.dex */
    public class a extends e {
        public a() {
            super(w3.this, null);
        }

        @Override // com.applovin.impl.w3.e
        public Object a(int i) {
            return w3.this.c[i];
        }
    }

    /* loaded from: classes.dex */
    public class b extends e {
        public b() {
            super(w3.this, null);
        }

        @Override // com.applovin.impl.w3.e
        /* renamed from: b */
        public Map.Entry a(int i) {
            return new g(i);
        }
    }

    /* loaded from: classes.dex */
    public class c extends e {
        public c() {
            super(w3.this, null);
        }

        @Override // com.applovin.impl.w3.e
        public Object a(int i) {
            return w3.this.d[i];
        }
    }

    /* loaded from: classes.dex */
    public class d extends AbstractSet {
        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            w3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a = w3.this.a(entry.getKey());
            if (a == -1 || !Objects.equal(w3.this.d[a], entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return w3.this.e();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                int a = w3.this.a(entry.getKey());
                if (a != -1 && Objects.equal(w3.this.d[a], entry.getValue())) {
                    w3.this.f(a);
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return w3.this.i;
        }
    }

    /* loaded from: classes.dex */
    public class f extends AbstractSet {
        public f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            w3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return w3.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return w3.this.h();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int a = w3.this.a(obj);
            if (a != -1) {
                w3.this.f(a);
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return w3.this.i;
        }
    }

    /* loaded from: classes.dex */
    public final class g extends AbstractC1066g {
        private final Object a;
        private int b;

        public g(int i) {
            this.a = w3.this.c[i];
            this.b = i;
        }

        private void a() {
            int i = this.b;
            if (i == -1 || i >= w3.this.size() || !Objects.equal(this.a, w3.this.c[this.b])) {
                this.b = w3.this.a(this.a);
            }
        }

        @Override // com.applovin.impl.AbstractC1066g, java.util.Map.Entry
        public Object getKey() {
            return this.a;
        }

        @Override // com.applovin.impl.AbstractC1066g, java.util.Map.Entry
        public Object getValue() {
            a();
            int i = this.b;
            if (i == -1) {
                return null;
            }
            return w3.this.d[i];
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            a();
            int i = this.b;
            if (i == -1) {
                w3.this.put(this.a, obj);
                return null;
            }
            Object[] objArr = w3.this.d;
            Object obj2 = objArr[i];
            objArr[i] = obj;
            return obj2;
        }
    }

    /* loaded from: classes.dex */
    public class h extends AbstractCollection {
        public h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            w3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return w3.this.i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return w3.this.i;
        }
    }

    public w3() {
        a(3, 1.0f);
    }

    private static int b(long j) {
        return (int) j;
    }

    private static long[] d(int i) {
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    private static int[] e(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private int g() {
        return this.a.length - 1;
    }

    private void h(int i) {
        int length = this.b.length;
        if (i > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                g(max);
            }
        }
    }

    private void i(int i) {
        if (this.a.length >= 1073741824) {
            this.h = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (i * this.f)) + 1;
        int[] e2 = e(i);
        long[] jArr = this.b;
        int length = e2.length - 1;
        for (int i3 = 0; i3 < this.i; i3++) {
            int a2 = a(jArr[i3]);
            int i4 = a2 & length;
            int i5 = e2[i4];
            e2[i4] = i3;
            jArr[i3] = (a2 << 32) | (i5 & KeyboardMap.kValueMask);
        }
        this.h = i2;
        this.a = e2;
    }

    public int a(int i, int i2) {
        return i - 1;
    }

    public void c(int i) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.c;
            objArr[i] = objArr[size];
            Object[] objArr2 = this.d;
            objArr2[i] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            long[] jArr = this.b;
            long j = jArr[size];
            jArr[i] = j;
            jArr[size] = -1;
            int a2 = a(j) & g();
            int[] iArr = this.a;
            int i2 = iArr[a2];
            if (i2 == size) {
                iArr[a2] = i;
                return;
            }
            while (true) {
                long j2 = this.b[i2];
                int b2 = b(j2);
                if (b2 == size) {
                    this.b[i2] = a(j2, i);
                    return;
                }
                i2 = b2;
            }
        } else {
            this.c[i] = null;
            this.d[i] = null;
            this.b[i] = -1;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.g++;
        Arrays.fill(this.c, 0, this.i, (Object) null);
        Arrays.fill(this.d, 0, this.i, (Object) null);
        Arrays.fill(this.a, -1);
        Arrays.fill(this.b, -1L);
        this.i = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        if (a(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        for (int i = 0; i < this.i; i++) {
            if (Objects.equal(obj, this.d[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.k;
        if (set == null) {
            Set b2 = b();
            this.k = b2;
            return b2;
        }
        return set;
    }

    public int f() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        int a2 = a(obj);
        a(a2);
        if (a2 == -1) {
            return null;
        }
        return this.d[a2];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        if (this.i == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.j;
        if (set == null) {
            Set c2 = c();
            this.j = c2;
            return c2;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        long[] jArr = this.b;
        Object[] objArr = this.c;
        Object[] objArr2 = this.d;
        int a2 = ja.a(obj);
        int g2 = g() & a2;
        int i = this.i;
        int[] iArr = this.a;
        int i2 = iArr[g2];
        if (i2 == -1) {
            iArr[g2] = i;
        } else {
            while (true) {
                long j = jArr[i2];
                if (a(j) == a2 && Objects.equal(obj, objArr[i2])) {
                    Object obj3 = objArr2[i2];
                    objArr2[i2] = obj2;
                    a(i2);
                    return obj3;
                }
                int b2 = b(j);
                if (b2 == -1) {
                    jArr[i2] = a(j, i);
                    break;
                }
                i2 = b2;
            }
        }
        if (i != Integer.MAX_VALUE) {
            int i3 = i + 1;
            h(i3);
            a(i, obj, obj2, a2);
            this.i = i3;
            if (i >= this.h) {
                i(this.a.length * 2);
            }
            this.g++;
            return null;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        return a(obj, ja.a(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.l;
        if (collection == null) {
            Collection d2 = d();
            this.l = d2;
            return d2;
        }
        return collection;
    }

    private static int a(long j) {
        return (int) (j >>> 32);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object f(int i) {
        return a(this.c[i], a(this.b[i]));
    }

    public int b(int i) {
        int i2 = i + 1;
        if (i2 < this.i) {
            return i2;
        }
        return -1;
    }

    public void g(int i) {
        this.c = Arrays.copyOf(this.c, i);
        this.d = Arrays.copyOf(this.d, i);
        long[] jArr = this.b;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1L);
        }
        this.b = copyOf;
    }

    private static long a(long j, int i) {
        return (j & (-4294967296L)) | (i & KeyboardMap.kValueMask);
    }

    public Set b() {
        return new d();
    }

    public Collection d() {
        return new h();
    }

    public Iterator e() {
        return new b();
    }

    /* loaded from: classes.dex */
    public abstract class e implements Iterator {
        int a;
        int b;
        int c;

        private e() {
            this.a = w3.this.g;
            this.b = w3.this.f();
            this.c = -1;
        }

        private void a() {
            if (w3.this.g != this.a) {
                throw new ConcurrentModificationException();
            }
        }

        public abstract Object a(int i);

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.b >= 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (hasNext()) {
                int i = this.b;
                this.c = i;
                Object a = a(i);
                this.b = w3.this.b(this.b);
                return a;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            boolean z;
            a();
            if (this.c >= 0) {
                z = true;
            } else {
                z = false;
            }
            p3.a(z);
            this.a++;
            w3.this.f(this.c);
            this.b = w3.this.a(this.b, this.c);
            this.c = -1;
        }

        public /* synthetic */ e(w3 w3Var, a aVar) {
            this();
        }
    }

    public void a(int i) {
    }

    public Iterator h() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(Object obj) {
        int a2 = ja.a(obj);
        int i = this.a[g() & a2];
        while (i != -1) {
            long j = this.b[i];
            if (a(j) == a2 && Objects.equal(obj, this.c[i])) {
                return i;
            }
            i = b(j);
        }
        return -1;
    }

    public void a(int i, float f2) {
        Preconditions.checkArgument(i >= 0, "Initial capacity must be non-negative");
        Preconditions.checkArgument(f2 > 0.0f, "Illegal load factor");
        int a2 = ja.a(i, f2);
        this.a = e(a2);
        this.f = f2;
        this.c = new Object[i];
        this.d = new Object[i];
        this.b = d(i);
        this.h = Math.max(1, (int) (a2 * f2));
    }

    public Iterator i() {
        return new c();
    }

    public Set c() {
        return new f();
    }

    public void a(int i, Object obj, Object obj2, int i2) {
        this.b[i] = (i2 << 32) | KeyboardMap.kValueMask;
        this.c[i] = obj;
        this.d[i] = obj2;
    }

    private Object a(Object obj, int i) {
        int g2 = g() & i;
        int i2 = this.a[g2];
        if (i2 == -1) {
            return null;
        }
        int i3 = -1;
        while (true) {
            if (a(this.b[i2]) == i && Objects.equal(obj, this.c[i2])) {
                Object obj2 = this.d[i2];
                if (i3 == -1) {
                    this.a[g2] = b(this.b[i2]);
                } else {
                    long[] jArr = this.b;
                    jArr[i3] = a(jArr[i3], b(jArr[i2]));
                }
                c(i2);
                this.i--;
                this.g++;
                return obj2;
            }
            int b2 = b(this.b[i2]);
            if (b2 == -1) {
                return null;
            }
            i3 = i2;
            i2 = b2;
        }
    }

    public static w3 a() {
        return new w3();
    }
}
