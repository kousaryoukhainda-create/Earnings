package com.google.android.gms.internal.p002firebaseauthapi;

import com.huawei.hms.framework.common.ContainerUtils;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzap  reason: invalid package */
/* loaded from: classes3.dex */
final class zzap {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzap(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        String valueOf = String.valueOf(this.zza);
        String valueOf2 = String.valueOf(this.zzb);
        return new IllegalArgumentException(BK.o(BK.q("Multiple entries with same key: ", valueOf, ContainerUtils.KEY_VALUE_DELIMITER, valueOf2, " and "), String.valueOf(this.zza), ContainerUtils.KEY_VALUE_DELIMITER, String.valueOf(this.zzc)));
    }
}
