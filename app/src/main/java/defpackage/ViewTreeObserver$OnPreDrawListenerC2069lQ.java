package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* renamed from: lQ  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnPreDrawListenerC2069lQ implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View b;
    public ViewTreeObserver c;
    public final Runnable d;

    public ViewTreeObserver$OnPreDrawListenerC2069lQ(View view, Runnable runnable) {
        this.b = view;
        this.c = view.getViewTreeObserver();
        this.d = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view != null) {
            ViewTreeObserver$OnPreDrawListenerC2069lQ viewTreeObserver$OnPreDrawListenerC2069lQ = new ViewTreeObserver$OnPreDrawListenerC2069lQ(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC2069lQ);
            view.addOnAttachStateChangeListener(viewTreeObserver$OnPreDrawListenerC2069lQ);
            return;
        }
        throw new NullPointerException("view == null");
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.c.isAlive();
        View view = this.b;
        if (isAlive) {
            this.c.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.c.isAlive();
        View view2 = this.b;
        if (isAlive) {
            this.c.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
