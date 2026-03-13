package defpackage;
/* renamed from: I30  reason: default package */
/* loaded from: classes2.dex */
public final class I30 implements InterfaceC2868ui, InterfaceC0687Vi {
    public final InterfaceC2868ui b;
    public final InterfaceC0428Li c;

    public I30(InterfaceC2868ui interfaceC2868ui, InterfaceC0428Li interfaceC0428Li) {
        this.b = interfaceC2868ui;
        this.c = interfaceC0428Li;
    }

    @Override // defpackage.InterfaceC0687Vi
    public final InterfaceC0687Vi getCallerFrame() {
        InterfaceC2868ui interfaceC2868ui = this.b;
        if (interfaceC2868ui instanceof InterfaceC0687Vi) {
            return (InterfaceC0687Vi) interfaceC2868ui;
        }
        return null;
    }

    @Override // defpackage.InterfaceC2868ui
    public final InterfaceC0428Li getContext() {
        return this.c;
    }

    @Override // defpackage.InterfaceC2868ui
    public final void resumeWith(Object obj) {
        this.b.resumeWith(obj);
    }
}
