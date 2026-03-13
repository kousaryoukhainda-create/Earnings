package com.google.android.gms.internal.play_billing;

import com.huawei.hms.framework.common.ContainerUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcp {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzcp(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        String valueOf = String.valueOf(obj3);
        String valueOf2 = String.valueOf(obj2);
        return new IllegalArgumentException(BK.o(BK.q("Multiple entries with same key: ", valueOf, ContainerUtils.KEY_VALUE_DELIMITER, valueOf2, " and "), String.valueOf(obj3), ContainerUtils.KEY_VALUE_DELIMITER, String.valueOf(obj)));
    }
}
