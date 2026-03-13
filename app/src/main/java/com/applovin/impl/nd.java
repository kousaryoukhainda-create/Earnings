package com.applovin.impl;

import android.view.Surface;
/* loaded from: classes.dex */
public class nd extends id {
    public final int c;
    public final boolean d;

    public nd(Throwable th, jd jdVar, Surface surface) {
        super(th, jdVar);
        boolean z;
        this.c = System.identityHashCode(surface);
        if (surface != null && !surface.isValid()) {
            z = false;
        } else {
            z = true;
        }
        this.d = z;
    }
}
