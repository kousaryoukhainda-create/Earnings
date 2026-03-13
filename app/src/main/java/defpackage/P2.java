package defpackage;

import java.util.Arrays;
/* renamed from: P2  reason: default package */
/* loaded from: classes.dex */
public final class P2 {
    public final long a;
    public final E60 b;
    public final int c;
    public final C1892jL d;
    public final long e;
    public final E60 f;
    public final int g;
    public final C1892jL h;
    public final long i;
    public final long j;

    public P2(long j, E60 e60, int i, C1892jL c1892jL, long j2, E60 e602, int i2, C1892jL c1892jL2, long j3, long j4) {
        this.a = j;
        this.b = e60;
        this.c = i;
        this.d = c1892jL;
        this.e = j2;
        this.f = e602;
        this.g = i2;
        this.h = c1892jL2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || P2.class != obj.getClass()) {
            return false;
        }
        P2 p2 = (P2) obj;
        if (this.a == p2.a && this.c == p2.c && this.e == p2.e && this.g == p2.g && this.i == p2.i && this.j == p2.j && B10.C(this.b, p2.b) && B10.C(this.d, p2.d) && B10.C(this.f, p2.f) && B10.C(this.h, p2.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j)});
    }
}
