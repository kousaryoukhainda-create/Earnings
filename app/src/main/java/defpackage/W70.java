package defpackage;

import java.util.Iterator;
/* renamed from: W70  reason: default package */
/* loaded from: classes.dex */
public abstract class W70 implements Iterator {
    public final Iterator b;

    public W70(Iterator it) {
        it.getClass();
        this.b = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.b.remove();
    }
}
