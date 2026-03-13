package defpackage;
/* renamed from: jL  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1892jL {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public C1892jL(Object obj) {
        this(obj, -1L);
    }

    public final C1892jL a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        return new C1892jL(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b() {
        if (this.b != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1892jL)) {
            return false;
        }
        C1892jL c1892jL = (C1892jL) obj;
        if (this.a.equals(c1892jL.a) && this.b == c1892jL.b && this.c == c1892jL.c && this.d == c1892jL.d && this.e == c1892jL.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public C1892jL(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public C1892jL(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public C1892jL(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }
}
