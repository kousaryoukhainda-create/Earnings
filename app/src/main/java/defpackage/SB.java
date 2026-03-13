package defpackage;

import androidx.media3.common.DrmInitData;
import java.util.List;
import java.util.Map;
/* renamed from: SB  reason: default package */
/* loaded from: classes.dex */
public final class SB extends XB {
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final DrmInitData q;
    public final AbstractC2571rD r;
    public final AbstractC2571rD s;
    public final AbstractC2829uD t;
    public final long u;
    public final RB v;

    public SB(int i, String str, List list, long j, boolean z, long j2, boolean z2, int i2, long j3, int i3, long j4, long j5, boolean z3, boolean z4, boolean z5, DrmInitData drmInitData, List list2, List list3, RB rb, Map map) {
        super(str, list, z3);
        this.d = i;
        this.h = j2;
        this.g = z;
        this.i = z2;
        this.j = i2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = j5;
        this.o = z4;
        this.p = z5;
        this.q = drmInitData;
        this.r = AbstractC2571rD.r(list2);
        this.s = AbstractC2571rD.r(list3);
        this.t = AbstractC2829uD.b(map);
        if (!list3.isEmpty()) {
            NB nb = (NB) AbstractC0867af0.T(list3);
            this.u = nb.g + nb.d;
        } else if (!list2.isEmpty()) {
            PB pb = (PB) AbstractC0867af0.T(list2);
            this.u = pb.g + pb.d;
        } else {
            this.u = 0L;
        }
        long j6 = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            if (j >= 0) {
                j6 = Math.min(this.u, j);
            } else {
                j6 = Math.max(0L, this.u + j);
            }
        }
        this.e = j6;
        this.f = j >= 0;
        this.v = rb;
    }

    @Override // defpackage.InterfaceC0621Su
    public final Object a(List list) {
        return this;
    }
}
