package j$.util.function;

import java.util.function.DoubleToIntFunction;
/* renamed from: j$.util.function.q  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1704q {
    public final /* synthetic */ DoubleToIntFunction a;

    private /* synthetic */ C1704q(DoubleToIntFunction doubleToIntFunction) {
        this.a = doubleToIntFunction;
    }

    public static /* synthetic */ C1704q a(DoubleToIntFunction doubleToIntFunction) {
        if (doubleToIntFunction == null) {
            return null;
        }
        return new C1704q(doubleToIntFunction);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleToIntFunction doubleToIntFunction = this.a;
        if (obj instanceof C1704q) {
            obj = ((C1704q) obj).a;
        }
        return doubleToIntFunction.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
