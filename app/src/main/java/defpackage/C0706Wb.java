package defpackage;
/* renamed from: Wb  reason: default package and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0706Wb extends AbstractC2119m0 {
    public final /* synthetic */ C0732Xb j;

    public C0706Wb(C0732Xb c0732Xb) {
        this.j = c0732Xb;
    }

    @Override // defpackage.AbstractC2119m0
    public final String j() {
        C0680Vb c0680Vb = (C0680Vb) this.j.b.get();
        if (c0680Vb == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + c0680Vb.a + "]";
    }
}
