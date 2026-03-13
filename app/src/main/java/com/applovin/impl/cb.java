package com.applovin.impl;

import java.io.Serializable;
/* loaded from: classes.dex */
class cb extends AbstractC1066g implements Serializable {
    final Object a;
    final Object b;

    public cb(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // com.applovin.impl.AbstractC1066g, java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // com.applovin.impl.AbstractC1066g, java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
