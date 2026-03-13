package j$.lang;

import j$.util.function.Consumer;
import java.util.Objects;
/* renamed from: j$.lang.Iterable$-CC  reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class Iterable$CC {
    public static void $default$forEach(Iterable iterable, Consumer consumer) {
        Objects.requireNonNull(consumer);
        for (Object obj : iterable) {
            consumer.accept(obj);
        }
    }
}
