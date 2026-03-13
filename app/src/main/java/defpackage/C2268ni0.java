package defpackage;

import j$.util.function.BiFunction;
import j$.util.function.Function;
/* renamed from: ni0  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2268ni0 implements BiFunction {
    @Override // j$.util.function.BiFunction
    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    @Override // j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        C2875ul0 c2875ul0 = (C2875ul0) obj;
        C2875ul0 c2875ul02 = (C2875ul0) obj2;
        if (c2875ul0.b < c2875ul02.b) {
            return c2875ul02;
        }
        return c2875ul0;
    }
}
