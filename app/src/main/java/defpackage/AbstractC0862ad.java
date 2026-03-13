package defpackage;

import java.util.Iterator;
/* renamed from: ad  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0862ad implements Iterator, RF {
    public abstract char b();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(b());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
