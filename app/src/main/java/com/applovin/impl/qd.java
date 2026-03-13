package com.applovin.impl;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
/* loaded from: classes.dex */
public final class qd extends IOException {
    public final k5 a;
    public final Uri b;
    public final Map c;
    public final long d;

    public qd(k5 k5Var, Uri uri, Map map, long j, Throwable th) {
        super(th);
        this.a = k5Var;
        this.b = uri;
        this.c = map;
        this.d = j;
    }
}
