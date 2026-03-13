package com.google.android.gms.auth.api.signin.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
@KeepForSdk
/* loaded from: classes3.dex */
public class HashAccumulator {
    private int zaa = 1;

    @NonNull
    @KeepForSdk
    public HashAccumulator addObject(Object obj) {
        int hashCode;
        int i = this.zaa * 31;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        this.zaa = i + hashCode;
        return this;
    }

    @KeepForSdk
    public int hash() {
        return this.zaa;
    }

    @NonNull
    public final HashAccumulator zaa(boolean z) {
        this.zaa = (this.zaa * 31) + (z ? 1 : 0);
        return this;
    }
}
