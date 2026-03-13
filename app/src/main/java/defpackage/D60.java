package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
/* renamed from: D60  reason: default package */
/* loaded from: classes.dex */
public final class D60 {
    public static final Object q = new Object();
    public static final VK r;
    public Object b;
    public Object d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public RK j;
    public boolean k;
    public long l;
    public long m;
    public int n;
    public int o;
    public long p;
    public Object a = q;
    public VK c = r;

    /* JADX WARN: Type inference failed for: r10v0, types: [PK, OK] */
    static {
        SK sk;
        C0467Mw c0467Mw = new C0467Mw();
        C2400pD c2400pD = AbstractC2571rD.c;
        FV fv = FV.g;
        List emptyList = Collections.emptyList();
        FV fv2 = FV.g;
        QK qk = new QK();
        TK tk = TK.a;
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            sk = new SK(uri, null, null, emptyList, fv2, -9223372036854775807L);
        } else {
            sk = null;
        }
        r = new VK("androidx.media3.common.Timeline", new OK(c0467Mw), sk, new RK(qk), YK.y, tk);
        AbstractC0324Hi.q(1, 2, 3, 4, 5);
        AbstractC0324Hi.q(6, 7, 8, 9, 10);
        Ha0.H(11);
        Ha0.H(12);
        Ha0.H(13);
    }

    public final boolean a() {
        if (this.j != null) {
            return true;
        }
        return false;
    }

    public final void b(VK vk, Object obj, long j, long j2, long j3, boolean z, boolean z2, RK rk, long j4, long j5, int i, long j6) {
        VK vk2;
        this.a = q;
        if (vk != null) {
            vk2 = vk;
        } else {
            vk2 = r;
        }
        this.c = vk2;
        if (vk != null) {
            SK sk = vk.b;
        }
        this.d = obj;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = z;
        this.i = z2;
        this.j = rk;
        this.l = j4;
        this.m = j5;
        this.n = 0;
        this.o = i;
        this.p = j6;
        this.k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !D60.class.equals(obj.getClass())) {
            return false;
        }
        D60 d60 = (D60) obj;
        if (Ha0.a(this.a, d60.a) && Ha0.a(this.c, d60.c) && Ha0.a(this.d, d60.d) && Ha0.a(this.j, d60.j) && this.e == d60.e && this.f == d60.f && this.g == d60.g && this.h == d60.h && this.i == d60.i && this.k == d60.k && this.l == d60.l && this.m == d60.m && this.n == d60.n && this.o == d60.o && this.p == d60.p) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
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
        RK rk = this.j;
        if (rk != null) {
            i = rk.hashCode();
        }
        long j = this.e;
        long j2 = this.f;
        long j3 = this.g;
        long j4 = this.l;
        long j5 = this.m;
        long j6 = this.p;
        return ((((((((((((((((((((((i2 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.n) * 31) + this.o) * 31) + ((int) (j6 ^ (j6 >>> 32)));
    }
}
