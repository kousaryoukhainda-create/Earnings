package com.google.android.gms.tagmanager;

import com.google.android.gms.tagmanager.Container;
import java.util.Map;
/* loaded from: classes3.dex */
final class zzw implements zzap {
    final /* synthetic */ Container zza;

    @Override // com.google.android.gms.tagmanager.zzap
    public final Object zza(String str, Map map) {
        Container.FunctionCallTagCallback zzb = this.zza.zzb(str);
        if (zzb != null) {
            zzb.execute(str, map);
        }
        return zzfu.zzl();
    }
}
