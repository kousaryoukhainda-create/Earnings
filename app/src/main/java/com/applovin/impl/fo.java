package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.applovin.impl.C1079u;
import com.applovin.impl.db;
import com.applovin.impl.o2;
import com.applovin.impl.sd;
/* loaded from: classes.dex */
public abstract class fo implements o2 {
    public static final fo a = new a();
    public static final o2.a b = new Jh0(1);

    /* loaded from: classes.dex */
    public class a extends fo {
        @Override // com.applovin.impl.fo
        public int a() {
            return 0;
        }

        @Override // com.applovin.impl.fo
        public int b() {
            return 0;
        }

        @Override // com.applovin.impl.fo
        public int a(Object obj) {
            return -1;
        }

        @Override // com.applovin.impl.fo
        public Object b(int i) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.applovin.impl.fo
        public d a(int i, d dVar, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.applovin.impl.fo
        public b a(int i, b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements o2 {
        public static final o2.a i = new Jh0(2);
        public Object a;
        public Object b;
        public int c;
        public long d;
        public long f;
        public boolean g;
        private C1079u h = C1079u.h;

        public static /* synthetic */ b b(Bundle bundle) {
            return a(bundle);
        }

        private static String g(int i2) {
            return Integer.toString(i2, 36);
        }

        public long c(int i2) {
            return this.h.a(i2).g;
        }

        public int d(int i2) {
            return this.h.a(i2).a();
        }

        public long e() {
            return this.f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            if (xp.a(this.a, bVar.a) && xp.a(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && this.f == bVar.f && this.g == bVar.g && xp.a(this.h, bVar.h)) {
                return true;
            }
            return false;
        }

        public int f() {
            return this.h.f;
        }

        public int hashCode() {
            int hashCode;
            Object obj = this.a;
            int i2 = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            int i3 = (hashCode + 217) * 31;
            Object obj2 = this.b;
            if (obj2 != null) {
                i2 = obj2.hashCode();
            }
            long j = this.d;
            long j2 = this.f;
            return this.h.hashCode() + ((((((((((i3 + i2) * 31) + this.c) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.g ? 1 : 0)) * 31);
        }

        public static b a(Bundle bundle) {
            C1079u c1079u;
            int i2 = bundle.getInt(g(0), 0);
            long j = bundle.getLong(g(1), -9223372036854775807L);
            long j2 = bundle.getLong(g(2), 0L);
            boolean z = bundle.getBoolean(g(3));
            Bundle bundle2 = bundle.getBundle(g(4));
            if (bundle2 != null) {
                c1079u = (C1079u) C1079u.j.a(bundle2);
            } else {
                c1079u = C1079u.h;
            }
            C1079u c1079u2 = c1079u;
            b bVar = new b();
            bVar.a(null, null, i2, j, j2, c1079u2, z);
            return bVar;
        }

        public int b(long j) {
            return this.h.b(j, this.d);
        }

        public long c() {
            return this.d;
        }

        public long d() {
            return t2.b(this.f);
        }

        public boolean e(int i2) {
            return !this.h.a(i2).b();
        }

        public boolean f(int i2) {
            return this.h.a(i2).h;
        }

        public long b(int i2) {
            return this.h.a(i2).a;
        }

        public long b() {
            return this.h.c;
        }

        public int b(int i2, int i3) {
            return this.h.a(i2).a(i3);
        }

        public int a(int i2) {
            return this.h.a(i2).b;
        }

        public long a(int i2, int i3) {
            C1079u.a a = this.h.a(i2);
            if (a.b != -1) {
                return a.f[i3];
            }
            return -9223372036854775807L;
        }

        public int a() {
            return this.h.b;
        }

        public int a(long j) {
            return this.h.a(j, this.d);
        }

        public b a(Object obj, Object obj2, int i2, long j, long j2) {
            return a(obj, obj2, i2, j, j2, C1079u.h, false);
        }

        public b a(Object obj, Object obj2, int i2, long j, long j2, C1079u c1079u, boolean z) {
            this.a = obj;
            this.b = obj2;
            this.c = i2;
            this.d = j;
            this.f = j2;
            this.h = c1079u;
            this.g = z;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements o2 {
        public static final Object s = new Object();
        private static final Object t = new Object();
        private static final sd u = new sd.c().b("com.applovin.exoplayer2.Timeline").a(Uri.EMPTY).a();
        public static final o2.a v = new Jh0(3);
        public Object b;
        public Object d;
        public long f;
        public long g;
        public long h;
        public boolean i;
        public boolean j;
        public boolean k;
        public sd.f l;
        public boolean m;
        public long n;
        public long o;
        public int p;
        public int q;
        public long r;
        public Object a = s;
        public sd c = u;

        public static d a(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(a(1));
            sd sdVar = bundle2 != null ? (sd) sd.h.a(bundle2) : null;
            long j = bundle.getLong(a(2), -9223372036854775807L);
            long j2 = bundle.getLong(a(3), -9223372036854775807L);
            long j3 = bundle.getLong(a(4), -9223372036854775807L);
            boolean z = bundle.getBoolean(a(5), false);
            boolean z2 = bundle.getBoolean(a(6), false);
            Bundle bundle3 = bundle.getBundle(a(7));
            sd.f fVar = bundle3 != null ? (sd.f) sd.f.h.a(bundle3) : null;
            boolean z3 = bundle.getBoolean(a(8), false);
            long j4 = bundle.getLong(a(9), 0L);
            long j5 = bundle.getLong(a(10), -9223372036854775807L);
            int i = bundle.getInt(a(11), 0);
            int i2 = bundle.getInt(a(12), 0);
            long j6 = bundle.getLong(a(13), 0L);
            d dVar = new d();
            dVar.a(t, sdVar, null, j, j2, j3, z, z2, fVar, j4, j5, i, i2, j6);
            dVar.m = z3;
            return dVar;
        }

        public static /* synthetic */ d b(Bundle bundle) {
            return a(bundle);
        }

        public long c() {
            return this.n;
        }

        public long d() {
            return t2.b(this.o);
        }

        public boolean e() {
            boolean z;
            boolean z2;
            boolean z3 = this.k;
            if (this.l != null) {
                z = true;
            } else {
                z = false;
            }
            if (z3 == z) {
                z2 = true;
            } else {
                z2 = false;
            }
            b1.b(z2);
            if (this.l == null) {
                return false;
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !d.class.equals(obj.getClass())) {
                return false;
            }
            d dVar = (d) obj;
            if (xp.a(this.a, dVar.a) && xp.a(this.c, dVar.c) && xp.a(this.d, dVar.d) && xp.a(this.l, dVar.l) && this.f == dVar.f && this.g == dVar.g && this.h == dVar.h && this.i == dVar.i && this.j == dVar.j && this.m == dVar.m && this.n == dVar.n && this.o == dVar.o && this.p == dVar.p && this.q == dVar.q && this.r == dVar.r) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = (this.c.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
            Object obj = this.d;
            int i = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            int i2 = (hashCode2 + hashCode) * 31;
            sd.f fVar = this.l;
            if (fVar != null) {
                i = fVar.hashCode();
            }
            long j = this.f;
            long j2 = this.g;
            long j3 = this.h;
            long j4 = this.n;
            long j5 = this.o;
            long j6 = this.r;
            return ((((((((((((((((((((((i2 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0)) * 31) + (this.m ? 1 : 0)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.p) * 31) + this.q) * 31) + ((int) (j6 ^ (j6 >>> 32)));
        }

        public long b() {
            return t2.b(this.n);
        }

        public long a() {
            return xp.a(this.h);
        }

        private static String a(int i) {
            return Integer.toString(i, 36);
        }

        public d a(Object obj, sd sdVar, Object obj2, long j, long j2, long j3, boolean z, boolean z2, sd.f fVar, long j4, long j5, int i, int i2, long j6) {
            sd.g gVar;
            this.a = obj;
            this.c = sdVar != null ? sdVar : u;
            this.b = (sdVar == null || (gVar = sdVar.b) == null) ? null : gVar.g;
            this.d = obj2;
            this.f = j;
            this.g = j2;
            this.h = j3;
            this.i = z;
            this.j = z2;
            this.k = fVar != null;
            this.l = fVar;
            this.n = j4;
            this.o = j5;
            this.p = i;
            this.q = i2;
            this.r = j6;
            this.m = false;
            return this;
        }
    }

    public static fo a(Bundle bundle) {
        db a2 = a(d.v, n2.a(bundle, c(0)));
        db a3 = a(b.i, n2.a(bundle, c(1)));
        int[] intArray = bundle.getIntArray(c(2));
        if (intArray == null) {
            intArray = a(a2.size());
        }
        return new c(a2, a3, intArray);
    }

    public static /* synthetic */ fo b(Bundle bundle) {
        return a(bundle);
    }

    public abstract int a();

    public abstract int a(Object obj);

    public abstract b a(int i, b bVar, boolean z);

    public abstract d a(int i, d dVar, long j);

    public abstract int b();

    public abstract Object b(int i);

    public final boolean c() {
        return b() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo)) {
            return false;
        }
        fo foVar = (fo) obj;
        if (foVar.b() != b() || foVar.a() != a()) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i = 0; i < b(); i++) {
            if (!a(i, dVar).equals(foVar.a(i, dVar2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < a(); i2++) {
            if (!a(i2, bVar, true).equals(foVar.a(i2, bVar2, true))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        d dVar = new d();
        b bVar = new b();
        int b2 = b() + 217;
        for (int i = 0; i < b(); i++) {
            b2 = (b2 * 31) + a(i, dVar).hashCode();
        }
        int a2 = a() + (b2 * 31);
        for (int i2 = 0; i2 < a(); i2++) {
            a2 = (a2 * 31) + a(i2, bVar, true).hashCode();
        }
        return a2;
    }

    /* loaded from: classes.dex */
    public static final class c extends fo {
        private final db c;
        private final db d;
        private final int[] f;
        private final int[] g;

        public c(db dbVar, db dbVar2, int[] iArr) {
            boolean z;
            if (dbVar.size() == iArr.length) {
                z = true;
            } else {
                z = false;
            }
            b1.a(z);
            this.c = dbVar;
            this.d = dbVar2;
            this.f = iArr;
            this.g = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.g[iArr[i]] = i;
            }
        }

        @Override // com.applovin.impl.fo
        public int a(boolean z) {
            if (c()) {
                return -1;
            }
            if (z) {
                return this.f[0];
            }
            return 0;
        }

        @Override // com.applovin.impl.fo
        public int b(boolean z) {
            if (c()) {
                return -1;
            }
            if (z) {
                return this.f[b() - 1];
            }
            return b() - 1;
        }

        @Override // com.applovin.impl.fo
        public int a(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != b(z)) {
                return z ? this.f[this.g[i] + 1] : i + 1;
            } else if (i2 == 2) {
                return a(z);
            } else {
                return -1;
            }
        }

        @Override // com.applovin.impl.fo
        public int b(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != a(z)) {
                return z ? this.f[this.g[i] - 1] : i - 1;
            } else if (i2 == 2) {
                return b(z);
            } else {
                return -1;
            }
        }

        @Override // com.applovin.impl.fo
        public b a(int i, b bVar, boolean z) {
            b bVar2 = (b) this.d.get(i);
            bVar.a(bVar2.a, bVar2.b, bVar2.c, bVar2.d, bVar2.f, bVar2.h, bVar2.g);
            return bVar;
        }

        @Override // com.applovin.impl.fo
        public int b() {
            return this.c.size();
        }

        @Override // com.applovin.impl.fo
        public Object b(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // com.applovin.impl.fo
        public int a() {
            return this.d.size();
        }

        @Override // com.applovin.impl.fo
        public d a(int i, d dVar, long j) {
            d dVar2 = (d) this.c.get(i);
            dVar.a(dVar2.a, dVar2.c, dVar2.d, dVar2.f, dVar2.g, dVar2.h, dVar2.i, dVar2.j, dVar2.l, dVar2.n, dVar2.o, dVar2.p, dVar2.q, dVar2.r);
            dVar.m = dVar2.m;
            return dVar;
        }

        @Override // com.applovin.impl.fo
        public int a(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    private static String c(int i) {
        return Integer.toString(i, 36);
    }

    public int b(boolean z) {
        if (c()) {
            return -1;
        }
        return b() - 1;
    }

    public int b(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == a(z)) {
                return -1;
            }
            return i - 1;
        } else if (i2 != 1) {
            if (i2 == 2) {
                return i == a(z) ? b(z) : i - 1;
            }
            throw new IllegalStateException();
        } else {
            return i;
        }
    }

    public final boolean b(int i, b bVar, d dVar, int i2, boolean z) {
        return a(i, bVar, dVar, i2, z) == -1;
    }

    private static db a(o2.a aVar, IBinder iBinder) {
        if (iBinder == null) {
            return db.h();
        }
        db.a aVar2 = new db.a();
        db a2 = m2.a(iBinder);
        for (int i = 0; i < a2.size(); i++) {
            aVar2.b(aVar.a((Bundle) a2.get(i)));
        }
        return aVar2.a();
    }

    private static int[] a(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = i2;
        }
        return iArr;
    }

    public int a(boolean z) {
        return c() ? -1 : 0;
    }

    public final int a(int i, b bVar, d dVar, int i2, boolean z) {
        int i3 = a(i, bVar).c;
        if (a(i3, dVar).q == i) {
            int a2 = a(i3, i2, z);
            if (a2 == -1) {
                return -1;
            }
            return a(a2, dVar).p;
        }
        return i + 1;
    }

    public int a(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == b(z)) {
                return -1;
            }
            return i + 1;
        } else if (i2 != 1) {
            if (i2 == 2) {
                return i == b(z) ? a(z) : i + 1;
            }
            throw new IllegalStateException();
        } else {
            return i;
        }
    }

    public final b a(int i, b bVar) {
        return a(i, bVar, false);
    }

    public b a(Object obj, b bVar) {
        return a(a(obj), bVar, true);
    }

    public final Pair a(d dVar, b bVar, int i, long j) {
        return (Pair) b1.a(a(dVar, bVar, i, j, 0L));
    }

    public final Pair a(d dVar, b bVar, int i, long j, long j2) {
        b1.a(i, 0, b());
        a(i, dVar, j2);
        if (j == -9223372036854775807L) {
            j = dVar.c();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = dVar.p;
        a(i2, bVar);
        while (i2 < dVar.q && bVar.f != j) {
            int i3 = i2 + 1;
            if (a(i3, bVar).f > j) {
                break;
            }
            i2 = i3;
        }
        a(i2, bVar, true);
        long j3 = j - bVar.f;
        long j4 = bVar.d;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        return Pair.create(b1.a(bVar.b), Long.valueOf(Math.max(0L, j3)));
    }

    public final d a(int i, d dVar) {
        return a(i, dVar, 0L);
    }
}
