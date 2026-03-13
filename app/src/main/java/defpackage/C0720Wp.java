package defpackage;
/* renamed from: Wp  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0720Wp implements InterfaceC0428Li {
    public final Throwable b;
    public final /* synthetic */ InterfaceC0428Li c;

    public C0720Wp(InterfaceC0428Li interfaceC0428Li, Throwable th) {
        this.b = th;
        this.c = interfaceC0428Li;
    }

    @Override // defpackage.InterfaceC0428Li
    public final Object fold(Object obj, InterfaceC0652Tz interfaceC0652Tz) {
        return this.c.fold(obj, interfaceC0652Tz);
    }

    @Override // defpackage.InterfaceC0428Li
    public final InterfaceC0376Ji get(InterfaceC0402Ki interfaceC0402Ki) {
        return this.c.get(interfaceC0402Ki);
    }

    @Override // defpackage.InterfaceC0428Li
    public final InterfaceC0428Li minusKey(InterfaceC0402Ki interfaceC0402Ki) {
        return this.c.minusKey(interfaceC0402Ki);
    }

    @Override // defpackage.InterfaceC0428Li
    public final InterfaceC0428Li plus(InterfaceC0428Li interfaceC0428Li) {
        return this.c.plus(interfaceC0428Li);
    }
}
