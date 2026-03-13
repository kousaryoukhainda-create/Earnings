package j$.util.function;

import j$.util.function.BiFunction;
import java.util.Comparator;
/* renamed from: j$.util.function.c  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1690c implements BinaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Comparator b;

    public /* synthetic */ C1690c(Comparator comparator, int i) {
        this.a = i;
        this.b = comparator;
    }

    @Override // j$.util.function.BiFunction
    public final /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
            case 0:
                return BiFunction.CC.$default$andThen(this, function);
            default:
                return BiFunction.CC.$default$andThen(this, function);
        }
    }

    @Override // j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return this.b.compare(obj, obj2) >= 0 ? obj : obj2;
            default:
                return this.b.compare(obj, obj2) <= 0 ? obj : obj2;
        }
    }
}
