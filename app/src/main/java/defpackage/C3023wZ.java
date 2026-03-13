package defpackage;

import java.util.List;
/* renamed from: wZ  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3023wZ extends AbstractC2937vZ {
    public final List j;

    public C3023wZ(CU cu, long j, long j2, long j3, long j4, List list, long j5, List list2, long j6, long j7) {
        super(cu, j, j2, j3, j4, list, j5, j6, j7);
        this.j = list2;
    }

    @Override // defpackage.AbstractC2937vZ
    public final long d(long j) {
        return this.j.size();
    }

    @Override // defpackage.AbstractC2937vZ
    public final CU h(C1989kW c1989kW, long j) {
        return (CU) this.j.get((int) (j - this.d));
    }

    @Override // defpackage.AbstractC2937vZ
    public final boolean i() {
        return true;
    }
}
