package j$.util.function;

import java.util.function.ObjDoubleConsumer;
/* loaded from: classes4.dex */
public final /* synthetic */ class W implements Y {
    public final /* synthetic */ ObjDoubleConsumer a;

    private /* synthetic */ W(ObjDoubleConsumer objDoubleConsumer) {
        this.a = objDoubleConsumer;
    }

    public static /* synthetic */ Y a(ObjDoubleConsumer objDoubleConsumer) {
        if (objDoubleConsumer == null) {
            return null;
        }
        return objDoubleConsumer instanceof X ? ((X) objDoubleConsumer).a : new W(objDoubleConsumer);
    }

    @Override // j$.util.function.Y
    public final /* synthetic */ void accept(Object obj, double d) {
        this.a.accept(obj, d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        ObjDoubleConsumer objDoubleConsumer = this.a;
        if (obj instanceof W) {
            obj = ((W) obj).a;
        }
        return objDoubleConsumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
