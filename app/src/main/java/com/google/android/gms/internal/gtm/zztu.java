package com.google.android.gms.internal.gtm;

import java.util.NoSuchElementException;
/* loaded from: classes3.dex */
final class zztu extends zztw {
    final /* synthetic */ zzud zza;
    private int zzb = 0;
    private final int zzc;

    public zztu(zzud zzudVar) {
        this.zza = zzudVar;
        this.zzc = zzudVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzty
    public final byte zza() {
        int i = this.zzb;
        if (i < this.zzc) {
            this.zzb = i + 1;
            return this.zza.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
