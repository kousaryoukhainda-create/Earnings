package com.applovin.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public final class nc {
    public static final c d = a(false, -9223372036854775807L);
    public static final c e = a(true, -9223372036854775807L);
    public static final c f = new c(2, -9223372036854775807L);
    public static final c g = new c(3, -9223372036854775807L);
    private final ExecutorService a;
    private d b;
    private IOException c;

    /* loaded from: classes.dex */
    public interface b {
        c a(e eVar, long j, long j2, IOException iOException, int i);

        void a(e eVar, long j, long j2);

        void a(e eVar, long j, long j2, boolean z);
    }

    /* loaded from: classes.dex */
    public static final class c {
        private final int a;
        private final long b;

        private c(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public boolean a() {
            int i = this.a;
            return i == 0 || i == 1;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a();

        void b();
    }

    /* loaded from: classes.dex */
    public interface f {
        void d();
    }

    /* loaded from: classes.dex */
    public static final class g implements Runnable {
        private final f a;

        public g(f fVar) {
            this.a = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.d();
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends IOException {
        public h(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public nc(String str) {
        this.a = xp.e("ExoPlayer:Loader:" + str);
    }

    public boolean c() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    public boolean d() {
        if (this.b != null) {
            return true;
        }
        return false;
    }

    public void b() {
        this.c = null;
    }

    public void a() {
        ((d) b1.b(this.b)).a(false);
    }

    public void a(int i) {
        IOException iOException = this.c;
        if (iOException == null) {
            d dVar = this.b;
            if (dVar != null) {
                if (i == Integer.MIN_VALUE) {
                    i = dVar.a;
                }
                dVar.a(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    public void a(f fVar) {
        d dVar = this.b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.a.execute(new g(fVar));
        }
        this.a.shutdown();
    }

    public long a(e eVar, b bVar, int i) {
        this.c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new d((Looper) b1.b(Looper.myLooper()), eVar, bVar, i, elapsedRealtime).a(0L);
        return elapsedRealtime;
    }

    /* loaded from: classes.dex */
    public final class d extends Handler implements Runnable {
        public final int a;
        private final e b;
        private final long c;
        private b d;
        private IOException f;
        private int g;
        private Thread h;
        private boolean i;
        private volatile boolean j;

        public d(Looper looper, e eVar, b bVar, int i, long j) {
            super(looper);
            this.b = eVar;
            this.d = bVar;
            this.a = i;
            this.c = j;
        }

        private void b() {
            nc.this.b = null;
        }

        private long c() {
            return Math.min((this.g - 1) * 1000, 5000);
        }

        public void a(boolean z) {
            this.j = z;
            this.f = null;
            if (hasMessages(0)) {
                this.i = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    try {
                        this.i = true;
                        this.b.b();
                        Thread thread = this.h;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            if (z) {
                b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                ((b) b1.a(this.d)).a(this.b, elapsedRealtime, elapsedRealtime - this.c, true);
                this.d = null;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            long c;
            if (this.j) {
                return;
            }
            int i = message.what;
            if (i == 0) {
                a();
            } else if (i != 3) {
                b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = elapsedRealtime - this.c;
                b bVar = (b) b1.a(this.d);
                if (this.i) {
                    bVar.a(this.b, elapsedRealtime, j, false);
                    return;
                }
                int i2 = message.what;
                if (i2 != 1) {
                    if (i2 == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.f = iOException;
                        int i3 = this.g + 1;
                        this.g = i3;
                        c a = bVar.a(this.b, elapsedRealtime, j, iOException, i3);
                        if (a.a == 3) {
                            nc.this.c = this.f;
                            return;
                        } else if (a.a != 2) {
                            if (a.a == 1) {
                                this.g = 1;
                            }
                            if (a.b != -9223372036854775807L) {
                                c = a.b;
                            } else {
                                c = c();
                            }
                            a(c);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                try {
                    bVar.a(this.b, elapsedRealtime, j);
                } catch (RuntimeException e) {
                    oc.a("LoadTask", "Unexpected exception handling load completed", e);
                    nc.this.c = new h(e);
                }
            } else {
                throw ((Error) message.obj);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = this.i;
                    this.h = Thread.currentThread();
                }
                if (!z) {
                    ko.a("load:".concat(this.b.getClass().getSimpleName()));
                    try {
                        this.b.a();
                        ko.a();
                    } catch (Throwable th) {
                        ko.a();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.h = null;
                    Thread.interrupted();
                }
                if (!this.j) {
                    sendEmptyMessage(1);
                }
            } catch (IOException e) {
                if (!this.j) {
                    obtainMessage(2, e).sendToTarget();
                }
            } catch (Exception e2) {
                if (!this.j) {
                    oc.a("LoadTask", "Unexpected exception loading stream", e2);
                    obtainMessage(2, new h(e2)).sendToTarget();
                }
            } catch (OutOfMemoryError e3) {
                if (!this.j) {
                    oc.a("LoadTask", "OutOfMemory error loading stream", e3);
                    obtainMessage(2, new h(e3)).sendToTarget();
                }
            } catch (Error e4) {
                if (!this.j) {
                    oc.a("LoadTask", "Unexpected error loading stream", e4);
                    obtainMessage(3, e4).sendToTarget();
                }
                throw e4;
            }
        }

        private void a() {
            this.f = null;
            nc.this.a.execute((Runnable) b1.a(nc.this.b));
        }

        public void a(int i) {
            IOException iOException = this.f;
            if (iOException != null && this.g > i) {
                throw iOException;
            }
        }

        public void a(long j) {
            b1.b(nc.this.b == null);
            nc.this.b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                a();
            }
        }
    }

    public static c a(boolean z, long j) {
        return new c(z ? 1 : 0, j);
    }
}
