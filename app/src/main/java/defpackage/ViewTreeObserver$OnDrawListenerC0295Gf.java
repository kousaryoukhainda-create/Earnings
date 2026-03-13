package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
/* renamed from: Gf  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserver$OnDrawListenerC0295Gf implements InterfaceExecutorC0269Ff, ViewTreeObserver.OnDrawListener, Runnable {
    public Runnable c;
    public final /* synthetic */ AbstractActivityC0347If f;
    public final long b = SystemClock.uptimeMillis() + 10000;
    public boolean d = false;

    public ViewTreeObserver$OnDrawListenerC0295Gf(AbstractActivityC0347If abstractActivityC0347If) {
        this.f = abstractActivityC0347If;
    }

    @Override // defpackage.InterfaceExecutorC0269Ff
    public final void c(View view) {
        if (!this.d) {
            this.d = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.c = runnable;
        View decorView = this.f.getWindow().getDecorView();
        if (this.d) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
                return;
            } else {
                decorView.postInvalidate();
                return;
            }
        }
        decorView.postOnAnimation(new RunnableC1495h2(this, 9));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.c;
        if (runnable != null) {
            runnable.run();
            this.c = null;
            C0237Dz c0237Dz = this.f.mFullyDrawnReporter;
            synchronized (c0237Dz.a) {
                z = c0237Dz.b;
            }
            if (z) {
                this.d = false;
                this.f.getWindow().getDecorView().post(this);
            }
        } else if (SystemClock.uptimeMillis() > this.b) {
            this.d = false;
            this.f.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
