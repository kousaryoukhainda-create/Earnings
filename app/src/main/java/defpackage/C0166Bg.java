package defpackage;
/* renamed from: Bg  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0166Bg implements InterfaceC0348Ig {
    public final /* synthetic */ C0192Cg a;

    public C0166Bg(C0192Cg c0192Cg) {
        this.a = c0192Cg;
    }

    @Override // defpackage.InterfaceC0348Ig
    public final void onError(C2028kw c2028kw) {
        C0192Cg c0192Cg = this.a;
        synchronized (c0192Cg) {
            c0192Cg.d = true;
        }
        this.a.g(c2028kw);
    }

    @Override // defpackage.InterfaceC0348Ig
    public final void onUpdate(AbstractC0322Hg abstractC0322Hg) {
    }
}
