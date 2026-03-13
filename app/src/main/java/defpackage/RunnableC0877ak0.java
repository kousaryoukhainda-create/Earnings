package defpackage;

import com.applovin.impl.sdk.q;
import com.applovin.impl.t9;
import com.applovin.impl.u9;
/* renamed from: ak0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0877ak0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object f;

    public /* synthetic */ RunnableC0877ak0(Object obj, boolean z, long j, int i) {
        this.b = i;
        this.f = obj;
        this.c = z;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                q.b((q) this.f, this.c, this.d);
                return;
            case 1:
                t9.D((t9) this.f, this.c, this.d);
                return;
            default:
                u9.D((u9) this.f, this.c, this.d);
                return;
        }
    }
}
