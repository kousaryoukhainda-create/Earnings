package com.google.android.gms.tagmanager;

import java.util.Map;
/* loaded from: classes3.dex */
abstract class zzfs extends zzbt {
    public zzfs(String str, String... strArr) {
        super(str, strArr);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        zzc(map);
        return zzfu.zza();
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public boolean zzb() {
        return false;
    }

    public abstract void zzc(Map map);
}
