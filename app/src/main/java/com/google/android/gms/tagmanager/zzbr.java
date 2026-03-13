package com.google.android.gms.tagmanager;

import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.Map;
@ShowFirstParty
/* loaded from: classes3.dex */
public final class zzbr extends zzfk {
    private static final String zza = com.google.android.gms.internal.gtm.zza.EQUALS.toString();

    public zzbr() {
        super(zza);
    }

    @Override // com.google.android.gms.tagmanager.zzfk
    public final boolean zzc(String str, String str2, Map map) {
        return str.equals(str2);
    }
}
