package j$.util.function;

import java.util.Objects;
/* loaded from: classes4.dex */
public interface BiFunction<T, U, R> {

    /* loaded from: classes4.dex */
    public final /* synthetic */ class VivifiedWrapper implements BiFunction {
        public final /* synthetic */ java.util.function.BiFunction a;

        private /* synthetic */ VivifiedWrapper(java.util.function.BiFunction biFunction) {
            this.a = biFunction;
        }

        public static /* synthetic */ BiFunction convert(java.util.function.BiFunction biFunction) {
            if (biFunction == null) {
                return null;
            }
            return biFunction instanceof C1689b ? ((C1689b) biFunction).a : biFunction instanceof java.util.function.BinaryOperator ? C1691d.a((java.util.function.BinaryOperator) biFunction) : new VivifiedWrapper(biFunction);
        }

        @Override // j$.util.function.BiFunction
        public final /* synthetic */ BiFunction andThen(Function function) {
            return convert(this.a.andThen(C1707u.a(function)));
        }

        @Override // j$.util.function.BiFunction
        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            return this.a.apply(obj, obj2);
        }

        public final /* synthetic */ boolean equals(Object obj) {
            java.util.function.BiFunction biFunction = this.a;
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).a;
            }
            return biFunction.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.a.hashCode();
        }
    }

    <V> BiFunction<T, U, V> andThen(Function<? super R, ? extends V> function);

    R apply(T t, U u);

    /* renamed from: j$.util.function.BiFunction$-CC */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class CC {
        public static BiFunction $default$andThen(BiFunction biFunction, Function function) {
            Objects.requireNonNull(function);
            return new j$.util.concurrent.t(biFunction, function);
        }
    }
}
