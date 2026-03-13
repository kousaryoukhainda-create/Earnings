package j$.util.function;

import java.util.Objects;
/* loaded from: classes4.dex */
public interface Consumer<T> {

    /* loaded from: classes4.dex */
    public final /* synthetic */ class VivifiedWrapper implements Consumer {
        public final /* synthetic */ java.util.function.Consumer a;

        private /* synthetic */ VivifiedWrapper(java.util.function.Consumer consumer) {
            this.a = consumer;
        }

        public static /* synthetic */ Consumer convert(java.util.function.Consumer consumer) {
            if (consumer == null) {
                return null;
            }
            return consumer instanceof Wrapper ? Consumer.this : new VivifiedWrapper(consumer);
        }

        @Override // j$.util.function.Consumer
        public final /* synthetic */ void accept(Object obj) {
            this.a.accept(obj);
        }

        @Override // j$.util.function.Consumer
        public final /* synthetic */ Consumer andThen(Consumer consumer) {
            return convert(this.a.andThen(Wrapper.convert(consumer)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            java.util.function.Consumer consumer = this.a;
            if (obj instanceof VivifiedWrapper) {
                obj = ((VivifiedWrapper) obj).a;
            }
            return consumer.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return this.a.hashCode();
        }
    }

    /* loaded from: classes4.dex */
    public final /* synthetic */ class Wrapper implements java.util.function.Consumer {
        private /* synthetic */ Wrapper() {
            Consumer.this = r1;
        }

        public static /* synthetic */ java.util.function.Consumer convert(Consumer consumer) {
            if (consumer == null) {
                return null;
            }
            return consumer instanceof VivifiedWrapper ? ((VivifiedWrapper) consumer).a : new Wrapper();
        }

        @Override // java.util.function.Consumer
        public final /* synthetic */ void accept(Object obj) {
            Consumer.this.accept(obj);
        }

        @Override // java.util.function.Consumer
        public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
            return convert(Consumer.this.andThen(VivifiedWrapper.convert(consumer)));
        }

        public final /* synthetic */ boolean equals(Object obj) {
            Consumer consumer = Consumer.this;
            if (obj instanceof Wrapper) {
                obj = Consumer.this;
            }
            return consumer.equals(obj);
        }

        public final /* synthetic */ int hashCode() {
            return Consumer.this.hashCode();
        }
    }

    void accept(T t);

    Consumer<T> andThen(Consumer<? super T> consumer);

    /* renamed from: j$.util.function.Consumer$-CC */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class CC {
        public static Consumer $default$andThen(Consumer consumer, Consumer consumer2) {
            Objects.requireNonNull(consumer2);
            return new j$.util.concurrent.t(3, consumer, consumer2);
        }
    }
}
