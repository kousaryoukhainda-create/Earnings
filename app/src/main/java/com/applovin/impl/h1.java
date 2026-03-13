package com.applovin.impl;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.applovin.exoplayer2.common.base.Ascii;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
class h1 {
    private static final ArrayDeque h = new ArrayDeque();
    private static final Object i = new Object();
    private final MediaCodec a;
    private final HandlerThread b;
    private Handler c;
    private final AtomicReference d;
    private final c4 e;
    private final boolean f;
    private boolean g;

    /* loaded from: classes.dex */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            h1.this.a(message);
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public int a;
        public int b;
        public int c;
        public final MediaCodec.CryptoInfo d = new MediaCodec.CryptoInfo();
        public long e;
        public int f;

        public void a(int i, int i2, int i3, long j, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.e = j;
            this.f = i4;
        }
    }

    public h1(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z) {
        this(mediaCodec, handlerThread, z, new c4());
    }

    private void c() {
        ((Handler) xp.a(this.c)).removeCallbacksAndMessages(null);
        a();
        e();
    }

    private static b d() {
        ArrayDeque arrayDeque = h;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new b();
                }
                return (b) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void e() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException == null) {
            return;
        }
        throw runtimeException;
    }

    private static boolean f() {
        String lowerCase = Ascii.toLowerCase(xp.c);
        if (!lowerCase.contains("samsung") && !lowerCase.contains("motorola")) {
            return false;
        }
        return true;
    }

    public void b() {
        if (this.g) {
            try {
                c();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public void g() {
        if (this.g) {
            b();
            this.b.quit();
        }
        this.g = false;
    }

    public void h() {
        if (!this.g) {
            this.b.start();
            this.c = new a(this.b.getLooper());
            this.g = true;
        }
    }

    public void i() {
        a();
    }

    public h1(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z, c4 c4Var) {
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = c4Var;
        this.d = new AtomicReference();
        this.f = z || f();
    }

    private void a() {
        this.e.c();
        ((Handler) xp.a(this.c)).obtainMessage(2).sendToTarget();
        this.e.a();
    }

    private static void a(z4 z4Var, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = z4Var.f;
        cryptoInfo.numBytesOfClearData = a(z4Var.d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = a(z4Var.e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) b1.a(a(z4Var.b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) b1.a(a(z4Var.a, cryptoInfo.iv));
        cryptoInfo.mode = z4Var.c;
        if (xp.a >= 24) {
            AbstractC3150y0.p();
            cryptoInfo.setPattern(AbstractC3150y0.h(z4Var.g, z4Var.h));
        }
    }

    public void b(int i2, int i3, int i4, long j, int i5) {
        e();
        b d = d();
        d.a(i2, i3, i4, j, i5);
        ((Handler) xp.a(this.c)).obtainMessage(0, d).sendToTarget();
    }

    private static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null && bArr2.length >= bArr.length) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    private static int[] a(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null && iArr2.length >= iArr.length) {
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            return iArr2;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) {
        b bVar;
        int i2 = message.what;
        if (i2 == 0) {
            bVar = (b) message.obj;
            a(bVar.a, bVar.b, bVar.c, bVar.e, bVar.f);
        } else if (i2 != 1) {
            if (i2 != 2) {
                a(new IllegalStateException(String.valueOf(message.what)));
            } else {
                this.e.e();
            }
            bVar = null;
        } else {
            bVar = (b) message.obj;
            a(bVar.a, bVar.b, bVar.d, bVar.e, bVar.f);
        }
        if (bVar != null) {
            a(bVar);
        }
    }

    private void a(int i2, int i3, int i4, long j, int i5) {
        try {
            this.a.queueInputBuffer(i2, i3, i4, j, i5);
        } catch (RuntimeException e) {
            a(e);
        }
    }

    private void a(int i2, int i3, MediaCodec.CryptoInfo cryptoInfo, long j, int i4) {
        try {
            if (this.f) {
                synchronized (i) {
                    this.a.queueSecureInputBuffer(i2, i3, cryptoInfo, j, i4);
                }
            } else {
                this.a.queueSecureInputBuffer(i2, i3, cryptoInfo, j, i4);
            }
        } catch (RuntimeException e) {
            a(e);
        }
    }

    public void a(int i2, int i3, z4 z4Var, long j, int i4) {
        e();
        b d = d();
        d.a(i2, i3, 0, j, i4);
        a(z4Var, d.d);
        ((Handler) xp.a(this.c)).obtainMessage(1, d).sendToTarget();
    }

    public void a(RuntimeException runtimeException) {
        this.d.set(runtimeException);
    }

    private static void a(b bVar) {
        ArrayDeque arrayDeque = h;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }
}
