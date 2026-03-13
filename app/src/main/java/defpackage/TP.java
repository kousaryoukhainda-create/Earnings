package defpackage;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: TP  reason: default package */
/* loaded from: classes.dex */
public final class TP {
    public final Runnable a;
    public final W4 b = new W4();
    public LP c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public TP(Runnable runnable) {
        OnBackInvokedCallback a;
        this.a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                a = QP.a.a(new MP(this, 0), new MP(this, 1), new NP(this, 0), new NP(this, 1));
            } else {
                a = OP.a.a(new NP(this, 2));
            }
            this.d = a;
        }
    }

    public final void a(HG owner, LP onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        CG lifecycle = owner.getLifecycle();
        if (((JG) lifecycle).c == BG.b) {
            return;
        }
        onBackPressedCallback.addCancellable(new RP(this, lifecycle, onBackPressedCallback));
        d();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new C0714Wj(0, this, TP.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void b() {
        ?? r2;
        LP lp = this.c;
        if (lp == null) {
            W4 w4 = this.b;
            w4.getClass();
            ListIterator listIterator = w4.listIterator(w4.d);
            while (true) {
                if (listIterator.hasPrevious()) {
                    r2 = listIterator.previous();
                    if (((LP) r2).isEnabled()) {
                        break;
                    }
                } else {
                    r2 = 0;
                    break;
                }
            }
            lp = r2;
        }
        this.c = null;
        if (lp != null) {
            lp.handleOnBackPressed();
        } else {
            this.a.run();
        }
    }

    public final void c(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        OnBackInvokedCallback onBackInvokedCallback = this.d;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            OP op = OP.a;
            if (z && !this.f) {
                op.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f = true;
            } else if (!z && this.f) {
                op.c(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f = false;
            }
        }
    }

    public final void d() {
        boolean z = this.g;
        W4 w4 = this.b;
        boolean z2 = false;
        if (!(w4 instanceof Collection) || !w4.isEmpty()) {
            Iterator<E> it = w4.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((LP) it.next()).isEnabled()) {
                    z2 = true;
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 != z && Build.VERSION.SDK_INT >= 33) {
            c(z2);
        }
    }
}
