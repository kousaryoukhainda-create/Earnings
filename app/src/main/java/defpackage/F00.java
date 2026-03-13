package defpackage;
/* renamed from: F00  reason: default package */
/* loaded from: classes2.dex */
public final class F00 implements Runnable {
    public final /* synthetic */ Boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ G00 d;

    public F00(G00 g00, Boolean bool, long j) {
        this.d = g00;
        this.b = bool;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean booleanValue = this.b.booleanValue();
        G00 g00 = this.d;
        if (booleanValue) {
            g00.c(this.c);
        }
        g00.g = true;
        g00.a();
    }
}
