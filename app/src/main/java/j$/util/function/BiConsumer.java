package j$.util.function;

import java.util.Objects;
/* loaded from: classes4.dex */
public interface BiConsumer<T, U> {

    /* loaded from: classes4.dex */
    public final /* synthetic */ class VivifiedWrapper implements BiConsumer {
        public final /* synthetic */ java.util.function.BiConsumer a;

        private /* synthetic */ VivifiedWrapper(java.util.function.BiConsumer biConsumer) {
            this.a = biConsumer;
        }

        public static /* synthetic */ BiConsumer convert(java.util.function.BiConsumer biConsumer) {
            if (biConsumer == null) {
                return null;
            }
            return biConsumer instanceof C1688a ? ((C1688a) biConsumer).a : new VivifiedWrapper(biConsumer);
        }

        @Override // j$.util.function.BiConsumer
        public final /* synthetic */ void accept(Object obj, Object obj2) {
            this.a.accept(obj, obj2);
        }

        @Override // j$.util.function.BiConsumer
        public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
            return convert(this.a.andThen(C1688a.a(biConsumer)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            java.util.function.BiConsumer biConsumer = this.a;
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).a;
            }
            return biConsumer.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.a.hashCode();
        }
    }

    void accept(T t, U u);

    BiConsumer<T, U> andThen(BiConsumer<? super T, ? super U> biConsumer);

    /* renamed from: j$.util.function.BiConsumer$-CC  reason: invalid class name */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class CC {
        public static BiConsumer $default$andThen(BiConsumer biConsumer, BiConsumer biConsumer2) {
            Objects.requireNonNull(biConsumer2);
            return new j$.util.concurrent.t(1, biConsumer, biConsumer2);
        }
    }
}
