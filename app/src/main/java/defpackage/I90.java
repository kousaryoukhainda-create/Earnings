package defpackage;

import java.util.ListIterator;
/* renamed from: I90  reason: default package */
/* loaded from: classes.dex */
public final class I90 implements ListIterator {
    public ListIterator b;

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.b.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.b.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
