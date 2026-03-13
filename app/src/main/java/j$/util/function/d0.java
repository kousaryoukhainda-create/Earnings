package j$.util.function;

import java.util.function.ObjLongConsumer;
/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements ObjLongConsumer {
    public final /* synthetic */ e0 a;

    private /* synthetic */ d0(e0 e0Var) {
        this.a = e0Var;
    }

    public static /* synthetic */ ObjLongConsumer a(e0 e0Var) {
        if (e0Var == null) {
            return null;
        }
        return e0Var instanceof c0 ? ((c0) e0Var).a : new d0(e0Var);
    }

    @Override // java.util.function.ObjLongConsumer
    public final /* synthetic */ void accept(Object obj, long j) {
        this.a.accept(obj, j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        e0 e0Var = this.a;
        if (obj instanceof d0) {
            obj = ((d0) obj).a;
        }
        return e0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
