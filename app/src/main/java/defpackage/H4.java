package defpackage;

import android.view.ViewTreeObserver;
import com.google.firebase.perf.metrics.AppStartTrace;
/* renamed from: H4  reason: default package */
/* loaded from: classes.dex */
public final class H4 implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ AppStartTrace b;

    public H4(AppStartTrace appStartTrace) {
        this.b = appStartTrace;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        this.b.u++;
    }
}
