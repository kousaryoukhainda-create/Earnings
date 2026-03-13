package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzand  reason: invalid package */
/* loaded from: classes3.dex */
final class zzand implements Iterator {
    private int zza;
    private boolean zzb;
    private Iterator zzc;
    private final /* synthetic */ zzamw zzd;

    private final Iterator zza() {
        Map map;
        if (this.zzc == null) {
            map = this.zzd.zzc;
            this.zzc = map.entrySet().iterator();
        }
        return this.zzc;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        Map map;
        int i2 = this.zza + 1;
        i = this.zzd.zzb;
        if (i2 >= i) {
            map = this.zzd.zzc;
            if (map.isEmpty() || !zza().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i;
        Object[] objArr;
        this.zzb = true;
        int i2 = this.zza + 1;
        this.zza = i2;
        i = this.zzd.zzb;
        if (i2 < i) {
            objArr = this.zzd.zza;
            return (zzana) objArr[this.zza];
        }
        return (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        if (this.zzb) {
            this.zzb = false;
            this.zzd.zzg();
            int i2 = this.zza;
            i = this.zzd.zzb;
            if (i2 < i) {
                zzamw zzamwVar = this.zzd;
                int i3 = this.zza;
                this.zza = i3 - 1;
                zzamwVar.zzb(i3);
                return;
            }
            zza().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    private zzand(zzamw zzamwVar) {
        this.zzd = zzamwVar;
        this.zza = -1;
    }
}
