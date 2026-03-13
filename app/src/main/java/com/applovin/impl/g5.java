package com.applovin.impl;

import android.net.Uri;
import android.util.Base64;
import com.applovin.exoplayer2.common.base.Charsets;
import java.net.URLDecoder;
/* loaded from: classes.dex */
public final class g5 extends a2 {
    private k5 e;
    private byte[] f;
    private int g;
    private int h;

    public g5() {
        super(false);
    }

    @Override // com.applovin.impl.h5
    public long a(k5 k5Var) {
        b(k5Var);
        this.e = k5Var;
        Uri uri = k5Var.a;
        String scheme = uri.getScheme();
        boolean equals = "data".equals(scheme);
        b1.a(equals, "Unsupported scheme: " + scheme);
        String[] a = xp.a(uri.getSchemeSpecificPart(), ",");
        if (a.length == 2) {
            String str = a[1];
            if (a[0].contains(";base64")) {
                try {
                    this.f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    throw ch.b("Error while parsing Base64 encoded string: " + str, e);
                }
            } else {
                this.f = xp.c(URLDecoder.decode(str, Charsets.US_ASCII.name()));
            }
            long j = k5Var.g;
            byte[] bArr = this.f;
            if (j <= bArr.length) {
                int i = (int) j;
                this.g = i;
                int length = bArr.length - i;
                this.h = length;
                long j2 = k5Var.h;
                if (j2 != -1) {
                    this.h = (int) Math.min(length, j2);
                }
                c(k5Var);
                long j3 = k5Var.h;
                return j3 != -1 ? j3 : this.h;
            }
            this.f = null;
            throw new i5(2008);
        }
        throw ch.b("Unexpected URI format: " + uri, null);
    }

    @Override // com.applovin.impl.h5
    public Uri c() {
        k5 k5Var = this.e;
        if (k5Var != null) {
            return k5Var.a;
        }
        return null;
    }

    @Override // com.applovin.impl.h5
    public void close() {
        if (this.f != null) {
            this.f = null;
            g();
        }
        this.e = null;
    }

    @Override // com.applovin.impl.f5
    public int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(xp.a((Object) this.f), this.g, bArr, i, min);
        this.g += min;
        this.h -= min;
        d(min);
        return min;
    }
}
