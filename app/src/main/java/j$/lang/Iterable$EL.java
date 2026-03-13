package j$.lang;

import j$.util.function.Consumer;
import java.util.Collection;
import java.util.Objects;
/* renamed from: j$.lang.Iterable$-EL  reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class Iterable$EL {
    public static void forEach(Iterable iterable, Consumer consumer) {
        if (iterable instanceof a) {
            ((a) iterable).forEach(consumer);
        } else if (!(iterable instanceof Collection)) {
            Iterable$CC.$default$forEach(iterable, consumer);
        } else {
            Objects.requireNonNull(consumer);
            for (Object obj : (Collection) iterable) {
                consumer.accept(obj);
            }
        }
    }
}
