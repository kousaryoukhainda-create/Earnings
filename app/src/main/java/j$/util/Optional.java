package j$.util;

import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.Predicate;
import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes4.dex */
public final class Optional<T> {
    private static final Optional b = new Optional();
    private final Object a;

    private Optional() {
        this.a = null;
    }

    public static <T> Optional<T> empty() {
        return b;
    }

    private Optional(Object obj) {
        Objects.requireNonNull(obj);
        this.a = obj;
    }

    public static <T> Optional<T> of(T t) {
        return new Optional<>(t);
    }

    public static <T> Optional<T> ofNullable(T t) {
        return t == null ? empty() : of(t);
    }

    public final Object a() {
        Object obj = this.a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean b() {
        return this.a != null;
    }

    public void ifPresent(Consumer<? super T> consumer) {
        Object obj = (Object) this.a;
        if (obj != 0) {
            consumer.accept(obj);
        }
    }

    public Optional<T> filter(Predicate<? super T> predicate) {
        Objects.requireNonNull(predicate);
        if (b() && !predicate.test((Object) this.a)) {
            return empty();
        }
        return this;
    }

    public <U> Optional<U> map(Function<? super T, ? extends U> function) {
        Objects.requireNonNull(function);
        if (!b()) {
            return empty();
        }
        return ofNullable(function.apply((Object) this.a));
    }

    public T orElse(T t) {
        T t2 = (T) this.a;
        return t2 != null ? t2 : t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Optional) {
            return Objects.equals(this.a, ((Optional) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        Object obj = this.a;
        if (obj != null) {
            return String.format("Optional[%s]", obj);
        }
        return "Optional.empty";
    }
}
