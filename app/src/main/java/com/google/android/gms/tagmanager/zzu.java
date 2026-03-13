package com.google.android.gms.tagmanager;

import com.google.android.gms.tagmanager.Container;
import java.util.Map;
/* loaded from: classes3.dex */
final class zzu implements zzap {
    final /* synthetic */ Container zza;

    @Override // com.google.android.gms.tagmanager.zzap
    public final Object zza(String str, Map map) {
        Container.FunctionCallMacroCallback zza = this.zza.zza(str);
        if (zza == null) {
            return null;
        }
        return zza.getValue(str, map);
    }
}
