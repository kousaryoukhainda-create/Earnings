package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;
/* loaded from: classes.dex */
public interface o0 extends p0 {

    /* loaded from: classes.dex */
    public interface a extends p0, Cloneable {
    }

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();

    i toByteString();

    void writeTo(l lVar) throws IOException;
}
