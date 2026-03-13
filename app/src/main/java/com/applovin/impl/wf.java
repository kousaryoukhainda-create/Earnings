package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.applovin.exoplayer2.common.base.Supplier;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class wf {

    /* loaded from: classes.dex */
    public static class a extends AbstractC1064e {
        transient Supplier g;

        public a(Map map, Supplier supplier) {
            super(map);
            this.g = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.applovin.impl.AbstractC1067h
        public Map b() {
            return h();
        }

        @Override // com.applovin.impl.AbstractC1067h
        public Set c() {
            return i();
        }

        @Override // com.applovin.impl.AbstractC1065f
        /* renamed from: j */
        public List g() {
            return (List) this.g.get();
        }
    }

    public static boolean a(tf tfVar, Object obj) {
        if (obj == tfVar) {
            return true;
        }
        if (obj instanceof tf) {
            return tfVar.a().equals(((tf) obj).a());
        }
        return false;
    }

    public static ec a(Map map, Supplier supplier) {
        return new a(map, supplier);
    }
}
