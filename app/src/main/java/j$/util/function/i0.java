package j$.util.function;
/* loaded from: classes4.dex */
public final /* synthetic */ class i0 implements Supplier {
    public final /* synthetic */ java.util.function.Supplier a;

    private /* synthetic */ i0(java.util.function.Supplier supplier) {
        this.a = supplier;
    }

    public static /* synthetic */ Supplier a(java.util.function.Supplier supplier) {
        if (supplier == null) {
            return null;
        }
        return supplier instanceof j0 ? ((j0) supplier).a : new i0(supplier);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.function.Supplier supplier = this.a;
        if (obj instanceof i0) {
            obj = ((i0) obj).a;
        }
        return supplier.equals(obj);
    }

    @Override // j$.util.function.Supplier
    public final /* synthetic */ Object get() {
        return this.a.get();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
