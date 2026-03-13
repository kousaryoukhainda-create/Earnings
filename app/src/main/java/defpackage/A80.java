package defpackage;
/* renamed from: A80  reason: default package */
/* loaded from: classes.dex */
public final class A80 {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(L70 l70, K70 k70) {
        if (this.c > 0) {
            l70.a(this.d, this.e, this.f, this.g, k70);
            this.c = 0;
        }
    }

    public final void b(L70 l70, long j, int i, int i2, int i3, K70 k70) {
        boolean z;
        if (this.g <= i2 + i3) {
            z = true;
        } else {
            z = false;
        }
        B10.t("TrueHD chunk samples must be contiguous in the sample queue.", z);
        if (!this.b) {
            return;
        }
        int i4 = this.c;
        int i5 = i4 + 1;
        this.c = i5;
        if (i4 == 0) {
            this.d = j;
            this.e = i;
            this.f = 0;
        }
        this.f += i2;
        this.g = i3;
        if (i5 >= 16) {
            a(l70, k70);
        }
    }

    public final void c(InterfaceC0309Gt interfaceC0309Gt) {
        char c;
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        int i = 0;
        interfaceC0309Gt.f(0, bArr, 10);
        interfaceC0309Gt.u();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                if ((b & 255) == 187) {
                    c = '\t';
                } else {
                    c = '\b';
                }
                i = 40 << ((bArr[c] >> 4) & 7);
            }
        }
        if (i == 0) {
            return;
        }
        this.b = true;
    }
}
