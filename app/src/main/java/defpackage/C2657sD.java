package defpackage;

import java.io.Serializable;
/* renamed from: sD  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public class C2657sD extends M9 implements Serializable {
    public final transient KV f;

    public C2657sD(KV kv, int i) {
        this.f = kv;
    }

    @Override // defpackage.AbstractC0986c0
    public final boolean b(Object obj) {
        if (obj != null && super.b(obj)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.AbstractC0986c0
    /* renamed from: c */
    public AbstractC2829uD a() {
        return this.f;
    }

    public final AbstractC2571rD d(String str) {
        AbstractC2571rD abstractC2571rD = (AbstractC2571rD) this.f.get(str);
        if (abstractC2571rD == null) {
            C2400pD c2400pD = AbstractC2571rD.c;
            return FV.g;
        }
        return abstractC2571rD;
    }

    public final AbstractC3001wD e() {
        return this.f.keySet();
    }
}
