package com.fyber.inneractive.sdk.protobuf;
/* loaded from: classes.dex */
public final class p {
    public static final Class<?> a;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        a = cls;
    }
}
