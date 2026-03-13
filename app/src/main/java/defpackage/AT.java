package defpackage;
/* renamed from: AT  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class AT implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ FT c;

    public /* synthetic */ AT(FT ft, int i) {
        this.b = i;
        this.c = ft;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.c.I = true;
                return;
            case 1:
                this.c.y();
                return;
            default:
                FT ft = this.c;
                if (!ft.O) {
                    InterfaceC1017cL interfaceC1017cL = ft.s;
                    interfaceC1017cL.getClass();
                    interfaceC1017cL.g(ft);
                    return;
                }
                return;
        }
    }
}
