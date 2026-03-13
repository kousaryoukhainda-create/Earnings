package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
/* renamed from: ty  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2803ty implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ View$OnTouchListenerC2465q1 c;

    public /* synthetic */ RunnableC2803ty(View$OnTouchListenerC2465q1 view$OnTouchListenerC2465q1, int i) {
        this.b = i;
        this.c = view$OnTouchListenerC2465q1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ViewParent parent = this.c.f.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                View$OnTouchListenerC2465q1 view$OnTouchListenerC2465q1 = this.c;
                view$OnTouchListenerC2465q1.a();
                View view = view$OnTouchListenerC2465q1.f;
                if (view.isEnabled() && !view.isLongClickable() && view$OnTouchListenerC2465q1.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    view$OnTouchListenerC2465q1.i = true;
                    return;
                }
                return;
        }
    }
}
