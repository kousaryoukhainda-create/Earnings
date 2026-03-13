package com.google.android.gms.internal.ads;

import com.huawei.hms.support.api.entity.auth.AuthCode;
import java.io.IOException;
/* loaded from: classes3.dex */
public final class zzqy extends IOException {
    public final int zza;

    public zzqy(Throwable th, int i) {
        super(th);
        this.zza = AuthCode.StatusCode.WAITING_CONNECT;
    }
}
