package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.zzbcl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class zzcb {
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final Context zzc;

    public zzcb(Context context) {
        this.zzc = context;
    }

    public final synchronized void zzb(String str) {
        SharedPreferences sharedPreferences;
        try {
            if (this.zza.containsKey(str)) {
                return;
            }
            if (Objects.equals(str, "__default__")) {
                sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.zzc);
            } else {
                sharedPreferences = this.zzc.getSharedPreferences(str, 0);
            }
            zzca zzcaVar = new zzca(this, str);
            this.zza.put(str, zzcaVar);
            sharedPreferences.registerOnSharedPreferenceChangeListener(zzcaVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void zzc() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkm)).booleanValue()) {
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        Map zzw = zzs.zzw((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkr));
        for (String str : zzw.keySet()) {
            zzb(str);
        }
        zzd(new zzbz(zzw));
    }

    public final synchronized void zzd(zzbz zzbzVar) {
        this.zzb.add(zzbzVar);
    }
}
