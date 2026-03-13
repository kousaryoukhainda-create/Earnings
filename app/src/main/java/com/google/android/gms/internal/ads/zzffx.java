package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;
/* loaded from: classes3.dex */
public final class zzffx {
    public static final zzfgd zza(Callable callable, Object obj, zzfgf zzfgfVar) {
        zzgcs zzgcsVar;
        zzgcsVar = zzfgfVar.zzb;
        return zzb(callable, zzgcsVar, obj, zzfgfVar);
    }

    public static final zzfgd zzb(Callable callable, zzgcs zzgcsVar, Object obj, zzfgf zzfgfVar) {
        InterfaceFutureC2490qH interfaceFutureC2490qH;
        interfaceFutureC2490qH = zzfgf.zza;
        return new zzfgd(zzfgfVar, obj, interfaceFutureC2490qH, Collections.emptyList(), zzgcsVar.zzb(callable));
    }

    public static final zzfgd zzc(InterfaceFutureC2490qH interfaceFutureC2490qH, Object obj, zzfgf zzfgfVar) {
        InterfaceFutureC2490qH interfaceFutureC2490qH2;
        interfaceFutureC2490qH2 = zzfgf.zza;
        return new zzfgd(zzfgfVar, obj, interfaceFutureC2490qH2, Collections.emptyList(), interfaceFutureC2490qH);
    }

    public static final zzfgd zzd(final zzffs zzffsVar, zzgcs zzgcsVar, Object obj, zzfgf zzfgfVar) {
        return zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzffw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzffs.this.zza();
                return null;
            }
        }, zzgcsVar, obj, zzfgfVar);
    }
}
