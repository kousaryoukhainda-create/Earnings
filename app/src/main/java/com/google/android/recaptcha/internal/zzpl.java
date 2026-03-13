package com.google.android.recaptcha.internal;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzpl {
    private static volatile int zza = 100;

    public abstract Object zza(Object obj);

    public abstract Object zzb();

    public abstract Object zzc(Object obj);

    public abstract void zzd(Object obj, int i, int i2);

    public abstract void zze(Object obj, int i, long j);

    public abstract void zzf(Object obj, int i, Object obj2);

    public abstract void zzg(Object obj, int i, zzle zzleVar);

    public abstract void zzh(Object obj, int i, long j);

    public abstract void zzi(Object obj);

    public abstract void zzj(Object obj, Object obj2);

    public final boolean zzk(Object obj, zzov zzovVar, int i) throws IOException {
        int zzd = zzovVar.zzd();
        int i2 = zzd >>> 3;
        int i3 = zzd & 7;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 == 5) {
                                zzd(obj, i2, zzovVar.zzf());
                                return true;
                            }
                            throw new zznm("Protocol message tag had invalid wire type.");
                        }
                        return false;
                    }
                    Object zzb = zzb();
                    int i4 = i2 << 3;
                    int i5 = i + 1;
                    if (i5 < zza) {
                        while (zzovVar.zzc() != Integer.MAX_VALUE && zzk(zzb, zzovVar, i5)) {
                        }
                        if ((i4 | 4) == zzovVar.zzd()) {
                            zzf(obj, i2, zzc(zzb));
                            return true;
                        }
                        throw new zznn("Protocol message end-group tag did not match expected tag.");
                    }
                    throw new zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
                zzg(obj, i2, zzovVar.zzp());
                return true;
            }
            zze(obj, i2, zzovVar.zzk());
            return true;
        }
        zzh(obj, i2, zzovVar.zzl());
        return true;
    }
}
