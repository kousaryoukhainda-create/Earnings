package defpackage;

import java.util.HashMap;
/* renamed from: Tt  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0646Tt extends C2507qY {
    public final HashMap g = new HashMap();

    @Override // defpackage.C2507qY
    public final C2249nY b(Object obj) {
        return (C2249nY) this.g.get(obj);
    }

    @Override // defpackage.C2507qY
    public final Object c(Object obj, Object obj2) {
        C2249nY b = b(obj);
        if (b != null) {
            return b.c;
        }
        HashMap hashMap = this.g;
        C2249nY c2249nY = new C2249nY(obj, obj2);
        this.f++;
        C2249nY c2249nY2 = this.c;
        if (c2249nY2 == null) {
            this.b = c2249nY;
            this.c = c2249nY;
        } else {
            c2249nY2.d = c2249nY;
            c2249nY.f = c2249nY2;
            this.c = c2249nY;
        }
        hashMap.put(obj, c2249nY);
        return null;
    }

    @Override // defpackage.C2507qY
    public final Object d(Object obj) {
        Object d = super.d(obj);
        this.g.remove(obj);
        return d;
    }
}
