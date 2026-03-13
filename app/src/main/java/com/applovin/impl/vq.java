package com.applovin.impl;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
/* loaded from: classes.dex */
public final class vq {
    private final q8 a = new q8();
    private final b b;
    private final e c;
    private boolean d;
    private Surface e;
    private float f;
    private float g;
    private float h;
    private float i;
    private int j;
    private long k;
    private long l;
    private long m;
    private long n;
    private long o;
    private long p;
    private long q;

    /* loaded from: classes.dex */
    public static final class a {
        public static void a(Surface surface, float f) {
            int i;
            if (f == 0.0f) {
                i = 0;
            } else {
                i = 1;
            }
            try {
                surface.setFrameRate(f, i);
            } catch (IllegalStateException e) {
                oc.a("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {

        /* loaded from: classes.dex */
        public interface a {
            void a(Display display);
        }

        void a();

        void a(a aVar);
    }

    /* loaded from: classes.dex */
    public static final class c implements b {
        private final WindowManager a;

        private c(WindowManager windowManager) {
            this.a = windowManager;
        }

        @Override // com.applovin.impl.vq.b
        public void a() {
        }

        public static b a(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new c(windowManager);
            }
            return null;
        }

        @Override // com.applovin.impl.vq.b
        public void a(b.a aVar) {
            aVar.a(this.a.getDefaultDisplay());
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements Choreographer.FrameCallback, Handler.Callback {
        private static final e g = new e();
        public volatile long a = -9223372036854775807L;
        private final Handler b;
        private final HandlerThread c;
        private Choreographer d;
        private int f;

        private e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.c = handlerThread;
            handlerThread.start();
            Handler a = xp.a(handlerThread.getLooper(), (Handler.Callback) this);
            this.b = a;
            a.sendEmptyMessage(0);
        }

        private void b() {
            int i = this.f + 1;
            this.f = i;
            if (i == 1) {
                ((Choreographer) b1.a(this.d)).postFrameCallback(this);
            }
        }

        private void c() {
            this.d = Choreographer.getInstance();
        }

        public static e d() {
            return g;
        }

        private void f() {
            int i = this.f - 1;
            this.f = i;
            if (i == 0) {
                ((Choreographer) b1.a(this.d)).removeFrameCallback(this);
                this.a = -9223372036854775807L;
            }
        }

        public void a() {
            this.b.sendEmptyMessage(1);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            this.a = j;
            ((Choreographer) b1.a(this.d)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return false;
                    }
                    f();
                    return true;
                }
                b();
                return true;
            }
            c();
            return true;
        }
    }

    public vq(Context context) {
        e eVar;
        b a2 = a(context);
        this.b = a2;
        if (a2 != null) {
            eVar = e.d();
        } else {
            eVar = null;
        }
        this.c = eVar;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public static /* synthetic */ void a(vq vqVar, Display display) {
        vqVar.a(display);
    }

    private void g() {
        this.m = 0L;
        this.p = -1L;
        this.n = -1L;
    }

    private void h() {
        float f;
        float f2;
        if (xp.a >= 30 && this.e != null) {
            if (this.a.e()) {
                f = this.a.b();
            } else {
                f = this.f;
            }
            float f3 = this.g;
            if (f == f3) {
                return;
            }
            int i = (f > (-1.0f) ? 1 : (f == (-1.0f) ? 0 : -1));
            if (i != 0 && f3 != -1.0f) {
                if (this.a.e() && this.a.d() >= 5000000000L) {
                    f2 = 0.02f;
                } else {
                    f2 = 1.0f;
                }
                if (Math.abs(f - this.g) < f2) {
                    return;
                }
            } else if (i == 0 && this.a.c() < 30) {
                return;
            }
            this.g = f;
            a(false);
        }
    }

    public void b() {
        b bVar = this.b;
        if (bVar != null) {
            bVar.a();
            ((e) b1.a(this.c)).e();
        }
    }

    public void c() {
        if (this.b != null) {
            ((e) b1.a(this.c)).a();
            this.b.a(new C1055cl0(this));
        }
    }

    public void d() {
        g();
    }

    public void e() {
        this.d = true;
        g();
        a(false);
    }

    public void f() {
        this.d = false;
        a();
    }

    /* loaded from: classes.dex */
    public static final class d implements b, DisplayManager.DisplayListener {
        private final DisplayManager a;
        private b.a b;

        private d(DisplayManager displayManager) {
            this.a = displayManager;
        }

        public static b a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        private Display b() {
            return this.a.getDisplay(0);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            b.a aVar = this.b;
            if (aVar != null && i == 0) {
                aVar.a(b());
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }

        @Override // com.applovin.impl.vq.b
        public void a(b.a aVar) {
            this.b = aVar;
            this.a.registerDisplayListener(this, xp.a());
            aVar.a(b());
        }

        @Override // com.applovin.impl.vq.b
        public void a() {
            this.a.unregisterDisplayListener(this);
            this.b = null;
        }
    }

    public long a(long j) {
        long j2;
        e eVar;
        if (this.p != -1 && this.a.e()) {
            long a2 = this.q + (((float) ((this.m - this.p) * this.a.a())) / this.i);
            if (!a(j, a2)) {
                g();
            } else {
                j2 = a2;
                this.n = this.m;
                this.o = j2;
                eVar = this.c;
                if (eVar != null || this.k == -9223372036854775807L) {
                    return j2;
                }
                long j3 = eVar.a;
                return j3 == -9223372036854775807L ? j2 : a(j2, j3, this.k) - this.l;
            }
        }
        j2 = j;
        this.n = this.m;
        this.o = j2;
        eVar = this.c;
        if (eVar != null) {
        }
        return j2;
    }

    public void b(long j) {
        long j2 = this.n;
        if (j2 != -1) {
            this.p = j2;
            this.q = this.o;
        }
        this.m++;
        this.a.a(j * 1000);
        h();
    }

    public void b(float f) {
        this.i = f;
        g();
        a(false);
    }

    private static boolean a(long j, long j2) {
        return Math.abs(j - j2) <= 20000000;
    }

    private static long a(long j, long j2, long j3) {
        long j4;
        long j5 = (((j - j2) / j3) * j3) + j2;
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            j4 = j5;
            j5 = j3 + j5;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    private static b a(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            b a2 = xp.a >= 17 ? d.a(applicationContext) : null;
            return a2 == null ? c.a(applicationContext) : a2;
        }
        return null;
    }

    public void a(float f) {
        this.f = f;
        this.a.f();
        h();
    }

    public void a(Surface surface) {
        if (surface instanceof g7) {
            surface = null;
        }
        if (this.e == surface) {
            return;
        }
        a();
        this.e = surface;
        a(true);
    }

    public void a(int i) {
        if (this.j == i) {
            return;
        }
        this.j = i;
        a(true);
    }

    public void a(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.k = refreshRate;
            this.l = (refreshRate * 80) / 100;
            return;
        }
        oc.d("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
    }

    private void a(boolean z) {
        Surface surface;
        float f;
        if (xp.a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE) {
            return;
        }
        if (this.d) {
            float f2 = this.g;
            if (f2 != -1.0f) {
                f = f2 * this.i;
                if (z && this.h == f) {
                    return;
                }
                this.h = f;
                a.a(surface, f);
            }
        }
        f = 0.0f;
        if (z) {
        }
        this.h = f;
        a.a(surface, f);
    }

    private void a() {
        Surface surface;
        if (xp.a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == 0.0f) {
            return;
        }
        this.h = 0.0f;
        a.a(surface, 0.0f);
    }
}
