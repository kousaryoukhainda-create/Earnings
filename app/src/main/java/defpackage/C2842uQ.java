package defpackage;
/* renamed from: uQ  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2842uQ implements YT {
    public static final C0896aw c = new C0896aw(20);
    public static final C0476Nf d = new C0476Nf(9);
    public InterfaceC0330Ho a;
    public volatile YT b;

    public C2842uQ(C0896aw c0896aw, YT yt) {
        this.a = c0896aw;
        this.b = yt;
    }

    public final void a(InterfaceC0330Ho interfaceC0330Ho) {
        YT yt;
        YT yt2;
        YT yt3 = this.b;
        C0476Nf c0476Nf = d;
        if (yt3 != c0476Nf) {
            interfaceC0330Ho.c(yt3);
            return;
        }
        synchronized (this) {
            yt = this.b;
            if (yt != c0476Nf) {
                yt2 = yt;
            } else {
                this.a = new C1409g2(21, this.a, interfaceC0330Ho);
                yt2 = null;
            }
        }
        if (yt2 != null) {
            interfaceC0330Ho.c(yt);
        }
    }

    @Override // defpackage.YT
    public final Object get() {
        return this.b.get();
    }
}
