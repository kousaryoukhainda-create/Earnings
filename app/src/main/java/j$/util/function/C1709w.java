package j$.util.function;

import java.util.function.IntBinaryOperator;
/* renamed from: j$.util.function.w  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1709w implements IntBinaryOperator {
    public final /* synthetic */ InterfaceC1710x a;

    private /* synthetic */ C1709w(InterfaceC1710x interfaceC1710x) {
        this.a = interfaceC1710x;
    }

    public static /* synthetic */ IntBinaryOperator a(InterfaceC1710x interfaceC1710x) {
        if (interfaceC1710x == null) {
            return null;
        }
        return interfaceC1710x instanceof C1708v ? ((C1708v) interfaceC1710x).a : new C1709w(interfaceC1710x);
    }

    @Override // java.util.function.IntBinaryOperator
    public final /* synthetic */ int applyAsInt(int i, int i2) {
        return this.a.applyAsInt(i, i2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1710x interfaceC1710x = this.a;
        if (obj instanceof C1709w) {
            obj = ((C1709w) obj).a;
        }
        return interfaceC1710x.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
