package defpackage;
/* renamed from: Yf  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0762Yf implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ InterfaceC3113xb0 c;

    public /* synthetic */ RunnableC0762Yf(C0788Zf c0788Zf, InterfaceC3113xb0 interfaceC3113xb0, int i) {
        this.b = i;
        this.c = interfaceC3113xb0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.c.getClass();
                return;
            case 1:
                this.c.k();
                return;
            default:
                this.c.d();
                return;
        }
    }

    public /* synthetic */ RunnableC0762Yf(C0788Zf c0788Zf, InterfaceC3113xb0 interfaceC3113xb0, C3285zb0 c3285zb0) {
        this.b = 0;
        this.c = interfaceC3113xb0;
    }
}
