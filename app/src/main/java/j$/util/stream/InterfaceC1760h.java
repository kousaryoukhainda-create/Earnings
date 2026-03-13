package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;
/* renamed from: j$.util.stream.h  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC1760h extends AutoCloseable {
    boolean isParallel();

    Iterator iterator();

    InterfaceC1760h onClose(Runnable runnable);

    InterfaceC1760h parallel();

    InterfaceC1760h sequential();

    Spliterator spliterator();

    InterfaceC1760h unordered();
}
