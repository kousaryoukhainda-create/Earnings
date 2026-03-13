package defpackage;

import com.google.firebase.perf.util.Timer;
/* renamed from: Zi  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0791Zi implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ C0874aj c;
    public final /* synthetic */ Timer d;

    public /* synthetic */ RunnableC0791Zi(C0874aj c0874aj, Timer timer, int i) {
        this.b = i;
        this.c = c0874aj;
        this.d = timer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                C0874aj c0874aj = this.c;
                C1050cj b = c0874aj.b(this.d);
                if (b != null) {
                    c0874aj.a.add(b);
                    return;
                }
                return;
            default:
                C0874aj c0874aj2 = this.c;
                C1050cj b2 = c0874aj2.b(this.d);
                if (b2 != null) {
                    c0874aj2.a.add(b2);
                    return;
                }
                return;
        }
    }
}
