package com.google.android.gms.internal.ads;

import java.util.Iterator;
/* loaded from: classes3.dex */
final class zzheh implements Iterator {
    int zza = 0;
    final /* synthetic */ zzhei zzb;

    public zzheh(zzhei zzheiVar) {
        this.zzb = zzheiVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zza >= this.zzb.zza.size() && !this.zzb.zzb.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza < this.zzb.zza.size()) {
            zzhei zzheiVar = this.zzb;
            int i = this.zza;
            this.zza = i + 1;
            return zzheiVar.zza.get(i);
        }
        zzhei zzheiVar2 = this.zzb;
        zzheiVar2.zza.add(zzheiVar2.zzb.next());
        return next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
