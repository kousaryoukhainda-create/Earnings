package defpackage;
/* renamed from: bn  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0973bn extends O9 {
    public final /* synthetic */ int f = 0;
    public final Object g;

    public C0973bn(C2727t30 c2727t30, int i) {
        super(i, c2727t30.k - 1);
        this.g = c2727t30;
    }

    @Override // defpackage.InterfaceC1891jK
    public final long g() {
        switch (this.f) {
            case 0:
                a();
                return ((C0882an) this.g).f(this.d);
            default:
                a();
                return ((C2727t30) this.g).o[(int) this.d];
        }
    }

    @Override // defpackage.InterfaceC1891jK
    public final long j() {
        switch (this.f) {
            case 0:
                a();
                return ((C0882an) this.g).e(this.d);
            default:
                return ((C2727t30) this.g).b((int) this.d) + g();
        }
    }

    public C0973bn(C0882an c0882an, long j, long j2) {
        super(j, j2);
        this.g = c0882an;
    }
}
