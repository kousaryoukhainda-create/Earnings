package defpackage;
/* renamed from: Z30  reason: default package */
/* loaded from: classes.dex */
public final class Z30 extends AbstractC2889uy {
    public final /* synthetic */ InterfaceC2164mZ b;
    public final /* synthetic */ C2257nd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z30(C2257nd c2257nd, InterfaceC2164mZ interfaceC2164mZ, InterfaceC2164mZ interfaceC2164mZ2) {
        super(interfaceC2164mZ);
        this.c = c2257nd;
        this.b = interfaceC2164mZ2;
    }

    @Override // defpackage.AbstractC2889uy, defpackage.InterfaceC2164mZ
    public final C2078lZ i(long j) {
        C2078lZ i = this.b.i(j);
        C2336oZ c2336oZ = i.a;
        long j2 = c2336oZ.a;
        long j3 = this.c.c;
        C2336oZ c2336oZ2 = new C2336oZ(j2, c2336oZ.b + j3);
        C2336oZ c2336oZ3 = i.b;
        return new C2078lZ(c2336oZ2, new C2336oZ(c2336oZ3.a, c2336oZ3.b + j3));
    }
}
