package defpackage;

import java.util.Arrays;
/* renamed from: K70  reason: default package */
/* loaded from: classes.dex */
public final class K70 {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public K70(int i, byte[] bArr, int i2, int i3) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || K70.class != obj.getClass()) {
            return false;
        }
        K70 k70 = (K70) obj;
        if (this.a == k70.a && this.c == k70.c && this.d == k70.d && Arrays.equals(this.b, k70.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
