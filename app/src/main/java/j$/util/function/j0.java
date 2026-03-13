package j$.util.function;
/* loaded from: classes4.dex */
public final /* synthetic */ class j0 implements java.util.function.Supplier {
    public final /* synthetic */ Supplier a;

    private /* synthetic */ j0(Supplier supplier) {
        this.a = supplier;
    }

    public static /* synthetic */ java.util.function.Supplier a(Supplier supplier) {
        if (supplier == null) {
            return null;
        }
        return supplier instanceof i0 ? ((i0) supplier).a : new j0(supplier);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Supplier supplier = this.a;
        if (obj instanceof j0) {
            obj = ((j0) obj).a;
        }
        return supplier.equals(obj);
    }

    @Override // java.util.function.Supplier
    public final /* synthetic */ Object get() {
        return this.a.get();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
