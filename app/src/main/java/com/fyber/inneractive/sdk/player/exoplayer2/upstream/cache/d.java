package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.z;
import java.io.IOException;
import java.io.InterruptedIOException;
/* loaded from: classes.dex */
public final class d implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.g {
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g b;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g c;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.g d;
    public final a e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.g i;
    public boolean j;
    public Uri k;
    public int l;
    public String m;
    public long n;
    public long o;
    public g p;
    public boolean q;
    public boolean r;
    public long s;

    /* loaded from: classes.dex */
    public interface a {
        void a(long j, long j2);
    }

    public d(com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a aVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar2, com.fyber.inneractive.sdk.player.exoplayer2.upstream.f fVar, int i, a aVar2) {
        boolean z;
        boolean z2;
        this.a = aVar;
        this.b = gVar2;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f = z;
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.g = z2;
        this.h = (i & 4) != 0;
        this.d = gVar;
        if (fVar != null) {
            this.c = new z(gVar, fVar);
        } else {
            this.c = null;
        }
        this.e = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a A[Catch: IOException -> 0x0024, TryCatch #0 {IOException -> 0x0024, blocks: (B:2:0x0000, B:6:0x0011, B:8:0x001f, B:19:0x0033, B:23:0x003e, B:25:0x004a, B:28:0x0056, B:29:0x005b, B:31:0x005e, B:30:0x005c, B:13:0x0026, B:15:0x002c, B:5:0x000d), top: B:35:0x0000 }] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r10) throws java.io.IOException {
        /*
            r9 = this;
            android.net.Uri r0 = r10.a     // Catch: java.io.IOException -> L24
            r9.k = r0     // Catch: java.io.IOException -> L24
            int r1 = r10.g     // Catch: java.io.IOException -> L24
            r9.l = r1     // Catch: java.io.IOException -> L24
            java.lang.String r1 = r10.f     // Catch: java.io.IOException -> L24
            if (r1 == 0) goto Ld
            goto L11
        Ld:
            java.lang.String r1 = r0.toString()     // Catch: java.io.IOException -> L24
        L11:
            r9.m = r1     // Catch: java.io.IOException -> L24
            long r2 = r10.d     // Catch: java.io.IOException -> L24
            r9.n = r2     // Catch: java.io.IOException -> L24
            boolean r0 = r9.g     // Catch: java.io.IOException -> L24
            r2 = 0
            r3 = 1
            r4 = -1
            if (r0 == 0) goto L26
            boolean r0 = r9.q     // Catch: java.io.IOException -> L24
            if (r0 != 0) goto L30
            goto L26
        L24:
            r10 = move-exception
            goto L64
        L26:
            long r6 = r10.e     // Catch: java.io.IOException -> L24
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L32
            boolean r0 = r9.h     // Catch: java.io.IOException -> L24
            if (r0 == 0) goto L32
        L30:
            r0 = 1
            goto L33
        L32:
            r0 = 0
        L33:
            r9.r = r0     // Catch: java.io.IOException -> L24
            long r6 = r10.e     // Catch: java.io.IOException -> L24
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 != 0) goto L5c
            if (r0 == 0) goto L3e
            goto L5c
        L3e:
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a r0 = r9.a     // Catch: java.io.IOException -> L24
            long r0 = r0.a(r1)     // Catch: java.io.IOException -> L24
            r9.o = r0     // Catch: java.io.IOException -> L24
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L5e
            long r4 = r10.d     // Catch: java.io.IOException -> L24
            long r0 = r0 - r4
            r9.o = r0     // Catch: java.io.IOException -> L24
            r4 = 0
            int r10 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r10 <= 0) goto L56
            goto L5e
        L56:
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.h r10 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.h     // Catch: java.io.IOException -> L24
            r10.<init>(r2)     // Catch: java.io.IOException -> L24
            throw r10     // Catch: java.io.IOException -> L24
        L5c:
            r9.o = r6     // Catch: java.io.IOException -> L24
        L5e:
            r9.a(r3)     // Catch: java.io.IOException -> L24
            long r0 = r9.o     // Catch: java.io.IOException -> L24
            return r0
        L64:
            r9.a(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.d.a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.j):long");
    }

    public final void b() throws IOException {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar = this.i;
        if (gVar == null) {
            return;
        }
        try {
            gVar.close();
            this.i = null;
            this.j = false;
        } finally {
            g gVar2 = this.p;
            if (gVar2 != null) {
                this.a.b(gVar2);
                this.p = null;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public void close() throws IOException {
        this.k = null;
        a aVar = this.e;
        if (aVar != null && this.s > 0) {
            aVar.a(this.a.a(), this.s);
            this.s = 0L;
        }
        try {
            b();
        } catch (IOException e) {
            a(e);
            throw e;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public int a(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.o == 0) {
            return -1;
        }
        try {
            int a2 = this.i.a(bArr, i, i2);
            if (a2 >= 0) {
                if (this.i == this.b) {
                    this.s += a2;
                }
                long j = a2;
                this.n += j;
                long j2 = this.o;
                if (j2 != -1) {
                    this.o = j2 - j;
                }
            } else {
                if (this.j) {
                    long j3 = this.n;
                    if (this.i == this.c) {
                        this.a.a(this.m, j3);
                    }
                    this.o = 0L;
                }
                b();
                long j4 = this.o;
                if ((j4 > 0 || j4 == -1) && a(false)) {
                    return a(bArr, i, i2);
                }
            }
            return a2;
        } catch (IOException e) {
            a(e);
            throw e;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public Uri a() {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar = this.i;
        return gVar == this.d ? gVar.a() : this.k;
    }

    public final boolean a(boolean z) throws IOException {
        g b;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar;
        long j;
        IOException iOException = null;
        if (this.r) {
            b = null;
        } else if (this.f) {
            try {
                b = this.a.b(this.m, this.n);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        } else {
            b = this.a.c(this.m, this.n);
        }
        if (b == null) {
            this.i = this.d;
            Uri uri = this.k;
            long j2 = this.n;
            jVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.j(uri, null, j2, j2, this.o, this.m, this.l);
        } else if (b.d) {
            Uri fromFile = Uri.fromFile(b.e);
            long j3 = this.n - b.b;
            long j4 = b.c - j3;
            long j5 = this.o;
            if (j5 != -1) {
                j4 = Math.min(j4, j5);
            }
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.j jVar2 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.j(fromFile, null, this.n, j3, j4, this.m, this.l);
            this.i = this.b;
            jVar = jVar2;
        } else {
            long j6 = b.c;
            if (j6 == -1) {
                j6 = this.o;
            } else {
                long j7 = this.o;
                if (j7 != -1) {
                    j6 = Math.min(j6, j7);
                }
            }
            long j8 = j6;
            Uri uri2 = this.k;
            long j9 = this.n;
            jVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.j(uri2, null, j9, j9, j8, this.m, this.l);
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.g gVar = this.c;
            if (gVar != null) {
                this.i = gVar;
                this.p = b;
            } else {
                this.i = this.d;
                this.a.b(b);
            }
        }
        boolean z2 = false;
        this.j = jVar.e == -1;
        try {
            j = this.i.a(jVar);
            z2 = true;
        } catch (IOException e) {
            if (!z && this.j) {
                for (Throwable th = e; th != null; th = th.getCause()) {
                    if ((th instanceof com.fyber.inneractive.sdk.player.exoplayer2.upstream.h) && ((com.fyber.inneractive.sdk.player.exoplayer2.upstream.h) th).a == 0) {
                        break;
                    }
                }
            }
            iOException = e;
            if (iOException != null) {
                throw iOException;
            }
            j = 0;
        }
        if (this.j && j != -1) {
            this.o = j;
            long j10 = jVar.d + j;
            if (this.i == this.c) {
                this.a.a(this.m, j10);
            }
        }
        return z2;
    }

    public final void a(IOException iOException) {
        if (this.i == this.b || (iOException instanceof a.C0100a)) {
            this.q = true;
        }
    }
}
