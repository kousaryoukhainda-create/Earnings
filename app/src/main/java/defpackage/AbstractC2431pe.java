package defpackage;
/* renamed from: pe  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2431pe {
    public int a;
    public final int b;

    public AbstractC2431pe(int i) {
        this.b = i;
        this.a = i;
    }

    public static int e(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i + i2;
        if (i < i3) {
            if (i3 >= i5 && (!z || i3 != i5)) {
                return i2;
            }
        } else {
            if (i == i3) {
                if (i5 >= i3 || !z) {
                    if (i3 >= i5 || z) {
                        return i2;
                    }
                }
            } else if (i5 >= i3 && (z || i3 != i5)) {
                return i2;
            }
            return i2 - i4;
        }
        return i2 + i4;
    }

    public int a() {
        return 0;
    }

    public boolean b() {
        return false;
    }

    public int c() {
        return 0;
    }

    public void d(int i, int i2, boolean z) {
        int i3 = this.a;
        if (i < i3 || (i == i3 && z)) {
            this.a = i3 + i2;
        }
    }

    public abstract int f(byte[] bArr, int i, int i2, byte[] bArr2);
}
