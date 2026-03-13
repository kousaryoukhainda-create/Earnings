package defpackage;
/* renamed from: w00  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2979w00 implements InterfaceC0413Kt {
    public final /* synthetic */ int b;
    public final XT c;
    public final XT d;

    public /* synthetic */ C2979w00(XT xt, XT xt2, int i) {
        this.b = i;
        this.c = xt;
        this.d = xt2;
    }

    @Override // defpackage.XT
    public final Object get() {
        switch (this.b) {
            case 0:
                return new C2893v00((C3077x60) this.c.get(), (Ma0) this.d.get());
            default:
                return new L00((InterfaceC0813a10) this.c.get(), (InterfaceC0813a10) this.d.get());
        }
    }
}
