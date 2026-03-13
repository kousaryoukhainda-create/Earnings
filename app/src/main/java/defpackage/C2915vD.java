package defpackage;

import java.util.Objects;
/* renamed from: vD  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2915vD extends AbstractC1970kD {
    @Override // defpackage.AbstractC1970kD
    public final AbstractC1970kD c(Object obj) {
        obj.getClass();
        a(obj);
        return this;
    }

    public final AbstractC3001wD h() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                AbstractC3001wD p = AbstractC3001wD.p(i, this.a);
                this.b = p.size();
                this.c = true;
                return p;
            }
            Object obj = this.a[0];
            Objects.requireNonNull(obj);
            int i2 = AbstractC3001wD.d;
            return new C2296o20(obj);
        }
        int i3 = AbstractC3001wD.d;
        return LV.l;
    }
}
