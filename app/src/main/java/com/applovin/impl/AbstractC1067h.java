package com.applovin.impl;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* renamed from: com.applovin.impl.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC1067h implements tf {
    private transient Set a;
    private transient Collection b;
    private transient Map c;

    /* renamed from: com.applovin.impl.h$a */
    /* loaded from: classes.dex */
    public class a extends AbstractCollection {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC1067h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC1067h.this.a(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractC1067h.this.f();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractC1067h.this.size();
        }
    }

    @Override // com.applovin.impl.tf
    public Map a() {
        Map map = this.c;
        if (map == null) {
            Map b = b();
            this.c = b;
            return b;
        }
        return map;
    }

    public abstract Map b();

    public abstract Set c();

    public abstract Collection d();

    public Set e() {
        Set set = this.a;
        if (set == null) {
            Set c = c();
            this.a = c;
            return c;
        }
        return set;
    }

    public boolean equals(Object obj) {
        return wf.a(this, obj);
    }

    public abstract Iterator f();

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }

    @Override // com.applovin.impl.tf
    public Collection values() {
        Collection collection = this.b;
        if (collection == null) {
            Collection d = d();
            this.b = d;
            return d;
        }
        return collection;
    }

    public boolean a(Object obj) {
        for (Collection collection : a().values()) {
            if (collection.contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
