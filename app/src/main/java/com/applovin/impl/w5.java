package com.applovin.impl;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.applovin.impl.lc;
import com.applovin.impl.y6;
import com.applovin.impl.y7;
import com.applovin.impl.z6;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class w5 implements y6 {
    public final List a;
    private final y7 b;
    private final a c;
    private final b d;
    private final int e;
    private final boolean f;
    private final boolean g;
    private final HashMap h;
    private final t4 i;
    private final lc j;
    final pd k;
    final UUID l;
    final e m;
    private int n;
    private int o;
    private HandlerThread p;
    private c q;
    private y4 r;
    private y6.a s;
    private byte[] t;
    private byte[] u;
    private y7.a v;
    private y7.d w;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(w5 w5Var);

        void a(Exception exc, boolean z);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(w5 w5Var, int i);

        void b(w5 w5Var, int i);
    }

    /* loaded from: classes.dex */
    public static final class d {
        public final long a;
        public final boolean b;
        public final long c;
        public final Object d;
        public int e;

        public d(long j, boolean z, long j2, Object obj) {
            this.a = j;
            this.b = z;
            this.c = j2;
            this.d = obj;
        }
    }

    /* loaded from: classes.dex */
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i = message.what;
            if (i == 0) {
                w5.this.b(obj, obj2);
            } else if (i == 1) {
                w5.this.a(obj, obj2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends IOException {
        public f(Throwable th) {
            super(th);
        }
    }

    public w5(UUID uuid, y7 y7Var, a aVar, b bVar, List list, int i, boolean z, boolean z2, byte[] bArr, HashMap hashMap, pd pdVar, Looper looper, lc lcVar) {
        if (i == 1 || i == 3) {
            b1.a(bArr);
        }
        this.l = uuid;
        this.c = aVar;
        this.d = bVar;
        this.b = y7Var;
        this.e = i;
        this.f = z;
        this.g = z2;
        if (bArr != null) {
            this.u = bArr;
            this.a = null;
        } else {
            this.a = Collections.unmodifiableList((List) b1.a(list));
        }
        this.h = hashMap;
        this.k = pdVar;
        this.i = new t4();
        this.j = lcVar;
        this.n = 2;
        this.m = new e(looper);
    }

    private boolean g() {
        int i = this.n;
        if (i != 3 && i != 4) {
            return false;
        }
        return true;
    }

    private void h() {
        if (this.e == 0 && this.n == 4) {
            xp.a((Object) this.t);
            a(false);
        }
    }

    private boolean j() {
        if (g()) {
            return true;
        }
        try {
            byte[] d2 = this.b.d();
            this.t = d2;
            this.r = this.b.d(d2);
            this.n = 3;
            a(new J(4));
            b1.a(this.t);
            return true;
        } catch (NotProvisionedException unused) {
            this.c.a(this);
            return false;
        } catch (Exception e2) {
            a(e2, 1);
            return false;
        }
    }

    private boolean l() {
        try {
            this.b.a(this.t, this.u);
            return true;
        } catch (Exception e2) {
            a(e2, 1);
            return false;
        }
    }

    @Override // com.applovin.impl.y6
    public Map d() {
        byte[] bArr = this.t;
        if (bArr == null) {
            return null;
        }
        return this.b.b(bArr);
    }

    @Override // com.applovin.impl.y6
    public final UUID e() {
        return this.l;
    }

    @Override // com.applovin.impl.y6
    public final y4 f() {
        return this.r;
    }

    @Override // com.applovin.impl.y6
    public final y6.a getError() {
        if (this.n == 1) {
            return this.s;
        }
        return null;
    }

    public void i() {
        if (j()) {
            a(true);
        }
    }

    public void k() {
        this.w = this.b.b();
        ((c) xp.a(this.q)).a(0, b1.a(this.w), true);
    }

    @Override // com.applovin.impl.y6
    public boolean c() {
        return this.f;
    }

    private void a(q4 q4Var) {
        for (z6.a aVar : this.i.a()) {
            q4Var.accept(aVar);
        }
    }

    @Override // com.applovin.impl.y6
    public void b(z6.a aVar) {
        b1.b(this.o >= 0);
        if (aVar != null) {
            this.i.a(aVar);
        }
        int i = this.o + 1;
        this.o = i;
        if (i == 1) {
            b1.b(this.n == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.p = handlerThread;
            handlerThread.start();
            this.q = new c(this.p.getLooper());
            if (j()) {
                a(true);
            }
        } else if (aVar != null && g() && this.i.b(aVar) == 1) {
            aVar.a(this.n);
        }
        this.d.a(this, this.o);
    }

    private void a(boolean z) {
        if (this.g) {
            return;
        }
        byte[] bArr = (byte[]) xp.a((Object) this.t);
        int i = this.e;
        if (i != 0 && i != 1) {
            if (i == 2) {
                if (this.u == null || l()) {
                    a(bArr, 2, z);
                }
            } else if (i != 3) {
            } else {
                b1.a(this.u);
                b1.a(this.t);
                a(this.u, 3, z);
            }
        } else if (this.u == null) {
            a(bArr, 1, z);
        } else if (this.n == 4 || l()) {
            long a2 = a();
            if (this.e == 0 && a2 <= 60) {
                oc.a("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + a2);
                a(bArr, 2, z);
            } else if (a2 <= 0) {
                a(new yb(), 2);
            } else {
                this.n = 4;
                a(new Fk0(9));
            }
        }
    }

    @Override // com.applovin.impl.y6
    public final int b() {
        return this.n;
    }

    public void b(Exception exc, boolean z) {
        a(exc, z ? 1 : 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Object obj, Object obj2) {
        if (obj == this.w) {
            if (this.n == 2 || g()) {
                this.w = null;
                if (obj2 instanceof Exception) {
                    this.c.a((Exception) obj2, false);
                    return;
                }
                try {
                    this.b.a((byte[]) obj2);
                    this.c.a();
                } catch (Exception e2) {
                    this.c.a(e2, true);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class c extends Handler {
        private boolean a;

        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, qd qdVar) {
            IOException fVar;
            d dVar = (d) message.obj;
            if (dVar.b) {
                int i = dVar.e + 1;
                dVar.e = i;
                if (i > w5.this.j.a(3)) {
                    return false;
                }
                mc mcVar = new mc(dVar.a, qdVar.a, qdVar.b, qdVar.c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.c, qdVar.d);
                td tdVar = new td(3);
                if (qdVar.getCause() instanceof IOException) {
                    fVar = (IOException) qdVar.getCause();
                } else {
                    fVar = new f(qdVar.getCause());
                }
                long a = w5.this.j.a(new lc.a(mcVar, tdVar, fVar, dVar.e));
                if (a == -9223372036854775807L) {
                    return false;
                }
                synchronized (this) {
                    try {
                        if (this.a) {
                            return false;
                        }
                        sendMessageDelayed(Message.obtain(message), a);
                        return true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Throwable, java.lang.Exception] */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr;
            d dVar = (d) message.obj;
            try {
                int i = message.what;
                if (i != 0) {
                    if (i == 1) {
                        w5 w5Var = w5.this;
                        bArr = w5Var.k.a(w5Var.l, (y7.a) dVar.d);
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    w5 w5Var2 = w5.this;
                    bArr = w5Var2.k.a(w5Var2.l, (y7.d) dVar.d);
                }
            } catch (qd e) {
                boolean a = a(message, e);
                bArr = e;
                if (a) {
                    return;
                }
            } catch (Exception e2) {
                oc.c("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
                bArr = e2;
            }
            w5.this.j.a(dVar.a);
            synchronized (this) {
                try {
                    if (!this.a) {
                        w5.this.m.obtainMessage(message.what, Pair.create(dVar.d, bArr)).sendToTarget();
                    }
                } finally {
                }
            }
        }

        public void a(int i, Object obj, boolean z) {
            obtainMessage(i, new d(mc.a(), z, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void a() {
            removeCallbacksAndMessages(null);
            this.a = true;
        }
    }

    public boolean a(byte[] bArr) {
        return Arrays.equals(this.t, bArr);
    }

    private void a(Exception exc, int i) {
        this.s = new y6.a(exc, c7.a(exc, i));
        oc.a("DefaultDrmSession", "DRM session error", exc);
        a(new A(exc));
        if (this.n != 4) {
            this.n = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj, Object obj2) {
        if (obj == this.v && g()) {
            this.v = null;
            if (obj2 instanceof Exception) {
                a((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.e == 3) {
                    this.b.b((byte[]) xp.a((Object) this.u), bArr);
                    a(new Fk0(10));
                    return;
                }
                byte[] b2 = this.b.b(this.t, bArr);
                int i = this.e;
                if ((i == 2 || (i == 0 && this.u != null)) && b2 != null && b2.length != 0) {
                    this.u = b2;
                }
                this.n = 4;
                a(new Fk0(11));
            } catch (Exception e2) {
                a(e2, true);
            }
        }
    }

    private void a(Exception exc, boolean z) {
        if (exc instanceof NotProvisionedException) {
            this.c.a(this);
        } else {
            a(exc, z ? 1 : 2);
        }
    }

    public void a(int i) {
        if (i != 2) {
            return;
        }
        h();
    }

    private void a(byte[] bArr, int i, boolean z) {
        try {
            this.v = this.b.a(bArr, this.a, i, this.h);
            ((c) xp.a(this.q)).a(1, b1.a(this.v), z);
        } catch (Exception e2) {
            a(e2, true);
        }
    }

    @Override // com.applovin.impl.y6
    public void a(z6.a aVar) {
        b1.b(this.o > 0);
        int i = this.o - 1;
        this.o = i;
        if (i == 0) {
            this.n = 0;
            ((e) xp.a(this.m)).removeCallbacksAndMessages(null);
            ((c) xp.a(this.q)).a();
            this.q = null;
            ((HandlerThread) xp.a(this.p)).quit();
            this.p = null;
            this.r = null;
            this.s = null;
            this.v = null;
            this.w = null;
            byte[] bArr = this.t;
            if (bArr != null) {
                this.b.c(bArr);
                this.t = null;
            }
        }
        if (aVar != null) {
            this.i.c(aVar);
            if (this.i.b(aVar) == 0) {
                aVar.d();
            }
        }
        this.d.b(this, this.o);
    }

    @Override // com.applovin.impl.y6
    public boolean a(String str) {
        return this.b.a((byte[]) b1.b(this.t), str);
    }

    private long a() {
        if (t2.d.equals(this.l)) {
            Pair pair = (Pair) b1.a(bs.a(this));
            return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        }
        return Long.MAX_VALUE;
    }
}
