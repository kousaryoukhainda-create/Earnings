package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;
/* renamed from: pD  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2400pD extends H90 implements ListIterator {
    public final int c;
    public int d;
    public final AbstractC2571rD f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2400pD(AbstractC2571rD abstractC2571rD, int i) {
        super(0);
        int size = abstractC2571rD.size();
        B10.r(i, size);
        this.c = size;
        this.d = i;
        this.f = abstractC2571rD;
    }

    public final Object a(int i) {
        return this.f.get(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.d < this.c) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.d > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i = this.d;
            this.d = i + 1;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.d;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i = this.d - 1;
            this.d = i;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.d - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
