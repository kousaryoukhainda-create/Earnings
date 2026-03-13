package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.u;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes.dex */
public final class b implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.f {
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a a;
    public final long b;
    public final int c;
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.j d;
    public File e;
    public OutputStream f;
    public FileOutputStream g;
    public long h;
    public long i;
    public o j;

    /* loaded from: classes.dex */
    public static class a extends a.C0100a {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public b(com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a aVar, long j, int i) {
        this.a = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a) com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(aVar);
        this.b = j;
        this.c = i;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.f
    public void a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar) throws a {
        if (jVar.e == -1 && !jVar.a(2)) {
            this.d = null;
            return;
        }
        this.d = jVar;
        this.i = 0L;
        try {
            b();
        } catch (IOException e) {
            throw new a(e);
        }
    }

    public final void b() throws IOException {
        long min;
        long j = this.d.e;
        if (j == -1) {
            min = this.b;
        } else {
            min = Math.min(j - this.i, this.b);
        }
        long j2 = min;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a aVar = this.a;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar = this.d;
        this.e = aVar.a(jVar.f, this.i + jVar.c, j2);
        FileOutputStream fileOutputStream = new FileOutputStream(this.e);
        this.g = fileOutputStream;
        if (this.c > 0) {
            o oVar = this.j;
            if (oVar == null) {
                this.j = new o(this.g, this.c);
            } else {
                oVar.a(fileOutputStream);
            }
            this.f = this.j;
        } else {
            this.f = fileOutputStream;
        }
        this.h = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.f
    public void close() throws a {
        if (this.d == null) {
            return;
        }
        try {
            a();
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.f
    public void a(byte[] bArr, int i, int i2) throws a {
        if (this.d == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.h == this.b) {
                    a();
                    b();
                }
                int min = (int) Math.min(i2 - i3, this.b - this.h);
                this.f.write(bArr, i + i3, min);
                i3 += min;
                long j = min;
                this.h += j;
                this.i += j;
            } catch (IOException e) {
                throw new a(e);
            }
        }
    }

    public final void a() throws IOException {
        OutputStream outputStream = this.f;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            this.g.getFD().sync();
            u.a(this.f);
            this.f = null;
            File file = this.e;
            this.e = null;
            this.a.a(file);
        } catch (Throwable th) {
            u.a(this.f);
            this.f = null;
            File file2 = this.e;
            this.e = null;
            file2.delete();
            throw th;
        }
    }
}
