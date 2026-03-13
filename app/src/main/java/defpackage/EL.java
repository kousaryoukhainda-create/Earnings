package defpackage;

import com.google.firebase.perf.util.Timer;
/* renamed from: EL  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class EL implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ FL c;
    public final /* synthetic */ Timer d;

    public /* synthetic */ EL(FL fl, Timer timer, int i) {
        this.b = i;
        this.c = fl;
        this.d = timer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                FL fl = this.c;
                C0907b3 c = fl.c(this.d);
                if (c != null) {
                    fl.b.add(c);
                    return;
                }
                return;
            default:
                FL fl2 = this.c;
                C0907b3 c2 = fl2.c(this.d);
                if (c2 != null) {
                    fl2.b.add(c2);
                    return;
                }
                return;
        }
    }
}
