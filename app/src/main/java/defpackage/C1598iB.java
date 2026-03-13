package defpackage;

import java.util.Arrays;
/* renamed from: iB  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1598iB {
    public static final byte[] f = {0, 0, 1};
    public boolean a;
    public int b;
    public int c;
    public int d;
    public byte[] e;

    public final void a(int i, byte[] bArr, int i2) {
        if (!this.a) {
            return;
        }
        int i3 = i2 - i;
        byte[] bArr2 = this.e;
        int length = bArr2.length;
        int i4 = this.c + i3;
        if (length < i4) {
            this.e = Arrays.copyOf(bArr2, i4 * 2);
        }
        System.arraycopy(bArr, i, this.e, this.c, i3);
        this.c += i3;
    }
}
