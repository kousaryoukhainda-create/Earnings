package defpackage;

import android.os.Build;
/* renamed from: Nh  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0478Nh {
    public static final C0478Nh i;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int a = 1;
    public long f = -1;
    public long g = -1;
    public C1467gi h = new C1467gi();

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, Nh] */
    static {
        C1467gi c1467gi = new C1467gi();
        ?? obj = new Object();
        obj.a = 1;
        obj.f = -1L;
        obj.g = -1L;
        obj.h = new C1467gi();
        obj.b = false;
        int i2 = Build.VERSION.SDK_INT;
        obj.c = false;
        obj.a = 1;
        obj.d = false;
        obj.e = false;
        if (i2 >= 24) {
            obj.h = c1467gi;
            obj.f = -1L;
            obj.g = -1L;
        }
        i = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0478Nh.class != obj.getClass()) {
            return false;
        }
        C0478Nh c0478Nh = (C0478Nh) obj;
        if (this.b != c0478Nh.b || this.c != c0478Nh.c || this.d != c0478Nh.d || this.e != c0478Nh.e || this.f != c0478Nh.f || this.g != c0478Nh.g || this.a != c0478Nh.a) {
            return false;
        }
        return this.h.equals(c0478Nh.h);
    }

    public final int hashCode() {
        long j = this.f;
        long j2 = this.g;
        return this.h.a.hashCode() + (((((((((((((AbstractC0324Hi.A(this.a) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }
}
