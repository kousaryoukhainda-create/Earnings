package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes3.dex */
final class zzgzs implements Iterator {
    private final ArrayDeque zza;
    private zzgwf zzb;

    public /* synthetic */ zzgzs(zzgwj zzgwjVar, zzgzt zzgztVar) {
        zzgwj zzgwjVar2;
        if (zzgwjVar instanceof zzgzu) {
            zzgzu zzgzuVar = (zzgzu) zzgwjVar;
            ArrayDeque arrayDeque = new ArrayDeque(zzgzuVar.zzf());
            this.zza = arrayDeque;
            arrayDeque.push(zzgzuVar);
            zzgwjVar2 = zzgzuVar.zzd;
            this.zzb = zzb(zzgwjVar2);
            return;
        }
        this.zza = null;
        this.zzb = (zzgwf) zzgwjVar;
    }

    private final zzgwf zzb(zzgwj zzgwjVar) {
        while (zzgwjVar instanceof zzgzu) {
            zzgzu zzgzuVar = (zzgzu) zzgwjVar;
            this.zza.push(zzgzuVar);
            zzgwjVar = zzgzuVar.zzd;
        }
        return (zzgwf) zzgwjVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: zza */
    public final zzgwf next() {
        zzgwf zzgwfVar;
        zzgwj zzgwjVar;
        zzgwf zzgwfVar2 = this.zzb;
        if (zzgwfVar2 != null) {
            do {
                ArrayDeque arrayDeque = this.zza;
                zzgwfVar = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    break;
                }
                zzgwjVar = ((zzgzu) this.zza.pop()).zze;
                zzgwfVar = zzb(zzgwjVar);
            } while (zzgwfVar.zzd() == 0);
            this.zzb = zzgwfVar;
            return zzgwfVar2;
        }
        throw new NoSuchElementException();
    }
}
