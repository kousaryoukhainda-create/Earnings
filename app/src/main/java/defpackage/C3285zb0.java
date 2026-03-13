package defpackage;
/* renamed from: zb0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3285zb0 {
    public static final C3285zb0 e = new C3285zb0(0, 0, 0, 1.0f);
    public final int a;
    public final int b;
    public final int c;
    public final float d;

    static {
        Ha0.H(0);
        Ha0.H(1);
        Ha0.H(2);
        Ha0.H(3);
    }

    public C3285zb0(int i, int i2, int i3, float f) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3285zb0)) {
            return false;
        }
        C3285zb0 c3285zb0 = (C3285zb0) obj;
        if (this.a == c3285zb0.a && this.b == c3285zb0.b && this.c == c3285zb0.c && this.d == c3285zb0.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.d) + ((((((217 + this.a) * 31) + this.b) * 31) + this.c) * 31);
    }
}
