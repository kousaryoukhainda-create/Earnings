package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes3.dex */
public final class zzgch extends zzgcj {
    public static zzgcf zza(Iterable iterable) {
        return new zzgcf(false, zzfxn.zzk(iterable), null);
    }

    public static zzgcf zzb(Iterable iterable) {
        return new zzgcf(true, zzfxn.zzk(iterable), null);
    }

    @SafeVarargs
    public static zzgcf zzc(InterfaceFutureC2490qH... interfaceFutureC2490qHArr) {
        return new zzgcf(true, zzfxn.zzm(interfaceFutureC2490qHArr), null);
    }

    public static InterfaceFutureC2490qH zzd(Iterable iterable) {
        return new zzgbp(zzfxn.zzk(iterable), true);
    }

    public static InterfaceFutureC2490qH zze(InterfaceFutureC2490qH interfaceFutureC2490qH, Class cls, zzfuc zzfucVar, Executor executor) {
        zzgav zzgavVar = new zzgav(interfaceFutureC2490qH, cls, zzfucVar);
        interfaceFutureC2490qH.addListener(zzgavVar, zzgcz.zzd(executor, zzgavVar));
        return zzgavVar;
    }

    public static InterfaceFutureC2490qH zzf(InterfaceFutureC2490qH interfaceFutureC2490qH, Class cls, zzgbo zzgboVar, Executor executor) {
        zzgau zzgauVar = new zzgau(interfaceFutureC2490qH, cls, zzgboVar);
        interfaceFutureC2490qH.addListener(zzgauVar, zzgcz.zzd(executor, zzgauVar));
        return zzgauVar;
    }

    public static InterfaceFutureC2490qH zzg(Throwable th) {
        th.getClass();
        return new zzgck(th);
    }

    public static InterfaceFutureC2490qH zzh(Object obj) {
        if (obj == null) {
            return zzgcl.zza;
        }
        return new zzgcl(obj);
    }

    public static InterfaceFutureC2490qH zzi() {
        return zzgcl.zza;
    }

    public static InterfaceFutureC2490qH zzj(Callable callable, Executor executor) {
        zzgdi zzgdiVar = new zzgdi(callable);
        executor.execute(zzgdiVar);
        return zzgdiVar;
    }

    public static InterfaceFutureC2490qH zzk(zzgbn zzgbnVar, Executor executor) {
        zzgdi zzgdiVar = new zzgdi(zzgbnVar);
        executor.execute(zzgdiVar);
        return zzgdiVar;
    }

    @SafeVarargs
    public static InterfaceFutureC2490qH zzl(InterfaceFutureC2490qH... interfaceFutureC2490qHArr) {
        return new zzgbp(zzfxn.zzm(interfaceFutureC2490qHArr), false);
    }

    public static InterfaceFutureC2490qH zzm(InterfaceFutureC2490qH interfaceFutureC2490qH, zzfuc zzfucVar, Executor executor) {
        zzgbd zzgbdVar = new zzgbd(interfaceFutureC2490qH, zzfucVar);
        interfaceFutureC2490qH.addListener(zzgbdVar, zzgcz.zzd(executor, zzgbdVar));
        return zzgbdVar;
    }

    public static InterfaceFutureC2490qH zzn(InterfaceFutureC2490qH interfaceFutureC2490qH, zzgbo zzgboVar, Executor executor) {
        int i = zzgbe.zzc;
        executor.getClass();
        zzgbc zzgbcVar = new zzgbc(interfaceFutureC2490qH, zzgboVar);
        interfaceFutureC2490qH.addListener(zzgbcVar, zzgcz.zzd(executor, zzgbcVar));
        return zzgbcVar;
    }

    public static InterfaceFutureC2490qH zzo(InterfaceFutureC2490qH interfaceFutureC2490qH, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (interfaceFutureC2490qH.isDone()) {
            return interfaceFutureC2490qH;
        }
        return zzgdf.zzf(interfaceFutureC2490qH, j, timeUnit, scheduledExecutorService);
    }

    public static Object zzp(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzgdk.zza(future);
        }
        throw new IllegalStateException(zzfve.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzq(Future future) {
        try {
            return zzgdk.zza(future);
        } catch (ExecutionException e) {
            if (e.getCause() instanceof Error) {
                throw new zzgbw((Error) e.getCause());
            }
            throw new zzgdj(e.getCause());
        }
    }

    public static void zzr(InterfaceFutureC2490qH interfaceFutureC2490qH, zzgcd zzgcdVar, Executor executor) {
        zzgcdVar.getClass();
        interfaceFutureC2490qH.addListener(new zzgce(interfaceFutureC2490qH, zzgcdVar), executor);
    }
}
