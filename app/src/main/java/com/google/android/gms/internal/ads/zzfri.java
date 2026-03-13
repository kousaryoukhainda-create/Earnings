package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzfri extends zzgax {
    Object zza;

    public zzfri(Object obj, Runnable runnable) {
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final String zza() {
        Object obj = this.zza;
        if (obj == null) {
            return "";
        }
        return obj.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zzb() {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final boolean zzc(Object obj) {
        return super.zzc(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final boolean zzd(Throwable th) {
        return super.zzd(th);
    }
}
