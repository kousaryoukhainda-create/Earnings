package defpackage;

import com.applovin.impl.q1;
/* renamed from: dk0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1215dk0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ q1.a c;
    public final /* synthetic */ Exception d;

    public /* synthetic */ RunnableC1215dk0(q1.a aVar, Exception exc, int i) {
        this.b = i;
        this.c = aVar;
        this.d = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                q1.a.f(this.c, this.d);
                return;
            default:
                q1.a.i(this.c, this.d);
                return;
        }
    }
}
