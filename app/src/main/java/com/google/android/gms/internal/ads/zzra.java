package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes3.dex */
public final class zzra {
    public final int zza;
    public final zzug zzb;
    private final CopyOnWriteArrayList zzc;

    private zzra(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzug zzugVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzugVar;
    }

    public final zzra zza(int i, zzug zzugVar) {
        return new zzra(this.zzc, 0, zzugVar);
    }

    public final void zzb(Handler handler, zzrb zzrbVar) {
        this.zzc.add(new zzqz(handler, zzrbVar));
    }

    public final void zzc(zzrb zzrbVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzqz zzqzVar = (zzqz) it.next();
            if (zzqzVar.zza == zzrbVar) {
                this.zzc.remove(zzqzVar);
            }
        }
    }

    public zzra() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
