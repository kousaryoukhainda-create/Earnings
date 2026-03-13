package defpackage;

import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
/* renamed from: uD  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2829uD implements Map, Serializable, j$.util.Map {
    public transient HV b;
    public transient IV c;
    public transient JV d;

    public static C1150d1 a() {
        return new C1150d1(4);
    }

    public static AbstractC2829uD b(Map map) {
        int i;
        if ((map instanceof AbstractC2829uD) && !(map instanceof SortedMap)) {
            AbstractC2829uD abstractC2829uD = (AbstractC2829uD) map;
            abstractC2829uD.getClass();
            return abstractC2829uD;
        }
        Set entrySet = map.entrySet();
        if (entrySet instanceof Collection) {
            i = entrySet.size();
        } else {
            i = 4;
        }
        C1150d1 c1150d1 = new C1150d1(i);
        c1150d1.m(entrySet);
        return c1150d1.b();
    }

    @Override // java.util.Map
    /* renamed from: c */
    public final AbstractC3001wD entrySet() {
        HV hv = this.b;
        if (hv == null) {
            KV kv = (KV) this;
            HV hv2 = new HV(kv, kv.g, kv.h);
            this.b = hv2;
            return hv2;
        }
        return hv;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, Function.VivifiedWrapper.convert(function));
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* renamed from: d */
    public final AbstractC3001wD keySet() {
        IV iv = this.c;
        if (iv == null) {
            KV kv = (KV) this;
            IV iv2 = new IV(kv, new JV(kv.g, 0, kv.h));
            this.c = iv2;
            return iv2;
        }
        return iv;
    }

    @Override // java.util.Map
    /* renamed from: e */
    public final AbstractC2056lD values() {
        JV jv = this.d;
        if (jv == null) {
            KV kv = (KV) this;
            JV jv2 = new JV(kv.g, 1, kv.h);
            this.d = jv2;
            return jv2;
        }
        return jv;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return AbstractC1281eb.v(this, obj);
    }

    @Override // java.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC2870uj.G(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (((KV) this).size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final String toString() {
        int i = ((KV) this).h;
        AbstractC1906jZ.n(i, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(i * 8, 1073741824L));
        sb.append('{');
        H90 n = ((HV) entrySet()).n();
        boolean z = true;
        while (true) {
            C2400pD c2400pD = (C2400pD) n;
            if (c2400pD.hasNext()) {
                Map.Entry entry = (Map.Entry) c2400pD.next();
                if (!z) {
                    sb.append(", ");
                }
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
                z = false;
            } else {
                sb.append('}');
                return sb.toString();
            }
        }
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object compute(Object obj, j$.util.function.BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, j$.util.function.Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, j$.util.function.BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // j$.util.Map
    public final /* synthetic */ void forEach(j$.util.function.BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, j$.util.function.BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public final /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // j$.util.Map
    public final /* synthetic */ void replaceAll(j$.util.function.BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }
}
