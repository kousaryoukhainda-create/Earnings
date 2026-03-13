package com.google.android.gms.internal.consent_sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;
/* loaded from: classes3.dex */
public final class zzcl {
    public static zzcj zza(Context context, String str) {
        String str2;
        String str3;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("/", -1);
            int length = split.length;
            if (length == 1) {
                String valueOf = String.valueOf(context.getPackageName());
                str3 = split[0];
                str2 = valueOf.concat("_preferences");
            } else if (length == 2) {
                str2 = split[0];
                str3 = split[1];
            } else {
                return null;
            }
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                return new zzcj(str2, str3);
            }
            return null;
        }
        return null;
    }

    public static void zzb(Context context, Set set) {
        SharedPreferences.Editor zzd;
        zzck zzckVar = new zzck(context);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            zzcj zza = zza(context, str);
            if (zza == null) {
                Log.d("UserMessagingPlatform", "clearKeys: unable to process key: ".concat(String.valueOf(str)));
            } else {
                zzd = zzckVar.zzd(zza.zza);
                zzd.remove(zza.zzb);
            }
        }
        zzckVar.zzb();
    }
}
