package defpackage;
/* renamed from: ZT  reason: default package */
/* loaded from: classes.dex */
public final class ZT {
    public final /* synthetic */ int a;
    public final J60 b;
    public final NQ c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;
    public long h;
    public long i;

    public ZT(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new J60(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new NQ();
                return;
            default:
                this.b = new J60(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new NQ();
                return;
        }
    }

    public static int b(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long c(NQ nq) {
        int i = nq.b;
        if (nq.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        nq.f(0, bArr, 9);
        nq.G(i);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(C2277nn c2277nn) {
        switch (this.a) {
            case 0:
                byte[] bArr = Ha0.f;
                NQ nq = this.c;
                nq.getClass();
                nq.E(bArr.length, bArr);
                this.d = true;
                c2277nn.h = 0;
                return;
            default:
                byte[] bArr2 = Ha0.f;
                NQ nq2 = this.c;
                nq2.getClass();
                nq2.E(bArr2.length, bArr2);
                this.d = true;
                c2277nn.h = 0;
                return;
        }
    }
}
