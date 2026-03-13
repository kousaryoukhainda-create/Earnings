package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes3.dex */
final class zzhaa implements Iterator {
    final /* synthetic */ zzhad zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzhaa(zzhad zzhadVar, zzhac zzhacVar) {
        this.zza = zzhadVar;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = zzhad.zzh(this.zza).entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb + 1;
        zzhad zzhadVar = this.zza;
        if (i < zzhad.zzb(zzhadVar)) {
            return true;
        }
        if (!zzhad.zzh(zzhadVar).isEmpty() && zza().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        zzhad zzhadVar = this.zza;
        if (i < zzhad.zzb(zzhadVar)) {
            return (zzgzz) zzhad.zzk(zzhadVar)[i];
        }
        return (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.zzc) {
            this.zzc = false;
            zzhad.zzi(this.zza);
            int i = this.zzb;
            zzhad zzhadVar = this.zza;
            if (i < zzhad.zzb(zzhadVar)) {
                this.zzb = i - 1;
                zzhad.zze(zzhadVar, i);
                return;
            }
            zza().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
