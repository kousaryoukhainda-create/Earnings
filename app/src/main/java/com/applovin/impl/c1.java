package com.applovin.impl;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class c1 extends a2 {
    private final AssetManager e;
    private Uri f;
    private InputStream g;
    private long h;
    private boolean i;

    /* loaded from: classes.dex */
    public static final class a extends i5 {
        public a(Throwable th, int i) {
            super(th, i);
        }
    }

    public c1(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override // com.applovin.impl.h5
    public long a(k5 k5Var) {
        try {
            Uri uri = k5Var.a;
            this.f = uri;
            String str = (String) b1.a((Object) uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith("/")) {
                str = str.substring(1);
            }
            b(k5Var);
            InputStream open = this.e.open(str, 1);
            this.g = open;
            if (open.skip(k5Var.g) >= k5Var.g) {
                long j = k5Var.h;
                if (j != -1) {
                    this.h = j;
                } else {
                    long available = this.g.available();
                    this.h = available;
                    if (available == 2147483647L) {
                        this.h = -1L;
                    }
                }
                this.i = true;
                c(k5Var);
                return this.h;
            }
            throw new a(null, 2008);
        } catch (a e) {
            throw e;
        } catch (IOException e2) {
            throw new a(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // com.applovin.impl.h5
    public Uri c() {
        return this.f;
    }

    @Override // com.applovin.impl.h5
    public void close() {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new a(e, 2000);
            }
        } finally {
            this.g = null;
            if (this.i) {
                this.i = false;
                g();
            }
        }
    }

    @Override // com.applovin.impl.f5
    public int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new a(e, 2000);
            }
        }
        int read = ((InputStream) xp.a((Object) this.g)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.h;
        if (j2 != -1) {
            this.h = j2 - read;
        }
        d(read);
        return read;
    }
}
