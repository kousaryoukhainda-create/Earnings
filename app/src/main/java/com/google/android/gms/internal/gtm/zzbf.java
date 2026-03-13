package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ShowFirstParty;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.HashMap;
@ShowFirstParty
/* loaded from: classes3.dex */
public final class zzbf extends com.google.android.gms.analytics.zzj {
    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("description", null);
        hashMap.put(Constants.FATAL, Boolean.FALSE);
        return com.google.android.gms.analytics.zzj.zza(hashMap);
    }

    @Override // com.google.android.gms.analytics.zzj
    public final /* bridge */ /* synthetic */ void zzc(com.google.android.gms.analytics.zzj zzjVar) {
        zzbf zzbfVar = (zzbf) zzjVar;
        TextUtils.isEmpty(null);
    }
}
