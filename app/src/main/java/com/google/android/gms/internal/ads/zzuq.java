package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes3.dex */
public final class zzuq {
    public final int zza;
    public final zzug zzb;
    private final CopyOnWriteArrayList zzc;

    private zzuq(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzug zzugVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzugVar;
    }

    public final zzuq zza(int i, zzug zzugVar) {
        return new zzuq(this.zzc, 0, zzugVar);
    }

    public final void zzb(Handler handler, zzur zzurVar) {
        this.zzc.add(new zzup(handler, zzurVar));
    }

    public final void zzc(final zzdb zzdbVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzup zzupVar = (zzup) it.next();
            final zzur zzurVar = zzupVar.zzb;
            Handler handler = zzupVar.zza;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzuo
                @Override // java.lang.Runnable
                public final void run() {
                    zzdb.this.zza(zzurVar);
                }
            };
            int i = zzei.zza;
            if (handler.getLooper().getThread().isAlive()) {
                if (handler.getLooper() == Looper.myLooper()) {
                    runnable.run();
                } else {
                    handler.post(runnable);
                }
            }
        }
    }

    public final void zzd(final zzuc zzucVar) {
        zzc(new zzdb() { // from class: com.google.android.gms.internal.ads.zzuj
            @Override // com.google.android.gms.internal.ads.zzdb
            public final void zza(Object obj) {
                ((zzur) obj).zzaf(0, zzuq.this.zzb, zzucVar);
            }
        });
    }

    public final void zze(final zztx zztxVar, final zzuc zzucVar) {
        zzc(new zzdb() { // from class: com.google.android.gms.internal.ads.zzun
            @Override // com.google.android.gms.internal.ads.zzdb
            public final void zza(Object obj) {
                ((zzur) obj).zzag(0, zzuq.this.zzb, zztxVar, zzucVar);
            }
        });
    }

    public final void zzf(final zztx zztxVar, final zzuc zzucVar) {
        zzc(new zzdb() { // from class: com.google.android.gms.internal.ads.zzul
            @Override // com.google.android.gms.internal.ads.zzdb
            public final void zza(Object obj) {
                ((zzur) obj).zzah(0, zzuq.this.zzb, zztxVar, zzucVar);
            }
        });
    }

    public final void zzg(final zztx zztxVar, final zzuc zzucVar, final IOException iOException, final boolean z) {
        zzc(new zzdb() { // from class: com.google.android.gms.internal.ads.zzum
            @Override // com.google.android.gms.internal.ads.zzdb
            public final void zza(Object obj) {
                ((zzur) obj).zzai(0, zzuq.this.zzb, zztxVar, zzucVar, iOException, z);
            }
        });
    }

    public final void zzh(final zztx zztxVar, final zzuc zzucVar) {
        zzc(new zzdb() { // from class: com.google.android.gms.internal.ads.zzuk
            @Override // com.google.android.gms.internal.ads.zzdb
            public final void zza(Object obj) {
                ((zzur) obj).zzaj(0, zzuq.this.zzb, zztxVar, zzucVar);
            }
        });
    }

    public final void zzi(zzur zzurVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzup zzupVar = (zzup) it.next();
            if (zzupVar.zzb == zzurVar) {
                this.zzc.remove(zzupVar);
            }
        }
    }

    public zzuq() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
