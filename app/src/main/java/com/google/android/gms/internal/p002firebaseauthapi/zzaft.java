package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.util.DefaultClock;
import java.util.Map;
import java.util.concurrent.Executor;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaft  reason: invalid package */
/* loaded from: classes3.dex */
public final class zzaft {
    private static final Map<String, zzafv> zza = new Z10();

    public static AbstractC2156mR zza(String str, AbstractC2156mR abstractC2156mR, zzaex zzaexVar) {
        zza(str, zzaexVar);
        return new zzafs(abstractC2156mR, str);
    }

    public static void zza() {
        zza.clear();
    }

    private static void zza(String str, zzaex zzaexVar) {
        zza.put(str, new zzafv(zzaexVar, DefaultClock.getInstance().currentTimeMillis()));
    }

    public static boolean zza(String str, AbstractC2156mR abstractC2156mR, Activity activity, Executor executor) {
        Map<String, zzafv> map = zza;
        if (map.containsKey(str)) {
            zzafv zzafvVar = map.get(str);
            if (DefaultClock.getInstance().currentTimeMillis() - zzafvVar.zzb < 120000) {
                zzaex zzaexVar = zzafvVar.zza;
                if (zzaexVar != null) {
                    zzaexVar.zza(abstractC2156mR, activity, executor, str);
                    return true;
                }
                return true;
            }
            zza(str, null);
            return false;
        }
        zza(str, null);
        return false;
    }
}
