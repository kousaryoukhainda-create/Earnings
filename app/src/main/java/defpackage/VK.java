package defpackage;

import java.util.Collections;
/* renamed from: VK  reason: default package */
/* loaded from: classes.dex */
public final class VK {
    public final String a;
    public final SK b;
    public final RK c;
    public final YK d;
    public final PK e;
    public final TK f;

    static {
        C0467Mw c0467Mw = new C0467Mw();
        C2400pD c2400pD = AbstractC2571rD.c;
        FV fv = FV.g;
        Collections.emptyList();
        FV fv2 = FV.g;
        QK qk = new QK();
        TK tk = TK.a;
        c0467Mw.a();
        qk.a();
        YK yk = YK.y;
        AbstractC0324Hi.q(0, 1, 2, 3, 4);
        Ha0.H(5);
    }

    public VK(String str, PK pk, SK sk, RK rk, YK yk, TK tk) {
        this.a = str;
        this.b = sk;
        this.c = rk;
        this.d = yk;
        this.e = pk;
        this.f = tk;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VK)) {
            return false;
        }
        VK vk = (VK) obj;
        if (Ha0.a(this.a, vk.a) && this.e.equals(vk.e) && Ha0.a(this.b, vk.b) && this.c.equals(vk.c) && Ha0.a(this.d, vk.d) && Ha0.a(this.f, vk.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        SK sk = this.b;
        if (sk != null) {
            i = sk.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.e.hashCode();
        int hashCode4 = (this.d.hashCode() + ((hashCode3 + ((hashCode2 + ((hashCode + i) * 31)) * 31)) * 31)) * 31;
        this.f.getClass();
        return hashCode4;
    }
}
