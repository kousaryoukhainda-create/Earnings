package com.google.android.gms.analytics;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes3.dex */
final class zzp implements ThreadFactory {
    private static final AtomicInteger zza = new AtomicInteger();

    private zzp() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new zzq(runnable, AbstractC0324Hi.e(zza.incrementAndGet(), "measurement-"));
    }

    public /* synthetic */ zzp(zzo zzoVar) {
    }
}
