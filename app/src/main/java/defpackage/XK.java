package defpackage;

import androidx.media3.common.b;
/* renamed from: XK  reason: default package */
/* loaded from: classes.dex */
public final class XK implements InterfaceC2591rX {
    public int a;
    public long b;
    public int c;
    public long d;
    public int e;
    public final Object f;
    public Object g;

    public XK(C2506qX c2506qX) {
        this.f = c2506qX;
        this.b = -9223372036854775807L;
        this.c = -1;
    }

    @Override // defpackage.InterfaceC2591rX
    public void b(long j, long j2) {
        this.b = j;
        this.d = j2;
        this.e = 0;
    }

    @Override // defpackage.InterfaceC2591rX
    public void c(InterfaceC0361It interfaceC0361It, int i) {
        L70 x = interfaceC0361It.x(i, 2);
        this.g = x;
        int i2 = Ha0.a;
        x.f(((C2506qX) this.f).c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
        if ((r24.e() >> 6) == 0) goto L22;
     */
    @Override // defpackage.InterfaceC2591rX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(defpackage.NQ r24, long r25, int r27, boolean r28) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r27
            r3 = 4
            r4 = 1
            java.lang.Object r5 = r0.g
            L70 r5 = (defpackage.L70) r5
            defpackage.B10.w(r5)
            int r5 = r0.c
            r6 = -1
            if (r5 == r6) goto L2d
            int r5 = defpackage.C2334oX.a(r5)
            if (r2 == r5) goto L2d
            int r7 = defpackage.Ha0.a
            java.util.Locale r7 = java.util.Locale.US
            java.lang.String r7 = "Received RTP packet with unexpected sequence number. Expected: "
            java.lang.String r8 = "; received: "
            java.lang.String r9 = ". Dropping packet."
            java.lang.String r5 = defpackage.AbstractC2437ph.e(r7, r5, r8, r2, r9)
            java.lang.String r7 = "RtpMpeg4Reader"
            defpackage.Wh0.o0(r7, r5)
        L2d:
            int r5 = r24.a()
            java.lang.Object r7 = r0.g
            L70 r7 = (defpackage.L70) r7
            r7.d(r5, r1)
            int r7 = r0.e
            r8 = 0
            if (r7 != 0) goto L71
            byte[] r7 = r1.a
            byte[] r9 = new byte[r3]
            r9 = {x00ae: FILL_ARRAY_DATA  , data: [0, 0, 1, -74} // fill-array
            java.lang.String r10 = "array"
            defpackage.B10.q(r7, r10)
            r10 = 0
        L4a:
            int r11 = r7.length
            int r11 = r11 + (-3)
            if (r10 >= r11) goto L5e
            r11 = 0
        L50:
            if (r11 >= r3) goto L5f
            int r12 = r10 + r11
            r12 = r7[r12]
            r13 = r9[r11]
            if (r12 == r13) goto L5c
            int r10 = r10 + r4
            goto L4a
        L5c:
            int r11 = r11 + r4
            goto L50
        L5e:
            r10 = -1
        L5f:
            if (r10 == r6) goto L6e
            int r10 = r10 + r3
            r1.G(r10)
            int r1 = r24.e()
            int r1 = r1 >> 6
            if (r1 != 0) goto L6e
            goto L6f
        L6e:
            r4 = 0
        L6f:
            r0.a = r4
        L71:
            int r1 = r0.e
            int r1 = r1 + r5
            r0.e = r1
            if (r28 == 0) goto Lab
            long r3 = r0.b
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r3 = r25
            if (r1 != 0) goto L87
            r0.b = r3
        L87:
            long r9 = r0.d
            long r13 = r0.b
            r15 = 90000(0x15f90, float:1.26117E-40)
            r11 = r25
            long r17 = defpackage.AbstractC1906jZ.Q(r9, r11, r13, r15)
            java.lang.Object r1 = r0.g
            r16 = r1
            L70 r16 = (defpackage.L70) r16
            int r1 = r0.a
            int r3 = r0.e
            r21 = 0
            r22 = 0
            r19 = r1
            r20 = r3
            r16.a(r17, r19, r20, r21, r22)
            r0.e = r8
        Lab:
            r0.c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.XK.d(NQ, long, int, boolean):void");
    }

    public XK(int i, int i2, b bVar, int i3, Object obj, long j, long j2) {
        this.a = i;
        this.c = i2;
        this.f = bVar;
        this.e = i3;
        this.g = obj;
        this.b = j;
        this.d = j2;
    }

    @Override // defpackage.InterfaceC2591rX
    public void a(long j) {
    }
}
