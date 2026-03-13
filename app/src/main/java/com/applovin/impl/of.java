package com.applovin.impl;

import android.util.Pair;
import com.applovin.exoplayer2.common.base.Function;
import com.applovin.impl.e9;
import com.applovin.impl.ij;
import com.applovin.impl.j1;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class of implements j8, ij {
    public static final n8 y = new Jh0(21);
    private final int a;
    private final ah b;
    private final ah c;
    private final ah d;
    private final ah e;
    private final ArrayDeque f;
    private final mj g;
    private final List h;
    private int i;
    private int j;
    private long k;
    private int l;
    private ah m;
    private int n;
    private int o;
    private int p;
    private int q;
    private l8 r;
    private a[] s;
    private long[][] t;
    private int u;
    private long v;
    private int w;
    private mf x;

    /* loaded from: classes.dex */
    public static final class a {
        public final lo a;
        public final ro b;
        public final qo c;
        public int d;

        public a(lo loVar, ro roVar, qo qoVar) {
            this.a = loVar;
            this.b = roVar;
            this.c = qoVar;
        }
    }

    public of() {
        this(0);
    }

    private static int a(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static boolean c(int i) {
        return i == 1835296868 || i == 1836476516 || i == 1751411826 || i == 1937011556 || i == 1937011827 || i == 1937011571 || i == 1668576371 || i == 1701606260 || i == 1937011555 || i == 1937011578 || i == 1937013298 || i == 1937007471 || i == 1668232756 || i == 1953196132 || i == 1718909296 || i == 1969517665 || i == 1801812339 || i == 1768715124;
    }

    private void e() {
        this.i = 0;
        this.l = 0;
    }

    private void f(long j) {
        a[] aVarArr;
        for (a aVar : this.s) {
            ro roVar = aVar.b;
            int a2 = roVar.a(j);
            if (a2 == -1) {
                a2 = roVar.b(j);
            }
            aVar.d = a2;
        }
    }

    private void g() {
        af afVar;
        if (this.w == 2 && (this.a & 2) != 0) {
            l8 l8Var = (l8) b1.a(this.r);
            qo a2 = l8Var.a(0, 4);
            if (this.x == null) {
                afVar = null;
            } else {
                afVar = new af(this.x);
            }
            a2.a(new e9.b().a(afVar).a());
            l8Var.c();
            l8Var.a(new ij.b(-9223372036854775807L));
        }
    }

    public static /* synthetic */ j8[] h() {
        return f();
    }

    @Override // com.applovin.impl.ij
    public long d() {
        return this.v;
    }

    public of(int i) {
        this.a = i;
        this.i = (i & 4) != 0 ? 3 : 0;
        this.g = new mj();
        this.h = new ArrayList();
        this.e = new ah(16);
        this.f = new ArrayDeque();
        this.b = new ah(yf.a);
        this.c = new ah(4);
        this.d = new ah();
        this.n = -1;
    }

    public static /* synthetic */ lo a(lo loVar) {
        return loVar;
    }

    private int c(long j) {
        int i = -1;
        int i2 = -1;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        long j3 = Long.MAX_VALUE;
        boolean z2 = true;
        long j4 = Long.MAX_VALUE;
        for (int i3 = 0; i3 < ((a[]) xp.a((Object) this.s)).length; i3++) {
            a aVar = this.s[i3];
            int i4 = aVar.d;
            ro roVar = aVar.b;
            if (i4 != roVar.b) {
                long j5 = roVar.c[i4];
                long j6 = ((long[][]) xp.a((Object) this.t))[i3][i4];
                long j7 = j5 - j;
                boolean z3 = j7 < 0 || j7 >= 262144;
                if ((!z3 && z2) || (z3 == z2 && j7 < j4)) {
                    z2 = z3;
                    j4 = j7;
                    i2 = i3;
                    j3 = j6;
                }
                if (j6 < j2) {
                    z = z3;
                    i = i3;
                    j2 = j6;
                }
            }
        }
        return (j2 == Long.MAX_VALUE || !z || j3 < j2 + 10485760) ? i2 : i;
    }

    private void d(long j) {
        while (!this.f.isEmpty() && ((j1.a) this.f.peek()).b == j) {
            j1.a aVar = (j1.a) this.f.pop();
            if (aVar.a == 1836019574) {
                a(aVar);
                this.f.clear();
                this.i = 2;
            } else if (!this.f.isEmpty()) {
                ((j1.a) this.f.peek()).a(aVar);
            }
        }
        if (this.i != 2) {
            e();
        }
    }

    @Override // com.applovin.impl.ij
    public boolean b() {
        return true;
    }

    private static boolean b(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1701082227 || i == 1835365473;
    }

    private void e(long j) {
        if (this.j == 1836086884) {
            long j2 = this.l;
            this.x = new mf(0L, j, -9223372036854775807L, j + j2, this.k - j2);
        }
    }

    @Override // com.applovin.impl.j8
    public void a() {
    }

    private static long[][] a(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            jArr[i] = new long[aVarArr[i].b.b];
            jArr2[i] = aVarArr[i].b.f[0];
        }
        long j = 0;
        int i2 = 0;
        while (i2 < aVarArr.length) {
            long j2 = Long.MAX_VALUE;
            int i3 = -1;
            for (int i4 = 0; i4 < aVarArr.length; i4++) {
                if (!zArr[i4]) {
                    long j3 = jArr2[i4];
                    if (j3 <= j2) {
                        i3 = i4;
                        j2 = j3;
                    }
                }
            }
            int i5 = iArr[i3];
            long[] jArr3 = jArr[i3];
            jArr3[i5] = j;
            ro roVar = aVarArr[i3].b;
            j += roVar.d[i5];
            int i6 = i5 + 1;
            iArr[i3] = i6;
            if (i6 < jArr3.length) {
                jArr2[i3] = roVar.f[i6];
            } else {
                zArr[i3] = true;
                i2++;
            }
        }
        return jArr;
    }

    @Override // com.applovin.impl.ij
    public ij.a b(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        int b;
        if (((a[]) b1.a(this.s)).length == 0) {
            return new ij.a(kj.c);
        }
        int i = this.u;
        if (i != -1) {
            ro roVar = this.s[i].b;
            int a2 = a(roVar, j);
            if (a2 == -1) {
                return new ij.a(kj.c);
            }
            long j6 = roVar.f[a2];
            j2 = roVar.c[a2];
            if (j6 >= j || a2 >= roVar.b - 1 || (b = roVar.b(j)) == -1 || b == a2) {
                j5 = -1;
                j4 = -9223372036854775807L;
            } else {
                j4 = roVar.f[b];
                j5 = roVar.c[b];
            }
            j3 = j5;
            j = j6;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -1;
            j4 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            a[] aVarArr = this.s;
            if (i2 >= aVarArr.length) {
                break;
            }
            if (i2 != this.u) {
                ro roVar2 = aVarArr[i2].b;
                long a3 = a(roVar2, j, j2);
                if (j4 != -9223372036854775807L) {
                    j3 = a(roVar2, j4, j3);
                }
                j2 = a3;
            }
            i2++;
        }
        kj kjVar = new kj(j, j2);
        if (j4 == -9223372036854775807L) {
            return new ij.a(kjVar);
        }
        return new ij.a(kjVar, new kj(j4, j3));
    }

    public static /* synthetic */ j8[] f() {
        return new j8[]{new of()};
    }

    private boolean c(k8 k8Var) {
        j1.a aVar;
        if (this.l == 0) {
            if (!k8Var.a(this.e.c(), 0, 8, true)) {
                g();
                return false;
            }
            this.l = 8;
            this.e.f(0);
            this.k = this.e.y();
            this.j = this.e.j();
        }
        long j = this.k;
        if (j == 1) {
            k8Var.d(this.e.c(), 8, 8);
            this.l += 8;
            this.k = this.e.B();
        } else if (j == 0) {
            long a2 = k8Var.a();
            if (a2 == -1 && (aVar = (j1.a) this.f.peek()) != null) {
                a2 = aVar.b;
            }
            if (a2 != -1) {
                this.k = (a2 - k8Var.f()) + this.l;
            }
        }
        if (this.k >= this.l) {
            if (b(this.j)) {
                long f = k8Var.f();
                long j2 = this.k;
                long j3 = this.l;
                long j4 = (f + j2) - j3;
                if (j2 != j3 && this.j == 1835365473) {
                    b(k8Var);
                }
                this.f.push(new j1.a(this.j, j4));
                if (this.k == this.l) {
                    d(j4);
                } else {
                    e();
                }
            } else if (c(this.j)) {
                b1.b(this.l == 8);
                b1.b(this.k <= 2147483647L);
                ah ahVar = new ah((int) this.k);
                System.arraycopy(this.e.c(), 0, ahVar.c(), 0, 8);
                this.m = ahVar;
                this.i = 1;
            } else {
                e(k8Var.f() - this.l);
                this.m = null;
                this.i = 1;
            }
            return true;
        }
        throw ch.a("Atom size less than header length (unsupported).");
    }

    private int d(k8 k8Var, th thVar) {
        int a2 = this.g.a(k8Var, thVar, this.h);
        if (a2 == 1 && thVar.a == 0) {
            e();
        }
        return a2;
    }

    private static int a(ro roVar, long j) {
        int a2 = roVar.a(j);
        return a2 == -1 ? roVar.b(j) : a2;
    }

    @Override // com.applovin.impl.j8
    public void a(l8 l8Var) {
        this.r = l8Var;
    }

    private static long a(ro roVar, long j, long j2) {
        int a2 = a(roVar, j);
        return a2 == -1 ? j2 : Math.min(roVar.c[a2], j2);
    }

    private void b(k8 k8Var) {
        this.d.d(8);
        k8Var.c(this.d.c(), 0, 8);
        k1.a(this.d);
        k8Var.a(this.d.d());
        k8Var.b();
    }

    private static int a(ah ahVar) {
        ahVar.f(8);
        int a2 = a(ahVar.j());
        if (a2 != 0) {
            return a2;
        }
        ahVar.g(4);
        while (ahVar.a() > 0) {
            int a3 = a(ahVar.j());
            if (a3 != 0) {
                return a3;
            }
        }
        return 0;
    }

    private boolean b(k8 k8Var, th thVar) {
        boolean z;
        long j = this.k - this.l;
        long f = k8Var.f() + j;
        ah ahVar = this.m;
        if (ahVar != null) {
            k8Var.d(ahVar.c(), this.l, (int) j);
            if (this.j == 1718909296) {
                this.w = a(ahVar);
            } else if (!this.f.isEmpty()) {
                ((j1.a) this.f.peek()).a(new j1.b(this.j, ahVar));
            }
        } else if (j < 262144) {
            k8Var.a((int) j);
        } else {
            thVar.a = k8Var.f() + j;
            z = true;
            d(f);
            return (z || this.i == 2) ? false : true;
        }
        z = false;
        d(f);
        if (z) {
        }
    }

    /* JADX WARN: Type inference failed for: r17v0, types: [com.applovin.exoplayer2.common.base.Function, java.lang.Object] */
    private void a(j1.a aVar) {
        af afVar;
        af afVar2;
        af afVar3;
        List list;
        int i;
        af afVar4;
        af afVar5;
        int i2;
        int i3;
        ArrayList arrayList = new ArrayList();
        boolean z = this.w == 1;
        y9 y9Var = new y9();
        j1.b e = aVar.e(1969517665);
        if (e != null) {
            Pair a2 = k1.a(e);
            af afVar6 = (af) a2.first;
            af afVar7 = (af) a2.second;
            if (afVar6 != null) {
                y9Var.a(afVar6);
            }
            afVar2 = afVar7;
            afVar = afVar6;
        } else {
            afVar = null;
            afVar2 = null;
        }
        j1.a d = aVar.d(1835365473);
        af b = d != null ? k1.b(d) : null;
        af afVar8 = afVar;
        List a3 = k1.a(aVar, y9Var, -9223372036854775807L, (x6) null, (this.a & 1) != 0, z, (Function) new Object());
        l8 l8Var = (l8) b1.a(this.r);
        int size = a3.size();
        long j = -9223372036854775807L;
        long j2 = -9223372036854775807L;
        int i4 = 0;
        int i5 = -1;
        while (i4 < size) {
            ro roVar = (ro) a3.get(i4);
            if (roVar.b == 0) {
                list = a3;
                i = size;
                afVar3 = afVar2;
                afVar4 = afVar8;
                i2 = 1;
                afVar5 = b;
            } else {
                lo loVar = roVar.a;
                af afVar9 = b;
                afVar3 = afVar2;
                long j3 = loVar.e;
                if (j3 == j) {
                    j3 = roVar.h;
                }
                j2 = Math.max(j2, j3);
                a aVar2 = new a(loVar, roVar, l8Var.a(i4, loVar.b));
                list = a3;
                e9.b a4 = loVar.f.a();
                a4.i(roVar.e + 30);
                i = size;
                if (loVar.b == 2 && j3 > 0 && (i3 = roVar.b) > 1) {
                    a4.a(i3 / (((float) j3) / 1000000.0f));
                }
                gf.a(loVar.b, y9Var, a4);
                afVar4 = afVar8;
                afVar5 = afVar9;
                gf.a(loVar.b, afVar4, afVar5, a4, afVar3, this.h.isEmpty() ? null : new af(this.h));
                aVar2.c.a(a4.a());
                if (loVar.b == 2 && i5 == -1) {
                    i5 = arrayList.size();
                }
                arrayList.add(aVar2);
                i2 = 1;
            }
            i4 += i2;
            afVar8 = afVar4;
            b = afVar5;
            afVar2 = afVar3;
            a3 = list;
            size = i;
            j = -9223372036854775807L;
        }
        this.u = i5;
        this.v = j2;
        a[] aVarArr = (a[]) arrayList.toArray(new a[0]);
        this.s = aVarArr;
        this.t = a(aVarArr);
        l8Var.c();
        l8Var.a(this);
    }

    private int c(k8 k8Var, th thVar) {
        long f = k8Var.f();
        if (this.n == -1) {
            int c = c(f);
            this.n = c;
            if (c == -1) {
                return -1;
            }
        }
        a aVar = ((a[]) xp.a((Object) this.s))[this.n];
        qo qoVar = aVar.c;
        int i = aVar.d;
        ro roVar = aVar.b;
        long j = roVar.c[i];
        int i2 = roVar.d[i];
        long j2 = (j - f) + this.o;
        if (j2 >= 0 && j2 < 262144) {
            if (aVar.a.g == 1) {
                j2 += 8;
                i2 -= 8;
            }
            k8Var.a((int) j2);
            lo loVar = aVar.a;
            if (loVar.j != 0) {
                byte[] c2 = this.c.c();
                c2[0] = 0;
                c2[1] = 0;
                c2[2] = 0;
                int i3 = aVar.a.j;
                int i4 = 4 - i3;
                while (this.p < i2) {
                    int i5 = this.q;
                    if (i5 == 0) {
                        k8Var.d(c2, i4, i3);
                        this.o += i3;
                        this.c.f(0);
                        int j3 = this.c.j();
                        if (j3 >= 0) {
                            this.q = j3;
                            this.b.f(0);
                            qoVar.a(this.b, 4);
                            this.p += 4;
                            i2 += i4;
                        } else {
                            throw ch.a("Invalid NAL length", null);
                        }
                    } else {
                        int a2 = qoVar.a((f5) k8Var, i5, false);
                        this.o += a2;
                        this.p += a2;
                        this.q -= a2;
                    }
                }
            } else {
                if ("audio/ac4".equals(loVar.f.m)) {
                    if (this.p == 0) {
                        AbstractC1073n.a(i2, this.d);
                        qoVar.a(this.d, 7);
                        this.p += 7;
                    }
                    i2 += 7;
                }
                while (true) {
                    int i6 = this.p;
                    if (i6 >= i2) {
                        break;
                    }
                    int a3 = qoVar.a((f5) k8Var, i2 - i6, false);
                    this.o += a3;
                    this.p += a3;
                    this.q -= a3;
                }
            }
            int i7 = i2;
            ro roVar2 = aVar.b;
            qoVar.a(roVar2.f[i], roVar2.g[i], i7, 0, null);
            aVar.d++;
            this.n = -1;
            this.o = 0;
            this.p = 0;
            this.q = 0;
            return 0;
        }
        thVar.a = j;
        return 1;
    }

    @Override // com.applovin.impl.j8
    public int a(k8 k8Var, th thVar) {
        while (true) {
            int i = this.i;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            return d(k8Var, thVar);
                        }
                        throw new IllegalStateException();
                    }
                    return c(k8Var, thVar);
                } else if (b(k8Var, thVar)) {
                    return 1;
                }
            } else if (!c(k8Var)) {
                return -1;
            }
        }
    }

    @Override // com.applovin.impl.j8
    public void a(long j, long j2) {
        this.f.clear();
        this.l = 0;
        this.n = -1;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        if (j == 0) {
            if (this.i != 3) {
                e();
                return;
            }
            this.g.a();
            this.h.clear();
        } else if (this.s != null) {
            f(j2);
        }
    }

    @Override // com.applovin.impl.j8
    public boolean a(k8 k8Var) {
        return lk.a(k8Var, (this.a & 2) != 0);
    }
}
