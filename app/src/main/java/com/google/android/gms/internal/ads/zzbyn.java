package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzbyn {
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final Context zzc;
    private final zzbxz zzd;

    public zzbyn(Context context, zzbxz zzbxzVar) {
        this.zzc = context;
        this.zzd = zzbxzVar;
    }

    public final /* synthetic */ void zzb(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.zzd.zzd();
        }
    }

    public final synchronized void zzc(String str) {
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
            zzbym zzbymVar = new zzbym(this, str);
            this.zza.put(str, zzbymVar);
            sharedPreferences.registerOnSharedPreferenceChangeListener(zzbymVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd(zzbyl zzbylVar) {
        this.zzb.add(zzbylVar);
    }
}
