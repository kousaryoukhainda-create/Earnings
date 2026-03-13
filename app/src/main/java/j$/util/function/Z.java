package j$.util.function;

import java.util.function.ObjIntConsumer;
/* loaded from: classes4.dex */
public final /* synthetic */ class Z implements b0 {
    public final /* synthetic */ ObjIntConsumer a;

    private /* synthetic */ Z(ObjIntConsumer objIntConsumer) {
        this.a = objIntConsumer;
    }

    public static /* synthetic */ b0 a(ObjIntConsumer objIntConsumer) {
        if (objIntConsumer == null) {
            return null;
        }
        return objIntConsumer instanceof a0 ? ((a0) objIntConsumer).a : new Z(objIntConsumer);
    }

    @Override // j$.util.function.b0
    public final /* synthetic */ void accept(Object obj, int i) {
        this.a.accept(obj, i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        ObjIntConsumer objIntConsumer = this.a;
        if (obj instanceof Z) {
            obj = ((Z) obj).a;
        }
        return objIntConsumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
