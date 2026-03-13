package defpackage;

import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.tl;
import org.json.JSONArray;
/* renamed from: Kf0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class Kf0 implements InterfaceC1006cA {
    public final /* synthetic */ int b;
    public final /* synthetic */ b c;

    public /* synthetic */ Kf0(b bVar, int i) {
        this.b = i;
        this.c = bVar;
    }

    @Override // defpackage.InterfaceC1006cA
    public final Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return b.T(this.c, (tl) obj);
            case 1:
                return b.K(this.c, (tl) obj);
            case 2:
                return b.D(this.c, (tl) obj);
            case 3:
                return b.z(this.c, (tl) obj);
            case 4:
                return b.X(this.c, (tl) obj);
            case 5:
                return b.S(this.c, (tl) obj);
            case 6:
                return b.M(this.c, (JSONArray) obj);
            case 7:
                return b.A(this.c, (tl) obj);
            case 8:
                return b.W(this.c, (tl) obj);
            case 9:
                return b.F(this.c, (tl) obj);
            case 10:
                return b.J(this.c, (tl) obj);
            case 11:
                return b.H(this.c, (tl) obj);
            default:
                return b.L(this.c, (tl) obj);
        }
    }
}
