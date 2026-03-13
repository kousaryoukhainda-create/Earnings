package j$.util;
/* loaded from: classes4.dex */
public interface N extends Spliterator {
    void forEachRemaining(Object obj);

    boolean tryAdvance(Object obj);

    @Override // j$.util.Spliterator
    N trySplit();
}
