package j$.util.function;

import java.util.function.ObjIntConsumer;
/* loaded from: classes4.dex */
public final /* synthetic */ class a0 implements ObjIntConsumer {
    public final /* synthetic */ b0 a;

    private /* synthetic */ a0(b0 b0Var) {
        this.a = b0Var;
    }

    public static /* synthetic */ ObjIntConsumer a(b0 b0Var) {
        if (b0Var == null) {
            return null;
        }
        return b0Var instanceof Z ? ((Z) b0Var).a : new a0(b0Var);
    }

    @Override // java.util.function.ObjIntConsumer
    public final /* synthetic */ void accept(Object obj, int i) {
        this.a.accept(obj, i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        b0 b0Var = this.a;
        if (obj instanceof a0) {
            obj = ((a0) obj).a;
        }
        return b0Var.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
