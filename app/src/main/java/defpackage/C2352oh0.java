package defpackage;
/* renamed from: oh0  reason: default package and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2352oh0 {
    public final int a;
    public final long b;

    public C2352oh0(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2352oh0) {
            C2352oh0 c2352oh0 = (C2352oh0) obj;
            if (this.a == c2352oh0.a && this.b == c2352oh0.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        return ((this.a ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventRecord{eventType=");
        sb.append(this.a);
        sb.append(", eventTimestamp=");
        return BK.n(sb, this.b, "}");
    }
}
