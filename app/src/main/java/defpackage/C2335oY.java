package defpackage;

import java.util.Iterator;
/* renamed from: oY  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2335oY extends AbstractC2421pY implements Iterator {
    public C2249nY b;
    public boolean c = true;
    public final /* synthetic */ C2507qY d;

    public C2335oY(C2507qY c2507qY) {
        this.d = c2507qY;
    }

    @Override // defpackage.AbstractC2421pY
    public final void a(C2249nY c2249nY) {
        boolean z;
        C2249nY c2249nY2 = this.b;
        if (c2249nY == c2249nY2) {
            C2249nY c2249nY3 = c2249nY2.f;
            this.b = c2249nY3;
            if (c2249nY3 == null) {
                z = true;
            } else {
                z = false;
            }
            this.c = z;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c) {
            if (this.d.b == null) {
                return false;
            }
            return true;
        }
        C2249nY c2249nY = this.b;
        if (c2249nY == null || c2249nY.d == null) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C2249nY c2249nY;
        if (this.c) {
            this.c = false;
            this.b = this.d.b;
        } else {
            C2249nY c2249nY2 = this.b;
            if (c2249nY2 != null) {
                c2249nY = c2249nY2.d;
            } else {
                c2249nY = null;
            }
            this.b = c2249nY;
        }
        return this.b;
    }
}
