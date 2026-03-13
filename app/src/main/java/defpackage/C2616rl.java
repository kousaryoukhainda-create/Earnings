package defpackage;

import kotlin.jvm.internal.Intrinsics;
/* renamed from: rl  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2616rl {
    public final EnumC2531ql a;
    public final EnumC2531ql b;
    public final double c;

    public C2616rl(EnumC2531ql performance, EnumC2531ql crashlytics, double d) {
        Intrinsics.checkNotNullParameter(performance, "performance");
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        this.a = performance;
        this.b = crashlytics;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2616rl)) {
            return false;
        }
        C2616rl c2616rl = (C2616rl) obj;
        if (this.a == c2616rl.a && this.b == c2616rl.b && Double.compare(this.c, c2616rl.c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.c);
        return ((hashCode + (this.a.hashCode() * 31)) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.a + ", crashlytics=" + this.b + ", sessionSamplingRate=" + this.c + ')';
    }
}
