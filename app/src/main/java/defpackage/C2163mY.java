package defpackage;

import java.util.Iterator;
/* renamed from: mY  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2163mY extends AbstractC2421pY implements Iterator {
    public C2249nY b;
    public C2249nY c;
    public final /* synthetic */ int d;

    public C2163mY(C2249nY c2249nY, C2249nY c2249nY2, int i) {
        this.d = i;
        this.b = c2249nY2;
        this.c = c2249nY;
    }

    @Override // defpackage.AbstractC2421pY
    public final void a(C2249nY c2249nY) {
        C2249nY c2249nY2;
        C2249nY c2249nY3 = null;
        if (this.b == c2249nY && c2249nY == this.c) {
            this.c = null;
            this.b = null;
        }
        C2249nY c2249nY4 = this.b;
        if (c2249nY4 == c2249nY) {
            switch (this.d) {
                case 0:
                    c2249nY2 = c2249nY4.f;
                    break;
                default:
                    c2249nY2 = c2249nY4.d;
                    break;
            }
            this.b = c2249nY2;
        }
        C2249nY c2249nY5 = this.c;
        if (c2249nY5 == c2249nY) {
            C2249nY c2249nY6 = this.b;
            if (c2249nY5 != c2249nY6 && c2249nY6 != null) {
                c2249nY3 = b(c2249nY5);
            }
            this.c = c2249nY3;
        }
    }

    public final C2249nY b(C2249nY c2249nY) {
        switch (this.d) {
            case 0:
                return c2249nY.d;
            default:
                return c2249nY.f;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C2249nY c2249nY;
        C2249nY c2249nY2 = this.c;
        C2249nY c2249nY3 = this.b;
        if (c2249nY2 != c2249nY3 && c2249nY3 != null) {
            c2249nY = b(c2249nY2);
        } else {
            c2249nY = null;
        }
        this.c = c2249nY;
        return c2249nY2;
    }
}
