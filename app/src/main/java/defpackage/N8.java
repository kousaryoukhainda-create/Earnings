package defpackage;
/* renamed from: N8  reason: default package */
/* loaded from: classes.dex */
public final class N8 {
    public final long a;
    public final C1166d9 b;
    public final C3166y8 c;

    public N8(long j, C1166d9 c1166d9, C3166y8 c3166y8) {
        this.a = j;
        this.b = c1166d9;
        this.c = c3166y8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof N8)) {
            return false;
        }
        N8 n8 = (N8) obj;
        if (this.a == n8.a && this.b.equals(n8.b) && this.c.equals(n8.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
