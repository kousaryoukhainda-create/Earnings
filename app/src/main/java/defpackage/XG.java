package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: XG  reason: default package */
/* loaded from: classes.dex */
public final class XG implements Iterator {
    public ZG b;
    public ZG c = null;
    public int d;
    public final /* synthetic */ C0837aH f;
    public final /* synthetic */ int g;

    public XG(C0837aH c0837aH, int i) {
        this.g = i;
        this.f = c0837aH;
        this.b = c0837aH.g.f;
        this.d = c0837aH.f;
    }

    public final Object b() {
        return c();
    }

    public final ZG c() {
        ZG zg = this.b;
        C0837aH c0837aH = this.f;
        if (zg != c0837aH.g) {
            if (c0837aH.f == this.d) {
                this.b = zg.f;
                this.c = zg;
                return zg;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b != this.f.g) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.g) {
            case 1:
                return c().h;
            default:
                return b();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        ZG zg = this.c;
        if (zg != null) {
            C0837aH c0837aH = this.f;
            c0837aH.c(zg, true);
            this.c = null;
            this.d = c0837aH.f;
            return;
        }
        throw new IllegalStateException();
    }
}
