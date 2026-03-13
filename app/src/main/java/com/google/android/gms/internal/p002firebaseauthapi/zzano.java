package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzano  reason: invalid package */
/* loaded from: classes3.dex */
abstract class zzano<T, B> {
    private static volatile int zza = 100;

    public abstract int zza(T t);

    public abstract B zza();

    public abstract T zza(T t, T t2);

    public abstract void zza(B b, int i, int i2);

    public abstract void zza(B b, int i, long j);

    public abstract void zza(B b, int i, zzajp zzajpVar);

    public abstract void zza(B b, int i, T t);

    public abstract void zza(T t, zzaof zzaofVar) throws IOException;

    public abstract boolean zza(zzams zzamsVar);

    public final boolean zza(B b, zzams zzamsVar, int i) throws IOException {
        int zzd = zzamsVar.zzd();
        int i2 = zzd >>> 3;
        int i3 = zzd & 7;
        if (i3 == 0) {
            zzb(b, i2, zzamsVar.zzl());
            return true;
        } else if (i3 == 1) {
            zza((zzano<T, B>) b, i2, zzamsVar.zzk());
            return true;
        } else if (i3 == 2) {
            zza((zzano<T, B>) b, i2, zzamsVar.zzp());
            return true;
        } else if (i3 != 3) {
            if (i3 == 4) {
                if (i != 0) {
                    return false;
                }
                throw zzalf.zzb();
            } else if (i3 == 5) {
                zza((zzano<T, B>) b, i2, zzamsVar.zzf());
                return true;
            } else {
                throw zzalf.zza();
            }
        } else {
            B zza2 = zza();
            int i4 = 4 | (i2 << 3);
            int i5 = i + 1;
            if (i5 < zza) {
                while (zzamsVar.zzc() != Integer.MAX_VALUE && zza((zzano<T, B>) zza2, zzamsVar, i5)) {
                }
                if (i4 == zzamsVar.zzd()) {
                    zza((zzano<T, B>) b, i2, (int) zze(zza2));
                    return true;
                }
                throw zzalf.zzb();
            }
            throw zzalf.zzh();
        }
    }

    public abstract int zzb(T t);

    public abstract void zzb(B b, int i, long j);

    public abstract void zzb(T t, zzaof zzaofVar) throws IOException;

    public abstract void zzb(Object obj, B b);

    public abstract B zzc(Object obj);

    public abstract void zzc(Object obj, T t);

    public abstract T zzd(Object obj);

    public abstract T zze(B b);

    public abstract void zzf(Object obj);
}
