package com.google.android.gms.internal.ads;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.LinkedHashMap;
/* loaded from: classes3.dex */
public class zzhem {
    final LinkedHashMap zza;

    public zzhem(int i) {
        this.zza = zzheo.zzb(i);
    }

    public final zzhem zza(Object obj, zzhfa zzhfaVar) {
        zzhez.zza(obj, Constants.KEY);
        zzhez.zza(zzhfaVar, "provider");
        this.zza.put(obj, zzhfaVar);
        return this;
    }
}
