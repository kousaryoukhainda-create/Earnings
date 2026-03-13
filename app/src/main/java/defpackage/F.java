package defpackage;

import java.util.NoSuchElementException;
/* renamed from: F  reason: default package */
/* loaded from: classes.dex */
public abstract class F extends H90 {
    public int c;
    public Object d;

    public F() {
        super(0);
        this.c = 2;
    }

    public abstract Object b();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.c;
        if (i != 4) {
            int A = AbstractC0324Hi.A(i);
            if (A == 0) {
                return true;
            }
            if (A == 2) {
                return false;
            }
            this.c = 4;
            this.d = b();
            if (this.c != 3) {
                this.c = 1;
                return true;
            }
            return false;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.c = 2;
            Object obj = this.d;
            this.d = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
