package com.google.android.gms.internal.ads;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzhah {
    private static volatile int zza = 100;

    public abstract Object zza(Object obj);

    public abstract Object zzb();

    public abstract Object zzc(Object obj);

    public abstract void zzd(Object obj, int i, int i2);

    public abstract void zze(Object obj, int i, long j);

    public abstract void zzf(Object obj, int i, Object obj2);

    public abstract void zzg(Object obj, int i, zzgwj zzgwjVar);

    public abstract void zzh(Object obj, int i, long j);

    public abstract void zzi(Object obj);

    public abstract void zzj(Object obj, Object obj2);

    public final boolean zzk(Object obj, zzgzp zzgzpVar, int i) throws IOException {
        int zzd = zzgzpVar.zzd();
        int i2 = zzd >>> 3;
        int i3 = zzd & 7;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 == 5) {
                                zzd(obj, i2, zzgzpVar.zzf());
                                return true;
                            }
                            throw new zzgyf("Protocol message tag had invalid wire type.");
                        }
                        return false;
                    }
                    Object zzb = zzb();
                    int i4 = i2 << 3;
                    int i5 = i + 1;
                    if (i5 < zza) {
                        while (zzgzpVar.zzc() != Integer.MAX_VALUE && zzk(zzb, zzgzpVar, i5)) {
                        }
                        if ((i4 | 4) == zzgzpVar.zzd()) {
                            zzf(obj, i2, zzc(zzb));
                            return true;
                        }
                        throw new zzgyg("Protocol message end-group tag did not match expected tag.");
                    }
                    throw new zzgyg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
                zzg(obj, i2, zzgzpVar.zzp());
                return true;
            }
            zze(obj, i2, zzgzpVar.zzk());
            return true;
        }
        zzh(obj, i2, zzgzpVar.zzl());
        return true;
    }
}
