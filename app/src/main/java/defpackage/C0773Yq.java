package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* renamed from: Yq  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0773Yq {
    public static final Object j = new Object();
    public static volatile C0773Yq k;
    public final ReentrantReadWriteLock a;
    public final C1415g5 b;
    public volatile int c;
    public final Handler d;
    public final M2 e;
    public final InterfaceC0747Xq f;
    public final C0539Pq g;
    public final int h;
    public final C2706sn i;

    public C0773Yq(C1145cy c1145cy) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        InterfaceC0747Xq interfaceC0747Xq = (InterfaceC0747Xq) c1145cy.b;
        this.f = interfaceC0747Xq;
        int i = c1145cy.a;
        this.h = i;
        this.i = (C2706sn) c1145cy.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new C1415g5(0);
        this.g = new C0539Pq(28);
        M2 m2 = new M2(this);
        this.e = m2;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                interfaceC0747Xq.a(new C0669Uq(m2));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static C0773Yq a() {
        C0773Yq c0773Yq;
        boolean z;
        synchronized (j) {
            try {
                c0773Yq = k;
                if (c0773Yq != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return c0773Yq;
    }

    public final int b() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void c() {
        boolean z;
        if (this.h == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (b() == 1) {
                return;
            }
            this.a.writeLock().lock();
            try {
                if (this.c == 0) {
                    return;
                }
                this.c = 0;
                this.a.writeLock().unlock();
                M2 m2 = this.e;
                C0773Yq c0773Yq = (C0773Yq) m2.a;
                try {
                    c0773Yq.f.a(new C0669Uq(m2));
                    return;
                } catch (Throwable th) {
                    c0773Yq.d(th);
                    return;
                }
            } finally {
                this.a.writeLock().unlock();
            }
        }
        throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new RunnableC0758Yb(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x009e A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:32:0x005c, B:35:0x0061, B:37:0x0065, B:39:0x0072, B:44:0x008e, B:46:0x0098, B:48:0x009b, B:50:0x009e, B:52:0x00ae, B:53:0x00b1, B:56:0x00c0, B:59:0x00c7, B:61:0x00e0, B:42:0x0084), top: B:80:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0 A[Catch: all -> 0x0081, TRY_LEAVE, TryCatch #0 {all -> 0x0081, blocks: (B:32:0x005c, B:35:0x0061, B:37:0x0065, B:39:0x0072, B:44:0x008e, B:46:0x0098, B:48:0x009b, B:50:0x009e, B:52:0x00ae, B:53:0x00b1, B:56:0x00c0, B:59:0x00c7, B:61:0x00e0, B:42:0x0084), top: B:80:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00eb  */
    /* JADX WARN: Type inference failed for: r0v6, types: [O90, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence e(java.lang.CharSequence r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0773Yq.e(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public final void f(AbstractC0721Wq abstractC0721Wq) {
        Wh0.q(abstractC0721Wq, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c != 1 && this.c != 2) {
                this.b.add(abstractC0721Wq);
                this.a.writeLock().unlock();
            }
            this.d.post(new RunnableC0758Yb(Arrays.asList(abstractC0721Wq), this.c, (Throwable) null));
            this.a.writeLock().unlock();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }
}
