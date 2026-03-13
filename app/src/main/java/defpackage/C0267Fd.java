package defpackage;
/* renamed from: Fd  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0267Fd {
    public int[] a;
    public int b;
    public int c;
    public int d;

    public C0267Fd() {
        int highestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.d = highestOneBit - 1;
        this.a = new int[highestOneBit];
    }

    public final void a(int i) {
        int[] iArr = this.a;
        int i2 = this.c;
        iArr[i2] = i;
        int i3 = this.d & (i2 + 1);
        this.c = i3;
        int i4 = this.b;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length << 1;
            if (i6 >= 0) {
                int[] iArr2 = new int[i6];
                System.arraycopy(iArr, i4, iArr2, 0, i5);
                System.arraycopy(this.a, 0, iArr2, i5, this.b);
                this.a = iArr2;
                this.b = 0;
                this.c = length;
                this.d = i6 - 1;
                return;
            }
            throw new RuntimeException("Max array capacity exceeded");
        }
    }

    public final int b() {
        int i = this.b;
        if (i != this.c) {
            int i2 = this.a[i];
            this.b = (i + 1) & this.d;
            return i2;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
