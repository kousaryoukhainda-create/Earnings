package com.fyber.inneractive.sdk.protobuf;
/* loaded from: classes.dex */
public final class t {
    public static final r<?> a = new s();
    public static final r<?> b;

    static {
        r<?> rVar = null;
        try {
            rVar = (r) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = rVar;
    }
}
