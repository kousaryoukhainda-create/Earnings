package defpackage;

import java.util.List;
/* renamed from: GB  reason: default package */
/* loaded from: classes.dex */
public final class GB extends O9 {
    public final List f;
    public final long g;

    public GB(long j, List list) {
        super(0L, list.size() - 1);
        this.g = j;
        this.f = list;
    }

    @Override // defpackage.InterfaceC1891jK
    public final long g() {
        a();
        return this.g + ((QB) this.f.get((int) this.d)).g;
    }

    @Override // defpackage.InterfaceC1891jK
    public final long j() {
        a();
        QB qb = (QB) this.f.get((int) this.d);
        return this.g + qb.g + qb.d;
    }
}
