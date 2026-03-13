package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
/* renamed from: P20  reason: default package */
/* loaded from: classes.dex */
public final class P20 implements Iterator {
    public final /* synthetic */ int b;
    public int c = -1;
    public boolean d;
    public Iterator f;
    public final /* synthetic */ AbstractMap g;

    public /* synthetic */ P20(AbstractMap abstractMap, int i) {
        this.b = i;
        this.g = abstractMap;
    }

    public final Iterator b() {
        switch (this.b) {
            case 0:
                if (this.f == null) {
                    this.f = ((J20) this.g).d.entrySet().iterator();
                }
                return this.f;
            default:
                if (this.f == null) {
                    this.f = ((K20) this.g).c.entrySet().iterator();
                }
                return this.f;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.b) {
            case 0:
                int i = this.c + 1;
                J20 j20 = (J20) this.g;
                if (i < j20.c.size()) {
                    return true;
                }
                if (!j20.d.isEmpty() && b().hasNext()) {
                    return true;
                }
                return false;
            default:
                int i2 = this.c + 1;
                K20 k20 = (K20) this.g;
                if (i2 < k20.b.size()) {
                    return true;
                }
                if (!k20.c.isEmpty() && b().hasNext()) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.b) {
            case 0:
                this.d = true;
                int i = this.c + 1;
                this.c = i;
                J20 j20 = (J20) this.g;
                if (i < j20.c.size()) {
                    return (Map.Entry) j20.c.get(this.c);
                }
                return (Map.Entry) b().next();
            default:
                this.d = true;
                int i2 = this.c + 1;
                this.c = i2;
                K20 k20 = (K20) this.g;
                if (i2 < k20.b.size()) {
                    return (Map.Entry) k20.b.get(this.c);
                }
                return (Map.Entry) b().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractMap abstractMap = this.g;
        switch (this.b) {
            case 0:
                if (this.d) {
                    this.d = false;
                    int i = J20.i;
                    J20 j20 = (J20) abstractMap;
                    j20.b();
                    if (this.c < j20.c.size()) {
                        int i2 = this.c;
                        this.c = i2 - 1;
                        j20.g(i2);
                        return;
                    }
                    b().remove();
                    return;
                }
                throw new IllegalStateException("remove() was called before next()");
            default:
                if (this.d) {
                    this.d = false;
                    int i3 = K20.h;
                    K20 k20 = (K20) abstractMap;
                    k20.b();
                    if (this.c < k20.b.size()) {
                        int i4 = this.c;
                        this.c = i4 - 1;
                        k20.h(i4);
                        return;
                    }
                    b().remove();
                    return;
                }
                throw new IllegalStateException("remove() was called before next()");
        }
    }
}
