package defpackage;

import com.applovin.impl.qr;
/* renamed from: kk0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2014kk0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ qr c;

    public /* synthetic */ RunnableC2014kk0(qr qrVar, int i) {
        this.b = i;
        this.c = qrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                qr.b(this.c);
                return;
            default:
                qr.f(this.c);
                return;
        }
    }
}
