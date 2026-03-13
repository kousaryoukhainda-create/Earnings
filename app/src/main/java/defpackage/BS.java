package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: BS  reason: default package */
/* loaded from: classes.dex */
public final class BS implements ViewTreeObserver.OnPreDrawListener {
    public final Handler b = new Handler(Looper.getMainLooper());
    public final AtomicReference c;
    public final G4 d;
    public final G4 f;

    public BS(View view, G4 g4, G4 g42) {
        this.c = new AtomicReference(view);
        this.d = g4;
        this.f = g42;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = (View) this.c.getAndSet(null);
        if (view == null) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        Handler handler = this.b;
        handler.post(this.d);
        handler.postAtFrontOfQueue(this.f);
        return true;
    }
}
