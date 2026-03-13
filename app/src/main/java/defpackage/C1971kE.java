package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: kE  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1971kE implements Iterator, RF {
    public final int b;
    public final int c;
    public boolean d;
    public int f;

    public C1971kE(int i, int i2, int i3) {
        this.b = i3;
        this.c = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.d = z;
        this.f = z ? i : i2;
    }

    public final int b() {
        int i = this.f;
        if (i == this.c) {
            if (this.d) {
                this.d = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f = this.b + i;
        }
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(b());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
