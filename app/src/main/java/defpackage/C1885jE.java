package defpackage;

import java.util.Iterator;
/* renamed from: jE  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1885jE implements Iterable, RF {
    public final int b;
    public final int c;
    public final int d;

    public C1885jE(int i, int i2, int i3) {
        if (i3 != 0) {
            if (i3 != Integer.MIN_VALUE) {
                this.b = i;
                this.c = B10.K(i, i2, i3);
                this.d = i3;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1885jE) {
            if (!isEmpty() || !((C1885jE) obj).isEmpty()) {
                C1885jE c1885jE = (C1885jE) obj;
                if (this.b != c1885jE.b || this.c != c1885jE.c || this.d != c1885jE.d) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.b * 31) + this.c) * 31) + this.d;
    }

    public boolean isEmpty() {
        int i = this.d;
        int i2 = this.c;
        int i3 = this.b;
        if (i > 0) {
            if (i3 <= i2) {
                return false;
            }
        } else if (i3 >= i2) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1971kE(this.b, this.c, this.d);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.c;
        int i2 = this.b;
        int i3 = this.d;
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}
