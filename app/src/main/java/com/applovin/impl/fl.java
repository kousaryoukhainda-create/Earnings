package com.applovin.impl;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes.dex */
public final class fl implements h5 {
    private final h5 a;
    private long b;
    private Uri c = Uri.EMPTY;
    private Map d = Collections.emptyMap();

    public fl(h5 h5Var) {
        this.a = (h5) b1.a(h5Var);
    }

    @Override // com.applovin.impl.h5
    public void a(xo xoVar) {
        b1.a(xoVar);
        this.a.a(xoVar);
    }

    @Override // com.applovin.impl.h5
    public Uri c() {
        return this.a.c();
    }

    @Override // com.applovin.impl.h5
    public void close() {
        this.a.close();
    }

    @Override // com.applovin.impl.h5
    public Map e() {
        return this.a.e();
    }

    public long g() {
        return this.b;
    }

    public Uri h() {
        return this.c;
    }

    public Map i() {
        return this.d;
    }

    @Override // com.applovin.impl.h5
    public long a(k5 k5Var) {
        this.c = k5Var.a;
        this.d = Collections.emptyMap();
        long a = this.a.a(k5Var);
        this.c = (Uri) b1.a(c());
        this.d = e();
        return a;
    }

    @Override // com.applovin.impl.f5
    public int a(byte[] bArr, int i, int i2) {
        int a = this.a.a(bArr, i, i2);
        if (a != -1) {
            this.b += a;
        }
        return a;
    }
}
