package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import com.fyber.inneractive.sdk.protobuf.a0;
import com.fyber.inneractive.sdk.protobuf.o0;
import com.fyber.inneractive.sdk.protobuf.r1;
import com.fyber.inneractive.sdk.protobuf.u.b;
import com.fyber.inneractive.sdk.protobuf.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class u<T extends b<T>> {
    public static final u d;
    public final g1<T, Object> a;
    public boolean b;
    public boolean c;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[r1.b.values().length];
            b = iArr;
            try {
                iArr[r1.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[r1.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[r1.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[r1.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[r1.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[r1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[r1.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[r1.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[r1.b.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[r1.b.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[r1.b.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[r1.b.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[r1.b.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[r1.b.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[r1.b.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[r1.b.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[r1.b.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[r1.b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[r1.c.values().length];
            a = iArr2;
            try {
                iArr2[r1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[r1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[r1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[r1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[r1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                a[r1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                a[r1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                a[r1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                a[r1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b<T extends b<T>> extends Comparable<T> {
        int a();

        o0.a a(o0.a aVar, o0 o0Var);

        boolean b();

        r1.b c();

        r1.c d();

        boolean isPacked();
    }

    static {
        u uVar = new u(g1.b(0));
        uVar.g();
        d = uVar;
    }

    public u() {
        this.a = g1.b(16);
    }

    public static <T extends b<T>> u<T> b() {
        return d;
    }

    /* renamed from: a */
    public u<T> clone() {
        u<T> uVar = new u<>();
        for (int i = 0; i < this.a.b.size(); i++) {
            Map.Entry<T, Object> a2 = this.a.a(i);
            uVar.c(a2.getKey(), a2.getValue());
        }
        for (Map.Entry<T, Object> entry : this.a.b()) {
            uVar.c(entry.getKey(), entry.getValue());
        }
        uVar.c = this.c;
        return uVar;
    }

    public void c(T t, Object obj) {
        if (t.b()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    d(t, it.next());
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            d(t, obj);
        }
        if (obj instanceof a0) {
            this.c = true;
        }
        this.a.put(t, obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        if ((r7 instanceof com.fyber.inneractive.sdk.protobuf.y.c) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
        if ((r7 instanceof byte[]) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        if ((r7 instanceof com.fyber.inneractive.sdk.protobuf.a0) == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(T r6, java.lang.Object r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.fyber.inneractive.sdk.protobuf.r1$b r2 = r6.c()
            java.nio.charset.Charset r3 = com.fyber.inneractive.sdk.protobuf.y.a
            r7.getClass()
            int[] r3 = com.fyber.inneractive.sdk.protobuf.u.a.a
            com.fyber.inneractive.sdk.protobuf.r1$c r2 = r2.e()
            int r2 = r2.ordinal()
            r2 = r3[r2]
            switch(r2) {
                case 1: goto L49;
                case 2: goto L46;
                case 3: goto L43;
                case 4: goto L40;
                case 5: goto L3d;
                case 6: goto L3a;
                case 7: goto L2d;
                case 8: goto L24;
                case 9: goto L1b;
                default: goto L1a;
            }
        L1a:
            goto L36
        L1b:
            boolean r2 = r7 instanceof com.fyber.inneractive.sdk.protobuf.o0
            if (r2 != 0) goto L38
            boolean r2 = r7 instanceof com.fyber.inneractive.sdk.protobuf.a0
            if (r2 == 0) goto L36
            goto L38
        L24:
            boolean r2 = r7 instanceof java.lang.Integer
            if (r2 != 0) goto L38
            boolean r2 = r7 instanceof com.fyber.inneractive.sdk.protobuf.y.c
            if (r2 == 0) goto L36
            goto L38
        L2d:
            boolean r2 = r7 instanceof com.fyber.inneractive.sdk.protobuf.i
            if (r2 != 0) goto L38
            boolean r2 = r7 instanceof byte[]
            if (r2 == 0) goto L36
            goto L38
        L36:
            r2 = 0
            goto L4b
        L38:
            r2 = 1
            goto L4b
        L3a:
            boolean r2 = r7 instanceof java.lang.String
            goto L4b
        L3d:
            boolean r2 = r7 instanceof java.lang.Boolean
            goto L4b
        L40:
            boolean r2 = r7 instanceof java.lang.Double
            goto L4b
        L43:
            boolean r2 = r7 instanceof java.lang.Float
            goto L4b
        L46:
            boolean r2 = r7 instanceof java.lang.Long
            goto L4b
        L49:
            boolean r2 = r7 instanceof java.lang.Integer
        L4b:
            if (r2 == 0) goto L4e
            return
        L4e:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            int r3 = r6.a()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            com.fyber.inneractive.sdk.protobuf.r1$b r6 = r6.c()
            com.fyber.inneractive.sdk.protobuf.r1$c r6 = r6.e()
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r3
            r4[r0] = r6
            r6 = 2
            r4[r6] = r7
            java.lang.String r6 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r6 = java.lang.String.format(r6, r4)
            r2.<init>(r6)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.u.d(com.fyber.inneractive.sdk.protobuf.u$b, java.lang.Object):void");
    }

    public boolean e() {
        for (int i = 0; i < this.a.b.size(); i++) {
            if (!b(this.a.a(i))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> entry : this.a.b()) {
            if (!b(entry)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        return this.a.equals(((u) obj).a);
    }

    public Iterator<Map.Entry<T, Object>> f() {
        if (this.c) {
            return new a0.b(this.a.entrySet().iterator());
        }
        return this.a.entrySet().iterator();
    }

    public void g() {
        if (this.b) {
            return;
        }
        this.a.d();
        this.b = true;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public static <T extends b<T>> boolean b(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.d() == r1.c.MESSAGE) {
            if (key.b()) {
                for (o0 o0Var : (List) entry.getValue()) {
                    if (!o0Var.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof o0) {
                    if (!((o0) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof a0) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public u(g1<T, Object> g1Var) {
        this.a = g1Var;
        g();
    }

    public Object a(T t) {
        Object obj = this.a.get(t);
        return obj instanceof a0 ? ((a0) obj).a(null) : obj;
    }

    public static int b(b<?> bVar, Object obj) {
        r1.b c = bVar.c();
        int a2 = bVar.a();
        if (bVar.b()) {
            int i = 0;
            if (bVar.isPacked()) {
                for (Object obj2 : (List) obj) {
                    i += a(c, obj2);
                }
                return l.c(i) + l.b(a2) + i;
            }
            for (Object obj3 : (List) obj) {
                i += a(c, a2, obj3);
            }
            return i;
        }
        return a(c, a2, obj);
    }

    public final void c(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof a0) {
            value = ((a0) value).a(null);
        }
        if (key.b()) {
            Object a2 = a((u<T>) key);
            if (a2 == null) {
                a2 = new ArrayList();
            }
            for (Object obj : (List) value) {
                ((List) a2).add(a(obj));
            }
            this.a.put(key, a2);
        } else if (key.d() == r1.c.MESSAGE) {
            Object a3 = a((u<T>) key);
            if (a3 == null) {
                this.a.put(key, a(value));
                return;
            }
            this.a.put(key, ((GeneratedMessageLite.b) key.a(((o0) a3).toBuilder(), (o0) value)).a());
        } else {
            this.a.put(key, a(value));
        }
    }

    public void a(T t, Object obj) {
        List list;
        if (((GeneratedMessageLite.d) t).d) {
            d(t, obj);
            Object a2 = a((u<T>) t);
            if (a2 == null) {
                list = new ArrayList();
                this.a.put(t, list);
            } else {
                list = (List) a2;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    public int d() {
        int i = 0;
        for (int i2 = 0; i2 < this.a.b.size(); i2++) {
            Map.Entry<T, Object> a2 = this.a.a(i2);
            i += b(a2.getKey(), a2.getValue());
        }
        for (Map.Entry<T, Object> entry : this.a.b()) {
            i += b(entry.getKey(), entry.getValue());
        }
        return i;
    }

    public static int a(r1.b bVar, boolean z) {
        if (z) {
            return 2;
        }
        return bVar.f();
    }

    public void a(u<T> uVar) {
        for (int i = 0; i < uVar.a.b.size(); i++) {
            c(uVar.a.a(i));
        }
        for (Map.Entry<T, Object> entry : uVar.a.b()) {
            c(entry);
        }
    }

    public static Object a(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return obj;
    }

    public final int a(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.d() == r1.c.MESSAGE && !key.b() && !key.isPacked()) {
            if (value instanceof a0) {
                return l.a((a0) value) + l.b(3) + l.f(2, entry.getKey().a()) + (l.b(1) * 2);
            }
            int f = l.f(2, entry.getKey().a()) + (l.b(1) * 2);
            int b2 = l.b(3);
            int serializedSize = ((o0) value).getSerializedSize();
            return l.c(serializedSize) + serializedSize + b2 + f;
        }
        return b(key, value);
    }

    public int c() {
        int i = 0;
        for (int i2 = 0; i2 < this.a.b.size(); i2++) {
            i += a((Map.Entry) this.a.a(i2));
        }
        for (Map.Entry<T, Object> entry : this.a.b()) {
            i += a((Map.Entry) entry);
        }
        return i;
    }

    public static int a(r1.b bVar, int i, Object obj) {
        int b2 = l.b(i);
        if (bVar == r1.b.GROUP) {
            b2 *= 2;
        }
        return a(bVar, obj) + b2;
    }

    public static int a(r1.b bVar, Object obj) {
        int serializedSize;
        int c;
        switch (a.b[bVar.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                Logger logger = l.b;
                return 8;
            case 2:
                ((Float) obj).getClass();
                Logger logger2 = l.b;
                return 4;
            case 3:
                return l.a(((Long) obj).longValue());
            case 4:
                return l.a(((Long) obj).longValue());
            case 5:
                return l.a(((Integer) obj).intValue());
            case 6:
                ((Long) obj).getClass();
                Logger logger3 = l.b;
                return 8;
            case 7:
                ((Integer) obj).getClass();
                Logger logger4 = l.b;
                return 4;
            case 8:
                ((Boolean) obj).getClass();
                Logger logger5 = l.b;
                return 1;
            case 9:
                Logger logger6 = l.b;
                return ((o0) obj).getSerializedSize();
            case 10:
                if (obj instanceof a0) {
                    return l.a((a0) obj);
                }
                Logger logger7 = l.b;
                serializedSize = ((o0) obj).getSerializedSize();
                c = l.c(serializedSize);
                break;
            case 11:
                if (obj instanceof i) {
                    return l.a((i) obj);
                }
                return l.a((String) obj);
            case 12:
                if (obj instanceof i) {
                    return l.a((i) obj);
                }
                Logger logger8 = l.b;
                serializedSize = ((byte[]) obj).length;
                c = l.c(serializedSize);
                break;
            case 13:
                return l.c(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger9 = l.b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger10 = l.b;
                return 8;
            case 16:
                return l.c(l.d(((Integer) obj).intValue()));
            case 17:
                return l.a(l.b(((Long) obj).longValue()));
            case 18:
                if (obj instanceof y.c) {
                    return l.a(((y.c) obj).a());
                }
                return l.a(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return c + serializedSize;
    }
}
