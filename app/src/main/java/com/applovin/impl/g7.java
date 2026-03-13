package com.applovin.impl;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
/* loaded from: classes.dex */
public final class g7 extends Surface {
    private static int d;
    private static boolean f;
    public final boolean a;
    private final b b;
    private boolean c;

    private g7(b bVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.b = bVar;
        this.a = z;
    }

    private static int a(Context context) {
        if (aa.a(context)) {
            return aa.c() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        boolean z;
        synchronized (g7.class) {
            try {
                z = true;
                if (!f) {
                    d = a(context);
                    f = true;
                }
                if (d == 0) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.b) {
            try {
                if (!this.c) {
                    this.b.a();
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static g7 a(Context context, boolean z) {
        b1.b(!z || b(context));
        return new b().a(z ? d : 0);
    }

    /* loaded from: classes.dex */
    public static class b extends HandlerThread implements Handler.Callback {
        private m7 a;
        private Handler b;
        private Error c;
        private RuntimeException d;
        private g7 f;

        public b() {
            super("ExoPlayer:DummySurface");
        }

        private void b(int i) {
            b1.a(this.a);
            this.a.a(i);
            this.f = new g7(this, this.a.c(), i != 0);
        }

        public g7 a(int i) {
            boolean z;
            start();
            Handler handler = new Handler(getLooper(), this);
            this.b = handler;
            this.a = new m7(handler);
            synchronized (this) {
                z = false;
                this.b.obtainMessage(1, i, 0).sendToTarget();
                while (this.f == null && this.d == null && this.c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.d;
            if (runtimeException == null) {
                Error error = this.c;
                if (error == null) {
                    return (g7) b1.a(this.f);
                }
                throw error;
            }
            throw runtimeException;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i != 1) {
                    if (i != 2) {
                        return true;
                    }
                    try {
                        b();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e) {
                    oc.a("DummySurface", "Failed to initialize dummy surface", e);
                    this.c = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e2) {
                    oc.a("DummySurface", "Failed to initialize dummy surface", e2);
                    this.d = e2;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }

        private void b() {
            b1.a(this.a);
            this.a.d();
        }

        public void a() {
            b1.a(this.b);
            this.b.sendEmptyMessage(2);
        }
    }
}
