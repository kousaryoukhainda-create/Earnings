package defpackage;

import com.applovin.impl.q1;
import com.applovin.impl.wq;
/* renamed from: ek0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1300ek0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;

    public /* synthetic */ RunnableC1300ek0(Object obj, String str, long j, long j2, int i) {
        this.b = i;
        this.g = obj;
        this.c = str;
        this.d = j;
        this.f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((q1.a) this.g).b(this.c, this.d, this.f);
                return;
            default:
                wq.a.j((wq.a) this.g, this.c, this.d, this.f);
                return;
        }
    }
}
