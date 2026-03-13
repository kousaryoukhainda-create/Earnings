package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
/* loaded from: classes3.dex */
public abstract class zzgbb extends AbstractExecutorService implements zzgcs {
    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return zzgdi.zze(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (InterfaceFutureC2490qH) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    public final InterfaceFutureC2490qH zza(Runnable runnable) {
        return (InterfaceFutureC2490qH) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzgcs
    public final InterfaceFutureC2490qH zzb(Callable callable) {
        return (InterfaceFutureC2490qH) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new zzgdi(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (InterfaceFutureC2490qH) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (InterfaceFutureC2490qH) super.submit(callable);
    }
}
