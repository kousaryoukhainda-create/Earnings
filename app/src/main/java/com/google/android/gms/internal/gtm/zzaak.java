package com.google.android.gms.internal.gtm;

import java.io.IOException;
/* loaded from: classes3.dex */
abstract class zzaak {
    public abstract int zza(Object obj);

    public abstract int zzb(Object obj);

    public abstract Object zzc(Object obj);

    public abstract Object zzd(Object obj);

    public abstract Object zze(Object obj, Object obj2);

    public abstract Object zzf();

    public abstract Object zzg(Object obj);

    public abstract void zzh(Object obj, int i, int i2);

    public abstract void zzi(Object obj, int i, long j);

    public abstract void zzj(Object obj, int i, Object obj2);

    public abstract void zzk(Object obj, int i, zzud zzudVar);

    public abstract void zzl(Object obj, int i, long j);

    public abstract void zzm(Object obj);

    public abstract void zzn(Object obj, Object obj2);

    public abstract void zzo(Object obj, Object obj2);

    public final boolean zzp(Object obj, zzzs zzzsVar) throws IOException {
        int zzd = zzzsVar.zzd();
        int i = zzd >>> 3;
        int i2 = zzd & 7;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                zzh(obj, i, zzzsVar.zzf());
                                return true;
                            }
                            throw zzyg.zza();
                        }
                        return false;
                    }
                    Object zzf = zzf();
                    int i3 = i << 3;
                    while (zzzsVar.zzc() != Integer.MAX_VALUE && zzp(zzf, zzzsVar)) {
                    }
                    if ((4 | i3) == zzzsVar.zzd()) {
                        zzg(zzf);
                        zzj(obj, i, zzf);
                        return true;
                    }
                    throw zzyg.zzb();
                }
                zzk(obj, i, zzzsVar.zzp());
                return true;
            }
            zzi(obj, i, zzzsVar.zzk());
            return true;
        }
        zzl(obj, i, zzzsVar.zzl());
        return true;
    }

    public abstract boolean zzq(zzzs zzzsVar);

    public abstract void zzr(Object obj, zzur zzurVar) throws IOException;

    public abstract void zzs(Object obj, zzur zzurVar) throws IOException;
}
