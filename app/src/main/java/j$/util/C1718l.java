package j$.util;

import java.util.NoSuchElementException;
/* renamed from: j$.util.l  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1718l {
    private static final C1718l c = new C1718l();
    private final boolean a;
    private final double b;

    private C1718l() {
        this.a = false;
        this.b = Double.NaN;
    }

    public static C1718l a() {
        return c;
    }

    private C1718l(double d) {
        this.a = true;
        this.b = d;
    }

    public static C1718l d(double d) {
        return new C1718l(d);
    }

    public final double b() {
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
        if (obj instanceof C1718l) {
            C1718l c1718l = (C1718l) obj;
            boolean z = this.a;
            if (z && c1718l.a) {
                if (Double.compare(this.b, c1718l.b) == 0) {
                    return true;
                }
            } else if (z == c1718l.a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        if (this.a) {
            long doubleToLongBits = Double.doubleToLongBits(this.b);
            return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        }
        return 0;
    }

    public final String toString() {
        if (this.a) {
            return "OptionalDouble[" + this.b + "]";
        }
        return "OptionalDouble.empty";
    }
}
