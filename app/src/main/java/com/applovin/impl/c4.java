package com.applovin.impl;
/* loaded from: classes.dex */
public class c4 {
    private final l3 a;
    private boolean b;

    public c4() {
        this(l3.a);
    }

    public synchronized void a() {
        while (!this.b) {
            wait();
        }
    }

    public synchronized void b() {
        boolean z = false;
        while (!this.b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c() {
        boolean z;
        z = this.b;
        this.b = false;
        return z;
    }

    public synchronized boolean d() {
        return this.b;
    }

    public synchronized boolean e() {
        if (this.b) {
            return false;
        }
        this.b = true;
        notifyAll();
        return true;
    }

    public c4(l3 l3Var) {
        this.a = l3Var;
    }
}
