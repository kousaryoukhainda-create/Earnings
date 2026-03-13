package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes3.dex */
final class zzkz extends zzla {
    final /* synthetic */ zzlg zza;
    private int zzb;
    private final int zzc;

    public zzkz(zzlg zzlgVar) {
        Objects.requireNonNull(zzlgVar);
        this.zza = zzlgVar;
        this.zzb = 0;
        this.zzc = zzlgVar.zzc();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzlc
    public final byte zza() {
        int i = this.zzb;
        if (i < this.zzc) {
            this.zzb = i + 1;
            return this.zza.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
