package defpackage;

import android.graphics.Insets;
/* renamed from: SD  reason: default package */
/* loaded from: classes.dex */
public final class SD {
    public static final SD e = new SD(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public SD(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static SD a(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return e;
        }
        return new SD(i, i2, i3, i4);
    }

    public static SD b(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return a(i, i2, i3, i4);
    }

    public final Insets c() {
        return RD.a(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SD.class != obj.getClass()) {
            return false;
        }
        SD sd = (SD) obj;
        if (this.d == sd.d && this.a == sd.a && this.c == sd.c && this.b == sd.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
