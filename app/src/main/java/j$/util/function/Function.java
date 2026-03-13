package j$.util.function;

import j$.util.function.UnaryOperator;
import java.util.Objects;
/* loaded from: classes4.dex */
public interface Function<T, R> {

    /* loaded from: classes4.dex */
    public final /* synthetic */ class VivifiedWrapper implements Function {
        public final /* synthetic */ java.util.function.Function a;

        private /* synthetic */ VivifiedWrapper(java.util.function.Function function) {
            this.a = function;
        }

        public static /* synthetic */ Function convert(java.util.function.Function function) {
            if (function == null) {
                return null;
            }
            return function instanceof C1707u ? ((C1707u) function).a : function instanceof java.util.function.UnaryOperator ? UnaryOperator.VivifiedWrapper.convert((java.util.function.UnaryOperator) function) : new VivifiedWrapper(function);
        }

        @Override // j$.util.function.Function
        public final /* synthetic */ Function andThen(Function function) {
            return convert(this.a.andThen(C1707u.a(function)));
        }

        @Override // j$.util.function.Function
        public final /* synthetic */ Object apply(Object obj) {
            return this.a.apply(obj);
        }

        @Override // j$.util.function.Function
        public final /* synthetic */ Function compose(Function function) {
            return convert(this.a.compose(C1707u.a(function)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            java.util.function.Function function = this.a;
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).a;
            }
            return function.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.a.hashCode();
        }
    }

    <V> Function<T, V> andThen(Function<? super R, ? extends V> function);

    R apply(T t);

    <V> Function<V, R> compose(Function<? super V, ? extends T> function);

    /* renamed from: j$.util.function.Function$-CC */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class CC {
        public static Function $default$compose(Function function, Function function2) {
            Objects.requireNonNull(function2);
            return new C1706t(function, function2, 1);
        }

        public static Function $default$andThen(Function function, Function function2) {
            Objects.requireNonNull(function2);
            return new C1706t(function, function2, 0);
        }
    }
}
