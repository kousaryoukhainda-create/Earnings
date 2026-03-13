package com.google.android.gms.tagmanager;

import android.content.Context;
import android.provider.Settings;
import java.util.Map;
/* loaded from: classes3.dex */
final class zzdi extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.MOBILE_ADWORDS_UNIQUE_ID.toString();
    private final Context zzb;

    public zzdi(Context context) {
        super(zza, new String[0]);
        this.zzb = context;
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        String string = Settings.Secure.getString(this.zzb.getContentResolver(), "android_id");
        if (string == null) {
            return zzfu.zza();
        }
        return zzfu.zzb(string);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return true;
    }
}
