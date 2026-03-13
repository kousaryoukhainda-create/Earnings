package j$.util.function;

import java.util.function.DoubleFunction;
/* renamed from: j$.util.function.m  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1700m implements InterfaceC1702o {
    public final /* synthetic */ DoubleFunction a;

    private /* synthetic */ C1700m(DoubleFunction doubleFunction) {
        this.a = doubleFunction;
    }

    public static /* synthetic */ InterfaceC1702o a(DoubleFunction doubleFunction) {
        if (doubleFunction == null) {
            return null;
        }
        return doubleFunction instanceof C1701n ? ((C1701n) doubleFunction).a : new C1700m(doubleFunction);
    }

    @Override // j$.util.function.InterfaceC1702o
    public final /* synthetic */ Object apply(double d) {
        return this.a.apply(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleFunction doubleFunction = this.a;
        if (obj instanceof C1700m) {
            obj = ((C1700m) obj).a;
        }
        return doubleFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
