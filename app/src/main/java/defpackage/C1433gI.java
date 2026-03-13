package defpackage;
/* renamed from: gI  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1433gI extends P5 {
    @Override // defpackage.P5
    public final P5 a(L5 l5) {
        byte[] bArr = this.d;
        byte[] bArr2 = new byte[bArr.length];
        C1433gI j = j(l5, bArr2);
        int i = 0;
        int R = AbstractC2870uj.R(0, bArr);
        AbstractC2870uj.h0(R, bArr2, 0);
        int i2 = 2;
        while (i < R) {
            int R2 = AbstractC2870uj.R(i2, bArr);
            int i3 = i2 + 2;
            int R3 = AbstractC2870uj.R(i3, bArr);
            int i4 = i2 + 4;
            int R4 = AbstractC2870uj.R(i4, bArr);
            int i5 = i2 + 6;
            int R5 = AbstractC2870uj.R(i5, bArr);
            int i6 = i2 + 8;
            int i7 = R;
            int R6 = AbstractC2870uj.R(i6, bArr);
            AbstractC2870uj.h0(R2, bArr2, i2);
            AbstractC2870uj.h0(R3, bArr2, i3);
            L5 l52 = this.b;
            if (R4 != 0) {
                R4 = l52.l(R4, l5, null);
            }
            AbstractC2870uj.h0(R4, bArr2, i4);
            if (R5 != 0) {
                R5 = l5.j(l52.p(R5));
            }
            AbstractC2870uj.h0(R5, bArr2, i5);
            AbstractC2870uj.h0(R6, bArr2, i6);
            i2 += 10;
            i++;
            R = i7;
        }
        return j;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gI, P5] */
    public C1433gI j(L5 l5, byte[] bArr) {
        return new P5(l5, l5.j("LocalVariableTable"), bArr);
    }

    public final void k(int i, int i2, boolean z) {
        int R = AbstractC2870uj.R(0, this.d);
        for (int i3 = 0; i3 < R; i3++) {
            int i4 = i3 * 10;
            int i5 = i4 + 2;
            int R2 = AbstractC2870uj.R(i5, this.d);
            int i6 = i4 + 4;
            int R3 = AbstractC2870uj.R(i6, this.d);
            if (R2 <= i && (!z || R2 != i || R2 == 0)) {
                int i7 = R2 + R3;
                if (i7 > i || (z && i7 == i)) {
                    AbstractC2870uj.h0(R3 + i2, this.d, i6);
                }
            } else {
                AbstractC2870uj.h0(R2 + i2, this.d, i5);
            }
        }
    }
}
