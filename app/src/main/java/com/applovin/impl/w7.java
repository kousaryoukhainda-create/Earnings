package com.applovin.impl;

import java.nio.ByteBuffer;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class w7 extends dk {
    public v7 a(ah ahVar) {
        return new v7((String) b1.a((Object) ahVar.t()), (String) b1.a((Object) ahVar.t()), ahVar.s(), ahVar.s(), Arrays.copyOfRange(ahVar.c(), ahVar.d(), ahVar.e()));
    }

    @Override // com.applovin.impl.dk
    public af a(df dfVar, ByteBuffer byteBuffer) {
        return new af(a(new ah(byteBuffer.array(), byteBuffer.limit())));
    }
}
