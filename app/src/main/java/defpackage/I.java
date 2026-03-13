package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;
/* renamed from: I  reason: default package */
/* loaded from: classes2.dex */
public final class I extends H implements ListIterator {
    public final /* synthetic */ K f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(K k, int i) {
        super(k);
        this.f = k;
        int e = k.e();
        if (i >= 0 && i <= e) {
            this.c = i;
            return;
        }
        throw new IndexOutOfBoundsException(AbstractC0324Hi.d(i, e, "index: ", ", size: "));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.c > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.c;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.c - 1;
            this.c = i;
            return this.f.get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.c - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
