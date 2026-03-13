package defpackage;

import java.io.Serializable;
/* renamed from: UE  reason: default package */
/* loaded from: classes.dex */
public enum UE {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(C0291Gb.class, C0291Gb.d),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    UE(Class cls, Serializable serializable) {
    }
}
