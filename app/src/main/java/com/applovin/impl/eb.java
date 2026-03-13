package com.applovin.impl;

import com.applovin.impl.fb;
import com.applovin.impl.gb;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class eb extends gb implements ec {

    /* loaded from: classes.dex */
    public static final class a extends gb.b {
        @Override // com.applovin.impl.gb.b
        /* renamed from: b */
        public a a(Object obj, Iterable iterable) {
            super.a(obj, iterable);
            return this;
        }

        public eb c() {
            return (eb) super.a();
        }

        public a b(Object obj, Object... objArr) {
            super.a(obj, objArr);
            return this;
        }
    }

    public eb(fb fbVar, int i) {
        super(fbVar, i);
    }

    public static eb a(Collection collection, Comparator comparator) {
        db a2;
        if (collection.isEmpty()) {
            return l();
        }
        fb.a aVar = new fb.a(collection.size());
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Collection collection2 = (Collection) entry.getValue();
            if (comparator == null) {
                a2 = db.a(collection2);
            } else {
                a2 = db.a(comparator, (Iterable) collection2);
            }
            if (!a2.isEmpty()) {
                aVar.a(key, a2);
                i += a2.size();
            }
        }
        return new eb(aVar.a(), i);
    }

    public static a k() {
        return new a();
    }

    public static eb l() {
        return q7.g;
    }

    public db b(Object obj) {
        db dbVar = (db) this.d.get(obj);
        if (dbVar == null) {
            return db.h();
        }
        return dbVar;
    }
}
