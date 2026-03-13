package defpackage;
/* renamed from: m8  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2135m8 extends AbstractC0273Fj {
    public final Double a;
    public final int b;
    public final boolean c;
    public final int d;
    public final long e;
    public final long f;

    public C2135m8(Double d, int i, boolean z, int i2, long j, long j2) {
        this.a = d;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = j;
        this.f = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0273Fj)) {
            return false;
        }
        AbstractC0273Fj abstractC0273Fj = (AbstractC0273Fj) obj;
        Double d = this.a;
        if (d != null ? d.equals(((C2135m8) abstractC0273Fj).a) : ((C2135m8) abstractC0273Fj).a == null) {
            if (this.b == ((C2135m8) abstractC0273Fj).b) {
                C2135m8 c2135m8 = (C2135m8) abstractC0273Fj;
                if (this.c == c2135m8.c && this.d == c2135m8.d && this.e == c2135m8.e && this.f == c2135m8.f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        Double d = this.a;
        if (d == null) {
            hashCode = 0;
        } else {
            hashCode = d.hashCode();
        }
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ this.b) * 1000003;
        if (this.c) {
            i = 1231;
        } else {
            i = 1237;
        }
        long j = this.e;
        long j2 = this.f;
        return ((((((i2 ^ i) * 1000003) ^ this.d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{batteryLevel=");
        sb.append(this.a);
        sb.append(", batteryVelocity=");
        sb.append(this.b);
        sb.append(", proximityOn=");
        sb.append(this.c);
        sb.append(", orientation=");
        sb.append(this.d);
        sb.append(", ramUsed=");
        sb.append(this.e);
        sb.append(", diskUsed=");
        return BK.n(sb, this.f, "}");
    }
}
