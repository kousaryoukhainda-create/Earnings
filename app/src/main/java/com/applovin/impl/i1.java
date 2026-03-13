package com.applovin.impl;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
/* loaded from: classes.dex */
final class i1 extends MediaCodec.Callback {
    private final HandlerThread b;
    private Handler c;
    private MediaFormat h;
    private MediaFormat i;
    private MediaCodec.CodecException j;
    private long k;
    private boolean l;
    private IllegalStateException m;
    private final Object a = new Object();
    private final nb d = new nb();
    private final nb e = new nb();
    private final ArrayDeque f = new ArrayDeque();
    private final ArrayDeque g = new ArrayDeque();

    public i1(HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    private void b() {
        if (!this.g.isEmpty()) {
            this.i = (MediaFormat) this.g.getLast();
        }
        this.d.a();
        this.e.a();
        this.f.clear();
        this.g.clear();
        this.j = null;
    }

    private boolean d() {
        return this.k > 0 || this.l;
    }

    private void e() {
        f();
        g();
    }

    private void f() {
        IllegalStateException illegalStateException = this.m;
        if (illegalStateException == null) {
            return;
        }
        this.m = null;
        throw illegalStateException;
    }

    private void g() {
        MediaCodec.CodecException codecException = this.j;
        if (codecException == null) {
            return;
        }
        this.j = null;
        throw codecException;
    }

    public MediaFormat c() {
        MediaFormat mediaFormat;
        synchronized (this.a) {
            try {
                mediaFormat = this.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public void h() {
        synchronized (this.a) {
            this.l = true;
            this.b.quit();
            b();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.a) {
            this.d.a(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    a(mediaFormat);
                    this.i = null;
                }
                this.e.a(i);
                this.f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.a) {
            a(mediaFormat);
            this.i = null;
        }
    }

    private void a(MediaFormat mediaFormat) {
        this.e.a(-2);
        this.g.add(mediaFormat);
    }

    private void d(Runnable runnable) {
        if (this.l) {
            return;
        }
        long j = this.k - 1;
        this.k = j;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i > 0) {
            return;
        }
        if (i < 0) {
            a(new IllegalStateException());
            return;
        }
        b();
        try {
            runnable.run();
        } catch (IllegalStateException e) {
            a(e);
        } catch (Exception e2) {
            a(new IllegalStateException(e2));
        }
    }

    public int a() {
        synchronized (this.a) {
            try {
                int i = -1;
                if (d()) {
                    return -1;
                }
                e();
                if (!this.d.c()) {
                    i = this.d.d();
                }
                return i;
            } finally {
            }
        }
    }

    /* renamed from: c */
    public void b(Runnable runnable) {
        synchronized (this.a) {
            d(runnable);
        }
    }

    public int a(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            try {
                if (d()) {
                    return -1;
                }
                e();
                if (this.e.c()) {
                    return -1;
                }
                int d = this.e.d();
                if (d >= 0) {
                    b1.b(this.h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (d == -2) {
                    this.h = (MediaFormat) this.g.remove();
                }
                return d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(Runnable runnable) {
        synchronized (this.a) {
            this.k++;
            ((Handler) xp.a(this.c)).post(new C(3, this, runnable));
        }
    }

    public void a(MediaCodec mediaCodec) {
        b1.b(this.c == null);
        this.b.start();
        Handler handler = new Handler(this.b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.c = handler;
    }

    private void a(IllegalStateException illegalStateException) {
        synchronized (this.a) {
            this.m = illegalStateException;
        }
    }
}
