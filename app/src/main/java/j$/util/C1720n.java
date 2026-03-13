package j$.util;

import java.util.NoSuchElementException;
/* renamed from: j$.util.n  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1720n {
    private static final C1720n c = new C1720n();
    private final boolean a;
    private final long b;

    private C1720n() {
        this.a = false;
        this.b = 0L;
    }

    public static C1720n a() {
        return c;
    }

    private C1720n(long j) {
        this.a = true;
        this.b = j;
    }

    public static C1720n d(long j) {
        return new C1720n(j);
    }

    public final long b() {
        if (!this.a) {
            throw new NoSuchElementException("No value present");
        }
        return this.b;
    }

    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1720n) {
            C1720n c1720n = (C1720n) obj;
            boolean z = this.a;
            if (z && c1720n.a) {
                if (this.b == c1720n.b) {
                    return true;
                }
            } else if (z == c1720n.a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        if (this.a) {
            long j = this.b;
            return (int) (j ^ (j >>> 32));
        }
        return 0;
    }

    public final String toString() {
        if (this.a) {
            return "OptionalLong[" + this.b + "]";
        }
        return "OptionalLong.empty";
    }
}
