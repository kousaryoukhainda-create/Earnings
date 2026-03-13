package com.fyber.inneractive.sdk.protobuf;
/* loaded from: classes.dex */
public final class v0 {
    public static final t0 a;
    public static final t0 b;

    static {
        t0 t0Var = null;
        try {
            t0Var = (t0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = t0Var;
        b = new u0();
    }
}
