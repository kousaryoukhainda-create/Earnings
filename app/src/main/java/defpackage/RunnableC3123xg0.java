package defpackage;

import com.applovin.impl.sdk.d;
/* renamed from: xg0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC3123xg0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ d c;

    public /* synthetic */ RunnableC3123xg0(d dVar, int i) {
        this.b = i;
        this.c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                d.c(this.c);
                return;
            default:
                d.a(this.c);
                return;
        }
    }
}
