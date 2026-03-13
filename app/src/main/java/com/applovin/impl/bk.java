package com.applovin.impl;

import java.util.ArrayDeque;
/* loaded from: classes.dex */
public abstract class bk implements l5 {
    private final Thread a;
    private final Object b = new Object();
    private final ArrayDeque c = new ArrayDeque();
    private final ArrayDeque d = new ArrayDeque();
    private final o5[] e;
    private final yg[] f;
    private int g;
    private int h;
    private o5 i;
    private n5 j;
    private boolean k;
    private boolean l;
    private int m;

    /* loaded from: classes.dex */
    public class a extends Thread {
        public a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            bk.this.m();
        }
    }

    public bk(o5[] o5VarArr, yg[] ygVarArr) {
        this.e = o5VarArr;
        this.g = o5VarArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = f();
        }
        this.f = ygVarArr;
        this.h = ygVarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = g();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.a = aVar;
        aVar.start();
    }

    private boolean e() {
        if (!this.c.isEmpty() && this.h > 0) {
            return true;
        }
        return false;
    }

    private boolean h() {
        n5 a2;
        synchronized (this.b) {
            while (!this.l && !e()) {
                try {
                    this.b.wait();
                } finally {
                }
            }
            if (this.l) {
                return false;
            }
            o5 o5Var = (o5) this.c.removeFirst();
            yg[] ygVarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            yg ygVar = ygVarArr[i];
            boolean z = this.k;
            this.k = false;
            if (o5Var.e()) {
                ygVar.b(4);
            } else {
                if (o5Var.d()) {
                    ygVar.b(Integer.MIN_VALUE);
                }
                try {
                    a2 = a(o5Var, ygVar, z);
                } catch (OutOfMemoryError e) {
                    a2 = a((Throwable) e);
                } catch (RuntimeException e2) {
                    a2 = a((Throwable) e2);
                }
                if (a2 != null) {
                    synchronized (this.b) {
                        this.j = a2;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k) {
                        ygVar.g();
                    } else if (ygVar.d()) {
                        this.m++;
                        ygVar.g();
                    } else {
                        ygVar.c = this.m;
                        this.m = 0;
                        this.d.addLast(ygVar);
                    }
                    b(o5Var);
                } finally {
                }
            }
            return true;
        }
    }

    private void k() {
        if (e()) {
            this.b.notify();
        }
    }

    private void l() {
        n5 n5Var = this.j;
        if (n5Var == null) {
            return;
        }
        throw n5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (h());
    }

    public abstract n5 a(o5 o5Var, yg ygVar, boolean z);

    public abstract n5 a(Throwable th);

    @Override // com.applovin.impl.l5
    public final void b() {
        synchronized (this.b) {
            try {
                this.k = true;
                this.m = 0;
                o5 o5Var = this.i;
                if (o5Var != null) {
                    b(o5Var);
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    b((o5) this.c.removeFirst());
                }
                while (!this.d.isEmpty()) {
                    ((yg) this.d.removeFirst()).g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract o5 f();

    public abstract yg g();

    @Override // com.applovin.impl.l5
    /* renamed from: i */
    public final o5 d() {
        boolean z;
        o5 o5Var;
        synchronized (this.b) {
            l();
            if (this.i == null) {
                z = true;
            } else {
                z = false;
            }
            b1.b(z);
            int i = this.g;
            if (i == 0) {
                o5Var = null;
            } else {
                o5[] o5VarArr = this.e;
                int i2 = i - 1;
                this.g = i2;
                o5Var = o5VarArr[i2];
            }
            this.i = o5Var;
        }
        return o5Var;
    }

    @Override // com.applovin.impl.l5
    /* renamed from: j */
    public final yg c() {
        synchronized (this.b) {
            try {
                l();
                if (this.d.isEmpty()) {
                    return null;
                }
                return (yg) this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.applovin.impl.l5
    public final void a(o5 o5Var) {
        synchronized (this.b) {
            l();
            b1.a(o5Var == this.i);
            this.c.addLast(o5Var);
            k();
            this.i = null;
        }
    }

    @Override // com.applovin.impl.l5
    public void a() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    private void b(o5 o5Var) {
        o5Var.b();
        o5[] o5VarArr = this.e;
        int i = this.g;
        this.g = i + 1;
        o5VarArr[i] = o5Var;
    }

    private void b(yg ygVar) {
        ygVar.b();
        yg[] ygVarArr = this.f;
        int i = this.h;
        this.h = i + 1;
        ygVarArr[i] = ygVar;
    }

    public void a(yg ygVar) {
        synchronized (this.b) {
            b(ygVar);
            k();
        }
    }

    public final void a(int i) {
        b1.b(this.g == this.e.length);
        for (o5 o5Var : this.e) {
            o5Var.g(i);
        }
    }
}
