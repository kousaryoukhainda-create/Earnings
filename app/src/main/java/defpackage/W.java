package defpackage;

import java.util.List;
import java.util.ListIterator;
/* renamed from: W  reason: default package */
/* loaded from: classes.dex */
public final class W extends N implements ListIterator {
    public final /* synthetic */ X g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(X x) {
        super(x);
        this.g = x;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        X x = this.g;
        boolean isEmpty = x.isEmpty();
        c().add(obj);
        x.h.g++;
        if (isEmpty) {
            x.e();
        }
    }

    public final ListIterator c() {
        b();
        return (ListIterator) this.c;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return c().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return c().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return c().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return c().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        c().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(X x, int i) {
        super(x, ((List) x.c).listIterator(i));
        this.g = x;
    }
}
