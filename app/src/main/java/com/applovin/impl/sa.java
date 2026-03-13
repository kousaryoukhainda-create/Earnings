package com.applovin.impl;

import android.net.Uri;
import java.util.Map;
/* loaded from: classes.dex */
final class sa implements h5 {
    private final h5 a;
    private final int b;
    private final a c;
    private final byte[] d;
    private int e;

    /* loaded from: classes.dex */
    public interface a {
        void a(ah ahVar);
    }

    public sa(h5 h5Var, int i, a aVar) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        b1.a(z);
        this.a = h5Var;
        this.b = i;
        this.c = aVar;
        this.d = new byte[1];
        this.e = i;
    }

    private boolean g() {
        if (this.a.a(this.d, 0, 1) == -1) {
            return false;
        }
        int i = (this.d[0] & 255) << 4;
        if (i == 0) {
            return true;
        }
        byte[] bArr = new byte[i];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int a2 = this.a.a(bArr, i3, i2);
            if (a2 == -1) {
                return false;
            }
            i3 += a2;
            i2 -= a2;
        }
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        if (i > 0) {
            this.c.a(new ah(bArr, i));
        }
        return true;
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
        throw new UnsupportedOperationException();
    }

    @Override // com.applovin.impl.h5
    public Map e() {
        return this.a.e();
    }

    @Override // com.applovin.impl.f5
    public int a(byte[] bArr, int i, int i2) {
        if (this.e == 0) {
            if (!g()) {
                return -1;
            }
            this.e = this.b;
        }
        int a2 = this.a.a(bArr, i, Math.min(this.e, i2));
        if (a2 != -1) {
            this.e -= a2;
        }
        return a2;
    }

    @Override // com.applovin.impl.h5
    public long a(k5 k5Var) {
        throw new UnsupportedOperationException();
    }
}
