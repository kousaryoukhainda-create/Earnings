package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
/* renamed from: H  reason: default package */
/* loaded from: classes2.dex */
public class H implements Iterator, RF {
    public final /* synthetic */ int b = 0;
    public int c;
    public final Object d;

    public H(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.d = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.b) {
            case 0:
                if (this.c < ((K) this.d).e()) {
                    return true;
                }
                return false;
            default:
                if (this.c < ((Object[]) this.d).length) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.b) {
            case 0:
                if (hasNext()) {
                    int i = this.c;
                    this.c = i + 1;
                    return ((K) this.d).get(i);
                }
                throw new NoSuchElementException();
            default:
                try {
                    int i2 = this.c;
                    this.c = i2 + 1;
                    return ((Object[]) this.d)[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.c--;
                    throw new NoSuchElementException(e.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public H(K k) {
        this.d = k;
    }
}
