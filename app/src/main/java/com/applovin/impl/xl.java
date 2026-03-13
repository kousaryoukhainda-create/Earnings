package com.applovin.impl;
/* loaded from: classes.dex */
abstract class xl {
    protected final qo a;

    /* loaded from: classes.dex */
    public static final class a extends ch {
        public a(String str) {
            super(str, null, false, 1);
        }
    }

    public xl(qo qoVar) {
        this.a = qoVar;
    }

    public abstract boolean a(ah ahVar);

    public final boolean a(ah ahVar, long j) {
        return a(ahVar) && b(ahVar, j);
    }

    public abstract boolean b(ah ahVar, long j);
}
