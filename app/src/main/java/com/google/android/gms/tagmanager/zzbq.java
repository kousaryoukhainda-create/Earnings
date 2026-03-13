package com.google.android.gms.tagmanager;

import java.util.Map;
/* loaded from: classes3.dex */
final class zzbq extends zzfk {
    private static final String zza = com.google.android.gms.internal.gtm.zza.ENDS_WITH.toString();

    public zzbq() {
        super(zza);
    }

    @Override // com.google.android.gms.tagmanager.zzfk
    public final boolean zzc(String str, String str2, Map map) {
        return str.endsWith(str2);
    }
}
