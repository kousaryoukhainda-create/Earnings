package defpackage;

import java.util.concurrent.Executor;
/* renamed from: bg0  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0960bg0 {
    public final Executor b;
    public Object d;
    public final /* synthetic */ int a = 2;
    public final Object c = new Object();

    public C0960bg0(ExecutorC0149Ap executorC0149Ap, InterfaceC0846aQ interfaceC0846aQ) {
        this.d = interfaceC0846aQ;
        this.b = executorC0149Ap;
    }

    private final void b() {
        synchronized (this.c) {
            this.d = null;
        }
    }

    private final void c() {
        synchronized (this.c) {
            this.d = null;
        }
    }

    private final void d() {
        synchronized (this.c) {
            this.d = null;
        }
    }

    public final void a() {
        switch (this.a) {
            case 0:
                b();
                return;
            case 1:
                c();
                return;
            case 2:
                d();
                return;
            default:
                synchronized (this.c) {
                    this.d = null;
                }
                return;
        }
    }

    public final void e(C2869ui0 c2869ui0) {
        switch (this.a) {
            case 0:
                if (c2869ui0.h) {
                    this.b.execute(new DH(this, 28));
                    return;
                }
                return;
            case 1:
                this.b.execute(new RunnableC1881jA(this, false, c2869ui0, 24));
                return;
            case 2:
                if (!c2869ui0.isSuccessful() && !c2869ui0.h) {
                    ((ExecutorC0149Ap) this.b).execute(new RunnableC1881jA(this, false, c2869ui0, 25));
                    return;
                }
                return;
            default:
                if (c2869ui0.isSuccessful() && !c2869ui0.h) {
                    this.b.execute(new RunnableC1881jA(this, false, c2869ui0, 26));
                    return;
                }
                return;
        }
    }

    public C0960bg0(Executor executor, VP vp) {
        this.d = vp;
        this.b = executor;
    }

    public C0960bg0(Executor executor, WP wp) {
        this.d = wp;
        this.b = executor;
    }

    public C0960bg0(Executor executor, InterfaceC1613iQ interfaceC1613iQ) {
        this.d = interfaceC1613iQ;
        this.b = executor;
    }
}
