package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
final class zzjp extends zzjk {
    final /* synthetic */ Iterable zza;
    final /* synthetic */ int zzb;

    public zzjp(Iterable iterable, int i) {
        this.zza = iterable;
        this.zzb = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        boolean z;
        Iterable iterable = this.zza;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.zzb), list.size()).iterator();
        }
        int i = this.zzb;
        Iterator it = iterable.iterator();
        it.getClass();
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        zzjf.zzb(z, "numberToAdvance must be nonnegative");
        for (int i2 = 0; i2 < i && it.hasNext(); i2++) {
            it.next();
        }
        return new zzjo(this, it);
    }
}
