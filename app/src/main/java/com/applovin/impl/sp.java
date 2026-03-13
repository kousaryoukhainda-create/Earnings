package com.applovin.impl;
/* loaded from: classes.dex */
public final class sp extends Exception {
    public final int a;

    public sp(int i) {
        this.a = i;
    }

    public sp(int i, Exception exc) {
        super(exc);
        this.a = i;
    }
}
