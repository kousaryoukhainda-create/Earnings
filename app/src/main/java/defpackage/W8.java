package defpackage;

import java.util.Set;
/* renamed from: W8  reason: default package */
/* loaded from: classes.dex */
public final class W8 {
    public final long a;
    public final long b;
    public final Set c;

    public W8(long j, long j2, Set set) {
        this.a = j;
        this.b = j2;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof W8)) {
            return false;
        }
        W8 w8 = (W8) obj;
        if (this.a == w8.a && this.b == w8.b && this.c.equals(w8.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return this.c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.a + ", maxAllowedDelay=" + this.b + ", flags=" + this.c + "}";
    }
}
