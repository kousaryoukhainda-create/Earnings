package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbaz extends zzcab {
    final /* synthetic */ zzbbf zza;

    public zzbaz(zzbbf zzbbfVar) {
        this.zza = zzbbfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcab, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        zzbbf.zze(this.zza);
        return super.cancel(z);
    }
}
