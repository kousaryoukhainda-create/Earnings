package com.applovin.impl;

import java.util.List;
/* loaded from: classes.dex */
public final class i7 extends ek {
    private final j7 o;

    public i7(List list) {
        super("DvbDecoder");
        ah ahVar = new ah((byte[]) list.get(0));
        this.o = new j7(ahVar.C(), ahVar.C());
    }

    @Override // com.applovin.impl.ek
    public nl a(byte[] bArr, int i, boolean z) {
        if (z) {
            this.o.d();
        }
        return new k7(this.o.a(bArr, i));
    }
}
