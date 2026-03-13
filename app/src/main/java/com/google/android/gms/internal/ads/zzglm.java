package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
/* loaded from: classes3.dex */
public final class zzglm {
    private HashMap zza = new HashMap();

    public final zzglo zza() {
        if (this.zza != null) {
            zzglo zzgloVar = new zzglo(Collections.unmodifiableMap(this.zza), null);
            this.zza = null;
            return zzgloVar;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
