package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
/* loaded from: classes3.dex */
final class zzcy implements zzdf {
    private final Iterator zza;
    private boolean zzb;
    private Object zzc;

    public zzcy(Iterator it) {
        it.getClass();
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.zzb && !this.zza.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdf, java.util.Iterator
    public final Object next() {
        if (!this.zzb) {
            return this.zza.next();
        }
        Object obj = this.zzc;
        this.zzb = false;
        this.zzc = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzb) {
            this.zza.remove();
            return;
        }
        throw new IllegalStateException("Can't remove after you've peeked at next");
    }

    @Override // com.google.android.gms.internal.play_billing.zzdf
    public final Object zza() {
        if (!this.zzb) {
            this.zzc = this.zza.next();
            this.zzb = true;
        }
        return this.zzc;
    }
}
