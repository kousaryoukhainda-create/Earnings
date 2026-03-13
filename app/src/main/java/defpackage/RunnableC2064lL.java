package defpackage;
/* renamed from: lL  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2064lL implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ C1394fq c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ LH f;
    public final /* synthetic */ XK g;

    public /* synthetic */ RunnableC2064lL(C1394fq c1394fq, InterfaceC2322oL interfaceC2322oL, LH lh, XK xk, int i) {
        this.b = i;
        this.c = c1394fq;
        this.d = interfaceC2322oL;
        this.f = lh;
        this.g = xk;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, oL] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, oL] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, oL] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                C1394fq c1394fq = this.c;
                int i = c1394fq.a;
                this.d.d(i, c1394fq.b, this.f, this.g);
                return;
            case 1:
                C1394fq c1394fq2 = this.c;
                int i2 = c1394fq2.a;
                this.d.g(i2, c1394fq2.b, this.f, this.g);
                return;
            default:
                C1394fq c1394fq3 = this.c;
                int i3 = c1394fq3.a;
                this.d.e(i3, c1394fq3.b, this.f, this.g);
                return;
        }
    }
}
