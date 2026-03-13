package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Surface;
import io.flutter.plugins.firebase.auth.Constants;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Locale;
/* renamed from: z5  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3246z5 implements InterfaceC2235nK {
    public int b;
    public boolean c;
    public final Object d;
    public final Object f;
    public final Object g;

    public C3246z5(Context context) {
        String R;
        TelephonyManager telephonyManager;
        this.d = context == null ? null : context.getApplicationContext();
        int i = Ha0.a;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService(Constants.SIGN_IN_METHOD_PHONE)) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                R = AbstractC1906jZ.R(networkCountryIso);
                int[] a = C0795Zm.a(R);
                HashMap hashMap = new HashMap(8);
                hashMap.put(0, 1000000L);
                FV fv = C0795Zm.n;
                hashMap.put(2, (Long) fv.get(a[0]));
                hashMap.put(3, (Long) C0795Zm.o.get(a[1]));
                hashMap.put(4, (Long) C0795Zm.p.get(a[2]));
                hashMap.put(5, (Long) C0795Zm.q.get(a[3]));
                hashMap.put(10, (Long) C0795Zm.r.get(a[4]));
                hashMap.put(9, (Long) C0795Zm.s.get(a[5]));
                hashMap.put(7, (Long) fv.get(a[0]));
                this.f = hashMap;
                this.b = 2000;
                this.g = C2903v50.a;
                this.c = true;
            }
        }
        R = AbstractC1906jZ.R(Locale.getDefault().getCountry());
        int[] a2 = C0795Zm.a(R);
        HashMap hashMap2 = new HashMap(8);
        hashMap2.put(0, 1000000L);
        FV fv2 = C0795Zm.n;
        hashMap2.put(2, (Long) fv2.get(a2[0]));
        hashMap2.put(3, (Long) C0795Zm.o.get(a2[1]));
        hashMap2.put(4, (Long) C0795Zm.p.get(a2[2]));
        hashMap2.put(5, (Long) C0795Zm.q.get(a2[3]));
        hashMap2.put(10, (Long) C0795Zm.r.get(a2[4]));
        hashMap2.put(9, (Long) C0795Zm.s.get(a2[5]));
        hashMap2.put(7, (Long) fv2.get(a2[0]));
        this.f = hashMap2;
        this.b = 2000;
        this.g = C2903v50.a;
        this.c = true;
    }

    public static void a(C3246z5 c3246z5, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        boolean z;
        D5 d5 = (D5) c3246z5.f;
        if (d5.c == null) {
            z = true;
        } else {
            z = false;
        }
        B10.u(z);
        HandlerThread handlerThread = d5.b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = (MediaCodec) c3246z5.d;
        mediaCodec.setCallback(d5, handler);
        d5.c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        ((InterfaceC2578rK) c3246z5.g).start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        c3246z5.b = 1;
    }

    public static String f(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // defpackage.InterfaceC2235nK
    public void b(Bundle bundle) {
        ((InterfaceC2578rK) this.g).b(bundle);
    }

    @Override // defpackage.InterfaceC2235nK
    public void c(int i, C2860ue c2860ue, long j, int i2) {
        ((InterfaceC2578rK) this.g).c(i, c2860ue, j, i2);
    }

    @Override // defpackage.InterfaceC2235nK
    public void d(int i, int i2, long j, int i3) {
        ((InterfaceC2578rK) this.g).d(i, i2, j, i3);
    }

    @Override // defpackage.InterfaceC2235nK
    public boolean e(C3180yK c3180yK) {
        D5 d5 = (D5) this.f;
        synchronized (d5.a) {
            d5.o = c3180yK;
        }
        return true;
    }

    @Override // defpackage.InterfaceC2235nK
    public void flush() {
        ((InterfaceC2578rK) this.g).flush();
        ((MediaCodec) this.d).flush();
        D5 d5 = (D5) this.f;
        synchronized (d5.a) {
            d5.l++;
            Handler handler = d5.c;
            int i = Ha0.a;
            handler.post(new RunnableC1495h2(d5, 7));
        }
        ((MediaCodec) this.d).start();
    }

    @Override // defpackage.InterfaceC2235nK
    public MediaFormat g() {
        MediaFormat mediaFormat;
        D5 d5 = (D5) this.f;
        synchronized (d5.a) {
            try {
                mediaFormat = d5.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // defpackage.InterfaceC2235nK
    public void h(int i, long j) {
        ((MediaCodec) this.d).releaseOutputBuffer(i, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030 A[Catch: all -> 0x0032, DONT_GENERATE, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:19:0x0030, B:23:0x0034, B:30:0x0045, B:29:0x0041, B:32:0x0047, B:33:0x0049, B:34:0x004a, B:35:0x004c, B:36:0x004d, B:37:0x004f), top: B:40:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:19:0x0030, B:23:0x0034, B:30:0x0045, B:29:0x0041, B:32:0x0047, B:33:0x0049, B:34:0x004a, B:35:0x004c, B:36:0x004d, B:37:0x004f), top: B:40:0x000e }] */
    @Override // defpackage.InterfaceC2235nK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int j() {
        /*
            r9 = this;
            java.lang.Object r0 = r9.g
            rK r0 = (defpackage.InterfaceC2578rK) r0
            r0.r()
            java.lang.Object r0 = r9.f
            D5 r0 = (defpackage.D5) r0
            java.lang.Object r1 = r0.a
            monitor-enter(r1)
            java.lang.IllegalStateException r2 = r0.n     // Catch: java.lang.Throwable -> L32
            r3 = 0
            if (r2 != 0) goto L4d
            android.media.MediaCodec$CodecException r2 = r0.j     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L4a
            android.media.MediaCodec$CryptoException r2 = r0.k     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L47
            long r2 = r0.l     // Catch: java.lang.Throwable -> L32
            r4 = 0
            r6 = 1
            r7 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 > 0) goto L2c
            boolean r2 = r0.m     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L2a
            goto L2c
        L2a:
            r2 = 0
            goto L2d
        L2c:
            r2 = 1
        L2d:
            r3 = -1
            if (r2 == 0) goto L34
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            goto L46
        L32:
            r0 = move-exception
            goto L50
        L34:
            Fd r0 = r0.d     // Catch: java.lang.Throwable -> L32
            int r2 = r0.b     // Catch: java.lang.Throwable -> L32
            int r4 = r0.c     // Catch: java.lang.Throwable -> L32
            if (r2 != r4) goto L3d
            goto L3e
        L3d:
            r6 = 0
        L3e:
            if (r6 == 0) goto L41
            goto L45
        L41:
            int r3 = r0.b()     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
        L46:
            return r3
        L47:
            r0.k = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L4a:
            r0.j = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L4d:
            r0.n = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L50:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3246z5.j():int");
    }

    @Override // defpackage.InterfaceC2235nK
    public void k(JK jk, Handler handler) {
        ((MediaCodec) this.d).setOnFrameRenderedListener(new C3074x5(0, this, jk), handler);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030 A[Catch: all -> 0x0032, DONT_GENERATE, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:19:0x0030, B:23:0x0034, B:28:0x0040, B:30:0x0042, B:32:0x0048, B:36:0x006f, B:35:0x0065, B:38:0x0071, B:39:0x0073, B:40:0x0074, B:41:0x0076, B:42:0x0077, B:43:0x0079), top: B:46:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034 A[Catch: all -> 0x0032, TryCatch #0 {all -> 0x0032, blocks: (B:4:0x000e, B:6:0x0013, B:8:0x0017, B:10:0x001b, B:12:0x0025, B:19:0x0030, B:23:0x0034, B:28:0x0040, B:30:0x0042, B:32:0x0048, B:36:0x006f, B:35:0x0065, B:38:0x0071, B:39:0x0073, B:40:0x0074, B:41:0x0076, B:42:0x0077, B:43:0x0079), top: B:46:0x000e }] */
    @Override // defpackage.InterfaceC2235nK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int l(android.media.MediaCodec.BufferInfo r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.g
            rK r0 = (defpackage.InterfaceC2578rK) r0
            r0.r()
            java.lang.Object r0 = r10.f
            D5 r0 = (defpackage.D5) r0
            java.lang.Object r1 = r0.a
            monitor-enter(r1)
            java.lang.IllegalStateException r2 = r0.n     // Catch: java.lang.Throwable -> L32
            r3 = 0
            if (r2 != 0) goto L77
            android.media.MediaCodec$CodecException r2 = r0.j     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L74
            android.media.MediaCodec$CryptoException r2 = r0.k     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L71
            long r2 = r0.l     // Catch: java.lang.Throwable -> L32
            r4 = 0
            r6 = 1
            r7 = 0
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 > 0) goto L2c
            boolean r2 = r0.m     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L2a
            goto L2c
        L2a:
            r2 = 0
            goto L2d
        L2c:
            r2 = 1
        L2d:
            r3 = -1
            if (r2 == 0) goto L34
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            goto L70
        L32:
            r11 = move-exception
            goto L7a
        L34:
            Fd r2 = r0.e     // Catch: java.lang.Throwable -> L32
            int r4 = r2.b     // Catch: java.lang.Throwable -> L32
            int r5 = r2.c     // Catch: java.lang.Throwable -> L32
            if (r4 != r5) goto L3d
            goto L3e
        L3d:
            r6 = 0
        L3e:
            if (r6 == 0) goto L42
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            goto L70
        L42:
            int r3 = r2.b()     // Catch: java.lang.Throwable -> L32
            if (r3 < 0) goto L62
            android.media.MediaFormat r2 = r0.h     // Catch: java.lang.Throwable -> L32
            defpackage.B10.w(r2)     // Catch: java.lang.Throwable -> L32
            java.util.ArrayDeque r0 = r0.f     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = r0.remove()     // Catch: java.lang.Throwable -> L32
            android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0     // Catch: java.lang.Throwable -> L32
            int r5 = r0.offset     // Catch: java.lang.Throwable -> L32
            int r6 = r0.size     // Catch: java.lang.Throwable -> L32
            long r7 = r0.presentationTimeUs     // Catch: java.lang.Throwable -> L32
            int r9 = r0.flags     // Catch: java.lang.Throwable -> L32
            r4 = r11
            r4.set(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L32
            goto L6f
        L62:
            r11 = -2
            if (r3 != r11) goto L6f
            java.util.ArrayDeque r11 = r0.g     // Catch: java.lang.Throwable -> L32
            java.lang.Object r11 = r11.remove()     // Catch: java.lang.Throwable -> L32
            android.media.MediaFormat r11 = (android.media.MediaFormat) r11     // Catch: java.lang.Throwable -> L32
            r0.h = r11     // Catch: java.lang.Throwable -> L32
        L6f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
        L70:
            return r3
        L71:
            r0.k = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L74:
            r0.j = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L77:
            r0.n = r3     // Catch: java.lang.Throwable -> L32
            throw r2     // Catch: java.lang.Throwable -> L32
        L7a:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L32
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3246z5.l(android.media.MediaCodec$BufferInfo):int");
    }

    @Override // defpackage.InterfaceC2235nK
    public void n(int i, boolean z) {
        ((MediaCodec) this.d).releaseOutputBuffer(i, z);
    }

    @Override // defpackage.InterfaceC2235nK
    public void o(int i) {
        ((MediaCodec) this.d).setVideoScalingMode(i);
    }

    @Override // defpackage.InterfaceC2235nK
    public ByteBuffer p(int i) {
        return ((MediaCodec) this.d).getInputBuffer(i);
    }

    @Override // defpackage.InterfaceC2235nK
    public void q(Surface surface) {
        ((MediaCodec) this.d).setOutputSurface(surface);
    }

    @Override // defpackage.InterfaceC2235nK
    public void release() {
        try {
            if (this.b == 1) {
                ((InterfaceC2578rK) this.g).shutdown();
                D5 d5 = (D5) this.f;
                synchronized (d5.a) {
                    d5.m = true;
                    d5.b.quit();
                    d5.a();
                }
            }
            this.b = 2;
            if (!this.c) {
                try {
                    int i = Ha0.a;
                    if (i >= 30 && i < 33) {
                        ((MediaCodec) this.d).stop();
                    }
                } finally {
                }
            }
        } catch (Throwable th) {
            if (!this.c) {
                try {
                    int i2 = Ha0.a;
                    if (i2 >= 30 && i2 < 33) {
                        ((MediaCodec) this.d).stop();
                    }
                } finally {
                }
            }
            throw th;
        }
    }

    @Override // defpackage.InterfaceC2235nK
    public ByteBuffer s(int i) {
        return ((MediaCodec) this.d).getOutputBuffer(i);
    }

    public C3246z5(MediaCodec mediaCodec, HandlerThread handlerThread, InterfaceC2578rK interfaceC2578rK) {
        this.d = mediaCodec;
        this.f = new D5(handlerThread);
        this.g = interfaceC2578rK;
        this.b = 0;
    }
}
