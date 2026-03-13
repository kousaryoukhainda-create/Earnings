package defpackage;

import com.applovin.impl.wq;
/* renamed from: rl0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2617rl0 implements Runnable {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ wq.a c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int f;

    public /* synthetic */ RunnableC2617rl0(wq.a aVar, int i, long j) {
        this.c = aVar;
        this.f = i;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.c.b(this.f, this.d);
                return;
            default:
                this.c.a(this.d, this.f);
                return;
        }
    }

    public /* synthetic */ RunnableC2617rl0(wq.a aVar, long j, int i) {
        this.c = aVar;
        this.d = j;
        this.f = i;
    }
}
