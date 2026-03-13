package defpackage;
/* renamed from: RK  reason: default package */
/* loaded from: classes.dex */
public final class RK {
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        new QK().a();
        Ha0.H(0);
        Ha0.H(1);
        Ha0.H(2);
        Ha0.H(3);
        Ha0.H(4);
    }

    public RK(QK qk) {
        long j = qk.a;
        long j2 = qk.b;
        long j3 = qk.c;
        float f = qk.d;
        float f2 = qk.e;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = f;
        this.e = f2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, QK] */
    public final QK a() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RK)) {
            return false;
        }
        RK rk = (RK) obj;
        if (this.a == rk.a && this.b == rk.b && this.c == rk.c && this.d == rk.d && this.e == rk.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        long j = this.a;
        long j2 = this.b;
        long j3 = this.c;
        int i2 = ((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        int i3 = 0;
        float f = this.d;
        if (f != 0.0f) {
            i = Float.floatToIntBits(f);
        } else {
            i = 0;
        }
        int i4 = (i2 + i) * 31;
        float f2 = this.e;
        if (f2 != 0.0f) {
            i3 = Float.floatToIntBits(f2);
        }
        return i4 + i3;
    }
}
