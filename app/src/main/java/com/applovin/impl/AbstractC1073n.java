package com.applovin.impl;

import com.applovin.impl.e9;
import java.nio.ByteBuffer;
/* renamed from: com.applovin.impl.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1073n {
    private static final int[] a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: com.applovin.impl.n$b */
    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        private b(int i, int i2, int i3, int i4, int i5) {
            this.a = i;
            this.c = i2;
            this.b = i3;
            this.d = i4;
            this.e = i5;
        }
    }

    public static void a(int i, ah ahVar) {
        ahVar.d(7);
        byte[] c = ahVar.c();
        c[0] = -84;
        c[1] = 64;
        c[2] = -1;
        c[3] = -1;
        c[4] = (byte) ((i >> 16) & 255);
        c[5] = (byte) ((i >> 8) & 255);
        c[6] = (byte) (i & 255);
    }

    public static e9 a(ah ahVar, String str, String str2, x6 x6Var) {
        ahVar.g(1);
        return new e9.b().c(str).f("audio/ac4").c(2).n(((ahVar.w() & 32) >> 5) == 1 ? 48000 : 44100).a(x6Var).e(str2).a();
    }

    public static int a(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int position = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return a(new zg(bArr)).e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0084, code lost:
        if (r11 != 11) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0089, code lost:
        if (r11 != 11) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
        if (r11 != 8) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.applovin.impl.AbstractC1073n.b a(com.applovin.impl.zg r11) {
        /*
            r0 = 16
            int r1 = r11.a(r0)
            int r0 = r11.a(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r11.a(r0)
            r2 = 7
            goto L19
        L18:
            r2 = 4
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r8 = r0
            r0 = 2
            int r1 = r11.a(r0)
            r2 = 3
            if (r1 != r2) goto L2f
            int r4 = a(r11, r0)
            int r1 = r1 + r4
        L2f:
            r5 = r1
            r1 = 10
            int r1 = r11.a(r1)
            boolean r4 = r11.f()
            if (r4 == 0) goto L45
            int r4 = r11.a(r2)
            if (r4 <= 0) goto L45
            r11.d(r0)
        L45:
            boolean r4 = r11.f()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r4 == 0) goto L55
            r9 = 48000(0xbb80, float:6.7262E-41)
            goto L58
        L55:
            r9 = 44100(0xac44, float:6.1797E-41)
        L58:
            int r11 = r11.a(r3)
            if (r9 != r6) goto L67
            r4 = 13
            if (r11 != r4) goto L67
            int[] r0 = com.applovin.impl.AbstractC1073n.a
            r11 = r0[r11]
            goto L97
        L67:
            if (r9 != r7) goto L96
            int[] r4 = com.applovin.impl.AbstractC1073n.a
            int r6 = r4.length
            if (r11 >= r6) goto L96
            r4 = r4[r11]
            int r1 = r1 % 5
            r6 = 1
            r7 = 8
            if (r1 == r6) goto L8c
            r6 = 11
            if (r1 == r0) goto L87
            if (r1 == r2) goto L8c
            if (r1 == r3) goto L80
            goto L91
        L80:
            if (r11 == r2) goto L93
            if (r11 == r7) goto L93
            if (r11 != r6) goto L91
            goto L93
        L87:
            if (r11 == r7) goto L93
            if (r11 != r6) goto L91
            goto L93
        L8c:
            if (r11 == r2) goto L93
            if (r11 != r7) goto L91
            goto L93
        L91:
            r11 = r4
            goto L97
        L93:
            int r4 = r4 + 1
            goto L91
        L96:
            r11 = 0
        L97:
            com.applovin.impl.n$b r0 = new com.applovin.impl.n$b
            r6 = 2
            r10 = 0
            r4 = r0
            r7 = r9
            r9 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.AbstractC1073n.a(com.applovin.impl.zg):com.applovin.impl.n$b");
    }

    public static int a(byte[] bArr, int i) {
        int i2 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i3 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i3 == 65535) {
            i3 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i2 = 4;
        }
        if (i == 44097) {
            i2 += 2;
        }
        return i3 + i2;
    }

    private static int a(zg zgVar, int i) {
        int i2 = 0;
        while (true) {
            int a2 = zgVar.a(i) + i2;
            if (!zgVar.f()) {
                return a2;
            }
            i2 = (a2 + 1) << i;
        }
    }
}
