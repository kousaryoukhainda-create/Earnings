package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class a0 extends b0 {

    /* loaded from: classes.dex */
    public static class a<K> implements Map.Entry<K, Object> {
        public Map.Entry<K, a0> a;

        public a(Map.Entry<K, a0> entry) {
            this.a = entry;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            a0 value = this.a.getValue();
            if (value == null) {
                return null;
            }
            return value.a(null);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof o0) {
                a0 value = this.a.getValue();
                o0 o0Var = value.a;
                value.b = null;
                value.a = (o0) obj;
                return o0Var;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* loaded from: classes.dex */
    public static class b<K> implements Iterator<Map.Entry<K, Object>> {
        public Iterator<Map.Entry<K, Object>> a;

        public b(Iterator<Map.Entry<K, Object>> it) {
            this.a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            Map.Entry<K, Object> next = this.a.next();
            if (next.getValue() instanceof a0) {
                return new a(next);
            }
            return next;
        }

        @Override // java.util.Iterator
        public void remove() {
            this.a.remove();
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public boolean equals(Object obj) {
        return a(null).equals(obj);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b0
    public int hashCode() {
        return a(null).hashCode();
    }

    public String toString() {
        return a(null).toString();
    }
}
