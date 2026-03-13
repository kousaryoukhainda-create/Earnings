package defpackage;

import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
/* renamed from: e5  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1243e5 extends Z10 implements Map, j$.util.Map {
    public Z4 j;
    public C0911b5 k;
    public C1158d5 l;

    public C1243e5() {
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
    public final Set entrySet() {
        Z4 z4 = this.j;
        if (z4 == null) {
            Z4 z42 = new Z4(this, 0);
            this.j = z42;
            return z42;
        }
        return z4;
    }

    @Override // java.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0911b5 c0911b5 = this.k;
        if (c0911b5 == null) {
            C0911b5 c0911b52 = new C0911b5(this);
            this.k = c0911b52;
            return c0911b52;
        }
        return c0911b5;
    }

    public final boolean l(Collection collection) {
        int i = this.d;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(h(i2))) {
                i(i2);
            }
        }
        if (i != this.d) {
            return true;
        }
        return false;
    }

    public final Object[] m(int i, Object[] objArr) {
        int i2 = this.d;
        if (objArr.length < i2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = this.c[(i3 << 1) + i];
        }
        if (objArr.length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        b(map.size() + this.d);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map
    public final Collection values() {
        C1158d5 c1158d5 = this.l;
        if (c1158d5 == null) {
            C1158d5 c1158d52 = new C1158d5(this);
            this.l = c1158d52;
            return c1158d52;
        }
        return c1158d5;
    }

    public C1243e5(int i) {
        if (i == 0) {
            this.b = AbstractC1906jZ.c;
            this.c = AbstractC1906jZ.d;
        } else {
            a(i);
        }
        this.d = 0;
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

    @Override // j$.util.Map
    public final /* synthetic */ void replaceAll(j$.util.function.BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }
}
