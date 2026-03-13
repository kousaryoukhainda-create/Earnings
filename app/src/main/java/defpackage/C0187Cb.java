package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: Cb  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0187Cb implements Iterator {
    public final /* synthetic */ int b = 0;
    public int c = 0;
    public final int d;
    public final /* synthetic */ Object f;

    public C0187Cb(C0291Gb c0291Gb) {
        this.f = c0291Gb;
        this.d = c0291Gb.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.b) {
            case 0:
                if (this.c < this.d) {
                    return true;
                }
                return false;
            default:
                if (this.c < this.d) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.b) {
            case 0:
                int i = this.c;
                if (i < this.d) {
                    this.c = i + 1;
                    return Byte.valueOf(((C0291Gb) this.f).f(i));
                }
                throw new NoSuchElementException();
            default:
                int i2 = this.c;
                if (i2 < this.d) {
                    this.c = i2 + 1;
                    return Byte.valueOf(((C0317Hb) this.f).h(i2));
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public C0187Cb(C0317Hb c0317Hb) {
        this.f = c0317Hb;
        this.d = c0317Hb.size();
    }
}
