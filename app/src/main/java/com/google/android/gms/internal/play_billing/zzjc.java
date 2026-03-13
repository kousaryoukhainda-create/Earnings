package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes3.dex */
final class zzjc implements Iterator {
    final /* synthetic */ zzjf zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzjc(zzjf zzjfVar, zzje zzjeVar) {
        this.zza = zzjfVar;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = zzjf.zzh(this.zza).entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb + 1;
        zzjf zzjfVar = this.zza;
        if (i < zzjf.zzb(zzjfVar)) {
            return true;
        }
        if (!zzjf.zzh(zzjfVar).isEmpty() && zza().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        zzjf zzjfVar = this.zza;
        if (i < zzjf.zzb(zzjfVar)) {
            return (zzjb) zzjf.zzk(zzjfVar)[i];
        }
        return (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.zzc) {
            this.zzc = false;
            zzjf.zzi(this.zza);
            int i = this.zzb;
            zzjf zzjfVar = this.zza;
            if (i < zzjf.zzb(zzjfVar)) {
                this.zzb = i - 1;
                zzjf.zze(zzjfVar, i);
                return;
            }
            zza().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
