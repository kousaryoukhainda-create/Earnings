package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
/* loaded from: classes3.dex */
final class zzfxw extends zzfzt {
    private final Object zza;
    private boolean zzb;

    public zzfxw(Object obj) {
        this.zza = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zzb;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.zzb) {
            this.zzb = true;
            return this.zza;
        }
        throw new NoSuchElementException();
    }
}
