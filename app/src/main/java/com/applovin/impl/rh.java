package com.applovin.impl;

import android.os.Looper;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class rh {
    private final b a;
    private final a b;
    private final l3 c;
    private final fo d;
    private int e;
    private Object f;
    private Looper g;
    private int h;
    private long i = -9223372036854775807L;
    private boolean j = true;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;

    /* loaded from: classes.dex */
    public interface a {
        void a(rh rhVar);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(int i, Object obj);
    }

    public rh(a aVar, b bVar, fo foVar, int i, l3 l3Var, Looper looper) {
        this.b = aVar;
        this.a = bVar;
        this.d = foVar;
        this.g = looper;
        this.c = l3Var;
        this.h = i;
    }

    public synchronized boolean a(long j) {
        boolean z;
        try {
            b1.b(this.k);
            b1.b(this.g.getThread() != Thread.currentThread());
            long c = this.c.c() + j;
            while (true) {
                z = this.m;
                if (z || j <= 0) {
                    break;
                }
                this.c.b();
                wait(j);
                j = c - this.c.c();
            }
            if (!z) {
                throw new TimeoutException("Message delivery timed out.");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.l;
    }

    public Looper b() {
        return this.g;
    }

    public Object c() {
        return this.f;
    }

    public long d() {
        return this.i;
    }

    public b e() {
        return this.a;
    }

    public fo f() {
        return this.d;
    }

    public int g() {
        return this.e;
    }

    public int h() {
        return this.h;
    }

    public synchronized boolean i() {
        return this.n;
    }

    public rh j() {
        b1.b(!this.k);
        if (this.i == -9223372036854775807L) {
            b1.a(this.j);
        }
        this.k = true;
        this.b.a(this);
        return this;
    }

    public boolean a() {
        return this.j;
    }

    public synchronized void a(boolean z) {
        this.l = z | this.l;
        this.m = true;
        notifyAll();
    }

    public rh a(Object obj) {
        b1.b(!this.k);
        this.f = obj;
        return this;
    }

    public rh a(int i) {
        b1.b(!this.k);
        this.e = i;
        return this;
    }
}
