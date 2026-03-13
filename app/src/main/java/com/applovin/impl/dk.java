package com.applovin.impl;

import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public abstract class dk implements bf {
    @Override // com.applovin.impl.bf
    public final af a(df dfVar) {
        ByteBuffer byteBuffer = (ByteBuffer) b1.a(dfVar.c);
        b1.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (dfVar.d()) {
            return null;
        }
        return a(dfVar, byteBuffer);
    }

    public abstract af a(df dfVar, ByteBuffer byteBuffer);
}
