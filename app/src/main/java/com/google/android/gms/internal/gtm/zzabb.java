package com.google.android.gms.internal.gtm;
/* loaded from: classes3.dex */
public enum zzabb {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzud.zzb),
    ENUM(null),
    MESSAGE(null);
    
    private final Object zzk;

    zzabb(Object obj) {
        this.zzk = obj;
    }
}
