package com.fyber.inneractive.sdk.protobuf;
/* loaded from: classes.dex */
public final class l0 {
    public static final j0 a;
    public static final j0 b;

    static {
        j0 j0Var = null;
        try {
            j0Var = (j0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = j0Var;
        b = new k0();
    }
}
