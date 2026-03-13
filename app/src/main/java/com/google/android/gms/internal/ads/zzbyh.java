package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbyh implements ThreadFactory {
    private final AtomicInteger zza = new AtomicInteger(1);

    public zzbyh(zzbyi zzbyiVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(@NonNull Runnable runnable) {
        return new Thread(runnable, AbstractC0324Hi.e(this.zza.getAndIncrement(), "AdWorker(SCION_TASK_EXECUTOR) #"));
    }
}
