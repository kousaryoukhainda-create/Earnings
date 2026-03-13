package com.google.android.gms.analytics.ecommerce;

import androidx.annotation.NonNull;
import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public class Promotion {
    @NonNull
    public static final String ACTION_CLICK = "click";
    @NonNull
    public static final String ACTION_VIEW = "view";
    final Map zza = new HashMap();

    @NonNull
    public Promotion setCreative(@NonNull String str) {
        zzb("cr", str);
        return this;
    }

    @NonNull
    public Promotion setId(@NonNull String str) {
        zzb("id", str);
        return this;
    }

    @NonNull
    public Promotion setName(@NonNull String str) {
        zzb("nm", str);
        return this;
    }

    @NonNull
    public Promotion setPosition(@NonNull String str) {
        zzb("ps", str);
        return this;
    }

    @NonNull
    public String toString() {
        return zzj.zzb(this.zza);
    }

    @NonNull
    public final Map zza(@NonNull String str) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.zza.entrySet()) {
            hashMap.put(str.concat(String.valueOf((String) entry.getKey())), (String) entry.getValue());
        }
        return hashMap;
    }

    public final void zzb(String str, String str2) {
        Preconditions.checkNotNull(str, "Name should be non-null");
        this.zza.put(str, str2);
    }
}
