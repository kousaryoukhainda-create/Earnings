package com.google.android.gms.ads.mediation.customevent;

import androidx.annotation.NonNull;
import java.util.HashMap;
@Deprecated
/* loaded from: classes3.dex */
public final class CustomEventExtras {
    private final HashMap zza = new HashMap();

    public Object getExtra(@NonNull String str) {
        return this.zza.get(str);
    }

    public void setExtra(@NonNull String str, @NonNull Object obj) {
        this.zza.put(str, obj);
    }
}
