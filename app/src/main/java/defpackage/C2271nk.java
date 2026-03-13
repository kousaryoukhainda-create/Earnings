package defpackage;
/* renamed from: nk  reason: default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2271nk extends AbstractC2443pk {
    public C1141cu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2271nk(AbstractC2013kk abstractC2013kk, String str, AbstractC2013kk abstractC2013kk2) {
        super(abstractC2013kk2);
        String X = AbstractC0957bf.X(abstractC2013kk);
        C0319Hd f = abstractC2013kk2.f();
        if (f != null) {
            L5 l5 = f.c;
            C1141cu c1141cu = new C1141cu(l5);
            c1141cu.c = l5.j(str);
            c1141cu.d = str;
            c1141cu.e = l5.j(X);
            this.d = c1141cu;
            return;
        }
        throw new C2255nc("bad declaring class: " + abstractC2013kk2.a);
    }

    @Override // defpackage.AbstractC2443pk
    public final void d(StringBuilder sb) {
        sb.append(' ');
        C1141cu c1141cu = this.d;
        sb.append(c1141cu.b());
        sb.append(' ');
        sb.append(c1141cu.a());
    }

    @Override // defpackage.AbstractC2443pk
    public final int e() {
        return this.d.b;
    }

    @Override // defpackage.AbstractC2443pk
    public final String f() {
        return this.d.b();
    }

    public final void h(int i) {
        ((AbstractC2013kk) this.c).b();
        this.d.b = i;
    }

    @Override // defpackage.AbstractC2443pk
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(((AbstractC2013kk) this.c).a);
        sb.append(".");
        C1141cu c1141cu = this.d;
        sb.append(c1141cu.b());
        sb.append(":");
        sb.append(c1141cu.a());
        return sb.toString();
    }
}
