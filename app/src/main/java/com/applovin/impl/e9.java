package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.o2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class e9 implements o2 {
    private static final e9 H = new b().a();
    public static final o2.a I = new C2394p80(23);
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    private int G;
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final af k;
    public final String l;
    public final String m;
    public final int n;
    public final List o;
    public final x6 p;
    public final long q;
    public final int r;
    public final int s;
    public final float t;
    public final int u;
    public final float v;
    public final byte[] w;
    public final int x;
    public final r3 y;
    public final int z;

    /* loaded from: classes.dex */
    public static final class b {
        private int A;
        private int B;
        private int C;
        private int D;
        private String a;
        private String b;
        private String c;
        private int d;
        private int e;
        private int f;
        private int g;
        private String h;
        private af i;
        private String j;
        private String k;
        private int l;
        private List m;
        private x6 n;
        private long o;
        private int p;
        private int q;
        private float r;
        private int s;
        private float t;
        private byte[] u;
        private int v;
        private r3 w;
        private int x;
        private int y;
        private int z;

        public b() {
            this.f = -1;
            this.g = -1;
            this.l = -1;
            this.o = Long.MAX_VALUE;
            this.p = -1;
            this.q = -1;
            this.r = -1.0f;
            this.t = 1.0f;
            this.v = -1;
            this.x = -1;
            this.y = -1;
            this.z = -1;
            this.C = -1;
            this.D = 0;
        }

        public b a(int i) {
            this.C = i;
            return this;
        }

        public b b(int i) {
            this.f = i;
            return this;
        }

        public b c(int i) {
            this.x = i;
            return this;
        }

        public b d(int i) {
            this.D = i;
            return this;
        }

        public b e(int i) {
            this.A = i;
            return this;
        }

        public b f(int i) {
            this.B = i;
            return this;
        }

        public b g(int i) {
            this.q = i;
            return this;
        }

        public b h(int i) {
            this.a = Integer.toString(i);
            return this;
        }

        public b i(int i) {
            this.l = i;
            return this;
        }

        public b j(int i) {
            this.z = i;
            return this;
        }

        public b k(int i) {
            this.g = i;
            return this;
        }

        public b l(int i) {
            this.e = i;
            return this;
        }

        public b m(int i) {
            this.s = i;
            return this;
        }

        public b n(int i) {
            this.y = i;
            return this;
        }

        public b o(int i) {
            this.d = i;
            return this;
        }

        public b p(int i) {
            this.v = i;
            return this;
        }

        public b q(int i) {
            this.p = i;
            return this;
        }

        public b a(String str) {
            this.h = str;
            return this;
        }

        public b b(String str) {
            this.j = str;
            return this;
        }

        public b c(String str) {
            this.a = str;
            return this;
        }

        public b d(String str) {
            this.b = str;
            return this;
        }

        public b e(String str) {
            this.c = str;
            return this;
        }

        public b f(String str) {
            this.k = str;
            return this;
        }

        public b a(r3 r3Var) {
            this.w = r3Var;
            return this;
        }

        public b b(float f) {
            this.t = f;
            return this;
        }

        public b a(x6 x6Var) {
            this.n = x6Var;
            return this;
        }

        public b a(float f) {
            this.r = f;
            return this;
        }

        public b a(List list) {
            this.m = list;
            return this;
        }

        public b a(af afVar) {
            this.i = afVar;
            return this;
        }

        public b a(byte[] bArr) {
            this.u = bArr;
            return this;
        }

        public b a(long j) {
            this.o = j;
            return this;
        }

        public e9 a() {
            return new e9(this);
        }

        private b(e9 e9Var) {
            this.a = e9Var.a;
            this.b = e9Var.b;
            this.c = e9Var.c;
            this.d = e9Var.d;
            this.e = e9Var.f;
            this.f = e9Var.g;
            this.g = e9Var.h;
            this.h = e9Var.j;
            this.i = e9Var.k;
            this.j = e9Var.l;
            this.k = e9Var.m;
            this.l = e9Var.n;
            this.m = e9Var.o;
            this.n = e9Var.p;
            this.o = e9Var.q;
            this.p = e9Var.r;
            this.q = e9Var.s;
            this.r = e9Var.t;
            this.s = e9Var.u;
            this.t = e9Var.v;
            this.u = e9Var.w;
            this.v = e9Var.x;
            this.w = e9Var.y;
            this.x = e9Var.z;
            this.y = e9Var.A;
            this.z = e9Var.B;
            this.A = e9Var.C;
            this.B = e9Var.D;
            this.C = e9Var.E;
            this.D = e9Var.F;
        }
    }

    private e9(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = xp.f(bVar.c);
        this.d = bVar.d;
        this.f = bVar.e;
        int i = bVar.f;
        this.g = i;
        int i2 = bVar.g;
        this.h = i2;
        this.i = i2 != -1 ? i2 : i;
        this.j = bVar.h;
        this.k = bVar.i;
        this.l = bVar.j;
        this.m = bVar.k;
        this.n = bVar.l;
        this.o = bVar.m == null ? Collections.emptyList() : bVar.m;
        x6 x6Var = bVar.n;
        this.p = x6Var;
        this.q = bVar.o;
        this.r = bVar.p;
        this.s = bVar.q;
        this.t = bVar.r;
        this.u = bVar.s == -1 ? 0 : bVar.s;
        this.v = bVar.t == -1.0f ? 1.0f : bVar.t;
        this.w = bVar.u;
        this.x = bVar.v;
        this.y = bVar.w;
        this.z = bVar.x;
        this.A = bVar.y;
        this.B = bVar.z;
        this.C = bVar.A == -1 ? 0 : bVar.A;
        this.D = bVar.B != -1 ? bVar.B : 0;
        this.E = bVar.C;
        if (bVar.D != 0 || x6Var == null) {
            this.F = bVar.D;
        } else {
            this.F = 1;
        }
    }

    private static Object a(Object obj, Object obj2) {
        return obj != null ? obj : obj2;
    }

    private static String c(int i) {
        return b(12) + "_" + Integer.toString(i, 36);
    }

    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || e9.class != obj.getClass()) {
            return false;
        }
        e9 e9Var = (e9) obj;
        int i2 = this.G;
        if ((i2 == 0 || (i = e9Var.G) == 0 || i2 == i) && this.d == e9Var.d && this.f == e9Var.f && this.g == e9Var.g && this.h == e9Var.h && this.n == e9Var.n && this.q == e9Var.q && this.r == e9Var.r && this.s == e9Var.s && this.u == e9Var.u && this.x == e9Var.x && this.z == e9Var.z && this.A == e9Var.A && this.B == e9Var.B && this.C == e9Var.C && this.D == e9Var.D && this.E == e9Var.E && this.F == e9Var.F && Float.compare(this.t, e9Var.t) == 0 && Float.compare(this.v, e9Var.v) == 0 && xp.a((Object) this.a, (Object) e9Var.a) && xp.a((Object) this.b, (Object) e9Var.b) && xp.a((Object) this.j, (Object) e9Var.j) && xp.a((Object) this.l, (Object) e9Var.l) && xp.a((Object) this.m, (Object) e9Var.m) && xp.a((Object) this.c, (Object) e9Var.c) && Arrays.equals(this.w, e9Var.w) && xp.a(this.k, e9Var.k) && xp.a(this.y, e9Var.y) && xp.a(this.p, e9Var.p) && a(e9Var)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        if (this.G == 0) {
            String str = this.a;
            int i2 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i3 = (hashCode + 527) * 31;
            String str2 = this.b;
            if (str2 != null) {
                i = str2.hashCode();
            } else {
                i = 0;
            }
            int i4 = (i3 + i) * 31;
            String str3 = this.c;
            if (str3 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str3.hashCode();
            }
            int i5 = (((((((((i4 + hashCode2) * 31) + this.d) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31;
            String str4 = this.j;
            if (str4 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str4.hashCode();
            }
            int i6 = (i5 + hashCode3) * 31;
            af afVar = this.k;
            if (afVar == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = afVar.hashCode();
            }
            int i7 = (i6 + hashCode4) * 31;
            String str5 = this.l;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i8 = (i7 + hashCode5) * 31;
            String str6 = this.m;
            if (str6 != null) {
                i2 = str6.hashCode();
            }
            int floatToIntBits = Float.floatToIntBits(this.t);
            this.G = ((((((((((((((((Float.floatToIntBits(this.v) + ((((floatToIntBits + ((((((((((i8 + i2) * 31) + this.n) * 31) + ((int) this.q)) * 31) + this.r) * 31) + this.s) * 31)) * 31) + this.u) * 31)) * 31) + this.x) * 31) + this.z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F;
        }
        return this.G;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.l);
        sb.append(", ");
        sb.append(this.m);
        sb.append(", ");
        sb.append(this.j);
        sb.append(", ");
        sb.append(this.i);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", [");
        sb.append(this.r);
        sb.append(", ");
        sb.append(this.s);
        sb.append(", ");
        sb.append(this.t);
        sb.append("], [");
        sb.append(this.z);
        sb.append(", ");
        return AbstractC2437ph.k(sb, this.A, "])");
    }

    public e9 a(int i) {
        return a().d(i).a();
    }

    public int b() {
        int i;
        int i2 = this.r;
        if (i2 == -1 || (i = this.s) == -1) {
            return -1;
        }
        return i2 * i;
    }

    private static String b(int i) {
        return Integer.toString(i, 36);
    }

    public boolean a(e9 e9Var) {
        if (this.o.size() != e9Var.o.size()) {
            return false;
        }
        for (int i = 0; i < this.o.size(); i++) {
            if (!Arrays.equals((byte[]) this.o.get(i), (byte[]) e9Var.o.get(i))) {
                return false;
            }
        }
        return true;
    }

    public b a() {
        return new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static e9 a(Bundle bundle) {
        b bVar = new b();
        p2.a(bundle);
        int i = 0;
        String string = bundle.getString(b(0));
        e9 e9Var = H;
        bVar.c((String) a(string, e9Var.a)).d((String) a(bundle.getString(b(1)), e9Var.b)).e((String) a(bundle.getString(b(2)), e9Var.c)).o(bundle.getInt(b(3), e9Var.d)).l(bundle.getInt(b(4), e9Var.f)).b(bundle.getInt(b(5), e9Var.g)).k(bundle.getInt(b(6), e9Var.h)).a((String) a(bundle.getString(b(7)), e9Var.j)).a((af) a((af) bundle.getParcelable(b(8)), e9Var.k)).b((String) a(bundle.getString(b(9)), e9Var.l)).f((String) a(bundle.getString(b(10)), e9Var.m)).i(bundle.getInt(b(11), e9Var.n));
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte[] byteArray = bundle.getByteArray(c(i));
            if (byteArray == null) {
                b a2 = bVar.a(arrayList).a((x6) bundle.getParcelable(b(13)));
                String b2 = b(14);
                e9 e9Var2 = H;
                a2.a(bundle.getLong(b2, e9Var2.q)).q(bundle.getInt(b(15), e9Var2.r)).g(bundle.getInt(b(16), e9Var2.s)).a(bundle.getFloat(b(17), e9Var2.t)).m(bundle.getInt(b(18), e9Var2.u)).b(bundle.getFloat(b(19), e9Var2.v)).a(bundle.getByteArray(b(20))).p(bundle.getInt(b(21), e9Var2.x)).a((r3) p2.a(r3.g, bundle.getBundle(b(22)))).c(bundle.getInt(b(23), e9Var2.z)).n(bundle.getInt(b(24), e9Var2.A)).j(bundle.getInt(b(25), e9Var2.B)).e(bundle.getInt(b(26), e9Var2.C)).f(bundle.getInt(b(27), e9Var2.D)).a(bundle.getInt(b(28), e9Var2.E)).d(bundle.getInt(b(29), e9Var2.F));
                return bVar.a();
            }
            arrayList.add(byteArray);
            i++;
        }
    }
}
