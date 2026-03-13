package com.applovin.impl;
/* loaded from: classes.dex */
public abstract class l2 {
    private int a;

    public final void b(int i) {
        this.a = i | this.a;
    }

    public final void c(int i) {
        this.a = (~i) & this.a;
    }

    public final boolean d(int i) {
        return (this.a & i) == i;
    }

    public final boolean e() {
        return d(4);
    }

    public final boolean f() {
        return d(1);
    }

    public void b() {
        this.a = 0;
    }

    public final boolean c() {
        return d(268435456);
    }

    public final boolean d() {
        return d(Integer.MIN_VALUE);
    }

    public final void e(int i) {
        this.a = i;
    }
}
