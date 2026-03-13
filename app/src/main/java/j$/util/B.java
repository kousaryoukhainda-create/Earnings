package j$.util;

import java.util.Comparator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class B extends b0 {
    final /* synthetic */ java.util.SortedSet f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(java.util.SortedSet sortedSet, java.util.Collection collection) {
        super(collection, 21);
        this.f = sortedSet;
    }

    @Override // j$.util.b0, j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f.comparator();
    }
}
