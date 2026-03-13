package defpackage;

import android.animation.TimeInterpolator;
/* renamed from: dN  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1181dN {
    public long a;
    public long b;
    public TimeInterpolator c;
    public int d;
    public int e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.c;
        if (timeInterpolator == null) {
            return AbstractC2297o3.b;
        }
        return timeInterpolator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1181dN)) {
            return false;
        }
        C1181dN c1181dN = (C1181dN) obj;
        if (this.a != c1181dN.a || this.b != c1181dN.b || this.d != c1181dN.d || this.e != c1181dN.e) {
            return false;
        }
        return a().getClass().equals(c1181dN.a().getClass());
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return ((((a().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(C1181dN.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.a);
        sb.append(" duration: ");
        sb.append(this.b);
        sb.append(" interpolator: ");
        sb.append(a().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.d);
        sb.append(" repeatMode: ");
        return AbstractC2437ph.k(sb, this.e, "}\n");
    }
}
