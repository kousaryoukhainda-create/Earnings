package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.fo;
import com.applovin.impl.sd;
/* loaded from: classes.dex */
public final class gk extends fo {
    private static final Object q = new Object();
    private static final sd r = new sd.c().b("SinglePeriodTimeline").a(Uri.EMPTY).a();
    private final long c;
    private final long d;
    private final long f;
    private final long g;
    private final long h;
    private final long i;
    private final long j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final Object n;
    private final sd o;
    private final sd.f p;

    public gk(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, Object obj, sd sdVar, sd.f fVar) {
        this.c = j;
        this.d = j2;
        this.f = j3;
        this.g = j4;
        this.h = j5;
        this.i = j6;
        this.j = j7;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = obj;
        this.o = (sd) b1.a(sdVar);
        this.p = fVar;
    }

    @Override // com.applovin.impl.fo
    public int a() {
        return 1;
    }

    @Override // com.applovin.impl.fo
    public int b() {
        return 1;
    }

    @Override // com.applovin.impl.fo
    public fo.b a(int i, fo.b bVar, boolean z) {
        b1.a(i, 0, 1);
        return bVar.a(null, z ? q : null, 0, this.g, -this.i);
    }

    @Override // com.applovin.impl.fo
    public Object b(int i) {
        b1.a(i, 0, 1);
        return q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
        if (r1 > r3) goto L11;
     */
    @Override // com.applovin.impl.fo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.applovin.impl.fo.d a(int r25, com.applovin.impl.fo.d r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            com.applovin.impl.b1.a(r3, r1, r2)
            long r1 = r0.j
            boolean r14 = r0.l
            if (r14 == 0) goto L2e
            boolean r3 = r0.m
            if (r3 != 0) goto L2e
            r3 = 0
            int r5 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r5 == 0) goto L2e
            long r3 = r0.h
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L25
            goto L2b
        L25:
            long r1 = r1 + r27
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 <= 0) goto L2e
        L2b:
            r16 = r5
            goto L30
        L2e:
            r16 = r1
        L30:
            java.lang.Object r4 = com.applovin.impl.fo.d.s
            com.applovin.impl.sd r5 = r0.o
            java.lang.Object r6 = r0.n
            long r7 = r0.c
            long r9 = r0.d
            long r11 = r0.f
            boolean r13 = r0.k
            com.applovin.impl.sd$f r15 = r0.p
            long r1 = r0.h
            r18 = r1
            long r1 = r0.i
            r22 = r1
            r20 = 0
            r21 = 0
            r3 = r26
            com.applovin.impl.fo$d r1 = r3.a(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.gk.a(int, com.applovin.impl.fo$d, long):com.applovin.impl.fo$d");
    }

    @Override // com.applovin.impl.fo
    public int a(Object obj) {
        return q.equals(obj) ? 0 : -1;
    }

    public gk(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, Object obj, sd sdVar) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, false, obj, sdVar, z3 ? sdVar.c : null);
    }

    public gk(long j, boolean z, boolean z2, boolean z3, Object obj, sd sdVar) {
        this(j, j, 0L, 0L, z, z2, z3, obj, sdVar);
    }
}
