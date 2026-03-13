package com.fyber.fairbid;

import android.os.Process;
import androidx.annotation.NonNull;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
/* loaded from: classes.dex */
public final class e7 extends ThreadPoolExecutor {
    public static final int a = (Runtime.getRuntime().availableProcessors() * 2) + 1;

    /* loaded from: classes.dex */
    public static class a extends Thread {
        public a(Runnable runnable) {
            super(runnable);
            setName("FyberExecutorThread");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* loaded from: classes.dex */
    public static class b implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@NonNull Runnable runnable) {
            return new a(runnable);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e7() {
        /*
            r8 = this;
            int r2 = com.fyber.fairbid.e7.a
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            com.fyber.fairbid.e7$b r7 = new com.fyber.fairbid.e7$b
            r7.<init>()
            r3 = 0
            r0 = r8
            r1 = r2
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.fairbid.e7.<init>():void");
    }
}
