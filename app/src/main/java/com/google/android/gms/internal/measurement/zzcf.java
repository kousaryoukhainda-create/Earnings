package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
/* loaded from: classes3.dex */
public final class zzcf {
    private static final ThreadLocal zza = new zzce();

    public static SharedPreferences zza(Context context, String str, int i, zzca zzcaVar) {
        zzcd zzcdVar;
        zzbv.zza();
        if (str.equals("")) {
            zzcdVar = new zzcd();
        } else {
            zzcdVar = null;
        }
        if (zzcdVar != null) {
            return zzcdVar;
        }
        ThreadLocal threadLocal = zza;
        if (((Boolean) threadLocal.get()).booleanValue()) {
            threadLocal.set(Boolean.FALSE);
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
                threadLocal.set(Boolean.TRUE);
                return sharedPreferences;
            } catch (Throwable th) {
                zza.set(Boolean.TRUE);
                throw th;
            }
        }
        throw new IllegalArgumentException();
    }
}
