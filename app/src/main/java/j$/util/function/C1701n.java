package j$.util.function;

import java.util.function.DoubleFunction;
/* renamed from: j$.util.function.n  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1701n implements DoubleFunction {
    public final /* synthetic */ InterfaceC1702o a;

    private /* synthetic */ C1701n(InterfaceC1702o interfaceC1702o) {
        this.a = interfaceC1702o;
    }

    public static /* synthetic */ DoubleFunction a(InterfaceC1702o interfaceC1702o) {
        if (interfaceC1702o == null) {
            return null;
        }
        return interfaceC1702o instanceof C1700m ? ((C1700m) interfaceC1702o).a : new C1701n(interfaceC1702o);
    }

    @Override // java.util.function.DoubleFunction
    public final /* synthetic */ Object apply(double d) {
        return this.a.apply(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC1702o interfaceC1702o = this.a;
        if (obj instanceof C1701n) {
            obj = ((C1701n) obj).a;
        }
        return interfaceC1702o.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
