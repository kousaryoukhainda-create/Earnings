package com.fyber.inneractive.sdk.flow;

import android.os.Handler;
import com.fyber.inneractive.sdk.interfaces.a;
import com.fyber.inneractive.sdk.util.IAlog;
/* loaded from: classes.dex */
public class b {
    public Handler a;
    public final a.b b;
    public final Runnable c = new a();
    public final Runnable d = new RunnableC0069b();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IAlog.a("%s : ContentLoadTimeoutHandler Executing timeout task", IAlog.a(b.this));
            b.this.b.b();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.flow.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0069b implements Runnable {
        public RunnableC0069b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.fyber.inneractive.sdk.util.q.b.post(b.this.c);
        }
    }

    public b(a.b bVar) {
        this.b = bVar;
    }

    public void a() {
        IAlog.a("%s : ContentLoadTimeoutHandler destroying timeout handler", IAlog.a(this));
        if (this.a != null) {
            b();
            this.a.getLooper().quitSafely();
            this.a = null;
        }
    }

    public void b() {
        IAlog.a("%s : ContentLoadTimeoutHandler stopping timeout handler", IAlog.a(this));
        Handler handler = this.a;
        if (handler != null) {
            handler.removeCallbacks(this.d);
        }
    }
}
