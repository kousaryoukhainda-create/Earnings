package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
@ShowFirstParty
/* loaded from: classes3.dex */
public final class zzbb extends com.google.android.gms.analytics.zzj {
    private final Map zza = new HashMap();

    public final String toString() {
        return com.google.android.gms.analytics.zzj.zza(this.zza);
    }

    @Override // com.google.android.gms.analytics.zzj
    public final /* bridge */ /* synthetic */ void zzc(com.google.android.gms.analytics.zzj zzjVar) {
        zzbb zzbbVar = (zzbb) zzjVar;
        Preconditions.checkNotNull(zzbbVar);
        zzbbVar.zza.putAll(this.zza);
    }

    public final Map zzd() {
        return Collections.unmodifiableMap(this.zza);
    }

    public final void zze(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        if (str != null && str.startsWith(ContainerUtils.FIELD_DELIMITER)) {
            str = str.substring(1);
        }
        Preconditions.checkNotEmpty(str, "Name can not be empty or \"&\"");
        this.zza.put(str, str2);
    }
}
