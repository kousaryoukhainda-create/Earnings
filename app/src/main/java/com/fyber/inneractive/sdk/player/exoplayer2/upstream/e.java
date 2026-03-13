package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public final class e implements g {
    public final ContentResolver a;
    public final a0<? super e> b;
    public Uri c;
    public AssetFileDescriptor d;
    public InputStream e;
    public long f;
    public boolean g;

    /* loaded from: classes.dex */
    public static class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public e(Context context, a0<? super e> a0Var) {
        this.a = context.getContentResolver();
        this.b = a0Var;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public long a(j jVar) throws a {
        try {
            Uri uri = jVar.a;
            this.c = uri;
            AssetFileDescriptor openAssetFileDescriptor = this.a.openAssetFileDescriptor(uri, "r");
            this.d = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                this.e = new FileInputStream(this.d.getFileDescriptor());
                long startOffset = this.d.getStartOffset();
                if (this.e.skip(jVar.d + startOffset) - startOffset == jVar.d) {
                    long j = jVar.e;
                    if (j != -1) {
                        this.f = j;
                    } else {
                        long length = this.d.getLength();
                        this.f = length;
                        if (length == -1) {
                            long available = this.e.available();
                            this.f = available;
                            if (available == 0) {
                                this.f = -1L;
                            }
                        }
                    }
                    this.g = true;
                    a0<? super e> a0Var = this.b;
                    if (a0Var != null) {
                        ((l) a0Var).a(this, jVar);
                    }
                    return this.f;
                }
                throw new EOFException();
            }
            throw new FileNotFoundException("Could not open file descriptor for: " + this.c);
        } catch (IOException e) {
            throw new a(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public void close() throws a {
        this.c = null;
        try {
            try {
                InputStream inputStream = this.e;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.e = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.d;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new a(e);
                    }
                } finally {
                    this.d = null;
                    if (this.g) {
                        this.g = false;
                        a0<? super e> a0Var = this.b;
                        if (a0Var != null) {
                            ((l) a0Var).a(this);
                        }
                    }
                }
            } catch (IOException e2) {
                throw new a(e2);
            }
        } catch (Throwable th) {
            this.e = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.d;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.d = null;
                    if (this.g) {
                        this.g = false;
                        a0<? super e> a0Var2 = this.b;
                        if (a0Var2 != null) {
                            ((l) a0Var2).a(this);
                        }
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new a(e3);
                }
            } finally {
                this.d = null;
                if (this.g) {
                    this.g = false;
                    a0<? super e> a0Var3 = this.b;
                    if (a0Var3 != null) {
                        ((l) a0Var3).a(this);
                    }
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public int a(byte[] bArr, int i, int i2) throws a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new a(e);
            }
        }
        int read = this.e.read(bArr, i, i2);
        if (read == -1) {
            if (this.f == -1) {
                return -1;
            }
            throw new a(new EOFException());
        }
        long j2 = this.f;
        if (j2 != -1) {
            this.f = j2 - read;
        }
        a0<? super e> a0Var = this.b;
        if (a0Var != null) {
            l lVar = (l) a0Var;
            synchronized (lVar) {
                lVar.d += read;
            }
        }
        return read;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public Uri a() {
        return this.c;
    }
}
