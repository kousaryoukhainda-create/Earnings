package defpackage;

import java.util.Iterator;
/* renamed from: Y70  reason: default package */
/* loaded from: classes2.dex */
public final class Y70 implements Iterator, RF {
    public final Iterator b;
    public final /* synthetic */ Z70 c;

    public Y70(Z70 z70) {
        this.c = z70;
        this.b = z70.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.c.b.invoke(this.b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
