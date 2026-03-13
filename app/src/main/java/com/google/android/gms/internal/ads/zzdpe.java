package com.google.android.gms.internal.ads;

import android.content.Context;
/* loaded from: classes3.dex */
public final class zzdpe implements zzcwo {
    private final zzcex zza;

    public zzdpe(zzcex zzcexVar) {
        this.zza = zzcexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void zzdh(Context context) {
        zzcex zzcexVar = this.zza;
        if (zzcexVar != null) {
            zzcexVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void zzdj(Context context) {
        zzcex zzcexVar = this.zza;
        if (zzcexVar != null) {
            zzcexVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwo
    public final void zzdk(Context context) {
        zzcex zzcexVar = this.zza;
        if (zzcexVar != null) {
            zzcexVar.onResume();
        }
    }
}
