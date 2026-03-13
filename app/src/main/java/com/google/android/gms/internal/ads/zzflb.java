package com.google.android.gms.internal.ads;

import com.fyber.fairbid.internal.Framework;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
/* loaded from: classes3.dex */
public enum zzflb {
    NATIVE(Framework.NATIVE),
    JAVASCRIPT("javascript"),
    NONE(DevicePublicKeyStringDef.NONE);
    
    private final String zze;

    zzflb(String str) {
        this.zze = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }
}
