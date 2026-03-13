package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes3.dex */
final class zzob implements Iterator {
    final /* synthetic */ zzod zza;
    private int zzb;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzob(zzod zzodVar, byte[] bArr) {
        Objects.requireNonNull(zzodVar);
        this.zza = zzodVar;
        this.zzb = -1;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzk().entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb + 1;
        zzod zzodVar = this.zza;
        if (i < zzodVar.zzj()) {
            return true;
        }
        if (!zzodVar.zzk().isEmpty() && zza().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        zzod zzodVar = this.zza;
        if (i < zzodVar.zzj()) {
            return (zzoa) zzodVar.zzi()[i];
        }
        return (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.zzc) {
            this.zzc = false;
            zzod zzodVar = this.zza;
            zzodVar.zzh();
            int i = this.zzb;
            if (i < zzodVar.zzj()) {
                this.zzb = i - 1;
                zzodVar.zzg(i);
                return;
            }
            zza().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
