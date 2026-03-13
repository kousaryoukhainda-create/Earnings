package androidx.media3.common;

import android.text.TextUtils;
import androidx.media3.common.DrmInitData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class b {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public int K;
    public final String a;
    public final String b;
    public final AbstractC2571rD c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final String j;
    public final Metadata k;
    public final String l;
    public final String m;
    public final int n;
    public final int o;
    public final List p;
    public final DrmInitData q;
    public final long r;
    public final int s;
    public final int t;
    public final float u;
    public final int v;
    public final float w;
    public final byte[] x;
    public final int y;
    public final C0605Se z;

    static {
        new C2717sy().a();
        Ha0.H(0);
        Ha0.H(1);
        Ha0.H(2);
        Ha0.H(3);
        Ha0.H(4);
        AbstractC0324Hi.q(5, 6, 7, 8, 9);
        AbstractC0324Hi.q(10, 11, 12, 13, 14);
        AbstractC0324Hi.q(15, 16, 17, 18, 19);
        AbstractC0324Hi.q(20, 21, 22, 23, 24);
        AbstractC0324Hi.q(25, 26, 27, 28, 29);
        Ha0.H(30);
        Ha0.H(31);
        Ha0.H(32);
    }

    public b(C2717sy c2717sy) {
        boolean z;
        String str;
        this.a = c2717sy.a;
        String N = Ha0.N(c2717sy.d);
        this.d = N;
        if (c2717sy.c.isEmpty() && c2717sy.b != null) {
            this.c = AbstractC2571rD.x(new C1345fG(N, c2717sy.b));
            this.b = c2717sy.b;
        } else if (!c2717sy.c.isEmpty() && c2717sy.b == null) {
            AbstractC2571rD abstractC2571rD = c2717sy.c;
            this.c = abstractC2571rD;
            Iterator it = abstractC2571rD.iterator();
            while (true) {
                if (it.hasNext()) {
                    C1345fG c1345fG = (C1345fG) it.next();
                    if (TextUtils.equals(c1345fG.a, N)) {
                        str = c1345fG.b;
                        break;
                    }
                } else {
                    str = ((C1345fG) abstractC2571rD.get(0)).b;
                    break;
                }
            }
            this.b = str;
        } else {
            if (!c2717sy.c.isEmpty() || c2717sy.b != null) {
                for (int i = 0; i < c2717sy.c.size(); i++) {
                    if (!((C1345fG) c2717sy.c.get(i)).b.equals(c2717sy.b)) {
                    }
                }
                z = false;
                B10.u(z);
                this.c = c2717sy.c;
                this.b = c2717sy.b;
            }
            z = true;
            B10.u(z);
            this.c = c2717sy.c;
            this.b = c2717sy.b;
        }
        this.e = c2717sy.e;
        this.f = c2717sy.f;
        int i2 = c2717sy.g;
        this.g = i2;
        int i3 = c2717sy.h;
        this.h = i3;
        this.i = i3 != -1 ? i3 : i2;
        this.j = c2717sy.i;
        this.k = c2717sy.j;
        this.l = c2717sy.k;
        this.m = c2717sy.l;
        this.n = c2717sy.m;
        this.o = c2717sy.n;
        List list = c2717sy.o;
        this.p = list == null ? Collections.emptyList() : list;
        DrmInitData drmInitData = c2717sy.p;
        this.q = drmInitData;
        this.r = c2717sy.q;
        this.s = c2717sy.r;
        this.t = c2717sy.s;
        this.u = c2717sy.t;
        int i4 = c2717sy.u;
        this.v = i4 == -1 ? 0 : i4;
        float f = c2717sy.v;
        this.w = f == -1.0f ? 1.0f : f;
        this.x = c2717sy.w;
        this.y = c2717sy.x;
        this.z = c2717sy.y;
        this.A = c2717sy.z;
        this.B = c2717sy.A;
        this.C = c2717sy.B;
        int i5 = c2717sy.C;
        this.D = i5 == -1 ? 0 : i5;
        int i6 = c2717sy.D;
        this.E = i6 != -1 ? i6 : 0;
        this.F = c2717sy.E;
        this.G = c2717sy.F;
        this.H = c2717sy.G;
        this.I = c2717sy.H;
        int i7 = c2717sy.I;
        if (i7 == 0 && drmInitData != null) {
            this.J = 1;
        } else {
            this.J = i7;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [sy, java.lang.Object] */
    public final C2717sy a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.j;
        obj.j = this.k;
        obj.k = this.l;
        obj.l = this.m;
        obj.m = this.n;
        obj.n = this.o;
        obj.o = this.p;
        obj.p = this.q;
        obj.q = this.r;
        obj.r = this.s;
        obj.s = this.t;
        obj.t = this.u;
        obj.u = this.v;
        obj.v = this.w;
        obj.w = this.x;
        obj.x = this.y;
        obj.y = this.z;
        obj.z = this.A;
        obj.A = this.B;
        obj.B = this.C;
        obj.C = this.D;
        obj.D = this.E;
        obj.E = this.F;
        obj.F = this.G;
        obj.G = this.H;
        obj.H = this.I;
        obj.I = this.J;
        return obj;
    }

    public final int b() {
        int i;
        int i2 = this.s;
        if (i2 == -1 || (i = this.t) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final boolean c(b bVar) {
        List list = this.p;
        if (list.size() != bVar.p.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) bVar.p.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final b d(b bVar) {
        String str;
        float f;
        String str2;
        DrmInitData drmInitData;
        int i;
        int i2;
        if (this == bVar) {
            return this;
        }
        int g = UM.g(this.m);
        String str3 = bVar.a;
        String str4 = bVar.b;
        if (str4 == null) {
            str4 = this.b;
        }
        AbstractC2571rD abstractC2571rD = bVar.c;
        if (abstractC2571rD.isEmpty()) {
            abstractC2571rD = this.c;
        }
        if ((g != 3 && g != 1) || (str = bVar.d) == null) {
            str = this.d;
        }
        int i3 = this.g;
        if (i3 == -1) {
            i3 = bVar.g;
        }
        int i4 = this.h;
        if (i4 == -1) {
            i4 = bVar.h;
        }
        String str5 = this.j;
        if (str5 == null) {
            String v = Ha0.v(g, bVar.j);
            if (Ha0.X(v).length == 1) {
                str5 = v;
            }
        }
        Metadata metadata = bVar.k;
        Metadata metadata2 = this.k;
        if (metadata2 != null) {
            metadata = metadata2.b(metadata);
        }
        float f2 = this.u;
        if (f2 == -1.0f && g == 2) {
            f2 = bVar.u;
        }
        int i5 = this.e | bVar.e;
        int i6 = this.f | bVar.f;
        ArrayList arrayList = new ArrayList();
        DrmInitData drmInitData2 = bVar.q;
        if (drmInitData2 != null) {
            DrmInitData.SchemeData[] schemeDataArr = drmInitData2.b;
            int length = schemeDataArr.length;
            f = f2;
            int i7 = 0;
            while (i7 < length) {
                int i8 = length;
                DrmInitData.SchemeData schemeData = schemeDataArr[i7];
                DrmInitData.SchemeData[] schemeDataArr2 = schemeDataArr;
                if (schemeData.g != null) {
                    arrayList.add(schemeData);
                }
                i7++;
                length = i8;
                schemeDataArr = schemeDataArr2;
            }
            str2 = drmInitData2.d;
        } else {
            f = f2;
            str2 = null;
        }
        DrmInitData drmInitData3 = this.q;
        if (drmInitData3 != null) {
            if (str2 == null) {
                str2 = drmInitData3.d;
            }
            int size = arrayList.size();
            DrmInitData.SchemeData[] schemeDataArr3 = drmInitData3.b;
            int length2 = schemeDataArr3.length;
            int i9 = 0;
            while (true) {
                String str6 = str2;
                if (i9 >= length2) {
                    break;
                }
                DrmInitData.SchemeData schemeData2 = schemeDataArr3[i9];
                DrmInitData.SchemeData[] schemeDataArr4 = schemeDataArr3;
                if (schemeData2.g != null) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            i = size;
                            i2 = length2;
                            if (((DrmInitData.SchemeData) arrayList.get(i10)).c.equals(schemeData2.c)) {
                                break;
                            }
                            i10++;
                            length2 = i2;
                            size = i;
                        } else {
                            i = size;
                            i2 = length2;
                            arrayList.add(schemeData2);
                            break;
                        }
                    }
                } else {
                    i = size;
                    i2 = length2;
                }
                i9++;
                str2 = str6;
                schemeDataArr3 = schemeDataArr4;
                length2 = i2;
                size = i;
            }
        }
        if (arrayList.isEmpty()) {
            drmInitData = null;
        } else {
            drmInitData = new DrmInitData(str2, arrayList);
        }
        C2717sy a = a();
        a.a = str3;
        a.b = str4;
        a.c = AbstractC2571rD.r(abstractC2571rD);
        a.d = str;
        a.e = i5;
        a.f = i6;
        a.g = i3;
        a.h = i4;
        a.i = str5;
        a.j = metadata;
        a.p = drmInitData;
        a.t = f;
        a.G = bVar.H;
        a.H = bVar.I;
        return new b(a);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        int i2 = this.K;
        if ((i2 == 0 || (i = bVar.K) == 0 || i2 == i) && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && this.h == bVar.h && this.n == bVar.n && this.r == bVar.r && this.s == bVar.s && this.t == bVar.t && this.v == bVar.v && this.y == bVar.y && this.A == bVar.A && this.B == bVar.B && this.C == bVar.C && this.D == bVar.D && this.E == bVar.E && this.F == bVar.F && this.H == bVar.H && this.I == bVar.I && this.J == bVar.J && Float.compare(this.u, bVar.u) == 0 && Float.compare(this.w, bVar.w) == 0 && Objects.equals(this.a, bVar.a) && Objects.equals(this.b, bVar.b) && this.c.equals(bVar.c) && Objects.equals(this.j, bVar.j) && Objects.equals(this.l, bVar.l) && Objects.equals(this.m, bVar.m) && Objects.equals(this.d, bVar.d) && Arrays.equals(this.x, bVar.x) && Objects.equals(this.k, bVar.k) && Objects.equals(this.z, bVar.z) && Objects.equals(this.q, bVar.q) && c(bVar)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        if (this.K == 0) {
            int i = 0;
            String str = this.a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (527 + hashCode) * 31;
            String str2 = this.b;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int hashCode7 = (this.c.hashCode() + ((i2 + hashCode2) * 31)) * 31;
            String str3 = this.d;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i3 = (((((((((hashCode7 + hashCode3) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31;
            String str4 = this.j;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i4 = (i3 + hashCode4) * 31;
            Metadata metadata = this.k;
            if (metadata == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = metadata.hashCode();
            }
            int i5 = (i4 + hashCode5) * 961;
            String str5 = this.l;
            if (str5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str5.hashCode();
            }
            int i6 = (i5 + hashCode6) * 31;
            String str6 = this.m;
            if (str6 != null) {
                i = str6.hashCode();
            }
            int floatToIntBits = Float.floatToIntBits(this.u);
            this.K = ((((((((((((((((((((Float.floatToIntBits(this.w) + ((((floatToIntBits + ((((((((((i6 + i) * 31) + this.n) * 31) + ((int) this.r)) * 31) + this.s) * 31) + this.t) * 31)) * 31) + this.v) * 31)) * 31) + this.y) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F) * 31) + this.H) * 31) + this.I) * 31) + this.J;
        }
        return this.K;
    }

    public final String toString() {
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
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.s);
        sb.append(", ");
        sb.append(this.t);
        sb.append(", ");
        sb.append(this.u);
        sb.append(", ");
        sb.append(this.z);
        sb.append("], [");
        sb.append(this.A);
        sb.append(", ");
        return AbstractC2437ph.k(sb, this.B, "])");
    }
}
