package com.google.android.gms.tagmanager;

import java.util.Map;
/* loaded from: classes3.dex */
final class zzea extends zzbt {
    private static final String zza = com.google.android.gms.internal.gtm.zza.RANDOM.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.MIN.toString();
    private static final String zzc = com.google.android.gms.internal.gtm.zzb.MAX.toString();

    public zzea() {
        super(zza, new String[0]);
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final com.google.android.gms.internal.gtm.zzam zza(Map map) {
        com.google.android.gms.internal.gtm.zzam zzamVar = (com.google.android.gms.internal.gtm.zzam) map.get(zzb);
        com.google.android.gms.internal.gtm.zzam zzamVar2 = (com.google.android.gms.internal.gtm.zzam) map.get(zzc);
        double d = 0.0d;
        double d2 = 2.147483647E9d;
        if (zzamVar != null && zzamVar != zzfu.zza() && zzamVar2 != null && zzamVar2 != zzfu.zza()) {
            zzft zzd = zzfu.zzd(zzfu.zzk(zzamVar));
            zzft zzd2 = zzfu.zzd(zzfu.zzk(zzamVar2));
            if (zzd != zzfu.zzc() && zzd2 != zzfu.zzc()) {
                double doubleValue = zzd.doubleValue();
                double doubleValue2 = zzd2.doubleValue();
                if (doubleValue <= doubleValue2) {
                    d = doubleValue;
                    d2 = doubleValue2;
                }
            }
        }
        return zzfu.zzb(Long.valueOf(Math.round(((d2 - d) * Math.random()) + d)));
    }

    @Override // com.google.android.gms.tagmanager.zzbt
    public final boolean zzb() {
        return false;
    }
}
