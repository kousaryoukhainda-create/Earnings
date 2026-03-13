package com.google.android.gms.tagmanager;

import android.content.Context;
import java.util.Map;
/* loaded from: classes3.dex */
final class zzcv extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.INSTALL_REFERRER.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.COMPONENT.toString();
    private final Context zzc;

    public zzcv(Context context) {
        super(zza, new String[0]);
        this.zzc = context;
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        String str;
        String str2 = zzb;
        if (((com.google.android.gms.internal.gtm.zzam) map.get(str2)) != null) {
            str = zzfu.zzm(zzfu.zzk((com.google.android.gms.internal.gtm.zzam) map.get(str2)));
        } else {
            str = null;
        }
        String zzb2 = zzcw.zzb(this.zzc, str);
        if (zzb2 != null) {
            return zzfu.zzb(zzb2);
        }
        return zzfu.zza();
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return true;
    }
}
