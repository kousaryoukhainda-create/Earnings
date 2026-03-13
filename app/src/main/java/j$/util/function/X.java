package j$.util.function;

import java.util.function.ObjDoubleConsumer;
/* loaded from: classes4.dex */
public final /* synthetic */ class X implements ObjDoubleConsumer {
    public final /* synthetic */ Y a;

    private /* synthetic */ X(Y y) {
        this.a = y;
    }

    public static /* synthetic */ ObjDoubleConsumer a(Y y) {
        if (y == null) {
            return null;
        }
        return y instanceof W ? ((W) y).a : new X(y);
    }

    @Override // java.util.function.ObjDoubleConsumer
    public final /* synthetic */ void accept(Object obj, double d) {
        this.a.accept(obj, d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Y y = this.a;
        if (obj instanceof X) {
            obj = ((X) obj).a;
        }
        return y.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
