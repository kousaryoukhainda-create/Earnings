package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: p5  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2387p5 extends L9 {
    public final AssetManager g;
    public Uri h;
    public InputStream i;
    public long j;
    public boolean k;

    public C2387p5(Context context) {
        super(false);
        this.g = context.getAssets();
    }

    @Override // defpackage.InterfaceC3304zl
    public final Uri A() {
        return this.h;
    }

    @Override // defpackage.InterfaceC3304zl
    public final void close() {
        this.h = null;
        try {
            try {
                InputStream inputStream = this.i;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new C0145Al(2000, e);
            }
        } finally {
            this.i = null;
            if (this.k) {
                this.k = false;
                e();
            }
        }
    }

    @Override // defpackage.InterfaceC3304zl
    public final long g(C0223Dl c0223Dl) {
        int i;
        try {
            Uri uri = c0223Dl.a;
            long j = c0223Dl.e;
            this.h = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            h();
            InputStream open = this.g.open(path, 1);
            this.i = open;
            if (open.skip(j) >= j) {
                long j2 = c0223Dl.f;
                if (j2 != -1) {
                    this.j = j2;
                } else {
                    long available = this.i.available();
                    this.j = available;
                    if (available == 2147483647L) {
                        this.j = -1L;
                    }
                }
                this.k = true;
                j(c0223Dl);
                return this.j;
            }
            throw new C0145Al(2008, (Exception) null);
        } catch (C2301o5 e) {
            throw e;
        } catch (IOException e2) {
            if (e2 instanceof FileNotFoundException) {
                i = 2005;
            } else {
                i = 2000;
            }
            throw new C0145Al(i, e2);
        }
    }

    @Override // defpackage.InterfaceC3046wl
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C0145Al(2000, e);
            }
        }
        InputStream inputStream = this.i;
        int i3 = Ha0.a;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.j;
        if (j2 != -1) {
            this.j = j2 - read;
        }
        a(read);
        return read;
    }
}
