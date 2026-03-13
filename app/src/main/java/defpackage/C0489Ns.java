package defpackage;
/* renamed from: Ns  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0489Ns implements InterfaceC3091xH, InterfaceC3005wH {
    public final /* synthetic */ C0697Vs b;

    public /* synthetic */ C0489Ns(C0697Vs c0697Vs) {
        this.b = c0697Vs;
    }

    @Override // defpackage.InterfaceC3091xH
    public void a(Object obj, C0545Pw c0545Pw) {
        C0697Vs c0697Vs = this.b;
        c0697Vs.getClass();
        ((InterfaceC0939bS) obj).onEvents(c0697Vs.f, new C0848aS(c0545Pw));
    }

    @Override // defpackage.InterfaceC3005wH
    public void invoke(Object obj) {
        ((InterfaceC0939bS) obj).onAvailableCommandsChanged(this.b.J);
    }
}
