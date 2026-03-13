package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
/* loaded from: classes3.dex */
public final class zzbce {
    public static final SharedPreferences zza(Context context) {
        try {
            return context.getSharedPreferences("google_ads_flags", 0);
        } catch (IllegalStateException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("", e);
            return null;
        }
    }
}
