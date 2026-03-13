package j$.util;

import java.util.NoSuchElementException;
/* renamed from: j$.util.m  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1719m {
    private static final C1719m c = new C1719m();
    private final boolean a;
    private final int b;

    private C1719m() {
        this.a = false;
        this.b = 0;
    }

    public static C1719m a() {
        return c;
    }

    private C1719m(int i) {
        this.a = true;
        this.b = i;
    }

    public static C1719m d(int i) {
        return new C1719m(i);
    }

    public final int b() {
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
        if (obj instanceof C1719m) {
            C1719m c1719m = (C1719m) obj;
            boolean z = this.a;
            if (z && c1719m.a) {
                if (this.b == c1719m.b) {
                    return true;
                }
            } else if (z == c1719m.a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        if (this.a) {
            return this.b;
        }
        return 0;
    }

    public final String toString() {
        if (this.a) {
            return "OptionalInt[" + this.b + "]";
        }
        return "OptionalInt.empty";
    }
}
