package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: a5  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0820a5 implements Iterator {
    public int b;
    public int c;
    public boolean d;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public C0820a5(int i) {
        this.b = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c < this.b) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object h;
        if (hasNext()) {
            int i = this.c;
            switch (this.f) {
                case 0:
                    h = ((C1243e5) this.g).h(i);
                    break;
                case 1:
                    h = ((C1243e5) this.g).k(i);
                    break;
                default:
                    h = ((C1415g5) this.g).c[i];
                    break;
            }
            this.c++;
            this.d = true;
            return h;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.d) {
            int i = this.c - 1;
            this.c = i;
            switch (this.f) {
                case 0:
                    ((C1243e5) this.g).i(i);
                    break;
                case 1:
                    ((C1243e5) this.g).i(i);
                    break;
                default:
                    ((C1415g5) this.g).g(i);
                    break;
            }
            this.b--;
            this.d = false;
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0820a5(C1243e5 c1243e5, int i) {
        this(c1243e5.d);
        this.f = i;
        switch (i) {
            case 1:
                this.g = c1243e5;
                this(c1243e5.d);
                return;
            default:
                this.g = c1243e5;
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0820a5(C1415g5 c1415g5) {
        this(c1415g5.d);
        this.f = 2;
        this.g = c1415g5;
    }
}
