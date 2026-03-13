package defpackage;

import java.util.Arrays;
/* renamed from: l6  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2045l6 {
    public static final C2045l6 e = new C2045l6(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public C2045l6(int i, int i2, int i3) {
        int i4;
        this.a = i;
        this.b = i2;
        this.c = i3;
        if (Ha0.I(i3)) {
            i4 = Ha0.B(i3, i2);
        } else {
            i4 = -1;
        }
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2045l6)) {
            return false;
        }
        C2045l6 c2045l6 = (C2045l6) obj;
        if (this.a == c2045l6.a && this.b == c2045l6.b && this.c == c2045l6.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.a + ", channelCount=" + this.b + ", encoding=" + this.c + ']';
    }
}
