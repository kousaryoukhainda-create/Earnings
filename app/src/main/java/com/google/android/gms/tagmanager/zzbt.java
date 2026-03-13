package com.google.android.gms.tagmanager;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzbt {
    private final Set zzr;
    private final String zzs;

    public zzbt(String str, String... strArr) {
        this.zzs = str;
        this.zzr = new HashSet(strArr.length);
        for (String str2 : strArr) {
            this.zzr.add(str2);
        }
    }

    public abstract com.google.android.gms.internal.gtm.zzam zza(Map map);

    public abstract boolean zzb();

    public final String zze() {
        return this.zzs;
    }

    public final Set zzf() {
        return this.zzr;
    }

    public final boolean zzg(Set set) {
        return set.containsAll(this.zzr);
    }
}
