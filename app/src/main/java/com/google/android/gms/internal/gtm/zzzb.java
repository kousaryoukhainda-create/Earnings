package com.google.android.gms.internal.gtm;
/* loaded from: classes3.dex */
final class zzzb {
    public static final boolean zza(Object obj) {
        if (!((zzza) obj).zze()) {
            return true;
        }
        return false;
    }

    public static final Object zzb(Object obj, Object obj2) {
        zzza zzzaVar = (zzza) obj;
        zzza zzzaVar2 = (zzza) obj2;
        if (!zzzaVar2.isEmpty()) {
            if (!zzzaVar.zze()) {
                zzzaVar = zzzaVar.zzb();
            }
            zzzaVar.zzd(zzzaVar2);
        }
        return zzzaVar;
    }
}
