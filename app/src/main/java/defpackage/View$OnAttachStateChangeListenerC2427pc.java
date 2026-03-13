package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.reflect.Field;
/* renamed from: pc  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnAttachStateChangeListenerC2427pc implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ View$OnAttachStateChangeListenerC2427pc(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object obj = this.c;
        switch (this.b) {
            case 0:
                return;
            case 1:
                view.getViewTreeObserver().addOnDrawListener((ViewTreeObserver$OnDrawListenerC0286Fw) obj);
                view.removeOnAttachStateChangeListener(this);
                return;
            case 2:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                Field field = Sb0.a;
                Fb0.c(view2);
                return;
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.b) {
            case 0:
                View$OnKeyListenerC2684sc view$OnKeyListenerC2684sc = (View$OnKeyListenerC2684sc) this.c;
                ViewTreeObserver viewTreeObserver = view$OnKeyListenerC2684sc.z;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        view$OnKeyListenerC2684sc.z = view.getViewTreeObserver();
                    }
                    view$OnKeyListenerC2684sc.z.removeGlobalOnLayoutListener(view$OnKeyListenerC2684sc.k);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 1:
                view.removeOnAttachStateChangeListener(this);
                return;
            case 2:
                return;
            default:
                Y30 y30 = (Y30) this.c;
                ViewTreeObserver viewTreeObserver2 = y30.q;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        y30.q = view.getViewTreeObserver();
                    }
                    y30.q.removeGlobalOnLayoutListener(y30.k);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
