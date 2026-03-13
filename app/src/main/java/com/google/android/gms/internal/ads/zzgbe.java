package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzgbe extends zzgbx implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    InterfaceFutureC2490qH zza;
    Object zzb;

    public zzgbe(InterfaceFutureC2490qH interfaceFutureC2490qH, Object obj) {
        interfaceFutureC2490qH.getClass();
        this.zza = interfaceFutureC2490qH;
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        InterfaceFutureC2490qH interfaceFutureC2490qH = this.zza;
        Object obj = this.zzb;
        boolean isCancelled = isCancelled();
        boolean z2 = true;
        if (interfaceFutureC2490qH == null) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = isCancelled | z;
        if (obj != null) {
            z2 = false;
        }
        if (z3 | z2) {
            return;
        }
        this.zza = null;
        if (interfaceFutureC2490qH.isCancelled()) {
            zzs(interfaceFutureC2490qH);
            return;
        }
        try {
            try {
                Object zze = zze(obj, zzgch.zzp(interfaceFutureC2490qH));
                this.zzb = null;
                zzf(zze);
            } catch (Throwable th) {
                try {
                    zzgda.zza(th);
                    zzd(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e) {
            zzd(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            zzd(e2.getCause());
        } catch (Exception e3) {
            zzd(e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final String zza() {
        String str;
        InterfaceFutureC2490qH interfaceFutureC2490qH = this.zza;
        Object obj = this.zzb;
        String zza = super.zza();
        if (interfaceFutureC2490qH != null) {
            str = AbstractC2437ph.h("inputFuture=[", interfaceFutureC2490qH.toString(), "], ");
        } else {
            str = "";
        }
        if (obj != null) {
            return BK.m(str, "function=[", obj.toString(), "]");
        }
        if (zza != null) {
            return str.concat(zza);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zzb() {
        zzr(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    public abstract Object zze(Object obj, Object obj2) throws Exception;

    public abstract void zzf(Object obj);
}
