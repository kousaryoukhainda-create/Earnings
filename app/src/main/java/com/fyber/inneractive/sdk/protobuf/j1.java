package com.fyber.inneractive.sdk.protobuf;
/* loaded from: classes.dex */
public class j1 extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public j1() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }
}
