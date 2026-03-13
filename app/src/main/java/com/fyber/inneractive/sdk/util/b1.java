package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class b1 {
    public final TimeUnit a;
    public final long b;
    public Handler c;
    public boolean d;
    public b e;
    public long f;

    /* loaded from: classes.dex */
    public static class a extends Handler {
        public final WeakReference<b1> a;

        public a(b1 b1Var) {
            super(Looper.getMainLooper());
            this.a = new WeakReference<>(b1Var);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            b1 b1Var = this.a.get();
            if (b1Var != null && message.what == 1932593528 && !b1Var.d) {
                b1Var.a(message.getWhen());
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(b1 b1Var);
    }

    public b1(TimeUnit timeUnit, long j) {
        this.d = false;
        this.f = 0L;
        this.b = j;
        this.a = timeUnit;
        IAlog.a("Visible time counter init - time %d", Long.valueOf(j));
    }

    public void a() {
        this.d = true;
        Handler handler = this.c;
        if (handler != null) {
            handler.removeMessages(1932593528);
        }
    }

    public void b() {
        this.d = false;
        a(SystemClock.uptimeMillis());
    }

    public void c() {
        a aVar = new a(this);
        this.c = aVar;
        this.d = false;
        aVar.sendEmptyMessage(1932593528);
    }

    public final void a(long j) {
        long uptimeMillis = (SystemClock.uptimeMillis() - j) + 50 + this.f;
        this.f = uptimeMillis;
        if (this.e != null && uptimeMillis > this.a.toMillis(this.b)) {
            this.e.a(this);
            return;
        }
        Handler handler = this.c;
        if (handler == null || this.e == null) {
            return;
        }
        handler.removeMessages(1932593528);
        this.c.sendEmptyMessageDelayed(1932593528, 50L);
    }

    public b1(TimeUnit timeUnit, long j, long j2) {
        this.d = false;
        this.b = j;
        this.a = timeUnit;
        this.f = j2;
        IAlog.a("Visible time counter init - time %d", Long.valueOf(j));
    }
}
