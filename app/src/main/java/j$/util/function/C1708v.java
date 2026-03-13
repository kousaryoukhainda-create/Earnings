package j$.util.function;

import java.util.function.IntBinaryOperator;
/* renamed from: j$.util.function.v  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1708v implements InterfaceC1710x {
    public final /* synthetic */ IntBinaryOperator a;

    private /* synthetic */ C1708v(IntBinaryOperator intBinaryOperator) {
        this.a = intBinaryOperator;
    }

    public static /* synthetic */ InterfaceC1710x a(IntBinaryOperator intBinaryOperator) {
        if (intBinaryOperator == null) {
            return null;
        }
        return intBinaryOperator instanceof C1709w ? ((C1709w) intBinaryOperator).a : new C1708v(intBinaryOperator);
    }

    @Override // j$.util.function.InterfaceC1710x
    public final /* synthetic */ int applyAsInt(int i, int i2) {
        return this.a.applyAsInt(i, i2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntBinaryOperator intBinaryOperator = this.a;
        if (obj instanceof C1708v) {
            obj = ((C1708v) obj).a;
        }
        return intBinaryOperator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
