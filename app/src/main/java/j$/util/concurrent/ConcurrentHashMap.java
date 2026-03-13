package j$.util.concurrent;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
/* loaded from: classes4.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, v {
    static final int g = Runtime.getRuntime().availableProcessors();
    private static final j$.sun.misc.a h;
    private static final long i;
    private static final long j;
    private static final long k;
    private static final long l;
    private static final long m;
    private static final int n;
    private static final int o;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;
    volatile transient l[] a;
    private volatile transient l[] b;
    private volatile transient long baseCount;
    private volatile transient c[] c;
    private volatile transient int cellsBusy;
    private transient i d;
    private transient s e;
    private transient e f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    static final int i(int i2) {
        return (i2 ^ (i2 >>> 16)) & Integer.MAX_VALUE;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return compute(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return computeIfAbsent(obj, Function.VivifiedWrapper.convert(function));
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    static {
        ObjectStreamField objectStreamField = new ObjectStreamField("segments", n[].class);
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{objectStreamField, new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        j$.sun.misc.a h2 = j$.sun.misc.a.h();
        h = h2;
        i = h2.j(ConcurrentHashMap.class, "sizeCtl");
        j = h2.j(ConcurrentHashMap.class, "transferIndex");
        k = h2.j(ConcurrentHashMap.class, "baseCount");
        l = h2.j(ConcurrentHashMap.class, "cellsBusy");
        m = h2.j(c.class, "value");
        n = h2.a(l[].class);
        int b = h2.b(l[].class);
        if (((b - 1) & b) != 0) {
            throw new ExceptionInInitializerError("array index scale not a power of two");
        }
        o = 31 - Integer.numberOfLeadingZeros(b);
    }

    private static final int l(int i2) {
        int numberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i2 - 1);
        if (numberOfLeadingZeros < 0) {
            return 1;
        }
        if (numberOfLeadingZeros >= 1073741824) {
            return 1073741824;
        }
        return 1 + numberOfLeadingZeros;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class c(Object obj) {
        Type[] actualTypeArguments;
        if (obj instanceof Comparable) {
            Class<?> cls = obj.getClass();
            if (cls == String.class) {
                return cls;
            }
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces != null) {
                for (Type type : genericInterfaces) {
                    if (type instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) type;
                        if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                            return cls;
                        }
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final l k(l[] lVarArr, int i2) {
        return (l) h.g(lVarArr, (i2 << o) + n);
    }

    static final boolean b(l[] lVarArr, int i2, l lVar) {
        return h.e(lVarArr, (i2 << o) + n, lVar);
    }

    static final void h(l[] lVarArr, int i2, l lVar) {
        h.l(lVarArr, (i2 << o) + n, lVar);
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i2) {
        this(i2, 0.75f, 1);
    }

    public ConcurrentHashMap(Map<? extends K, ? extends V> map) {
        this.sizeCtl = 16;
        putAll(map);
    }

    public ConcurrentHashMap(int i2, float f, int i3) {
        if (f <= 0.0f || i2 < 0 || i3 <= 0) {
            throw new IllegalArgumentException();
        }
        long j2 = (long) (((i2 < i3 ? i3 : i2) / f) + 1.0d);
        this.sizeCtl = j2 >= 1073741824 ? 1073741824 : l((int) j2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j2 = j();
        if (j2 < 0) {
            return 0;
        }
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return j() <= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004d, code lost:
        return (V) r1.c;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public V get(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            int r0 = i(r0)
            j$.util.concurrent.l[] r1 = r4.a
            r2 = 0
            if (r1 == 0) goto L4e
            int r3 = r1.length
            if (r3 <= 0) goto L4e
            int r3 = r3 + (-1)
            r3 = r3 & r0
            j$.util.concurrent.l r1 = k(r1, r3)
            if (r1 == 0) goto L4e
            int r3 = r1.a
            if (r3 != r0) goto L2c
            java.lang.Object r3 = r1.b
            if (r3 == r5) goto L29
            if (r3 == 0) goto L37
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L37
        L29:
            java.lang.Object r5 = r1.c
            return r5
        L2c:
            if (r3 >= 0) goto L37
            j$.util.concurrent.l r5 = r1.a(r5, r0)
            if (r5 == 0) goto L36
            java.lang.Object r2 = r5.c
        L36:
            return r2
        L37:
            j$.util.concurrent.l r1 = r1.d
            if (r1 == 0) goto L4e
            int r3 = r1.a
            if (r3 != r0) goto L37
            java.lang.Object r3 = r1.b
            if (r3 == r5) goto L4b
            if (r3 == 0) goto L37
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L37
        L4b:
            java.lang.Object r5 = r1.c
            return r5
        L4e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        obj.getClass();
        l[] lVarArr = this.a;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l b = pVar.b();
                if (b == null) {
                    break;
                }
                Object obj2 = b.c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
        return (V) f(k2, v, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a5, code lost:
        throw new java.lang.IllegalStateException("Recursive update");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00b4, code lost:
        a(1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00b9, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.Object r9, java.lang.Object r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.f(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        o(map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            f(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        return (V) g(obj, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ae, code lost:
        throw new java.lang.IllegalStateException("Recursive update");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            r12 = this;
            int r0 = r13.hashCode()
            int r0 = i(r0)
            j$.util.concurrent.l[] r1 = r12.a
        La:
            r2 = 0
            if (r1 == 0) goto Lc0
            int r3 = r1.length
            if (r3 == 0) goto Lc0
            int r3 = r3 + (-1)
            r3 = r3 & r0
            j$.util.concurrent.l r4 = k(r1, r3)
            if (r4 != 0) goto L1b
            goto Lc0
        L1b:
            int r5 = r4.a
            r6 = -1
            if (r5 != r6) goto L25
            j$.util.concurrent.l[] r1 = r12.d(r1, r4)
            goto La
        L25:
            monitor-enter(r4)
            j$.util.concurrent.l r7 = k(r1, r3)     // Catch: java.lang.Throwable -> L42
            if (r7 != r4) goto Laf
            r7 = 1
            if (r5 < 0) goto L6e
            r8 = r2
            r5 = r4
        L31:
            int r9 = r5.a     // Catch: java.lang.Throwable -> L42
            if (r9 != r0) goto L65
            java.lang.Object r9 = r5.b     // Catch: java.lang.Throwable -> L42
            if (r9 == r13) goto L45
            if (r9 == 0) goto L65
            boolean r9 = r13.equals(r9)     // Catch: java.lang.Throwable -> L42
            if (r9 == 0) goto L65
            goto L45
        L42:
            r13 = move-exception
            goto Lbe
        L45:
            java.lang.Object r9 = r5.c     // Catch: java.lang.Throwable -> L42
            if (r15 == 0) goto L53
            if (r15 == r9) goto L53
            if (r9 == 0) goto Lb0
            boolean r10 = r15.equals(r9)     // Catch: java.lang.Throwable -> L42
            if (r10 == 0) goto Lb0
        L53:
            if (r14 == 0) goto L58
            r5.c = r14     // Catch: java.lang.Throwable -> L42
            goto Lb1
        L58:
            if (r8 == 0) goto L5f
            j$.util.concurrent.l r3 = r5.d     // Catch: java.lang.Throwable -> L42
            r8.d = r3     // Catch: java.lang.Throwable -> L42
            goto Lb1
        L5f:
            j$.util.concurrent.l r5 = r5.d     // Catch: java.lang.Throwable -> L42
            h(r1, r3, r5)     // Catch: java.lang.Throwable -> L42
            goto Lb1
        L65:
            j$.util.concurrent.l r8 = r5.d     // Catch: java.lang.Throwable -> L42
            if (r8 != 0) goto L6a
            goto Lb0
        L6a:
            r11 = r8
            r8 = r5
            r5 = r11
            goto L31
        L6e:
            boolean r5 = r4 instanceof j$.util.concurrent.q     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto La2
            r5 = r4
            j$.util.concurrent.q r5 = (j$.util.concurrent.q) r5     // Catch: java.lang.Throwable -> L42
            j$.util.concurrent.r r8 = r5.e     // Catch: java.lang.Throwable -> L42
            if (r8 == 0) goto Lb0
            j$.util.concurrent.r r8 = r8.b(r0, r13, r2)     // Catch: java.lang.Throwable -> L42
            if (r8 == 0) goto Lb0
            java.lang.Object r9 = r8.c     // Catch: java.lang.Throwable -> L42
            if (r15 == 0) goto L8d
            if (r15 == r9) goto L8d
            if (r9 == 0) goto Lb0
            boolean r10 = r15.equals(r9)     // Catch: java.lang.Throwable -> L42
            if (r10 == 0) goto Lb0
        L8d:
            if (r14 == 0) goto L92
            r8.c = r14     // Catch: java.lang.Throwable -> L42
            goto Lb1
        L92:
            boolean r8 = r5.f(r8)     // Catch: java.lang.Throwable -> L42
            if (r8 == 0) goto Lb1
            j$.util.concurrent.r r5 = r5.f     // Catch: java.lang.Throwable -> L42
            j$.util.concurrent.l r5 = p(r5)     // Catch: java.lang.Throwable -> L42
            h(r1, r3, r5)     // Catch: java.lang.Throwable -> L42
            goto Lb1
        La2:
            boolean r3 = r4 instanceof j$.util.concurrent.m     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto La7
            goto Laf
        La7:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L42
            java.lang.String r14 = "Recursive update"
            r13.<init>(r14)     // Catch: java.lang.Throwable -> L42
            throw r13     // Catch: java.lang.Throwable -> L42
        Laf:
            r7 = 0
        Lb0:
            r9 = r2
        Lb1:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            if (r7 == 0) goto La
            if (r9 == 0) goto Lc0
            if (r14 != 0) goto Lbd
            r13 = -1
            r12.a(r13, r6)
        Lbd:
            return r9
        Lbe:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L42
            throw r13
        Lc0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.g(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        l k2;
        l lVar;
        l[] lVarArr = this.a;
        long j2 = 0;
        loop0: while (true) {
            int i2 = 0;
            while (lVarArr != null && i2 < lVarArr.length) {
                k2 = k(lVarArr, i2);
                if (k2 == null) {
                    i2++;
                } else {
                    int i3 = k2.a;
                    if (i3 == -1) {
                        break;
                    }
                    synchronized (k2) {
                        try {
                            if (k(lVarArr, i2) == k2) {
                                if (i3 >= 0) {
                                    lVar = k2;
                                } else {
                                    lVar = k2 instanceof q ? ((q) k2).f : null;
                                }
                                while (lVar != null) {
                                    j2--;
                                    lVar = lVar.d;
                                }
                                h(lVarArr, i2, null);
                                i2++;
                            }
                        } finally {
                        }
                    }
                }
            }
            lVarArr = d(lVarArr, k2);
        }
        if (j2 != 0) {
            a(j2, -1);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.util.concurrent.b, java.util.Set<K>, j$.util.concurrent.i] */
    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        i iVar = this.d;
        if (iVar != null) {
            return iVar;
        }
        ?? r0 = (Set<K>) new b(this);
        this.d = r0;
        return r0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Collection<V>, j$.util.concurrent.b, j$.util.concurrent.s] */
    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        s sVar = this.e;
        if (sVar != null) {
            return sVar;
        }
        b bVar = new b(this);
        this.e = bVar;
        return bVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.util.concurrent.b, j$.util.concurrent.e, java.util.Set<java.util.Map$Entry<K, V>>] */
    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        e eVar = this.f;
        if (eVar != null) {
            return eVar;
        }
        ?? r0 = (Set<Map.Entry<K, V>>) new b(this);
        this.f = r0;
        return r0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        l[] lVarArr = this.a;
        int i2 = 0;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l b = pVar.b();
                if (b == null) {
                    break;
                }
                i2 += b.c.hashCode() ^ b.b.hashCode();
            }
        }
        return i2;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        l[] lVarArr = this.a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        p pVar = new p(lVarArr, length, 0, length);
        StringBuilder sb = new StringBuilder("{");
        l b = pVar.b();
        if (b != null) {
            while (true) {
                Object obj = b.b;
                Object obj2 = b.c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                b = pVar.b();
                if (b == null) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        V value;
        V v;
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                l[] lVarArr = this.a;
                int length = lVarArr == null ? 0 : lVarArr.length;
                p pVar = new p(lVarArr, length, 0, length);
                while (true) {
                    l b = pVar.b();
                    if (b != null) {
                        Object obj2 = b.c;
                        Object obj3 = map.get(b.b);
                        if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                            break;
                        }
                    } else {
                        for (Map.Entry<K, V> entry : map.entrySet()) {
                            K key = entry.getKey();
                            if (key == null || (value = entry.getValue()) == null || (v = get(key)) == null || (value != v && !value.equals(v))) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i2 = 1;
        int i3 = 0;
        while (i2 < 16) {
            i3++;
            i2 <<= 1;
        }
        int i4 = 32 - i3;
        int i5 = i2 - 1;
        n[] nVarArr = new n[16];
        for (int i6 = 0; i6 < 16; i6++) {
            nVarArr[i6] = new ReentrantLock();
        }
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("segments", nVarArr);
        putFields.put("segmentShift", i4);
        putFields.put("segmentMask", i5);
        objectOutputStream.writeFields();
        l[] lVarArr = this.a;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l b = pVar.b();
                if (b == null) {
                    break;
                }
                objectOutputStream.writeObject(b.b);
                objectOutputStream.writeObject(b.c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j2;
        boolean z;
        boolean z2;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j3 = 0;
        long j4 = 0;
        l lVar = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j2 = 1;
            if (readObject == null || readObject2 == null) {
                break;
            }
            j4++;
            lVar = new l(i(readObject.hashCode()), readObject, readObject2, lVar);
        }
        if (j4 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j5 = (long) ((((float) j4) / 0.75f) + 1.0d);
        int l2 = j5 >= 1073741824 ? 1073741824 : l((int) j5);
        l[] lVarArr = new l[l2];
        int i2 = l2 - 1;
        while (lVar != null) {
            l lVar2 = lVar.d;
            int i3 = lVar.a;
            int i4 = i3 & i2;
            l k2 = k(lVarArr, i4);
            if (k2 == null) {
                z2 = true;
            } else {
                Object obj2 = lVar.b;
                if (k2.a >= 0) {
                    int i5 = 0;
                    for (l lVar3 = k2; lVar3 != null; lVar3 = lVar3.d) {
                        if (lVar3.a == i3 && ((obj = lVar3.b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z = false;
                            break;
                        }
                        i5++;
                    }
                    z = true;
                    if (!z || i5 < 8) {
                        z2 = z;
                    } else {
                        long j6 = j3 + 1;
                        lVar.d = k2;
                        l lVar4 = lVar;
                        r rVar = null;
                        r rVar2 = null;
                        while (lVar4 != null) {
                            long j7 = j6;
                            r rVar3 = new r(lVar4.a, lVar4.b, lVar4.c, null, null);
                            rVar3.h = rVar2;
                            if (rVar2 == null) {
                                rVar = rVar3;
                            } else {
                                rVar2.d = rVar3;
                            }
                            lVar4 = lVar4.d;
                            rVar2 = rVar3;
                            j6 = j7;
                        }
                        h(lVarArr, i4, new q(rVar));
                        j3 = j6;
                    }
                } else if (((q) k2).e(i3, obj2, lVar.c) == null) {
                    j3 += j2;
                }
                z2 = false;
            }
            j2 = 1;
            if (z2) {
                j3++;
                lVar.d = k2;
                h(lVarArr, i4, lVar);
            }
            lVar = lVar2;
        }
        this.a = lVarArr;
        this.sizeCtl = l2 - (l2 >>> 2);
        this.baseCount = j3;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k2, V v) {
        return (V) f(k2, v, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || g(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return g(obj, obj3, obj2) != null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw null;
        }
        return g(obj, obj2, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        V v = get(obj);
        return v == null ? obj2 : v;
    }

    @Override // j$.util.Map
    public final void forEach(j$.util.function.BiConsumer biConsumer) {
        biConsumer.getClass();
        l[] lVarArr = this.a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l b = pVar.b();
            if (b == null) {
                return;
            }
            biConsumer.accept(b.b, b.c);
        }
    }

    @Override // j$.util.Map
    public final void replaceAll(j$.util.function.BiFunction biFunction) {
        biFunction.getClass();
        l[] lVarArr = this.a;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l b = pVar.b();
            if (b == null) {
                return;
            }
            Object obj = b.c;
            Object obj2 = b.b;
            do {
                Object apply = biFunction.apply(obj2, obj);
                apply.getClass();
                if (g(obj2, apply, obj) == null) {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x00f0, code lost:
        if (r5 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00f2, code lost:
        a(1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00f7, code lost:
        return r5;
     */
    @Override // j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object computeIfAbsent(java.lang.Object r12, j$.util.function.Function r13) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfAbsent(java.lang.Object, j$.util.function.Function):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00aa, code lost:
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object computeIfPresent(java.lang.Object r14, j$.util.function.BiFunction r15) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto Lbd
            if (r15 == 0) goto Lbd
            int r1 = r14.hashCode()
            int r1 = i(r1)
            j$.util.concurrent.l[] r2 = r13.a
            r3 = 0
            r5 = r0
            r4 = 0
        L12:
            if (r2 == 0) goto Lb7
            int r6 = r2.length
            if (r6 != 0) goto L19
            goto Lb7
        L19:
            int r6 = r6 + (-1)
            r6 = r6 & r1
            j$.util.concurrent.l r7 = k(r2, r6)
            if (r7 != 0) goto L24
            goto Lae
        L24:
            int r8 = r7.a
            r9 = -1
            if (r8 != r9) goto L2e
            j$.util.concurrent.l[] r2 = r13.d(r2, r7)
            goto L12
        L2e:
            monitor-enter(r7)
            j$.util.concurrent.l r10 = k(r2, r6)     // Catch: java.lang.Throwable -> L4b
            if (r10 != r7) goto Lab
            if (r8 < 0) goto L70
            r4 = 1
            r10 = r0
            r8 = r7
        L3a:
            int r11 = r8.a     // Catch: java.lang.Throwable -> L4b
            if (r11 != r1) goto L65
            java.lang.Object r11 = r8.b     // Catch: java.lang.Throwable -> L4b
            if (r11 == r14) goto L4e
            if (r11 == 0) goto L65
            boolean r11 = r14.equals(r11)     // Catch: java.lang.Throwable -> L4b
            if (r11 == 0) goto L65
            goto L4e
        L4b:
            r14 = move-exception
            goto Lb5
        L4e:
            java.lang.Object r5 = r8.c     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L59
            r8.c = r5     // Catch: java.lang.Throwable -> L4b
            goto Lab
        L59:
            j$.util.concurrent.l r3 = r8.d     // Catch: java.lang.Throwable -> L4b
            if (r10 == 0) goto L60
            r10.d = r3     // Catch: java.lang.Throwable -> L4b
            goto L63
        L60:
            h(r2, r6, r3)     // Catch: java.lang.Throwable -> L4b
        L63:
            r3 = -1
            goto Lab
        L65:
            j$.util.concurrent.l r10 = r8.d     // Catch: java.lang.Throwable -> L4b
            if (r10 != 0) goto L6a
            goto Lab
        L6a:
            int r4 = r4 + 1
            r12 = r10
            r10 = r8
            r8 = r12
            goto L3a
        L70:
            boolean r8 = r7 instanceof j$.util.concurrent.q     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9e
            r4 = r7
            j$.util.concurrent.q r4 = (j$.util.concurrent.q) r4     // Catch: java.lang.Throwable -> L4b
            j$.util.concurrent.r r8 = r4.e     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9c
            j$.util.concurrent.r r8 = r8.b(r1, r14, r0)     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9c
            java.lang.Object r5 = r8.c     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L8c
            r8.c = r5     // Catch: java.lang.Throwable -> L4b
            goto L9c
        L8c:
            boolean r3 = r4.f(r8)     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L9b
            j$.util.concurrent.r r3 = r4.f     // Catch: java.lang.Throwable -> L4b
            j$.util.concurrent.l r3 = p(r3)     // Catch: java.lang.Throwable -> L4b
            h(r2, r6, r3)     // Catch: java.lang.Throwable -> L4b
        L9b:
            r3 = -1
        L9c:
            r4 = 2
            goto Lab
        L9e:
            boolean r6 = r7 instanceof j$.util.concurrent.m     // Catch: java.lang.Throwable -> L4b
            if (r6 != 0) goto La3
            goto Lab
        La3:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4b
            java.lang.String r15 = "Recursive update"
            r14.<init>(r15)     // Catch: java.lang.Throwable -> L4b
            throw r14     // Catch: java.lang.Throwable -> L4b
        Lab:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L12
        Lae:
            if (r3 == 0) goto Lb4
            long r14 = (long) r3
            r13.a(r14, r4)
        Lb4:
            return r5
        Lb5:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4b
            throw r14
        Lb7:
            j$.util.concurrent.l[] r2 = r13.e()
            goto L12
        Lbd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfPresent(java.lang.Object, j$.util.function.BiFunction):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0112, code lost:
        if (r4 == 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0114, code lost:
        a(r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0118, code lost:
        return r5;
     */
    @Override // j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object compute(java.lang.Object r14, j$.util.function.BiFunction r15) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.compute(java.lang.Object, j$.util.function.BiFunction):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00dd, code lost:
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object merge(java.lang.Object r18, java.lang.Object r19, j$.util.function.BiFunction r20) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.merge(java.lang.Object, java.lang.Object, j$.util.function.BiFunction):java.lang.Object");
    }

    public boolean contains(Object obj) {
        return containsValue(obj);
    }

    private final l[] e() {
        while (true) {
            l[] lVarArr = this.a;
            if (lVarArr != null && lVarArr.length != 0) {
                return lVarArr;
            }
            int i2 = this.sizeCtl;
            if (i2 < 0) {
                Thread.yield();
            } else if (h.c(this, i, i2, -1)) {
                try {
                    l[] lVarArr2 = this.a;
                    if (lVarArr2 != null) {
                        if (lVarArr2.length == 0) {
                        }
                        this.sizeCtl = i2;
                        return lVarArr2;
                    }
                    int i3 = i2 > 0 ? i2 : 16;
                    l[] lVarArr3 = new l[i3];
                    this.a = lVarArr3;
                    i2 = i3 - (i3 >>> 2);
                    lVarArr2 = lVarArr3;
                    this.sizeCtl = i2;
                    return lVarArr2;
                } catch (Throwable th) {
                    this.sizeCtl = i2;
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r1.d(r25, r3, r5, r14) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x013f, code lost:
        if (r25.c != r7) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0141, code lost:
        r25.c = (j$.util.concurrent.c[]) java.util.Arrays.copyOf(r7, r8 << 1);
     */
    /* JADX WARN: Removed duplicated region for block: B:149:0x019f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x00ba A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a(long r26, int r28) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.a(long, int):void");
    }

    final l[] d(l[] lVarArr, l lVar) {
        int i2;
        if (lVar instanceof g) {
            l[] lVarArr2 = ((g) lVar).e;
            int numberOfLeadingZeros = Integer.numberOfLeadingZeros(lVarArr.length) | 32768;
            while (true) {
                if (lVarArr2 != this.b || this.a != lVarArr || (i2 = this.sizeCtl) >= 0 || (i2 >>> 16) != numberOfLeadingZeros || i2 == numberOfLeadingZeros + 1 || i2 == 65535 + numberOfLeadingZeros || this.transferIndex <= 0) {
                    break;
                } else if (h.c(this, i, i2, i2 + 1)) {
                    m(lVarArr, lVarArr2);
                    break;
                }
            }
            return lVarArr2;
        }
        return this.a;
    }

    private final void o(int i2) {
        int length;
        int l2 = i2 >= 536870912 ? 1073741824 : l(i2 + (i2 >>> 1) + 1);
        while (true) {
            int i3 = this.sizeCtl;
            if (i3 < 0) {
                return;
            }
            l[] lVarArr = this.a;
            if (lVarArr == null || (length = lVarArr.length) == 0) {
                int i4 = i3 > l2 ? i3 : l2;
                if (h.c(this, i, i3, -1)) {
                    try {
                        if (this.a == lVarArr) {
                            this.a = new l[i4];
                            i3 = i4 - (i4 >>> 2);
                        }
                    } finally {
                        this.sizeCtl = i3;
                    }
                } else {
                    continue;
                }
            } else if (l2 <= i3 || length >= 1073741824) {
                return;
            } else {
                if (lVarArr == this.a && h.c(this, i, i3, ((Integer.numberOfLeadingZeros(length) | 32768) << 16) + 2)) {
                    m(lVarArr, null);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r13v12, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r5v17, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r5v22, types: [j$.util.concurrent.l] */
    private final void m(l[] lVarArr, l[] lVarArr2) {
        l[] lVarArr3;
        int i2;
        int i3;
        g gVar;
        ConcurrentHashMap<K, V> concurrentHashMap;
        int i4;
        l qVar;
        l qVar2;
        r rVar;
        int i5;
        ConcurrentHashMap<K, V> concurrentHashMap2 = this;
        l[] lVarArr4 = lVarArr;
        int length = lVarArr4.length;
        int i6 = g;
        int i7 = i6 > 1 ? (length >>> 3) / i6 : length;
        int i8 = i7 < 16 ? 16 : i7;
        if (lVarArr2 == null) {
            try {
                l[] lVarArr5 = new l[length << 1];
                concurrentHashMap2.b = lVarArr5;
                concurrentHashMap2.transferIndex = length;
                lVarArr3 = lVarArr5;
            } catch (Throwable unused) {
                concurrentHashMap2.sizeCtl = Integer.MAX_VALUE;
                return;
            }
        } else {
            lVarArr3 = lVarArr2;
        }
        int length2 = lVarArr3.length;
        g gVar2 = new g(lVarArr3);
        int i9 = 0;
        int i10 = 0;
        boolean z = true;
        boolean z2 = false;
        while (true) {
            if (z) {
                int i11 = i10 - 1;
                if (i11 >= i9 || z2) {
                    i9 = i9;
                    i10 = i11;
                } else {
                    int i12 = concurrentHashMap2.transferIndex;
                    if (i12 <= 0) {
                        i10 = -1;
                    } else {
                        j$.sun.misc.a aVar = h;
                        long j2 = j;
                        int i13 = i12 > i8 ? i12 - i8 : 0;
                        int i14 = i9;
                        if (aVar.c(this, j2, i12, i13)) {
                            i10 = i12 - 1;
                            i9 = i13;
                        } else {
                            i9 = i14;
                            i10 = i11;
                        }
                    }
                }
                z = false;
            } else {
                int i15 = i9;
                r rVar2 = null;
                if (i10 < 0 || i10 >= length || (i4 = i10 + length) >= length2) {
                    i2 = i8;
                    i3 = length2;
                    gVar = gVar2;
                    if (z2) {
                        this.b = null;
                        this.a = lVarArr3;
                        this.sizeCtl = (length << 1) - (length >>> 1);
                        return;
                    }
                    concurrentHashMap = this;
                    j$.sun.misc.a aVar2 = h;
                    long j3 = i;
                    int i16 = concurrentHashMap.sizeCtl;
                    int i17 = i10;
                    if (!aVar2.c(this, j3, i16, i16 - 1)) {
                        i10 = i17;
                    } else if (i16 - 2 != ((Integer.numberOfLeadingZeros(length) | 32768) << 16)) {
                        return;
                    } else {
                        i10 = length;
                        z = true;
                        z2 = true;
                    }
                } else {
                    l k2 = k(lVarArr4, i10);
                    if (k2 == null) {
                        z = b(lVarArr4, i10, gVar2);
                        concurrentHashMap = concurrentHashMap2;
                        i2 = i8;
                        i3 = length2;
                        gVar = gVar2;
                    } else {
                        int i18 = k2.a;
                        if (i18 == -1) {
                            concurrentHashMap = concurrentHashMap2;
                            i2 = i8;
                            i3 = length2;
                            gVar = gVar2;
                            z = true;
                        } else {
                            synchronized (k2) {
                                try {
                                    if (k(lVarArr4, i10) == k2) {
                                        if (i18 >= 0) {
                                            int i19 = i18 & length;
                                            r rVar3 = k2;
                                            for (r rVar4 = k2.d; rVar4 != null; rVar4 = rVar4.d) {
                                                int i20 = rVar4.a & length;
                                                if (i20 != i19) {
                                                    rVar3 = rVar4;
                                                    i19 = i20;
                                                }
                                            }
                                            if (i19 == 0) {
                                                rVar = null;
                                                rVar2 = rVar3;
                                            } else {
                                                rVar = rVar3;
                                            }
                                            l lVar = k2;
                                            while (lVar != rVar3) {
                                                int i21 = lVar.a;
                                                Object obj = lVar.b;
                                                int i22 = i8;
                                                Object obj2 = lVar.c;
                                                if ((i21 & length) == 0) {
                                                    i5 = length2;
                                                    rVar2 = new l(i21, obj, obj2, rVar2);
                                                } else {
                                                    i5 = length2;
                                                    rVar = new l(i21, obj, obj2, rVar);
                                                }
                                                lVar = lVar.d;
                                                i8 = i22;
                                                length2 = i5;
                                            }
                                            i2 = i8;
                                            i3 = length2;
                                            h(lVarArr3, i10, rVar2);
                                            h(lVarArr3, i4, rVar);
                                            h(lVarArr4, i10, gVar2);
                                            gVar = gVar2;
                                        } else {
                                            i2 = i8;
                                            i3 = length2;
                                            if (k2 instanceof q) {
                                                q qVar3 = (q) k2;
                                                r rVar5 = null;
                                                r rVar6 = null;
                                                l lVar2 = qVar3.f;
                                                int i23 = 0;
                                                int i24 = 0;
                                                r rVar7 = null;
                                                while (lVar2 != null) {
                                                    q qVar4 = qVar3;
                                                    int i25 = lVar2.a;
                                                    g gVar3 = gVar2;
                                                    r rVar8 = new r(i25, lVar2.b, lVar2.c, null, null);
                                                    if ((i25 & length) == 0) {
                                                        rVar8.h = rVar6;
                                                        if (rVar6 == null) {
                                                            rVar2 = rVar8;
                                                        } else {
                                                            rVar6.d = rVar8;
                                                        }
                                                        i23++;
                                                        rVar6 = rVar8;
                                                    } else {
                                                        rVar8.h = rVar5;
                                                        if (rVar5 == null) {
                                                            rVar7 = rVar8;
                                                        } else {
                                                            rVar5.d = rVar8;
                                                        }
                                                        i24++;
                                                        rVar5 = rVar8;
                                                    }
                                                    lVar2 = lVar2.d;
                                                    qVar3 = qVar4;
                                                    gVar2 = gVar3;
                                                }
                                                q qVar5 = qVar3;
                                                g gVar4 = gVar2;
                                                if (i23 <= 6) {
                                                    qVar = p(rVar2);
                                                } else {
                                                    qVar = i24 != 0 ? new q(rVar2) : qVar5;
                                                }
                                                if (i24 <= 6) {
                                                    qVar2 = p(rVar7);
                                                } else {
                                                    qVar2 = i23 != 0 ? new q(rVar7) : qVar5;
                                                }
                                                h(lVarArr3, i10, qVar);
                                                h(lVarArr3, i4, qVar2);
                                                lVarArr4 = lVarArr;
                                                gVar = gVar4;
                                                h(lVarArr4, i10, gVar);
                                            }
                                        }
                                        z = true;
                                    } else {
                                        i2 = i8;
                                        i3 = length2;
                                    }
                                    gVar = gVar2;
                                } finally {
                                }
                            }
                            concurrentHashMap = this;
                        }
                    }
                }
                gVar2 = gVar;
                concurrentHashMap2 = concurrentHashMap;
                i9 = i15;
                i8 = i2;
                length2 = i3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long j() {
        c[] cVarArr = this.c;
        long j2 = this.baseCount;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    j2 += cVar.value;
                }
            }
        }
        return j2;
    }

    private final void n(l[] lVarArr, int i2) {
        int length = lVarArr.length;
        if (length < 64) {
            o(length << 1);
            return;
        }
        l k2 = k(lVarArr, i2);
        if (k2 == null || k2.a < 0) {
            return;
        }
        synchronized (k2) {
            try {
                if (k(lVarArr, i2) == k2) {
                    r rVar = null;
                    l lVar = k2;
                    r rVar2 = null;
                    while (lVar != null) {
                        r rVar3 = new r(lVar.a, lVar.b, lVar.c, null, null);
                        rVar3.h = rVar2;
                        if (rVar2 == null) {
                            rVar = rVar3;
                        } else {
                            rVar2.d = rVar3;
                        }
                        lVar = lVar.d;
                        rVar2 = rVar3;
                    }
                    h(lVarArr, i2, new q(rVar));
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [j$.util.concurrent.l] */
    static l p(r rVar) {
        l lVar = null;
        l lVar2 = null;
        for (r rVar2 = rVar; rVar2 != null; rVar2 = rVar2.d) {
            l lVar3 = new l(rVar2.a, rVar2.b, rVar2.c);
            if (lVar2 == null) {
                lVar = lVar3;
            } else {
                lVar2.d = lVar3;
            }
            lVar2 = lVar3;
        }
        return lVar;
    }
}
