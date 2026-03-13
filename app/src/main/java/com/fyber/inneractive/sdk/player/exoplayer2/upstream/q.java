package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
/* loaded from: classes.dex */
public final class q implements g {
    public final a0<? super q> a;
    public RandomAccessFile b;
    public Uri c;
    public long d;
    public boolean e;

    /* loaded from: classes.dex */
    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public q(a0<? super q> a0Var) {
        this.a = a0Var;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public long a(j jVar) throws a {
        try {
            this.c = jVar.a;
            RandomAccessFile randomAccessFile = new RandomAccessFile(jVar.a.getPath(), "r");
            this.b = randomAccessFile;
            randomAccessFile.seek(jVar.d);
            long j = jVar.e;
            if (j == -1) {
                j = this.b.length() - jVar.d;
            }
            this.d = j;
            if (j >= 0) {
                this.e = true;
                a0<? super q> a0Var = this.a;
                if (a0Var != null) {
                    ((l) a0Var).a(this, jVar);
                }
                return this.d;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public void close() throws a {
        this.c = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.b;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new a(e);
            }
        } finally {
            this.b = null;
            if (this.e) {
                this.e = false;
                a0<? super q> a0Var = this.a;
                if (a0Var != null) {
                    ((l) a0Var).a(this);
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public int a(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.d;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.b.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                long j2 = read;
                this.d -= j2;
                a0<? super q> a0Var = this.a;
                if (a0Var != null) {
                    l lVar = (l) a0Var;
                    synchronized (lVar) {
                        lVar.d += j2;
                    }
                }
            }
            return read;
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public Uri a() {
        return this.c;
    }
}
