package j$.util.function;

import j$.util.function.BiConsumer;
/* renamed from: j$.util.function.a */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1688a implements java.util.function.BiConsumer {
    public final /* synthetic */ BiConsumer a;

    private /* synthetic */ C1688a(BiConsumer biConsumer) {
        this.a = biConsumer;
    }

    public static /* synthetic */ java.util.function.BiConsumer a(BiConsumer biConsumer) {
        if (biConsumer == null) {
            return null;
        }
        return biConsumer instanceof BiConsumer.VivifiedWrapper ? ((BiConsumer.VivifiedWrapper) biConsumer).a : new C1688a(biConsumer);
    }

    @Override // java.util.function.BiConsumer
    public final /* synthetic */ void accept(Object obj, Object obj2) {
        this.a.accept(obj, obj2);
    }

    @Override // java.util.function.BiConsumer
    public final /* synthetic */ java.util.function.BiConsumer andThen(java.util.function.BiConsumer biConsumer) {
        return a(this.a.andThen(BiConsumer.VivifiedWrapper.convert(biConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BiConsumer biConsumer = this.a;
        if (obj instanceof C1688a) {
            obj = ((C1688a) obj).a;
        }
        return biConsumer.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
