package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* renamed from: qY  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public class C2507qY implements Iterable {
    public C2249nY b;
    public C2249nY c;
    public final WeakHashMap d = new WeakHashMap();
    public int f = 0;

    public C2249nY b(Object obj) {
        C2249nY c2249nY = this.b;
        while (c2249nY != null && !c2249nY.b.equals(obj)) {
            c2249nY = c2249nY.d;
        }
        return c2249nY;
    }

    public Object c(Object obj, Object obj2) {
        C2249nY b = b(obj);
        if (b != null) {
            return b.c;
        }
        C2249nY c2249nY = new C2249nY(obj, obj2);
        this.f++;
        C2249nY c2249nY2 = this.c;
        if (c2249nY2 == null) {
            this.b = c2249nY;
            this.c = c2249nY;
            return null;
        }
        c2249nY2.d = c2249nY;
        c2249nY.f = c2249nY2;
        this.c = c2249nY;
        return null;
    }

    public Object d(Object obj) {
        C2249nY b = b(obj);
        if (b == null) {
            return null;
        }
        this.f--;
        WeakHashMap weakHashMap = this.d;
        if (!weakHashMap.isEmpty()) {
            for (AbstractC2421pY abstractC2421pY : weakHashMap.keySet()) {
                abstractC2421pY.a(b);
            }
        }
        C2249nY c2249nY = b.f;
        if (c2249nY != null) {
            c2249nY.d = b.d;
        } else {
            this.b = b.d;
        }
        C2249nY c2249nY2 = b.d;
        if (c2249nY2 != null) {
            c2249nY2.f = c2249nY;
        } else {
            this.c = c2249nY;
        }
        b.d = null;
        b.f = null;
        return b.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r3.hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (((defpackage.C2163mY) r7).hasNext() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof defpackage.C2507qY
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            qY r7 = (defpackage.C2507qY) r7
            int r1 = r6.f
            int r3 = r7.f
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            mY r3 = (defpackage.C2163mY) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            mY r4 = (defpackage.C2163mY) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            mY r7 = (defpackage.C2163mY) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = 0
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2507qY.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            C2163mY c2163mY = (C2163mY) it;
            if (c2163mY.hasNext()) {
                i += ((Map.Entry) c2163mY.next()).hashCode();
            } else {
                return i;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C2163mY c2163mY = new C2163mY(this.b, this.c, 0);
        this.d.put(c2163mY, Boolean.FALSE);
        return c2163mY;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C2163mY c2163mY = (C2163mY) it;
            if (c2163mY.hasNext()) {
                sb.append(((Map.Entry) c2163mY.next()).toString());
                if (c2163mY.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
