package com.fyber.inneractive.sdk.player.controller;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.player.mediaplayer.a;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public abstract class g implements a.k {
    public final Context a;
    public InterfaceC0081g d;
    public d f;
    public boolean g;
    public final Handler i;
    public TextureView j;
    public SurfaceTexture k;
    public Surface l;
    public TextureView.SurfaceTextureListener m;
    public boolean o;
    public com.fyber.inneractive.sdk.player.enums.b e = com.fyber.inneractive.sdk.player.enums.b.Idle;
    public boolean n = false;
    public final List<f> b = new CopyOnWriteArrayList();
    public final List<e> c = new CopyOnWriteArrayList();
    public com.fyber.inneractive.sdk.player.d h = new com.fyber.inneractive.sdk.player.d(this);

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ Exception a;

        public a(Exception exc) {
            this.a = exc;
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            if (gVar.g) {
                return;
            }
            try {
                for (f fVar : gVar.b) {
                    fVar.a(this.a);
                }
            } catch (Exception e) {
                if (IAlog.a <= 3) {
                    g gVar2 = g.this;
                    gVar2.getClass();
                    IAlog.a("%sonPlayerError callback threw an exception!", e, IAlog.a(gVar2));
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ int a;

        public b(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                for (e eVar : g.this.c) {
                    eVar.a(this.a);
                }
            } catch (Exception e) {
                if (IAlog.a <= 3) {
                    g gVar = g.this;
                    gVar.getClass();
                    IAlog.a("%sonPlayerProgress callback threw an exception!", e, IAlog.a(gVar));
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final /* synthetic */ com.fyber.inneractive.sdk.player.enums.b a;

        public c(com.fyber.inneractive.sdk.player.enums.b bVar) {
            this.a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextureView textureView;
            g gVar;
            TextureView textureView2;
            com.fyber.inneractive.sdk.player.enums.b bVar;
            TextureView textureView3;
            try {
                try {
                    for (f fVar : g.this.b) {
                        fVar.a(this.a);
                    }
                    bVar = this.a;
                } catch (Exception e) {
                    if (IAlog.a <= 3) {
                        g gVar2 = g.this;
                        gVar2.getClass();
                        IAlog.a("%sonPlayerStateChanged callback threw an exception!", e, IAlog.a(gVar2));
                    }
                    com.fyber.inneractive.sdk.player.enums.b bVar2 = this.a;
                    if (bVar2 == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar2 == com.fyber.inneractive.sdk.player.enums.b.Error || bVar2 == com.fyber.inneractive.sdk.player.enums.b.Completed) {
                        g gVar3 = g.this;
                        if (gVar3.k != null && (textureView2 = gVar3.j) != null && textureView2.getParent() != null) {
                            ((ViewGroup) g.this.j.getParent()).removeView(g.this.j);
                        }
                        gVar = g.this;
                        gVar.j = null;
                    } else {
                        return;
                    }
                }
                if (bVar == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar == com.fyber.inneractive.sdk.player.enums.b.Error || bVar == com.fyber.inneractive.sdk.player.enums.b.Completed) {
                    g gVar4 = g.this;
                    if (gVar4.k != null && (textureView3 = gVar4.j) != null && textureView3.getParent() != null) {
                        ((ViewGroup) g.this.j.getParent()).removeView(g.this.j);
                    }
                    gVar = g.this;
                    gVar.j = null;
                    gVar.k = null;
                }
            } catch (Throwable th) {
                com.fyber.inneractive.sdk.player.enums.b bVar3 = this.a;
                if (bVar3 == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar3 == com.fyber.inneractive.sdk.player.enums.b.Error || bVar3 == com.fyber.inneractive.sdk.player.enums.b.Completed) {
                    g gVar5 = g.this;
                    if (gVar5.k != null && (textureView = gVar5.j) != null && textureView.getParent() != null) {
                        ((ViewGroup) g.this.j.getParent()).removeView(g.this.j);
                    }
                    g gVar6 = g.this;
                    gVar6.j = null;
                    gVar6.k = null;
                }
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(int i);
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(com.fyber.inneractive.sdk.player.enums.b bVar);

        void a(Exception exc);

        void e(boolean z);

        void g();
    }

    /* renamed from: com.fyber.inneractive.sdk.player.controller.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0081g {
    }

    public g(Context context) {
        this.a = context.getApplicationContext();
        this.i = new Handler(context.getMainLooper());
        a(true);
    }

    public abstract void a(int i, boolean z);

    public abstract void a(Surface surface);

    public abstract void a(String str, int i);

    public abstract void a(boolean z);

    public abstract boolean a();

    @SuppressLint({"NewApi"})
    public void b() {
        IAlog.a("%sdestroy started", IAlog.a(this));
        m();
        this.h = null;
        this.i.removeCallbacksAndMessages(null);
        this.b.clear();
        this.f = null;
        this.g = true;
        IAlog.a("%sdestroy finished", IAlog.a(this));
    }

    public abstract void b(boolean z);

    public abstract int c();

    public final void c(boolean z) {
        com.fyber.inneractive.sdk.measurement.d dVar;
        d dVar2 = this.f;
        if (dVar2 == null || (dVar = com.fyber.inneractive.sdk.player.c.this.h) == null) {
            return;
        }
        if (z) {
            if (dVar.c != null) {
                IAlog.a("%s mute", "OMVideo");
                try {
                    dVar.c.volumeChange(0.0f);
                } catch (Throwable th) {
                    dVar.a(th);
                }
            }
        } else if (dVar.c != null) {
            IAlog.a("%s unMute", "OMVideo");
            try {
                dVar.c.volumeChange(1.0f);
            } catch (Throwable th2) {
                dVar.a(th2);
            }
        }
    }

    public abstract int d();

    public abstract void d(boolean z);

    public abstract Bitmap e();

    public abstract String f();

    public abstract int g();

    public abstract int h();

    public abstract boolean i();

    public boolean j() {
        if (this.e == com.fyber.inneractive.sdk.player.enums.b.Playing) {
            return true;
        }
        return false;
    }

    public abstract void k();

    public abstract void l();

    public void m() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        com.fyber.inneractive.sdk.player.d dVar = this.h;
        if (dVar != null && (scheduledThreadPoolExecutor = dVar.b) != null) {
            scheduledThreadPoolExecutor.shutdownNow();
            dVar.b = null;
        }
    }

    public void a(Exception exc) {
        a(com.fyber.inneractive.sdk.player.enums.b.Error);
        IAlog.a("%sonPlayerError called with: %s for onPlayerError", IAlog.a(this), exc);
        this.i.post(new a(exc));
        m();
    }

    public void a(int i) {
        this.i.post(new b(i));
    }

    public void a(com.fyber.inneractive.sdk.player.enums.b bVar) {
        if (bVar == this.e) {
            return;
        }
        this.e = bVar;
        if (bVar == com.fyber.inneractive.sdk.player.enums.b.Playing) {
            com.fyber.inneractive.sdk.player.d dVar = this.h;
            if (dVar != null && dVar.b == null) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
                dVar.b = scheduledThreadPoolExecutor;
                scheduledThreadPoolExecutor.scheduleAtFixedRate(dVar.c, 100, 1000, TimeUnit.MILLISECONDS);
            }
        } else if (bVar == com.fyber.inneractive.sdk.player.enums.b.Paused || bVar == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar == com.fyber.inneractive.sdk.player.enums.b.Completed) {
            m();
        }
        this.i.post(new c(bVar));
    }
}
