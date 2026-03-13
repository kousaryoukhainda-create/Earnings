package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: G  reason: default package */
/* loaded from: classes2.dex */
public abstract class G implements Iterator, RF {
    public int b;
    public Object c;

    public abstract void b();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
            }
        } else {
            this.b = 3;
            b();
            if (this.b != 1) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        if (i == 1) {
            this.b = 0;
            return this.c;
        }
        if (i != 2) {
            this.b = 3;
            b();
            if (this.b == 1) {
                this.b = 0;
                return this.c;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
