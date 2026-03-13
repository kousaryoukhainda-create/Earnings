package defpackage;

import java.util.Iterator;
/* renamed from: J90  reason: default package */
/* loaded from: classes.dex */
public final class J90 implements Iterator {
    public Iterator b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
