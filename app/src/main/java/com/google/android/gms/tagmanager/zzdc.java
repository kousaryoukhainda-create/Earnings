package com.google.android.gms.tagmanager;

import java.util.Map;
/* loaded from: classes3.dex */
final class zzdc extends zzdq {
    private static final String zza = com.google.android.gms.internal.gtm.zza.LESS_EQUALS.toString();

    public zzdc() {
        super(zza);
    }

    @Override // com.google.android.gms.tagmanager.zzdq
    public final boolean zzc(zzft zzftVar, zzft zzftVar2, Map map) {
        if (zzftVar.compareTo(zzftVar2) <= 0) {
            return true;
        }
        return false;
    }
}
