package com.applovin.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1064e extends AbstractC1065f implements ec {
    public AbstractC1064e(Map map) {
        super(map);
    }

    @Override // com.applovin.impl.AbstractC1067h, com.applovin.impl.tf
    public Map a() {
        return super.a();
    }

    @Override // com.applovin.impl.AbstractC1065f
    public Collection c(Collection collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // com.applovin.impl.AbstractC1067h
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.applovin.impl.AbstractC1065f, com.applovin.impl.tf
    public boolean put(Object obj, Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.applovin.impl.AbstractC1065f
    public Collection a(Object obj, Collection collection) {
        return a(obj, (List) collection, null);
    }
}
