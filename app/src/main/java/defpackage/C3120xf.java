package defpackage;
/* renamed from: xf  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3120xf implements InterfaceC0263Ez {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C3120xf(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.InterfaceC0263Ez
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((AbstractActivityC0347If) this.c).reportFullyDrawn();
                return null;
            default:
                return AbstractC0324Hi.f(((C1261eI) this.c).e().getPackageName(), ".flutter.share_provider");
        }
    }
}
