package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: Fw  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnDrawListenerC0286Fw implements ViewTreeObserver.OnDrawListener {
    public final Handler b = new Handler(Looper.getMainLooper());
    public final AtomicReference c;
    public final G4 d;

    public ViewTreeObserver$OnDrawListenerC0286Fw(View view, G4 g4) {
        this.c = new AtomicReference(view);
        this.d = g4;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        final View view = (View) this.c.getAndSet(null);
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: Ew
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ViewTreeObserver$OnDrawListenerC0286Fw viewTreeObserver$OnDrawListenerC0286Fw = ViewTreeObserver$OnDrawListenerC0286Fw.this;
                viewTreeObserver$OnDrawListenerC0286Fw.getClass();
                view.getViewTreeObserver().removeOnDrawListener(viewTreeObserver$OnDrawListenerC0286Fw);
            }
        });
        this.b.postAtFrontOfQueue(this.d);
    }
}
