package com.google.android.gms.tagmanager;

import android.os.Build;
import java.util.Map;
/* loaded from: classes3.dex */
final class zzds extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.OS_VERSION.toString();

    public zzds() {
        super(zza, new String[0]);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        return zzfu.zzb(Build.VERSION.RELEASE);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return true;
    }
}
