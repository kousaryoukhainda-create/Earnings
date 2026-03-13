package defpackage;

import java.io.Serializable;
/* renamed from: VE  reason: default package */
/* loaded from: classes.dex */
public enum VE {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(C0317Hb.class, C0317Hb.d),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    VE(Class cls, Serializable serializable) {
    }
}
