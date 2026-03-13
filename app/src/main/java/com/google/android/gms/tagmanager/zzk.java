package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.Map;
/* loaded from: classes3.dex */
final class zzk extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.APP_VERSION.toString();
    private final Context zzb;

    public zzk(Context context) {
        super(zza, new String[0]);
        this.zzb = context;
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        try {
            return zzfu.zzb(Integer.valueOf(this.zzb.getPackageManager().getPackageInfo(this.zzb.getPackageName(), 0).versionCode));
        } catch (PackageManager.NameNotFoundException e) {
            String packageName = this.zzb.getPackageName();
            String message = e.getMessage();
            Log.e("GoogleTagManager", "Package name " + packageName + " not found. " + message);
            return zzfu.zza();
        }
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return true;
    }
}
