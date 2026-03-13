package j$.util.function;

import java.util.function.ObjLongConsumer;
/* loaded from: classes4.dex */
public final /* synthetic */ class c0 implements e0 {
    public final /* synthetic */ ObjLongConsumer a;

    private /* synthetic */ c0(ObjLongConsumer objLongConsumer) {
        this.a = objLongConsumer;
    }

    public static /* synthetic */ e0 a(ObjLongConsumer objLongConsumer) {
        if (objLongConsumer == null) {
            return null;
        }
        return objLongConsumer instanceof d0 ? ((d0) objLongConsumer).a : new c0(objLongConsumer);
    }

    @Override // j$.util.function.e0
    public final /* synthetic */ void accept(Object obj, long j) {
        this.a.accept(obj, j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        ObjLongConsumer objLongConsumer = this.a;
        if (obj instanceof c0) {
            obj = ((c0) obj).a;
        }
        return objLongConsumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
