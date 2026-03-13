package defpackage;
/* renamed from: V80  reason: default package */
/* loaded from: classes2.dex */
public abstract class V80 extends AbstractC1338f90 {
    @Override // defpackage.AbstractC1338f90
    public boolean d(AbstractC1338f90 abstractC1338f90) {
        if (abstractC1338f90.l()) {
            return abstractC1338f90.d(this);
        }
        return f().equals(abstractC1338f90.f());
    }

    @Override // defpackage.AbstractC1338f90
    public int g(L5 l5) {
        return l5.c(f());
    }

    @Override // defpackage.AbstractC1338f90
    public int h() {
        return 7;
    }

    public abstract void r(AbstractC1338f90 abstractC1338f90);
}
