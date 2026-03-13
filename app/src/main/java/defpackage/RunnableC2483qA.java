package defpackage;

import com.google.firebase.perf.session.gauges.GaugeManager;
/* renamed from: qA  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2483qA implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ GaugeManager c;
    public final /* synthetic */ String d;
    public final /* synthetic */ R4 f;

    public /* synthetic */ RunnableC2483qA(GaugeManager gaugeManager, String str, R4 r4, int i) {
        this.b = i;
        this.c = gaugeManager;
        this.d = str;
        this.f = r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                GaugeManager.d(this.c, this.d, this.f);
                return;
            default:
                GaugeManager.a(this.c, this.d, this.f);
                return;
        }
    }
}
